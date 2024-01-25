import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static309 {

	@OriginalMember(owner = "client!lj", name = "q", descriptor = "[S")
	public static short[] aShortArray77;

	@OriginalMember(owner = "client!lj", name = "j", descriptor = "[Lclient!mh;")
	public static final Class205[] aClass205Array1 = new Class205[16];

	@OriginalMember(owner = "client!lj", name = "n", descriptor = "Lclient!mea;")
	public static final Class201 aClass201_12 = new Class201();

	@OriginalMember(owner = "client!lj", name = "p", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_94 = new Class287(42, 3);

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z[IIILclient!er;III)Lclient!cea;")
	public static Class50_Sub1_Sub1 method4636(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class31_Sub2 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg3.aBoolean206 || Static249.method6960(arg2) && Static249.method6960(arg4)) {
			return new Class50_Sub1_Sub1(arg3, 3553, arg2, arg4, false, arg0, arg1, 0);
		} else if (arg3.aBoolean219) {
			return new Class50_Sub1_Sub1(arg3, 34037, arg2, arg4, false, arg0, arg1, 0);
		} else {
			return new Class50_Sub1_Sub1(arg3, arg2, arg4, Static538.method7366(arg2), Static538.method7366(arg4), arg0);
		}
	}
}
