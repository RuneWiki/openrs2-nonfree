import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "Lclient!la;")
	public static Class96 aClass96_1;

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
	public static int anInt3295;

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "Lclient!lc;")
	public static Class98 aClass98_95;

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "[I")
	public static int[] anIntArray292;

	@OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
	public static int anInt3299;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "[Lclient!ti;")
	public static Class153_Sub1[] aClass153_Sub1Array1 = new Class153_Sub1[29];

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
	public static int anInt3293 = 0;

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "[Lclient!sf;")
	public static Class4_Sub2_Sub19[] aClass4_Sub2_Sub19Array2 = new Class4_Sub2_Sub19[14];

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "S")
	public static short aShort17 = 205;

	@OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
	public static int anInt3301 = 3;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)I")
	public static int method2598() {
		if ((double) Static96.aFloat15 == 3.0D) {
			return 37;
		} else if ((double) Static96.aFloat15 == 4.0D) {
			return 50;
		} else if ((double) Static96.aFloat15 == 6.0D) {
			return 75;
		} else if ((double) Static96.aFloat15 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)Lclient!vm;")
	public static Class177 method2599(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class177 local9 = new Class177();
		for (@Pc(22) Class4_Sub2_Sub9 local22 = (Class4_Sub2_Sub9) Static48.aClass97_1.method2363(); local22 != null; local22 = (Class4_Sub2_Sub9) Static48.aClass97_1.method2367()) {
			if (local22.aBoolean139 && local22.method1419(arg1, arg0)) {
				local9.method4274(local22);
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)I")
	public static int method2600(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IB)V")
	public static void method2601(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class4 local5 = Static294.aClass97_18.method2363(); local5 != null; local5 = Static294.aClass97_18.method2367()) {
			if ((long) arg0 == (local5.aLong200 >> 48 & 0xFFFFL)) {
				local5.method4391();
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
	public static void method2602() {
		Static83.aString131 = "Spielwelt erstellt.";
		Static243.aString158 = "lila:";
		Static3.aString2 = "Lade...";
		Static180.aString117 = "Verbindung mit Update-Server...";
		Static191.aString180 = " loggt sich aus.";
		Static46.aString28 = "Lade Sprites - ";
		Static233.aString153 = "Titelbild geöffnet.";
		Static182.aString120 = "Fertigkeit: ";
		Static264.aString178 = "weiss:";
		Static190.aString123 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
		Static86.aString51 = "Sprites geladen.";
		Static176.aString19 = "Lade Titelbild - ";
		Static187.aString122 = " steht bereits auf deiner Freunde-Liste!";
		Static136.aString88 = "Fallen lassen";
		Static74.aString39 = "schütteln:";
		Static160.aString107 = "blinken1:";
		Static62.aString32 = "Lade Standardeinstellungen - ";
		Static81.aString129 = "Lade Texturen - ";
		Static286.aString191 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
		Static268.aString183 = "T";
		Static6.aString3 = "Eingabeprozedur geladen.";
		Static41.aString21 = "Titelbild geladen.";
		Static61.aString31 = "welle:";
		Static113.aString72 = "Zugewiesener Speicher.";
		Static169.aString110 = "scrollen:";
		Static80.aString42 = "Lade Konfiguration - ";
		Static127.aString82 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
		Static129.aString86 = "Abbrechen";
		Static129.aString84 = "Hierhin drehen";
		Static201.aString125 = "Gegenstand für Mitglieder";
		Static25.aString7 = "Wordpack geladen.";
		Static63.aString33 = "leuchten2:";
		Static97.aString63 = "Verbindung zum Update-Server hergestellt.";
		Static158.aString105 = "Texturen geladen.";
		Static86.aString50 = "Ladevorgang - bitte warte.";
		Static167.aString108 = " zuerst von deiner Freunde-Liste!";
		Static35.aString16 = "Weiter";
		Static153.aString102 = "blinken3:";
		Static219.aString139 = "Kampfstufe: ";
		Static212.aString133 = "Benutzen";
		Static194.aString124 = "3D-Softwarebibliothek gestartet.";
		Static63.aString34 = "Lade Schriftsätze - ";
		Static124.aString78 = "RuneScape wird geladen - bitte warten...";
		Static129.aString85 = "Stufe: ";
		Static244.aString159 = "blaugrün:";
		Static45.aString23 = "Konfig geladen.";
		Static145.aString96 = "Benutzeroberfläche geladen.";
		Static288.aString71 = "Wähl eine Option";
		Static230.aString147 = "M";
		Static255.aString166 = "möchte mit dir handeln.";
		Static104.aString66 = "Standardinstellungen geladen";
		Static254.aString164 = ": ";
		Static105.aString67 = " loggt sich ein.";
		Static67.aString35 = "Schriftsätze geladen.";
		Static173.aString112 = "Ablegen";
		Static275.aString186 = "Hierhin gehen";
		Static129.aString83 = "Bitte entferne ";
		Static101.aString163 = "leuchten1:";
		Static245.aString160 = "leuchten3:";
		Static220.aString140 = "T";
		Static221.aString141 = " zuerst von deiner Ignorieren-Liste!";
		Static191.aString179 = "Bitte warte...";
		Static275.aString185 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
		Static154.aString103 = "Starte 3D-Softwarebibliothek.";
		Static191.aString181 = "welle2:";
		Static158.aString106 = "Lade Liste der Welten";
		Static257.aString168 = "Update-Liste geladen.";
		Static22.aString5 = "Musik-Engine vorbereitet.";
		Static121.aString76 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
		Static145.aString97 = "Angreifen";
		Static95.aString57 = "blinken2:";
		Static51.aString29 = "Untersuchen";
		Static38.aString17 = "rot:";
		Static25.aString6 = "Lade Wordpack - ";
		Static125.aString79 = "gleiten:";
		Static234.aString154 = "gelb:";
		Static137.aString89 = "grün:";
		Static1.aString1 = "Lade Benutzeroberfläche - ";
		Static44.aString22 = "Verbindung abgebrochen.";
		Static198.aString70 = " weitere Optionen";
		Static76.aString40 = "Spieler kann nicht gefunden werden: ";
		Static240.aString182 = "M";
		Static247.aString161 = "Schließen";
		Static259.aString170 = "Suche nach Updates - ";
		Static224.aString144 = "Auswählen";
		Static225.aString145 = "Liste der Welten geladen";
		Static95.aString60 = "Bitte entferne ";
		Static229.aString190 = "Okay";
		Static222.aString142 = "Speicher wird zugewiesen.";
		Static215.aString135 = "Versteckt";
		Static179.aString116 = "Nehmen";
		Static41.aString20 = " steht bereits auf deiner Ignorieren-Liste!";
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IBILclient!lc;)Lclient!af;")
	public static Class4_Sub2_Sub1_Sub1 method2603(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class98 arg2) {
		return Static292.method4344(arg0, arg1, arg2) ? Static161.method2511() : null;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
	public static void method2604() {
		anIntArray292 = null;
		aClass96_1 = null;
		aClass4_Sub2_Sub19Array2 = null;
		aClass98_95 = null;
		aClass153_Sub1Array1 = null;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!tk;Lclient!p;II)V")
	public static void method2605(@OriginalArg(0) Class164 arg0, @OriginalArg(1) Class4_Sub17 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class4_Sub29 local9 = new Class4_Sub29();
		local9.anInt5173 = arg1.method1874();
		local9.anInt5181 = arg1.method1889();
		local9.anIntArray456 = new int[local9.anInt5173];
		local9.aClass123Array2 = new Class123[local9.anInt5173];
		local9.anIntArray457 = new int[local9.anInt5173];
		local9.aByteArrayArrayArray19 = new byte[local9.anInt5173][][];
		local9.anIntArray458 = new int[local9.anInt5173];
		local9.aClass123Array1 = new Class123[local9.anInt5173];
		for (@Pc(55) int local55 = 0; local55 < local9.anInt5173; local55++) {
			try {
				@Pc(65) int local65 = arg1.method1874();
				@Pc(82) String local82;
				@Pc(86) String local86;
				@Pc(88) int local88;
				if (local65 == 0 || local65 == 1 || local65 == 2) {
					local82 = arg1.method1841();
					local86 = arg1.method1841();
					local88 = 0;
					if (local65 == 1) {
						local88 = arg1.method1889();
					}
					local9.anIntArray457[local55] = local65;
					local9.anIntArray458[local55] = local88;
					local9.aClass123Array2[local55] = arg0.method3949(Static185.method2907(local82), local86);
				} else if (local65 == 3 || local65 == 4) {
					local82 = arg1.method1841();
					local86 = arg1.method1841();
					local88 = arg1.method1874();
					@Pc(148) String[] local148 = new String[local88];
					for (@Pc(150) int local150 = 0; local150 < local88; local150++) {
						local148[local150] = arg1.method1841();
					}
					@Pc(169) byte[][] local169 = new byte[local88][];
					@Pc(181) int local181;
					if (local65 == 3) {
						for (@Pc(174) int local174 = 0; local174 < local88; local174++) {
							local181 = arg1.method1889();
							local169[local174] = new byte[local181];
							arg1.method1839(local181, local169[local174]);
						}
					}
					@Pc(200) Class[] local200 = new Class[local88];
					local9.anIntArray457[local55] = local65;
					for (local181 = 0; local181 < local88; local181++) {
						local200[local181] = Static185.method2907(local148[local181]);
					}
					local9.aClass123Array1[local55] = arg0.method3936(local200, Static185.method2907(local82), local86);
					local9.aByteArrayArrayArray19[local55] = local169;
				}
			} catch (@Pc(244) ClassNotFoundException local244) {
				local9.anIntArray456[local55] = -1;
			} catch (@Pc(251) SecurityException local251) {
				local9.anIntArray456[local55] = -2;
			} catch (@Pc(258) NullPointerException local258) {
				local9.anIntArray456[local55] = -3;
			} catch (@Pc(265) Exception local265) {
				local9.anIntArray456[local55] = -4;
			} catch (@Pc(272) Throwable local272) {
				local9.anIntArray456[local55] = -5;
			}
		}
		Static233.aClass10_48.method184(local9);
	}
}
