import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!s", name = "H", descriptor = "Lclient!ji;")
	public static Class124 aClass124_5;

	@OriginalMember(owner = "client!s", name = "M", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!s", name = "jb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_4 = null;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IB)Z")
	public static boolean method4609(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILclient!oa;Ljava/lang/String;Z)V")
	public static void method4619(@OriginalArg(1) Class16 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		@Pc(24) int local24 = Static453.aClass122_10.method2473(250, null, arg1);
		@Pc(33) int local33 = Static453.aClass122_10.method2471(arg1, 250, null) * 13;
		Static213.aClass128_22.NA(6, 6, local24 + 8, local33 + 4 + 4, -16777216, 0);
		Static213.aClass128_22.method3593(6, 6, local24 + 8, local33 + 4 + 4, -1, 0);
		arg0.method5481(1, -1, null, local33, null, 0, null, local24, 10, arg1, 10, -1, 0);
		Static113.method1580(6, local33 + 4 + 4, 6, local24 + 8);
		if (arg2) {
			Static213.aClass128_22.method3534();
		}
	}
}
