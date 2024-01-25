import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!kt", name = "h", descriptor = "Lclient!ul;")
	public static Class246 aClass246_120;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(CZ)Z")
	public static boolean method3366(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "(IB)[[[B")
	public static byte[][][] method3368(@OriginalArg(0) int arg0) {
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
		@Pc(69) int local69;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local69 = 0; local69 < arg0; local69++) {
				if (local26 >= local69) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(109) int local109;
		for (local69 = 0; local69 < arg0; local69++) {
			for (local109 = 0; local109 < arg0; local109++) {
				if (local109 >= local69) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(156) int local156;
		for (local109 = arg0 - 1; local109 >= 0; local109--) {
			for (local156 = 0; local156 < arg0; local156++) {
				if (local156 >= local109) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(201) int local201;
		for (local156 = arg0 - 1; local156 >= 0; local156--) {
			for (local201 = 0; local201 < arg0; local201++) {
				if (local201 <= local156 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(246) int local246;
		for (local201 = 0; local201 < arg0; local201++) {
			for (local246 = 0; local246 < arg0; local246++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local201 << 1 <= local246) {
						local18[local20] = -1;
					}
					local20++;
				} else {
					local20++;
				}
			}
		}
		local9[1][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(304) int local304;
		for (local246 = 0; local246 < arg0; local246++) {
			for (local304 = arg0 - 1; local304 >= 0; local304--) {
				if (local304 <= local246 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(350) int local350;
		for (local304 = arg0 - 1; local304 >= 0; local304--) {
			for (local350 = arg0 - 1; local350 >= 0; local350--) {
				if (local350 >= local304 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(397) int local397;
		for (local350 = arg0 - 1; local350 >= 0; local350--) {
			for (local397 = arg0 - 1; local397 >= 0; local397--) {
				if (local397 <= local350 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(443) int local443;
		for (local397 = arg0 - 1; local397 >= 0; local397--) {
			for (local443 = 0; local443 < arg0; local443++) {
				if (local397 << 1 <= local443) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(488) int local488;
		for (local443 = 0; local443 < arg0; local443++) {
			for (local488 = 0; local488 < arg0; local488++) {
				if (local443 >> 1 >= local488) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(537) int local537;
		for (local488 = 0; local488 < arg0; local488++) {
			for (local537 = arg0 - 1; local537 >= 0; local537--) {
				if (local537 >= local488 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(581) int local581;
		for (local537 = arg0 - 1; local537 >= 0; local537--) {
			for (local581 = 0; local581 < arg0; local581++) {
				if (local581 >= local537 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(619) int local619;
		for (local581 = 0; local581 < arg0; local581++) {
			for (local619 = 0; local619 < arg0; local619++) {
				if (local581 << 1 >= local619) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(672) int local672;
		for (local619 = 0; local619 < arg0; local619++) {
			for (local672 = arg0 - 1; local672 >= 0; local672--) {
				if (local619 >> 1 <= local672) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(714) int local714;
		for (local672 = arg0 - 1; local672 >= 0; local672--) {
			for (local714 = arg0 - 1; local714 >= 0; local714--) {
				if (local714 <= local672 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(762) int local762;
		for (local714 = arg0 - 1; local714 >= 0; local714--) {
			for (local762 = arg0 - 1; local762 >= 0; local762--) {
				if (local714 >> 1 <= local762) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(824) int local824;
		for (local762 = arg0 - 1; local762 >= 0; local762--) {
			for (local824 = 0; local824 < arg0; local824++) {
				if (local824 <= local762 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(866) int local866;
		for (local824 = 0; local824 < arg0; local824++) {
			for (local866 = 0; local866 < arg0; local866++) {
				if (local824 >> 1 <= local866) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(911) int local911;
		for (local866 = 0; local866 < arg0; local866++) {
			for (local911 = arg0 - 1; local911 >= 0; local911--) {
				if (local866 << 1 >= local911) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(953) int local953;
		for (local911 = 0; local911 < arg0; local911++) {
			for (local953 = 0; local953 < arg0; local953++) {
				if (arg0 / 2 >= local953) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1000) int local1000;
		for (local953 = 0; local953 < arg0; local953++) {
			for (local1000 = 0; local1000 < arg0; local1000++) {
				if (local953 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1047) int local1047;
		for (local1000 = 0; local1000 < arg0; local1000++) {
			for (local1047 = 0; local1047 < arg0; local1047++) {
				if (local1047 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1090) int local1090;
		for (local1047 = 0; local1047 < arg0; local1047++) {
			for (local1090 = 0; local1090 < arg0; local1090++) {
				if (arg0 / 2 <= local1047) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1137) int local1137;
		for (local1090 = 0; local1090 < arg0; local1090++) {
			for (local1137 = 0; local1137 < arg0; local1137++) {
				if (local1090 - arg0 / 2 >= local1137) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1184) int local1184;
		for (local1137 = arg0 - 1; local1137 >= 0; local1137--) {
			for (local1184 = 0; local1184 < arg0; local1184++) {
				if (local1184 <= local1137 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1229) int local1229;
		for (local1184 = arg0 - 1; local1184 >= 0; local1184--) {
			for (local1229 = arg0 - 1; local1229 >= 0; local1229--) {
				if (local1184 - arg0 / 2 >= local1229) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1278) int local1278;
		for (local1229 = 0; local1229 < arg0; local1229++) {
			for (local1278 = arg0 - 1; local1278 >= 0; local1278--) {
				if (local1278 <= local1229 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1321) int local1321;
		for (local1278 = 0; local1278 < arg0; local1278++) {
			for (local1321 = 0; local1321 < arg0; local1321++) {
				if (local1278 - arg0 / 2 <= local1321) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1373) int local1373;
		for (local1321 = arg0 - 1; local1321 >= 0; local1321--) {
			for (local1373 = 0; local1373 < arg0; local1373++) {
				if (local1373 >= local1321 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1425) int local1425;
		for (local1373 = arg0 - 1; local1373 >= 0; local1373--) {
			for (local1425 = arg0 - 1; local1425 >= 0; local1425--) {
				if (local1425 >= local1373 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1425 = 0; local1425 < arg0; local1425++) {
			for (@Pc(1477) int local1477 = arg0 - 1; local1477 >= 0; local1477--) {
				if (local1425 - arg0 / 2 <= local1477) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IILclient!hj;IFIFFI[BIFF)V")
	public static void method3370(@OriginalArg(1) int arg0, @OriginalArg(2) Class103 arg1, @OriginalArg(4) float arg2, @OriginalArg(6) float arg3, @OriginalArg(7) float arg4, @OriginalArg(9) byte[] arg5, @OriginalArg(11) float arg6, @OriginalArg(12) float arg7) {
		for (@Pc(18) int local18 = 0; local18 < 16; local18++) {
			Static387.method5219(arg0, local18, arg3, arg1, arg5, arg7, arg6, arg4, arg2);
			arg0 += 16384;
		}
	}
}
