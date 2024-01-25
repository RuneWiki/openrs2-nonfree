import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!gj", name = "eb", descriptor = "I")
	public static int anInt3507;

	@OriginalMember(owner = "client!gj", name = "tb", descriptor = "D")
	public static double aDouble5;

	@OriginalMember(owner = "client!gj", name = "R", descriptor = "[[I")
	public static final int[][] anIntArrayArray19 = new int[128][128];

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZIII)Z")
	public static boolean method3028(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Interface2 local9 = (Interface2) Static380.method5991(arg1, arg2, arg0);
		@Pc(11) boolean local11 = true;
		if (local9 != null) {
			local11 = Static381.method6011(local9) & true;
		}
		local9 = (Interface2) Static137.method2371(arg1, arg2, arg0, bda.class);
		if (local9 != null) {
			local11 &= Static381.method6011(local9);
		}
		local9 = (Interface2) Static279.method4563(arg1, arg2, arg0);
		if (local9 != null) {
			local11 &= Static381.method6011(local9);
		}
		return local11;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILjava/lang/Object;Z)[B")
	public static byte[] method3030(@OriginalArg(1) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return arg1 ? Static465.method6888(local13) : local13;
		} else if (arg0 instanceof Class192) {
			@Pc(27) Class192 local27 = (Class192) arg0;
			return local27.method7232();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
