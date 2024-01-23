import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!u", name = "v", descriptor = "Lclient!i;")
	public static Class41 aClass41_1040 = Static184.method2923("gr-Un:");

	@OriginalMember(owner = "client!u", name = "C", descriptor = "I")
	public static int anInt3917 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!u", name = "tb", descriptor = "Lclient!i;")
	private static Class41 aClass41_1042 = Static184.method2923("Login");

	@OriginalMember(owner = "client!u", name = "hb", descriptor = "Lclient!i;")
	public static Class41 aClass41_1041 = aClass41_1042;

	@OriginalMember(owner = "client!u", name = "yb", descriptor = "Lclient!i;")
	public static Class41 aClass41_1043 = null;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "([BI)V")
	public static void method2721(@OriginalArg(0) byte[] arg0) {
		@Pc(15) int local15 = 0;
		while (true) {
			while (local15 < arg0.length) {
				@Pc(28) int local28 = (arg0[local15++] & 0xFF) * 64 - Static15.anInt422;
				@Pc(40) int local40 = (arg0[local15++] & 0xFF) * 64 - Static105.anInt2549;
				@Pc(79) byte local79;
				@Pc(58) int local58;
				if (local28 > 0 && local40 > 0 && local28 + 64 < Static95.anInt2353 && Static40.anInt1214 > local40 + 64) {
					local58 = local28 >> 6;
					@Pc(66) int local66 = Static40.anInt1214 - local40 - 1 >> 6;
					for (@Pc(68) int local68 = 0; local68 < 64; local68++) {
						for (@Pc(72) int local72 = -64; local72 < 0; local72++) {
							local79 = arg0[local15++];
							if (local79 != 0) {
								if (Static184.aByteArrayArrayArray10[local58][local66] == null) {
									Static184.aByteArrayArrayArray10[local58][local66] = new byte[4096];
								}
								Static184.aByteArrayArrayArray10[local58][local66][(-(local72 + 1) << 6) + local68] = local79;
								@Pc(118) byte local118 = arg0[local15++];
								if (Static195.aByteArrayArrayArray12[local58][local66] == null) {
									Static195.aByteArrayArrayArray12[local58][local66] = new byte[4096];
								}
								Static195.aByteArrayArrayArray12[local58][local66][(-(local72 + 1) << 6) + local68] = local118;
							}
						}
					}
				} else {
					for (local58 = -4096; local58 < 0; local58++) {
						local79 = arg0[local15++];
						if (local79 != 0) {
							local15++;
						}
					}
				}
			}
			return;
		}
	}
}
