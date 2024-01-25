import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static489 {

	@OriginalMember(owner = "client!um", name = "l", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_86 = new Class243(11, 7);

	@OriginalMember(owner = "client!um", name = "K", descriptor = "Lclient!np;")
	public static final Class138 aClass138_1 = Static120.method2320();

	@OriginalMember(owner = "client!um", name = "O", descriptor = "I")
	public static int anInt8652 = 0;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "([[BBLclient!vc;)V")
	public static void method7255(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class200_Sub1 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.anInt8825; local7++) {
			Static491.method6549();
			for (@Pc(13) int local13 = 0; local13 < Static363.anInt1158 >> 3; local13++) {
				for (@Pc(17) int local17 = 0; local17 < Static511.anInt8889 >> 3; local17++) {
					@Pc(27) int local27 = Static535.anIntArrayArrayArray21[local7][local13][local17];
					if (local27 != -1) {
						@Pc(36) int local36 = local27 >> 24 & 0x3;
						if (!arg1.aBoolean639 || local36 == 0) {
							@Pc(50) int local50 = local27 >> 1 & 0x3;
							@Pc(56) int local56 = local27 >> 14 & 0x3FF;
							@Pc(62) int local62 = local27 >> 3 & 0x7FF;
							@Pc(72) int local72 = (local56 / 8 << 8) + local62 / 8;
							for (@Pc(74) int local74 = 0; local74 < Static444.anIntArray613.length; local74++) {
								if (Static444.anIntArray613[local74] == local72 && arg0[local74] != null) {
									arg1.method7409(local36, arg0[local74], Static207.aClass99Array1, (local56 & 0x7) * 8, local7, Static103.aClass39_3, local50, local17 * 8, (local62 & 0x7) * 8, local13 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
