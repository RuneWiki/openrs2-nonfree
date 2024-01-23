import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!po", name = "z", descriptor = "I")
	public static int anInt4129;

	@OriginalMember(owner = "client!po", name = "F", descriptor = "Z")
	public static boolean aBoolean372 = false;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ILclient!fh;B)Lclient!nf;")
	public static Class1_Sub5_Sub14 method3563(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub13 arg1) {
		@Pc(33) Class1_Sub5_Sub14 local33 = new Class1_Sub5_Sub14(arg0, arg1.method1827(), arg1.method1827(), arg1.method1860(), arg1.method1860(), arg1.method1853() == 1, arg1.method1853());
		@Pc(43) int local43 = arg1.method1853();
		for (@Pc(45) int local45 = 0; local45 < local43; local45++) {
			local33.aClass96_17.method2336(new Class1_Sub31(arg1.method1853(), arg1.method1853(), arg1.method1879(), arg1.method1879(), arg1.method1879(), arg1.method1879(), arg1.method1879(), arg1.method1879(), arg1.method1879(), arg1.method1879()));
		}
		local33.method3129();
		return local33;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(II[BI)I")
	public static int method3564(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg2; local9 < arg0; local9++) {
			local7 = Class1_Sub1_Sub18.anIntArray165[(local7 ^ arg1[local9]) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(B)V")
	public static void method3565() {
		Static212.aString138 = "Titelbild geöffnet.";
		Static247.aString59 = "Lade Liste der Welten";
		Static261.aString181 = "Auswählen";
		Static226.aString145 = "Bitte entferne ";
		Static306.aString217 = "blinken2:";
		Static265.aString187 = ": ";
		Static181.aString115 = "gleiten:";
		Static35.aString27 = "Spielwelt erstellt.";
		Static213.aString218 = "Texturen geladen.";
		Static259.aString180 = "leuchten1:";
		Static59.aString45 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
		Static37.aString30 = "Bitte warte...";
		Static258.aString178 = " steht bereits auf deiner Freunde-Liste!";
		Static262.aString183 = "lila:";
		Static24.aString16 = "gelb:";
		Static143.aString96 = "rot:";
		Static39.aString32 = "T";
		Static101.aString73 = "Suche nach Updates - ";
		Static34.aString26 = "Untersuchen";
		Static98.aString71 = "Eingabeprozedur geladen.";
		Static189.aString126 = " loggt sich ein.";
		Static51.aString41 = "Lade Wordpack - ";
		Static264.aString186 = "Lade Standardeinstellungen - ";
		Static142.aString95 = "möchte mit dir handeln.";
		Static26.aString19 = "Lade...";
		Static168.aString108 = "Wordpack geladen.";
		Static234.aString154 = "Lade Texturen - ";
		Static252.aString165 = "Wähl eine Option";
		Static274.aString194 = "Hierhin drehen";
		Static297.aString212 = "blinken3:";
		Static109.aString76 = "Benutzeroberfläche geladen.";
		Static193.aString128 = "Fallen lassen";
		Static86.aString67 = "Nehmen";
		Static266.aString188 = "Schriftsätze geladen.";
		Static235.aString155 = "scrollen:";
		Static64.aString49 = "welle:";
		Static246.aString160 = "Hierhin gehen";
		Static47.aString35 = " zuerst von deiner Freunde-Liste!";
		Static9.aString7 = "Spieler kann nicht gefunden werden: ";
		Static85.aString66 = "T";
		Static117.aString82 = "Titelbild geladen.";
		Static175.aString111 = "leuchten3:";
		Static246.aString162 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
		Static270.aString192 = "Ladevorgang - bitte warte.";
		Static35.aString29 = "Stufe: ";
		Static236.aString157 = "Verbindung mit Update-Server...";
		Static146.aString100 = "Sprites geladen.";
		Static2.aString1 = " steht bereits auf deiner Ignorieren-Liste!";
		Static174.aString219 = "Bitte entferne ";
		Static287.aString202 = "Angreifen";
		Static6.aString189 = "blaugrün:";
		Static174.aString220 = "Lade Titelbild - ";
		Static293.aString211 = "Update-Liste geladen.";
		Static194.aString131 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
		Static54.aString44 = " loggt sich aus.";
		Static261.aString182 = "blinken1:";
		Static128.aString87 = "Lade Konfiguration - ";
		Static83.aString64 = "Verbindung abgebrochen.";
		Static164.aString107 = "Starte 3D-Softwarebibliothek.";
		Static235.aString156 = "Liste der Welten geladen";
		Static198.aString129 = "Verbindung zum Update-Server hergestellt.";
		Static82.aString63 = "weiss:";
		Static229.aString190 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
		Static279.aString197 = "M";
		Static74.aString60 = "RuneScape wird geladen - bitte warten...";
		Static226.aString146 = "Abbrechen";
		Static253.aString167 = "Benutzen";
		Static161.aString106 = "Fertigkeit: ";
		Static176.aString112 = "schütteln:";
		Static68.aString53 = "Speicher wird zugewiesen.";
		Static301.aString214 = "grün:";
		Static27.aString21 = "welle2:";
		Static125.aString86 = " zuerst von deiner Ignorieren-Liste!";
		Static39.aString33 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
		Static230.aString151 = "Kampfstufe: ";
		Static273.aString193 = "Mechscape wird geladen - bitte warten...";
		Static219.aString143 = "Weiter";
		Static176.aString114 = "Standardinstellungen geladen";
		Static209.aString137 = "Ablegen";
		Static115.aString81 = "Musik-Engine vorbereitet.";
		Static109.aString77 = "Okay";
		Static19.aString12 = "Versteckt";
		Static201.aString135 = "Lade Schriftsätze - ";
		Static96.aString70 = "Lade Benutzeroberfläche - ";
		Static306.aString216 = "leuchten2:";
		Static25.aString176 = "Zugewiesener Speicher.";
		Static89.aString69 = "Lade Sprites - ";
		Static225.aString144 = "3D-Softwarebibliothek gestartet.";
		Static279.aString196 = " weitere Optionen";
		Static89.aString68 = "Gegenstand für Mitglieder";
		Static125.aString85 = "M";
		Static283.aString199 = "Konfig geladen.";
		Static18.aString11 = "Schließen";
	}
}
