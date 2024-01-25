import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method3780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg0; local12 <= arg3; local12++) {
			for (@Pc(16) int local16 = arg2; local16 <= arg1; local16++) {
				if (arg4 == Static462.anIntArrayArray59[local12][local16] && Static180.anIntArrayArray23[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
