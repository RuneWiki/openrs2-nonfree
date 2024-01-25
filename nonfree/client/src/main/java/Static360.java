import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
	public static int anInt5869;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIBIII)Z")
	public static boolean method4655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg1; local12 <= arg0; local12++) {
			for (@Pc(16) int local16 = arg2; local16 <= arg4; local16++) {
				if (Static49.anIntArrayArray5[local12][local16] == arg3 && Static179.anIntArrayArray19[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
