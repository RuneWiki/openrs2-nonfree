import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!dja", name = "b", descriptor = "I")
	public static int anInt2342 = -1;

	@OriginalMember(owner = "client!dja", name = "c", descriptor = "[I")
	public static int[] anIntArray174 = new int[4];

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(IB)[[[B")
	public static byte[][][] method1963(@OriginalArg(0) int arg0) {
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
		@Pc(60) int local60;
		for (local23 = arg0 - 1; local23 >= 0; local23--) {
			for (local60 = 0; local60 < arg0; local60++) {
				if (local23 >= local60) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(102) int local102;
		for (local60 = 0; local60 < arg0; local60++) {
			for (local102 = 0; local102 < arg0; local102++) {
				if (local60 <= local102) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(147) int local147;
		for (local102 = arg0 - 1; local102 >= 0; local102--) {
			for (local147 = 0; local147 < arg0; local147++) {
				if (local102 <= local147) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(187) int local187;
		for (local147 = arg0 - 1; local147 >= 0; local147--) {
			for (local187 = 0; local187 < arg0; local187++) {
				if (local147 >> 1 >= local187) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[1][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(227) int local227;
		for (local187 = 0; local187 < arg0; local187++) {
			for (local227 = 0; local227 < arg0; local227++) {
				if (local18 >= 0 && local16.length > local18) {
					if (local227 >= local187 << 1) {
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
		@Pc(278) int local278;
		for (local227 = 0; local227 < arg0; local227++) {
			for (local278 = arg0 - 1; local278 >= 0; local278--) {
				if (local227 >> 1 >= local278) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[1][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(322) int local322;
		for (local278 = arg0 - 1; local278 >= 0; local278--) {
			for (local322 = arg0 - 1; local322 >= 0; local322--) {
				if (local322 >= local278 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[1][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(361) int local361;
		for (local322 = arg0 - 1; local322 >= 0; local322--) {
			for (local361 = arg0 - 1; local361 >= 0; local361--) {
				if (local361 <= local322 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(401) int local401;
		for (local361 = arg0 - 1; local361 >= 0; local361--) {
			for (local401 = 0; local401 < arg0; local401++) {
				if (local361 << 1 <= local401) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(444) int local444;
		for (local401 = 0; local401 < arg0; local401++) {
			for (local444 = 0; local444 < arg0; local444++) {
				if (local444 <= local401 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(495) int local495;
		for (local444 = 0; local444 < arg0; local444++) {
			for (local495 = arg0 - 1; local495 >= 0; local495--) {
				if (local495 >= local444 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(537) int local537;
		for (local495 = arg0 - 1; local495 >= 0; local495--) {
			for (local537 = 0; local537 < arg0; local537++) {
				if (local537 >= local495 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(576) int local576;
		for (local537 = 0; local537 < arg0; local537++) {
			for (local576 = 0; local576 < arg0; local576++) {
				if (local576 <= local537 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(615) int local615;
		for (local576 = 0; local576 < arg0; local576++) {
			for (local615 = arg0 - 1; local615 >= 0; local615--) {
				if (local615 >= local576 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(659) int local659;
		for (local615 = arg0 - 1; local615 >= 0; local615--) {
			for (local659 = arg0 - 1; local659 >= 0; local659--) {
				if (local615 << 1 >= local659) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(708) int local708;
		for (local659 = arg0 - 1; local659 >= 0; local659--) {
			for (local708 = arg0 - 1; local708 >= 0; local708--) {
				if (local708 >= local659 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(752) int local752;
		for (local708 = arg0 - 1; local708 >= 0; local708--) {
			for (local752 = 0; local752 < arg0; local752++) {
				if (local752 <= local708 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(799) int local799;
		for (local752 = 0; local752 < arg0; local752++) {
			for (local799 = 0; local799 < arg0; local799++) {
				if (local799 >= local752 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(846) int local846;
		for (local799 = 0; local799 < arg0; local799++) {
			for (local846 = arg0 - 1; local846 >= 0; local846--) {
				if (local799 << 1 >= local846) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(885) int local885;
		for (local846 = 0; local846 < arg0; local846++) {
			for (local885 = 0; local885 < arg0; local885++) {
				if (arg0 / 2 >= local885) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(926) int local926;
		for (local885 = 0; local885 < arg0; local885++) {
			for (local926 = 0; local926 < arg0; local926++) {
				if (local885 <= arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(971) int local971;
		for (local926 = 0; local926 < arg0; local926++) {
			for (local971 = 0; local971 < arg0; local971++) {
				if (arg0 / 2 <= local971) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1012) int local1012;
		for (local971 = 0; local971 < arg0; local971++) {
			for (local1012 = 0; local1012 < arg0; local1012++) {
				if (local971 >= arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1057) int local1057;
		for (local1012 = 0; local1012 < arg0; local1012++) {
			for (local1057 = 0; local1057 < arg0; local1057++) {
				if (local1057 <= local1012 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1110) int local1110;
		for (local1057 = arg0 - 1; local1057 >= 0; local1057--) {
			for (local1110 = 0; local1110 < arg0; local1110++) {
				if (local1110 <= local1057 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1153) int local1153;
		for (local1110 = arg0 - 1; local1110 >= 0; local1110--) {
			for (local1153 = arg0 - 1; local1153 >= 0; local1153--) {
				if (local1110 - arg0 / 2 >= local1153) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1197) int local1197;
		for (local1153 = 0; local1153 < arg0; local1153++) {
			for (local1197 = arg0 - 1; local1197 >= 0; local1197--) {
				if (local1197 <= local1153 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1247) int local1247;
		for (local1197 = 0; local1197 < arg0; local1197++) {
			for (local1247 = 0; local1247 < arg0; local1247++) {
				if (local1247 >= local1197 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1305) int local1305;
		for (local1247 = arg0 - 1; local1247 >= 0; local1247--) {
			for (local1305 = 0; local1305 < arg0; local1305++) {
				if (local1247 - arg0 / 2 <= local1305) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1348) int local1348;
		for (local1305 = arg0 - 1; local1305 >= 0; local1305--) {
			for (local1348 = arg0 - 1; local1348 >= 0; local1348--) {
				if (local1305 - arg0 / 2 <= local1348) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		for (local1348 = 0; local1348 < arg0; local1348++) {
			for (@Pc(1395) int local1395 = arg0 - 1; local1395 >= 0; local1395--) {
				if (local1348 - arg0 / 2 <= local1395) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][3] = local16;
		return local7;
	}
}
