import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!wr", name = "o", descriptor = "F")
	public static float aFloat91;

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "Lclient!fc;")
	public static final Class77 aClass77_63 = new Class77(200);

	@OriginalMember(owner = "client!wr", name = "xb", descriptor = "[[B")
	public static final byte[][] aByteArrayArray149 = new byte[50][];

	@OriginalMember(owner = "client!wr", name = "yb", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_277 = new Class67(108, 6);

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IB)[[[B")
	public static byte[][][] method5901(@OriginalArg(0) int arg0) {
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
				if (local26 >= local69) {
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
		@Pc(148) int local148;
		for (local105 = arg0 - 1; local105 >= 0; local105--) {
			for (local148 = 0; local148 < arg0; local148++) {
				if (local148 >= local105) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(190) int local190;
		for (local148 = arg0 - 1; local148 >= 0; local148--) {
			for (local190 = 0; local190 < arg0; local190++) {
				if (local148 >> 1 >= local190) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(239) int local239;
		for (local190 = 0; local190 < arg0; local190++) {
			for (local239 = 0; local239 < arg0; local239++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local239 >= local190 << 1) {
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
		@Pc(296) int local296;
		for (local239 = 0; local239 < arg0; local239++) {
			for (local296 = arg0 - 1; local296 >= 0; local296--) {
				if (local296 <= local239 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(349) int local349;
		for (local296 = arg0 - 1; local296 >= 0; local296--) {
			for (local349 = arg0 - 1; local349 >= 0; local349--) {
				if (local349 >= local296 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(393) int local393;
		for (local349 = arg0 - 1; local349 >= 0; local349--) {
			for (local393 = arg0 - 1; local393 >= 0; local393--) {
				if (local393 <= local349 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local393 = arg0 - 1; local393 >= 0; local393--) {
			for (@Pc(438) int local438 = 0; local438 < arg0; local438++) {
				if (local393 << 1 <= local438) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(487) int local487;
		for (@Pc(483) int local483 = 0; local483 < arg0; local483++) {
			for (local487 = 0; local487 < arg0; local487++) {
				if (local487 <= local483 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(540) int local540;
		for (local487 = 0; local487 < arg0; local487++) {
			for (local540 = arg0 - 1; local540 >= 0; local540--) {
				if (local540 >= local487 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(587) int local587;
		for (local540 = arg0 - 1; local540 >= 0; local540--) {
			for (local587 = 0; local587 < arg0; local587++) {
				if (local587 >= local540 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(633) int local633;
		for (local587 = 0; local587 < arg0; local587++) {
			for (local633 = 0; local633 < arg0; local633++) {
				if (local633 <= local587 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(678) int local678;
		for (local633 = 0; local633 < arg0; local633++) {
			for (local678 = arg0 - 1; local678 >= 0; local678--) {
				if (local678 >= local633 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(727) int local727;
		for (local678 = arg0 - 1; local678 >= 0; local678--) {
			for (local727 = arg0 - 1; local727 >= 0; local727--) {
				if (local727 <= local678 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(772) int local772;
		for (local727 = arg0 - 1; local727 >= 0; local727--) {
			for (local772 = arg0 - 1; local772 >= 0; local772--) {
				if (local727 >> 1 <= local772) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(817) int local817;
		for (local772 = arg0 - 1; local772 >= 0; local772--) {
			for (local817 = 0; local817 < arg0; local817++) {
				if (local772 << 1 >= local817) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(858) int local858;
		for (local817 = 0; local817 < arg0; local817++) {
			for (local858 = 0; local858 < arg0; local858++) {
				if (local858 >= local817 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(903) int local903;
		for (local858 = 0; local858 < arg0; local858++) {
			for (local903 = arg0 - 1; local903 >= 0; local903--) {
				if (local858 << 1 >= local903) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(949) int local949;
		for (local903 = 0; local903 < arg0; local903++) {
			for (local949 = 0; local949 < arg0; local949++) {
				if (arg0 / 2 >= local949) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(988) int local988;
		for (local949 = 0; local949 < arg0; local949++) {
			for (local988 = 0; local988 < arg0; local988++) {
				if (local949 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1035) int local1035;
		for (local988 = 0; local988 < arg0; local988++) {
			for (local1035 = 0; local1035 < arg0; local1035++) {
				if (arg0 / 2 <= local1035) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1086) int local1086;
		for (local1035 = 0; local1035 < arg0; local1035++) {
			for (local1086 = 0; local1086 < arg0; local1086++) {
				if (local1035 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1133) int local1133;
		for (local1086 = 0; local1086 < arg0; local1086++) {
			for (local1133 = 0; local1133 < arg0; local1133++) {
				if (local1133 <= local1086 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1181) int local1181;
		for (local1133 = arg0 - 1; local1133 >= 0; local1133--) {
			for (local1181 = 0; local1181 < arg0; local1181++) {
				if (local1181 <= local1133 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1233) int local1233;
		for (local1181 = arg0 - 1; local1181 >= 0; local1181--) {
			for (local1233 = arg0 - 1; local1233 >= 0; local1233--) {
				if (local1233 <= local1181 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1285) int local1285;
		for (local1233 = 0; local1233 < arg0; local1233++) {
			for (local1285 = arg0 - 1; local1285 >= 0; local1285--) {
				if (local1233 - arg0 / 2 >= local1285) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1334) int local1334;
		for (local1285 = 0; local1285 < arg0; local1285++) {
			for (local1334 = 0; local1334 < arg0; local1334++) {
				if (local1285 - arg0 / 2 <= local1334) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1386) int local1386;
		for (local1334 = arg0 - 1; local1334 >= 0; local1334--) {
			for (local1386 = 0; local1386 < arg0; local1386++) {
				if (local1386 >= local1334 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1433) int local1433;
		for (local1386 = arg0 - 1; local1386 >= 0; local1386--) {
			for (local1433 = arg0 - 1; local1433 >= 0; local1433--) {
				if (local1386 - arg0 / 2 <= local1433) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1433 = 0; local1433 < arg0; local1433++) {
			for (@Pc(1485) int local1485 = arg0 - 1; local1485 >= 0; local1485--) {
				if (local1485 >= local1433 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V")
	public static void method5910() {
		if (Static114.aClass101_1 != null) {
			Static114.aClass101_1.method4855();
		}
		if (Static457.aClass101_2 != null) {
			Static457.aClass101_2.method4855();
		}
	}
}
