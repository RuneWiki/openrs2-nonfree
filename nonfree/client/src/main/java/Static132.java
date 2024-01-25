import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!ih", name = "I", descriptor = "I")
	public static int anInt2880 = 0;

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)V")
	public static void method2660() {
		Static125.aString191 = "Eingabeprozedur geladen.";
		Static97.aString163 = "M";
		Static314.aString386 = "Konfig geladen.";
		Static304.aString376 = "Kampfstufe: ";
		Static309.aString381 = ": ";
		Static118.aString418 = "Lade Texturen - ";
		Static10.aString14 = "Benutzeroberfläche geladen.";
		Static233.aString293 = "Texturen geladen.";
		Static160.aString219 = "Spieler kann nicht gefunden werden: ";
		Static203.aString262 = "Mechscape wird geladen - bitte warten...";
		Static47.aString94 = "welle2:";
		Static329.aString408 = "Update-Liste geladen.";
		Static329.aString409 = "rot:";
		Static200.aString258 = " zuerst von deiner Freunde-Liste!";
		Static302.aString424 = "Lade Konfiguration - ";
		Static159.aString217 = "blinken1:";
		Static327.aString407 = " zuerst von deiner Ignorieren-Liste!";
		Static266.aString332 = "M";
		Static169.aString231 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
		Static337.aString419 = "Auswählen";
		Static2.aString1 = "gleiten:";
		Static314.aString387 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
		Static88.aString260 = "Lade Wordpack - ";
		Static8.aString11 = "Nehmen";
		Static271.aString337 = " loggt sich aus.";
		Static279.aString438 = "Wordpack geladen.";
		Static240.aString420 = "Schließen";
		Static135.aString197 = "Lade Sprites - ";
		Static262.aString322 = "gelb:";
		Static28.aString59 = "lila:";
		Static246.aString305 = "Versteckt";
		Static66.aString120 = "Standardeinstellungen geladen";
		Static240.aString421 = "Hierhin drehen";
		Static117.aString185 = "Lade Liste der Welten";
		Static54.aString104 = "Suche nach Updates - ";
		Static254.aString312 = "Wähl eine Option";
		Static263.aString327 = "Gegenstand für Mitglieder";
		Static49.aString95 = "blinken2:";
		Static261.aString319 = "blinken3:";
		Static256.aString313 = "Benutzen";
		Static146.aString210 = "Bitte warte...";
		Static66.aString121 = "Spielwelt erstellt.";
		Static8.aString12 = "Ablegen";
		Static102.aString166 = "Fertigkeit: ";
		Static227.aString417 = " steht bereits auf deiner Freunde-Liste!";
		Static339.aString425 = "Abbrechen";
		Static28.aString60 = "3D-Softwarebibliothek gestartet.";
		Static251.aString414 = "Lade...";
		Static248.aString307 = "Speicher wird zugewiesen.";
		Static211.aString273 = "Lade Schriftsätze - ";
		Static259.aString316 = "leuchten3:";
		Static293.aString366 = "Titelbild geöffnet.";
		Static184.aString244 = "T";
		Static261.aString320 = "welle:";
		Static57.aString110 = " weitere Optionen";
		Static162.aString159 = "Schriftsätze geladen.";
		Static289.aString162 = "Stufe: ";
		Static193.aString248 = "leuchten2:";
		Static34.aString70 = "Sprites geladen.";
		Static293.aString365 = " loggt sich ein.";
		Static161.aString221 = "Angreifen";
		Static263.aString326 = "Okay";
		Static323.aString400 = "Titelbild geladen.";
		Static233.aString292 = "Liste der Welten geladen";
		Static241.aString301 = "weiss:";
		Static232.aString290 = "Bitte entferne ";
		Static70.aString126 = "Lade Standardeinstellungen - ";
		Static35.aString79 = "Ladevorgang - bitte warte.";
		Static140.aString199 = "RuneScape wird geladen - bitte warten...";
		Static162.aString158 = "Musik-Engine vorbereitet.";
		Static47.aString93 = "Lade Titelbild - ";
		Static211.aString274 = "scrollen:";
		Static348.aString431 = "Starte 3D-Softwarebibliothek.";
		Static98.aString90 = "Untersuchen";
		Static253.aString310 = "Verbindung abgebrochen.";
		Static198.aString253 = "Client-Variablen geladen";
		Static283.aString351 = "Lade Benutzeroberfläche - ";
		Static113.aString178 = "blaugrün:";
		Static161.aString220 = "schütteln:";
		Static267.aString334 = "Fallen lassen";
		Static350.aString434 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
		Static207.aString269 = "Weiter";
		Static286.aString356 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
		Static281.aString324 = "T";
		Static266.aString333 = " steht bereits auf deiner Ignorieren-Liste!";
		Static21.aString32 = "Verbindung mit Update-Server...";
		Static272.aString341 = "Hierhin gehen";
		Static55.aString108 = "Verbindung zum Update-Server hergestellt.";
		Static160.aString218 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
		Static199.aString256 = "leuchten1:";
		Static33.aString65 = "grün:";
		Static237.aString296 = "Bitte entferne ";
		Static249.aString100 = "Zugewiesener Speicher.";
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)I")
	public static int method2661(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static272.anIntArray690[arg1 & 0x3] : Static36.anIntArray152[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!vj;IILjava/lang/String;ILclient!hq;IILclient!bi;ILclient!vm;)V")
	public static void method2663(@OriginalArg(0) int arg0, @OriginalArg(1) Class64 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class94 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class26 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class208 arg10) {
		@Pc(19) int local19;
		if (Static118.anInt6324 == 4) {
			local19 = (int) Static351.aFloat80 & 0x3FFF;
		} else {
			local19 = Static218.anInt4347 + (int) Static351.aFloat80 & 0x3FFF;
		}
		@Pc(39) int local39 = Math.max(arg8.anInt523 / 2, arg8.anInt515 / 2) + 10;
		@Pc(47) int local47 = arg2 * arg2 + arg3 * arg3;
		if (local47 > local39 * local39) {
			return;
		}
		@Pc(57) int local57 = Class147.anIntArray604[local19];
		@Pc(61) int local61 = Class147.anIntArray603[local19];
		if (Static118.anInt6324 != 4) {
			local61 = local61 * 256 / (Static49.anInt1359 + 256);
			local57 = local57 * 256 / (Static49.anInt1359 + 256);
		}
		@Pc(93) int local93 = local57 * arg3 + arg2 * local61 >> 15;
		@Pc(104) int local104 = local61 * arg3 - arg2 * local57 >> 15;
		@Pc(111) int local111 = arg10.method5380(arg4, null, 100);
		@Pc(117) int local117 = local93 - local111 / 2;
		@Pc(125) int local125 = arg10.method5377(null, arg4);
		if (local117 >= -arg8.anInt523 && arg8.anInt523 >= local117 && -arg8.anInt515 <= local104 && local104 <= arg8.anInt515) {
			arg6.method5693(arg5, 0, arg8.anInt523 / 2 + local117 + arg0, 1, null, 50, 0, arg0, arg1, arg7, local111, arg8.anInt515 / 2 + arg5 - local125 - local104 - arg9, null, arg4, 0);
		}
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(II)Lclient!qr;")
	public static Class174 method2664(@OriginalArg(0) int arg0) {
		@Pc(5) Class103 local5 = Static329.aClass103_65;
		@Pc(14) Class174 local14;
		synchronized (Static329.aClass103_65) {
			local14 = (Class174) Static329.aClass103_65.method2682((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static316.aClass180_91.method4560(Static145.method2909(arg0), Static256.method4315(arg0));
		local14 = new Class174();
		local14.anInt5188 = arg0;
		if (local34 != null) {
			local14.method4435(new Class7_Sub3(local34));
		}
		local14.method4444();
		@Pc(62) Class103 local62 = Static329.aClass103_65;
		synchronized (Static329.aClass103_65) {
			Static329.aClass103_65.method2687(local14, (long) arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method2665(@OriginalArg(1) String arg0) {
		@Pc(11) int local11 = arg0.length();
		@Pc(13) long local13 = 0L;
		for (@Pc(15) int local15 = 0; local15 < local11; local15++) {
			local13 = (long) arg0.charAt(local15) + (local13 << 5) - local13;
		}
		return local13;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "([IB)Ljava/lang/String;")
	public static String method2666(@OriginalArg(0) int[] arg0) {
		@Pc(15) StringBuffer local15 = new StringBuffer();
		@Pc(17) int local17 = Static41.anInt1070;
		for (@Pc(19) int local19 = 0; local19 < arg0.length; local19++) {
			@Pc(26) Class159 local26 = Static210.method3747(arg0[local19]);
			if (local26.anInt4708 != -1) {
				@Pc(38) Class52 local38 = (Class52) Static33.aClass103_9.method2682((long) local26.anInt4708);
				if (local38 == null) {
					@Pc(46) Class56 local46 = Static358.method1307(Static312.aClass180_89, local26.anInt4708, 0);
					if (local46 != null) {
						local38 = Static128.aClass89_3.method5411(local46);
						Static33.aClass103_9.method2687(local38, (long) local26.anInt4708);
					}
				}
				if (local38 != null) {
					Static214.aClass52Array12[local17] = local38;
					local15.append(" <img=").append(local17).append(">");
					local17++;
				}
			}
		}
		return local15.toString();
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
	public static void method2667() {
		Static52.aClass103_13.method2678();
	}
}
