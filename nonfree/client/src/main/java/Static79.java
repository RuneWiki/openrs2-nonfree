import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!f", name = "c", descriptor = "Lclient!hj;")
	public static final Class14_Sub4_Sub2 aClass14_Sub4_Sub2_2 = new Class14_Sub4_Sub2(5000);

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZIZZI)V")
	public static void method1950(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static97.method2212(0, arg1, arg3, arg0, Static337.aClass6_Sub1Array1.length - 1, arg2);
		Static174.aClass14_Sub30_1 = null;
		Static182.anInt3784 = 0;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BII)V")
	public static void method1951(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class25 local10 = new Class25(16);
		for (@Pc(20) Class14_Sub39 local20 = (Class14_Sub39) Static65.aClass25_32.method697(); local20 != null; local20 = (Class14_Sub39) Static65.aClass25_32.method694()) {
			local20.method5986();
			@Pc(33) int local33 = (int) (local20.aLong217 >> 28);
			@Pc(44) int local44 = (int) (local20.aLong217 >> 14 & 0x3FFFL) - arg1;
			@Pc(53) int local53 = (int) (local20.aLong217 & 0x3FFFL) - arg0;
			if (local53 >= 0 && local44 >= 0 && Static195.anInt3965 > local53 && local44 < Static298.anInt5716) {
				local10.method687((long) (local53 | local44 << 14 | local33 << 28), local20);
			}
		}
		Static65.aClass25_32 = local10;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIBIII)V")
	public static void method1952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class146 local8 = Static70.method1717(arg1, arg3);
		if (local8 != null && local8.anObjectArray25 != null) {
			@Pc(21) Class14_Sub15 local21 = new Class14_Sub15();
			local21.anObjectArray3 = local8.anObjectArray25;
			local21.aClass146_22 = local8;
			Static10.method223(local21);
		}
		Static103.anInt2305 = arg4;
		Static88.anInt2109 = arg1;
		Static188.anInt3867 = arg3;
		Static288.anInt5579 = arg0;
		Static5.anInt4503 = arg2;
		Static184.aBoolean241 = true;
		Static295.anInt5666 = arg5;
		Static166.method3295(local8);
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
	public static void method1954() {
		Static57.method1296();
		for (@Pc(6) int local6 = 0; local6 < 4; local6++) {
			Static75.aClass65Array1[local6].method2134();
		}
		Static255.method4392();
		Static244.method4283();
		System.gc();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIZ)V")
	public static void method1956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static273.anInt5198 = arg1 - Static241.anInt5684;
		Static195.anInt3964 = arg0 - Static241.anInt5683;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIILclient!e;Lclient!ne;IILclient!q;I)V")
	public static void method1958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class46 arg2, @OriginalArg(4) Class146 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class156 arg6, @OriginalArg(8) int arg7) {
		@Pc(13) Class52 local13 = Static247.method4306(arg7);
		if (local13 == null || !local13.aBoolean110 || !local13.method1767()) {
			return;
		}
		@Pc(32) int local32;
		if (local13.anIntArray128 != null) {
			@Pc(30) int[] local30 = new int[local13.anIntArray128.length];
			@Pc(44) int local44;
			for (local32 = 0; local32 < local30.length / 2; local32++) {
				if (Static205.anInt4115 == 4) {
					local44 = (int) Static94.aFloat42 & 0x3FFF;
				} else {
					local44 = Static8.anInt205 + (int) Static94.aFloat42 & 0x3FFF;
				}
				@Pc(57) int local57 = Class14_Sub3_Sub34.anIntArray547[local44];
				@Pc(61) int local61 = Class14_Sub3_Sub34.anIntArray546[local44];
				if (Static205.anInt4115 != 4) {
					local61 = local61 * 256 / (Static309.anInt5886 + 256);
					local57 = local57 * 256 / (Static309.anInt5886 + 256);
				}
				local30[local32 * 2] = (local61 * (local13.anIntArray128[local32 * 2] * 4 + arg0) + (arg4 + local13.anIntArray128[local32 * 2 + 1] * 4) * local57 >> 15) + arg3.anInt4133 / 2 + arg1;
				local30[local32 * 2 + 1] = arg3.anInt4199 / 2 + arg5 - (local61 * (local13.anIntArray128[local32 * 2 + 1] * 4 + arg4) - (local13.anIntArray128[local32 * 2] * 4 + arg0) * local57 >> 15);
			}
			Static172.method3350(arg2, local30, local13.anInt1754, arg3.anIntArray358, arg3.anIntArray359);
			for (local44 = 0; local44 < local30.length / 2 - 1; local44++) {
				arg2.method5179(local30[local44 * 2], local30[local44 * 2 + 1], local30[local44 * 2 + 2], local30[local44 * 2 + 3], local13.anInt1737, arg6, arg1, arg5);
			}
			arg2.method5179(local30[local30.length - 2], local30[local30.length - 1], local30[0], local30[1], local13.anInt1737, arg6, arg1, arg5);
		}
		@Pc(261) Class2 local261 = null;
		if (local13.anInt1743 != -1) {
			local261 = local13.method1772(arg2, false);
			if (local261 != null) {
				Static317.method5477(arg5, arg0, arg1, arg6, arg3, local261, arg4);
			}
		}
		if (local13.aString65 == null) {
			return;
		}
		local32 = 0;
		if (local261 != null) {
			local32 = local261.method2640();
		}
		@Pc(295) Class30 local295 = Static170.aClass30_6;
		@Pc(297) Class76 local297 = Static205.aClass76_6;
		if (local13.anInt1751 == 1) {
			local295 = Static245.aClass30_7;
			local297 = Static108.aClass76_5;
		}
		if (local13.anInt1751 == 2) {
			local297 = Static223.aClass76_9;
			local295 = Static164.aClass30_5;
		}
		Static50.method1217(arg3, arg1, arg0, arg4, local13.aString65, local32, arg5, arg6, local297, local13.anInt1735, local295);
		return;
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V")
	public static void method1959() {
		Static327.aString235 = "Verbindung zum Update-Server hergestellt.";
		Static260.aString187 = " zuerst von deiner Ignorieren-Liste!";
		Static312.aString226 = "Standardeinstellungen geladen";
		Static84.aString78 = "Ladevorgang - bitte warte.";
		Static325.aString231 = "Wähl eine Option";
		Static239.aString234 = "Spieler kann nicht gefunden werden: ";
		Static197.aString139 = "Hierhin drehen";
		Static57.aString55 = "blinken1:";
		Static325.aString232 = "Spielwelt erstellt.";
		Static237.aString174 = " loggt sich aus.";
		Static140.aString108 = "Schriftsätze geladen.";
		Static286.aString205 = "Bitte entferne ";
		Static7.aString5 = "Weiter";
		Static77.aString67 = "lila:";
		Static224.aString164 = "gelb:";
		Static223.aString217 = "Starte 3D-Softwarebibliothek.";
		Static233.aString171 = "weiss:";
		Static51.aString52 = "Lade Texturen - ";
		Static322.aString229 = " steht bereits auf deiner Freunde-Liste!";
		Static304.aString218 = "Abbrechen";
		Static165.aString191 = "Fallen lassen";
		Static295.aString209 = "blinken2:";
		Static345.aString245 = "Lade Wordpack - ";
		Static140.aString107 = "Benutzeroberfläche geladen.";
		Static47.aString48 = "Lade Titelbild - ";
		Static28.aString26 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
		Static93.aString81 = "Kampfstufe: ";
		Static263.aString189 = "Ablegen";
		Static39.aString39 = "Nehmen";
		Static134.aString102 = " loggt sich ein.";
		Static279.aString199 = "M";
		Static39.aString40 = "Auswählen";
		Static141.aString109 = "Eingabeprozedur geladen.";
		Static243.aString176 = "Liste der Welten geladen";
		Static243.aString177 = "Zugewiesener Speicher.";
		Static151.aString117 = "leuchten2:";
		Static85.aString79 = "leuchten3:";
		Static325.aString233 = "welle:";
		Static183.aString133 = "Lade...";
		Static31.aString29 = "Lade Konfiguration - ";
		Static2.aString1 = "Benutzen";
		Static250.aString182 = "Lade Sprites - ";
		Static216.aString153 = "grün:";
		Static46.aString47 = "Gegenstand für Mitglieder";
		Static8.aString6 = "T";
		Static340.aString241 = "blinken3:";
		Static15.aString227 = "Sprites geladen.";
		Static17.aString20 = "Okay";
		Static340.aString240 = "Wordpack geladen.";
		Static38.aString36 = "Lade Schriftsätze - ";
		Static115.aString95 = "Titelbild geladen.";
		Static349.aString249 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
		Static171.aString125 = "Schließen";
		Static148.aString115 = "Stufe: ";
		Static301.aString216 = "Lade Benutzeroberfläche - ";
		Static137.aString104 = "Konfig geladen.";
		Static74.aString200 = "schütteln:";
		Static161.aString122 = "Angreifen";
		Static296.aString210 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
		Static89.aString80 = "Verbindung abgebrochen.";
		Static78.aString74 = "leuchten1:";
		Static284.aString202 = "scrollen:";
		Static8.aString7 = "welle2:";
		Static274.aString197 = "Titelbild geöffnet.";
		Static59.aString57 = "M";
		Static47.aString49 = "Verbindung mit Update-Server...";
		Static235.aString173 = "Bitte entferne ";
		Static24.aString24 = "Suche nach Updates - ";
		Static173.aString127 = "Versteckt";
		Static347.aString247 = "Lade Liste der Welten";
		Static355.aString253 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
		Static144.aString111 = "Untersuchen";
		Static47.aString50 = " zuerst von deiner Freunde-Liste!";
		Static259.aString186 = "Bitte warte...";
		Static254.aString184 = "Musik-Engine vorbereitet.";
		Static339.aString92 = "blaugrün:";
		Static192.aString136 = " steht bereits auf deiner Ignorieren-Liste!";
		Static249.aString181 = "Fertigkeit: ";
		Static30.aString27 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
		Static56.aString54 = "Update-Liste geladen.";
		Static104.aString86 = "Hierhin gehen";
		Static347.aString248 = "Lade Standardeinstellungen - ";
		Static96.aString82 = "gleiten:";
		Static116.aString96 = "T";
		Static227.aString165 = "Speicher wird zugewiesen.";
		Static291.aString208 = " weitere Optionen";
		Static206.aString252 = "Client-Variablen geladen";
		Static352.aString250 = "Texturen geladen.";
		Static180.aString130 = "3D-Softwarebibliothek gestartet.";
		Static265.aString190 = ": ";
		Static173.aString126 = "RuneScape wird geladen - bitte warten...";
		Static355.aString254 = "Mechscape wird geladen - bitte warten...";
		Static272.aString194 = "rot:";
	}
}
