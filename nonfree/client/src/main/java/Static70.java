import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static70 {

	@OriginalMember(owner = "client!cn", name = "z", descriptor = "F")
	public static float aFloat49;

	@OriginalMember(owner = "client!cn", name = "x", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_34 = new Class150(66, 0);

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILclient!jj;IIII)Lclient!og;")
	public static Class4_Sub2_Sub1 method1322(@OriginalArg(1) Class62_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.aBoolean273 || Static281.method4574(arg1) && Static281.method4574(arg3)) {
			return new Class4_Sub2_Sub1(arg0, 3553, arg2, arg4, arg1, arg3, true);
		} else if (arg0.aBoolean271) {
			return new Class4_Sub2_Sub1(arg0, 34037, arg2, arg4, arg1, arg3, true);
		} else {
			return new Class4_Sub2_Sub1(arg0, arg2, arg4, arg1, arg3, Static179.method3071(arg1), Static179.method3071(arg3), true);
		}
	}
}
