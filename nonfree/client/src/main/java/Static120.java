import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static120 {

	@OriginalMember(owner = "client!eca", name = "e", descriptor = "Lclient!qi;")
	public static Class278 aClass278_1;

	@OriginalMember(owner = "client!eca", name = "d", descriptor = "Lclient!kt;")
	public static final Class178 aClass178_4 = new Class178(4);

	@OriginalMember(owner = "client!eca", name = "i", descriptor = "I")
	public static int anInt3032 = 0;

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIIIIIIIIIII)V")
	public static void method2564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (!Static156.method3070(arg2)) {
			return;
		}
		if (Static250.aClass302ArrayArray1[arg2] == null) {
			Static75.method2139(Static299.aClass302ArrayArray2[arg2], -1, arg10, arg1, arg3, arg4, arg5, arg9, arg6, arg7, arg0, arg8);
		} else {
			Static75.method2139(Static250.aClass302ArrayArray1[arg2], -1, arg10, arg1, arg3, arg4, arg5, arg9, arg6, arg7, arg0, arg8);
		}
	}
}
