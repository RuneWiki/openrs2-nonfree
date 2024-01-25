import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!hu", name = "k", descriptor = "I")
	public static int anInt4104;

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_105 = new Class81(1, -2);

	@OriginalMember(owner = "client!hu", name = "m", descriptor = "Z")
	public static boolean aBoolean334 = true;

	@OriginalMember(owner = "client!hu", name = "o", descriptor = "I")
	public static int anInt4107 = 0;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(III)Z")
	public static boolean method3502(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static344.method5094(arg0, arg1) & (Static96.method1811(arg0, arg1) | (arg0 & 0x2000) != 0 | Static455.method6386(arg1, arg0));
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method3503(@OriginalArg(0) int arg0) {
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
		@Pc(108) int local108;
		for (local69 = 0; local69 < arg0; local69++) {
			for (local108 = 0; local108 < arg0; local108++) {
				if (local108 >= local69) {
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
		@Pc(197) int local197;
		for (local155 = arg0 - 1; local155 >= 0; local155--) {
			for (local197 = 0; local197 < arg0; local197++) {
				if (local197 <= local155 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(242) int local242;
		for (local197 = 0; local197 < arg0; local197++) {
			for (local242 = 0; local242 < arg0; local242++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local242 >= local197 << 1) {
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
		@Pc(311) int local311;
		for (local242 = 0; local242 < arg0; local242++) {
			for (local311 = arg0 - 1; local311 >= 0; local311--) {
				if (local242 >> 1 >= local311) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(360) int local360;
		for (local311 = arg0 - 1; local311 >= 0; local311--) {
			for (local360 = arg0 - 1; local360 >= 0; local360--) {
				if (local360 >= local311 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(408) int local408;
		for (local360 = arg0 - 1; local360 >= 0; local360--) {
			for (local408 = arg0 - 1; local408 >= 0; local408--) {
				if (local360 >> 1 >= local408) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(450) int local450;
		for (local408 = arg0 - 1; local408 >= 0; local408--) {
			for (local450 = 0; local450 < arg0; local450++) {
				if (local450 >= local408 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(492) int local492;
		for (local450 = 0; local450 < arg0; local450++) {
			for (local492 = 0; local492 < arg0; local492++) {
				if (local450 >> 1 >= local492) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(541) int local541;
		for (local492 = 0; local492 < arg0; local492++) {
			for (local541 = arg0 - 1; local541 >= 0; local541--) {
				if (local541 >= local492 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(589) int local589;
		for (local541 = arg0 - 1; local541 >= 0; local541--) {
			for (local589 = 0; local589 < arg0; local589++) {
				if (local589 >= local541 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(627) int local627;
		for (local589 = 0; local589 < arg0; local589++) {
			for (local627 = 0; local627 < arg0; local627++) {
				if (local589 << 1 >= local627) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(680) int local680;
		for (local627 = 0; local627 < arg0; local627++) {
			for (local680 = arg0 - 1; local680 >= 0; local680--) {
				if (local627 >> 1 <= local680) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(726) int local726;
		for (local680 = arg0 - 1; local680 >= 0; local680--) {
			for (local726 = arg0 - 1; local726 >= 0; local726--) {
				if (local726 <= local680 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(773) int local773;
		for (local726 = arg0 - 1; local726 >= 0; local726--) {
			for (local773 = arg0 - 1; local773 >= 0; local773--) {
				if (local726 >> 1 <= local773) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
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
		@Pc(865) int local865;
		for (local819 = 0; local819 < arg0; local819++) {
			for (local865 = 0; local865 < arg0; local865++) {
				if (local819 >> 1 <= local865) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(910) int local910;
		for (local865 = 0; local865 < arg0; local865++) {
			for (local910 = arg0 - 1; local910 >= 0; local910--) {
				if (local910 <= local865 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(959) int local959;
		for (local910 = 0; local910 < arg0; local910++) {
			for (local959 = 0; local959 < arg0; local959++) {
				if (local959 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(998) int local998;
		for (local959 = 0; local959 < arg0; local959++) {
			for (local998 = 0; local998 < arg0; local998++) {
				if (arg0 / 2 >= local959) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1045) int local1045;
		for (local998 = 0; local998 < arg0; local998++) {
			for (local1045 = 0; local1045 < arg0; local1045++) {
				if (local1045 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1097) int local1097;
		for (local1045 = 0; local1045 < arg0; local1045++) {
			for (local1097 = 0; local1097 < arg0; local1097++) {
				if (arg0 / 2 <= local1045) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1144) int local1144;
		for (local1097 = 0; local1097 < arg0; local1097++) {
			for (local1144 = 0; local1144 < arg0; local1144++) {
				if (local1097 - arg0 / 2 >= local1144) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1192) int local1192;
		for (local1144 = arg0 - 1; local1144 >= 0; local1144--) {
			for (local1192 = 0; local1192 < arg0; local1192++) {
				if (local1192 <= local1144 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1237) int local1237;
		for (local1192 = arg0 - 1; local1192 >= 0; local1192--) {
			for (local1237 = arg0 - 1; local1237 >= 0; local1237--) {
				if (local1237 <= local1192 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1289) int local1289;
		for (local1237 = 0; local1237 < arg0; local1237++) {
			for (local1289 = arg0 - 1; local1289 >= 0; local1289--) {
				if (local1237 - arg0 / 2 >= local1289) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1337) int local1337;
		for (local1289 = 0; local1289 < arg0; local1289++) {
			for (local1337 = 0; local1337 < arg0; local1337++) {
				if (local1337 >= local1289 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1385) int local1385;
		for (local1337 = arg0 - 1; local1337 >= 0; local1337--) {
			for (local1385 = 0; local1385 < arg0; local1385++) {
				if (local1337 - arg0 / 2 <= local1385) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1437) int local1437;
		for (local1385 = arg0 - 1; local1385 >= 0; local1385--) {
			for (local1437 = arg0 - 1; local1437 >= 0; local1437--) {
				if (local1385 - arg0 / 2 <= local1437) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1437 = 0; local1437 < arg0; local1437++) {
			for (@Pc(1484) int local1484 = arg0 - 1; local1484 >= 0; local1484--) {
				if (local1437 - arg0 / 2 <= local1484) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(BI)V")
	public static void method3504(@OriginalArg(1) int arg0) {
		if (Static352.anInt6186 == 0) {
			Static504.aClass1_Sub8_Sub3_33.method4651(arg0);
		} else {
			Static69.anInt1589 = arg0;
		}
	}

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(III)Z")
	public static boolean method3505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static28.method2623(arg0, arg1) & Static545.method7406(arg1, arg0);
	}
}
