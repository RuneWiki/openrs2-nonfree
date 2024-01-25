import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!ut", name = "H", descriptor = "Lclient!hca;")
	public static Class125 aClass125_3;

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString119 = "";

	@OriginalMember(owner = "client!ut", name = "r", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_171 = new Class298(37, 7);

	@OriginalMember(owner = "client!ut", name = "jb", descriptor = "I")
	public static int anInt8827 = 0;

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZIIIIIB)V")
	public static void method7306(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static278.aClass3_Sub13_Sub1_1.anInt5153 != 0 && arg0 != 0 && Static407.anInt6912 < 50 && arg3 != -1) {
			Static567.aClass232Array1[Static407.anInt6912++] = new Class232((byte) 2, arg3, arg0, arg2, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)V")
	public static void method7319() {
		if (Static459.anInt7522 == -1 || Static86.anInt2159 == -1) {
			return;
		}
		@Pc(26) int local26 = Static454.anInt7435 + ((Static536.anInt8401 - Static454.anInt7435) * Static140.anInt7942 >> 16);
		Static140.anInt7942 += local26;
		if (Static140.anInt7942 >= 65535) {
			Static140.anInt7942 = 65535;
			if (Static269.aBoolean391) {
				Static100.aBoolean197 = false;
			} else {
				Static100.aBoolean197 = true;
			}
			Static269.aBoolean391 = true;
		} else {
			Static269.aBoolean391 = false;
			Static100.aBoolean197 = false;
		}
		@Pc(58) float local58 = (float) Static140.anInt7942 / 65535.0F;
		@Pc(61) float[] local61 = new float[3];
		@Pc(65) int local65 = Static266.anInt4987 * 2;
		@Pc(91) int local91;
		@Pc(124) int local124;
		@Pc(132) int local132;
		@Pc(137) int local137;
		@Pc(146) int local146;
		@Pc(163) int local163;
		for (@Pc(67) int local67 = 0; local67 < 3; local67++) {
			@Pc(79) int local79 = Static110.anIntArrayArrayArray6[Static459.anInt7522][local65][local67] * 3;
			local91 = Static110.anIntArrayArrayArray6[Static459.anInt7522][local65 + 1][local67] * 3;
			local124 = (Static110.anIntArrayArrayArray6[Static459.anInt7522][local65 + 2][local67] + Static110.anIntArrayArrayArray6[Static459.anInt7522][local65 + 2][local67] - Static110.anIntArrayArrayArray6[Static459.anInt7522][local65 - -3][local67]) * 3;
			local132 = Static110.anIntArrayArrayArray6[Static459.anInt7522][local65][local67];
			local137 = local91 - local79;
			local146 = local79 + local124 - local91 * 2;
			local163 = Static110.anIntArrayArrayArray6[Static459.anInt7522][local65 + 2][local67] + local91 - local124 - local132;
			local61[local67] = (float) local132 + local58 * ((float) local137 + local58 * ((float) local163 * local58 + (float) local146));
		}
		Static545.anInt8633 = (int) local61[1] * -1;
		Static233.anInt4431 = (int) local61[2] - Static463.anInt7588 * 512;
		Static421.anInt7061 = (int) local61[0] - Static529.anInt8344 * 512;
		@Pc(219) float[] local219 = new float[3];
		local91 = Static327.anInt5878 * 2;
		for (local124 = 0; local124 < 3; local124++) {
			local132 = Static110.anIntArrayArrayArray6[Static86.anInt2159][local91][local124] * 3;
			local137 = Static110.anIntArrayArrayArray6[Static86.anInt2159][local91 + 1][local124] * 3;
			local146 = (Static110.anIntArrayArrayArray6[Static86.anInt2159][local91 + 2][local124] + Static110.anIntArrayArrayArray6[Static86.anInt2159][local91 + 2][local124] - Static110.anIntArrayArrayArray6[Static86.anInt2159][local91 + 3][local124]) * 3;
			local163 = Static110.anIntArrayArrayArray6[Static86.anInt2159][local91][local124];
			@Pc(295) int local295 = local137 - local132;
			@Pc(303) int local303 = local146 + local132 - local137 * 2;
			@Pc(321) int local321 = local137 + Static110.anIntArrayArrayArray6[Static86.anInt2159][local91 + 2][local124] - local163 - local146;
			local219[local124] = local58 * ((float) local295 + ((float) local303 + local58 * (float) local321) * local58) + (float) local163;
		}
		@Pc(354) float local354 = local219[0] - local61[0];
		@Pc(365) float local365 = -1.0F * (local219[1] - local61[1]);
		@Pc(373) float local373 = local219[2] - local61[2];
		@Pc(388) double local388 = Math.sqrt((double) (local354 * local354 + local373 * local373));
		Static37.anInt878 = (int) (Math.atan2((double) local365, local388) * 2607.5945876176133D) & 0x3FFF;
		Static154.anInt3150 = (int) (-Math.atan2((double) local354, (double) local373) * 2607.5945876176133D) & 0x3FFF;
		Static68.anInt4065 = Static110.anIntArrayArrayArray6[Static459.anInt7522][local65][3] + (Static140.anInt7942 * (Static110.anIntArrayArrayArray6[Static459.anInt7522][local65 + 2][3] - Static110.anIntArrayArrayArray6[Static459.anInt7522][local65][3]) >> 16);
	}
}
