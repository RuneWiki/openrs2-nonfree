import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "F")
	public static float aFloat7;

	@OriginalMember(owner = "client!bda", name = "d", descriptor = "Lclient!kr;")
	public static Class171 aClass171_17;

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "([[BLclient!jda;I)V")
	public static void method795(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class149_Sub1 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.anInt4443; local7++) {
			Static63.method1142();
			for (@Pc(13) int local13 = 0; local13 < Static459.anInt7799 >> 3; local13++) {
				for (@Pc(17) int local17 = 0; local17 < Static482.anInt7990 >> 3; local17++) {
					@Pc(27) int local27 = Static178.anIntArrayArrayArray2[local7][local13][local17];
					if (local27 != -1) {
						@Pc(36) int local36 = local27 >> 24 & 0x3;
						if (!arg1.aBoolean310 || local36 == 0) {
							@Pc(50) int local50 = local27 >> 1 & 0x3;
							@Pc(56) int local56 = local27 >> 14 & 0x3FF;
							@Pc(62) int local62 = local27 >> 3 & 0x7FF;
							@Pc(72) int local72 = local62 / 8 + (local56 / 8 << 8);
							for (@Pc(74) int local74 = 0; local74 < Static9.anIntArray23.length; local74++) {
								if (Static9.anIntArray23[local74] == local72 && arg0[local74] != null) {
									arg1.method3880((local62 & 0x7) * 8, local17 * 8, arg0[local74], local50, Static513.aClass122_10, (local56 & 0x7) * 8, local36, Static86.aClass91Array1, local7, local13 * 8);
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
