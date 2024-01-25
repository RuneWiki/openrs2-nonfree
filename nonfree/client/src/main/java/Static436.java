import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static436 {

	@OriginalMember(owner = "client!pk", name = "u", descriptor = "F")
	public static float aFloat181;

	@OriginalMember(owner = "client!pk", name = "v", descriptor = "J")
	public static long aLong214;

	@OriginalMember(owner = "client!pk", name = "x", descriptor = "I")
	public static int anInt7858;

	@OriginalMember(owner = "client!pk", name = "t", descriptor = "Lclient!vi;")
	public static final Class357 aClass357_3 = new Class357(128);

	@OriginalMember(owner = "client!pk", name = "w", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_113 = new Class200(87, -1);

	@OriginalMember(owner = "client!pk", name = "y", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray6 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIILclient!kw;II)Lclient!of;")
	public static Class76_Sub3_Sub1 method6807(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.aBoolean379 || Static323.method5278(arg1) && Static323.method5278(arg0)) {
			return new Class76_Sub3_Sub1(arg2, 3553, arg3, arg4, arg1, arg0, true);
		} else if (arg2.aBoolean384) {
			return new Class76_Sub3_Sub1(arg2, 34037, arg3, arg4, arg1, arg0, true);
		} else {
			return new Class76_Sub3_Sub1(arg2, arg3, arg4, arg1, arg0, Static109.method2234(arg1), Static109.method2234(arg0), true);
		}
	}
}
