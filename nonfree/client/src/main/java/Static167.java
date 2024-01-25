import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!fga", name = "H", descriptor = "Z")
	public static boolean aBoolean238 = true;

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lclient!ub;Z)I")
	public static int method2410(@OriginalArg(0) Class5_Sub23_Sub2 arg0) {
		@Pc(10) int local10 = arg0.method8550(2);
		@Pc(17) int local17;
		if (local10 == 0) {
			local17 = 0;
		} else if (local10 == 1) {
			local17 = arg0.method8550(5);
		} else if (local10 == 2) {
			local17 = arg0.method8550(8);
		} else {
			local17 = arg0.method8550(11);
		}
		return local17;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IZ)I")
	public static int method2411(@OriginalArg(1) boolean arg0) {
		@Pc(11) int local11 = Static659.anInt10597;
		if (local11 == 0) {
			return arg0 ? 0 : Static561.anInt9477;
		} else if (local11 == 1) {
			return Static561.anInt9477;
		} else if (local11 == 2) {
			return 0;
		} else {
			return 0;
		}
	}
}
