import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BI)V")
	public static void method5742(@OriginalArg(1) int arg0) {
		Static187.anInt3756 = arg0;
		Static294.aClass267_84.method6011();
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ljava/util/Random;II)I")
	public static int method5743(@OriginalArg(0) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static131.method2284(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(39) int local39 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(42) int local42;
			do {
				local42 = arg0.nextInt();
			} while (local42 >= local39);
			return Static287.method4052(local42, arg1);
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V")
	public static void method5744() {
		if (Static197.anInt3945 == 0 || Static197.anInt3945 == 5) {
			return;
		}
		try {
			if (++Static360.anInt6115 > 2000) {
				if (Static160.aClass253_3 != null) {
					Static160.aClass253_3.method5484();
					Static160.aClass253_3 = null;
				}
				if (Static168.anInt3346 >= 1) {
					Static197.anInt3945 = 0;
					Static150.method2585(-5);
					return;
				}
				if (Static156.anInt3163 == 2 || Static156.anInt3163 == 3) {
					Static87.aClass21_2.aBoolean34 = !Static87.aClass21_2.aBoolean34;
				} else {
					Static410.aClass21_5.aBoolean34 = !Static410.aClass21_5.aBoolean34;
				}
				Static360.anInt6115 = 0;
				Static168.anInt3346++;
				Static197.anInt3945 = 1;
			}
			if (Static197.anInt3945 == 1) {
				if (Static156.anInt3163 == 2 || Static156.anInt3163 == 3) {
					Static42.aClass270_1 = Static171.aClass159_1.method3518(Static87.aClass21_2.method330(), Static87.aClass21_2.aString5);
				} else {
					Static42.aClass270_1 = Static171.aClass159_1.method3518(Static410.aClass21_5.method330(), Static410.aClass21_5.aString5);
				}
				Static197.anInt3945 = 2;
			}
			@Pc(174) int local174;
			if (Static197.anInt3945 == 2) {
				if (Static42.aClass270_1.anInt7548 == 2) {
					throw new IOException();
				}
				if (Static42.aClass270_1.anInt7548 != 1) {
					return;
				}
				Static160.aClass253_3 = new Class253((Socket) Static42.aClass270_1.anObject9, Static171.aClass159_1);
				Static42.aClass270_1 = null;
				@Pc(142) long local142 = Static28.aLong20 = Static269.method3820(Static2.aString1);
				@Pc(149) int local149 = (int) (local142 >> 16 & 0x1FL);
				Static337.aClass10_Sub8_Sub2_2.anInt2989 = 0;
				Static337.aClass10_Sub8_Sub2_2.method2458(Static53.aClass216_1.anInt6089);
				Static337.aClass10_Sub8_Sub2_2.method2458(local149);
				Static160.aClass253_3.method5494(2, Static337.aClass10_Sub8_Sub2_2.aByteArray44);
				Static67.method1250();
				local174 = Static160.aClass253_3.method5493();
				Static67.method1250();
				if (local174 != 0) {
					Static197.anInt3945 = 0;
					Static150.method2585(local174);
					Static160.aClass253_3.method5484();
					Static160.aClass253_3 = null;
					Static347.method4710();
					return;
				}
				Static197.anInt3945 = 3;
			}
			if (Static197.anInt3945 == 3) {
				if (Static160.aClass253_3.method5486() < 8) {
					return;
				}
				Static160.aClass253_3.method5487(0, 8, Static203.aClass10_Sub8_Sub2_1.aByteArray44);
				Static203.aClass10_Sub8_Sub2_1.anInt2989 = 0;
				Static98.aLong67 = Static203.aClass10_Sub8_Sub2_1.method2521();
				@Pc(226) Class10_Sub8 local226 = new Class10_Sub8(70);
				@Pc(229) int[] local229 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static98.aLong67 >> 32), (int) Static98.aLong67 };
				local226.method2458(10);
				local226.method2506(local229[0]);
				local226.method2506(local229[1]);
				local226.method2506(local229[2]);
				local226.method2506(local229[3]);
				local226.method2470(Static269.method3820(Static2.aString1));
				local226.method2465(Static33.aString67);
				local226.method2489(Static394.aBigInteger2, Static369.aBigInteger1);
				@Pc(300) Class10_Sub8_Sub2 local300 = Static337.aClass10_Sub8_Sub2_2;
				local300.anInt2989 = 0;
				if (Static156.anInt3163 == 2 || Static156.anInt3163 == 3) {
					if (Static358.anInt6086 == 12) {
						local300.method2458(Static53.aClass216_5.anInt6089);
					} else {
						local300.method2458(Static53.aClass216_3.anInt6089);
					}
					local300.method2509(0);
					local174 = local300.anInt2989;
					local300.method2506(597);
					local300.method2458(Static109.anInt2181);
					local300.method2458(Static211.method3254());
					local300.method2509(Static90.anInt1891);
					local300.method2509(Static340.anInt5756);
					local300.method2458(Static361.aClass85_Sub1_1.anInt2486);
					Static282.method4002(local300);
					local300.method2465(Static407.aString68);
					local300.method2506(Static298.anInt5158);
					@Pc(434) Class10_Sub8 local434 = Static361.aClass85_Sub1_1.method2112();
					local300.method2458(local434.anInt2989);
					local300.method2457(local434.anInt2989, local434.aByteArray44);
					Static419.aBoolean463 = true;
					local300.method2509(Static108.anInt2167);
					local300.method2509(Static90.anInt1893);
					Static68.method1353();
					local300.method2457(local226.anInt2989, local226.aByteArray44);
					local300.method2488(local300.anInt2989 - local174);
				} else {
					local300.method2458(Static53.aClass216_6.anInt6089);
					local300.method2509(0);
					local174 = local300.anInt2989;
					local300.method2506(597);
					local300.method2458(Static102.aClass147_3.anInt4151);
					local300.method2458(Static191.anInt3842);
					Static282.method4002(local300);
					local300.method2465(Static407.aString68);
					local300.method2506(Static298.anInt5158);
					Static68.method1353();
					local300.method2457(local226.anInt2989, local226.aByteArray44);
					local300.method2488(local300.anInt2989 - local174);
				}
				Static160.aClass253_3.method5494(local300.anInt2989, local300.aByteArray44);
				local300.method2531(local229);
				for (local174 = 0; local174 < 4; local174++) {
					local229[local174] += 50;
				}
				Static203.aClass10_Sub8_Sub2_1.method2531(local229);
				Static197.anInt3945 = 4;
			}
			@Pc(531) int local531;
			if (Static197.anInt3945 == 4) {
				if (Static160.aClass253_3.method5486() < 1) {
					return;
				}
				local531 = Static160.aClass253_3.method5493();
				if (local531 == 21) {
					Static197.anInt3945 = 7;
				} else if (local531 == 29) {
					Static197.anInt3945 = 13;
				} else if (local531 == 1) {
					Static197.anInt3945 = 5;
					Static150.method2585(local531);
					return;
				} else if (local531 == 2) {
					Static197.anInt3945 = 8;
				} else if (local531 == 15) {
					Static10.anInt154 = -2;
					Static197.anInt3945 = 14;
				} else if (local531 == 23 && Static168.anInt3346 < 1) {
					Static168.anInt3346++;
					Static197.anInt3945 = 1;
					Static360.anInt6115 = 0;
					Static160.aClass253_3.method5484();
					Static160.aClass253_3 = null;
					return;
				} else {
					Static197.anInt3945 = 0;
					Static150.method2585(local531);
					Static160.aClass253_3.method5484();
					Static160.aClass253_3 = null;
					Static347.method4710();
					return;
				}
			}
			if (Static197.anInt3945 == 6) {
				Static337.aClass10_Sub8_Sub2_2.anInt2989 = 0;
				Static337.aClass10_Sub8_Sub2_2.method2530(Static53.aClass216_4.anInt6089);
				Static160.aClass253_3.method5494(Static337.aClass10_Sub8_Sub2_2.anInt2989, Static337.aClass10_Sub8_Sub2_2.aByteArray44);
				Static197.anInt3945 = 4;
			} else if (Static197.anInt3945 == 7) {
				if (Static160.aClass253_3.method5486() >= 1) {
					Static424.anInt7138 = (Static160.aClass253_3.method5493() + 3) * 60;
					Static197.anInt3945 = 0;
					Static150.method2585(21);
					Static160.aClass253_3.method5484();
					Static160.aClass253_3 = null;
					Static347.method4710();
				}
			} else if (Static197.anInt3945 == 13) {
				if (Static160.aClass253_3.method5486() >= 1) {
					Static111.anInt5894 = Static160.aClass253_3.method5493();
					Static197.anInt3945 = 0;
					Static150.method2585(29);
					Static160.aClass253_3.method5484();
					Static160.aClass253_3 = null;
					Static347.method4710();
				}
			} else if (Static197.anInt3945 != 8) {
				@Pc(720) Class10_Sub8_Sub2 local720;
				if (Static197.anInt3945 == 9) {
					local720 = Static203.aClass10_Sub8_Sub2_1;
					if (Static156.anInt3163 == 3) {
						Static159.aBoolean218 = true;
					} else {
						Static159.aBoolean218 = false;
					}
					if (Static156.anInt3163 == 2 || Static156.anInt3163 == 3) {
						if (Static160.aClass253_3.method5486() < Static249.anInt4486) {
							return;
						}
						Static160.aClass253_3.method5487(0, Static249.anInt4486, local720.aByteArray44);
						local720.anInt2989 = 0;
						Static200.anInt3974 = local720.method2502();
						Static458.anInt7601 = local720.method2502();
						Static376.aBoolean422 = local720.method2502() == 1;
						Static111.aBoolean380 = local720.method2502() == 1;
						Static14.aBoolean19 = local720.method2502() == 1;
						Static269.aBoolean320 = local720.method2502() == 1;
						Static245.anInt4435 = local720.method2485();
						Static314.aBoolean360 = local720.method2502() == 1;
						Static456.anInt7588 = local720.method2508();
						Static175.aBoolean118 = local720.method2502() == 1;
						if (Static156.anInt3163 == 3) {
							@Pc(839) boolean local839 = local720.method2502() == 1;
							if (local839) {
								@Pc(845) long local845 = local720.method2521();
								@Pc(849) String local849 = Static330.method1927(local845);
								@Pc(853) int local853 = local720.method2502();
								@Pc(856) byte[] local856 = new byte[local853];
								local720.method2529(local856, local853);
								@Pc(866) String local866 = Static198.method3138(local856);
								@Pc(868) Class108 local868 = null;
								try {
									@Pc(874) Class270 local874 = Static171.aClass159_1.method3514("3", false);
									while (local874.anInt7548 == 0) {
										Static328.method5696(1L);
									}
									if (local874.anInt7548 == 1) {
										local868 = (Class108) local874.anObject9;
										@Pc(904) int local904 = local849.length() + local866.length() + 4 + 3 + 2;
										if (local904 > 50) {
											throw new RuntimeException(">50");
										}
										@Pc(921) Class10_Sub8 local921 = new Class10_Sub8(local904 + 1);
										local921.method2458(local904);
										local921.method2458(0);
										local921.method2479(local849);
										local921.method2479(local866);
										local921.method2494();
										local868.method2648(local921.aByteArray44, 0, local921.anInt2989);
									}
								} catch (@Pc(951) Exception local951) {
								}
								try {
									if (local868 != null) {
										local868.method2643();
									}
								} catch (@Pc(958) Exception local958) {
								}
							}
						}
						Static342.aClass237_4.method5209(Static175.aBoolean118);
						Static313.aClass272_2.method6067(Static175.aBoolean118);
						Static448.aClass38_4.method861(Static175.aBoolean118);
					} else if (Static160.aClass253_3.method5486() >= Static249.anInt4486) {
						Static160.aClass253_3.method5487(0, Static249.anInt4486, local720.aByteArray44);
						local720.anInt2989 = 0;
						Static200.anInt3974 = local720.method2502();
						Static458.anInt7601 = local720.method2502();
						Static376.aBoolean422 = local720.method2502() == 1;
						Static111.aBoolean380 = local720.method2502() == 1;
						Static14.aBoolean19 = local720.method2502() == 1;
						Static74.anInt1518 = local720.method2485();
						Static314.aBoolean360 = Static74.anInt1518 > 0;
						Static76.anInt1549 = local720.method2485();
						Static429.anInt7202 = local720.method2485();
						Static339.anInt5722 = local720.method2485();
						Static177.anInt3654 = local720.method2459();
						Static297.aClass270_5 = Static171.aClass159_1.method3512(Static177.anInt3654);
						Static93.anInt7577 = local720.method2502();
						Static363.anInt6158 = local720.method2485();
						Static423.anInt7106 = local720.method2485();
						Static14.aBoolean17 = local720.method2502() == 1;
						Static263.aClass24_Sub3_Sub2_Sub2_4.aString58 = Static263.aClass24_Sub3_Sub2_Sub2_4.aString57 = local720.method2482();
						Static390.aClass21_4 = new Class21();
						Static390.aClass21_4.anInt407 = local720.method2485();
						if (Static390.aClass21_4.anInt407 == 65535) {
							Static390.aClass21_4.anInt407 = -1;
						}
						Static390.aClass21_4.aString5 = local720.method2482();
						if (Static284.aClass151_8 != Static110.aClass151_5) {
							Static390.aClass21_4.anInt404 = Static390.aClass21_4.anInt407 + 50000;
							Static390.aClass21_4.anInt411 = Static390.aClass21_4.anInt407 + 40000;
						}
						if (Static284.aClass151_8 != Static208.aClass151_6 && (Static87.aClass21_2.method329(Static265.aClass21_3) || Static87.aClass21_2.method329(Static78.aClass21_1))) {
							Static87.aClass21_2 = Static390.aClass21_4;
						}
					} else {
						return;
					}
					if (Static376.aBoolean422 && !Static14.aBoolean19 || Static314.aBoolean360) {
						try {
							Static464.method2259(Static171.aClass159_1.anApplet1, "zap");
						} catch (@Pc(1170) Throwable local1170) {
							if (Static306.aBoolean355) {
								try {
									Static171.aClass159_1.anApplet1.getAppletContext().showDocument(new URL(Static171.aClass159_1.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1186) Exception local1186) {
								}
							}
						}
					} else {
						try {
							Static464.method2259(Static171.aClass159_1.anApplet1, "unzap");
						} catch (@Pc(1160) Throwable local1160) {
						}
					}
					if (Static110.aClass151_5 == Static284.aClass151_8) {
						try {
							Static464.method2259(Static171.aClass159_1.anApplet1, "loggedin");
						} catch (@Pc(1198) Throwable local1198) {
						}
					}
					if (Static156.anInt3163 != 2 && Static156.anInt3163 != 3) {
						Static197.anInt3945 = 0;
						Static150.method2585(2);
						Static393.method5220();
						Static458.method6071(6);
						Static116.aClass217_52 = null;
						return;
					}
					Static197.anInt3945 = 11;
				}
				if (Static197.anInt3945 == 11) {
					if (Static160.aClass253_3.method5486() < 3) {
						return;
					}
					Static160.aClass253_3.method5487(0, 3, Static203.aClass10_Sub8_Sub2_1.aByteArray44);
					Static197.anInt3945 = 12;
				}
				if (Static197.anInt3945 == 12) {
					local720 = Static203.aClass10_Sub8_Sub2_1;
					local720.anInt2989 = 0;
					if (local720.method2524()) {
						if (Static160.aClass253_3.method5486() < 1) {
							return;
						}
						Static160.aClass253_3.method5487(3, 1, local720.aByteArray44);
					}
					Static116.aClass217_52 = Static353.method4778()[local720.method2533()];
					Static10.anInt154 = local720.method2485();
					Static197.anInt3945 = 10;
				}
				if (Static197.anInt3945 == 10) {
					if (Static160.aClass253_3.method5486() >= Static10.anInt154) {
						Static160.aClass253_3.method5487(0, Static10.anInt154, Static203.aClass10_Sub8_Sub2_1.aByteArray44);
						Static203.aClass10_Sub8_Sub2_1.anInt2989 = 0;
						Static197.anInt3945 = 0;
						local531 = Static10.anInt154;
						Static150.method2585(2);
						Static96.method1756();
						Static207.method3220(Static203.aClass10_Sub8_Sub2_1);
						Static444.anInt7445 = -1;
						Static432.method5718();
						if (local531 != Static203.aClass10_Sub8_Sub2_1.anInt2989) {
							throw new RuntimeException("lswp pos:" + Static203.aClass10_Sub8_Sub2_1.anInt2989 + " psize:" + local531);
						}
						Static116.aClass217_52 = null;
					}
				} else if (Static197.anInt3945 == 14) {
					if (Static10.anInt154 == -2) {
						if (Static160.aClass253_3.method5486() < 2) {
							return;
						}
						Static160.aClass253_3.method5487(0, 2, Static203.aClass10_Sub8_Sub2_1.aByteArray44);
						Static203.aClass10_Sub8_Sub2_1.anInt2989 = 0;
						Static10.anInt154 = Static203.aClass10_Sub8_Sub2_1.method2485();
					}
					if (Static160.aClass253_3.method5486() >= Static10.anInt154) {
						Static160.aClass253_3.method5487(0, Static10.anInt154, Static203.aClass10_Sub8_Sub2_1.aByteArray44);
						Static203.aClass10_Sub8_Sub2_1.anInt2989 = 0;
						local531 = Static10.anInt154;
						Static197.anInt3945 = 0;
						Static150.method2585(15);
						Static388.method2104();
						Static207.method3220(Static203.aClass10_Sub8_Sub2_1);
						if (local531 != Static203.aClass10_Sub8_Sub2_1.anInt2989) {
							throw new RuntimeException("lswpr pos:" + Static203.aClass10_Sub8_Sub2_1.anInt2989 + " psize:" + local531);
						}
						Static116.aClass217_52 = null;
					}
				}
			} else if (Static160.aClass253_3.method5486() >= 1) {
				Static249.anInt4486 = Static160.aClass253_3.method5493();
				Static197.anInt3945 = 9;
			}
		} catch (@Pc(1428) IOException local1428) {
			if (Static160.aClass253_3 != null) {
				Static160.aClass253_3.method5484();
				Static160.aClass253_3 = null;
			}
			if (Static168.anInt3346 >= 1) {
				Static197.anInt3945 = 0;
				Static150.method2585(-4);
				Static347.method4710();
			} else {
				Static197.anInt3945 = 1;
				Static360.anInt6115 = 0;
				if (Static156.anInt3163 == 2 || Static156.anInt3163 == 3) {
					Static87.aClass21_2.aBoolean34 = !Static87.aClass21_2.aBoolean34;
				} else {
					Static410.aClass21_5.aBoolean34 = !Static410.aClass21_5.aBoolean34;
				}
				Static168.anInt3346++;
			}
		}
	}
}
