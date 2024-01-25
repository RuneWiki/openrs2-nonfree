import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!ib", name = "Ud", descriptor = "Lclient!pja;")
	public static Class6_Sub4_Sub12 aClass6_Sub4_Sub12_2;

	@OriginalMember(owner = "client!ib", name = "sd", descriptor = "I")
	public static int anInt4181 = 0;

	@OriginalMember(owner = "client!ib", name = "Nd", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_159 = new Class179(6, 1);

	@OriginalMember(owner = "client!ib", name = "ee", descriptor = "[I")
	public static final int[] anIntArray251 = new int[4096];

	@OriginalMember(owner = "client!ib", name = "fe", descriptor = "J")
	public static final long aLong124 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg6 && arg0 == arg2 && arg8 == arg5 && arg3 == arg7) {
			Static186.method2661(arg7, arg6, arg1, arg8, arg2);
			return;
		}
		@Pc(32) int local32 = arg6;
		@Pc(34) int local34 = arg2;
		@Pc(38) int local38 = arg6 * 3;
		@Pc(42) int local42 = arg2 * 3;
		@Pc(46) int local46 = arg4 * 3;
		@Pc(50) int local50 = arg0 * 3;
		@Pc(54) int local54 = arg5 * 3;
		@Pc(58) int local58 = arg3 * 3;
		@Pc(69) int local69 = arg8 + local46 - arg6 - local54;
		@Pc(79) int local79 = arg7 + local50 - local58 - arg2;
		@Pc(88) int local88 = local54 + local38 - local46 - local46;
		@Pc(98) int local98 = local58 + local42 - local50 - local50;
		@Pc(103) int local103 = local46 - local38;
		@Pc(107) int local107 = local50 - local42;
		for (@Pc(109) int local109 = 128; local109 <= 4096; local109 += 128) {
			@Pc(117) int local117 = local109 * local109 >> 12;
			@Pc(123) int local123 = local117 * local109 >> 12;
			@Pc(127) int local127 = local123 * local69;
			@Pc(131) int local131 = local79 * local123;
			@Pc(135) int local135 = local117 * local88;
			@Pc(139) int local139 = local117 * local98;
			@Pc(143) int local143 = local103 * local109;
			@Pc(147) int local147 = local109 * local107;
			@Pc(157) int local157 = (local143 + local135 + local127 >> 12) + arg6;
			@Pc(168) int local168 = (local131 + local139 + local147 >> 12) + arg2;
			Static186.method2661(local168, local32, arg1, local157, local34);
			local32 = local157;
			local34 = local168;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!pb;)I")
	public static int method3518(@OriginalArg(1) Class265 arg0) {
		if (Static289.aClass265_13 == arg0) {
			return 6407;
		} else if (Static169.aClass265_9 == arg0) {
			return 6408;
		} else if (Static447.aClass265_15 == arg0) {
			return 6406;
		} else if (Static356.aClass265_14 == arg0) {
			return 6409;
		} else if (arg0 == Static98.aClass265_16) {
			return 6410;
		} else if (Static662.aClass265_19 == arg0) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZI)Z")
	public static boolean method3521(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static210.method3100(arg0, arg1) & Static390.method5564(arg0, arg1);
	}
}
