import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!oi", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString182 = "wave:";

	@OriginalMember(owner = "client!oi", name = "J", descriptor = "[[B")
	public static final byte[][] aByteArrayArray14 = new byte[1000][];

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIII)Z")
	public static boolean method4105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static210.method3848(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static117.method2113(local10 + 1, Static7.aClass41Array1[arg0].method5434(arg1, arg2) + arg3, local14 + 1) && Static117.method2113(local10 + 128 - 1, Static7.aClass41Array1[arg0].method5434(arg1 + 1, arg2) + arg3, local14 + 1) && Static117.method2113(local10 + 128 - 1, Static7.aClass41Array1[arg0].method5434(arg1 + 1, arg2 + 1) + arg3, local14 + 128 - 1) && Static117.method2113(local10 + 1, Static7.aClass41Array1[arg0].method5434(arg1, arg2 + 1) + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IBIIIIIIII)V")
	public static void method4106(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static198.method3725(arg2)) {
			Static47.method1082(Static314.aClass177ArrayArray1[arg2], -1, arg3, arg8, arg5, arg1, arg7, arg4, arg6, arg0);
		}
	}
}
