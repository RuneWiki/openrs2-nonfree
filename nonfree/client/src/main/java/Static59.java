import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static59 {

	@OriginalMember(owner = "client!cs", name = "E", descriptor = "I")
	public static int anInt1088;

	@OriginalMember(owner = "client!cs", name = "Q", descriptor = "I")
	public static int anInt1090;

	@OriginalMember(owner = "client!cs", name = "R", descriptor = "[Lclient!l;")
	public static Class57[] aClass57Array3;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static112.method2034(arg3)) {
			return;
		}
		if (Static30.aClass247ArrayArray1[arg3] == null) {
			Static53.method901(Static297.aClass247ArrayArray2[arg3], -1, arg0, arg4, arg2, arg6, arg5, arg1, arg8, arg7);
		} else {
			Static53.method901(Static30.aClass247ArrayArray1[arg3], -1, arg0, arg4, arg2, arg6, arg5, arg1, arg8, arg7);
		}
	}
}
