import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!os", name = "b", descriptor = "[I")
	public static final int[] anIntArray264 = new int[6];

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V")
	public static void method3890() {
		if (Static367.anInt6214 == -1 || Static214.anInt7430 == -1) {
			return;
		}
		@Pc(25) int local25 = Static359.anInt5959 + (Static128.anInt2229 * (Static66.anInt1155 - Static359.anInt5959) >> 16);
		Static128.anInt2229 += local25;
		if (Static128.anInt2229 >= 65535) {
			Static128.anInt2229 = 65535;
			if (Static225.aBoolean290) {
				Static269.aBoolean337 = false;
			} else {
				Static269.aBoolean337 = true;
			}
			Static225.aBoolean290 = true;
		} else {
			Static225.aBoolean290 = false;
			Static269.aBoolean337 = false;
		}
		@Pc(55) float local55 = (float) Static128.anInt2229 / 65535.0F;
		@Pc(58) float[] local58 = new float[3];
		@Pc(62) int local62 = Static126.anInt2201 * 2;
		@Pc(121) int local121;
		@Pc(129) int local129;
		@Pc(133) int local133;
		@Pc(141) int local141;
		@Pc(157) int local157;
		for (@Pc(64) int local64 = 0; local64 < 3; local64++) {
			@Pc(76) int local76 = Static1.anIntArrayArrayArray1[Static367.anInt6214][local62][local64] * 3;
			@Pc(88) int local88 = Static1.anIntArrayArrayArray1[Static367.anInt6214][local62 + 1][local64] * 3;
			local121 = (Static1.anIntArrayArrayArray1[Static367.anInt6214][local62 + 2][local64] + Static1.anIntArrayArrayArray1[Static367.anInt6214][local62 + 2][local64] - Static1.anIntArrayArrayArray1[Static367.anInt6214][local62 + 3][local64]) * 3;
			local129 = Static1.anIntArrayArrayArray1[Static367.anInt6214][local62][local64];
			local133 = local88 - local76;
			local141 = local121 + local76 - local88 * 2;
			local157 = local88 + Static1.anIntArrayArrayArray1[Static367.anInt6214][local62 + 2][local64] - local129 - local121;
			local58[local64] = local55 * (local55 * ((float) local141 + (float) local157 * local55) + (float) local133) + (float) local129;
		}
		Static8.anInt7337 = (int) local58[2] - Static278.anInt4392 * 128;
		Static5.anInt113 = (int) local58[1] * -1;
		Static278.anInt4391 = (int) local58[0] - Static101.anInt6646 * 128;
		@Pc(221) float[] local221 = new float[3];
		local121 = Static159.anInt2650 * 2;
		for (local129 = 0; local129 < 3; local129++) {
			local133 = Static1.anIntArrayArrayArray1[Static214.anInt7430][local121][local129] * 3;
			local141 = Static1.anIntArrayArrayArray1[Static214.anInt7430][local121 + 1][local129] * 3;
			local157 = (Static1.anIntArrayArrayArray1[Static214.anInt7430][local121 + 2][local129] + Static1.anIntArrayArrayArray1[Static214.anInt7430][local121 + 2][local129] - Static1.anIntArrayArrayArray1[Static214.anInt7430][local121 + 3][local129]) * 3;
			@Pc(293) int local293 = Static1.anIntArrayArrayArray1[Static214.anInt7430][local121][local129];
			@Pc(298) int local298 = local141 - local133;
			@Pc(307) int local307 = local157 + local133 - local141 * 2;
			@Pc(323) int local323 = Static1.anIntArrayArrayArray1[Static214.anInt7430][local121 + 2][local129] + local141 - local293 - local157;
			local221[local129] = local55 * ((float) local298 + ((float) local323 * local55 + (float) local307) * local55) + (float) local293;
		}
		@Pc(356) float local356 = local221[0] - local58[0];
		@Pc(367) float local367 = (local221[1] - local58[1]) * -1.0F;
		@Pc(375) float local375 = local221[2] - local58[2];
		@Pc(385) double local385 = Math.sqrt((double) (local356 * local356 + local375 * local375));
		Static401.anInt3623 = (int) (Math.atan2((double) local367, local385) * 2607.5945876176133D) & 0x3FFF;
		Static409.anInt6636 = (int) (-Math.atan2((double) local356, (double) local375) * 2607.5945876176133D) & 0x3FFF;
		Static376.anInt6292 = Static1.anIntArrayArrayArray1[Static367.anInt6214][local62][3] + (Static128.anInt2229 * (Static1.anIntArrayArrayArray1[Static367.anInt6214][local62 + 2][3] - Static1.anIntArrayArrayArray1[Static367.anInt6214][local62][3]) >> 16);
	}
}
