import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!tf", name = "J", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_99 = new Class177(22, 16);

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIII)V")
	public static void method5367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg4 + arg2;
		@Pc(14) int local14 = arg3 - arg2;
		for (@Pc(29) int local29 = arg4; local29 < local10; local29++) {
			Static228.method3480(arg0, arg1, Static60.anIntArrayArray14[local29], arg5);
		}
		for (@Pc(49) int local49 = arg3; local49 > local14; local49--) {
			Static228.method3480(arg0, arg1, Static60.anIntArrayArray14[local49], arg5);
		}
		@Pc(72) int local72 = arg5 - arg2;
		@Pc(77) int local77 = arg0 + arg2;
		for (@Pc(79) int local79 = local10; local79 <= local14; local79++) {
			@Pc(85) int[] local85 = Static60.anIntArrayArray14[local79];
			Static228.method3480(arg0, arg1, local85, local77);
			Static228.method3480(local72, arg1, local85, arg5);
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZIIII)V")
	public static void method5370(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static67.aClass252ArrayArrayArray2 == null) {
			Static30.aClass106_3.method5941(arg4, arg3, arg0, arg2, -16777216);
		} else if (Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7490 >= 0 && Static209.anInt4283 * 128 > Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7490 && Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7488 >= 0 && Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7488 < Static211.anInt4295 * 128) {
			Static140.anInt3086++;
			if (Static429.aClass30_Sub1_Sub1_Sub2_2 != null && Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7490 + 64 - Static429.aClass30_Sub1_Sub1_Sub2_2.method944() * 64 >> 7 == Static270.anInt5251 && Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7488 + 64 - Static429.aClass30_Sub1_Sub1_Sub2_2.method944() * 64 >> 7 == Static57.anInt1519) {
				Static270.anInt5251 = -1;
				Static57.anInt1519 = -1;
				Static283.method4168();
			}
			Static266.method3952();
			if (!arg1) {
				Static379.method5241();
			}
			Static431.method5780();
			Static296.method4298(arg0, arg4, arg2, true, arg3);
			@Pc(109) int local109 = Static380.anInt6895;
			@Pc(116) int local116 = Static133.anInt2957;
			@Pc(118) int local118 = Static263.anInt5075;
			@Pc(120) int local120 = Static265.anInt5119;
			@Pc(126) int local126;
			@Pc(163) int local163;
			if (Static21.anInt6762 == 1) {
				local126 = (int) Static26.aFloat5;
				if (Static3.anInt49 >> 8 > local126) {
					local126 = Static3.anInt49 >> 8;
				}
				if (Static194.aBooleanArray16[4] && Static23.anIntArray41[4] + 128 > local126) {
					local126 = Static23.anIntArray41[4] + 128;
				}
				local163 = Static167.anInt5709 + (int) Static267.aFloat83 & 0x3FFF;
				Static166.method2706(Static162.anInt3418, Static323.anInt5976, local116, Static227.method3475(Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7490, Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7488, Static426.anInt1486) - 50, local126, (local126 >> 3) * 3 + 600 << 0, local163);
			} else if (Static21.anInt6762 == 4) {
				local126 = (int) Static26.aFloat5;
				if (local126 < Static3.anInt49 >> 8) {
					local126 = Static3.anInt49 >> 8;
				}
				if (Static194.aBooleanArray16[4] && local126 < Static23.anIntArray41[4] + 128) {
					local126 = Static23.anIntArray41[4] + 128;
				}
				local163 = (int) Static267.aFloat83 & 0x3FFF;
				Static166.method2706(Static162.anInt3418, Static323.anInt5976, local116, Static227.method3475(Static224.anInt7016, Static459.anInt7963, Static426.anInt1486) - 50, local126, (local126 >> 3) * 3 + 600 << 0, local163);
			} else if (Static21.anInt6762 == 5) {
				Static352.method5015(local116);
			}
			local126 = Static378.anInt6885;
			local163 = Static107.anInt2426;
			@Pc(272) int local272 = Static78.anInt1973;
			@Pc(274) int local274 = Static217.anInt4351;
			@Pc(276) int local276 = Static147.anInt3170;
			@Pc(319) int local319;
			for (@Pc(278) int local278 = 0; local278 < 5; local278++) {
				if (Static194.aBooleanArray16[local278]) {
					local319 = (int) (Math.random() * (double) (Static35.anIntArray71[local278] * 2 + 1) - (double) Static35.anIntArray71[local278] + Math.sin((double) Static169.anIntArray354[local278] / 100.0D * (double) Static275.anIntArray501[local278]) * (double) Static23.anIntArray41[local278]);
					if (local278 == 4) {
						Static217.anInt4351 += local319;
						if (Static217.anInt4351 < 1024) {
							Static217.anInt4351 = 1024;
						} else if (Static217.anInt4351 > 3072) {
							Static217.anInt4351 = 3072;
						}
					}
					if (local278 == 0) {
						Static378.anInt6885 += local319;
					}
					if (local278 == 1) {
						Static107.anInt2426 += local319;
					}
					if (local278 == 3) {
						Static147.anInt3170 = local319 + Static147.anInt3170 & 0x3FFF;
					}
					if (local278 == 2) {
						Static78.anInt1973 += local319;
					}
				}
			}
			if (Static378.anInt6885 < 0) {
				Static378.anInt6885 = 0;
			}
			if ((Static216.anInt4346 << 7) - 1 < Static378.anInt6885) {
				Static378.anInt6885 = (Static216.anInt4346 << 7) - 1;
			}
			if (Static78.anInt1973 < 0) {
				Static78.anInt1973 = 0;
			}
			if ((Static198.anInt7949 << 7) - 1 < Static78.anInt1973) {
				Static78.anInt1973 = (Static198.anInt7949 << 7) - 1;
			}
			Static245.method3652();
			Static106.method1755();
			Static30.aClass106_3.ba(local118, local120, local109 + local118, local116 + local120);
			Static30.aClass106_3.method5926();
			local319 = Static47.anInt7026;
			if (Static311.aClass189_1 == null) {
				Static30.aClass106_3.t(local319);
			} else {
				Static311.aClass189_1.method4275(Static30.aClass106_3, Static7.anInt92 << 3, local109, Static217.anInt4351, local116, local118, local319, local120, Static147.anInt3170);
			}
			Static326.method4622();
			Static343.aClass40_4.YA(Static378.anInt6885, Static107.anInt2426, Static78.anInt1973, -Static217.anInt4351 & 0x3FFF, -Static147.anInt3170 & 0x3FFF, -Static403.anInt7268 & 0x3FFF);
			Static30.aClass106_3.SA(Static343.aClass40_4);
			Static30.aClass106_3.GA(local109 / 2 + local118, local120 + local116 / 2, Static343.anInt6324 << 1, Static343.anInt6324 << 1);
			Static17.method328(local109 / 2 + local118, Static343.anInt6324 << 1, Static343.anInt6324 << 1, local116 / 2 + local120);
			Static3.method42(-Static403.anInt7268 & 0x3FFF, Static107.anInt2426, Static378.anInt6885, Static78.anInt1973, -Static217.anInt4351 & 0x3FFF, -Static147.anInt3170 & 0x3FFF);
			@Pc(546) byte local546 = Static12.aClass34_Sub1_1.method5470(Static262.anInt2805) == 2 ? (byte) Static140.anInt3086 : 1;
			Static92.method1570(Static30.aClass106_3, Static187.anInt3975, Static453.anInt7926, Static343.aClass40_4, Static378.anInt6885, Static107.anInt2426, Static78.anInt1973, Static237.aByteArrayArrayArray15, Static334.anIntArray577, Static53.anIntArray133, Static203.anIntArray400, Static1.anIntArray4, Static184.anIntArray385, Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102 + 1, local546, Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7490 >> 7, Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7488 >> 7, !Static12.aClass34_Sub1_1.aBoolean456);
			Static326.method4622();
			if (Static170.anInt3494 == 9) {
				Static194.method3149(local109, local120, local116, local118);
				Static385.method5373(local109, local116, local120, local118);
				Static147.method2348(local120, local118, local109, local116);
				Static397.method5472(local109, local120, local116, local118);
			}
			Static28.method566();
			Static147.anInt3170 = local276;
			Static78.anInt1973 = local272;
			Static107.anInt2426 = local163;
			Static378.anInt6885 = local126;
			Static217.anInt4351 = local274;
			if (Static31.aBoolean129 && Static175.aClass159_2.method3611() == 0) {
				Static31.aBoolean129 = false;
			}
			if (Static31.aBoolean129) {
				Static30.aClass106_3.method5941(local120, local109, local118, local116, -16777216);
				Static338.method5238(false, Static374.aClass158_147.method3594(Static365.anInt6682), Static308.aClass20_5);
			}
		} else {
			Static30.aClass106_3.method5941(arg4, arg3, arg0, arg2, -16777216);
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILclient!ou;IIIIILclient!ou;I)V")
	public static void method5371(@OriginalArg(1) int arg0, @OriginalArg(2) Class30_Sub1_Sub1 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) Class30_Sub1_Sub1 arg5, @OriginalArg(9) int arg6) {
		@Pc(9) int local9 = arg1.method942();
		if (local9 == -1) {
			return;
		}
		@Pc(27) Class137 local27 = (Class137) Static300.aClass91_77.method1988((long) local9);
		if (local27 == null) {
			@Pc(34) Class266[] local34 = Static470.method6051(Static140.aClass211_38, local9);
			if (local34 == null) {
				return;
			}
			local27 = Static30.aClass106_3.method5938(local34[0]);
			Static300.aClass91_77.method1990(local27, (long) local9);
		}
		Static127.method2086(arg5.method944() * 64, 0, arg5.aByte102, arg0 >> 1, arg4 >> 1, arg5.anInt7488, arg5.anInt7490);
		@Pc(80) int local80 = Static156.anIntArray346[0] + arg2 - 18;
		@Pc(90) int local90 = arg6 + Static156.anIntArray346[1] - 16 - 54;
		@Pc(98) int local98 = local80 + arg3 / 4 * 18;
		@Pc(106) int local106 = local90 + arg3 % 4 * 18;
		local27.method5708(local98, local106);
		if (arg1 == arg5) {
			Static30.aClass106_3.method5916(18, -256, 18, local106 - 1, local98 + -1);
		}
		@Pc(128) Class41_Sub2 local128 = Static98.method1697();
		local128.anInt2752 = local106 + 16;
		local128.aClass30_Sub1_Sub1_1 = arg1;
		local128.anInt2754 = local98;
		local128.anInt2750 = local106;
		local128.anInt2753 = local98 + 16;
		Static251.aClass117_7.method2961(local128);
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(B)V")
	public static void method5372() {
		if (Static290.aBoolean340) {
			return;
		}
		if (Static12.aClass34_Sub1_1.aBoolean454) {
			Static267.aFloat83 = (int) Static267.aFloat83 + 191 & 0xFFFFFF80;
		} else {
			Static214.aFloat101 += (24.0F - Static214.aFloat101) / 2.0F;
		}
		Static450.aBoolean515 = true;
		Static290.aBoolean340 = true;
	}
}
