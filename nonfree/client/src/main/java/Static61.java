import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IILclient!za;)Z")
	public static boolean method963(@OriginalArg(0) int arg0, @OriginalArg(2) Class200 arg1) {
		@Pc(11) int local11 = (Static433.anInt7210 - 104) / 2;
		@Pc(17) int local17 = (Static418.anInt6969 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static364.method4712(local29, local21, local25, arg0)) {
						local40 = local29;
						if (Static118.method1679(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static218.method3702(local40, local21, local25);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(79) int[] local79 = new int[262144];
		for (local29 = 0; local29 < local79.length; local29++) {
			local79[local29] = -16777216;
		}
		Static64.aClass49_5 = arg1.method5849(local79, 512, 512, 512);
		Static462.method6053();
		local40 = ((int) (Math.random() * 20.0D) + 228 << 8) + ((((int) (Math.random() * 20.0D)) + 238) - 10 << 16) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
		@Pc(156) int local156 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(175) int local175 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(179) boolean[][] local179 = new boolean[Static303.anInt4740][Static303.anInt4740];
		@Pc(185) int local185;
		@Pc(202) int local202;
		@Pc(206) int local206;
		@Pc(210) int local210;
		@Pc(269) int local269;
		@Pc(275) int local275;
		@Pc(279) int local279;
		@Pc(302) int local302;
		for (@Pc(181) int local181 = local11; local181 < local11 + 104; local181 += Static303.anInt4740) {
			for (local185 = local17; local185 < local17 + 104; local185 += Static303.anInt4740) {
				arg1.ba(0, 0, Static303.anInt4740 * 4, Static303.anInt4740 * 4);
				arg1.t(-16777216);
				for (local202 = arg0; local202 <= 3; local202++) {
					for (local206 = 0; local206 < Static303.anInt4740; local206++) {
						for (local210 = 0; local210 < Static303.anInt4740; local210++) {
							local179[local206][local210] = Static364.method4712(local202, local181 + local206, local185 - -local210, arg0);
						}
					}
					Static110.aClass125Array1[local202].method4988(local181, local185, Static303.anInt4740 + local181, local185 - -Static303.anInt4740, local179);
					if (!Static86.aBoolean104) {
						for (local210 = -4; local210 < Static303.anInt4740; local210++) {
							for (local269 = -4; local269 < Static303.anInt4740; local269++) {
								local275 = local210 + local181;
								local279 = local185 + local269;
								if (local11 <= local275 && local17 <= local279 && Static364.method4712(local202, local275, local279, arg0)) {
									local302 = local202;
									if (Static118.method1679(local279, local275)) {
										local302 = local202 - 1;
									}
									if (local302 >= 0) {
										Static8.method142(local302, local279, local156, (Static303.anInt4740 - local269) * 4 - 4, arg1, local275, local210 * 4, local40);
									}
								}
							}
						}
					}
				}
				if (Static86.aBoolean104) {
					@Pc(360) Class240 local360 = Static163.aClass240Array1[arg0];
					for (local210 = 0; local210 < Static303.anInt4740; local210++) {
						for (local269 = 0; local269 < Static303.anInt4740; local269++) {
							local275 = local181 + local210;
							local279 = local185 + local269;
							local302 = local360.anIntArrayArray60[local275 - local360.anInt6848][local279 - local360.anInt6844];
							if ((local302 & 0x40240000) != 0) {
								arg1.method5856((Static303.anInt4740 - local269) * 4 - 4, -1713569622, 4, 4, local210 * 4);
							} else if ((local302 & 0x800000) != 0) {
								arg1.method5815(-1713569622, local210 * 4, 4, (Static303.anInt4740 - local269) * 4 - 4);
							} else if ((local302 & 0x2000000) != 0) {
								arg1.method5824(-1713569622, 4, (Static303.anInt4740 - local269) * 4 - 4, local210 * 4 + 3);
							} else if ((local302 & 0x8000000) != 0) {
								arg1.method5815(-1713569622, local210 * 4, 4, (Static303.anInt4740 - local269) * 4 + 3 - 4);
							} else if ((local302 & 0x20000000) != 0) {
								arg1.method5824(-1713569622, 4, (Static303.anInt4740 - local269) * 4 - 4, local210 * 4);
							}
						}
					}
				}
				arg1.P(0, 0, Static303.anInt4740 * 4, Static303.anInt4740 * 4, local175, 2);
				Static64.aClass49_5.XA((local181 - local11) * 4 + 48, -(Static303.anInt4740 * 4) + -((local185 + -local17) * 4) + 464, Static303.anInt4740 * 4, Static303.anInt4740 * 4, 0, 0);
			}
		}
		arg1.va();
		arg1.t(-16777215);
		Static251.method3223();
		Static325.anInt5063 = 0;
		Static151.aClass177_51.method3614();
		if (!Static86.aBoolean104) {
			for (local185 = local11; local185 < local11 + 104; local185++) {
				for (local202 = local17; local202 < local17 + 104; local202++) {
					for (local206 = arg0; local206 <= arg0 + 1 && local206 <= 3; local206++) {
						if (Static364.method4712(local206, local185, local202, arg0)) {
							@Pc(629) Interface2 local629 = (Interface2) Static285.method3519(local206, local185, local202);
							if (local629 == null) {
								local629 = (Interface2) Static12.method194(local206, local185, local202, bs.class);
							}
							if (local629 == null) {
								local629 = (Interface2) Static73.method1080(local206, local185, local202);
							}
							if (local629 == null) {
								local629 = (Interface2) Static173.method2392(local206, local185, local202);
							}
							if (local629 != null) {
								@Pc(670) Class114 local670 = Static398.aClass256_4.method5782(local629.method6037());
								if (!local670.aBoolean188 || Static150.aBoolean175) {
									local275 = local670.anInt2964;
									if (local670.anIntArray170 != null) {
										for (local279 = 0; local279 < local670.anIntArray170.length; local279++) {
											if (local670.anIntArray170[local279] != -1) {
												@Pc(700) Class114 local700 = Static398.aClass256_4.method5782(local670.anIntArray170[local279]);
												if (local700.anInt2964 >= 0) {
													local275 = local700.anInt2964;
												}
											}
										}
									}
									if (local275 >= 0) {
										@Pc(720) boolean local720 = false;
										if (local275 >= 0) {
											@Pc(730) Class6 local730 = Static404.aClass28_4.method670(local275);
											if (local730 != null && local730.aBoolean27) {
												local720 = true;
											}
										}
										local302 = local185;
										@Pc(741) int local741 = local202;
										if (local720) {
											@Pc(748) int[][] local748 = Static163.aClass240Array1[local206].anIntArrayArray60;
											@Pc(753) int local753 = Static163.aClass240Array1[local206].anInt6848;
											@Pc(758) int local758 = Static163.aClass240Array1[local206].anInt6844;
											for (@Pc(760) int local760 = 0; local760 < 10; local760++) {
												@Pc(767) int local767 = (int) (Math.random() * 4.0D);
												if (local767 == 0 && local11 < local302 && local302 > local185 - 3 && (local748[local302 - local753 - 1][local741 - local758] & 0x2C0108) == 0) {
													local302--;
												}
												if (local767 == 1 && local302 < local11 + 104 - 1 && local185 + 3 > local302 && (local748[local302 + 1 - local753][local741 - local758] & 0x2C0180) == 0) {
													local302++;
												}
												if (local767 == 2 && local17 < local741 && local202 - 3 < local741 && (local748[local302 - local753][local741 - local758 - 1] & 0x2C0102) == 0) {
													local741--;
												}
												if (local767 == 3 && local17 + 104 - 1 > local741 && local741 < local202 + 3 && (local748[local302 - local753][local741 + 1 - local758] & 0x2C0120) == 0) {
													local741++;
												}
											}
										}
										Static339.anIntArray393[Static325.anInt5063] = local670.anInt2994;
										Static210.anIntArray213[Static325.anInt5063] = local302;
										Static118.anIntArray113[Static325.anInt5063] = local741;
										Static325.anInt5063++;
									}
								}
							}
						}
					}
				}
			}
			if (Static161.aClass153_2 != null) {
				Static322.aClass243_181.anInt6915 = 1;
				Static404.aClass28_4.method668(64, 1024);
				for (local202 = 0; local202 < Static161.aClass153_2.anInt3938; local202++) {
					local206 = Static161.aClass153_2.anIntArray252[local202];
					if (Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105 == local206 >> 28) {
						local210 = (local206 >> 14 & 0x3FFF) - Static31.anInt618;
						local269 = (local206 & 0x3FFF) - Static226.anInt3768;
						if (local210 >= 0 && Static433.anInt7210 > local210 && local269 >= 0 && local269 < Static418.anInt6969) {
							Static151.aClass177_51.method3615(new Class5_Sub34(local202));
						} else {
							@Pc(1036) Class6 local1036 = Static404.aClass28_4.method670(Static161.aClass153_2.anIntArray253[local202]);
							if (local1036.anIntArray8 != null && local1036.anInt118 + local210 >= 0 && local1036.anInt116 + local210 < Static433.anInt7210 && local1036.anInt100 + local269 >= 0 && local1036.anInt97 + local269 < Static418.anInt6969) {
								Static151.aClass177_51.method3615(new Class5_Sub34(local202));
							}
						}
					}
				}
				Static404.aClass28_4.method668(64, 128);
				Static322.aClass243_181.anInt6915 = 2;
				Static322.aClass243_181.method5452();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!fh;B)V")
	public static void method964(@OriginalArg(0) Class5_Sub15 arg0) {
		@Pc(14) byte[] local14 = new byte[24];
		if (Static296.aClass10_5 != null) {
			@Pc(26) int local26;
			try {
				Static296.aClass10_5.method171(0L);
				Static296.aClass10_5.method168(local14);
				for (local26 = 0; local26 < 24 && local14[local26] == 0; local26++) {
				}
				if (local26 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(51) Exception local51) {
				for (local26 = 0; local26 < 24; local26++) {
					local14[local26] = -1;
				}
			}
		}
		arg0.method5557(24, local14);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILclient!za;)V")
	public static void method968(@OriginalArg(1) Class200 arg0) {
		@Pc(7) int local7 = Static285.anInt4431;
		@Pc(9) int local9 = Static381.anInt3882;
		@Pc(11) int local11 = Static78.anInt4643;
		@Pc(15) int local15 = Static335.anInt5447 - 3;
		if (Static208.aClass49_15 == null || Static335.aClass49_20 == null) {
			if (Static344.aClass243_196.method5463(Static250.anInt4071) && Static344.aClass243_196.method5463(Static249.anInt4039)) {
				Static208.aClass49_15 = arg0.method5871(Static470.method4672(Static344.aClass243_196, Static250.anInt4071, 0));
				@Pc(61) Class214 local61 = Static470.method4672(Static344.aClass243_196, Static249.anInt4039, 0);
				Static335.aClass49_20 = arg0.method5871(local61);
				local61.method4674();
				Static32.aClass49_2 = arg0.method5871(local61);
			} else {
				arg0.P(local7, local9, local11, 20, Static426.anInt7124 | 255 - Static219.anInt3645 << 24, 1);
			}
		}
		@Pc(94) int local94;
		@Pc(92) int local92;
		if (Static208.aClass49_15 != null && Static335.aClass49_20 != null) {
			local92 = (local11 - Static335.aClass49_20.YA() * 2) / Static208.aClass49_15.YA();
			for (local94 = 0; local94 < local92; local94++) {
				Static208.aClass49_15.method5785(local7 + Static335.aClass49_20.YA() + Static208.aClass49_15.YA() * local94, local9);
			}
			Static335.aClass49_20.method5785(local7, local9);
			Static32.aClass49_2.method5785(local11 + local7 - Static32.aClass49_2.YA(), local9);
		}
		Static56.aClass23_1.method5744(-1, Static226.aClass198_62.method4012(Static38.anInt4834), Static371.anInt6076 | 0xFF000000, local7 + 3, local9 - -14);
		arg0.P(local7, local9 + 20, local11, local15 - 20, 255 - Static219.anInt3645 << 24 | Static426.anInt7124, 1);
		local92 = Static290.aClass66_1.method5965();
		local94 = Static290.aClass66_1.method5974();
		@Pc(180) int local180 = 0;
		@Pc(202) int local202;
		for (@Pc(185) Class5_Sub41 local185 = (Class5_Sub41) Static122.aClass177_13.method3618(); local185 != null; local185 = (Class5_Sub41) Static122.aClass177_13.method3619()) {
			local202 = local9 + (Static18.anInt395 - 1 - local180) * 16 + 33;
			local180++;
			if (local7 < local92 && local92 < local11 + local7 && local202 - 13 < local94 && local94 < local202 + 4 && local185.aBoolean457) {
				arg0.P(local7, local202 - 12, local11, 16, Static157.anInt2734 | 255 - Static445.anInt2588 << 24, 1);
			}
		}
		if ((Static394.aClass49_23 == null || Static35.aClass49_17 == null || Static210.aClass49_16 == null) && Static344.aClass243_196.method5463(Static76.anInt1391) && Static344.aClass243_196.method5463(Static429.anInt7148) && Static344.aClass243_196.method5463(Static423.anInt7083)) {
			@Pc(282) Class214 local282 = Static470.method4672(Static344.aClass243_196, Static429.anInt7148, 0);
			Static35.aClass49_17 = arg0.method5871(local282);
			local282.method4674();
			Static170.aClass49_14 = arg0.method5871(local282);
			Static394.aClass49_23 = arg0.method5871(Static470.method4672(Static344.aClass243_196, Static76.anInt1391, 0));
			@Pc(307) Class214 local307 = Static470.method4672(Static344.aClass243_196, Static423.anInt7083, 0);
			Static210.aClass49_16 = arg0.method5871(local307);
			local307.method4674();
			Static55.aClass49_4 = arg0.method5871(local307);
		}
		local180 = 0;
		@Pc(380) int local380;
		@Pc(340) int local340;
		if (Static394.aClass49_23 != null && Static35.aClass49_17 != null && Static210.aClass49_16 != null) {
			local202 = (local11 - Static210.aClass49_16.YA() * 2) / Static394.aClass49_23.YA();
			for (local340 = 0; local340 < local202; local340++) {
				Static394.aClass49_23.method5785(Static210.aClass49_16.YA() + local7 + Static394.aClass49_23.YA() * local340, local15 + local9 - Static394.aClass49_23.ZA());
			}
			local380 = (local15 - Static210.aClass49_16.ZA() - 20) / Static35.aClass49_17.ZA();
			for (@Pc(382) int local382 = 0; local382 < local380; local382++) {
				Static35.aClass49_17.method5785(local7, local382 * Static35.aClass49_17.ZA() + local9 + 20);
				Static170.aClass49_14.method5785(local7 + local11 - Static170.aClass49_14.YA(), local9 - -(Static35.aClass49_17.ZA() * local382) + 20);
			}
			Static210.aClass49_16.method5785(local7, local9 + local15 - Static210.aClass49_16.ZA());
			Static55.aClass49_4.method5785(local11 + local7 - Static210.aClass49_16.YA(), local15 + local9 + -Static210.aClass49_16.ZA());
		}
		for (@Pc(450) Class5_Sub41 local450 = (Class5_Sub41) Static122.aClass177_13.method3618(); local450 != null; local450 = (Class5_Sub41) Static122.aClass177_13.method3619()) {
			local340 = local9 + (Static18.anInt395 - local180 - 1) * 16 + 13 + 20;
			local380 = Static371.anInt6076 | 0xFF000000;
			if (local92 > local7 && local11 + local7 > local92 && local340 - 13 < local94 && local340 + 4 > local94 && local450.aBoolean457) {
				local380 = Static424.anInt7115 | 0xFF000000;
			}
			@Pc(515) int[] local515 = null;
			if (Static403.method5362(local450.anInt6815)) {
				local515 = Static306.aClass67_3.method1452((int) local450.aLong215).anIntArray50;
			} else if (local450.anInt6820 != -1) {
				local515 = Static306.aClass67_3.method1452(local450.anInt6820).anIntArray50;
			} else if (Static449.method5910(local450.anInt6815)) {
				@Pc(539) Class5_Sub7 local539 = (Class5_Sub7) Static380.aClass252_36.method5659((long) local450.aLong215);
				if (local539 != null) {
					@Pc(544) Class2_Sub1_Sub3_Sub1 local544 = local539.aClass2_Sub1_Sub3_Sub1_1;
					@Pc(547) Class131 local547 = local544.aClass131_1;
					if (local547.anIntArray209 != null) {
						local547 = local547.method2781(Static408.aClass39_1);
					}
					if (local547 != null) {
						local515 = local547.anIntArray211;
					}
				}
			} else if (Static464.method5865(local450.anInt6815)) {
				@Pc(587) Class114 local587;
				if (local450.anInt6815 == 1003) {
					local587 = Static398.aClass256_4.method5782((int) local450.aLong215);
				} else {
					local587 = Static398.aClass256_4.method5782((int) (local450.aLong215 >>> 32 & 0x7FFFFFFFL));
				}
				if (local587.anIntArray170 != null) {
					local587 = local587.method2393(Static408.aClass39_1);
				}
				if (local587 != null) {
					local515 = local587.anIntArray167;
				}
			}
			@Pc(631) String local631 = Static381.method3064(local450);
			if (local515 != null) {
				local631 = local631 + Static211.method2803(local515);
			}
			Static56.aClass23_1.method5740(local340, Static417.anIntArray475, local380, Static324.aClass49Array11, local7 + 3, local631);
			local180++;
			if (local450.aBoolean458) {
				Static18.aClass49_1.method5785(local7 + Static21.aClass14_1.method286(local631) + 5, local340 + -12);
			}
		}
		Static285.method3516(Static78.anInt4643, Static285.anInt4431, Static335.anInt5447, Static381.anInt3882);
	}
}
