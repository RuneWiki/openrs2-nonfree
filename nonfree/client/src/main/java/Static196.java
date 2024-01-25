import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!jp", name = "q", descriptor = "I")
	public static final int anInt3331 = 50;

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray17 = new String[anInt3331];

	@OriginalMember(owner = "client!jp", name = "g", descriptor = "[I")
	public static final int[] anIntArray275 = new int[anInt3331];

	@OriginalMember(owner = "client!jp", name = "m", descriptor = "[I")
	public static final int[] anIntArray277 = new int[anInt3331];

	@OriginalMember(owner = "client!jp", name = "t", descriptor = "[I")
	public static final int[] anIntArray279 = new int[anInt3331];

	@OriginalMember(owner = "client!jp", name = "w", descriptor = "[I")
	public static final int[] anIntArray281 = new int[anInt3331];

	@OriginalMember(owner = "client!jp", name = "x", descriptor = "[I")
	public static final int[] anIntArray282 = new int[anInt3331];

	@OriginalMember(owner = "client!jp", name = "z", descriptor = "[I")
	public static final int[] anIntArray283 = new int[anInt3331];

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IILclient!za;)Z")
	public static boolean method2638(@OriginalArg(0) int arg0, @OriginalArg(2) Class163 arg1) {
		@Pc(11) int local11 = (Static166.anInt2852 - 104) / 2;
		@Pc(17) int local17 = (Static426.anInt6923 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static375.method4874(local29, arg0, local25, local21)) {
						local40 = local29;
						if (Static372.method4855(local21, local25)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static85.method1355(local40, local21, local25);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(90) int[] local90 = new int[262144];
		for (local29 = 0; local29 < local90.length; local29++) {
			local90[local29] = -16777216;
		}
		Static137.aClass13_22 = arg1.method5522(local90, 512, 512, 512);
		Static250.method3191();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + 238 - 10 | 0xFF000000;
		@Pc(168) int local168 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x5BFFFF00) << 16;
		@Pc(187) int local187 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
		@Pc(196) boolean[][] local196 = new boolean[Static335.anInt5681][Static335.anInt5681];
		@Pc(202) int local202;
		@Pc(219) int local219;
		@Pc(223) int local223;
		@Pc(227) int local227;
		@Pc(281) int local281;
		@Pc(287) int local287;
		@Pc(291) int local291;
		@Pc(310) int local310;
		for (@Pc(198) int local198 = local11; local198 < local11 + 104; local198 += Static335.anInt5681) {
			for (local202 = local17; local202 < local17 + 104; local202 += Static335.anInt5681) {
				arg1.ba(0, 0, Static335.anInt5681 * 4, Static335.anInt5681 * 4);
				arg1.t(-16777216);
				for (local219 = arg0; local219 <= 3; local219++) {
					for (local223 = 0; local223 < Static335.anInt5681; local223++) {
						for (local227 = 0; local227 < Static335.anInt5681; local227++) {
							local196[local223][local227] = Static375.method4874(local219, arg0, local227 + local202, local198 + local223);
						}
					}
					Static314.aClass162Array2[local219].method3278(local198, local202, local198 + Static335.anInt5681, Static335.anInt5681 + local202, local196);
					if (!Static204.aBoolean209) {
						for (local227 = -4; local227 < Static335.anInt5681; local227++) {
							for (local281 = -4; local281 < Static335.anInt5681; local281++) {
								local287 = local227 + local198;
								local291 = local202 + local281;
								if (local287 >= local11 && local17 <= local291 && Static375.method4874(local219, arg0, local291, local287)) {
									local310 = local219;
									if (Static372.method4855(local287, local291)) {
										local310 = local219 - 1;
									}
									if (local310 >= 0) {
										Static370.method4840(local227 * 4, local40, local287, local168, arg1, (Static335.anInt5681 - local281) * 4 - 4, local310, local291);
									}
								}
							}
						}
					}
				}
				if (Static204.aBoolean209) {
					@Pc(364) Class71 local364 = Static361.aClass71Array1[arg0];
					for (local227 = 0; local227 < Static335.anInt5681; local227++) {
						for (local281 = 0; local281 < Static335.anInt5681; local281++) {
							local287 = local227 + local198;
							local291 = local202 + local281;
							local310 = local364.anIntArrayArray11[local287 - local364.anInt1979][local291 - local364.anInt1973];
							if ((local310 & 0x40240000) != 0) {
								arg1.method5545(4, -1713569622, 4, (Static335.anInt5681 - local281) * 4 - 4, local227 * 4);
							} else if ((local310 & 0x800000) != 0) {
								arg1.method5543(4, -1713569622, (Static335.anInt5681 - local281) * 4 - 4, local227 * 4);
							} else if ((local310 & 0x2000000) != 0) {
								arg1.method5558(local227 * 4 + 3, (Static335.anInt5681 - local281) * 4 - 4, -1713569622, 4);
							} else if ((local310 & 0x8000000) != 0) {
								arg1.method5543(4, -1713569622, (Static335.anInt5681 - local281) * 4 + 3 - 4, local227 * 4);
							} else if ((local310 & 0x20000000) != 0) {
								arg1.method5558(local227 * 4, (Static335.anInt5681 - local281) * 4 - 4, -1713569622, 4);
							}
						}
					}
				}
				arg1.P(0, 0, Static335.anInt5681 * 4, Static335.anInt5681 * 4, local187, 2);
				Static137.aClass13_22.XA((local198 - local11) * 4 + 48, -(Static335.anInt5681 * 4) + 464 + -((-local17 + local202) * 4), Static335.anInt5681 * 4, Static335.anInt5681 * 4, 0, 0);
			}
		}
		arg1.va();
		arg1.t(-16777215);
		Static204.method2721();
		Static98.anInt1865 = 0;
		Static289.aClass156_37.method3161();
		if (!Static204.aBoolean209) {
			for (local202 = local11; local202 < local11 + 104; local202++) {
				for (local219 = local17; local219 < local17 + 104; local219++) {
					for (local223 = arg0; arg0 + 1 >= local223 && local223 <= 3; local223++) {
						if (Static375.method4874(local223, arg0, local219, local202)) {
							@Pc(636) Interface2 local636 = (Interface2) Static350.method4653(local223, local202, local219);
							if (local636 == null) {
								local636 = (Interface2) Static144.method2120(local223, local202, local219, bn.class);
							}
							if (local636 == null) {
								local636 = (Interface2) Static113.method1718(local223, local202, local219);
							}
							if (local636 == null) {
								local636 = (Interface2) Static333.method4460(local223, local202, local219);
							}
							if (local636 != null) {
								@Pc(677) Class192 local677 = Static50.aClass190_1.method4218(local636.method5292());
								if (!local677.aBoolean406 || Static47.aBoolean73) {
									local287 = local677.anInt5318;
									if (local677.anIntArray434 != null) {
										for (local291 = 0; local291 < local677.anIntArray434.length; local291++) {
											if (local677.anIntArray434[local291] != -1) {
												@Pc(706) Class192 local706 = Static50.aClass190_1.method4218(local677.anIntArray434[local291]);
												if (local706.anInt5318 >= 0) {
													local287 = local706.anInt5318;
												}
											}
										}
									}
									if (local287 >= 0) {
										@Pc(722) boolean local722 = false;
										if (local287 >= 0) {
											@Pc(732) Class78 local732 = Static193.aClass120_2.method2512(local287);
											if (local732 != null && local732.aBoolean142) {
												local722 = true;
											}
										}
										local310 = local202;
										@Pc(743) int local743 = local219;
										if (local722) {
											@Pc(750) int[][] local750 = Static361.aClass71Array1[local223].anIntArrayArray11;
											@Pc(755) int local755 = Static361.aClass71Array1[local223].anInt1979;
											@Pc(760) int local760 = Static361.aClass71Array1[local223].anInt1973;
											for (@Pc(762) int local762 = 0; local762 < 10; local762++) {
												@Pc(769) int local769 = (int) (Math.random() * 4.0D);
												if (local769 == 0 && local11 < local310 && local202 - 3 < local310 && (local750[local310 - local755 - 1][local743 - local760] & 0x2C0108) == 0) {
													local310--;
												}
												if (local769 == 1 && local11 + 104 - 1 > local310 && local202 + 3 > local310 && (local750[local310 + 1 - local755][local743 - local760] & 0x2C0180) == 0) {
													local310++;
												}
												if (local769 == 2 && local743 > local17 && local219 - 3 < local743 && (local750[local310 - local755][local743 - local760 - 1] & 0x2C0102) == 0) {
													local743--;
												}
												if (local769 == 3 && local17 + 104 - 1 > local743 && local743 < local219 + 3 && (local750[local310 - local755][local743 + 1 - local760] & 0x2C0120) == 0) {
													local743++;
												}
											}
										}
										Static284.anIntArray397[Static98.anInt1865] = local677.anInt5325;
										Static334.anIntArray497[Static98.anInt1865] = local310;
										Static404.anIntArray554[Static98.anInt1865] = local743;
										Static98.anInt1865++;
									}
								}
							}
						}
					}
				}
			}
			if (Static171.aClass67_1 != null) {
				Static24.aClass54_5.anInt1425 = 1;
				Static193.aClass120_2.method2511(64, 1024);
				for (local219 = 0; local219 < Static171.aClass67_1.anInt1860; local219++) {
					local223 = Static171.aClass67_1.anIntArray144[local219];
					if (Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91 == local223 >> 28) {
						local227 = (local223 >> 14 & 0x3FFF) - Static275.anInt4506;
						local281 = (local223 & 0x3FFF) - Static209.anInt3497;
						if (local227 >= 0 && Static166.anInt2852 > local227 && local281 >= 0 && Static426.anInt6923 > local281) {
							Static289.aClass156_37.method3157(new Class2_Sub20(local219));
						} else {
							@Pc(1037) Class78 local1037 = Static193.aClass120_2.method2512(Static171.aClass67_1.anIntArray143[local219]);
							if (local1037.anIntArray161 != null && local1037.anInt2133 + local227 >= 0 && local227 + local1037.anInt2166 < Static166.anInt2852 && local281 + local1037.anInt2145 >= 0 && Static426.anInt6923 > local1037.anInt2148 + local281) {
								Static289.aClass156_37.method3157(new Class2_Sub20(local219));
							}
						}
					}
				}
				Static193.aClass120_2.method2511(64, 128);
				Static24.aClass54_5.anInt1425 = 2;
				Static24.aClass54_5.method1117();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
	public static void method2640(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static291.anInt4793 >= 100) {
			Static12.method159(Static240.aClass134_60.method2720(Static331.anInt5597));
			return;
		}
		@Pc(24) String local24 = Static284.method3771(arg0);
		if (local24 == null) {
			return;
		}
		@Pc(67) String local67;
		for (@Pc(29) int local29 = 0; local29 < Static291.anInt4793; local29++) {
			@Pc(37) String local37 = Static284.method3771(Static200.aStringArray18[local29]);
			if (local37 != null && local37.equals(local24)) {
				Static12.method159(arg0 + Static85.aClass134_28.method2720(Static331.anInt5597));
				return;
			}
			if (Static417.aStringArray39[local29] != null) {
				local67 = Static284.method3771(Static417.aStringArray39[local29]);
				if (local67 != null && local67.equals(local24)) {
					Static12.method159(arg0 + Static85.aClass134_28.method2720(Static331.anInt5597));
					return;
				}
			}
		}
		for (@Pc(97) int local97 = 0; local97 < Static209.anInt3494; local97++) {
			local67 = Static284.method3771(Static290.aStringArray29[local97]);
			if (local67 != null && local67.equals(local24)) {
				Static12.method159(Static143.aClass134_50.method2720(Static331.anInt5597) + arg0 + Static50.aClass134_17.method2720(Static331.anInt5597));
				return;
			}
			if (Static312.aStringArray31[local97] != null) {
				@Pc(140) String local140 = Static284.method3771(Static312.aStringArray31[local97]);
				if (local140 != null && local140.equals(local24)) {
					Static12.method159(Static143.aClass134_50.method2720(Static331.anInt5597) + arg0 + Static50.aClass134_17.method2720(Static331.anInt5597));
					return;
				}
			}
		}
		if (Static284.method3771(Static60.aClass3_Sub4_Sub1_Sub2_1.aString148).equals(local24)) {
			Static12.method159(Static270.aClass134_67.method2720(Static331.anInt5597));
		} else {
			Static29.method451(Static105.aClass102_65);
			Static456.aClass2_Sub13_Sub2_2.method3602(Static385.method4939(arg0) + 1);
			Static456.aClass2_Sub13_Sub2_2.method3590(arg0);
			Static456.aClass2_Sub13_Sub2_2.method3602(arg1 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIB)V")
	public static void method2641(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 << 3;
		@Pc(15) int local15 = arg1 << 3;
		Static113.aFloat19 = local15;
		if (Static414.anInt6776 == 2) {
			Static235.anInt3805 = local7;
			Static381.anInt6280 = 0;
			Static310.anInt5375 = local15;
		}
		Static332.aFloat80 = local7;
		Static442.method5596();
		Static257.aBoolean292 = true;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)I")
	public static int method2644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static329.anIntArrayArray42 == null ? 0 : Static329.anIntArrayArray42[arg0][arg1] & 0xFFFFFF;
	}
}
