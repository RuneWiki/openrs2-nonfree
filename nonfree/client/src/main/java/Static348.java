import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!nea", name = "E", descriptor = "F")
	public static float aFloat155;

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(ZIIIII)V")
	public static void method5141(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static118.aClass293ArrayArrayArray14 == null) {
			Static136.aClass12_8.method6418(arg1, arg3, arg4, arg2, -16777216);
		} else if (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8796 >= 0 && Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8796 < Static500.anInt6888 * 512 && Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8795 >= 0 && Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8795 < Static573.anInt9325 * 512) {
			Static473.anInt8020++;
			if (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2 != null && Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8796 + 256 - Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.method5349() * 256 >> 9 == Static90.anInt1998 && Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8795 - (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.method5349() - 1) * 256 >> 9 == Static328.anInt5893) {
				Static328.anInt5893 = -1;
				Static90.anInt1998 = -1;
				Static561.method5040();
			}
			Static146.method2364();
			if (!arg0) {
				Static350.method5173();
			}
			Static580.method7776();
			Static340.method5071(arg4, arg3, arg1, arg2, true);
			@Pc(110) int local110 = Static99.anInt2071;
			@Pc(112) int local112 = Static271.anInt5044;
			@Pc(114) int local114 = Static528.anInt8754;
			@Pc(116) int local116 = Static304.anInt5528;
			@Pc(124) int local124;
			@Pc(161) int local161;
			if (Static585.anInt9461 == 1) {
				local124 = (int) Static79.aFloat37;
				if (Static507.anInt8454 >> 8 > local124) {
					local124 = Static507.anInt8454 >> 8;
				}
				if (Static326.aBooleanArray16[4] && local124 < Static43.anIntArray44[4] + 128) {
					local124 = Static43.anIntArray44[4] + 128;
				}
				local161 = Static474.anInt1076 + (int) Static143.aFloat61 & 0x3FFF;
				Static407.method5757(Static536.anInt8844, local161, local112, Static122.method2103(Static240.anInt4595, Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8796, Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8795) - 200, local124, Static82.anInt9165, (local124 >> 3) * 3 + 600 << 2);
			} else if (Static585.anInt9461 == 4) {
				local124 = (int) Static79.aFloat37;
				if (Static507.anInt8454 >> 8 > local124) {
					local124 = Static507.anInt8454 >> 8;
				}
				if (Static326.aBooleanArray16[4] && local124 < Static43.anIntArray44[4] + 128) {
					local124 = Static43.anIntArray44[4] + 128;
				}
				local161 = (int) Static143.aFloat61 & 0x3FFF;
				Static407.method5757(Static536.anInt8844, local161, local112, Static122.method2103(Static240.anInt4595, Static116.anInt2337, Static260.anInt4768) - 200, local124, Static82.anInt9165, (local124 >> 3) * 3 + 600 << 2);
			} else if (Static585.anInt9461 == 5) {
				Static1.method38(local112);
			}
			local124 = Static333.anInt5940;
			local161 = Static350.anInt6168;
			@Pc(272) int local272 = Static216.anInt4203;
			@Pc(274) int local274 = Static124.anInt2517;
			@Pc(276) int local276 = Static202.anInt4065;
			@Pc(327) int local327;
			for (@Pc(285) int local285 = 0; local285 < 5; local285++) {
				if (Static326.aBooleanArray16[local285]) {
					local327 = (int) ((double) -Static242.anIntArray280[local285] + (double) (Static242.anIntArray280[local285] * 2 + 1) * Math.random() + Math.sin((double) Static435.anIntArray505[local285] * ((double) Static478.anIntArray534[local285] / 100.0D)) * (double) Static43.anIntArray44[local285]);
					if (local285 == 4) {
						Static124.anInt2517 += local327;
						if (Static124.anInt2517 < 1024) {
							Static124.anInt2517 = 1024;
						} else if (Static124.anInt2517 > 3072) {
							Static124.anInt2517 = 3072;
						}
					}
					if (local285 == 0) {
						Static333.anInt5940 += local327 << 2;
					}
					if (local285 == 2) {
						Static216.anInt4203 += local327 << 2;
					}
					if (local285 == 3) {
						Static202.anInt4065 = Static202.anInt4065 + local327 & 0x3FFF;
					}
					if (local285 == 1) {
						Static350.anInt6168 += local327 << 2;
					}
				}
			}
			if (Static333.anInt5940 < 0) {
				Static333.anInt5940 = 0;
			}
			if (Static333.anInt5940 > (Static446.anInt7725 << 9) - 1) {
				Static333.anInt5940 = (Static446.anInt7725 << 9) - 1;
			}
			if (Static216.anInt4203 < 0) {
				Static216.anInt4203 = 0;
			}
			if ((Static218.anInt4229 << 9) - 1 < Static216.anInt4203) {
				Static216.anInt4203 = (Static218.anInt4229 << 9) - 1;
			}
			Static346.method5127();
			Static340.method5069();
			Static136.aClass12_8.da(local114, local110, local116 + local114, local110 + local112);
			Static136.aClass12_8.ya();
			local327 = Static50.anInt1272;
			if (Static498.aClass224_1 == null) {
				Static136.aClass12_8.ja(local327);
			} else {
				Static498.aClass224_1.method5125(local112, local114, Static124.anInt2517, Static23.anInt6320 << 3, local327, Static136.aClass12_8, Static202.anInt4065, local116, local110);
			}
			Static99.method1834();
			Static583.aClass209_6.na(Static333.anInt5940, Static350.anInt6168, Static216.anInt4203, -Static124.anInt2517 & 0x3FFF, -Static202.anInt4065 & 0x3FFF, -Static427.anInt7255 & 0x3FFF);
			Static136.aClass12_8.method6471(Static583.aClass209_6);
			Static136.aClass12_8.la(local114 + local116 / 2, local112 / 2 + local110, Static88.anInt1972 << 1, Static88.anInt1972 << 1);
			Static560.method7541(local116 / 2 + local114, Static88.anInt1972 << 1, Static88.anInt1972 << 1, local112 / 2 + local110);
			Static27.method735(-Static124.anInt2517 & 0x3FFF, -Static202.anInt4065 & 0x3FFF, Static333.anInt5940, Static350.anInt6168, -Static427.anInt7255 & 0x3FFF, Static216.anInt4203);
			@Pc(562) byte local562 = Static479.aClass1_Sub7_Sub1_1.method2638(Static375.anInt6609) == 2 ? (byte) Static473.anInt8020 : 1;
			Static19.method538(Static81.anInt1910, Static333.anInt5940, Static350.anInt6168, Static216.anInt4203, Static221.aByteArrayArrayArray5, Static179.anIntArray187, Static378.anIntArray446, Static506.anIntArray581, Static399.anIntArray474, Static123.anIntArray152, Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116 + 1, local562, Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8796 >> 9, Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8795 >> 9, !Static479.aClass1_Sub7_Sub1_1.aBoolean224);
			Static99.method1834();
			if (Static177.anInt2101 == 10) {
				Static146.method2366(local112, local114, local116, local110);
				Static483.method6763(local110, local116, local112, local114);
				Static174.method2670(local116, local110, local114, local112);
				Static24.method599(local114, local116, local112, local110);
			}
			Static328.method4971();
			Static350.anInt6168 = local161;
			Static333.anInt5940 = local124;
			Static124.anInt2517 = local274;
			Static216.anInt4203 = local272;
			Static202.anInt4065 = local276;
			if (Static177.aBoolean167 && Static543.aClass113_2.method2494() == 0) {
				Static177.aBoolean167 = false;
			}
			if (Static177.aBoolean167) {
				Static136.aClass12_8.method6418(local112, local114, local110, local116, -16777216);
				Static471.method6665(Static510.aClass13_14, Static136.aClass12_8, false, Static103.aClass77_14.method1864(Static562.anInt9127), Static21.aClass35_1);
			}
		} else {
			Static136.aClass12_8.method6418(arg1, arg3, arg4, arg2, -16777216);
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method5143(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static184.anInt5417; local11++) {
			if (arg0.equalsIgnoreCase(Static333.aStringArray26[local11])) {
				return local11;
			}
		}
		return -1;
	}
}
