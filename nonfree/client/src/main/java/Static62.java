import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cs", name = "j", descriptor = "I")
	public static int anInt1134 = 0;

	@OriginalMember(owner = "client!cs", name = "q", descriptor = "[I")
	public static final int[] anIntArray49 = new int[2048];

	@OriginalMember(owner = "client!cs", name = "bb", descriptor = "J")
	public static long aLong44 = 0L;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!um;B)V")
	public static void method973(@OriginalArg(0) Class243 arg0) {
		Static243.anInt3933 = 0;
		Static81.anInt1470 = 0;
		Static348.aClass107_11 = new Class107();
		Static459.aClass88_Sub1_Sub1_Sub1Array2 = new Class88_Sub1_Sub1_Sub1[1024];
		Static82.method1225(arg0);
		Static207.method2772(arg0);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIZIIIII)V")
	public static void method988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg4 - arg1;
		@Pc(20) int local20 = arg2 - arg1;
		@Pc(24) int local24 = arg4 * arg4;
		@Pc(28) int local28 = arg2 * arg2;
		@Pc(32) int local32 = local15 * local15;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg2 << 1;
		@Pc(64) int local64 = local20 << 1;
		@Pc(74) int local74 = (1 - local56) * local24 + local40;
		@Pc(82) int local82 = local28 - local44 * (local56 - 1);
		@Pc(92) int local92 = (1 - local64) * local32 + local48;
		@Pc(101) int local101 = local36 - (local64 - 1) * local52;
		@Pc(105) int local105 = local24 << 2;
		@Pc(109) int local109 = local28 << 2;
		@Pc(113) int local113 = local32 << 2;
		@Pc(117) int local117 = local36 << 2;
		@Pc(121) int local121 = local40 * 3;
		@Pc(127) int local127 = local44 * (local56 - 3);
		@Pc(131) int local131 = local48 * 3;
		@Pc(137) int local137 = local52 * (local64 - 3);
		@Pc(139) int local139 = local109;
		@Pc(145) int local145 = local105 * (arg2 - 1);
		@Pc(147) int local147 = local117;
		@Pc(153) int local153 = (local20 - 1) * local113;
		@Pc(157) int[] local157 = Static133.anIntArrayArray15[arg6];
		Static291.method3606(arg3 - local15, local157, arg0, arg3 - arg4);
		Static291.method3606(arg3 + local15, local157, arg5, arg3 - local15);
		Static291.method3606(arg3 + arg4, local157, arg0, local15 + arg3);
		while (local9 > 0) {
			@Pc(205) boolean local205 = local9 <= local20;
			if (local74 < 0) {
				while (local74 < 0) {
					local82 += local139;
					local74 += local121;
					local139 += local109;
					local7++;
					local121 += local109;
				}
			}
			if (local205) {
				if (local92 < 0) {
					while (local92 < 0) {
						local101 += local147;
						local92 += local131;
						local11++;
						local147 += local117;
						local131 += local117;
					}
				}
				if (local101 < 0) {
					local92 += local131;
					local101 += local147;
					local147 += local117;
					local131 += local117;
					local11++;
				}
				local92 += -local153;
				local101 += -local137;
				local137 -= local113;
				local153 -= local113;
			}
			if (local82 < 0) {
				local74 += local121;
				local82 += local139;
				local121 += local109;
				local7++;
				local139 += local109;
			}
			local82 += -local127;
			local74 += -local145;
			local145 -= local105;
			local9--;
			local127 -= local105;
			@Pc(339) int local339 = arg6 - local9;
			@Pc(343) int local343 = local9 + arg6;
			@Pc(347) int local347 = arg3 + local7;
			@Pc(352) int local352 = arg3 - local7;
			if (local205) {
				@Pc(376) int local376 = arg3 + local11;
				@Pc(381) int local381 = arg3 - local11;
				Static291.method3606(local381, Static133.anIntArrayArray15[local339], arg0, local352);
				Static291.method3606(local376, Static133.anIntArrayArray15[local339], arg5, local381);
				Static291.method3606(local347, Static133.anIntArrayArray15[local339], arg0, local376);
				Static291.method3606(local381, Static133.anIntArrayArray15[local343], arg0, local352);
				Static291.method3606(local376, Static133.anIntArrayArray15[local343], arg5, local381);
				Static291.method3606(local347, Static133.anIntArrayArray15[local343], arg0, local376);
			} else {
				Static291.method3606(local347, Static133.anIntArrayArray15[local339], arg0, local352);
				Static291.method3606(local347, Static133.anIntArrayArray15[local343], arg0, local352);
			}
		}
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)I")
	public static int method989() {
		return 2;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIIII)V")
	public static void method990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static51.method805(arg5);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg5 - arg3;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg5;
		@Pc(27) int local27 = -arg5;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		@Pc(40) int[] local40 = Static133.anIntArrayArray15[arg1];
		@Pc(52) int local52 = arg0 - local15;
		Static291.method3606(local52, local40, arg2, arg0 - arg5);
		@Pc(65) int local65 = local15 + arg0;
		Static291.method3606(local65, local40, arg4, local52);
		Static291.method3606(arg5 + arg0, local40, arg2, local65);
		while (local10 < local24) {
			local34 += 2;
			local36 += 2;
			local32 += local36;
			local27 += local34;
			if (local32 >= 0 && local29 >= 1) {
				Static426.anIntArray479[local29] = local10;
				local29--;
				local32 -= local29 << 1;
			}
			local10++;
			@Pc(125) int[] local125;
			@Pc(132) int[] local132;
			@Pc(137) int local137;
			@Pc(141) int local141;
			@Pc(180) int local180;
			@Pc(184) int local184;
			@Pc(188) int local188;
			if (local27 >= 0) {
				local24--;
				if (local24 >= local15) {
					local125 = Static133.anIntArrayArray15[local24 + arg1];
					local132 = Static133.anIntArrayArray15[arg1 - local24];
					local137 = arg0 + local10;
					local141 = arg0 - local10;
					Static291.method3606(local137, local125, arg2, local141);
					Static291.method3606(local137, local132, arg2, local141);
				} else {
					local125 = Static133.anIntArrayArray15[local24 + arg1];
					local132 = Static133.anIntArrayArray15[arg1 - local24];
					local137 = Static426.anIntArray479[local24];
					local141 = arg0 + local10;
					local180 = arg0 - local10;
					local184 = local137 + arg0;
					local188 = arg0 - local137;
					Static291.method3606(local188, local125, arg2, local180);
					Static291.method3606(local184, local125, arg4, local188);
					Static291.method3606(local141, local125, arg2, local184);
					Static291.method3606(local188, local132, arg2, local180);
					Static291.method3606(local184, local132, arg4, local188);
					Static291.method3606(local141, local132, arg2, local184);
				}
				local27 -= local24 << 1;
			}
			local125 = Static133.anIntArrayArray15[arg1 + local10];
			local132 = Static133.anIntArrayArray15[arg1 - local10];
			local137 = arg0 + local24;
			local141 = arg0 - local24;
			if (local15 <= local10) {
				Static291.method3606(local137, local125, arg2, local141);
				Static291.method3606(local137, local132, arg2, local141);
			} else {
				local180 = local10 <= local29 ? local29 : Static426.anIntArray479[local10];
				local184 = arg0 + local180;
				local188 = arg0 - local180;
				Static291.method3606(local188, local125, arg2, local141);
				Static291.method3606(local184, local125, arg4, local188);
				Static291.method3606(local137, local125, arg2, local184);
				Static291.method3606(local188, local132, arg2, local141);
				Static291.method3606(local184, local132, arg4, local188);
				Static291.method3606(local137, local132, arg2, local184);
			}
		}
	}
}
