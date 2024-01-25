import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "Lclient!qa;")
	public static Class30 aClass30_12;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "[I")
	public static final int[] anIntArray287 = new int[8];

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
	public static int anInt3700 = 13156520;

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray7 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method3324(@OriginalArg(1) int arg0) {
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
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(104) int local104;
		for (local65 = 0; local65 < arg0; local65++) {
			for (local104 = 0; local104 < arg0; local104++) {
				if (local65 <= local104) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(143) int local143;
		for (local104 = arg0 - 1; local104 >= 0; local104--) {
			for (local143 = 0; local143 < arg0; local143++) {
				if (local104 <= local143) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(181) int local181;
		for (local143 = arg0 - 1; local143 >= 0; local143--) {
			for (local181 = 0; local181 < arg0; local181++) {
				if (local181 <= local143 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(223) int local223;
		for (local181 = 0; local181 < arg0; local181++) {
			for (local223 = 0; local223 < arg0; local223++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local223 >= local181 << 1) {
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
		@Pc(277) int local277;
		for (local223 = 0; local223 < arg0; local223++) {
			for (local277 = arg0 - 1; local277 >= 0; local277--) {
				if (local223 >> 1 >= local277) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(322) int local322;
		for (local277 = arg0 - 1; local277 >= 0; local277--) {
			for (local322 = arg0 - 1; local322 >= 0; local322--) {
				if (local277 << 1 <= local322) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(367) int local367;
		for (local322 = arg0 - 1; local322 >= 0; local322--) {
			for (local367 = arg0 - 1; local367 >= 0; local367--) {
				if (local367 <= local322 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(416) int local416;
		for (local367 = arg0 - 1; local367 >= 0; local367--) {
			for (local416 = 0; local416 < arg0; local416++) {
				if (local367 << 1 <= local416) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(458) int local458;
		for (local416 = 0; local416 < arg0; local416++) {
			for (local458 = 0; local458 < arg0; local458++) {
				if (local458 <= local416 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(503) int local503;
		for (local458 = 0; local458 < arg0; local458++) {
			for (local503 = arg0 - 1; local503 >= 0; local503--) {
				if (local458 << 1 <= local503) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(547) int local547;
		for (local503 = arg0 - 1; local503 >= 0; local503--) {
			for (local547 = 0; local547 < arg0; local547++) {
				if (local547 >= local503 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(592) int local592;
		for (local547 = 0; local547 < arg0; local547++) {
			for (local592 = 0; local592 < arg0; local592++) {
				if (local547 << 1 >= local592) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(633) int local633;
		for (local592 = 0; local592 < arg0; local592++) {
			for (local633 = arg0 - 1; local633 >= 0; local633--) {
				if (local633 >= local592 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(675) int local675;
		for (local633 = arg0 - 1; local633 >= 0; local633--) {
			for (local675 = arg0 - 1; local675 >= 0; local675--) {
				if (local633 << 1 >= local675) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(723) int local723;
		for (local675 = arg0 - 1; local675 >= 0; local675--) {
			for (local723 = arg0 - 1; local723 >= 0; local723--) {
				if (local723 >= local675 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(765) int local765;
		for (local723 = arg0 - 1; local723 >= 0; local723--) {
			for (local765 = 0; local765 < arg0; local765++) {
				if (local723 << 1 >= local765) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(807) int local807;
		for (local765 = 0; local765 < arg0; local765++) {
			for (local807 = 0; local807 < arg0; local807++) {
				if (local807 >= local765 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(856) int local856;
		for (local807 = 0; local807 < arg0; local807++) {
			for (local856 = arg0 - 1; local856 >= 0; local856--) {
				if (local807 << 1 >= local856) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(898) int local898;
		for (local856 = 0; local856 < arg0; local856++) {
			for (local898 = 0; local898 < arg0; local898++) {
				if (arg0 / 2 >= local898) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(941) int local941;
		for (local898 = 0; local898 < arg0; local898++) {
			for (local941 = 0; local941 < arg0; local941++) {
				if (arg0 / 2 >= local898) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(984) int local984;
		for (local941 = 0; local941 < arg0; local941++) {
			for (local984 = 0; local984 < arg0; local984++) {
				if (local984 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1031) int local1031;
		for (local984 = 0; local984 < arg0; local984++) {
			for (local1031 = 0; local1031 < arg0; local1031++) {
				if (arg0 / 2 <= local984) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1078) int local1078;
		for (local1031 = 0; local1031 < arg0; local1031++) {
			for (local1078 = 0; local1078 < arg0; local1078++) {
				if (local1078 <= local1031 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1122) int local1122;
		for (local1078 = arg0 - 1; local1078 >= 0; local1078--) {
			for (local1122 = 0; local1122 < arg0; local1122++) {
				if (local1078 - arg0 / 2 >= local1122) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1172) int local1172;
		for (local1122 = arg0 - 1; local1122 >= 0; local1122--) {
			for (local1172 = arg0 - 1; local1172 >= 0; local1172--) {
				if (local1172 <= local1122 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1217) int local1217;
		for (local1172 = 0; local1172 < arg0; local1172++) {
			for (local1217 = arg0 - 1; local1217 >= 0; local1217--) {
				if (local1217 <= local1172 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1266) int local1266;
		for (local1217 = 0; local1217 < arg0; local1217++) {
			for (local1266 = 0; local1266 < arg0; local1266++) {
				if (local1217 - arg0 / 2 <= local1266) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1317) int local1317;
		for (local1266 = arg0 - 1; local1266 >= 0; local1266--) {
			for (local1317 = 0; local1317 < arg0; local1317++) {
				if (local1317 >= local1266 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1369) int local1369;
		for (local1317 = arg0 - 1; local1317 >= 0; local1317--) {
			for (local1369 = arg0 - 1; local1369 >= 0; local1369--) {
				if (local1369 >= local1317 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1369 = 0; local1369 < arg0; local1369++) {
			for (@Pc(1417) int local1417 = arg0 - 1; local1417 >= 0; local1417--) {
				if (local1417 >= local1369 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)I")
	public static int method3326(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(47) int local47 = Static142.method2611(4, arg1 + 45365, arg0 + 91923) + (Static142.method2611(2, arg1 + 10294, arg0 - -37821) - 128 >> 1) + (Static142.method2611(1, arg1, arg0) + -128 >> 2) - 128;
		local47 = (int) ((double) local47 * 0.3D) + 35;
		if (local47 < 10) {
			local47 = 10;
		} else if (local47 > 60) {
			local47 = 60;
		}
		return local47;
	}
}
