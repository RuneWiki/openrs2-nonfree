import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "Lclient!md;")
	public static Class44 aClass44_1;

	@OriginalMember(owner = "client!pg", name = "m", descriptor = "Lclient!ea;")
	private static Class18 aClass18_881 = Static8.method128("glow3:");

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "Lclient!ea;")
	public static Class18 aClass18_879 = aClass18_881;

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "Lclient!d;")
	public static Class1_Sub6_Sub1 aClass1_Sub6_Sub1_2 = new Class1_Sub6_Sub1(5000);

	@OriginalMember(owner = "client!pg", name = "i", descriptor = "Lclient!ea;")
	public static Class18 aClass18_880 = Static8.method128("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!pg", name = "j", descriptor = "[B")
	public static byte[] aByteArray36 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!pg", name = "n", descriptor = "Lclient!ea;")
	public static Class18 aClass18_882 = aClass18_881;

	@OriginalMember(owner = "client!pg", name = "x", descriptor = "Lclient!rc;")
	public static Class66 aClass66_15 = new Class66(64);

	@OriginalMember(owner = "client!pg", name = "y", descriptor = "[I")
	public static int[] anIntArray310 = new int[5];

	@OriginalMember(owner = "client!pg", name = "A", descriptor = "[I")
	public static int[] anIntArray311 = new int[500];

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
	public static void method2410() {
		Static28.method2245(false);
		Static23.anInt710 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static54.aByteArrayArray9.length; local14++) {
			if (Static92.anIntArray251[local14] != -1 && Static54.aByteArrayArray9[local14] == null) {
				Static54.aByteArrayArray9[local14] = Static42.aClass16_Sub1_16.method2254(0, Static92.anIntArray251[local14]);
				if (Static54.aByteArrayArray9[local14] == null) {
					Static23.anInt710++;
					local12 = false;
				}
			}
			if (Static62.anIntArray163[local14] != -1 && Static109.aByteArrayArray16[local14] == null) {
				Static109.aByteArrayArray16[local14] = Static42.aClass16_Sub1_16.method2236(0, Static62.anIntArray163[local14], Static169.anIntArrayArray131[local14]);
				if (Static109.aByteArrayArray16[local14] == null) {
					Static23.anInt710++;
					local12 = false;
				}
			}
		}
		if (!local12) {
			Static156.anInt4306 = 1;
			return;
		}
		local12 = true;
		Static155.anInt4268 = 0;
		@Pc(115) int local115;
		@Pc(126) int local126;
		for (@Pc(97) int local97 = 0; local97 < Static54.aByteArrayArray9.length; local97++) {
			@Pc(103) byte[] local103 = Static109.aByteArrayArray16[local97];
			if (local103 != null) {
				local115 = (Static137.anIntArray356[local97] >> 8) * 64 - Static117.anInt3328;
				local126 = (Static137.anIntArray356[local97] & 0xFF) * 64 - Static110.anInt3227;
				if (Static106.aBoolean127) {
					local126 = 10;
					local115 = 10;
				}
				local12 &= Static64.method1282(local126, local103, local115);
			}
		}
		if (!local12) {
			Static156.anInt4306 = 2;
			return;
		}
		if (Static156.anInt4306 != 0) {
			Static161.method2992(Static144.method2735(new Class18[] { Static173.aClass18_1214, Static15.aClass18_146 }), true);
		}
		Static147.method2775();
		method2413();
		Static147.method2775();
		Static87.aClass68_1.method2659();
		Static147.method2775();
		System.gc();
		for (@Pc(187) int local187 = 0; local187 < 4; local187++) {
			Static141.aClass22Array2[local187].method1045();
		}
		@Pc(210) int local210;
		for (local115 = 0; local115 < 4; local115++) {
			for (local126 = 0; local126 < 104; local126++) {
				for (local210 = 0; local210 < 104; local210++) {
					Static2.aByteArrayArrayArray1[local115][local126][local210] = 0;
				}
			}
		}
		Static147.method2775();
		Static83.method3202();
		local126 = Static54.aByteArrayArray9.length;
		Static87.method1879();
		Static28.method2245(true);
		@Pc(265) int local265;
		@Pc(280) int local280;
		@Pc(376) int local376;
		@Pc(329) int local329;
		@Pc(387) int local387;
		if (!Static106.aBoolean127) {
			@Pc(269) byte[] local269;
			for (local210 = 0; local210 < local126; local210++) {
				local265 = (Static137.anIntArray356[local210] >> 8) * 64 - Static117.anInt3328;
				local269 = Static54.aByteArrayArray9[local210];
				local280 = (Static137.anIntArray356[local210] & 0xFF) * 64 - Static110.anInt3227;
				if (local269 != null) {
					Static147.method2775();
					Static32.method696(local269, Static48.anInt1566 * 8 - 48, local280, Static141.aClass22Array2, Static47.anInt4242 * 8 - 48, local265);
				}
			}
			for (local265 = 0; local265 < local126; local265++) {
				local280 = (Static137.anIntArray356[local265] >> 8) * 64 - Static117.anInt3328;
				local329 = (Static137.anIntArray356[local265] & 0xFF) * 64 - Static110.anInt3227;
				@Pc(333) byte[] local333 = Static54.aByteArrayArray9[local265];
				if (local333 == null && Static47.anInt4242 < 800) {
					Static147.method2775();
					Static108.method2225(local280, 64, 64, local329);
				}
			}
			Static28.method2245(true);
			for (local280 = 0; local280 < local126; local280++) {
				local269 = Static109.aByteArrayArray16[local280];
				if (local269 != null) {
					local376 = (Static137.anIntArray356[local280] & 0xFF) * 64 - Static110.anInt3227;
					local387 = (Static137.anIntArray356[local280] >> 8) * 64 - Static117.anInt3328;
					Static147.method2775();
					Static129.method2516(local376, local387, local269, Static87.aClass68_1, Static141.aClass22Array2);
				}
			}
		}
		@Pc(442) int local442;
		@Pc(454) int local454;
		if (Static106.aBoolean127) {
			@Pc(448) int local448;
			@Pc(464) int local464;
			@Pc(466) int local466;
			for (local210 = 0; local210 < 4; local210++) {
				Static147.method2775();
				for (local265 = 0; local265 < 13; local265++) {
					for (local280 = 0; local280 < 13; local280++) {
						local387 = Static144.anIntArrayArrayArray8[local210][local265][local280];
						@Pc(426) boolean local426 = false;
						if (local387 != -1) {
							local376 = local387 >> 24 & 0x3;
							local442 = local387 >> 1 & 0x3;
							local448 = local387 >> 3 & 0x7FF;
							local454 = local387 >> 14 & 0x3FF;
							local464 = local448 / 8 + (local454 / 8 << 8);
							for (local466 = 0; local466 < Static137.anIntArray356.length; local466++) {
								if (Static137.anIntArray356[local466] == local464 && Static54.aByteArrayArray9[local466] != null) {
									Static169.method3111((local454 & 0x7) * 8, (local448 & 0x7) * 8, Static141.aClass22Array2, Static54.aByteArrayArray9[local466], local265 * 8, local280 * 8, local376, local442, local210);
									local426 = true;
									break;
								}
							}
						}
						if (!local426) {
							Static149.method2810(local265 * 8, local280 * 8, local210);
						}
					}
				}
			}
			for (local265 = 0; local265 < 13; local265++) {
				for (local280 = 0; local280 < 13; local280++) {
					local329 = Static144.anIntArrayArrayArray8[0][local265][local280];
					if (local329 == -1) {
						Static108.method2225(local265 * 8, 8, 8, local280 * 8);
					}
				}
			}
			Static28.method2245(true);
			for (local280 = 0; local280 < 4; local280++) {
				Static147.method2775();
				for (local329 = 0; local329 < 13; local329++) {
					for (local387 = 0; local387 < 13; local387++) {
						local376 = Static144.anIntArrayArrayArray8[local280][local329][local387];
						if (local376 != -1) {
							local442 = local376 >> 24 & 0x3;
							local454 = local376 >> 1 & 0x3;
							local464 = local376 >> 3 & 0x7FF;
							local448 = local376 >> 14 & 0x3FF;
							local466 = (local448 / 8 << 8) + local464 / 8;
							for (@Pc(642) int local642 = 0; local642 < Static137.anIntArray356.length; local642++) {
								if (Static137.anIntArray356[local642] == local466 && Static109.aByteArrayArray16[local642] != null) {
									Static74.method1574(local329 * 8, Static141.aClass22Array2, Static109.aByteArrayArray16[local642], local442, (local448 & 0x7) * 8, Static87.aClass68_1, local280, local387 * 8, (local464 & 0x7) * 8, local454);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static28.method2245(true);
		method2413();
		Static147.method2775();
		Static7.method119(Static141.aClass22Array2, Static87.aClass68_1);
		Static28.method2245(true);
		local210 = Static95.anInt2954;
		if (Static9.anInt295 < local210) {
			local210 = Static9.anInt295;
		}
		if (local210 < Static9.anInt295 - 1) {
		}
		if (Static27.aBoolean26) {
			Static87.aClass68_1.method2652(Static95.anInt2954);
		} else {
			Static87.aClass68_1.method2652(0);
		}
		for (local265 = 0; local265 < 104; local265++) {
			for (local280 = 0; local280 < 104; local280++) {
				Static8.method131(local280, local265);
			}
		}
		Static147.method2775();
		Static1.method52();
		method2413();
		if (Static82.aFrame1 != null) {
			Static95.aClass1_Sub6_Sub1_1.method555(150);
			Static95.aClass1_Sub6_Sub1_1.method513(1057001181);
		}
		if (!Static106.aBoolean127) {
			local387 = (Static47.anInt4242 - 6) / 8;
			local280 = (Static48.anInt1566 - 6) / 8;
			local329 = (Static48.anInt1566 + 6) / 8;
			local376 = (Static47.anInt4242 + 6) / 8;
			for (local442 = local280 - 1; local442 <= local329 + 1; local442++) {
				for (local454 = local387 - 1; local454 <= local376 + 1; local454++) {
					if (local280 > local442 || local329 < local442 || local454 < local387 || local376 < local454) {
						Static42.aClass16_Sub1_16.method2244(Static144.method2735(new Class18[] { Static174.aClass18_1217, Static132.method2564(local442), Static146.aClass18_1034, Static132.method2564(local454) }));
						Static42.aClass16_Sub1_16.method2244(Static144.method2735(new Class18[] { Static84.aClass18_616, Static132.method2564(local442), Static146.aClass18_1034, Static132.method2564(local454) }));
					}
				}
			}
		}
		Static6.method107(30);
		Static147.method2775();
		Static159.method2974();
		Static95.aClass1_Sub6_Sub1_1.method555(176);
		Static4.method86();
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V")
	public static void method2413() {
		Static43.method929();
		Static11.method196();
		Static14.method243();
		Static82.method1799();
		Static40.method809();
		Static146.method2773();
		Static12.method3141();
		Static113.method2980();
		Static8.method130();
		Static148.method2800();
		Static89.method1928();
		Static36.method756();
		((Class82) Static79.anInterface3_1).method3058();
		Static36.aClass66_6.method2604();
		Static142.aClass16_Sub1_45.method2250();
		Static142.aClass16_Sub1_44.method2250();
		Static69.aClass16_Sub1_24.method2250();
		Static12.aClass16_Sub1_51.method2250();
		Static42.aClass16_Sub1_16.method2250();
		Static115.aClass16_Sub1_36.method2250();
		Static64.aClass16_Sub1_22.method2250();
		Static127.aClass16_Sub1_41.method2250();
		Static107.aClass16_Sub1_35.method2250();
		Static82.aClass16_Sub1_29.method2250();
		Static164.aClass16_Sub1_50.method2250();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!dd;I)V")
	public static void method2415(@OriginalArg(0) Class16 arg0) {
		Static132.aClass16_23 = arg0;
		Static2.anInt102 = Static132.aClass16_23.method2252(16);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V")
	public static void method2418(@OriginalArg(1) int arg0) {
		Static108.anInt3192 = arg0;
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)Lclient!fa;")
	public static Class1_Sub1_Sub8_Sub1 method2420() {
		@Pc(7) Class1_Sub1_Sub8_Sub1 local7 = new Class1_Sub1_Sub8_Sub1();
		local7.anInt1431 = Static129.anIntArray331[0];
		local7.anInt1430 = Static101.anInt3032;
		local7.aByteArray7 = Static22.aByteArrayArray4[0];
		local7.anInt1434 = Static47.anInt4239;
		local7.anInt1435 = Static26.anIntArray54[0];
		local7.anInt1433 = Static131.anIntArray333[0];
		local7.anInt1432 = Static145.anIntArray375[0];
		local7.anIntArray92 = Static9.anIntArray13;
		Static76.method1682();
		return local7;
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
	public static void method2422() {
		aClass18_880 = null;
		aClass44_1 = null;
		aClass18_879 = null;
		anIntArray311 = null;
		aClass18_881 = null;
		aByteArray36 = null;
		aClass18_882 = null;
		aClass66_15 = null;
		anIntArray310 = null;
		aClass1_Sub6_Sub1_2 = null;
	}
}
