import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!df", name = "e", descriptor = "Lclient!dd;")
	public static Class19 aClass19_23 = new Class19(50);

	@OriginalMember(owner = "client!df", name = "g", descriptor = "[I")
	public static int[] anIntArray84 = new int[5];

	@OriginalMember(owner = "client!df", name = "i", descriptor = "[I")
	public static int[] anIntArray85 = new int[100];

	@OriginalMember(owner = "client!df", name = "n", descriptor = "I")
	public static volatile int anInt675 = 0;

	@OriginalMember(owner = "client!df", name = "o", descriptor = "[Lclient!rd;")
	public static Class64[] aClass64Array8 = new Class64[100];

	@OriginalMember(owner = "client!df", name = "u", descriptor = "Lclient!rd;")
	public static Class64 aClass64_398 = Static69.method1153("Hierhin gehen");

	@OriginalMember(owner = "client!df", name = "v", descriptor = "[Z")
	public static boolean[] aBooleanArray4 = new boolean[5];

	@OriginalMember(owner = "client!df", name = "w", descriptor = "Lclient!rd;")
	public static Class64 aClass64_399 = Static69.method1153("An:");

	@OriginalMember(owner = "client!df", name = "x", descriptor = "[I")
	public static int[] anIntArray88 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!df", name = "y", descriptor = "I")
	public static volatile int anInt680 = -1;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "([BIII)Lclient!rd;")
	public static Class64 method428(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class64 local9 = new Class64();
		local9.anInt2086 = 0;
		local9.aByteArray24 = new byte[arg1];
		for (@Pc(18) int local18 = arg2; local18 < arg2 + arg1; local18++) {
			if (arg0[local18] != 0) {
				local9.aByteArray24[local9.anInt2086++] = arg0[local18];
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIBLclient!bd;)V")
	public static void method429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class1_Sub1_Sub3 arg4) {
		@Pc(7) Class1_Sub7 local7 = new Class1_Sub7();
		local7.anInt1220 = arg4.anInt377;
		local7.anInt1226 = arg4.anInt413;
		local7.anInt1233 = arg4.anInt408 * 128;
		local7.anIntArray168 = arg4.anIntArray60;
		local7.anInt1232 = arg2;
		local7.anInt1230 = arg4.anInt383;
		@Pc(40) int local40 = arg4.anInt411;
		local7.anInt1234 = arg3 * 128;
		@Pc(48) int local48 = arg4.anInt420;
		if (arg1 == 1 || arg1 == 3) {
			local48 = arg4.anInt411;
			local40 = arg4.anInt420;
		}
		local7.anInt1225 = (arg0 + local40) * 128;
		local7.anInt1235 = (arg3 + local48) * 128;
		local7.anInt1223 = arg0 * 128;
		if (arg4.anIntArray61 != null) {
			local7.aClass1_Sub1_Sub3_1 = arg4;
			local7.method930();
		}
		Static91.aClass50_10.method1142(local7);
		if (local7.anIntArray168 != null) {
			local7.anInt1228 = local7.anInt1220 + (int) ((double) (local7.anInt1230 - local7.anInt1220) * Math.random());
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIB)V")
	public static void method430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < 100; local14++) {
			if (Static120.aClass64Array19[local14] != null) {
				@Pc(32) int local32 = Static43.anInt986 + 70 + 4 - local12 * 14;
				@Pc(36) int local36 = anIntArray85[local14];
				if (local32 < -20) {
					break;
				}
				if (local36 == 0) {
					local12++;
				}
				@Pc(49) Class64 local49 = aClass64Array8[local14];
				if (local49 != null && local49.method1479(Static41.aClass64_1692)) {
					local49 = local49.method1481(5);
				}
				if (local49 != null && local49.method1479(Static66.aClass64_949)) {
					local49 = local49.method1481(5);
				}
				if ((local36 == 1 || local36 == 2) && (local36 == 1 || Static10.anInt406 == 0 || Static10.anInt406 == 1 && Static19.method394(local49))) {
					if (local32 - 14 < arg1 && arg1 <= local32 && !local49.method1496(Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass64_1543)) {
						if (Static46.anInt1085 >= 1) {
							Static2.method63(0, Static82.method1383(new Class64[] { Static106.aClass64_1610, local49 }), 0, 17, Static68.aClass64_962, 0);
						}
						Static2.method63(0, Static82.method1383(new Class64[] { Static106.aClass64_1610, local49 }), 0, 2, Static113.aClass64_1114, 0);
						Static2.method63(0, Static82.method1383(new Class64[] { Static106.aClass64_1610, local49 }), 0, 7, Static42.aClass64_616, 0);
					}
					local12++;
				}
				if ((local36 == 3 || local36 == 7) && Static21.anInt649 == 0 && (local36 == 7 || Static108.anInt2556 == 0 || Static108.anInt2556 == 1 && Static19.method394(local49))) {
					local12++;
					if (local32 - 14 < arg1 && local32 >= arg1) {
						if (Static46.anInt1085 >= 1) {
							Static2.method63(0, Static82.method1383(new Class64[] { Static106.aClass64_1610, local49 }), 0, 17, Static68.aClass64_962, 0);
						}
						Static2.method63(0, Static82.method1383(new Class64[] { Static106.aClass64_1610, local49 }), 0, 2, Static113.aClass64_1114, 0);
						Static2.method63(0, Static82.method1383(new Class64[] { Static106.aClass64_1610, local49 }), 0, 7, Static42.aClass64_616, 0);
					}
				}
				if (local36 == 4 && (Static80.anInt1901 == 0 || Static80.anInt1901 == 1 && Static19.method394(local49))) {
					local12++;
					if (local32 - 14 < arg1 && arg1 <= local32) {
						Static2.method63(0, Static82.method1383(new Class64[] { Static106.aClass64_1610, local49 }), 0, 22, Static55.aClass64_1809, 0);
					}
				}
				if ((local36 == 5 || local36 == 6) && Static21.anInt649 == 0 && Static108.anInt2556 < 2) {
					local12++;
				}
				if (local36 == 8 && (Static80.anInt1901 == 0 || Static80.anInt1901 == 1 && Static19.method394(local49))) {
					local12++;
					if (arg1 > local32 - 14 && arg1 <= local32) {
						Static2.method63(0, Static82.method1383(new Class64[] { Static106.aClass64_1610, local49 }), 0, 27, Static113.aClass64_1112, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V")
	public static void method431() {
		aClass64Array8 = null;
		anIntArray85 = null;
		anIntArray84 = null;
		aClass64_398 = null;
		aClass64_399 = null;
		aBooleanArray4 = null;
		aClass19_23 = null;
		anIntArray88 = null;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIILclient!he;)V")
	public static void method432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub1_Sub5_Sub2 arg2) {
		@Pc(15) int local15 = arg1 * arg1 + arg0 * arg0;
		if (local15 <= 4225 || local15 >= 90000) {
			Static65.method1110(arg1, arg2, arg0);
			return;
		}
		@Pc(35) int local35 = Static57.anInt1289 + Static75.anInt1770 & 0x7FF;
		@Pc(39) int local39 = Class1_Sub1_Sub5_Sub4.anIntArray427[local35];
		@Pc(43) int local43 = Class1_Sub1_Sub5_Sub4.anIntArray429[local35];
		@Pc(51) int local51 = local43 * 256 / (Static39.anInt912 + 256);
		@Pc(59) int local59 = local39 * 256 / (Static39.anInt912 + 256);
		@Pc(70) int local70 = local51 * arg1 - arg0 * local59 >> 16;
		@Pc(80) int local80 = arg1 * local59 + arg0 * local51 >> 16;
		@Pc(86) double local86 = Math.atan2((double) local80, (double) local70);
		@Pc(92) int local92 = (int) (Math.sin(local86) * 63.0D);
		@Pc(98) int local98 = (int) (Math.cos(local86) * 57.0D);
		Static54.aClass1_Sub1_Sub5_Sub2_7.method766(local92 + 88, -local98 + 83 + -20, local86);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/awt/Component;ZLclient!pb;)V")
	public static void method433(@OriginalArg(0) Component arg0, @OriginalArg(2) Class41 arg1) {
		if (Static12.aBoolean120) {
			return;
		}
		Static73.aClass1_Sub1_Sub5_Sub3_13 = Static38.method682(Static64.aClass64_922, arg1, Static28.aClass64_1529);
		Static19.aClass1_Sub1_Sub5_Sub3_3 = Static38.method682(Static52.aClass64_1824, arg1, Static28.aClass64_1529);
		Static40.aClass1_Sub1_Sub5_Sub3_6 = Static38.method682(Static60.aClass64_858, arg1, Static28.aClass64_1529);
		Static118.aClass1_Sub1_Sub5_Sub3_19 = Static38.method682(Static18.aClass64_349, arg1, Static28.aClass64_1529);
		Static61.aClass1_Sub1_Sub5_Sub3_11 = Static38.method682(Static21.aClass64_383, arg1, Static28.aClass64_1529);
		Static84.aClass1_Sub1_Sub5_Sub3_15 = Static38.method682(Static121.aClass64_1846, arg1, Static28.aClass64_1529);
		Static110.aClass37_36 = Static55.method2074(479, 96, arg0);
		Static19.aClass1_Sub1_Sub5_Sub3_3.method1290(0, 0);
		Static96.aClass37_38 = Static55.method2074(172, 156, arg0);
		Static47.method1948();
		Static40.aClass1_Sub1_Sub5_Sub3_6.method1290(0, 0);
		Static46.aClass37_15 = Static55.method2074(190, 261, arg0);
		Static73.aClass1_Sub1_Sub5_Sub3_13.method1290(0, 0);
		Static99.aClass37_31 = Static55.method2074(512, 334, arg0);
		Static47.method1948();
		Static9.aClass37_4 = Static55.method2074(496, 50, arg0);
		Static20.aClass37_10 = Static55.method2074(269, 37, arg0);
		Static57.aClass37_18 = Static55.method2074(249, 45, arg0);
		@Pc(110) Class1_Sub1_Sub5_Sub2 local110 = Static105.method1723(arg1, Static26.aClass64_471, Static28.aClass64_1529);
		Static62.aClass37_22 = Static55.method2074(local110.anInt1019, local110.anInt1023, arg0);
		local110.method782(0, 0);
		@Pc(128) Class1_Sub1_Sub5_Sub2 local128 = Static105.method1723(arg1, Static116.aClass64_1777, Static28.aClass64_1529);
		Static71.aClass37_25 = Static55.method2074(local128.anInt1019, local128.anInt1023, arg0);
		local128.method782(0, 0);
		@Pc(146) Class1_Sub1_Sub5_Sub2 local146 = Static105.method1723(arg1, Static70.aClass64_989, Static28.aClass64_1529);
		Static66.aClass37_24 = Static55.method2074(local146.anInt1019, local146.anInt1023, arg0);
		local146.method782(0, 0);
		@Pc(164) Class1_Sub1_Sub5_Sub2 local164 = Static105.method1723(arg1, Static84.aClass64_1224, Static28.aClass64_1529);
		Static74.aClass37_26 = Static55.method2074(local164.anInt1019, local164.anInt1023, arg0);
		local164.method782(0, 0);
		@Pc(182) Class1_Sub1_Sub5_Sub2 local182 = Static105.method1723(arg1, Static104.aClass64_1537, Static28.aClass64_1529);
		Static41.aClass37_37 = Static55.method2074(local182.anInt1019, local182.anInt1023, arg0);
		local182.method782(0, 0);
		@Pc(200) Class1_Sub1_Sub5_Sub2 local200 = Static105.method1723(arg1, Static81.aClass64_886, Static28.aClass64_1529);
		Static23.aClass37_11 = Static55.method2074(local200.anInt1019, local200.anInt1023, arg0);
		local200.method782(0, 0);
		@Pc(218) Class1_Sub1_Sub5_Sub2 local218 = Static105.method1723(arg1, Static67.aClass64_958, Static28.aClass64_1529);
		Static15.aClass37_5 = Static55.method2074(local218.anInt1019, local218.anInt1023, arg0);
		local218.method782(0, 0);
		@Pc(236) Class1_Sub1_Sub5_Sub2 local236 = Static105.method1723(arg1, Static54.aClass64_1316, Static28.aClass64_1529);
		Static45.aClass37_14 = Static55.method2074(local236.anInt1019, local236.anInt1023, arg0);
		local236.method782(0, 0);
		@Pc(254) Class1_Sub1_Sub5_Sub2 local254 = Static105.method1723(arg1, Static100.aClass64_1420, Static28.aClass64_1529);
		Static17.aClass37_6 = Static55.method2074(local254.anInt1019, local254.anInt1023, arg0);
		local254.method782(0, 0);
		Static82.aClass1_Sub1_Sub5_Sub3_14 = Static38.method682(Static14.aClass64_311, arg1, Static28.aClass64_1529);
		Static48.aClass1_Sub1_Sub5_Sub3_18 = Static38.method682(Static119.aClass64_1835, arg1, Static28.aClass64_1529);
		Static66.aClass1_Sub1_Sub5_Sub3_12 = Static38.method682(Static87.aClass64_1268, arg1, Static28.aClass64_1529);
		Static99.aClass1_Sub1_Sub5_Sub3_17 = Static82.aClass1_Sub1_Sub5_Sub3_14.method1289();
		Static99.aClass1_Sub1_Sub5_Sub3_17.method1293();
		Static2.aClass1_Sub1_Sub5_Sub3_1 = Static48.aClass1_Sub1_Sub5_Sub3_18.method1289();
		Static2.aClass1_Sub1_Sub5_Sub3_1.method1293();
		Static44.aClass1_Sub1_Sub5_Sub3_7 = Static82.aClass1_Sub1_Sub5_Sub3_14.method1289();
		Static44.aClass1_Sub1_Sub5_Sub3_7.method1291();
		Static46.aClass1_Sub1_Sub5_Sub3_8 = Static48.aClass1_Sub1_Sub5_Sub3_18.method1289();
		Static46.aClass1_Sub1_Sub5_Sub3_8.method1291();
		Static7.aClass1_Sub1_Sub5_Sub3_2 = Static66.aClass1_Sub1_Sub5_Sub3_12.method1289();
		Static7.aClass1_Sub1_Sub5_Sub3_2.method1291();
		Static49.aClass1_Sub1_Sub5_Sub3_10 = Static82.aClass1_Sub1_Sub5_Sub3_14.method1289();
		Static49.aClass1_Sub1_Sub5_Sub3_10.method1293();
		Static49.aClass1_Sub1_Sub5_Sub3_10.method1291();
		Static31.aClass1_Sub1_Sub5_Sub3_5 = Static48.aClass1_Sub1_Sub5_Sub3_18.method1289();
		Static31.aClass1_Sub1_Sub5_Sub3_5.method1293();
		Static31.aClass1_Sub1_Sub5_Sub3_5.method1291();
		Static20.aClass1_Sub1_Sub5_Sub3Array2 = Static86.method1416(Static28.aClass64_1529, Static65.aClass64_925, arg1);
		Static91.anIntArray302 = new int[151];
		Static89.anIntArray300 = new int[33];
		Static93.anIntArray305 = new int[33];
		Static41.anIntArray389 = new int[151];
		@Pc(357) int local357;
		@Pc(355) int local355;
		@Pc(359) int local359;
		for (@Pc(351) int local351 = 0; local351 < 33; local351++) {
			local355 = 0;
			local357 = 999;
			for (local359 = 0; local359 < 34; local359++) {
				if (Static40.aClass1_Sub1_Sub5_Sub3_6.aByteArray22[local359 + local351 * Static40.aClass1_Sub1_Sub5_Sub3_6.anInt1799] == 0) {
					if (local357 == 999) {
						local357 = local359;
					}
				} else if (local357 != 999) {
					local355 = local359;
					break;
				}
			}
			Static89.anIntArray300[local351] = local357;
			Static93.anIntArray305[local351] = local355 - local357;
		}
		for (local357 = 5; local357 < 156; local357++) {
			local359 = 0;
			local355 = 999;
			for (@Pc(421) int local421 = 25; local421 < 172; local421++) {
				if (Static40.aClass1_Sub1_Sub5_Sub3_6.aByteArray22[local357 * Static40.aClass1_Sub1_Sub5_Sub3_6.anInt1799 + local421] == 0 && (local421 > 34 || local357 > 34)) {
					if (local355 == 999) {
						local355 = local421;
					}
				} else if (local355 != 999) {
					local359 = local421;
					break;
				}
			}
			Static41.anIntArray389[local357 - 5] = local355 - 25;
			Static91.anIntArray302[local357 - 5] = local359 - local355;
		}
		Static12.aBoolean120 = true;
	}
}
