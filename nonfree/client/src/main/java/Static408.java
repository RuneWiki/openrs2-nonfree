import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_105 = new Class306("Loaded JAGDX", "JAGDX geladen", "JAGDX chargé", "JAGDX carregado");

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(B)V")
	public static void method6071() {
		if (Static259.anInt5038 == -1 || Static54.anInt1079 == -1) {
			return;
		}
		@Pc(24) int local24 = Static373.anInt1269 + (Static261.anInt2342 * (Static338.anInt6065 - Static373.anInt1269) >> 16);
		Static261.anInt2342 += local24;
		if (Static261.anInt2342 >= 65535) {
			Static261.anInt2342 = 65535;
			if (Static286.aBoolean378) {
				Static104.aBoolean128 = false;
			} else {
				Static104.aBoolean128 = true;
			}
			Static286.aBoolean378 = true;
		} else {
			Static286.aBoolean378 = false;
			Static104.aBoolean128 = false;
		}
		@Pc(54) float local54 = (float) Static261.anInt2342 / 65535.0F;
		@Pc(57) float[] local57 = new float[3];
		@Pc(61) int local61 = Static157.anInt4563 * 2;
		@Pc(95) int local95;
		@Pc(129) int local129;
		@Pc(137) int local137;
		@Pc(142) int local142;
		@Pc(151) int local151;
		@Pc(168) int local168;
		for (@Pc(71) int local71 = 0; local71 < 3; local71++) {
			@Pc(83) int local83 = Static197.anIntArrayArrayArray21[Static259.anInt5038][local61][local71] * 3;
			local95 = Static197.anIntArrayArrayArray21[Static259.anInt5038][local61 + 1][local71] * 3;
			local129 = (Static197.anIntArrayArrayArray21[Static259.anInt5038][local61 + 2][local71] + Static197.anIntArrayArrayArray21[Static259.anInt5038][local61 + 2][local71] - Static197.anIntArrayArrayArray21[Static259.anInt5038][local61 + 3][local71]) * 3;
			local137 = Static197.anIntArrayArrayArray21[Static259.anInt5038][local61][local71];
			local142 = local95 - local83;
			local151 = local129 + local83 - local95 * 2;
			local168 = Static197.anIntArrayArrayArray21[Static259.anInt5038][local61 + 2][local71] + local95 - local129 - local137;
			local57[local71] = (float) local137 + (((float) local151 + (float) local168 * local54) * local54 + (float) local142) * local54;
		}
		Static504.anInt8519 = (int) local57[1] * -1;
		Static516.anInt8682 = (int) local57[2] - Static534.anInt9007 * 512;
		Static522.anInt8770 = (int) local57[0] - Static470.anInt7897 * 512;
		@Pc(224) float[] local224 = new float[3];
		local95 = Static437.anInt7566 * 2;
		for (local129 = 0; local129 < 3; local129++) {
			local137 = Static197.anIntArrayArrayArray21[Static54.anInt1079][local95][local129] * 3;
			local142 = Static197.anIntArrayArrayArray21[Static54.anInt1079][local95 + 1][local129] * 3;
			local151 = (Static197.anIntArrayArrayArray21[Static54.anInt1079][local95 + 2][local129] + Static197.anIntArrayArrayArray21[Static54.anInt1079][local95 + 2][local129] - Static197.anIntArrayArrayArray21[Static54.anInt1079][local95 + 3][local129]) * 3;
			local168 = Static197.anIntArrayArrayArray21[Static54.anInt1079][local95][local129];
			@Pc(299) int local299 = local142 - local137;
			@Pc(307) int local307 = local151 + local137 - local142 * 2;
			@Pc(324) int local324 = Static197.anIntArrayArrayArray21[Static54.anInt1079][local95 + 2][local129] + local142 - local168 - local151;
			local224[local129] = (float) local168 + local54 * ((float) local299 + local54 * (local54 * (float) local324 + (float) local307));
		}
		@Pc(357) float local357 = local224[0] - local57[0];
		@Pc(368) float local368 = -1.0F * (local224[1] - local57[1]);
		@Pc(376) float local376 = local224[2] - local57[2];
		@Pc(386) double local386 = Math.sqrt((double) (local357 * local357 + local376 * local376));
		Static381.anInt6946 = (int) (Math.atan2((double) local368, local386) * 2607.5945876176133D) & 0x3FFF;
		Static305.anInt5631 = (int) (-Math.atan2((double) local357, (double) local376) * 2607.5945876176133D) & 0x3FFF;
		Static363.anInt6440 = (Static261.anInt2342 * (Static197.anIntArrayArrayArray21[Static259.anInt5038][local61 + 2][3] - Static197.anIntArrayArrayArray21[Static259.anInt5038][local61][3]) >> 16) + Static197.anIntArrayArrayArray21[Static259.anInt5038][local61][3];
	}
}
