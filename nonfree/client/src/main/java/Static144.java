import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!i", name = "b", descriptor = "Z")
	public static boolean aBoolean199;

	@OriginalMember(owner = "client!i", name = "d", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray14;

	@OriginalMember(owner = "client!i", name = "f", descriptor = "I")
	public static int anInt2614 = 0;

	@OriginalMember(owner = "client!i", name = "k", descriptor = "J")
	public static long aLong84 = 0L;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public static void method2461() {
		if (Static53.anInt1096 == -1 || Static159.anInt2909 == -1) {
			return;
		}
		@Pc(24) int local24 = Static53.anInt1093 + (Static237.anInt4349 * (Static304.anInt2195 - Static53.anInt1093) >> 16);
		Static237.anInt4349 += local24;
		if (Static237.anInt4349 < 65535) {
			Static191.aBoolean243 = false;
			Static170.aBoolean225 = false;
		} else {
			Static237.anInt4349 = 65535;
			if (Static191.aBoolean243) {
				Static170.aBoolean225 = false;
			} else {
				Static170.aBoolean225 = true;
			}
			Static191.aBoolean243 = true;
		}
		@Pc(56) float local56 = (float) Static237.anInt4349 / 65535.0F;
		@Pc(59) float[] local59 = new float[3];
		@Pc(63) int local63 = Static24.anInt586 * 2;
		@Pc(89) int local89;
		@Pc(122) int local122;
		@Pc(130) int local130;
		@Pc(134) int local134;
		@Pc(142) int local142;
		@Pc(161) int local161;
		for (@Pc(65) int local65 = 0; local65 < 3; local65++) {
			@Pc(77) int local77 = Static339.anIntArrayArrayArray13[Static53.anInt1096][local63][local65] * 3;
			local89 = Static339.anIntArrayArrayArray13[Static53.anInt1096][local63 + 1][local65] * 3;
			local122 = (Static339.anIntArrayArrayArray13[Static53.anInt1096][local63 + 2][local65] + Static339.anIntArrayArrayArray13[Static53.anInt1096][local63 + 2][local65] - Static339.anIntArrayArrayArray13[Static53.anInt1096][local63 + 3][local65]) * 3;
			local130 = Static339.anIntArrayArrayArray13[Static53.anInt1096][local63][local65];
			local134 = local89 - local77;
			local142 = local77 + local122 - local89 * 2;
			local161 = Static339.anIntArrayArrayArray13[Static53.anInt1096][local63 + 2][local65] + local89 - local130 - local122;
			local59[local65] = (float) local130 + ((float) local134 + (local56 * (float) local161 + (float) local142) * local56) * local56;
		}
		Static22.anInt547 = (int) local59[2] - Static133.anInt2474 * 128;
		Static71.anInt1354 = (int) local59[1] * -1;
		Static160.anInt2915 = (int) local59[0] - Static376.anInt6607 * 128;
		@Pc(214) float[] local214 = new float[3];
		local89 = Static265.anInt4676 * 2;
		for (local122 = 0; local122 < 3; local122++) {
			local130 = Static339.anIntArrayArrayArray13[Static159.anInt2909][local89][local122] * 3;
			local134 = Static339.anIntArrayArrayArray13[Static159.anInt2909][local89 + 1][local122] * 3;
			local142 = (Static339.anIntArrayArrayArray13[Static159.anInt2909][local89 + 2][local122] + Static339.anIntArrayArrayArray13[Static159.anInt2909][local89 + 2][local122] - Static339.anIntArrayArrayArray13[Static159.anInt2909][local89 + 3][local122]) * 3;
			local161 = Static339.anIntArrayArrayArray13[Static159.anInt2909][local89][local122];
			@Pc(295) int local295 = local134 - local130;
			@Pc(303) int local303 = local130 + local142 - local134 * 2;
			@Pc(321) int local321 = Static339.anIntArrayArrayArray13[Static159.anInt2909][local89 + 2][local122] + local134 - local142 - local161;
			local214[local122] = local56 * ((float) local295 + ((float) local303 + local56 * (float) local321) * local56) + (float) local161;
		}
		@Pc(354) float local354 = local214[0] - local59[0];
		@Pc(365) float local365 = -1.0F * (local214[1] - local59[1]);
		@Pc(373) float local373 = local214[2] - local59[2];
		@Pc(383) double local383 = Math.sqrt((double) (local373 * local373 + local354 * local354));
		Static278.anInt1556 = (int) (Math.atan2((double) local365, local383) * 2607.5945876176133D) & 0x3FFF;
		Static392.anInt6749 = (int) (-Math.atan2((double) local354, (double) local373) * 2607.5945876176133D) & 0x3FFF;
		Static315.anInt5585 = ((Static339.anIntArrayArrayArray13[Static53.anInt1096][local63 + 2][3] - Static339.anIntArrayArrayArray13[Static53.anInt1096][local63][3]) * Static237.anInt4349 >> 16) + Static339.anIntArrayArrayArray13[Static53.anInt1096][local63][3];
	}
}
