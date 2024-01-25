import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!qr", name = "i", descriptor = "[I")
	public static int[] anIntArray508;

	@OriginalMember(owner = "client!qr", name = "j", descriptor = "Lclient!ij;")
	public static Class93 aClass93_104;

	@OriginalMember(owner = "client!qr", name = "f", descriptor = "[Lclient!dl;")
	public static final Class50[] aClass50Array1 = new Class50[50];

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ICI)C")
	public static char method4718(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		if (arg1 >= 'À' && arg1 <= 'ÿ') {
			if (arg1 >= 'À' && arg1 <= 'Æ') {
				return 'A';
			}
			if (arg1 == 'Ç') {
				return 'C';
			}
			if (arg1 >= 'È' && arg1 <= 'Ë') {
				return 'E';
			}
			if (arg1 >= 'Ì' && arg1 <= 'Ï') {
				return 'I';
			}
			if (arg1 == 'Ñ' && arg0 != 0) {
				return 'N';
			}
			if (arg1 >= 'Ò' && arg1 <= 'Ö') {
				return 'O';
			}
			if (arg1 >= 'Ù' && arg1 <= 'Ü') {
				return 'U';
			}
			if (arg1 == 'Ý') {
				return 'Y';
			}
			if (arg1 == 'ß') {
				return 's';
			}
			if (arg1 >= 'à' && arg1 <= 'æ') {
				return 'a';
			}
			if (arg1 == 'ç') {
				return 'c';
			}
			if (arg1 >= 'è' && arg1 <= 'ë') {
				return 'e';
			}
			if (arg1 >= 'ì' && arg1 <= 'ï') {
				return 'i';
			}
			if (arg1 == 'ñ' && arg0 != 0) {
				return 'n';
			}
			if (arg1 >= 'ò' && arg1 <= 'ö') {
				return 'o';
			}
			if (arg1 >= 'ù' && arg1 <= 'ü') {
				return 'u';
			}
			if (arg1 == 'ý' || arg1 == 'ÿ') {
				return 'y';
			}
		}
		if (arg1 == 'Œ') {
			return 'O';
		} else if (arg1 == 'œ') {
			return 'o';
		} else if (arg1 == 'Ÿ') {
			return 'Y';
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method4719(@OriginalArg(1) int arg0) {
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
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(68) int local68;
		for (local23 = arg0 - 1; local23 >= 0; local23--) {
			for (local68 = 0; local68 < arg0; local68++) {
				if (local23 >= local68) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(109) int local109;
		for (local68 = 0; local68 < arg0; local68++) {
			for (local109 = 0; local109 < arg0; local109++) {
				if (local109 >= local68) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(154) int local154;
		for (local109 = arg0 - 1; local109 >= 0; local109--) {
			for (local154 = 0; local154 < arg0; local154++) {
				if (local154 >= local109) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(197) int local197;
		for (local154 = arg0 - 1; local154 >= 0; local154--) {
			for (local197 = 0; local197 < arg0; local197++) {
				if (local154 >> 1 >= local197) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[1][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(240) int local240;
		for (local197 = 0; local197 < arg0; local197++) {
			for (local240 = 0; local240 < arg0; local240++) {
				if (local18 >= 0 && local18 < local16.length) {
					if (local197 << 1 <= local240) {
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
		for (local240 = 0; local240 < arg0; local240++) {
			for (@Pc(294) int local294 = arg0 - 1; local294 >= 0; local294--) {
				if (local294 <= local240 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[1][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(350) int local350;
		for (@Pc(345) int local345 = arg0 - 1; local345 >= 0; local345--) {
			for (local350 = arg0 - 1; local350 >= 0; local350--) {
				if (local345 << 1 <= local350) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[1][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(392) int local392;
		for (local350 = arg0 - 1; local350 >= 0; local350--) {
			for (local392 = arg0 - 1; local392 >= 0; local392--) {
				if (local350 >> 1 >= local392) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(432) int local432;
		for (local392 = arg0 - 1; local392 >= 0; local392--) {
			for (local432 = 0; local432 < arg0; local432++) {
				if (local392 << 1 <= local432) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(471) int local471;
		for (local432 = 0; local432 < arg0; local432++) {
			for (local471 = 0; local471 < arg0; local471++) {
				if (local432 >> 1 >= local471) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(518) int local518;
		for (local471 = 0; local471 < arg0; local471++) {
			for (local518 = arg0 - 1; local518 >= 0; local518--) {
				if (local471 << 1 <= local518) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(560) int local560;
		for (local518 = arg0 - 1; local518 >= 0; local518--) {
			for (local560 = 0; local560 < arg0; local560++) {
				if (local560 >= local518 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(603) int local603;
		for (local560 = 0; local560 < arg0; local560++) {
			for (local603 = 0; local603 < arg0; local603++) {
				if (local560 << 1 >= local603) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(646) int local646;
		for (local603 = 0; local603 < arg0; local603++) {
			for (local646 = arg0 - 1; local646 >= 0; local646--) {
				if (local646 >= local603 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(693) int local693;
		for (local646 = arg0 - 1; local646 >= 0; local646--) {
			for (local693 = arg0 - 1; local693 >= 0; local693--) {
				if (local646 << 1 >= local693) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(742) int local742;
		for (local693 = arg0 - 1; local693 >= 0; local693--) {
			for (local742 = arg0 - 1; local742 >= 0; local742--) {
				if (local693 >> 1 <= local742) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(785) int local785;
		for (local742 = arg0 - 1; local742 >= 0; local742--) {
			for (local785 = 0; local785 < arg0; local785++) {
				if (local742 << 1 >= local785) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(824) int local824;
		for (local785 = 0; local785 < arg0; local785++) {
			for (local824 = 0; local824 < arg0; local824++) {
				if (local824 >= local785 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(871) int local871;
		for (local824 = 0; local824 < arg0; local824++) {
			for (local871 = arg0 - 1; local871 >= 0; local871--) {
				if (local824 << 1 >= local871) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(914) int local914;
		for (local871 = 0; local871 < arg0; local871++) {
			for (local914 = 0; local914 < arg0; local914++) {
				if (local914 <= arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(955) int local955;
		for (local914 = 0; local914 < arg0; local914++) {
			for (local955 = 0; local955 < arg0; local955++) {
				if (local914 <= arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(996) int local996;
		for (local955 = 0; local955 < arg0; local955++) {
			for (local996 = 0; local996 < arg0; local996++) {
				if (local996 >= arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1033) int local1033;
		for (local996 = 0; local996 < arg0; local996++) {
			for (local1033 = 0; local1033 < arg0; local1033++) {
				if (arg0 / 2 <= local996) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1078) int local1078;
		for (local1033 = 0; local1033 < arg0; local1033++) {
			for (local1078 = 0; local1078 < arg0; local1078++) {
				if (local1078 <= local1033 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1132) int local1132;
		for (local1078 = arg0 - 1; local1078 >= 0; local1078--) {
			for (local1132 = 0; local1132 < arg0; local1132++) {
				if (local1132 <= local1078 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1174) int local1174;
		for (local1132 = arg0 - 1; local1132 >= 0; local1132--) {
			for (local1174 = arg0 - 1; local1174 >= 0; local1174--) {
				if (local1132 - arg0 / 2 >= local1174) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1214) int local1214;
		for (local1174 = 0; local1174 < arg0; local1174++) {
			for (local1214 = arg0 - 1; local1214 >= 0; local1214--) {
				if (local1174 - arg0 / 2 >= local1214) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1256) int local1256;
		for (local1214 = 0; local1214 < arg0; local1214++) {
			for (local1256 = 0; local1256 < arg0; local1256++) {
				if (local1214 - arg0 / 2 <= local1256) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1306) int local1306;
		for (local1256 = arg0 - 1; local1256 >= 0; local1256--) {
			for (local1306 = 0; local1306 < arg0; local1306++) {
				if (local1306 >= local1256 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1360) int local1360;
		for (local1306 = arg0 - 1; local1306 >= 0; local1306--) {
			for (local1360 = arg0 - 1; local1360 >= 0; local1360--) {
				if (local1306 - arg0 / 2 <= local1360) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		for (local1360 = 0; local1360 < arg0; local1360++) {
			for (@Pc(1404) int local1404 = arg0 - 1; local1404 >= 0; local1404--) {
				if (local1360 - arg0 / 2 <= local1404) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][3] = local16;
		return local7;
	}
}
