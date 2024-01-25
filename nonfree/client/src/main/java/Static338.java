import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "[Lclient!ha;")
	public static Class104[] aClass104Array32;

	@OriginalMember(owner = "client!oba", name = "h", descriptor = "I")
	public static int anInt3837;

	@OriginalMember(owner = "client!oba", name = "i", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_160 = new Class305(41, 6);

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IB)[[[B")
	public static byte[][][] method3565(@OriginalArg(0) int arg0) {
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
		@Pc(105) int local105;
		for (local69 = 0; local69 < arg0; local69++) {
			for (local105 = 0; local105 < arg0; local105++) {
				if (local105 >= local69) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(144) int local144;
		for (local105 = arg0 - 1; local105 >= 0; local105--) {
			for (local144 = 0; local144 < arg0; local144++) {
				if (local144 >= local105) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(193) int local193;
		for (local144 = arg0 - 1; local144 >= 0; local144--) {
			for (local193 = 0; local193 < arg0; local193++) {
				if (local193 <= local144 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(242) int local242;
		for (local193 = 0; local193 < arg0; local193++) {
			for (local242 = 0; local242 < arg0; local242++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local242 >= local193 << 1) {
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
		@Pc(303) int local303;
		for (local242 = 0; local242 < arg0; local242++) {
			for (local303 = arg0 - 1; local303 >= 0; local303--) {
				if (local303 <= local242 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(349) int local349;
		for (local303 = arg0 - 1; local303 >= 0; local303--) {
			for (local349 = arg0 - 1; local349 >= 0; local349--) {
				if (local303 << 1 <= local349) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(394) int local394;
		for (local349 = arg0 - 1; local349 >= 0; local349--) {
			for (local394 = arg0 - 1; local394 >= 0; local394--) {
				if (local394 <= local349 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(436) int local436;
		for (local394 = arg0 - 1; local394 >= 0; local394--) {
			for (local436 = 0; local436 < arg0; local436++) {
				if (local436 >= local394 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(474) int local474;
		for (local436 = 0; local436 < arg0; local436++) {
			for (local474 = 0; local474 < arg0; local474++) {
				if (local436 >> 1 >= local474) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(523) int local523;
		for (local474 = 0; local474 < arg0; local474++) {
			for (local523 = arg0 - 1; local523 >= 0; local523--) {
				if (local474 << 1 <= local523) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(574) int local574;
		for (local523 = arg0 - 1; local523 >= 0; local523--) {
			for (local574 = 0; local574 < arg0; local574++) {
				if (local574 >= local523 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(616) int local616;
		for (local574 = 0; local574 < arg0; local574++) {
			for (local616 = 0; local616 < arg0; local616++) {
				if (local616 <= local574 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(661) int local661;
		for (local616 = 0; local616 < arg0; local616++) {
			for (local661 = arg0 - 1; local661 >= 0; local661--) {
				if (local616 >> 1 <= local661) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(710) int local710;
		for (local661 = arg0 - 1; local661 >= 0; local661--) {
			for (local710 = arg0 - 1; local710 >= 0; local710--) {
				if (local710 <= local661 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(758) int local758;
		for (local710 = arg0 - 1; local710 >= 0; local710--) {
			for (local758 = arg0 - 1; local758 >= 0; local758--) {
				if (local710 >> 1 <= local758) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(804) int local804;
		for (local758 = arg0 - 1; local758 >= 0; local758--) {
			for (local804 = 0; local804 < arg0; local804++) {
				if (local758 << 1 >= local804) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(846) int local846;
		for (local804 = 0; local804 < arg0; local804++) {
			for (local846 = 0; local846 < arg0; local846++) {
				if (local804 >> 1 <= local846) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(891) int local891;
		for (local846 = 0; local846 < arg0; local846++) {
			for (local891 = arg0 - 1; local891 >= 0; local891--) {
				if (local846 << 1 >= local891) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(933) int local933;
		for (local891 = 0; local891 < arg0; local891++) {
			for (local933 = 0; local933 < arg0; local933++) {
				if (arg0 / 2 >= local933) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(987) int local987;
		for (local933 = 0; local933 < arg0; local933++) {
			for (local987 = 0; local987 < arg0; local987++) {
				if (arg0 / 2 >= local933) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1030) int local1030;
		for (local987 = 0; local987 < arg0; local987++) {
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
		@Pc(1073) int local1073;
		for (local1030 = 0; local1030 < arg0; local1030++) {
			for (local1073 = 0; local1073 < arg0; local1073++) {
				if (local1030 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1112) int local1112;
		for (local1073 = 0; local1073 < arg0; local1073++) {
			for (local1112 = 0; local1112 < arg0; local1112++) {
				if (local1112 <= local1073 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1156) int local1156;
		for (local1112 = arg0 - 1; local1112 >= 0; local1112--) {
			for (local1156 = 0; local1156 < arg0; local1156++) {
				if (local1156 <= local1112 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1205) int local1205;
		for (local1156 = arg0 - 1; local1156 >= 0; local1156--) {
			for (local1205 = arg0 - 1; local1205 >= 0; local1205--) {
				if (local1205 <= local1156 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1257) int local1257;
		for (local1205 = 0; local1205 < arg0; local1205++) {
			for (local1257 = arg0 - 1; local1257 >= 0; local1257--) {
				if (local1257 <= local1205 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1301) int local1301;
		for (local1257 = 0; local1257 < arg0; local1257++) {
			for (local1301 = 0; local1301 < arg0; local1301++) {
				if (local1257 - arg0 / 2 <= local1301) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1353) int local1353;
		for (local1301 = arg0 - 1; local1301 >= 0; local1301--) {
			for (local1353 = 0; local1353 < arg0; local1353++) {
				if (local1301 - arg0 / 2 <= local1353) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1404) int local1404;
		for (local1353 = arg0 - 1; local1353 >= 0; local1353--) {
			for (local1404 = arg0 - 1; local1404 >= 0; local1404--) {
				if (local1404 >= local1353 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1404 = 0; local1404 < arg0; local1404++) {
			for (@Pc(1445) int local1445 = arg0 - 1; local1445 >= 0; local1445--) {
				if (local1404 - arg0 / 2 <= local1445) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(BII)V")
	public static void method3566(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13;
		if (Static254.anInt4973 != arg0) {
			Static457.anIntArray732 = new int[arg0];
			for (local13 = 0; local13 < arg0; local13++) {
				Static457.anIntArray732[local13] = (local13 << 12) / arg0;
			}
			Static184.anInt3830 = arg0 - 1;
			Static43.anInt6555 = arg0 * 32;
			Static254.anInt4973 = arg0;
		}
		if (arg1 == Static426.anInt7423) {
			return;
		}
		if (arg1 == Static254.anInt4973) {
			Static392.anIntArray673 = Static457.anIntArray732;
		} else {
			Static392.anIntArray673 = new int[arg1];
			for (local13 = 0; local13 < arg1; local13++) {
				Static392.anIntArray673[local13] = (local13 << 12) / arg1;
			}
		}
		Static426.anInt7423 = arg1;
		Static109.anInt2298 = arg1 - 1;
	}

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(BII)Ljava/lang/String;")
	public static String method3568(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}
}
