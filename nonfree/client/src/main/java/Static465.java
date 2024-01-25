import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!rj", name = "v", descriptor = "Lclient!au;")
	public static final Class21 aClass21_71 = new Class21(8);

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(II)[[[B")
	public static byte[][][] method5996(@OriginalArg(0) int arg0) {
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
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(120) int local120;
		for (local73 = 0; local73 < arg0; local73++) {
			for (local120 = 0; local120 < arg0; local120++) {
				if (local120 >= local73) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(159) int local159;
		for (local120 = arg0 - 1; local120 >= 0; local120--) {
			for (local159 = 0; local159 < arg0; local159++) {
				if (local159 >= local120) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(213) int local213;
		for (local159 = arg0 - 1; local159 >= 0; local159--) {
			for (local213 = 0; local213 < arg0; local213++) {
				if (local213 <= local159 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(255) int local255;
		for (local213 = 0; local213 < arg0; local213++) {
			for (local255 = 0; local255 < arg0; local255++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local255 >= local213 << 1) {
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
		@Pc(316) int local316;
		for (local255 = 0; local255 < arg0; local255++) {
			for (local316 = arg0 - 1; local316 >= 0; local316--) {
				if (local316 <= local255 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(365) int local365;
		for (local316 = arg0 - 1; local316 >= 0; local316--) {
			for (local365 = arg0 - 1; local365 >= 0; local365--) {
				if (local365 >= local316 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(413) int local413;
		for (local365 = arg0 - 1; local365 >= 0; local365--) {
			for (local413 = arg0 - 1; local413 >= 0; local413--) {
				if (local365 >> 1 >= local413) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(458) int local458;
		for (local413 = arg0 - 1; local413 >= 0; local413--) {
			for (local458 = 0; local458 < arg0; local458++) {
				if (local458 >= local413 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(500) int local500;
		for (local458 = 0; local458 < arg0; local458++) {
			for (local500 = 0; local500 < arg0; local500++) {
				if (local458 >> 1 >= local500) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(545) int local545;
		for (local500 = 0; local500 < arg0; local500++) {
			for (local545 = arg0 - 1; local545 >= 0; local545--) {
				if (local545 >= local500 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(585) int local585;
		for (local545 = arg0 - 1; local545 >= 0; local545--) {
			for (local585 = 0; local585 < arg0; local585++) {
				if (local545 >> 1 <= local585) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(626) int local626;
		for (local585 = 0; local585 < arg0; local585++) {
			for (local626 = 0; local626 < arg0; local626++) {
				if (local585 << 1 >= local626) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(667) int local667;
		for (local626 = 0; local626 < arg0; local626++) {
			for (local667 = arg0 - 1; local667 >= 0; local667--) {
				if (local667 >= local626 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(720) int local720;
		for (local667 = arg0 - 1; local667 >= 0; local667--) {
			for (local720 = arg0 - 1; local720 >= 0; local720--) {
				if (local720 <= local667 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(764) int local764;
		for (local720 = arg0 - 1; local720 >= 0; local720--) {
			for (local764 = arg0 - 1; local764 >= 0; local764--) {
				if (local764 >= local720 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(807) int local807;
		for (local764 = arg0 - 1; local764 >= 0; local764--) {
			for (local807 = 0; local807 < arg0; local807++) {
				if (local764 << 1 >= local807) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(856) int local856;
		for (local807 = 0; local807 < arg0; local807++) {
			for (local856 = 0; local856 < arg0; local856++) {
				if (local856 >= local807 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(905) int local905;
		for (local856 = 0; local856 < arg0; local856++) {
			for (local905 = arg0 - 1; local905 >= 0; local905--) {
				if (local905 <= local856 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(943) int local943;
		for (local905 = 0; local905 < arg0; local905++) {
			for (local943 = 0; local943 < arg0; local943++) {
				if (arg0 / 2 >= local943) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(990) int local990;
		for (local943 = 0; local943 < arg0; local943++) {
			for (local990 = 0; local990 < arg0; local990++) {
				if (arg0 / 2 >= local943) {
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
				if (arg0 / 2 <= local1037) {
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
				if (local1037 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1131) int local1131;
		for (local1080 = 0; local1080 < arg0; local1080++) {
			for (local1131 = 0; local1131 < arg0; local1131++) {
				if (local1131 <= local1080 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1178) int local1178;
		for (local1131 = arg0 - 1; local1131 >= 0; local1131--) {
			for (local1178 = 0; local1178 < arg0; local1178++) {
				if (local1178 <= local1131 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1230) int local1230;
		for (local1178 = arg0 - 1; local1178 >= 0; local1178--) {
			for (local1230 = arg0 - 1; local1230 >= 0; local1230--) {
				if (local1230 <= local1178 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1278) int local1278;
		for (local1230 = 0; local1230 < arg0; local1230++) {
			for (local1278 = arg0 - 1; local1278 >= 0; local1278--) {
				if (local1278 <= local1230 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1322) int local1322;
		for (local1278 = 0; local1278 < arg0; local1278++) {
			for (local1322 = 0; local1322 < arg0; local1322++) {
				if (local1322 >= local1278 - arg0 / 2) {
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
				if (local1322 - arg0 / 2 <= local1370) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1415) int local1415;
		for (local1370 = arg0 - 1; local1370 >= 0; local1370--) {
			for (local1415 = arg0 - 1; local1415 >= 0; local1415--) {
				if (local1415 >= local1370 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1415 = 0; local1415 < arg0; local1415++) {
			for (@Pc(1460) int local1460 = arg0 - 1; local1460 >= 0; local1460--) {
				if (local1415 - arg0 / 2 <= local1460) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLclient!gk;)V")
	public static void method5997(@OriginalArg(1) Class2_Sub7 arg0) {
		@Pc(9) int local9 = arg0.method4458();
		Static69.aClass299Array3 = new Class299[local9];
		for (@Pc(19) int local19 = 0; local19 < local9; local19++) {
			Static69.aClass299Array3[local19] = new Class299();
			Static69.aClass299Array3[local19].anInt7441 = arg0.method4458();
			Static69.aClass299Array3[local19].aString114 = arg0.method4487();
		}
		Static162.anInt2511 = arg0.method4458();
		Static434.anInt6972 = arg0.method4458();
		Static17.anInt4840 = arg0.method4458();
		Static376.aClass86_Sub1Array1 = new Class86_Sub1[Static434.anInt6972 + 1 - Static162.anInt2511];
		for (@Pc(66) int local66 = 0; local66 < Static17.anInt4840; local66++) {
			@Pc(72) int local72 = arg0.method4458();
			@Pc(80) Class86_Sub1 local80 = Static376.aClass86_Sub1Array1[local72] = new Class86_Sub1();
			local80.anInt1977 = arg0.method4464();
			local80.anInt1984 = arg0.method4509();
			local80.anInt1989 = Static162.anInt2511 + local72;
			local80.aString23 = arg0.method4487();
			local80.aString24 = arg0.method4487();
		}
		Static104.anInt1828 = arg0.method4509();
		Static582.aBoolean787 = true;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZ)I")
	public static int method5998(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(65) double local65 = 0.0D;
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local46 + local32) / 2.0D;
		if (local32 != local46) {
			if (local73 < 0.5D) {
				local67 = (local46 - local32) / (local32 + local46);
			}
			if (local73 >= 0.5D) {
				local67 = (local46 - local32) / ((2.0D - local46) - local32);
			}
			if (local14 == local46) {
				local65 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local65 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local46 == local30) {
				local65 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
		}
		local65 /= 6.0D;
		@Pc(161) int local161 = (int) (local65 * 256.0D);
		@Pc(166) int local166 = (int) (local67 * 256.0D);
		@Pc(171) int local171 = (int) (local73 * 256.0D);
		if (local166 < 0) {
			local166 = 0;
		} else if (local166 > 255) {
			local166 = 255;
		}
		if (local171 < 0) {
			local171 = 0;
		} else if (local171 > 255) {
			local171 = 255;
		}
		if (local171 > 243) {
			local166 >>= 0x4;
		} else if (local171 > 217) {
			local166 >>= 0x3;
		} else if (local171 > 192) {
			local166 >>= 0x2;
		} else if (local171 > 179) {
			local166 >>= 0x1;
		}
		return (local166 >> 5 << 7) + ((local161 & 0xFF) >> 2 << 10) + (local171 >> 1);
	}
}
