import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "Lclient!cf;")
	public static Class14 aClass14_3;

	@OriginalMember(owner = "client!uf", name = "I", descriptor = "Lclient!ub;")
	public static Class4_Sub4_Sub16 aClass4_Sub4_Sub16_1;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "Lclient!v;")
	public static Class76 aClass76_1233 = Static134.method2017("swe");

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "J")
	public static long aLong95 = 0L;

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "Lclient!v;")
	public static Class76 aClass76_1234 = Static134.method2017("Lade Sprites )2 ");

	@OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
	public static int anInt2619 = 0;

	@OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
	public static int anInt2620 = 0;

	@OriginalMember(owner = "client!uf", name = "s", descriptor = "Lclient!v;")
	private static Class76 aClass76_1237 = Static134.method2017("Players");

	@OriginalMember(owner = "client!uf", name = "q", descriptor = "Lclient!v;")
	public static Class76 aClass76_1235 = aClass76_1237;

	@OriginalMember(owner = "client!uf", name = "r", descriptor = "Lclient!v;")
	public static Class76 aClass76_1236 = Static134.method2017("<col=00ffff>");

	@OriginalMember(owner = "client!uf", name = "A", descriptor = "Lclient!v;")
	public static Class76 aClass76_1238 = Static134.method2017("(U");

	@OriginalMember(owner = "client!uf", name = "E", descriptor = "Lclient!v;")
	public static Class76 aClass76_1239 = Static134.method2017("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!uf", name = "N", descriptor = "Lclient!v;")
	public static Class76 aClass76_1240 = Static134.method2017("blinken1:");

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)V")
	public static void method1838() {
		Static65.anInt422 = -1;
		Static110.anInt2401 = 0;
		Static55.anInt1458 = 2;
		Static100.anInt2289 = -1;
		Static48.anInt1229 = 1;
		Static28.aClass17_6 = null;
		Static20.aBoolean28 = false;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIII)V")
	public static void method1839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static46.method1828(arg3, arg1, arg0 + arg3, arg2 + arg1);
		Static37.method718();
		Static20.anInt445++;
		Static2.method11(true);
		Static90.method1479(true);
		Static2.method11(false);
		Static90.method1479(false);
		Static52.method945();
		Static101.method1587();
		@Pc(39) int local39;
		@Pc(76) int local76;
		if (!Static125.aBoolean155) {
			local39 = Static5.anInt111;
			if (local39 < Static84.anInt2027 / 256) {
				local39 = Static84.anInt2027 / 256;
			}
			if (Static9.aBooleanArray1[4] && Static88.anIntArray289[4] + 128 > local39) {
				local39 = Static88.anIntArray289[4] + 128;
			}
			local76 = Static60.anInt1576 + Static85.anInt2045 & 0x7FF;
			Static10.method137(local39, Static101.anInt2307, Static88.anInt2090, Static67.method1133(Static124.anInt2712, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1393, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1416) - 50, local39 * 3 + 600, local76);
		}
		if (Static125.aBoolean155) {
			local39 = Static58.method1010();
		} else {
			local39 = Static62.method1077();
		}
		local76 = Static106.anInt2354;
		@Pc(112) int local112 = Static96.anInt2222;
		@Pc(114) int local114 = Static74.anInt1911;
		@Pc(116) int local116 = Static120.anInt2582;
		@Pc(118) int local118 = Static103.anInt2317;
		@Pc(162) int local162;
		for (@Pc(120) int local120 = 0; local120 < 5; local120++) {
			if (Static9.aBooleanArray1[local120]) {
				local162 = (int) ((double) -Static85.anIntArray283[local120] + Math.random() * (double) (Static85.anIntArray283[local120] * 2 + 1) + Math.sin((double) Static12.anIntArray37[local120] * ((double) Static133.anIntArray408[local120] / 100.0D)) * (double) Static88.anIntArray289[local120]);
				if (local120 == 1) {
					Static96.anInt2222 += local162;
				}
				if (local120 == 0) {
					Static106.anInt2354 += local162;
				}
				if (local120 == 2) {
					Static120.anInt2582 += local162;
				}
				if (local120 == 4) {
					Static74.anInt1911 += local162;
					if (Static74.anInt1911 < 128) {
						Static74.anInt1911 = 128;
					}
					if (Static74.anInt1911 > 383) {
						Static74.anInt1911 = 383;
					}
				}
				if (local120 == 3) {
					Static103.anInt2317 = Static103.anInt2317 + local162 & 0x7FF;
				}
			}
		}
		local162 = Static2.anInt31;
		@Pc(221) int local221 = Static126.anInt2734;
		if (arg3 <= local162 && local162 < arg0 + arg3 && local221 >= arg1 && arg1 + arg2 > local221) {
			Static116.anInt2527 = 0;
			Static116.anInt2528 = Static2.anInt31 - arg3;
			Static116.anInt2531 = Static126.anInt2734 - arg1;
			Static116.aBoolean148 = true;
		} else {
			Static116.anInt2527 = 0;
			Static116.aBoolean148 = false;
		}
		Static20.method310();
		Static46.method1823(arg3, arg1, arg0, arg2, 0);
		Static20.method310();
		Static54.aClass81_10.method1977(Static106.anInt2354, Static96.anInt2222, Static120.anInt2582, Static74.anInt1911, Static103.anInt2317, local39);
		Static20.method310();
		Static54.aClass81_10.method1950();
		Static72.method1352(arg2, arg0, arg3, arg1);
		Static100.method1583(arg3, arg1);
		((Class29) Static37.anInterface1_1).method782(Static1.anInt5);
		Static73.method1364(arg0, arg2, arg1, arg3);
		Static74.anInt1911 = local114;
		Static96.anInt2222 = local112;
		Static120.anInt2582 = local116;
		Static106.anInt2354 = local76;
		Static103.anInt2317 = local118;
		if (Static18.aBoolean20 && Static93.method1504() == 0) {
			Static18.aBoolean20 = false;
		}
		if (Static18.aBoolean20) {
			Static46.method1823(arg3, arg1, arg0, arg2, 0);
			Static9.method113(false, Static127.aClass76_1288);
		}
		if (!Static18.aBoolean20 && !Static32.aBoolean56 && local162 >= arg3 && local162 < arg0 + arg3 && local221 >= arg1 && arg2 + arg1 > local221) {
			Static113.method1720(local221, arg3, local162, arg1);
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB)V")
	public static void method1840(@OriginalArg(0) int arg0) {
		Static59.anInt1535 += arg0 * 128;
		@Pc(26) int local26;
		if (Static59.anInt1535 > Static56.anIntArray187.length) {
			local26 = (int) (Math.random() * 12.0D);
			Static59.anInt1535 -= Static56.anIntArray187.length;
			Static18.method239(Static73.aClass4_Sub4_Sub5_Sub4Array9[local26]);
		}
		local26 = 0;
		@Pc(45) int local45 = (256 - arg0) * 128;
		@Pc(49) int local49 = arg0 * 128;
		@Pc(79) int local79;
		for (@Pc(55) int local55 = 0; local55 < local45; local55++) {
			local79 = Static41.anIntArray129[local49 + local26] - Static56.anIntArray187[Static59.anInt1535 + local26 & Static56.anIntArray187.length + -1] * arg0 / 6;
			if (local79 < 0) {
				local79 = 0;
			}
			Static41.anIntArray129[local26++] = local79;
		}
		@Pc(107) int local107;
		@Pc(109) int local109;
		@Pc(116) int local116;
		for (local79 = 256 - arg0; local79 < 256; local79++) {
			local107 = local79 * 128;
			for (local109 = 0; local109 < 128; local109++) {
				local116 = (int) (Math.random() * 100.0D);
				if (local116 < 50 && local109 > 10 && local109 < 118) {
					Static41.anIntArray129[local109 + local107] = 255;
				} else {
					Static41.anIntArray129[local109 + local107] = 0;
				}
			}
		}
		if (Static87.anInt1972 > 0) {
			Static87.anInt1972 -= arg0 * 4;
		}
		if (Static84.anInt2023 > 0) {
			Static84.anInt2023 -= arg0 * 4;
		}
		if (Static84.anInt2023 == 0 && Static87.anInt1972 == 0) {
			local107 = (int) ((double) (2000 / arg0) * Math.random());
			if (local107 == 1) {
				Static87.anInt1972 = 1024;
			}
			if (local107 == 0) {
				Static84.anInt2023 = 1024;
			}
		}
		for (local107 = 0; local107 < 256 - arg0; local107++) {
			Static58.anIntArray194[local107] = Static58.anIntArray194[arg0 + local107];
		}
		for (local109 = 256 - arg0; local109 < 256; local109++) {
			Static58.anIntArray194[local109] = (int) (Math.sin((double) Static63.anInt1633 / 14.0D) * 16.0D + Math.sin((double) Static63.anInt1633 / 15.0D) * 14.0D + Math.sin((double) Static63.anInt1633 / 16.0D) * 12.0D);
			Static63.anInt1633++;
		}
		Static113.anInt2455 += arg0;
		local116 = ((Static78.anInt1981 & 0x1) + arg0) / 2;
		if (local116 <= 0) {
			return;
		}
		@Pc(302) int local302;
		@Pc(309) int local309;
		for (@Pc(293) int local293 = 0; local293 < Static113.anInt2455 * 100; local293++) {
			local302 = (int) (Math.random() * 124.0D) + 2;
			local309 = (int) (Math.random() * 128.0D) + 128;
			Static41.anIntArray129[(local309 << 7) + local302] = 192;
		}
		Static113.anInt2455 = 0;
		@Pc(337) int local337;
		@Pc(342) int local342;
		for (local302 = 0; local302 < 256; local302++) {
			local337 = local302 * 128;
			local309 = 0;
			for (local342 = -local116; local342 < 128; local342++) {
				if (local116 + local342 < 128) {
					local309 += Static41.anIntArray129[local116 + local342 + local337];
				}
				if (local342 - local116 - 1 >= 0) {
					local309 -= Static41.anIntArray129[local337 + local342 - local116 - 1];
				}
				if (local342 >= 0) {
					Static63.anIntArray221[local337 + local342] = local309 / (local116 * 2 + 1);
				}
			}
		}
		for (local309 = 0; local309 < 128; local309++) {
			local337 = 0;
			for (local342 = -local116; local342 < 256; local342++) {
				@Pc(422) int local422 = local342 * 128;
				if (local116 + local342 < 256) {
					local337 += Static63.anIntArray221[local116 * 128 + local309 + local422];
				}
				if (local342 - local116 - 1 >= 0) {
					local337 -= Static63.anIntArray221[local422 + local309 - (local116 + 1) * 128];
				}
				if (local342 >= 0) {
					Static41.anIntArray129[local309 + local422] = local337 / (local116 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	public static void method1841() {
		aClass76_1233 = null;
		aClass76_1234 = null;
		aClass76_1240 = null;
		aClass4_Sub4_Sub16_1 = null;
		aClass14_3 = null;
		aClass76_1237 = null;
		aClass76_1235 = null;
		aClass76_1236 = null;
		aClass76_1238 = null;
		aClass76_1239 = null;
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V")
	public static void method1845() {
		Static24.aClass4_Sub10_Sub1_1.method613();
		@Pc(11) int local11 = Static24.aClass4_Sub10_Sub1_1.method608(1);
		if (local11 == 0) {
			return;
		}
		@Pc(19) int local19 = Static24.aClass4_Sub10_Sub1_1.method608(2);
		if (local19 == 0) {
			Static60.anIntArray201[Static48.anInt1228++] = 2047;
			return;
		}
		@Pc(42) int local42;
		@Pc(52) int local52;
		if (local19 == 1) {
			local42 = Static24.aClass4_Sub10_Sub1_1.method608(3);
			Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.method973(local42, false);
			local52 = Static24.aClass4_Sub10_Sub1_1.method608(1);
			if (local52 == 1) {
				Static60.anIntArray201[Static48.anInt1228++] = 2047;
			}
			return;
		}
		@Pc(94) int local94;
		if (local19 == 2) {
			local42 = Static24.aClass4_Sub10_Sub1_1.method608(3);
			Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.method973(local42, true);
			local52 = Static24.aClass4_Sub10_Sub1_1.method608(3);
			Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.method973(local52, true);
			local94 = Static24.aClass4_Sub10_Sub1_1.method608(1);
			if (local94 == 1) {
				Static60.anIntArray201[Static48.anInt1228++] = 2047;
			}
		} else if (local19 == 3) {
			local42 = Static24.aClass4_Sub10_Sub1_1.method608(1);
			local52 = Static24.aClass4_Sub10_Sub1_1.method608(1);
			if (local52 == 1) {
				Static60.anIntArray201[Static48.anInt1228++] = 2047;
			}
			local94 = Static24.aClass4_Sub10_Sub1_1.method608(7);
			@Pc(144) int local144 = Static24.aClass4_Sub10_Sub1_1.method608(7);
			Static124.anInt2712 = Static24.aClass4_Sub10_Sub1_1.method608(2);
			Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.method967(local42 == 1, local94, local144);
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V")
	public static void method1846() {
		for (@Pc(7) int local7 = 0; local7 < Static48.anInt1228; local7++) {
			@Pc(13) int local13 = Static60.anIntArray201[local7];
			@Pc(17) Class4_Sub4_Sub3_Sub1_Sub2 local17 = Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[local13];
			@Pc(21) int local21 = Static24.aClass4_Sub10_Sub1_1.method599();
			if ((local21 & 0x2) != 0) {
				local21 += Static24.aClass4_Sub10_Sub1_1.method599() << 8;
			}
			Static104.method1599(local13, local17, local21);
		}
	}

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)V")
	public static void method1847() {
		Static124.aClass78_14 = new Class78();
	}
}
