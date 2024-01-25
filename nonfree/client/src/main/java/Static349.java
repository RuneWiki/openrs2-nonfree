import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!ln", name = "B", descriptor = "Z")
	public static boolean aBoolean512;

	@OriginalMember(owner = "client!ln", name = "r", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_66 = new Class341(15, 4);

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZZLclient!cv;Z)V")
	public static void method6045(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class2_Sub20 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg1.anInt1667;
		@Pc(12) int local12 = (int) arg1.aLong313;
		arg1.method9825();
		if (arg2) {
			Static647.method9533(local8);
		}
		Static37.method625(local8);
		@Pc(27) Class357 local27 = Static647.method9532(local12);
		if (local27 != null) {
			Static473.method7526(local27);
		}
		Static384.method6480();
		if (!arg0 && Static567.anInt9844 != -1) {
			Static525.method8170(Static567.anInt9844, 1);
		}
		@Pc(48) Class10 local48 = new Class10(Static507.aClass335_33);
		for (@Pc(53) Class2_Sub20 local53 = (Class2_Sub20) local48.method152(); local53 != null; local53 = (Class2_Sub20) local48.method151()) {
			if (!local53.method9823()) {
				local53 = (Class2_Sub20) local48.method152();
				if (local53 == null) {
					return;
				}
			}
			if (local53.anInt1668 == 3) {
				@Pc(77) int local77 = (int) local53.aLong313;
				if (local77 >>> 16 == local8) {
					method6045(arg0, local53, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)V")
	public static void method6046(@OriginalArg(1) int arg0) {
		if (Static149.anIntArray156 == null || Static149.anIntArray156.length < arg0) {
			Static149.anIntArray156 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(II)Z")
	public static boolean method6047(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIIIIIBI)V")
	public static void method6048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 == arg0 && arg3 == arg6 && arg2 == arg1 && arg8 == arg7) {
			Static546.method8351(arg3, arg2, arg4, arg7, arg0);
			return;
		}
		@Pc(27) int local27 = arg0;
		@Pc(29) int local29 = arg3;
		@Pc(33) int local33 = arg0 * 3;
		@Pc(37) int local37 = arg3 * 3;
		@Pc(41) int local41 = arg5 * 3;
		@Pc(45) int local45 = arg6 * 3;
		@Pc(49) int local49 = arg1 * 3;
		@Pc(53) int local53 = arg8 * 3;
		@Pc(62) int local62 = local41 + arg2 - arg0 - local49;
		@Pc(71) int local71 = arg7 + local45 - arg3 - local53;
		@Pc(80) int local80 = local33 + local49 - local41 - local41;
		@Pc(91) int local91 = local53 + local37 - local45 - local45;
		@Pc(96) int local96 = local41 - local33;
		@Pc(101) int local101 = local45 - local37;
		for (@Pc(103) int local103 = 128; local103 <= 4096; local103 += 128) {
			@Pc(111) int local111 = local103 * local103 >> 12;
			@Pc(117) int local117 = local111 * local103 >> 12;
			@Pc(121) int local121 = local62 * local117;
			@Pc(125) int local125 = local71 * local117;
			@Pc(129) int local129 = local80 * local111;
			@Pc(133) int local133 = local111 * local91;
			@Pc(137) int local137 = local96 * local103;
			@Pc(141) int local141 = local101 * local103;
			@Pc(152) int local152 = arg0 + (local137 + local121 + local129 >> 12);
			@Pc(164) int local164 = arg3 + (local125 + local133 + local141 >> 12);
			Static546.method8351(local29, local152, arg4, local164, local27);
			local27 = local152;
			local29 = local164;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZI)[[[B")
	public static byte[][][] method6050(@OriginalArg(1) int arg0) {
		@Pc(9) byte[][][] local9 = new byte[8][4][];
		@Pc(18) byte[] local18 = new byte[arg0 * arg0];
		@Pc(20) int local20 = 0;
		@Pc(31) int local31;
		for (@Pc(27) int local27 = 0; local27 < arg0; local27++) {
			for (local31 = 0; local31 < arg0; local31++) {
				if (local27 >= local31) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(74) int local74;
		for (local31 = arg0 - 1; local31 >= 0; local31--) {
			for (local74 = 0; local74 < arg0; local74++) {
				if (local31 >= local74) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(113) int local113;
		for (local74 = 0; local74 < arg0; local74++) {
			for (local113 = 0; local113 < arg0; local113++) {
				if (local113 >= local74) {
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
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(205) int local205;
		for (local156 = arg0 - 1; local156 >= 0; local156--) {
			for (local205 = 0; local205 < arg0; local205++) {
				if (local205 <= local156 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(251) int local251;
		for (local205 = 0; local205 < arg0; local205++) {
			for (local251 = 0; local251 < arg0; local251++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local205 << 1 <= local251) {
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
		@Pc(312) int local312;
		for (local251 = 0; local251 < arg0; local251++) {
			for (local312 = arg0 - 1; local312 >= 0; local312--) {
				if (local312 <= local251 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(365) int local365;
		for (local312 = arg0 - 1; local312 >= 0; local312--) {
			for (local365 = arg0 - 1; local365 >= 0; local365--) {
				if (local365 >= local312 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(416) int local416;
		for (local365 = arg0 - 1; local365 >= 0; local365--) {
			for (local416 = arg0 - 1; local416 >= 0; local416--) {
				if (local365 >> 1 >= local416) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(455) int local455;
		for (local416 = arg0 - 1; local416 >= 0; local416--) {
			for (local455 = 0; local455 < arg0; local455++) {
				if (local455 >= local416 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(504) int local504;
		for (local455 = 0; local455 < arg0; local455++) {
			for (local504 = 0; local504 < arg0; local504++) {
				if (local455 >> 1 >= local504) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(549) int local549;
		for (local504 = 0; local504 < arg0; local504++) {
			for (local549 = arg0 - 1; local549 >= 0; local549--) {
				if (local549 >= local504 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(596) int local596;
		for (local549 = arg0 - 1; local549 >= 0; local549--) {
			for (local596 = 0; local596 < arg0; local596++) {
				if (local596 >= local549 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(641) int local641;
		for (local596 = 0; local596 < arg0; local596++) {
			for (local641 = 0; local641 < arg0; local641++) {
				if (local641 <= local596 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(686) int local686;
		for (local641 = 0; local641 < arg0; local641++) {
			for (local686 = arg0 - 1; local686 >= 0; local686--) {
				if (local686 >= local641 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(735) int local735;
		for (local686 = arg0 - 1; local686 >= 0; local686--) {
			for (local735 = arg0 - 1; local735 >= 0; local735--) {
				if (local735 <= local686 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(776) int local776;
		for (local735 = arg0 - 1; local735 >= 0; local735--) {
			for (local776 = arg0 - 1; local776 >= 0; local776--) {
				if (local735 >> 1 <= local776) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(819) int local819;
		for (local776 = arg0 - 1; local776 >= 0; local776--) {
			for (local819 = 0; local819 < arg0; local819++) {
				if (local819 <= local776 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(865) int local865;
		for (local819 = 0; local819 < arg0; local819++) {
			for (local865 = 0; local865 < arg0; local865++) {
				if (local865 >= local819 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(914) int local914;
		for (local865 = 0; local865 < arg0; local865++) {
			for (local914 = arg0 - 1; local914 >= 0; local914--) {
				if (local914 <= local865 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(956) int local956;
		for (local914 = 0; local914 < arg0; local914++) {
			for (local956 = 0; local956 < arg0; local956++) {
				if (local956 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(999) int local999;
		for (local956 = 0; local956 < arg0; local956++) {
			for (local999 = 0; local999 < arg0; local999++) {
				if (local956 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1038) int local1038;
		for (local999 = 0; local999 < arg0; local999++) {
			for (local1038 = 0; local1038 < arg0; local1038++) {
				if (local1038 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1085) int local1085;
		for (local1038 = 0; local1038 < arg0; local1038++) {
			for (local1085 = 0; local1085 < arg0; local1085++) {
				if (local1038 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1136) int local1136;
		for (local1085 = 0; local1085 < arg0; local1085++) {
			for (local1136 = 0; local1136 < arg0; local1136++) {
				if (local1136 <= local1085 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1184) int local1184;
		for (local1136 = arg0 - 1; local1136 >= 0; local1136--) {
			for (local1184 = 0; local1184 < arg0; local1184++) {
				if (local1184 <= local1136 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1235) int local1235;
		for (local1184 = arg0 - 1; local1184 >= 0; local1184--) {
			for (local1235 = arg0 - 1; local1235 >= 0; local1235--) {
				if (local1235 <= local1184 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1280) int local1280;
		for (local1235 = 0; local1235 < arg0; local1235++) {
			for (local1280 = arg0 - 1; local1280 >= 0; local1280--) {
				if (local1280 <= local1235 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1325) int local1325;
		for (local1280 = 0; local1280 < arg0; local1280++) {
			for (local1325 = 0; local1325 < arg0; local1325++) {
				if (local1325 >= local1280 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1377) int local1377;
		for (local1325 = arg0 - 1; local1325 >= 0; local1325--) {
			for (local1377 = 0; local1377 < arg0; local1377++) {
				if (local1325 - arg0 / 2 <= local1377) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1425) int local1425;
		for (local1377 = arg0 - 1; local1377 >= 0; local1377--) {
			for (local1425 = arg0 - 1; local1425 >= 0; local1425--) {
				if (local1377 - arg0 / 2 <= local1425) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1425 = 0; local1425 < arg0; local1425++) {
			for (@Pc(1473) int local1473 = arg0 - 1; local1473 >= 0; local1473--) {
				if (local1425 - arg0 / 2 <= local1473) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
