import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static25 {

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "Lclient!ak;")
	public static Class11 aClass11_1;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "[I")
	public static final int[] anIntArray24 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_11 = new Class37(128);

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "[I")
	public static int[] anIntArray25 = new int[2];

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "[I")
	public static final int[] anIntArray26 = new int[1000];

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
	public static int anInt449 = 2;

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)Z")
	public static boolean method408() {
		return Static24.anInt437 == 0 ? Static278.aBoolean473 : true;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIII)V")
	public static void method409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 - arg2 >= Static60.anInt1399 && Static138.anInt6334 >= arg2 + arg5 && arg4 - arg2 >= Static41.anInt1131 && Static165.anInt3409 >= arg2 + arg4) {
			Static38.method2711(arg0, arg4, arg5, arg1, arg3, arg2);
		} else {
			Static149.method2625(arg1, arg2, arg3, arg0, arg4, arg5);
		}
	}
}
