import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
	public static int anInt3601;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "Lclient!sj;")
	public static Class190 aClass190_1;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "[I")
	public static final int[] anIntArray329 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
	public static int anInt3605 = 255;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BIIIIII)Lclient!ts;")
	public static Class114 method3361(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg2 * 76724863L ^ (long) arg5 * 32147369L ^ (long) arg1 * 986053L ^ (long) arg4 * 67481L ^ (long) arg0 * 97549L ^ (long) arg3 * 475427L;
		@Pc(44) Class114 local44 = (Class114) Static103.aClass87_20.method2482(local33);
		if (local44 == null) {
			local44 = Static324.aClass32_14.method2215(arg4, arg0, arg3, arg1, arg5, arg2);
			Static103.aClass87_20.method2481(local44, local33);
			return local44;
		} else {
			return local44;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLclient!a;Lclient!wo;Lclient!wo;Lclient!wo;)Z")
	public static boolean method3362(@OriginalArg(1) Class1_Sub1_Sub1 arg0, @OriginalArg(2) Class216 arg1, @OriginalArg(3) Class216 arg2, @OriginalArg(4) Class216 arg3) {
		Static37.aClass1_Sub1_Sub1_1 = arg0;
		Static214.aClass216_73 = arg1;
		Static46.aClass216_11 = arg2;
		Static291.aClass216_90 = arg3;
		return true;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 == arg2 && arg5 == arg0 && arg7 == arg4 && arg3 == arg6) {
			Static182.method3597(arg2, arg5, arg1, arg3, arg7);
			return;
		}
		@Pc(32) int local32 = arg2;
		@Pc(34) int local34 = arg5;
		@Pc(38) int local38 = arg2 * 3;
		@Pc(42) int local42 = arg5 * 3;
		@Pc(46) int local46 = arg8 * 3;
		@Pc(50) int local50 = arg0 * 3;
		@Pc(54) int local54 = arg4 * 3;
		@Pc(58) int local58 = arg6 * 3;
		@Pc(68) int local68 = local46 + arg7 - local54 - arg2;
		@Pc(77) int local77 = local50 + arg3 - local58 - arg5;
		@Pc(87) int local87 = local38 + local54 - local46 - local46;
		@Pc(97) int local97 = local42 + local58 - local50 - local50;
		@Pc(101) int local101 = local46 - local38;
		@Pc(106) int local106 = local50 - local42;
		for (@Pc(108) int local108 = 128; local108 <= 4096; local108 += 128) {
			@Pc(116) int local116 = local108 * local108 >> 12;
			@Pc(122) int local122 = local108 * local116 >> 12;
			@Pc(126) int local126 = local122 * local68;
			@Pc(130) int local130 = local77 * local122;
			@Pc(134) int local134 = local116 * local87;
			@Pc(138) int local138 = local97 * local116;
			@Pc(142) int local142 = local101 * local108;
			@Pc(146) int local146 = local106 * local108;
			@Pc(157) int local157 = arg2 + (local142 + local126 + local134 >> 12);
			@Pc(167) int local167 = (local146 + local138 + local130 >> 12) + arg5;
			Static182.method3597(local32, local34, arg1, local167, local157);
			local32 = local157;
			local34 = local167;
		}
	}
}
