import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!is", name = "hb", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_106 = new Class221("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!is", name = "xb", descriptor = "Z")
	public static boolean aBoolean211 = true;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!km;BI)Z")
	public static boolean method2639(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = (Static392.anInt6751 - 104) / 2;
		@Pc(22) int local22 = (Static307.anInt5484 - 104) / 2;
		@Pc(24) boolean local24 = true;
		@Pc(34) int local34;
		@Pc(45) int local45;
		for (@Pc(26) int local26 = local16; local26 < local16 + 104; local26++) {
			for (@Pc(30) int local30 = local22; local30 < local22 + 104; local30++) {
				for (local34 = arg1; local34 <= 3; local34++) {
					if (Static122.method2233(arg1, local26, local34, local30)) {
						local45 = local34;
						if (Static231.method3806(local26, local30)) {
							local45 = local34 - 1;
						}
						if (local45 >= 0) {
							local24 &= Static365.method2201(local26, local30, local45);
						}
					}
				}
			}
		}
		if (!local24) {
			return false;
		}
		@Pc(87) int[] local87 = new int[262144];
		for (local34 = 0; local34 < local87.length; local34++) {
			local87[local34] = -16777216;
		}
		Static298.aClass5_9 = arg0.method4456(local87, 512, 512, 512);
		Static370.method5577();
		local45 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 228 << 8) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
		@Pc(160) int local160 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xAAEAFF00) << 16;
		@Pc(179) int local179 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
		@Pc(183) boolean[][] local183 = new boolean[Static180.anInt3218][Static180.anInt3218];
		@Pc(189) int local189;
		@Pc(206) int local206;
		@Pc(210) int local210;
		@Pc(214) int local214;
		@Pc(268) int local268;
		@Pc(275) int local275;
		@Pc(279) int local279;
		@Pc(294) int local294;
		for (@Pc(185) int local185 = local16; local185 < local16 + 104; local185 += Static180.anInt3218) {
			for (local189 = local22; local189 < local22 + 104; local189 += Static180.anInt3218) {
				arg0.method4477(0, 0, Static180.anInt3218 * 4, Static180.anInt3218 * 4);
				arg0.method4481(-16777216);
				for (local206 = arg1; local206 <= 3; local206++) {
					for (local210 = 0; local210 < Static180.anInt3218; local210++) {
						for (local214 = 0; local214 < Static180.anInt3218; local214++) {
							local183[local210][local214] = Static122.method2233(arg1, local185 + local210, local206, local189 + local214);
						}
					}
					Static39.aClass33Array2[local206].method4066(local185, local189, local185 + Static180.anInt3218, local189 + Static180.anInt3218, local183);
					if (!Static274.aBoolean100) {
						for (local214 = -4; local214 < Static180.anInt3218; local214++) {
							for (local268 = -4; local268 < Static180.anInt3218; local268++) {
								local275 = local185 + local214;
								local279 = local268 + local189;
								if (local275 >= local16 && local22 <= local279 && Static122.method2233(arg1, local275, local206, local279)) {
									local294 = local206;
									if (Static231.method3806(local275, local279)) {
										local294 = local206 - 1;
									}
									if (local294 >= 0) {
										Static275.method4292(local214 * 4, local275, local294, arg0, local279, local160, (Static180.anInt3218 - local268) * 4 - 4, local45);
									}
								}
							}
						}
					}
				}
				if (Static274.aBoolean100) {
					@Pc(343) Class239 local343 = Static190.aClass239Array1[arg1];
					for (local214 = 0; local214 < Static180.anInt3218; local214++) {
						for (local268 = 0; local268 < Static180.anInt3218; local268++) {
							local275 = local185 + local214;
							local279 = local268 + local189;
							local294 = local343.anIntArrayArray54[local275 - local343.anInt6436][local279 - local343.anInt6445];
							if ((local294 & 0x40240000) != 0) {
								arg0.method4486(4, 4, local214 * 4, -1713569622, (Static180.anInt3218 - local268) * 4 - 4);
							} else if ((local294 & 0x800000) != 0) {
								arg0.method4476(4, local214 * 4, -1713569622, (Static180.anInt3218 - local268) * 4 - 4);
							} else if ((local294 & 0x2000000) != 0) {
								arg0.method4509(-1713569622, local214 * 4 + 3, 4, (Static180.anInt3218 - local268) * 4 - 4);
							} else if ((local294 & 0x8000000) != 0) {
								arg0.method4476(4, local214 * 4, -1713569622, (Static180.anInt3218 - local268) * 4 + 3 - 4);
							} else if ((local294 & 0x20000000) != 0) {
								arg0.method4509(-1713569622, local214 * 4, 4, (Static180.anInt3218 - local268) * 4 - 4);
							}
						}
					}
				}
				arg0.method4482(0, 0, Static180.anInt3218 * 4, Static180.anInt3218 * 4, local179, 2);
				Static298.aClass5_9.method5005((local185 - local16) * 4 + 48, -(Static180.anInt3218 * 4) + 464 + -((-local22 + local189) * 4), Static180.anInt3218 * 4, Static180.anInt3218 * 4);
			}
		}
		arg0.method4512();
		arg0.method4481(-16777215);
		Static303.method4753();
		Static216.anInt3989 = 0;
		Static138.aClass210_20.method5043();
		if (!Static274.aBoolean100) {
			for (local189 = local16; local189 < local16 + 104; local189++) {
				for (local206 = local22; local206 < local22 + 104; local206++) {
					for (local210 = arg1; local210 <= arg1 + 1 && local210 <= 3; local210++) {
						if (Static122.method2233(arg1, local189, local210, local206)) {
							@Pc(610) Interface11 local610 = (Interface11) Static240.method3889(local210, local189, local206);
							if (local610 == null) {
								local610 = (Interface11) Static86.method4712(local210, local189, local206, wk.class);
							}
							if (local610 == null) {
								local610 = (Interface11) Static252.method4000(local210, local189, local206);
							}
							if (local610 == null) {
								local610 = (Interface11) Static221.method3733(local210, local189, local206);
							}
							if (local610 != null) {
								@Pc(651) Class34 local651 = Static11.aClass123_5.method2703(local610.method5025());
								if (!local651.aBoolean64 || Static6.aBoolean4) {
									local275 = local651.anInt777;
									if (local651.anIntArray122 != null) {
										for (local279 = 0; local279 < local651.anIntArray122.length; local279++) {
											if (local651.anIntArray122[local279] != -1) {
												@Pc(681) Class34 local681 = Static11.aClass123_5.method2703(local651.anIntArray122[local279]);
												if (local681.anInt777 >= 0) {
													local275 = local681.anInt777;
												}
											}
										}
									}
									if (local275 >= 0) {
										@Pc(700) boolean local700 = false;
										if (local275 >= 0) {
											@Pc(707) Class80 local707 = Static240.aClass211_4.method5049(local275);
											if (local707 != null && local707.aBoolean154) {
												local700 = true;
											}
										}
										local294 = local189;
										@Pc(718) int local718 = local206;
										if (local700) {
											@Pc(725) int[][] local725 = Static190.aClass239Array1[local210].anIntArrayArray54;
											@Pc(730) int local730 = Static190.aClass239Array1[local210].anInt6436;
											@Pc(735) int local735 = Static190.aClass239Array1[local210].anInt6445;
											for (@Pc(737) int local737 = 0; local737 < 10; local737++) {
												@Pc(744) int local744 = (int) (Math.random() * 4.0D);
												if (local744 == 0 && local294 > local16 && local189 - 3 < local294 && (local725[local294 - local730 - 1][local718 - local735] & 0x2C0108) == 0) {
													local294--;
												}
												if (local744 == 1 && local294 < local16 + 103 && local189 + 3 > local294 && (local725[local294 + 1 - local730][local718 - local735] & 0x2C0180) == 0) {
													local294++;
												}
												if (local744 == 2 && local718 > local22 && local206 - 3 < local718 && (local725[local294 - local730][local718 - local735 - 1] & 0x2C0102) == 0) {
													local718--;
												}
												if (local744 == 3 && local718 < local22 + 104 - 1 && local206 + 3 > local718 && (local725[local294 - local730][local718 + 1 - local735] & 0x2C0120) == 0) {
													local718++;
												}
											}
										}
										Static306.anIntArray662[Static216.anInt3989] = local651.anInt802;
										Static18.anIntArray84[Static216.anInt3989] = local294;
										Static62.anIntArray163[Static216.anInt3989] = local718;
										Static216.anInt3989++;
									}
								}
							}
						}
					}
				}
			}
			if (Static156.aClass159_3 != null) {
				Static262.aClass71_41.anInt1745 = 1;
				Static240.aClass211_4.method5054(1024, 64);
				for (local206 = 0; local206 < Static156.aClass159_3.anInt4270; local206++) {
					local210 = Static156.aClass159_3.anIntArray519[local206];
					if (Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74 == local210 >> 28) {
						local214 = (local210 >> 14 & 0x3FFF) - Static376.anInt6607;
						local268 = (local210 & 0x3FFF) - Static133.anInt2474;
						if (local214 >= 0 && Static392.anInt6751 > local214 && local268 >= 0 && Static307.anInt5484 > local268) {
							Static138.aClass210_20.method5044(new Class2_Sub44(local206));
						} else {
							@Pc(998) Class80 local998 = Static240.aClass211_4.method5049(Static156.aClass159_3.anIntArray520[local206]);
							if (local998.anIntArray241 != null && local214 + local998.anInt2033 >= 0 && Static392.anInt6751 > local214 + local998.anInt2061 && local268 + local998.anInt2042 >= 0 && local998.anInt2046 + local268 < Static307.anInt5484) {
								Static138.aClass210_20.method5044(new Class2_Sub44(local206));
							}
						}
					}
				}
				Static240.aClass211_4.method5054(128, 64);
				Static262.aClass71_41.anInt1745 = 2;
				Static262.aClass71_41.method1567();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method2649(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(28) int local28 = arg0[arg2 + local12] & 0xFF;
			if (local28 != 0) {
				if (local28 >= 128 && local28 < 160) {
					@Pc(46) char local46 = Static303.aCharArray9[local28 - 128];
					if (local46 == '\u0000') {
						local46 = '?';
					}
					local28 = local46;
				}
				local8[local10++] = (char) local28;
			}
		}
		return new String(local8, 0, local10);
	}
}
