import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!to", name = "o", descriptor = "Lclient!fc;")
	public static Class71 aClass71_83;

	@OriginalMember(owner = "client!to", name = "t", descriptor = "I")
	public static int anInt6049;

	@OriginalMember(owner = "client!to", name = "m", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!to", name = "r", descriptor = "Z")
	public static final boolean aBoolean458 = false;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg3 && arg8 == arg6 && arg0 == arg2 && arg4 == arg5) {
			Static390.method5729(arg8, arg3, arg2, arg7, arg5);
			return;
		}
		@Pc(23) int local23 = arg3;
		@Pc(25) int local25 = arg8;
		@Pc(29) int local29 = arg3 * 3;
		@Pc(33) int local33 = arg8 * 3;
		@Pc(37) int local37 = arg1 * 3;
		@Pc(41) int local41 = arg6 * 3;
		@Pc(45) int local45 = arg0 * 3;
		@Pc(49) int local49 = arg4 * 3;
		@Pc(57) int local57 = local37 + arg2 - local45 - arg3;
		@Pc(68) int local68 = arg5 + local41 - local49 - arg8;
		@Pc(77) int local77 = local29 + local45 - local37 - local37;
		@Pc(87) int local87 = local33 + local49 - local41 - local41;
		@Pc(92) int local92 = local37 - local29;
		@Pc(97) int local97 = local41 - local33;
		for (@Pc(99) int local99 = 128; local99 <= 4096; local99 += 128) {
			@Pc(107) int local107 = local99 * local99 >> 12;
			@Pc(113) int local113 = local99 * local107 >> 12;
			@Pc(117) int local117 = local57 * local113;
			@Pc(121) int local121 = local113 * local68;
			@Pc(125) int local125 = local107 * local77;
			@Pc(129) int local129 = local107 * local87;
			@Pc(133) int local133 = local99 * local92;
			@Pc(137) int local137 = local97 * local99;
			@Pc(147) int local147 = arg3 + (local133 + local117 + local125 >> 12);
			@Pc(157) int local157 = (local137 + local121 + local129 >> 12) + arg8;
			Static390.method5729(local25, local23, local147, arg7, local157);
			local23 = local147;
			local25 = local157;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method5240(@OriginalArg(1) int arg0) {
		@Pc(9) byte[][][] local9 = new byte[8][4][];
		@Pc(18) byte[] local18 = new byte[arg0 * arg0];
		@Pc(20) int local20 = 0;
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
			for (local26 = 0; local26 < arg0; local26++) {
				if (local22 >= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(73) int local73;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local73 = 0; local73 < arg0; local73++) {
				if (local26 >= local73) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(112) int local112;
		for (local73 = 0; local73 < arg0; local73++) {
			for (local112 = 0; local112 < arg0; local112++) {
				if (local73 <= local112) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(151) int local151;
		for (local112 = arg0 - 1; local112 >= 0; local112--) {
			for (local151 = 0; local151 < arg0; local151++) {
				if (local151 >= local112) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(196) int local196;
		for (local151 = arg0 - 1; local151 >= 0; local151--) {
			for (local196 = 0; local196 < arg0; local196++) {
				if (local196 <= local151 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(249) int local249;
		for (local196 = 0; local196 < arg0; local196++) {
			for (local249 = 0; local249 < arg0; local249++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local249 >= local196 << 1) {
						local18[local20] = -1;
					}
					local20++;
				} else {
					local20++;
				}
			}
		}
		local9[1][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(310) int local310;
		for (local249 = 0; local249 < arg0; local249++) {
			for (local310 = arg0 - 1; local310 >= 0; local310--) {
				if (local249 >> 1 >= local310) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(363) int local363;
		for (local310 = arg0 - 1; local310 >= 0; local310--) {
			for (local363 = arg0 - 1; local363 >= 0; local363--) {
				if (local363 >= local310 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(404) int local404;
		for (local363 = arg0 - 1; local363 >= 0; local363--) {
			for (local404 = arg0 - 1; local404 >= 0; local404--) {
				if (local404 <= local363 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(453) int local453;
		for (local404 = arg0 - 1; local404 >= 0; local404--) {
			for (local453 = 0; local453 < arg0; local453++) {
				if (local404 << 1 <= local453) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(502) int local502;
		for (local453 = 0; local453 < arg0; local453++) {
			for (local502 = 0; local502 < arg0; local502++) {
				if (local453 >> 1 >= local502) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(555) int local555;
		for (local502 = 0; local502 < arg0; local502++) {
			for (local555 = arg0 - 1; local555 >= 0; local555--) {
				if (local555 >= local502 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(599) int local599;
		for (local555 = arg0 - 1; local555 >= 0; local555--) {
			for (local599 = 0; local599 < arg0; local599++) {
				if (local599 >= local555 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(641) int local641;
		for (local599 = 0; local599 < arg0; local599++) {
			for (local641 = 0; local641 < arg0; local641++) {
				if (local641 <= local599 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(690) int local690;
		for (local641 = 0; local641 < arg0; local641++) {
			for (local690 = arg0 - 1; local690 >= 0; local690--) {
				if (local690 >= local641 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(743) int local743;
		for (local690 = arg0 - 1; local690 >= 0; local690--) {
			for (local743 = arg0 - 1; local743 >= 0; local743--) {
				if (local690 << 1 >= local743) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(794) int local794;
		for (local743 = arg0 - 1; local743 >= 0; local743--) {
			for (local794 = arg0 - 1; local794 >= 0; local794--) {
				if (local743 >> 1 <= local794) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(840) int local840;
		for (local794 = arg0 - 1; local794 >= 0; local794--) {
			for (local840 = 0; local840 < arg0; local840++) {
				if (local840 <= local794 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(885) int local885;
		for (local840 = 0; local840 < arg0; local840++) {
			for (local885 = 0; local885 < arg0; local885++) {
				if (local840 >> 1 <= local885) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(930) int local930;
		for (local885 = 0; local885 < arg0; local885++) {
			for (local930 = arg0 - 1; local930 >= 0; local930--) {
				if (local885 << 1 >= local930) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(972) int local972;
		for (local930 = 0; local930 < arg0; local930++) {
			for (local972 = 0; local972 < arg0; local972++) {
				if (arg0 / 2 >= local972) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1019) int local1019;
		for (local972 = 0; local972 < arg0; local972++) {
			for (local1019 = 0; local1019 < arg0; local1019++) {
				if (local972 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1066) int local1066;
		for (local1019 = 0; local1019 < arg0; local1019++) {
			for (local1066 = 0; local1066 < arg0; local1066++) {
				if (local1066 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1109) int local1109;
		for (local1066 = 0; local1066 < arg0; local1066++) {
			for (local1109 = 0; local1109 < arg0; local1109++) {
				if (local1066 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1148) int local1148;
		for (local1109 = 0; local1109 < arg0; local1109++) {
			for (local1148 = 0; local1148 < arg0; local1148++) {
				if (local1109 - arg0 / 2 >= local1148) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1196) int local1196;
		for (local1148 = arg0 - 1; local1148 >= 0; local1148--) {
			for (local1196 = 0; local1196 < arg0; local1196++) {
				if (local1196 <= local1148 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1247) int local1247;
		for (local1196 = arg0 - 1; local1196 >= 0; local1196--) {
			for (local1247 = arg0 - 1; local1247 >= 0; local1247--) {
				if (local1196 - arg0 / 2 >= local1247) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1299) int local1299;
		for (local1247 = 0; local1247 < arg0; local1247++) {
			for (local1299 = arg0 - 1; local1299 >= 0; local1299--) {
				if (local1299 <= local1247 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1344) int local1344;
		for (local1299 = 0; local1299 < arg0; local1299++) {
			for (local1344 = 0; local1344 < arg0; local1344++) {
				if (local1299 - arg0 / 2 <= local1344) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1396) int local1396;
		for (local1344 = arg0 - 1; local1344 >= 0; local1344--) {
			for (local1396 = 0; local1396 < arg0; local1396++) {
				if (local1344 - arg0 / 2 <= local1396) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1449) int local1449;
		for (local1396 = arg0 - 1; local1396 >= 0; local1396--) {
			for (local1449 = arg0 - 1; local1449 >= 0; local1449--) {
				if (local1449 >= local1396 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1449 = 0; local1449 < arg0; local1449++) {
			for (@Pc(1495) int local1495 = arg0 - 1; local1495 >= 0; local1495--) {
				if (local1449 - arg0 / 2 <= local1495) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
