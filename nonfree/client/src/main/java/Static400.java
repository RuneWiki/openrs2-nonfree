import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static400 {

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIILclient!ic;I)Lclient!lm;")
	public static Class81_Sub2_Sub1 method3641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class48_Sub2 arg3, @OriginalArg(5) int arg4) {
		if (arg3.aBoolean227 || Static153.method2738(arg2) && Static153.method2738(arg4)) {
			return new Class81_Sub2_Sub1(arg3, 3553, arg1, arg0, arg2, arg4, true);
		} else if (arg3.aBoolean221) {
			return new Class81_Sub2_Sub1(arg3, 34037, arg1, arg0, arg2, arg4, true);
		} else {
			return new Class81_Sub2_Sub1(arg3, arg1, arg0, arg2, arg4, Static279.method4638(arg2), Static279.method4638(arg4), true);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIB[BLclient!ic;ZII)Lclient!lm;")
	public static Class81_Sub2_Sub1 method3642(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) Class48_Sub2 arg2, @OriginalArg(7) int arg3) {
		if (arg2.aBoolean227 || Static153.method2738(arg0) && Static153.method2738(arg3)) {
			return new Class81_Sub2_Sub1(arg2, 3553, 6406, arg0, arg3, false, arg1, 6406);
		} else if (arg2.aBoolean221) {
			return new Class81_Sub2_Sub1(arg2, 34037, 6406, arg0, arg3, false, arg1, 6406);
		} else {
			return new Class81_Sub2_Sub1(arg2, 6406, arg0, arg3, Static279.method4638(arg0), Static279.method4638(arg3), arg1, 6406);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILclient!ic;I[IIZ)Lclient!lm;")
	public static Class81_Sub2_Sub1 method3643(@OriginalArg(0) int arg0, @OriginalArg(1) Class48_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (arg1.aBoolean227 || Static153.method2738(arg2) && Static153.method2738(arg0)) {
			return new Class81_Sub2_Sub1(arg1, 3553, arg2, arg0, false, arg3);
		} else if (arg1.aBoolean221) {
			return new Class81_Sub2_Sub1(arg1, 34037, arg2, arg0, false, arg3);
		} else {
			return new Class81_Sub2_Sub1(arg1, arg2, arg0, Static279.method4638(arg2), Static279.method4638(arg0), arg3);
		}
	}
}
