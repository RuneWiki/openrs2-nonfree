import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!gh", name = "A", descriptor = "[I")
	public static final int[] anIntArray177 = new int[13];

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)I")
	public static int method2624(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12;
		if (arg1 > arg0) {
			local12 = arg0;
			arg0 = arg1;
			arg1 = local12;
		}
		while (arg1 != 0) {
			local12 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local12;
		}
		return arg0;
	}
}
