import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static566 {

	@OriginalMember(owner = "client!td", name = "G", descriptor = "Lclient!pd;")
	public static Class276 aClass276_4;

	@OriginalMember(owner = "client!td", name = "I", descriptor = "I")
	public static int anInt9812 = 0;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method8588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg2; local7 <= arg1; local7++) {
			for (@Pc(16) int local16 = arg4; local16 <= arg0; local16++) {
				if (Static236.anIntArrayArray14[local7][local16] == arg3 && Static23.anIntArrayArray6[local7][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!td", name = "h", descriptor = "(I)[Lclient!mp;")
	public static Class236[] method8589() {
		return new Class236[] { Static343.aClass236_5, Static379.aClass236_8, Static295.aClass236_2 };
	}
}
