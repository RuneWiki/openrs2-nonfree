import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!iu", name = "Z", descriptor = "I")
	public static int anInt3614;

	@OriginalMember(owner = "client!iu", name = "db", descriptor = "I")
	public static int anInt3617;

	@OriginalMember(owner = "client!iu", name = "P", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_79 = new Class119(17, 8);

	@OriginalMember(owner = "client!iu", name = "bb", descriptor = "I")
	public static int anInt3616 = 1;

	@OriginalMember(owner = "client!iu", name = "cb", descriptor = "[I")
	public static final int[] anIntArray228 = new int[13];

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IB)[[[B")
	public static byte[][][] method2885(@OriginalArg(0) int arg0) {
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
		@Pc(112) int local112;
		for (local69 = 0; local69 < arg0; local69++) {
			for (local112 = 0; local112 < arg0; local112++) {
				if (local112 >= local69) {
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
				if (local112 <= local151) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(192) int local192;
		for (local151 = arg0 - 1; local151 >= 0; local151--) {
			for (local192 = 0; local192 < arg0; local192++) {
				if (local192 <= local151 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(241) int local241;
		for (local192 = 0; local192 < arg0; local192++) {
			for (local241 = 0; local241 < arg0; local241++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local241 >= local192 << 1) {
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
		@Pc(302) int local302;
		for (local241 = 0; local241 < arg0; local241++) {
			for (local302 = arg0 - 1; local302 >= 0; local302--) {
				if (local241 >> 1 >= local302) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(347) int local347;
		for (local302 = arg0 - 1; local302 >= 0; local302--) {
			for (local347 = arg0 - 1; local347 >= 0; local347--) {
				if (local302 << 1 <= local347) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(398) int local398;
		for (local347 = arg0 - 1; local347 >= 0; local347--) {
			for (local398 = arg0 - 1; local398 >= 0; local398--) {
				if (local347 >> 1 >= local398) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(440) int local440;
		for (local398 = arg0 - 1; local398 >= 0; local398--) {
			for (local440 = 0; local440 < arg0; local440++) {
				if (local398 << 1 <= local440) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(478) int local478;
		for (local440 = 0; local440 < arg0; local440++) {
			for (local478 = 0; local478 < arg0; local478++) {
				if (local440 >> 1 >= local478) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(532) int local532;
		for (local478 = 0; local478 < arg0; local478++) {
			for (local532 = arg0 - 1; local532 >= 0; local532--) {
				if (local478 << 1 <= local532) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(579) int local579;
		for (local532 = arg0 - 1; local532 >= 0; local532--) {
			for (local579 = 0; local579 < arg0; local579++) {
				if (local532 >> 1 <= local579) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(621) int local621;
		for (local579 = 0; local579 < arg0; local579++) {
			for (local621 = 0; local621 < arg0; local621++) {
				if (local621 <= local579 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(666) int local666;
		for (local621 = 0; local621 < arg0; local621++) {
			for (local666 = arg0 - 1; local666 >= 0; local666--) {
				if (local666 >= local621 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(719) int local719;
		for (local666 = arg0 - 1; local666 >= 0; local666--) {
			for (local719 = arg0 - 1; local719 >= 0; local719--) {
				if (local719 <= local666 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(763) int local763;
		for (local719 = arg0 - 1; local719 >= 0; local719--) {
			for (local763 = arg0 - 1; local763 >= 0; local763--) {
				if (local719 >> 1 <= local763) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(808) int local808;
		for (local763 = arg0 - 1; local763 >= 0; local763--) {
			for (local808 = 0; local808 < arg0; local808++) {
				if (local763 << 1 >= local808) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(853) int local853;
		for (local808 = 0; local808 < arg0; local808++) {
			for (local853 = 0; local853 < arg0; local853++) {
				if (local853 >= local808 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(902) int local902;
		for (local853 = 0; local853 < arg0; local853++) {
			for (local902 = arg0 - 1; local902 >= 0; local902--) {
				if (local853 << 1 >= local902) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(947) int local947;
		for (local902 = 0; local902 < arg0; local902++) {
			for (local947 = 0; local947 < arg0; local947++) {
				if (local947 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(986) int local986;
		for (local947 = 0; local947 < arg0; local947++) {
			for (local986 = 0; local986 < arg0; local986++) {
				if (arg0 / 2 >= local947) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1025) int local1025;
		for (local986 = 0; local986 < arg0; local986++) {
			for (local1025 = 0; local1025 < arg0; local1025++) {
				if (arg0 / 2 <= local1025) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1068) int local1068;
		for (local1025 = 0; local1025 < arg0; local1025++) {
			for (local1068 = 0; local1068 < arg0; local1068++) {
				if (local1025 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1111) int local1111;
		for (local1068 = 0; local1068 < arg0; local1068++) {
			for (local1111 = 0; local1111 < arg0; local1111++) {
				if (local1068 - arg0 / 2 >= local1111) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1159) int local1159;
		for (local1111 = arg0 - 1; local1111 >= 0; local1111--) {
			for (local1159 = 0; local1159 < arg0; local1159++) {
				if (local1111 - arg0 / 2 >= local1159) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1211) int local1211;
		for (local1159 = arg0 - 1; local1159 >= 0; local1159--) {
			for (local1211 = arg0 - 1; local1211 >= 0; local1211--) {
				if (local1159 - arg0 / 2 >= local1211) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1256) int local1256;
		for (local1211 = 0; local1211 < arg0; local1211++) {
			for (local1256 = arg0 - 1; local1256 >= 0; local1256--) {
				if (local1256 <= local1211 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1301) int local1301;
		for (local1256 = 0; local1256 < arg0; local1256++) {
			for (local1301 = 0; local1301 < arg0; local1301++) {
				if (local1256 - arg0 / 2 <= local1301) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1345) int local1345;
		for (local1301 = arg0 - 1; local1301 >= 0; local1301--) {
			for (local1345 = 0; local1345 < arg0; local1345++) {
				if (local1301 - arg0 / 2 <= local1345) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1401) int local1401;
		for (local1345 = arg0 - 1; local1345 >= 0; local1345--) {
			for (local1401 = arg0 - 1; local1401 >= 0; local1401--) {
				if (local1345 - arg0 / 2 <= local1401) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1401 = 0; local1401 < arg0; local1401++) {
			for (@Pc(1449) int local1449 = arg0 - 1; local1449 >= 0; local1449--) {
				if (local1449 >= local1401 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
