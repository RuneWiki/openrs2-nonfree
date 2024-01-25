import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static375 {

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIZIZ[BLclient!cg;)Lclient!qq;")
	public static Class81_Sub4_Sub1 method4750(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(6) byte[] arg2, @OriginalArg(7) Class37_Sub1 arg3) {
		if (arg3.aBoolean73 || Static214.method4055(arg0) && Static214.method4055(arg1)) {
			return new Class81_Sub4_Sub1(arg3, 3553, 6406, arg0, arg1, false, arg2, 6406);
		} else if (arg3.aBoolean66) {
			return new Class81_Sub4_Sub1(arg3, 34037, 6406, arg0, arg1, false, arg2, 6406);
		} else {
			return new Class81_Sub4_Sub1(arg3, 6406, arg0, arg1, Static51.method1026(arg0), Static51.method1026(arg1), arg2, 6406);
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIILclient!cg;II)Lclient!qq;")
	public static Class81_Sub4_Sub1 method4751(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class37_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.aBoolean73 || Static214.method4055(arg1) && Static214.method4055(arg4)) {
			return new Class81_Sub4_Sub1(arg2, 3553, arg3, arg0, arg1, arg4, true);
		} else if (arg2.aBoolean66) {
			return new Class81_Sub4_Sub1(arg2, 34037, arg3, arg0, arg1, arg4, true);
		} else {
			return new Class81_Sub4_Sub1(arg2, arg3, arg0, arg1, arg4, Static51.method1026(arg1), Static51.method1026(arg4), true);
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIZILclient!cg;[I)Lclient!qq;")
	public static Class81_Sub4_Sub1 method4752(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class37_Sub1 arg2, @OriginalArg(5) int[] arg3) {
		if (arg2.aBoolean73 || Static214.method4055(arg0) && Static214.method4055(arg1)) {
			return new Class81_Sub4_Sub1(arg2, 3553, arg0, arg1, false, arg3);
		} else if (arg2.aBoolean66) {
			return new Class81_Sub4_Sub1(arg2, 34037, arg0, arg1, false, arg3);
		} else {
			return new Class81_Sub4_Sub1(arg2, arg0, arg1, Static51.method1026(arg0), Static51.method1026(arg1), arg3);
		}
	}
}
