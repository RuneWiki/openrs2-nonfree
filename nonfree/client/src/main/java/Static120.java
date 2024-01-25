import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!ei", name = "y", descriptor = "I")
	public static int anInt2612;

	@OriginalMember(owner = "client!ei", name = "C", descriptor = "[I")
	public static final int[] anIntArray206 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IZIIB)V")
	public static void method2369(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!arg1 && Static335.anInt6221 == arg0 && arg2 == Static94.anInt2266 && (Static493.anInt8836 == Static410.anInt7667 || Static104.aClass6_Sub6_Sub1_4.method1075(Static5.anInt145))) {
			return;
		}
		Static410.anInt7667 = Static493.anInt8836;
		Static335.anInt6221 = arg0;
		Static94.anInt2266 = arg2;
		if (Static104.aClass6_Sub6_Sub1_4.method1075(Static5.anInt145)) {
			Static410.anInt7667 = 0;
		}
		Static145.method2683(arg3);
		Static526.method7658(Static222.aClass152_11.method4002(Static286.anInt5468), true, Static42.aClass73_1);
		@Pc(56) int local56 = Static191.anInt4147;
		@Pc(58) int local58 = Static247.anInt5049;
		Static191.anInt4147 = (Static335.anInt6221 - (Static228.anInt4746 >> 4)) * 8;
		Static247.anInt5049 = (Static94.anInt2266 - (Static44.anInt1275 >> 4)) * 8;
		Static428.aClass6_Sub4_Sub12_5 = Static461.method102(Static335.anInt6221 * 8, Static94.anInt2266 * 8);
		Static335.aClass183_3 = null;
		@Pc(89) int local89 = Static191.anInt4147 - local56;
		@Pc(94) int local94 = Static247.anInt5049 - local58;
		@Pc(107) int local107;
		@Pc(115) int local115;
		@Pc(181) int local181;
		if (arg3 == 11) {
			for (@Pc(277) int local277 = 0; local277 < Static452.anInt8286; local277++) {
				@Pc(283) Class6_Sub33 local283 = Static9.aClass6_Sub33Array1[local277];
				if (local283 != null) {
					@Pc(288) Class11_Sub1_Sub1_Sub1 local288 = local283.aClass11_Sub1_Sub1_Sub1_2;
					for (local115 = 0; local115 < 10; local115++) {
						local288.anIntArray526[local115] -= local89;
						local288.anIntArray527[local115] -= local94;
					}
					local288.anInt7347 -= local89 * 512;
					local288.anInt7351 -= local94 * 512;
				}
			}
		} else {
			@Pc(99) boolean local99 = false;
			Static208.anInt4409 = 0;
			local107 = (Static228.anInt4746 - 1) * 512;
			@Pc(113) int local113 = (Static44.anInt1275 - 1) * 512;
			for (local115 = 0; local115 < Static452.anInt8286; local115++) {
				@Pc(121) Class6_Sub33 local121 = Static9.aClass6_Sub33Array1[local115];
				if (local121 != null) {
					@Pc(126) Class11_Sub1_Sub1_Sub1 local126 = local121.aClass11_Sub1_Sub1_Sub1_2;
					local126.anInt7351 -= local94 * 512;
					local126.anInt7347 -= local89 * 512;
					if (local126.anInt7347 >= 0 && local126.anInt7347 <= local107 && local126.anInt7351 >= 0 && local126.anInt7351 <= local113) {
						@Pc(179) boolean local179 = true;
						for (local181 = 0; local181 < 10; local181++) {
							local126.anIntArray526[local181] -= local89;
							local126.anIntArray527[local181] -= local94;
							if (local126.anIntArray526[local181] < 0 || Static228.anInt4746 <= local126.anIntArray526[local181] || local126.anIntArray527[local181] < 0 || local126.anIntArray527[local181] >= Static44.anInt1275) {
								local179 = false;
							}
						}
						if (local179) {
							Static70.anIntArray111[Static208.anInt4409++] = local126.anInt7392;
						} else {
							local126.method611(null);
							local99 = true;
							local121.method8151();
						}
					} else {
						local126.method611(null);
						local121.method8151();
						local99 = true;
					}
				}
			}
			if (local99) {
				Static452.anInt8286 = Static506.aClass305_36.method7443();
				Static506.aClass305_36.method7442(Static9.aClass6_Sub33Array1);
			}
		}
		for (local107 = 0; local107 < 2048; local107++) {
			@Pc(348) Class11_Sub1_Sub1_Sub2 local348 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local107];
			if (local348 != null) {
				for (local115 = 0; local115 < 10; local115++) {
					local348.anIntArray526[local115] -= local89;
					local348.anIntArray527[local115] -= local94;
				}
				local348.anInt7347 -= local89 * 512;
				local348.anInt7351 -= local94 * 512;
			}
		}
		@Pc(396) Class332[] local396 = Static83.aClass332Array2;
		for (local115 = 0; local115 < local396.length; local115++) {
			@Pc(404) Class332 local404 = local396[local115];
			if (local404 != null) {
				local404.anInt9339 -= local89 * 512;
				local404.anInt9343 -= local94 * 512;
			}
		}
		for (@Pc(432) Class6_Sub41 local432 = (Class6_Sub41) Static532.aClass211_72.method5183(); local432 != null; local432 = (Class6_Sub41) Static532.aClass211_72.method5177()) {
			local432.anInt8273 -= local89;
			local432.anInt8275 -= local94;
			if (Static314.anInt8010 != 4 && (local432.anInt8273 < 0 || local432.anInt8275 < 0 || local432.anInt8273 >= Static228.anInt4746 || Static44.anInt1275 <= local432.anInt8275)) {
				local432.method8151();
			}
		}
		if (Static314.anInt8010 != 4) {
			for (@Pc(494) Class6_Sub35 local494 = (Class6_Sub35) Static516.aClass305_37.method7445(); local494 != null; local494 = (Class6_Sub35) Static516.aClass305_37.method7449()) {
				@Pc(502) int local502 = (int) (local494.aLong252 & 0x3FFFL);
				local181 = local502 - Static191.anInt4147;
				@Pc(515) int local515 = (int) (local494.aLong252 >> 14 & 0x3FFFL);
				@Pc(520) int local520 = local515 - Static247.anInt5049;
				if (local181 < 0 || local520 < 0 || local181 >= Static228.anInt4746 || local520 >= Static44.anInt1275) {
					local494.method8151();
				}
			}
		}
		if (Static350.anInt5889 != 0) {
			Static484.anInt8777 -= local94;
			Static350.anInt5889 -= local89;
		}
		Static151.method2919();
		if (arg3 != 11) {
			Static390.anInt7318 -= local94 * 512;
			Static228.anInt4743 -= local89;
			Static503.anInt8950 -= local94;
			Static252.anInt5118 -= local89;
			Static86.anInt2132 -= local89 * 512;
			Static367.anInt6943 -= local94;
			if (Math.abs(local89) > Static228.anInt4746 || Math.abs(local94) > Static44.anInt1275) {
				Static200.method3771();
			}
		} else if (Static84.anInt1994 == 4) {
			Static99.anInt2351 -= local89 * 512;
			Static252.anInt5119 -= local94 * 512;
			Static357.anInt6870 -= local89 * 512;
			Static131.anInt2843 -= local94 * 512;
		} else {
			Static84.anInt1994 = 1;
		}
		Static480.method7889();
		Static514.method7577();
		Static409.aClass211_62.method5179();
		Static565.aClass211_73.method5179();
		Static58.aClass267_2.method6536();
		Static145.method2682();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!oa;Lclient!ep;Z)V")
	public static void method2372(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class93 arg1) {
		@Pc(40) boolean local40 = Static98.aClass203_1.method4909(arg1.anInt2739, arg0, arg1.anInt2822, arg1.anInt2740, arg1.aBoolean224 ? Static350.aClass11_Sub1_Sub1_Sub2_4.aClass67_1 : null, arg1.anInt2787 | 0xFF000000, arg1.anInt2747) == null;
		if (local40) {
			Static478.aClass211_69.method5173(new Class6_Sub36(arg1.anInt2822, arg1.anInt2739, arg1.anInt2747, arg1.anInt2787 | 0xFF000000, arg1.anInt2740, arg1.aBoolean224));
			Static468.method7221(arg1);
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIBI)I")
	public static int method2377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 4095 - arg0;
		} else if (local7 == 2) {
			return 4095 - arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg6 - arg0;
		@Pc(20) int local20 = arg5 - arg0;
		@Pc(24) int local24 = arg6 * arg6;
		@Pc(28) int local28 = arg5 * arg5;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg5 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(70) int local70 = (1 - local56) * local24 + local40;
		@Pc(79) int local79 = local28 - (local56 - 1) * local44;
		@Pc(88) int local88 = local48 + local32 * (1 - local60);
		@Pc(97) int local97 = local36 - local52 * (local60 - 1);
		@Pc(101) int local101 = local24 << 2;
		@Pc(105) int local105 = local28 << 2;
		@Pc(109) int local109 = local32 << 2;
		@Pc(113) int local113 = local36 << 2;
		@Pc(117) int local117 = local40 * 3;
		@Pc(123) int local123 = local44 * (local56 - 3);
		@Pc(127) int local127 = local48 * 3;
		@Pc(133) int local133 = (local60 - 3) * local52;
		@Pc(135) int local135 = local105;
		@Pc(141) int local141 = local101 * (arg5 - 1);
		@Pc(143) int local143 = local113;
		@Pc(149) int local149 = (local20 - 1) * local109;
		@Pc(153) int[] local153 = Static183.anIntArrayArray26[arg2];
		Static115.method2332(arg3 - arg6, arg3 - local16, arg1, local153);
		Static115.method2332(arg3 - local16, arg3 - -local16, arg4, local153);
		Static115.method2332(arg3 + local16, arg6 + arg3, arg1, local153);
		while (local9 > 0) {
			@Pc(200) boolean local200 = local20 >= local9;
			if (local70 < 0) {
				while (local70 < 0) {
					local79 += local135;
					local70 += local117;
					local135 += local105;
					local117 += local105;
					local7++;
				}
			}
			if (local200) {
				if (local88 < 0) {
					while (local88 < 0) {
						local97 += local143;
						local88 += local127;
						local11++;
						local143 += local113;
						local127 += local113;
					}
				}
				if (local97 < 0) {
					local97 += local143;
					local88 += local127;
					local127 += local113;
					local143 += local113;
					local11++;
				}
				local97 += -local133;
				local88 += -local149;
				local149 -= local109;
				local133 -= local109;
			}
			if (local79 < 0) {
				local79 += local135;
				local70 += local117;
				local7++;
				local117 += local105;
				local135 += local105;
			}
			local79 += -local123;
			local70 += -local141;
			local123 -= local101;
			local141 -= local101;
			local9--;
			@Pc(334) int local334 = arg2 - local9;
			@Pc(338) int local338 = local9 + arg2;
			@Pc(342) int local342 = local7 + arg3;
			@Pc(347) int local347 = arg3 - local7;
			if (local200) {
				@Pc(372) int local372 = arg3 + local11;
				@Pc(377) int local377 = arg3 - local11;
				Static115.method2332(local347, local377, arg1, Static183.anIntArrayArray26[local334]);
				Static115.method2332(local377, local372, arg4, Static183.anIntArrayArray26[local334]);
				Static115.method2332(local372, local342, arg1, Static183.anIntArrayArray26[local334]);
				Static115.method2332(local347, local377, arg1, Static183.anIntArrayArray26[local338]);
				Static115.method2332(local377, local372, arg4, Static183.anIntArrayArray26[local338]);
				Static115.method2332(local372, local342, arg1, Static183.anIntArrayArray26[local338]);
			} else {
				Static115.method2332(local347, local342, arg1, Static183.anIntArrayArray26[local334]);
				Static115.method2332(local347, local342, arg1, Static183.anIntArrayArray26[local338]);
			}
		}
	}
}
