import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "[I")
	public static int[] anIntArray241;

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
	public static int anInt4476 = 0;

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "[I")
	public static final int[] anIntArray240 = new int[50];

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIZIIIIIII)V")
	public static void method3882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 >= Static469.anInt4270 && arg4 <= Static325.anInt5516 && Static469.anInt4270 <= arg6 && arg6 <= Static325.anInt5516 && Static469.anInt4270 <= arg8 && Static325.anInt5516 >= arg8 && Static469.anInt4270 <= arg7 && arg7 <= Static325.anInt5516 && Static395.anInt6904 <= arg0 && Static561.anInt2703 >= arg0 && arg1 >= Static395.anInt6904 && arg1 <= Static561.anInt2703 && arg2 >= Static395.anInt6904 && arg2 <= Static561.anInt2703 && Static395.anInt6904 <= arg3 && Static561.anInt2703 >= arg3) {
			Static467.method6467(arg2, arg1, arg4, arg5, arg0, arg3, arg6, arg7, arg8);
		} else {
			Static119.method2462(arg7, arg1, arg2, arg8, arg6, arg3, arg5, arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BLclient!wp;)V")
	public static void method3883(@OriginalArg(1) Class361 arg0) {
		@Pc(7) Class361 local7 = Static418.method5948(arg0);
		@Pc(17) int local17;
		@Pc(20) int local20;
		if (local7 == null) {
			local20 = Static308.anInt5171;
			local17 = Static40.anInt758;
		} else {
			local17 = local7.anInt9668;
			local20 = local7.anInt9650;
		}
		Static572.method7700(local17, local20, arg0, false);
		Static531.method7100(arg0, local20, local17);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!wn;)I")
	public static int method3888(@OriginalArg(1) Class41_Sub2_Sub1_Sub4_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt9555;
		@Pc(17) Class365 local17 = arg0.method7861();
		if (arg0.aBoolean739) {
			local8 = arg0.anInt9549;
		} else if (local17.anInt9746 == arg0.anInt9512 || local17.anInt9727 == arg0.anInt9512 || arg0.anInt9512 == local17.anInt9733 || arg0.anInt9512 == local17.anInt9761) {
			local8 = arg0.anInt9541;
		} else if (local17.anInt9747 == arg0.anInt9512 || arg0.anInt9512 == local17.anInt9730 || arg0.anInt9512 == local17.anInt9728 || arg0.anInt9512 == local17.anInt9729) {
			local8 = arg0.anInt9567;
		}
		return local8;
	}
}
