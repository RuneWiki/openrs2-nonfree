import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "[I")
	public static int[] anIntArray445;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
	public static int anInt5023 = 3353893;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "[I")
	public static int[] anIntArray444 = new int[2048];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIILclient!bh;II)V")
	public static void method3924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub8 arg3, @OriginalArg(5) int arg4) {
		if (arg3.anInt364 == -1 && arg3.anIntArray43 == null) {
			return;
		}
		@Pc(20) int local20 = 0;
		if (arg3.anInt356 < arg2) {
			local20 = arg2 - arg3.anInt356;
		} else if (arg2 < arg3.anInt359) {
			local20 = arg3.anInt359 - arg2;
		}
		@Pc(57) int local57 = arg3.anInt362 * Static119.anInt2761 >> 8;
		if (arg3.anInt363 < arg0) {
			local20 += arg0 - arg3.anInt363;
		} else if (arg0 < arg3.anInt358) {
			local20 += arg3.anInt358 - arg0;
		}
		if (arg3.anInt365 == 0 || arg3.anInt365 < local20 - 64 || Static119.anInt2761 == 0 || arg4 != arg3.anInt361) {
			if (arg3.aClass1_Sub5_Sub1_1 != null) {
				Static141.aClass1_Sub5_Sub4_1.method4380(arg3.aClass1_Sub5_Sub1_1);
				arg3.aClass1_Sub5_Sub1_1 = null;
			}
			if (arg3.aClass1_Sub5_Sub1_2 != null) {
				Static141.aClass1_Sub5_Sub4_1.method4380(arg3.aClass1_Sub5_Sub1_2);
				arg3.aClass1_Sub5_Sub1_2 = null;
			}
			return;
		}
		local20 -= 64;
		if (local20 < 0) {
			local20 = 0;
		}
		@Pc(152) int local152 = local57 * (arg3.anInt365 - local20) / arg3.anInt365;
		if (arg3.aClass1_Sub5_Sub1_1 != null) {
			arg3.aClass1_Sub5_Sub1_1.method1147(local152);
		} else if (arg3.anInt364 >= 0) {
			@Pc(174) Class169 local174 = Static310.method4228(Static68.aClass91_56, arg3.anInt364, 0);
			if (local174 != null) {
				@Pc(183) Class1_Sub10_Sub1 local183 = local174.method4229().method546(Static20.aClass143_1);
				@Pc(188) Class1_Sub5_Sub1 local188 = Static301.method1163(local183, local152);
				local188.method1182(-1);
				Static141.aClass1_Sub5_Sub4_1.method4376(local188);
				arg3.aClass1_Sub5_Sub1_1 = local188;
			}
		}
		if (arg3.aClass1_Sub5_Sub1_2 != null) {
			arg3.aClass1_Sub5_Sub1_2.method1147(local152);
			if (!arg3.aClass1_Sub5_Sub1_2.method4439()) {
				arg3.aClass1_Sub5_Sub1_2 = null;
			}
		} else if (arg3.anIntArray43 != null && (arg3.anInt349 -= arg1) <= 0) {
			@Pc(236) int local236 = (int) ((double) arg3.anIntArray43.length * Math.random());
			@Pc(244) Class169 local244 = Static310.method4228(Static68.aClass91_56, arg3.anIntArray43[local236], 0);
			if (local244 != null) {
				@Pc(251) Class1_Sub10_Sub1 local251 = local244.method4229().method546(Static20.aClass143_1);
				@Pc(256) Class1_Sub5_Sub1 local256 = Static301.method1163(local251, local152);
				local256.method1182(0);
				Static141.aClass1_Sub5_Sub4_1.method4376(local256);
				arg3.anInt349 = arg3.anInt350 + (int) ((double) (arg3.anInt353 - arg3.anInt350) * Math.random());
				arg3.aClass1_Sub5_Sub1_2 = local256;
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)V")
	public static void method3925(@OriginalArg(1) int arg0) {
		Static64.anInt1375 = arg0;
		Static219.method3466(3);
		Static219.method3466(4);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	public static void method3926() {
		Static247.aString288 = "Verbindung mit Update-Server...";
		Static1.aString253 = "T";
		Static111.aString148 = "Schließen";
		Static265.aString304 = "Texturen geladen.";
		Static212.aString250 = "blaugrün:";
		Static56.aString71 = "Speicher wird zugewiesen.";
		Static211.aString245 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
		Static60.aString74 = "Zugewiesener Speicher.";
		Static143.aString180 = "Bitte warte...";
		Static186.aString229 = "Ladevorgang - bitte warte.";
		Static123.aString162 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
		Static169.aString211 = " loggt sich ein.";
		Static222.aString262 = "weiss:";
		Static102.aString139 = "möchte mit dir handeln.";
		Static77.aString98 = "Nehmen";
		Static279.aString314 = "leuchten1:";
		Static52.aString68 = "blinken1:";
		Static203.aString243 = "Titelbild geöffnet.";
		Static31.aString42 = "Starte 3D-Softwarebibliothek.";
		Static255.aString297 = " zuerst von deiner Freunde-Liste!";
		Static95.aString127 = "Lade Sprites - ";
		Static218.aString258 = "Liste der Welten geladen";
		Static151.aString334 = "Spielwelt erstellt.";
		Static212.aString249 = "gleiten:";
		Static205.aString244 = "Titelbild geladen.";
		Static100.aString135 = "Gegenstand für Mitglieder";
		Static239.aString275 = "Wordpack geladen.";
		Static87.aString112 = "Verbindung abgebrochen.";
		Static20.aString30 = "Auswählen";
		Static170.aString212 = "leuchten3:";
		Static273.aString309 = "Lade...";
		Static101.aString138 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
		Static7.aString129 = "Bitte entferne ";
		Static185.aString226 = "Wähl eine Option";
		Static143.aString179 = "Lade Konfiguration - ";
		Static64.aString81 = " steht bereits auf deiner Freunde-Liste!";
		Static26.aString38 = "Eingabeprozedur geladen.";
		Static36.aString49 = "Weiter";
		Static176.aString219 = "Untersuchen";
		Static181.aString224 = "Lade Benutzeroberfläche - ";
		Static35.aString104 = "Spieler kann nicht gefunden werden: ";
		Static72.aString88 = "blinken3:";
		Static166.aString209 = "Versteckt";
		Static99.aString132 = "Schriftsätze geladen.";
		Static87.aString113 = "lila:";
		Static47.aString65 = "RuneScape wird geladen - bitte warten...";
		Static133.aString169 = "Okay";
		Static38.aString56 = "Standardinstellungen geladen";
		Static105.aString142 = " steht bereits auf deiner Ignorieren-Liste!";
		Static59.aString234 = " weitere Optionen";
		Static59.aString235 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
		Static25.aString37 = "Stufe: ";
		Static162.aString200 = "T";
		Static131.aString167 = "Lade Titelbild - ";
		Static283.aString315 = "M";
		Static190.aString232 = " zuerst von deiner Ignorieren-Liste!";
		Static163.aString203 = "Benutzen";
		Static76.aString93 = "Verbindung zum Update-Server hergestellt.";
		Static274.aString311 = "Lade Wordpack - ";
		Static107.aString145 = "rot:";
		Static45.aString63 = "Lade Schriftsätze - ";
		Static166.aString208 = "Lade Standardeinstellungen - ";
		Static133.aString168 = "3D-Softwarebibliothek gestartet.";
		Static140.aString175 = "gelb:";
		Static13.aString21 = "Hierhin gehen";
		Static249.aString291 = "Benutzeroberfläche geladen.";
		Static21.aString31 = "blinken2:";
		Static126.aString115 = "Sprites geladen.";
		Static141.aString177 = "Angreifen";
		Static211.aString246 = "Konfig geladen.";
		Static9.aString17 = ": ";
		Static289.aString330 = "Hierhin drehen";
		Static246.aString286 = "Fertigkeit: ";
		Static75.aString92 = "M";
		Static241.aString277 = "welle:";
		Static134.aString170 = " loggt sich aus.";
		Static14.aString23 = "Ablegen";
		Static194.aString236 = "Update-Liste geladen.";
		Static83.aString105 = "welle2:";
		Static146.aString185 = "Kampfstufe: ";
		Static140.aString176 = "Abbrechen";
		Static176.aString220 = "leuchten2:";
		Static183.aString265 = "Fallen lassen";
		Static104.aString141 = "Suche nach Updates - ";
		Static162.aString198 = "schütteln:";
		Static47.aString64 = "Bitte entferne ";
		Static66.aString82 = "grün:";
		Static190.aString233 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
		Static272.aString307 = "Lade Texturen - ";
		Static147.aString186 = "scrollen:";
		Static241.aString278 = "Lade Liste der Welten";
		Static79.aString101 = "Musik-Engine vorbereitet.";
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIB)V")
	public static void method3928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static68.anInt1455 = arg0;
		Static91.anInt2044 = arg3;
		Static163.anInt3498 = arg2;
		Static104.anInt2460 = arg4;
		Static156.anInt1435 = arg1;
	}
}
