import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static512 {

	@OriginalMember(owner = "client!tm", name = "s", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_161 = new Class298(71, 7);

	@OriginalMember(owner = "client!tm", name = "z", descriptor = "[S")
	public static final short[] aShortArray262 = new short[] { 50, 45, 30, 9, 23, 4, 21, 8 };

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IBIIIIIIII)V")
	public static void method6854(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static87.method1968(arg8)) {
			return;
		}
		if (Static267.aClass203ArrayArray2[arg8] == null) {
			Static69.method1642(Static59.aClass203ArrayArray3[arg8], -1, arg2, arg3, arg0, arg1, arg5, arg4, arg7, arg6);
		} else {
			Static69.method1642(Static267.aClass203ArrayArray2[arg8], -1, arg2, arg3, arg0, arg1, arg5, arg4, arg7, arg6);
		}
	}
}
