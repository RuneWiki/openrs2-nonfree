import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!he", name = "c", descriptor = "Lclient!kb;")
	public static Class42 aClass42_5;

	@OriginalMember(owner = "client!he", name = "f", descriptor = "Lclient!sb;")
	public static Class25 aClass25_54;

	@OriginalMember(owner = "client!he", name = "i", descriptor = "Z")
	public static boolean aBoolean81;

	@OriginalMember(owner = "client!he", name = "m", descriptor = "Lclient!rd;")
	public static Class64 aClass64_34;

	@OriginalMember(owner = "client!he", name = "p", descriptor = "I")
	public static int anInt1144;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "Lclient!ad;")
	private static Class4 aClass4_575 = Static75.method1216("Bad session id)3");

	@OriginalMember(owner = "client!he", name = "b", descriptor = "Lclient!ad;")
	public static Class4 aClass4_576 = aClass4_575;

	@OriginalMember(owner = "client!he", name = "n", descriptor = "Lclient!ad;")
	public static Class4 aClass4_577 = Static75.method1216("Mem:");

	@OriginalMember(owner = "client!he", name = "q", descriptor = "I")
	public static int anInt1145 = 0;

	@OriginalMember(owner = "client!he", name = "r", descriptor = "Lclient!ad;")
	public static Class4 aClass4_578 = Static75.method1216("invback");

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
	public static void method800() {
		aClass64_34 = null;
		aClass25_54 = null;
		aClass4_575 = null;
		aClass4_578 = null;
		aClass4_577 = null;
		aClass4_576 = null;
		aClass42_5 = null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
	public static void method801() {
		@Pc(21) int local21;
		if (Static107.anInt2692 == 0) {
			Static38.aClass61_30 = new Class61(4, 104, 104, Static38.anIntArrayArrayArray36);
			for (local21 = 0; local21 < 4; local21++) {
				Static12.aClass40Array1[local21] = new Class40(104, 104);
			}
			Static5.aClass3_Sub1_Sub4_Sub2_6 = new Class3_Sub1_Sub4_Sub2(512, 512);
			Static107.anInt2692 = 20;
			Static88.anInt2035 = 5;
			Static95.aClass4_1253 = Static35.aClass4_321;
			return;
		}
		@Pc(56) int local56;
		@Pc(64) int local64;
		@Pc(71) int local71;
		@Pc(75) int local75;
		if (Static107.anInt2692 == 20) {
			@Pc(54) int[] local54 = new int[9];
			for (local56 = 0; local56 < 9; local56++) {
				local64 = local56 * 32 + 143;
				local71 = local64 * 3 + 600;
				local75 = Class3_Sub1_Sub4_Sub1.anIntArray295[local64];
				local54[local56] = local71 * local75 >> 16;
			}
			Static84.method1324(local54);
			Static88.anInt2035 = 10;
			Static95.aClass4_1253 = Static103.aClass4_1399;
			Static107.anInt2692 = 30;
		} else if (Static107.anInt2692 == 30) {
			Static35.aClass64_Sub1_3 = Static6.method167(0, false, true, true);
			Static42.aClass64_Sub1_9 = Static6.method167(1, false, true, true);
			Static47.aClass64_Sub1_10 = Static6.method167(2, true, false, true);
			Static74.aClass64_Sub1_17 = Static6.method167(3, false, true, true);
			Static96.aClass64_Sub1_15 = Static6.method167(4, false, true, true);
			Static20.aClass64_Sub1_1 = Static6.method167(5, true, true, true);
			Static94.aClass64_Sub1_18 = Static6.method167(6, true, true, false);
			Static67.aClass64_Sub1_13 = Static6.method167(7, false, true, true);
			Static31.aClass64_Sub1_8 = Static6.method167(8, false, true, true);
			Static74.aClass64_Sub1_16 = Static6.method167(9, false, true, true);
			Static67.aClass64_Sub1_12 = Static6.method167(10, false, true, true);
			Static110.aClass64_Sub1_20 = Static6.method167(11, false, true, true);
			Static96.aClass64_Sub1_14 = Static6.method167(12, false, true, true);
			Static95.aClass4_1253 = Static79.aClass4_1052;
			Static107.anInt2692 = 40;
			Static88.anInt2035 = 20;
		} else if (Static107.anInt2692 == 40) {
			local21 = Static35.aClass64_Sub1_3.method1643() * 5 / 100;
			local21 += Static42.aClass64_Sub1_9.method1643() * 5 / 100;
			local21 += Static47.aClass64_Sub1_10.method1643() * 5 / 100;
			local21 += Static74.aClass64_Sub1_17.method1643() * 5 / 100;
			local21 += Static96.aClass64_Sub1_15.method1643() * 5 / 100;
			local21 += Static20.aClass64_Sub1_1.method1643() * 5 / 100;
			local21 += Static94.aClass64_Sub1_18.method1643() * 5 / 100;
			local21 += Static67.aClass64_Sub1_13.method1643() * 40 / 100;
			local21 += Static31.aClass64_Sub1_8.method1643() * 5 / 100;
			local21 += Static74.aClass64_Sub1_16.method1643() * 5 / 100;
			local21 += Static67.aClass64_Sub1_12.method1643() * 5 / 100;
			local21 += Static110.aClass64_Sub1_20.method1643() * 5 / 100;
			local21 += Static96.aClass64_Sub1_14.method1643() * 5 / 100;
			if (local21 == 100) {
				Static88.anInt2035 = 30;
				Static107.anInt2692 = 45;
				Static95.aClass4_1253 = Static112.aClass4_1584;
			} else {
				if (local21 != 0) {
					Static95.aClass4_1253 = Static60.method1012(new Class4[] { Static49.aClass4_640, Static93.method1632(local21), Static31.aClass4_452 });
				}
				Static88.anInt2035 = 30;
			}
		} else if (Static107.anInt2692 == 45) {
			Static93.method1623(!Static36.aBoolean70, Static24.aClass2_1);
			Static52.aClass3_Sub3_Sub2_1 = Static39.method730(Static24.aClass2_1, Static9.aCanvas1);
			Static68.aClass57_1 = new Class57(22050, Static89.anInt2053);
			Static88.anInt2035 = 35;
			Static95.aClass4_1253 = Static17.aClass4_204;
			Static107.anInt2692 = 50;
		} else if (Static107.anInt2692 == 50) {
			local21 = 0;
			if (Static45.aClass3_Sub1_Sub4_Sub4_1 == null) {
				Static45.aClass3_Sub1_Sub4_Sub4_1 = Static56.method941(Static113.aClass4_1604, Static85.aClass4_1117, Static31.aClass64_Sub1_8);
			} else {
				local21++;
			}
			if (Static71.aClass3_Sub1_Sub4_Sub4_2 == null) {
				Static71.aClass3_Sub1_Sub4_Sub4_2 = Static56.method941(Static113.aClass4_1604, Static67.aClass4_846, Static31.aClass64_Sub1_8);
			} else {
				local21++;
			}
			if (Static113.aClass3_Sub1_Sub4_Sub4_3 == null) {
				Static113.aClass3_Sub1_Sub4_Sub4_3 = Static56.method941(Static113.aClass4_1604, Static78.aClass4_221, Static31.aClass64_Sub1_8);
			} else {
				local21++;
			}
			if (local21 < 3) {
				Static95.aClass4_1253 = Static60.method1012(new Class4[] { Static49.aClass4_635, Static93.method1632(local21 * 100 / 3), Static31.aClass4_452 });
				Static88.anInt2035 = 40;
			} else {
				Static88.anInt2035 = 40;
				Static95.aClass4_1253 = Static82.aClass4_1082;
				Static107.anInt2692 = 60;
			}
		} else if (Static107.anInt2692 == 60) {
			local21 = Static48.method837(Static67.aClass64_Sub1_12, Static31.aClass64_Sub1_8);
			local56 = Static62.method1073();
			if (local56 > local21) {
				Static95.aClass4_1253 = Static60.method1012(new Class4[] { Static75.aClass4_1000, Static93.method1632(local21 * 100 / local56), Static31.aClass4_452 });
				Static88.anInt2035 = 50;
			} else {
				Static95.aClass4_1253 = Static100.aClass4_1350;
				Static88.anInt2035 = 50;
				Static60.method1007(5);
				Static107.anInt2692 = 70;
			}
		} else if (Static107.anInt2692 == 70) {
			if (Static47.aClass64_Sub1_10.method1627()) {
				Static101.method1678(Static47.aClass64_Sub1_10);
				Static107.method1824(Static47.aClass64_Sub1_10);
				Static56.method942(Static67.aClass64_Sub1_13, Static47.aClass64_Sub1_10);
				Static27.method559(Static47.aClass64_Sub1_10, Static67.aClass64_Sub1_13, Static36.aBoolean70);
				Static64.method1094(Static47.aClass64_Sub1_10, Static67.aClass64_Sub1_13);
				Static22.method299(Static47.aClass64_Sub1_10, Static13.aBoolean23, Static67.aClass64_Sub1_13);
				Static63.method1087(Static35.aClass64_Sub1_3, Static47.aClass64_Sub1_10, Static42.aClass64_Sub1_9);
				Static101.method1682(Static47.aClass64_Sub1_10, Static67.aClass64_Sub1_13);
				Static110.method1894(Static47.aClass64_Sub1_10);
				Static107.method1825(Static47.aClass64_Sub1_10);
				Static24.method460(Static74.aClass64_Sub1_17, Static31.aClass64_Sub1_8, Static67.aClass64_Sub1_13);
				Static95.aClass4_1253 = Static29.aClass4_436;
				Static107.anInt2692 = 80;
				Static88.anInt2035 = 60;
			} else {
				Static95.aClass4_1253 = Static60.method1012(new Class4[] { Static60.aClass4_750, Static93.method1632(Static47.aClass64_Sub1_10.method1649()), Static31.aClass4_452 });
				Static88.anInt2035 = 60;
			}
		} else if (Static107.anInt2692 == 80) {
			local21 = 0;
			if (Static11.aClass3_Sub1_Sub4_Sub2_52 == null) {
				Static11.aClass3_Sub1_Sub4_Sub2_52 = Static69.method1517(Static77.aClass4_1028, Static113.aClass4_1604, Static31.aClass64_Sub1_8);
			} else {
				local21++;
			}
			if (Static74.aClass3_Sub1_Sub4_Sub2_26 == null) {
				Static74.aClass3_Sub1_Sub4_Sub2_26 = Static69.method1517(Static83.aClass4_1092, Static113.aClass4_1604, Static31.aClass64_Sub1_8);
			} else {
				local21++;
			}
			if (Static48.aClass3_Sub1_Sub4_Sub3Array3 == null) {
				Static48.aClass3_Sub1_Sub4_Sub3Array3 = Static69.method1518(Static49.aClass4_638, Static113.aClass4_1604, Static31.aClass64_Sub1_8);
			} else {
				local21++;
			}
			if (Static17.aClass3_Sub1_Sub4_Sub2Array1 == null) {
				Static17.aClass3_Sub1_Sub4_Sub2Array1 = Static107.method1821(Static31.aClass64_Sub1_8, Static113.aClass4_1604, Static75.aClass4_999);
			} else {
				local21++;
			}
			if (Static78.aClass3_Sub1_Sub4_Sub2Array3 == null) {
				Static78.aClass3_Sub1_Sub4_Sub2Array3 = Static107.method1821(Static31.aClass64_Sub1_8, Static113.aClass4_1604, Static96.aClass4_912);
			} else {
				local21++;
			}
			if (Static66.aClass3_Sub1_Sub4_Sub2Array9 == null) {
				Static66.aClass3_Sub1_Sub4_Sub2Array9 = Static107.method1821(Static31.aClass64_Sub1_8, Static113.aClass4_1604, Static6.aClass4_123);
			} else {
				local21++;
			}
			if (Static74.aClass3_Sub1_Sub4_Sub2Array10 == null) {
				Static74.aClass3_Sub1_Sub4_Sub2Array10 = Static107.method1821(Static31.aClass64_Sub1_8, Static113.aClass4_1604, Static20.aClass4_244);
			} else {
				local21++;
			}
			if (Static35.aClass3_Sub1_Sub4_Sub2Array6 == null) {
				Static35.aClass3_Sub1_Sub4_Sub2Array6 = Static107.method1821(Static31.aClass64_Sub1_8, Static113.aClass4_1604, Static39.aClass4_541);
			} else {
				local21++;
			}
			if (Static103.aClass3_Sub1_Sub4_Sub2_43 == null) {
				Static103.aClass3_Sub1_Sub4_Sub2_43 = Static69.method1517(Static17.aClass4_205, Static113.aClass4_1604, Static31.aClass64_Sub1_8);
			} else {
				local21++;
			}
			if (Static23.aClass3_Sub1_Sub4_Sub2Array4 == null) {
				Static23.aClass3_Sub1_Sub4_Sub2Array4 = Static107.method1821(Static31.aClass64_Sub1_8, Static113.aClass4_1604, Static19.aClass4_238);
			} else {
				local21++;
			}
			if (Static47.aClass3_Sub1_Sub4_Sub2Array8 == null) {
				Static47.aClass3_Sub1_Sub4_Sub2Array8 = Static107.method1821(Static31.aClass64_Sub1_8, Static113.aClass4_1604, Static74.aClass4_969);
			} else {
				local21++;
			}
			if (Static31.aClass3_Sub1_Sub4_Sub2Array7 == null) {
				Static31.aClass3_Sub1_Sub4_Sub2Array7 = Static107.method1821(Static31.aClass64_Sub1_8, Static113.aClass4_1604, Static24.aClass4_326);
			} else {
				local21++;
			}
			if (Static64.aClass3_Sub1_Sub4_Sub3Array4 == null) {
				Static64.aClass3_Sub1_Sub4_Sub3Array4 = Static69.method1518(Static35.aClass4_324, Static113.aClass4_1604, Static31.aClass64_Sub1_8);
			} else {
				local21++;
			}
			if (Static100.aClass3_Sub1_Sub4_Sub3Array5 == null) {
				Static100.aClass3_Sub1_Sub4_Sub3Array5 = Static69.method1518(Static52.aClass4_673, Static113.aClass4_1604, Static31.aClass64_Sub1_8);
			} else {
				local21++;
			}
			if (local21 < 14) {
				Static95.aClass4_1253 = Static60.method1012(new Class4[] { Static67.aClass4_849, Static93.method1632(local21 * 100 / 14), Static31.aClass4_452 });
				Static88.anInt2035 = 70;
			} else {
				local56 = (int) (Math.random() * 21.0D) - 10;
				local64 = (int) (Math.random() * 21.0D) - 10;
				Static74.aClass3_Sub1_Sub4_Sub2_26.method1734();
				local71 = (int) (Math.random() * 21.0D) - 10;
				local75 = (int) (Math.random() * 41.0D) - 20;
				for (@Pc(845) int local845 = 0; local845 < Static17.aClass3_Sub1_Sub4_Sub2Array1.length; local845++) {
					Static17.aClass3_Sub1_Sub4_Sub2Array1[local845].method1730(local75 + local56, local64 - -local75, local71 + local75);
				}
				Static48.aClass3_Sub1_Sub4_Sub3Array3[0].method1772(local75 + local56, local75 + local64, local75 + local71);
				Static88.anInt2035 = 70;
				Static95.aClass4_1253 = Static106.aClass4_1473;
				Static107.anInt2692 = 85;
			}
		} else if (Static107.anInt2692 == 85) {
			local21 = Static101.method1673(Static31.aClass64_Sub1_8);
			local56 = Static16.method232();
			if (local21 < local56) {
				Static95.aClass4_1253 = Static60.method1012(new Class4[] { Static70.aClass4_878, Static93.method1632(local21 * 100 / local56), Static31.aClass4_452 });
				Static88.anInt2035 = 80;
			} else {
				Static107.anInt2692 = 90;
				Static95.aClass4_1253 = Static100.aClass4_1352;
				Static88.anInt2035 = 80;
			}
		} else if (Static107.anInt2692 == 90) {
			if (Static74.aClass64_Sub1_16.method1627()) {
				@Pc(983) Class44 local983 = new Class44(Static74.aClass64_Sub1_16, Static31.aClass64_Sub1_8, 20, 0.8D, Static36.aBoolean70 ? 64 : 128);
				Static99.method1599(local983);
				Static99.method1591(0.8D);
				Static107.anInt2692 = 110;
				Static88.anInt2035 = 90;
				Static95.aClass4_1253 = Static111.aClass4_1556;
			} else {
				Static95.aClass4_1253 = Static60.method1012(new Class4[] { Static42.aClass4_564, Static93.method1632(Static74.aClass64_Sub1_16.method1649()), Static31.aClass4_452 });
				Static88.anInt2035 = 90;
			}
		} else if (Static107.anInt2692 == 110) {
			Static28.aClass37_1 = new Class37();
			Static24.aClass2_1.method13(10, Static28.aClass37_1);
			Static107.anInt2692 = 120;
			Static95.aClass4_1253 = Static7.aClass4_132;
			Static88.anInt2035 = 94;
		} else if (Static107.anInt2692 == 120) {
			if (Static67.aClass64_Sub1_12.method1614(Static55.aClass4_711, Static113.aClass4_1604)) {
				@Pc(1048) Class29 local1048 = new Class29(Static67.aClass64_Sub1_12.method1622(Static55.aClass4_711, Static113.aClass4_1604));
				Static23.method305(local1048);
				Static95.aClass4_1253 = Static7.aClass4_135;
				Static107.anInt2692 = 130;
				Static88.anInt2035 = 96;
			} else {
				Static95.aClass4_1253 = Static60.method1012(new Class4[] { Static67.aClass4_843, Static20.aClass4_249 });
				Static88.anInt2035 = 96;
			}
		} else if (Static107.anInt2692 == 130) {
			if (!Static74.aClass64_Sub1_17.method1627()) {
				Static95.aClass4_1253 = Static60.method1012(new Class4[] { Static86.aClass4_1129, Static93.method1632(Static74.aClass64_Sub1_17.method1649() * 4 / 5), Static31.aClass4_452 });
				Static88.anInt2035 = 100;
			} else if (Static96.aClass64_Sub1_14.method1627()) {
				Static107.anInt2692 = 140;
				Static88.anInt2035 = 100;
				Static95.aClass4_1253 = Static17.aClass4_202;
			} else {
				Static95.aClass4_1253 = Static60.method1012(new Class4[] { Static86.aClass4_1129, Static93.method1632(Static96.aClass64_Sub1_14.method1649() / 5 + 80), Static31.aClass4_452 });
				Static88.anInt2035 = 100;
			}
		} else if (Static107.anInt2692 == 140) {
			Static60.method1007(10);
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
	public static void method802() {
		if (Static53.aClass31_6 != null) {
			Static53.aClass31_6.method717();
			Static53.aClass31_6 = null;
		}
		Static7.method170();
		Static38.aClass61_30.method1310();
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			Static12.aClass40Array1[local18].method882();
		}
		System.gc();
		Static67.method1111();
		Static103.anInt2538 = -1;
		Static85.anInt1992 = 0;
		Static36.method712();
		Static60.method1007(10);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!vd;ILclient!vd;)V")
	public static void method803(@OriginalArg(0) Class3_Sub1_Sub4_Sub4 arg0, @OriginalArg(2) Class3_Sub1_Sub4_Sub4 arg1) {
		Static95.aClass25_118.method1157();
		if (Static20.anInt479 == 0 || Static20.anInt479 == 5) {
			arg0.method1869(Static75.aClass4_1001, 180, 54, 16777215);
			Static50.method1849(28, 62, 304, 34, 9179409);
			Static50.method1849(29, 63, 302, 32, 0);
			Static50.method1840(30, 64, Static88.anInt2035 * 3, 30, 9179409);
			Static50.method1840(Static88.anInt2035 * 3 + 30, 64, 300 - Static88.anInt2035 * 3, 30, 0);
			arg0.method1869(Static95.aClass4_1253, 180, 85, 16777215);
		}
		@Pc(90) byte local90;
		@Pc(98) int local98;
		if (Static20.anInt479 == 20) {
			Static112.aClass3_Sub1_Sub4_Sub3_47.method1771(0, 0);
			local90 = 40;
			arg0.method1852(Static95.aClass4_1257, 180, 40, 16776960, true);
			local98 = local90 + 15;
			arg0.method1852(Static95.aClass4_1255, 180, 55, 16776960, true);
			@Pc(106) int local106 = local98 + 15;
			arg0.method1852(Static95.aClass4_1252, 180, 70, 16776960, true);
			@Pc(114) int local114 = local106 + 15;
			@Pc(115) int local115 = local114 + 10;
			arg0.method1868(Static60.method1012(new Class4[] { Static93.aClass4_1339, Static95.aClass4_1260 }), 90, 95, 16777215, true);
			@Pc(134) int local134 = local115 + 15;
			arg0.method1868(Static60.method1012(new Class4[] { Static58.aClass4_737, Static95.aClass4_1256.method119() }), 92, 110, 16777215, true);
			@Pc(155) int local155 = local134 + 15;
		}
		if (Static20.anInt479 == 10) {
			Static112.aClass3_Sub1_Sub4_Sub3_47.method1771(0, 0);
			if (Static73.anInt1759 == 0) {
				local90 = 80;
				arg0.method1852(Static8.aClass4_157, 180, 80, 16776960, true);
				local98 = local90 + 30;
				Static49.aClass3_Sub1_Sub4_Sub3_16.method1771(27, 100);
				arg0.method1857(Static87.aClass4_741, 27, 100, 144, 40, 16777215, true, 1, 1, 0);
				Static49.aClass3_Sub1_Sub4_Sub3_16.method1771(187, 100);
				arg0.method1857(Static66.aClass4_837, 187, 100, 144, 40, 16777215, true, 1, 1, 0);
			} else if (Static73.anInt1759 == 2) {
				local90 = 40;
				arg0.method1852(Static95.aClass4_1257, 180, 40, 16776960, true);
				local98 = local90 + 15;
				arg0.method1852(Static95.aClass4_1255, 180, 55, 16776960, true);
				local98 += 15;
				arg0.method1852(Static95.aClass4_1252, 180, 70, 16776960, true);
				local98 += 15;
				local98 += 10;
				arg0.method1868(Static60.method1012(new Class4[] { Static93.aClass4_1339, Static95.aClass4_1260, Static8.anInt304 == 0 & Static60.anInt1489 % 40 < 20 ? Static53.aClass4_1363 : Static95.aClass4_1258 }), 90, 95, 16777215, true);
				local98 += 15;
				arg0.method1868(Static60.method1012(new Class4[] { Static58.aClass4_737, Static95.aClass4_1256.method119(), Static60.anInt1489 % 40 < 20 & Static8.anInt304 == 1 ? Static53.aClass4_1363 : Static95.aClass4_1258 }), 92, 110, 16777215, true);
				Static49.aClass3_Sub1_Sub4_Sub3_16.method1771(27, 130);
				arg0.method1852(Static66.aClass4_838, 100, 155, 16777215, true);
				local98 += 15;
				Static49.aClass3_Sub1_Sub4_Sub3_16.method1771(187, 130);
				arg0.method1852(Static86.aClass4_1122, 260, 155, 16777215, true);
			} else if (Static73.anInt1759 == 3) {
				arg0.method1852(Static6.aClass4_122, 180, 40, 16776960, true);
				local90 = 65;
				arg0.method1852(Static32.aClass4_459, 180, 65, 16777215, true);
				local98 = local90 + 15;
				arg0.method1852(Static13.aClass4_190, 180, 80, 16777215, true);
				local98 += 15;
				arg0.method1852(Static51.aClass4_664, 180, 95, 16777215, true);
				local98 += 15;
				arg0.method1852(Static52.aClass4_672, 180, 110, 16777215, true);
				local98 += 15;
				Static49.aClass3_Sub1_Sub4_Sub3_16.method1771(107, 130);
				arg0.method1852(Static86.aClass4_1122, 180, 155, 16777215, true);
			}
		}
		Static106.method1805();
		try {
			@Pc(462) Graphics local462 = Static9.aCanvas1.getGraphics();
			Static95.aClass25_118.method1161(171, local462, 202);
			Static11.aClass25_155.method1161(0, local462, 0);
			aClass25_54.method1161(0, local462, 637);
			if (Static103.aBoolean216) {
				Static103.aBoolean216 = false;
				Static13.aClass25_22.method1161(0, local462, 128);
				Static34.aClass25_47.method1161(371, local462, 202);
				Static89.aClass25_105.method1161(265, local462, 0);
				Static21.aClass25_26.method1161(265, local462, 562);
				Static18.aClass25_25.method1161(171, local462, 128);
				Static8.aClass25_19.method1161(171, local462, 562);
			}
		} catch (@Pc(527) Exception local527) {
			Static9.aCanvas1.repaint();
		}
	}
}
