import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!km", name = "k", descriptor = "D")
	public static double aDouble12;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIII)I")
	public static int method4582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg2 & 0x3;
		if (local16 == 0) {
			return arg1;
		} else if (local16 == 1) {
			return arg0;
		} else if (local16 == 2) {
			return 4095 - arg1;
		} else {
			return 4095 - arg0;
		}
	}
}
