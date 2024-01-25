import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!lga", name = "q", descriptor = "I")
	public static int anInt6569;

	@OriginalMember(owner = "client!lga", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString70 = null;

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(B)V")
	public static void method5589() {
		if (Static13.anInt196 == -1 || Static616.anInt10782 == -1) {
			return;
		}
		@Pc(23) int local23 = (Static365.anInt7300 * (Static102.anInt2849 - Static471.anInt8843) >> 16) + Static471.anInt8843;
		Static365.anInt7300 += local23;
		if (Static365.anInt7300 < 65535) {
			Static123.aBoolean251 = false;
			Static221.aBoolean370 = false;
		} else {
			if (Static221.aBoolean370) {
				Static123.aBoolean251 = false;
			} else {
				Static123.aBoolean251 = true;
			}
			Static365.anInt7300 = 65535;
			Static221.aBoolean370 = true;
		}
		@Pc(55) float local55 = (float) Static365.anInt7300 / 65535.0F;
		@Pc(58) float[] local58 = new float[3];
		@Pc(62) int local62 = Static497.anInt9200 * 2;
		@Pc(88) int local88;
		@Pc(121) int local121;
		@Pc(133) int local133;
		@Pc(143) int local143;
		@Pc(161) int local161;
		for (@Pc(64) int local64 = 0; local64 < 3; local64++) {
			@Pc(76) int local76 = Static614.anIntArrayArrayArray20[Static13.anInt196][local62][local64] * 3;
			local88 = Static614.anIntArrayArrayArray20[Static13.anInt196][local62 + 1][local64] * 3;
			local121 = (Static614.anIntArrayArrayArray20[Static13.anInt196][local62 + 2][local64] + Static614.anIntArrayArrayArray20[Static13.anInt196][local62 + 2][local64] - Static614.anIntArrayArrayArray20[Static13.anInt196][local62 - -3][local64]) * 3;
			@Pc(129) int local129 = Static614.anIntArrayArrayArray20[Static13.anInt196][local62][local64];
			local133 = local88 - local76;
			local143 = local76 + local121 - local88 * 2;
			local161 = Static614.anIntArrayArrayArray20[Static13.anInt196][local62 + 2][local64] + local88 - local129 - local121;
			local58[local64] = (float) local129 + local55 * ((float) local133 + local55 * (local55 * (float) local161 + (float) local143));
		}
		Static135.anInt3347 = (int) local58[0] - Static84.anInt2565 * 512;
		Static639.anInt11034 = (int) local58[1] * -1;
		Static621.anInt10870 = (int) local58[2] - Static32.anInt723 * 512;
		@Pc(214) float[] local214 = new float[3];
		local88 = Static573.anInt10251 * 2;
		for (local121 = 0; local121 < 3; local121++) {
			local133 = Static614.anIntArrayArrayArray20[Static616.anInt10782][local88][local121] * 3;
			local143 = Static614.anIntArrayArrayArray20[Static616.anInt10782][local88 + 1][local121] * 3;
			local161 = (Static614.anIntArrayArrayArray20[Static616.anInt10782][local88 + 2][local121] + Static614.anIntArrayArrayArray20[Static616.anInt10782][local88 + 2][local121] - Static614.anIntArrayArrayArray20[Static616.anInt10782][local88 + 3][local121]) * 3;
			@Pc(293) int local293 = Static614.anIntArrayArrayArray20[Static616.anInt10782][local88][local121];
			@Pc(298) int local298 = local143 - local133;
			@Pc(307) int local307 = local133 + local161 - local143 * 2;
			@Pc(325) int local325 = local143 + Static614.anIntArrayArrayArray20[Static616.anInt10782][local88 + 2][local121] - local161 - local293;
			local214[local121] = local55 * ((float) local298 + local55 * ((float) local325 * local55 + (float) local307)) + (float) local293;
		}
		@Pc(360) float local360 = local214[0] - local58[0];
		@Pc(371) float local371 = -1.0F * (local214[1] - local58[1]);
		@Pc(380) float local380 = local214[2] - local58[2];
		@Pc(390) double local390 = Math.sqrt((double) (local360 * local360 + local380 * local380));
		Static266.anInt5673 = (int) (Math.atan2((double) local371, local390) * 2607.5945876176133D) & 0x3FFF;
		Static189.anInt11070 = (int) (-Math.atan2((double) local360, (double) local380) * 2607.5945876176133D) & 0x3FFF;
		Static113.anInt3037 = Static614.anIntArrayArrayArray20[Static13.anInt196][local62][3] + ((Static614.anIntArrayArrayArray20[Static13.anInt196][local62 + 2][3] - Static614.anIntArrayArrayArray20[Static13.anInt196][local62][3]) * Static365.anInt7300 >> 16);
	}
}
