import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!c", name = "d", descriptor = "Lclient!tm;")
	public static Class228 aClass228_5;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "Lclient!vb;")
	public static Class251 aClass251_9;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "Z")
	public static boolean aBoolean412 = false;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IBIIIIIII)V")
	public static void method4170(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static111.method1740(arg5)) {
			if (Static423.aClass229ArrayArray2[arg5] == null) {
				Static372.method5280(Static276.aClass229ArrayArray1[arg5], arg6, arg3, -1, arg1, arg0, arg7, arg2, arg4);
			} else {
				Static372.method5280(Static423.aClass229ArrayArray2[arg5], arg6, arg3, -1, arg1, arg0, arg7, arg2, arg4);
			}
		} else if (arg0 == -1) {
			for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
				Static204.aBooleanArray15[local20] = true;
			}
		} else {
			Static204.aBooleanArray15[arg0] = true;
		}
	}
}
