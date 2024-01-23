import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!be", name = "H", descriptor = "Z")
	public static boolean aBoolean35;

	@OriginalMember(owner = "client!be", name = "I", descriptor = "Lclient!pk;")
	public static Class132 aClass132_6;

	@OriginalMember(owner = "client!be", name = "w", descriptor = "I")
	public static int anInt537 = 0;

	@OriginalMember(owner = "client!be", name = "A", descriptor = "[I")
	public static int[] anIntArray38 = new int[1000];

	@OriginalMember(owner = "client!be", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString18 = "";

	@OriginalMember(owner = "client!be", name = "K", descriptor = "I")
	public static int anInt543 = 0;

	@OriginalMember(owner = "client!be", name = "P", descriptor = "[I")
	public static int[] anIntArray40 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!be", name = "Q", descriptor = "Z")
	public static boolean aBoolean36 = false;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V")
	public static void method357(@OriginalArg(1) int arg0) {
		method368();
		Static153.method2451();
		@Pc(12) int local12 = Static92.method1480(arg0).anInt1953;
		if (local12 == 0) {
			return;
		}
		@Pc(24) int local24 = Static8.anIntArray495[arg0];
		if (local12 == 9) {
			Static258.anInt5182 = local24;
		}
		if (local12 == 6) {
			Static178.anInt3503 = local24;
		}
		if (local12 == 5) {
			Static236.anInt4770 = local24;
		}
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V")
	public static void method361() {
		Static144.aString101 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
		Static187.aString132 = "Spieler kann nicht gefunden werden: ";
		Static58.aString83 = "Ladevorgang - bitte warte.";
		Static115.aString87 = "Stufe: ";
		Static65.aString193 = "leuchten1:";
		Static86.aString69 = "Abbrechen";
		Static9.aString8 = "blinken1:";
		Static111.aString85 = " zuerst von deiner Ignorieren-Liste!";
		Static157.aString201 = "Musik-Engine vorbereitet.";
		Static50.aString43 = "Angreifen";
		Static201.aString147 = "grün:";
		Static185.aString128 = " zuerst von deiner Freunde-Liste!";
		Static9.aString9 = "Verbindung zum Update-Server hergestellt.";
		Static225.aString163 = "Bitte entferne ";
		Static241.aString167 = "blinken3:";
		Static12.aString14 = "3D-Softwarebibliothek gestartet.";
		Static10.aString12 = "blaugrün:";
		Static246.aString172 = "Verbindung mit Update-Server...";
		Static255.aString176 = "Benutzen";
		Static104.aString80 = "Starte 3D-Softwarebibliothek.";
		Static222.aString161 = "leuchten2:";
		Static37.aString140 = "Auswählen";
		Static167.aString115 = "Spielwelt erstellt.";
		Static178.aString122 = "blinken2:";
		Static187.aString131 = "Untersuchen";
		Static206.aString151 = "RuneScape wird geladen - bitte warten...";
		Static285.aString194 = "Hierhin gehen";
		Static161.aString107 = "Speicher wird zugewiesen.";
		Static183.aString127 = "Wähl eine Option";
		Static290.aString197 = "Wordpack geladen.";
		Static162.aString113 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
		Static295.aString130 = "Bitte entferne ";
		Static3.aString170 = "Schriftsätze geladen.";
		Static75.aString63 = ": ";
		Static210.aString159 = " loggt sich aus.";
		Static91.aString73 = " steht bereits auf deiner Ignorieren-Liste!";
		Static94.aString75 = "Liste der Welten geladen";
		Static258.aString181 = "Ablegen";
		Static255.aString175 = "Lade Konfiguration - ";
		Static91.aString74 = "T";
		Static216.aString156 = "gleiten:";
		Static39.aString37 = "Gegenstand für Mitglieder";
		Static244.aString169 = "Konfig geladen.";
		Static128.aString96 = "Titelbild geöffnet.";
		Static269.aString174 = "Schließen";
		Static132.aString98 = " weitere Optionen";
		Static203.aString148 = "Weiter";
		Static236.aString166 = "Lade Schriftsätze - ";
		Static198.aString141 = "Fertigkeit: ";
		Static104.aString82 = "Sprites geladen.";
		Static102.aString79 = "Texturen geladen.";
		Static13.aString17 = "welle2:";
		Static182.aString126 = "Eingabeprozedur geladen.";
		Static24.aString21 = "Suche nach Updates - ";
		Static189.aString135 = "welle:";
		Static211.aString153 = "rot:";
		Static9.aString10 = "Versteckt";
		Static128.aString97 = "Update-Liste geladen.";
		Static85.aString68 = "Bitte warte...";
		Static266.aString189 = "lila:";
		Static12.aString15 = "Lade Benutzeroberfläche - ";
		Static191.aString137 = "Titelbild geladen.";
		Static101.aString78 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
		Static48.aString40 = "Hierhin drehen";
		Static77.aString64 = "Okay";
		Static89.aString70 = "Lade Texturen - ";
		Static289.aString196 = "Lade Wordpack - ";
		Static204.aString149 = "Verbindung abgebrochen.";
		Static188.aString133 = "Lade...";
		Static97.aString76 = "scrollen:";
		Static70.aString59 = "Fallen lassen";
		Static13.aString16 = "schütteln:";
		Static10.aString11 = "M";
		Static4.aString7 = "Zugewiesener Speicher.";
		Static28.aString29 = "Nehmen";
		Static273.aString192 = "weiss:";
		Static258.aString180 = "Benutzeroberfläche geladen.";
		Static169.aString117 = "T";
		Static40.aString38 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
		Static261.aString187 = "leuchten3:";
		Static63.aString56 = "Standardinstellungen geladen";
		Static113.aString86 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
		Static139.aString99 = "gelb:";
		Static169.aString118 = "M";
		Static104.aString81 = "Lade Liste der Welten";
		Static52.aString44 = " steht bereits auf deiner Freunde-Liste!";
		Static290.aString198 = "Lade Standardeinstellungen - ";
		Static232.aString164 = "Lade Titelbild - ";
		Static216.aString157 = " loggt sich ein.";
		Static191.aString139 = "Lade Sprites - ";
		Static172.aString120 = "Kampfstufe: ";
		Static156.aString106 = "möchte mit dir handeln.";
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(III)I")
	public static int method362(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(38) int local38 = Static92.method1482(arg0 - 1, arg1 + -1) + Static92.method1482(arg0 - 1, arg1 + 1) + Static92.method1482(arg0 + 1, arg1 + -1) + Static92.method1482(arg0 + 1, arg1 + 1);
		@Pc(73) int local73 = Static92.method1482(arg0, arg1 - 1) + Static92.method1482(arg0, arg1 + 1) + Static92.method1482(arg0 - 1, arg1) + Static92.method1482(arg0 + 1, arg1);
		@Pc(80) int local80 = Static92.method1482(arg0, arg1);
		return local80 / 4 + local73 / 8 + local38 / 16;
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V")
	public static void method363() {
		if (Static26.aString28.toLowerCase().indexOf("microsoft") != -1) {
			Static49.anIntArray75[219] = 42;
			Static49.anIntArray75[186] = 57;
			Static49.anIntArray75[223] = 28;
			Static49.anIntArray75[189] = 26;
			Static49.anIntArray75[190] = 72;
			Static49.anIntArray75[191] = 73;
			Static49.anIntArray75[192] = 58;
			Static49.anIntArray75[188] = 71;
			Static49.anIntArray75[187] = 27;
			Static49.anIntArray75[222] = 59;
			Static49.anIntArray75[221] = 43;
			Static49.anIntArray75[220] = 74;
			return;
		}
		Static49.anIntArray75[91] = 42;
		Static49.anIntArray75[93] = 43;
		Static49.anIntArray75[46] = 72;
		Static49.anIntArray75[92] = 74;
		Static49.anIntArray75[45] = 26;
		Static49.anIntArray75[47] = 73;
		if (Static26.aMethod2 == null) {
			Static49.anIntArray75[222] = 59;
			Static49.anIntArray75[192] = 58;
		} else {
			Static49.anIntArray75[192] = 28;
			Static49.anIntArray75[520] = 59;
			Static49.anIntArray75[222] = 58;
		}
		Static49.anIntArray75[59] = 57;
		Static49.anIntArray75[44] = 71;
		Static49.anIntArray75[61] = 27;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIZ)V")
	public static void method364(@OriginalArg(3) int arg0, @OriginalArg(4) boolean arg1) {
		Static24.anInt639 = 104;
		Static27.anInt665 = 104;
		Static260.anInt5236 = arg0;
		Static188.aClass8_Sub27ArrayArrayArray2 = new Class8_Sub27[4][Static24.anInt639][Static27.anInt665];
		Static87.anIntArrayArrayArray5 = new int[4][Static24.anInt639 + 1][Static27.anInt665 + 1];
		if (Static116.aBoolean188) {
			Static69.aClass8_Sub29ArrayArray3 = new Class8_Sub29[4][];
		}
		if (arg1) {
			Static228.aClass8_Sub27ArrayArrayArray3 = new Class8_Sub27[1][Static24.anInt639][Static27.anInt665];
			Static176.anIntArrayArray18 = new int[Static24.anInt639][Static27.anInt665];
			Static222.anIntArrayArrayArray10 = new int[1][Static24.anInt639 + 1][Static27.anInt665 + 1];
			if (Static116.aBoolean188) {
				Static37.aClass8_Sub29ArrayArray5 = new Class8_Sub29[1][];
			}
		} else {
			Static228.aClass8_Sub27ArrayArrayArray3 = null;
			Static176.anIntArrayArray18 = null;
			Static222.anIntArrayArrayArray10 = null;
			Static37.aClass8_Sub29ArrayArray5 = null;
		}
		Static174.method2689(false);
		Static236.aClass50Array2 = new Class50[500];
		Static153.anInt3126 = 0;
		Static201.aClass50Array1 = new Class50[500];
		Static206.anInt4273 = 0;
		Static249.anIntArrayArrayArray14 = new int[4][Static24.anInt639 + 1][Static27.anInt665 + 1];
		Static174.aClass170Array1 = new Class170[5000];
		Static295.anInt3736 = 0;
		Static197.aClass170Array2 = new Class170[100];
		Static41.aBooleanArrayArray2 = new boolean[Static260.anInt5236 + Static260.anInt5236 + 1][Static260.anInt5236 + Static260.anInt5236 + 1];
		Static51.aBooleanArrayArray4 = new boolean[Static260.anInt5236 + Static260.anInt5236 + 2][Static260.anInt5236 + Static260.anInt5236 + 2];
		Static212.aByteArrayArrayArray12 = new byte[4][Static24.anInt639][Static27.anInt665];
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!tk;III)V")
	public static void method365(@OriginalArg(0) int arg0, @OriginalArg(1) Class159 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static16.method2745();
		if (Static116.aBoolean188) {
			Static126.method1993(arg2, arg0, arg1.anInt5123 + arg2, arg0 - -arg1.anInt5121);
		} else {
			Static103.method1680(arg2, arg0, arg2 + arg1.anInt5123, arg0 - -arg1.anInt5121);
		}
		if (Static242.anInt4842 != 2 && Static242.anInt4842 != 5 && Static212.aClass8_Sub1_Sub7_9 != null) {
			@Pc(84) int local84 = (int) Static82.aFloat20 + Static121.anInt2437 & 0x7FF;
			@Pc(93) int local93 = Static21.aClass36_Sub3_Sub1_1.anInt4117 / 32 + 48;
			@Pc(103) int local103 = 464 - Static21.aClass36_Sub3_Sub1_1.anInt4118 / 32;
			if (Static116.aBoolean188) {
				((Class8_Sub1_Sub7_Sub2) Static212.aClass8_Sub1_Sub7_9).method2817(arg2, arg0, arg1.anInt5123, arg1.anInt5121, local93, local103, local84, Static2.anInt12 + 256, (Class8_Sub1_Sub7_Sub2) arg1.method3892(false));
			} else {
				((Class8_Sub1_Sub7_Sub1) Static212.aClass8_Sub1_Sub7_9).method1640(arg2, arg0, arg1.anInt5123, arg1.anInt5121, local93, local103, local84, Static2.anInt12 + 256, arg1.anIntArray410, arg1.anIntArray409);
			}
			@Pc(182) int local182;
			@Pc(201) int local201;
			@Pc(205) int local205;
			@Pc(217) int local217;
			@Pc(247) int local247;
			@Pc(235) int local235;
			@Pc(272) int local272;
			@Pc(312) int local312;
			if (Static104.aClass130_1 != null) {
				for (@Pc(151) int local151 = 0; local151 < Static104.aClass130_1.anInt3917; local151++) {
					if (Static104.aClass130_1.method3050(local151)) {
						local182 = ((Static104.aClass130_1.anIntArray297[local151] >> 14 & 0x3FFF) - Static49.anInt1089) * 4 + 2 - Static21.aClass36_Sub3_Sub1_1.anInt4117 / 32;
						local201 = ((Static104.aClass130_1.anIntArray297[local151] & 0x3FFF) - Static130.anInt2601) * 4 + 2 - Static21.aClass36_Sub3_Sub1_1.anInt4118 / 32;
						local205 = Class68.anIntArray137[local84];
						@Pc(213) int local213 = local205 * 256 / (Static2.anInt12 + 256);
						local217 = Class68.anIntArray139[local84];
						@Pc(225) int local225 = local217 * 256 / (Static2.anInt12 + 256);
						local235 = local225 * local201 - local182 * local213 >> 16;
						@Pc(237) Class8_Sub1_Sub5 local237 = Static276.aClass8_Sub1_Sub5_4;
						local247 = local225 * local182 + local213 * local201 >> 16;
						if (Static104.aClass130_1.method3049(local151) == 1) {
							local237 = Static247.aClass8_Sub1_Sub5_5;
						}
						if (Static104.aClass130_1.method3049(local151) == 2) {
							local237 = Static229.aClass8_Sub1_Sub5_3;
						}
						local272 = local237.method2037(Static104.aClass130_1.aStringArray61[local151], 100);
						local247 -= local272 / 2;
						if (-arg1.anInt5123 <= local247 && arg1.anInt5123 >= local247 && -arg1.anInt5121 <= local235 && local235 <= arg1.anInt5121) {
							local312 = 16777215;
							if (Static104.aClass130_1.anIntArray298[local151] != -1) {
								local312 = Static104.aClass130_1.anIntArray298[local151];
							}
							if (Static116.aBoolean188) {
								Static126.method1995((Class8_Sub1_Sub7_Sub2) arg1.method3892(false));
							} else {
								Static103.method1681(arg1.anIntArray410, arg1.anIntArray409);
							}
							local237.method2035(Static104.aClass130_1.aStringArray61[local151], arg2 + local247 + arg1.anInt5123 / 2, -local235 + arg0 + arg1.anInt5121 / 2, local272, 50, local312, 0, 1, 0, 0);
							if (Static116.aBoolean188) {
								Static126.method1988();
							} else {
								Static103.method1667();
							}
						}
					}
				}
			}
			for (local182 = 0; local182 < Static78.anInt1695; local182++) {
				local201 = anIntArray38[local182] * 4 + 2 - Static21.aClass36_Sub3_Sub1_1.anInt4117 / 32;
				local205 = Static69.anIntArray105[local182] * 4 + 2 - Static21.aClass36_Sub3_Sub1_1.anInt4118 / 32;
				@Pc(422) Class70 local422 = Static235.method3578(Static95.anIntArray133[local182]);
				if (local422.anIntArray145 != null) {
					local422 = local422.method1575();
					if (local422 == null || local422.anInt2054 == -1) {
						continue;
					}
				}
				Static298.method258(local205, arg0, local201, Static277.aClass8_Sub1_Sub7Array121[local422.anInt2054], arg2, arg1);
			}
			for (local182 = 0; local182 < 104; local182++) {
				for (local201 = 0; local201 < 104; local201++) {
					@Pc(474) Class182 local474 = Static124.aClass182ArrayArrayArray1[Static34.anInt770][local182][local201];
					if (local474 != null) {
						local217 = local182 * 4 + 2 - Static21.aClass36_Sub3_Sub1_1.anInt4117 / 32;
						local247 = local201 * 4 + 2 - Static21.aClass36_Sub3_Sub1_1.anInt4118 / 32;
						Static298.method258(local247, arg0, local217, Static64.aClass8_Sub1_Sub7Array30[0], arg2, arg1);
					}
				}
			}
			for (local182 = 0; local182 < Static135.anInt2729; local182++) {
				@Pc(531) Class36_Sub3_Sub2 local531 = Static48.aClass36_Sub3_Sub2Array1[Static191.anIntArray285[local182]];
				if (local531 != null && local531.method3112()) {
					@Pc(541) Class173 local541 = local531.aClass173_1;
					if (local541 != null && local541.anIntArray491 != null) {
						local541 = local541.method4245();
					}
					if (local541 != null && local541.aBoolean474 && local541.aBoolean472) {
						local217 = local531.anInt4117 / 32 - Static21.aClass36_Sub3_Sub1_1.anInt4117 / 32;
						local247 = local531.anInt4118 / 32 - Static21.aClass36_Sub3_Sub1_1.anInt4118 / 32;
						if (local541.anInt5605 == -1) {
							Static298.method258(local247, arg0, local217, Static64.aClass8_Sub1_Sub7Array30[1], arg2, arg1);
						} else {
							Static298.method258(local247, arg0, local217, Static277.aClass8_Sub1_Sub7Array121[local541.anInt5605], arg2, arg1);
						}
					}
				}
			}
			for (local182 = 0; local182 < Static61.anInt1336; local182++) {
				@Pc(629) Class36_Sub3_Sub1 local629 = Static230.aClass36_Sub3_Sub1Array1[Static85.anIntArray123[local182]];
				if (local629 != null && local629.method3112()) {
					local205 = local629.anInt4117 / 32 - Static21.aClass36_Sub3_Sub1_1.anInt4117 / 32;
					local217 = local629.anInt4118 / 32 - Static21.aClass36_Sub3_Sub1_1.anInt4118 / 32;
					@Pc(660) boolean local660 = false;
					@Pc(665) long local665 = Static31.method513(local629.aString144);
					for (local272 = 0; local272 < Static173.anInt3444; local272++) {
						if (local665 == Static98.aLongArray7[local272] && Static63.anIntArray95[local272] != 0) {
							local660 = true;
							break;
						}
					}
					@Pc(701) boolean local701 = false;
					for (local312 = 0; local312 < Static146.anInt2901; local312++) {
						if (Static189.aClass8_Sub25Array1[local312].aLong203 == local665) {
							local701 = true;
							break;
						}
					}
					@Pc(723) boolean local723 = false;
					if (Static21.aClass36_Sub3_Sub1_1.anInt4047 != 0 && local629.anInt4047 != 0 && local629.anInt4047 == Static21.aClass36_Sub3_Sub1_1.anInt4047) {
						local723 = true;
					}
					if (local660) {
						Static298.method258(local217, arg0, local205, Static64.aClass8_Sub1_Sub7Array30[3], arg2, arg1);
					} else if (local701) {
						Static298.method258(local217, arg0, local205, Static64.aClass8_Sub1_Sub7Array30[5], arg2, arg1);
					} else if (local723) {
						Static298.method258(local217, arg0, local205, Static64.aClass8_Sub1_Sub7Array30[4], arg2, arg1);
					} else {
						Static298.method258(local217, arg0, local205, Static64.aClass8_Sub1_Sub7Array30[2], arg2, arg1);
					}
				}
			}
			@Pc(803) Class18[] local803 = Static245.aClass18Array1;
			for (local201 = 0; local201 < local803.length; local201++) {
				@Pc(813) Class18 local813 = local803[local201];
				if (local813 != null && local813.anInt668 != 0 && Static183.anInt3590 % 20 < 10) {
					if (local813.anInt668 == 1 && local813.anInt671 >= 0 && Static48.aClass36_Sub3_Sub2Array1.length > local813.anInt671) {
						@Pc(846) Class36_Sub3_Sub2 local846 = Static48.aClass36_Sub3_Sub2Array1[local813.anInt671];
						if (local846 != null) {
							local247 = local846.anInt4117 / 32 - Static21.aClass36_Sub3_Sub1_1.anInt4117 / 32;
							local235 = local846.anInt4118 / 32 - Static21.aClass36_Sub3_Sub1_1.anInt4118 / 32;
							Static201.method3119(local235, local247, local813.anInt674, arg0, 360000, arg2, arg1);
						}
					}
					if (local813.anInt668 == 2) {
						local247 = (local813.anInt664 - Static130.anInt2601) * 4 + 2 - Static21.aClass36_Sub3_Sub1_1.anInt4118 / 32;
						local235 = local813.anInt676 * 4;
						local235 *= local235;
						local217 = (local813.anInt675 - Static49.anInt1089) * 4 + 2 - Static21.aClass36_Sub3_Sub1_1.anInt4117 / 32;
						Static201.method3119(local247, local217, local813.anInt674, arg0, local235, arg2, arg1);
					}
					if (local813.anInt668 == 10 && local813.anInt671 >= 0 && local813.anInt671 < Static230.aClass36_Sub3_Sub1Array1.length) {
						@Pc(957) Class36_Sub3_Sub1 local957 = Static230.aClass36_Sub3_Sub1Array1[local813.anInt671];
						if (local957 != null) {
							local247 = local957.anInt4117 / 32 - Static21.aClass36_Sub3_Sub1_1.anInt4117 / 32;
							local235 = local957.anInt4118 / 32 - Static21.aClass36_Sub3_Sub1_1.anInt4118 / 32;
							Static201.method3119(local235, local247, local813.anInt674, arg0, 360000, arg2, arg1);
						}
					}
				}
			}
			if (Static292.anInt5659 != 0) {
				local182 = Static292.anInt5659 * 4 + Static21.aClass36_Sub3_Sub1_1.method3110() * 2 + 2 - Static21.aClass36_Sub3_Sub1_1.anInt4117 / 32 - 2;
				local201 = Static67.anInt1466 * 4 + Static21.aClass36_Sub3_Sub1_1.method3110() * 2 + 2 - Static21.aClass36_Sub3_Sub1_1.anInt4118 / 32 - 2;
				Static298.method258(local201, arg0, local182, Static241.aClass8_Sub1_Sub7_11, arg2, arg1);
			}
			if (Static116.aBoolean188) {
				Static126.method1994(arg1.anInt5123 / 2 + arg2 - 1, arg0 + (arg1.anInt5121 / 2 - 1), 3, 3, 16777215);
			} else {
				Static103.method1664(arg1.anInt5123 / 2 + arg2 - 1, arg1.anInt5121 / 2 + (arg0 - 1), 3, 3, 16777215);
			}
		} else if (Static116.aBoolean188) {
			@Pc(66) Class8_Sub1_Sub7 local66 = arg1.method3892(false);
			if (local66 != null) {
				local66.method2811(arg2, arg0);
			}
		} else {
			Static103.method1685(arg2, arg0, arg1.anIntArray410, arg1.anIntArray409);
		}
		Static44.aBooleanArray3[arg3] = true;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(II)I")
	public static int method366(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method367(@OriginalArg(1) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static24.aStringArray10.length; local7++) {
			if (Static24.aStringArray10[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V")
	public static void method368() {
		for (@Pc(15) Class8_Sub32 local15 = (Class8_Sub32) Static213.aClass129_22.method3035(); local15 != null; local15 = (Class8_Sub32) Static213.aClass129_22.method3048()) {
			@Pc(20) int local20 = local15.anInt5295;
			if (Static92.method1483(local20)) {
				@Pc(27) boolean local27 = true;
				@Pc(31) Class159[] local31 = Static210.aClass159ArrayArray6[local20];
				@Pc(33) int local33;
				for (local33 = 0; local33 < local31.length; local33++) {
					if (local31[local33] != null) {
						local27 = local31[local33].aBoolean423;
						break;
					}
				}
				if (!local27) {
					local33 = (int) local15.aLong203;
					@Pc(66) Class159 local66 = Static82.method1361(local33);
					if (local66 != null) {
						Static128.method2075(local66);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZI)Z")
	public static boolean method369(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		@Pc(25) Class70 local25 = Static235.method3578(arg1);
		return local25.method1577(arg0);
	}
}
