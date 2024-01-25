import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static248 {

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "[I")
	public static int[] anIntArray298;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "[I")
	public static final int[] anIntArray297 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)Z")
	public static boolean method3535(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x10000) != 0 | Static321.method4319(arg1, arg0) || Static280.method3889(arg1, arg0)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static318.method2926(arg0, arg1);
		}
	}
}
