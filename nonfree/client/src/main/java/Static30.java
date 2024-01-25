import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
	public static int anInt453;

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_15 = new Class62("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!bi", name = "m", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray6 = new String[200];

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)V")
	public static void method341(@OriginalArg(1) int arg0) {
		if (Static348.anInt6384 == 0) {
			Static67.aClass2_Sub11_Sub1_1.method1792(arg0);
		} else {
			Static19.anInt320 = arg0;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
	public static void method342() {
		Static10.aClass41_72.method825();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method346(@OriginalArg(1) int arg0) {
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
		@Pc(164) int local164;
		for (local109 = arg0 - 1; local109 >= 0; local109--) {
			for (local164 = 0; local164 < arg0; local164++) {
				if (local164 >= local109) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(206) int local206;
		for (local164 = arg0 - 1; local164 >= 0; local164--) {
			for (local206 = 0; local206 < arg0; local206++) {
				if (local164 >> 1 >= local206) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(247) int local247;
		for (local206 = 0; local206 < arg0; local206++) {
			for (local247 = 0; local247 < arg0; local247++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local247 >= local206 << 1) {
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
		@Pc(301) int local301;
		for (local247 = 0; local247 < arg0; local247++) {
			for (local301 = arg0 - 1; local301 >= 0; local301--) {
				if (local301 <= local247 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(350) int local350;
		for (local301 = arg0 - 1; local301 >= 0; local301--) {
			for (local350 = arg0 - 1; local350 >= 0; local350--) {
				if (local350 >= local301 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(401) int local401;
		for (local350 = arg0 - 1; local350 >= 0; local350--) {
			for (local401 = arg0 - 1; local401 >= 0; local401--) {
				if (local401 <= local350 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(443) int local443;
		for (local401 = arg0 - 1; local401 >= 0; local401--) {
			for (local443 = 0; local443 < arg0; local443++) {
				if (local443 >= local401 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(485) int local485;
		for (local443 = 0; local443 < arg0; local443++) {
			for (local485 = 0; local485 < arg0; local485++) {
				if (local443 >> 1 >= local485) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(534) int local534;
		for (local485 = 0; local485 < arg0; local485++) {
			for (local534 = arg0 - 1; local534 >= 0; local534--) {
				if (local534 >= local485 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(577) int local577;
		for (local534 = arg0 - 1; local534 >= 0; local534--) {
			for (local577 = 0; local577 < arg0; local577++) {
				if (local577 >= local534 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(619) int local619;
		for (local577 = 0; local577 < arg0; local577++) {
			for (local619 = 0; local619 < arg0; local619++) {
				if (local577 << 1 >= local619) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(668) int local668;
		for (local619 = 0; local619 < arg0; local619++) {
			for (local668 = arg0 - 1; local668 >= 0; local668--) {
				if (local619 >> 1 <= local668) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(710) int local710;
		for (local668 = arg0 - 1; local668 >= 0; local668--) {
			for (local710 = arg0 - 1; local710 >= 0; local710--) {
				if (local668 << 1 >= local710) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(754) int local754;
		for (local710 = arg0 - 1; local710 >= 0; local710--) {
			for (local754 = arg0 - 1; local754 >= 0; local754--) {
				if (local710 >> 1 <= local754) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(793) int local793;
		for (local754 = arg0 - 1; local754 >= 0; local754--) {
			for (local793 = 0; local793 < arg0; local793++) {
				if (local754 << 1 >= local793) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(831) int local831;
		for (local793 = 0; local793 < arg0; local793++) {
			for (local831 = 0; local831 < arg0; local831++) {
				if (local793 >> 1 <= local831) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(876) int local876;
		for (local831 = 0; local831 < arg0; local831++) {
			for (local876 = arg0 - 1; local876 >= 0; local876--) {
				if (local831 << 1 >= local876) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(921) int local921;
		for (local876 = 0; local876 < arg0; local876++) {
			for (local921 = 0; local921 < arg0; local921++) {
				if (local921 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(960) int local960;
		for (local921 = 0; local921 < arg0; local921++) {
			for (local960 = 0; local960 < arg0; local960++) {
				if (local921 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1007) int local1007;
		for (local960 = 0; local960 < arg0; local960++) {
			for (local1007 = 0; local1007 < arg0; local1007++) {
				if (arg0 / 2 <= local1007) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1050) int local1050;
		for (local1007 = 0; local1007 < arg0; local1007++) {
			for (local1050 = 0; local1050 < arg0; local1050++) {
				if (arg0 / 2 <= local1007) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1097) int local1097;
		for (local1050 = 0; local1050 < arg0; local1050++) {
			for (local1097 = 0; local1097 < arg0; local1097++) {
				if (local1050 - arg0 / 2 >= local1097) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1141) int local1141;
		for (local1097 = arg0 - 1; local1097 >= 0; local1097--) {
			for (local1141 = 0; local1141 < arg0; local1141++) {
				if (local1097 - arg0 / 2 >= local1141) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1185) int local1185;
		for (local1141 = arg0 - 1; local1141 >= 0; local1141--) {
			for (local1185 = arg0 - 1; local1185 >= 0; local1185--) {
				if (local1141 - arg0 / 2 >= local1185) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1230) int local1230;
		for (local1185 = 0; local1185 < arg0; local1185++) {
			for (local1230 = arg0 - 1; local1230 >= 0; local1230--) {
				if (local1185 - arg0 / 2 >= local1230) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1278) int local1278;
		for (local1230 = 0; local1230 < arg0; local1230++) {
			for (local1278 = 0; local1278 < arg0; local1278++) {
				if (local1230 - arg0 / 2 <= local1278) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1326) int local1326;
		for (local1278 = arg0 - 1; local1278 >= 0; local1278--) {
			for (local1326 = 0; local1326 < arg0; local1326++) {
				if (local1326 >= local1278 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1378) int local1378;
		for (local1326 = arg0 - 1; local1326 >= 0; local1326--) {
			for (local1378 = arg0 - 1; local1378 >= 0; local1378--) {
				if (local1378 >= local1326 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1378 = 0; local1378 < arg0; local1378++) {
			for (@Pc(1424) int local1424 = arg0 - 1; local1424 >= 0; local1424--) {
				if (local1378 - arg0 / 2 <= local1424) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "([II[ILclient!cj;[I)V")
	public static void method347(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class1_Sub2_Sub1_Sub1 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(11) int local11 = 0; local11 < arg3.length; local11++) {
			@Pc(17) int local17 = arg3[local11];
			@Pc(21) int local21 = arg1[local11];
			@Pc(25) int local25 = arg0[local11];
			for (@Pc(27) int local27 = 0; local21 != 0 && local27 < arg2.aClass51Array3.length; local27++) {
				if ((local21 & 0x1) != 0) {
					if (local17 == -1) {
						arg2.aClass51Array3[local27] = null;
					} else {
						@Pc(52) Class102 local52 = Static333.aClass50_2.method1175(local17);
						@Pc(55) int local55 = local52.anInt2985;
						@Pc(60) Class51 local60 = arg2.aClass51Array3[local27];
						if (local60 != null) {
							if (local17 == local60.anInt1433) {
								if (local55 == 0) {
									local60 = arg2.aClass51Array3[local27] = null;
								} else if (local55 == 1) {
									local60.anInt1438 = local25;
									local60.anInt1435 = 0;
									local60.anInt1437 = 0;
									local60.anInt1436 = 0;
									local60.anInt1434 = 1;
									Static343.method5495(local52, Static182.aClass1_Sub2_Sub1_Sub1_1 == arg2, arg2.anInt6800, 0, arg2.anInt6798, arg2.aByte73);
								} else if (local55 == 2) {
									local60.anInt1436 = 0;
								}
							} else if (local52.anInt2992 >= Static333.aClass50_2.method1175(local60.anInt1433).anInt2992) {
								local60 = arg2.aClass51Array3[local27] = null;
							}
						}
						if (local60 == null) {
							local60 = arg2.aClass51Array3[local27] = new Class51();
							local60.anInt1435 = 0;
							local60.anInt1437 = 0;
							local60.anInt1434 = 1;
							local60.anInt1438 = local25;
							local60.anInt1436 = 0;
							local60.anInt1433 = local17;
							Static343.method5495(local52, arg2 == Static182.aClass1_Sub2_Sub1_Sub1_1, arg2.anInt6800, 0, arg2.anInt6798, arg2.aByte73);
						}
					}
				}
				local21 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!g;Lclient!gl;ZLclient!g;)V")
	public static void method348(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Interface5 arg1, @OriginalArg(3) Class83 arg2) {
		Static36.aClass83_55 = arg2;
		Static364.anInterface5_1 = arg1;
		Static300.aClass83_107 = arg0;
		if (Static300.aClass83_107 != null) {
			Static230.anInt4628 = Static300.aClass83_107.method1955(1);
		}
		if (Static36.aClass83_55 != null) {
			Static137.anInt1376 = Static36.aClass83_55.method1955(1);
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)I")
	public static int method349() {
		return 2;
	}
}
