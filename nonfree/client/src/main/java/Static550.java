import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!vca", name = "o", descriptor = "[Lclient!ru;")
	public static Class55_Sub8[] aClass55_Sub8Array7;

	@OriginalMember(owner = "client!vca", name = "h", descriptor = "Lclient!ft;")
	public static final Class110 aClass110_36 = new Class110(14, 6);

	@OriginalMember(owner = "client!vca", name = "m", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_90 = new Class230(41, 3);

	@OriginalMember(owner = "client!vca", name = "n", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_126 = new Class276(33, 6);

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IB)[[[B")
	public static byte[][][] method7234(@OriginalArg(0) int arg0) {
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
		@Pc(64) int local64;
		for (local23 = arg0 - 1; local23 >= 0; local23--) {
			for (local64 = 0; local64 < arg0; local64++) {
				if (local64 <= local23) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(102) int local102;
		for (local64 = 0; local64 < arg0; local64++) {
			for (local102 = 0; local102 < arg0; local102++) {
				if (local102 >= local64) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
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
		@Pc(183) int local183;
		for (local147 = arg0 - 1; local147 >= 0; local147--) {
			for (local183 = 0; local183 < arg0; local183++) {
				if (local147 >> 1 >= local183) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[1][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(227) int local227;
		for (local183 = 0; local183 < arg0; local183++) {
			for (local227 = 0; local227 < arg0; local227++) {
				if (local18 >= 0 && local16.length > local18) {
					if (local227 >= local183 << 1) {
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
		@Pc(289) int local289;
		for (local227 = 0; local227 < arg0; local227++) {
			for (local289 = arg0 - 1; local289 >= 0; local289--) {
				if (local289 <= local227 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[1][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(336) int local336;
		for (local289 = arg0 - 1; local289 >= 0; local289--) {
			for (local336 = arg0 - 1; local336 >= 0; local336--) {
				if (local289 << 1 <= local336) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[1][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(381) int local381;
		for (local336 = arg0 - 1; local336 >= 0; local336--) {
			for (local381 = arg0 - 1; local381 >= 0; local381--) {
				if (local381 <= local336 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(424) int local424;
		for (local381 = arg0 - 1; local381 >= 0; local381--) {
			for (local424 = 0; local424 < arg0; local424++) {
				if (local381 << 1 <= local424) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(464) int local464;
		for (local424 = 0; local424 < arg0; local424++) {
			for (local464 = 0; local464 < arg0; local464++) {
				if (local464 <= local424 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(507) int local507;
		for (local464 = 0; local464 < arg0; local464++) {
			for (local507 = arg0 - 1; local507 >= 0; local507--) {
				if (local507 >= local464 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(552) int local552;
		for (local507 = arg0 - 1; local507 >= 0; local507--) {
			for (local552 = 0; local552 < arg0; local552++) {
				if (local552 >= local507 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(588) int local588;
		for (local552 = 0; local552 < arg0; local552++) {
			for (local588 = 0; local588 < arg0; local588++) {
				if (local588 <= local552 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(635) int local635;
		for (local588 = 0; local588 < arg0; local588++) {
			for (local635 = arg0 - 1; local635 >= 0; local635--) {
				if (local588 >> 1 <= local635) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(675) int local675;
		for (local635 = arg0 - 1; local635 >= 0; local635--) {
			for (local675 = arg0 - 1; local675 >= 0; local675--) {
				if (local635 << 1 >= local675) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(718) int local718;
		for (local675 = arg0 - 1; local675 >= 0; local675--) {
			for (local718 = arg0 - 1; local718 >= 0; local718--) {
				if (local675 >> 1 <= local718) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(761) int local761;
		for (local718 = arg0 - 1; local718 >= 0; local718--) {
			for (local761 = 0; local761 < arg0; local761++) {
				if (local718 << 1 >= local761) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(808) int local808;
		for (local761 = 0; local761 < arg0; local761++) {
			for (local808 = 0; local808 < arg0; local808++) {
				if (local808 >= local761 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(851) int local851;
		for (local808 = 0; local808 < arg0; local808++) {
			for (local851 = arg0 - 1; local851 >= 0; local851--) {
				if (local851 <= local808 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(894) int local894;
		for (local851 = 0; local851 < arg0; local851++) {
			for (local894 = 0; local894 < arg0; local894++) {
				if (arg0 / 2 >= local894) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(939) int local939;
		for (local894 = 0; local894 < arg0; local894++) {
			for (local939 = 0; local939 < arg0; local939++) {
				if (arg0 / 2 >= local894) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(980) int local980;
		for (local939 = 0; local939 < arg0; local939++) {
			for (local980 = 0; local980 < arg0; local980++) {
				if (arg0 / 2 <= local980) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1025) int local1025;
		for (local980 = 0; local980 < arg0; local980++) {
			for (local1025 = 0; local1025 < arg0; local1025++) {
				if (local980 >= arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1070) int local1070;
		for (local1025 = 0; local1025 < arg0; local1025++) {
			for (local1070 = 0; local1070 < arg0; local1070++) {
				if (local1070 <= local1025 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		for (local1070 = arg0 - 1; local1070 >= 0; local1070--) {
			for (@Pc(1120) int local1120 = 0; local1120 < arg0; local1120++) {
				if (local1070 - arg0 / 2 >= local1120) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1175) int local1175;
		for (@Pc(1170) int local1170 = arg0 - 1; local1170 >= 0; local1170--) {
			for (local1175 = arg0 - 1; local1175 >= 0; local1175--) {
				if (local1175 <= local1170 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1221) int local1221;
		for (local1175 = 0; local1175 < arg0; local1175++) {
			for (local1221 = arg0 - 1; local1221 >= 0; local1221--) {
				if (local1175 - arg0 / 2 >= local1221) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1267) int local1267;
		for (local1221 = 0; local1221 < arg0; local1221++) {
			for (local1267 = 0; local1267 < arg0; local1267++) {
				if (local1221 - arg0 / 2 <= local1267) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1313) int local1313;
		for (local1267 = arg0 - 1; local1267 >= 0; local1267--) {
			for (local1313 = 0; local1313 < arg0; local1313++) {
				if (local1267 - arg0 / 2 <= local1313) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1363) int local1363;
		for (local1313 = arg0 - 1; local1313 >= 0; local1313--) {
			for (local1363 = arg0 - 1; local1363 >= 0; local1363--) {
				if (local1363 >= local1313 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		for (local1363 = 0; local1363 < arg0; local1363++) {
			for (@Pc(1410) int local1410 = arg0 - 1; local1410 >= 0; local1410--) {
				if (local1363 - arg0 / 2 <= local1410) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][3] = local16;
		return local7;
	}
}
