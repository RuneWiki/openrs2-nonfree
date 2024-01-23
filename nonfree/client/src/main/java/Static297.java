import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "[I")
	public static int[] anIntArray220;

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "Lclient!df;")
	public static Class33 aClass33_3 = new Class33(16);

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IB)Lclient!tk;")
	public static Class173 method1843(@OriginalArg(0) int arg0) {
		@Pc(10) Class173 local10 = (Class173) Static155.aClass98_22.method2570((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(30) byte[] local30 = Static90.aClass155_39.method4121(Static73.method1109(arg0), Static289.method4751(arg0));
		local10 = new Class173();
		local10.anInt5484 = arg0;
		if (local30 != null) {
			local10.method4449(new Class3_Sub26(local30));
		}
		Static155.aClass98_22.method2568(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
	public static void method1844() {
		Static75.aString58 = "Hierhin gehen";
		Static247.aString175 = "blaugrün:";
		Static183.aString130 = "Hierhin drehen";
		Static111.aString84 = "Lade Sprites - ";
		Static131.aString92 = "schütteln:";
		Static216.aString149 = "Benutzeroberfläche geladen.";
		Static167.aString113 = "Ladevorgang - bitte warte.";
		Static274.aString207 = "Bitte entferne ";
		Static113.aString85 = "Gegenstand für Mitglieder";
		Static88.aString69 = "M";
		Static60.aString27 = "Musik-Engine vorbereitet.";
		Static47.aString226 = "Lade Standardeinstellungen - ";
		Static267.aString197 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
		Static70.aString55 = "Lade Texturen - ";
		Static305.aString229 = "T";
		Static268.aString199 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
		Static288.aString218 = " loggt sich aus.";
		Static149.aString103 = "Benutzen";
		Static288.aString219 = "Update-Liste geladen.";
		Static108.aString79 = "Angreifen";
		Static107.aString78 = "Standardeinstellungen geladen";
		Static34.aString23 = "Ablegen";
		Static280.aString148 = "T";
		Static3.aString3 = "Stufe: ";
		Static88.aString68 = "3D-Softwarebibliothek gestartet.";
		Static85.aString62 = "Bitte entferne ";
		Static117.aString88 = "Wordpack geladen.";
		Static255.aString185 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
		Static144.aString170 = "Weiter";
		Static167.aString112 = "rot:";
		Static252.aString182 = "welle:";
		Static29.aString19 = "Verbindung zum Update-Server hergestellt.";
		Static136.aString97 = "Fertigkeit: ";
		Static158.aString108 = " zuerst von deiner Freunde-Liste!";
		Static183.aString128 = "blinken1:";
		Static165.aString110 = "Okay";
		Static266.aString195 = "Speicher wird zugewiesen.";
		Static256.aString189 = "gleiten:";
		Static315.aString233 = " loggt sich ein.";
		Static256.aString188 = "Titelbild geladen.";
		Static32.aString21 = "Zugewiesener Speicher.";
		Static208.aString143 = "Liste der Welten geladen";
		Static104.aString77 = " steht bereits auf deiner Freunde-Liste!";
		Static84.aString60 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
		Static173.aString116 = "Konfig geladen.";
		Static28.aString17 = "Versteckt";
		Static38.aString24 = "Lade Konfiguration - ";
		Static52.aString39 = "Auswählen";
		Static25.aString13 = "Spieler kann nicht gefunden werden: ";
		Static304.aString228 = "Nehmen";
		Static32.aString22 = "leuchten1:";
		Static148.aString102 = "Kampfstufe: ";
		Static255.aString186 = "Abbrechen";
		Static137.aString98 = " steht bereits auf deiner Ignorieren-Liste!";
		Static267.aString196 = "Wähl eine Option";
		Static176.aString117 = "blinken2:";
		Static246.aString174 = "RuneScape wird geladen - bitte warten...";
		Static58.aString45 = "leuchten2:";
		Static22.aString12 = "Starte 3D-Softwarebibliothek.";
		Static111.aString82 = "scrollen:";
		Static300.aString225 = "M";
		Static274.aString206 = "welle2:";
		Static60.aString28 = " zuerst von deiner Ignorieren-Liste!";
		Static11.aString179 = "Suche nach Updates - ";
		Static179.aString119 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
		Static3.aString2 = "gelb:";
		Static181.aString126 = "Untersuchen";
		Static253.aString184 = "Fallen lassen";
		Static177.aString118 = "blinken3:";
		Static132.aString94 = "Lade Liste der Welten";
		Static204.aString140 = "Schriftsätze geladen.";
		Static220.aString180 = " weitere Optionen";
		Static265.aString201 = "Verbindung mit Update-Server...";
		Static3.aString1 = ": ";
		Static198.aString136 = "lila:";
		Static61.aString47 = "grün:";
		Static264.aString191 = "weiss:";
		Static252.aString181 = "Eingabeprozedur geladen.";
		Static43.aString31 = "Titelbild geöffnet.";
		Static179.aString120 = "Verbindung abgebrochen.";
		Static118.aString89 = "Lade Titelbild - ";
		Static171.aString115 = "Lade...";
		Static42.aString29 = "Spielwelt erstellt.";
		Static222.aString155 = "Lade Benutzeroberfläche - ";
		Static11.aString178 = "Schließen";
		Static90.aString70 = "Texturen geladen.";
		Static195.aString134 = "leuchten3:";
		Static64.aString53 = "Lade Schriftsätze - ";
		Static100.aString75 = "Mechscape wird geladen - bitte warten...";
		Static50.aString36 = "Bitte warte...";
		Static233.aString162 = "Sprites geladen.";
		Static4.aString142 = "Lade Wordpack - ";
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)V")
	public static void method1845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static215.aClass3_Sub26_Sub1_2.method3958(253);
		Static215.aClass3_Sub26_Sub1_2.method3949(arg0);
		Static215.aClass3_Sub26_Sub1_2.method3897(arg1);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIII)V")
	public static void method1847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static111.anInt2039 < arg3 || arg4 < Static245.anInt6027) {
			return;
		}
		@Pc(32) boolean local32;
		if (arg1 < Static175.anInt3267) {
			arg1 = Static175.anInt3267;
			local32 = false;
		} else if (Static204.anInt4020 < arg1) {
			local32 = false;
			arg1 = Static204.anInt4020;
		} else {
			local32 = true;
		}
		@Pc(58) boolean local58;
		if (Static175.anInt3267 > arg2) {
			local58 = false;
			arg2 = Static175.anInt3267;
		} else if (Static204.anInt4020 < arg2) {
			arg2 = Static204.anInt4020;
			local58 = false;
		} else {
			local58 = true;
		}
		if (arg3 >= Static245.anInt6027) {
			Static235.method3988(arg0, Static129.anIntArrayArray40[arg3++], arg2, arg1);
		} else {
			arg3 = Static245.anInt6027;
		}
		if (arg4 <= Static111.anInt2039) {
			Static235.method3988(arg0, Static129.anIntArrayArray40[arg4--], arg2, arg1);
		} else {
			arg4 = Static111.anInt2039;
		}
		@Pc(112) int local112;
		if (local32 && local58) {
			for (local112 = arg3; local112 <= arg4; local112++) {
				@Pc(154) int[] local154 = Static129.anIntArrayArray40[local112];
				local154[arg1] = local154[arg2] = arg0;
			}
		} else if (local32) {
			for (local112 = arg3; local112 <= arg4; local112++) {
				Static129.anIntArrayArray40[local112][arg1] = arg0;
			}
		} else if (local58) {
			for (local112 = arg3; local112 <= arg4; local112++) {
				Static129.anIntArrayArray40[local112][arg2] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!rn;Lclient!rn;ILclient!rn;)V")
	public static void method1850(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(3) Class155 arg2) {
		Static267.aClass155_112 = arg0;
		Static201.aClass155_85 = arg2;
		Static195.aClass155_81 = arg1;
	}
}
