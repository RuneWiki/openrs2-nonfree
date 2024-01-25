import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!jb", name = "Z", descriptor = "[I")
	public static int[] anIntArray230;

	@OriginalMember(owner = "client!jb", name = "T", descriptor = "Lclient!ug;")
	public static final Class243 aClass243_21 = new Class243();

	@OriginalMember(owner = "client!jb", name = "V", descriptor = "Lclient!pf;")
	public static final Class187 aClass187_1 = new Class187(14, 1);

	@OriginalMember(owner = "client!jb", name = "ab", descriptor = "Lclient!pf;")
	public static final Class187 aClass187_2 = new Class187(15, 4);

	@OriginalMember(owner = "client!jb", name = "bb", descriptor = "Lclient!pf;")
	public static final Class187 aClass187_3 = new Class187(16, -2);

	@OriginalMember(owner = "client!jb", name = "cb", descriptor = "Lclient!pf;")
	public static final Class187 aClass187_4 = new Class187(17, 0);

	@OriginalMember(owner = "client!jb", name = "db", descriptor = "Lclient!pf;")
	public static final Class187 aClass187_5 = new Class187(18, -2);

	@OriginalMember(owner = "client!jb", name = "eb", descriptor = "Lclient!pf;")
	public static final Class187 aClass187_6 = new Class187(20, 6);

	@OriginalMember(owner = "client!jb", name = "fb", descriptor = "Lclient!pf;")
	public static final Class187 aClass187_7 = new Class187(21, 8);

	@OriginalMember(owner = "client!jb", name = "gb", descriptor = "Lclient!pf;")
	public static final Class187 aClass187_8 = new Class187(22, -2);

	@OriginalMember(owner = "client!jb", name = "hb", descriptor = "Lclient!pf;")
	public static final Class187 aClass187_9 = new Class187(23, 4);

	@OriginalMember(owner = "client!jb", name = "ib", descriptor = "Lclient!pf;")
	public static final Class187 aClass187_10 = new Class187(24, -1);

	@OriginalMember(owner = "client!jb", name = "kb", descriptor = "I")
	public static int anInt3684 = 0;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)I")
	public static int method2932(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static210.anIntArray265[arg0 & 0x3] : Static195.anIntArray246[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "(I)Z")
	public static boolean method2934() throws IOException {
		if (Static88.aClass251_2 == null) {
			return false;
		}
		@Pc(11) int local11 = Static88.aClass251_2.method5348();
		if (local11 == 0) {
			return false;
		}
		@Pc(71) int local71;
		if (Static277.aClass119_110 == null) {
			if (Static438.aBoolean637) {
				local11--;
				Static88.aClass251_2.method5346(0, Static237.aClass3_Sub7_Sub1_1.aByteArray46, 1);
				Static66.anInt1701++;
				Static438.aBoolean637 = false;
			}
			Static237.aClass3_Sub7_Sub1_1.anInt3235 = 0;
			if (Static237.aClass3_Sub7_Sub1_1.method1060()) {
				if (local11 == 0) {
					return false;
				}
				local11--;
				Static88.aClass251_2.method5346(1, Static237.aClass3_Sub7_Sub1_1.aByteArray46, 1);
				Static66.anInt1701++;
			}
			Static438.aBoolean637 = true;
			@Pc(67) Class119[] local67 = Static185.method2977();
			local71 = Static237.aClass3_Sub7_Sub1_1.method1062();
			if (local71 < 0 || local71 >= local67.length) {
				throw new IOException("invo:" + local71 + " ip:" + Static237.aClass3_Sub7_Sub1_1.anInt3235);
			}
			Static277.aClass119_110 = local67[local71];
			Static139.anInt7585 = Static277.aClass119_110.anInt3623;
		}
		if (Static139.anInt7585 == -1) {
			if (local11 <= 0) {
				return false;
			}
			Static88.aClass251_2.method5346(0, Static237.aClass3_Sub7_Sub1_1.aByteArray46, 1);
			Static139.anInt7585 = Static237.aClass3_Sub7_Sub1_1.aByteArray46[0] & 0xFF;
			Static66.anInt1701++;
			local11--;
		}
		if (Static139.anInt7585 == -2) {
			if (local11 <= 1) {
				return false;
			}
			Static88.aClass251_2.method5346(0, Static237.aClass3_Sub7_Sub1_1.aByteArray46, 2);
			Static237.aClass3_Sub7_Sub1_1.anInt3235 = 0;
			local11 -= 2;
			Static139.anInt7585 = Static237.aClass3_Sub7_Sub1_1.method2588();
			Static66.anInt1701 += 2;
		}
		if (Static139.anInt7585 > local11) {
			return false;
		}
		Static237.aClass3_Sub7_Sub1_1.anInt3235 = 0;
		Static88.aClass251_2.method5346(0, Static237.aClass3_Sub7_Sub1_1.aByteArray46, Static139.anInt7585);
		Static401.anInt6631 = 0;
		Static66.anInt1701 += Static139.anInt7585;
		Static354.aClass119_128 = Static76.aClass119_31;
		Static76.aClass119_31 = Static240.aClass119_99;
		Static240.aClass119_99 = Static277.aClass119_110;
		if (Static303.aClass119_113 == Static277.aClass119_110) {
			Static237.aClass3_Sub7_Sub1_1.anInt3235 += 28;
			if (Static237.aClass3_Sub7_Sub1_1.method2597()) {
				Static221.method3338(Static237.aClass3_Sub7_Sub1_1.anInt3235 - 28, Static237.aClass3_Sub7_Sub1_1);
			}
			Static277.aClass119_110 = null;
			return true;
		}
		@Pc(236) int local236;
		@Pc(221) int local221;
		@Pc(240) int local240;
		if (Static277.aClass119_110 == Static70.aClass119_25) {
			local221 = Static237.aClass3_Sub7_Sub1_1.method2588();
			if (local221 == 65535) {
				local221 = -1;
			}
			local71 = Static237.aClass3_Sub7_Sub1_1.method2582();
			local236 = Static237.aClass3_Sub7_Sub1_1.method2588();
			local240 = Static237.aClass3_Sub7_Sub1_1.method2582();
			Static442.method5816(local236, local240, local221, local71);
			Static277.aClass119_110 = null;
			return true;
		}
		@Pc(264) boolean local264;
		@Pc(268) String local268;
		@Pc(270) String local270;
		@Pc(315) String local315;
		if (Static204.aClass119_87 == Static277.aClass119_110) {
			local264 = Static237.aClass3_Sub7_Sub1_1.method2582() == 1;
			local268 = Static237.aClass3_Sub7_Sub1_1.method2620();
			local270 = local268;
			if (local264) {
				local270 = Static237.aClass3_Sub7_Sub1_1.method2620();
			}
			local240 = Static237.aClass3_Sub7_Sub1_1.method2582();
			@Pc(282) boolean local282 = false;
			if (local240 <= 1) {
				if (Static388.aBoolean561 && !Static331.aBoolean651 || Static338.aBoolean492) {
					local282 = true;
				} else if (local240 <= 1 && Static2.method9(local270)) {
					local282 = true;
				}
			}
			if (!local282 && Static391.anInt6727 == 0) {
				local315 = Static249.method3737(Static337.method4506(Static237.aClass3_Sub7_Sub1_1));
				if (local240 == 2) {
					Static416.method5338(local315, 24, -1, null, "<img=1>" + local270, "<img=1>" + local268, 0);
				} else if (local240 == 1) {
					Static416.method5338(local315, 24, -1, null, "<img=0>" + local270, "<img=0>" + local268, 0);
				} else {
					Static416.method5338(local315, 24, -1, null, local270, local268, 0);
				}
			}
			Static277.aClass119_110 = null;
			return true;
		} else if (Static277.aClass119_110 == Static216.aClass119_90) {
			local221 = Static237.aClass3_Sub7_Sub1_1.method2635();
			local71 = Static237.aClass3_Sub7_Sub1_1.method2593();
			local270 = Static237.aClass3_Sub7_Sub1_1.method2620();
			if (Static315.method4354(local221)) {
				Static223.method5950(local270, local71);
			}
			Static277.aClass119_110 = null;
			return true;
		} else if (Static277.aClass119_110 == Static195.aClass119_85) {
			local221 = Static237.aClass3_Sub7_Sub1_1.method2635();
			if (local221 == 65535) {
				local221 = -1;
			}
			local71 = Static237.aClass3_Sub7_Sub1_1.method2616();
			local236 = Static237.aClass3_Sub7_Sub1_1.method2593();
			if (Static315.method4354(local236)) {
				Static18.method2730(local71, local221);
			}
			Static277.aClass119_110 = null;
			return true;
		} else if (Static89.aClass119_40 == Static277.aClass119_110) {
			Static277.aClass119_110 = null;
			Static161.anInt3318 = Static301.anInt2459;
			Static105.anInt2381 = 1;
			return true;
		} else {
			@Pc(475) int local475;
			if (Static277.aClass119_110 == Static74.aClass119_30) {
				local221 = Static237.aClass3_Sub7_Sub1_1.method2588();
				local71 = Static237.aClass3_Sub7_Sub1_1.method2598();
				local236 = Static237.aClass3_Sub7_Sub1_1.method2588();
				local240 = Static237.aClass3_Sub7_Sub1_1.method2589();
				local475 = Static237.aClass3_Sub7_Sub1_1.method2598();
				if (Static315.method4354(local236)) {
					Static437.method5728(local71, local240, 7, local221 | local475 << 16);
				}
				Static277.aClass119_110 = null;
				return true;
			} else if (Static147.aClass119_64 == Static277.aClass119_110) {
				local221 = Static237.aClass3_Sub7_Sub1_1.method2641();
				local71 = Static237.aClass3_Sub7_Sub1_1.method2635();
				local236 = Static237.aClass3_Sub7_Sub1_1.method2596();
				local240 = Static237.aClass3_Sub7_Sub1_1.method2605();
				if (Static315.method4354(local71)) {
					Static229.method3438(local236, local221, local240);
				}
				Static277.aClass119_110 = null;
				return true;
			} else if (Static450.aClass119_154 == Static277.aClass119_110) {
				local221 = Static237.aClass3_Sub7_Sub1_1.method2593();
				local71 = Static237.aClass3_Sub7_Sub1_1.method2616();
				local236 = Static237.aClass3_Sub7_Sub1_1.method2593();
				if (local236 == 65535) {
					local236 = -1;
				}
				local240 = Static237.aClass3_Sub7_Sub1_1.method2589();
				if (Static315.method4354(local221)) {
					Static164.method2712(local71, local236, local240);
					@Pc(565) Class81 local565 = Static314.aClass12_2.method327(local236);
					Static375.method5190(local565.anInt2566, local565.anInt2552, local240, local565.anInt2539);
					Static410.method5286(local565.anInt2580, local240, local565.anInt2526, local565.anInt2532);
				}
				Static277.aClass119_110 = null;
				return true;
			} else if (Static174.aClass119_75 == Static277.aClass119_110) {
				Static326.method4411(false);
				Static277.aClass119_110 = null;
				return true;
			} else {
				@Pc(627) Class3_Sub9 local627;
				if (Static253.aClass119_104 == Static277.aClass119_110) {
					local221 = Static237.aClass3_Sub7_Sub1_1.method2593();
					local71 = Static237.aClass3_Sub7_Sub1_1.method2632();
					local236 = Static237.aClass3_Sub7_Sub1_1.method2584();
					local240 = Static237.aClass3_Sub7_Sub1_1.method2635();
					if (Static315.method4354(local240)) {
						local627 = (Class3_Sub9) Static318.aClass11_42.method324((long) local71);
						if (local627 != null) {
							Static434.method5676(local627.anInt1804 != local221, false, local627);
						}
						Static68.method1328(false, local221, local71, local236);
					}
					Static277.aClass119_110 = null;
					return true;
				} else if (Static137.aClass119_59 == Static277.aClass119_110) {
					if (Static226.anInt4225 != -1) {
						Static88.method1668(0, Static226.anInt4225);
					}
					Static277.aClass119_110 = null;
					return true;
				} else if (Static232.aClass119_96 == Static277.aClass119_110) {
					Static59.anInt3263 = Static237.aClass3_Sub7_Sub1_1.method2630() << 3;
					Static440.anInt7425 = Static237.aClass3_Sub7_Sub1_1.method2630() << 3;
					Static65.anInt1686 = Static237.aClass3_Sub7_Sub1_1.method2582();
					Static277.aClass119_110 = null;
					return true;
				} else if (Static277.aClass119_110 == Static76.aClass119_32) {
					Static242.method3660(Static416.aClass95_15);
					Static277.aClass119_110 = null;
					return true;
				} else if (Static277.aClass119_110 == Static140.aClass119_61) {
					local221 = Static237.aClass3_Sub7_Sub1_1.method2588();
					local71 = Static237.aClass3_Sub7_Sub1_1.method2589();
					if (Static315.method4354(local221)) {
						@Pc(725) Class3_Sub9 local725 = (Class3_Sub9) Static318.aClass11_42.method324((long) local71);
						if (local725 != null) {
							Static434.method5676(true, false, local725);
						}
						if (Static318.aClass156_17 != null) {
							Static386.method5010(Static318.aClass156_17);
							Static318.aClass156_17 = null;
						}
					}
					Static277.aClass119_110 = null;
					return true;
				} else if (Static178.aClass119_78 == Static277.aClass119_110) {
					local221 = Static237.aClass3_Sub7_Sub1_1.method2589();
					local71 = Static237.aClass3_Sub7_Sub1_1.method2593();
					local236 = Static237.aClass3_Sub7_Sub1_1.method2635();
					if (local236 == 65535) {
						local236 = -1;
					}
					if (Static315.method4354(local71)) {
						Static437.method5728(-1, local221, 1, local236);
					}
					Static277.aClass119_110 = null;
					return true;
				} else if (Static432.aClass119_151 == Static277.aClass119_110) {
					local221 = Static237.aClass3_Sub7_Sub1_1.method2632();
					local71 = Static237.aClass3_Sub7_Sub1_1.method2635();
					if (Static315.method4354(local71)) {
						Static437.method5728(-1, local221, 3, -1);
					}
					Static277.aClass119_110 = null;
					return true;
				} else if (Static158.aClass119_69 == Static277.aClass119_110) {
					local221 = Static237.aClass3_Sub7_Sub1_1.method2588();
					if (local221 == 65535) {
						local221 = -1;
					}
					local71 = Static237.aClass3_Sub7_Sub1_1.method2582();
					local236 = Static237.aClass3_Sub7_Sub1_1.method2588();
					local240 = Static237.aClass3_Sub7_Sub1_1.method2582();
					Static123.method1984(local240, local71, local221, local236);
					Static277.aClass119_110 = null;
					return true;
				} else if (Static277.aClass119_110 == Static2.aClass119_3) {
					local221 = Static237.aClass3_Sub7_Sub1_1.method2582();
					local71 = Static237.aClass3_Sub7_Sub1_1.method2582();
					if (local221 == 255) {
						local221 = -1;
						local71 = -1;
					}
					Static2.method11(local221, local71);
					Static277.aClass119_110 = null;
					return true;
				} else {
					@Pc(904) boolean local904;
					@Pc(927) String local927;
					if (Static91.aClass119_41 == Static277.aClass119_110) {
						local264 = Static237.aClass3_Sub7_Sub1_1.method2582() == 1;
						local268 = Static237.aClass3_Sub7_Sub1_1.method2620();
						local270 = local268;
						if (local264) {
							local270 = Static237.aClass3_Sub7_Sub1_1.method2620();
						}
						local240 = Static237.aClass3_Sub7_Sub1_1.method2582();
						local475 = Static237.aClass3_Sub7_Sub1_1.method2588();
						local904 = false;
						if (local240 <= 1 && Static2.method9(local270)) {
							local904 = true;
						}
						if (!local904 && Static391.anInt6727 == 0) {
							local927 = Static104.aClass262_1.method5748(local475).method5180(Static237.aClass3_Sub7_Sub1_1);
							if (local240 == 2) {
								Static416.method5338(local927, 25, local475, null, "<img=1>" + local270, "<img=1>" + local268, 0);
							} else if (local240 == 1) {
								Static416.method5338(local927, 25, local475, null, "<img=0>" + local270, "<img=0>" + local268, 0);
							} else {
								Static416.method5338(local927, 25, local475, null, local270, local268, 0);
							}
						}
						Static277.aClass119_110 = null;
						return true;
					}
					@Pc(1023) int local1023;
					if (Static277.aClass119_110 == Static9.aClass119_7) {
						local221 = Static237.aClass3_Sub7_Sub1_1.method2588();
						local71 = Static237.aClass3_Sub7_Sub1_1.method2582();
						local236 = Static237.aClass3_Sub7_Sub1_1.method2582();
						local240 = Static237.aClass3_Sub7_Sub1_1.method2588() << 0;
						local475 = Static237.aClass3_Sub7_Sub1_1.method2582();
						local1023 = Static237.aClass3_Sub7_Sub1_1.method2582();
						if (Static315.method4354(local221)) {
							Static129.method2030(local240, local475, local1023, local71, true, local236);
						}
						Static277.aClass119_110 = null;
						return true;
					} else if (Static277.aClass119_110 == Static119.aClass119_52) {
						Static326.method4411(true);
						Static277.aClass119_110 = null;
						return true;
					} else if (Static271.aClass119_108 == Static277.aClass119_110) {
						if (Static438.aFrame2 != null) {
							Static387.method5031(Static374.aClass20_Sub1_1.anInt2353, -1, -1, false);
						}
						@Pc(1064) byte[] local1064 = new byte[Static139.anInt7585];
						Static237.aClass3_Sub7_Sub1_1.method1061(Static139.anInt7585, local1064);
						local268 = Static198.method3127(local1064, Static139.anInt7585, 0);
						Static174.method2794(true, Static105.anInt2382 == 1, Static66.aClass143_2, local268);
						Static277.aClass119_110 = null;
						return true;
					} else if (Static277.aClass119_110 == Static106.aClass119_45) {
						local221 = Static237.aClass3_Sub7_Sub1_1.method2593();
						local71 = Static237.aClass3_Sub7_Sub1_1.method2616();
						local236 = Static237.aClass3_Sub7_Sub1_1.method2593();
						if (Static315.method4354(local221)) {
							Static73.method1425(local236, local71);
						}
						Static277.aClass119_110 = null;
						return true;
					} else if (Static407.aClass119_144 == Static277.aClass119_110) {
						Static242.method3660(Static229.aClass95_9);
						Static277.aClass119_110 = null;
						return true;
					} else if (Static225.aClass119_92 == Static277.aClass119_110) {
						local221 = Static237.aClass3_Sub7_Sub1_1.method2598();
						local71 = Static237.aClass3_Sub7_Sub1_1.method2593();
						@Pc(1145) byte local1145 = Static237.aClass3_Sub7_Sub1_1.method2619();
						if (Static315.method4354(local221)) {
							Static73.method1425(local71, local1145);
						}
						Static277.aClass119_110 = null;
						return true;
					} else {
						@Pc(1164) String local1164;
						if (Static332.aClass119_119 == Static277.aClass119_110) {
							local1164 = Static237.aClass3_Sub7_Sub1_1.method2620();
							local71 = Static237.aClass3_Sub7_Sub1_1.method2635();
							local236 = Static237.aClass3_Sub7_Sub1_1.method2635();
							if (Static315.method4354(local236)) {
								Static223.method5950(local1164, local71);
							}
							Static277.aClass119_110 = null;
							return true;
						} else if (Static277.aClass119_110 == Static194.aClass119_84) {
							local221 = Static237.aClass3_Sub7_Sub1_1.method2593();
							local71 = Static237.aClass3_Sub7_Sub1_1.method2635();
							local236 = Static237.aClass3_Sub7_Sub1_1.method2598();
							local240 = Static237.aClass3_Sub7_Sub1_1.method2598();
							local475 = Static237.aClass3_Sub7_Sub1_1.method2589();
							if (Static315.method4354(local221)) {
								Static375.method5190(local71, local240, local475, local236);
							}
							Static277.aClass119_110 = null;
							return true;
						} else if (Static277.aClass119_110 == Static112.aClass119_49) {
							Static300.anInt5394 = Static237.aClass3_Sub7_Sub1_1.method2641();
							Static355.anInt6052 = Static301.anInt2459;
							Static277.aClass119_110 = null;
							return true;
						} else {
							@Pc(1282) long local1282;
							@Pc(1288) Class3_Sub45 local1288;
							@Pc(1297) Class3_Sub45 local1297;
							if (Static277.aClass119_110 == Static6.aClass119_4) {
								local221 = Static237.aClass3_Sub7_Sub1_1.method2598();
								local71 = Static237.aClass3_Sub7_Sub1_1.method2593();
								if (local71 == 65535) {
									local71 = -1;
								}
								local236 = Static237.aClass3_Sub7_Sub1_1.method2616();
								local240 = Static237.aClass3_Sub7_Sub1_1.method2635();
								if (local240 == 65535) {
									local240 = -1;
								}
								local475 = Static237.aClass3_Sub7_Sub1_1.method2596();
								if (Static315.method4354(local221)) {
									for (local1023 = local240; local1023 <= local71; local1023++) {
										local1282 = ((long) local475 << 32) + (long) local1023;
										local1288 = (Class3_Sub45) Static72.aClass11_11.method324(local1282);
										if (local1288 != null) {
											local1297 = new Class3_Sub45(local236, local1288.anInt7653);
											local1288.method5977();
										} else if (local1023 == -1) {
											local1297 = new Class3_Sub45(local236, Static435.method5705(local475).aClass3_Sub45_2.anInt7653);
										} else {
											local1297 = new Class3_Sub45(local236, -1);
										}
										Static72.aClass11_11.method319(local1297, local1282);
									}
								}
								Static277.aClass119_110 = null;
								return true;
							} else if (Static185.aClass119_82 == Static277.aClass119_110) {
								Static242.method3660(Static305.aClass95_11);
								Static277.aClass119_110 = null;
								return true;
							} else if (Static208.aClass119_89 == Static277.aClass119_110) {
								Static204.aString23 = Static139.anInt7585 > 2 ? Static237.aClass3_Sub7_Sub1_1.method2620() : Static342.aClass189_186.method4262(Static53.anInt1454);
								Static437.anInt7362 = Static139.anInt7585 > 0 ? Static237.aClass3_Sub7_Sub1_1.method2588() : -1;
								Static277.aClass119_110 = null;
								if (Static437.anInt7362 == 65535) {
									Static437.anInt7362 = -1;
								}
								return true;
							} else if (Static277.aClass119_110 == Static264.aClass119_105) {
								Static326.method4408(Static237.aClass3_Sub7_Sub1_1.method2620());
								Static277.aClass119_110 = null;
								return true;
							} else if (Static173.aClass119_74 == Static277.aClass119_110) {
								local221 = Static237.aClass3_Sub7_Sub1_1.method2635();
								local71 = Static237.aClass3_Sub7_Sub1_1.method2584();
								local236 = Static237.aClass3_Sub7_Sub1_1.method2588();
								if (Static315.method4354(local236)) {
									if (local71 == 2) {
										Static205.method3191();
									}
									Static226.anInt4225 = local221;
									Static136.method2171(local221);
									Static430.method2668(false);
									Static285.method4057(Static226.anInt4225);
									for (local240 = 0; local240 < 100; local240++) {
										Static55.aBooleanArray8[local240] = true;
									}
								}
								Static277.aClass119_110 = null;
								return true;
							} else if (Static305.aClass119_114 == Static277.aClass119_110) {
								Static445.anInt7526 = Static237.aClass3_Sub7_Sub1_1.method2588() * 30;
								Static277.aClass119_110 = null;
								Static355.anInt6052 = Static301.anInt2459;
								return true;
							} else if (Static317.aClass119_118 == Static277.aClass119_110) {
								Static242.method3660(Static117.aClass95_6);
								Static277.aClass119_110 = null;
								return true;
							} else if (Static277.aClass119_110 == Static365.aClass119_133) {
								local1164 = Static237.aClass3_Sub7_Sub1_1.method2620();
								local71 = Static237.aClass3_Sub7_Sub1_1.method2588();
								local270 = Static104.aClass262_1.method5748(local71).method5180(Static237.aClass3_Sub7_Sub1_1);
								Static416.method5338(local270, 19, local71, null, local1164, local1164, 0);
								Static277.aClass119_110 = null;
								return true;
							} else if (Static277.aClass119_110 == Static390.aClass119_138) {
								local221 = Static237.aClass3_Sub7_Sub1_1.method2588();
								if (Static315.method4354(local221)) {
									Static133.method2054();
								}
								Static277.aClass119_110 = null;
								return true;
							} else if (Static277.aClass119_110 == Static314.aClass119_117) {
								local221 = Static237.aClass3_Sub7_Sub1_1.method2589();
								Static126.aClass43_4 = Static66.aClass143_2.method3391(local221);
								Static277.aClass119_110 = null;
								return true;
							} else if (Static277.aClass119_110 == Static146.aClass119_63) {
								local221 = Static237.aClass3_Sub7_Sub1_1.method2632();
								local71 = Static237.aClass3_Sub7_Sub1_1.method2598();
								Static85.aClass49_1.method1320(local71, local221);
								Static277.aClass119_110 = null;
								return true;
							} else if (Static277.aClass119_110 == Static405.aClass119_141) {
								local221 = Static237.aClass3_Sub7_Sub1_1.method2593();
								local71 = Static237.aClass3_Sub7_Sub1_1.method2593();
								local236 = Static237.aClass3_Sub7_Sub1_1.method2596();
								local240 = Static237.aClass3_Sub7_Sub1_1.method2635();
								if (Static315.method4354(local240)) {
									Static437.method5732(local236, local221 + (local71 << 16));
								}
								Static277.aClass119_110 = null;
								return true;
							} else if (Static277.aClass119_110 == Static419.aClass119_149) {
								for (local221 = 0; local221 < Static361.aClass7_Sub2_Sub3_Sub2Array1.length; local221++) {
									if (Static361.aClass7_Sub2_Sub3_Sub2Array1[local221] != null) {
										Static361.aClass7_Sub2_Sub3_Sub2Array1[local221].anInt4366 = -1;
									}
								}
								for (local71 = 0; local71 < Static139.aClass7_Sub2_Sub3_Sub1Array11.length; local71++) {
									if (Static139.aClass7_Sub2_Sub3_Sub1Array11[local71] != null) {
										Static139.aClass7_Sub2_Sub3_Sub1Array11[local71].anInt4366 = -1;
									}
								}
								Static277.aClass119_110 = null;
								return true;
							} else {
								@Pc(1678) int local1678;
								@Pc(1692) int local1692;
								@Pc(1669) long local1669;
								@Pc(1674) long local1674;
								@Pc(1682) int local1682;
								if (Static276.aClass119_109 == Static277.aClass119_110) {
									local264 = Static237.aClass3_Sub7_Sub1_1.method2582() == 1;
									local268 = Static237.aClass3_Sub7_Sub1_1.method2620();
									local270 = local268;
									if (local264) {
										local270 = Static237.aClass3_Sub7_Sub1_1.method2620();
									}
									local1669 = Static237.aClass3_Sub7_Sub1_1.method2588();
									local1674 = Static237.aClass3_Sub7_Sub1_1.method2604();
									local1678 = Static237.aClass3_Sub7_Sub1_1.method2582();
									local1682 = Static237.aClass3_Sub7_Sub1_1.method2588();
									@Pc(1688) long local1688 = local1674 + (local1669 << 32);
									@Pc(1690) boolean local1690 = false;
									local1692 = 0;
									while (true) {
										if (local1692 >= 100) {
											if (local1678 <= 1 && Static2.method9(local270)) {
												local1690 = true;
											}
											break;
										}
										if (Static69.aLongArray3[local1692] == local1688) {
											local1690 = true;
											break;
										}
										local1692++;
									}
									if (!local1690 && Static391.anInt6727 == 0) {
										Static69.aLongArray3[Static67.anInt1722] = local1688;
										Static67.anInt1722 = (Static67.anInt1722 + 1) % 100;
										@Pc(1744) String local1744 = Static104.aClass262_1.method5748(local1682).method5180(Static237.aClass3_Sub7_Sub1_1);
										if (local1678 == 2) {
											Static416.method5338(local1744, 18, local1682, null, "<img=1>" + local270, "<img=1>" + local268, 0);
										} else if (local1678 == 1) {
											Static416.method5338(local1744, 18, local1682, null, "<img=0>" + local270, "<img=0>" + local268, 0);
										} else {
											Static416.method5338(local1744, 18, local1682, null, local270, local268, 0);
										}
									}
									Static277.aClass119_110 = null;
									return true;
								} else if (Static277.aClass119_110 == Static360.aClass119_129) {
									local221 = Static237.aClass3_Sub7_Sub1_1.method2593();
									local71 = Static237.aClass3_Sub7_Sub1_1.method2632();
									Static85.aClass49_1.method1315(local71, local221);
									Static277.aClass119_110 = null;
									return true;
								} else if (Static277.aClass119_110 == Static382.aClass119_29) {
									local1164 = Static237.aClass3_Sub7_Sub1_1.method2620();
									local268 = Static249.method3737(Static337.method4506(Static237.aClass3_Sub7_Sub1_1));
									Static301.method1894(0, 6, local268, local1164, local1164);
									Static277.aClass119_110 = null;
									return true;
								} else if (Static80.aClass119_36 == Static277.aClass119_110) {
									Static311.anInt5499 = Static237.aClass3_Sub7_Sub1_1.method2582();
									Static277.aClass119_110 = null;
									return true;
								} else if (Static277.aClass119_110 == Static289.aClass119_111) {
									local221 = Static237.aClass3_Sub7_Sub1_1.method2582();
									local71 = local221 >> 5;
									local236 = local221 & 0x1F;
									if (local236 == 0) {
										Static331.aClass196Array41[local71] = null;
										Static277.aClass119_110 = null;
										return true;
									}
									@Pc(1894) Class196 local1894 = new Class196();
									local1894.anInt5507 = local236;
									local1894.anInt5502 = Static237.aClass3_Sub7_Sub1_1.method2582();
									if (local1894.anInt5502 >= 0 && Static37.aClass8Array28.length > local1894.anInt5502) {
										if (local1894.anInt5507 == 1 || local1894.anInt5507 == 10) {
											local1894.anInt5501 = Static237.aClass3_Sub7_Sub1_1.method2588();
											Static237.aClass3_Sub7_Sub1_1.anInt3235 += 6;
										} else if (local1894.anInt5507 >= 2 && local1894.anInt5507 <= 6) {
											if (local1894.anInt5507 == 2) {
												local1894.anInt5508 = 64;
												local1894.anInt5500 = 64;
											}
											if (local1894.anInt5507 == 3) {
												local1894.anInt5500 = 0;
												local1894.anInt5508 = 64;
											}
											if (local1894.anInt5507 == 4) {
												local1894.anInt5508 = 64;
												local1894.anInt5500 = 128;
											}
											if (local1894.anInt5507 == 5) {
												local1894.anInt5500 = 64;
												local1894.anInt5508 = 0;
											}
											if (local1894.anInt5507 == 6) {
												local1894.anInt5508 = 128;
												local1894.anInt5500 = 64;
											}
											local1894.anInt5507 = 2;
											local1894.anInt5504 = Static237.aClass3_Sub7_Sub1_1.method2582();
											local1894.anInt5500 += Static237.aClass3_Sub7_Sub1_1.method2588() - Static223.anInt7618 << 7;
											local1894.anInt5508 += Static237.aClass3_Sub7_Sub1_1.method2588() - Static57.anInt5085 << 7;
											local1894.anInt5506 = Static237.aClass3_Sub7_Sub1_1.method2582();
											local1894.anInt5503 = Static237.aClass3_Sub7_Sub1_1.method2588();
										}
										local1894.anInt5510 = Static237.aClass3_Sub7_Sub1_1.method2588();
										if (local1894.anInt5510 == 65535) {
											local1894.anInt5510 = -1;
										}
										Static331.aClass196Array41[local71] = local1894;
									}
									Static277.aClass119_110 = null;
									return true;
								} else {
									@Pc(2112) int local2112;
									@Pc(2208) int local2208;
									@Pc(2174) Class173 local2174;
									@Pc(2076) boolean local2076;
									if (Static277.aClass119_110 == Static97.aClass119_42) {
										local1164 = Static237.aClass3_Sub7_Sub1_1.method2620();
										local2076 = Static237.aClass3_Sub7_Sub1_1.method2582() == 1;
										if (local2076) {
											local268 = Static237.aClass3_Sub7_Sub1_1.method2620();
										} else {
											local268 = local1164;
										}
										local240 = Static237.aClass3_Sub7_Sub1_1.method2588();
										@Pc(2093) byte local2093 = Static237.aClass3_Sub7_Sub1_1.method2612();
										local904 = false;
										if (local2093 == -128) {
											local904 = true;
										}
										if (local904) {
											if (Static85.anInt2098 == 0) {
												Static277.aClass119_110 = null;
												return true;
											}
											for (local2112 = 0; Static85.anInt2098 > local2112 && (!Static92.aClass173Array1[local2112].aString50.equals(local268) || Static92.aClass173Array1[local2112].anInt5180 != local240); local2112++) {
											}
											if (local2112 < Static85.anInt2098) {
												while (Static85.anInt2098 - 1 > local2112) {
													Static92.aClass173Array1[local2112] = Static92.aClass173Array1[local2112 + 1];
													local2112++;
												}
												Static85.anInt2098--;
												Static92.aClass173Array1[Static85.anInt2098] = null;
											}
										} else {
											local927 = Static237.aClass3_Sub7_Sub1_1.method2620();
											local2174 = new Class173();
											local2174.aString50 = local268;
											local2174.aString48 = local1164;
											local2174.aString47 = Static40.method777(local2174.aString50);
											local2174.aByte92 = local2093;
											local2174.aString49 = local927;
											local2174.anInt5180 = local240;
											for (local1682 = Static85.anInt2098 - 1; local1682 >= 0; local1682--) {
												local2208 = Static92.aClass173Array1[local1682].aString47.compareTo(local2174.aString47);
												if (local2208 == 0) {
													Static92.aClass173Array1[local1682].anInt5180 = local240;
													Static92.aClass173Array1[local1682].aByte92 = local2093;
													Static92.aClass173Array1[local1682].aString49 = local927;
													if (local268.equals(Static379.aClass7_Sub2_Sub3_Sub2_2.aString36)) {
														Static64.aByte34 = local2093;
													}
													Static160.anInt3269 = Static301.anInt2459;
													Static277.aClass119_110 = null;
													return true;
												}
												if (local2208 < 0) {
													break;
												}
											}
											if (Static92.aClass173Array1.length <= Static85.anInt2098) {
												Static277.aClass119_110 = null;
												return true;
											}
											for (local2208 = Static85.anInt2098 - 1; local2208 > local1682; local2208--) {
												Static92.aClass173Array1[local2208 + 1] = Static92.aClass173Array1[local2208];
											}
											if (Static85.anInt2098 == 0) {
												Static92.aClass173Array1 = new Class173[100];
											}
											Static92.aClass173Array1[local1682 + 1] = local2174;
											Static85.anInt2098++;
											if (local268.equals(Static379.aClass7_Sub2_Sub3_Sub2_2.aString36)) {
												Static64.aByte34 = local2093;
											}
										}
										Static160.anInt3269 = Static301.anInt2459;
										Static277.aClass119_110 = null;
										return true;
									}
									@Pc(2557) String local2557;
									@Pc(2339) boolean local2339;
									@Pc(2629) boolean local2629;
									if (Static277.aClass119_110 == Static175.aClass119_152) {
										while (Static237.aClass3_Sub7_Sub1_1.anInt3235 < Static139.anInt7585) {
											local264 = Static237.aClass3_Sub7_Sub1_1.method2582() == 1;
											local268 = Static237.aClass3_Sub7_Sub1_1.method2620();
											local270 = Static237.aClass3_Sub7_Sub1_1.method2620();
											local240 = Static237.aClass3_Sub7_Sub1_1.method2588();
											local475 = Static237.aClass3_Sub7_Sub1_1.method2582();
											local315 = "";
											local2339 = false;
											if (local240 > 0) {
												local315 = Static237.aClass3_Sub7_Sub1_1.method2620();
												local2339 = Static237.aClass3_Sub7_Sub1_1.method2582() == 1;
											}
											for (local1678 = 0; local1678 < Static202.anInt3950; local1678++) {
												if (local264) {
													if (local270.equals(Static388.aStringArray45[local1678])) {
														Static388.aStringArray45[local1678] = local268;
														local268 = null;
														Static93.aStringArray19[local1678] = local270;
														break;
													}
												} else if (local268.equals(Static388.aStringArray45[local1678])) {
													if (Static102.anIntArray137[local1678] != local240) {
														Static102.anIntArray137[local1678] = local240;
														if (local240 > 0) {
															Static301.method1894(0, 5, local268 + Static351.aClass189_193.method4262(Static53.anInt1454), "", "");
														}
														if (local240 == 0) {
															Static301.method1894(0, 5, local268 + Static283.aClass189_165.method4262(Static53.anInt1454), "", "");
														}
													}
													Static93.aStringArray19[local1678] = local270;
													Static20.aStringArray6[local1678] = local315;
													Static252.anIntArray306[local1678] = local475;
													Static272.aBooleanArray19[local1678] = local2339;
													local268 = null;
													break;
												}
											}
											if (local268 != null && Static202.anInt3950 < 200) {
												Static388.aStringArray45[Static202.anInt3950] = local268;
												Static93.aStringArray19[Static202.anInt3950] = local270;
												Static102.anIntArray137[Static202.anInt3950] = local240;
												Static20.aStringArray6[Static202.anInt3950] = local315;
												Static252.anIntArray306[Static202.anInt3950] = local475;
												Static272.aBooleanArray19[Static202.anInt3950] = local2339;
												Static202.anInt3950++;
											}
										}
										Static105.anInt2381 = 2;
										Static161.anInt3318 = Static301.anInt2459;
										local71 = Static202.anInt3950;
										while (local71 > 0) {
											local71--;
											local264 = true;
											for (local236 = 0; local236 < local71; local236++) {
												if (Static101.anInt6819 != Static102.anIntArray137[local236] && Static101.anInt6819 == Static102.anIntArray137[local236 + 1] || Static102.anIntArray137[local236] == 0 && Static102.anIntArray137[local236 + 1] != 0) {
													local240 = Static102.anIntArray137[local236];
													Static102.anIntArray137[local236] = Static102.anIntArray137[local236 + 1];
													Static102.anIntArray137[local236 + 1] = local240;
													local2557 = Static20.aStringArray6[local236];
													Static20.aStringArray6[local236] = Static20.aStringArray6[local236 + 1];
													Static20.aStringArray6[local236 + 1] = local2557;
													local315 = Static388.aStringArray45[local236];
													Static388.aStringArray45[local236] = Static388.aStringArray45[local236 + 1];
													Static388.aStringArray45[local236 + 1] = local315;
													local927 = Static93.aStringArray19[local236];
													Static93.aStringArray19[local236] = Static93.aStringArray19[local236 + 1];
													Static93.aStringArray19[local236 + 1] = local927;
													local1678 = Static252.anIntArray306[local236];
													Static252.anIntArray306[local236] = Static252.anIntArray306[local236 + 1];
													Static252.anIntArray306[local236 + 1] = local1678;
													local2629 = Static272.aBooleanArray19[local236];
													Static272.aBooleanArray19[local236] = Static272.aBooleanArray19[local236 + 1];
													local264 = false;
													Static272.aBooleanArray19[local236 + 1] = local2629;
												}
											}
											if (local264) {
												break;
											}
										}
										Static277.aClass119_110 = null;
										return true;
									} else if (Static244.aClass119_100 == Static277.aClass119_110) {
										local221 = Static237.aClass3_Sub7_Sub1_1.method2588();
										local268 = Static237.aClass3_Sub7_Sub1_1.method2620();
										local236 = Static237.aClass3_Sub7_Sub1_1.method2589();
										if (Static315.method4354(local221)) {
											Static384.method4995(local268, local236);
										}
										Static277.aClass119_110 = null;
										return true;
									} else if (Static109.aClass119_47 == Static277.aClass119_110) {
										Static193.method3083(Static139.anInt7585, Static237.aClass3_Sub7_Sub1_1);
										Static277.aClass119_110 = null;
										return true;
									} else if (Static376.aClass119_136 == Static277.aClass119_110) {
										Static53.anInt1459 = Static237.aClass3_Sub7_Sub1_1.method2639();
										Static1.anInt23 = Static237.aClass3_Sub7_Sub1_1.method2639();
										Static277.aClass119_110 = null;
										return true;
									} else if (Static277.aClass119_110 == Static41.aClass119_18) {
										Static413.method5297();
										Static277.aClass119_110 = null;
										return false;
									} else if (Static250.aClass119_103 == Static277.aClass119_110) {
										local221 = Static237.aClass3_Sub7_Sub1_1.method2588();
										local71 = Static237.aClass3_Sub7_Sub1_1.method2596();
										if (Static315.method4354(local221)) {
											Static437.method5728(0, local71, 5, Static319.anInt1936);
										}
										Static277.aClass119_110 = null;
										return true;
									} else if (Static277.aClass119_110 == Static217.aClass119_91) {
										Static242.method3660(Static19.aClass95_1);
										Static277.aClass119_110 = null;
										return true;
									} else if (Static423.aClass119_150 == Static277.aClass119_110) {
										local221 = Static237.aClass3_Sub7_Sub1_1.method2635();
										local71 = Static237.aClass3_Sub7_Sub1_1.method2598();
										local236 = Static237.aClass3_Sub7_Sub1_1.method2637();
										@Pc(2781) Class7_Sub2_Sub3_Sub1 local2781 = Static139.aClass7_Sub2_Sub3_Sub1Array11[local71];
										if (local2781 != null) {
											Static293.method4127(local2781, local221, local236);
										}
										Static277.aClass119_110 = null;
										return true;
									} else if (Static29.aClass119_130 == Static277.aClass119_110) {
										local221 = Static237.aClass3_Sub7_Sub1_1.method2588();
										local71 = Static237.aClass3_Sub7_Sub1_1.method2582();
										local2076 = (local71 & 0x1) == 1;
										while (Static237.aClass3_Sub7_Sub1_1.anInt3235 < Static139.anInt7585) {
											local240 = Static237.aClass3_Sub7_Sub1_1.method2638();
											local475 = Static237.aClass3_Sub7_Sub1_1.method2588();
											local1023 = 0;
											if (local475 != 0) {
												local1023 = Static237.aClass3_Sub7_Sub1_1.method2582();
												if (local1023 == 255) {
													local1023 = Static237.aClass3_Sub7_Sub1_1.method2589();
												}
											}
											Static431.method5279(local221, local240, local475 - 1, local2076, local1023);
										}
										Static27.anIntArray139[Static70.anInt1787++ & 0x1F] = local221;
										Static277.aClass119_110 = null;
										return true;
									} else if (Static230.aClass119_94 == Static277.aClass119_110) {
										Static86.aClass77_2 = Static36.method726(Static237.aClass3_Sub7_Sub1_1.method2582());
										Static277.aClass119_110 = null;
										return true;
									} else if (Static73.aClass119_26 == Static277.aClass119_110) {
										Static65.anInt1686 = Static237.aClass3_Sub7_Sub1_1.method2584();
										Static440.anInt7425 = Static237.aClass3_Sub7_Sub1_1.method2630() << 3;
										Static59.anInt3263 = Static237.aClass3_Sub7_Sub1_1.method2612() << 3;
										for (@Pc(2904) Class3_Sub39 local2904 = (Class3_Sub39) Static441.aClass11_43.method313(); local2904 != null; local2904 = (Class3_Sub39) Static441.aClass11_43.method316()) {
											local71 = (int) (local2904.aLong234 & 0x3FFFL);
											local236 = (int) (local2904.aLong234 >> 14 & 0x3FFFL);
											local240 = (int) (local2904.aLong234 >> 28 & 0x3L);
											if (Static65.anInt1686 == local240 && Static59.anInt3263 <= local71 && Static59.anInt3263 + 8 > local71 && local236 >= Static440.anInt7425 && local236 < Static440.anInt7425 + 8) {
												local2904.method5977();
												Static80.method1553(local236, Static65.anInt1686, local71);
											}
										}
										for (@Pc(2986) Class3_Sub17 local2986 = (Class3_Sub17) Static301.aClass243_16.method5208(); local2986 != null; local2986 = (Class3_Sub17) Static301.aClass243_16.method5203()) {
											if (Static59.anInt3263 <= local2986.anInt2917 && Static59.anInt3263 + 8 > local2986.anInt2917 && Static440.anInt7425 <= local2986.anInt2910 && local2986.anInt2910 < Static440.anInt7425 + 8 && local2986.anInt2915 == Static65.anInt1686) {
												local2986.anInt2911 = 0;
											}
										}
										Static277.aClass119_110 = null;
										return true;
									} else if (Static277.aClass119_110 == Static168.aClass119_72) {
										local221 = Static237.aClass3_Sub7_Sub1_1.method2584();
										local71 = Static237.aClass3_Sub7_Sub1_1.method2598();
										Static85.aClass49_1.method1320(local71, local221);
										Static277.aClass119_110 = null;
										return true;
									} else if (Static151.aClass119_65 == Static277.aClass119_110) {
										local221 = Static237.aClass3_Sub7_Sub1_1.method2593();
										local71 = Static237.aClass3_Sub7_Sub1_1.method2589();
										local236 = Static237.aClass3_Sub7_Sub1_1.method2598();
										if (Static315.method4354(local236)) {
											Static196.method3115(local221, local71);
										}
										Static277.aClass119_110 = null;
										return true;
									} else if (Static407.aClass119_145 == Static277.aClass119_110) {
										local221 = Static237.aClass3_Sub7_Sub1_1.method2588();
										local71 = Static237.aClass3_Sub7_Sub1_1.method2639();
										if (Static315.method4354(local221)) {
											Static32.anInt941 = local71;
										}
										Static277.aClass119_110 = null;
										return true;
									} else if (Static146.aClass119_62 == Static277.aClass119_110) {
										Static242.method3660(Static353.aClass95_13);
										Static277.aClass119_110 = null;
										return true;
									} else if (Static277.aClass119_110 == Static158.aClass119_68) {
										Static242.method3660(Static141.aClass95_7);
										Static277.aClass119_110 = null;
										return true;
									} else if (Static36.aClass119_17 == Static277.aClass119_110) {
										local221 = Static237.aClass3_Sub7_Sub1_1.method2588();
										local71 = Static237.aClass3_Sub7_Sub1_1.method2588();
										local236 = Static237.aClass3_Sub7_Sub1_1.method2588();
										local240 = Static237.aClass3_Sub7_Sub1_1.method2588();
										if (Static315.method4354(local221) && Static178.aClass156ArrayArray2[local71] != null) {
											for (local475 = local236; local475 < local240; local475++) {
												local1023 = Static237.aClass3_Sub7_Sub1_1.method2604();
												if (Static178.aClass156ArrayArray2[local71].length > local475 && Static178.aClass156ArrayArray2[local71][local475] != null) {
													Static178.aClass156ArrayArray2[local71][local475].anInt4863 = local1023;
												}
											}
										}
										Static277.aClass119_110 = null;
										return true;
									} else if (Static181.aClass119_79 == Static277.aClass119_110) {
										local221 = Static237.aClass3_Sub7_Sub1_1.method2588();
										local71 = Static237.aClass3_Sub7_Sub1_1.method2589();
										local236 = Static237.aClass3_Sub7_Sub1_1.method2598();
										if (Static315.method4354(local236)) {
											Static409.method5281(local221, local71);
										}
										Static277.aClass119_110 = null;
										return true;
									} else if (Static349.aClass119_126 == Static277.aClass119_110) {
										Static356.method4744(Static139.anInt7585, Static66.aClass143_2, Static237.aClass3_Sub7_Sub1_1);
										Static277.aClass119_110 = null;
										return true;
									} else if (Static277.aClass119_110 == Static177.aClass119_77) {
										Static281.method5778();
										Static277.aClass119_110 = null;
										return false;
									} else if (Static277.aClass119_110 == Static207.aClass119_88) {
										Static85.aClass49_1.method1316();
										Static104.anInt2366 += 32;
										Static277.aClass119_110 = null;
										return true;
									} else if (Static277.aClass119_110 == Static156.aClass119_67) {
										local221 = Static237.aClass3_Sub7_Sub1_1.method2582();
										if (Static237.aClass3_Sub7_Sub1_1.method2582() == 0) {
											Static364.aClass86Array1[local221] = new Class86();
										} else {
											Static237.aClass3_Sub7_Sub1_1.anInt3235--;
											Static364.aClass86Array1[local221] = new Class86(Static237.aClass3_Sub7_Sub1_1);
										}
										Static308.anInt5473 = Static301.anInt2459;
										Static277.aClass119_110 = null;
										return true;
									} else if (Static277.aClass119_110 == Static120.aClass119_53) {
										local221 = Static237.aClass3_Sub7_Sub1_1.method2598();
										local71 = Static237.aClass3_Sub7_Sub1_1.method2588();
										local236 = Static237.aClass3_Sub7_Sub1_1.method2593();
										if (Static315.method4354(local236)) {
											Static188.method3009(local221, local71);
										}
										Static277.aClass119_110 = null;
										return true;
									} else if (Static277.aClass119_110 == Static406.aClass119_143) {
										local221 = Static237.aClass3_Sub7_Sub1_1.method2639();
										local71 = Static237.aClass3_Sub7_Sub1_1.method2588();
										local2076 = (local221 & 0x1) == 1;
										Static159.method2571(local71, local2076);
										Static27.anIntArray139[Static70.anInt1787++ & 0x1F] = local71;
										Static277.aClass119_110 = null;
										return true;
									} else if (Static345.aClass119_153 == Static277.aClass119_110) {
										local221 = Static237.aClass3_Sub7_Sub1_1.method2588();
										local71 = Static237.aClass3_Sub7_Sub1_1.method2582();
										local2076 = (local71 & 0x1) == 1;
										Static418.method300(local221, local2076);
										local240 = Static237.aClass3_Sub7_Sub1_1.method2588();
										for (local475 = 0; local475 < local240; local475++) {
											local1023 = Static237.aClass3_Sub7_Sub1_1.method2588();
											local2112 = Static237.aClass3_Sub7_Sub1_1.method2582();
											if (local2112 == 255) {
												local2112 = Static237.aClass3_Sub7_Sub1_1.method2616();
											}
											Static431.method5279(local221, local475, local1023 - 1, local2076, local2112);
										}
										Static27.anIntArray139[Static70.anInt1787++ & 0x1F] = local221;
										Static277.aClass119_110 = null;
										return true;
									} else {
										@Pc(3472) long local3472;
										if (Static277.aClass119_110 == Static117.aClass119_51) {
											local264 = Static237.aClass3_Sub7_Sub1_1.method2582() == 1;
											local268 = Static237.aClass3_Sub7_Sub1_1.method2620();
											local270 = local268;
											if (local264) {
												local270 = Static237.aClass3_Sub7_Sub1_1.method2620();
											}
											local1669 = Static237.aClass3_Sub7_Sub1_1.method2610();
											local1674 = Static237.aClass3_Sub7_Sub1_1.method2588();
											local3472 = Static237.aClass3_Sub7_Sub1_1.method2604();
											local2208 = Static237.aClass3_Sub7_Sub1_1.method2582();
											@Pc(3482) long local3482 = local3472 + (local1674 << 32);
											@Pc(3484) boolean local3484 = false;
											@Pc(3486) int local3486 = 0;
											while (true) {
												if (local3486 >= 100) {
													if (local2208 <= 1) {
														if (Static388.aBoolean561 && !Static331.aBoolean651 || Static338.aBoolean492) {
															local3484 = true;
														} else if (Static2.method9(local270)) {
															local3484 = true;
														}
													}
													break;
												}
												if (local3482 == Static69.aLongArray3[local3486]) {
													local3484 = true;
													break;
												}
												local3486++;
											}
											if (!local3484 && Static391.anInt6727 == 0) {
												Static69.aLongArray3[Static67.anInt1722] = local3482;
												Static67.anInt1722 = (Static67.anInt1722 + 1) % 100;
												@Pc(3545) String local3545 = Static249.method3737(Static337.method4506(Static237.aClass3_Sub7_Sub1_1));
												if (local2208 == 2 || local2208 == 3) {
													Static416.method5338(local3545, 9, -1, Static295.method4137(local1669), "<img=1>" + local270, "<img=1>" + local268, 0);
												} else if (local2208 == 1) {
													Static416.method5338(local3545, 9, -1, Static295.method4137(local1669), "<img=0>" + local270, "<img=0>" + local268, 0);
												} else {
													Static416.method5338(local3545, 9, -1, Static295.method4137(local1669), local270, local268, 0);
												}
											}
											Static277.aClass119_110 = null;
											return true;
										} else if (Static277.aClass119_110 == Static127.aClass119_55) {
											local221 = Static237.aClass3_Sub7_Sub1_1.method2588();
											local268 = Static237.aClass3_Sub7_Sub1_1.method2620();
											@Pc(3638) Object[] local3638 = new Object[local268.length() + 1];
											for (local240 = local268.length() - 1; local240 >= 0; local240--) {
												if (local268.charAt(local240) == 's') {
													local3638[local240 + 1] = Static237.aClass3_Sub7_Sub1_1.method2620();
												} else {
													local3638[local240 + 1] = Integer.valueOf(Static237.aClass3_Sub7_Sub1_1.method2589());
												}
											}
											local3638[0] = Integer.valueOf(Static237.aClass3_Sub7_Sub1_1.method2589());
											if (Static315.method4354(local221)) {
												@Pc(3691) Class3_Sub31 local3691 = new Class3_Sub31();
												local3691.anObjectArray36 = local3638;
												Static285.method4059(local3691);
											}
											Static277.aClass119_110 = null;
											return true;
										} else if (Static277.aClass119_110 == Static445.aClass119_155) {
											local221 = Static237.aClass3_Sub7_Sub1_1.method2588();
											local71 = Static237.aClass3_Sub7_Sub1_1.method2582();
											local236 = Static237.aClass3_Sub7_Sub1_1.method2582();
											local240 = Static237.aClass3_Sub7_Sub1_1.method2588() << 0;
											local475 = Static237.aClass3_Sub7_Sub1_1.method2582();
											local1023 = Static237.aClass3_Sub7_Sub1_1.method2582();
											if (Static315.method4354(local221)) {
												Static44.method5694(local475, local1023, local71, local240, local236);
											}
											Static277.aClass119_110 = null;
											return true;
										} else if (Static367.aClass119_134 == Static277.aClass119_110) {
											local221 = Static237.aClass3_Sub7_Sub1_1.method2588();
											local71 = Static237.aClass3_Sub7_Sub1_1.method2582();
											local236 = Static237.aClass3_Sub7_Sub1_1.method2582();
											local240 = Static237.aClass3_Sub7_Sub1_1.method2582();
											local475 = Static237.aClass3_Sub7_Sub1_1.method2582();
											local1023 = Static237.aClass3_Sub7_Sub1_1.method2588();
											if (Static315.method4354(local221)) {
												Static384.aBooleanArray20[local71] = true;
												Static18.anIntArray220[local71] = local236;
												Static365.anIntArray398[local71] = local240;
												Static145.anIntArray395[local71] = local475;
												Static75.anIntArray109[local71] = local1023;
											}
											Static277.aClass119_110 = null;
											return true;
										} else if (Static277.aClass119_110 == Static115.aClass119_50) {
											Static440.anInt7425 = Static237.aClass3_Sub7_Sub1_1.method2630() << 3;
											Static65.anInt1686 = Static237.aClass3_Sub7_Sub1_1.method2582();
											Static59.anInt3263 = Static237.aClass3_Sub7_Sub1_1.method2619() << 3;
											while (Static237.aClass3_Sub7_Sub1_1.anInt3235 < Static139.anInt7585) {
												@Pc(3826) Class95 local3826 = Static368.method4826()[Static237.aClass3_Sub7_Sub1_1.method2582()];
												Static242.method3660(local3826);
											}
											Static277.aClass119_110 = null;
											return true;
										} else if (Static378.aClass119_137 == Static277.aClass119_110) {
											local221 = Static237.aClass3_Sub7_Sub1_1.method2588();
											local71 = Static237.aClass3_Sub7_Sub1_1.method2589();
											local236 = Static237.aClass3_Sub7_Sub1_1.method2598();
											local240 = Static237.aClass3_Sub7_Sub1_1.method2635();
											if (local240 == 65535) {
												local240 = -1;
											}
											local475 = Static237.aClass3_Sub7_Sub1_1.method2598();
											if (local475 == 65535) {
												local475 = -1;
											}
											if (Static315.method4354(local221)) {
												for (local1023 = local240; local1023 <= local475; local1023++) {
													local1282 = (long) local1023 + ((long) local71 << 32);
													local1288 = (Class3_Sub45) Static72.aClass11_11.method324(local1282);
													if (local1288 != null) {
														local1297 = new Class3_Sub45(local1288.anInt7660, local236);
														local1288.method5977();
													} else if (local1023 == -1) {
														local1297 = new Class3_Sub45(Static435.method5705(local71).aClass3_Sub45_2.anInt7660, local236);
													} else {
														local1297 = new Class3_Sub45(0, local236);
													}
													Static72.aClass11_11.method319(local1297, local1282);
												}
											}
											Static277.aClass119_110 = null;
											return true;
										} else if (Static363.aClass119_131 == Static277.aClass119_110) {
											local221 = Static237.aClass3_Sub7_Sub1_1.method2639();
											local71 = Static237.aClass3_Sub7_Sub1_1.method2635();
											local236 = Static237.aClass3_Sub7_Sub1_1.method2589();
											if (Static315.method4354(local71)) {
												Static102.method1793(local236, local221);
											}
											Static277.aClass119_110 = null;
											return true;
										} else if (Static277.aClass119_110 == Static323.aClass119_20) {
											@Pc(3977) byte local3977 = Static237.aClass3_Sub7_Sub1_1.method2609();
											local71 = Static237.aClass3_Sub7_Sub1_1.method2598();
											Static85.aClass49_1.method1315(local3977, local71);
											Static277.aClass119_110 = null;
											return true;
										} else if (Static265.aClass119_106 == Static277.aClass119_110) {
											local221 = Static237.aClass3_Sub7_Sub1_1.method2584();
											local71 = local221 >> 2;
											local236 = local221 & 0x3;
											local240 = Static196.anIntArray249[local71];
											local475 = Static237.aClass3_Sub7_Sub1_1.method2635();
											if (local475 == 65535) {
												local475 = -1;
											}
											local1023 = Static237.aClass3_Sub7_Sub1_1.method2596();
											local2112 = local1023 >> 28 & 0x3;
											local1678 = local1023 >> 14 & 0x3FFF;
											local1678 -= Static223.anInt7618;
											local1682 = local1023 & 0x3FFF;
											local1682 -= Static57.anInt5085;
											Static153.method2478(local1678, local2112, local240, local1682, local475, local71, local236);
											Static277.aClass119_110 = null;
											return true;
										} else if (Static277.aClass119_110 == Static169.aClass119_124) {
											Static160.anInt3269 = Static301.anInt2459;
											if (Static139.anInt7585 == 0) {
												Static453.aString68 = null;
												Static406.aString58 = null;
												Static85.anInt2098 = 0;
												Static277.aClass119_110 = null;
												Static92.aClass173Array1 = null;
												return true;
											}
											Static406.aString58 = Static237.aClass3_Sub7_Sub1_1.method2620();
											local264 = Static237.aClass3_Sub7_Sub1_1.method2582() == 1;
											if (local264) {
												Static237.aClass3_Sub7_Sub1_1.method2620();
											}
											@Pc(4106) long local4106 = Static237.aClass3_Sub7_Sub1_1.method2610();
											Static453.aString68 = Static413.method5302(local4106);
											Static110.aByte47 = Static237.aClass3_Sub7_Sub1_1.method2612();
											local240 = Static237.aClass3_Sub7_Sub1_1.method2582();
											if (local240 == 255) {
												Static277.aClass119_110 = null;
												return true;
											}
											Static85.anInt2098 = local240;
											@Pc(4132) Class173[] local4132 = new Class173[100];
											for (local1023 = 0; local1023 < Static85.anInt2098; local1023++) {
												local4132[local1023] = new Class173();
												local4132[local1023].aString48 = Static237.aClass3_Sub7_Sub1_1.method2620();
												local264 = Static237.aClass3_Sub7_Sub1_1.method2582() == 1;
												if (local264) {
													local4132[local1023].aString50 = Static237.aClass3_Sub7_Sub1_1.method2620();
												} else {
													local4132[local1023].aString50 = local4132[local1023].aString48;
												}
												local4132[local1023].aString47 = Static40.method777(local4132[local1023].aString50);
												local4132[local1023].anInt5180 = Static237.aClass3_Sub7_Sub1_1.method2588();
												local4132[local1023].aByte92 = Static237.aClass3_Sub7_Sub1_1.method2612();
												local4132[local1023].aString49 = Static237.aClass3_Sub7_Sub1_1.method2620();
												if (local4132[local1023].aString50.equals(Static379.aClass7_Sub2_Sub3_Sub2_2.aString36)) {
													Static64.aByte34 = local4132[local1023].aByte92;
												}
											}
											local1682 = Static85.anInt2098;
											while (local1682 > 0) {
												local2339 = true;
												local1682--;
												for (local2208 = 0; local2208 < local1682; local2208++) {
													if (local4132[local2208].aString47.compareTo(local4132[local2208 + 1].aString47) > 0) {
														local2174 = local4132[local2208];
														local4132[local2208] = local4132[local2208 + 1];
														local2339 = false;
														local4132[local2208 + 1] = local2174;
													}
												}
												if (local2339) {
													break;
												}
											}
											Static92.aClass173Array1 = local4132;
											Static277.aClass119_110 = null;
											return true;
										} else if (Static2.aClass119_1 == Static277.aClass119_110) {
											local221 = Static237.aClass3_Sub7_Sub1_1.method2588();
											local71 = Static237.aClass3_Sub7_Sub1_1.method2588();
											if (local71 == 65535) {
												local71 = -1;
											}
											local236 = Static237.aClass3_Sub7_Sub1_1.method2596();
											if (Static315.method4354(local221)) {
												Static437.method5728(-1, local236, 2, local71);
											}
											Static277.aClass119_110 = null;
											return true;
										} else if (Static277.aClass119_110 == Static140.aClass119_60) {
											Static242.method3660(Static396.aClass95_14);
											Static277.aClass119_110 = null;
											return true;
										} else if (Static277.aClass119_110 == Static84.aClass119_37) {
											local221 = Static237.aClass3_Sub7_Sub1_1.method2639();
											local71 = Static237.aClass3_Sub7_Sub1_1.method2589();
											local236 = Static237.aClass3_Sub7_Sub1_1.method2639();
											Static281.anIntArray520[local221] = local71;
											Static255.anIntArray320[local221] = local236;
											Static355.anIntArray392[local221] = 1;
											local240 = Static164.anIntArray216[local221] - 1;
											for (local475 = 0; local475 < local240; local475++) {
												if (local71 >= Class7_Sub4_Sub2.anIntArray205[local475]) {
													Static355.anIntArray392[local221] = local475 + 2;
												}
											}
											Static235.anIntArray295[Static432.anInt7225++ & 0x1F] = local221;
											Static277.aClass119_110 = null;
											return true;
										} else {
											@Pc(4416) String local4416;
											if (Static277.aClass119_110 == Static62.aClass119_21) {
												local221 = Static237.aClass3_Sub7_Sub1_1.method2638();
												local71 = Static237.aClass3_Sub7_Sub1_1.method2589();
												local236 = Static237.aClass3_Sub7_Sub1_1.method2582();
												local4416 = "";
												local2557 = local4416;
												if ((local236 & 0x1) != 0) {
													local4416 = Static237.aClass3_Sub7_Sub1_1.method2620();
													if ((local236 & 0x2) == 0) {
														local2557 = local4416;
													} else {
														local2557 = Static237.aClass3_Sub7_Sub1_1.method2620();
													}
												}
												local315 = Static237.aClass3_Sub7_Sub1_1.method2620();
												if (local221 == 99) {
													Static231.method3481(local315);
												} else if (local2557.equals("") || !Static2.method9(local2557)) {
													Static301.method1894(local71, local221, local315, local4416, local2557);
												} else {
													Static277.aClass119_110 = null;
													return true;
												}
												Static277.aClass119_110 = null;
												return true;
											} else if (Static199.aClass119_86 == Static277.aClass119_110) {
												Static415.anInt6805 = Static237.aClass3_Sub7_Sub1_1.method2582();
												for (local221 = 0; local221 < Static415.anInt6805; local221++) {
													Static82.aStringArray32[local221] = Static237.aClass3_Sub7_Sub1_1.method2620();
													Static67.aStringArray10[local221] = Static237.aClass3_Sub7_Sub1_1.method2620();
													if (Static67.aStringArray10[local221].equals("")) {
														Static67.aStringArray10[local221] = Static82.aStringArray32[local221];
													}
													Static135.aStringArray29[local221] = Static237.aClass3_Sub7_Sub1_1.method2620();
													Static44.aStringArray51[local221] = Static237.aClass3_Sub7_Sub1_1.method2620();
													if (Static44.aStringArray51[local221].equals("")) {
														Static44.aStringArray51[local221] = Static135.aStringArray29[local221];
													}
													Static217.aBooleanArray18[local221] = false;
												}
												Static277.aClass119_110 = null;
												Static161.anInt3318 = Static301.anInt2459;
												return true;
											} else if (Static277.aClass119_110 == Static34.aClass119_15) {
												Static242.method3660(Static444.aClass95_16);
												Static277.aClass119_110 = null;
												return true;
											} else if (Static2.aClass119_2 == Static277.aClass119_110) {
												Static242.method3660(Static43.aClass95_3);
												Static277.aClass119_110 = null;
												return true;
											} else {
												@Pc(4623) int local4623;
												if (Static108.aClass119_46 == Static277.aClass119_110) {
													local264 = Static237.aClass3_Sub7_Sub1_1.method2582() == 1;
													local268 = Static237.aClass3_Sub7_Sub1_1.method2620();
													local270 = local268;
													if (local264) {
														local270 = Static237.aClass3_Sub7_Sub1_1.method2620();
													}
													local1669 = Static237.aClass3_Sub7_Sub1_1.method2610();
													local1674 = Static237.aClass3_Sub7_Sub1_1.method2588();
													local3472 = Static237.aClass3_Sub7_Sub1_1.method2604();
													local2208 = Static237.aClass3_Sub7_Sub1_1.method2582();
													local4623 = Static237.aClass3_Sub7_Sub1_1.method2588();
													@Pc(4629) long local4629 = local3472 + (local1674 << 32);
													@Pc(4631) boolean local4631 = false;
													@Pc(4633) int local4633 = 0;
													while (true) {
														if (local4633 >= 100) {
															if (local2208 <= 1 && Static2.method9(local270)) {
																local4631 = true;
															}
															break;
														}
														if (local4629 == Static69.aLongArray3[local4633]) {
															local4631 = true;
															break;
														}
														local4633++;
													}
													if (!local4631 && Static391.anInt6727 == 0) {
														Static69.aLongArray3[Static67.anInt1722] = local4629;
														Static67.anInt1722 = (Static67.anInt1722 + 1) % 100;
														@Pc(4684) String local4684 = Static104.aClass262_1.method5748(local4623).method5180(Static237.aClass3_Sub7_Sub1_1);
														if (local2208 == 2) {
															Static416.method5338(local4684, 20, local4623, Static295.method4137(local1669), "<img=1>" + local270, "<img=1>" + local268, 0);
														} else if (local2208 == 1) {
															Static416.method5338(local4684, 20, local4623, Static295.method4137(local1669), "<img=0>" + local270, "<img=0>" + local268, 0);
														} else {
															Static416.method5338(local4684, 20, local4623, Static295.method4137(local1669), local270, local268, 0);
														}
													}
													Static277.aClass119_110 = null;
													return true;
												} else if (Static277.aClass119_110 == Static370.aClass119_135) {
													Static242.method3660(Static68.aClass95_4);
													Static277.aClass119_110 = null;
													return true;
												} else {
													@Pc(5444) int local5444;
													if (Static416.aClass119_148 == Static277.aClass119_110) {
														local221 = Static237.aClass3_Sub7_Sub1_1.method2584();
														local71 = Static237.aClass3_Sub7_Sub1_1.method2598();
														local236 = Static237.aClass3_Sub7_Sub1_1.method2635();
														local240 = Static237.aClass3_Sub7_Sub1_1.method2589();
														local475 = Static237.aClass3_Sub7_Sub1_1.method2598();
														local904 = (local221 & 0x80) != 0;
														if (local240 >> 30 == 0) {
															@Pc(4871) Class128 local4871;
															@Pc(4844) Class13 local4844;
															@Pc(4897) Class128 local4897;
															@Pc(4849) Class13 local4849;
															@Pc(4865) Class128 local4865;
															if (local240 >> 29 != 0) {
																local2112 = local240 & 0xFFFF;
																@Pc(4812) Class7_Sub2_Sub3_Sub1 local4812 = Static139.aClass7_Sub2_Sub3_Sub1Array11[local2112];
																if (local4812 != null) {
																	if (local475 == 65535) {
																		local475 = -1;
																	}
																	local2629 = true;
																	local2208 = local904 ? local4812.anInt4349 : local4812.anInt4345;
																	if (local475 != -1 && local2208 != -1) {
																		if (local475 == local2208) {
																			local4844 = Static96.aClass41_2.method1134(local475);
																			if (local4844.aBoolean32 && local4844.anInt466 != -1) {
																				local4897 = Static301.aClass170_3.method3936(local4844.anInt466);
																				local1692 = local4897.anInt3973;
																				if (local1692 == 0 || local1692 == 2) {
																					local2629 = false;
																				} else if (local1692 == 1) {
																					local2629 = true;
																				}
																			}
																		} else {
																			local4844 = Static96.aClass41_2.method1134(local475);
																			local4849 = Static96.aClass41_2.method1134(local2208);
																			if (local4844.anInt466 != -1 && local4849.anInt466 != -1) {
																				local4865 = Static301.aClass170_3.method3936(local4844.anInt466);
																				local4871 = Static301.aClass170_3.method3936(local4849.anInt466);
																				if (local4871.anInt3977 > local4865.anInt3977) {
																					local2629 = false;
																				}
																			}
																		}
																	}
																	if (local2629) {
																		if (local904) {
																			local4812.anInt4341 = local221 & 0x7;
																			local4812.anInt4349 = local475;
																			local4812.anInt4368 = 0;
																			local4812.anInt4329 = 1;
																			local4812.anInt4399 = local236 + Static253.anInt4787;
																			local4812.anInt4360 = local71;
																			local4812.anInt4346 = 0;
																			if (Static253.anInt4787 < local4812.anInt4399) {
																				local4812.anInt4346 = -1;
																			}
																			if (local4812.anInt4349 != -1 && local4812.anInt4399 == Static253.anInt4787) {
																				local4623 = Static96.aClass41_2.method1134(local4812.anInt4349).anInt466;
																				if (local4623 != -1) {
																					local4897 = Static301.aClass170_3.method3936(local4623);
																					if (local4897 != null && local4897.anIntArray252 != null) {
																						Static135.method2140(0, local4897, local4812.anInt4321, false, local4812.anInt4318, local4812.aByte77);
																					}
																				}
																			}
																		} else {
																			local4812.anInt4342 = 0;
																			local4812.anInt4326 = local221 & 0x7;
																			local4812.anInt4400 = local236 + Static253.anInt4787;
																			local4812.anInt4380 = 0;
																			local4812.anInt4345 = local475;
																			local4812.anInt4390 = 1;
																			local4812.anInt4351 = local71;
																			if (local4812.anInt4400 > Static253.anInt4787) {
																				local4812.anInt4380 = -1;
																			}
																			if (local4812.anInt4345 != -1 && Static253.anInt4787 == local4812.anInt4400) {
																				local4623 = Static96.aClass41_2.method1134(local4812.anInt4345).anInt466;
																				if (local4623 != -1) {
																					local4897 = Static301.aClass170_3.method3936(local4623);
																					if (local4897 != null && local4897.anIntArray252 != null) {
																						Static135.method2140(0, local4897, local4812.anInt4321, false, local4812.anInt4318, local4812.aByte77);
																					}
																				}
																			}
																		}
																	}
																}
															} else if (local240 >> 28 != 0) {
																local2112 = local240 & 0xFFFF;
																@Pc(5094) Class7_Sub2_Sub3_Sub2 local5094;
																if (Static319.anInt1936 == local2112) {
																	local5094 = Static379.aClass7_Sub2_Sub3_Sub2_2;
																} else {
																	local5094 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local2112];
																}
																if (local5094 != null) {
																	if (local475 == 65535) {
																		local475 = -1;
																	}
																	local2629 = true;
																	local2208 = local904 ? local5094.anInt4349 : local5094.anInt4345;
																	if (local475 != -1 && local2208 != -1) {
																		if (local475 == local2208) {
																			local4844 = Static96.aClass41_2.method1134(local475);
																			if (local4844.aBoolean32 && local4844.anInt466 != -1) {
																				local4897 = Static301.aClass170_3.method3936(local4844.anInt466);
																				local1692 = local4897.anInt3973;
																				if (local1692 == 0 || local1692 == 2) {
																					local2629 = false;
																				} else if (local1692 == 1) {
																					local2629 = true;
																				}
																			}
																		} else {
																			local4844 = Static96.aClass41_2.method1134(local475);
																			local4849 = Static96.aClass41_2.method1134(local2208);
																			if (local4844.anInt466 != -1 && local4849.anInt466 != -1) {
																				local4865 = Static301.aClass170_3.method3936(local4844.anInt466);
																				local4871 = Static301.aClass170_3.method3936(local4849.anInt466);
																				if (local4865.anInt3977 < local4871.anInt3977) {
																					local2629 = false;
																				}
																			}
																		}
																	}
																	if (local2629) {
																		if (local904) {
																			local5094.anInt4341 = local221 & 0x7;
																			local5094.anInt4346 = 0;
																			local5094.anInt4399 = Static253.anInt4787 + local236;
																			local5094.anInt4329 = 1;
																			local5094.anInt4349 = local475;
																			local5094.anInt4360 = local71;
																			local5094.anInt4368 = 0;
																			if (local5094.anInt4349 == 65535) {
																				local5094.anInt4349 = -1;
																			}
																			if (local5094.anInt4399 > Static253.anInt4787) {
																				local5094.anInt4346 = -1;
																			}
																			if (local5094.anInt4349 != -1 && local5094.anInt4399 == Static253.anInt4787) {
																				local4623 = Static96.aClass41_2.method1134(local5094.anInt4349).anInt466;
																				if (local4623 != -1) {
																					local4897 = Static301.aClass170_3.method3936(local4623);
																					if (local4897 != null && local4897.anIntArray252 != null) {
																						Static135.method2140(0, local4897, local5094.anInt4321, Static379.aClass7_Sub2_Sub3_Sub2_2 == local5094, local5094.anInt4318, local5094.aByte77);
																					}
																				}
																			}
																		} else {
																			local5094.anInt4380 = 0;
																			local5094.anInt4400 = Static253.anInt4787 + local236;
																			local5094.anInt4326 = local221 & 0x7;
																			local5094.anInt4390 = 1;
																			local5094.anInt4351 = local71;
																			local5094.anInt4342 = 0;
																			local5094.anInt4345 = local475;
																			if (local5094.anInt4345 == 65535) {
																				local5094.anInt4345 = -1;
																			}
																			if (Static253.anInt4787 < local5094.anInt4400) {
																				local5094.anInt4380 = -1;
																			}
																			if (local5094.anInt4345 != -1 && Static253.anInt4787 == local5094.anInt4400) {
																				local4623 = Static96.aClass41_2.method1134(local5094.anInt4345).anInt466;
																				if (local4623 != -1) {
																					local4897 = Static301.aClass170_3.method3936(local4623);
																					if (local4897 != null && local4897.anIntArray252 != null) {
																						Static135.method2140(0, local4897, local5094.anInt4321, Static379.aClass7_Sub2_Sub3_Sub2_2 == local5094, local5094.anInt4318, local5094.aByte77);
																					}
																				}
																			}
																		}
																	}
																}
															}
														} else {
															local2112 = local240 >> 28 & 0x3;
															local1678 = (local240 >> 14 & 0x3FFF) - Static223.anInt7618;
															local1682 = (local240 & 0x3FFF) - Static57.anInt5085;
															if (local1678 >= 0 && local1682 >= 0 && Static40.anInt1089 > local1678 && Static44.anInt7276 > local1682) {
																local2208 = local1678 * 128 + 64;
																local4623 = local1682 * 128 + 64;
																local5444 = local2112;
																if (local2112 < 3 && Static309.method4307(local1678, local1682)) {
																	local5444 = local2112 + 1;
																}
																@Pc(5476) Class7_Sub2_Sub5 local5476 = new Class7_Sub2_Sub5(local475, 0, Static253.anInt4787, local2112, local5444, local2208, Static231.method3482(local2112, local2208, local4623) - local71, local4623, local1678, local1678, local1682, local1682, local221);
																Static365.aClass243_38.method5198(new Class3_Sub4_Sub11(local5476));
															}
														}
														Static277.aClass119_110 = null;
														return true;
													} else if (Static79.aClass119_120 == Static277.aClass119_110) {
														Static242.method3660(Static314.aClass95_12);
														Static277.aClass119_110 = null;
														return true;
													} else if (Static313.aClass119_116 == Static277.aClass119_110) {
														local221 = Static237.aClass3_Sub7_Sub1_1.method2582();
														@Pc(5513) boolean local5513 = (local221 & 0x1) == 1;
														local270 = Static237.aClass3_Sub7_Sub1_1.method2620();
														local4416 = Static237.aClass3_Sub7_Sub1_1.method2620();
														if (local4416.equals("")) {
															local4416 = local270;
														}
														local2557 = Static237.aClass3_Sub7_Sub1_1.method2620();
														local315 = Static237.aClass3_Sub7_Sub1_1.method2620();
														if (local315.equals("")) {
															local315 = local2557;
														}
														if (local5513) {
															for (local2112 = 0; local2112 < Static415.anInt6805; local2112++) {
																if (Static67.aStringArray10[local2112].equals(local315)) {
																	Static82.aStringArray32[local2112] = local270;
																	Static67.aStringArray10[local2112] = local4416;
																	Static135.aStringArray29[local2112] = local2557;
																	Static44.aStringArray51[local2112] = local315;
																	break;
																}
															}
														} else {
															Static82.aStringArray32[Static415.anInt6805] = local270;
															Static67.aStringArray10[Static415.anInt6805] = local4416;
															Static135.aStringArray29[Static415.anInt6805] = local2557;
															Static44.aStringArray51[Static415.anInt6805] = local315;
															Static217.aBooleanArray18[Static415.anInt6805] = (local221 & 0x2) == 2;
															Static415.anInt6805++;
														}
														Static277.aClass119_110 = null;
														Static161.anInt3318 = Static301.anInt2459;
														return true;
													} else if (Static403.aClass119_140 == Static277.aClass119_110) {
														local221 = Static237.aClass3_Sub7_Sub1_1.method2582();
														local71 = Static237.aClass3_Sub7_Sub1_1.method2593();
														if (local71 == 65535) {
															local71 = -1;
														}
														local270 = Static237.aClass3_Sub7_Sub1_1.method2620();
														local240 = Static237.aClass3_Sub7_Sub1_1.method2639();
														if (local240 >= 1 && local240 <= 8) {
															if (local270.equalsIgnoreCase("null")) {
																local270 = null;
															}
															Static430.aStringArray31[local240 - 1] = local270;
															Static455.anIntArray535[local240 - 1] = local71;
															Static32.aBooleanArray7[local240 - 1] = local221 == 0;
														}
														Static277.aClass119_110 = null;
														return true;
													} else if (Static391.aClass119_147 == Static277.aClass119_110) {
														local221 = Static237.aClass3_Sub7_Sub1_1.method2589();
														local71 = Static237.aClass3_Sub7_Sub1_1.method2598();
														local236 = Static237.aClass3_Sub7_Sub1_1.method2588();
														if (Static315.method4354(local236)) {
															Static418.method299(local71, local221);
														}
														Static277.aClass119_110 = null;
														return true;
													} else if (Static136.aClass119_58 == Static277.aClass119_110) {
														local264 = Static237.aClass3_Sub7_Sub1_1.method2582() == 1;
														local268 = Static237.aClass3_Sub7_Sub1_1.method2620();
														local270 = local268;
														if (local264) {
															local270 = Static237.aClass3_Sub7_Sub1_1.method2620();
														}
														local1669 = Static237.aClass3_Sub7_Sub1_1.method2588();
														local1674 = Static237.aClass3_Sub7_Sub1_1.method2604();
														local1678 = Static237.aClass3_Sub7_Sub1_1.method2582();
														@Pc(5756) long local5756 = (local1669 << 32) + local1674;
														@Pc(5758) boolean local5758 = false;
														local5444 = 0;
														while (true) {
															if (local5444 >= 100) {
																if (local1678 <= 1) {
																	if (Static388.aBoolean561 && !Static331.aBoolean651 || Static338.aBoolean492) {
																		local5758 = true;
																	} else if (Static2.method9(local270)) {
																		local5758 = true;
																	}
																}
																break;
															}
															if (Static69.aLongArray3[local5444] == local5756) {
																local5758 = true;
																break;
															}
															local5444++;
														}
														if (!local5758 && Static391.anInt6727 == 0) {
															Static69.aLongArray3[Static67.anInt1722] = local5756;
															Static67.anInt1722 = (Static67.anInt1722 + 1) % 100;
															@Pc(5819) String local5819 = Static249.method3737(Static337.method4506(Static237.aClass3_Sub7_Sub1_1));
															if (local1678 == 2) {
																Static416.method5338(local5819, 7, -1, null, "<img=1>" + local270, "<img=1>" + local268, 0);
															} else if (local1678 == 1) {
																Static416.method5338(local5819, 7, -1, null, "<img=0>" + local270, "<img=0>" + local268, 0);
															} else {
																Static416.method5338(local5819, 3, -1, null, local270, local268, 0);
															}
														}
														Static277.aClass119_110 = null;
														return true;
													} else if (Static277.aClass119_110 == Static340.aClass119_123) {
														Static65.anInt1684 = Static237.aClass3_Sub7_Sub1_1.method2582();
														Static277.aClass119_110 = null;
														Static355.anInt6052 = Static301.anInt2459;
														return true;
													} else if (Static277.aClass119_110 == Static334.aClass119_121) {
														local221 = Static237.aClass3_Sub7_Sub1_1.method2589();
														local71 = Static237.aClass3_Sub7_Sub1_1.method2593();
														local236 = Static237.aClass3_Sub7_Sub1_1.method2589();
														if (Static315.method4354(local71)) {
															@Pc(5923) Class3_Sub9 local5923 = (Class3_Sub9) Static318.aClass11_42.method324((long) local221);
															local627 = (Class3_Sub9) Static318.aClass11_42.method324((long) local236);
															if (local627 != null) {
																Static434.method5676(local5923 == null || local627.anInt1804 != local5923.anInt1804, false, local627);
															}
															if (local5923 != null) {
																local5923.method5977();
																Static318.aClass11_42.method319(local5923, (long) local236);
															}
															@Pc(5961) Class156 local5961 = Static435.method5705(local221);
															if (local5961 != null) {
																Static386.method5010(local5961);
															}
															local5961 = Static435.method5705(local236);
															if (local5961 != null) {
																Static386.method5010(local5961);
																Static317.method4367(true, local5961);
															}
															if (Static226.anInt4225 != -1) {
																Static88.method1668(1, Static226.anInt4225);
															}
														}
														Static277.aClass119_110 = null;
														return true;
													} else if (Static98.aClass119_43 == Static277.aClass119_110) {
														local221 = Static237.aClass3_Sub7_Sub1_1.method2616();
														local71 = Static237.aClass3_Sub7_Sub1_1.method2593();
														local236 = Static237.aClass3_Sub7_Sub1_1.method2616();
														local240 = Static237.aClass3_Sub7_Sub1_1.method2593();
														if (Static315.method4354(local240)) {
															Static437.method5728(local221, local236, 5, local71);
														}
														Static277.aClass119_110 = null;
														return true;
													} else if (Static99.aClass119_44 == Static277.aClass119_110) {
														local221 = Static237.aClass3_Sub7_Sub1_1.method2598();
														if (local221 == 65535) {
															local221 = -1;
														}
														local71 = Static237.aClass3_Sub7_Sub1_1.method2637();
														local236 = Static237.aClass3_Sub7_Sub1_1.method2639();
														Static407.method5243(local71, local221, local236);
														Static277.aClass119_110 = null;
														return true;
													} else if (Static277.aClass119_110 == Static406.aClass119_142) {
														local221 = Static237.aClass3_Sub7_Sub1_1.method2637();
														local71 = Static237.aClass3_Sub7_Sub1_1.method2594();
														local236 = Static237.aClass3_Sub7_Sub1_1.method2598();
														if (local236 == 65535) {
															local236 = -1;
														}
														Static339.method4510(local71, local236, local221);
														Static277.aClass119_110 = null;
														return true;
													} else if (Static277.aClass119_110 == Static165.aClass119_71) {
														Static97.method1703();
														Static277.aClass119_110 = null;
														return true;
													} else if (Static120.aClass119_54 == Static277.aClass119_110) {
														Static242.method3660(Static270.aClass95_10);
														Static277.aClass119_110 = null;
														return true;
													} else if (Static277.aClass119_110 == Static84.aClass119_38) {
														Static242.method3660(Static156.aClass95_8);
														Static277.aClass119_110 = null;
														return true;
													} else if (Static277.aClass119_110 == Static14.aClass119_10) {
														local221 = Static237.aClass3_Sub7_Sub1_1.method2588();
														if (Static315.method4354(local221)) {
															Static434.method5675();
														}
														Static277.aClass119_110 = null;
														return true;
													} else if (Static277.aClass119_110 == Static64.aClass119_24) {
														local221 = Static237.aClass3_Sub7_Sub1_1.method2589();
														local71 = Static237.aClass3_Sub7_Sub1_1.method2590();
														local236 = Static237.aClass3_Sub7_Sub1_1.method2593();
														if (Static315.method4354(local236)) {
															Static170.method2748(local71, local221);
														}
														Static277.aClass119_110 = null;
														return true;
													} else if (Static277.aClass119_110 == Static311.aClass119_115) {
														Static242.method3660(Static27.aClass95_5);
														Static277.aClass119_110 = null;
														return true;
													} else if (Static277.aClass119_110 == Static401.aClass119_139) {
														Static24.method583();
														Static277.aClass119_110 = null;
														return false;
													} else {
														Static324.method5974(null, "T1 - " + (Static277.aClass119_110 == null ? -1 : Static277.aClass119_110.method2890()) + "," + (Static76.aClass119_31 == null ? -1 : Static76.aClass119_31.method2890()) + "," + (Static354.aClass119_128 == null ? -1 : Static354.aClass119_128.method2890()) + " - " + Static139.anInt7585);
														Static24.method583();
														return true;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)V")
	public static void method2935(@OriginalArg(0) int arg0) {
		@Pc(13) Class3_Sub4_Sub12 local13 = Static393.method5080(arg0, 16);
		local13.method3244();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([I[IIBI)V")
	public static void method2936(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(16) int local16 = (arg3 + arg2) / 2;
		@Pc(18) int local18 = arg3;
		@Pc(22) int local22 = arg1[local16];
		arg1[local16] = arg1[arg2];
		arg1[arg2] = local22;
		@Pc(36) int local36 = arg0[local16];
		arg0[local16] = arg0[arg2];
		arg0[arg2] = local36;
		@Pc(53) int local53 = local22 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(55) int local55 = arg3; local55 < arg2; local55++) {
			if ((local53 & local55) + local22 > arg1[local55]) {
				@Pc(69) int local69 = arg1[local55];
				arg1[local55] = arg1[local18];
				arg1[local18] = local69;
				@Pc(83) int local83 = arg0[local55];
				arg0[local55] = arg0[local18];
				arg0[local18++] = local83;
			}
		}
		arg1[arg2] = arg1[local18];
		arg1[local18] = local22;
		arg0[arg2] = arg0[local18];
		arg0[local18] = local36;
		method2936(arg0, arg1, local18 - 1, arg3);
		method2936(arg0, arg1, arg2, local18 + 1);
	}
}
