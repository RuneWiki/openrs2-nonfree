import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static370 {

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IZLclient!ao;[BZIII)Lclient!rn;")
	public static Class124_Sub2_Sub1 method4996(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub1 arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(5) int arg3) {
		if (arg1.aBoolean37 || Static12.method427(arg0) && Static12.method427(arg3)) {
			return new Class124_Sub2_Sub1(arg1, 3553, 6406, arg0, arg3, false, arg2, 6406);
		} else if (arg1.aBoolean48) {
			return new Class124_Sub2_Sub1(arg1, 34037, 6406, arg0, arg3, false, arg2, 6406);
		} else {
			return new Class124_Sub2_Sub1(arg1, 6406, arg0, arg3, Static216.method3815(arg0), Static216.method3815(arg3), arg2, 6406);
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILclient!ao;IB[IZ)Lclient!rn;")
	public static Class124_Sub2_Sub1 method4997(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg1.aBoolean37 || Static12.method427(arg2) && Static12.method427(arg0)) {
			return new Class124_Sub2_Sub1(arg1, 3553, arg2, arg0, false, arg3);
		} else if (arg1.aBoolean48) {
			return new Class124_Sub2_Sub1(arg1, 34037, arg2, arg0, false, arg3);
		} else {
			return new Class124_Sub2_Sub1(arg1, arg2, arg0, Static216.method3815(arg2), Static216.method3815(arg0), arg3);
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILclient!ao;IIIB)Lclient!rn;")
	public static Class124_Sub2_Sub1 method4998(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1.aBoolean37 || Static12.method427(arg2) && Static12.method427(arg4)) {
			return new Class124_Sub2_Sub1(arg1, 3553, arg0, arg3, arg2, arg4, true);
		} else if (arg1.aBoolean48) {
			return new Class124_Sub2_Sub1(arg1, 34037, arg0, arg3, arg2, arg4, true);
		} else {
			return new Class124_Sub2_Sub1(arg1, arg0, arg3, arg2, arg4, Static216.method3815(arg2), Static216.method3815(arg4), true);
		}
	}
}
