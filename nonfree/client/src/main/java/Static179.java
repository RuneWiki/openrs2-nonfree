import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "[Lclient!fca;")
	public static Class108[] aClass108Array5;

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
	public static int anInt3138 = 2;

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
	public static int anInt3141 = 0;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BI)[B")
	public static byte[] method2870(@OriginalArg(1) int arg0) {
		@Pc(19) Class3_Sub7_Sub12 local19 = (Class3_Sub7_Sub12) Static207.aClass214_1.method4927((long) arg0);
		if (local19 == null) {
			@Pc(24) byte[] local24 = new byte[512];
			@Pc(30) Random local30 = new Random((long) arg0);
			for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
				local24[local32] = (byte) local32;
			}
			for (@Pc(47) int local47 = 0; local47 < 255; local47++) {
				@Pc(56) int local56 = 255 - local47;
				@Pc(63) int local63 = Static19.method614(local30, local56);
				@Pc(67) byte local67 = local24[local63];
				local24[local63] = local24[local56];
				local24[local56] = local24[511 - local47] = local67;
			}
			local19 = new Class3_Sub7_Sub12(local24);
			Static207.aClass214_1.method4928(local19, (long) arg0);
		}
		return local19.aByteArray46;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IZ)[[[B")
	public static byte[][][] method2871(@OriginalArg(0) int arg0) {
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
		@Pc(79) int local79;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local79 = 0; local79 < arg0; local79++) {
				if (local26 >= local79) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(129) int local129;
		for (local79 = 0; local79 < arg0; local79++) {
			for (local129 = 0; local129 < arg0; local129++) {
				if (local79 <= local129) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(190) int local190;
		for (local129 = arg0 - 1; local129 >= 0; local129--) {
			for (local190 = 0; local190 < arg0; local190++) {
				if (local129 <= local190) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(246) int local246;
		for (local190 = arg0 - 1; local190 >= 0; local190--) {
			for (local246 = 0; local246 < arg0; local246++) {
				if (local246 <= local190 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(298) int local298;
		for (local246 = 0; local246 < arg0; local246++) {
			for (local298 = 0; local298 < arg0; local298++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local298 >= local246 << 1) {
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
		@Pc(379) int local379;
		for (local298 = 0; local298 < arg0; local298++) {
			for (local379 = arg0 - 1; local379 >= 0; local379--) {
				if (local298 >> 1 >= local379) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(434) int local434;
		for (local379 = arg0 - 1; local379 >= 0; local379--) {
			for (local434 = arg0 - 1; local434 >= 0; local434--) {
				if (local434 >= local379 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(489) int local489;
		for (local434 = arg0 - 1; local434 >= 0; local434--) {
			for (local489 = arg0 - 1; local489 >= 0; local489--) {
				if (local434 >> 1 >= local489) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(545) int local545;
		for (local489 = arg0 - 1; local489 >= 0; local489--) {
			for (local545 = 0; local545 < arg0; local545++) {
				if (local545 >= local489 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(600) int local600;
		for (local545 = 0; local545 < arg0; local545++) {
			for (local600 = 0; local600 < arg0; local600++) {
				if (local545 >> 1 >= local600) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(659) int local659;
		for (local600 = 0; local600 < arg0; local600++) {
			for (local659 = arg0 - 1; local659 >= 0; local659--) {
				if (local659 >= local600 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(716) int local716;
		for (local659 = arg0 - 1; local659 >= 0; local659--) {
			for (local716 = 0; local716 < arg0; local716++) {
				if (local716 >= local659 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(773) int local773;
		for (local716 = 0; local716 < arg0; local716++) {
			for (local773 = 0; local773 < arg0; local773++) {
				if (local773 <= local716 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		if (false) {
			return null;
		}
		@Pc(834) int local834;
		for (local773 = 0; local773 < arg0; local773++) {
			for (local834 = arg0 - 1; local834 >= 0; local834--) {
				if (local834 >= local773 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(890) int local890;
		for (local834 = arg0 - 1; local834 >= 0; local834--) {
			for (local890 = arg0 - 1; local890 >= 0; local890--) {
				if (local890 <= local834 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(944) int local944;
		for (local890 = arg0 - 1; local890 >= 0; local890--) {
			for (local944 = arg0 - 1; local944 >= 0; local944--) {
				if (local890 >> 1 <= local944) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(993) int local993;
		for (local944 = arg0 - 1; local944 >= 0; local944--) {
			for (local993 = 0; local993 < arg0; local993++) {
				if (local944 << 1 >= local993) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1048) int local1048;
		for (local993 = 0; local993 < arg0; local993++) {
			for (local1048 = 0; local1048 < arg0; local1048++) {
				if (local993 >> 1 <= local1048) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1107) int local1107;
		for (local1048 = 0; local1048 < arg0; local1048++) {
			for (local1107 = arg0 - 1; local1107 >= 0; local1107--) {
				if (local1048 << 1 >= local1107) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1159) int local1159;
		for (local1107 = 0; local1107 < arg0; local1107++) {
			for (local1159 = 0; local1159 < arg0; local1159++) {
				if (arg0 / 2 >= local1159) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1212) int local1212;
		for (local1159 = 0; local1159 < arg0; local1159++) {
			for (local1212 = 0; local1212 < arg0; local1212++) {
				if (local1159 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1265) int local1265;
		for (local1212 = 0; local1212 < arg0; local1212++) {
			for (local1265 = 0; local1265 < arg0; local1265++) {
				if (arg0 / 2 <= local1265) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1322) int local1322;
		for (local1265 = 0; local1265 < arg0; local1265++) {
			for (local1322 = 0; local1322 < arg0; local1322++) {
				if (local1265 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1383) int local1383;
		for (local1322 = 0; local1322 < arg0; local1322++) {
			for (local1383 = 0; local1383 < arg0; local1383++) {
				if (local1322 - arg0 / 2 >= local1383) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1441) int local1441;
		for (local1383 = arg0 - 1; local1383 >= 0; local1383--) {
			for (local1441 = 0; local1441 < arg0; local1441++) {
				if (local1441 <= local1383 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1507) int local1507;
		for (local1441 = arg0 - 1; local1441 >= 0; local1441--) {
			for (local1507 = arg0 - 1; local1507 >= 0; local1507--) {
				if (local1507 <= local1441 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1563) int local1563;
		for (local1507 = 0; local1507 < arg0; local1507++) {
			for (local1563 = arg0 - 1; local1563 >= 0; local1563--) {
				if (local1507 - arg0 / 2 >= local1563) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1617) int local1617;
		for (local1563 = 0; local1563 < arg0; local1563++) {
			for (local1617 = 0; local1617 < arg0; local1617++) {
				if (local1563 - arg0 / 2 <= local1617) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1675) int local1675;
		for (local1617 = arg0 - 1; local1617 >= 0; local1617--) {
			for (local1675 = 0; local1675 < arg0; local1675++) {
				if (local1617 - arg0 / 2 <= local1675) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1730) int local1730;
		for (local1675 = arg0 - 1; local1675 >= 0; local1675--) {
			for (local1730 = arg0 - 1; local1730 >= 0; local1730--) {
				if (local1675 - arg0 / 2 <= local1730) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1730 = 0; local1730 < arg0; local1730++) {
			for (@Pc(1784) int local1784 = arg0 - 1; local1784 >= 0; local1784--) {
				if (local1784 >= local1730 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
