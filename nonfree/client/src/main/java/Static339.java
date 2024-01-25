import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!w", name = "l", descriptor = "Z")
	public static boolean aBoolean568;

	@OriginalMember(owner = "client!w", name = "A", descriptor = "I")
	public static int anInt6429;

	@OriginalMember(owner = "client!w", name = "h", descriptor = "[I")
	public static final int[] anIntArray799 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!w", name = "m", descriptor = "I")
	public static int anInt6426 = 0;

	@OriginalMember(owner = "client!w", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString255 = "Please wait - attempting to reestablish.";

	@OriginalMember(owner = "client!w", name = "w", descriptor = "[I")
	public static final int[] anIntArray800 = new int[100];

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method5607(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(9) int local9 = 0; local9 < Static290.anInt5612; local9++) {
			if (arg0.equalsIgnoreCase(Static257.aStringArray33[local9])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static130.aClass5_Sub3_Sub3_Sub1_1.aString130);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IB)I")
	public static int method5608(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(27) int local27 = local16 | local16 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
	public static void method5609() {
		Static282.aString219 = "Versteckt";
		Static19.aString12 = "Lade Konfiguration - ";
		Static206.aString167 = "Untersuchen";
		Static277.aString249 = "blaugrün:";
		Static89.aString71 = "Lade Sprites - ";
		Static236.aString184 = "leuchten1:";
		Static224.aString182 = "welle:";
		Static24.aString19 = "Gegenstand für Mitglieder";
		Static76.aString60 = "M";
		Static327.aString250 = "leuchten2:";
		Static312.aString259 = "M";
		Static191.aString124 = "Lade Standardeinstellungen - ";
		Static103.aString81 = "Lade Titelbild - ";
		Static41.aString27 = "Liste der Welten geladen";
		Static84.aString64 = "Verbindung mit Update-Server...";
		Static63.aString54 = "Lade Texturen - ";
		Static79.aString148 = " steht bereits auf deiner Freunde-Liste!";
		Static87.aString68 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
		Static290.aString224 = "Lade Benutzeroberfläche - ";
		Static32.aString25 = "Weiter";
		Static54.aString137 = "3D-Softwarebibliothek gestartet.";
		Static278.aString217 = "Lade...";
		Static24.aString20 = "Wordpack geladen.";
		Static106.aString83 = "Lade Schriftsätze - ";
		Static151.aString156 = "Benutzeroberfläche geladen.";
		Static54.aString138 = "Suche nach Updates - ";
		Static318.aString246 = "Auswählen";
		Static211.aString171 = "leuchten3:";
		Static253.aString198 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
		Static87.aString67 = "blinken2:";
		Static122.aString98 = "Lade Liste der Welten";
		Static16.aString9 = "Fertigkeit: ";
		Static170.aString147 = "gelb:";
		Static96.aString257 = "Spieler kann nicht gefunden werden: ";
		Static245.aString193 = "lila:";
		Static311.aString238 = " loggt sich aus.";
		Static283.aString221 = "Update-Liste geladen.";
		Static301.aString232 = "Nehmen";
		Static325.aString189 = "blinken1:";
		Static1.aString2 = "Kampfstufe: ";
		Static107.aString85 = "Mechscape wird geladen - bitte warten...";
		Static118.aString195 = "Okay";
		Static72.aString56 = "Fallen lassen";
		Static47.aString35 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
		Static310.aString237 = "schütteln:";
		Static125.aString102 = "weiss:";
		Static219.aString177 = "Hierhin gehen";
		Static343.aString197 = "Hierhin drehen";
		Static101.aString80 = "Schriftsätze geladen.";
		Static263.aString202 = "Abbrechen";
		Static120.aString97 = " zuerst von deiner Freunde-Liste!";
		Static118.aString194 = "Ladevorgang - bitte warte.";
		Static148.aString200 = " steht bereits auf deiner Ignorieren-Liste!";
		Static185.aString34 = "Bitte warte...";
		Static278.aString218 = ": ";
		Static110.aString90 = "Bitte entferne ";
		aString255 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
		Static185.aString32 = "Titelbild geladen.";
		Static274.aString215 = "Standardeinstellungen geladen";
		Static213.aString175 = " loggt sich ein.";
		Static351.aString258 = "Verbindung zum Update-Server hergestellt.";
		Static200.aString162 = "T";
		Static73.aString57 = "Bitte entferne ";
		Static140.aString108 = "Eingabeprozedur geladen.";
		Static205.aString166 = "Wähl eine Option";
		Static270.aString212 = "Texturen geladen.";
		Static185.aString33 = " zuerst von deiner Ignorieren-Liste!";
		Static75.aString58 = " weitere Optionen";
		Static160.aString125 = "Sprites geladen.";
		Static29.aString23 = "blinken3:";
		Static49.aString38 = "Starte 3D-Softwarebibliothek.";
		Static313.aString241 = "Benutzen";
		Static108.aString86 = "rot:";
		Static194.aString159 = "Musik-Engine vorbereitet.";
		Static105.aString82 = "T";
		Static291.aString225 = "gleiten:";
		Static8.aString7 = "welle2:";
		Static302.aString192 = "Angreifen";
		Static325.aString190 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
		Static267.aString203 = "scrollen:";
		Static1.aString1 = "grün:";
		Static55.aString45 = "Schließen";
		Static240.aString185 = "Lade Wordpack - ";
		Static204.aString165 = "Ablegen";
		Static313.aString242 = "RuneScape wird geladen - bitte warten...";
		Static214.aString176 = "Konfig geladen.";
		Static88.aString70 = "Spielwelt erstellt.";
		Static153.aString119 = "Verbindung abgebrochen.";
		Static74.aString131 = "Zugewiesener Speicher.";
		Static77.aString61 = "Client-Variablen geladen";
		Static62.aString53 = "Stufe: ";
		Static75.aString59 = "Speicher wird zugewiesen.";
		Static140.aString109 = "Titelbild geöffnet.";
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II)V")
	public static void method5610(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub2 local10 = Static42.method1000(8, arg0);
		local10.method167();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
	public static void method5611() {
		Static232.aClass1_Sub7_Sub1_4.method729();
		@Pc(11) int local11 = Static232.aClass1_Sub7_Sub1_4.method733(1);
		if (local11 == 0) {
			return;
		}
		@Pc(22) int local22 = Static232.aClass1_Sub7_Sub1_4.method733(2);
		if (local22 == 0) {
			Static320.anIntArray768[Static125.anInt2470++] = 2047;
			return;
		}
		@Pc(47) int local47;
		@Pc(57) int local57;
		if (local22 == 1) {
			local47 = Static232.aClass1_Sub7_Sub1_4.method733(3);
			Static130.aClass5_Sub3_Sub3_Sub1_1.method4532(local47, 1);
			local57 = Static232.aClass1_Sub7_Sub1_4.method733(1);
			if (local57 == 1) {
				Static320.anIntArray768[Static125.anInt2470++] = 2047;
			}
		} else if (local22 == 2) {
			if (Static232.aClass1_Sub7_Sub1_4.method733(1) == 1) {
				local47 = Static232.aClass1_Sub7_Sub1_4.method733(3);
				Static130.aClass5_Sub3_Sub3_Sub1_1.method4532(local47, 2);
				local57 = Static232.aClass1_Sub7_Sub1_4.method733(3);
				Static130.aClass5_Sub3_Sub3_Sub1_1.method4532(local57, 2);
			} else {
				local47 = Static232.aClass1_Sub7_Sub1_4.method733(3);
				Static130.aClass5_Sub3_Sub3_Sub1_1.method4532(local47, 0);
			}
			local47 = Static232.aClass1_Sub7_Sub1_4.method733(1);
			if (local47 == 1) {
				Static320.anIntArray768[Static125.anInt2470++] = 2047;
			}
		} else if (local22 == 3) {
			local47 = Static232.aClass1_Sub7_Sub1_4.method733(1);
			local57 = Static232.aClass1_Sub7_Sub1_4.method733(1);
			if (local57 == 1) {
				Static320.anIntArray768[Static125.anInt2470++] = 2047;
			}
			Static285.anInt5511 = Static232.aClass1_Sub7_Sub1_4.method733(2);
			@Pc(177) int local177 = Static232.aClass1_Sub7_Sub1_4.method733(7);
			@Pc(182) int local182 = Static232.aClass1_Sub7_Sub1_4.method733(7);
			Static130.aClass5_Sub3_Sub3_Sub1_1.method3067(local182, local47 == 1, local177, Static285.anInt5511);
		}
	}
}
