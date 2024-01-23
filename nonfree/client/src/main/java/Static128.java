import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static128 {

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
	public static int anInt2844;

	@OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
	public static int anInt2846;

	@OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
	public static int anInt2850;

	@OriginalMember(owner = "client!jk", name = "p", descriptor = "[I")
	public static int[] anIntArray259 = new int[2500];

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
	public static void method2193() {
		Static283.aClass1_Sub11_Sub1_3.method2697(216);
		Static283.aClass1_Sub11_Sub1_3.method2660(Static61.anInt1305);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method2194(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 >= Static224.anInt4436 && arg0 <= Static68.anInt1451 && Static297.anInt5619 <= arg3 && arg5 <= Static49.anInt1129) {
			Static225.method3545(arg2, arg1, arg4, arg0, arg5, arg6, arg3);
		} else {
			Static24.method3646(arg0, arg1, arg5, arg3, arg2, arg4, arg6);
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method2196(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		Static283.aClass1_Sub11_Sub1_3.method2697(135);
		Static283.aClass1_Sub11_Sub1_3.method2645(arg1);
		Static283.aClass1_Sub11_Sub1_3.method2638(Static93.method1658(arg0));
	}
}
