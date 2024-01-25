import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!no", name = "A", descriptor = "F")
	public static float aFloat140;

	@OriginalMember(owner = "client!no", name = "C", descriptor = "I")
	public static int anInt7217;

	@OriginalMember(owner = "client!no", name = "F", descriptor = "[Lclient!ufa;")
	public static Class4[] aClass4Array9;

	@OriginalMember(owner = "client!no", name = "u", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_77 = new Class185(29, 6);

	@OriginalMember(owner = "client!no", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString72 = null;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(III)V")
	public static void method6035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static293.aClass5_6 == null) {
			return;
		}
		@Pc(17) int local17 = Static354.anInt6877;
		@Pc(19) int local19 = Static123.anInt3102;
		Static243.method3835(arg0, arg1);
		if (Static552.anInt9486 == 0) {
			Static64.anInterface20_3 = null;
			Static64.anInterface20_3 = Static293.aClass5_6.method6178(Static293.aClass5_6.method6176(Static226.anInt5043, Static84.anInt2618), Static293.aClass5_6.method6107(Static226.anInt5043, Static84.anInt2618));
		} else if (Static552.anInt9486 == 1 && (Static320.anInterface20Array1 == null || Static354.anInt6877 != local17 || Static123.anInt3102 != local19)) {
			Static320.anInterface20Array1 = new Interface20[Static354.anInt6877 * Static123.anInt3102];
			for (@Pc(65) int local65 = 0; local65 < Static320.anInterface20Array1.length; local65++) {
				Static320.anInterface20Array1[local65] = Static293.aClass5_6.method6178(Static293.aClass5_6.method6176(Static361.anInt6971, Static633.anInt10652), Static293.aClass5_6.method6107(Static361.anInt6971, Static633.anInt10652));
			}
			Static326.anIntArray304 = new int[Static354.anInt6877 * Static123.anInt3102];
			Static409.anInt7607 = 1;
		}
		Static610.aBoolean810 = true;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IB)[[[B")
	public static byte[][][] method6036(@OriginalArg(0) int arg0) {
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
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(73) int local73;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local73 = 0; local73 < arg0; local73++) {
				if (local26 >= local73) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(113) int local113;
		for (local73 = 0; local73 < arg0; local73++) {
			for (local113 = 0; local113 < arg0; local113++) {
				if (local73 <= local113) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(156) int local156;
		for (local113 = arg0 - 1; local113 >= 0; local113--) {
			for (local156 = 0; local156 < arg0; local156++) {
				if (local156 >= local113) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(194) int local194;
		for (local156 = arg0 - 1; local156 >= 0; local156--) {
			for (local194 = 0; local194 < arg0; local194++) {
				if (local156 >> 1 >= local194) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(235) int local235;
		for (local194 = 0; local194 < arg0; local194++) {
			for (local235 = 0; local235 < arg0; local235++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local235 >= local194 << 1) {
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
		@Pc(304) int local304;
		for (local235 = 0; local235 < arg0; local235++) {
			for (local304 = arg0 - 1; local304 >= 0; local304--) {
				if (local304 <= local235 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(349) int local349;
		for (local304 = arg0 - 1; local304 >= 0; local304--) {
			for (local349 = arg0 - 1; local349 >= 0; local349--) {
				if (local349 >= local304 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(396) int local396;
		for (local349 = arg0 - 1; local349 >= 0; local349--) {
			for (local396 = arg0 - 1; local396 >= 0; local396--) {
				if (local396 <= local349 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(445) int local445;
		for (local396 = arg0 - 1; local396 >= 0; local396--) {
			for (local445 = 0; local445 < arg0; local445++) {
				if (local445 >= local396 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(487) int local487;
		for (local445 = 0; local445 < arg0; local445++) {
			for (local487 = 0; local487 < arg0; local487++) {
				if (local445 >> 1 >= local487) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(532) int local532;
		for (local487 = 0; local487 < arg0; local487++) {
			for (local532 = arg0 - 1; local532 >= 0; local532--) {
				if (local532 >= local487 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(580) int local580;
		for (local532 = arg0 - 1; local532 >= 0; local532--) {
			for (local580 = 0; local580 < arg0; local580++) {
				if (local532 >> 1 <= local580) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(622) int local622;
		for (local580 = 0; local580 < arg0; local580++) {
			for (local622 = 0; local622 < arg0; local622++) {
				if (local622 <= local580 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(667) int local667;
		for (local622 = 0; local622 < arg0; local622++) {
			for (local667 = arg0 - 1; local667 >= 0; local667--) {
				if (local667 >= local622 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(717) int local717;
		for (local667 = arg0 - 1; local667 >= 0; local667--) {
			for (local717 = arg0 - 1; local717 >= 0; local717--) {
				if (local667 << 1 >= local717) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(761) int local761;
		for (local717 = arg0 - 1; local717 >= 0; local717--) {
			for (local761 = arg0 - 1; local761 >= 0; local761--) {
				if (local717 >> 1 <= local761) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(803) int local803;
		for (local761 = arg0 - 1; local761 >= 0; local761--) {
			for (local803 = 0; local803 < arg0; local803++) {
				if (local803 <= local761 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(841) int local841;
		for (local803 = 0; local803 < arg0; local803++) {
			for (local841 = 0; local841 < arg0; local841++) {
				if (local841 >= local803 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(886) int local886;
		for (local841 = 0; local841 < arg0; local841++) {
			for (local886 = arg0 - 1; local886 >= 0; local886--) {
				if (local841 << 1 >= local886) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(931) int local931;
		for (local886 = 0; local886 < arg0; local886++) {
			for (local931 = 0; local931 < arg0; local931++) {
				if (arg0 / 2 >= local931) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(978) int local978;
		for (local931 = 0; local931 < arg0; local931++) {
			for (local978 = 0; local978 < arg0; local978++) {
				if (arg0 / 2 >= local931) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1025) int local1025;
		for (local978 = 0; local978 < arg0; local978++) {
			for (local1025 = 0; local1025 < arg0; local1025++) {
				if (local1025 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1068) int local1068;
		for (local1025 = 0; local1025 < arg0; local1025++) {
			for (local1068 = 0; local1068 < arg0; local1068++) {
				if (local1025 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1115) int local1115;
		for (local1068 = 0; local1068 < arg0; local1068++) {
			for (local1115 = 0; local1115 < arg0; local1115++) {
				if (local1115 <= local1068 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1167) int local1167;
		for (local1115 = arg0 - 1; local1115 >= 0; local1115--) {
			for (local1167 = 0; local1167 < arg0; local1167++) {
				if (local1167 <= local1115 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1219) int local1219;
		for (local1167 = arg0 - 1; local1167 >= 0; local1167--) {
			for (local1219 = arg0 - 1; local1219 >= 0; local1219--) {
				if (local1219 <= local1167 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1268) int local1268;
		for (local1219 = 0; local1219 < arg0; local1219++) {
			for (local1268 = arg0 - 1; local1268 >= 0; local1268--) {
				if (local1268 <= local1219 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1320) int local1320;
		for (local1268 = 0; local1268 < arg0; local1268++) {
			for (local1320 = 0; local1320 < arg0; local1320++) {
				if (local1320 >= local1268 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1320 = arg0 - 1; local1320 >= 0; local1320--) {
			for (@Pc(1367) int local1367 = 0; local1367 < arg0; local1367++) {
				if (local1320 - arg0 / 2 <= local1367) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1423) int local1423;
		for (@Pc(1417) int local1417 = arg0 - 1; local1417 >= 0; local1417--) {
			for (local1423 = arg0 - 1; local1423 >= 0; local1423--) {
				if (local1423 >= local1417 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1423 = 0; local1423 < arg0; local1423++) {
			for (@Pc(1468) int local1468 = arg0 - 1; local1468 >= 0; local1468--) {
				if (local1423 - arg0 / 2 <= local1468) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ZIIBZ)V")
	public static void method6037(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		Static597.method8284(arg1, 0, Static56.aClass67_Sub1Array1.length - 1, arg2, arg3, arg0);
		Static87.anInt2631 = 0;
		Static392.aClass6_Sub7_7 = null;
	}
}
