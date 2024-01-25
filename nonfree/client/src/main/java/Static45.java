import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!c", name = "d", descriptor = "[Lclient!kp;")
	public static Class137[] aClass137Array4;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	public static int anInt5486;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "[I")
	private static final int[] anIntArray372 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIII)V")
	public static void method4309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		@Pc(7) int local7 = Static285.anInt5015;
		Static62.anInt1185 = 0;
		@Pc(11) int[] local11 = Static103.anIntArray135;
		@Pc(184) int local184;
		@Pc(221) int local221;
		@Pc(267) int local267;
		@Pc(344) int local344;
		@Pc(421) int local421;
		@Pc(877) int local877;
		@Pc(527) int local527;
		for (@Pc(18) int local18 = 0; local18 < local7 + Static328.anInt5608; local18++) {
			@Pc(22) Class54 local22 = null;
			@Pc(31) Class25_Sub5_Sub1 local31;
			if (local7 > local18) {
				local31 = Static28.aClass25_Sub5_Sub1_Sub2Array1[local11[local18]];
			} else {
				local31 = Static87.aClass25_Sub5_Sub1_Sub1Array6[Static31.anIntArray30[local18 - local7]];
				local22 = ((Class25_Sub5_Sub1_Sub1) local31).aClass54_1;
				if (local22.anIntArray67 != null) {
					local22 = local22.method1148(Static320.aClass249_2);
					if (local22 == null) {
						continue;
					}
				}
			}
			if (local31.anInt4303 >= 0 && (local31.anInt4308 == Static49.anInt840 || Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94 == local31.aByte94)) {
				Static343.method4625(local31, arg1 >> 1, arg3 >> 1, local31.method3434());
				if (Static224.anIntArray240[0] >= 0) {
					if (local31.aString50 != null && (local18 >= local7 || Static128.anInt2353 == 0 || Static128.anInt2353 == 3 || Static128.anInt2353 == 1 && Static378.method2425(((Class25_Sub5_Sub1_Sub2) local31).aString51)) && Static62.anInt1185 < Static413.anInt6783) {
						Static413.anIntArray457[Static62.anInt1185] = Static451.aClass89_10.method1995(local31.aString50) / 2;
						Static413.anIntArray456[Static62.anInt1185] = Static224.anIntArray240[0];
						Static413.anIntArray459[Static62.anInt1185] = Static224.anIntArray240[1];
						Static413.anIntArray460[Static62.anInt1185] = local31.anInt4293;
						Static413.anIntArray461[Static62.anInt1185] = local31.anInt4246;
						Static413.anIntArray458[Static62.anInt1185] = local31.anInt4291;
						Static413.aStringArray46[Static62.anInt1185] = local31.aString50;
						Static62.anInt1185++;
					}
					local184 = Static224.anIntArray240[1] + arg0;
					@Pc(252) Class6[] local252;
					@Pc(259) Class72[] local259;
					@Pc(317) Class6 local317;
					if (local31.aBoolean484 || local31.anInt4312 <= Static236.anInt4213) {
						local184 -= Math.max(Static451.aClass89_10.anInt2308, Static231.aClass6Array10[0].ZA());
					} else {
						@Pc(207) byte local207 = 1;
						if (local18 < local7) {
							@Pc(216) Class25_Sub5_Sub1_Sub2 local216 = Static28.aClass25_Sub5_Sub1_Sub2Array1[local11[local18]];
							local221 = local31.method3428().anInt6468;
							if (local216.aBoolean487) {
								local207 = 2;
							}
						} else {
							local221 = local22.anInt1337;
							if (local221 == -1) {
								local221 = local31.method3428().anInt6468;
							}
						}
						@Pc(241) Class6[] local241 = Static231.aClass6Array10;
						if (local221 != -1) {
							local252 = (Class6[]) Static151.aClass102_20.method2258((long) local221);
							if (local252 == null) {
								local259 = Static460.method1579(Static448.aClass82_104, local221);
								if (local259 != null) {
									local252 = new Class6[local259.length];
									for (local267 = 0; local267 < local259.length; local267++) {
										local252[local267] = Static185.aClass34_7.method5756(local259[local267]);
									}
									Static151.aClass102_20.method2272((long) local221, local252);
								}
							}
							if (local252 != null && local252.length >= 2) {
								local241 = local252;
							}
						}
						if (local241.length <= local207) {
							local207 = 1;
						}
						@Pc(313) Class6 local313 = local241[0];
						local317 = local241[local207];
						local184 -= Math.max(Static451.aClass89_10.anInt2308, local313.ZA());
						local267 = arg2 + Static224.anIntArray240[0] - (local313.YA() >> 1);
						local344 = local313.YA() * local31.anInt4263 / 255;
						if (local31.anInt4263 > 0 && local344 < 2) {
							local344 = 2;
						}
						local313.method5894(local267, local184);
						Static185.aClass34_7.HA(local267, local184, local267 + local344, local313.ZA() + local184);
						local317.method5894(local267, local184);
						Static185.aClass34_7.ba(arg2, arg0, arg2 + arg3, arg1 + arg0);
					}
					local184 -= 2;
					if (!local31.aBoolean484) {
						@Pc(404) Class6 local404;
						if (local31.anInt4307 > Static236.anInt4213) {
							local404 = Static79.aClass6Array4[local31.aBoolean482 ? 2 : 0];
							@Pc(413) Class6 local413 = Static79.aClass6Array4[local31.aBoolean482 ? 3 : 1];
							if (local31 instanceof Class25_Sub5_Sub1_Sub1) {
								local421 = local22.anInt1323;
								if (local421 == -1) {
									local421 = local31.method3428().anInt6457;
								}
							} else {
								local421 = local31.method3428().anInt6457;
							}
							if (local421 != -1) {
								local252 = (Class6[]) Static234.aClass102_27.method2258((long) local421);
								if (local252 == null) {
									local259 = Static460.method1579(Static448.aClass82_104, local421);
									if (local259 != null) {
										local252 = new Class6[local259.length];
										for (local267 = 0; local267 < local259.length; local267++) {
											local252[local267] = Static185.aClass34_7.method5756(local259[local267]);
										}
										Static234.aClass102_27.method2272((long) local421, local252);
									}
								}
								if (local252 != null && local252.length == 4) {
									local413 = local252[local31.aBoolean482 ? 3 : 1];
									local404 = local252[local31.aBoolean482 ? 2 : 0];
								}
							}
							@Pc(520) int local520 = local31.anInt4307 - Static236.anInt4213;
							if (local31.anInt4236 >= local520) {
								local527 = local404.YA();
							} else {
								local520 -= local31.anInt4236;
								local267 = local31.anInt4254 == 0 ? 0 : (local31.anInt4245 - local520) / local31.anInt4254 * local31.anInt4254;
								local527 = local404.YA() * local267 / local31.anInt4245;
							}
							local267 = local404.ZA();
							local184 -= local267;
							local344 = arg2 + Static224.anIntArray240[0] - (local404.YA() >> 1);
							local404.method5894(local344, local184);
							Static185.aClass34_7.HA(local344, local184, local344 + local527, local184 - -local267);
							local413.method5894(local344, local184);
							local184 -= 2;
							Static185.aClass34_7.ba(arg2, arg0, arg2 + arg3, arg1 + arg0);
						}
						if (local18 < local7) {
							@Pc(656) Class25_Sub5_Sub1_Sub2 local656 = (Class25_Sub5_Sub1_Sub2) local31;
							if (local656.anInt4345 != -1) {
								local184 -= 25;
								Static39.aClass6Array2[local656.anInt4345].method5894(Static224.anIntArray240[0] + arg2 - 12, local184);
								local184 -= 2;
							}
							if (local656.anInt4354 != -1) {
								local184 -= 25;
								Static108.aClass6Array6[local656.anInt4354].method5894(arg2 + Static224.anIntArray240[0] - 12, local184);
								local184 -= 2;
							}
						} else if (local22.anInt1354 >= 0 && Static108.aClass6Array6.length > local22.anInt1354) {
							local404 = Static108.aClass6Array6[local22.anInt1354];
							local184 -= 25;
							local404.method5894(arg2 + Static224.anIntArray240[0] - (local404.YA() >> 1), local184);
							local184 -= 2;
						}
					}
					@Pc(702) Class135[] local702;
					@Pc(710) Class135 local710;
					if (!(local31 instanceof Class25_Sub5_Sub1_Sub2)) {
						local221 = 0;
						local702 = Static133.aClass135Array1;
						for (local421 = 0; local421 < local702.length; local421++) {
							local710 = local702[local421];
							if (local710 != null && local710.anInt3824 == 1 && local710.anInt3817 == Static31.anIntArray30[local18 - local7]) {
								local317 = Static94.aClass6Array5[local710.anInt3816];
								if (local317.ZA() > local221) {
									local221 = local317.ZA();
								}
								if (Static236.anInt4213 % 20 < 10) {
									local317.method5894(Static224.anIntArray240[0] + arg2 - 12, local184 + -local317.ZA());
								}
							}
						}
						if (local221 > 0) {
						}
					} else if (local18 >= 0) {
						local221 = 0;
						local702 = Static133.aClass135Array1;
						for (local421 = 0; local421 < local702.length; local421++) {
							local710 = local702[local421];
							if (local710 != null && local710.anInt3824 == 10 && local11[local18] == local710.anInt3817) {
								local317 = Static94.aClass6Array5[local710.anInt3816];
								if (local221 < local317.ZA()) {
									local221 = local317.ZA();
								}
								local317.method5894(arg2 + Static224.anIntArray240[0] - 12, local184 - local317.ZA());
							}
						}
						if (local221 > 0) {
						}
					}
					for (local221 = 0; local221 < 4; local221++) {
						if (Static236.anInt4213 < local31.anIntArray282[local221]) {
							local877 = local31.method3434() / 2;
							Static343.method4625(local31, arg1 >> 1, arg3 >> 1, local877);
							if (Static224.anIntArray240[0] > -1) {
								local421 = Static204.aClass6Array9[local31.anIntArray281[local221]].YA();
								if (local221 == 1) {
									Static224.anIntArray240[1] -= 20;
								}
								if (local221 == 2) {
									Static224.anIntArray240[0] -= local421 - 9;
									Static224.anIntArray240[1] -= 10;
								}
								if (local221 == 3) {
									Static224.anIntArray240[1] -= 10;
									Static224.anIntArray240[0] += local421 - 9;
								}
								Static204.aClass6Array9[local31.anIntArray281[local221]].method5894(Static224.anIntArray240[0] + arg2 - (local421 >> 1), Static224.anIntArray240[1] + (arg0 - 12));
								Static80.aClass76_1.method4594(0, -1, arg2 + Static224.anIntArray240[0] - 1, Integer.toString(local31.anIntArray279[local221]), arg0 + Static224.anIntArray240[1] + 3);
							}
						}
					}
				}
			}
		}
		@Pc(1025) int local1025;
		for (@Pc(1019) int local1019 = 0; local1019 < Static73.anInt1355; local1019++) {
			local1025 = Static242.anIntArray291[local1019];
			@Pc(1032) Class25_Sub5_Sub1 local1032;
			if (local1025 < 2048) {
				local1032 = Static28.aClass25_Sub5_Sub1_Sub2Array1[local1025];
			} else {
				local1032 = Static87.aClass25_Sub5_Sub1_Sub1Array6[local1025 - 2048];
			}
			local221 = Static53.anIntArray51[local1019];
			@Pc(1055) Class25_Sub5_Sub1 local1055;
			if (local221 >= 2048) {
				local1055 = Static87.aClass25_Sub5_Sub1_Sub1Array6[local221 - 2048];
			} else {
				local1055 = Static28.aClass25_Sub5_Sub1_Sub2Array1[local221];
			}
			Static61.method1287(arg1, local1032, arg3, local1055, --local1032.anInt4262, arg0, arg2);
		}
		local1025 = Static451.aClass89_10.anInt2308 + Static451.aClass89_10.anInt2311 + 2;
		for (local184 = 0; local184 < Static62.anInt1185; local184++) {
			local221 = Static413.anIntArray456[local184];
			local877 = Static413.anIntArray459[local184];
			local421 = Static413.anIntArray457[local184];
			@Pc(1112) boolean local1112 = true;
			while (local1112) {
				local1112 = false;
				for (local527 = 0; local527 < local184; local527++) {
					if (Static413.anIntArray459[local527] - local1025 < local877 + 2 && Static413.anIntArray459[local527] + 2 > local877 + -local1025 && local221 - local421 < Static413.anIntArray456[local527] - -Static413.anIntArray457[local527] && local421 + local221 > -Static413.anIntArray457[local527] + Static413.anIntArray456[local527] && Static413.anIntArray459[local527] - local1025 < local877) {
						local877 = Static413.anIntArray459[local527] - local1025;
						local1112 = true;
					}
				}
			}
			Static413.anIntArray459[local184] = local877;
			@Pc(1198) String local1198 = Static413.aStringArray46[local184];
			if (Static353.anInt6051 == 0) {
				local267 = 16776960;
				if (Static413.anIntArray460[local184] < 6) {
					local267 = anIntArray372[Static413.anIntArray460[local184]];
				}
				if (Static413.anIntArray460[local184] == 6) {
					local267 = Static49.anInt840 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static413.anIntArray460[local184] == 7) {
					local267 = Static49.anInt840 % 20 >= 10 ? 65535 : 255;
				}
				if (Static413.anIntArray460[local184] == 8) {
					local267 = Static49.anInt840 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static413.anIntArray460[local184] == 9) {
					local344 = 150 - Static413.anIntArray458[local184];
					if (local344 < 50) {
						local267 = local344 * 1280 + 16711680;
					} else if (local344 < 100) {
						local267 = 16776960 - (local344 - 50) * 327680;
					} else if (local344 < 150) {
						local267 = local344 * 5 + 64780;
					}
				}
				if (Static413.anIntArray460[local184] == 10) {
					local344 = 150 - Static413.anIntArray458[local184];
					if (local344 < 50) {
						local267 = local344 * 5 + 16711680;
					} else if (local344 < 100) {
						local267 = 16711935 - (local344 - 50) * 327680;
					} else if (local344 < 150) {
						local267 = (local344 + -100) * 327680 + 500 + 255 - local344 * 5;
					}
				}
				if (Static413.anIntArray460[local184] == 11) {
					local344 = 150 - Static413.anIntArray458[local184];
					if (local344 < 50) {
						local267 = 16777215 - local344 * 327685;
					} else if (local344 < 100) {
						local267 = local344 * 327685 + 65280 - 16384250;
					} else if (local344 < 150) {
						local267 = 16777215 + 32768000 - local344 * 327680;
					}
				}
				local344 = local267 | 0xFF000000;
				if (Static413.anIntArray461[local184] == 0) {
					Static121.aClass76_2.method4594(-16777216, local344, local221 + arg2, local1198, arg0 + local877);
				}
				if (Static413.anIntArray461[local184] == 1) {
					Static121.aClass76_2.method4589(local344, local877 + arg0, arg2 + local221, local1198, Static49.anInt840);
				}
				if (Static413.anIntArray461[local184] == 2) {
					Static121.aClass76_2.method4593(local1198, arg0 + local877, local221 + arg2, local344, Static49.anInt840);
				}
				if (Static413.anIntArray461[local184] == 3) {
					Static121.aClass76_2.method4575(150 - Static413.anIntArray458[local184], local344, Static49.anInt840, local1198, arg2 + local221, local877 + arg0);
				}
				@Pc(1542) int local1542;
				if (Static413.anIntArray461[local184] == 4) {
					local1542 = (150 - Static413.anIntArray458[local184]) * (Static451.aClass89_10.method1995(local1198) + 100) / 150;
					Static185.aClass34_7.HA(arg2 + local221 - 50, arg0, local221 + arg2 + 50, arg0 - -arg1);
					Static121.aClass76_2.method4587(-16777216, arg0 + local877, local1198, local344, arg2 + local221 + 50 - local1542);
					Static185.aClass34_7.ba(arg2, arg0, arg2 + arg3, arg0 - -arg1);
				}
				if (Static413.anIntArray461[local184] == 5) {
					local1542 = 150 - Static413.anIntArray458[local184];
					@Pc(1605) int local1605 = 0;
					if (local1542 < 25) {
						local1605 = local1542 - 25;
					} else if (local1542 > 125) {
						local1605 = local1542 - 125;
					}
					@Pc(1630) int local1630 = Static451.aClass89_10.anInt2308 + Static451.aClass89_10.anInt2311;
					Static185.aClass34_7.HA(arg2, arg0 + local877 - local1630 - 1, arg3 + arg2, local877 + arg0 + 5);
					Static121.aClass76_2.method4594(-16777216, local344, local221 + arg2, local1198, local877 + arg0 + local1605);
					Static185.aClass34_7.ba(arg2, arg0, arg2 + arg3, arg1 + arg0);
				}
			} else {
				Static121.aClass76_2.method4594(-16777216, -256, arg2 + local221, local1198, arg0 + local877);
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IZI)Z")
	public static boolean method4310(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static134.method2066(arg0, arg1) | (arg1 & 0x60000) != 0 || Static318.method2926(arg1, arg0) || Static403.method5239(arg0, arg1);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IZI)Z")
	public static boolean method4312(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static159.method2300(arg0, arg1) || Static318.method2926(arg0, arg1);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Lclient!gb;")
	public static Class88 method4313(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static167.aFloat24 == 3.0D) {
				return Static380.aClass88_8;
			}
			if ((double) Static167.aFloat24 == 4.0D) {
				return Static151.aClass88_3;
			}
			if ((double) Static167.aFloat24 == 6.0D) {
				return Static199.aClass88_4;
			}
			if ((double) Static167.aFloat24 >= 8.0D) {
				return Static71.aClass88_2;
			}
		} else if (arg0 == 1) {
			if ((double) Static167.aFloat24 == 3.0D) {
				return Static199.aClass88_4;
			}
			if ((double) Static167.aFloat24 == 4.0D) {
				return Static71.aClass88_2;
			}
			if ((double) Static167.aFloat24 == 6.0D) {
				return Static201.aClass88_5;
			}
			if ((double) Static167.aFloat24 >= 8.0D) {
				return Static350.aClass88_7;
			}
		} else if (arg0 == 2) {
			if ((double) Static167.aFloat24 == 3.0D) {
				return Static201.aClass88_5;
			}
			if ((double) Static167.aFloat24 == 4.0D) {
				return Static350.aClass88_7;
			}
			if ((double) Static167.aFloat24 == 6.0D) {
				return Static289.aClass88_6;
			}
			if ((double) Static167.aFloat24 >= 8.0D) {
				return Static2.aClass88_1;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!za;B)V")
	public static void method4314(@OriginalArg(0) Class34 arg0) {
		if (Static110.aClass227_13.method4975() == 0) {
			return;
		}
		@Pc(61) Class1_Sub34 local61;
		if (Static14.anInt293 == 0) {
			for (local61 = (Class1_Sub34) Static110.aClass227_13.method4967(); local61 != null; local61 = (Class1_Sub34) Static110.aClass227_13.method4973()) {
				Static342.aClass155_2.method3539(arg0, local61.aBoolean615 ? Static447.aClass25_Sub5_Sub1_Sub2_4.aClass173_1 : null, local61.anInt5429, false, local61.anInt5428, local61.anInt5424, local61.anInt5426, local61.anInt5425, arg0, false, Static80.aClass76_1);
				local61.method5915();
			}
			Static65.method1072();
			return;
		}
		if (Static289.aClass34_9 == null) {
			@Pc(31) Canvas local31 = new Canvas();
			local31.setSize(36, 32);
			Static289.aClass34_9 = Static459.method5776(Static183.aClass83_2, local31, Static310.anInterface6_4, 0, 0);
			Static287.aClass76_3 = Static289.aClass34_9.method5754(Static341.method4571(Static378.anInt2799, Static332.aClass82_76), Static460.method1579(Static448.aClass82_104, Static378.anInt2799));
		}
		for (local61 = (Class1_Sub34) Static110.aClass227_13.method4967(); local61 != null; local61 = (Class1_Sub34) Static110.aClass227_13.method4973()) {
			Static342.aClass155_2.method3539(arg0, local61.aBoolean615 ? Static447.aClass25_Sub5_Sub1_Sub2_4.aClass173_1 : null, local61.anInt5429, false, local61.anInt5428, local61.anInt5424, local61.anInt5426, local61.anInt5425, Static289.aClass34_9, false, Static287.aClass76_3);
			local61.method5915();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;ILjava/lang/String;I)V")
	public static void method4316(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static367.anIntArray418[local7] = Static367.anIntArray418[local7 - 1];
			Static270.anIntArray307[local7] = Static270.anIntArray307[local7 - 1];
			Static294.aStringArray31[local7] = Static294.aStringArray31[local7 - 1];
			Static390.aStringArray45[local7] = Static390.aStringArray45[local7 - 1];
			Static174.aStringArray14[local7] = Static174.aStringArray14[local7 - 1];
			Static452.aStringArray48[local7] = Static452.aStringArray48[local7 - 1];
			Static384.anIntArray427[local7] = Static384.anIntArray427[local7 - 1];
		}
		Static367.anIntArray418[0] = arg4;
		Static294.aStringArray31[0] = arg3;
		Static270.anIntArray307[0] = arg6;
		Static390.aStringArray45[0] = arg5;
		Static174.aStringArray14[0] = arg1;
		Static150.anInt6764++;
		Static146.anInt2528 = Static18.anInt379;
		Static452.aStringArray48[0] = arg0;
		Static384.anIntArray427[0] = arg2;
	}
}
