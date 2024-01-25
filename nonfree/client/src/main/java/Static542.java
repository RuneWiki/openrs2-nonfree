import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static542 {

	@OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
	public static int anInt9307;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)Z")
	public static boolean method7784(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 20 || arg0 == 1002 || arg0 == 50 || arg0 == 19;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BZZII)V")
	public static void method7788(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static179.method3539(arg2, 0, arg3, arg0, Static199.aClass116_Sub1Array1.length - 1, arg1);
		Static24.anInt8439 = 0;
		Static109.aClass6_Sub47_1 = null;
	}
}
