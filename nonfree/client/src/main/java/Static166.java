import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static166 {

	@OriginalMember(owner = "client!fga", name = "e", descriptor = "I")
	public static int anInt3034;

	@OriginalMember(owner = "client!fga", name = "f", descriptor = "I")
	public static int anInt3035;

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "I")
	public static int anInt3031 = 0;

	@OriginalMember(owner = "client!fga", name = "c", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_30 = new Class240(64, 8);

	@OriginalMember(owner = "client!fga", name = "h", descriptor = "I")
	public static int anInt3037 = 0;

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIII)I")
	public static int method2620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 < arg2) {
			return arg2;
		} else if (arg1 >= arg0) {
			return arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(ZLclient!lf;III[III)Lclient!fu;")
	public static Class10_Sub2_Sub1 method2622(@OriginalArg(1) Class95_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg0.aBoolean377 || Static365.method5254(arg4) && Static365.method5254(arg2)) {
			return new Class10_Sub2_Sub1(arg0, 3553, arg4, arg2, false, arg3, arg1, 0);
		} else if (arg0.aBoolean384) {
			return new Class10_Sub2_Sub1(arg0, 34037, arg4, arg2, false, arg3, arg1, 0);
		} else {
			return new Class10_Sub2_Sub1(arg0, arg4, arg2, Static585.method7772(arg4), Static585.method7772(arg2), arg3);
		}
	}
}
