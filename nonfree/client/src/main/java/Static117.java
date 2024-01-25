import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static117 {

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "Lclient!ul;")
	public static final Class357 aClass357_8 = new Class357("", 12);

	@OriginalMember(owner = "client!eaa", name = "e", descriptor = "[I")
	public static final int[] anIntArray127 = new int[14];

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "([IIILclient!pq;IIIZ)Lclient!iq;")
	public static Class53_Sub2_Sub1 method1835(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132_Sub3 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3.aBoolean538 || Static177.method2498(arg1) && Static177.method2498(arg5)) {
			return new Class53_Sub2_Sub1(arg3, 3553, arg1, arg5, false, arg0, arg2, 0);
		} else if (arg3.aBoolean539) {
			return new Class53_Sub2_Sub1(arg3, 34037, arg1, arg5, false, arg0, arg2, 0);
		} else {
			return new Class53_Sub2_Sub1(arg3, arg1, arg5, Static655.method8912(arg1), Static655.method8912(arg5), arg0);
		}
	}
}
