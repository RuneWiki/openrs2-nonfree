import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static566 {

	@OriginalMember(owner = "client!sw", name = "e", descriptor = "I")
	public static int anInt9146;

	@OriginalMember(owner = "client!sw", name = "g", descriptor = "Lclient!ec;")
	public static Class92 aClass92_6;

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "I")
	public static int anInt9142 = 0;

	@OriginalMember(owner = "client!sw", name = "f", descriptor = "J")
	public static long aLong254 = 0L;

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method7447(@OriginalArg(0) int arg0) {
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
				if (local65 <= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(108) int local108;
		for (local65 = 0; local65 < arg0; local65++) {
			for (local108 = 0; local108 < arg0; local108++) {
				if (local65 <= local108) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(155) int local155;
		for (local108 = arg0 - 1; local108 >= 0; local108--) {
			for (local155 = 0; local155 < arg0; local155++) {
				if (local155 >= local108) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(201) int local201;
		for (local155 = arg0 - 1; local155 >= 0; local155--) {
			for (local201 = 0; local201 < arg0; local201++) {
				if (local201 <= local155 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(243) int local243;
		for (local201 = 0; local201 < arg0; local201++) {
			for (local243 = 0; local243 < arg0; local243++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local201 << 1 <= local243) {
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
		@Pc(301) int local301;
		for (local243 = 0; local243 < arg0; local243++) {
			for (local301 = arg0 - 1; local301 >= 0; local301--) {
				if (local243 >> 1 >= local301) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(354) int local354;
		for (local301 = arg0 - 1; local301 >= 0; local301--) {
			for (local354 = arg0 - 1; local354 >= 0; local354--) {
				if (local301 << 1 <= local354) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(405) int local405;
		for (local354 = arg0 - 1; local354 >= 0; local354--) {
			for (local405 = arg0 - 1; local405 >= 0; local405--) {
				if (local405 <= local354 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(451) int local451;
		for (local405 = arg0 - 1; local405 >= 0; local405--) {
			for (local451 = 0; local451 < arg0; local451++) {
				if (local405 << 1 <= local451) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(493) int local493;
		for (local451 = 0; local451 < arg0; local451++) {
			for (local493 = 0; local493 < arg0; local493++) {
				if (local451 >> 1 >= local493) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(546) int local546;
		for (local493 = 0; local493 < arg0; local493++) {
			for (local546 = arg0 - 1; local546 >= 0; local546--) {
				if (local493 << 1 <= local546) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(593) int local593;
		for (local546 = arg0 - 1; local546 >= 0; local546--) {
			for (local593 = 0; local593 < arg0; local593++) {
				if (local546 >> 1 <= local593) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(635) int local635;
		for (local593 = 0; local593 < arg0; local593++) {
			for (local635 = 0; local635 < arg0; local635++) {
				if (local635 <= local593 << 1) {
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
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(722) int local722;
		for (local680 = arg0 - 1; local680 >= 0; local680--) {
			for (local722 = arg0 - 1; local722 >= 0; local722--) {
				if (local722 <= local680 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(773) int local773;
		for (local722 = arg0 - 1; local722 >= 0; local722--) {
			for (local773 = arg0 - 1; local773 >= 0; local773--) {
				if (local773 >= local722 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(819) int local819;
		for (local773 = arg0 - 1; local773 >= 0; local773--) {
			for (local819 = 0; local819 < arg0; local819++) {
				if (local773 << 1 >= local819) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(857) int local857;
		for (local819 = 0; local819 < arg0; local819++) {
			for (local857 = 0; local857 < arg0; local857++) {
				if (local819 >> 1 <= local857) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(906) int local906;
		for (local857 = 0; local857 < arg0; local857++) {
			for (local906 = arg0 - 1; local906 >= 0; local906--) {
				if (local906 <= local857 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(951) int local951;
		for (local906 = 0; local906 < arg0; local906++) {
			for (local951 = 0; local951 < arg0; local951++) {
				if (arg0 / 2 >= local951) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(990) int local990;
		for (local951 = 0; local951 < arg0; local951++) {
			for (local990 = 0; local990 < arg0; local990++) {
				if (local951 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1037) int local1037;
		for (local990 = 0; local990 < arg0; local990++) {
			for (local1037 = 0; local1037 < arg0; local1037++) {
				if (local1037 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1080) int local1080;
		for (local1037 = 0; local1037 < arg0; local1037++) {
			for (local1080 = 0; local1080 < arg0; local1080++) {
				if (arg0 / 2 <= local1037) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1127) int local1127;
		for (local1080 = 0; local1080 < arg0; local1080++) {
			for (local1127 = 0; local1127 < arg0; local1127++) {
				if (local1080 - arg0 / 2 >= local1127) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1179) int local1179;
		for (local1127 = arg0 - 1; local1127 >= 0; local1127--) {
			for (local1179 = 0; local1179 < arg0; local1179++) {
				if (local1127 - arg0 / 2 >= local1179) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1227) int local1227;
		for (local1179 = arg0 - 1; local1179 >= 0; local1179--) {
			for (local1227 = arg0 - 1; local1227 >= 0; local1227--) {
				if (local1227 <= local1179 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1272) int local1272;
		for (local1227 = 0; local1227 < arg0; local1227++) {
			for (local1272 = arg0 - 1; local1272 >= 0; local1272--) {
				if (local1227 - arg0 / 2 >= local1272) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1316) int local1316;
		for (local1272 = 0; local1272 < arg0; local1272++) {
			for (local1316 = 0; local1316 < arg0; local1316++) {
				if (local1272 - arg0 / 2 <= local1316) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1364) int local1364;
		for (local1316 = arg0 - 1; local1316 >= 0; local1316--) {
			for (local1364 = 0; local1364 < arg0; local1364++) {
				if (local1316 - arg0 / 2 <= local1364) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1413) int local1413;
		for (local1364 = arg0 - 1; local1364 >= 0; local1364--) {
			for (local1413 = arg0 - 1; local1413 >= 0; local1413--) {
				if (local1364 - arg0 / 2 <= local1413) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1413 = 0; local1413 < arg0; local1413++) {
			for (@Pc(1462) int local1462 = arg0 - 1; local1462 >= 0; local1462--) {
				if (local1462 >= local1413 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)V")
	public static void method7449() {
		Static50.aClass333_8.method7485();
		Static283.aClass243_8.method5460();
		Static515.aClass243_12.method5460();
	}
}
