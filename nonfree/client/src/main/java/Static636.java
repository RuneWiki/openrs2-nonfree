import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static636 {

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
	public static int anInt10412;

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray19 = new int[2][][];

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(IB)I")
	public static int method8900(@OriginalArg(0) int arg0) {
		@Pc(12) double local12 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = local12;
		if (local12 > local21) {
			local30 = local21;
		}
		if (local30 > local28) {
			local30 = local28;
		}
		@Pc(44) double local44 = local12;
		if (local12 < local21) {
			local44 = local21;
		}
		if (local28 > local44) {
			local44 = local28;
		}
		@Pc(58) double local58 = 0.0D;
		@Pc(60) double local60 = 0.0D;
		@Pc(66) double local66 = (local44 + local30) / 2.0D;
		if (local44 != local30) {
			if (local66 < 0.5D) {
				local60 = (local44 - local30) / (local44 + local30);
			}
			if (local44 == local12) {
				local58 = (local21 - local28) / (local44 - local30);
			} else if (local21 == local44) {
				local58 = (local28 - local12) / (-local30 + local44) + 2.0D;
			} else if (local44 == local28) {
				local58 = (local12 - local21) / (-local30 + local44) + 4.0D;
			}
			if (local66 >= 0.5D) {
				local60 = (local44 - local30) / (2.0D - local44 - local30);
			}
		}
		local58 /= 6.0D;
		@Pc(165) int local165 = (int) (local58 * 256.0D);
		@Pc(170) int local170 = (int) (local60 * 256.0D);
		@Pc(175) int local175 = (int) (local66 * 256.0D);
		if (local170 < 0) {
			local170 = 0;
		} else if (local170 > 255) {
			local170 = 255;
		}
		if (local175 < 0) {
			local175 = 0;
		} else if (local175 > 255) {
			local175 = 255;
		}
		if (local175 > 243) {
			local170 >>= 0x4;
		} else if (local175 > 217) {
			local170 >>= 0x3;
		} else if (local175 > 192) {
			local170 >>= 0x2;
		} else if (local175 > 179) {
			local170 >>= 0x1;
		}
		return (local175 >> 1) + ((local165 & 0xFF) >> 2 << 10) + (local170 >> 5 << 7);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
	public static void method8903() {
		Static467.method6886(false);
		if (Static267.anInt4944 >= 0 && Static267.anInt4944 != 0) {
			Static459.method8986(false, Static267.anInt4944);
			Static267.anInt4944 = -1;
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)[[[B")
	public static byte[][][] method8905(@OriginalArg(0) int arg0) {
		@Pc(7) byte[][][] local7 = new byte[8][4][];
		@Pc(16) byte[] local16 = new byte[arg0 * arg0];
		@Pc(18) int local18 = 0;
		@Pc(23) int local23;
		for (@Pc(20) int local20 = 0; local20 < arg0; local20++) {
			for (local23 = 0; local23 < arg0; local23++) {
				if (local23 <= local20) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(76) int local76;
		for (local23 = arg0 - 1; local23 >= 0; local23--) {
			for (local76 = 0; local76 < arg0; local76++) {
				if (local76 <= local23) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(122) int local122;
		for (local76 = 0; local76 < arg0; local76++) {
			for (local122 = 0; local122 < arg0; local122++) {
				if (local122 >= local76) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(171) int local171;
		for (local122 = arg0 - 1; local122 >= 0; local122--) {
			for (local171 = 0; local171 < arg0; local171++) {
				if (local122 <= local171) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(218) int local218;
		for (local171 = arg0 - 1; local171 >= 0; local171--) {
			for (local218 = 0; local218 < arg0; local218++) {
				if (local218 <= local171 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[1][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(265) int local265;
		for (local218 = 0; local218 < arg0; local218++) {
			for (local265 = 0; local265 < arg0; local265++) {
				if (local18 >= 0 && local18 < local16.length) {
					if (local265 >= local218 << 1) {
						local16[local18] = -1;
					}
					local18++;
				} else {
					local18++;
				}
			}
		}
		local7[1][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(330) int local330;
		for (local265 = 0; local265 < arg0; local265++) {
			for (local330 = arg0 - 1; local330 >= 0; local330--) {
				if (local330 <= local265 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[1][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(378) int local378;
		for (local330 = arg0 - 1; local330 >= 0; local330--) {
			for (local378 = arg0 - 1; local378 >= 0; local378--) {
				if (local378 >= local330 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[1][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(425) int local425;
		for (local378 = arg0 - 1; local378 >= 0; local378--) {
			for (local425 = arg0 - 1; local425 >= 0; local425--) {
				if (local425 <= local378 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(472) int local472;
		for (local425 = arg0 - 1; local425 >= 0; local425--) {
			for (local472 = 0; local472 < arg0; local472++) {
				if (local472 >= local425 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(520) int local520;
		for (local472 = 0; local472 < arg0; local472++) {
			for (local520 = 0; local520 < arg0; local520++) {
				if (local472 >> 1 >= local520) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(563) int local563;
		for (local520 = 0; local520 < arg0; local520++) {
			for (local563 = arg0 - 1; local563 >= 0; local563--) {
				if (local563 >= local520 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(609) int local609;
		for (local563 = arg0 - 1; local563 >= 0; local563--) {
			for (local609 = 0; local609 < arg0; local609++) {
				if (local609 >= local563 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(653) int local653;
		for (local609 = 0; local609 < arg0; local609++) {
			for (local653 = 0; local653 < arg0; local653++) {
				if (local653 <= local609 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(704) int local704;
		for (local653 = 0; local653 < arg0; local653++) {
			for (local704 = arg0 - 1; local704 >= 0; local704--) {
				if (local653 >> 1 <= local704) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(751) int local751;
		for (local704 = arg0 - 1; local704 >= 0; local704--) {
			for (local751 = arg0 - 1; local751 >= 0; local751--) {
				if (local751 <= local704 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(801) int local801;
		for (local751 = arg0 - 1; local751 >= 0; local751--) {
			for (local801 = arg0 - 1; local801 >= 0; local801--) {
				if (local801 >= local751 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(852) int local852;
		for (local801 = arg0 - 1; local801 >= 0; local801--) {
			for (local852 = 0; local852 < arg0; local852++) {
				if (local801 << 1 >= local852) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(899) int local899;
		for (local852 = 0; local852 < arg0; local852++) {
			for (local899 = 0; local899 < arg0; local899++) {
				if (local899 >= local852 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(946) int local946;
		for (local899 = 0; local899 < arg0; local899++) {
			for (local946 = arg0 - 1; local946 >= 0; local946--) {
				if (local946 <= local899 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(990) int local990;
		for (local946 = 0; local946 < arg0; local946++) {
			for (local990 = 0; local990 < arg0; local990++) {
				if (local990 <= arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1031) int local1031;
		for (local990 = 0; local990 < arg0; local990++) {
			for (local1031 = 0; local1031 < arg0; local1031++) {
				if (arg0 / 2 >= local990) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1072) int local1072;
		for (local1031 = 0; local1031 < arg0; local1031++) {
			for (local1072 = 0; local1072 < arg0; local1072++) {
				if (local1072 >= arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1121) int local1121;
		for (local1072 = 0; local1072 < arg0; local1072++) {
			for (local1121 = 0; local1121 < arg0; local1121++) {
				if (local1072 >= arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1174) int local1174;
		for (local1121 = 0; local1121 < arg0; local1121++) {
			for (local1174 = 0; local1174 < arg0; local1174++) {
				if (local1174 <= local1121 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1232) int local1232;
		for (local1174 = arg0 - 1; local1174 >= 0; local1174--) {
			for (local1232 = 0; local1232 < arg0; local1232++) {
				if (local1174 - arg0 / 2 >= local1232) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1286) int local1286;
		for (local1232 = arg0 - 1; local1232 >= 0; local1232--) {
			for (local1286 = arg0 - 1; local1286 >= 0; local1286--) {
				if (local1232 - arg0 / 2 >= local1286) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1333) int local1333;
		for (local1286 = 0; local1286 < arg0; local1286++) {
			for (local1333 = arg0 - 1; local1333 >= 0; local1333--) {
				if (local1333 <= local1286 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1382) int local1382;
		for (local1333 = 0; local1333 < arg0; local1333++) {
			for (local1382 = 0; local1382 < arg0; local1382++) {
				if (local1333 - arg0 / 2 <= local1382) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1440) int local1440;
		for (local1382 = arg0 - 1; local1382 >= 0; local1382--) {
			for (local1440 = 0; local1440 < arg0; local1440++) {
				if (local1440 >= local1382 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1498) int local1498;
		for (local1440 = arg0 - 1; local1440 >= 0; local1440--) {
			for (local1498 = arg0 - 1; local1498 >= 0; local1498--) {
				if (local1498 >= local1440 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		for (local1498 = 0; local1498 < arg0; local1498++) {
			for (@Pc(1546) int local1546 = arg0 - 1; local1546 >= 0; local1546--) {
				if (local1546 >= local1498 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][3] = local16;
		return local7;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)I")
	public static int method8906(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
