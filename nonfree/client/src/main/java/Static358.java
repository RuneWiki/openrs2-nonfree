import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static358 {

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIZILclient!se;[I)Lclient!fj;")
	public static Class66_Sub1_Sub1 method1518(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class122_Sub2 arg2, @OriginalArg(5) int[] arg3) {
		if (arg2.aBoolean372 || Static338.method5554(arg0) && Static338.method5554(arg1)) {
			return new Class66_Sub1_Sub1(arg2, 3553, arg0, arg1, false, arg3);
		} else if (arg2.aBoolean357) {
			return new Class66_Sub1_Sub1(arg2, 34037, arg0, arg1, false, arg3);
		} else {
			return new Class66_Sub1_Sub1(arg2, arg0, arg1, Static83.method1300(arg0), Static83.method1300(arg1), arg3);
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I[BZIILclient!se;II)Lclient!fj;")
	public static Class66_Sub1_Sub1 method1519(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(5) Class122_Sub2 arg2, @OriginalArg(6) int arg3) {
		if (arg2.aBoolean372 || Static338.method5554(arg1) && Static338.method5554(arg3)) {
			return new Class66_Sub1_Sub1(arg2, 3553, 6406, arg1, arg3, false, arg0, 6406);
		} else if (arg2.aBoolean357) {
			return new Class66_Sub1_Sub1(arg2, 34037, 6406, arg1, arg3, false, arg0, 6406);
		} else {
			return new Class66_Sub1_Sub1(arg2, 6406, arg1, arg3, Static83.method1300(arg1), Static83.method1300(arg3), arg0, 6406);
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IILclient!se;IBI)Lclient!fj;")
	public static Class66_Sub1_Sub1 method1520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class122_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.aBoolean372 || Static338.method5554(arg0) && Static338.method5554(arg4)) {
			return new Class66_Sub1_Sub1(arg2, 3553, arg1, arg3, arg0, arg4, true);
		} else if (arg2.aBoolean357) {
			return new Class66_Sub1_Sub1(arg2, 34037, arg1, arg3, arg0, arg4, true);
		} else {
			return new Class66_Sub1_Sub1(arg2, arg1, arg3, arg0, arg4, Static83.method1300(arg0), Static83.method1300(arg4), true);
		}
	}
}
