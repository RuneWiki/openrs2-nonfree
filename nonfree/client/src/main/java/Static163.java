import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static163 {

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Z[BIILclient!qo;III)Lclient!eba;")
	public static Class85_Sub1_Sub1 method3529(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class20_Sub3 arg2, @OriginalArg(7) int arg3) {
		if (arg2.aBoolean620 || Static468.method7401(arg3) && Static468.method7401(arg1)) {
			return new Class85_Sub1_Sub1(arg2, 3553, 6406, arg3, arg1, false, arg0, 6406);
		} else if (arg2.aBoolean629) {
			return new Class85_Sub1_Sub1(arg2, 34037, 6406, arg3, arg1, false, arg0, 6406);
		} else {
			return new Class85_Sub1_Sub1(arg2, 6406, arg3, arg1, Static231.method4407(arg3), Static231.method4407(arg1), arg0, 6406);
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)Z")
	public static boolean method3530(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
