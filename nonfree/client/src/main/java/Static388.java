import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(BII)I")
	public static int method5517(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(42) int local42 = Static149.method2770(arg1 - 1, arg0 + -1) + Static149.method2770(arg1 - 1, arg0 - -1) + Static149.method2770(arg1 + 1, arg0 + -1) + Static149.method2770(arg1 + 1, arg0 + 1);
		@Pc(71) int local71 = Static149.method2770(arg1, arg0 - 1) + Static149.method2770(arg1, arg0 + 1) + Static149.method2770(arg1 - 1, arg0) + Static149.method2770(arg1 - -1, arg0);
		@Pc(84) int local84 = Static149.method2770(arg1, arg0);
		return local42 / 16 + local71 / 8 + local84 / 4;
	}
}
