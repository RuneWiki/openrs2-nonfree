import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static81 {

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
	public static int anInt1667;

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "F")
	public static float aFloat27;

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "[B")
	public static final byte[] aByteArray41 = new byte[520];

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIILclient!os;)Lclient!gg;")
	public static Class19_Sub2_Sub1 method1585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class39_Sub3 arg4) {
		if (arg4.aBoolean490 || Static150.method2607(arg3) && Static150.method2607(arg1)) {
			return new Class19_Sub2_Sub1(arg4, 3553, arg0, arg2, arg3, arg1, true);
		} else if (arg4.aBoolean506) {
			return new Class19_Sub2_Sub1(arg4, 34037, arg0, arg2, arg3, arg1, true);
		} else {
			return new Class19_Sub2_Sub1(arg4, arg0, arg2, arg3, arg1, Static131.method2413(arg3), Static131.method2413(arg1), true);
		}
	}
}
