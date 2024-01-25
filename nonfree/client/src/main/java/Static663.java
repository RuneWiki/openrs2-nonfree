import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static663 {

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_154 = new Class216(58, 7);

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
	public static int anInt10412 = -1;

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "[B")
	public static final byte[] aByteArray104 = new byte[2048];

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIBZ)V")
	public static void method8788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static267.aClass73ArrayArrayArray2 == null) {
			Static582.aClass33_13.method8103(arg0, arg1, -16777216, arg2, arg3);
		} else if (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9925 >= 0 && Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9925 < Static224.anInt3557 * 512 && Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9917 >= 0 && Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9917 < Static267.anInt4309 * 512) {
			Static472.anInt7502++;
			if (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4 != null && Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9925 + 256 - Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.method8514() * 256 >> 9 == Static78.anInt1643 && Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9917 - (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.method8514() - 1) * 256 >> 9 == Static110.anInt2183) {
				Static110.anInt2183 = -1;
				Static78.anInt1643 = -1;
				Static519.method7017();
			}
			Static507.method6914();
			if (!arg4) {
				Static550.method7315();
			}
			Static359.method4794();
			Static532.method7159(arg2, arg1, arg0, arg3, true);
			@Pc(108) int local108 = Static31.anInt9762;
			@Pc(110) int local110 = Static174.anInt3061;
			Static140.anInt8126 = Static140.anInt8125;
			@Pc(114) int local114 = Static211.anInt10621;
			@Pc(116) int local116 = Static509.anInt7968;
			@Pc(124) int local124;
			@Pc(161) int local161;
			if (Static259.anInt4200 == 1) {
				local124 = (int) Static275.aFloat105;
				if (local124 < Static201.anInt3305 >> 8) {
					local124 = Static201.anInt3305 >> 8;
				}
				if (Static527.aBooleanArray18[4] && local124 < Static131.anIntArray160[4] + 128) {
					local124 = Static131.anIntArray160[4] + 128;
				}
				local161 = (int) Static642.aFloat230 + Static617.anInt9695 & 0x3FFF;
				Static203.method3068(Static674.method8951(Static296.anInt4684, Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9917, Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9925) - 200, Static27.anInt610, (local124 >> 3) * 3 + 600 << 2, local116, Static11.anInt171, local124, local161);
			} else if (Static259.anInt4200 == 4) {
				local124 = (int) Static275.aFloat105;
				if (local124 < Static201.anInt3305 >> 8) {
					local124 = Static201.anInt3305 >> 8;
				}
				if (Static527.aBooleanArray18[4] && Static131.anIntArray160[4] + 128 > local124) {
					local124 = Static131.anIntArray160[4] + 128;
				}
				local161 = (int) Static642.aFloat230 & 0x3FFF;
				Static203.method3068(Static674.method8951(Static296.anInt4684, Static149.anInt2728, Static443.anInt6913) - 200, Static27.anInt610, (local124 >> 3) * 3 + 600 << 2, local116, Static11.anInt171, local124, local161);
			} else if (Static259.anInt4200 == 5) {
				Static325.method4489(local116);
			}
			local124 = Static611.anInt9382;
			local161 = Static618.anInt9710;
			@Pc(268) int local268 = Static652.anInt10283;
			@Pc(270) int local270 = Static383.anInt9871;
			@Pc(272) int local272 = Static226.anInt3586;
			for (@Pc(274) int local274 = 0; local274 < 5; local274++) {
				if (Static527.aBooleanArray18[local274]) {
					@Pc(315) int local315 = (int) ((double) (Static199.anIntArray242[local274] * 2 + 1) * Math.random() - (double) Static199.anIntArray242[local274] + Math.sin((double) Static231.anIntArray576[local274] / 100.0D * (double) Static395.anIntArray212[local274]) * (double) Static131.anIntArray160[local274]);
					if (local274 == 0) {
						Static611.anInt9382 += local315 << 2;
					}
					if (local274 == 3) {
						Static226.anInt3586 = Static226.anInt3586 + local315 & 0x3FFF;
					}
					if (local274 == 2) {
						Static652.anInt10283 += local315 << 2;
					}
					if (local274 == 1) {
						Static618.anInt9710 += local315 << 2;
					}
					if (local274 == 4) {
						Static383.anInt9871 += local315;
						if (Static383.anInt9871 < 1024) {
							Static383.anInt9871 = 1024;
						} else if (Static383.anInt9871 > 3072) {
							Static383.anInt9871 = 3072;
						}
					}
				}
			}
			if (Static611.anInt9382 < 0) {
				Static611.anInt9382 = 0;
			}
			if (Static652.anInt10283 < 0) {
				Static652.anInt10283 = 0;
			}
			if ((Static51.anInt1108 << 9) - 1 < Static611.anInt9382) {
				Static611.anInt9382 = (Static51.anInt1108 << 9) - 1;
			}
			if (Static652.anInt10283 > (Static245.anInt7888 << 9) - 1) {
				Static652.anInt10283 = (Static245.anInt7888 << 9) - 1;
			}
			Static103.method2051();
			Static432.method5963();
			Static582.aClass33_13.KA(local110, local108, local114 + local110, local116 + local108);
			Static679.method9005(true);
			if (Static423.aBoolean517) {
				Static520.method7023(Static401.anInt5840);
				if (Static635.anInt9889 != Static140.anInt8126) {
					Static42.aBoolean73 = true;
				}
				Static635.anInt9889 = Static140.anInt8126;
			} else {
				Static582.aClass33_13.ya();
				@Pc(458) int local458 = Static401.anInt5840;
				if (Static596.aClass332_1 == null) {
					Static582.aClass33_13.GA(local458);
				} else {
					Static596.aClass332_1.method7316(local114, local458, Static226.anInt3586, local110, Static383.anInt9871, local116, local108, Static582.aClass33_13, Static31.anInt9748 << 3);
				}
			}
			Static253.method3677();
			Static149.aClass92_2.method3863(Static611.anInt9382, Static618.anInt9710, Static652.anInt10283, -Static383.anInt9871 & 0x3FFF, -Static226.anInt3586 & 0x3FFF, -Static571.anInt8879 & 0x3FFF);
			Static582.aClass33_13.method8133(Static149.aClass92_2);
			Static582.aClass33_13.DA(local114 / 2 + local110, local116 / 2 + local108, Static184.anInt3146 << 1, Static184.anInt3146 << 1);
			Static502.method6840(Static184.anInt3146 << 1, local114 / 2 + local110, Static184.anInt3146 << 1, local116 / 2 + local108);
			Static427.method5928(-Static383.anInt9871 & 0x3FFF, -Static571.anInt8879 & 0x3FFF, Static611.anInt9382, -Static226.anInt3586 & 0x3FFF, Static618.anInt9710, Static652.anInt10283);
			@Pc(581) byte local581 = Static124.aClass4_Sub20_4.aClass8_Sub16_1.method6388() == 2 ? (byte) Static472.anInt7502 : 1;
			if (Static423.aBoolean517) {
				Static162.method2590(-Static571.anInt8879 & 0x3FFF, -Static383.anInt9871 & 0x3FFF, -Static226.anInt3586 & 0x3FFF);
				Static357.method4766(Static289.anIntArray351, Static124.aClass4_Sub20_4.aClass8_Sub5_1.method2985() == 0, Static618.anInt9710, Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9917 >> 9, Static27.anIntArray52, Static533.anIntArray564, Static177.anInt3088, Static558.aByteArrayArrayArray18, Static652.anInt10283, Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141 + 1, Static140.anInt8126, Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9925 >> 9, local581, Static481.anIntArray515, Static248.anIntArray296, Static611.anInt9382);
			} else {
				Static622.method8369(Static177.anInt3088, Static611.anInt9382, Static618.anInt9710, Static652.anInt10283, Static558.aByteArrayArrayArray18, Static27.anIntArray52, Static533.anIntArray564, Static248.anIntArray296, Static289.anIntArray351, Static481.anIntArray515, Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141 + 1, local581, Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9925 >> 9, Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9917 >> 9, Static124.aClass4_Sub20_4.aClass8_Sub5_1.method2985() == 0, Static499.aBoolean608 ? Static140.anInt8126 : -1, 0, false);
			}
			Static253.method3677();
			if (Static656.anInt10356 == 10) {
				Static619.method8337(local116, local110, local108, local114);
				Static194.method3018(local108, local116, local114, local110);
				Static303.method4274(local114, local110, local108, local116);
				Static333.method4595(local110, local108, local116, local114);
			}
			Static307.method7788();
			Static226.anInt3586 = local272;
			Static611.anInt9382 = local124;
			Static383.anInt9871 = local270;
			Static618.anInt9710 = local161;
			Static652.anInt10283 = local268;
			if (Static676.aBoolean801 && Static334.aClass260_4.method5887() == 0) {
				Static676.aBoolean801 = false;
			}
			if (Static676.aBoolean801) {
				Static582.aClass33_13.method8103(local110, local108, -16777216, local116, local114);
				Static460.method6416(Static279.aClass179_12.method4066(Static164.anInt2984), Static636.aClass31_14, Static582.aClass33_13, false, Static189.aClass56_5);
			}
			Static679.method9005(false);
		} else {
			Static582.aClass33_13.method8103(arg0, arg1, -16777216, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLclient!hc;Lclient!hc;)V")
	public static void method8789(@OriginalArg(1) Class4_Sub5 arg0, @OriginalArg(2) Class4_Sub5 arg1) {
		if (arg1.aClass4_Sub5_66 != null) {
			arg1.method8990();
		}
		arg1.aClass4_Sub5_66 = arg0.aClass4_Sub5_66;
		arg1.aClass4_Sub5_67 = arg0;
		arg1.aClass4_Sub5_66.aClass4_Sub5_67 = arg1;
		arg1.aClass4_Sub5_67.aClass4_Sub5_66 = arg1;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V")
	public static void method8790() {
		if (Static618.anInt9708 == 10) {
			Static618.anInt9708 = 11;
		}
	}
}
