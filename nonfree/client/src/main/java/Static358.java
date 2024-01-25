import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static358 {

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I[BILclient!nf;IIIZ)Lclient!dh;")
	public static Class44_Sub1_Sub1 method1074(@OriginalArg(1) byte[] arg0, @OriginalArg(3) Class105_Sub1 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg1.aBoolean328 || Static43.method896(arg2) && Static43.method896(arg3)) {
			return new Class44_Sub1_Sub1(arg1, 3553, 6406, arg2, arg3, false, arg0, 6406);
		} else if (arg1.aBoolean317) {
			return new Class44_Sub1_Sub1(arg1, 34037, 6406, arg2, arg3, false, arg0, 6406);
		} else {
			return new Class44_Sub1_Sub1(arg1, 6406, arg2, arg3, Static304.method5275(arg2), Static304.method5275(arg3), arg0, 6406);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIILclient!nf;)Lclient!dh;")
	public static Class44_Sub1_Sub1 method1075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class105_Sub1 arg4) {
		if (arg4.aBoolean328 || Static43.method896(arg0) && Static43.method896(arg3)) {
			return new Class44_Sub1_Sub1(arg4, 3553, arg1, arg2, arg0, arg3, true);
		} else if (arg4.aBoolean317) {
			return new Class44_Sub1_Sub1(arg4, 34037, arg1, arg2, arg0, arg3, true);
		} else {
			return new Class44_Sub1_Sub1(arg4, arg1, arg2, arg0, arg3, Static304.method5275(arg0), Static304.method5275(arg3), true);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II[IZBLclient!nf;)Lclient!dh;")
	public static Class44_Sub1_Sub1 method1076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(5) Class105_Sub1 arg3) {
		if (arg3.aBoolean328 || Static43.method896(arg1) && Static43.method896(arg0)) {
			return new Class44_Sub1_Sub1(arg3, 3553, arg1, arg0, false, arg2);
		} else if (arg3.aBoolean317) {
			return new Class44_Sub1_Sub1(arg3, 34037, arg1, arg0, false, arg2);
		} else {
			return new Class44_Sub1_Sub1(arg3, arg1, arg0, Static304.method5275(arg1), Static304.method5275(arg0), arg2);
		}
	}
}
