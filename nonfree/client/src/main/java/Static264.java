import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static264 {

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "[I")
	public static int[] anIntArray238;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIILclient!er;II)Lclient!cea;")
	public static Class50_Sub1_Sub1 method4042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class31_Sub2 arg3, @OriginalArg(5) int arg4) {
		if (arg3.aBoolean206 || Static249.method6960(arg1) && Static249.method6960(arg4)) {
			return new Class50_Sub1_Sub1(arg3, 3553, arg2, arg0, arg1, arg4, true);
		} else if (arg3.aBoolean219) {
			return new Class50_Sub1_Sub1(arg3, 34037, arg2, arg0, arg1, arg4, true);
		} else {
			return new Class50_Sub1_Sub1(arg3, arg2, arg0, arg1, arg4, Static538.method7366(arg1), Static538.method7366(arg4), true);
		}
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(I)V")
	public static void method4044() {
		if (Static340.anInt6133 == 6) {
			Static340.anInt6133 = 7;
		}
	}
}
