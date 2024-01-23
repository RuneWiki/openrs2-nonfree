import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread2;

	@OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
	public static int anInt4128;

	@OriginalMember(owner = "client!pa", name = "t", descriptor = "[Lclient!rj;")
	public static Class2_Sub3_Sub1[] aClass2_Sub3_Sub1Array8;

	@OriginalMember(owner = "client!pa", name = "w", descriptor = "Lclient!jd;")
	public static Class84 aClass84_83;

	@OriginalMember(owner = "client!pa", name = "A", descriptor = "Lclient!nf;")
	public static Class2_Sub3_Sub18 aClass2_Sub3_Sub18_2;

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "Lclient!a;")
	public static Class1 aClass1_14 = new Class1();

	@OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
	public static int anInt4129 = 0;

	@OriginalMember(owner = "client!pa", name = "v", descriptor = "I")
	public static int anInt4131 = 0;

	@OriginalMember(owner = "client!pa", name = "x", descriptor = "Z")
	public static boolean aBoolean343 = false;

	@OriginalMember(owner = "client!pa", name = "z", descriptor = "I")
	public static int anInt4133 = -1;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIII)V")
	public static void method3349(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(22) int local22;
		@Pc(38) int local38;
		if (Static106.anInt2305 == 0) {
			@Pc(18) int local18 = Static107.anInt2320;
			@Pc(20) int local20 = Static176.anInt3789;
			local22 = Static260.anInt5417;
			@Pc(24) int local24 = Static212.anInt4456;
			local38 = (arg0 - arg5) * (local24 - local22) / arg1 + local22;
			@Pc(53) int local53 = (arg2 - arg3) * (local20 - local18) / arg4 + local18;
			if (Static133.aBoolean219 && (Static212.anInt4455 & 0x40) != 0) {
				@Pc(96) Class115 local96 = Static266.method4442(Static25.anInt5783, Static297.anInt6213);
				if (local96 == null) {
					Static207.method3484();
				} else {
					Static32.method642((short) 26, local38, 0L, Static112.anInt2421, local53, " ->", Static296.aString299);
				}
			} else {
				if (Static84.anInt825 == 1) {
					Static32.method642((short) 13, local38, 0L, -1, local53, "", Static156.aString259);
				}
				Static32.method642((short) 6, local38, 0L, -1, local53, "", Static69.aString79);
			}
		}
		@Pc(114) long local114 = -1L;
		for (local22 = 0; local22 < Static243.anInt3777; local22++) {
			@Pc(123) long local123 = Static151.aLongArray13[local22];
			@Pc(130) int local130 = (int) local123 >> 29 & 0x3;
			local38 = (int) local123 & 0x7F;
			@Pc(142) int local142 = (int) local123 >> 7 & 0x7F;
			@Pc(149) int local149 = Integer.MAX_VALUE & (int) (local123 >>> 32);
			if (local123 != local114) {
				local114 = local123;
				@Pc(274) int local274;
				if (local130 == 2 && Static109.method2018(Static208.anInt4335, local38, local142, local123)) {
					@Pc(171) Class143 local171 = Static218.method3692(local149);
					if (local171.anIntArray372 != null) {
						local171 = local171.method3641();
					}
					if (local171 == null) {
						continue;
					}
					if (Static106.anInt2305 == 1) {
						Static32.method642((short) 37, local142, local123, Static124.anInt2629, local38, Static8.aString13 + " -> <col=00ffff>" + local171.aString227, Static212.aString224);
					} else if (Static133.aBoolean219) {
						@Pc(205) Class2_Sub3_Sub8 local205 = Static251.anInt5008 == -1 ? null : Static268.method4459(Static251.anInt5008);
						if ((Static212.anInt4455 & 0x4) != 0 && (local205 == null || local171.method3643(local205.anInt2217, Static251.anInt5008) != local205.anInt2217)) {
							Static32.method642((short) 43, local142, local123, Static112.anInt2421, local38, Static150.aString153 + " -> <col=00ffff>" + local171.aString227, Static296.aString299);
						}
					} else {
						@Pc(262) String[] local262 = local171.aStringArray24;
						if (Static92.aBoolean156) {
							local262 = Static171.method2955(local262);
						}
						if (local262 != null) {
							for (local274 = 4; local274 >= 0; local274--) {
								if (local262[local274] != null) {
									@Pc(283) int local283 = -1;
									@Pc(289) short local289 = 0;
									if (local171.anInt4534 == local274) {
										local283 = local171.anInt4508;
									}
									if (local171.anInt4513 == local274) {
										local283 = local171.anInt4510;
									}
									if (local274 == 0) {
										local289 = 44;
									}
									if (local274 == 1) {
										local289 = 11;
									}
									if (local274 == 2) {
										local289 = 25;
									}
									if (local274 == 3) {
										local289 = 9;
									}
									if (local274 == 4) {
										local289 = 1006;
									}
									Static32.method642(local289, local142, local123, local283, local38, "<col=00ffff>" + local171.aString227, local262[local274]);
								}
							}
						}
						Static32.method642((short) 1001, local142, (long) local171.anInt4488, Static188.anInt3950, local38, "<col=00ffff>" + local171.aString227, Static30.aString43);
					}
				}
				@Pc(520) int local520;
				@Pc(532) int local532;
				@Pc(471) int local471;
				@Pc(485) int local485;
				@Pc(494) Class36_Sub3_Sub1 local494;
				@Pc(605) Class36_Sub3_Sub2 local605;
				if (local130 == 1) {
					@Pc(416) Class36_Sub3_Sub1 local416 = Static201.aClass36_Sub3_Sub1Array1[local149];
					if ((local416.aClass33_1.anInt888 & 0x1) == 0 && (local416.anInt5093 & 0x7F) == 0 && (local416.anInt5109 & 0x7F) == 0 || (local416.aClass33_1.anInt888 & 0x1) == 1 && (local416.anInt5093 & 0x7F) == 64 && (local416.anInt5109 & 0x7F) == 64) {
						local471 = local416.anInt5093 - (local416.aClass33_1.anInt888 - 1) * 64;
						local274 = local416.anInt5109 + 64 - local416.aClass33_1.anInt888 * 64;
						for (local485 = 0; local485 < Static71.anInt1550; local485++) {
							local494 = Static201.aClass36_Sub3_Sub1Array1[Static9.anIntArray12[local485]];
							if (local494 != null && !local494.aBoolean425 && local494 != local416 && local494.aBoolean420) {
								local520 = local494.anInt5093 - (local494.aClass33_1.anInt888 - 1) * 64;
								local532 = local494.anInt5109 + 64 - local494.aClass33_1.anInt888 * 64;
								if (local471 <= local520 && local416.aClass33_1.anInt888 - (local520 - local471 >> 7) >= local494.aClass33_1.anInt888 && local274 <= local532 && local494.aClass33_1.anInt888 <= local416.aClass33_1.anInt888 - (local532 - local274 >> 7)) {
									Static32.method643(Static9.anIntArray12[local485], local494.aClass33_1, local142, local38);
									local494.aBoolean425 = true;
								}
							}
						}
						for (local485 = 0; local485 < Static68.anInt1507; local485++) {
							local605 = Static212.aClass36_Sub3_Sub2Array1[Static33.anIntArray50[local485]];
							if (local605 != null && !local605.aBoolean425 && local605.aBoolean420) {
								local520 = local605.anInt5093 - (local605.method4097() - 1) * 64;
								local532 = local605.anInt5109 - (local605.method4097() - 1) * 64;
								if (local471 <= local520 && local605.method4097() <= local416.aClass33_1.anInt888 - (local520 - local471 >> 7) && local274 <= local532 && local605.method4097() <= local416.aClass33_1.anInt888 - (local532 - local274 >> 7)) {
									Static161.method2801(local142, Static33.anIntArray50[local485], local38, local605);
									local605.aBoolean425 = true;
								}
							}
						}
					}
					if (local416.aBoolean425) {
						continue;
					}
					Static32.method643(local149, local416.aClass33_1, local142, local38);
					local416.aBoolean425 = true;
				}
				if (local130 == 0) {
					@Pc(721) Class36_Sub3_Sub2 local721 = Static212.aClass36_Sub3_Sub2Array1[local149];
					if ((local721.anInt5093 & 0x7F) == 64 && (local721.anInt5109 & 0x7F) == 64) {
						local471 = local721.anInt5093 + 64 - local721.method4097() * 64;
						local274 = local721.anInt5109 - (local721.method4097() - 1) * 64;
						for (local485 = 0; local485 < Static71.anInt1550; local485++) {
							local494 = Static201.aClass36_Sub3_Sub1Array1[Static9.anIntArray12[local485]];
							if (local494 != null && !local494.aBoolean425 && local494.aBoolean420) {
								local532 = local494.anInt5109 + 64 - local494.aClass33_1.anInt888 * 64;
								local520 = local494.anInt5093 + 64 - local494.aClass33_1.anInt888 * 64;
								if (local520 >= local471 && local494.aClass33_1.anInt888 <= local721.method4097() - (local520 - local471 >> 7) && local532 >= local274 && local494.aClass33_1.anInt888 <= local721.method4097() - (local532 - local274 >> 7)) {
									Static32.method643(Static9.anIntArray12[local485], local494.aClass33_1, local142, local38);
									local494.aBoolean425 = true;
								}
							}
						}
						for (local485 = 0; local485 < Static68.anInt1507; local485++) {
							local605 = Static212.aClass36_Sub3_Sub2Array1[Static33.anIntArray50[local485]];
							if (local605 != null && !local605.aBoolean425 && local605 != local721 && local605.aBoolean420) {
								local520 = local605.anInt5093 - (local605.method4097() - 1) * 64;
								local532 = local605.anInt5109 - (local605.method4097() - 1) * 64;
								if (local471 <= local520 && local605.method4097() <= local721.method4097() - (local520 - local471 >> 7) && local274 <= local532 && local605.method4097() <= local721.method4097() - (local532 - local274 >> 7)) {
									Static161.method2801(local142, Static33.anIntArray50[local485], local38, local605);
									local605.aBoolean425 = true;
								}
							}
						}
					}
					if (local721.aBoolean425) {
						continue;
					}
					Static161.method2801(local142, local149, local38, local721);
					local721.aBoolean425 = true;
				}
				if (local130 == 3) {
					@Pc(992) Class1 local992 = Static208.aClass1ArrayArrayArray1[Static208.anInt4335][local38][local142];
					if (local992 != null) {
						for (@Pc(1000) Class2_Sub3_Sub11 local1000 = (Class2_Sub3_Sub11) local992.method4(); local1000 != null; local1000 = (Class2_Sub3_Sub11) local992.method2()) {
							local274 = local1000.aClass36_Sub7_1.anInt6145;
							@Pc(1010) Class155 local1010 = Static152.method2616(local274);
							if (Static106.anInt2305 == 1) {
								Static32.method642((short) 60, local142, (long) local274, Static124.anInt2629, local38, Static8.aString13 + " -> <col=ff9040>" + local1010.aString239, Static212.aString224);
							} else if (Static133.aBoolean219) {
								@Pc(1190) Class2_Sub3_Sub8 local1190 = Static251.anInt5008 == -1 ? null : Static268.method4459(Static251.anInt5008);
								if ((Static212.anInt4455 & 0x1) != 0 && (local1190 == null || local1010.method3928(Static251.anInt5008, local1190.anInt2217) != local1190.anInt2217)) {
									Static32.method642((short) 5, local142, (long) local274, Static112.anInt2421, local38, Static150.aString153 + " -> <col=ff9040>" + local1010.aString239, Static296.aString299);
								}
							} else {
								@Pc(1048) String[] local1048 = local1010.aStringArray26;
								if (Static92.aBoolean156) {
									local1048 = Static171.method2955(local1048);
								}
								for (local520 = 4; local520 >= 0; local520--) {
									if (local1048 != null && local1048[local520] != null) {
										@Pc(1079) byte local1079 = 0;
										if (local520 == 0) {
											local1079 = 14;
										}
										if (local520 == 1) {
											local1079 = 20;
										}
										@Pc(1093) int local1093 = -1;
										if (local520 == 2) {
											local1079 = 1;
										}
										if (local520 == 3) {
											local1079 = 59;
										}
										if (local520 == local1010.anInt4855) {
											local1093 = local1010.anInt4854;
										}
										if (local520 == 4) {
											local1079 = 22;
										}
										if (local1010.anInt4844 == local520) {
											local1093 = local1010.anInt4850;
										}
										Static32.method642(local1079, local142, (long) local274, local1093, local38, "<col=ff9040>" + local1010.aString239, local1048[local520]);
									}
								}
								Static32.method642((short) 1002, local142, (long) local274, Static188.anInt3950, local38, "<col=ff9040>" + local1010.aString239, Static30.aString43);
							}
						}
					}
				}
			}
		}
	}
}
