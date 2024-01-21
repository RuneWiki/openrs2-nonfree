import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!md", name = "L", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_974 = Static120.method1824("titlebox");

	@OriginalMember(owner = "client!md", name = "N", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_975 = Static120.method1824("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!md", name = "P", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_976 = Static120.method1824("mn");

	@OriginalMember(owner = "client!md", name = "T", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_977 = Static120.method1824("swe");

	@OriginalMember(owner = "client!md", name = "Y", descriptor = "[[S")
	public static final short[][] aShortArrayArray3 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!md", name = "gb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_978 = Static120.method1824("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIII)V")
	public static void method1707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static5.anInt201 == 0 || arg2 == 0 || Static66.anInt1437 >= 50 || arg0 == -1) {
			return;
		}
		Static82.anIntArray215[Static66.anInt1437] = arg0;
		Static17.anIntArray63[Static66.anInt1437] = arg2;
		Static145.anIntArray411[Static66.anInt1437] = arg1;
		Static159.aClass75Array1[Static66.anInt1437] = null;
		Static106.anIntArray303[Static66.anInt1437] = 0;
		Static66.anInt1437++;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!oh;B)V")
	public static void method1710(@OriginalArg(0) Class3_Sub1_Sub5_Sub4 arg0) {
		arg0.aBoolean169 = false;
		@Pc(17) Class3_Sub1_Sub15 local17;
		if (arg0.anInt4285 != -1) {
			local17 = Static148.method2368(arg0.anInt4285);
			if (local17 == null || local17.anIntArray439 == null) {
				arg0.anInt4285 = -1;
			} else {
				arg0.anInt4310++;
				if (local17.anIntArray439.length > arg0.anInt4304 && arg0.anInt4310 > local17.anIntArray440[arg0.anInt4304]) {
					arg0.anInt4310 = 1;
					arg0.anInt4304++;
					Static75.method1113(arg0.anInt4329, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1 == arg0, arg0.anInt4304, local17, arg0.anInt4315);
				}
				if (local17.anIntArray439.length <= arg0.anInt4304) {
					arg0.anInt4310 = 0;
					arg0.anInt4304 = 0;
					Static75.method1113(arg0.anInt4329, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1 == arg0, arg0.anInt4304, local17, arg0.anInt4315);
				}
			}
		}
		if (arg0.anInt4296 != -1 && arg0.anInt4276 <= Static193.anInt4411) {
			if (arg0.anInt4313 < 0) {
				arg0.anInt4313 = 0;
			}
			@Pc(123) int local123 = Static194.method3135(arg0.anInt4296).anInt2463;
			if (local123 == -1) {
				arg0.anInt4296 = -1;
			} else {
				@Pc(130) Class3_Sub1_Sub15 local130 = Static148.method2368(local123);
				if (local130 == null || local130.anIntArray439 == null) {
					arg0.anInt4296 = -1;
				} else {
					arg0.anInt4295++;
					if (arg0.anInt4313 < local130.anIntArray439.length && arg0.anInt4295 > local130.anIntArray440[arg0.anInt4313]) {
						arg0.anInt4295 = 1;
						arg0.anInt4313++;
						Static75.method1113(arg0.anInt4329, arg0 == Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1, arg0.anInt4313, local130, arg0.anInt4315);
					}
					if (arg0.anInt4313 >= local130.anIntArray439.length) {
						arg0.anInt4296 = -1;
					}
				}
			}
		}
		if (arg0.anInt4323 != -1 && arg0.anInt4286 <= 1) {
			local17 = Static148.method2368(arg0.anInt4323);
			if (local17.anInt3546 == 1 && arg0.anInt4291 > 0 && Static193.anInt4411 >= arg0.anInt4325 && Static193.anInt4411 > arg0.anInt4282) {
				arg0.anInt4286 = 1;
				return;
			}
		}
		if (arg0.anInt4323 != -1 && arg0.anInt4286 == 0) {
			local17 = Static148.method2368(arg0.anInt4323);
			if (local17 == null || local17.anIntArray439 == null) {
				arg0.anInt4323 = -1;
			} else {
				arg0.anInt4305++;
				if (local17.anIntArray439.length > arg0.anInt4275 && local17.anIntArray440[arg0.anInt4275] < arg0.anInt4305) {
					arg0.anInt4275++;
					arg0.anInt4305 = 1;
					Static75.method1113(arg0.anInt4329, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1 == arg0, arg0.anInt4275, local17, arg0.anInt4315);
				}
				if (arg0.anInt4275 >= local17.anIntArray439.length) {
					arg0.anInt4299++;
					arg0.anInt4275 -= local17.anInt3549;
					if (arg0.anInt4299 >= local17.anInt3560) {
						arg0.anInt4323 = -1;
					} else if (arg0.anInt4275 >= 0 && arg0.anInt4275 < local17.anIntArray439.length) {
						Static75.method1113(arg0.anInt4329, arg0 == Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1, arg0.anInt4275, local17, arg0.anInt4315);
					} else {
						arg0.anInt4323 = -1;
					}
				}
				arg0.aBoolean169 = local17.aBoolean145;
			}
		}
		if (arg0.anInt4286 > 0) {
			arg0.anInt4286--;
		}
	}

	@OriginalMember(owner = "client!md", name = "e", descriptor = "(I)V")
	public static void method1712() {
		@Pc(7) int local7 = Static58.anInt1293;
		@Pc(9) int local9 = Static46.anInt1056;
		@Pc(11) int local11 = Static191.anInt4389;
		@Pc(13) int local13 = Static27.anInt4466;
		Static24.method2576(local7, local11, local9, local13, 6116423);
		Static24.method2576(local7 + 1, local11 + 1, local9 - 2, 16, 0);
		Static24.method2564(local7 + 1, local11 + 18, local9 - 2, local13 - 19, 0);
		Static140.aClass3_Sub1_Sub4_Sub3_Sub1_6.method2264(Static180.aClass80_1541, local7 + 3, local11 + 14, 6116423, -1);
		@Pc(60) int local60 = Static190.anInt4379;
		@Pc(62) int local62 = Static3.anInt153;
		for (@Pc(64) int local64 = 0; local64 < Static173.anInt3892; local64++) {
			@Pc(79) int local79 = local11 + (-local64 + -1 + Static173.anInt3892) * 15 + 31;
			@Pc(81) int local81 = 16777215;
			if (local60 > local7 && local60 < local9 + local7 && local62 > local79 - 13 && local79 + 3 > local62) {
				local81 = 16776960;
			}
			Static140.aClass3_Sub1_Sub4_Sub3_Sub1_6.method2264(Static12.method47(local64), local7 + 3, local79, local81, 0);
		}
		Static150.method2411(Static46.anInt1056, Static27.anInt4466, Static58.anInt1293, Static191.anInt4389);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIII)V")
	public static void method1713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static64.anInt1390 * 128) {
			arg0 = Static64.anInt1390 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static49.anInt1086 * 128) {
			arg2 = Static49.anInt1086 * 128 - 1;
		}
		Static109.anInt2440++;
		Static14.anInt320 = Class3_Sub1_Sub4_Sub2.anIntArray188[arg3];
		Static21.anInt512 = Class3_Sub1_Sub4_Sub2.anIntArray190[arg3];
		Static112.anInt2518 = Class3_Sub1_Sub4_Sub2.anIntArray188[arg4];
		Static112.anInt2527 = Class3_Sub1_Sub4_Sub2.anIntArray190[arg4];
		Static107.aBooleanArrayArray1 = Static133.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static87.anInt1818 = arg0;
		Static95.anInt3659 = arg1;
		Static143.anInt3081 = arg2;
		Static58.anInt1291 = arg0 / 128;
		Static30.anInt4486 = arg2 / 128;
		Static27.anInt4460 = arg5;
		Static132.anInt2835 = Static58.anInt1291 - Static162.anInt3644;
		if (Static132.anInt2835 < 0) {
			Static132.anInt2835 = 0;
		}
		Static69.anInt1535 = Static30.anInt4486 - Static162.anInt3644;
		if (Static69.anInt1535 < 0) {
			Static69.anInt1535 = 0;
		}
		Static72.anInt4104 = Static58.anInt1291 + Static162.anInt3644;
		if (Static72.anInt4104 > Static64.anInt1390) {
			Static72.anInt4104 = Static64.anInt1390;
		}
		Static141.anInt3037 = Static30.anInt4486 + Static162.anInt3644;
		if (Static141.anInt3037 > Static49.anInt1086) {
			Static141.anInt3037 = Static49.anInt1086;
		}
		Static81.method1211();
		Static74.anInt3650 = 0;
		@Pc(125) int local125;
		@Pc(128) int local128;
		for (@Pc(118) int local118 = Static166.anInt3714; local118 < Static97.anInt2061; local118++) {
			@Pc(123) Class3_Sub15[][] local123 = Static185.aClass3_Sub15ArrayArrayArray1[local118];
			for (local125 = Static132.anInt2835; local125 < Static72.anInt4104; local125++) {
				for (local128 = Static69.anInt1535; local128 < Static141.anInt3037; local128++) {
					@Pc(135) Class3_Sub15 local135 = local123[local125][local128];
					if (local135 != null) {
						if (local135.anInt1999 <= arg5 && (Static107.aBooleanArrayArray1[local125 + Static162.anInt3644 - Static58.anInt1291][local128 + Static162.anInt3644 - Static30.anInt4486] || Static111.anIntArrayArrayArray7[local118][local125][local128] - arg1 >= 2000)) {
							local135.aBoolean79 = true;
							local135.aBoolean80 = true;
							if (local135.anInt2014 > 0) {
								local135.aBoolean81 = true;
							} else {
								local135.aBoolean81 = false;
							}
							Static74.anInt3650++;
						} else {
							local135.aBoolean79 = false;
							local135.aBoolean80 = false;
							local135.anInt2005 = 0;
						}
					}
				}
			}
		}
		@Pc(227) int local227;
		@Pc(236) int local236;
		@Pc(241) int local241;
		@Pc(245) int local245;
		@Pc(223) int local223;
		for (@Pc(210) int local210 = Static166.anInt3714; local210 < Static97.anInt2061; local210++) {
			@Pc(215) Class3_Sub15[][] local215 = Static185.aClass3_Sub15ArrayArrayArray1[local210];
			for (local128 = -Static162.anInt3644; local128 <= 0; local128++) {
				local223 = Static58.anInt1291 + local128;
				local227 = Static58.anInt1291 - local128;
				if (local223 >= Static132.anInt2835 || local227 < Static72.anInt4104) {
					for (local236 = -Static162.anInt3644; local236 <= 0; local236++) {
						local241 = Static30.anInt4486 + local236;
						local245 = Static30.anInt4486 - local236;
						@Pc(257) Class3_Sub15 local257;
						if (local223 >= Static132.anInt2835) {
							if (local241 >= Static69.anInt1535) {
								local257 = local215[local223][local241];
								if (local257 != null && local257.aBoolean79) {
									Static51.method761(local257, true);
								}
							}
							if (local245 < Static141.anInt3037) {
								local257 = local215[local223][local245];
								if (local257 != null && local257.aBoolean79) {
									Static51.method761(local257, true);
								}
							}
						}
						if (local227 < Static72.anInt4104) {
							if (local241 >= Static69.anInt1535) {
								local257 = local215[local227][local241];
								if (local257 != null && local257.aBoolean79) {
									Static51.method761(local257, true);
								}
							}
							if (local245 < Static141.anInt3037) {
								local257 = local215[local227][local245];
								if (local257 != null && local257.aBoolean79) {
									Static51.method761(local257, true);
								}
							}
						}
						if (Static74.anInt3650 == 0) {
							Static86.aBoolean69 = false;
							return;
						}
					}
				}
			}
		}
		for (local125 = Static166.anInt3714; local125 < Static97.anInt2061; local125++) {
			@Pc(341) Class3_Sub15[][] local341 = Static185.aClass3_Sub15ArrayArrayArray1[local125];
			for (local223 = -Static162.anInt3644; local223 <= 0; local223++) {
				local227 = Static58.anInt1291 + local223;
				local236 = Static58.anInt1291 - local223;
				if (local227 >= Static132.anInt2835 || local236 < Static72.anInt4104) {
					for (local241 = -Static162.anInt3644; local241 <= 0; local241++) {
						local245 = Static30.anInt4486 + local241;
						@Pc(371) int local371 = Static30.anInt4486 - local241;
						@Pc(383) Class3_Sub15 local383;
						if (local227 >= Static132.anInt2835) {
							if (local245 >= Static69.anInt1535) {
								local383 = local341[local227][local245];
								if (local383 != null && local383.aBoolean79) {
									Static51.method761(local383, false);
								}
							}
							if (local371 < Static141.anInt3037) {
								local383 = local341[local227][local371];
								if (local383 != null && local383.aBoolean79) {
									Static51.method761(local383, false);
								}
							}
						}
						if (local236 < Static72.anInt4104) {
							if (local245 >= Static69.anInt1535) {
								local383 = local341[local236][local245];
								if (local383 != null && local383.aBoolean79) {
									Static51.method761(local383, false);
								}
							}
							if (local371 < Static141.anInt3037) {
								local383 = local341[local236][local371];
								if (local383 != null && local383.aBoolean79) {
									Static51.method761(local383, false);
								}
							}
						}
						if (Static74.anInt3650 == 0) {
							Static86.aBoolean69 = false;
							return;
						}
					}
				}
			}
		}
		Static86.aBoolean69 = false;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!mb;Z)Lclient!db;")
	public static Class3_Sub5 method1714(@OriginalArg(0) Class3_Sub17 arg0) {
		@Pc(9) int local9 = arg0.method2107();
		@Pc(13) int local13 = arg0.method2107();
		@Pc(17) Class local17 = Static29.method487(local13);
		try {
			@Pc(21) Class3_Sub5 local21 = (Class3_Sub5) local17.getDeclaredConstructor().newInstance();
			if (local21 != null) {
				local21.anInt4495 = local9;
				local21.anInt4489 = arg0.method2107();
				@Pc(35) int local35 = arg0.method2107();
				for (@Pc(37) int local37 = 0; local37 < local35; local37++) {
					@Pc(43) int local43 = arg0.method2107();
					local21.method3169(local43, arg0);
				}
			}
			local21.method3164();
			return local21;
		} catch (@Pc(65) IllegalAccessException local65) {
			throw new RuntimeException();
		} catch (@Pc(70) InstantiationException local70) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)I")
	public static int method1715(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x3F;
	}
}
