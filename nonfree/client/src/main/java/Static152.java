import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
	public static int anInt5119;

	@OriginalMember(owner = "client!ff", name = "y", descriptor = "I")
	public static int anInt5124;

	@OriginalMember(owner = "client!ff", name = "E", descriptor = "[I")
	public static int[] anIntArray292;

	@OriginalMember(owner = "client!ff", name = "G", descriptor = "Lclient!vd;")
	public static Class353 aClass353_47;

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_85 = new Class268(103, 10);

	@OriginalMember(owner = "client!ff", name = "v", descriptor = "I")
	public static int anInt5122 = 0;

	@OriginalMember(owner = "client!ff", name = "F", descriptor = "I")
	public static int anInt5128 = -1;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!oda;Z)Z")
	public static boolean method4562(@OriginalArg(0) Class20_Sub2_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static195.aClass199Array1 == Static510.aClass199Array3;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method9025();
		if (arg0.aShort124 < 0 || arg0.aShort123 < 0 || arg0.aShort125 >= Static544.anInt9353 || arg0.aShort122 >= Static608.anInt10072) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort124; local36 <= arg0.aShort125; local36++) {
			for (local40 = arg0.aShort123; local40 <= arg0.aShort122; local40++) {
				@Pc(47) Class97 local47 = Static635.method8388(arg0.aByte131, local36, local40);
				if (local47 != null) {
					@Pc(53) Class196 local53 = Static225.method3783(arg0);
					@Pc(56) Class196 local56 = local47.aClass196_2;
					if (local56 == null) {
						local47.aClass196_2 = local53;
					} else {
						while (local56.aClass196_3 != null) {
							local56 = local56.aClass196_3;
						}
						local56.aClass196_3 = local53;
					}
					if (local6 && (Static400.anIntArrayArray31[local36][local40] & 0xFF000000) != 0) {
						local8 = Static400.anIntArrayArray31[local36][local40];
						local10 = Static464.aShortArrayArray16[local36][local40];
						local12 = Static393.aByteArrayArray114[local36][local40];
					}
					if (!arg1 && local47.aClass20_Sub2_Sub5_1 != null && local47.aClass20_Sub2_Sub5_1.aShort94 > local33) {
						local33 = local47.aClass20_Sub2_Sub5_1.aShort94;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort124; local40 <= arg0.aShort125; local40++) {
				for (@Pc(136) int local136 = arg0.aShort123; local136 <= arg0.aShort122; local136++) {
					if ((Static400.anIntArrayArray31[local40][local136] & 0xFF000000) == 0) {
						Static400.anIntArrayArray31[local40][local136] = local8;
						Static464.aShortArrayArray16[local40][local136] = local10;
						Static393.aByteArrayArray114[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static61.aClass20_Sub2_Sub2Array1[Static205.anInt4091++] = arg0;
		} else {
			local40 = Static195.aClass199Array1 == Static510.aClass199Array3 ? 1 : 0;
			if (!arg0.method9021()) {
				arg0.aClass20_Sub2_23 = Static411.aClass20_Sub2Array12[local40];
				Static411.aClass20_Sub2Array12[local40] = arg0;
			} else if (arg0.method9023()) {
				arg0.aClass20_Sub2_23 = Static311.aClass20_Sub2Array11[local40];
				Static311.aClass20_Sub2Array11[local40] = arg0;
			} else {
				arg0.aClass20_Sub2_23 = Static158.aClass20_Sub2Array7[local40];
				Static158.aClass20_Sub2Array7[local40] = arg0;
				Static133.aBoolean183 = true;
			}
		}
		if (arg1) {
			arg0.anInt10724 -= local33;
		}
		return true;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBZIII)V")
	public static void method4570(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static272.aClass97ArrayArrayArray3 == null) {
			Static162.aClass100_7.method8815(arg3, -16777216, arg4, arg0, arg2);
		} else if (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10725 >= 0 && Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10725 < Static442.anInt7975 * 512 && Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10729 >= 0 && Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10729 < Static284.anInt7916 * 512) {
			Static167.anInt3480++;
			if (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1 != null && Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10725 + 256 - Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.method4913() * 256 >> 9 == Static106.anInt2100 && Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10729 + 256 - Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.method4913() * 256 >> 9 == Static51.anInt935) {
				Static106.anInt2100 = -1;
				Static51.anInt935 = -1;
				Static168.method3101();
			}
			Static231.method3962();
			if (!arg1) {
				Static186.method3358();
			}
			Static498.method7436();
			Static416.method6534(arg2, arg3, true, arg4, arg0);
			@Pc(108) int local108 = Static613.anInt10095;
			@Pc(110) int local110 = Static116.anInt2278;
			@Pc(112) int local112 = Static552.anInt9421;
			@Pc(114) int local114 = Static291.anInt5753;
			Static419.anInt7660 = Static419.anInt7658;
			@Pc(127) int local127;
			@Pc(158) int local158;
			if (Static334.anInt6354 == 1) {
				local127 = (int) Static591.aFloat197;
				if (Static211.anInt4157 >> 8 > local127) {
					local127 = Static211.anInt4157 >> 8;
				}
				if (Static303.aBooleanArray32[4] && Static113.anIntArray157[4] + 128 > local127) {
					local127 = Static113.anIntArray157[4] + 128;
				}
				local158 = (int) Static284.aFloat164 + Static27.anInt551 & 0x3FFF;
				Static539.method7919(local158, local127, Static138.method2248(Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10725, Static175.anInt3636, Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10729) - 200, Static96.anInt1900, Static359.anInt6657, local110, (local127 >> 3) * 3 + 600 << 2);
			} else if (Static334.anInt6354 == 4) {
				local127 = (int) Static591.aFloat197;
				if (local127 < Static211.anInt4157 >> 8) {
					local127 = Static211.anInt4157 >> 8;
				}
				if (Static303.aBooleanArray32[4] && local127 < Static113.anIntArray157[4] + 128) {
					local127 = Static113.anIntArray157[4] + 128;
				}
				local158 = (int) Static284.aFloat164 & 0x3FFF;
				Static539.method7919(local158, local127, Static138.method2248(Static614.anInt10099, Static175.anInt3636, Static559.anInt9491) - 200, Static96.anInt1900, Static359.anInt6657, local110, (local127 >> 3) * 3 + 600 << 2);
			} else if (Static334.anInt6354 == 5) {
				Static599.method8445(local110);
			}
			local127 = Static580.anInt9662;
			local158 = Static428.anInt7788;
			@Pc(262) int local262 = Static524.anInt9123;
			@Pc(264) int local264 = Static263.anInt5239;
			@Pc(266) int local266 = Static470.anInt8261;
			@Pc(309) int local309;
			for (@Pc(268) int local268 = 0; local268 < 5; local268++) {
				if (Static303.aBooleanArray32[local268]) {
					local309 = (int) (Math.random() * (double) (Static485.anIntArray526[local268] * 2 + 1) - (double) Static485.anIntArray526[local268] + Math.sin((double) Static255.anIntArray293[local268] / 100.0D * (double) Static186.anIntArray229[local268]) * (double) Static113.anIntArray157[local268]);
					if (local268 == 3) {
						Static470.anInt8261 = Static470.anInt8261 + local309 & 0x3FFF;
					}
					if (local268 == 2) {
						Static524.anInt9123 += local309 << 2;
					}
					if (local268 == 1) {
						Static428.anInt7788 += local309 << 2;
					}
					if (local268 == 4) {
						Static263.anInt5239 += local309;
						if (Static263.anInt5239 < 1024) {
							Static263.anInt5239 = 1024;
						} else if (Static263.anInt5239 > 3072) {
							Static263.anInt5239 = 3072;
						}
					}
					if (local268 == 0) {
						Static580.anInt9662 += local309 << 2;
					}
				}
			}
			if (Static580.anInt9662 < 0) {
				Static580.anInt9662 = 0;
			}
			if ((Static544.anInt9353 << 9) - 1 < Static580.anInt9662) {
				Static580.anInt9662 = (Static544.anInt9353 << 9) - 1;
			}
			if (Static524.anInt9123 < 0) {
				Static524.anInt9123 = 0;
			}
			if (Static524.anInt9123 > (Static608.anInt10072 << 9) - 1) {
				Static524.anInt9123 = (Static608.anInt10072 << 9) - 1;
			}
			Static35.method612();
			Static347.method5616();
			Static162.aClass100_7.KA(local108, local114, local112 + local108, local114 - -local110);
			Static263.method4676(true);
			if (Static389.aBoolean497) {
				Static59.method1054(Static597.anInt9945);
				if (Static432.anInt7832 != Static419.anInt7660) {
					Static133.aBoolean183 = true;
				}
				Static432.anInt7832 = Static419.anInt7660;
			} else {
				Static162.aClass100_7.ya();
				local309 = Static597.anInt9945;
				if (Static382.aClass264_1 == null) {
					Static162.aClass100_7.GA(local309);
				} else {
					Static382.aClass264_1.method6925(Static263.anInt5239, local114, local309, local112, Static162.aClass100_7, local108, Static470.anInt8261, local110, Static507.anInt8745 << 3);
				}
			}
			Static54.method911();
			Static187.aClass154_3.method6569(Static580.anInt9662, Static428.anInt7788, Static524.anInt9123, -Static263.anInt5239 & 0x3FFF, -Static470.anInt8261 & 0x3FFF, -Static9.anInt193 & 0x3FFF);
			Static162.aClass100_7.method8850(Static187.aClass154_3);
			Static162.aClass100_7.DA(local112 / 2 + local108, local110 / 2 + local114, Static107.anInt2106 << 1, Static107.anInt2106 << 1);
			Static58.method1049(local110 / 2 + local114, Static107.anInt2106 << 1, Static107.anInt2106 << 1, local108 + local112 / 2);
			Static317.method5296(-Static9.anInt193 & 0x3FFF, Static428.anInt7788, -Static470.anInt8261 & 0x3FFF, Static524.anInt9123, Static580.anInt9662, -Static263.anInt5239 & 0x3FFF);
			@Pc(562) byte local562 = Static348.aClass6_Sub22_19.aClass15_Sub10_2.method2360() == 2 ? (byte) Static167.anInt3480 : 1;
			if (Static389.aBoolean497) {
				Static393.method6332(-Static470.anInt8261 & 0x3FFF, -Static263.anInt5239 & 0x3FFF, -Static9.anInt193 & 0x3FFF);
				Static626.method8707(local562, Static502.anIntArray539, Static428.anInt7788, Static419.anInt7660, Static524.anInt9123, Static360.anIntArray415, Static580.anInt9662, Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131 + 1, Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10729 >> 9, Static335.anIntArray379, Static112.anIntArray154, Static540.anIntArray572, Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10725 >> 9, Static312.aByteArrayArrayArray17, Static113.anInt2243, Static348.aClass6_Sub22_19.aClass15_Sub5_1.method1404() == 0);
			} else {
				Static151.method2375(Static113.anInt2243, Static580.anInt9662, Static428.anInt7788, Static524.anInt9123, Static312.aByteArrayArrayArray17, Static502.anIntArray539, Static540.anIntArray572, Static360.anIntArray415, Static335.anIntArray379, Static112.anIntArray154, Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131 + 1, local562, Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10725 >> 9, Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10729 >> 9, Static348.aClass6_Sub22_19.aClass15_Sub5_1.method1404() == 0, Static591.aBoolean675 ? Static419.anInt7660 : -1, 0, false);
			}
			Static54.method911();
			if (Static554.anInt1821 == 10) {
				Static231.method3961(local108, local112, local114, local110);
				Static500.method7254(local112, local114, local110, local108);
				Static238.method4147(local112, local114, local110, local108);
				Static425.method6662(local108, local112, local114, local110);
			}
			Static267.method4761();
			Static580.anInt9662 = local127;
			Static263.anInt5239 = local264;
			Static524.anInt9123 = local262;
			Static470.anInt8261 = local266;
			Static428.anInt7788 = local158;
			if (Static629.aBoolean688 && Static34.aClass296_2.method7431() == 0) {
				Static629.aBoolean688 = false;
			}
			if (Static629.aBoolean688) {
				Static162.aClass100_7.method8815(local108, -16777216, local112, local114, local110);
				Static67.method1169(false, Static317.aClass192_12.method5299(Static307.anInt5931), Static176.aClass133_45, Static43.aClass50_2, Static162.aClass100_7);
			}
			Static263.method4676(false);
		} else {
			Static162.aClass100_7.method8815(arg3, -16777216, arg4, arg0, arg2);
		}
	}
}
