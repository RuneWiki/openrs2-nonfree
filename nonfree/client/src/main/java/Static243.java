import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
	public static int anInt4386;

	@OriginalMember(owner = "client!ig", name = "p", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_83 = new Class44(133, 4);

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
	public static final int anInt4385 = 1337;

	@OriginalMember(owner = "client!ig", name = "l", descriptor = "Lclient!pha;")
	public static final Class276 aClass276_10 = new Class276("", 12);

	@OriginalMember(owner = "client!ig", name = "n", descriptor = "[B")
	public static final byte[] aByteArray56 = new byte[2048];

	@OriginalMember(owner = "client!ig", name = "o", descriptor = "[C")
	public static final char[] aCharArray2 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/net/Socket;II)Lclient!gea;")
	public static Class97 method3621(@OriginalArg(0) Socket arg0) throws IOException {
		return new Class97_Sub1(arg0, 15000);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method3622(@OriginalArg(0) int arg0) {
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
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(108) int local108;
		for (local65 = 0; local65 < arg0; local65++) {
			for (local108 = 0; local108 < arg0; local108++) {
				if (local108 >= local65) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(151) int local151;
		for (local108 = arg0 - 1; local108 >= 0; local108--) {
			for (local151 = 0; local151 < arg0; local151++) {
				if (local108 <= local151) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(196) int local196;
		for (local151 = arg0 - 1; local151 >= 0; local151--) {
			for (local196 = 0; local196 < arg0; local196++) {
				if (local151 >> 1 >= local196) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(242) int local242;
		for (local196 = 0; local196 < arg0; local196++) {
			for (local242 = 0; local242 < arg0; local242++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local242 >= local196 << 1) {
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
		for (local242 = 0; local242 < arg0; local242++) {
			for (local304 = arg0 - 1; local304 >= 0; local304--) {
				if (local242 >> 1 >= local304) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(354) int local354;
		for (local304 = arg0 - 1; local304 >= 0; local304--) {
			for (local354 = arg0 - 1; local354 >= 0; local354--) {
				if (local354 >= local304 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(401) int local401;
		for (local354 = arg0 - 1; local354 >= 0; local354--) {
			for (local401 = arg0 - 1; local401 >= 0; local401--) {
				if (local401 <= local354 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(440) int local440;
		for (local401 = arg0 - 1; local401 >= 0; local401--) {
			for (local440 = 0; local440 < arg0; local440++) {
				if (local401 << 1 <= local440) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(485) int local485;
		for (local440 = 0; local440 < arg0; local440++) {
			for (local485 = 0; local485 < arg0; local485++) {
				if (local440 >> 1 >= local485) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(530) int local530;
		for (local485 = 0; local485 < arg0; local485++) {
			for (local530 = arg0 - 1; local530 >= 0; local530--) {
				if (local485 << 1 <= local530) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(577) int local577;
		for (local530 = arg0 - 1; local530 >= 0; local530--) {
			for (local577 = 0; local577 < arg0; local577++) {
				if (local577 >= local530 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(615) int local615;
		for (local577 = 0; local577 < arg0; local577++) {
			for (local615 = 0; local615 < arg0; local615++) {
				if (local577 << 1 >= local615) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(664) int local664;
		for (local615 = 0; local615 < arg0; local615++) {
			for (local664 = arg0 - 1; local664 >= 0; local664--) {
				if (local615 >> 1 <= local664) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(706) int local706;
		for (local664 = arg0 - 1; local664 >= 0; local664--) {
			for (local706 = arg0 - 1; local706 >= 0; local706--) {
				if (local664 << 1 >= local706) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(750) int local750;
		for (local706 = arg0 - 1; local706 >= 0; local706--) {
			for (local750 = arg0 - 1; local750 >= 0; local750--) {
				if (local706 >> 1 <= local750) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(796) int local796;
		for (local750 = arg0 - 1; local750 >= 0; local750--) {
			for (local796 = 0; local796 < arg0; local796++) {
				if (local796 <= local750 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(841) int local841;
		for (local796 = 0; local796 < arg0; local796++) {
			for (local841 = 0; local841 < arg0; local841++) {
				if (local796 >> 1 <= local841) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(890) int local890;
		for (local841 = 0; local841 < arg0; local841++) {
			for (local890 = arg0 - 1; local890 >= 0; local890--) {
				if (local890 <= local841 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(936) int local936;
		for (local890 = 0; local890 < arg0; local890++) {
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
		@Pc(987) int local987;
		for (local936 = 0; local936 < arg0; local936++) {
			for (local987 = 0; local987 < arg0; local987++) {
				if (arg0 / 2 >= local936) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1030) int local1030;
		for (local987 = 0; local987 < arg0; local987++) {
			for (local1030 = 0; local1030 < arg0; local1030++) {
				if (local1030 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1077) int local1077;
		for (local1030 = 0; local1030 < arg0; local1030++) {
			for (local1077 = 0; local1077 < arg0; local1077++) {
				if (arg0 / 2 <= local1030) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1116) int local1116;
		for (local1077 = 0; local1077 < arg0; local1077++) {
			for (local1116 = 0; local1116 < arg0; local1116++) {
				if (local1116 <= local1077 - arg0 / 2) {
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
				if (local1116 - arg0 / 2 >= local1164) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1216) int local1216;
		for (local1164 = arg0 - 1; local1164 >= 0; local1164--) {
			for (local1216 = arg0 - 1; local1216 >= 0; local1216--) {
				if (local1164 - arg0 / 2 >= local1216) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1264) int local1264;
		for (local1216 = 0; local1216 < arg0; local1216++) {
			for (local1264 = arg0 - 1; local1264 >= 0; local1264--) {
				if (local1264 <= local1216 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1309) int local1309;
		for (local1264 = 0; local1264 < arg0; local1264++) {
			for (local1309 = 0; local1309 < arg0; local1309++) {
				if (local1264 - arg0 / 2 <= local1309) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1360) int local1360;
		for (local1309 = arg0 - 1; local1309 >= 0; local1309--) {
			for (local1360 = 0; local1360 < arg0; local1360++) {
				if (local1309 - arg0 / 2 <= local1360) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1409) int local1409;
		for (local1360 = arg0 - 1; local1360 >= 0; local1360--) {
			for (local1409 = arg0 - 1; local1409 >= 0; local1409--) {
				if (local1409 >= local1360 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1409 = 0; local1409 < arg0; local1409++) {
			for (@Pc(1461) int local1461 = arg0 - 1; local1461 >= 0; local1461--) {
				if (local1409 - arg0 / 2 <= local1461) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIII[BBI)Z")
	public static boolean method3624(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg0 % 8;
		@Pc(13) int local13;
		if (local9 == 0) {
			local13 = 0;
		} else {
			local13 = 8 - local9;
		}
		@Pc(29) int local29 = -((arg2 + 7) / 8);
		@Pc(38) int local38 = -((arg0 + 8 - 1) / 8);
		for (@Pc(48) int local48 = local29; local48 < 0; local48++) {
			for (@Pc(52) int local52 = local38; local52 < 0; local52++) {
				if (arg3[arg4] == 0) {
					return true;
				}
				arg4 += 8;
			}
			arg4 -= local13;
			if (arg3[arg4 - 1] == 0) {
				return true;
			}
			arg4 += arg1;
		}
		return false;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!bja;)I")
	public static int method3625(@OriginalArg(1) Class36 arg0) {
		if (Static47.aClass36_2 == arg0) {
			return 5120;
		} else if (Static47.aClass36_3 == arg0) {
			return 5122;
		} else if (Static47.aClass36_4 == arg0) {
			return 5124;
		} else if (arg0 == Static47.aClass36_5) {
			return 5121;
		} else if (Static47.aClass36_6 == arg0) {
			return 5123;
		} else if (Static47.aClass36_7 == arg0) {
			return 5125;
		} else if (Static47.aClass36_8 == arg0) {
			return 5131;
		} else if (Static47.aClass36_9 == arg0) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
