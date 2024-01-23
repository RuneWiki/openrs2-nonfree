import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString37 = "Select";

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "J")
	public static volatile long aLong26 = 0L;

	@OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
	public static int anInt441 = 2;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIZIIIII)V")
	public static void method418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		for (local7 = 0; local7 < 104; local7++) {
			for (local12 = 0; local12 < 104; local12++) {
				Static292.anIntArrayArray48[local7][local12] = 0;
				Static16.anIntArrayArray9[local7][local12] = 99999999;
			}
		}
		local12 = arg2;
		Static292.anIntArrayArray48[arg4][arg2] = 99;
		Static16.anIntArrayArray9[arg4][arg2] = 0;
		local7 = arg4;
		@Pc(53) int local53 = 0;
		@Pc(55) byte local55 = 0;
		@Pc(57) boolean local57 = false;
		Static237.anIntArray479[0] = arg4;
		@Pc(64) int local64 = local55 + 1;
		Static141.anIntArray653[0] = arg2;
		@Pc(77) int[][] local77 = Static296.aClass30Array1[Static281.anInt5335].anIntArrayArray6;
		@Pc(201) int local201;
		while (local64 != local53) {
			local7 = Static237.anIntArray479[local53];
			local12 = Static141.anIntArray653[local53];
			local53 = local53 + 1 & 0xFFF;
			if (arg0 == local7 && local12 == arg5) {
				local57 = true;
				break;
			}
			if (arg3 != 0) {
				if ((arg3 < 5 || arg3 == 10) && Static296.aClass30Array1[Static281.anInt5335].method574(arg5, arg6, local12, local7, arg0, 2, arg3 - 1)) {
					local57 = true;
					break;
				}
				if (arg3 < 10 && Static296.aClass30Array1[Static281.anInt5335].method577(arg0, local7, arg5, local12, arg3 - 1, arg6, 2)) {
					local57 = true;
					break;
				}
			}
			if (arg1 != 0 && arg8 != 0 && Static296.aClass30Array1[Static281.anInt5335].method570(local12, arg7, 2, arg5, arg0, arg8, arg1, local7)) {
				local57 = true;
				break;
			}
			local201 = Static16.anIntArrayArray9[local7][local12] + 1;
			if (local7 > 0 && Static292.anIntArrayArray48[local7 - 1][local12] == 0 && (local77[local7 - 1][local12] & 0x2C010E) == 0 && (local77[local7 - 1][local12 + 1] & 0x2C0138) == 0) {
				Static237.anIntArray479[local64] = local7 - 1;
				Static141.anIntArray653[local64] = local12;
				Static292.anIntArrayArray48[local7 - 1][local12] = 2;
				Static16.anIntArrayArray9[local7 - 1][local12] = local201;
				local64 = local64 + 1 & 0xFFF;
			}
			if (local7 < 102 && Static292.anIntArrayArray48[local7 + 1][local12] == 0 && (local77[local7 + 2][local12] & 0x2C0183) == 0 && (local77[local7 + 2][local12 + 1] & 0x2C01E0) == 0) {
				Static237.anIntArray479[local64] = local7 + 1;
				Static141.anIntArray653[local64] = local12;
				Static292.anIntArrayArray48[local7 + 1][local12] = 8;
				local64 = local64 + 1 & 0xFFF;
				Static16.anIntArrayArray9[local7 + 1][local12] = local201;
			}
			if (local12 > 0 && Static292.anIntArrayArray48[local7][local12 - 1] == 0 && (local77[local7][local12 - 1] & 0x2C010E) == 0 && (local77[local7 + 1][local12 - 1] & 0x2C0183) == 0) {
				Static237.anIntArray479[local64] = local7;
				Static141.anIntArray653[local64] = local12 - 1;
				Static292.anIntArrayArray48[local7][local12 - 1] = 1;
				local64 = local64 + 1 & 0xFFF;
				Static16.anIntArrayArray9[local7][local12 - 1] = local201;
			}
			if (local12 < 102 && Static292.anIntArrayArray48[local7][local12 + 1] == 0 && (local77[local7][local12 + 2] & 0x2C0138) == 0 && (local77[local7 + 1][local12 + 2] & 0x2C01E0) == 0) {
				Static237.anIntArray479[local64] = local7;
				Static141.anIntArray653[local64] = local12 + 1;
				local64 = local64 + 1 & 0xFFF;
				Static292.anIntArrayArray48[local7][local12 + 1] = 4;
				Static16.anIntArrayArray9[local7][local12 + 1] = local201;
			}
			if (local7 > 0 && local12 > 0 && Static292.anIntArrayArray48[local7 - 1][local12 - 1] == 0 && (local77[local7 - 1][local12] & 0x2C013E) == 0 && (local77[local7 - 1][local12 - 1] & 0x2C010E) == 0 && (local77[local7][local12 - 1] & 0x2C018F) == 0) {
				Static237.anIntArray479[local64] = local7 - 1;
				Static141.anIntArray653[local64] = local12 - 1;
				local64 = local64 + 1 & 0xFFF;
				Static292.anIntArrayArray48[local7 - 1][local12 - 1] = 3;
				Static16.anIntArrayArray9[local7 - 1][local12 - 1] = local201;
			}
			if (local7 < 102 && local12 > 0 && Static292.anIntArrayArray48[local7 + 1][local12 - 1] == 0 && (local77[local7 + 1][local12 - 1] & 0x2C018F) == 0 && (local77[local7 + 2][local12 - 1] & 0x2C0183) == 0 && (local77[local7 + 2][local12] & 0x2C01E3) == 0) {
				Static237.anIntArray479[local64] = local7 + 1;
				Static141.anIntArray653[local64] = local12 - 1;
				local64 = local64 + 1 & 0xFFF;
				Static292.anIntArrayArray48[local7 + 1][local12 - 1] = 9;
				Static16.anIntArrayArray9[local7 + 1][local12 - 1] = local201;
			}
			if (local7 > 0 && local12 < 102 && Static292.anIntArrayArray48[local7 - 1][local12 + 1] == 0 && (local77[local7 - 1][local12 + 1] & 0x2C013E) == 0 && (local77[local7 - 1][local12 + 2] & 0x2C0138) == 0 && (local77[local7][local12 + 2] & 0x2C01F8) == 0) {
				Static237.anIntArray479[local64] = local7 - 1;
				Static141.anIntArray653[local64] = local12 + 1;
				local64 = local64 + 1 & 0xFFF;
				Static292.anIntArrayArray48[local7 - 1][local12 + 1] = 6;
				Static16.anIntArrayArray9[local7 - 1][local12 + 1] = local201;
			}
			if (local7 < 102 && local12 < 102 && Static292.anIntArrayArray48[local7 + 1][local12 + 1] == 0 && (local77[local7 + 1][local12 + 2] & 0x2C01F8) == 0 && (local77[local7 + 2][local12 + 2] & 0x2C01E0) == 0 && (local77[local7 + 2][local12 + 1] & 0x2C01E3) == 0) {
				Static237.anIntArray479[local64] = local7 + 1;
				Static141.anIntArray653[local64] = local12 + 1;
				local64 = local64 + 1 & 0xFFF;
				Static292.anIntArrayArray48[local7 + 1][local12 + 1] = 12;
				Static16.anIntArrayArray9[local7 + 1][local12 + 1] = local201;
			}
		}
		if (!local57) {
			local201 = 1000;
			@Pc(922) int local922 = 100;
			for (@Pc(928) int local928 = arg0 - 10; local928 <= arg0 + 10; local928++) {
				for (@Pc(938) int local938 = arg5 - 10; local938 <= arg5 + 10; local938++) {
					if (local928 >= 0 && local938 >= 0 && local928 < 104 && local938 < 104 && Static16.anIntArrayArray9[local928][local938] < 100) {
						@Pc(970) int local970 = 0;
						@Pc(972) int local972 = 0;
						if (arg0 > local928) {
							local970 = arg0 - local928;
						} else if (arg1 + arg0 - 1 < local928) {
							local970 = local928 + 1 - arg1 - arg0;
						}
						if (local938 < arg5) {
							local972 = arg5 - local938;
						} else if (local938 > arg8 + arg5 - 1) {
							local972 = local938 + 1 - arg8 - arg5;
						}
						@Pc(1049) int local1049 = local970 * local970 + local972 * local972;
						if (local201 > local1049 || local1049 == local201 && local922 > Static16.anIntArrayArray9[local928][local938]) {
							local922 = Static16.anIntArrayArray9[local928][local938];
							local12 = local938;
							local7 = local928;
							local201 = local1049;
						}
					}
				}
			}
			if (local201 == 1000) {
				return;
			}
			if (arg4 == local7 && arg2 == local12) {
				return;
			}
		}
		Static105.aBoolean147 = false;
		Static239.anInt4507 = local7;
		Static102.anInt2140 = local12;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method419(@OriginalArg(0) String arg0) {
		Static227.aString268 = arg0;
		if (Static276.aClass139_4.anApplet1 == null) {
			return;
		}
		try {
			@Pc(15) String local15 = Static276.aClass139_4.anApplet1.getParameter("cookieprefix");
			@Pc(24) String local24 = Static276.aClass139_4.anApplet1.getParameter("cookiehost");
			@Pc(39) String local39 = local15 + "settings=" + arg0 + "; version=1; path=/; domain=" + local24;
			if (arg0.length() == 0) {
				local39 = local39 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local39 = local39 + "; Expires=" + Static48.method742(Static101.method1677() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static319.method1854("document.cookie=\"" + local39 + "\"", Static276.aClass139_4.anApplet1);
		} catch (@Pc(92) Throwable local92) {
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	public static void method420() {
		Static250.aClass26_50.method511();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method423(@OriginalArg(1) long arg0) {
		return Static282.method4356(arg0);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(CI)Z")
	public static boolean method424(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(27) int local27 = 0;
			@Pc(29) char[] local29 = Static257.aCharArray3;
			while (local27 < local29.length) {
				@Pc(37) char local37 = local29[local27];
				if (arg0 == local37) {
					return true;
				}
				local27++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
	public static void method425() {
		Static92.aString115 = "Fallen lassen";
		Static252.aString300 = "leuchten2:";
		Static5.aString8 = "Schließen";
		Static13.aString23 = "Verbindung zum Update-Server hergestellt.";
		Static304.aString351 = "rot:";
		Static140.aString160 = "Speicher wird zugewiesen.";
		Static128.aString148 = " weitere Optionen";
		Static105.aString121 = "Wordpack geladen.";
		Static208.aString240 = "Titelbild geladen.";
		Static4.aString7 = "Standardinstellungen geladen";
		aString37 = "Auswählen";
		Static240.aString282 = "Suche nach Updates - ";
		Static55.aString68 = "Lade...";
		Static45.aString56 = "Lade Titelbild - ";
		Static169.aString201 = "Weiter";
		Static315.aString376 = "Lade Sprites - ";
		Static227.aString267 = "Bitte entferne ";
		Static251.aString297 = "Lade Texturen - ";
		Static115.aString133 = "Gegenstand für Mitglieder";
		Static194.aString321 = "Benutzen";
		Static66.aString80 = "Liste der Welten geladen";
		Static179.aString210 = "RuneScape wird geladen - bitte warten...";
		Static203.aString230 = "M";
		Static70.aString82 = "Lade Wordpack - ";
		Static312.aString371 = "Verbindung mit Update-Server...";
		Static70.aString83 = "Starte 3D-Softwarebibliothek.";
		Static132.aString154 = "welle:";
		Static29.aString38 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
		Static244.aString289 = "Okay";
		Static145.aString170 = "schütteln:";
		Static291.aString336 = "Lade Benutzeroberfläche - ";
		Static128.aString149 = "Lade Standardeinstellungen - ";
		Static111.aString128 = " steht bereits auf deiner Ignorieren-Liste!";
		Static88.aString112 = "3D-Softwarebibliothek gestartet.";
		Static39.aString49 = "M";
		Static36.aString46 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
		Static107.aString332 = "grün:";
		Static205.aString233 = "Lade Schriftsätze - ";
		Static152.aString179 = "weiss:";
		Static277.aString324 = "Spielwelt erstellt.";
		Static45.aString55 = ": ";
		Static220.aString235 = "scrollen:";
		Static241.aString283 = "Spieler kann nicht gefunden werden: ";
		Static128.aString147 = "Titelbild geöffnet.";
		Static20.aString30 = "Lade Konfiguration - ";
		Static166.aString211 = "Musik-Engine vorbereitet.";
		Static156.aString187 = "Ladevorgang - bitte warte.";
		Static102.aString120 = "Angreifen";
		Static128.aString146 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
		Static89.aString113 = " zuerst von deiner Freunde-Liste!";
		Static171.aString203 = "leuchten1:";
		Static174.aString206 = "Lade Liste der Welten";
		Static276.aString322 = "blinken3:";
		Static216.aString257 = "leuchten3:";
		Static98.aString118 = "möchte mit dir handeln.";
		Static125.aString139 = "Hierhin drehen";
		Static208.aString239 = "T";
		Static234.aString272 = "Sprites geladen.";
		Static4.aString6 = "Hierhin gehen";
		Static171.aString202 = "Wähl eine Option";
		Static235.aString273 = "blinken1:";
		Static214.aString249 = " loggt sich ein.";
		Static210.aString224 = " loggt sich aus.";
		Static153.aString185 = "Versteckt";
		Static256.aString305 = "blaugrün:";
		Static168.aString199 = "Update-Liste geladen.";
		Static169.aString200 = "Eingabeprozedur geladen.";
		Static109.aString124 = "Bitte warte...";
		Static177.aString207 = "Verbindung abgebrochen.";
		Static254.aString303 = "Abbrechen";
		Static235.aString274 = "welle2:";
		Static306.aString355 = "Stufe: ";
		Static140.aString161 = "T";
		Static13.aString22 = "Untersuchen";
		Static190.aString218 = "Schriftsätze geladen.";
		Static8.aString11 = "Ablegen";
		Static228.aString269 = "Zugewiesener Speicher.";
		Static130.aString150 = "Benutzeroberfläche geladen.";
		Static282.aString327 = "Fertigkeit: ";
		Static172.aString205 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
		Static127.aString142 = "gleiten:";
		Static306.aString354 = " steht bereits auf deiner Freunde-Liste!";
		Static105.aString122 = "Bitte entferne ";
		Static304.aString350 = "blinken2:";
		Static233.aString193 = "Mechscape wird geladen - bitte warten...";
		Static159.aString375 = "Konfig geladen.";
		Static15.aString26 = "Nehmen";
		Static310.aString370 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
		Static224.aString263 = "Texturen geladen.";
		Static31.aString43 = "gelb:";
		Static186.aString331 = "lila:";
		Static20.aString29 = "Kampfstufe: ";
		Static152.aString180 = " zuerst von deiner Ignorieren-Liste!";
	}
}
