import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static531 {

	@OriginalMember(owner = "client!su", name = "s", descriptor = "[Lclient!pia;")
	public static final Class267[] aClass267Array2 = new Class267[14];

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIIIIIIIIII)V")
	public static void method7701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (!Static64.method1061(arg2)) {
			return;
		}
		if (Static69.aClass344ArrayArray1[arg2] == null) {
			Static76.method1322(Static319.aClass344ArrayArray2[arg2], -1, arg8, arg5, arg0, arg10, arg6, arg4, arg9, arg3, arg1, arg7);
		} else {
			Static76.method1322(Static69.aClass344ArrayArray1[arg2], -1, arg8, arg5, arg0, arg10, arg6, arg4, arg9, arg3, arg1, arg7);
		}
	}
}
