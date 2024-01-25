import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static637 {

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "F")
	public static float aFloat194;

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "[Lclient!s;")
	public static Class91[] aClass91Array4;

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "Lclient!uu;")
	public static Class343 aClass343_258;

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "Lclient!sga;")
	public static final Class306 aClass306_5 = new Class306();

	@OriginalMember(owner = "client!wk", name = "k", descriptor = "[I")
	public static final int[] anIntArray621 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)V")
	public static void method8309() {
		if (Static300.anInt9743 == -1 || Static138.anInt2851 == -1) {
			return;
		}
		@Pc(24) int local24 = Static615.anInt9898 + ((Static49.anInt969 - Static615.anInt9898) * Static235.anInt4693 >> 16);
		Static235.anInt4693 += local24;
		if (Static235.anInt4693 >= 65535) {
			if (Static514.aBoolean644) {
				Static529.aBoolean670 = false;
			} else {
				Static529.aBoolean670 = true;
			}
			Static235.anInt4693 = 65535;
			Static514.aBoolean644 = true;
		} else {
			Static514.aBoolean644 = false;
			Static529.aBoolean670 = false;
		}
		@Pc(56) float local56 = (float) Static235.anInt4693 / 65535.0F;
		@Pc(59) float[] local59 = new float[3];
		@Pc(63) int local63 = Static634.anInt10078 * 2;
		@Pc(89) int local89;
		@Pc(121) int local121;
		@Pc(129) int local129;
		@Pc(134) int local134;
		@Pc(142) int local142;
		@Pc(159) int local159;
		for (@Pc(65) int local65 = 0; local65 < 3; local65++) {
			@Pc(77) int local77 = Static583.anIntArrayArrayArray37[Static300.anInt9743][local63][local65] * 3;
			local89 = Static583.anIntArrayArrayArray37[Static300.anInt9743][local63 + 1][local65] * 3;
			local121 = (Static583.anIntArrayArrayArray37[Static300.anInt9743][local63 + 2][local65] + Static583.anIntArrayArrayArray37[Static300.anInt9743][local63 + 2][local65] - Static583.anIntArrayArrayArray37[Static300.anInt9743][local63 + 3][local65]) * 3;
			local129 = Static583.anIntArrayArrayArray37[Static300.anInt9743][local63][local65];
			local134 = local89 - local77;
			local142 = local121 + local77 - local89 * 2;
			local159 = local89 + Static583.anIntArrayArrayArray37[Static300.anInt9743][local63 + 2][local65] - local121 - local129;
			local59[local65] = local56 * (local56 * ((float) local142 + local56 * (float) local159) + (float) local134) + (float) local129;
		}
		Static522.anInt8849 = (int) local59[2] - Static22.anInt329 * 512;
		Static419.anInt7345 = (int) local59[0] - Static427.anInt7462 * 512;
		Static13.anInt232 = (int) local59[1] * -1;
		@Pc(211) float[] local211 = new float[3];
		local89 = Static209.anInt3820 * 2;
		for (local121 = 0; local121 < 3; local121++) {
			local129 = Static583.anIntArrayArrayArray37[Static138.anInt2851][local89][local121] * 3;
			local134 = Static583.anIntArrayArrayArray37[Static138.anInt2851][local89 + 1][local121] * 3;
			local142 = (Static583.anIntArrayArrayArray37[Static138.anInt2851][local89 + 2][local121] + Static583.anIntArrayArrayArray37[Static138.anInt2851][local89 + 2][local121] - Static583.anIntArrayArrayArray37[Static138.anInt2851][local89 + 3][local121]) * 3;
			local159 = Static583.anIntArrayArrayArray37[Static138.anInt2851][local89][local121];
			@Pc(286) int local286 = local134 - local129;
			@Pc(295) int local295 = local129 + local142 - local134 * 2;
			@Pc(314) int local314 = Static583.anIntArrayArrayArray37[Static138.anInt2851][local89 + 2][local121] + local134 - local142 - local159;
			local211[local121] = local56 * (local56 * ((float) local295 + local56 * (float) local314) + (float) local286) + (float) local159;
		}
		@Pc(347) float local347 = local211[0] - local59[0];
		@Pc(357) float local357 = (local211[1] - local59[1]) * -1.0F;
		@Pc(366) float local366 = local211[2] - local59[2];
		@Pc(376) double local376 = Math.sqrt((double) (local347 * local347 + local366 * local366));
		Static253.anInt4961 = (int) (Math.atan2((double) local357, local376) * 2607.5945876176133D) & 0x3FFF;
		Static35.anInt545 = (int) (-Math.atan2((double) local347, (double) local366) * 2607.5945876176133D) & 0x3FFF;
		Static330.anInt6250 = Static583.anIntArrayArrayArray37[Static300.anInt9743][local63][3] + (Static235.anInt4693 * (Static583.anIntArrayArrayArray37[Static300.anInt9743][local63 + 2][3] - Static583.anIntArrayArrayArray37[Static300.anInt9743][local63][3]) >> 16);
	}
}
