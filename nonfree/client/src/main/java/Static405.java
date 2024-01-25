import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "Lclient!fca;")
	public static Class97 aClass97_11 = null;

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IIIIZB)V")
	public static void method5919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (Static208.aClass9ArrayArrayArray3 == null) {
			Static176.aClass121_5.method7109(arg3, arg2, arg0, arg1, -16777216);
		} else if (Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9222 >= 0 && Static301.anInt4912 * 512 > Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9222 && Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9218 >= 0 && Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9218 < Static473.anInt7969 * 512) {
			Static43.anInt710++;
			if (Static426.aClass29_Sub2_Sub1_Sub2_2 != null && Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9222 + 256 - Static426.aClass29_Sub2_Sub1_Sub2_2.method7008() * 256 >> 9 == Static334.anInt5975 && Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9218 + 256 - Static426.aClass29_Sub2_Sub1_Sub2_2.method7008() * 256 >> 9 == Static16.anInt311) {
				Static16.anInt311 = -1;
				Static334.anInt5975 = -1;
				Static201.method5196();
			}
			Static183.method2744();
			if (!arg4) {
				Static495.method6815();
			}
			Static416.method6101();
			Static519.method7323(true, arg1, arg3, arg2, arg0);
			@Pc(112) int local112 = Static411.anInt7202;
			@Pc(114) int local114 = Static63.anInt1005;
			@Pc(116) int local116 = Static121.anInt2101;
			@Pc(118) int local118 = Static26.anInt486;
			@Pc(124) int local124;
			@Pc(157) int local157;
			if (Static354.anInt6233 == 1) {
				local124 = (int) Static475.aFloat174;
				if (local124 < Static179.anInt3180 >> 8) {
					local124 = Static179.anInt3180 >> 8;
				}
				if (Static99.aBooleanArray16[4] && Static490.anIntArray635[4] + 128 > local124) {
					local124 = Static490.anIntArray635[4] + 128;
				}
				local157 = (int) Static399.aFloat167 + Static74.anInt1216 & 0x3FFF;
				Static185.method2758(local114, Static141.anInt2539, Static490.method6768(Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9222, Static282.anInt4677, Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9218) - 200, (local124 >> 3) * 3 + 600 << 2, Static285.anInt4695, local157, local124);
			} else if (Static354.anInt6233 == 4) {
				local124 = (int) Static475.aFloat174;
				if (Static179.anInt3180 >> 8 > local124) {
					local124 = Static179.anInt3180 >> 8;
				}
				if (Static99.aBooleanArray16[4] && local124 < Static490.anIntArray635[4] + 128) {
					local124 = Static490.anIntArray635[4] + 128;
				}
				local157 = (int) Static399.aFloat167 & 0x3FFF;
				Static185.method2758(local114, Static141.anInt2539, Static490.method6768(Static135.anInt2370, Static282.anInt4677, Static224.anInt3801) - 200, (local124 >> 3) * 3 + 600 << 2, Static285.anInt4695, local157, local124);
			} else if (Static354.anInt6233 == 5) {
				Static441.method6326(local114);
			}
			local124 = Static388.anInt6921;
			local157 = Static33.anInt568;
			@Pc(262) int local262 = Static220.anInt3753;
			@Pc(264) int local264 = Static162.anInt2840;
			@Pc(266) int local266 = Static261.anInt4257;
			@Pc(310) int local310;
			for (@Pc(268) int local268 = 0; local268 < 5; local268++) {
				if (Static99.aBooleanArray16[local268]) {
					local310 = (int) ((double) -Static71.anIntArray86[local268] + (double) (Static71.anIntArray86[local268] * 2 + 1) * Math.random() + Math.sin((double) Static417.anIntArray581[local268] / 100.0D * (double) Static5.anIntArray10[local268]) * (double) Static490.anIntArray635[local268]);
					if (local268 == 0) {
						Static388.anInt6921 += local310 << 2;
					}
					if (local268 == 1) {
						Static33.anInt568 += local310 << 2;
					}
					if (local268 == 2) {
						Static220.anInt3753 += local310 << 2;
					}
					if (local268 == 3) {
						Static261.anInt4257 = Static261.anInt4257 + local310 & 0x3FFF;
					}
					if (local268 == 4) {
						Static162.anInt2840 += local310;
						if (Static162.anInt2840 < 1024) {
							Static162.anInt2840 = 1024;
						} else if (Static162.anInt2840 > 3072) {
							Static162.anInt2840 = 3072;
						}
					}
				}
			}
			if (Static388.anInt6921 < 0) {
				Static388.anInt6921 = 0;
			}
			if (Static388.anInt6921 > (Static80.anInt1391 << 9) - 1) {
				Static388.anInt6921 = (Static80.anInt1391 << 9) - 1;
			}
			if (Static220.anInt3753 < 0) {
				Static220.anInt3753 = 0;
			}
			if (Static220.anInt3753 > (Static164.anInt2881 << 9) - 1) {
				Static220.anInt3753 = (Static164.anInt2881 << 9) - 1;
			}
			Static551.method7578();
			Static38.method533();
			Static176.aClass121_5.ca(local112, local116, local118 + local112, local116 - -local114);
			Static176.aClass121_5.method7084();
			local310 = Static1.anInt35;
			if (Static285.aClass89_1 == null) {
				Static176.aClass121_5.D(local310);
			} else {
				Static285.aClass89_1.method1816(local310, local118, local112, Static176.aClass121_5, local114, Static261.anInt4257, Static209.anInt3617 << 3, Static162.anInt2840, local116);
			}
			Static11.method182();
			Static90.aClass34_8.pa(Static388.anInt6921, Static33.anInt568, Static220.anInt3753, -Static162.anInt2840 & 0x3FFF, -Static261.anInt4257 & 0x3FFF, -Static218.anInt3720 & 0x3FFF);
			Static176.aClass121_5.method7112(Static90.aClass34_8);
			Static176.aClass121_5.m(local118 / 2 + local112, local114 / 2 + local116, Static415.anInt7332 << 1, Static415.anInt7332 << 1);
			Static528.method7589(local116 + local114 / 2, local112 + local118 / 2, Static415.anInt7332 << 1, Static415.anInt7332 << 1);
			Static213.method394(-Static261.anInt4257 & 0x3FFF, Static220.anInt3753, Static33.anInt568, Static388.anInt6921, -Static218.anInt3720 & 0x3FFF, -Static162.anInt2840 & 0x3FFF);
			@Pc(548) byte local548 = Static480.aClass6_Sub37_Sub1_1.method5159(Static567.anInt9503) == 2 ? (byte) Static43.anInt710 : 1;
			Static28.method418(Static176.aClass121_5, Static358.anInt6263, Static247.anInt4098, Static90.aClass34_8, Static388.anInt6921, Static33.anInt568, Static220.anInt3753, Static393.aByteArrayArrayArray16, Static494.anIntArray640, Static529.anIntArray680, Static346.anIntArray533, Static343.anIntArray529, Static180.anIntArray693, Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103 + 1, local548, Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9222 >> 9, Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9218 >> 9, !Static480.aClass6_Sub37_Sub1_1.aBoolean410);
			Static11.method182();
			if (Static146.anInt2581 == 10) {
				Static290.method4078(local118, local112, local114, local116);
				Static99.method1590(local114, local118, local116, local112);
				Static360.method5341(local116, local114, local112, local118);
				Static291.method4089(local116, local114, local118, local112);
			}
			Static65.method853();
			Static220.anInt3753 = local262;
			Static388.anInt6921 = local124;
			Static261.anInt4257 = local266;
			Static162.anInt2840 = local264;
			Static33.anInt568 = local157;
			if (Static31.aBoolean19 && Static294.aClass175_3.method3748() == 0) {
				Static31.aBoolean19 = false;
			}
			if (Static31.aBoolean19) {
				Static176.aClass121_5.method7109(local116, local118, local114, local112, -16777216);
				Static87.method1420(Static141.aClass104_11.method2145(Static470.anInt7957), Static85.aClass56_2, false);
			}
		} else {
			Static176.aClass121_5.method7109(arg3, arg2, arg0, arg1, -16777216);
		}
	}
}
