import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ay, gun;
        String burc;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz günü giriniz : ");
        gun = input.nextInt();
        System.out.print("Doğduğunuz ayı giriniz : ");
        ay = input.nextInt();

        if (((ay == 3) && (gun <= 31 && gun >= 21)) || ((ay == 4) && (gun <= 20 && gun >= 1))) {
            burc = "Koç Burcu";
            System.out.print(burc);
        } else if (((ay == 4) && (gun <= 30 && gun >= 21)) || ((ay == 5) && (gun <= 21 && gun >= 1))) {
            burc = "Boğa Burcu";
            System.out.print(burc);
        } else if (((ay == 5) && (gun <= 31 && gun >= 22)) || ((ay == 6) && (gun <= 22 && gun >= 1))) {
            burc = "İkizler Burcu";
            System.out.print(burc);
        } else if (((ay == 6) && (gun <= 30 && gun >= 23)) || ((ay == 7) && (gun <= 22 && gun >= 1))) {
            burc = "Yengeç Burcu";
            System.out.print(burc);
        } else if (((ay == 7) && (gun <= 31 && gun >= 23)) || ((ay == 8) && (gun <= 22 && gun >= 1))) {
            burc = "Aslan Burcu";
            System.out.print(burc);
        } else if (((ay == 8) && (gun <= 31 && gun >= 23)) || ((ay == 9) && (gun <= 22 && gun >= 1))) {
            burc = "Başak Burcu";
            System.out.print(burc);
        } else if (((ay == 9) && (gun <= 30 && gun >= 23)) || ((ay == 10) && (gun <= 22 && gun >= 1))) {
            burc = "Terazi Burcu";
            System.out.print(burc);
        } else if (((ay == 10) && (gun <= 31 && gun >= 23)) || ((ay == 11) && (gun <= 21 && gun >= 1))) {
            burc = "Akrep Burcu";
            System.out.print(burc);
        } else if (((ay == 11) && (gun <= 30 && gun >= 22)) || ((ay == 12) && (gun <= 21 && gun >= 1))) {
            burc = "Yay Burcu";
            System.out.print(burc);
        } else if (((ay == 12) && (gun <= 31 && gun >= 22)) || ((ay == 1) && (gun <= 21 && gun >= 1))) {
            burc = "Oğlak Burcu";
            System.out.print(burc);
        } else if (((ay == 1) && (gun <= 31 && gun >= 22)) || ((ay == 2) && (gun <= 19 && gun >= 1))) {
            burc = "Kova Burcu";
            System.out.print(burc);
        } else if (((ay == 2) && (gun <= 29 && gun >= 20)) || ((ay == 3) && (gun <= 20 && gun >= 1))) {
            burc = "Balık Burcu";
            System.out.print(burc);
        } else {
            System.out.print("Girdiğiniz bilgileri kontrol ediniz !");
        }
    }
}