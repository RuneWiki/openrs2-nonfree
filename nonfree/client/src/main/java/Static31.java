import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!av", name = "p", descriptor = "I")
	public static int anInt753 = 0;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "([[BLclient!cc;I)V")
	public static void method658(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class49_Sub1 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.anInt1366; local7++) {
			Static333.method4737();
			for (@Pc(21) int local21 = 0; local21 < Static98.anInt361 >> 3; local21++) {
				for (@Pc(25) int local25 = 0; local25 < Static438.anInt7120 >> 3; local25++) {
					@Pc(35) int local35 = Static63.anIntArrayArrayArray7[local7][local21][local25];
					if (local35 != -1) {
						@Pc(45) int local45 = local35 >> 24 & 0x3;
						if (!arg1.aBoolean98 || local45 == 0) {
							@Pc(59) int local59 = local35 >> 1 & 0x3;
							@Pc(65) int local65 = local35 >> 14 & 0x3FF;
							@Pc(71) int local71 = local35 >> 3 & 0x7FF;
							@Pc(81) int local81 = local71 / 8 + (local65 / 8 << 8);
							for (@Pc(83) int local83 = 0; local83 < Static448.anIntArray394.length; local83++) {
								if (local81 == Static448.anIntArray394[local83] && arg0[local83] != null) {
									arg1.method1224((local71 & 0x7) * 8, local21 * 8, arg0[local83], Static119.aClass95_4, Static609.aClass110Array1, local25 * 8, local7, local59, (local65 & 0x7) * 8, local45);
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
