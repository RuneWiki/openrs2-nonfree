import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!pw", name = "e", descriptor = "I")
	public static int anInt6908 = 0;

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIBIIZ)V")
	public static void method5664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static469.aClass228ArrayArrayArray6 == null) {
			Static417.aClass162_17.method6885(arg3, -16777216, arg0, arg1, arg2);
		} else if (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9374 >= 0 && Static281.anInt4822 * 512 > Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9374 && Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9375 >= 0 && Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9375 < Static29.anInt491 * 512) {
			Static388.anInt6397++;
			if (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30 != null && Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9374 - (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.method6777() - 1) * 256 >> 9 == Static484.anInt7716 && Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9375 - (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.method6777() - 1) * 256 >> 9 == Static143.anInt7433) {
				Static143.anInt7433 = -1;
				Static484.anInt7716 = -1;
				Static409.method5539();
			}
			Static37.method574();
			if (!arg4) {
				Static27.method362();
			}
			Static412.method5555();
			Static68.method1109(arg1, true, arg2, arg0, arg3);
			@Pc(116) int local116 = Static516.anInt8249;
			@Pc(118) int local118 = Static538.anInt8855;
			@Pc(120) int local120 = Static219.anInt3189;
			@Pc(122) int local122 = Static345.anInt5963;
			@Pc(133) int local133;
			@Pc(164) int local164;
			if (Static489.anInt7763 == 1) {
				local133 = (int) Static541.aFloat128;
				if (local133 < Static542.anInt6417 >> 8) {
					local133 = Static542.anInt6417 >> 8;
				}
				if (Static416.aBooleanArray7[4] && local133 < Static464.anIntArray498[4] + 128) {
					local133 = Static464.anIntArray498[4] + 128;
				}
				local164 = (int) Static313.aFloat157 + Static83.anInt1438 & 0x3FFF;
				Static413.method5562((local133 >> 3) * 3 + 600 << 2, Static47.anInt873, Static14.anInt328, local122, local164, local133, Static24.method347(Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9375, Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9374, Static402.anInt6620) - 200);
			} else if (Static489.anInt7763 == 4) {
				local133 = (int) Static541.aFloat128;
				if (Static542.anInt6417 >> 8 > local133) {
					local133 = Static542.anInt6417 >> 8;
				}
				if (Static416.aBooleanArray7[4] && local133 < Static464.anIntArray498[4] + 128) {
					local133 = Static464.anIntArray498[4] + 128;
				}
				local164 = (int) Static313.aFloat157 & 0x3FFF;
				Static413.method5562((local133 >> 3) * 3 + 600 << 2, Static47.anInt873, Static14.anInt328, local122, local164, local133, Static24.method347(Static520.anInt8309, Static504.anInt8012, Static402.anInt6620) - 200);
			} else if (Static489.anInt7763 == 5) {
				Static488.method6256(local122);
			}
			local133 = Static285.anInt2206;
			local164 = Static151.anInt2436;
			@Pc(272) int local272 = Static469.anInt7519;
			@Pc(274) int local274 = Static396.anInt6527;
			@Pc(276) int local276 = Static584.anInt9487;
			@Pc(320) int local320;
			for (@Pc(278) int local278 = 0; local278 < 5; local278++) {
				if (Static416.aBooleanArray7[local278]) {
					local320 = (int) ((double) -Static225.anIntArray271[local278] + (double) (Static225.anIntArray271[local278] * 2 + 1) * Math.random() + Math.sin((double) Static540.anIntArray581[local278] * ((double) Static489.anIntArray517[local278] / 100.0D)) * (double) Static464.anIntArray498[local278]);
					if (local278 == 0) {
						Static285.anInt2206 += local320 << 2;
					}
					if (local278 == 4) {
						Static396.anInt6527 += local320;
						if (Static396.anInt6527 < 1024) {
							Static396.anInt6527 = 1024;
						} else if (Static396.anInt6527 > 3072) {
							Static396.anInt6527 = 3072;
						}
					}
					if (local278 == 2) {
						Static469.anInt7519 += local320 << 2;
					}
					if (local278 == 1) {
						Static151.anInt2436 += local320 << 2;
					}
					if (local278 == 3) {
						Static584.anInt9487 = Static584.anInt9487 + local320 & 0x3FFF;
					}
				}
			}
			if (Static285.anInt2206 < 0) {
				Static285.anInt2206 = 0;
			}
			if (Static285.anInt2206 > (Static83.anInt1434 << 9) - 1) {
				Static285.anInt2206 = (Static83.anInt1434 << 9) - 1;
			}
			if (Static469.anInt7519 < 0) {
				Static469.anInt7519 = 0;
			}
			if ((Static405.anInt6657 << 9) - 1 < Static469.anInt7519) {
				Static469.anInt7519 = (Static405.anInt6657 << 9) - 1;
			}
			Static263.method3670();
			Static390.method5391();
			Static417.aClass162_17.da(local118, local120, local116 + local118, local120 + local122);
			Static417.aClass162_17.ya();
			local320 = Static532.anInt8756;
			if (Static320.aClass358_1 == null) {
				Static417.aClass162_17.ja(local320);
			} else {
				Static320.aClass358_1.method7473(Static189.anInt2779 << 3, local118, Static584.anInt9487, local116, local122, local320, Static417.aClass162_17, local120, Static396.anInt6527);
			}
			Static574.method7450();
			Static468.aClass25_6.na(Static285.anInt2206, Static151.anInt2436, Static469.anInt7519, -Static396.anInt6527 & 0x3FFF, -Static584.anInt9487 & 0x3FFF, -Static140.anInt4804 & 0x3FFF);
			Static417.aClass162_17.method6816(Static468.aClass25_6);
			Static417.aClass162_17.la(local118 + local116 / 2, local122 / 2 + local120, Static81.anInt9012 << 1, Static81.anInt9012 << 1);
			Static434.method5702(local120 + local122 / 2, Static81.anInt9012 << 1, Static81.anInt9012 << 1, local116 / 2 + local118);
			Static402.method5498(-Static396.anInt6527 & 0x3FFF, -Static140.anInt4804 & 0x3FFF, Static151.anInt2436, -Static584.anInt9487 & 0x3FFF, Static469.anInt7519, Static285.anInt2206);
			@Pc(566) byte local566 = Static257.aClass2_Sub35_Sub1_1.method6041(Static226.anInt3318) == 2 ? (byte) Static388.anInt6397 : 1;
			Static363.method5138(Static532.anInt8757, Static285.anInt2206, Static151.anInt2436, Static469.anInt7519, Class2_Sub35_Sub1.lb, Static264.anIntArray313, Static100.anIntArray153, Static524.anIntArray557, Static447.anIntArray484, Static523.anIntArray556, Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128 + 1, local566, Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9374 >> 9, Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9375 >> 9, !Static257.aClass2_Sub35_Sub1_1.aBoolean625);
			Static574.method7450();
			if (Static540.anInt8912 == 10) {
				Static543.method7101(local118, local122, local120, local116);
				Static228.method2770(local118, local120, local122, local116);
				Static485.method6241(local122, local120, local116, local118);
				Static183.method2345(local122, local118, local116, local120);
			}
			Static62.method1078();
			Static469.anInt7519 = local272;
			Static584.anInt9487 = local276;
			Static396.anInt6527 = local274;
			Static285.anInt2206 = local133;
			Static151.anInt2436 = local164;
			if (Static482.aBoolean657 && Static335.aClass249_2.method5224() == 0) {
				Static482.aBoolean657 = false;
			}
			if (Static482.aBoolean657) {
				Static417.aClass162_17.method6885(local120, -16777216, local116, local118, local122);
				Static96.method1453(Static322.aClass37_20, Static229.aClass159_14.method2776(Static261.anInt4297), Static417.aClass162_17, false, Static266.aClass112_7);
			}
		} else {
			Static417.aClass162_17.method6885(arg3, -16777216, arg0, arg1, arg2);
		}
	}
}
