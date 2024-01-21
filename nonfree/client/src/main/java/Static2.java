import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "L", descriptor = "I")
	public static final int anInt28 = 50;

	@OriginalMember(owner = "client!aa", name = "q", descriptor = "[I")
	public static int[] anIntArray3 = new int[anInt28];

	@OriginalMember(owner = "client!aa", name = "t", descriptor = "[I")
	public static int[] anIntArray4 = new int[anInt28];

	@OriginalMember(owner = "client!aa", name = "z", descriptor = "[I")
	public static int[] anIntArray5 = new int[anInt28];

	@OriginalMember(owner = "client!aa", name = "A", descriptor = "Lclient!ua;")
	public static Class72 aClass72_1 = new Class72(200);

	@OriginalMember(owner = "client!aa", name = "E", descriptor = "[I")
	public static int[] anIntArray6 = new int[anInt28];

	@OriginalMember(owner = "client!aa", name = "F", descriptor = "[I")
	public static int[] anIntArray7 = new int[anInt28];

	@OriginalMember(owner = "client!aa", name = "G", descriptor = "[Lclient!v;")
	public static Class76[] aClass76Array1 = new Class76[anInt28];

	@OriginalMember(owner = "client!aa", name = "O", descriptor = "[I")
	public static int[] anIntArray8 = new int[anInt28];

	@OriginalMember(owner = "client!aa", name = "P", descriptor = "[I")
	public static int[] anIntArray9 = new int[anInt28];

	@OriginalMember(owner = "client!aa", name = "Q", descriptor = "[I")
	public static int[] anIntArray10 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!aa", name = "R", descriptor = "Lclient!v;")
	public static Class76 aClass76_23 = Static134.method2017("<col=ffff00>");

	@OriginalMember(owner = "client!aa", name = "S", descriptor = "I")
	public static int anInt31 = 0;

	@OriginalMember(owner = "client!aa", name = "T", descriptor = "Lclient!v;")
	public static Class76 aClass76_24 = Static134.method2017("Wordpack geladen)3");

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZZ)V")
	public static void method11(@OriginalArg(0) boolean arg0) {
		if (Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1393 >> 7 == Static51.anInt2078 && Static92.anInt2151 == Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1416 >> 7) {
			Static51.anInt2078 = 0;
		}
		@Pc(21) int local21 = Static106.anInt2357;
		if (arg0) {
			local21 = 1;
		}
		for (@Pc(27) int local27 = 0; local27 < local21; local27++) {
			@Pc(33) Class4_Sub4_Sub3_Sub1_Sub2 local33;
			@Pc(35) int local35;
			if (arg0) {
				local33 = Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1;
				local35 = 33538048;
			} else {
				local33 = Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[Static113.anIntArray348[local27]];
				local35 = Static113.anIntArray348[local27] << 14;
			}
			if (local33 != null && local33.method969()) {
				@Pc(60) int local60 = local33.anInt1416 >> 7;
				local33.aBoolean84 = false;
				if ((Static76.aBoolean119 && Static106.anInt2357 > 50 || Static106.anInt2357 > 200) && !arg0 && local33.anInt1389 == local33.anInt1432) {
					local33.aBoolean84 = true;
				}
				@Pc(90) int local90 = local33.anInt1393 >> 7;
				if (local90 >= 0 && local90 < 104 && local60 >= 0 && local60 < 104) {
					if (local33.aClass4_Sub4_Sub3_Sub7_1 == null || Static78.anInt1981 < local33.anInt1462 || Static78.anInt1981 >= local33.anInt1447) {
						if ((local33.anInt1393 & 0x7F) == 64 && (local33.anInt1416 & 0x7F) == 64) {
							if (Static32.anIntArrayArray7[local90][local60] == Static20.anInt445) {
								continue;
							}
							Static32.anIntArrayArray7[local90][local60] = Static20.anInt445;
						}
						local33.anInt1456 = Static67.method1133(Static124.anInt2712, local33.anInt1393, local33.anInt1416);
						Static54.aClass81_10.method1975(Static124.anInt2712, local33.anInt1393, local33.anInt1416, local33.anInt1456, 60, local33, local33.anInt1395, local35, local33.aBoolean81);
					} else {
						local33.aBoolean84 = false;
						local33.anInt1456 = Static67.method1133(Static124.anInt2712, local33.anInt1393, local33.anInt1416);
						Static54.aClass81_10.method1981(Static124.anInt2712, local33.anInt1393, local33.anInt1416, local33.anInt1456, local33, local33.anInt1395, local35, local33.anInt1442, local33.anInt1440, local33.anInt1443, local33.anInt1466);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)I")
	public static int method12() {
		return Static92.anInt2149++;
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)V")
	public static void method13() {
		@Pc(28) int local28;
		if (Static64.anInt1648 == 0) {
			Static54.aClass81_10 = new Class81(4, 104, 104, Static66.anIntArrayArrayArray3);
			for (local28 = 0; local28 < 4; local28++) {
				Static52.aClass50Array1[local28] = new Class50(104, 104);
			}
			Static104.aClass4_Sub4_Sub5_Sub2_4 = new Class4_Sub4_Sub5_Sub2(512, 512);
			Static88.anInt2089 = 5;
			Static64.anInt1648 = 20;
			Static111.aClass76_1155 = Static21.aClass76_192;
			return;
		}
		@Pc(65) int local65;
		@Pc(73) int local73;
		@Pc(79) int local79;
		@Pc(83) int local83;
		if (Static64.anInt1648 == 20) {
			@Pc(63) int[] local63 = new int[9];
			for (local65 = 0; local65 < 9; local65++) {
				local73 = local65 * 32 + 143;
				local79 = local73 * 3 + 600;
				local83 = Class4_Sub4_Sub5_Sub1.anIntArray118[local73];
				local63[local65] = local79 * local83 >> 16;
			}
			Static131.method1964(local63);
			Static111.aClass76_1155 = Static133.aClass76_1323;
			Static88.anInt2089 = 10;
			Static64.anInt1648 = 30;
		} else if (Static64.anInt1648 == 30) {
			Static133.aClass17_Sub1_21 = Static5.method78(true, 0, true, false);
			Static33.aClass17_Sub1_9 = Static5.method78(true, 1, true, false);
			Static23.aClass17_Sub1_8 = Static5.method78(true, 2, false, true);
			Static69.aClass17_Sub1_16 = Static5.method78(true, 3, true, false);
			Static12.aClass17_Sub1_4 = Static5.method78(true, 4, true, false);
			Static7.aClass17_Sub1_3 = Static5.method78(true, 5, true, true);
			Static50.aClass17_Sub1_12 = Static5.method78(false, 6, true, true);
			Static130.aClass17_Sub1_20 = Static5.method78(true, 7, true, false);
			Static3.aClass17_Sub1_17 = Static5.method78(true, 8, true, false);
			Static56.aClass17_Sub1_13 = Static5.method78(true, 9, true, false);
			Static18.aClass17_Sub1_6 = Static5.method78(true, 10, true, false);
			Static95.aClass17_Sub1_18 = Static5.method78(true, 11, true, false);
			Static64.aClass17_Sub1_14 = Static5.method78(true, 12, true, false);
			Static67.aClass17_Sub1_15 = Static5.method78(true, 13, false, true);
			Static45.aClass17_Sub1_11 = Static5.method78(false, 14, true, false);
			Static19.aClass17_Sub1_10 = Static5.method78(true, 15, true, false);
			Static64.anInt1648 = 40;
			Static111.aClass76_1155 = Static28.aClass76_233;
			Static88.anInt2089 = 20;
		} else if (Static64.anInt1648 == 40) {
			local28 = Static133.aClass17_Sub1_21.method309() * 4 / 100;
			local28 += Static33.aClass17_Sub1_9.method309() * 4 / 100;
			local28 += Static23.aClass17_Sub1_8.method309() * 2 / 100;
			local28 += Static69.aClass17_Sub1_16.method309() * 2 / 100;
			local28 += Static12.aClass17_Sub1_4.method309() * 6 / 100;
			local28 += Static7.aClass17_Sub1_3.method309() * 4 / 100;
			local28 += Static50.aClass17_Sub1_12.method309() * 2 / 100;
			local28 += Static130.aClass17_Sub1_20.method309() * 60 / 100;
			local28 += Static3.aClass17_Sub1_17.method309() * 2 / 100;
			local28 += Static56.aClass17_Sub1_13.method309() * 2 / 100;
			local28 += Static18.aClass17_Sub1_6.method309() * 2 / 100;
			local28 += Static95.aClass17_Sub1_18.method309() * 2 / 100;
			local28 += Static64.aClass17_Sub1_14.method309() * 2 / 100;
			local28 += Static67.aClass17_Sub1_15.method309() * 2 / 100;
			local28 += Static45.aClass17_Sub1_11.method309() * 2 / 100;
			local28 += Static19.aClass17_Sub1_10.method309() * 2 / 100;
			if (local28 == 100) {
				Static64.anInt1648 = 45;
				Static88.anInt2089 = 30;
				Static111.aClass76_1155 = Static134.aClass76_1330;
			} else {
				if (local28 != 0) {
					Static111.aClass76_1155 = Static59.method1017(new Class76[] { Static31.aClass76_300, Static63.method1092(local28), Static121.aClass76_1238 });
				}
				Static88.anInt2089 = 30;
			}
		} else if (Static64.anInt1648 == 45) {
			Static20.method302(!Static76.aBoolean119);
			@Pc(452) Class4_Sub12_Sub2 local452 = new Class4_Sub12_Sub2();
			local452.method1055();
			Static12.aClass3_1 = Static68.method1138(Static121.aClass14_3, 22050, 0, Static1.aCanvas1);
			Static12.aClass3_1.method1530(local452);
			Static102.method1592(local452, Static45.aClass17_Sub1_11, Static12.aClass17_Sub1_4, Static19.aClass17_Sub1_10);
			Static74.aClass3_2 = Static68.method1138(Static121.aClass14_3, 2048, 1, Static1.aCanvas1);
			Static14.aClass4_Sub12_Sub4_1 = new Class4_Sub12_Sub4();
			Static74.aClass3_2.method1530(Static14.aClass4_Sub12_Sub4_1);
			Static47.aClass77_1 = new Class77(22050, Static106.anInt2355);
			Static111.aClass76_1155 = Static84.aClass76_898;
			Static88.anInt2089 = 35;
			Static64.anInt1648 = 50;
		} else if (Static64.anInt1648 == 50) {
			local28 = 0;
			if (Static87.aClass4_Sub4_Sub5_Sub3_Sub1_4 == null) {
				Static87.aClass4_Sub4_Sub5_Sub3_Sub1_4 = Static88.method1467(Static67.aClass17_Sub1_15, Static133.aClass76_1322, Static3.aClass17_Sub1_17, Static5.aClass76_43);
			} else {
				local28++;
			}
			if (Static95.aClass4_Sub4_Sub5_Sub3_Sub1_5 == null) {
				Static95.aClass4_Sub4_Sub5_Sub3_Sub1_5 = Static88.method1467(Static67.aClass17_Sub1_15, Static133.aClass76_1322, Static3.aClass17_Sub1_17, Static125.aClass76_1282);
			} else {
				local28++;
			}
			if (Static126.aClass4_Sub4_Sub5_Sub3_Sub1_6 == null) {
				Static126.aClass4_Sub4_Sub5_Sub3_Sub1_6 = Static88.method1467(Static67.aClass17_Sub1_15, Static133.aClass76_1322, Static3.aClass17_Sub1_17, Static56.aClass76_624);
			} else {
				local28++;
			}
			if (local28 < 3) {
				Static111.aClass76_1155 = Static59.method1017(new Class76[] { Static25.aClass76_226, Static63.method1092(local28 * 100 / 3), Static121.aClass76_1238 });
				Static88.anInt2089 = 40;
			} else {
				Static64.anInt1648 = 60;
				Static88.anInt2089 = 40;
				Static111.aClass76_1155 = Static85.aClass76_905;
			}
		} else if (Static64.anInt1648 == 60) {
			local28 = Static113.method1718(Static3.aClass17_Sub1_17, Static18.aClass17_Sub1_6);
			local65 = Static60.method1031();
			if (local65 > local28) {
				Static111.aClass76_1155 = Static59.method1017(new Class76[] { Static38.aClass76_462, Static63.method1092(local28 * 100 / local65), Static121.aClass76_1238 });
				Static88.anInt2089 = 50;
			} else {
				Static88.anInt2089 = 50;
				Static111.aClass76_1155 = Static102.aClass76_1083;
				Static73.method1363(5);
				Static64.anInt1648 = 70;
			}
		} else if (Static64.anInt1648 == 70) {
			if (Static23.aClass17_Sub1_8.method295()) {
				Static7.method99(Static23.aClass17_Sub1_8);
				Static45.method814(Static23.aClass17_Sub1_8);
				Static62.method1088(Static130.aClass17_Sub1_20, Static23.aClass17_Sub1_8);
				Static7.method98(Static76.aBoolean119, Static23.aClass17_Sub1_8, Static130.aClass17_Sub1_20);
				Static51.method1456(Static23.aClass17_Sub1_8, Static130.aClass17_Sub1_20);
				Static110.method1672(Static130.aClass17_Sub1_20, Static23.aClass17_Sub1_8, Static87.aClass4_Sub4_Sub5_Sub3_Sub1_4, Static68.aBoolean108);
				Static49.method861(Static33.aClass17_Sub1_9, Static23.aClass17_Sub1_8, Static133.aClass17_Sub1_21);
				Static13.method161(Static23.aClass17_Sub1_8, Static130.aClass17_Sub1_20);
				Static39.method765(Static23.aClass17_Sub1_8);
				Static34.method620(Static23.aClass17_Sub1_8);
				Static100.method1586(Static67.aClass17_Sub1_15, Static130.aClass17_Sub1_20, Static3.aClass17_Sub1_17, Static69.aClass17_Sub1_16);
				Static69.method1158(Static23.aClass17_Sub1_8);
				Static31.method450(Static23.aClass17_Sub1_8);
				Static111.aClass76_1155 = Static94.aClass76_974;
				Static64.anInt1648 = 80;
				Static88.anInt2089 = 60;
			} else {
				Static111.aClass76_1155 = Static59.method1017(new Class76[] { Static68.aClass76_724, Static63.method1092(Static23.aClass17_Sub1_8.method312()), Static121.aClass76_1238 });
				Static88.anInt2089 = 60;
			}
		} else if (Static64.anInt1648 == 80) {
			local28 = 0;
			if (Static118.aClass4_Sub4_Sub5_Sub2_5 == null) {
				Static118.aClass4_Sub4_Sub5_Sub2_5 = Static33.method607(Static3.aClass17_Sub1_17, Static133.aClass76_1322, Static101.aClass76_1063);
			} else {
				local28++;
			}
			if (Static90.aClass4_Sub4_Sub5_Sub2_3 == null) {
				Static90.aClass4_Sub4_Sub5_Sub2_3 = Static33.method607(Static3.aClass17_Sub1_17, Static133.aClass76_1322, Static67.aClass76_720);
			} else {
				local28++;
			}
			if (Static30.aClass4_Sub4_Sub5_Sub4Array5 == null) {
				Static30.aClass4_Sub4_Sub5_Sub4Array5 = Static84.method1429(Static3.aClass17_Sub1_17, Static133.aClass76_1322, Static125.aClass76_1279);
			} else {
				local28++;
			}
			if (Static54.aClass4_Sub4_Sub5_Sub2Array47 == null) {
				Static54.aClass4_Sub4_Sub5_Sub2Array47 = Static55.method976(Static3.aClass17_Sub1_17, Static49.aClass76_553, Static133.aClass76_1322);
			} else {
				local28++;
			}
			if (Static49.aClass4_Sub4_Sub5_Sub2Array24 == null) {
				Static49.aClass4_Sub4_Sub5_Sub2Array24 = Static55.method976(Static3.aClass17_Sub1_17, Static99.aClass76_1303, Static133.aClass76_1322);
			} else {
				local28++;
			}
			if (Static47.aClass4_Sub4_Sub5_Sub2Array22 == null) {
				Static47.aClass4_Sub4_Sub5_Sub2Array22 = Static55.method976(Static3.aClass17_Sub1_17, Static93.aClass76_971, Static133.aClass76_1322);
			} else {
				local28++;
			}
			if (Static114.aClass4_Sub4_Sub5_Sub2Array43 == null) {
				Static114.aClass4_Sub4_Sub5_Sub2Array43 = Static55.method976(Static3.aClass17_Sub1_17, Static81.aClass76_879, Static133.aClass76_1322);
			} else {
				local28++;
			}
			if (Static99.aClass4_Sub4_Sub5_Sub2Array50 == null) {
				Static99.aClass4_Sub4_Sub5_Sub2Array50 = Static55.method976(Static3.aClass17_Sub1_17, Static103.aClass76_1087, Static133.aClass76_1322);
			} else {
				local28++;
			}
			if (Static26.aClass4_Sub4_Sub5_Sub2Array5 == null) {
				Static26.aClass4_Sub4_Sub5_Sub2Array5 = Static55.method976(Static3.aClass17_Sub1_17, Static96.aClass76_1010, Static133.aClass76_1322);
			} else {
				local28++;
			}
			if (Static23.aClass4_Sub4_Sub5_Sub2Array3 == null) {
				Static23.aClass4_Sub4_Sub5_Sub2Array3 = Static55.method976(Static3.aClass17_Sub1_17, Static84.aClass76_893, Static133.aClass76_1322);
			} else {
				local28++;
			}
			if (Static35.aClass4_Sub4_Sub5_Sub2Array14 == null) {
				Static35.aClass4_Sub4_Sub5_Sub2Array14 = Static55.method976(Static3.aClass17_Sub1_17, Static30.aClass76_605, Static133.aClass76_1322);
			} else {
				local28++;
			}
			if (Static115.aClass4_Sub4_Sub5_Sub4Array12 == null) {
				Static115.aClass4_Sub4_Sub5_Sub4Array12 = Static84.method1429(Static3.aClass17_Sub1_17, Static133.aClass76_1322, Static98.aClass76_1044);
			} else {
				local28++;
			}
			if (Static100.aClass4_Sub4_Sub5_Sub4Array11 == null) {
				Static100.aClass4_Sub4_Sub5_Sub4Array11 = Static84.method1429(Static3.aClass17_Sub1_17, Static133.aClass76_1322, Static107.aClass76_1112);
			} else {
				local28++;
			}
			if (Static65.aClass4_Sub4_Sub5_Sub4_2 == null) {
				Static65.aClass4_Sub4_Sub5_Sub4_2 = Static24.method353(Static133.aClass76_1322, Static75.aClass76_819, Static3.aClass17_Sub1_17);
			} else {
				local28++;
			}
			if (local28 < 14) {
				Static111.aClass76_1155 = Static59.method1017(new Class76[] { Static110.aClass76_1129, Static63.method1092(local28 * 100 / 14), Static121.aClass76_1238 });
				Static88.anInt2089 = 70;
			} else {
				Static83.aClass4_Sub4_Sub5_Sub4Array8 = Static100.aClass4_Sub4_Sub5_Sub4Array11;
				local73 = (int) (Math.random() * 21.0D) - 10;
				Static90.aClass4_Sub4_Sub5_Sub2_3.method918();
				local65 = (int) (Math.random() * 21.0D) - 10;
				local79 = (int) (Math.random() * 21.0D) - 10;
				local83 = (int) (Math.random() * 41.0D) - 20;
				for (@Pc(952) int local952 = 0; local952 < Static54.aClass4_Sub4_Sub5_Sub2Array47.length; local952++) {
					Static54.aClass4_Sub4_Sub5_Sub2Array47[local952].method924(local83 + local65, local73 - -local83, local79 + local83);
				}
				Static30.aClass4_Sub4_Sub5_Sub4Array5[0].method1835(local65 + local83, local83 + local73, local79 + local83);
				Static93.method1503();
				Static64.anInt1648 = 90;
				Static88.anInt2089 = 70;
				Static111.aClass76_1155 = Static6.aClass76_50;
			}
		} else if (Static64.anInt1648 == 90) {
			if (Static56.aClass17_Sub1_13.method295()) {
				@Pc(1039) Class29 local1039 = new Class29(Static56.aClass17_Sub1_13, Static3.aClass17_Sub1_17, 20, 0.8D, Static76.aBoolean119 ? 64 : 128);
				Static37.method712(local1039);
				Static37.method719(0.8D);
				Static88.anInt2089 = 90;
				Static111.aClass76_1155 = Static100.aClass76_1054;
				Static64.anInt1648 = 110;
			} else {
				Static111.aClass76_1155 = Static59.method1017(new Class76[] { Static87.aClass76_839, Static63.method1092(Static56.aClass17_Sub1_13.method312()), Static121.aClass76_1238 });
				Static88.anInt2089 = 90;
			}
		} else if (Static64.anInt1648 == 110) {
			Static93.aClass20_1 = new Class20();
			Static121.aClass14_3.method192(Static93.aClass20_1, 10);
			Static88.anInt2089 = 94;
			Static111.aClass76_1155 = Static115.aClass76_1178;
			Static64.anInt1648 = 120;
		} else if (Static64.anInt1648 == 120) {
			if (Static18.aClass17_Sub1_6.method293(Static96.aClass76_1007, Static133.aClass76_1322)) {
				@Pc(1106) Class23 local1106 = new Class23(Static18.aClass17_Sub1_6.method288(Static96.aClass76_1007, Static133.aClass76_1322));
				Static65.method301(local1106);
				Static88.anInt2089 = 96;
				Static64.anInt1648 = 130;
				Static111.aClass76_1155 = Static59.aClass76_642;
			} else {
				Static111.aClass76_1155 = Static59.method1017(new Class76[] { Static61.aClass76_665, Static97.aClass76_1029 });
				Static88.anInt2089 = 96;
			}
		} else if (Static64.anInt1648 == 130) {
			if (!Static69.aClass17_Sub1_16.method295()) {
				Static111.aClass76_1155 = Static59.method1017(new Class76[] { Static43.aClass76_142, Static63.method1092(Static69.aClass17_Sub1_16.method312() * 4 / 5), Static121.aClass76_1238 });
				Static88.anInt2089 = 100;
			} else if (!Static64.aClass17_Sub1_14.method295()) {
				Static111.aClass76_1155 = Static59.method1017(new Class76[] { Static43.aClass76_142, Static63.method1092(Static64.aClass17_Sub1_14.method312() / 6 + 80), Static121.aClass76_1238 });
				Static88.anInt2089 = 100;
			} else if (Static67.aClass17_Sub1_15.method295()) {
				Static111.aClass76_1155 = Static110.aClass76_1131;
				Static88.anInt2089 = 100;
				Static64.anInt1648 = 140;
			} else {
				Static111.aClass76_1155 = Static59.method1017(new Class76[] { Static43.aClass76_142, Static63.method1092(Static67.aClass17_Sub1_15.method312() / 20 + 96), Static121.aClass76_1238 });
				Static88.anInt2089 = 100;
			}
		} else if (Static64.anInt1648 == 140) {
			Static73.method1363(10);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!dd;)Z")
	public static boolean method14(@OriginalArg(1) Class4_Sub8 arg0) {
		if (arg0.anIntArray70 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray70.length; local12++) {
			@Pc(19) int local19 = Static32.method480(arg0, local12);
			@Pc(24) int local24 = arg0.anIntArray67[local12];
			if (arg0.anIntArray70[local12] == 2) {
				if (local24 <= local19) {
					return false;
				}
			} else if (arg0.anIntArray70[local12] == 3) {
				if (local24 >= local19) {
					return false;
				}
			} else if (arg0.anIntArray70[local12] == 4) {
				if (local24 == local19) {
					return false;
				}
			} else if (local24 != local19) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V")
	public static void method15() {
		Static132.aClass72_28.method1786();
	}

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)V")
	public static void method16() {
		anIntArray4 = null;
		aClass76_23 = null;
		anIntArray7 = null;
		anIntArray10 = null;
		anIntArray6 = null;
		aClass72_1 = null;
		anIntArray3 = null;
		aClass76_24 = null;
		anIntArray9 = null;
		anIntArray5 = null;
		aClass76Array1 = null;
		anIntArray8 = null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
	public static int method17(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) int local6 = arg0.getKeyChar();
		if (local6 == 8364) {
			return 128;
		} else {
			if (local6 <= 0 || local6 >= 256) {
				local6 = -1;
			}
			return local6;
		}
	}
}
