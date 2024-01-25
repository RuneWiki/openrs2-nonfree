import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static374 {

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "F")
	public static float aFloat76;

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_238 = new Class62("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "[I")
	public static final int[] anIntArray578 = new int[2048];

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIBII)V")
	public static void method5936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 >= Static179.anInt3768 && Static121.anInt6758 >= arg4 && arg3 >= Static317.anInt5793 && Static69.anInt1551 >= arg2) {
			if (arg0 == 1) {
				Static133.method2330(arg2, arg1, arg5, arg3, arg4);
			} else {
				Static265.method4509(arg4, arg2, arg5, arg1, arg0, arg3);
			}
		} else if (arg0 == 1) {
			Static70.method1263(arg2, arg1, arg4, arg5, arg3);
		} else {
			Static9.method96(arg1, arg0, arg2, arg3, arg5, arg4);
		}
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(IIIIBII)V")
	public static void method5937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static68.anInt1511 = arg1;
		Static91.anInt1959 = arg3;
		Static349.anInt6420 = arg0;
		Static127.anInt2769 = arg5;
		Static128.anInt2778 = arg2;
		Static337.anInt6240 = arg4;
	}
}
