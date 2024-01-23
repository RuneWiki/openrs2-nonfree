import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!ko", name = "R", descriptor = "I")
	public static int anInt2948;

	@OriginalMember(owner = "client!ko", name = "M", descriptor = "I")
	public static int anInt2944 = 0;

	@OriginalMember(owner = "client!ko", name = "P", descriptor = "J")
	public static long aLong111 = 0L;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIBIIZ)V")
	public static void method2370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		Static180.anInt3623++;
		Static36.method655();
		@Pc(31) int local31;
		if (arg4) {
			Static74.method1259(0, false, false);
		} else {
			Static81.method1387(0);
			Static74.method1259(0, false, true);
			if (Static287.anInt5604 == 0) {
				for (local31 = 1; local31 <= 5; local31++) {
					Static74.method1259(local31, false, false);
					Static74.method1259(local31, true, false);
					Static81.method1387(local31);
				}
			} else {
				for (local31 = 1; local31 <= 5; local31++) {
					Static81.method1387(local31);
					Static74.method1259(local31, false, false);
					Static74.method1259(local31, true, false);
				}
			}
		}
		if (!arg4) {
			Static159.method2560();
		}
		Static34.method4637();
		if (Static251.aBoolean330) {
			Static127.method2070(true, arg3, arg2, arg1, arg0);
			arg2 = Static292.anInt5677;
			arg1 = Static266.anInt5232;
			arg0 = Static225.anInt4537;
			arg3 = Static114.anInt2289;
		}
		Static117.anInt2419 = arg2;
		Static117.anInt2420 = arg0;
		@Pc(145) int local145;
		if (Static99.anInt1946 == 1) {
			local31 = (int) Static276.aFloat156;
			if (local31 < Static134.anInt2667 / 256) {
				local31 = Static134.anInt2667 / 256;
			}
			local145 = (int) Static126.aFloat73 + Static259.anInt5087 & 0x7FF;
			if (Static278.aBooleanArray35[4] && Static139.anIntArray229[4] + 128 > local31) {
				local31 = Static139.anIntArray229[4] + 128;
			}
			Static98.method1587(local31, arg1, Static81.anInt1698, local31 * 3 + 600, local145, Static58.method2504(Static72.aClass13_Sub5_Sub1_1.anInt5294, Static72.aClass13_Sub5_Sub1_1.anInt5334, Static222.anInt4467) - 50, Static153.anInt3107);
		} else if (Static99.anInt1946 == 5) {
			Static110.method1855(arg1);
		}
		local31 = Static71.anInt1457;
		local145 = Static153.anInt3111;
		@Pc(198) int local198 = Static248.anInt4865;
		@Pc(200) int local200 = Static254.anInt4974;
		@Pc(202) int local202 = Static56.anInt1258;
		@Pc(204) int local204;
		@Pc(248) int local248;
		for (local204 = 0; local204 < 5; local204++) {
			if (Static278.aBooleanArray35[local204]) {
				local248 = (int) ((double) -Static97.anIntArray372[local204] + (double) (Static97.anIntArray372[local204] * 2 + 1) * Math.random() + Math.sin((double) Static90.anIntArray394[local204] / 100.0D * (double) Static70.anIntArray136[local204]) * (double) Static139.anIntArray229[local204]);
				if (local204 == 1) {
					Static153.anInt3111 += local248;
				}
				if (local204 == 0) {
					Static71.anInt1457 += local248;
				}
				if (local204 == 2) {
					Static248.anInt4865 += local248;
				}
				if (local204 == 3) {
					Static56.anInt1258 = local248 + Static56.anInt1258 & 0x7FF;
				}
				if (local204 == 4) {
					Static254.anInt4974 += local248;
					if (Static254.anInt4974 < 128) {
						Static254.anInt4974 = 128;
					}
					if (Static254.anInt4974 > 383) {
						Static254.anInt4974 = 383;
					}
				}
			}
		}
		Static123.method2036();
		@Pc(408) int local408;
		if (Static251.aBoolean330) {
			Static87.method1457(arg2, arg0, arg3 + arg2, arg0 + arg1);
			@Pc(369) float local369 = (float) Static254.anInt4974 * 0.17578125F;
			@Pc(376) float local376 = (float) Static56.anInt1258 * 0.17578125F;
			if (Static99.anInt1946 == 3) {
				local376 = Static32.aFloat22 * 360.0F / 6.2831855F;
				local369 = Static176.aFloat161 * 360.0F / 6.2831855F;
			}
			if (Static204.anInt4047 == 10) {
				local408 = Static19.method422(Static309.anInt1336, Static248.anInt4872, Static248.anInt4865 >> 10, Static71.anInt1457 >> 10);
			} else {
				local408 = Static19.method422(Static309.anInt1336, Static248.anInt4872, Static72.aClass13_Sub5_Sub1_1.anIntArray418[0] >> 3, Static72.aClass13_Sub5_Sub1_1.anIntArray411[0] >> 3);
			}
			if (Static28.anInt611 >= 0) {
				Static251.method3862();
				@Pc(440) Class78 local440 = Static155.method2536(Static45.anInt1037, Static266.anInt5228, Static28.anInt611, Static136.anInt2698);
				local440.method2004(Static185.anInt3673, arg2, arg0, arg3, arg1, Static254.anInt4974, Static56.anInt1258, local408);
			} else {
				Static251.method3876(local408);
			}
			Static251.method3853(arg2, arg0, arg3, arg1, arg2 + arg3 / 2, arg0 - -(arg1 / 2), local369, local376, Static235.anInt4661, Static235.anInt4661);
			Static169.method2686(false);
			Static251.method3864();
			Static251.method3868(true);
			Static251.method3894(true);
		} else {
			Static258.method4029(arg2, arg0, arg3 + arg2, arg1 + arg0);
			Static283.method4415();
			if (Static28.anInt611 < 0) {
				Static258.method4031(arg2, arg0, arg3, arg1, 0);
			} else {
				@Pc(344) Class78 local344 = Static155.method2536(Static45.anInt1037, Static266.anInt5228, Static28.anInt611, Static136.anInt2698);
				local344.method2005(Static185.anInt3673, arg2, arg0, arg3, arg1, Static254.anInt4974, Static56.anInt1258);
			}
		}
		if (Static137.aBoolean176 || arg2 > Static167.anInt3358 || Static167.anInt3358 >= arg3 + arg2 || arg0 > Static73.anInt1479 || Static73.anInt1479 >= arg0 + arg1) {
			Static287.aBoolean384 = false;
			Static242.anInt4774 = 0;
		} else {
			Static287.aBoolean384 = true;
			local204 = Static190.anInt3867;
			Static242.anInt4774 = 0;
			local248 = Static60.anInt1354;
			Static177.anInt3590 = (Static167.anInt3358 - arg2) * (local248 - local204) / arg3 + local204;
			local408 = Static244.anInt4816;
			@Pc(537) int local537 = Static157.anInt314;
			Static223.anInt4478 = local408 + (Static73.anInt1479 - arg0) * (-local408 + local537) / arg1;
		}
		Static65.method4575();
		@Pc(564) byte local564 = Static169.method2691() == 2 ? (byte) Static180.anInt3623 : 1;
		if (Static251.aBoolean330) {
			Static142.method2272(Static50.anInt1118, !Static127.aBoolean163);
			Static45.method914(Static248.anInt4865, Static254.anInt4974, Static71.anInt1457, Static153.anInt3111, Static56.anInt1258);
			Static251.anInt4930 = Static50.anInt1118;
			Static94.method1564(Static71.anInt1457, Static153.anInt3111, Static248.anInt4865, Static254.anInt4974, Static56.anInt1258, Static185.aByteArrayArrayArray10, Static241.anIntArray379, Static1.anIntArray1, Static307.anIntArray488, Static148.anIntArray236, Static237.anIntArray377, Static222.anInt4467 + 1, local564, Static72.aClass13_Sub5_Sub1_1.anInt5334 >> 7, Static72.aClass13_Sub5_Sub1_1.anInt5294 >> 7);
			Static125.aBoolean161 = true;
			Static142.method2279();
			Static45.method914(0, 0, 0, 0, 0);
			Static65.method4575();
			Static116.method4402(arg0, Static235.anInt4661, Static235.anInt4661, arg1, arg2, arg3);
			Static303.method4653(arg0, Static235.anInt4661, Static235.anInt4661, arg1, arg3, arg2);
			Static257.method4009();
		} else {
			Static94.method1564(Static71.anInt1457, Static153.anInt3111, Static248.anInt4865, Static254.anInt4974, Static56.anInt1258, Static185.aByteArrayArrayArray10, Static241.anIntArray379, Static1.anIntArray1, Static307.anIntArray488, Static148.anIntArray236, Static237.anIntArray377, Static222.anInt4467 + 1, local564, Static72.aClass13_Sub5_Sub1_1.anInt5334 >> 7, Static72.aClass13_Sub5_Sub1_1.anInt5294 >> 7);
			Static65.method4575();
			Static257.method4009();
			Static116.method4402(arg0, 256, 256, arg1, arg2, arg3);
			Static303.method4653(arg0, 256, 256, arg1, arg3, arg2);
		}
		((Class95_Sub1) Static283.anInterface1_1).method2444(Static309.anInt1336);
		Static217.method3394(arg1, arg0, arg3, arg2);
		Static56.anInt1258 = local202;
		Static254.anInt4974 = local200;
		Static153.anInt3111 = local145;
		Static248.anInt4865 = local198;
		Static71.anInt1457 = local31;
		if (Static189.aBoolean391 && Static82.aClass70_2.method1846() == 0) {
			Static189.aBoolean391 = false;
		}
		if (Static189.aBoolean391) {
			if (Static251.aBoolean330) {
				Static87.method1464(arg2, arg0, arg3, arg1, 0);
			} else {
				Static258.method4031(arg2, arg0, arg3, arg1, 0);
			}
			Static250.method3846(Static174.aString124, false);
		}
		if (!arg4 && !Static189.aBoolean391 && !Static137.aBoolean176 && Static167.anInt3358 >= arg2 && Static167.anInt3358 < arg2 + arg3 && arg0 <= Static73.anInt1479 && arg0 + arg1 > Static73.anInt1479) {
			Static219.method3404(arg3, Static167.anInt3358, arg2, Static73.anInt1479, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(FZIIIIIII)[[I")
	public static int[][] method2371(@OriginalArg(0) float arg0) {
		@Pc(5) int[][] local5 = new int[256][64];
		@Pc(23) Class4_Sub1_Sub9 local23 = new Class4_Sub1_Sub9();
		local23.aBoolean98 = false;
		local23.anInt1657 = 4;
		local23.anInt1663 = 8;
		local23.anInt1659 = (int) (arg0 * 4096.0F);
		local23.anInt1667 = 3;
		local23.method4537();
		Static28.method588(64, 256);
		for (@Pc(52) int local52 = 0; local52 < 256; local52++) {
			local23.method1360(local5[local52], local52);
		}
		return local5;
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(B)Lclient!jk;")
	public static Class47 method2372() {
		try {
			return (Class47) Class.forName("Class47_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "(I)[Lclient!n;")
	public static Class4_Sub2_Sub4_Sub2[] method2373() {
		@Pc(4) Class4_Sub2_Sub4_Sub2[] local4 = new Class4_Sub2_Sub4_Sub2[anInt2948];
		for (@Pc(11) int local11 = 0; local11 < anInt2948; local11++) {
			@Pc(22) int local22 = Static246.anIntArray386[local11] * Static107.anIntArray188[local11];
			@Pc(26) byte[] local26 = Static99.aByteArrayArray8[local11];
			@Pc(29) int[] local29 = new int[local22];
			for (@Pc(31) int local31 = 0; local31 < local22; local31++) {
				local29[local31] = Static138.anIntArray228[local26[local31] & 0xFF];
			}
			local4[local11] = new Class4_Sub2_Sub4_Sub2(Static31.anInt651, Static161.anInt3300, Static149.anIntArray238[local11], Static278.anIntArray422[local11], Static107.anIntArray188[local11], Static246.anIntArray386[local11], local29);
		}
		Static184.method2969();
		return local4;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "([[II)V")
	public static void method2374(@OriginalArg(0) int[][] arg0) {
		Static253.anIntArrayArray34 = arg0;
	}
}
