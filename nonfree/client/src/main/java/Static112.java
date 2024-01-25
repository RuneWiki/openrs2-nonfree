import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!fj", name = "O", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!fj", name = "S", descriptor = "Lclient!he;")
	public static Class100 aClass100_17;

	@OriginalMember(owner = "client!fj", name = "Q", descriptor = "I")
	public static int anInt2389 = 0;

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "(B)V")
	public static void method1963() {
		if (Static77.aClass122_1 == null) {
			return;
		}
		if (Static77.aClass122_1.anInt3557 == 1) {
			Static77.aClass122_1 = null;
			return;
		}
		if (Static77.aClass122_1.anInt3557 == 2) {
			Static330.method4776(Static257.aClass209_74, 2, Static384.aString58);
			Static77.aClass122_1 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(BI)[[[B")
	public static byte[][][] method1964(@OriginalArg(1) int arg0) {
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
		@Pc(109) int local109;
		for (local69 = 0; local69 < arg0; local69++) {
			for (local109 = 0; local109 < arg0; local109++) {
				if (local109 >= local69) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(152) int local152;
		for (local109 = arg0 - 1; local109 >= 0; local109--) {
			for (local152 = 0; local152 < arg0; local152++) {
				if (local152 >= local109) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(194) int local194;
		for (local152 = arg0 - 1; local152 >= 0; local152--) {
			for (local194 = 0; local194 < arg0; local194++) {
				if (local194 <= local152 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(239) int local239;
		for (local194 = 0; local194 < arg0; local194++) {
			for (local239 = 0; local239 < arg0; local239++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local239 >= local194 << 1) {
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
		@Pc(293) int local293;
		for (local239 = 0; local239 < arg0; local239++) {
			for (local293 = arg0 - 1; local293 >= 0; local293--) {
				if (local239 >> 1 >= local293) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(338) int local338;
		for (local293 = arg0 - 1; local293 >= 0; local293--) {
			for (local338 = arg0 - 1; local338 >= 0; local338--) {
				if (local293 << 1 <= local338) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(386) int local386;
		for (local338 = arg0 - 1; local338 >= 0; local338--) {
			for (local386 = arg0 - 1; local386 >= 0; local386--) {
				if (local338 >> 1 >= local386) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(429) int local429;
		for (local386 = arg0 - 1; local386 >= 0; local386--) {
			for (local429 = 0; local429 < arg0; local429++) {
				if (local429 >= local386 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(467) int local467;
		for (local429 = 0; local429 < arg0; local429++) {
			for (local467 = 0; local467 < arg0; local467++) {
				if (local467 <= local429 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(520) int local520;
		for (local467 = 0; local467 < arg0; local467++) {
			for (local520 = arg0 - 1; local520 >= 0; local520--) {
				if (local467 << 1 <= local520) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(564) int local564;
		for (local520 = arg0 - 1; local520 >= 0; local520--) {
			for (local564 = 0; local564 < arg0; local564++) {
				if (local564 >= local520 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(613) int local613;
		for (local564 = 0; local564 < arg0; local564++) {
			for (local613 = 0; local613 < arg0; local613++) {
				if (local613 <= local564 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(658) int local658;
		for (local613 = 0; local613 < arg0; local613++) {
			for (local658 = arg0 - 1; local658 >= 0; local658--) {
				if (local613 >> 1 <= local658) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(707) int local707;
		for (local658 = arg0 - 1; local658 >= 0; local658--) {
			for (local707 = arg0 - 1; local707 >= 0; local707--) {
				if (local707 <= local658 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(755) int local755;
		for (local707 = arg0 - 1; local707 >= 0; local707--) {
			for (local755 = arg0 - 1; local755 >= 0; local755--) {
				if (local755 >= local707 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(800) int local800;
		for (local755 = arg0 - 1; local755 >= 0; local755--) {
			for (local800 = 0; local800 < arg0; local800++) {
				if (local800 <= local755 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(849) int local849;
		for (local800 = 0; local800 < arg0; local800++) {
			for (local849 = 0; local849 < arg0; local849++) {
				if (local849 >= local800 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(894) int local894;
		for (local849 = 0; local849 < arg0; local849++) {
			for (local894 = arg0 - 1; local894 >= 0; local894--) {
				if (local849 << 1 >= local894) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(936) int local936;
		for (local894 = 0; local894 < arg0; local894++) {
			for (local936 = 0; local936 < arg0; local936++) {
				if (local936 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(979) int local979;
		for (local936 = 0; local936 < arg0; local936++) {
			for (local979 = 0; local979 < arg0; local979++) {
				if (local936 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1030) int local1030;
		for (local979 = 0; local979 < arg0; local979++) {
			for (local1030 = 0; local1030 < arg0; local1030++) {
				if (local1030 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1077) int local1077;
		for (local1030 = 0; local1030 < arg0; local1030++) {
			for (local1077 = 0; local1077 < arg0; local1077++) {
				if (arg0 / 2 <= local1030) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1120) int local1120;
		for (local1077 = 0; local1077 < arg0; local1077++) {
			for (local1120 = 0; local1120 < arg0; local1120++) {
				if (local1077 - arg0 / 2 >= local1120) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1176) int local1176;
		for (local1120 = arg0 - 1; local1120 >= 0; local1120--) {
			for (local1176 = 0; local1176 < arg0; local1176++) {
				if (local1176 <= local1120 - arg0 / 2) {
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
		@Pc(1277) int local1277;
		for (local1228 = 0; local1228 < arg0; local1228++) {
			for (local1277 = arg0 - 1; local1277 >= 0; local1277--) {
				if (local1277 <= local1228 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1318) int local1318;
		for (local1277 = 0; local1277 < arg0; local1277++) {
			for (local1318 = 0; local1318 < arg0; local1318++) {
				if (local1277 - arg0 / 2 <= local1318) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1365) int local1365;
		for (local1318 = arg0 - 1; local1318 >= 0; local1318--) {
			for (local1365 = 0; local1365 < arg0; local1365++) {
				if (local1365 >= local1318 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1414) int local1414;
		for (local1365 = arg0 - 1; local1365 >= 0; local1365--) {
			for (local1414 = arg0 - 1; local1414 >= 0; local1414--) {
				if (local1414 >= local1365 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1414 = 0; local1414 < arg0; local1414++) {
			for (@Pc(1470) int local1470 = arg0 - 1; local1470 >= 0; local1470--) {
				if (local1414 - arg0 / 2 <= local1470) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
