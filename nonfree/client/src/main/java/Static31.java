import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!ch", name = "W", descriptor = "I")
	public static int anInt598;

	@OriginalMember(owner = "client!ch", name = "Y", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
	public static int anInt594 = 1;

	@OriginalMember(owner = "client!ch", name = "V", descriptor = "Lclient!oj;")
	public static Class84 aClass84_12 = new Class84(64);

	@OriginalMember(owner = "client!ch", name = "X", descriptor = "Lclient!hh;")
	public static Class50 aClass50_224 = Static186.method3527(" <col=00ff80>");

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZLclient!qh;)Z")
	public static boolean method461(@OriginalArg(1) Class93 arg0) {
		if (arg0.anIntArray388 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray388.length; local17++) {
			@Pc(24) int local24 = Static233.method3519(arg0, local17);
			@Pc(29) int local29 = arg0.anIntArray399[local17];
			if (arg0.anIntArray388[local17] == 2) {
				if (local29 <= local24) {
					return false;
				}
			} else if (arg0.anIntArray388[local17] == 3) {
				if (local29 >= local24) {
					return false;
				}
			} else if (arg0.anIntArray388[local17] == 4) {
				if (local24 == local29) {
					return false;
				}
			} else if (local29 != local24) {
				return false;
			}
		}
		return true;
	}
}
