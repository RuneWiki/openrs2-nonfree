import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "B")
	public static byte aByte28;

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "J")
	public static long aLong101 = -1L;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2634(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg1; local7 <= arg0; local7++) {
			for (@Pc(11) int local11 = arg3; local11 <= arg4; local11++) {
				if (arg2 == Static53.anIntArrayArray5[local7][local11] && Static215.anIntArrayArray38[local7][local11] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
