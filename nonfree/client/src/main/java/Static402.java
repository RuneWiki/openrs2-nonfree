import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static402 {

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IILclient!qi;[BIZII)Lclient!r;")
	public static Class7_Sub1_Sub1 method4750(@OriginalArg(1) int arg0, @OriginalArg(2) Class82_Sub2 arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		if (arg1.aBoolean395 || Static100.method1790(arg3) && Static100.method1790(arg0)) {
			return new Class7_Sub1_Sub1(arg1, 3553, 6406, arg3, arg0, false, arg2, 6406);
		} else if (arg1.aBoolean404) {
			return new Class7_Sub1_Sub1(arg1, 34037, 6406, arg3, arg0, false, arg2, 6406);
		} else {
			return new Class7_Sub1_Sub1(arg1, 6406, arg3, arg0, Static353.method5359(arg3), Static353.method5359(arg0), arg2, 6406);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([ILclient!qi;IZZI)Lclient!r;")
	public static Class7_Sub1_Sub1 method4751(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class82_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		if (arg1.aBoolean395 || Static100.method1790(arg3) && Static100.method1790(arg2)) {
			return new Class7_Sub1_Sub1(arg1, 3553, arg3, arg2, false, arg0);
		} else if (arg1.aBoolean404) {
			return new Class7_Sub1_Sub1(arg1, 34037, arg3, arg2, false, arg0);
		} else {
			return new Class7_Sub1_Sub1(arg1, arg3, arg2, Static353.method5359(arg3), Static353.method5359(arg2), arg0);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIILclient!qi;II)Lclient!r;")
	public static Class7_Sub1_Sub1 method4752(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class82_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.aBoolean395 || Static100.method1790(arg4) && Static100.method1790(arg0)) {
			return new Class7_Sub1_Sub1(arg2, 3553, arg3, arg1, arg4, arg0, true);
		} else if (arg2.aBoolean404) {
			return new Class7_Sub1_Sub1(arg2, 34037, arg3, arg1, arg4, arg0, true);
		} else {
			return new Class7_Sub1_Sub1(arg2, arg3, arg1, arg4, arg0, Static353.method5359(arg4), Static353.method5359(arg0), true);
		}
	}
}
