import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static568 {

	@OriginalMember(owner = "client!ub", name = "E", descriptor = "I")
	public static int anInt9305 = 0;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(III)I")
	public static int method7908(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10;
		if (arg1 > arg0) {
			local10 = arg0;
			arg0 = arg1;
			arg1 = local10;
		}
		while (arg1 != 0) {
			local10 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local10;
		}
		return arg0;
	}
}
