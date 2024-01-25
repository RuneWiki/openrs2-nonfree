import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!qt", name = "t", descriptor = "Lclient!pe;")
	public static Class254 aClass254_115;

	@OriginalMember(owner = "client!qt", name = "r", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_116 = new Class276(61, -2);

	@OriginalMember(owner = "client!qt", name = "u", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_86 = new Class230(65, 3);

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIIZB)V")
	public static void method6896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (Static580.aClass125ArrayArrayArray3 == null) {
			Static546.aClass15_16.method5341(-16777216, arg0, arg2, arg1, arg3);
		} else if (Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9398 >= 0 && Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9398 < Static460.anInt8640 * 512 && Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9396 >= 0 && Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9396 < Static292.anInt7682 * 512) {
			Static453.anInt8598++;
			if (Static443.aClass2_Sub2_Sub1_Sub1_2 != null && Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9398 - (Static443.aClass2_Sub2_Sub1_Sub1_2.method6311() - 1) * 256 >> 9 == Static567.anInt10049 && Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9396 + 256 - Static443.aClass2_Sub2_Sub1_Sub1_2.method6311() * 256 >> 9 == Static387.anInt7430) {
				Static567.anInt10049 = -1;
				Static387.anInt7430 = -1;
				Static124.method2510();
			}
			Static167.method3102();
			if (!arg4) {
				Static258.method4585();
			}
			Static411.method6650();
			Static295.method4986(arg3, true, arg2, arg1, arg0);
			@Pc(114) int local114 = Static580.anInt10224;
			@Pc(116) int local116 = Static304.anInt6088;
			@Pc(118) int local118 = Static166.anInt3528;
			@Pc(120) int local120 = Static548.anInt9853;
			@Pc(140) int local140;
			@Pc(175) int local175;
			if (Static267.anInt5668 == 1) {
				local140 = (int) Static170.aFloat181;
				if (local140 < Static486.anInt9077 >> 8) {
					local140 = Static486.anInt9077 >> 8;
				}
				if (Static525.aBooleanArray38[4] && Static254.anIntArray491[4] + 128 > local140) {
					local140 = Static254.anIntArray491[4] + 128;
				}
				local175 = Static460.anInt8639 + (int) Static533.aFloat188 & 0x3FFF;
				Static183.method3264(Static274.method4782(Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9396, Static212.anInt4380, Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9398) - 200, Static189.anInt3761, local116, local140, (local140 >> 3) * 3 + 600 << 2, local175, Static65.anInt1699);
			} else if (Static267.anInt5668 == 4) {
				local140 = (int) Static170.aFloat181;
				if (Static486.anInt9077 >> 8 > local140) {
					local140 = Static486.anInt9077 >> 8;
				}
				if (Static525.aBooleanArray38[4] && local140 < Static254.anIntArray491[4] + 128) {
					local140 = Static254.anIntArray491[4] + 128;
				}
				local175 = (int) Static533.aFloat188 & 0x3FFF;
				Static183.method3264(Static274.method4782(Static166.anInt3526, Static212.anInt4380, Static531.anInt9619) - 200, Static189.anInt3761, local116, local140, (local140 >> 3) * 3 + 600 << 2, local175, Static65.anInt1699);
			} else if (Static267.anInt5668 == 5) {
				Static592.method8350(local116);
			}
			local140 = Static594.anInt10391;
			local175 = Static360.anInt1771;
			@Pc(271) int local271 = Static496.anInt9269;
			@Pc(273) int local273 = Static522.anInt9554;
			@Pc(275) int local275 = Static104.anInt2511;
			@Pc(317) int local317;
			for (@Pc(277) int local277 = 0; local277 < 5; local277++) {
				if (Static525.aBooleanArray38[local277]) {
					local317 = (int) ((double) (Static311.anIntArray428[local277] * 2 + 1) * Math.random() - (double) Static311.anIntArray428[local277] + Math.sin((double) Static477.anIntArray582[local277] * ((double) Static380.anIntArray473[local277] / 100.0D)) * (double) Static254.anIntArray491[local277]);
					if (local277 == 0) {
						Static594.anInt10391 += local317 << 2;
					}
					if (local277 == 4) {
						Static522.anInt9554 += local317;
						if (Static522.anInt9554 < 1024) {
							Static522.anInt9554 = 1024;
						} else if (Static522.anInt9554 > 3072) {
							Static522.anInt9554 = 3072;
						}
					}
					if (local277 == 1) {
						Static360.anInt1771 += local317 << 2;
					}
					if (local277 == 2) {
						Static496.anInt9269 += local317 << 2;
					}
					if (local277 == 3) {
						Static104.anInt2511 = Static104.anInt2511 + local317 & 0x3FFF;
					}
				}
			}
			if (Static594.anInt10391 < 0) {
				Static594.anInt10391 = 0;
			}
			if ((Static223.anInt4520 << 9) - 1 < Static594.anInt10391) {
				Static594.anInt10391 = (Static223.anInt4520 << 9) - 1;
			}
			if (Static496.anInt9269 < 0) {
				Static496.anInt9269 = 0;
			}
			if (Static496.anInt9269 > (Static416.anInt10065 << 9) - 1) {
				Static496.anInt9269 = (Static416.anInt10065 << 9) - 1;
			}
			Static75.method1766();
			Static78.method1787();
			Static546.aClass15_16.ca(local114, local118, local120 + local114, local118 - -local116);
			Static546.aClass15_16.method5342();
			local317 = Static591.anInt10348;
			if (Static429.aClass140_1 == null) {
				Static546.aClass15_16.D(local317);
			} else {
				Static429.aClass140_1.method3294(Static522.anInt9554, Static324.anInt6777 << 3, Static104.anInt2511, local118, local114, Static546.aClass15_16, local120, local317, local116);
			}
			Static129.method8413();
			Static574.aClass255_9.pa(Static594.anInt10391, Static360.anInt1771, Static496.anInt9269, -Static522.anInt9554 & 0x3FFF, -Static104.anInt2511 & 0x3FFF, -Static235.anInt4860 & 0x3FFF);
			Static546.aClass15_16.method5291(Static574.aClass255_9);
			Static546.aClass15_16.m(local114 + local120 / 2, local118 + local116 / 2, Static333.anInt6933 << 1, Static333.anInt6933 << 1);
			Static408.method6625(local114 + local120 / 2, Static333.anInt6933 << 1, local118 + local116 / 2, Static333.anInt6933 << 1);
			Static142.method2865(-Static522.anInt9554 & 0x3FFF, Static594.anInt10391, -Static104.anInt2511 & 0x3FFF, -Static235.anInt4860 & 0x3FFF, Static496.anInt9269, Static360.anInt1771);
			@Pc(558) byte local558 = Static455.aClass3_Sub27_Sub1_1.method4048(Static275.anInt5823) == 2 ? (byte) Static453.anInt8598 : 1;
			Static584.method8299(Static546.aClass15_16, Static129.anInt10429, Static583.anInt9699, Static574.aClass255_9, Static594.anInt10391, Static360.anInt1771, Static496.anInt9269, Static570.aByteArrayArrayArray20, Static429.anIntArray509, Static331.anIntArray443, Static539.anIntArray649, Static364.anIntArray461, Static260.anIntArray333, Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103 + 1, local558, Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9398 >> 9, Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9396 >> 9, !Static455.aClass3_Sub27_Sub1_1.aBoolean389);
			Static129.method8413();
			if (Static75.anInt1880 == 10) {
				Static538.method7910(local116, local118, local114, local120);
				Static505.method7609(local120, local118, local114, local116);
				Static61.method1558(local114, local120, local118, local116);
				Static243.method4285(local120, local114, local116, local118);
			}
			Static36.method1092();
			Static594.anInt10391 = local140;
			Static104.anInt2511 = local275;
			Static496.anInt9269 = local271;
			Static522.anInt9554 = local273;
			Static360.anInt1771 = local175;
			if (Static464.aBoolean710 && Static122.aClass289_2.method7101() == 0) {
				Static464.aBoolean710 = false;
			}
			if (Static464.aBoolean710) {
				Static546.aClass15_16.method5341(-16777216, local114, local116, local120, local118);
				Static569.method8164(false, Static139.aClass101_11.method2841(Static126.anInt2904), Static546.aClass15_16, Static137.aClass111_5, Static13.aClass297_2);
			}
		} else {
			Static546.aClass15_16.method5341(-16777216, arg0, arg2, arg1, arg3);
		}
	}
}
