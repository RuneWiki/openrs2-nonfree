import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!jp", name = "B", descriptor = "Lclient!xa;")
	public static Class4 aClass4_12;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BIIIII)Z")
	public static boolean method3495(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg2; local12 <= arg3; local12++) {
			for (@Pc(16) int local16 = arg4; local16 <= arg1; local16++) {
				if (arg0 == Static56.anIntArrayArray8[local12][local16] && Static236.anIntArrayArray50[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
