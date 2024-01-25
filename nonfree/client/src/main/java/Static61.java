import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static61 {

	@OriginalMember(owner = "client!bv", name = "J", descriptor = "Lclient!vt;")
	public static Class378 aClass378_1;

	@OriginalMember(owner = "client!bv", name = "K", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_13 = new Class171(114, 6);

	@OriginalMember(owner = "client!bv", name = "O", descriptor = "I")
	public static int anInt1285 = -2;

	@OriginalMember(owner = "client!bv", name = "h", descriptor = "(I)V")
	public static void method1131() {
		Static342.aClass221Array1 = null;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIILclient!lf;B)Lclient!fu;")
	public static Class10_Sub2_Sub1 method1132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class95_Sub3 arg3) {
		if (arg3.aBoolean377 || Static365.method5254(arg2) && Static365.method5254(arg0)) {
			return new Class10_Sub2_Sub1(arg3, 3553, arg1, arg2, arg0);
		} else if (arg3.aBoolean384) {
			return new Class10_Sub2_Sub1(arg3, 34037, arg1, arg2, arg0);
		} else {
			return new Class10_Sub2_Sub1(arg3, arg1, arg2, arg0, Static585.method7772(arg2), Static585.method7772(arg0));
		}
	}
}
