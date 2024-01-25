import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "Lclient!ec;")
	public static Class40 aClass40_1;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZIIII)V")
	public static void method113(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21;
		if (arg2 > arg1) {
			for (local21 = arg1; local21 < arg2; local21++) {
				Static618.anIntArrayArray101[local21][arg0] = arg3;
			}
		} else {
			for (local21 = arg2; local21 < arg1; local21++) {
				Static618.anIntArrayArray101[local21][arg0] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)[[[B")
	public static byte[][][] method115(@OriginalArg(0) int arg0) {
		@Pc(7) byte[][][] local7 = new byte[8][4][];
		@Pc(16) byte[] local16 = new byte[arg0 * arg0];
		@Pc(18) int local18 = 0;
		@Pc(23) int local23;
		for (@Pc(20) int local20 = 0; local20 < arg0; local20++) {
			for (local23 = 0; local23 < arg0; local23++) {
				if (local20 >= local23) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(64) int local64;
		for (local23 = arg0 - 1; local23 >= 0; local23--) {
			for (local64 = 0; local64 < arg0; local64++) {
				if (local64 <= local23) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(102) int local102;
		for (local64 = 0; local64 < arg0; local64++) {
			for (local102 = 0; local102 < arg0; local102++) {
				if (local64 <= local102) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(143) int local143;
		for (local102 = arg0 - 1; local102 >= 0; local102--) {
			for (local143 = 0; local143 < arg0; local143++) {
				if (local102 <= local143) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(183) int local183;
		for (local143 = arg0 - 1; local143 >= 0; local143--) {
			for (local183 = 0; local183 < arg0; local183++) {
				if (local143 >> 1 >= local183) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[1][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(226) int local226;
		for (local183 = 0; local183 < arg0; local183++) {
			for (local226 = 0; local226 < arg0; local226++) {
				if (local18 >= 0 && local18 < local16.length) {
					if (local183 << 1 <= local226) {
						local16[local18] = -1;
					}
					local18++;
				} else {
					local18++;
				}
			}
		}
		local7[1][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(284) int local284;
		for (local226 = 0; local226 < arg0; local226++) {
			for (local284 = arg0 - 1; local284 >= 0; local284--) {
				if (local284 <= local226 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[1][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(328) int local328;
		for (local284 = arg0 - 1; local284 >= 0; local284--) {
			for (local328 = arg0 - 1; local328 >= 0; local328--) {
				if (local328 >= local284 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[1][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(371) int local371;
		for (local328 = arg0 - 1; local328 >= 0; local328--) {
			for (local371 = arg0 - 1; local371 >= 0; local371--) {
				if (local328 >> 1 >= local371) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(415) int local415;
		for (local371 = arg0 - 1; local371 >= 0; local371--) {
			for (local415 = 0; local415 < arg0; local415++) {
				if (local415 >= local371 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(458) int local458;
		for (local415 = 0; local415 < arg0; local415++) {
			for (local458 = 0; local458 < arg0; local458++) {
				if (local458 <= local415 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(501) int local501;
		for (local458 = 0; local458 < arg0; local458++) {
			for (local501 = arg0 - 1; local501 >= 0; local501--) {
				if (local458 << 1 <= local501) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(543) int local543;
		for (local501 = arg0 - 1; local501 >= 0; local501--) {
			for (local543 = 0; local543 < arg0; local543++) {
				if (local543 >= local501 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(583) int local583;
		for (local543 = 0; local543 < arg0; local543++) {
			for (local583 = 0; local583 < arg0; local583++) {
				if (local543 << 1 >= local583) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(630) int local630;
		for (local583 = 0; local583 < arg0; local583++) {
			for (local630 = arg0 - 1; local630 >= 0; local630--) {
				if (local583 >> 1 <= local630) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(681) int local681;
		for (local630 = arg0 - 1; local630 >= 0; local630--) {
			for (local681 = arg0 - 1; local681 >= 0; local681--) {
				if (local681 <= local630 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(727) int local727;
		for (local681 = arg0 - 1; local681 >= 0; local681--) {
			for (local727 = arg0 - 1; local727 >= 0; local727--) {
				if (local727 >= local681 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(774) int local774;
		for (local727 = arg0 - 1; local727 >= 0; local727--) {
			for (local774 = 0; local774 < arg0; local774++) {
				if (local774 <= local727 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(810) int local810;
		for (local774 = 0; local774 < arg0; local774++) {
			for (local810 = 0; local810 < arg0; local810++) {
				if (local774 >> 1 <= local810) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(857) int local857;
		for (local810 = 0; local810 < arg0; local810++) {
			for (local857 = arg0 - 1; local857 >= 0; local857--) {
				if (local857 <= local810 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(901) int local901;
		for (local857 = 0; local857 < arg0; local857++) {
			for (local901 = 0; local901 < arg0; local901++) {
				if (local901 <= arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(950) int local950;
		for (local901 = 0; local901 < arg0; local901++) {
			for (local950 = 0; local950 < arg0; local950++) {
				if (arg0 / 2 >= local901) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(995) int local995;
		for (local950 = 0; local950 < arg0; local950++) {
			for (local995 = 0; local995 < arg0; local995++) {
				if (arg0 / 2 <= local995) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1036) int local1036;
		for (local995 = 0; local995 < arg0; local995++) {
			for (local1036 = 0; local1036 < arg0; local1036++) {
				if (local995 >= arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1077) int local1077;
		for (local1036 = 0; local1036 < arg0; local1036++) {
			for (local1077 = 0; local1077 < arg0; local1077++) {
				if (local1036 - arg0 / 2 >= local1077) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1130) int local1130;
		for (local1077 = arg0 - 1; local1077 >= 0; local1077--) {
			for (local1130 = 0; local1130 < arg0; local1130++) {
				if (local1130 <= local1077 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1172) int local1172;
		for (local1130 = arg0 - 1; local1130 >= 0; local1130--) {
			for (local1172 = arg0 - 1; local1172 >= 0; local1172--) {
				if (local1172 <= local1130 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1214) int local1214;
		for (local1172 = 0; local1172 < arg0; local1172++) {
			for (local1214 = arg0 - 1; local1214 >= 0; local1214--) {
				if (local1214 <= local1172 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1255) int local1255;
		for (local1214 = 0; local1214 < arg0; local1214++) {
			for (local1255 = 0; local1255 < arg0; local1255++) {
				if (local1214 - arg0 / 2 <= local1255) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1305) int local1305;
		for (local1255 = arg0 - 1; local1255 >= 0; local1255--) {
			for (local1305 = 0; local1305 < arg0; local1305++) {
				if (local1255 - arg0 / 2 <= local1305) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1351) int local1351;
		for (local1305 = arg0 - 1; local1305 >= 0; local1305--) {
			for (local1351 = arg0 - 1; local1351 >= 0; local1351--) {
				if (local1351 >= local1305 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		for (local1351 = 0; local1351 < arg0; local1351++) {
			for (@Pc(1399) int local1399 = arg0 - 1; local1399 >= 0; local1399--) {
				if (local1399 >= local1351 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][3] = local16;
		return local7;
	}
}
