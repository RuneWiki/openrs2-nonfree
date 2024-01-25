import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static360 {

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!sq;[BIIIIIZ)Lclient!l;")
	public static Class8_Sub1_Sub1 method3374(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		if (arg0.aBoolean387 || Static215.method3866(arg2) && Static215.method3866(arg3)) {
			return new Class8_Sub1_Sub1(arg0, 3553, 6406, arg2, arg3, false, arg1, 6406);
		} else if (arg0.aBoolean388) {
			return new Class8_Sub1_Sub1(arg0, 34037, 6406, arg2, arg3, false, arg1, 6406);
		} else {
			return new Class8_Sub1_Sub1(arg0, 6406, arg2, arg3, Static224.method4011(arg2), Static224.method4011(arg3), arg1, 6406);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IBIILclient!sq;I)Lclient!l;")
	public static Class8_Sub1_Sub1 method3375(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class46_Sub2 arg3, @OriginalArg(5) int arg4) {
		if (arg3.aBoolean387 || Static215.method3866(arg4) && Static215.method3866(arg0)) {
			return new Class8_Sub1_Sub1(arg3, 3553, arg2, arg1, arg4, arg0, true);
		} else if (arg3.aBoolean388) {
			return new Class8_Sub1_Sub1(arg3, 34037, arg2, arg1, arg4, arg0, true);
		} else {
			return new Class8_Sub1_Sub1(arg3, arg2, arg1, arg4, arg0, Static224.method4011(arg4), Static224.method4011(arg0), true);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I[IZILclient!sq;I)Lclient!l;")
	public static Class8_Sub1_Sub1 method3376(@OriginalArg(1) int[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class46_Sub2 arg2, @OriginalArg(5) int arg3) {
		if (arg2.aBoolean387 || Static215.method3866(arg1) && Static215.method3866(arg3)) {
			return new Class8_Sub1_Sub1(arg2, 3553, arg1, arg3, false, arg0);
		} else if (arg2.aBoolean388) {
			return new Class8_Sub1_Sub1(arg2, 34037, arg1, arg3, false, arg0);
		} else {
			return new Class8_Sub1_Sub1(arg2, arg1, arg3, Static224.method4011(arg1), Static224.method4011(arg3), arg0);
		}
	}
}
