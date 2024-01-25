import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!ru", name = "n", descriptor = "Lclient!dm;")
	public static Class62 aClass62_1;

	@OriginalMember(owner = "client!ru", name = "o", descriptor = "[I")
	public static final int[] anIntArray674 = new int[1];

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIII)Z")
	public static boolean method6553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Interface15 local9 = (Interface15) Static542.method7740(arg1, arg0, arg2);
		@Pc(11) boolean local11 = true;
		if (local9 != null) {
			local11 = Static454.method6836(local9) & true;
		}
		local9 = (Interface15) Static420.method6482(arg1, arg0, arg2, qn.class);
		if (local9 != null) {
			local11 &= Static454.method6836(local9);
		}
		local9 = (Interface15) Static72.method1464(arg1, arg0, arg2);
		if (local9 != null) {
			local11 &= Static454.method6836(local9);
		}
		return local11;
	}
}
