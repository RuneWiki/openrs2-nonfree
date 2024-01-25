import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "[I")
	public static int[] anIntArray259 = new int[2];

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(BII)V")
	public static void method4132(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static204.anInt3753 == 1) {
			Static302.method4444(Static556.aClass3_Sub43_4, arg1, arg0);
		} else if (Static204.anInt3753 == 2) {
			Static65.method1421(arg1, arg0);
		}
		Static556.aClass3_Sub43_4 = null;
		Static204.anInt3753 = 0;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BIIIIZ)V")
	public static void method4133(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static309.aClass299ArrayArrayArray3 == null) {
			Static505.aClass45_11.method7425(arg3, arg2, arg1, -16777216, arg0);
		} else if (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9444 >= 0 && Static54.anInt1038 * 512 > Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9444 && Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9442 >= 0 && Static140.anInt3026 * 512 > Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9442) {
			Static81.anInt1761++;
			if (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2 != null && Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9444 + 256 - Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.method7858() * 256 >> 9 == Static551.anInt8768 && Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9442 + 256 - Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.method7858() * 256 >> 9 == Static125.anInt2831) {
				Static125.anInt2831 = -1;
				Static551.anInt8768 = -1;
				Static293.method3983();
			}
			Static148.method2830();
			if (!arg4) {
				Static273.method4146();
			}
			Static556.method7351();
			Static189.method3212(arg1, true, arg3, arg2, arg0);
			@Pc(116) int local116 = Static150.anInt3156;
			@Pc(118) int local118 = Static318.anInt5429;
			@Pc(120) int local120 = Static111.anInt8659;
			@Pc(122) int local122 = Static569.anInt3538;
			@Pc(133) int local133;
			@Pc(172) int local172;
			if (Static379.anInt6482 == 1) {
				local133 = (int) Static126.aFloat84;
				if (local133 < Static504.anInt8194 >> 8) {
					local133 = Static504.anInt8194 >> 8;
				}
				if (Static350.aBooleanArray20[4] && local133 < Static99.anIntArray93[4] + 128) {
					local133 = Static99.anIntArray93[4] + 128;
				}
				local172 = Static36.anInt654 + (int) Static43.aFloat20 & 0x3FFF;
				Static214.method3434(Static475.method6537(Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9442, Static117.anInt2694, Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9444) - 200, Static205.anInt3767, Static18.anInt315, local133, (local133 >> 3) * 3 + 600 << 2, local172, local122);
			} else if (Static379.anInt6482 == 4) {
				local133 = (int) Static126.aFloat84;
				if (Static504.anInt8194 >> 8 > local133) {
					local133 = Static504.anInt8194 >> 8;
				}
				if (Static350.aBooleanArray20[4] && Static99.anIntArray93[4] + 128 > local133) {
					local133 = Static99.anIntArray93[4] + 128;
				}
				local172 = (int) Static43.aFloat20 & 0x3FFF;
				Static214.method3434(Static475.method6537(Static521.anInt8385, Static117.anInt2694, Static28.anInt516) - 200, Static205.anInt3767, Static18.anInt315, local133, (local133 >> 3) * 3 + 600 << 2, local172, local122);
			} else if (Static379.anInt6482 == 5) {
				Static119.method2463(local122);
			}
			local133 = Static226.anInt3984;
			local172 = Static461.anInt7704;
			@Pc(282) int local282 = Static350.anInt6080;
			@Pc(284) int local284 = Static494.anInt8029;
			@Pc(286) int local286 = Static333.anInt5565;
			@Pc(330) int local330;
			for (@Pc(288) int local288 = 0; local288 < 5; local288++) {
				if (Static350.aBooleanArray20[local288]) {
					local330 = (int) ((double) -Static483.anIntArray502[local288] + (double) (Static483.anIntArray502[local288] * 2 + 1) * Math.random() + Math.sin((double) Static124.anIntArray571[local288] / 100.0D * (double) Static504.anIntArray523[local288]) * (double) Static99.anIntArray93[local288]);
					if (local288 == 4) {
						Static494.anInt8029 += local330;
						if (Static494.anInt8029 < 1024) {
							Static494.anInt8029 = 1024;
						} else if (Static494.anInt8029 > 3072) {
							Static494.anInt8029 = 3072;
						}
					}
					if (local288 == 2) {
						Static350.anInt6080 += local330 << 2;
					}
					if (local288 == 1) {
						Static461.anInt7704 += local330 << 2;
					}
					if (local288 == 0) {
						Static226.anInt3984 += local330 << 2;
					}
					if (local288 == 3) {
						Static333.anInt5565 = Static333.anInt5565 + local330 & 0x3FFF;
					}
				}
			}
			if (Static226.anInt3984 < 0) {
				Static226.anInt3984 = 0;
			}
			if (Static226.anInt3984 > (Static155.anInt3254 << 9) - 1) {
				Static226.anInt3984 = (Static155.anInt3254 << 9) - 1;
			}
			if (Static350.anInt6080 < 0) {
				Static350.anInt6080 = 0;
			}
			if ((Static39.anInt747 << 9) - 1 < Static350.anInt6080) {
				Static350.anInt6080 = (Static39.anInt747 << 9) - 1;
			}
			Static100.method1849();
			Static79.method5529();
			Static505.aClass45_11.da(local118, local116, local118 + local120, local122 + local116);
			Static505.aClass45_11.ya();
			local330 = Static596.anInt9772;
			if (Static84.aClass350_1 == null) {
				Static505.aClass45_11.ja(local330);
			} else {
				Static84.aClass350_1.method7337(Static333.anInt5565, local120, local122, local116, Static505.aClass45_11, Static330.anInt5541 << 3, Static494.anInt8029, local330, local118);
			}
			Static236.method3658();
			Static472.aClass11_6.na(Static226.anInt3984, Static461.anInt7704, Static350.anInt6080, -Static494.anInt8029 & 0x3FFF, -Static333.anInt5565 & 0x3FFF, -Static208.anInt3801 & 0x3FFF);
			Static505.aClass45_11.method7367(Static472.aClass11_6);
			Static505.aClass45_11.la(local120 / 2 + local118, local116 - -(local122 / 2), Static469.anInt4272 << 1, Static469.anInt4272 << 1);
			Static423.method6024(Static469.anInt4272 << 1, Static469.anInt4272 << 1, local118 + local120 / 2, local116 + local122 / 2);
			Static530.method7082(-Static494.anInt8029 & 0x3FFF, -Static333.anInt5565 & 0x3FFF, Static350.anInt6080, Static461.anInt7704, Static226.anInt3984, -Static208.anInt3801 & 0x3FFF);
			@Pc(568) byte local568 = Static405.aClass3_Sub3_Sub1_1.method6311(Static60.anInt1312) == 2 ? (byte) Static81.anInt1761 : 1;
			Static286.method4254(Static506.anInt8251, Static226.anInt3984, Static461.anInt7704, Static350.anInt6080, Static45.aByteArrayArrayArray8, Static5.anIntArray7, Static543.anIntArray570, anIntArray259, Static160.anIntArray158, Static519.anIntArray540, Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117 + 1, local568, Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9444 >> 9, Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9442 >> 9, !Static405.aClass3_Sub3_Sub1_1.aBoolean583);
			Static236.method3658();
			if (Static32.anInt602 == 10) {
				Static585.method7830(local118, local122, local116, local120);
				Static105.method1892(local122, local118, local120, local116);
				Static594.method7943(local122, local116, local118, local120);
				Static391.method5747(local122, local118, local120, local116);
			}
			Static346.method5118();
			Static350.anInt6080 = local282;
			Static461.anInt7704 = local172;
			Static333.anInt5565 = local286;
			Static494.anInt8029 = local284;
			Static226.anInt3984 = local133;
			if (Static472.aBoolean613 && Static391.aClass277_2.method6113() == 0) {
				Static472.aBoolean613 = false;
			}
			if (Static472.aBoolean613) {
				Static505.aClass45_11.method7425(local122, local118, local116, -16777216, local120);
				Static525.method7021(Static544.aClass343_16.method7222(Static256.anInt4535), Static505.aClass45_11, Static569.aClass54_9, Static521.aClass134_12, false);
			}
		} else {
			Static505.aClass45_11.method7425(arg3, arg2, arg1, -16777216, arg0);
		}
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V")
	public static void method4135() {
		for (@Pc(3) int local3 = 0; local3 < Static5.anInt118; local3++) {
			@Pc(9) Class347 local9 = Static204.aClass347Array1[local3];
			if (local9.aByte112 == 3) {
				if (local9.aClass3_Sub4_Sub1_4 == null) {
					local9.anInt8753 = Integer.MIN_VALUE;
				} else {
					Static353.aClass3_Sub4_Sub2_1.method639(local9.aClass3_Sub4_Sub1_4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!wn;I[IB)V")
	public static void method4136(@OriginalArg(0) Class41_Sub2_Sub1_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(17) boolean local17;
		@Pc(19) int local19;
		if (arg0.anIntArray627 != null) {
			local17 = true;
			for (local19 = 0; local19 < arg0.anIntArray627.length; local19++) {
				if (arg2[local19] != arg0.anIntArray627[local19]) {
					local17 = false;
					break;
				}
			}
			if (local17 && arg0.anInt9489 != -1) {
				@Pc(56) Class185 local56 = Static545.aClass240_2.method5680(arg0.anInt9489);
				@Pc(59) int local59 = local56.anInt4978;
				if (local59 == 1) {
					arg0.anInt9478 = 0;
					arg0.anInt9460 = 1;
					arg0.anInt9463 = 0;
					arg0.anInt9509 = arg1;
					arg0.anInt9473 = 0;
					Static462.method6421(arg0 == Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2, arg0.anInt9444, local56, arg0.aByte117, arg0.anInt9442, arg0.anInt9473);
				}
				if (local59 == 2) {
					arg0.anInt9463 = 0;
				}
			}
		}
		local17 = true;
		for (local19 = 0; local19 < arg2.length; local19++) {
			if (arg2[local19] != -1) {
				local17 = false;
			}
			if (arg0.anIntArray627 == null || arg0.anIntArray627[local19] == -1 || Static545.aClass240_2.method5680(arg2[local19]).anInt4981 >= Static545.aClass240_2.method5680(arg0.anIntArray627[local19]).anInt4981) {
				arg0.anInt9509 = arg1;
				arg0.anIntArray627 = arg2;
				break;
			}
		}
		if (local17) {
			arg0.anInt9509 = arg1;
			arg0.anIntArray627 = arg2;
		}
	}
}
