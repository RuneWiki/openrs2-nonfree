import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static26 {

	@OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
	public static int anInt4559;

	@OriginalMember(owner = "client!bm", name = "s", descriptor = "Lclient!bn;")
	public static Class2_Sub8_Sub1 aClass2_Sub8_Sub1_10;

	@OriginalMember(owner = "client!bm", name = "t", descriptor = "I")
	public static int anInt4562;

	@OriginalMember(owner = "client!bm", name = "v", descriptor = "Lclient!ek;")
	public static Class42 aClass42_70;

	@OriginalMember(owner = "client!bm", name = "n", descriptor = "I")
	public static int anInt4558 = 0;

	@OriginalMember(owner = "client!bm", name = "q", descriptor = "[I")
	public static int[] anIntArray453 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!bm", name = "z", descriptor = "I")
	public static int anInt4565 = 0;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IBIII)V")
	public static void method3692(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 - arg0 >= Static53.anInt1319 && arg0 + arg2 <= Static81.anInt1915 && Static148.anInt3245 <= arg3 - arg0 && Static166.anInt3675 >= arg0 + arg3) {
			Static295.method4524(arg0, arg3, arg1, arg2);
		} else {
			Static132.method2438(arg2, arg1, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(CB)C")
	public static char method3694(@OriginalArg(0) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB)I")
	public static int method3696(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
