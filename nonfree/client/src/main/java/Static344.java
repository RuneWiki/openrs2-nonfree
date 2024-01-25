import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!na", name = "e", descriptor = "I")
	public static int anInt6027;

	@OriginalMember(owner = "client!na", name = "v", descriptor = "[I")
	public static int[] anIntArray331;

	@OriginalMember(owner = "client!na", name = "t", descriptor = "[[I")
	public static final int[][] anIntArrayArray132 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V")
	public static void method5091() {
		if (Static91.anInt1908 == -1 || Static1.anInt1 == -1) {
			return;
		}
		@Pc(25) int local25 = Static155.anInt3246 + ((Static58.anInt1264 - Static155.anInt3246) * Static147.anInt3127 >> 16);
		Static147.anInt3127 += local25;
		if (Static147.anInt3127 >= 65535) {
			Static147.anInt3127 = 65535;
			if (Static228.aBoolean300) {
				Static353.aBoolean451 = false;
			} else {
				Static353.aBoolean451 = true;
			}
			Static228.aBoolean300 = true;
		} else {
			Static353.aBoolean451 = false;
			Static228.aBoolean300 = false;
		}
		@Pc(55) float local55 = (float) Static147.anInt3127 / 65535.0F;
		@Pc(58) float[] local58 = new float[3];
		@Pc(62) int local62 = Static113.anInt2217 * 2;
		@Pc(88) int local88;
		@Pc(121) int local121;
		@Pc(129) int local129;
		@Pc(134) int local134;
		@Pc(143) int local143;
		@Pc(162) int local162;
		for (@Pc(64) int local64 = 0; local64 < 3; local64++) {
			@Pc(76) int local76 = Static145.anIntArrayArrayArray8[Static91.anInt1908][local62][local64] * 3;
			local88 = Static145.anIntArrayArrayArray8[Static91.anInt1908][local62 + 1][local64] * 3;
			local121 = (Static145.anIntArrayArrayArray8[Static91.anInt1908][local62 + 2][local64] + Static145.anIntArrayArrayArray8[Static91.anInt1908][local62 + 2][local64] - Static145.anIntArrayArrayArray8[Static91.anInt1908][local62 + 3][local64]) * 3;
			local129 = Static145.anIntArrayArrayArray8[Static91.anInt1908][local62][local64];
			local134 = local88 - local76;
			local143 = local76 + local121 - local88 * 2;
			local162 = Static145.anIntArrayArrayArray8[Static91.anInt1908][local62 + 2][local64] + local88 - local121 - local129;
			local58[local64] = (float) local129 + local55 * ((float) local134 + ((float) local162 * local55 + (float) local143) * local55);
		}
		Static226.anInt3984 = (int) local58[0] - Static335.anInt5608 * 512;
		Static350.anInt6080 = (int) local58[2] - Static246.anInt4344 * 512;
		Static461.anInt7704 = (int) local58[1] * -1;
		@Pc(218) float[] local218 = new float[3];
		local88 = Static309.anInt5225 * 2;
		for (local121 = 0; local121 < 3; local121++) {
			local129 = Static145.anIntArrayArrayArray8[Static1.anInt1][local88][local121] * 3;
			local134 = Static145.anIntArrayArrayArray8[Static1.anInt1][local88 + 1][local121] * 3;
			local143 = (Static145.anIntArrayArrayArray8[Static1.anInt1][local88 + 2][local121] + Static145.anIntArrayArrayArray8[Static1.anInt1][local88 + 2][local121] - Static145.anIntArrayArrayArray8[Static1.anInt1][local88 + 3][local121]) * 3;
			local162 = Static145.anIntArrayArrayArray8[Static1.anInt1][local88][local121];
			@Pc(294) int local294 = local134 - local129;
			@Pc(303) int local303 = local143 + local129 - local134 * 2;
			@Pc(321) int local321 = local134 + Static145.anIntArrayArrayArray8[Static1.anInt1][local88 + 2][local121] - local162 - local143;
			local218[local121] = (float) local162 + local55 * (local55 * ((float) local321 * local55 + (float) local303) + (float) local294);
		}
		@Pc(353) float local353 = local218[0] - local58[0];
		@Pc(363) float local363 = -1.0F * (local218[1] - local58[1]);
		@Pc(372) float local372 = local218[2] - local58[2];
		@Pc(382) double local382 = Math.sqrt((double) (local372 * local372 + local353 * local353));
		Static494.anInt8029 = (int) (Math.atan2((double) local363, local382) * 2607.5945876176133D) & 0x3FFF;
		Static333.anInt5565 = (int) (-Math.atan2((double) local353, (double) local372) * 2607.5945876176133D) & 0x3FFF;
		Static208.anInt3801 = (Static147.anInt3127 * (Static145.anIntArrayArrayArray8[Static91.anInt1908][local62 + 2][3] - Static145.anIntArrayArrayArray8[Static91.anInt1908][local62][3]) >> 16) + Static145.anIntArrayArrayArray8[Static91.anInt1908][local62][3];
	}
}
