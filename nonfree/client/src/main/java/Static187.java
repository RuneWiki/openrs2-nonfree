import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!od", name = "q", descriptor = "[I")
	public static int[] anIntArray407;

	@OriginalMember(owner = "client!od", name = "r", descriptor = "Lclient!jh;")
	public static Class84 aClass84_4;

	@OriginalMember(owner = "client!od", name = "t", descriptor = "Lclient!ak;")
	public static Class7 aClass7_153;

	@OriginalMember(owner = "client!od", name = "n", descriptor = "[Lclient!dh;")
	public static Class36[] aClass36Array1 = new Class36[8];

	@OriginalMember(owner = "client!od", name = "B", descriptor = "I")
	public static int anInt3509 = 0;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIILclient!og;I)V")
	public static void method2822(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class127 arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg2 * arg2 + arg1 * arg1;
		if (arg4 < local9) {
			return;
		}
		@Pc(37) int local37 = Math.min(arg5.anInt3567 / 2, arg5.anInt3595 / 2);
		if (local9 <= local37 * local37) {
			Static103.method1654(arg2, arg1, arg5, arg6, Static51.aClass1_Sub2_Sub2Array2[arg3], arg0);
			return;
		}
		local37 -= 10;
		@Pc(62) int local62 = (int) Static177.aFloat97 + Static35.anInt746 & 0x7FF;
		@Pc(66) int local66 = Class135.anIntArray474[local62];
		@Pc(74) int local74 = local66 * 256 / (Static155.anInt2868 + 256);
		@Pc(78) int local78 = Class135.anIntArray472[local62];
		@Pc(86) int local86 = local78 * 256 / (Static155.anInt2868 + 256);
		@Pc(96) int local96 = arg1 * local86 + local74 * arg2 >> 16;
		@Pc(107) int local107 = local74 * arg1 - arg2 * local86 >> 16;
		@Pc(113) double local113 = Math.atan2((double) local96, (double) local107);
		@Pc(120) int local120 = (int) (Math.sin(local113) * (double) local37);
		@Pc(127) int local127 = (int) (Math.cos(local113) * (double) local37);
		if (Static240.aBoolean369) {
			((Class1_Sub2_Sub2_Sub2) Static136.aClass1_Sub2_Sub2Array7[arg3]).method3193((local120 + arg6 + arg5.anInt3567 / 2) * 16, (arg5.anInt3595 / 2 + arg0 - local127) * 16, (int) (local113 * 10430.378D));
		} else {
			((Class1_Sub2_Sub2_Sub1) Static136.aClass1_Sub2_Sub2Array7[arg3]).method3936(local120 + arg6 + arg5.anInt3567 / 2 - 10, arg0 - -(arg5.anInt3595 / 2) + -local127 + -10, local113);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BC)Z")
	public static boolean method2825(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "([IIJZ)Ljava/lang/String;")
	public static String method2826(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		if (Static229.anInterface5_1 != null) {
			@Pc(13) String local13 = Static229.anInterface5_1.method3765(arg2, arg0, arg1);
			if (local13 != null) {
				return local13;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(IIIII)V")
	public static void method2827(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub2_Sub11 local8 = Static163.method3579(8, arg2);
		local8.method1859();
		local8.anInt2274 = arg1;
		local8.anInt2282 = arg3;
		local8.anInt2279 = arg0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)I")
	public static int method2828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIILclient!ak;)[Lclient!rg;")
	public static Class48_Sub2[] method2832(@OriginalArg(0) int arg0, @OriginalArg(3) Class7 arg1) {
		return Static139.method2193(arg1, arg0, 0) ? Static164.method2496() : null;
	}
}
