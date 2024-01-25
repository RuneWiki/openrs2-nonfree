import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "[[I")
	public static int[][] anIntArrayArray185;

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "[Lclient!vj;")
	public static Class58[] aClass58Array140;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_251 = new Class198(16);

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_372 = new Class159("Loading fonts - ", "Lade Schriftsätze - ", "Chargement des polices - ", "Carregando fontes - ");

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
	public static int anInt6798 = -1;

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_373 = new Class159(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
	public static int anInt6799 = -1;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)[[[B")
	public static byte[][][] method5688(@OriginalArg(0) int arg0) {
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
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(196) int local196;
		for (local155 = arg0 - 1; local155 >= 0; local155--) {
			for (local196 = 0; local196 < arg0; local196++) {
				if (local196 <= local155 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(234) int local234;
		for (local196 = 0; local196 < arg0; local196++) {
			for (local234 = 0; local234 < arg0; local234++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local234 >= local196 << 1) {
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
		@Pc(295) int local295;
		for (local234 = 0; local234 < arg0; local234++) {
			for (local295 = arg0 - 1; local295 >= 0; local295--) {
				if (local295 <= local234 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(344) int local344;
		for (local295 = arg0 - 1; local295 >= 0; local295--) {
			for (local344 = arg0 - 1; local344 >= 0; local344--) {
				if (local344 >= local295 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(395) int local395;
		for (local344 = arg0 - 1; local344 >= 0; local344--) {
			for (local395 = arg0 - 1; local395 >= 0; local395--) {
				if (local344 >> 1 >= local395) {
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
				if (local437 >= local395 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(482) int local482;
		for (local437 = 0; local437 < arg0; local437++) {
			for (local482 = 0; local482 < arg0; local482++) {
				if (local437 >> 1 >= local482) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(535) int local535;
		for (local482 = 0; local482 < arg0; local482++) {
			for (local535 = arg0 - 1; local535 >= 0; local535--) {
				if (local535 >= local482 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(586) int local586;
		for (local535 = arg0 - 1; local535 >= 0; local535--) {
			for (local586 = 0; local586 < arg0; local586++) {
				if (local535 >> 1 <= local586) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(635) int local635;
		for (local586 = 0; local586 < arg0; local586++) {
			for (local635 = 0; local635 < arg0; local635++) {
				if (local586 << 1 >= local635) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(676) int local676;
		for (local635 = 0; local635 < arg0; local635++) {
			for (local676 = arg0 - 1; local676 >= 0; local676--) {
				if (local676 >= local635 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(721) int local721;
		for (local676 = arg0 - 1; local676 >= 0; local676--) {
			for (local721 = arg0 - 1; local721 >= 0; local721--) {
				if (local721 <= local676 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(768) int local768;
		for (local721 = arg0 - 1; local721 >= 0; local721--) {
			for (local768 = arg0 - 1; local768 >= 0; local768--) {
				if (local721 >> 1 <= local768) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(810) int local810;
		for (local768 = arg0 - 1; local768 >= 0; local768--) {
			for (local810 = 0; local810 < arg0; local810++) {
				if (local768 << 1 >= local810) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(859) int local859;
		for (local810 = 0; local810 < arg0; local810++) {
			for (local859 = 0; local859 < arg0; local859++) {
				if (local859 >= local810 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(908) int local908;
		for (local859 = 0; local859 < arg0; local859++) {
			for (local908 = arg0 - 1; local908 >= 0; local908--) {
				if (local908 <= local859 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(953) int local953;
		for (local908 = 0; local908 < arg0; local908++) {
			for (local953 = 0; local953 < arg0; local953++) {
				if (local953 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1000) int local1000;
		for (local953 = 0; local953 < arg0; local953++) {
			for (local1000 = 0; local1000 < arg0; local1000++) {
				if (arg0 / 2 >= local953) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1043) int local1043;
		for (local1000 = 0; local1000 < arg0; local1000++) {
			for (local1043 = 0; local1043 < arg0; local1043++) {
				if (arg0 / 2 <= local1043) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1090) int local1090;
		for (local1043 = 0; local1043 < arg0; local1043++) {
			for (local1090 = 0; local1090 < arg0; local1090++) {
				if (local1043 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1133) int local1133;
		for (local1090 = 0; local1090 < arg0; local1090++) {
			for (local1133 = 0; local1133 < arg0; local1133++) {
				if (local1090 - arg0 / 2 >= local1133) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1176) int local1176;
		for (local1133 = arg0 - 1; local1133 >= 0; local1133--) {
			for (local1176 = 0; local1176 < arg0; local1176++) {
				if (local1176 <= local1133 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1228) int local1228;
		for (local1176 = arg0 - 1; local1176 >= 0; local1176--) {
			for (local1228 = arg0 - 1; local1228 >= 0; local1228--) {
				if (local1176 - arg0 / 2 >= local1228) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1274) int local1274;
		for (local1228 = 0; local1228 < arg0; local1228++) {
			for (local1274 = arg0 - 1; local1274 >= 0; local1274--) {
				if (local1274 <= local1228 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1318) int local1318;
		for (local1274 = 0; local1274 < arg0; local1274++) {
			for (local1318 = 0; local1318 < arg0; local1318++) {
				if (local1318 >= local1274 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1318 = arg0 - 1; local1318 >= 0; local1318--) {
			for (@Pc(1369) int local1369 = 0; local1369 < arg0; local1369++) {
				if (local1369 >= local1318 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1430) int local1430;
		for (@Pc(1424) int local1424 = arg0 - 1; local1424 >= 0; local1424--) {
			for (local1430 = arg0 - 1; local1430 >= 0; local1430--) {
				if (local1430 >= local1424 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1430 = 0; local1430 < arg0; local1430++) {
			for (@Pc(1477) int local1477 = arg0 - 1; local1477 >= 0; local1477--) {
				if (local1477 >= local1430 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
