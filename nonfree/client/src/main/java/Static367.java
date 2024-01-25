import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static367 {

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILclient!ig;III)Lclient!rk;")
	public static Class52_Sub1_Sub1 method4735(@OriginalArg(0) int arg0, @OriginalArg(2) Class47_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1.aBoolean229 || Static48.method958(arg2) && Static48.method958(arg3)) {
			return new Class52_Sub1_Sub1(arg1, 3553, arg0, arg4, arg2, arg3, true);
		} else if (arg1.aBoolean236) {
			return new Class52_Sub1_Sub1(arg1, 34037, arg0, arg4, arg2, arg3, true);
		} else {
			return new Class52_Sub1_Sub1(arg1, arg0, arg4, arg2, arg3, Static28.method5505(arg2), Static28.method5505(arg3), true);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZZILclient!ig;I[I)Lclient!rk;")
	public static Class52_Sub1_Sub1 method4736(@OriginalArg(2) int arg0, @OriginalArg(3) Class47_Sub2 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int[] arg3) {
		if (arg1.aBoolean229 || Static48.method958(arg0) && Static48.method958(arg2)) {
			return new Class52_Sub1_Sub1(arg1, 3553, arg0, arg2, false, arg3);
		} else if (arg1.aBoolean236) {
			return new Class52_Sub1_Sub1(arg1, 34037, arg0, arg2, false, arg3);
		} else {
			return new Class52_Sub1_Sub1(arg1, arg0, arg2, Static28.method5505(arg0), Static28.method5505(arg2), arg3);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!ig;BI[BIIIZ)Lclient!rk;")
	public static Class52_Sub1_Sub1 method4737(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		if (arg0.aBoolean229 || Static48.method958(arg2) && Static48.method958(arg3)) {
			return new Class52_Sub1_Sub1(arg0, 3553, 6406, arg2, arg3, false, arg1, 6406);
		} else if (arg0.aBoolean236) {
			return new Class52_Sub1_Sub1(arg0, 34037, 6406, arg2, arg3, false, arg1, 6406);
		} else {
			return new Class52_Sub1_Sub1(arg0, 6406, arg2, arg3, Static28.method5505(arg2), Static28.method5505(arg3), arg1, 6406);
		}
	}
}
