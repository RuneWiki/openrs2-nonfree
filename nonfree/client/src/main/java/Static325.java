import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method5035(@OriginalArg(0) int arg0) {
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
		@Pc(69) int local69;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local69 = 0; local69 < arg0; local69++) {
				if (local69 <= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(113) int local113;
		for (local69 = 0; local69 < arg0; local69++) {
			for (local113 = 0; local113 < arg0; local113++) {
				if (local69 <= local113) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(160) int local160;
		for (local113 = arg0 - 1; local113 >= 0; local113--) {
			for (local160 = 0; local160 < arg0; local160++) {
				if (local113 <= local160) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(202) int local202;
		for (local160 = arg0 - 1; local160 >= 0; local160--) {
			for (local202 = 0; local202 < arg0; local202++) {
				if (local202 <= local160 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(243) int local243;
		for (local202 = 0; local202 < arg0; local202++) {
			for (local243 = 0; local243 < arg0; local243++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local243 >= local202 << 1) {
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
		@Pc(300) int local300;
		for (local243 = 0; local243 < arg0; local243++) {
			for (local300 = arg0 - 1; local300 >= 0; local300--) {
				if (local300 <= local243 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(353) int local353;
		for (local300 = arg0 - 1; local300 >= 0; local300--) {
			for (local353 = arg0 - 1; local353 >= 0; local353--) {
				if (local353 >= local300 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(397) int local397;
		for (local353 = arg0 - 1; local353 >= 0; local353--) {
			for (local397 = arg0 - 1; local397 >= 0; local397--) {
				if (local353 >> 1 >= local397) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(439) int local439;
		for (local397 = arg0 - 1; local397 >= 0; local397--) {
			for (local439 = 0; local439 < arg0; local439++) {
				if (local397 << 1 <= local439) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(485) int local485;
		for (local439 = 0; local439 < arg0; local439++) {
			for (local485 = 0; local485 < arg0; local485++) {
				if (local439 >> 1 >= local485) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(530) int local530;
		for (local485 = 0; local485 < arg0; local485++) {
			for (local530 = arg0 - 1; local530 >= 0; local530--) {
				if (local530 >= local485 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(581) int local581;
		for (local530 = arg0 - 1; local530 >= 0; local530--) {
			for (local581 = 0; local581 < arg0; local581++) {
				if (local581 >= local530 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(626) int local626;
		for (local581 = 0; local581 < arg0; local581++) {
			for (local626 = 0; local626 < arg0; local626++) {
				if (local626 <= local581 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(675) int local675;
		for (local626 = 0; local626 < arg0; local626++) {
			for (local675 = arg0 - 1; local675 >= 0; local675--) {
				if (local626 >> 1 <= local675) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(724) int local724;
		for (local675 = arg0 - 1; local675 >= 0; local675--) {
			for (local724 = arg0 - 1; local724 >= 0; local724--) {
				if (local675 << 1 >= local724) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(768) int local768;
		for (local724 = arg0 - 1; local724 >= 0; local724--) {
			for (local768 = arg0 - 1; local768 >= 0; local768--) {
				if (local768 >= local724 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(817) int local817;
		for (local768 = arg0 - 1; local768 >= 0; local768--) {
			for (local817 = 0; local817 < arg0; local817++) {
				if (local768 << 1 >= local817) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(862) int local862;
		for (local817 = 0; local817 < arg0; local817++) {
			for (local862 = 0; local862 < arg0; local862++) {
				if (local862 >= local817 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(907) int local907;
		for (local862 = 0; local862 < arg0; local862++) {
			for (local907 = arg0 - 1; local907 >= 0; local907--) {
				if (local862 << 1 >= local907) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(956) int local956;
		for (local907 = 0; local907 < arg0; local907++) {
			for (local956 = 0; local956 < arg0; local956++) {
				if (local956 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1007) int local1007;
		for (local956 = 0; local956 < arg0; local956++) {
			for (local1007 = 0; local1007 < arg0; local1007++) {
				if (arg0 / 2 >= local956) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1058) int local1058;
		for (local1007 = 0; local1007 < arg0; local1007++) {
			for (local1058 = 0; local1058 < arg0; local1058++) {
				if (local1058 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1097) int local1097;
		for (local1058 = 0; local1058 < arg0; local1058++) {
			for (local1097 = 0; local1097 < arg0; local1097++) {
				if (local1058 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1140) int local1140;
		for (local1097 = 0; local1097 < arg0; local1097++) {
			for (local1140 = 0; local1140 < arg0; local1140++) {
				if (local1140 <= local1097 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1188) int local1188;
		for (local1140 = arg0 - 1; local1140 >= 0; local1140--) {
			for (local1188 = 0; local1188 < arg0; local1188++) {
				if (local1188 <= local1140 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1240) int local1240;
		for (local1188 = arg0 - 1; local1188 >= 0; local1188--) {
			for (local1240 = arg0 - 1; local1240 >= 0; local1240--) {
				if (local1240 <= local1188 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1281) int local1281;
		for (local1240 = 0; local1240 < arg0; local1240++) {
			for (local1281 = arg0 - 1; local1281 >= 0; local1281--) {
				if (local1240 - arg0 / 2 >= local1281) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1322) int local1322;
		for (local1281 = 0; local1281 < arg0; local1281++) {
			for (local1322 = 0; local1322 < arg0; local1322++) {
				if (local1322 >= local1281 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1370) int local1370;
		for (local1322 = arg0 - 1; local1322 >= 0; local1322--) {
			for (local1370 = 0; local1370 < arg0; local1370++) {
				if (local1370 >= local1322 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1418) int local1418;
		for (local1370 = arg0 - 1; local1370 >= 0; local1370--) {
			for (local1418 = arg0 - 1; local1418 >= 0; local1418--) {
				if (local1370 - arg0 / 2 <= local1418) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1418 = 0; local1418 < arg0; local1418++) {
			for (@Pc(1460) int local1460 = arg0 - 1; local1460 >= 0; local1460--) {
				if (local1418 - arg0 / 2 <= local1460) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)Lclient!tm;")
	public static Class49_Sub3 method5036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class255 local7 = Static242.aClass255ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass49_Sub3_2;
	}
}
