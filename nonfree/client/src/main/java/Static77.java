import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!h", name = "ib", descriptor = "Lclient!ub;")
	public static Class99 aClass99_1;

	@OriginalMember(owner = "client!h", name = "kb", descriptor = "I")
	public static int anInt1688;

	@OriginalMember(owner = "client!h", name = "S", descriptor = "Lclient!qe;")
	public static Class78 aClass78_365 = Static199.method3560("zap");

	@OriginalMember(owner = "client!h", name = "W", descriptor = "Lclient!qe;")
	public static Class78 aClass78_366 = Static199.method3560("null");

	@OriginalMember(owner = "client!h", name = "X", descriptor = "Lclient!qe;")
	public static Class78 aClass78_367 = Static199.method3560("AUS");

	@OriginalMember(owner = "client!h", name = "cb", descriptor = "Lclient!qe;")
	private static Class78 aClass78_369 = Static199.method3560("Loading)3)3)3");

	@OriginalMember(owner = "client!h", name = "ab", descriptor = "Lclient!qe;")
	public static Class78 aClass78_368 = aClass78_369;

	@OriginalMember(owner = "client!h", name = "db", descriptor = "Lclient!qe;")
	public static Class78 aClass78_370 = Static199.method3560("<br>(X");

	@OriginalMember(owner = "client!h", name = "nb", descriptor = "I")
	public static int anInt1691 = 1;

	@OriginalMember(owner = "client!h", name = "i", descriptor = "(I)I")
	public static int method1310() {
		if (Static165.aDouble10 == 3.0D) {
			return 37;
		} else if (Static165.aDouble10 == 4.0D) {
			return 50;
		} else if (Static165.aDouble10 == 6.0D) {
			return 75;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method1311(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg0 - arg2;
		@Pc(21) int local21 = arg6 - arg2;
		@Pc(25) int local25 = arg0 * arg0;
		@Pc(29) int local29 = arg6 * arg6;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg6 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(71) int local71 = local25 * (1 - local57) + local41;
		@Pc(79) int local79 = local29 - local45 * (local57 - 1);
		@Pc(88) int local88 = local49 + local33 * (1 - local61);
		@Pc(97) int local97 = local37 - local53 * (local61 - 1);
		@Pc(101) int local101 = local25 << 2;
		@Pc(105) int local105 = local33 << 2;
		@Pc(115) int local115 = local37 << 2;
		@Pc(119) int local119 = local29 << 2;
		@Pc(123) int local123 = local41 * 3;
		@Pc(129) int local129 = local45 * (local57 - 3);
		@Pc(135) int local135 = local53 * (local61 - 3);
		@Pc(139) int local139 = local49 * 3;
		@Pc(141) int local141 = local119;
		@Pc(143) int local143 = local115;
		@Pc(149) int local149 = (arg6 - 1) * local101;
		@Pc(175) int local175;
		@Pc(184) int local184;
		@Pc(193) int local193;
		@Pc(201) int local201;
		if (arg3 >= Static73.anInt1576 && Static137.anInt3137 >= arg3) {
			@Pc(167) int[] local167 = Static183.anIntArrayArray40[arg3];
			local175 = Static80.method1342(arg5 - arg0, Static6.anInt187, Static101.anInt2213);
			local184 = Static80.method1342(arg5 + arg0, Static6.anInt187, Static101.anInt2213);
			local193 = Static80.method1342(arg5 - local16, Static6.anInt187, Static101.anInt2213);
			local201 = Static80.method1342(arg5 + local16, Static6.anInt187, Static101.anInt2213);
			Static221.method3893(arg4, local175, local167, local193);
			Static221.method3893(arg1, local193, local167, local201);
			Static221.method3893(arg4, local201, local167, local184);
		}
		@Pc(225) int local225 = (local21 - 1) * local105;
		while (local9 > 0) {
			if (local71 < 0) {
				while (local71 < 0) {
					local7++;
					local79 += local141;
					local141 += local119;
					local71 += local123;
					local123 += local119;
				}
			}
			if (local79 < 0) {
				local7++;
				local79 += local141;
				local141 += local119;
				local71 += local123;
				local123 += local119;
			}
			@Pc(286) boolean local286 = local9 <= local21;
			if (local286) {
				if (local88 < 0) {
					while (local88 < 0) {
						local88 += local139;
						local97 += local143;
						local11++;
						local143 += local115;
						local139 += local115;
					}
				}
				if (local97 < 0) {
					local88 += local139;
					local11++;
					local139 += local115;
					local97 += local143;
					local143 += local115;
				}
				local88 += -local225;
				local97 += -local135;
				local225 -= local105;
				local135 -= local105;
			}
			local79 += -local129;
			local9--;
			local184 = arg3 + local9;
			local129 -= local101;
			local71 += -local149;
			local149 -= local101;
			local175 = arg3 - local9;
			if (Static73.anInt1576 <= local184 && local175 <= Static137.anInt3137) {
				local193 = Static80.method1342(arg5 + local7, Static6.anInt187, Static101.anInt2213);
				local201 = Static80.method1342(arg5 - local7, Static6.anInt187, Static101.anInt2213);
				if (local286) {
					@Pc(423) int local423 = Static80.method1342(local11 + arg5, Static6.anInt187, Static101.anInt2213);
					@Pc(432) int local432 = Static80.method1342(arg5 - local11, Static6.anInt187, Static101.anInt2213);
					@Pc(439) int[] local439;
					if (local175 >= Static73.anInt1576) {
						local439 = Static183.anIntArrayArray40[local175];
						Static221.method3893(arg4, local201, local439, local432);
						Static221.method3893(arg1, local432, local439, local423);
						Static221.method3893(arg4, local423, local439, local193);
					}
					if (Static137.anInt3137 >= local184) {
						local439 = Static183.anIntArrayArray40[local184];
						Static221.method3893(arg4, local201, local439, local432);
						Static221.method3893(arg1, local432, local439, local423);
						Static221.method3893(arg4, local423, local439, local193);
					}
				} else {
					if (Static73.anInt1576 <= local175) {
						Static221.method3893(arg4, local201, Static183.anIntArrayArray40[local175], local193);
					}
					if (Static137.anInt3137 >= local184) {
						Static221.method3893(arg4, local201, Static183.anIntArrayArray40[local184], local193);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BII)I")
	public static int method1312(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0;
		} else {
			arg0 = arg0 * (arg1 & 0x7F) >> 7;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return (arg1 & 0xFF80) + arg0;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIII[B[III)V")
	public static void method1313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = -(arg8 >> 2);
		@Pc(15) int local15 = -(arg8 & 0x3);
		for (@Pc(18) int local18 = -arg0; local18 < 0; local18++) {
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				if (arg5[arg3++] == 0) {
					arg7++;
				} else {
					arg6[arg7++] = arg4;
				}
				if (arg5[arg3++] == 0) {
					arg7++;
				} else {
					arg6[arg7++] = arg4;
				}
				if (arg5[arg3++] == 0) {
					arg7++;
				} else {
					arg6[arg7++] = arg4;
				}
				if (arg5[arg3++] == 0) {
					arg7++;
				} else {
					arg6[arg7++] = arg4;
				}
			}
			for (@Pc(87) int local87 = local15; local87 < 0; local87++) {
				if (arg5[arg3++] == 0) {
					arg7++;
				} else {
					arg6[arg7++] = arg4;
				}
			}
			arg3 += arg1;
			arg7 += arg2;
		}
	}
}
