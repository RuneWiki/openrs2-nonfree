import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static252 {

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "J")
	public static final long aLong133 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static478.method7175(arg8)) {
			return;
		}
		if (Static583.aClass225ArrayArray2[arg8] == null) {
			Static69.method1178(Static343.aClass225ArrayArray1[arg8], -1, arg1, arg3, arg7, arg0, arg2, arg4, arg5, arg6);
		} else {
			Static69.method1178(Static583.aClass225ArrayArray2[arg8], -1, arg1, arg3, arg7, arg0, arg2, arg4, arg5, arg6);
		}
	}
}
