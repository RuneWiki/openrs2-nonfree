import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
	public static int anInt751;

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "Lclient!afa;")
	public static Class12 aClass12_1;

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "Lclient!wu;")
	public static Class384 aClass384_22;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "[I")
	public static final int[] anIntArray63 = new int[5];

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIIIIIII)V")
	public static void method770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (!Static567.method8019(arg10)) {
			return;
		}
		if (Static591.aClass357ArrayArray2[arg10] == null) {
			Static74.method1229(Static441.aClass357ArrayArray1[arg10], -1, arg2, arg5, arg8, arg9, arg3, arg4, arg0, arg1, arg6, arg7);
		} else {
			Static74.method1229(Static591.aClass357ArrayArray2[arg10], -1, arg2, arg5, arg8, arg9, arg3, arg4, arg0, arg1, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method771(@OriginalArg(0) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static117.aStringArray10.length; local12++) {
			if (Static117.aStringArray10[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}
}
