import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
	public static int anInt4382;

	@OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
	public static int anInt4390;

	@OriginalMember(owner = "client!wl", name = "u", descriptor = "Lclient!cq;")
	public static Class8 aClass8_18;

	@OriginalMember(owner = "client!wl", name = "w", descriptor = "Lclient!lm;")
	public static Class134 aClass134_101;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIILclient!wm;IIIILclient!wm;I)V")
	public static void method3752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class10_Sub1_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) Class10_Sub1_Sub2 arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg5.method3406();
		if (local7 == -1) {
			return;
		}
		@Pc(22) Class8 local22 = (Class8) Static120.aClass37_41.method915((long) local7);
		if (local22 == null) {
			@Pc(29) Class201[] local29 = Static369.method5470(Static125.aClass134_55, local7);
			if (local29 == null) {
				return;
			}
			local22 = Static217.aClass105_5.method4238(local29[0]);
			Static120.aClass37_41.method922((long) local7, local22);
		}
		Static124.method1975(arg4 >> 1, arg2.anInt6728, arg0 >> 1, arg2.method3402() * 64, arg2.anInt6726, 0);
		@Pc(76) int local76 = arg6 + Static49.anIntArray493[0] - 18;
		@Pc(84) int local84 = Static49.anIntArray493[1] + arg1 - 70;
		@Pc(92) int local92 = local76 + arg3 / 4 * 18;
		@Pc(100) int local100 = local84 + arg3 % 4 * 18;
		local22.method4393(local92, local100);
		if (arg2 == arg5) {
			Static217.aClass105_5.method4293(18, local92 - 1, 18, -256, local100 - 1);
		}
		@Pc(122) Class7_Sub8 local122 = Static50.method1010();
		local122.aClass10_Sub1_Sub2_1 = arg5;
		local122.anInt4151 = local92;
		local122.anInt4147 = local100;
		local122.anInt4148 = local100 + 16;
		local122.anInt4149 = local92 + 16;
		Static340.aClass122_7.method2624(local122);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IB)Lclient!fk;")
	public static Class70 method3753(@OriginalArg(0) int arg0) {
		@Pc(10) Class70 local10 = (Class70) Static48.aClass37_22.method915((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static41.aClass134_21.method3009(arg0, 35);
		local10 = new Class70();
		if (local20 != null) {
			local10.method1400(new Class1_Sub21(local20));
		}
		local10.method1403();
		Static48.aClass37_22.method922((long) arg0, local10);
		return local10;
	}
}
