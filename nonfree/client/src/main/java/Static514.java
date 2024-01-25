import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static514 {

	@OriginalMember(owner = "client!to", name = "m", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_248 = new Class272(54, 7);

	@OriginalMember(owner = "client!to", name = "s", descriptor = "[I")
	public static final int[] anIntArray624 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!to", name = "v", descriptor = "[I")
	public static int[] anIntArray625 = new int[1];

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method6875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 == arg2 && arg5 == arg3 && arg6 == arg1 && arg4 == arg0) {
			Static129.method2557(arg4, arg7, arg2, arg3, arg6);
			return;
		}
		@Pc(35) int local35 = arg2;
		@Pc(37) int local37 = arg3;
		@Pc(41) int local41 = arg2 * 3;
		@Pc(45) int local45 = arg3 * 3;
		@Pc(49) int local49 = arg8 * 3;
		@Pc(53) int local53 = arg5 * 3;
		@Pc(57) int local57 = arg1 * 3;
		@Pc(61) int local61 = arg0 * 3;
		@Pc(71) int local71 = local49 + arg6 - arg2 - local57;
		@Pc(79) int local79 = arg4 + local53 - local61 - arg3;
		@Pc(88) int local88 = local41 + local57 - local49 - local49;
		@Pc(98) int local98 = local45 + local61 - local53 - local53;
		@Pc(103) int local103 = local49 - local41;
		@Pc(108) int local108 = local53 - local45;
		for (@Pc(110) int local110 = 128; local110 <= 4096; local110 += 128) {
			@Pc(118) int local118 = local110 * local110 >> 12;
			@Pc(124) int local124 = local118 * local110 >> 12;
			@Pc(128) int local128 = local71 * local124;
			@Pc(132) int local132 = local124 * local79;
			@Pc(136) int local136 = local118 * local88;
			@Pc(140) int local140 = local118 * local98;
			@Pc(144) int local144 = local110 * local103;
			@Pc(148) int local148 = local108 * local110;
			@Pc(160) int local160 = arg2 + (local128 + local136 + local144 >> 12);
			@Pc(171) int local171 = arg3 + (local148 + local132 + local140 >> 12);
			Static129.method2557(local171, arg7, local35, local37, local160);
			local37 = local171;
			local35 = local160;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method6876(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static85.method1848("\n", arg0, "%0a"));
	}
}
