import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
	public static int anInt5701;

	@OriginalMember(owner = "client!mc", name = "w", descriptor = "Lclient!hh;")
	public static Class119 aClass119_1;

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
	public static int anInt5704 = 0;

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray22 = new String[5];

	@OriginalMember(owner = "client!mc", name = "v", descriptor = "[I")
	public static final int[] anIntArray404 = new int[5];

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V")
	public static void method4944() {
		if (Static547.anInt9478 == -1 || Static341.anInt6385 == -1) {
			return;
		}
		@Pc(23) int local23 = Static107.anInt2484 + (Static332.anInt6268 * (Static266.anInt5159 - Static107.anInt2484) >> 16);
		Static332.anInt6268 += local23;
		if (Static332.anInt6268 >= 65535) {
			if (Static398.aBoolean463) {
				Static134.aBoolean202 = false;
			} else {
				Static134.aBoolean202 = true;
			}
			Static332.anInt6268 = 65535;
			Static398.aBoolean463 = true;
		} else {
			Static134.aBoolean202 = false;
			Static398.aBoolean463 = false;
		}
		@Pc(53) float local53 = (float) Static332.anInt6268 / 65535.0F;
		@Pc(56) float[] local56 = new float[3];
		@Pc(60) int local60 = Static274.anInt5374 * 2;
		@Pc(85) int local85;
		@Pc(119) int local119;
		@Pc(127) int local127;
		@Pc(132) int local132;
		@Pc(142) int local142;
		@Pc(160) int local160;
		for (@Pc(62) int local62 = 0; local62 < 3; local62++) {
			@Pc(73) int local73 = Static481.anIntArrayArrayArray20[Static547.anInt9478][local60][local62] * 3;
			local85 = Static481.anIntArrayArrayArray20[Static547.anInt9478][local60 + 1][local62] * 3;
			local119 = (Static481.anIntArrayArrayArray20[Static547.anInt9478][local60 + 2][local62] + Static481.anIntArrayArrayArray20[Static547.anInt9478][local60 + 2][local62] - Static481.anIntArrayArrayArray20[Static547.anInt9478][local60 + 3][local62]) * 3;
			local127 = Static481.anIntArrayArrayArray20[Static547.anInt9478][local60][local62];
			local132 = local85 - local73;
			local142 = local73 + local119 - local85 * 2;
			local160 = Static481.anIntArrayArrayArray20[Static547.anInt9478][local60 + 2][local62] + local85 - local119 - local127;
			local56[local62] = ((float) local132 + ((float) local160 * local53 + (float) local142) * local53) * local53 + (float) local127;
		}
		Static308.anInt5918 = (int) local56[0] - Static324.anInt6132 * 128;
		Static347.anInt6404 = (int) local56[2] - Static517.anInt8716 * 128;
		Static520.anInt8842 = (int) local56[1] * -1;
		@Pc(215) float[] local215 = new float[3];
		local85 = Static479.anInt8171 * 2;
		for (local119 = 0; local119 < 3; local119++) {
			local127 = Static481.anIntArrayArrayArray20[Static341.anInt6385][local85][local119] * 3;
			local132 = Static481.anIntArrayArrayArray20[Static341.anInt6385][local85 + 1][local119] * 3;
			local142 = (Static481.anIntArrayArrayArray20[Static341.anInt6385][local85 + 2][local119] + Static481.anIntArrayArrayArray20[Static341.anInt6385][local85 + 2][local119] - Static481.anIntArrayArrayArray20[Static341.anInt6385][local85 + 3][local119]) * 3;
			local160 = Static481.anIntArrayArrayArray20[Static341.anInt6385][local85][local119];
			@Pc(289) int local289 = local132 - local127;
			@Pc(298) int local298 = local142 + local127 - local132 * 2;
			@Pc(315) int local315 = local132 + Static481.anIntArrayArrayArray20[Static341.anInt6385][local85 + 2][local119] - local142 - local160;
			local215[local119] = local53 * ((float) local289 + (local53 * (float) local315 + (float) local298) * local53) + (float) local160;
		}
		@Pc(348) float local348 = local215[0] - local56[0];
		@Pc(358) float local358 = -1.0F * (local215[1] - local56[1]);
		@Pc(366) float local366 = local215[2] - local56[2];
		@Pc(376) double local376 = Math.sqrt((double) (local348 * local348 + local366 * local366));
		Static411.anInt7178 = (int) (Math.atan2((double) local358, local376) * 2607.5945876176133D) & 0x3FFF;
		Static339.anInt6337 = (int) (-Math.atan2((double) local348, (double) local366) * 2607.5945876176133D) & 0x3FFF;
		Static304.anInt5875 = (Static332.anInt6268 * (Static481.anIntArrayArrayArray20[Static547.anInt9478][local60 + 2][3] - Static481.anIntArrayArrayArray20[Static547.anInt9478][local60][3]) >> 16) + Static481.anIntArrayArrayArray20[Static547.anInt9478][local60][3];
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!qa;ILclient!ls;)I")
	public static int method4945(@OriginalArg(0) Class9 arg0, @OriginalArg(2) Class184 arg1) {
		if (arg1.anInt5600 != -1) {
			return arg1.anInt5600;
		}
		if (arg1.anInt5595 != -1) {
			@Pc(28) Class175 local28 = arg0.anInterface8_13.method7085(arg0.method7640() ? arg1.anInt5595 : arg1.anInt5604);
			if (!local28.aBoolean356) {
				return local28.aShort81;
			}
		}
		return arg1.anInt5596;
	}
}
