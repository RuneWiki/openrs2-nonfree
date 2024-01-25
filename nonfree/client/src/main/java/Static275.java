import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static275 {

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "[Lclient!uq;")
	public static Class9_Sub2[] aClass9_Sub2Array3;

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "Lclient!dia;")
	public static final Class70 aClass70_1 = Static332.method5406();

	@OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
	public static int anInt5304 = -1;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(III)Z")
	public static boolean method4528(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZIZ[ILclient!dw;III)Lclient!gv;")
	public static Class94_Sub2_Sub1 method4529(@OriginalArg(1) int arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) Class82_Sub1 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg2.aBoolean180 || Static112.method1840(arg3) && Static112.method1840(arg4)) {
			return new Class94_Sub2_Sub1(arg2, 3553, arg3, arg4, false, arg1, arg0, 0);
		} else if (arg2.aBoolean176) {
			return new Class94_Sub2_Sub1(arg2, 34037, arg3, arg4, false, arg1, arg0, 0);
		} else {
			return new Class94_Sub2_Sub1(arg2, arg3, arg4, Static533.method1203(arg3), Static533.method1203(arg4), arg1);
		}
	}
}
