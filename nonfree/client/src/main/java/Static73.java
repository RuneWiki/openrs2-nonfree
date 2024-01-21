import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!p", name = "C", descriptor = "[I")
	public static int[] anIntArray238;

	@OriginalMember(owner = "client!p", name = "N", descriptor = "[Lclient!hd;")
	public static Class1_Sub1_Sub6_Sub1[] aClass1_Sub1_Sub6_Sub1Array6;

	@OriginalMember(owner = "client!p", name = "W", descriptor = "Lclient!ia;")
	public static Class26 aClass26_1;

	@OriginalMember(owner = "client!p", name = "Z", descriptor = "Lclient!rb;")
	public static Class55 aClass55_31;

	@OriginalMember(owner = "client!p", name = "ab", descriptor = "I")
	public static int anInt2051;

	@OriginalMember(owner = "client!p", name = "L", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1203 = Static15.method178("Use");

	@OriginalMember(owner = "client!p", name = "E", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1201 = aClass23_1203;

	@OriginalMember(owner = "client!p", name = "I", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1202 = Static15.method178("redstone3");

	@OriginalMember(owner = "client!p", name = "U", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1204 = Static15.method178("Lade Spiel)2Fenster )2 ");

	@OriginalMember(owner = "client!p", name = "bb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1205 = Static15.method178("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!gd;Lclient!gd;BLclient!gd;)V")
	public static void method1308(@OriginalArg(0) Class23 arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(3) Class23 arg2) {
		Static76.aClass23_1216 = arg0;
		Static76.aClass23_1211 = arg2;
		Static76.aClass23_1214 = arg1;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ZII)Lclient!gd;")
	public static Class23 method1309(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg0 - arg1;
		if (local13 < -9) {
			return Static21.aClass23_388;
		} else if (local13 < -6) {
			return Static18.aClass23_290;
		} else if (local13 < -3) {
			return Static10.aClass23_169;
		} else if (local13 < 0) {
			return Static20.aClass23_379;
		} else if (local13 > 9) {
			return Static55.aClass23_928;
		} else if (local13 > 6) {
			return Static41.aClass23_758;
		} else if (local13 > 3) {
			return Static7.aClass23_147;
		} else if (local13 > 0) {
			return Static94.aClass23_1400;
		} else {
			return Static19.aClass23_311;
		}
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V")
	public static void method1310() {
		@Pc(20) int local20;
		if (Static82.anInt2315 == 0) {
			Static19.aClass65_1 = new Class65(4, 104, 104, Static72.anIntArrayArrayArray5);
			for (local20 = 0; local20 < 4; local20++) {
				Static45.aClass50Array1[local20] = new Class50(104, 104);
			}
			Static31.aClass1_Sub1_Sub6_Sub1_2 = new Class1_Sub1_Sub6_Sub1(512, 512);
			Static82.anInt2315 = 20;
			Static76.aClass23_1217 = Static28.aClass23_1258;
			Static14.anInt273 = 5;
			return;
		}
		@Pc(57) int local57;
		@Pc(68) int local68;
		@Pc(74) int local74;
		@Pc(78) int local78;
		if (Static82.anInt2315 == 20) {
			@Pc(55) int[] local55 = new int[9];
			for (local57 = 0; local57 < 9; local57++) {
				local68 = local57 * 32 + 128 + 15;
				local74 = local68 * 3 + 600;
				local78 = Class1_Sub1_Sub6_Sub4.anIntArray338[local68];
				local55[local57] = local78 * local74 >> 16;
			}
			Static103.method1724(local55);
			Static76.aClass23_1217 = Static54.aClass23_904;
			Static14.anInt273 = 10;
			Static82.anInt2315 = 30;
		} else if (Static82.anInt2315 == 30) {
			Static35.aClass55_Sub1_5 = Static79.method1360(0, false, true, true);
			Static36.aClass55_Sub1_6 = Static79.method1360(1, false, true, true);
			Static18.aClass55_Sub1_2 = Static79.method1360(2, true, true, false);
			Static25.aClass55_Sub1_3 = Static79.method1360(3, false, true, true);
			Static33.aClass55_Sub1_4 = Static79.method1360(4, false, true, true);
			Static65.aClass55_Sub1_12 = Static79.method1360(5, true, true, true);
			Static42.aClass55_Sub1_7 = Static79.method1360(6, true, false, true);
			Static90.aClass55_Sub1_17 = Static79.method1360(7, false, true, true);
			Static89.aClass55_Sub1_16 = Static79.method1360(8, false, true, true);
			Static3.aClass55_Sub1_1 = Static79.method1360(9, false, true, true);
			Static87.aClass55_Sub1_18 = Static79.method1360(10, false, true, true);
			Static82.aClass55_Sub1_14 = Static79.method1360(11, false, true, true);
			Static114.aClass55_Sub1_19 = Static79.method1360(12, false, true, true);
			Static74.aClass55_Sub1_11 = Static79.method1360(13, true, true, false);
			Static82.anInt2315 = 40;
			Static14.anInt273 = 20;
			Static76.aClass23_1217 = Static11.aClass23_177;
		} else if (Static82.anInt2315 == 40) {
			local20 = Static35.aClass55_Sub1_5.method1898() * 5 / 100;
			local20 += Static36.aClass55_Sub1_6.method1898() * 5 / 100;
			local20 += Static18.aClass55_Sub1_2.method1898() * 5 / 100;
			local20 += Static25.aClass55_Sub1_3.method1898() * 5 / 100;
			local20 += Static33.aClass55_Sub1_4.method1898() * 5 / 100;
			local20 += Static65.aClass55_Sub1_12.method1898() * 5 / 100;
			local20 += Static42.aClass55_Sub1_7.method1898() * 5 / 100;
			local20 += Static90.aClass55_Sub1_17.method1898() * 40 / 100;
			local20 += Static89.aClass55_Sub1_16.method1898() * 5 / 100;
			local20 += Static3.aClass55_Sub1_1.method1898() * 3 / 100;
			local20 += Static87.aClass55_Sub1_18.method1898() * 5 / 100;
			local20 += Static82.aClass55_Sub1_14.method1898() * 5 / 100;
			local20 += Static114.aClass55_Sub1_19.method1898() * 5 / 100;
			local20 += Static74.aClass55_Sub1_11.method1898() * 2 / 100;
			if (local20 == 100) {
				Static76.aClass23_1217 = Static5.aClass23_102;
				Static82.anInt2315 = 45;
				Static14.anInt273 = 30;
			} else {
				if (local20 != 0) {
					Static76.aClass23_1217 = Static17.method233(new Class23[] { Static49.aClass23_764, Static19.method274(local20), Static16.aClass23_241 });
				}
				Static14.anInt273 = 30;
			}
		} else if (Static82.anInt2315 == 45) {
			Static20.method338(!Static9.aBoolean7, Static26.aClass54_2);
			Static15.aClass1_Sub4_Sub1_1 = Static20.method339(Static26.aClass54_2, Static26.aCanvas1);
			aClass26_1 = new Class26(22050, Static109.anInt2826);
			Static14.anInt273 = 35;
			Static76.aClass23_1217 = Static9.aClass23_165;
			Static82.anInt2315 = 50;
		} else if (Static82.anInt2315 == 50) {
			local20 = 0;
			if (Static63.aClass1_Sub1_Sub6_Sub2_10 == null) {
				Static63.aClass1_Sub1_Sub6_Sub2_10 = Static92.method1909(Static104.aClass23_1523, Static89.aClass55_Sub1_16, Static107.aClass23_1591);
			} else {
				local20++;
			}
			if (Static112.aClass1_Sub1_Sub6_Sub2_14 == null) {
				Static112.aClass1_Sub1_Sub6_Sub2_14 = Static92.method1909(Static104.aClass23_1523, Static89.aClass55_Sub1_16, Static52.aClass23_869);
			} else {
				local20++;
			}
			if (Static2.aClass1_Sub1_Sub6_Sub2_13 == null) {
				Static2.aClass1_Sub1_Sub6_Sub2_13 = Static92.method1909(Static104.aClass23_1523, Static89.aClass55_Sub1_16, Static82.aClass23_1297);
			} else {
				local20++;
			}
			if (local20 < 3) {
				Static76.aClass23_1217 = Static17.method233(new Class23[] { Static63.aClass23_1092, Static19.method274(local20 * 100 / 3), Static16.aClass23_241 });
				Static14.anInt273 = 40;
			} else {
				Static76.aClass23_1217 = Static80.aClass23_1264;
				Static14.anInt273 = 40;
				Static82.anInt2315 = 60;
			}
		} else if (Static82.anInt2315 == 60) {
			local20 = Static28.method1392(Static87.aClass55_Sub1_18, Static89.aClass55_Sub1_16);
			local57 = Static80.method1400();
			if (local20 < local57) {
				Static76.aClass23_1217 = Static17.method233(new Class23[] { Static34.aClass23_599, Static19.method274(local20 * 100 / local57), Static16.aClass23_241 });
				Static14.anInt273 = 50;
			} else {
				Static14.anInt273 = 50;
				Static76.aClass23_1217 = Static69.aClass23_1171;
				Static89.method1524(5);
				Static82.anInt2315 = 70;
			}
		} else if (Static82.anInt2315 == 70) {
			if (Static18.aClass55_Sub1_2.method1877()) {
				Static18.method253(Static18.aClass55_Sub1_2);
				Static113.method1923(Static18.aClass55_Sub1_2);
				method1311(Static18.aClass55_Sub1_2, Static90.aClass55_Sub1_17);
				Static100.method1675(Static90.aClass55_Sub1_17, Static9.aBoolean7, Static18.aClass55_Sub1_2);
				Static61.method1200(Static18.aClass55_Sub1_2, Static90.aClass55_Sub1_17);
				Static48.method984(Static90.aClass55_Sub1_17, Static37.aBoolean68, Static18.aClass55_Sub1_2, Static63.aClass1_Sub1_Sub6_Sub2_10);
				Static32.method536(Static36.aClass55_Sub1_6, Static18.aClass55_Sub1_2, Static35.aClass55_Sub1_5);
				Static77.method1340(Static90.aClass55_Sub1_17, Static18.aClass55_Sub1_2);
				Static104.method1778(Static18.aClass55_Sub1_2);
				Static40.method874(Static18.aClass55_Sub1_2);
				Static111.method1908(Static89.aClass55_Sub1_16, Static25.aClass55_Sub1_3, Static90.aClass55_Sub1_17);
				Static82.anInt2315 = 80;
				Static14.anInt273 = 60;
				Static76.aClass23_1217 = Static27.aClass23_469;
			} else {
				Static76.aClass23_1217 = Static17.method233(new Class23[] { Static79.aClass23_1227, Static19.method274(Static18.aClass55_Sub1_2.method1895()), Static16.aClass23_241 });
				Static14.anInt273 = 60;
			}
		} else if (Static82.anInt2315 == 80) {
			local20 = 0;
			if (Static46.aClass1_Sub1_Sub6_Sub1_4 == null) {
				Static46.aClass1_Sub1_Sub6_Sub1_4 = Static107.method1815(Static104.aClass23_1523, Static15.aClass23_233, Static89.aClass55_Sub1_16);
			} else {
				local20++;
			}
			if (Static113.aClass1_Sub1_Sub6_Sub1_6 == null) {
				Static113.aClass1_Sub1_Sub6_Sub1_6 = Static107.method1815(Static104.aClass23_1523, Static98.aClass23_1437, Static89.aClass55_Sub1_16);
			} else {
				local20++;
			}
			if (Static75.aClass1_Sub1_Sub6_Sub3Array8 == null) {
				Static75.aClass1_Sub1_Sub6_Sub3Array8 = Static49.method896(Static104.aClass23_1523, Static89.aClass55_Sub1_16, Static41.aClass23_757);
			} else {
				local20++;
			}
			if (Static67.aClass1_Sub1_Sub6_Sub1Array4 == null) {
				Static67.aClass1_Sub1_Sub6_Sub1Array4 = Static46.method977(Static89.aClass55_Sub1_16, Static104.aClass23_1523, Static34.aClass23_603);
			} else {
				local20++;
			}
			if (aClass1_Sub1_Sub6_Sub1Array6 == null) {
				aClass1_Sub1_Sub6_Sub1Array6 = Static46.method977(Static89.aClass55_Sub1_16, Static104.aClass23_1523, Static115.aClass23_1732);
			} else {
				local20++;
			}
			if (Static97.aClass1_Sub1_Sub6_Sub1Array9 == null) {
				Static97.aClass1_Sub1_Sub6_Sub1Array9 = Static46.method977(Static89.aClass55_Sub1_16, Static104.aClass23_1523, Static45.aClass23_820);
			} else {
				local20++;
			}
			if (Static34.aClass1_Sub1_Sub6_Sub1Array2 == null) {
				Static34.aClass1_Sub1_Sub6_Sub1Array2 = Static46.method977(Static89.aClass55_Sub1_16, Static104.aClass23_1523, Static45.aClass23_816);
			} else {
				local20++;
			}
			if (Static90.aClass1_Sub1_Sub6_Sub1Array8 == null) {
				Static90.aClass1_Sub1_Sub6_Sub1Array8 = Static46.method977(Static89.aClass55_Sub1_16, Static104.aClass23_1523, Static110.aClass23_1700);
			} else {
				local20++;
			}
			if (Static36.aClass1_Sub1_Sub6_Sub1_3 == null) {
				Static36.aClass1_Sub1_Sub6_Sub1_3 = Static107.method1815(Static104.aClass23_1523, Static115.aClass23_1730, Static89.aClass55_Sub1_16);
			} else {
				local20++;
			}
			if (Static7.aClass1_Sub1_Sub6_Sub1Array1 == null) {
				Static7.aClass1_Sub1_Sub6_Sub1Array1 = Static46.method977(Static89.aClass55_Sub1_16, Static104.aClass23_1523, Static44.aClass23_787);
			} else {
				local20++;
			}
			if (Static71.aClass1_Sub1_Sub6_Sub1Array5 == null) {
				Static71.aClass1_Sub1_Sub6_Sub1Array5 = Static46.method977(Static89.aClass55_Sub1_16, Static104.aClass23_1523, Static99.aClass23_1447);
			} else {
				local20++;
			}
			if (Static40.aClass1_Sub1_Sub6_Sub1Array3 == null) {
				Static40.aClass1_Sub1_Sub6_Sub1Array3 = Static46.method977(Static89.aClass55_Sub1_16, Static104.aClass23_1523, Static17.aClass23_257);
			} else {
				local20++;
			}
			if (Static9.aClass1_Sub1_Sub6_Sub3Array1 == null) {
				Static9.aClass1_Sub1_Sub6_Sub3Array1 = Static49.method896(Static104.aClass23_1523, Static89.aClass55_Sub1_16, Static102.aClass23_1494);
			} else {
				local20++;
			}
			if (Static45.aClass1_Sub1_Sub6_Sub3Array5 == null) {
				Static45.aClass1_Sub1_Sub6_Sub3Array5 = Static49.method896(Static104.aClass23_1523, Static89.aClass55_Sub1_16, Static66.aClass23_1128);
			} else {
				local20++;
			}
			if (local20 < 14) {
				Static76.aClass23_1217 = Static17.method233(new Class23[] { Static56.aClass23_934, Static19.method274(local20 * 100 / 14), Static16.aClass23_241 });
				Static14.anInt273 = 70;
			} else {
				Static113.aClass1_Sub1_Sub6_Sub1_6.method784();
				local57 = (int) (Math.random() * 21.0D) - 10;
				local68 = (int) (Math.random() * 21.0D) - 10;
				local74 = (int) (Math.random() * 21.0D) - 10;
				local78 = (int) (Math.random() * 41.0D) - 20;
				for (@Pc(893) int local893 = 0; local893 < Static67.aClass1_Sub1_Sub6_Sub1Array4.length; local893++) {
					Static67.aClass1_Sub1_Sub6_Sub1Array4[local893].method779(local57 + local78, local68 + local78, local74 + local78);
				}
				Static75.aClass1_Sub1_Sub6_Sub3Array8[0].method1193(local78 + local57, local78 + local68, local78 + local74);
				Static82.anInt2315 = 85;
				Static76.aClass23_1217 = Static64.aClass23_1108;
				Static14.anInt273 = 70;
			}
		} else if (Static82.anInt2315 == 85) {
			local20 = Static72.method1289(Static89.aClass55_Sub1_16);
			local57 = Static90.method1540();
			if (local57 > local20) {
				Static76.aClass23_1217 = Static17.method233(new Class23[] { Static18.aClass23_283, Static19.method274(local20 * 100 / local57), Static16.aClass23_241 });
				Static14.anInt273 = 80;
			} else {
				Static76.aClass23_1217 = Static51.aClass23_866;
				Static82.anInt2315 = 90;
				Static14.anInt273 = 80;
			}
		} else if (Static82.anInt2315 == 90) {
			if (Static3.aClass55_Sub1_1.method1877()) {
				@Pc(1030) Class47 local1030 = new Class47(Static3.aClass55_Sub1_1, Static89.aClass55_Sub1_16, 20, 0.8D, Static9.aBoolean7 ? 64 : 128);
				Static93.method1604(local1030);
				Static93.method1593(0.8D);
				Static14.anInt273 = 90;
				Static82.anInt2315 = 110;
				Static76.aClass23_1217 = Static69.aClass23_1173;
			} else {
				Static76.aClass23_1217 = Static17.method233(new Class23[] { Static65.aClass23_1125, Static19.method274(Static3.aClass55_Sub1_1.method1895()), Static16.aClass23_241 });
				Static14.anInt273 = 90;
			}
		} else if (Static82.anInt2315 == 110) {
			Static57.aClass40_1 = new Class40();
			Static26.aClass54_2.method1495(10, Static57.aClass40_1);
			Static76.aClass23_1217 = Static44.aClass23_789;
			Static82.anInt2315 = 120;
			Static14.anInt273 = 94;
		} else if (Static82.anInt2315 == 120) {
			if (Static87.aClass55_Sub1_18.method1862(Static104.aClass23_1523, Static104.aClass23_1518)) {
				@Pc(1099) Class66 local1099 = new Class66(Static87.aClass55_Sub1_18.method1879(Static104.aClass23_1523, Static104.aClass23_1518));
				Static36.method732(local1099);
				Static14.anInt273 = 96;
				Static82.anInt2315 = 130;
				Static76.aClass23_1217 = Static92.aClass23_1716;
			} else {
				Static76.aClass23_1217 = Static17.method233(new Class23[] { Static62.aClass23_1057, Static21.aClass23_384 });
				Static14.anInt273 = 96;
			}
		} else if (Static82.anInt2315 == 130) {
			if (!Static25.aClass55_Sub1_3.method1877()) {
				Static76.aClass23_1217 = Static17.method233(new Class23[] { Static74.aClass23_983, Static19.method274(Static25.aClass55_Sub1_3.method1895() * 4 / 5), Static16.aClass23_241 });
				Static14.anInt273 = 100;
			} else if (!Static114.aClass55_Sub1_19.method1877()) {
				Static76.aClass23_1217 = Static17.method233(new Class23[] { Static74.aClass23_983, Static19.method274(Static114.aClass55_Sub1_19.method1895() / 6 + 80), Static16.aClass23_241 });
				Static14.anInt273 = 100;
			} else if (Static74.aClass55_Sub1_11.method1877()) {
				Static14.anInt273 = 100;
				Static76.aClass23_1217 = Static17.aClass23_256;
				Static82.anInt2315 = 140;
			} else {
				Static76.aClass23_1217 = Static17.method233(new Class23[] { Static74.aClass23_983, Static19.method274(Static74.aClass55_Sub1_11.method1895() / 20 + 96), Static16.aClass23_241 });
				Static14.anInt273 = 100;
			}
		} else if (Static82.anInt2315 == 140) {
			Static89.method1524(10);
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!rb;Lclient!rb;B)V")
	private static void method1311(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class55 arg1) {
		aClass55_31 = arg1;
		Static43.aClass55_21 = arg0;
		Static107.anInt2766 = Static43.aClass55_21.method1865(3);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!fa;B)V")
	public static void method1312(@OriginalArg(0) Class1_Sub1_Sub2_Sub1 arg0) {
		arg0.anInt2175 = 0;
		@Pc(8) int local8 = arg0.anInt2221 - Static7.anInt176;
		if (arg0.anInt2202 == 0) {
			arg0.anInt2187 = 1024;
		}
		@Pc(25) int local25 = arg0.anInt2182 * 128 + arg0.anInt2197 * 64;
		@Pc(40) int local40 = arg0.anInt2191 * 128 + arg0.anInt2197 * 64;
		arg0.anInt2196 += (local40 - arg0.anInt2196) / local8;
		arg0.anInt2232 += (local25 - arg0.anInt2232) / local8;
		if (arg0.anInt2202 == 1) {
			arg0.anInt2187 = 1536;
		}
		if (arg0.anInt2202 == 2) {
			arg0.anInt2187 = 0;
		}
		if (arg0.anInt2202 == 3) {
			arg0.anInt2187 = 512;
		}
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(I)V")
	public static void method1313() {
		anIntArray238 = null;
		aClass26_1 = null;
		aClass1_Sub1_Sub6_Sub1Array6 = null;
		aClass23_1205 = null;
		aClass23_1204 = null;
		aClass55_31 = null;
		aClass23_1202 = null;
		aClass23_1203 = null;
		aClass23_1201 = null;
	}
}
