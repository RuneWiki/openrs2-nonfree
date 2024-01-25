import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static101 {

	@OriginalMember(owner = "client!da", name = "w", descriptor = "I")
	public static int anInt8907;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "Lclient!wr;")
	public static Class406 aClass406_8;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "Lclient!ej;")
	public static Class100 aClass100_12;

	@OriginalMember(owner = "client!da", name = "s", descriptor = "[I")
	public static final int[] anIntArray645 = new int[500];

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!uja;ZIZIII[I)Lclient!ke;")
	public static Class64_Sub4_Sub1 method7885(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int[] arg5) {
		if (arg0.aBoolean858 || Static457.method6641(arg2) && Static457.method6641(arg3)) {
			return new Class64_Sub4_Sub1(arg0, 3553, arg2, arg3, false, arg5, arg4, 0);
		} else if (arg0.aBoolean860) {
			return new Class64_Sub4_Sub1(arg0, 34037, arg2, arg3, false, arg5, arg4, 0);
		} else {
			return new Class64_Sub4_Sub1(arg0, arg2, arg3, Static330.method4577(arg2), Static330.method4577(arg3), arg5);
		}
	}
}
