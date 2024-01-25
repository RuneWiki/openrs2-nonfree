import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static338 {

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "Lclient!sw;")
	public static final Class327 aClass327_13 = new Class327(2);

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "([BIILclient!dia;IIZB)Lclient!me;")
	public static Class85_Sub3_Sub1 method5088(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13_Sub2 arg2, @OriginalArg(4) int arg3) {
		if (arg2.aBoolean170 || Static129.method2437(arg3) && Static129.method2437(arg1)) {
			return new Class85_Sub3_Sub1(arg2, 3553, 6406, arg3, arg1, false, arg0, 6406);
		} else if (arg2.aBoolean176) {
			return new Class85_Sub3_Sub1(arg2, 34037, 6406, arg3, arg1, false, arg0, 6406);
		} else {
			return new Class85_Sub3_Sub1(arg2, 6406, arg3, arg1, Static282.method4521(arg3), Static282.method4521(arg1), arg0, 6406);
		}
	}
}
