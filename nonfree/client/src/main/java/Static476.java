import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static476 {

	@OriginalMember(owner = "client!r", name = "y", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame6;

	@OriginalMember(owner = "client!r", name = "A", descriptor = "I")
	public static int anInt10356;

	@OriginalMember(owner = "client!r", name = "C", descriptor = "[[Lclient!qj;")
	public static Class274[][] aClass274ArrayArray4;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIBI)V")
	public static void method8757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static567.anInt9578 < arg1 || arg2 < Static100.anInt10042) {
			return;
		}
		@Pc(19) boolean local19;
		if (arg3 < Static347.anInt6542) {
			arg3 = Static347.anInt6542;
			local19 = false;
		} else if (arg3 <= Static553.anInt9425) {
			local19 = true;
		} else {
			arg3 = Static553.anInt9425;
			local19 = false;
		}
		@Pc(49) boolean local49;
		if (arg0 < Static347.anInt6542) {
			local49 = false;
			arg0 = Static347.anInt6542;
		} else if (Static553.anInt9425 < arg0) {
			arg0 = Static553.anInt9425;
			local49 = false;
		} else {
			local49 = true;
		}
		if (arg1 < Static100.anInt10042) {
			arg1 = Static100.anInt10042;
		} else {
			Static312.method5228(arg4, Static484.anIntArrayArray41[arg1++], arg0, arg3);
		}
		if (Static567.anInt9578 < arg2) {
			arg2 = Static567.anInt9578;
		} else {
			Static312.method5228(arg4, Static484.anIntArrayArray41[arg2--], arg0, arg3);
		}
		@Pc(105) int local105;
		if (local19 && local49) {
			for (local105 = arg1; local105 <= arg2; local105++) {
				@Pc(111) int[] local111 = Static484.anIntArrayArray41[local105];
				local111[arg3] = local111[arg0] = arg4;
			}
		} else if (local19) {
			for (local105 = arg1; local105 <= arg2; local105++) {
				Static484.anIntArrayArray41[local105][arg3] = arg4;
			}
		} else if (local49) {
			for (local105 = arg1; local105 <= arg2; local105++) {
				Static484.anIntArrayArray41[local105][arg0] = arg4;
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([II[ILclient!wu;IB)Lclient!qp;")
	public static Class1_Sub3 method8758(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class100_Sub1 arg3, @OriginalArg(4) int arg4) {
		@Pc(23) int local23;
		@Pc(33) int local33;
		@Pc(35) int local35;
		if (!arg3.method6050(Static409.aClass242_13, Static598.aClass250_15)) {
			@Pc(73) int[] local73 = new int[arg1 * arg4];
			for (local23 = 0; local23 < arg1; local23++) {
				local33 = arg2[local23] + local23 * arg4;
				for (local35 = 0; local35 < arg0[local23]; local35++) {
					local73[local33++] = -16777216;
				}
			}
			return new Class1_Sub3(arg3, arg4, arg1, local73);
		}
		@Pc(21) byte[] local21 = new byte[arg1 * arg4];
		for (local23 = 0; local23 < arg1; local23++) {
			local33 = arg2[local23] + arg4 * local23;
			for (local35 = 0; local35 < arg0[local23]; local35++) {
				local21[local33++] = -1;
			}
		}
		return new Class1_Sub3(arg3, arg4, arg1, local21);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(FZFF)F")
	public static float method8759(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return (arg1 - arg0) * arg2 + arg0;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BI)[[[B")
	public static byte[][][] method8761(@OriginalArg(1) int arg0) {
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
		@Pc(112) int local112;
		for (local69 = 0; local69 < arg0; local69++) {
			for (local112 = 0; local112 < arg0; local112++) {
				if (local112 >= local69) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(155) int local155;
		for (local112 = arg0 - 1; local112 >= 0; local112--) {
			for (local155 = 0; local155 < arg0; local155++) {
				if (local112 <= local155) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(196) int local196;
		for (local155 = arg0 - 1; local155 >= 0; local155--) {
			for (local196 = 0; local196 < arg0; local196++) {
				if (local155 >> 1 >= local196) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(242) int local242;
		for (local196 = 0; local196 < arg0; local196++) {
			for (local242 = 0; local242 < arg0; local242++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local196 << 1 <= local242) {
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
		@Pc(296) int local296;
		for (local242 = 0; local242 < arg0; local242++) {
			for (local296 = arg0 - 1; local296 >= 0; local296--) {
				if (local242 >> 1 >= local296) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(342) int local342;
		for (local296 = arg0 - 1; local296 >= 0; local296--) {
			for (local342 = arg0 - 1; local342 >= 0; local342--) {
				if (local342 >= local296 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(393) int local393;
		for (local342 = arg0 - 1; local342 >= 0; local342--) {
			for (local393 = arg0 - 1; local393 >= 0; local393--) {
				if (local393 <= local342 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(439) int local439;
		for (local393 = arg0 - 1; local393 >= 0; local393--) {
			for (local439 = 0; local439 < arg0; local439++) {
				if (local393 << 1 <= local439) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(484) int local484;
		for (local439 = 0; local439 < arg0; local439++) {
			for (local484 = 0; local484 < arg0; local484++) {
				if (local484 <= local439 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(533) int local533;
		for (local484 = 0; local484 < arg0; local484++) {
			for (local533 = arg0 - 1; local533 >= 0; local533--) {
				if (local533 >= local484 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(584) int local584;
		for (local533 = arg0 - 1; local533 >= 0; local533--) {
			for (local584 = 0; local584 < arg0; local584++) {
				if (local584 >= local533 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(625) int local625;
		for (local584 = 0; local584 < arg0; local584++) {
			for (local625 = 0; local625 < arg0; local625++) {
				if (local625 <= local584 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(670) int local670;
		for (local625 = 0; local625 < arg0; local625++) {
			for (local670 = arg0 - 1; local670 >= 0; local670--) {
				if (local625 >> 1 <= local670) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(719) int local719;
		for (local670 = arg0 - 1; local670 >= 0; local670--) {
			for (local719 = arg0 - 1; local719 >= 0; local719--) {
				if (local670 << 1 >= local719) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(770) int local770;
		for (local719 = arg0 - 1; local719 >= 0; local719--) {
			for (local770 = arg0 - 1; local770 >= 0; local770--) {
				if (local719 >> 1 <= local770) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local770 = arg0 - 1; local770 >= 0; local770--) {
			for (@Pc(819) int local819 = 0; local819 < arg0; local819++) {
				if (local819 <= local770 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(869) int local869;
		for (@Pc(865) int local865 = 0; local865 < arg0; local865++) {
			for (local869 = 0; local869 < arg0; local869++) {
				if (local865 >> 1 <= local869) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(918) int local918;
		for (local869 = 0; local869 < arg0; local869++) {
			for (local918 = arg0 - 1; local918 >= 0; local918--) {
				if (local918 <= local869 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(963) int local963;
		for (local918 = 0; local918 < arg0; local918++) {
			for (local963 = 0; local963 < arg0; local963++) {
				if (local963 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1006) int local1006;
		for (local963 = 0; local963 < arg0; local963++) {
			for (local1006 = 0; local1006 < arg0; local1006++) {
				if (arg0 / 2 >= local963) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1053) int local1053;
		for (local1006 = 0; local1006 < arg0; local1006++) {
			for (local1053 = 0; local1053 < arg0; local1053++) {
				if (local1053 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1096) int local1096;
		for (local1053 = 0; local1053 < arg0; local1053++) {
			for (local1096 = 0; local1096 < arg0; local1096++) {
				if (local1053 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1143) int local1143;
		for (local1096 = 0; local1096 < arg0; local1096++) {
			for (local1143 = 0; local1143 < arg0; local1143++) {
				if (local1096 - arg0 / 2 >= local1143) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1195) int local1195;
		for (local1143 = arg0 - 1; local1143 >= 0; local1143--) {
			for (local1195 = 0; local1195 < arg0; local1195++) {
				if (local1143 - arg0 / 2 >= local1195) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1239) int local1239;
		for (local1195 = arg0 - 1; local1195 >= 0; local1195--) {
			for (local1239 = arg0 - 1; local1239 >= 0; local1239--) {
				if (local1239 <= local1195 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1288) int local1288;
		for (local1239 = 0; local1239 < arg0; local1239++) {
			for (local1288 = arg0 - 1; local1288 >= 0; local1288--) {
				if (local1288 <= local1239 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1340) int local1340;
		for (local1288 = 0; local1288 < arg0; local1288++) {
			for (local1340 = 0; local1340 < arg0; local1340++) {
				if (local1288 - arg0 / 2 <= local1340) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1392) int local1392;
		for (local1340 = arg0 - 1; local1340 >= 0; local1340--) {
			for (local1392 = 0; local1392 < arg0; local1392++) {
				if (local1392 >= local1340 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1440) int local1440;
		for (local1392 = arg0 - 1; local1392 >= 0; local1392--) {
			for (local1440 = arg0 - 1; local1440 >= 0; local1440--) {
				if (local1392 - arg0 / 2 <= local1440) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1440 = 0; local1440 < arg0; local1440++) {
			for (@Pc(1488) int local1488 = arg0 - 1; local1488 >= 0; local1488--) {
				if (local1488 >= local1440 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)V")
	public static void method8762(@OriginalArg(1) int arg0) {
		if (Static602.anInt10026 == 0) {
			Static224.aClass6_Sub3_Sub4_1.method4715(arg0);
		} else {
			Static142.anInt2680 = arg0;
		}
	}
}
