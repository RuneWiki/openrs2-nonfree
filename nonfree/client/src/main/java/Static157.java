import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static157 {

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "S")
	public static short aShort35 = 1;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!bo;III[IZ)Lclient!gk;")
	public static Class65_Sub3_Sub1 method2350(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg0.aBoolean78 || Static74.method1330(arg2) && Static74.method1330(arg1)) {
			return new Class65_Sub3_Sub1(arg0, 3553, arg2, arg1, false, arg3);
		} else if (arg0.aBoolean72) {
			return new Class65_Sub3_Sub1(arg0, 34037, arg2, arg1, false, arg3);
		} else {
			return new Class65_Sub3_Sub1(arg0, arg2, arg1, Static316.method4530(arg2), Static316.method4530(arg1), arg3);
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BII)Z")
	public static boolean method2351(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x10000) != 0 | Static336.method4750(arg0, arg1) || Static348.method4892(arg1, arg0)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static7.method161(arg1, arg0);
		}
	}
}
