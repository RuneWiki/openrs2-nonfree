import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "Lclient!au;")
	public static Class21 aClass21_1;

	@OriginalMember(owner = "client!jv", name = "e", descriptor = "Lclient!oa;")
	public static Class121 aClass121_7;

	@OriginalMember(owner = "client!jv", name = "d", descriptor = "I")
	public static int anInt4088 = 0;

	@OriginalMember(owner = "client!jv", name = "g", descriptor = "Z")
	public static boolean aBoolean264 = false;

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IJZILjava/lang/String;IILjava/lang/String;IZZ)V")
	public static void method3528(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) boolean arg9) {
		if (!Static330.aBoolean415 && Static374.anInt6451 < 500) {
			@Pc(19) int local19 = arg4 == -1 ? Static278.anInt6564 : arg4;
			@Pc(37) Class6_Sub48 local37 = new Class6_Sub48(arg3, arg6, local19, arg5, arg7, arg1, arg2, arg0, arg8, arg9);
			Static445.aClass275_162.method6370(local37);
			Static374.anInt6451++;
		}
	}
}
