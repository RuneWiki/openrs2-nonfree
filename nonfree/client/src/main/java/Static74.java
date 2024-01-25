import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!cfa", name = "e", descriptor = "Lclient!kc;")
	public static Class191 aClass191_1;

	@OriginalMember(owner = "client!cfa", name = "j", descriptor = "Lclient!hh;")
	public static Class6 aClass6_6;

	@OriginalMember(owner = "client!cfa", name = "f", descriptor = "Z")
	public static boolean aBoolean102 = true;

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIIIIIIZIIII)V")
	public static void method1277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (!Static185.method2900(arg7)) {
			return;
		}
		if (Static78.aClass265ArrayArray1[arg7] == null) {
			Static86.method1372(Static270.aClass265ArrayArray2[arg7], -1, arg1, arg10, arg0, arg8, arg4, arg6, arg2, arg9, arg5, arg3);
		} else {
			Static86.method1372(Static78.aClass265ArrayArray1[arg7], -1, arg1, arg10, arg0, arg8, arg4, arg6, arg2, arg9, arg5, arg3);
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ILclient!uq;IZ)Lclient!gl;")
	public static Class134 method1278(@OriginalArg(0) int arg0, @OriginalArg(1) Class362 arg1) {
		@Pc(14) byte[] local14 = arg1.method8368(arg0, 0);
		return local14 == null ? null : new Class134(local14);
	}
}
