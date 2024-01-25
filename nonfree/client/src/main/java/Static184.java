import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!j", name = "b", descriptor = "Lclient!uu;")
	public static Class250 aClass250_56;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "Z")
	public static boolean aBoolean255 = false;

	@OriginalMember(owner = "client!j", name = "g", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray6 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IB)[[[B")
	public static byte[][][] method2900(@OriginalArg(0) int arg0) {
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
		@Pc(73) int local73;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local73 = 0; local73 < arg0; local73++) {
				if (local73 <= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(121) int local121;
		for (local73 = 0; local73 < arg0; local73++) {
			for (local121 = 0; local121 < arg0; local121++) {
				if (local73 <= local121) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(160) int local160;
		for (local121 = arg0 - 1; local121 >= 0; local121--) {
			for (local160 = 0; local160 < arg0; local160++) {
				if (local160 >= local121) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(202) int local202;
		for (local160 = arg0 - 1; local160 >= 0; local160--) {
			for (local202 = 0; local202 < arg0; local202++) {
				if (local160 >> 1 >= local202) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(244) int local244;
		for (local202 = 0; local202 < arg0; local202++) {
			for (local244 = 0; local244 < arg0; local244++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local202 << 1 <= local244) {
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
		@Pc(305) int local305;
		for (local244 = 0; local244 < arg0; local244++) {
			for (local305 = arg0 - 1; local305 >= 0; local305--) {
				if (local244 >> 1 >= local305) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(351) int local351;
		for (local305 = arg0 - 1; local305 >= 0; local305--) {
			for (local351 = arg0 - 1; local351 >= 0; local351--) {
				if (local305 << 1 <= local351) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(392) int local392;
		for (local351 = arg0 - 1; local351 >= 0; local351--) {
			for (local392 = arg0 - 1; local392 >= 0; local392--) {
				if (local351 >> 1 >= local392) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(431) int local431;
		for (local392 = arg0 - 1; local392 >= 0; local392--) {
			for (local431 = 0; local431 < arg0; local431++) {
				if (local431 >= local392 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(476) int local476;
		for (local431 = 0; local431 < arg0; local431++) {
			for (local476 = 0; local476 < arg0; local476++) {
				if (local431 >> 1 >= local476) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(529) int local529;
		for (local476 = 0; local476 < arg0; local476++) {
			for (local529 = arg0 - 1; local529 >= 0; local529--) {
				if (local529 >= local476 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(576) int local576;
		for (local529 = arg0 - 1; local529 >= 0; local529--) {
			for (local576 = 0; local576 < arg0; local576++) {
				if (local576 >= local529 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(618) int local618;
		for (local576 = 0; local576 < arg0; local576++) {
			for (local618 = 0; local618 < arg0; local618++) {
				if (local576 << 1 >= local618) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(663) int local663;
		for (local618 = 0; local618 < arg0; local618++) {
			for (local663 = arg0 - 1; local663 >= 0; local663--) {
				if (local663 >= local618 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(716) int local716;
		for (local663 = arg0 - 1; local663 >= 0; local663--) {
			for (local716 = arg0 - 1; local716 >= 0; local716--) {
				if (local663 << 1 >= local716) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(760) int local760;
		for (local716 = arg0 - 1; local716 >= 0; local716--) {
			for (local760 = arg0 - 1; local760 >= 0; local760--) {
				if (local716 >> 1 <= local760) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(803) int local803;
		for (local760 = arg0 - 1; local760 >= 0; local760--) {
			for (local803 = 0; local803 < arg0; local803++) {
				if (local760 << 1 >= local803) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(845) int local845;
		for (local803 = 0; local803 < arg0; local803++) {
			for (local845 = 0; local845 < arg0; local845++) {
				if (local803 >> 1 <= local845) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(894) int local894;
		for (local845 = 0; local845 < arg0; local845++) {
			for (local894 = arg0 - 1; local894 >= 0; local894--) {
				if (local845 << 1 >= local894) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(936) int local936;
		for (local894 = 0; local894 < arg0; local894++) {
			for (local936 = 0; local936 < arg0; local936++) {
				if (local936 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(979) int local979;
		for (local936 = 0; local936 < arg0; local936++) {
			for (local979 = 0; local979 < arg0; local979++) {
				if (local936 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1026) int local1026;
		for (local979 = 0; local979 < arg0; local979++) {
			for (local1026 = 0; local1026 < arg0; local1026++) {
				if (arg0 / 2 <= local1026) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1073) int local1073;
		for (local1026 = 0; local1026 < arg0; local1026++) {
			for (local1073 = 0; local1073 < arg0; local1073++) {
				if (local1026 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1116) int local1116;
		for (local1073 = 0; local1073 < arg0; local1073++) {
			for (local1116 = 0; local1116 < arg0; local1116++) {
				if (local1116 <= local1073 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1164) int local1164;
		for (local1116 = arg0 - 1; local1116 >= 0; local1116--) {
			for (local1164 = 0; local1164 < arg0; local1164++) {
				if (local1164 <= local1116 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1213) int local1213;
		for (local1164 = arg0 - 1; local1164 >= 0; local1164--) {
			for (local1213 = arg0 - 1; local1213 >= 0; local1213--) {
				if (local1213 <= local1164 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1255) int local1255;
		for (local1213 = 0; local1213 < arg0; local1213++) {
			for (local1255 = arg0 - 1; local1255 >= 0; local1255--) {
				if (local1213 - arg0 / 2 >= local1255) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1304) int local1304;
		for (local1255 = 0; local1255 < arg0; local1255++) {
			for (local1304 = 0; local1304 < arg0; local1304++) {
				if (local1255 - arg0 / 2 <= local1304) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1359) int local1359;
		for (local1304 = arg0 - 1; local1304 >= 0; local1304--) {
			for (local1359 = 0; local1359 < arg0; local1359++) {
				if (local1359 >= local1304 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1411) int local1411;
		for (local1359 = arg0 - 1; local1359 >= 0; local1359--) {
			for (local1411 = arg0 - 1; local1411 >= 0; local1411--) {
				if (local1411 >= local1359 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1411 = 0; local1411 < arg0; local1411++) {
			for (@Pc(1460) int local1460 = arg0 - 1; local1460 >= 0; local1460--) {
				if (local1460 >= local1411 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(B[Ljava/lang/String;II)Ljava/lang/String;")
	public static String method2901(@OriginalArg(1) String[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(26) String local26 = arg0[arg1];
			return local26 == null ? "null" : local26.toString();
		} else {
			@Pc(38) int local38 = arg2 + arg1;
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = arg1; local42 < local38; local42++) {
				@Pc(48) String local48 = arg0[local42];
				if (local48 == null) {
					local40 += 4;
				} else {
					local40 += local48.length();
				}
			}
			@Pc(71) StringBuffer local71 = new StringBuffer(local40);
			for (@Pc(73) int local73 = arg1; local73 < local38; local73++) {
				@Pc(79) String local79 = arg0[local73];
				if (local79 == null) {
					local71.append("null");
				} else {
					local71.append(local79);
				}
			}
			return local71.toString();
		}
	}
}
