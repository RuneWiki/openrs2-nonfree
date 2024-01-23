import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!ei", name = "p", descriptor = "[I")
	public static int[] anIntArray162;

	@OriginalMember(owner = "client!ei", name = "r", descriptor = "I")
	public static int anInt1350;

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "Lclient!jl;")
	public static Class89 aClass89_11 = new Class89(2);

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
	public static int anInt1345 = 2301979;

	@OriginalMember(owner = "client!ei", name = "i", descriptor = "F")
	public static float aFloat16 = 0.0F;

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
	public static int anInt1348 = -1;

	@OriginalMember(owner = "client!ei", name = "n", descriptor = "[Lclient!qm;")
	public static Class1_Sub14[] aClass1_Sub14Array1 = new Class1_Sub14[2048];

	@OriginalMember(owner = "client!ei", name = "o", descriptor = "[Lclient!ne;")
	public static Class13_Sub1[] aClass13_Sub1Array1 = new Class13_Sub1[29];

	@OriginalMember(owner = "client!ei", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString81 = "Ok";

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I[BZI)I")
	public static int method1109(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = -1;
		for (@Pc(14) int local14 = arg0; local14 < arg2; local14++) {
			local8 = local8 >>> 8 ^ Class50.anIntArray569[(local8 ^ arg1[local14]) & 0xFF];
		}
		return ~local8;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V")
	public static void method1110() {
		Static244.aString289 = "Titelbild geöffnet.";
		Static31.aString49 = "Ablegen";
		Static59.aString76 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
		Static295.aString423 = "Schließen";
		Static111.aString146 = "M";
		Static14.aString33 = "lila:";
		Static9.aString22 = "Lade Wordpack - ";
		Static301.aString341 = "Verbindung abgebrochen.";
		Static38.aString55 = " loggt sich ein.";
		Static262.aString377 = "Mechscape wird geladen - bitte warten...";
		Static168.aString236 = "Benutzeroberfläche geladen.";
		Static265.aString379 = "blinken2:";
		Static181.aString266 = "Abbrechen";
		Static116.aString152 = "Gegenstand für Mitglieder";
		Static101.aString14 = "Kampfstufe: ";
		Static197.aString285 = " weitere Optionen";
		Static173.aString247 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
		Static50.aString21 = "Lade Liste der Welten";
		Static20.aString36 = "Lade Titelbild - ";
		Static163.aString217 = "Verbindung mit Update-Server...";
		Static130.aString179 = "blinken3:";
		Static169.aString239 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
		Static93.aString119 = "Musik-Engine vorbereitet.";
		Static119.aString162 = "leuchten1:";
		Static234.aString345 = "Nehmen";
		Static99.aString130 = "Speicher wird zugewiesen.";
		Static301.aString342 = "rot:";
		Static155.aString211 = "Fertigkeit: ";
		Static119.aString163 = "leuchten3:";
		Static114.aString148 = "Schriftsätze geladen.";
		Static29.aString48 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
		Static257.aString372 = "Versteckt";
		Static145.aString432 = "Angreifen";
		Static219.aString327 = " steht bereits auf deiner Ignorieren-Liste!";
		Static208.aString305 = "Lade Texturen - ";
		Static34.aString51 = "3D-Softwarebibliothek gestartet.";
		Static70.aString92 = "Standardeinstellungen geladen";
		Static8.aString19 = "Wähl eine Option";
		Static178.aString253 = "schütteln:";
		Static283.aString404 = "welle2:";
		Static72.aString98 = "RuneScape wird geladen - bitte warten...";
		Static220.aString328 = "Stufe: ";
		Static69.aString91 = "Wordpack geladen.";
		Static287.aString411 = "Konfig geladen.";
		Static118.aString160 = "Spieler kann nicht gefunden werden: ";
		Static271.aString383 = "M";
		Static148.aString204 = "Update-Liste geladen.";
		Static203.aString407 = " zuerst von deiner Ignorieren-Liste!";
		Static240.aString347 = "leuchten2:";
		Static78.aString101 = "weiss:";
		Static277.aString391 = "Texturen geladen.";
		Static109.aString143 = "Suche nach Updates - ";
		Static282.aString400 = "Fallen lassen";
		Static109.aString142 = "gelb:";
		Static66.aString334 = "grün:";
		Static129.aString175 = "T";
		Static115.aString149 = "Ladevorgang - bitte warte.";
		Static84.aString111 = "Lade Schriftsätze - ";
		Static101.aString13 = "Titelbild geladen.";
		Static170.aString240 = "Hierhin gehen";
		Static254.aString361 = "Lade Standardeinstellungen - ";
		Static163.aString216 = "Benutzen";
		Static286.aString410 = "Weiter";
		Static104.aString135 = "Auswählen";
		Static130.aString181 = "Verbindung zum Update-Server hergestellt.";
		Static279.aString397 = "T";
		Static310.aString443 = "scrollen:";
		Static178.aString254 = "Lade...";
		Static259.aString373 = "Bitte entferne ";
		Static161.aString214 = " loggt sich aus.";
		Static252.aString356 = "Starte 3D-Softwarebibliothek.";
		Static264.aString378 = ": ";
		Static72.aString97 = " zuerst von deiner Freunde-Liste!";
		Static17.aString35 = "Lade Konfiguration - ";
		Static117.aString318 = "Spielwelt erstellt.";
		Static117.aString317 = "gleiten:";
		Static38.aString54 = "Eingabeprozedur geladen.";
		Static259.aString374 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
		Static315.aString449 = "Sprites geladen.";
		Static134.aString189 = "Zugewiesener Speicher.";
		Static14.aString32 = "Lade Benutzeroberfläche - ";
		Static61.aString79 = "welle:";
		Static120.aString447 = "Hierhin drehen";
		Static241.aString349 = "blinken1:";
		aString81 = "Okay";
		Static31.aString50 = "Untersuchen";
		Static207.aString301 = "Liste der Welten geladen";
		Static109.aString145 = "Lade Sprites - ";
		Static7.aString18 = "Bitte warte...";
		Static139.aString196 = " steht bereits auf deiner Freunde-Liste!";
		Static256.aString368 = "Bitte entferne ";
		Static266.aString380 = "blaugrün:";
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I[B)Lclient!pd;")
	public static Class1_Sub3_Sub5_Sub1 method1112(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(23) Class1_Sub3_Sub5_Sub1 local23 = new Class1_Sub3_Sub5_Sub1(arg0, Static250.anIntArray469, Static137.anIntArray227, Static95.anIntArray212, Static50.anIntArray22, Static34.aByteArrayArray5);
			Static20.method432();
			return local23;
		}
	}
}
