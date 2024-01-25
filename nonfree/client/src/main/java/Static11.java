import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ak", name = "v", descriptor = "Lclient!kp;")
	public static Class142 aClass142_1;

	@OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
	public static int anInt315;

	@OriginalMember(owner = "client!ak", name = "y", descriptor = "[I")
	public static final int[] anIntArray18 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIB)Z")
	public static boolean method295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(12) int local12 = arg0; local12 <= arg1; local12++) {
			for (@Pc(16) int local16 = arg3; local16 <= arg2; local16++) {
				if (arg4 == Static93.anIntArrayArray52[local12][local16] && Static315.anIntArrayArray171[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
