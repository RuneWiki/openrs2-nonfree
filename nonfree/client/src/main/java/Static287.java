import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!se", name = "O", descriptor = "Lclient!lf;")
	public static Class121 aClass121_8;

	@OriginalMember(owner = "client!se", name = "T", descriptor = "Z")
	public static boolean aBoolean425 = false;

	@OriginalMember(owner = "client!se", name = "V", descriptor = "I")
	public static int anInt5569 = -1;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IZZ)V")
	public static void method5072(@OriginalArg(2) boolean arg0) {
		if (arg0) {
			Static281.anInt5478--;
			if (Static281.anInt5478 == 0) {
				Static209.anIntArray347 = null;
			}
		}
		Static312.anInt6005--;
		if (Static312.anInt6005 == 0) {
			Static170.anIntArray264 = null;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZIII)V")
	public static void method5073(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static105.aClass155ArrayArrayArray3 == null) {
			return;
		}
		@Pc(19) long local19 = (long) (arg1 << 14 | arg2 << 28 | arg0);
		@Pc(25) Class1_Sub3 local25 = (Class1_Sub3) Static46.aClass38_4.method1475(local19);
		if (local25 == null) {
			Static82.method1770(arg2, arg0, arg1);
			return;
		}
		@Pc(39) Class1_Sub23 local39 = (Class1_Sub23) local25.aClass42_1.method1543();
		if (local39 == null) {
			Static82.method1770(arg2, arg0, arg1);
			return;
		}
		@Pc(53) Class11_Sub3_Sub1 local53 = (Class11_Sub3_Sub1) Static82.method1770(arg2, arg0, arg1);
		if (local53 == null) {
			local53 = new Class11_Sub3_Sub1();
		} else {
			local53.anInt1364 = local53.anInt1373 = -1;
		}
		local53.anInt1372 = local39.anInt2968;
		local53.anInt1366 = local39.anInt2967;
		label44: while (true) {
			@Pc(81) Class1_Sub23 local81 = (Class1_Sub23) local25.aClass42_1.method1551();
			if (local81 == null) {
				break;
			}
			if (local81.anInt2967 != local53.anInt1366) {
				local53.anInt1367 = local81.anInt2968;
				local53.anInt1364 = local81.anInt2967;
				while (true) {
					@Pc(102) Class1_Sub23 local102 = (Class1_Sub23) local25.aClass42_1.method1551();
					if (local102 == null) {
						break label44;
					}
					if (local53.anInt1366 != local102.anInt2967 && local102.anInt2967 != local53.anInt1364) {
						local53.anInt1373 = local102.anInt2967;
						local53.anInt1363 = local102.anInt2968;
					}
				}
			}
		}
		@Pc(155) int local155 = Static8.method288(arg2, (arg0 << 7) + 64, (arg1 << 7) + 64);
		Static168.method3169(arg2, arg0, arg1, local155, local53);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!fp;II)Z")
	public static boolean method5074(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = (Static311.anInt5653 - 104) / 2;
		@Pc(17) int local17 = (Static189.anInt3820 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static320.method4042(local21, local25, local29, arg1)) {
						local40 = local29;
						if (Static137.method2772(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static222.method4134(local25, local40, local21);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(86) int[] local86 = new int[262144];
		for (local29 = 0; local29 < local86.length; local29++) {
			local86[local29] = -16777216;
		}
		Static331.aClass4_22 = arg0.method4587(local86, 512, 512, 512);
		Static238.method4401();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + -10 + 238 << 8) + 238 - 10 | 0xFF000000;
		@Pc(156) int local156 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(175) int local175 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(179) boolean[][] local179 = new boolean[Static85.anInt1914][Static85.anInt1914];
		@Pc(185) int local185;
		@Pc(202) int local202;
		@Pc(206) int local206;
		@Pc(210) int local210;
		@Pc(263) int local263;
		@Pc(270) int local270;
		@Pc(275) int local275;
		@Pc(290) int local290;
		for (@Pc(181) int local181 = local11; local181 < local11 + 104; local181 += Static85.anInt1914) {
			for (local185 = local17; local185 < local17 + 104; local185 += Static85.anInt1914) {
				arg0.method4566(0, 0, Static85.anInt1914 * 4, Static85.anInt1914 * 4);
				arg0.method4627(-16777216);
				for (local202 = arg1; local202 <= 3; local202++) {
					for (local206 = 0; local206 < Static85.anInt1914; local206++) {
						for (local210 = 0; local210 < Static85.anInt1914; local210++) {
							local179[local206][local210] = Static320.method4042(local181 + local206, local210 + local185, local202, arg1);
						}
					}
					Static50.aClass36Array3[local202].method4432(local181, local185, Static85.anInt1914 + local181, Static85.anInt1914 + local185, local179);
					if (!Static264.aBoolean388) {
						for (local210 = -4; local210 < Static85.anInt1914; local210++) {
							for (local263 = -4; local263 < Static85.anInt1914; local263++) {
								local270 = local181 + local210;
								local275 = local185 + local263;
								if (local11 <= local270 && local17 <= local275 && Static320.method4042(local270, local275, local202, arg1)) {
									local290 = local202;
									if (Static137.method2772(local275, local270)) {
										local290 = local202 - 1;
									}
									if (local290 >= 0) {
										Static97.method2090(local40, (Static85.anInt1914 - local263) * 4 - 4, local270, local210 * 4, arg0, local156, local290, local275);
									}
								}
							}
						}
					}
				}
				if (Static264.aBoolean388) {
					@Pc(335) Class196 local335 = Static11.aClass196Array2[arg1];
					for (local210 = 0; local210 < Static85.anInt1914; local210++) {
						for (local263 = 0; local263 < Static85.anInt1914; local263++) {
							local270 = local210 + local181;
							local275 = local185 + local263;
							local290 = local335.anIntArrayArray66[local270 - local335.anInt5923][local275 - local335.anInt5905];
							if ((local290 & 0x40240000) != 0) {
								arg0.method4639((Static85.anInt1914 - local263) * 4 - 4, local210 * 4, 4, -1713569622, 4);
							} else if ((local290 & 0x800000) != 0) {
								arg0.method4615(local210 * 4, -1713569622, 4, (Static85.anInt1914 - local263) * 4 - 4);
							} else if ((local290 & 0x2000000) != 0) {
								arg0.method4644(local210 * 4 + 3, 4, -1713569622, (Static85.anInt1914 - local263) * 4 - 4);
							} else if ((local290 & 0x8000000) != 0) {
								arg0.method4615(local210 * 4, -1713569622, 4, (Static85.anInt1914 - local263) * 4 - 1);
							} else if ((local290 & 0x20000000) != 0) {
								arg0.method4644(local210 * 4, 4, -1713569622, (Static85.anInt1914 - local263) * 4 - 4);
							}
						}
					}
				}
				arg0.method4653(0, 0, Static85.anInt1914 * 4, Static85.anInt1914 * 4, local175, 2);
				Static331.aClass4_22.method5951((local181 - local11) * 4 + 48, -(Static85.anInt1914 * 4) + -((-local17 + local185) * 4) + 464, Static85.anInt1914 * 4, Static85.anInt1914 * 4);
			}
		}
		arg0.method4651();
		arg0.method4627(-16777215);
		Static113.method2415();
		Static235.anInt4750 = 0;
		Static337.aClass42_44.method1542();
		if (!Static264.aBoolean388) {
			for (local185 = local11; local185 < local11 + 104; local185++) {
				for (local202 = local17; local202 < local17 + 104; local202++) {
					for (local206 = arg1; local206 <= arg1 + 1 && local206 <= 3; local206++) {
						if (Static320.method4042(local185, local202, local206, arg1)) {
							@Pc(604) Interface4 local604 = (Interface4) Static109.method2324(local206, local185, local202);
							if (local604 == null) {
								local604 = (Interface4) Static138.method2791(local206, local185, local202, jb.class);
							}
							if (local604 == null) {
								local604 = (Interface4) Static342.method5727(local206, local185, local202);
							}
							if (local604 == null) {
								local604 = (Interface4) Static74.method1619(local206, local185, local202);
							}
							if (local604 != null) {
								@Pc(644) Class71 local644 = Static219.method4081(local604.method5927());
								if (!local644.aBoolean162 || Static204.aBoolean304) {
									local270 = local644.anInt2369;
									if (local644.anIntArray178 != null) {
										for (local275 = 0; local275 < local644.anIntArray178.length; local275++) {
											if (local644.anIntArray178[local275] != -1) {
												@Pc(672) Class71 local672 = Static219.method4081(local644.anIntArray178[local275]);
												if (local672.anInt2369 >= 0) {
													local270 = local672.anInt2369;
												}
											}
										}
									}
									if (local270 >= 0) {
										@Pc(692) boolean local692 = false;
										if (local270 >= 0) {
											@Pc(701) Class194 local701 = Static226.method4184(local270);
											if (local701 != null && local701.aBoolean437) {
												local692 = true;
											}
										}
										local290 = local185;
										@Pc(712) int local712 = local202;
										if (local692) {
											@Pc(719) int[][] local719 = Static11.aClass196Array2[local206].anIntArrayArray66;
											@Pc(724) int local724 = Static11.aClass196Array2[local206].anInt5923;
											@Pc(729) int local729 = Static11.aClass196Array2[local206].anInt5905;
											for (@Pc(731) int local731 = 0; local731 < 10; local731++) {
												@Pc(738) int local738 = (int) (Math.random() * 4.0D);
												if (local738 == 0 && local11 < local290 && local290 > local185 - 3 && (local719[local290 - local724 - 1][local712 - local729] & 0x2C0108) == 0) {
													local290--;
												}
												if (local738 == 1 && local290 < local11 + 103 && local290 < local185 + 3 && (local719[local290 + 1 - local724][local712 - local729] & 0x2C0180) == 0) {
													local290++;
												}
												if (local738 == 2 && local17 < local712 && local712 > local202 - 3 && (local719[local290 - local724][local712 - local729 - 1] & 0x2C0102) == 0) {
													local712--;
												}
												if (local738 == 3 && local17 + 104 - 1 > local712 && local202 + 3 > local712 && (local719[local290 - local724][local712 + 1 - local729] & 0x2C0120) == 0) {
													local712++;
												}
											}
										}
										Static192.anIntArray291[Static235.anInt4750] = local644.anInt2365;
										Static228.anIntArray378[Static235.anInt4750] = local290;
										Static14.anIntArray385[Static235.anInt4750] = local712;
										Static235.anInt4750++;
									}
								}
							}
						}
					}
				}
			}
			if (Static134.aClass86_1 != null) {
				Static195.aClass30_57.anInt1229 = 1;
				Static312.method5405(64, 1024);
				for (local202 = 0; local202 < Static134.aClass86_1.anInt2801; local202++) {
					local206 = Static134.aClass86_1.anIntArray210[local202];
					if (local206 >> 28 == Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79) {
						local210 = (local206 >> 14 & 0x3FFF) - Static50.anInt1271;
						local263 = (local206 & 0x3FFF) - Static299.anInt4036;
						if (local210 >= 0 && local210 < Static311.anInt5653 && local263 >= 0 && Static189.anInt3820 > local263) {
							Static337.aClass42_44.method1549(new Class1_Sub9(local202));
						} else {
							@Pc(1009) Class194 local1009 = Static226.method4184(Static134.aClass86_1.anIntArray211[local202]);
							if (local1009.anIntArray452 != null && local1009.anInt5839 + local210 >= 0 && Static311.anInt5653 > local1009.anInt5818 + local210 && local263 + local1009.anInt5836 >= 0 && local1009.anInt5814 + local263 < Static189.anInt3820) {
								Static337.aClass42_44.method1549(new Class1_Sub9(local202));
							}
						}
					}
				}
				Static312.method5405(64, 128);
				Static195.aClass30_57.anInt1229 = 2;
				Static195.aClass30_57.method1166();
			}
		}
		return true;
	}
}
