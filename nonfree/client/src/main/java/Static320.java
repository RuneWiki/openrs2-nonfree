import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "I")
	public static int anInt10891;

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "Lclient!wu;")
	public static final Class394 aClass394_176 = new Class394("", 13);

	@OriginalMember(owner = "client!ko", name = "k", descriptor = "Z")
	public static boolean aBoolean925 = false;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method9050(@OriginalArg(0) int arg0) {
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
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(72) int local72;
		for (local23 = arg0 - 1; local23 >= 0; local23--) {
			for (local72 = 0; local72 < arg0; local72++) {
				if (local23 >= local72) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(106) int local106;
		for (local72 = 0; local72 < arg0; local72++) {
			for (local106 = 0; local106 < arg0; local106++) {
				if (local72 <= local106) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(148) int local148;
		for (local106 = arg0 - 1; local106 >= 0; local106--) {
			for (local148 = 0; local148 < arg0; local148++) {
				if (local148 >= local106) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(192) int local192;
		for (local148 = arg0 - 1; local148 >= 0; local148--) {
			for (local192 = 0; local192 < arg0; local192++) {
				if (local192 <= local148 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[1][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(232) int local232;
		for (local192 = 0; local192 < arg0; local192++) {
			for (local232 = 0; local232 < arg0; local232++) {
				if (local18 >= 0 && local16.length > local18) {
					if (local192 << 1 <= local232) {
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
		@Pc(291) int local291;
		for (local232 = 0; local232 < arg0; local232++) {
			for (local291 = arg0 - 1; local291 >= 0; local291--) {
				if (local232 >> 1 >= local291) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[1][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(342) int local342;
		for (local291 = arg0 - 1; local291 >= 0; local291--) {
			for (local342 = arg0 - 1; local342 >= 0; local342--) {
				if (local291 << 1 <= local342) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[1][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(384) int local384;
		for (local342 = arg0 - 1; local342 >= 0; local342--) {
			for (local384 = arg0 - 1; local384 >= 0; local384--) {
				if (local342 >> 1 >= local384) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(428) int local428;
		for (local384 = arg0 - 1; local384 >= 0; local384--) {
			for (local428 = 0; local428 < arg0; local428++) {
				if (local428 >= local384 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(464) int local464;
		for (local428 = 0; local428 < arg0; local428++) {
			for (local464 = 0; local464 < arg0; local464++) {
				if (local428 >> 1 >= local464) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(511) int local511;
		for (local464 = 0; local464 < arg0; local464++) {
			for (local511 = arg0 - 1; local511 >= 0; local511--) {
				if (local511 >= local464 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(552) int local552;
		for (local511 = arg0 - 1; local511 >= 0; local511--) {
			for (local552 = 0; local552 < arg0; local552++) {
				if (local511 >> 1 <= local552) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(592) int local592;
		for (local552 = 0; local552 < arg0; local552++) {
			for (local592 = 0; local592 < arg0; local592++) {
				if (local592 <= local552 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(639) int local639;
		for (local592 = 0; local592 < arg0; local592++) {
			for (local639 = arg0 - 1; local639 >= 0; local639--) {
				if (local639 >= local592 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(690) int local690;
		for (local639 = arg0 - 1; local639 >= 0; local639--) {
			for (local690 = arg0 - 1; local690 >= 0; local690--) {
				if (local639 << 1 >= local690) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(733) int local733;
		for (local690 = arg0 - 1; local690 >= 0; local690--) {
			for (local733 = arg0 - 1; local733 >= 0; local733--) {
				if (local690 >> 1 <= local733) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(780) int local780;
		for (local733 = arg0 - 1; local733 >= 0; local733--) {
			for (local780 = 0; local780 < arg0; local780++) {
				if (local733 << 1 >= local780) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(823) int local823;
		for (local780 = 0; local780 < arg0; local780++) {
			for (local823 = 0; local823 < arg0; local823++) {
				if (local780 >> 1 <= local823) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(874) int local874;
		for (local823 = 0; local823 < arg0; local823++) {
			for (local874 = arg0 - 1; local874 >= 0; local874--) {
				if (local874 <= local823 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(914) int local914;
		for (local874 = 0; local874 < arg0; local874++) {
			for (local914 = 0; local914 < arg0; local914++) {
				if (arg0 / 2 >= local914) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(959) int local959;
		for (local914 = 0; local914 < arg0; local914++) {
			for (local959 = 0; local959 < arg0; local959++) {
				if (local914 <= arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1004) int local1004;
		for (local959 = 0; local959 < arg0; local959++) {
			for (local1004 = 0; local1004 < arg0; local1004++) {
				if (local1004 >= arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1045) int local1045;
		for (local1004 = 0; local1004 < arg0; local1004++) {
			for (local1045 = 0; local1045 < arg0; local1045++) {
				if (local1004 >= arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1090) int local1090;
		for (local1045 = 0; local1045 < arg0; local1045++) {
			for (local1090 = 0; local1090 < arg0; local1090++) {
				if (local1045 - arg0 / 2 >= local1090) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1132) int local1132;
		for (local1090 = arg0 - 1; local1090 >= 0; local1090--) {
			for (local1132 = 0; local1132 < arg0; local1132++) {
				if (local1132 <= local1090 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1179) int local1179;
		for (local1132 = arg0 - 1; local1132 >= 0; local1132--) {
			for (local1179 = arg0 - 1; local1179 >= 0; local1179--) {
				if (local1179 <= local1132 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1224) int local1224;
		for (local1179 = 0; local1179 < arg0; local1179++) {
			for (local1224 = arg0 - 1; local1224 >= 0; local1224--) {
				if (local1224 <= local1179 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1274) int local1274;
		for (local1224 = 0; local1224 < arg0; local1224++) {
			for (local1274 = 0; local1274 < arg0; local1274++) {
				if (local1274 >= local1224 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1320) int local1320;
		for (local1274 = arg0 - 1; local1274 >= 0; local1274--) {
			for (local1320 = 0; local1320 < arg0; local1320++) {
				if (local1320 >= local1274 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1367) int local1367;
		for (local1320 = arg0 - 1; local1320 >= 0; local1320--) {
			for (local1367 = arg0 - 1; local1367 >= 0; local1367--) {
				if (local1367 >= local1320 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		for (local1367 = 0; local1367 < arg0; local1367++) {
			for (@Pc(1410) int local1410 = arg0 - 1; local1410 >= 0; local1410--) {
				if (local1367 - arg0 / 2 <= local1410) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][3] = local16;
		return local7;
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(B)V")
	public static void method9051() {
		if (!Static219.method3471()) {
			return;
		}
		if (Static352.aStringArray61 == null) {
			Static584.method8023();
		}
		Static544.aBoolean761 = true;
		Static262.anInt4858 = 0;
	}
}
