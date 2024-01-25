import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!tj", name = "T", descriptor = "C")
	public static char aChar4;

	@OriginalMember(owner = "client!tj", name = "K", descriptor = "I")
	public static int anInt6192 = 0;

	@OriginalMember(owner = "client!tj", name = "M", descriptor = "I")
	public static int anInt6194 = 0;

	@OriginalMember(owner = "client!tj", name = "R", descriptor = "[C")
	public static final char[] aCharArray6 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "(III)I")
	public static int method5190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(42) int local42 = Static351.method5647(arg1 + 91923, arg0 - -45365, 4) + (Static351.method5647(arg1 + 37821, arg0 + 10294, 2) - 128 >> 1) + (Static351.method5647(arg1, arg0, 1) - 128 >> 2) - 128;
		local42 = (int) ((double) local42 * 0.3D) + 35;
		if (local42 < 10) {
			local42 = 10;
		} else if (local42 > 60) {
			local42 = 60;
		}
		return local42;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!vm;I)V")
	public static void method5191(@OriginalArg(0) Class92 arg0) {
		@Pc(7) int local7 = Static111.anInt2449;
		@Pc(9) int local9 = Static87.anInt1931;
		@Pc(11) int local11 = Static111.anInt2450;
		@Pc(15) int local15 = Static223.anInt4637 - 3;
		if (Static100.aClass60_8 == null || Static315.aClass60_7 == null) {
			if (Static292.aClass11_130.method274(Static156.anInt3493) && Static292.aClass11_130.method274(Static40.anInt918)) {
				Static100.aClass60_8 = arg0.method4506(Static367.method5452(Static292.aClass11_130, Static156.anInt3493, 0));
				@Pc(44) Class206 local44 = Static367.method5452(Static292.aClass11_130, Static40.anInt918, 0);
				Static315.aClass60_7 = arg0.method4506(local44);
				local44.method5450();
				Static69.aClass60_5 = arg0.method4506(local44);
			} else {
				arg0.method4436(local7, local9, local11, 20, Static204.anInt4310 | 255 - Static123.anInt2768 << 24, 1);
			}
		}
		@Pc(89) int local89;
		@Pc(87) int local87;
		if (Static100.aClass60_8 != null && Static315.aClass60_7 != null) {
			local87 = (local11 - Static315.aClass60_7.method5679() * 2) / Static100.aClass60_8.method5679();
			for (local89 = 0; local89 < local87; local89++) {
				Static100.aClass60_8.method5675(local7 + Static315.aClass60_7.method5679() + Static100.aClass60_8.method5679() * local89, local9);
			}
			Static315.aClass60_7.method5675(local7, local9);
			Static69.aClass60_5.method5675(local11 + local7 - Static69.aClass60_5.method5679(), local9);
		}
		Static81.aClass78_2.method4050(Static188.anInt4080 | 0xFF000000, Static291.aString220, local7 + 3, -1, local9 + 14);
		arg0.method4436(local7, local9 + 20, local11, local15 - 20, -Static123.anInt2768 + 255 << 24 | Static204.anInt4310, 1);
		local87 = Static38.anInt830;
		local89 = Static184.anInt4055;
		@Pc(178) int local178;
		for (@Pc(160) int local160 = 0; local160 < Static282.anInt5713; local160++) {
			local178 = local9 + (Static282.anInt5713 + -1 + -local160) * 16 + 33;
			if (local87 > local7 && local11 + local7 > local87 && local178 - 13 < local89 && local178 + 3 > local89) {
				arg0.method4436(local7, local178 - 12, local11, 16, 255 - Static71.anInt1616 << 24 | Static225.anInt4722, 1);
			}
		}
		if ((Static155.aClass60_18 == null || Static264.aClass60_17 == null || Static204.aClass60_20 == null) && Static292.aClass11_130.method274(Static74.anInt1653) && Static292.aClass11_130.method274(Static279.anInt5650) && Static292.aClass11_130.method274(Static126.anInt2829)) {
			@Pc(255) Class206 local255 = Static367.method5452(Static292.aClass11_130, Static279.anInt5650, 0);
			Static264.aClass60_17 = arg0.method4506(local255);
			local255.method5450();
			Static65.aClass60_4 = arg0.method4506(local255);
			Static155.aClass60_18 = arg0.method4506(Static367.method5452(Static292.aClass11_130, Static74.anInt1653, 0));
			@Pc(280) Class206 local280 = Static367.method5452(Static292.aClass11_130, Static126.anInt2829, 0);
			Static204.aClass60_20 = arg0.method4506(local280);
			local280.method5450();
			Static159.aClass60_19 = arg0.method4506(local280);
		}
		@Pc(356) int local356;
		@Pc(358) int local358;
		if (Static155.aClass60_18 != null && Static264.aClass60_17 != null && Static204.aClass60_20 != null) {
			local178 = (local11 - Static204.aClass60_20.method5679() * 2) / Static155.aClass60_18.method5679();
			for (@Pc(321) int local321 = 0; local321 < local178; local321++) {
				Static155.aClass60_18.method5675(local7 + Static204.aClass60_20.method5679() + local321 * Static155.aClass60_18.method5679(), local9 + local15 - Static155.aClass60_18.method5687());
			}
			local356 = (local15 - Static204.aClass60_20.method5687() - 20) / Static264.aClass60_17.method5687();
			for (local358 = 0; local358 < local356; local358++) {
				Static264.aClass60_17.method5675(local7, local358 * Static264.aClass60_17.method5687() + local9 + 20);
				Static65.aClass60_4.method5675(local11 + local7 - Static65.aClass60_4.method5679(), local9 - -(Static264.aClass60_17.method5687() * local358) + 20);
			}
			Static204.aClass60_20.method5675(local7, local9 + local15 - Static204.aClass60_20.method5687());
			Static159.aClass60_19.method5675(local7 + local11 - Static204.aClass60_20.method5679(), local9 + local15 - Static204.aClass60_20.method5687());
		}
		local178 = 0;
		for (@Pc(430) Class4_Sub18 local430 = (Class4_Sub18) Static248.aClass130_112.method3499(); local430 != null; local430 = (Class4_Sub18) Static248.aClass130_112.method3512()) {
			local356 = (Static282.anInt5713 - local178 - 1) * 16 + local9 + 20 + 13;
			local358 = Static188.anInt4080 | 0xFF000000;
			if (local7 < local87 && local7 + local11 > local87 && local89 > local356 - 13 && local356 + 3 > local89) {
				local358 = Static254.anInt5255 | 0xFF000000;
			}
			@Pc(483) int[] local483 = null;
			if (Static184.method3416(local430.anInt2905)) {
				local483 = Static247.method4270((int) local430.aLong95).anIntArray372;
			} else if (Static156.method3018(local430.anInt2905)) {
				@Pc(501) Class2_Sub2_Sub1_Sub2 local501 = Static101.aClass2_Sub2_Sub1_Sub2Array6[(int) local430.aLong95];
				if (local501 != null) {
					local483 = local501.aClass34_1.anIntArray106;
				}
			} else if (Static13.method309(local430.anInt2905)) {
				if (local430.anInt2905 == 1010) {
					local483 = Static320.method5290((int) local430.aLong95).anIntArray153;
				} else {
					local483 = Static320.method5290((int) (local430.aLong95 >>> 32 & 0x7FFFFFFFL)).anIntArray153;
				}
			}
			@Pc(550) String local550 = Static199.method5388(local430);
			if (local483 != null) {
				local550 = local550 + Static46.method875(local483);
			}
			local178++;
			Static81.aClass78_2.method4056(local358, Static229.aClass60Array12, 0, local550, local7 + 3, local356, Static319.anIntArray507);
		}
		Static309.method5202(Static111.anInt2450, Static223.anInt4637, Static87.anInt1931, Static111.anInt2449);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIII)V")
	public static void method5192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg3 * arg3;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg2 << 1;
		@Pc(37) int local37 = local21 + local13 * (1 - local29);
		@Pc(46) int local46 = local17 - (local29 - 1) * local25;
		@Pc(50) int local50 = local13 << 2;
		@Pc(54) int local54 = local17 << 2;
		@Pc(62) int local62 = local21 * 3;
		@Pc(70) int local70 = local25 * ((arg2 << 1) - 3);
		@Pc(76) int local76 = local54;
		@Pc(97) int local97;
		@Pc(108) int local108;
		if (arg1 >= Static229.anInt4777 && Static165.anInt3366 >= arg1) {
			local97 = Static181.method3367(Static338.anInt5369, arg4 + arg3, Static295.anInt5964);
			local108 = Static181.method3367(Static338.anInt5369, arg4 - arg3, Static295.anInt5964);
			Static182.method3394(local108, Static30.anIntArrayArray10[arg1], arg0, local97);
		}
		@Pc(122) int local122 = local50 * (arg2 - 1);
		while (local9 > 0) {
			if (local37 < 0) {
				while (local37 < 0) {
					local46 += local76;
					local37 += local62;
					local7++;
					local62 += local54;
					local76 += local54;
				}
			}
			if (local46 < 0) {
				local46 += local76;
				local37 += local62;
				local7++;
				local62 += local54;
				local76 += local54;
			}
			local37 += -local122;
			local46 += -local70;
			local9--;
			local122 -= local50;
			local70 -= local50;
			local97 = arg1 - local9;
			local108 = local9 + arg1;
			if (local108 >= Static229.anInt4777 && local97 <= Static165.anInt3366) {
				@Pc(221) int local221 = Static181.method3367(Static338.anInt5369, local7 + arg4, Static295.anInt5964);
				@Pc(232) int local232 = Static181.method3367(Static338.anInt5369, arg4 - local7, Static295.anInt5964);
				if (Static229.anInt4777 <= local97) {
					Static182.method3394(local232, Static30.anIntArrayArray10[local97], arg0, local221);
				}
				if (local108 <= Static165.anInt3366) {
					Static182.method3394(local232, Static30.anIntArrayArray10[local108], arg0, local221);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "(II)V")
	public static void method5193(@OriginalArg(0) int arg0) {
		@Pc(16) Class4_Sub1_Sub8 local16 = Static155.method2994(arg0, 6);
		local16.method2034();
	}

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "(I)V")
	public static void method5195() {
		@Pc(10) int local10 = Static200.aClass4_Sub7_Sub1_2.method1247(8);
		@Pc(19) int local19;
		if (local10 < Static156.anInt3506) {
			for (local19 = local10; local19 < Static156.anInt3506; local19++) {
				Static19.anIntArray539[Static52.anInt1189++] = Static39.anIntArray105[local19];
			}
		}
		if (Static156.anInt3506 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static156.anInt3506 = 0;
		for (local19 = 0; local19 < local10; local19++) {
			@Pc(61) int local61 = Static39.anIntArray105[local19];
			@Pc(65) Class2_Sub2_Sub1_Sub1 local65 = Static253.aClass2_Sub2_Sub1_Sub1Array1[local61];
			@Pc(70) int local70 = Static200.aClass4_Sub7_Sub1_2.method1247(1);
			if (local70 == 0) {
				Static39.anIntArray105[Static156.anInt3506++] = local61;
				local65.anInt6515 = Static342.anInt6706;
			} else {
				@Pc(90) int local90 = Static200.aClass4_Sub7_Sub1_2.method1247(2);
				if (local90 == 0) {
					Static39.anIntArray105[Static156.anInt3506++] = local61;
					local65.anInt6515 = Static342.anInt6706;
					Static49.anIntArray122[Static104.anInt6829++] = local61;
				} else {
					@Pc(134) int local134;
					@Pc(144) int local144;
					if (local90 == 1) {
						Static39.anIntArray105[Static156.anInt3506++] = local61;
						local65.anInt6515 = Static342.anInt6706;
						local134 = Static200.aClass4_Sub7_Sub1_2.method1247(3);
						local65.method5438(1, local134);
						local144 = Static200.aClass4_Sub7_Sub1_2.method1247(1);
						if (local144 == 1) {
							Static49.anIntArray122[Static104.anInt6829++] = local61;
						}
					} else if (local90 == 2) {
						Static39.anIntArray105[Static156.anInt3506++] = local61;
						local65.anInt6515 = Static342.anInt6706;
						if (Static200.aClass4_Sub7_Sub1_2.method1247(1) == 1) {
							local134 = Static200.aClass4_Sub7_Sub1_2.method1247(3);
							local65.method5438(2, local134);
							local144 = Static200.aClass4_Sub7_Sub1_2.method1247(3);
							local65.method5438(2, local144);
						} else {
							local134 = Static200.aClass4_Sub7_Sub1_2.method1247(3);
							local65.method5438(0, local134);
						}
						local134 = Static200.aClass4_Sub7_Sub1_2.method1247(1);
						if (local134 == 1) {
							Static49.anIntArray122[Static104.anInt6829++] = local61;
						}
					} else if (local90 == 3) {
						Static19.anIntArray539[Static52.anInt1189++] = local61;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "(II)V")
	public static void method5196(@OriginalArg(0) int arg0) {
		Static75.method1394();
		Static210.method4726();
		Static137.method2729(true, arg0);
		Static138.method2739(Static58.aClass11_24, Static292.aClass11_130, Static164.aClass92_7);
		Static317.method5266(Static164.aClass92_7, Static292.aClass11_130);
		Static323.method5320(Static164.aClass60Array7);
		Static210.method4723();
		Static240.method4159();
		if (Static139.anInt3135 == 10) {
			Static156.method3020(false);
		} else if (Static139.anInt3135 == 30) {
			Static233.method3965(25);
			return;
		} else if (Static139.anInt3135 == 5) {
			Static143.method2800(Static164.aClass92_7, Static292.aClass11_130);
			return;
		}
	}
}
