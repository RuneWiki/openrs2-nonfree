import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
	public static int anInt5432;

	@OriginalMember(owner = "client!ln", name = "i", descriptor = "[I")
	public static int[] anIntArray291;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
	public static int anInt5431 = -1;

	@OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
	public static int anInt5438 = 0;

	@OriginalMember(owner = "client!ln", name = "j", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_64 = new Class46(69, 3);

	@OriginalMember(owner = "client!ln", name = "n", descriptor = "I")
	public static int anInt5442 = 0;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!la;BLclient!la;Lclient!la;Lclient!en;Lclient!ul;)Z")
	public static boolean method4867(@OriginalArg(0) Class207 arg0, @OriginalArg(2) Class207 arg1, @OriginalArg(3) Class207 arg2, @OriginalArg(4) Class93 arg3, @OriginalArg(5) Class5_Sub1_Sub5 arg4) {
		Static643.aClass93_5 = arg3;
		Static462.anIntArray439 = new int[16];
		Static404.aClass5_Sub1_Sub5_2 = arg4;
		Static408.aClass207_84 = arg0;
		Static150.aClass207_33 = arg2;
		Static553.aClass207_116 = arg1;
		for (@Pc(20) int local20 = 0; local20 < 16; local20++) {
			Static462.anIntArray439[local20] = 255;
		}
		return true;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BI)[[[B")
	public static byte[][][] method4868(@OriginalArg(1) int arg0) {
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
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(73) int local73;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local73 = 0; local73 < arg0; local73++) {
				if (local73 <= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(112) int local112;
		for (local73 = 0; local73 < arg0; local73++) {
			for (local112 = 0; local112 < arg0; local112++) {
				if (local112 >= local73) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(159) int local159;
		for (local112 = arg0 - 1; local112 >= 0; local112--) {
			for (local159 = 0; local159 < arg0; local159++) {
				if (local112 <= local159) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(197) int local197;
		for (local159 = arg0 - 1; local159 >= 0; local159--) {
			for (local197 = 0; local197 < arg0; local197++) {
				if (local159 >> 1 >= local197) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(242) int local242;
		for (local197 = 0; local197 < arg0; local197++) {
			for (local242 = 0; local242 < arg0; local242++) {
				if (local20 >= 0 && local18.length > local20) {
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
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(307) int local307;
		for (local242 = 0; local242 < arg0; local242++) {
			for (local307 = arg0 - 1; local307 >= 0; local307--) {
				if (local307 <= local242 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(353) int local353;
		for (local307 = arg0 - 1; local307 >= 0; local307--) {
			for (local353 = arg0 - 1; local353 >= 0; local353--) {
				if (local307 << 1 <= local353) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(401) int local401;
		for (local353 = arg0 - 1; local353 >= 0; local353--) {
			for (local401 = arg0 - 1; local401 >= 0; local401--) {
				if (local401 <= local353 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(447) int local447;
		for (local401 = arg0 - 1; local401 >= 0; local401--) {
			for (local447 = 0; local447 < arg0; local447++) {
				if (local401 << 1 <= local447) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(489) int local489;
		for (local447 = 0; local447 < arg0; local447++) {
			for (local489 = 0; local489 < arg0; local489++) {
				if (local489 <= local447 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(530) int local530;
		for (local489 = 0; local489 < arg0; local489++) {
			for (local530 = arg0 - 1; local530 >= 0; local530--) {
				if (local530 >= local489 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(578) int local578;
		for (local530 = arg0 - 1; local530 >= 0; local530--) {
			for (local578 = 0; local578 < arg0; local578++) {
				if (local530 >> 1 <= local578) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(623) int local623;
		for (local578 = 0; local578 < arg0; local578++) {
			for (local623 = 0; local623 < arg0; local623++) {
				if (local578 << 1 >= local623) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(672) int local672;
		for (local623 = 0; local623 < arg0; local623++) {
			for (local672 = arg0 - 1; local672 >= 0; local672--) {
				if (local672 >= local623 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(725) int local725;
		for (local672 = arg0 - 1; local672 >= 0; local672--) {
			for (local725 = arg0 - 1; local725 >= 0; local725--) {
				if (local672 << 1 >= local725) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(773) int local773;
		for (local725 = arg0 - 1; local725 >= 0; local725--) {
			for (local773 = arg0 - 1; local773 >= 0; local773--) {
				if (local725 >> 1 <= local773) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(816) int local816;
		for (local773 = arg0 - 1; local773 >= 0; local773--) {
			for (local816 = 0; local816 < arg0; local816++) {
				if (local816 <= local773 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(861) int local861;
		for (local816 = 0; local816 < arg0; local816++) {
			for (local861 = 0; local861 < arg0; local861++) {
				if (local861 >= local816 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(902) int local902;
		for (local861 = 0; local861 < arg0; local861++) {
			for (local902 = arg0 - 1; local902 >= 0; local902--) {
				if (local861 << 1 >= local902) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(944) int local944;
		for (local902 = 0; local902 < arg0; local902++) {
			for (local944 = 0; local944 < arg0; local944++) {
				if (local944 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(983) int local983;
		for (local944 = 0; local944 < arg0; local944++) {
			for (local983 = 0; local983 < arg0; local983++) {
				if (arg0 / 2 >= local944) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1030) int local1030;
		for (local983 = 0; local983 < arg0; local983++) {
			for (local1030 = 0; local1030 < arg0; local1030++) {
				if (arg0 / 2 <= local1030) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1030 = 0; local1030 < arg0; local1030++) {
			for (@Pc(1081) int local1081 = 0; local1081 < arg0; local1081++) {
				if (local1030 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1132) int local1132;
		for (@Pc(1128) int local1128 = 0; local1128 < arg0; local1128++) {
			for (local1132 = 0; local1132 < arg0; local1132++) {
				if (local1128 - arg0 / 2 >= local1132) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1180) int local1180;
		for (local1132 = arg0 - 1; local1132 >= 0; local1132--) {
			for (local1180 = 0; local1180 < arg0; local1180++) {
				if (local1180 <= local1132 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1229) int local1229;
		for (local1180 = arg0 - 1; local1180 >= 0; local1180--) {
			for (local1229 = arg0 - 1; local1229 >= 0; local1229--) {
				if (local1229 <= local1180 - arg0 / 2) {
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
				if (local1229 - arg0 / 2 >= local1278) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1322) int local1322;
		for (local1278 = 0; local1278 < arg0; local1278++) {
			for (local1322 = 0; local1322 < arg0; local1322++) {
				if (local1278 - arg0 / 2 <= local1322) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1374) int local1374;
		for (local1322 = arg0 - 1; local1322 >= 0; local1322--) {
			for (local1374 = 0; local1374 < arg0; local1374++) {
				if (local1322 - arg0 / 2 <= local1374) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1423) int local1423;
		for (local1374 = arg0 - 1; local1374 >= 0; local1374--) {
			for (local1423 = arg0 - 1; local1423 >= 0; local1423--) {
				if (local1374 - arg0 / 2 <= local1423) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1423 = 0; local1423 < arg0; local1423++) {
			for (@Pc(1469) int local1469 = arg0 - 1; local1469 >= 0; local1469--) {
				if (local1423 - arg0 / 2 <= local1469) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z[Lclient!raa;I)V")
	public static void method4870(@OriginalArg(1) Class295[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class295 local13 = arg0[local7];
			if (local13 != null) {
				if (local13.anInt8001 == 0) {
					if (local13.aClass295Array2 != null) {
						method4870(local13.aClass295Array2, arg1);
					}
					@Pc(37) Class5_Sub27 local37 = (Class5_Sub27) Static269.aClass273_11.method6581((long) local13.anInt8022);
					if (local37 != null) {
						Static441.method6684(arg1, local37.anInt4270);
					}
				}
				@Pc(56) Class5_Sub51 local56;
				if (arg1 == 0 && local13.anObjectArray8 != null) {
					local56 = new Class5_Sub51();
					local56.aClass295_19 = local13;
					local56.anObjectArray33 = local13.anObjectArray8;
					Static370.method5457(local56);
				}
				if (arg1 == 1 && local13.anObjectArray4 != null) {
					if (local13.anInt8025 >= 0) {
						@Pc(81) Class295 local81 = Static107.method9049(local13.anInt8022);
						if (local81 == null || local81.aClass295Array2 == null || local81.aClass295Array2.length <= local13.anInt8025 || local81.aClass295Array2[local13.anInt8025] != local13) {
							continue;
						}
					}
					local56 = new Class5_Sub51();
					local56.anObjectArray33 = local13.anObjectArray4;
					local56.aClass295_19 = local13;
					Static370.method5457(local56);
				}
			}
		}
	}
}
