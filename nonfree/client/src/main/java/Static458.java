import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static458 {

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BII)Z")
	public static boolean method6863(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static225.method4080(arg1, arg0) || Static318.method4379(arg0, arg1);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII)V")
	public static void method6864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1002) {
			Static60.method1224(Static135.aClass91_2, arg0, arg2);
		} else if (arg1 == 1001) {
			Static60.method1224(Static171.aClass91_3, arg0, arg2);
		} else if (arg1 == 1007) {
			Static60.method1224(Static302.aClass91_6, arg0, arg2);
		} else if (arg1 == 1009) {
			Static60.method1224(Static221.aClass91_4, arg0, arg2);
		} else if (arg1 == 1011) {
			Static60.method1224(Static424.aClass91_8, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)Z")
	public static boolean method6865(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static440.method6638(arg1, arg0) | (arg1 & 0x70000) != 0 || Static490.method7167(arg1, arg0);
	}
}
