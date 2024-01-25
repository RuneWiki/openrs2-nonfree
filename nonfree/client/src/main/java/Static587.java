import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static587 {

	@OriginalMember(owner = "client!uw", name = "c", descriptor = "[I")
	public static final int[] anIntArray594 = new int[6];

	@OriginalMember(owner = "client!uw", name = "i", descriptor = "[I")
	public static final int[] anIntArray595 = new int[32];

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIII)Z")
	public static boolean method8066(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(11) Interface18 local11 = (Interface18) Static639.method8624(arg2, arg0, arg1);
		if (local11 != null) {
			local5 = Static261.method4864(local11) & true;
		}
		local11 = (Interface18) Static17.method258(arg2, arg0, arg1, op.class);
		if (local11 != null) {
			local5 &= Static261.method4864(local11);
		}
		local11 = (Interface18) Static439.method6676(arg2, arg0, arg1);
		if (local11 != null) {
			local5 &= Static261.method4864(local11);
		}
		return local5;
	}
}
