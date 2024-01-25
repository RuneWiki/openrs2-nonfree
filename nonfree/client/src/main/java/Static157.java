import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "[I")
	public static final int[] anIntArray135 = new int[3];

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "[I")
	public static final int[] anIntArray136 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
	public static int anInt2629 = -1;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIII)V")
	public static void method2196(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static149.anInt7384 < arg3 || Static74.anInt1413 > arg0) {
			return;
		}
		@Pc(27) boolean local27;
		if (Static271.anInt4271 > arg1) {
			local27 = false;
			arg1 = Static271.anInt4271;
		} else if (Static13.anInt263 < arg1) {
			local27 = false;
			arg1 = Static13.anInt263;
		} else {
			local27 = true;
		}
		@Pc(55) boolean local55;
		if (Static271.anInt4271 > arg2) {
			local55 = false;
			arg2 = Static271.anInt4271;
		} else if (arg2 <= Static13.anInt263) {
			local55 = true;
		} else {
			local55 = false;
			arg2 = Static13.anInt263;
		}
		if (Static74.anInt1413 > arg3) {
			arg3 = Static74.anInt1413;
		} else {
			Static298.method3891(arg2, arg1, Static106.anIntArrayArray46[arg3++], arg4);
		}
		if (arg0 <= Static149.anInt7384) {
			Static298.method3891(arg2, arg1, Static106.anIntArrayArray46[arg0--], arg4);
		} else {
			arg0 = Static149.anInt7384;
		}
		@Pc(113) int local113;
		if (local27 && local55) {
			for (local113 = arg3; local113 <= arg0; local113++) {
				@Pc(161) int[] local161 = Static106.anIntArrayArray46[local113];
				local161[arg1] = local161[arg2] = arg4;
			}
		} else if (local27) {
			for (local113 = arg3; local113 <= arg0; local113++) {
				Static106.anIntArrayArray46[local113][arg1] = arg4;
			}
		} else if (local55) {
			for (local113 = arg3; local113 <= arg0; local113++) {
				Static106.anIntArrayArray46[local113][arg2] = arg4;
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIIZ)V")
	public static void method2198(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static159.aClass82ArrayArrayArray2 == null) {
			Static213.aClass128_22.method3580(arg2, arg3, arg1, -16777216, arg0);
		} else if (Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6613 >= 0 && Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6613 < Static425.anInt6922 * 128 && Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6616 >= 0 && Static251.anInt4072 * 128 > Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6616) {
			Static116.anInt5420++;
			if (Static239.aClass20_Sub3_Sub3_Sub1_1 != null && Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6613 + 64 - Static239.aClass20_Sub3_Sub3_Sub1_1.method4678() * 64 >> 7 == Static174.anInt2859 && Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6616 + 64 - Static239.aClass20_Sub3_Sub3_Sub1_1.method4678() * 64 >> 7 == Static313.anInt5206) {
				Static313.anInt5206 = -1;
				Static174.anInt2859 = -1;
				Static124.method1715();
			}
			Static306.method3998();
			if (!arg4) {
				Static218.method4368();
			}
			Static98.method1400();
			Static125.method1722(true, arg1, arg3, arg0, arg2);
			@Pc(106) int local106 = Static226.anInt5821;
			@Pc(108) int local108 = Static162.anInt2668;
			@Pc(110) int local110 = Static248.anInt4064;
			@Pc(112) int local112 = Static430.anInt7184;
			@Pc(128) int local128;
			@Pc(163) int local163;
			if (Static100.anInt1781 == 1) {
				local128 = (int) Static278.aFloat52;
				if (local128 < Static220.anInt3560 >> 8) {
					local128 = Static220.anInt3560 >> 8;
				}
				if (Static35.aBooleanArray6[4] && local128 < Static140.anIntArray113[4] + 128) {
					local128 = Static140.anIntArray113[4] + 128;
				}
				local163 = (int) Static95.aFloat27 + Static104.anInt7242 & 0x3FFF;
				Static32.method555(Static155.anInt2606, local163, (local128 >> 3) * 3 + 600 << 0, Static183.method4175(Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6616, Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6613, Static138.anInt3548) - 50, Static327.anInt5372, local106, local128);
			} else if (Static100.anInt1781 == 4) {
				local128 = (int) Static278.aFloat52;
				if (Static220.anInt3560 >> 8 > local128) {
					local128 = Static220.anInt3560 >> 8;
				}
				if (Static35.aBooleanArray6[4] && Static140.anIntArray113[4] + 128 > local128) {
					local128 = Static140.anIntArray113[4] + 128;
				}
				local163 = (int) Static95.aFloat27 & 0x3FFF;
				Static32.method555(Static155.anInt2606, local163, (local128 >> 3) * 3 + 600 << 0, Static183.method4175(Static317.anInt5271, Static446.anInt7388, Static138.anInt3548) - 50, Static327.anInt5372, local106, local128);
			} else if (Static100.anInt1781 == 5) {
				Static388.method791(local106);
			}
			local128 = Static278.anInt4391;
			local163 = Static5.anInt113;
			@Pc(268) int local268 = Static8.anInt7337;
			@Pc(270) int local270 = Static401.anInt3623;
			@Pc(272) int local272 = Static409.anInt6636;
			@Pc(315) int local315;
			for (@Pc(274) int local274 = 0; local274 < 5; local274++) {
				if (Static35.aBooleanArray6[local274]) {
					local315 = (int) ((double) (Static2.anIntArray168[local274] * 2 + 1) * Math.random() - (double) Static2.anIntArray168[local274] + Math.sin((double) Static387.anIntArray397[local274] / 100.0D * (double) Static65.anIntArray55[local274]) * (double) Static140.anIntArray113[local274]);
					if (local274 == 2) {
						Static8.anInt7337 += local315;
					}
					if (local274 == 0) {
						Static278.anInt4391 += local315;
					}
					if (local274 == 1) {
						Static5.anInt113 += local315;
					}
					if (local274 == 3) {
						Static409.anInt6636 = Static409.anInt6636 + local315 & 0x3FFF;
					}
					if (local274 == 4) {
						Static401.anInt3623 += local315;
						if (Static401.anInt3623 < 1024) {
							Static401.anInt3623 = 1024;
						} else if (Static401.anInt3623 > 3072) {
							Static401.anInt3623 = 3072;
						}
					}
				}
			}
			if (Static278.anInt4391 < 0) {
				Static278.anInt4391 = 0;
			}
			if (Static278.anInt4391 > (Static362.anInt6113 << 7) - 1) {
				Static278.anInt4391 = (Static362.anInt6113 << 7) - 1;
			}
			if (Static8.anInt7337 < 0) {
				Static8.anInt7337 = 0;
			}
			if ((Static195.anInt3127 << 7) - 1 < Static8.anInt7337) {
				Static8.anInt7337 = (Static195.anInt3127 << 7) - 1;
			}
			Static140.method1857();
			Static347.method4406();
			Static213.aClass128_22.pa(local110, local112, local110 + local108, local106 + local112);
			Static213.aClass128_22.method3582();
			local315 = Static354.anInt5870;
			if (Static25.aClass256_1 == null) {
				Static213.aClass128_22.M(local315);
			} else {
				Static25.aClass256_1.method5476(Static366.anInt6203 << 3, Static213.aClass128_22, local315, local112, Static409.anInt6636, local108, local110, Static401.anInt3623, local106);
			}
			Static15.method239();
			Static217.aClass40_5.Q(Static278.anInt4391, Static5.anInt113, Static8.anInt7337, -Static401.anInt3623 & 0x3FFF, -Static409.anInt6636 & 0x3FFF, -Static376.anInt6292 & 0x3FFF);
			Static213.aClass128_22.m(Static217.aClass40_5);
			Static213.aClass128_22.GA(local108 / 2 + local110, local106 / 2 + local112, Static320.anInt5290 << 1, Static320.anInt5290 << 1);
			Static411.method5139(local112 + local106 / 2, local110 + local108 / 2, Static320.anInt5290 << 1, Static320.anInt5290 << 1);
			Static394.method4975(Static8.anInt7337, -Static409.anInt6636 & 0x3FFF, -Static401.anInt3623 & 0x3FFF, -Static376.anInt6292 & 0x3FFF, Static278.anInt4391, Static5.anInt113);
			@Pc(548) byte local548 = Static336.aClass106_Sub1_1.method4430(Static410.anInt6680) == 2 ? (byte) Static116.anInt5420 : 1;
			Static440.method5525(Static213.aClass128_22, Static368.anInt6250, Static448.anInt6654, Static217.aClass40_5, Static278.anInt4391, Static5.anInt113, Static8.anInt7337, Static417.aByteArrayArrayArray3, Static355.anIntArray347, Static331.anIntArray328, Static425.anIntArray461, Static367.anIntArray377, Static127.anIntArray104, Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89 + 1, local548, Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6613 >> 7, Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6616 >> 7, !Static336.aClass106_Sub1_1.aBoolean471);
			Static15.method239();
			if (Static98.anInt1721 == 30) {
				Static403.method5022(local112, local110, local106, local108);
				Static236.method3114(local112, local106, local110, local108);
				Static204.method2779(local106, local110, local112, local108);
				Static62.method969(local112, local106, local110, local108);
			}
			Static343.method4362();
			Static409.anInt6636 = local272;
			Static401.anInt3623 = local270;
			Static278.anInt4391 = local128;
			Static5.anInt113 = local163;
			Static8.anInt7337 = local268;
			if (Static391.aBoolean527 && Static316.aClass19_1.method403() == 0) {
				Static391.aBoolean527 = false;
			}
			if (Static391.aBoolean527) {
				Static213.aClass128_22.method3580(local112, local110, local106, -16777216, local108);
				Static357.method4619(Static275.aClass16_2, Static81.aClass151_51.method3122(Static188.anInt3028), false);
			}
		} else {
			Static213.aClass128_22.method3580(arg2, arg3, arg1, -16777216, arg0);
		}
	}
}
