import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "D")
	public static double aDouble11;

	@OriginalMember(owner = "client!ni", name = "j", descriptor = "[I")
	public static int[] anIntArray284;

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_839 = Static181.method2795("Loading config )2 ");

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_840 = Static181.method2795("::noclip");

	@OriginalMember(owner = "client!ni", name = "n", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_843 = Static181.method2795("wishes to trade with you)3");

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "Lclient!qe;")
	public static Class83 aClass83_841 = aClass83_843;

	@OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
	public static int anInt2840 = 0;

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
	public static int anInt2843 = 0;

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "Lclient!qe;")
	public static Class83 aClass83_842 = aClass83_839;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!ra;ILclient!qe;)I")
	public static int method2187(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) Class83 arg1) {
		@Pc(6) int local6 = arg0.anInt340;
		arg0.method270(arg1.anInt3158);
		arg0.anInt340 += Static161.aClass55_2.method1690(arg1.aByteArray36, arg0.anInt340, arg1.anInt3158, 0, arg0.aByteArray2);
		return arg0.anInt340 - local6;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIII)V")
	public static void method2188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 == arg4) {
			Static80.method1452(arg0, arg3, arg1, arg2);
		} else if (arg1 - arg2 >= Static209.anInt4155 && arg1 + arg2 <= Static36.anInt940 && Static147.anInt4074 <= arg0 - arg4 && arg4 + arg0 <= Static61.anInt1501) {
			Static149.method2328(arg4, arg3, arg1, arg2, arg0);
		} else {
			Static15.method341(arg2, arg1, arg0, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(IIIIII)V")
	public static void method2190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static172.aClass29Array7[0].method1184(arg0, arg3);
		@Pc(13) int local13 = arg4 * (arg4 - 32) / arg2;
		Static172.aClass29Array7[1].method1184(arg0, arg4 + arg3 - 16);
		if (local13 < 8) {
			local13 = 8;
		}
		@Pc(42) int local42 = arg1 * (arg4 - local13 - 32) / (arg2 - arg4);
		Static126.method2138(arg0, arg3 + 16, 16, arg4 - 32, Static49.anInt1261);
		Static126.method2138(arg0, arg3 + local42 + 16, 16, local13, Static204.anInt4029);
		Static126.method2137(arg0, local42 + arg3 + 16, local13, Static109.anInt2537);
		Static126.method2137(arg0 + 1, local42 + 16 + arg3, local13, Static109.anInt2537);
		Static126.method2132(arg0, local42 + arg3 + 16, 16, Static109.anInt2537);
		Static126.method2132(arg0, arg3 + local42 + 17, 16, Static109.anInt2537);
		Static126.method2137(arg0 + 15, local42 + 16 + arg3, local13, Static85.anInt1873);
		Static126.method2137(arg0 + 14, local42 + arg3 + 17, local13 - 1, Static85.anInt1873);
		Static126.method2132(arg0, local13 + local42 + arg3 + 15, 16, Static85.anInt1873);
		Static126.method2132(arg0 + 1, local13 + local42 + arg3 + 14, 15, Static85.anInt1873);
	}
}
