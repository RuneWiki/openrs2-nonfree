import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static366 {

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIILclient!tb;II)Lclient!kf;")
	public static Class56_Sub4_Sub1 method2554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class129_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.aBoolean392 || Static56.method844(arg3) && Static56.method844(arg0)) {
			return new Class56_Sub4_Sub1(arg2, 3553, arg4, arg1, arg3, arg0, true);
		} else if (arg2.aBoolean380) {
			return new Class56_Sub4_Sub1(arg2, 34037, arg4, arg1, arg3, arg0, true);
		} else {
			return new Class56_Sub4_Sub1(arg2, arg4, arg1, arg3, arg0, Static90.method4097(arg3), Static90.method4097(arg0), true);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZ[IILclient!tb;I)Lclient!kf;")
	public static Class56_Sub4_Sub1 method2555(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class129_Sub2 arg3) {
		if (arg3.aBoolean392 || Static56.method844(arg0) && Static56.method844(arg2)) {
			return new Class56_Sub4_Sub1(arg3, 3553, arg0, arg2, false, arg1);
		} else if (arg3.aBoolean380) {
			return new Class56_Sub4_Sub1(arg3, 34037, arg0, arg2, false, arg1);
		} else {
			return new Class56_Sub4_Sub1(arg3, arg0, arg2, Static90.method4097(arg0), Static90.method4097(arg2), arg1);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZILclient!tb;BI[BI)Lclient!kf;")
	public static Class56_Sub4_Sub1 method2556(@OriginalArg(3) Class129_Sub2 arg0, @OriginalArg(5) int arg1, @OriginalArg(6) byte[] arg2, @OriginalArg(7) int arg3) {
		if (arg0.aBoolean392 || Static56.method844(arg1) && Static56.method844(arg3)) {
			return new Class56_Sub4_Sub1(arg0, 3553, 6406, arg1, arg3, false, arg2, 6406);
		} else if (arg0.aBoolean380) {
			return new Class56_Sub4_Sub1(arg0, 34037, 6406, arg1, arg3, false, arg2, 6406);
		} else {
			return new Class56_Sub4_Sub1(arg0, 6406, arg1, arg3, Static90.method4097(arg1), Static90.method4097(arg3), arg2, 6406);
		}
	}
}
