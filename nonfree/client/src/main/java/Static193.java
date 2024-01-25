import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "Lclient!nq;")
	public static Class144 aClass144_55;

	@OriginalMember(owner = "client!mi", name = "q", descriptor = "[I")
	public static int[] anIntArray304;

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "Z")
	public static boolean aBoolean249 = true;

	@OriginalMember(owner = "client!mi", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray30 = new String[200];

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_37 = new Class26(256);

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "Z")
	public static boolean aBoolean250 = false;

	@OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
	public static int anInt3961 = -1;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
	public static void method3528() {
		if (Static22.anInt416 == -1 || Static204.anInt4169 == -1) {
			return;
		}
		@Pc(23) int local23 = (Static274.anInt5510 * (Static200.anInt4121 - Static207.anInt4247) >> 16) + Static207.anInt4247;
		Static274.anInt5510 += local23;
		if (Static274.anInt5510 < 65535) {
			Static180.aBoolean311 = false;
			Static226.aBoolean306 = false;
		} else {
			Static274.anInt5510 = 65535;
			if (Static226.aBoolean306) {
				Static180.aBoolean311 = false;
			} else {
				Static180.aBoolean311 = true;
			}
			Static226.aBoolean306 = true;
		}
		@Pc(53) float local53 = (float) Static274.anInt5510 / 65535.0F;
		@Pc(56) float[] local56 = new float[3];
		@Pc(60) int local60 = Static199.anInt4036 * 2;
		@Pc(86) int local86;
		@Pc(119) int local119;
		@Pc(132) int local132;
		@Pc(142) int local142;
		@Pc(160) int local160;
		for (@Pc(62) int local62 = 0; local62 < 3; local62++) {
			@Pc(74) int local74 = Static131.anIntArrayArrayArray10[Static22.anInt416][local60][local62] * 3;
			local86 = Static131.anIntArrayArrayArray10[Static22.anInt416][local60 + 1][local62] * 3;
			local119 = (Static131.anIntArrayArrayArray10[Static22.anInt416][local60 + 2][local62] + Static131.anIntArrayArrayArray10[Static22.anInt416][local60 + 2][local62] - Static131.anIntArrayArrayArray10[Static22.anInt416][local60 + 3][local62]) * 3;
			@Pc(127) int local127 = Static131.anIntArrayArrayArray10[Static22.anInt416][local60][local62];
			local132 = local86 - local74;
			local142 = local74 + local119 - local86 * 2;
			local160 = Static131.anIntArrayArrayArray10[Static22.anInt416][local60 + 2][local62] + local86 - local127 - local119;
			local56[local62] = (float) local127 + (local53 * ((float) local160 * local53 + (float) local142) + (float) local132) * local53;
		}
		Static316.anInt6169 = (int) local56[2] - Static169.anInt6312 * 128;
		Static190.anInt3870 = (int) local56[0] - Static182.anInt3662 * 128;
		Static86.anInt1541 = (int) local56[1] * -1;
		@Pc(213) float[] local213 = new float[3];
		local86 = Static144.anInt2608 * 2;
		for (local119 = 0; local119 < 3; local119++) {
			local132 = Static131.anIntArrayArrayArray10[Static204.anInt4169][local86][local119] * 3;
			local142 = Static131.anIntArrayArrayArray10[Static204.anInt4169][local86 + 1][local119] * 3;
			local160 = (Static131.anIntArrayArrayArray10[Static204.anInt4169][local86 + 2][local119] + Static131.anIntArrayArrayArray10[Static204.anInt4169][local86 + 2][local119] - Static131.anIntArrayArrayArray10[Static204.anInt4169][local86 + 3][local119]) * 3;
			@Pc(292) int local292 = Static131.anIntArrayArrayArray10[Static204.anInt4169][local86][local119];
			@Pc(297) int local297 = local142 - local132;
			@Pc(306) int local306 = local132 + local160 - local142 * 2;
			@Pc(323) int local323 = Static131.anIntArrayArrayArray10[Static204.anInt4169][local86 + 2][local119] + local142 - local292 - local160;
			local213[local119] = (float) local292 + local53 * (local53 * ((float) local306 + (float) local323 * local53) + (float) local297);
		}
		@Pc(356) float local356 = local213[0] - local56[0];
		@Pc(367) float local367 = -1.0F * (local213[1] - local56[1]);
		@Pc(376) float local376 = local213[2] - local56[2];
		@Pc(386) double local386 = Math.sqrt((double) (local356 * local356 + local376 * local376));
		Static184.anInt3721 = (int) (Math.atan2((double) local367, local386) * 2607.5945876176133D) & 0x3FFF;
		Static308.anInt6050 = (int) (-Math.atan2((double) local356, (double) local376) * 2607.5945876176133D) & 0x3FFF;
		Static157.anInt3004 = (Static274.anInt5510 * (Static131.anIntArrayArrayArray10[Static22.anInt416][local60 + 2][3] - Static131.anIntArrayArrayArray10[Static22.anInt416][local60][3]) >> 16) + Static131.anIntArrayArrayArray10[Static22.anInt416][local60][3];
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V")
	public static void method3530() {
		@Pc(1) Class54 local1 = Static72.aClass54_1;
		synchronized (Static72.aClass54_1) {
			Static72.aClass54_1.method929();
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!nq;ILclient!ja;)V")
	public static void method3531(@OriginalArg(0) Class144 arg0, @OriginalArg(2) Interface2 arg1) {
		aClass144_55 = arg0;
		Static181.anInterface2_3 = arg1;
	}
}
