import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static511 {

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
	public static int anInt8548;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!tp;[[B)V")
	public static void method7192(@OriginalArg(1) Class275_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt9071; local7++) {
			Static48.method803();
			for (@Pc(13) int local13 = 0; local13 < Static228.anInt3704 >> 3; local13++) {
				for (@Pc(17) int local17 = 0; local17 < Static162.anInt2911 >> 3; local17++) {
					@Pc(27) int local27 = Static37.anIntArrayArrayArray1[local7][local13][local17];
					if (local27 != -1) {
						@Pc(37) int local37 = local27 >> 24 & 0x3;
						if (!arg0.aBoolean674 || local37 == 0) {
							@Pc(51) int local51 = local27 >> 1 & 0x3;
							@Pc(57) int local57 = local27 >> 14 & 0x3FF;
							@Pc(63) int local63 = local27 >> 3 & 0x7FF;
							@Pc(73) int local73 = local63 / 8 + (local57 / 8 << 8);
							for (@Pc(75) int local75 = 0; local75 < Static407.anIntArray620.length; local75++) {
								if (Static407.anIntArray620[local75] == local73 && arg1[local75] != null) {
									arg0.method7626(local37, (local63 & 0x7) * 8, Static230.aClass240Array1, local17 * 8, (local57 & 0x7) * 8, Static192.aClass95_4, local13 * 8, arg1[local75], local51, local7);
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
