import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!uo", name = "O", descriptor = "Lclient!iq;")
	public static Class104 aClass104_176;

	@OriginalMember(owner = "client!uo", name = "Q", descriptor = "J")
	public static long aLong202 = -1L;

	@OriginalMember(owner = "client!uo", name = "S", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_150 = new Class140("M", "M", "M", "M");

	@OriginalMember(owner = "client!uo", name = "T", descriptor = "Z")
	public static boolean aBoolean580 = false;

	@OriginalMember(owner = "client!uo", name = "U", descriptor = "Z")
	public static boolean aBoolean581 = false;

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "(I)Z")
	public static boolean method5446() {
		return Static230.anInt5823 == 0 ? Static349.aClass2_Sub11_Sub1_5.method1425() : true;
	}

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(III)I")
	public static int method5447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static211.anIntArray493[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BIIIIIII)V")
	public static void method5448(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg2 - arg0;
		@Pc(20) int local20 = arg1 - arg0;
		@Pc(28) int local28 = arg2 * arg2;
		@Pc(32) int local32 = arg1 * arg1;
		@Pc(36) int local36 = local16 * local16;
		@Pc(40) int local40 = local20 * local20;
		@Pc(44) int local44 = local32 << 1;
		@Pc(48) int local48 = local28 << 1;
		@Pc(52) int local52 = local40 << 1;
		@Pc(56) int local56 = local36 << 1;
		@Pc(60) int local60 = arg1 << 1;
		@Pc(64) int local64 = local20 << 1;
		@Pc(72) int local72 = local44 + (1 - local60) * local28;
		@Pc(81) int local81 = local32 - local48 * (local60 - 1);
		@Pc(90) int local90 = local52 + local36 * (1 - local64);
		@Pc(99) int local99 = local40 - (local64 - 1) * local56;
		@Pc(103) int local103 = local28 << 2;
		@Pc(107) int local107 = local32 << 2;
		@Pc(111) int local111 = local36 << 2;
		@Pc(115) int local115 = local40 << 2;
		@Pc(119) int local119 = local44 * 3;
		@Pc(125) int local125 = (local60 - 3) * local48;
		@Pc(129) int local129 = local52 * 3;
		@Pc(135) int local135 = (local64 - 3) * local56;
		@Pc(137) int local137 = local107;
		@Pc(143) int local143 = local103 * (arg1 - 1);
		@Pc(145) int local145 = local115;
		@Pc(151) int local151 = (local20 - 1) * local111;
		@Pc(155) int[] local155 = Static364.anIntArrayArray57[arg4];
		Static115.method2278(local155, arg6 - local16, arg3, arg6 - arg2);
		Static115.method2278(local155, local16 + arg6, arg5, arg6 - local16);
		Static115.method2278(local155, arg2 + arg6, arg3, arg6 + local16);
		while (local9 > 0) {
			@Pc(202) boolean local202 = local9 <= local20;
			if (local72 < 0) {
				while (local72 < 0) {
					local81 += local137;
					local72 += local119;
					local119 += local107;
					local7++;
					local137 += local107;
				}
			}
			if (local202) {
				if (local90 < 0) {
					while (local90 < 0) {
						local90 += local129;
						local99 += local145;
						local11++;
						local129 += local115;
						local145 += local115;
					}
				}
				if (local99 < 0) {
					local99 += local145;
					local90 += local129;
					local11++;
					local129 += local115;
					local145 += local115;
				}
				local90 += -local151;
				local99 += -local135;
				local135 -= local111;
				local151 -= local111;
			}
			if (local81 < 0) {
				local72 += local119;
				local81 += local137;
				local119 += local107;
				local137 += local107;
				local7++;
			}
			local72 += -local143;
			local81 += -local125;
			local143 -= local103;
			local125 -= local103;
			local9--;
			@Pc(336) int local336 = arg4 - local9;
			@Pc(341) int local341 = arg4 + local9;
			@Pc(345) int local345 = local7 + arg6;
			@Pc(349) int local349 = arg6 - local7;
			if (local202) {
				@Pc(355) int local355 = local11 + arg6;
				@Pc(360) int local360 = arg6 - local11;
				Static115.method2278(Static364.anIntArrayArray57[local336], local360, arg3, local349);
				Static115.method2278(Static364.anIntArrayArray57[local336], local355, arg5, local360);
				Static115.method2278(Static364.anIntArrayArray57[local336], local345, arg3, local355);
				Static115.method2278(Static364.anIntArrayArray57[local341], local360, arg3, local349);
				Static115.method2278(Static364.anIntArrayArray57[local341], local355, arg5, local360);
				Static115.method2278(Static364.anIntArrayArray57[local341], local345, arg3, local355);
			} else {
				Static115.method2278(Static364.anIntArrayArray57[local336], local345, arg3, local349);
				Static115.method2278(Static364.anIntArrayArray57[local341], local345, arg3, local349);
			}
		}
	}

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "(III)Ljava/lang/String;")
	public static String method5450(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 - arg1;
		if (local7 < -9) {
			return "<col=ff0000>";
		} else if (local7 < -6) {
			return "<col=ff3000>";
		} else if (local7 < -3) {
			return "<col=ff7000>";
		} else if (local7 < 0) {
			return "<col=ffb000>";
		} else if (local7 > 9) {
			return "<col=00ff00>";
		} else if (local7 > 6) {
			return "<col=40ff00>";
		} else if (local7 > 3) {
			return "<col=80ff00>";
		} else if (local7 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}
}
