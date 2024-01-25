import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static476 {

	@OriginalMember(owner = "client!rca", name = "k", descriptor = "Z")
	public static boolean aBoolean586 = false;

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IIIZII)V")
	public static void method7025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static421.aClass217ArrayArrayArray5 == null) {
			Static213.aClass133_5.method7251(arg1, arg4, -16777216, arg0, arg2);
		} else if (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10231 >= 0 && Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10231 < Static326.anInt5541 * 512 && Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10229 >= 0 && Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10229 < Static448.anInt7637 * 512) {
			Static96.anInt1932++;
			if (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2 != null && Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10231 + 256 - Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.method1018() * 256 >> 9 == Static511.anInt8845 && Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10229 + 256 - Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.method1018() * 256 >> 9 == Static16.anInt249) {
				Static511.anInt8845 = -1;
				Static16.anInt249 = -1;
				Static608.method8682();
			}
			Static472.method7003();
			if (!arg3) {
				Static148.method2200();
			}
			Static636.method8982();
			Static308.method6293(arg0, arg2, true, arg1, arg4);
			@Pc(113) int local113 = Static625.anInt10415;
			@Pc(115) int local115 = Static379.anInt6265;
			@Pc(117) int local117 = Static100.anInt1975;
			Static469.anInt7885 = Static469.anInt7886;
			@Pc(121) int local121 = Static224.anInt4200;
			@Pc(127) int local127;
			@Pc(160) int local160;
			if (Static254.anInt4612 == 1) {
				local127 = (int) Static552.aFloat176;
				if (local127 < Static304.anInt5321 >> 8) {
					local127 = Static304.anInt5321 >> 8;
				}
				if (Static433.aBooleanArray22[4] && Static91.anIntArray118[4] + 128 > local127) {
					local127 = Static91.anIntArray118[4] + 128;
				}
				local160 = Static387.anInt6399 + (int) Static311.aFloat95 & 0x3FFF;
				Static442.method6691(local160, Static57.anInt1135, local115, Static343.anInt5775, local127, Static644.method9021(Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10229, Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10231, Static636.anInt10567) - 200, (local127 >> 3) * 3 + 600 << 2);
			} else if (Static254.anInt4612 == 4) {
				local127 = (int) Static552.aFloat176;
				if (Static304.anInt5321 >> 8 > local127) {
					local127 = Static304.anInt5321 >> 8;
				}
				if (Static433.aBooleanArray22[4] && Static91.anIntArray118[4] + 128 > local127) {
					local127 = Static91.anIntArray118[4] + 128;
				}
				local160 = (int) Static311.aFloat95 & 0x3FFF;
				Static442.method6691(local160, Static57.anInt1135, local115, Static343.anInt5775, local127, Static644.method9021(Static325.anInt5511, Static536.anInt9158, Static636.anInt10567) - 200, (local127 >> 3) * 3 + 600 << 2);
			} else if (Static254.anInt4612 == 5) {
				Static469.method6943(local115);
			}
			local127 = Static19.anInt277;
			local160 = Static441.anInt7550;
			@Pc(267) int local267 = Static117.anInt2170;
			@Pc(269) int local269 = Static210.anInt4029;
			@Pc(271) int local271 = Static491.anInt8292;
			@Pc(315) int local315;
			for (@Pc(273) int local273 = 0; local273 < 5; local273++) {
				if (Static433.aBooleanArray22[local273]) {
					local315 = (int) ((double) -Static330.anIntArray302[local273] + (double) (Static330.anIntArray302[local273] * 2 + 1) * Math.random() + Math.sin((double) Static325.anIntArray294[local273] / 100.0D * (double) Static168.anIntArray167[local273]) * (double) Static91.anIntArray118[local273]);
					if (local273 == 2) {
						Static117.anInt2170 += local315 << 2;
					}
					if (local273 == 1) {
						Static441.anInt7550 += local315 << 2;
					}
					if (local273 == 4) {
						Static210.anInt4029 += local315;
						if (Static210.anInt4029 < 1024) {
							Static210.anInt4029 = 1024;
						} else if (Static210.anInt4029 > 3072) {
							Static210.anInt4029 = 3072;
						}
					}
					if (local273 == 0) {
						Static19.anInt277 += local315 << 2;
					}
					if (local273 == 3) {
						Static491.anInt8292 = Static491.anInt8292 + local315 & 0x3FFF;
					}
				}
			}
			if (Static19.anInt277 < 0) {
				Static19.anInt277 = 0;
			}
			if (Static117.anInt2170 < 0) {
				Static117.anInt2170 = 0;
			}
			if (Static19.anInt277 > (Static357.anInt5961 << 9) - 1) {
				Static19.anInt277 = (Static357.anInt5961 << 9) - 1;
			}
			if (Static117.anInt2170 > (Static429.anInt7422 << 9) - 1) {
				Static117.anInt2170 = (Static429.anInt7422 << 9) - 1;
			}
			Static593.method8540();
			Static293.method4587();
			Static213.aClass133_5.KA(local117, local121, local113 + local117, local115 + local121);
			Static123.method4148(true);
			if (Static428.aBoolean526) {
				Static316.method4833(Static16.anInt250);
				if (Static469.anInt7885 != Static81.anInt1678) {
					Static28.aBoolean15 = true;
				}
				Static81.anInt1678 = Static469.anInt7885;
			} else {
				Static213.aClass133_5.ya();
				local315 = Static16.anInt250;
				if (Static360.aClass64_1 == null) {
					Static213.aClass133_5.GA(local315);
				} else {
					Static360.aClass64_1.method1361(local121, local117, local315, local113, Static213.aClass133_5, local115, Static210.anInt4029, Static270.anInt4854 << 3, Static491.anInt8292);
				}
			}
			Static229.method3856();
			Static16.aClass113_2.method8451(Static19.anInt277, Static441.anInt7550, Static117.anInt2170, -Static210.anInt4029 & 0x3FFF, -Static491.anInt8292 & 0x3FFF, -Static290.anInt5062 & 0x3FFF);
			Static213.aClass133_5.method7269(Static16.aClass113_2);
			Static213.aClass133_5.DA(local117 + local113 / 2, local115 / 2 + local121, Static558.anInt9417 << 1, Static558.anInt9417 << 1);
			Static333.method5011(local117 + local113 / 2, Static558.anInt9417 << 1, Static558.anInt9417 << 1, local115 / 2 + local121);
			Static475.method7023(Static19.anInt277, Static441.anInt7550, -Static491.anInt8292 & 0x3FFF, Static117.anInt2170, -Static290.anInt5062 & 0x3FFF, -Static210.anInt4029 & 0x3FFF);
			@Pc(578) byte local578 = Static97.aClass5_Sub25_8.aClass6_Sub12_1.method4024() == 2 ? (byte) Static96.anInt1932 : 1;
			if (Static428.aBoolean526) {
				Static88.method1486(-Static290.anInt5062 & 0x3FFF, -Static491.anInt8292 & 0x3FFF, -Static210.anInt4029 & 0x3FFF);
				Static457.method6816(Static631.anInt10493, Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10229 >> 9, Static441.anInt7550, Static502.anIntArray485, local578, Static406.anIntArray376, Static105.aByteArrayArrayArray3, Static469.anInt7885, Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10231 >> 9, Static344.anIntArray323, Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132 + 1, Static588.anIntArray559, Static19.anInt277, Static97.aClass5_Sub25_8.aClass6_Sub21_1.method6844() == 0, Static117.anInt2170, Static194.anIntArray188);
			} else {
				Static67.method1106(Static631.anInt10493, Static19.anInt277, Static441.anInt7550, Static117.anInt2170, Static105.aByteArrayArrayArray3, Static588.anIntArray559, Static406.anIntArray376, Static344.anIntArray323, Static194.anIntArray188, Static502.anIntArray485, Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132 + 1, local578, Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10231 >> 9, Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10229 >> 9, Static97.aClass5_Sub25_8.aClass6_Sub21_1.method6844() == 0, Static57.aBoolean65 ? Static469.anInt7885 : -1, 0, false);
			}
			Static229.method3856();
			if (Static151.anInt2620 == 10) {
				Static540.method7929(local113, local115, local121, local117);
				Static348.method5208(local117, local113, local115, local121);
				Static630.method8912(local121, local113, local117, local115);
				Static581.method8405(local121, local113, local115, local117);
			}
			Static564.method8210();
			Static19.anInt277 = local127;
			Static117.anInt2170 = local267;
			Static441.anInt7550 = local160;
			Static210.anInt4029 = local269;
			Static491.anInt8292 = local271;
			if (Static494.aBoolean605 && Static1.aClass309_7.method7416() == 0) {
				Static494.aBoolean605 = false;
			}
			if (Static494.aBoolean605) {
				Static213.aClass133_5.method7251(local113, local115, -16777216, local121, local117);
				Static462.method6852(Static199.aClass272_7, Static174.aClass120_12.method2690(Static266.anInt4796), Static213.aClass133_5, Static281.aClass55_8, false);
			}
			Static123.method4148(false);
		} else {
			Static213.aClass133_5.method7251(arg1, arg4, -16777216, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)V")
	public static void method7027() {
		Static447.aClass273_30.method6586();
	}

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(I)V")
	public static void method7028() {
		for (@Pc(7) int local7 = 0; local7 < Static28.anInt358; local7++) {
			@Pc(18) int local18 = Static536.method7903(Static28.anInt358, Static444.anInt7581 + local7) * Static6.anInt95;
			for (@Pc(20) int local20 = 0; local20 < Static6.anInt95; local20++) {
				@Pc(32) int local32 = local18 + Static536.method7903(Static6.anInt95, Static110.anInt2062 + local20);
				if (Static182.anInt3238 == Static641.anIntArray604[local32]) {
					Static197.anInterface16Array5[local32].method8783(0, 0, Static408.anInt7120, Static252.anInt4593, local20 * Static408.anInt7120, Static252.anInt4593 * local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(B)Lclient!iba;")
	public static Class5_Sub26 method7030() {
		if (Static620.aClass330_46 == null || Static345.aClass199_1 == null) {
			return null;
		}
		for (@Pc(24) Class5_Sub26 local24 = (Class5_Sub26) Static345.aClass199_1.method4554(); local24 != null; local24 = (Class5_Sub26) Static345.aClass199_1.method4554()) {
			@Pc(34) Class299 local34 = Static620.aClass42_4.method937(local24.anInt4151);
			if (local34 != null && local34.aBoolean587 && local34.method7064(Static620.anInterface12_2)) {
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(III)Z")
	public static boolean method7031(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static523.method7738(arg0, arg1) & Static301.method4667(arg1, arg0);
	}

	@OriginalMember(owner = "client!rca", name = "d", descriptor = "(I)V")
	public static void method7033() {
		Static36.method540((long) Static631.anInt10493, Static213.aClass133_5);
		if (Static337.anInt5727 != -1) {
			Static78.method1352(Static337.anInt5727);
		}
		for (@Pc(19) int local19 = 0; local19 < Static463.anInt7779; local19++) {
			if (Static264.aBooleanArray16[local19]) {
				Static27.aBooleanArray2[local19] = true;
			}
			Static273.aBooleanArray17[local19] = Static264.aBooleanArray16[local19];
			Static264.aBooleanArray16[local19] = false;
		}
		Static444.anInt7588 = Static631.anInt10493;
		if (Static337.anInt5727 != -1) {
			Static463.anInt7779 = 0;
			Static548.method7988();
		}
		Static213.aClass133_5.la();
		Static372.method5484(Static213.aClass133_5);
		@Pc(68) int local68 = Static124.method1880();
		if (local68 == -1) {
			local68 = Static578.anInt4589;
		}
		if (local68 == -1) {
			local68 = Static320.anInt5431;
		}
		Static469.method6945(local68);
		Static435.anInt7492 = 0;
	}
}
