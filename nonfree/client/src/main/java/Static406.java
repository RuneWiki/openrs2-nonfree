import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static406 {

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIZI[BILclient!mi;I)Lclient!rh;")
	public static Class30_Sub3_Sub1 method4618(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(6) Class155_Sub1 arg3) {
		if (arg3.aBoolean306 || Static180.method2815(arg1) && Static180.method2815(arg0)) {
			return new Class30_Sub3_Sub1(arg3, 3553, 6406, arg1, arg0, false, arg2, 6406);
		} else if (arg3.aBoolean295) {
			return new Class30_Sub3_Sub1(arg3, 34037, 6406, arg1, arg0, false, arg2, 6406);
		} else {
			return new Class30_Sub3_Sub1(arg3, 6406, arg1, arg0, Static304.method2746(arg1), Static304.method2746(arg0), arg2, 6406);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I[ILclient!mi;ZII)Lclient!rh;")
	public static Class30_Sub3_Sub1 method4619(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class155_Sub1 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg1.aBoolean306 || Static180.method2815(arg2) && Static180.method2815(arg3)) {
			return new Class30_Sub3_Sub1(arg1, 3553, arg2, arg3, false, arg0);
		} else if (arg1.aBoolean295) {
			return new Class30_Sub3_Sub1(arg1, 34037, arg2, arg3, false, arg0);
		} else {
			return new Class30_Sub3_Sub1(arg1, arg2, arg3, Static304.method2746(arg2), Static304.method2746(arg3), arg0);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!mi;IBIII)Lclient!rh;")
	public static Class30_Sub3_Sub1 method4620(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.aBoolean306 || Static180.method2815(arg4) && Static180.method2815(arg1)) {
			return new Class30_Sub3_Sub1(arg0, 3553, arg2, arg3, arg4, arg1, true);
		} else if (arg0.aBoolean295) {
			return new Class30_Sub3_Sub1(arg0, 34037, arg2, arg3, arg4, arg1, true);
		} else {
			return new Class30_Sub3_Sub1(arg0, arg2, arg3, arg4, arg1, Static304.method2746(arg4), Static304.method2746(arg1), true);
		}
	}
}
