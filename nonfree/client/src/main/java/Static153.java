import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!og", name = "f", descriptor = "Lclient!ud;")
	public static Class116 aClass116_4;

	@OriginalMember(owner = "client!og", name = "b", descriptor = "I")
	public static volatile int anInt3175 = 0;

	@OriginalMember(owner = "client!og", name = "e", descriptor = "Lclient!qc;")
	public static Class90 aClass90_16 = new Class90(16);

	@OriginalMember(owner = "client!og", name = "h", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1063 = Static186.method3527("K");

	@OriginalMember(owner = "client!og", name = "g", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1062 = aClass50_1063;

	@OriginalMember(owner = "client!og", name = "i", descriptor = "Lclient!ad;")
	public static Class4 aClass4_8 = new Class4(128);

	@OriginalMember(owner = "client!og", name = "j", descriptor = "S")
	public static short aShort26 = 1;

	@OriginalMember(owner = "client!og", name = "k", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1064 = aClass50_1063;

	@OriginalMember(owner = "client!og", name = "l", descriptor = "I")
	public static int anInt3178 = 0;

	@OriginalMember(owner = "client!og", name = "m", descriptor = "[I")
	public static int[] anIntArray329 = new int[5];

	@OriginalMember(owner = "client!og", name = "n", descriptor = "J")
	public static long aLong127 = 0L;

	@OriginalMember(owner = "client!og", name = "o", descriptor = "I")
	public static int anInt3179 = -1;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
	public static void method2554() {
		Static31.aClass84_12.method2585();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIILclient!ta;IJ)Z")
	public static boolean method2555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class20 arg6, @OriginalArg(8) long arg7) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static99.method3532(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, 0, false, arg7);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 == arg3 && arg7 == arg0 && arg2 == arg6 && arg1 == arg5) {
			Static30.method429(arg2, arg5, arg3, arg4, arg0);
			return;
		}
		@Pc(33) int local33 = arg3;
		@Pc(37) int local37 = arg3 * 3;
		@Pc(39) int local39 = arg0;
		@Pc(43) int local43 = arg0 * 3;
		@Pc(47) int local47 = arg8 * 3;
		@Pc(51) int local51 = arg7 * 3;
		@Pc(55) int local55 = arg6 * 3;
		@Pc(59) int local59 = arg1 * 3;
		@Pc(68) int local68 = arg5 + local51 - local59 - arg0;
		@Pc(79) int local79 = arg2 + local47 - arg3 - local55;
		@Pc(90) int local90 = local59 + local43 - local51 - local51;
		@Pc(100) int local100 = local37 + local55 - local47 - local47;
		@Pc(105) int local105 = local51 - local43;
		@Pc(110) int local110 = local47 - local37;
		for (@Pc(112) int local112 = 128; local112 <= 4096; local112 += 128) {
			@Pc(120) int local120 = local112 * local112 >> 12;
			@Pc(126) int local126 = local120 * local112 >> 12;
			@Pc(130) int local130 = local126 * local79;
			@Pc(134) int local134 = local68 * local126;
			@Pc(138) int local138 = local120 * local90;
			@Pc(142) int local142 = local120 * local100;
			@Pc(146) int local146 = local112 * local110;
			@Pc(157) int local157 = arg3 + (local146 + local142 + local130 >> 12);
			@Pc(161) int local161 = local112 * local105;
			@Pc(173) int local173 = (local134 + local138 + local161 >> 12) + arg0;
			Static30.method429(local157, local173, local33, arg4, local39);
			local33 = local157;
			local39 = local173;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III)Lclient!vd;")
	public static Class122 method2558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub11 local7 = Static56.aClass1_Sub11ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class122 local14 = local7.aClass122_1;
			local7.aClass122_1 = null;
			return local14;
		}
	}
}
