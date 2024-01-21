import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "Lclient!ua;")
	public static Class24_Sub1 aClass24_Sub1_10;

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
	public static int anInt1737;

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "Lclient!ob;")
	public static Class55 aClass55_46 = new Class55(20);

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
	public static int anInt1735 = 127;

	@OriginalMember(owner = "client!lf", name = "l", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10 = new byte[4][104][104];

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "Lclient!je;")
	private static Class40 aClass40_856 = Static69.method1231("scrollbar");

	@OriginalMember(owner = "client!lf", name = "o", descriptor = "[I")
	public static int[] anIntArray174 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!lf", name = "p", descriptor = "Lclient!je;")
	public static Class40 aClass40_857 = Static69.method1231("<br>(X");

	@OriginalMember(owner = "client!lf", name = "q", descriptor = "Lclient!je;")
	public static Class40 aClass40_858 = Static69.method1231(")1j");

	@OriginalMember(owner = "client!lf", name = "r", descriptor = "Lclient!je;")
	public static Class40 aClass40_859 = Static69.method1231("lila:");

	@OriginalMember(owner = "client!lf", name = "s", descriptor = "Lclient!je;")
	public static Class40 aClass40_860 = Static69.method1231("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!lf", name = "t", descriptor = "Lclient!je;")
	private static Class40 aClass40_861 = Static69.method1231("0(U");

	@OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
	public static int anInt1743 = 0;

	@OriginalMember(owner = "client!lf", name = "v", descriptor = "Lclient!je;")
	public static Class40 aClass40_862 = Static69.method1231("<col=ff0000>");

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/Object;ZB)[B")
	public static byte[] method1147(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg0;
			return arg1 ? Static53.method944(local18) : local18;
		} else if (arg0 instanceof Class44) {
			@Pc(32) Class44 local32 = (Class44) arg0;
			return local32.method1094();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	public static void method1149() {
		@Pc(17) int local17;
		if (Static84.anInt2259 == 0) {
			Static111.aClass30_1 = new Class30(4, 104, 104, Static118.anIntArrayArrayArray6);
			for (local17 = 0; local17 < 4; local17++) {
				Static70.aClass20Array1[local17] = new Class20(104, 104);
			}
			Static50.aClass2_Sub1_Sub2_Sub4_2 = new Class2_Sub1_Sub2_Sub4(512, 512);
			Static87.aClass40_669 = Static17.aClass40_266;
			Static84.anInt2259 = 20;
			Static76.anInt1982 = 5;
			return;
		}
		@Pc(56) int local56;
		@Pc(66) int local66;
		@Pc(76) int local76;
		@Pc(70) int local70;
		if (Static84.anInt2259 == 20) {
			@Pc(54) int[] local54 = new int[9];
			for (local56 = 0; local56 < 9; local56++) {
				local66 = local56 * 32 + 15 + 128;
				local70 = Class2_Sub1_Sub2_Sub2.anIntArray219[local66];
				local76 = local66 * 3 + 600;
				local54[local56] = local70 * local76 >> 16;
			}
			Static42.method756(local54);
			Static84.anInt2259 = 30;
			Static76.anInt1982 = 10;
			Static87.aClass40_669 = Static62.aClass40_833;
		} else if (Static84.anInt2259 == 30) {
			Static109.aClass24_Sub1_19 = Static134.method1096(0, false, true, true);
			Static133.aClass24_Sub1_22 = Static134.method1096(1, false, true, true);
			Static39.aClass24_Sub1_3 = Static134.method1096(2, true, true, false);
			Static122.aClass24_Sub1_18 = Static134.method1096(3, false, true, true);
			Static32.aClass24_Sub1_2 = Static134.method1096(4, false, true, true);
			Static80.aClass24_Sub1_13 = Static134.method1096(5, true, true, true);
			Static61.aClass24_Sub1_8 = Static134.method1096(6, true, false, true);
			Static76.aClass24_Sub1_12 = Static134.method1096(7, false, true, true);
			Static10.aClass24_Sub1_20 = Static134.method1096(8, false, true, true);
			Static67.aClass24_Sub1_11 = Static134.method1096(9, false, true, true);
			Static92.aClass24_Sub1_15 = Static134.method1096(10, false, true, true);
			Static105.aClass24_Sub1_17 = Static134.method1096(11, false, true, true);
			Static65.aClass24_Sub1_9 = Static134.method1096(12, false, true, true);
			aClass24_Sub1_10 = Static134.method1096(13, true, true, false);
			Static129.aClass24_Sub1_21 = Static134.method1096(14, false, false, true);
			Static60.aClass24_Sub1_7 = Static134.method1096(15, false, true, true);
			Static84.anInt2259 = 40;
			Static76.anInt1982 = 20;
			Static87.aClass40_669 = Static59.aClass40_769;
		} else if (Static84.anInt2259 == 40) {
			local17 = Static109.aClass24_Sub1_19.method1936() * 4 / 100;
			local17 += Static133.aClass24_Sub1_22.method1936() * 4 / 100;
			local17 += Static39.aClass24_Sub1_3.method1936() * 2 / 100;
			local17 += Static122.aClass24_Sub1_18.method1936() * 2 / 100;
			local17 += Static32.aClass24_Sub1_2.method1936() * 6 / 100;
			local17 += Static80.aClass24_Sub1_13.method1936() * 4 / 100;
			local17 += Static61.aClass24_Sub1_8.method1936() * 2 / 100;
			local17 += Static76.aClass24_Sub1_12.method1936() * 60 / 100;
			local17 += Static10.aClass24_Sub1_20.method1936() * 2 / 100;
			local17 += Static67.aClass24_Sub1_11.method1936() * 2 / 100;
			local17 += Static92.aClass24_Sub1_15.method1936() * 2 / 100;
			local17 += Static105.aClass24_Sub1_17.method1936() * 2 / 100;
			local17 += Static65.aClass24_Sub1_9.method1936() * 2 / 100;
			local17 += aClass24_Sub1_10.method1936() * 2 / 100;
			local17 += Static129.aClass24_Sub1_21.method1936() * 2 / 100;
			local17 += Static60.aClass24_Sub1_7.method1936() * 2 / 100;
			if (local17 == 100) {
				Static84.anInt2259 = 45;
				Static87.aClass40_669 = Static49.aClass40_650;
				Static76.anInt1982 = 30;
			} else {
				if (local17 != 0) {
					Static87.aClass40_669 = Static40.method722(new Class40[] { Static34.aClass40_473, Static49.method886(local17), Static79.aClass40_1042 });
				}
				Static76.anInt1982 = 30;
			}
		} else if (Static84.anInt2259 == 45) {
			Static14.method233(!Static34.aBoolean60);
			@Pc(451) Class2_Sub5_Sub4 local451 = new Class2_Sub5_Sub4();
			local451.method1987();
			Static32.aClass34_2 = Static123.method2067(0, Static80.aCanvas1, 22050, Static129.aClass59_5);
			Static32.aClass34_2.method2115(local451);
			Static67.method1181(local451, Static60.aClass24_Sub1_7, Static32.aClass24_Sub1_2, Static129.aClass24_Sub1_21);
			Static29.aClass34_1 = Static123.method2067(1, Static80.aCanvas1, 2048, Static129.aClass59_5);
			Static77.aClass2_Sub5_Sub1_1 = new Class2_Sub5_Sub1();
			Static29.aClass34_1.method2115(Static77.aClass2_Sub5_Sub1_1);
			Static16.aClass31_1 = new Class31(22050, Static68.anInt1863);
			Static84.anInt2259 = 50;
			Static76.anInt1982 = 35;
			Static87.aClass40_669 = Static94.aClass40_1240;
		} else if (Static84.anInt2259 == 50) {
			local17 = 0;
			if (Static95.aClass2_Sub1_Sub2_Sub3_Sub1_4 == null) {
				Static95.aClass2_Sub1_Sub2_Sub3_Sub1_4 = Static126.method2091(Static101.aClass40_1321, Static43.aClass40_568, aClass24_Sub1_10, Static10.aClass24_Sub1_20);
			} else {
				local17++;
			}
			if (Static33.aClass2_Sub1_Sub2_Sub3_Sub1_5 == null) {
				Static33.aClass2_Sub1_Sub2_Sub3_Sub1_5 = Static126.method2091(Static34.aClass40_475, Static43.aClass40_568, aClass24_Sub1_10, Static10.aClass24_Sub1_20);
			} else {
				local17++;
			}
			if (Static73.aClass2_Sub1_Sub2_Sub3_Sub1_3 == null) {
				Static73.aClass2_Sub1_Sub2_Sub3_Sub1_3 = Static126.method2091(Static130.aClass40_1609, Static43.aClass40_568, aClass24_Sub1_10, Static10.aClass24_Sub1_20);
			} else {
				local17++;
			}
			if (local17 < 3) {
				Static87.aClass40_669 = Static40.method722(new Class40[] { Static30.aClass40_431, Static49.method886(local17 * 100 / 3), Static79.aClass40_1042 });
				Static76.anInt1982 = 40;
			} else {
				Static76.anInt1982 = 40;
				Static84.anInt2259 = 60;
				Static87.aClass40_669 = Static86.aClass40_1629;
			}
		} else if (Static84.anInt2259 == 60) {
			local17 = Static111.method1869(Static92.aClass24_Sub1_15, Static10.aClass24_Sub1_20);
			local56 = method1150();
			if (local56 > local17) {
				Static87.aClass40_669 = Static40.method722(new Class40[] { Static32.aClass40_459, Static49.method886(local17 * 100 / local56), Static79.aClass40_1042 });
				Static76.anInt1982 = 50;
			} else {
				Static87.aClass40_669 = Static36.aClass40_526;
				Static76.anInt1982 = 50;
				Static21.method402(5);
				Static84.anInt2259 = 70;
			}
		} else if (Static84.anInt2259 == 70) {
			if (Static39.aClass24_Sub1_3.method1934()) {
				Static40.method725(Static39.aClass24_Sub1_3);
				Static68.method1191(Static39.aClass24_Sub1_3);
				Static33.method1910(Static39.aClass24_Sub1_3, Static76.aClass24_Sub1_12);
				Static95.method1756(Static34.aBoolean60, Static76.aClass24_Sub1_12, Static39.aClass24_Sub1_3);
				Static63.method293(Static39.aClass24_Sub1_3, Static76.aClass24_Sub1_12);
				Static83.method1490(Static92.aBoolean184, Static39.aClass24_Sub1_3, Static76.aClass24_Sub1_12, Static95.aClass2_Sub1_Sub2_Sub3_Sub1_4);
				Static120.method2027(Static133.aClass24_Sub1_22, Static39.aClass24_Sub1_3, Static109.aClass24_Sub1_19);
				Static69.method1233(Static39.aClass24_Sub1_3, Static76.aClass24_Sub1_12);
				Static122.method2060(Static39.aClass24_Sub1_3);
				Static59.method1039(Static39.aClass24_Sub1_3);
				Static8.method185(Static122.aClass24_Sub1_18, Static10.aClass24_Sub1_20, Static76.aClass24_Sub1_12, aClass24_Sub1_10);
				Static77.method1342(Static39.aClass24_Sub1_3);
				Static41.method731(Static39.aClass24_Sub1_3);
				Static76.anInt1982 = 60;
				Static87.aClass40_669 = Static3.aClass40_75;
				Static84.anInt2259 = 80;
			} else {
				Static87.aClass40_669 = Static40.method722(new Class40[] { Static28.aClass40_405, Static49.method886(Static39.aClass24_Sub1_3.method1943()), Static79.aClass40_1042 });
				Static76.anInt1982 = 60;
			}
		} else if (Static84.anInt2259 == 80) {
			local17 = 0;
			if (Static23.aClass2_Sub1_Sub2_Sub4_1 == null) {
				Static23.aClass2_Sub1_Sub2_Sub4_1 = Static133.method2223(Static10.aClass24_Sub1_20, Static26.aClass40_393, Static43.aClass40_568);
			} else {
				local17++;
			}
			if (Static106.aClass2_Sub1_Sub2_Sub4_5 == null) {
				Static106.aClass2_Sub1_Sub2_Sub4_5 = Static133.method2223(Static10.aClass24_Sub1_20, Static51.aClass40_692, Static43.aClass40_568);
			} else {
				local17++;
			}
			if (Static24.aClass2_Sub1_Sub2_Sub1Array103 == null) {
				Static24.aClass2_Sub1_Sub2_Sub1Array103 = Static46.method828(Static43.aClass40_568, Static10.aClass24_Sub1_20, Static38.aClass40_532);
			} else {
				local17++;
			}
			if (Static10.aClass2_Sub1_Sub2_Sub4Array14 == null) {
				Static10.aClass2_Sub1_Sub2_Sub4Array14 = Static14.method229(Static127.aClass40_1595, Static43.aClass40_568, Static10.aClass24_Sub1_20);
			} else {
				local17++;
			}
			if (Static25.aClass2_Sub1_Sub2_Sub4Array3 == null) {
				Static25.aClass2_Sub1_Sub2_Sub4Array3 = Static14.method229(Static64.aClass40_851, Static43.aClass40_568, Static10.aClass24_Sub1_20);
			} else {
				local17++;
			}
			if (Static64.aClass2_Sub1_Sub2_Sub4Array12 == null) {
				Static64.aClass2_Sub1_Sub2_Sub4Array12 = Static14.method229(Static2.aClass40_73, Static43.aClass40_568, Static10.aClass24_Sub1_20);
			} else {
				local17++;
			}
			if (Static62.aClass2_Sub1_Sub2_Sub4Array11 == null) {
				Static62.aClass2_Sub1_Sub2_Sub4Array11 = Static14.method229(Static124.aClass40_1559, Static43.aClass40_568, Static10.aClass24_Sub1_20);
			} else {
				local17++;
			}
			if (Static50.aClass2_Sub1_Sub2_Sub4Array8 == null) {
				Static50.aClass2_Sub1_Sub2_Sub4Array8 = Static14.method229(Static122.aClass40_1541, Static43.aClass40_568, Static10.aClass24_Sub1_20);
			} else {
				local17++;
			}
			if (Static13.aClass2_Sub1_Sub2_Sub4Array2 == null) {
				Static13.aClass2_Sub1_Sub2_Sub4Array2 = Static14.method229(Static120.aClass40_1521, Static43.aClass40_568, Static10.aClass24_Sub1_20);
			} else {
				local17++;
			}
			if (Static109.aClass2_Sub1_Sub2_Sub4Array13 == null) {
				Static109.aClass2_Sub1_Sub2_Sub4Array13 = Static14.method229(Static117.aClass40_1476, Static43.aClass40_568, Static10.aClass24_Sub1_20);
			} else {
				local17++;
			}
			if (Static57.aClass2_Sub1_Sub2_Sub4Array10 == null) {
				Static57.aClass2_Sub1_Sub2_Sub4Array10 = Static14.method229(Static54.aClass40_719, Static43.aClass40_568, Static10.aClass24_Sub1_20);
			} else {
				local17++;
			}
			if (Static15.aClass2_Sub1_Sub2_Sub1Array16 == null) {
				Static15.aClass2_Sub1_Sub2_Sub1Array16 = Static46.method828(Static43.aClass40_568, Static10.aClass24_Sub1_20, aClass40_856);
			} else {
				local17++;
			}
			if (Static99.aClass2_Sub1_Sub2_Sub1Array85 == null) {
				Static99.aClass2_Sub1_Sub2_Sub1Array85 = Static46.method828(Static43.aClass40_568, Static10.aClass24_Sub1_20, Static14.aClass40_219);
			} else {
				local17++;
			}
			if (Static38.aClass2_Sub1_Sub2_Sub1_7 == null) {
				Static38.aClass2_Sub1_Sub2_Sub1_7 = Static47.method863(Static43.aClass40_568, Static72.aClass40_945, Static10.aClass24_Sub1_20);
			} else {
				local17++;
			}
			if (local17 < 14) {
				Static87.aClass40_669 = Static40.method722(new Class40[] { Static122.aClass40_1538, Static49.method886(local17 * 100 / 14), Static79.aClass40_1042 });
				Static76.anInt1982 = 70;
			} else {
				Static82.aClass2_Sub1_Sub2_Sub1Array70 = Static99.aClass2_Sub1_Sub2_Sub1Array85;
				Static106.aClass2_Sub1_Sub2_Sub4_5.method1709();
				local56 = (int) (Math.random() * 21.0D) - 10;
				local66 = (int) (Math.random() * 21.0D) - 10;
				local76 = (int) (Math.random() * 21.0D) - 10;
				local70 = (int) (Math.random() * 41.0D) - 20;
				for (@Pc(961) int local961 = 0; local961 < Static10.aClass2_Sub1_Sub2_Sub4Array14.length; local961++) {
					Static10.aClass2_Sub1_Sub2_Sub4Array14[local961].method1707(local56 + local70, local70 + local66, local76 + local70);
				}
				Static24.aClass2_Sub1_Sub2_Sub1Array103[0].method1085(local70 + local56, local70 + local66, local70 + local76);
				Static7.method174();
				Static76.anInt1982 = 70;
				Static87.aClass40_669 = Static28.aClass40_399;
				Static84.anInt2259 = 90;
			}
		} else if (Static84.anInt2259 == 90) {
			if (Static67.aClass24_Sub1_11.method1934()) {
				@Pc(1051) Class42 local1051 = new Class42(Static67.aClass24_Sub1_11, Static10.aClass24_Sub1_20, 20, 0.8D, Static34.aBoolean60 ? 64 : 128);
				Static78.method1378(local1051);
				Static78.method1383(0.8D);
				Static84.anInt2259 = 110;
				Static76.anInt1982 = 90;
				Static87.aClass40_669 = Static79.aClass40_1039;
			} else {
				Static87.aClass40_669 = Static40.method722(new Class40[] { Static21.aClass40_365, Static49.method886(Static67.aClass24_Sub1_11.method1943()), Static79.aClass40_1042 });
				Static76.anInt1982 = 90;
			}
		} else if (Static84.anInt2259 == 110) {
			Static114.aClass61_1 = new Class61();
			Static129.aClass59_5.method1638(10, Static114.aClass61_1);
			Static84.anInt2259 = 120;
			Static76.anInt1982 = 94;
			Static87.aClass40_669 = Static134.aClass40_808;
		} else if (Static84.anInt2259 == 120) {
			if (Static92.aClass24_Sub1_15.method1920(Static43.aClass40_568, Static48.aClass40_638)) {
				@Pc(1120) Class19 local1120 = new Class19(Static92.aClass24_Sub1_15.method1933(Static43.aClass40_568, Static48.aClass40_638));
				Static48.method869(local1120);
				Static87.aClass40_669 = Static62.aClass40_830;
				Static76.anInt1982 = 96;
				Static84.anInt2259 = 130;
			} else {
				Static87.aClass40_669 = Static40.method722(new Class40[] { Static107.aClass40_1366, aClass40_861 });
				Static76.anInt1982 = 96;
			}
		} else if (Static84.anInt2259 == 130) {
			if (!Static122.aClass24_Sub1_18.method1934()) {
				Static87.aClass40_669 = Static40.method722(new Class40[] { Static97.aClass40_1282, Static49.method886(Static122.aClass24_Sub1_18.method1943() * 4 / 5), Static79.aClass40_1042 });
				Static76.anInt1982 = 100;
			} else if (!Static65.aClass24_Sub1_9.method1934()) {
				Static87.aClass40_669 = Static40.method722(new Class40[] { Static97.aClass40_1282, Static49.method886(Static65.aClass24_Sub1_9.method1943() / 6 + 80), Static79.aClass40_1042 });
				Static76.anInt1982 = 100;
			} else if (aClass24_Sub1_10.method1934()) {
				Static84.anInt2259 = 140;
				Static87.aClass40_669 = Static125.aClass40_1562;
				Static76.anInt1982 = 100;
			} else {
				Static87.aClass40_669 = Static40.method722(new Class40[] { Static97.aClass40_1282, Static49.method886(aClass24_Sub1_10.method1943() / 20 + 96), Static79.aClass40_1042 });
				Static76.anInt1982 = 100;
			}
		} else if (Static84.anInt2259 == 140) {
			Static21.method402(10);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)I")
	private static int method1150() {
		return 6;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)[Lclient!qb;")
	public static Class2_Sub1_Sub2_Sub4[] method1151() {
		@Pc(9) Class2_Sub1_Sub2_Sub4[] local9 = new Class2_Sub1_Sub2_Sub4[Static12.anInt3050];
		for (@Pc(11) int local11 = 0; local11 < Static12.anInt3050; local11++) {
			@Pc(21) Class2_Sub1_Sub2_Sub4 local21 = local9[local11] = new Class2_Sub1_Sub2_Sub4();
			local21.anInt2387 = Static10.anInt2972;
			local21.anInt2388 = Static16.anInt410;
			local21.anInt2390 = Static3.anIntArray5[local11];
			local21.anInt2389 = Static105.anIntArray287[local11];
			local21.anInt2386 = Static3.anIntArray6[local11];
			local21.anInt2385 = Static57.anIntArray149[local11];
			@Pc(53) int local53 = local21.anInt2385 * local21.anInt2386;
			@Pc(57) byte[] local57 = Static127.aByteArrayArray9[local11];
			local21.anIntArray259 = new int[local53];
			for (@Pc(63) int local63 = 0; local63 < local53; local63++) {
				local21.anIntArray259[local63] = Static69.anIntArray205[local57[local63] & 0xFF];
			}
		}
		Static126.method2088();
		return local9;
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
	public static void method1152() {
		aClass40_862 = null;
		aClass24_Sub1_10 = null;
		aClass55_46 = null;
		aClass40_856 = null;
		anIntArray174 = null;
		aByteArrayArrayArray10 = null;
		aClass40_859 = null;
		aClass40_860 = null;
		aClass40_861 = null;
		aClass40_858 = null;
		aClass40_857 = null;
	}
}
