import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!mi", name = "C", descriptor = "Lclient!lf;")
	public static Class145 aClass145_2 = null;

	@OriginalMember(owner = "client!mi", name = "E", descriptor = "Lclient!cs;")
	public static final Class42 aClass42_10 = new Class42();

	@OriginalMember(owner = "client!mi", name = "M", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_75 = new Class237(15, 8);

	@OriginalMember(owner = "client!mi", name = "N", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_76 = new Class237(84, -2);

	@OriginalMember(owner = "client!mi", name = "O", descriptor = "Z")
	public static boolean aBoolean305 = false;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB)[[[B")
	public static byte[][][] method3660(@OriginalArg(0) int arg0) {
		@Pc(9) byte[][][] local9 = new byte[8][4][];
		@Pc(18) byte[] local18 = new byte[arg0 * arg0];
		@Pc(20) int local20 = 0;
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
			for (local26 = 0; local26 < arg0; local26++) {
				if (local26 <= local22) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(69) int local69;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local69 = 0; local69 < arg0; local69++) {
				if (local69 <= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(113) int local113;
		for (local69 = 0; local69 < arg0; local69++) {
			for (local113 = 0; local113 < arg0; local113++) {
				if (local113 >= local69) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(156) int local156;
		for (local113 = arg0 - 1; local113 >= 0; local113--) {
			for (local156 = 0; local156 < arg0; local156++) {
				if (local156 >= local113) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(198) int local198;
		for (local156 = arg0 - 1; local156 >= 0; local156--) {
			for (local198 = 0; local198 < arg0; local198++) {
				if (local198 <= local156 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(247) int local247;
		for (local198 = 0; local198 < arg0; local198++) {
			for (local247 = 0; local247 < arg0; local247++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local198 << 1 <= local247) {
						local18[local20] = -1;
					}
					local20++;
				} else {
					local20++;
				}
			}
		}
		local9[1][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(304) int local304;
		for (local247 = 0; local247 < arg0; local247++) {
			for (local304 = arg0 - 1; local304 >= 0; local304--) {
				if (local304 <= local247 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(346) int local346;
		for (local304 = arg0 - 1; local304 >= 0; local304--) {
			for (local346 = arg0 - 1; local346 >= 0; local346--) {
				if (local304 << 1 <= local346) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(397) int local397;
		for (local346 = arg0 - 1; local346 >= 0; local346--) {
			for (local397 = arg0 - 1; local397 >= 0; local397--) {
				if (local397 <= local346 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(439) int local439;
		for (local397 = arg0 - 1; local397 >= 0; local397--) {
			for (local439 = 0; local439 < arg0; local439++) {
				if (local397 << 1 <= local439) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(477) int local477;
		for (local439 = 0; local439 < arg0; local439++) {
			for (local477 = 0; local477 < arg0; local477++) {
				if (local439 >> 1 >= local477) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(522) int local522;
		for (local477 = 0; local477 < arg0; local477++) {
			for (local522 = arg0 - 1; local522 >= 0; local522--) {
				if (local522 >= local477 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(566) int local566;
		for (local522 = arg0 - 1; local522 >= 0; local522--) {
			for (local566 = 0; local566 < arg0; local566++) {
				if (local522 >> 1 <= local566) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(608) int local608;
		for (local566 = 0; local566 < arg0; local566++) {
			for (local608 = 0; local608 < arg0; local608++) {
				if (local608 <= local566 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(666) int local666;
		for (local608 = 0; local608 < arg0; local608++) {
			for (local666 = arg0 - 1; local666 >= 0; local666--) {
				if (local666 >= local608 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(715) int local715;
		for (local666 = arg0 - 1; local666 >= 0; local666--) {
			for (local715 = arg0 - 1; local715 >= 0; local715--) {
				if (local666 << 1 >= local715) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(763) int local763;
		for (local715 = arg0 - 1; local715 >= 0; local715--) {
			for (local763 = arg0 - 1; local763 >= 0; local763--) {
				if (local715 >> 1 <= local763) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(809) int local809;
		for (local763 = arg0 - 1; local763 >= 0; local763--) {
			for (local809 = 0; local809 < arg0; local809++) {
				if (local809 <= local763 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(851) int local851;
		for (local809 = 0; local809 < arg0; local809++) {
			for (local851 = 0; local851 < arg0; local851++) {
				if (local851 >= local809 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(892) int local892;
		for (local851 = 0; local851 < arg0; local851++) {
			for (local892 = arg0 - 1; local892 >= 0; local892--) {
				if (local892 <= local851 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(934) int local934;
		for (local892 = 0; local892 < arg0; local892++) {
			for (local934 = 0; local934 < arg0; local934++) {
				if (arg0 / 2 >= local934) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(973) int local973;
		for (local934 = 0; local934 < arg0; local934++) {
			for (local973 = 0; local973 < arg0; local973++) {
				if (arg0 / 2 >= local934) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1024) int local1024;
		for (local973 = 0; local973 < arg0; local973++) {
			for (local1024 = 0; local1024 < arg0; local1024++) {
				if (local1024 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1067) int local1067;
		for (local1024 = 0; local1024 < arg0; local1024++) {
			for (local1067 = 0; local1067 < arg0; local1067++) {
				if (arg0 / 2 <= local1024) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1110) int local1110;
		for (local1067 = 0; local1067 < arg0; local1067++) {
			for (local1110 = 0; local1110 < arg0; local1110++) {
				if (local1067 - arg0 / 2 >= local1110) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1158) int local1158;
		for (local1110 = arg0 - 1; local1110 >= 0; local1110--) {
			for (local1158 = 0; local1158 < arg0; local1158++) {
				if (local1158 <= local1110 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1214) int local1214;
		for (local1158 = arg0 - 1; local1158 >= 0; local1158--) {
			for (local1214 = arg0 - 1; local1214 >= 0; local1214--) {
				if (local1214 <= local1158 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1266) int local1266;
		for (local1214 = 0; local1214 < arg0; local1214++) {
			for (local1266 = arg0 - 1; local1266 >= 0; local1266--) {
				if (local1266 <= local1214 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1315) int local1315;
		for (local1266 = 0; local1266 < arg0; local1266++) {
			for (local1315 = 0; local1315 < arg0; local1315++) {
				if (local1315 >= local1266 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1362) int local1362;
		for (local1315 = arg0 - 1; local1315 >= 0; local1315--) {
			for (local1362 = 0; local1362 < arg0; local1362++) {
				if (local1315 - arg0 / 2 <= local1362) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1411) int local1411;
		for (local1362 = arg0 - 1; local1362 >= 0; local1362--) {
			for (local1411 = arg0 - 1; local1411 >= 0; local1411--) {
				if (local1411 >= local1362 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1411 = 0; local1411 < arg0; local1411++) {
			for (@Pc(1459) int local1459 = arg0 - 1; local1459 >= 0; local1459--) {
				if (local1459 >= local1411 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
