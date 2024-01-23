import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "Lclient!pj;")
	public static Class138 aClass138_2;

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
	public static int anInt2712 = 0;

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString155 = "Mechscape is loading - please wait...";

	@OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
	public static int anInt2716 = 0;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!nk;BLclient!nk;)V")
	public static void method2337(@OriginalArg(0) Class121 arg0, @OriginalArg(2) Class121 arg1) {
		Static279.aClass121_123 = arg0;
		Static102.aClass121_51 = arg1;
		Static102.aClass121_51.method3125(34);
		@Pc(19) int local19 = (int) (Math.random() * 21.0D) - 10;
		@Pc(26) int local26 = (int) (Math.random() * 21.0D) - 10;
		@Pc(33) int local33 = (int) (Math.random() * 21.0D) - 10;
		@Pc(40) int local40 = (int) (Math.random() * 41.0D) - 20;
		Static308.anInt5494 = local26 + local40;
		Static225.anInt4140 = local33 + local40;
		Static310.anInt5668 = local40 + local19;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IB)V")
	public static void method2338() {
		Static296.aClass187_148.method4534(5);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIBIII)V")
	public static void method2342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg5 - arg0;
		@Pc(17) int local17 = arg4 - arg0;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = arg4 * arg4;
		@Pc(27) int local27 = local17 * local17;
		@Pc(31) int local31 = arg5 * arg5;
		@Pc(35) int local35 = local13 * local13;
		@Pc(39) int local39 = local31 << 1;
		@Pc(43) int local43 = local35 << 1;
		@Pc(47) int local47 = local27 << 1;
		@Pc(51) int local51 = local17 << 1;
		@Pc(55) int local55 = local23 << 1;
		@Pc(59) int local59 = arg4 << 1;
		@Pc(68) int local68 = local31 * (1 - local59) + local55;
		@Pc(77) int local77 = local23 - (local59 - 1) * local39;
		@Pc(86) int local86 = (1 - local51) * local35 + local47;
		@Pc(95) int local95 = local27 - (local51 - 1) * local43;
		@Pc(99) int local99 = local31 << 2;
		@Pc(107) int local107 = local23 << 2;
		@Pc(111) int local111 = local35 << 2;
		@Pc(115) int local115 = local27 << 2;
		@Pc(121) int local121 = (local59 - 3) * local39;
		@Pc(123) int local123 = local107;
		@Pc(127) int local127 = local47 * 3;
		@Pc(131) int local131 = local55 * 3;
		@Pc(137) int local137 = local43 * (local51 - 3);
		@Pc(143) int local143 = (arg4 - 1) * local99;
		@Pc(145) int local145 = local115;
		@Pc(151) int local151 = local111 * (local17 - 1);
		@Pc(155) int[] local155 = Static183.anIntArrayArray26[arg3];
		Static273.method4257(arg1 - arg5, local155, arg2, arg1 - local13);
		Static273.method4257(arg1 - local13, local155, arg6, local13 + arg1);
		Static273.method4257(local13 + arg1, local155, arg2, arg5 + arg1);
		while (local9 > 0) {
			@Pc(201) boolean local201 = local9 <= local17;
			local9--;
			@Pc(206) int local206 = arg3 + local9;
			@Pc(210) int local210 = arg3 - local9;
			if (local201) {
				if (local86 < 0) {
					while (local86 < 0) {
						local95 += local145;
						local86 += local127;
						local127 += local115;
						local19++;
						local145 += local115;
					}
				}
				if (local95 < 0) {
					local95 += local145;
					local145 += local115;
					local86 += local127;
					local127 += local115;
					local19++;
				}
				local86 += -local151;
				local95 += -local137;
				local151 -= local111;
				local137 -= local111;
			}
			if (local68 < 0) {
				while (local68 < 0) {
					local68 += local131;
					local77 += local123;
					local131 += local107;
					local123 += local107;
					local7++;
				}
			}
			if (local77 < 0) {
				local68 += local131;
				local7++;
				local131 += local107;
				local77 += local123;
				local123 += local107;
			}
			@Pc(329) int local329 = arg1 + local7;
			local68 += -local143;
			local143 -= local99;
			local77 += -local121;
			@Pc(348) int local348 = arg1 - local7;
			if (local201) {
				@Pc(372) int local372 = arg1 - local19;
				@Pc(376) int local376 = local19 + arg1;
				Static273.method4257(local348, Static183.anIntArrayArray26[local210], arg2, local372);
				Static273.method4257(local372, Static183.anIntArrayArray26[local210], arg6, local376);
				Static273.method4257(local376, Static183.anIntArrayArray26[local210], arg2, local329);
				Static273.method4257(local348, Static183.anIntArrayArray26[local206], arg2, local372);
				Static273.method4257(local372, Static183.anIntArrayArray26[local206], arg6, local376);
				Static273.method4257(local376, Static183.anIntArrayArray26[local206], arg2, local329);
			} else {
				Static273.method4257(local348, Static183.anIntArrayArray26[local210], arg2, local329);
				Static273.method4257(local348, Static183.anIntArrayArray26[local206], arg2, local329);
			}
			local121 -= local99;
		}
	}
}
