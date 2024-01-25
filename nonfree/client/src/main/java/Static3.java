import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "M", descriptor = "[I")
	public static int[] anIntArray7;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII)I")
	public static int method129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg0 & 0x3;
		if (local15 == 0) {
			return arg2;
		} else if (local15 == 1) {
			return 1023 - arg1;
		} else if (local15 == 2) {
			return 1023 - arg2;
		} else {
			return arg1;
		}
	}
}
