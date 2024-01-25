import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!jw", name = "o", descriptor = "Lclient!sh;")
	public static Class64 aClass64_3;

	@OriginalMember(owner = "client!jw", name = "k", descriptor = "I")
	public static int anInt4921 = 100;

	@OriginalMember(owner = "client!jw", name = "m", descriptor = "Z")
	public static boolean aBoolean317 = false;

	@OriginalMember(owner = "client!jw", name = "n", descriptor = "I")
	public static int anInt4923 = -1;

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "([II[I)V")
	public static void method4191(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Static158.aByteArrayArrayArray3 = null;
			Static245.anIntArray254 = null;
			Static474.anIntArray457 = null;
			return;
		}
		Static474.anIntArray457 = arg0;
		Static245.anIntArray254 = new int[arg0.length];
		Static158.aByteArrayArrayArray3 = new byte[arg0.length][][];
		for (@Pc(36) int local36 = 0; local36 < Static474.anIntArray457.length; local36++) {
			Static158.aByteArrayArrayArray3[local36] = new byte[arg1[local36]][];
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method4192(@OriginalArg(1) int arg0) {
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
		local20 = 0;
		local18 = new byte[arg0 * arg0];
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
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(156) int local156;
		for (local109 = arg0 - 1; local109 >= 0; local109--) {
			for (local156 = 0; local156 < arg0; local156++) {
				if (local156 >= local109) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(201) int local201;
		for (local156 = arg0 - 1; local156 >= 0; local156--) {
			for (local201 = 0; local201 < arg0; local201++) {
				if (local201 <= local156 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(247) int local247;
		for (local201 = 0; local201 < arg0; local201++) {
			for (local247 = 0; local247 < arg0; local247++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local247 >= local201 << 1) {
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
		@Pc(305) int local305;
		for (local247 = 0; local247 < arg0; local247++) {
			for (local305 = arg0 - 1; local305 >= 0; local305--) {
				if (local247 >> 1 >= local305) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(358) int local358;
		for (local305 = arg0 - 1; local305 >= 0; local305--) {
			for (local358 = arg0 - 1; local358 >= 0; local358--) {
				if (local305 << 1 <= local358) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(405) int local405;
		for (local358 = arg0 - 1; local358 >= 0; local358--) {
			for (local405 = arg0 - 1; local405 >= 0; local405--) {
				if (local405 <= local358 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(454) int local454;
		for (local405 = arg0 - 1; local405 >= 0; local405--) {
			for (local454 = 0; local454 < arg0; local454++) {
				if (local454 >= local405 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(499) int local499;
		for (local454 = 0; local454 < arg0; local454++) {
			for (local499 = 0; local499 < arg0; local499++) {
				if (local454 >> 1 >= local499) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(544) int local544;
		for (local499 = 0; local499 < arg0; local499++) {
			for (local544 = arg0 - 1; local544 >= 0; local544--) {
				if (local499 << 1 <= local544) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(588) int local588;
		for (local544 = arg0 - 1; local544 >= 0; local544--) {
			for (local588 = 0; local588 < arg0; local588++) {
				if (local544 >> 1 <= local588) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(630) int local630;
		for (local588 = 0; local588 < arg0; local588++) {
			for (local630 = 0; local630 < arg0; local630++) {
				if (local588 << 1 >= local630) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(679) int local679;
		for (local630 = 0; local630 < arg0; local630++) {
			for (local679 = arg0 - 1; local679 >= 0; local679--) {
				if (local630 >> 1 <= local679) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(732) int local732;
		for (local679 = arg0 - 1; local679 >= 0; local679--) {
			for (local732 = arg0 - 1; local732 >= 0; local732--) {
				if (local679 << 1 >= local732) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(783) int local783;
		for (local732 = arg0 - 1; local732 >= 0; local732--) {
			for (local783 = arg0 - 1; local783 >= 0; local783--) {
				if (local732 >> 1 <= local783) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(833) int local833;
		for (local783 = arg0 - 1; local783 >= 0; local783--) {
			for (local833 = 0; local833 < arg0; local833++) {
				if (local783 << 1 >= local833) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(875) int local875;
		for (local833 = 0; local833 < arg0; local833++) {
			for (local875 = 0; local875 < arg0; local875++) {
				if (local833 >> 1 <= local875) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(924) int local924;
		for (local875 = 0; local875 < arg0; local875++) {
			for (local924 = arg0 - 1; local924 >= 0; local924--) {
				if (local875 << 1 >= local924) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(973) int local973;
		for (local924 = 0; local924 < arg0; local924++) {
			for (local973 = 0; local973 < arg0; local973++) {
				if (arg0 / 2 >= local973) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1012) int local1012;
		for (local973 = 0; local973 < arg0; local973++) {
			for (local1012 = 0; local1012 < arg0; local1012++) {
				if (arg0 / 2 >= local973) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1063) int local1063;
		for (local1012 = 0; local1012 < arg0; local1012++) {
			for (local1063 = 0; local1063 < arg0; local1063++) {
				if (local1063 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1106) int local1106;
		for (local1063 = 0; local1063 < arg0; local1063++) {
			for (local1106 = 0; local1106 < arg0; local1106++) {
				if (local1063 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1153) int local1153;
		for (local1106 = 0; local1106 < arg0; local1106++) {
			for (local1153 = 0; local1153 < arg0; local1153++) {
				if (local1106 - arg0 / 2 >= local1153) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1205) int local1205;
		for (local1153 = arg0 - 1; local1153 >= 0; local1153--) {
			for (local1205 = 0; local1205 < arg0; local1205++) {
				if (local1205 <= local1153 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1254) int local1254;
		for (local1205 = arg0 - 1; local1205 >= 0; local1205--) {
			for (local1254 = arg0 - 1; local1254 >= 0; local1254--) {
				if (local1205 - arg0 / 2 >= local1254) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1303) int local1303;
		for (local1254 = 0; local1254 < arg0; local1254++) {
			for (local1303 = arg0 - 1; local1303 >= 0; local1303--) {
				if (local1303 <= local1254 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1350) int local1350;
		for (local1303 = 0; local1303 < arg0; local1303++) {
			for (local1350 = 0; local1350 < arg0; local1350++) {
				if (local1303 - arg0 / 2 <= local1350) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1398) int local1398;
		for (local1350 = arg0 - 1; local1350 >= 0; local1350--) {
			for (local1398 = 0; local1398 < arg0; local1398++) {
				if (local1398 >= local1350 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1450) int local1450;
		for (local1398 = arg0 - 1; local1398 >= 0; local1398--) {
			for (local1450 = arg0 - 1; local1450 >= 0; local1450--) {
				if (local1450 >= local1398 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1450 = 0; local1450 < arg0; local1450++) {
			for (@Pc(1502) int local1502 = arg0 - 1; local1502 >= 0; local1502--) {
				if (local1450 - arg0 / 2 <= local1502) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
