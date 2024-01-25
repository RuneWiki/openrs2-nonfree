import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static136 {

	@OriginalMember(owner = "client!hj", name = "o", descriptor = "[I")
	public static int[] anIntArray273;

	@OriginalMember(owner = "client!hj", name = "R", descriptor = "I")
	public static int anInt2618;

	@OriginalMember(owner = "client!hj", name = "J", descriptor = "Lclient!sh;")
	public static final Class213 aClass213_10 = new Class213("WIP", 2);

	@OriginalMember(owner = "client!hj", name = "K", descriptor = "Lclient!ku;")
	public static final Class139 aClass139_31 = new Class139(5);

	@OriginalMember(owner = "client!hj", name = "N", descriptor = "I")
	public static int anInt2615 = 0;

	@OriginalMember(owner = "client!hj", name = "S", descriptor = "Lclient!us;")
	public static final Class234 aClass234_56 = new Class234(69, 0);

	@OriginalMember(owner = "client!hj", name = "V", descriptor = "[I")
	public static final int[] anIntArray274 = new int[4096];

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILclient!rp;)Lclient!mo;")
	public static Class42_Sub2 method2193(@OriginalArg(1) Class3_Sub5 arg0) {
		return new Class42_Sub2(arg0.method2740(), arg0.method2740(), arg0.method2740(), arg0.method2740(), arg0.method2740(), arg0.method2740(), arg0.method2740(), arg0.method2740(), arg0.method2786(), arg0.method2739());
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZIIIIII)V")
	public static void method2195(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == arg0) {
			Static44.method697(arg5, arg2, arg3, arg1, arg4, arg6);
		} else if (Static221.anInt3917 <= arg1 - arg6 && arg6 + arg1 <= Static365.anInt6140 && Static26.anInt345 <= arg3 - arg0 && arg0 + arg3 <= Static272.anInt4750) {
			Static91.method2646(arg2, arg0, arg6, arg3, arg4, arg1, arg5);
		} else {
			Static90.method1498(arg3, arg2, arg5, arg6, arg4, arg1, arg0);
		}
	}
}
