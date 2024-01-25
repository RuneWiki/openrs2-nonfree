import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static406 {

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIILclient!nm;II)Lclient!up;")
	public static Class15_Sub2_Sub1 method5043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class164_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.aBoolean407 || Static196.method2844(arg4) && Static196.method2844(arg3)) {
			return new Class15_Sub2_Sub1(arg2, 3553, arg1, arg0, arg4, arg3, true);
		} else if (arg2.aBoolean400) {
			return new Class15_Sub2_Sub1(arg2, 34037, arg1, arg0, arg4, arg3, true);
		} else {
			return new Class15_Sub2_Sub1(arg2, arg1, arg0, arg4, arg3, Static183.method1325(arg4), Static183.method1325(arg3), true);
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "([BIZIIILclient!nm;I)Lclient!up;")
	public static Class15_Sub2_Sub1 method5044(@OriginalArg(0) byte[] arg0, @OriginalArg(5) int arg1, @OriginalArg(6) Class164_Sub1 arg2, @OriginalArg(7) int arg3) {
		if (arg2.aBoolean407 || Static196.method2844(arg1) && Static196.method2844(arg3)) {
			return new Class15_Sub2_Sub1(arg2, 3553, 6406, arg1, arg3, false, arg0, 6406);
		} else if (arg2.aBoolean400) {
			return new Class15_Sub2_Sub1(arg2, 34037, 6406, arg1, arg3, false, arg0, 6406);
		} else {
			return new Class15_Sub2_Sub1(arg2, 6406, arg1, arg3, Static183.method1325(arg1), Static183.method1325(arg3), arg0, 6406);
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "([IIIIZLclient!nm;)Lclient!up;")
	public static Class15_Sub2_Sub1 method5045(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Class164_Sub1 arg3) {
		if (arg3.aBoolean407 || Static196.method2844(arg1) && Static196.method2844(arg2)) {
			return new Class15_Sub2_Sub1(arg3, 3553, arg1, arg2, false, arg0);
		} else if (arg3.aBoolean400) {
			return new Class15_Sub2_Sub1(arg3, 34037, arg1, arg2, false, arg0);
		} else {
			return new Class15_Sub2_Sub1(arg3, arg1, arg2, Static183.method1325(arg1), Static183.method1325(arg2), arg0);
		}
	}
}
