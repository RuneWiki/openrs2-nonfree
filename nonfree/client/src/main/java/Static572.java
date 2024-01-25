import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static572 {

	@OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
	public static int anInt9597;

	@OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
	public static int anInt9600;

	@OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
	public static int anInt9602 = 0;

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
	public static void method8144() {
		if (Static224.anInt4365 == -1 || Static518.anInt9068 == -1) {
			return;
		}
		@Pc(23) int local23 = ((Static519.anInt9081 - Static67.anInt1402) * Static318.anInt6085 >> 16) + Static67.anInt1402;
		Static318.anInt6085 += local23;
		if (Static318.anInt6085 < 65535) {
			Static649.aBoolean732 = false;
			Static146.aBoolean367 = false;
		} else {
			if (Static649.aBoolean732) {
				Static146.aBoolean367 = false;
			} else {
				Static146.aBoolean367 = true;
			}
			Static318.anInt6085 = 65535;
			Static649.aBoolean732 = true;
		}
		@Pc(55) float local55 = (float) Static318.anInt6085 / 65535.0F;
		@Pc(58) float[] local58 = new float[3];
		@Pc(62) int local62 = Static322.anInt6164 * 2;
		@Pc(96) int local96;
		@Pc(129) int local129;
		@Pc(137) int local137;
		@Pc(142) int local142;
		@Pc(151) int local151;
		@Pc(169) int local169;
		for (@Pc(72) int local72 = 0; local72 < 3; local72++) {
			@Pc(84) int local84 = Static408.anIntArrayArrayArray16[Static224.anInt4365][local62][local72] * 3;
			local96 = Static408.anIntArrayArrayArray16[Static224.anInt4365][local62 + 1][local72] * 3;
			local129 = (Static408.anIntArrayArrayArray16[Static224.anInt4365][local62 + 2][local72] + Static408.anIntArrayArrayArray16[Static224.anInt4365][local62 + 2][local72] - Static408.anIntArrayArrayArray16[Static224.anInt4365][local62 + 3][local72]) * 3;
			local137 = Static408.anIntArrayArrayArray16[Static224.anInt4365][local62][local72];
			local142 = local96 - local84;
			local151 = local129 + local84 - local96 * 2;
			local169 = Static408.anIntArrayArrayArray16[Static224.anInt4365][local62 + 2][local72] + local96 - local137 - local129;
			local58[local72] = (float) local137 + local55 * (((float) local169 * local55 + (float) local151) * local55 + (float) local142);
		}
		Static580.anInt9662 = (int) local58[0] - Static606.anInt8651 * 512;
		Static428.anInt7788 = (int) local58[1] * -1;
		Static524.anInt9123 = (int) local58[2] - Static195.anInt3961 * 512;
		@Pc(224) float[] local224 = new float[3];
		local96 = Static42.anInt849 * 2;
		for (local129 = 0; local129 < 3; local129++) {
			local137 = Static408.anIntArrayArrayArray16[Static518.anInt9068][local96][local129] * 3;
			local142 = Static408.anIntArrayArrayArray16[Static518.anInt9068][local96 + 1][local129] * 3;
			local151 = (Static408.anIntArrayArrayArray16[Static518.anInt9068][local96 + 2][local129] + Static408.anIntArrayArrayArray16[Static518.anInt9068][local96 + 2][local129] - Static408.anIntArrayArrayArray16[Static518.anInt9068][local96 + 3][local129]) * 3;
			local169 = Static408.anIntArrayArrayArray16[Static518.anInt9068][local96][local129];
			@Pc(299) int local299 = local142 - local137;
			@Pc(308) int local308 = local151 + local137 - local142 * 2;
			@Pc(325) int local325 = local142 + Static408.anIntArrayArrayArray16[Static518.anInt9068][local96 + 2][local129] - local151 - local169;
			local224[local129] = ((float) local299 + local55 * ((float) local308 + local55 * (float) local325)) * local55 + (float) local169;
		}
		@Pc(357) float local357 = local224[0] - local58[0];
		@Pc(368) float local368 = (local224[1] - local58[1]) * -1.0F;
		@Pc(377) float local377 = local224[2] - local58[2];
		@Pc(387) double local387 = Math.sqrt((double) (local377 * local377 + local357 * local357));
		Static263.anInt5239 = (int) (Math.atan2((double) local368, local387) * 2607.5945876176133D) & 0x3FFF;
		Static470.anInt8261 = (int) (-Math.atan2((double) local357, (double) local377) * 2607.5945876176133D) & 0x3FFF;
		Static9.anInt193 = (Static318.anInt6085 * (Static408.anIntArrayArrayArray16[Static224.anInt4365][local62 + 2][3] - Static408.anIntArrayArrayArray16[Static224.anInt4365][local62][3]) >> 16) + Static408.anIntArrayArrayArray16[Static224.anInt4365][local62][3];
	}
}
