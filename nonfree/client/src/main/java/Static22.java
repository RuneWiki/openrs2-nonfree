import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "Lclient!ai;")
	public static Class6 aClass6_150 = Static38.method685("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!cg", name = "o", descriptor = "Lclient!ai;")
	public static Class6 aClass6_151 = Static38.method685("null");

	@OriginalMember(owner = "client!cg", name = "r", descriptor = "Lclient!ai;")
	public static Class6 aClass6_152 = Static38.method685("::fpsoff");

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BIIII)V")
	public static void method389(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static122.anInt2841 == 0 && !Static26.aBoolean28) {
			Static95.method1546(Static9.aClass6_71, 35, arg3 - arg1, 0, arg0 - arg2, Static69.aClass6_515);
		}
		@Pc(38) int local38 = -1;
		for (@Pc(40) int local40 = 0; local40 < Static147.anInt3492; local40++) {
			@Pc(46) int local46 = Static147.anIntArray314[local40];
			@Pc(52) int local52 = local46 >> 7 & 0x7F;
			@Pc(56) int local56 = local46 & 0x7F;
			@Pc(62) int local62 = local46 >> 29 & 0x3;
			@Pc(68) int local68 = local46 >> 14 & 0x7FFF;
			if (local38 != local46) {
				local38 = local46;
				@Pc(160) int local160;
				if (local62 == 2 && Static30.aClass44_1.method1272(Static36.anInt1020, local56, local52, local46) >= 0) {
					@Pc(92) Class2_Sub3_Sub6 local92 = Static163.method2609(local68);
					if (local92.anIntArray61 != null) {
						local92 = local92.method750();
					}
					if (local92 == null) {
						continue;
					}
					if (Static122.anInt2841 == 1) {
						Static95.method1546(Static58.method956(new Class6[] { Static128.aClass6_856, Static86.aClass6_648, local92.aClass6_326 }), 28, local52, local46, local56, Static28.aClass6_201);
					} else if (!Static26.aBoolean28) {
						@Pc(150) Class6[] local150 = local92.aClass6Array7;
						if (Static167.aBoolean158) {
							local150 = Static116.method1872(local150);
						}
						if (local150 != null) {
							for (local160 = 4; local160 >= 0; local160--) {
								if (local150[local160] != null) {
									@Pc(172) short local172 = 0;
									if (local160 == 0) {
										local172 = 32;
									}
									if (local160 == 1) {
										local172 = 4;
									}
									if (local160 == 2) {
										local172 = 25;
									}
									if (local160 == 3) {
										local172 = 51;
									}
									if (local160 == 4) {
										local172 = 1003;
									}
									Static95.method1546(Static58.method956(new Class6[] { Static156.aClass6_1062, local92.aClass6_326 }), local172, local52, local46, local56, local150[local160]);
								}
							}
						}
						Static95.method1546(Static58.method956(new Class6[] { Static156.aClass6_1062, local92.aClass6_326 }), 1006, local52, local92.anInt1216 << 14, local56, Static30.aClass6_213);
					} else if ((Static42.anInt1291 & 0x4) == 4) {
						Static95.method1546(Static58.method956(new Class6[] { Static27.aClass6_194, Static86.aClass6_648, local92.aClass6_326 }), 16, local52, local46, local56, Static3.aClass6_29);
					}
				}
				@Pc(313) int local313;
				@Pc(321) Class2_Sub3_Sub5_Sub1_Sub2 local321;
				@Pc(364) Class2_Sub3_Sub5_Sub1_Sub1 local364;
				if (local62 == 1) {
					@Pc(290) Class2_Sub3_Sub5_Sub1_Sub2 local290 = Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1[local68];
					if (local290.aClass2_Sub3_Sub17_1.anInt3906 == 1 && (local290.anInt2674 & 0x7F) == 64 && (local290.anInt2672 & 0x7F) == 64) {
						for (local313 = 0; local313 < Static81.anInt1985; local313++) {
							local321 = Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1[Static149.anIntArray312[local313]];
							if (local321 != null && local321 != local290 && local321.aClass2_Sub3_Sub17_1.anInt3906 == 1 && local321.anInt2674 == local290.anInt2674 && local290.anInt2672 == local321.anInt2672) {
								Static165.method2624(Static149.anIntArray312[local313], local52, local321.aClass2_Sub3_Sub17_1, local56);
							}
						}
						for (local160 = 0; local160 < Static167.anInt3925; local160++) {
							local364 = Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[Static156.anIntArray358[local160]];
							if (local364 != null && local290.anInt2674 == local364.anInt2674 && local290.anInt2672 == local364.anInt2672) {
								Static20.method376(Static156.anIntArray358[local160], local56, local364, local52);
							}
						}
					}
					Static165.method2624(local68, local52, local290.aClass2_Sub3_Sub17_1, local56);
				}
				if (local62 == 0) {
					@Pc(418) Class2_Sub3_Sub5_Sub1_Sub1 local418 = Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[local68];
					if ((local418.anInt2674 & 0x7F) == 64 && (local418.anInt2672 & 0x7F) == 64) {
						for (local313 = 0; local313 < Static81.anInt1985; local313++) {
							local321 = Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1[Static149.anIntArray312[local313]];
							if (local321 != null && local321.aClass2_Sub3_Sub17_1.anInt3906 == 1 && local418.anInt2674 == local321.anInt2674 && local321.anInt2672 == local418.anInt2672) {
								Static165.method2624(Static149.anIntArray312[local313], local52, local321.aClass2_Sub3_Sub17_1, local56);
							}
						}
						for (local160 = 0; local160 < Static167.anInt3925; local160++) {
							local364 = Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[Static156.anIntArray358[local160]];
							if (local364 != null && local364 != local418 && local418.anInt2674 == local364.anInt2674 && local364.anInt2672 == local418.anInt2672) {
								Static20.method376(Static156.anIntArray358[local160], local56, local364, local52);
							}
						}
					}
					Static20.method376(local68, local56, local418, local52);
				}
				if (local62 == 3) {
					@Pc(542) Class84 local542 = Static27.aClass84ArrayArrayArray1[Static36.anInt1020][local56][local52];
					if (local542 != null) {
						for (@Pc(549) Class2_Sub3_Sub5_Sub2 local549 = (Class2_Sub3_Sub5_Sub2) local542.method2690(); local549 != null; local549 = (Class2_Sub3_Sub5_Sub2) local542.method2692()) {
							@Pc(556) Class2_Sub3_Sub10 local556 = Static92.method1502(local549.anInt1025);
							if (Static122.anInt2841 == 1) {
								Static95.method1546(Static58.method956(new Class6[] { Static128.aClass6_856, Static36.aClass6_274, local556.aClass6_612 }), 36, local52, local549.anInt1025, local56, Static28.aClass6_201);
							} else if (!Static26.aBoolean28) {
								@Pc(568) Class6[] local568 = local556.aClass6Array11;
								if (Static167.aBoolean158) {
									local568 = Static116.method1872(local568);
								}
								for (@Pc(576) int local576 = 4; local576 >= 0; local576--) {
									if (local568 != null && local568[local576] != null) {
										@Pc(590) byte local590 = 0;
										if (local576 == 0) {
											local590 = 11;
										}
										if (local576 == 1) {
											local590 = 58;
										}
										if (local576 == 2) {
											local590 = 46;
										}
										if (local576 == 3) {
											local590 = 29;
										}
										if (local576 == 4) {
											local590 = 48;
										}
										Static95.method1546(Static58.method956(new Class6[] { Static103.aClass6_714, local556.aClass6_612 }), local590, local52, local549.anInt1025, local56, local568[local576]);
									} else if (local576 == 2) {
										Static95.method1546(Static58.method956(new Class6[] { Static103.aClass6_714, local556.aClass6_612 }), 46, local52, local549.anInt1025, local56, Static158.aClass6_1067);
									}
								}
								Static95.method1546(Static58.method956(new Class6[] { Static103.aClass6_714, local556.aClass6_612 }), 1007, local52, local549.anInt1025, local56, Static30.aClass6_213);
							} else if ((Static42.anInt1291 & 0x1) == 1) {
								Static95.method1546(Static58.method956(new Class6[] { Static27.aClass6_194, Static36.aClass6_274, local556.aClass6_612 }), 5, local52, local549.anInt1025, local56, Static3.aClass6_29);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
	public static void method390() {
		aClass6_152 = null;
		aClass6_151 = null;
		aClass6_150 = null;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)Lclient!hb;")
	public static Class2_Sub3_Sub7 method391(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub3_Sub7 local10 = (Class2_Sub3_Sub7) Static130.aClass17_18.method505((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static170.aClass10_138.method1605(arg0, 14);
		local10 = new Class2_Sub3_Sub7();
		if (local25 != null) {
			local10.method958(new Class2_Sub13(local25));
		}
		Static130.aClass17_18.method508((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(III)I")
	public static int method392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = arg1 * (arg0 & 0x7F) >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		}
	}
}
