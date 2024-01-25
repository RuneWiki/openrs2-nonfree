import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static609 {

	@OriginalMember(owner = "client!uda", name = "g", descriptor = "[I")
	public static final int[] anIntArray626 = new int[200];

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "[I")
	public static final int[] anIntArray627 = new int[3];

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(BI)[[[B")
	public static byte[][][] method8383(@OriginalArg(1) int arg0) {
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
		@Pc(83) int local83;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local83 = 0; local83 < arg0; local83++) {
				if (local83 <= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(133) int local133;
		for (local83 = 0; local83 < arg0; local83++) {
			for (local133 = 0; local133 < arg0; local133++) {
				if (local133 >= local83) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(190) int local190;
		for (local133 = arg0 - 1; local133 >= 0; local133--) {
			for (local190 = 0; local190 < arg0; local190++) {
				if (local190 >= local133) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(245) int local245;
		for (local190 = arg0 - 1; local190 >= 0; local190--) {
			for (local245 = 0; local245 < arg0; local245++) {
				if (local190 >> 1 >= local245) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(304) int local304;
		for (local245 = 0; local245 < arg0; local245++) {
			for (local304 = 0; local304 < arg0; local304++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local304 >= local245 << 1) {
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
		@Pc(378) int local378;
		for (local304 = 0; local304 < arg0; local304++) {
			for (local378 = arg0 - 1; local378 >= 0; local378--) {
				if (local304 >> 1 >= local378) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(437) int local437;
		for (local378 = arg0 - 1; local378 >= 0; local378--) {
			for (local437 = arg0 - 1; local437 >= 0; local437--) {
				if (local378 << 1 <= local437) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(495) int local495;
		for (local437 = arg0 - 1; local437 >= 0; local437--) {
			for (local495 = arg0 - 1; local495 >= 0; local495--) {
				if (local495 <= local437 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(548) int local548;
		for (local495 = arg0 - 1; local495 >= 0; local495--) {
			for (local548 = 0; local548 < arg0; local548++) {
				if (local548 >= local495 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(599) int local599;
		for (local548 = 0; local548 < arg0; local548++) {
			for (local599 = 0; local599 < arg0; local599++) {
				if (local548 >> 1 >= local599) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(658) int local658;
		for (local599 = 0; local599 < arg0; local599++) {
			for (local658 = arg0 - 1; local658 >= 0; local658--) {
				if (local599 << 1 <= local658) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(711) int local711;
		for (local658 = arg0 - 1; local658 >= 0; local658--) {
			for (local711 = 0; local711 < arg0; local711++) {
				if (local658 >> 1 <= local711) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(767) int local767;
		for (local711 = 0; local711 < arg0; local711++) {
			for (local767 = 0; local767 < arg0; local767++) {
				if (local711 << 1 >= local767) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(830) int local830;
		for (local767 = 0; local767 < arg0; local767++) {
			for (local830 = arg0 - 1; local830 >= 0; local830--) {
				if (local767 >> 1 <= local830) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(882) int local882;
		for (local830 = arg0 - 1; local830 >= 0; local830--) {
			for (local882 = arg0 - 1; local882 >= 0; local882--) {
				if (local882 <= local830 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(940) int local940;
		for (local882 = arg0 - 1; local882 >= 0; local882--) {
			for (local940 = arg0 - 1; local940 >= 0; local940--) {
				if (local882 >> 1 <= local940) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(993) int local993;
		for (local940 = arg0 - 1; local940 >= 0; local940--) {
			for (local993 = 0; local993 < arg0; local993++) {
				if (local940 << 1 >= local993) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1041) int local1041;
		for (local993 = 0; local993 < arg0; local993++) {
			for (local1041 = 0; local1041 < arg0; local1041++) {
				if (local1041 >= local993 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1100) int local1100;
		for (local1041 = 0; local1041 < arg0; local1041++) {
			for (local1100 = arg0 - 1; local1100 >= 0; local1100--) {
				if (local1100 <= local1041 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1152) int local1152;
		for (local1100 = 0; local1100 < arg0; local1100++) {
			for (local1152 = 0; local1152 < arg0; local1152++) {
				if (arg0 / 2 >= local1152) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1207) int local1207;
		for (local1152 = 0; local1152 < arg0; local1152++) {
			for (local1207 = 0; local1207 < arg0; local1207++) {
				if (local1152 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		if (-105 != -105) {
			return null;
		}
		local18 = new byte[arg0 * arg0];
		@Pc(1270) int local1270;
		for (local1207 = 0; local1207 < arg0; local1207++) {
			for (local1270 = 0; local1270 < arg0; local1270++) {
				if (arg0 / 2 <= local1270) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1323) int local1323;
		for (local1270 = 0; local1270 < arg0; local1270++) {
			for (local1323 = 0; local1323 < arg0; local1323++) {
				if (arg0 / 2 <= local1270) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1380) int local1380;
		for (local1323 = 0; local1323 < arg0; local1323++) {
			for (local1380 = 0; local1380 < arg0; local1380++) {
				if (local1380 <= local1323 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1442) int local1442;
		for (local1380 = arg0 - 1; local1380 >= 0; local1380--) {
			for (local1442 = 0; local1442 < arg0; local1442++) {
				if (local1380 - arg0 / 2 >= local1442) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1505) int local1505;
		for (local1442 = arg0 - 1; local1442 >= 0; local1442--) {
			for (local1505 = arg0 - 1; local1505 >= 0; local1505--) {
				if (local1442 - arg0 / 2 >= local1505) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1564) int local1564;
		for (local1505 = 0; local1505 < arg0; local1505++) {
			for (local1564 = arg0 - 1; local1564 >= 0; local1564--) {
				if (local1564 <= local1505 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1621) int local1621;
		for (local1564 = 0; local1564 < arg0; local1564++) {
			for (local1621 = 0; local1621 < arg0; local1621++) {
				if (local1621 >= local1564 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1683) int local1683;
		for (local1621 = arg0 - 1; local1621 >= 0; local1621--) {
			for (local1683 = 0; local1683 < arg0; local1683++) {
				if (local1683 >= local1621 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1745) int local1745;
		for (local1683 = arg0 - 1; local1683 >= 0; local1683--) {
			for (local1745 = arg0 - 1; local1745 >= 0; local1745--) {
				if (local1745 >= local1683 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1745 = 0; local1745 < arg0; local1745++) {
			for (@Pc(1800) int local1800 = arg0 - 1; local1800 >= 0; local1800--) {
				if (local1800 >= local1745 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "(IIIIIIII)V")
	public static void method8395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg3 - arg1;
		@Pc(19) int local19 = arg5 - arg1;
		@Pc(23) int local23 = arg3 * arg3;
		@Pc(27) int local27 = arg5 * arg5;
		@Pc(31) int local31 = local15 * local15;
		@Pc(35) int local35 = local19 * local19;
		@Pc(39) int local39 = local27 << 1;
		@Pc(43) int local43 = local23 << 1;
		if (arg6 != 2038540545) {
			return;
		}
		@Pc(52) int local52 = local35 << 1;
		@Pc(56) int local56 = local31 << 1;
		@Pc(60) int local60 = arg5 << 1;
		@Pc(64) int local64 = local19 << 1;
		@Pc(73) int local73 = local23 * (1 - local60) + local39;
		@Pc(82) int local82 = local27 - (local60 - 1) * local43;
		@Pc(91) int local91 = local52 + (1 - local64) * local31;
		@Pc(100) int local100 = local35 - local56 * (local64 - 1);
		@Pc(104) int local104 = local23 << 2;
		@Pc(108) int local108 = local27 << 2;
		@Pc(112) int local112 = local31 << 2;
		@Pc(116) int local116 = local35 << 2;
		@Pc(120) int local120 = local39 * 3;
		@Pc(126) int local126 = local43 * (local60 - 3);
		@Pc(130) int local130 = local52 * 3;
		@Pc(136) int local136 = local56 * (local64 - 3);
		@Pc(138) int local138 = local108;
		@Pc(144) int local144 = (arg5 - 1) * local104;
		@Pc(146) int local146 = local116;
		@Pc(152) int local152 = (local19 - 1) * local112;
		@Pc(156) int[] local156 = Static36.anIntArrayArray4[arg0];
		Static367.method5559(arg6 ^ 0x867E56F8, arg4 - arg3, arg2, local156, arg4 - local15);
		Static367.method5559(-7, arg4 - local15, arg7, local156, local15 + arg4);
		Static367.method5559(-7, local15 + arg4, arg2, local156, arg3 + arg4);
		while (local9 > 0) {
			@Pc(206) boolean local206 = local19 >= local9;
			if (local206) {
				if (local91 < 0) {
					while (local91 < 0) {
						local100 += local146;
						local91 += local130;
						local11++;
						local130 += local116;
						local146 += local116;
					}
				}
				if (local100 < 0) {
					local100 += local146;
					local91 += local130;
					local146 += local116;
					local130 += local116;
					local11++;
				}
				local91 += -local152;
				local100 += -local136;
				local152 -= local112;
				local136 -= local112;
			}
			if (local73 < 0) {
				while (local73 < 0) {
					local73 += local120;
					local82 += local138;
					local138 += local108;
					local7++;
					local120 += local108;
				}
			}
			if (local82 < 0) {
				local82 += local138;
				local73 += local120;
				local138 += local108;
				local7++;
				local120 += local108;
			}
			local73 += -local144;
			local82 += -local126;
			local126 -= local104;
			local9--;
			local144 -= local104;
			@Pc(363) int local363 = arg0 - local9;
			@Pc(367) int local367 = local9 + arg0;
			@Pc(372) int local372 = arg4 + local7;
			@Pc(377) int local377 = arg4 - local7;
			if (local206) {
				@Pc(383) int local383 = local11 + arg4;
				@Pc(388) int local388 = arg4 - local11;
				Static367.method5559(-7, local377, arg2, Static36.anIntArrayArray4[local363], local388);
				Static367.method5559(-7, local388, arg7, Static36.anIntArrayArray4[local363], local383);
				Static367.method5559(-7, local383, arg2, Static36.anIntArrayArray4[local363], local372);
				Static367.method5559(-7, local377, arg2, Static36.anIntArrayArray4[local367], local388);
				Static367.method5559(-7, local388, arg7, Static36.anIntArrayArray4[local367], local383);
				Static367.method5559(-7, local383, arg2, Static36.anIntArrayArray4[local367], local372);
			} else {
				Static367.method5559(arg6 ^ 0x867E56F8, local377, arg2, Static36.anIntArrayArray4[local363], local372);
				Static367.method5559(arg6 ^ 0x867E56F8, local377, arg2, Static36.anIntArrayArray4[local367], local372);
			}
		}
	}
}
