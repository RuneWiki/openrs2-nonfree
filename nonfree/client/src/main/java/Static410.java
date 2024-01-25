import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!pv", name = "s", descriptor = "Lclient!at;")
	public static Class21 aClass21_1;

	@OriginalMember(owner = "client!pv", name = "t", descriptor = "I")
	public static int anInt7383;

	@OriginalMember(owner = "client!pv", name = "B", descriptor = "[I")
	public static final int[] anIntArray507 = new int[3];

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)V")
	public static void method5894() {
		for (@Pc(10) Class6_Sub5_Sub7 local10 = (Class6_Sub5_Sub7) Static237.aClass298_93.method6809(); local10 != null; local10 = (Class6_Sub5_Sub7) Static237.aClass298_93.method6821()) {
			@Pc(23) Class15_Sub2_Sub2 local23 = local10.aClass15_Sub2_Sub2_1;
			if (local23.anInt1812 < Static363.anInt6671) {
				local10.method7948();
				local23.method1661();
			} else if (local23.anInt1821 <= Static363.anInt6671) {
				if (local23.anInt1811 > 0) {
					@Pc(67) Class6_Sub49 local67 = (Class6_Sub49) Static251.aClass234_29.method5464((long) (local23.anInt1811 - 1));
					if (local67 != null) {
						@Pc(72) Class15_Sub2_Sub4_Sub1 local72 = local67.aClass15_Sub2_Sub4_Sub1_2;
						if (local72.anInt8911 >= 0 && local72.anInt8911 < Static18.anInt5706 * 512 && local72.anInt8913 >= 0 && local72.anInt8913 < Static80.anInt1367 * 512) {
							local23.method1667(local72.anInt8911, local72.anInt8913, Static37.method631(local72.anInt8913, local72.anInt8911, local23.aByte98) - local23.anInt1837, Static363.anInt6671);
						}
					}
				}
				if (local23.anInt1811 < 0) {
					@Pc(128) int local128 = -local23.anInt1811 - 1;
					@Pc(139) Class15_Sub2_Sub4_Sub2 local139;
					if (local128 == Static517.anInt8881) {
						local139 = Static461.aClass15_Sub2_Sub4_Sub2_2;
					} else {
						local139 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local128];
					}
					if (local139 != null && local139.anInt8911 >= 0 && Static18.anInt5706 * 512 > local139.anInt8911 && local139.anInt8913 >= 0 && local139.anInt8913 < Static80.anInt1367 * 512) {
						local23.method1667(local139.anInt8911, local139.anInt8913, Static37.method631(local139.anInt8913, local139.anInt8911, local23.aByte98) - local23.anInt1837, Static363.anInt6671);
					}
				}
				local23.method1666(Static415.anInt7409);
				Static176.method7614(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!tt;IILclient!jr;)V")
	public static void method5896(@OriginalArg(0) Class313 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class6_Sub12 arg2) {
		@Pc(9) Class6_Sub11 local9 = new Class6_Sub11();
		local9.anInt1399 = arg2.method6019();
		local9.anInt1397 = arg2.method6015();
		local9.aByteArrayArrayArray1 = new byte[local9.anInt1399][][];
		local9.anIntArray129 = new int[local9.anInt1399];
		local9.anIntArray130 = new int[local9.anInt1399];
		local9.aClass224Array1 = new Class224[local9.anInt1399];
		local9.aClass224Array2 = new Class224[local9.anInt1399];
		local9.anIntArray131 = new int[local9.anInt1399];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt1399; local56++) {
			try {
				@Pc(62) int local62 = arg2.method6019();
				@Pc(89) String local89;
				@Pc(93) String local93;
				@Pc(97) int local97;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local89 = arg2.method6040();
					local93 = arg2.method6040();
					local97 = 0;
					if (local62 == 1) {
						local97 = arg2.method6015();
					}
					local9.anIntArray131[local56] = local62;
					local9.anIntArray130[local56] = local97;
					local9.aClass224Array1[local56] = arg0.method6980(local93, Static473.method6559(local89));
				} else if (local62 == 3 || local62 == 4) {
					local89 = arg2.method6040();
					local93 = arg2.method6040();
					local97 = arg2.method6019();
					@Pc(100) String[] local100 = new String[local97];
					for (@Pc(102) int local102 = 0; local102 < local97; local102++) {
						local100[local102] = arg2.method6040();
					}
					@Pc(121) byte[][] local121 = new byte[local97][];
					@Pc(132) int local132;
					if (local62 == 3) {
						for (@Pc(126) int local126 = 0; local126 < local97; local126++) {
							local132 = arg2.method6015();
							local121[local126] = new byte[local132];
							arg2.method6020(local121[local126], local132);
						}
					}
					local9.anIntArray131[local56] = local62;
					@Pc(161) Class[] local161 = new Class[local97];
					for (local132 = 0; local132 < local97; local132++) {
						local161[local132] = Static473.method6559(local100[local132]);
					}
					local9.aClass224Array2[local56] = arg0.method6988(local161, local93, Static473.method6559(local89));
					local9.aByteArrayArrayArray1[local56] = local121;
				}
			} catch (@Pc(238) ClassNotFoundException local238) {
				local9.anIntArray129[local56] = -1;
			} catch (@Pc(245) SecurityException local245) {
				local9.anIntArray129[local56] = -2;
			} catch (@Pc(252) NullPointerException local252) {
				local9.anIntArray129[local56] = -3;
			} catch (@Pc(259) Exception local259) {
				local9.anIntArray129[local56] = -4;
			} catch (@Pc(266) Throwable local266) {
				local9.anIntArray129[local56] = -5;
			}
		}
		Static467.aClass298_177.method6812(local9);
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V")
	public static void method5897() {
		for (@Pc(7) int local7 = 0; local7 < Static300.anInt5490; local7++) {
			@Pc(13) Class152 local13 = Static486.aClass152Array1[local7];
			@Pc(15) boolean local15 = false;
			@Pc(230) int local230;
			if (local13.aClass6_Sub15_Sub2_2 == null) {
				local13.anInt4381--;
				if (local13.anInt4381 >= (local13.method3734() ? -1500 : -10)) {
					if (local13.aByte53 == 1 && local13.aClass161_1 == null) {
						local13.aClass161_1 = Static592.method3933(Static492.aClass248_96, local13.anInt4382, 0);
						if (local13.aClass161_1 == null) {
							continue;
						}
						local13.anInt4381 += local13.aClass161_1.method3932();
					} else if (local13.method3734() && (local13.aClass6_Sub23_1 == null || local13.aClass6_Sub6_Sub1_2 == null)) {
						if (local13.aClass6_Sub23_1 == null) {
							local13.aClass6_Sub23_1 = Static254.method3949(Static35.aClass248_8, local13.anInt4382);
						}
						if (local13.aClass6_Sub23_1 == null) {
							continue;
						}
						if (local13.aClass6_Sub6_Sub1_2 == null) {
							local13.aClass6_Sub6_Sub1_2 = local13.aClass6_Sub23_1.method3945(new int[] { 22050 });
							if (local13.aClass6_Sub6_Sub1_2 == null) {
								continue;
							}
						}
					}
					if (local13.anInt4381 < 0) {
						if (local13.anInt4379 == 0) {
							local230 = local13.anInt4378 * (local13.aByte53 == 3 ? Static58.aClass6_Sub17_Sub1_1.anInt9288 : Static58.aClass6_Sub17_Sub1_1.anInt9279) >> 8;
						} else {
							@Pc(129) int local129 = local13.anInt4379 >> 24 & 0x3;
							if (Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98 == local129) {
								@Pc(140) int local140 = (local13.anInt4379 & 0xFF) << 9;
								@Pc(147) int local147 = local13.anInt4379 >> 16 & 0xFF;
								@Pc(157) int local157 = (local147 << 9) + 256 - Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8911;
								if (local157 < 0) {
									local157 = -local157;
								}
								@Pc(172) int local172 = local13.anInt4379 >> 8 & 0xFF;
								@Pc(182) int local182 = (local172 << 9) + 256 - Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8913;
								if (local182 < 0) {
									local182 = -local182;
								}
								@Pc(196) int local196 = local157 + local182 - 512;
								if (local196 > local140) {
									local13.anInt4381 = -99999;
									continue;
								}
								if (local196 < 0) {
									local196 = 0;
								}
								local230 = local13.anInt4378 * Static58.aClass6_Sub17_Sub1_1.anInt9286 * (local140 - local196) / local140 >> 8;
							} else {
								local230 = 0;
							}
						}
						if (local230 > 0) {
							@Pc(258) Class6_Sub6_Sub1 local258 = null;
							if (local13.aByte53 == 1) {
								local258 = local13.aClass161_1.method3934().method6127(Static446.aClass96_1);
							} else if (local13.method3734()) {
								local258 = local13.aClass6_Sub6_Sub1_2;
							}
							@Pc(286) Class6_Sub15_Sub2 local286 = local13.aClass6_Sub15_Sub2_2 = Static591.method3858(local258, local230);
							local286.method3880(local13.anInt4380 - 1);
							Static204.aClass6_Sub15_Sub1_1.method2422(local286);
						}
					}
				} else {
					local15 = true;
				}
			} else if (!local13.aClass6_Sub15_Sub2_2.method7949()) {
				local15 = true;
			}
			if (local15) {
				Static300.anInt5490--;
				for (local230 = local7; local230 < Static300.anInt5490; local230++) {
					Static486.aClass152Array1[local230] = Static486.aClass152Array1[local230 + 1];
				}
				local7--;
			}
		}
		if (Static396.aBoolean490 && !Static110.method1700()) {
			if (Static58.aClass6_Sub17_Sub1_1.anInt9287 != 0 && Static175.anInt3168 != -1) {
				Static365.method5403(Static175.anInt3168, Static262.aClass248_36, Static58.aClass6_Sub17_Sub1_1.anInt9287);
			}
			Static396.aBoolean490 = false;
		} else if (Static58.aClass6_Sub17_Sub1_1.anInt9287 != 0 && Static175.anInt3168 != -1 && !Static110.method1700()) {
			Static534.method7063(Static161.aClass316_38);
			Static340.aClass6_Sub12_Sub2_1.method6042(Static175.anInt3168);
			Static175.anInt3168 = -1;
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIIII)V")
	public static void method5900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static582.anIntArrayArray69 != null) {
			Static582.anIntArrayArray69[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static205.aShortArrayArray15 != null) {
			Static205.aShortArrayArray15[arg0][arg1] = (short) arg3;
		}
		if (Static464.aByteArrayArray25 != null) {
			Static464.aByteArrayArray25[arg0][arg1] = (byte) arg4;
		}
	}
}
