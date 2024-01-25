import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static110 {

	@OriginalMember(owner = "client!ei", name = "W", descriptor = "Lclient!ak;")
	public static final Class3_Sub2 aClass3_Sub2_1 = new Class3_Sub2(0, 0);

	@OriginalMember(owner = "client!ei", name = "X", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_27 = new Class158(78, 0);

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIIIIBI)V")
	public static void method2116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (!Static62.method7109(arg7)) {
			return;
		}
		if (Static107.aClass245ArrayArray1[arg7] == null) {
			Static63.method1284(Static459.aClass245ArrayArray2[arg7], -1, arg0, arg1, arg8, arg6, arg2, arg5, arg3, arg4);
		} else {
			Static63.method1284(Static107.aClass245ArrayArray1[arg7], -1, arg0, arg1, arg8, arg6, arg2, arg5, arg3, arg4);
		}
	}
}
