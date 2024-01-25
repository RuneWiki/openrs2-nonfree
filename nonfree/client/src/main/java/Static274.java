import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!je", name = "e", descriptor = "[I")
	public static int[] anIntArray337;

	@OriginalMember(owner = "client!je", name = "k", descriptor = "I")
	public static int anInt5127;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)[[[B")
	public static byte[][][] method4352(@OriginalArg(1) int arg0) {
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
		@Pc(116) int local116;
		for (local69 = 0; local69 < arg0; local69++) {
			for (local116 = 0; local116 < arg0; local116++) {
				if (local116 >= local69) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(167) int local167;
		for (local116 = arg0 - 1; local116 >= 0; local116--) {
			for (local167 = 0; local167 < arg0; local167++) {
				if (local116 <= local167) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(213) int local213;
		for (local167 = arg0 - 1; local167 >= 0; local167--) {
			for (local213 = 0; local213 < arg0; local213++) {
				if (local167 >> 1 >= local213) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(259) int local259;
		for (local213 = 0; local213 < arg0; local213++) {
			for (local259 = 0; local259 < arg0; local259++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local259 >= local213 << 1) {
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
		@Pc(313) int local313;
		for (local259 = 0; local259 < arg0; local259++) {
			for (local313 = arg0 - 1; local313 >= 0; local313--) {
				if (local259 >> 1 >= local313) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(363) int local363;
		for (local313 = arg0 - 1; local313 >= 0; local313--) {
			for (local363 = arg0 - 1; local363 >= 0; local363--) {
				if (local313 << 1 <= local363) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(411) int local411;
		for (local363 = arg0 - 1; local363 >= 0; local363--) {
			for (local411 = arg0 - 1; local411 >= 0; local411--) {
				if (local363 >> 1 >= local411) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(456) int local456;
		for (local411 = arg0 - 1; local411 >= 0; local411--) {
			for (local456 = 0; local456 < arg0; local456++) {
				if (local456 >= local411 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(501) int local501;
		for (local456 = 0; local456 < arg0; local456++) {
			for (local501 = 0; local501 < arg0; local501++) {
				if (local501 <= local456 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(542) int local542;
		for (local501 = 0; local501 < arg0; local501++) {
			for (local542 = arg0 - 1; local542 >= 0; local542--) {
				if (local501 << 1 <= local542) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(589) int local589;
		for (local542 = arg0 - 1; local542 >= 0; local542--) {
			for (local589 = 0; local589 < arg0; local589++) {
				if (local542 >> 1 <= local589) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(635) int local635;
		for (local589 = 0; local589 < arg0; local589++) {
			for (local635 = 0; local635 < arg0; local635++) {
				if (local589 << 1 >= local635) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(680) int local680;
		for (local635 = 0; local635 < arg0; local635++) {
			for (local680 = arg0 - 1; local680 >= 0; local680--) {
				if (local635 >> 1 <= local680) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(729) int local729;
		for (local680 = arg0 - 1; local680 >= 0; local680--) {
			for (local729 = arg0 - 1; local729 >= 0; local729--) {
				if (local729 <= local680 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(773) int local773;
		for (local729 = arg0 - 1; local729 >= 0; local729--) {
			for (local773 = arg0 - 1; local773 >= 0; local773--) {
				if (local773 >= local729 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(818) int local818;
		for (local773 = arg0 - 1; local773 >= 0; local773--) {
			for (local818 = 0; local818 < arg0; local818++) {
				if (local773 << 1 >= local818) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(860) int local860;
		for (local818 = 0; local818 < arg0; local818++) {
			for (local860 = 0; local860 < arg0; local860++) {
				if (local860 >= local818 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(909) int local909;
		for (local860 = 0; local860 < arg0; local860++) {
			for (local909 = arg0 - 1; local909 >= 0; local909--) {
				if (local909 <= local860 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(958) int local958;
		for (local909 = 0; local909 < arg0; local909++) {
			for (local958 = 0; local958 < arg0; local958++) {
				if (arg0 / 2 >= local958) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1001) int local1001;
		for (local958 = 0; local958 < arg0; local958++) {
			for (local1001 = 0; local1001 < arg0; local1001++) {
				if (arg0 / 2 >= local958) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1044) int local1044;
		for (local1001 = 0; local1001 < arg0; local1001++) {
			for (local1044 = 0; local1044 < arg0; local1044++) {
				if (arg0 / 2 <= local1044) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1083) int local1083;
		for (local1044 = 0; local1044 < arg0; local1044++) {
			for (local1083 = 0; local1083 < arg0; local1083++) {
				if (local1044 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1122) int local1122;
		for (local1083 = 0; local1083 < arg0; local1083++) {
			for (local1122 = 0; local1122 < arg0; local1122++) {
				if (local1122 <= local1083 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1170) int local1170;
		for (local1122 = arg0 - 1; local1122 >= 0; local1122--) {
			for (local1170 = 0; local1170 < arg0; local1170++) {
				if (local1122 - arg0 / 2 >= local1170) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1218) int local1218;
		for (local1170 = arg0 - 1; local1170 >= 0; local1170--) {
			for (local1218 = arg0 - 1; local1218 >= 0; local1218--) {
				if (local1218 <= local1170 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1262) int local1262;
		for (local1218 = 0; local1218 < arg0; local1218++) {
			for (local1262 = arg0 - 1; local1262 >= 0; local1262--) {
				if (local1218 - arg0 / 2 >= local1262) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1311) int local1311;
		for (local1262 = 0; local1262 < arg0; local1262++) {
			for (local1311 = 0; local1311 < arg0; local1311++) {
				if (local1262 - arg0 / 2 <= local1311) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1367) int local1367;
		for (local1311 = arg0 - 1; local1311 >= 0; local1311--) {
			for (local1367 = 0; local1367 < arg0; local1367++) {
				if (local1311 - arg0 / 2 <= local1367) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1419) int local1419;
		for (local1367 = arg0 - 1; local1367 >= 0; local1367--) {
			for (local1419 = arg0 - 1; local1419 >= 0; local1419--) {
				if (local1367 - arg0 / 2 <= local1419) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1419 = 0; local1419 < arg0; local1419++) {
			for (@Pc(1468) int local1468 = arg0 - 1; local1468 >= 0; local1468--) {
				if (local1419 - arg0 / 2 <= local1468) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(ZI)V")
	public static void method4354(@OriginalArg(0) boolean arg0) {
		if (Static12.aClass124_1 == null) {
			Static482.method6862();
		}
		if (arg0) {
			Static12.aClass124_1.method2772();
		}
	}
}
