import java.util.Random;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		int tahmin, randomValue, can = 5;

		Random random = new Random();
		randomValue = random.nextInt(100);

		Scanner girdi = new Scanner(System.in);
		System.out.print("0 İLE 100 ARASINDA BİR SAYI GİRİNİZ : ");

		do {

			tahmin = girdi.nextInt();

			if (0 <= tahmin && tahmin < randomValue) {

				System.out.println("!! ARTTIRIN !!");
				can--;
				System.out.println("Kalan Can : " + can);

			} else if (randomValue < tahmin && tahmin <= 100) {

				System.out.println("!! AZALTIN !!");
				can--;
				System.out.println("Kalan Can : " + can);

			}

		} while (0 <= tahmin && tahmin <= 100 && tahmin != randomValue && can != 0);

		if (tahmin == randomValue) {

			System.out.println("Tebrikler doğru buldunuz CEVAP : " + randomValue);

		} else if (can == 0) {

			System.out.println(" !! Canınız Kalmadı !! \n Doğru CEVAP : " + randomValue);

		} else {

			System.out.println(" !! Hatalı tahmin !!");

		}

	}

}
