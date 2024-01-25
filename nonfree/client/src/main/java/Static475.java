import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!sba", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray33;

	@OriginalMember(owner = "client!sba", name = "l", descriptor = "I")
	public static int anInt7997;

	@OriginalMember(owner = "client!sba", name = "e", descriptor = "[I")
	public static final int[] anIntArray637 = new int[50];

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(BI)[[[B")
	public static byte[][][] method6604(@OriginalArg(1) int arg0) {
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
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(65) int local65;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local65 = 0; local65 < arg0; local65++) {
				if (local26 >= local65) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(104) int local104;
		for (local65 = 0; local65 < arg0; local65++) {
			for (local104 = 0; local104 < arg0; local104++) {
				if (local104 >= local65) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(143) int local143;
		for (local104 = arg0 - 1; local104 >= 0; local104--) {
			for (local143 = 0; local143 < arg0; local143++) {
				if (local104 <= local143) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(188) int local188;
		for (local143 = arg0 - 1; local143 >= 0; local143--) {
			for (local188 = 0; local188 < arg0; local188++) {
				if (local188 <= local143 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(226) int local226;
		for (local188 = 0; local188 < arg0; local188++) {
			for (local226 = 0; local226 < arg0; local226++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local226 >= local188 << 1) {
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
		@Pc(291) int local291;
		for (local226 = 0; local226 < arg0; local226++) {
			for (local291 = arg0 - 1; local291 >= 0; local291--) {
				if (local226 >> 1 >= local291) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(340) int local340;
		for (local291 = arg0 - 1; local291 >= 0; local291--) {
			for (local340 = arg0 - 1; local340 >= 0; local340--) {
				if (local340 >= local291 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(387) int local387;
		for (local340 = arg0 - 1; local340 >= 0; local340--) {
			for (local387 = arg0 - 1; local387 >= 0; local387--) {
				if (local340 >> 1 >= local387) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(429) int local429;
		for (local387 = arg0 - 1; local387 >= 0; local387--) {
			for (local429 = 0; local429 < arg0; local429++) {
				if (local429 >= local387 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(475) int local475;
		for (local429 = 0; local429 < arg0; local429++) {
			for (local475 = 0; local475 < arg0; local475++) {
				if (local475 <= local429 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(528) int local528;
		for (local475 = 0; local475 < arg0; local475++) {
			for (local528 = arg0 - 1; local528 >= 0; local528--) {
				if (local528 >= local475 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(572) int local572;
		for (local528 = arg0 - 1; local528 >= 0; local528--) {
			for (local572 = 0; local572 < arg0; local572++) {
				if (local572 >= local528 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(613) int local613;
		for (local572 = 0; local572 < arg0; local572++) {
			for (local613 = 0; local613 < arg0; local613++) {
				if (local613 <= local572 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(658) int local658;
		for (local613 = 0; local613 < arg0; local613++) {
			for (local658 = arg0 - 1; local658 >= 0; local658--) {
				if (local613 >> 1 <= local658) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(700) int local700;
		for (local658 = arg0 - 1; local658 >= 0; local658--) {
			for (local700 = arg0 - 1; local700 >= 0; local700--) {
				if (local700 <= local658 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(744) int local744;
		for (local700 = arg0 - 1; local700 >= 0; local700--) {
			for (local744 = arg0 - 1; local744 >= 0; local744--) {
				if (local744 >= local700 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(793) int local793;
		for (local744 = arg0 - 1; local744 >= 0; local744--) {
			for (local793 = 0; local793 < arg0; local793++) {
				if (local793 <= local744 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(839) int local839;
		for (local793 = 0; local793 < arg0; local793++) {
			for (local839 = 0; local839 < arg0; local839++) {
				if (local839 >= local793 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(884) int local884;
		for (local839 = 0; local839 < arg0; local839++) {
			for (local884 = arg0 - 1; local884 >= 0; local884--) {
				if (local839 << 1 >= local884) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(929) int local929;
		for (local884 = 0; local884 < arg0; local884++) {
			for (local929 = 0; local929 < arg0; local929++) {
				if (arg0 / 2 >= local929) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(976) int local976;
		for (local929 = 0; local929 < arg0; local929++) {
			for (local976 = 0; local976 < arg0; local976++) {
				if (local929 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1023) int local1023;
		for (local976 = 0; local976 < arg0; local976++) {
			for (local1023 = 0; local1023 < arg0; local1023++) {
				if (local1023 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1069) int local1069;
		for (local1023 = 0; local1023 < arg0; local1023++) {
			for (local1069 = 0; local1069 < arg0; local1069++) {
				if (local1023 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1116) int local1116;
		for (local1069 = 0; local1069 < arg0; local1069++) {
			for (local1116 = 0; local1116 < arg0; local1116++) {
				if (local1069 - arg0 / 2 >= local1116) {
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
		@Pc(1217) int local1217;
		for (local1164 = arg0 - 1; local1164 >= 0; local1164--) {
			for (local1217 = arg0 - 1; local1217 >= 0; local1217--) {
				if (local1164 - arg0 / 2 >= local1217) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1262) int local1262;
		for (local1217 = 0; local1217 < arg0; local1217++) {
			for (local1262 = arg0 - 1; local1262 >= 0; local1262--) {
				if (local1217 - arg0 / 2 >= local1262) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1310) int local1310;
		for (local1262 = 0; local1262 < arg0; local1262++) {
			for (local1310 = 0; local1310 < arg0; local1310++) {
				if (local1310 >= local1262 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1357) int local1357;
		for (local1310 = arg0 - 1; local1310 >= 0; local1310--) {
			for (local1357 = 0; local1357 < arg0; local1357++) {
				if (local1357 >= local1310 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1402) int local1402;
		for (local1357 = arg0 - 1; local1357 >= 0; local1357--) {
			for (local1402 = arg0 - 1; local1402 >= 0; local1402--) {
				if (local1357 - arg0 / 2 <= local1402) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1402 = 0; local1402 < arg0; local1402++) {
			for (@Pc(1451) int local1451 = arg0 - 1; local1451 >= 0; local1451--) {
				if (local1402 - arg0 / 2 <= local1451) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "(B)V")
	public static void method6608() {
		Static19.anIntArray100 = null;
		Static256.aBoolean379 = false;
		Static584.anIntArray712 = null;
		Static170.anIntArray695 = null;
		Static393.anIntArray707 = null;
		Static154.anIntArray310 = null;
	}
}
