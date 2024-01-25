import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_79 = new Class55("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Lclient!fr;")
	public static final Class85 aClass85_22 = new Class85();

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
	public static int anInt3626 = 0;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
	public static int anInt3627 = 0;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "[Lclient!uu;")
	public static Class252[] aClass252Array1 = new Class252[50];

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIBI)V")
	public static void method2955(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1) {
		Static316.anInt5188 = 0;
		Static137.anInt2576 = arg1;
		Static82.anInt1667 = arg0;
		Static293.anInt4886 = 0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IB)[[[B")
	public static byte[][][] method2956(@OriginalArg(0) int arg0) {
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
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(113) int local113;
		for (local69 = 0; local69 < arg0; local69++) {
			for (local113 = 0; local113 < arg0; local113++) {
				if (local113 >= local69) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(156) int local156;
		for (local113 = arg0 - 1; local113 >= 0; local113--) {
			for (local156 = 0; local156 < arg0; local156++) {
				if (local113 <= local156) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(198) int local198;
		for (local156 = arg0 - 1; local156 >= 0; local156--) {
			for (local198 = 0; local198 < arg0; local198++) {
				if (local156 >> 1 >= local198) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(236) int local236;
		for (local198 = 0; local198 < arg0; local198++) {
			for (local236 = 0; local236 < arg0; local236++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local198 << 1 <= local236) {
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
		@Pc(302) int local302;
		for (local236 = 0; local236 < arg0; local236++) {
			for (local302 = arg0 - 1; local302 >= 0; local302--) {
				if (local236 >> 1 >= local302) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(351) int local351;
		for (local302 = arg0 - 1; local302 >= 0; local302--) {
			for (local351 = arg0 - 1; local351 >= 0; local351--) {
				if (local302 << 1 <= local351) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(399) int local399;
		for (local351 = arg0 - 1; local351 >= 0; local351--) {
			for (local399 = arg0 - 1; local399 >= 0; local399--) {
				if (local399 <= local351 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(448) int local448;
		for (local399 = arg0 - 1; local399 >= 0; local399--) {
			for (local448 = 0; local448 < arg0; local448++) {
				if (local399 << 1 <= local448) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(494) int local494;
		for (local448 = 0; local448 < arg0; local448++) {
			for (local494 = 0; local494 < arg0; local494++) {
				if (local448 >> 1 >= local494) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(543) int local543;
		for (local494 = 0; local494 < arg0; local494++) {
			for (local543 = arg0 - 1; local543 >= 0; local543--) {
				if (local494 << 1 <= local543) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(586) int local586;
		for (local543 = arg0 - 1; local543 >= 0; local543--) {
			for (local586 = 0; local586 < arg0; local586++) {
				if (local586 >= local543 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(632) int local632;
		for (local586 = 0; local586 < arg0; local586++) {
			for (local632 = 0; local632 < arg0; local632++) {
				if (local586 << 1 >= local632) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(677) int local677;
		for (local632 = 0; local632 < arg0; local632++) {
			for (local677 = arg0 - 1; local677 >= 0; local677--) {
				if (local632 >> 1 <= local677) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(723) int local723;
		for (local677 = arg0 - 1; local677 >= 0; local677--) {
			for (local723 = arg0 - 1; local723 >= 0; local723--) {
				if (local723 <= local677 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(767) int local767;
		for (local723 = arg0 - 1; local723 >= 0; local723--) {
			for (local767 = arg0 - 1; local767 >= 0; local767--) {
				if (local723 >> 1 <= local767) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(812) int local812;
		for (local767 = arg0 - 1; local767 >= 0; local767--) {
			for (local812 = 0; local812 < arg0; local812++) {
				if (local812 <= local767 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(850) int local850;
		for (local812 = 0; local812 < arg0; local812++) {
			for (local850 = 0; local850 < arg0; local850++) {
				if (local812 >> 1 <= local850) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(895) int local895;
		for (local850 = 0; local850 < arg0; local850++) {
			for (local895 = arg0 - 1; local895 >= 0; local895--) {
				if (local895 <= local850 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(940) int local940;
		for (local895 = 0; local895 < arg0; local895++) {
			for (local940 = 0; local940 < arg0; local940++) {
				if (arg0 / 2 >= local940) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(987) int local987;
		for (local940 = 0; local940 < arg0; local940++) {
			for (local987 = 0; local987 < arg0; local987++) {
				if (arg0 / 2 >= local940) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1034) int local1034;
		for (local987 = 0; local987 < arg0; local987++) {
			for (local1034 = 0; local1034 < arg0; local1034++) {
				if (local1034 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1086) int local1086;
		for (local1034 = 0; local1034 < arg0; local1034++) {
			for (local1086 = 0; local1086 < arg0; local1086++) {
				if (arg0 / 2 <= local1034) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1137) int local1137;
		for (local1086 = 0; local1086 < arg0; local1086++) {
			for (local1137 = 0; local1137 < arg0; local1137++) {
				if (local1086 - arg0 / 2 >= local1137) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1192) int local1192;
		for (local1137 = arg0 - 1; local1137 >= 0; local1137--) {
			for (local1192 = 0; local1192 < arg0; local1192++) {
				if (local1137 - arg0 / 2 >= local1192) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1241) int local1241;
		for (local1192 = arg0 - 1; local1192 >= 0; local1192--) {
			for (local1241 = arg0 - 1; local1241 >= 0; local1241--) {
				if (local1192 - arg0 / 2 >= local1241) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1286) int local1286;
		for (local1241 = 0; local1241 < arg0; local1241++) {
			for (local1286 = arg0 - 1; local1286 >= 0; local1286--) {
				if (local1241 - arg0 / 2 >= local1286) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1334) int local1334;
		for (local1286 = 0; local1286 < arg0; local1286++) {
			for (local1334 = 0; local1334 < arg0; local1334++) {
				if (local1334 >= local1286 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1385) int local1385;
		for (local1334 = arg0 - 1; local1334 >= 0; local1334--) {
			for (local1385 = 0; local1385 < arg0; local1385++) {
				if (local1385 >= local1334 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1437) int local1437;
		for (local1385 = arg0 - 1; local1385 >= 0; local1385--) {
			for (local1437 = arg0 - 1; local1437 >= 0; local1437--) {
				if (local1437 >= local1385 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1437 = 0; local1437 < arg0; local1437++) {
			for (@Pc(1485) int local1485 = arg0 - 1; local1485 >= 0; local1485--) {
				if (local1485 >= local1437 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IBII)I")
	public static int method2957(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg2;
		@Pc(13) int local13 = arg2 - 1 & arg1;
		@Pc(17) int local17 = arg0 / arg2;
		@Pc(23) int local23 = arg0 & arg2 - 1;
		@Pc(28) int local28 = Static185.method2693(local17, local7);
		@Pc(35) int local35 = Static185.method2693(local17, local7 + 1);
		@Pc(42) int local42 = Static185.method2693(local17 + 1, local7);
		@Pc(51) int local51 = Static185.method2693(local17 + 1, local7 + 1);
		@Pc(58) int local58 = Static245.method3299(local28, local35, arg2, local13);
		@Pc(73) int local73 = Static245.method3299(local42, local51, arg2, local13);
		return Static245.method3299(local58, local73, arg2, local23);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IBI[BII)V")
	public static void method2958(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 <= arg1) {
			return;
		}
		arg3 += arg1;
		@Pc(30) int local30 = arg0 - arg1 >> 2;
		while (true) {
			local30--;
			if (local30 < 0) {
				local30 = arg0 - arg1 & 0x3;
				while (true) {
					local30--;
					if (local30 < 0) {
						return;
					}
					arg2[arg3++] = 1;
				}
			}
			@Pc(35) int local35 = arg3 + 1;
			arg2[arg3] = 1;
			@Pc(40) int local40 = local35 + 1;
			arg2[local35] = 1;
			@Pc(45) int local45 = local40 + 1;
			arg2[local40] = 1;
			arg3 = local45 + 1;
			arg2[local45] = 1;
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(IB)Z")
	public static boolean method2959(@OriginalArg(0) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}
}
