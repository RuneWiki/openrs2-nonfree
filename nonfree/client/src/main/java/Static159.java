import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "I")
	public static int anInt2475;

	@OriginalMember(owner = "client!fca", name = "c", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_32 = new Class387(32, 3);

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)V")
	public static void method2170() {
		if (Static658.anInt10595 == -1 || Static342.anInt6068 == -1) {
			return;
		}
		@Pc(27) int local27 = Static522.anInt8831 + ((Static417.anInt7210 - Static522.anInt8831) * Static473.anInt8013 >> 16);
		Static473.anInt8013 += local27;
		if (Static473.anInt8013 >= 65535) {
			if (Static528.aBoolean674) {
				Static601.aBoolean756 = false;
			} else {
				Static601.aBoolean756 = true;
			}
			Static473.anInt8013 = 65535;
			Static528.aBoolean674 = true;
		} else {
			Static601.aBoolean756 = false;
			Static528.aBoolean674 = false;
		}
		@Pc(67) float local67 = (float) Static473.anInt8013 / 65535.0F;
		@Pc(70) float[] local70 = new float[3];
		@Pc(74) int local74 = Static643.anInt10456 * 2;
		@Pc(102) int local102;
		@Pc(144) int local144;
		@Pc(148) int local148;
		@Pc(157) int local157;
		@Pc(175) int local175;
		for (@Pc(76) int local76 = 0; local76 < 3; local76++) {
			@Pc(90) int local90 = Static357.anIntArrayArrayArray16[Static658.anInt10595][local74][local76] * 3;
			local102 = Static357.anIntArrayArrayArray16[Static658.anInt10595][local74 + 1][local76] * 3;
			@Pc(136) int local136 = (Static357.anIntArrayArrayArray16[Static658.anInt10595][local74 + 2][local76] + Static357.anIntArrayArrayArray16[Static658.anInt10595][local74 + 2][local76] - Static357.anIntArrayArrayArray16[Static658.anInt10595][local74 + 3][local76]) * 3;
			local144 = Static357.anIntArrayArrayArray16[Static658.anInt10595][local74][local76];
			local148 = local102 - local90;
			local157 = local136 + local90 - local102 * 2;
			local175 = local102 + Static357.anIntArrayArrayArray16[Static658.anInt10595][local74 + 2][local76] - local136 - local144;
			local70[local76] = (((float) local157 + (float) local175 * local67) * local67 + (float) local148) * local67 + (float) local144;
		}
		Static532.anInt9189 = (int) local70[0] - Static622.anInt10188 * 512;
		Static132.anInt2186 = (int) local70[1] * -1;
		Static489.anInt8202 = (int) local70[2] - Static668.anInt10683 * 512;
		@Pc(231) float[] local231 = new float[3];
		local102 = Static62.anInt971 * 2;
		for (local144 = 0; local144 < 3; local144++) {
			local148 = Static357.anIntArrayArrayArray16[Static342.anInt6068][local102][local144] * 3;
			local157 = Static357.anIntArrayArrayArray16[Static342.anInt6068][local102 + 1][local144] * 3;
			local175 = (Static357.anIntArrayArrayArray16[Static342.anInt6068][local102 + 2][local144] + Static357.anIntArrayArrayArray16[Static342.anInt6068][local102 + 2][local144] - Static357.anIntArrayArrayArray16[Static342.anInt6068][local102 + 3][local144]) * 3;
			@Pc(313) int local313 = Static357.anIntArrayArrayArray16[Static342.anInt6068][local102][local144];
			@Pc(317) int local317 = local157 - local148;
			@Pc(326) int local326 = local148 + local175 - local157 * 2;
			@Pc(344) int local344 = local157 + Static357.anIntArrayArrayArray16[Static342.anInt6068][local102 + 2][local144] - local313 - local175;
			local231[local144] = (float) local313 + local67 * (((float) local344 * local67 + (float) local326) * local67 + (float) local317);
		}
		@Pc(376) float local376 = local231[0] - local70[0];
		@Pc(386) float local386 = (local231[1] - local70[1]) * -1.0F;
		@Pc(395) float local395 = local231[2] - local70[2];
		@Pc(405) double local405 = Math.sqrt((double) (local376 * local376 + local395 * local395));
		Static649.anInt5976 = (int) (Math.atan2((double) local386, local405) * 2607.5945876176133D) & 0x3FFF;
		anInt2475 = (int) (-Math.atan2((double) local376, (double) local395) * 2607.5945876176133D) & 0x3FFF;
		Static313.anInt5549 = (Static473.anInt8013 * (Static357.anIntArrayArrayArray16[Static658.anInt10595][local74 + 2][3] - Static357.anIntArrayArrayArray16[Static658.anInt10595][local74][3]) >> 16) + Static357.anIntArrayArrayArray16[Static658.anInt10595][local74][3];
	}
}
