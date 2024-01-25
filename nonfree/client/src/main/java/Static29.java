import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!at", name = "b", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_12 = new Class240(46, 3);

	@OriginalMember(owner = "client!at", name = "c", descriptor = "Lclient!qw;")
	public static final Class302 aClass302_3 = new Class302();

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Z)V")
	public static void method628() {
		if (Static405.anInt6667 == -1 || Static614.anInt10208 == -1) {
			return;
		}
		@Pc(24) int local24 = (Static246.anInt4349 * (Static408.anInt6690 - Static113.anInt2069) >> 16) + Static113.anInt2069;
		Static246.anInt4349 += local24;
		if (Static246.anInt4349 < 65535) {
			Static24.aBoolean33 = false;
			Static559.aBoolean634 = false;
		} else {
			Static246.anInt4349 = 65535;
			if (Static559.aBoolean634) {
				Static24.aBoolean33 = false;
			} else {
				Static24.aBoolean33 = true;
			}
			Static559.aBoolean634 = true;
		}
		@Pc(56) float local56 = (float) Static246.anInt4349 / 65535.0F;
		@Pc(59) float[] local59 = new float[3];
		@Pc(63) int local63 = Static674.anInt10900 * 2;
		@Pc(89) int local89;
		@Pc(122) int local122;
		@Pc(130) int local130;
		@Pc(135) int local135;
		@Pc(144) int local144;
		@Pc(162) int local162;
		for (@Pc(65) int local65 = 0; local65 < 3; local65++) {
			@Pc(77) int local77 = Static324.anIntArrayArrayArray10[Static405.anInt6667][local63][local65] * 3;
			local89 = Static324.anIntArrayArrayArray10[Static405.anInt6667][local63 + 1][local65] * 3;
			local122 = (Static324.anIntArrayArrayArray10[Static405.anInt6667][local63 + 2][local65] + Static324.anIntArrayArrayArray10[Static405.anInt6667][local63 + 2][local65] - Static324.anIntArrayArrayArray10[Static405.anInt6667][local63 + 3][local65]) * 3;
			local130 = Static324.anIntArrayArrayArray10[Static405.anInt6667][local63][local65];
			local135 = local89 - local77;
			local144 = local122 + local77 - local89 * 2;
			local162 = Static324.anIntArrayArrayArray10[Static405.anInt6667][local63 + 2][local65] + local89 - local122 - local130;
			local59[local65] = (float) local130 + ((float) local135 + ((float) local144 + local56 * (float) local162) * local56) * local56;
		}
		Static166.anInt3034 = (int) local59[1] * -1;
		Static370.anInt6266 = (int) local59[0] - Static534.anInt8358 * 512;
		Static564.anInt9117 = (int) local59[2] - Static402.anInt6661 * 512;
		@Pc(222) float[] local222 = new float[3];
		local89 = Static99.anInt1969 * 2;
		for (local122 = 0; local122 < 3; local122++) {
			local130 = Static324.anIntArrayArrayArray10[Static614.anInt10208][local89][local122] * 3;
			local135 = Static324.anIntArrayArrayArray10[Static614.anInt10208][local89 + 1][local122] * 3;
			local144 = (Static324.anIntArrayArrayArray10[Static614.anInt10208][local89 + 2][local122] + Static324.anIntArrayArrayArray10[Static614.anInt10208][local89 + 2][local122] - Static324.anIntArrayArrayArray10[Static614.anInt10208][local89 + 3][local122]) * 3;
			local162 = Static324.anIntArrayArrayArray10[Static614.anInt10208][local89][local122];
			@Pc(298) int local298 = local135 - local130;
			@Pc(307) int local307 = local144 + local130 - local135 * 2;
			@Pc(326) int local326 = Static324.anIntArrayArrayArray10[Static614.anInt10208][local89 + 2][local122] + local135 - local144 - local162;
			local222[local122] = (float) local162 + local56 * (((float) local326 * local56 + (float) local307) * local56 + (float) local298);
		}
		@Pc(360) float local360 = local222[0] - local59[0];
		@Pc(371) float local371 = (local222[1] - local59[1]) * -1.0F;
		@Pc(380) float local380 = local222[2] - local59[2];
		@Pc(390) double local390 = Math.sqrt((double) (local360 * local360 + local380 * local380));
		Static655.anInt10676 = (int) (Math.atan2((double) local371, local390) * 2607.5945876176133D) & 0x3FFF;
		Static40.anInt856 = (int) (-Math.atan2((double) local360, (double) local380) * 2607.5945876176133D) & 0x3FFF;
		Static325.anInt5414 = Static324.anIntArrayArrayArray10[Static405.anInt6667][local63][3] + (Static246.anInt4349 * (Static324.anIntArrayArrayArray10[Static405.anInt6667][local63 + 2][3] - Static324.anIntArrayArrayArray10[Static405.anInt6667][local63][3]) >> 16);
	}
}
