import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!pb", name = "P", descriptor = "[I")
	public static int[] anIntArray506;

	@OriginalMember(owner = "client!pb", name = "K", descriptor = "[F")
	public static final float[] aFloatArray55 = new float[4];

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZI)[[[B")
	public static byte[][][] method6056(@OriginalArg(1) int arg0) {
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
				if (local65 <= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(105) int local105;
		for (local65 = 0; local65 < arg0; local65++) {
			for (local105 = 0; local105 < arg0; local105++) {
				if (local105 >= local65) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(152) int local152;
		for (local105 = arg0 - 1; local105 >= 0; local105--) {
			for (local152 = 0; local152 < arg0; local152++) {
				if (local105 <= local152) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(190) int local190;
		for (local152 = arg0 - 1; local152 >= 0; local152--) {
			for (local190 = 0; local190 < arg0; local190++) {
				if (local190 <= local152 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(228) int local228;
		for (local190 = 0; local190 < arg0; local190++) {
			for (local228 = 0; local228 < arg0; local228++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local190 << 1 <= local228) {
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
		@Pc(282) int local282;
		for (local228 = 0; local228 < arg0; local228++) {
			for (local282 = arg0 - 1; local282 >= 0; local282--) {
				if (local282 <= local228 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(328) int local328;
		for (local282 = arg0 - 1; local282 >= 0; local282--) {
			for (local328 = arg0 - 1; local328 >= 0; local328--) {
				if (local328 >= local282 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(372) int local372;
		for (local328 = arg0 - 1; local328 >= 0; local328--) {
			for (local372 = arg0 - 1; local372 >= 0; local372--) {
				if (local328 >> 1 >= local372) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(417) int local417;
		for (local372 = arg0 - 1; local372 >= 0; local372--) {
			for (local417 = 0; local417 < arg0; local417++) {
				if (local417 >= local372 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(455) int local455;
		for (local417 = 0; local417 < arg0; local417++) {
			for (local455 = 0; local455 < arg0; local455++) {
				if (local455 <= local417 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(500) int local500;
		for (local455 = 0; local455 < arg0; local455++) {
			for (local500 = arg0 - 1; local500 >= 0; local500--) {
				if (local500 >= local455 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(544) int local544;
		for (local500 = arg0 - 1; local500 >= 0; local500--) {
			for (local544 = 0; local544 < arg0; local544++) {
				if (local500 >> 1 <= local544) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(593) int local593;
		for (local544 = 0; local544 < arg0; local544++) {
			for (local593 = 0; local593 < arg0; local593++) {
				if (local544 << 1 >= local593) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(642) int local642;
		for (local593 = 0; local593 < arg0; local593++) {
			for (local642 = arg0 - 1; local642 >= 0; local642--) {
				if (local593 >> 1 <= local642) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(687) int local687;
		for (local642 = arg0 - 1; local642 >= 0; local642--) {
			for (local687 = arg0 - 1; local687 >= 0; local687--) {
				if (local687 <= local642 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(732) int local732;
		for (local687 = arg0 - 1; local687 >= 0; local687--) {
			for (local732 = arg0 - 1; local732 >= 0; local732--) {
				if (local732 >= local687 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(778) int local778;
		for (local732 = arg0 - 1; local732 >= 0; local732--) {
			for (local778 = 0; local778 < arg0; local778++) {
				if (local778 <= local732 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(820) int local820;
		for (local778 = 0; local778 < arg0; local778++) {
			for (local820 = 0; local820 < arg0; local820++) {
				if (local778 >> 1 <= local820) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(865) int local865;
		for (local820 = 0; local820 < arg0; local820++) {
			for (local865 = arg0 - 1; local865 >= 0; local865--) {
				if (local865 <= local820 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(903) int local903;
		for (local865 = 0; local865 < arg0; local865++) {
			for (local903 = 0; local903 < arg0; local903++) {
				if (local903 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(950) int local950;
		for (local903 = 0; local903 < arg0; local903++) {
			for (local950 = 0; local950 < arg0; local950++) {
				if (local903 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(993) int local993;
		for (local950 = 0; local950 < arg0; local950++) {
			for (local993 = 0; local993 < arg0; local993++) {
				if (local993 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1044) int local1044;
		for (local993 = 0; local993 < arg0; local993++) {
			for (local1044 = 0; local1044 < arg0; local1044++) {
				if (local993 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1087) int local1087;
		for (local1044 = 0; local1044 < arg0; local1044++) {
			for (local1087 = 0; local1087 < arg0; local1087++) {
				if (local1044 - arg0 / 2 >= local1087) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1131) int local1131;
		for (local1087 = arg0 - 1; local1087 >= 0; local1087--) {
			for (local1131 = 0; local1131 < arg0; local1131++) {
				if (local1087 - arg0 / 2 >= local1131) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1183) int local1183;
		for (local1131 = arg0 - 1; local1131 >= 0; local1131--) {
			for (local1183 = arg0 - 1; local1183 >= 0; local1183--) {
				if (local1131 - arg0 / 2 >= local1183) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1228) int local1228;
		for (local1183 = 0; local1183 < arg0; local1183++) {
			for (local1228 = arg0 - 1; local1228 >= 0; local1228--) {
				if (local1228 <= local1183 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1282) int local1282;
		for (local1228 = 0; local1228 < arg0; local1228++) {
			for (local1282 = 0; local1282 < arg0; local1282++) {
				if (local1282 >= local1228 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1329) int local1329;
		for (local1282 = arg0 - 1; local1282 >= 0; local1282--) {
			for (local1329 = 0; local1329 < arg0; local1329++) {
				if (local1282 - arg0 / 2 <= local1329) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1382) int local1382;
		for (local1329 = arg0 - 1; local1329 >= 0; local1329--) {
			for (local1382 = arg0 - 1; local1382 >= 0; local1382--) {
				if (local1329 - arg0 / 2 <= local1382) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1382 = 0; local1382 < arg0; local1382++) {
			for (@Pc(1429) int local1429 = arg0 - 1; local1429 >= 0; local1429--) {
				if (local1429 >= local1382 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method6057(@OriginalArg(0) String arg0) {
		if (Static389.aString89.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Static389.aString89.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Static389.aString89.startsWith("mac")) {
			return "lib" + arg0 + ".jnilib";
		} else {
			return null;
		}
	}
}
