import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static321 {

	@OriginalMember(owner = "client!ks", name = "E", descriptor = "[I")
	public static int[] anIntArray550;

	@OriginalMember(owner = "client!ks", name = "F", descriptor = "[I")
	public static int[] anIntArray551;

	@OriginalMember(owner = "client!ks", name = "s", descriptor = "I")
	public static int anInt10318 = 0;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILclient!lf;IIII)Lclient!fu;")
	public static Class10_Sub2_Sub1 method8421(@OriginalArg(0) int arg0, @OriginalArg(1) Class95_Sub3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1.aBoolean377 || Static365.method5254(arg0) && Static365.method5254(arg4)) {
			return new Class10_Sub2_Sub1(arg1, 3553, arg2, arg3, arg0, arg4, true);
		} else if (arg1.aBoolean384) {
			return new Class10_Sub2_Sub1(arg1, 34037, arg2, arg3, arg0, arg4, true);
		} else {
			return new Class10_Sub2_Sub1(arg1, arg2, arg3, arg0, arg4, Static585.method7772(arg0), Static585.method7772(arg4), true);
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)Z")
	public static boolean method8424(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!fq;ZZ)V")
	public static void method8425(@OriginalArg(0) Class34_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		arg0.aBoolean671 = arg1;
		if (Static626.aBoolean718) {
			Static304.aClass283Array1[Static304.aClass283Array1.length - 1].method6199(arg0);
		} else {
			Static87.method1490(arg0, Static414.aClass3_Sub13Array3);
		}
	}
}
