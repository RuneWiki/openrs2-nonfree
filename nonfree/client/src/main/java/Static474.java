import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!sf", name = "n", descriptor = "Lclient!tu;")
	public static Class322 aClass322_7;

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
	public static int anInt8990;

	@OriginalMember(owner = "client!sf", name = "r", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_97 = new Class70(6, 3);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method7343(@OriginalArg(1) int arg0) {
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
				if (local69 <= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
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
		@Pc(164) int local164;
		for (local113 = arg0 - 1; local113 >= 0; local113--) {
			for (local164 = 0; local164 < arg0; local164++) {
				if (local113 <= local164) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(209) int local209;
		for (local164 = arg0 - 1; local164 >= 0; local164--) {
			for (local209 = 0; local209 < arg0; local209++) {
				if (local164 >> 1 >= local209) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(255) int local255;
		for (local209 = 0; local209 < arg0; local209++) {
			for (local255 = 0; local255 < arg0; local255++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local209 << 1 <= local255) {
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
		@Pc(305) int local305;
		for (local255 = 0; local255 < arg0; local255++) {
			for (local305 = arg0 - 1; local305 >= 0; local305--) {
				if (local305 <= local255 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(350) int local350;
		for (local305 = arg0 - 1; local305 >= 0; local305--) {
			for (local350 = arg0 - 1; local350 >= 0; local350--) {
				if (local305 << 1 <= local350) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(395) int local395;
		for (local350 = arg0 - 1; local350 >= 0; local350--) {
			for (local395 = arg0 - 1; local395 >= 0; local395--) {
				if (local350 >> 1 >= local395) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(437) int local437;
		for (local395 = arg0 - 1; local395 >= 0; local395--) {
			for (local437 = 0; local437 < arg0; local437++) {
				if (local395 << 1 <= local437) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(483) int local483;
		for (local437 = 0; local437 < arg0; local437++) {
			for (local483 = 0; local483 < arg0; local483++) {
				if (local437 >> 1 >= local483) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(524) int local524;
		for (local483 = 0; local483 < arg0; local483++) {
			for (local524 = arg0 - 1; local524 >= 0; local524--) {
				if (local483 << 1 <= local524) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(571) int local571;
		for (local524 = arg0 - 1; local524 >= 0; local524--) {
			for (local571 = 0; local571 < arg0; local571++) {
				if (local571 >= local524 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(616) int local616;
		for (local571 = 0; local571 < arg0; local571++) {
			for (local616 = 0; local616 < arg0; local616++) {
				if (local571 << 1 >= local616) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(661) int local661;
		for (local616 = 0; local616 < arg0; local616++) {
			for (local661 = arg0 - 1; local661 >= 0; local661--) {
				if (local661 >= local616 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(707) int local707;
		for (local661 = arg0 - 1; local661 >= 0; local661--) {
			for (local707 = arg0 - 1; local707 >= 0; local707--) {
				if (local707 <= local661 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(748) int local748;
		for (local707 = arg0 - 1; local707 >= 0; local707--) {
			for (local748 = arg0 - 1; local748 >= 0; local748--) {
				if (local707 >> 1 <= local748) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(794) int local794;
		for (local748 = arg0 - 1; local748 >= 0; local748--) {
			for (local794 = 0; local794 < arg0; local794++) {
				if (local794 <= local748 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(836) int local836;
		for (local794 = 0; local794 < arg0; local794++) {
			for (local836 = 0; local836 < arg0; local836++) {
				if (local836 >= local794 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(890) int local890;
		for (local836 = 0; local836 < arg0; local836++) {
			for (local890 = arg0 - 1; local890 >= 0; local890--) {
				if (local890 <= local836 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(935) int local935;
		for (local890 = 0; local890 < arg0; local890++) {
			for (local935 = 0; local935 < arg0; local935++) {
				if (local935 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(982) int local982;
		for (local935 = 0; local935 < arg0; local935++) {
			for (local982 = 0; local982 < arg0; local982++) {
				if (arg0 / 2 >= local935) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1033) int local1033;
		for (local982 = 0; local982 < arg0; local982++) {
			for (local1033 = 0; local1033 < arg0; local1033++) {
				if (local1033 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1080) int local1080;
		for (local1033 = 0; local1033 < arg0; local1033++) {
			for (local1080 = 0; local1080 < arg0; local1080++) {
				if (local1033 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1119) int local1119;
		for (local1080 = 0; local1080 < arg0; local1080++) {
			for (local1119 = 0; local1119 < arg0; local1119++) {
				if (local1119 <= local1080 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1163) int local1163;
		for (local1119 = arg0 - 1; local1119 >= 0; local1119--) {
			for (local1163 = 0; local1163 < arg0; local1163++) {
				if (local1119 - arg0 / 2 >= local1163) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1208) int local1208;
		for (local1163 = arg0 - 1; local1163 >= 0; local1163--) {
			for (local1208 = arg0 - 1; local1208 >= 0; local1208--) {
				if (local1208 <= local1163 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1250) int local1250;
		for (local1208 = 0; local1208 < arg0; local1208++) {
			for (local1250 = arg0 - 1; local1250 >= 0; local1250--) {
				if (local1208 - arg0 / 2 >= local1250) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1295) int local1295;
		for (local1250 = 0; local1250 < arg0; local1250++) {
			for (local1295 = 0; local1295 < arg0; local1295++) {
				if (local1250 - arg0 / 2 <= local1295) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1343) int local1343;
		for (local1295 = arg0 - 1; local1295 >= 0; local1295--) {
			for (local1343 = 0; local1343 < arg0; local1343++) {
				if (local1295 - arg0 / 2 <= local1343) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1395) int local1395;
		for (local1343 = arg0 - 1; local1343 >= 0; local1343--) {
			for (local1395 = arg0 - 1; local1395 >= 0; local1395--) {
				if (local1343 - arg0 / 2 <= local1395) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1395 = 0; local1395 < arg0; local1395++) {
			for (@Pc(1443) int local1443 = arg0 - 1; local1443 >= 0; local1443--) {
				if (local1443 >= local1395 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)V")
	public static void method7346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static504.method4690(arg1)) {
			Static67.method1205(arg0, Static578.aClass341ArrayArray2[arg1]);
		}
	}
}
