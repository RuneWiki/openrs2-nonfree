import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static363 {

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!hd;IIZZI[BI)Lclient!mc;")
	public static Class92_Sub4_Sub1 method3534(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) byte[] arg3) {
		if (arg0.aBoolean207 || Static81.method1752(arg2) && Static81.method1752(arg1)) {
			return new Class92_Sub4_Sub1(arg0, 3553, 6406, arg2, arg1, false, arg3, 6406);
		} else if (arg0.aBoolean203) {
			return new Class92_Sub4_Sub1(arg0, 34037, 6406, arg2, arg1, false, arg3, 6406);
		} else {
			return new Class92_Sub4_Sub1(arg0, 6406, arg2, arg1, Static271.method4522(arg2), Static271.method4522(arg1), arg3, 6406);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BILclient!hd;Z[II)Lclient!mc;")
	public static Class92_Sub4_Sub1 method3535(@OriginalArg(1) int arg0, @OriginalArg(2) Class89_Sub1 arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) int arg3) {
		if (arg1.aBoolean207 || Static81.method1752(arg0) && Static81.method1752(arg3)) {
			return new Class92_Sub4_Sub1(arg1, 3553, arg0, arg3, false, arg2);
		} else if (arg1.aBoolean203) {
			return new Class92_Sub4_Sub1(arg1, 34037, arg0, arg3, false, arg2);
		} else {
			return new Class92_Sub4_Sub1(arg1, arg0, arg3, Static271.method4522(arg0), Static271.method4522(arg3), arg2);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!hd;IIIII)Lclient!mc;")
	public static Class92_Sub4_Sub1 method3536(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.aBoolean207 || Static81.method1752(arg1) && Static81.method1752(arg4)) {
			return new Class92_Sub4_Sub1(arg0, 3553, arg3, arg2, arg1, arg4, true);
		} else if (arg0.aBoolean203) {
			return new Class92_Sub4_Sub1(arg0, 34037, arg3, arg2, arg1, arg4, true);
		} else {
			return new Class92_Sub4_Sub1(arg0, arg3, arg2, arg1, arg4, Static271.method4522(arg1), Static271.method4522(arg4), true);
		}
	}
}
