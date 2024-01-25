import java.io.IOException;
import java.math.BigInteger;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!ip", name = "h", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_113 = new Class56(6, -2);

	@OriginalMember(owner = "client!ip", name = "i", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!ip", name = "j", descriptor = "I")
	public static int anInt3128 = -2;

	@OriginalMember(owner = "client!ip", name = "k", descriptor = "I")
	public static int anInt3129 = 20;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)Z")
	public static boolean method2395(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 3 || arg0 == 4 || arg0 == 5;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
	public static void method2396() {
		@Pc(1) Class137 local1 = Static144.aClass137_23;
		synchronized (Static144.aClass137_23) {
			Static144.aClass137_23.method2737();
		}
		local1 = Static264.aClass137_46;
		synchronized (Static264.aClass137_46) {
			Static264.aClass137_46.method2737();
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!gp;Z)Z")
	public static boolean method2397(@OriginalArg(0) Class100 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean163) {
			return false;
		} else if (!arg0.method1962(Static292.anInterface12_2)) {
			return false;
		} else if (Static143.aClass67_14.method1429((long) arg0.anInt2487) == null) {
			return Static333.aClass67_29.method1429((long) arg0.anInt2488) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(BLclient!ni;)Z")
	public static boolean method2398(@OriginalArg(1) Class178 arg0) {
		return Static194.aClass178_19 == arg0 || Static219.aClass178_13 == arg0 || Static26.aClass178_6 == arg0 || Static39.aClass178_7 == arg0;
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(B)V")
	public static void method2399() {
		if (Static166.anInt3041 == 0 || Static166.anInt3041 == 5) {
			return;
		}
		try {
			if (++Static263.anInt4362 > 2000) {
				if (Static338.aClass152_4 != null) {
					Static338.aClass152_4.method2924();
					Static338.aClass152_4 = null;
				}
				if (Static364.anInt6029 >= 1) {
					Static166.anInt3041 = 0;
					Static179.method2497(-5);
					return;
				}
				Static166.anInt3041 = 1;
				Static364.anInt6029++;
				if (Static50.anInt812 == 2 || Static50.anInt812 == 3) {
					Static338.aClass220_5.aBoolean406 = !Static338.aClass220_5.aBoolean406;
				} else {
					Static240.aClass220_3.aBoolean406 = !Static240.aClass220_3.aBoolean406;
				}
				Static263.anInt4362 = 0;
			}
			if (Static166.anInt3041 == 1) {
				if (Static50.anInt812 == 2 || Static50.anInt812 == 3) {
					Static329.aClass45_7 = Static24.aClass196_1.method3914(Static338.aClass220_5.aString62, Static338.aClass220_5.method4602());
				} else {
					Static329.aClass45_7 = Static24.aClass196_1.method3914(Static240.aClass220_3.aString62, Static240.aClass220_3.method4602());
				}
				Static166.anInt3041 = 2;
			}
			@Pc(174) int local174;
			if (Static166.anInt3041 == 2) {
				if (Static329.aClass45_7.anInt1129 == 2) {
					throw new IOException();
				}
				if (Static329.aClass45_7.anInt1129 != 1) {
					return;
				}
				Static338.aClass152_4 = new Class152((Socket) Static329.aClass45_7.anObject5, Static24.aClass196_1);
				Static329.aClass45_7 = null;
				@Pc(142) long local142 = Static182.aLong93 = Static298.method3885(Static76.aString7);
				Static247.aClass4_Sub9_Sub2_2.anInt6207 = 0;
				@Pc(152) int local152 = (int) (local142 >> 16 & 0x1FL);
				Static247.aClass4_Sub9_Sub2_2.method4999(Static389.aClass44_1.anInt1111);
				Static247.aClass4_Sub9_Sub2_2.method4999(local152);
				Static338.aClass152_4.method2926(2, Static247.aClass4_Sub9_Sub2_2.aByteArray81);
				Static170.method5836();
				local174 = Static338.aClass152_4.method2925();
				Static170.method5836();
				if (local174 != 0) {
					Static166.anInt3041 = 0;
					Static179.method2497(local174);
					Static338.aClass152_4.method2924();
					Static338.aClass152_4 = null;
					return;
				}
				Static166.anInt3041 = 3;
			}
			if (Static166.anInt3041 == 3) {
				if (Static338.aClass152_4.method2921() < 8) {
					return;
				}
				Static338.aClass152_4.method2923(8, Static56.aClass4_Sub9_Sub2_1.aByteArray81, 0);
				Static56.aClass4_Sub9_Sub2_1.anInt6207 = 0;
				Static190.aLong95 = Static56.aClass4_Sub9_Sub2_1.method5024();
				@Pc(221) Class4_Sub9 local221 = new Class4_Sub9(70);
				@Pc(224) int[] local224 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static190.aLong95 >> 32), (int) Static190.aLong95 };
				local221.method4999(10);
				local221.method5047(local224[0]);
				local221.method5047(local224[1]);
				local221.method5047(local224[2]);
				local221.method5047(local224[3]);
				local221.method5030(Static298.method3885(Static76.aString7));
				local221.method5039(Static160.aString55);
				local221.method5002(aBigInteger1, Static457.aBigInteger2);
				@Pc(299) Class4_Sub9_Sub2 local299 = Static247.aClass4_Sub9_Sub2_2;
				local299.anInt6207 = 0;
				if (Static50.anInt812 == 2 || Static50.anInt812 == 3) {
					if (Static8.anInt119 == 12) {
						local299.method4999(Static389.aClass44_5.anInt1111);
					} else {
						local299.method4999(Static389.aClass44_3.anInt1111);
					}
					local299.method5029(0);
					local174 = local299.anInt6207;
					local299.method5047(593);
					local299.method4999(Static11.anInt178);
					local299.method4999(Static37.method500());
					local299.method5029(Static345.anInt5723);
					local299.method5029(Static120.anInt2134);
					local299.method4999(Static413.aClass49_Sub1_1.anInt3200);
					Static247.method3253(local299);
					local299.method5039(Static7.aString2);
					local299.method5047(Static400.anInt6511);
					@Pc(432) Class4_Sub9 local432 = Static413.aClass49_Sub1_1.method2491();
					local299.method4999(local432.anInt6207);
					local299.method5052(local432.anInt6207, local432.aByteArray81);
					Static340.aBoolean392 = true;
					local299.method5029(Static318.anInt5169);
					Static241.method3216();
					local299.method5052(local221.anInt6207, local221.aByteArray81);
					local299.method5050(local299.anInt6207 - local174);
				} else {
					local299.method4999(Static389.aClass44_6.anInt1111);
					local299.method5029(0);
					local174 = local299.anInt6207;
					local299.method5047(593);
					local299.method4999(Static231.aClass6_7.anInt96);
					local299.method4999(Static429.anInt6999);
					Static247.method3253(local299);
					local299.method5039(Static7.aString2);
					local299.method5047(Static400.anInt6511);
					Static241.method3216();
					local299.method5052(local221.anInt6207, local221.aByteArray81);
					local299.method5050(local299.anInt6207 - local174);
				}
				Static338.aClass152_4.method2926(local299.anInt6207, local299.aByteArray81);
				local299.method5068(local224);
				for (local174 = 0; local174 < 4; local174++) {
					local224[local174] += 50;
				}
				Static56.aClass4_Sub9_Sub2_1.method5068(local224);
				Static166.anInt3041 = 4;
			}
			@Pc(517) int local517;
			if (Static166.anInt3041 == 4) {
				if (Static338.aClass152_4.method2921() < 1) {
					return;
				}
				local517 = Static338.aClass152_4.method2925();
				if (local517 == 21) {
					Static166.anInt3041 = 7;
				} else if (local517 == 29) {
					Static166.anInt3041 = 13;
				} else if (local517 == 1) {
					Static166.anInt3041 = 5;
					Static179.method2497(local517);
					return;
				} else if (local517 == 2) {
					Static166.anInt3041 = 8;
				} else if (local517 == 15) {
					Static166.anInt3041 = 14;
					Static313.anInt5082 = -2;
				} else if (local517 == 23 && Static364.anInt6029 < 1) {
					Static364.anInt6029++;
					Static166.anInt3041 = 1;
					Static263.anInt4362 = 0;
					Static338.aClass152_4.method2924();
					Static338.aClass152_4 = null;
					return;
				} else {
					Static166.anInt3041 = 0;
					Static179.method2497(local517);
					Static338.aClass152_4.method2924();
					Static338.aClass152_4 = null;
					Static172.method2394();
					return;
				}
			}
			if (Static166.anInt3041 == 6) {
				Static247.aClass4_Sub9_Sub2_2.anInt6207 = 0;
				Static247.aClass4_Sub9_Sub2_2.method5078(Static389.aClass44_4.anInt1111);
				Static338.aClass152_4.method2926(Static247.aClass4_Sub9_Sub2_2.anInt6207, Static247.aClass4_Sub9_Sub2_2.aByteArray81);
				Static166.anInt3041 = 4;
			} else if (Static166.anInt3041 == 7) {
				if (Static338.aClass152_4.method2921() >= 1) {
					Static308.anInt5038 = Static338.aClass152_4.method2925() * 60 + 180;
					Static166.anInt3041 = 0;
					Static179.method2497(21);
					Static338.aClass152_4.method2924();
					Static338.aClass152_4 = null;
					Static172.method2394();
				}
			} else if (Static166.anInt3041 == 13) {
				if (Static338.aClass152_4.method2921() >= 1) {
					Static325.anInt5268 = Static338.aClass152_4.method2925();
					Static166.anInt3041 = 0;
					Static179.method2497(29);
					Static338.aClass152_4.method2924();
					Static338.aClass152_4 = null;
					Static172.method2394();
				}
			} else if (Static166.anInt3041 != 8) {
				@Pc(722) Class4_Sub9_Sub2 local722;
				if (Static166.anInt3041 == 9) {
					if (Static50.anInt812 == 3) {
						Static216.aBoolean275 = true;
					} else {
						Static216.aBoolean275 = false;
					}
					local722 = Static56.aClass4_Sub9_Sub2_1;
					if (Static50.anInt812 == 2 || Static50.anInt812 == 3) {
						if (Static338.aClass152_4.method2921() < Static81.anInt1608) {
							return;
						}
						Static338.aClass152_4.method2923(Static81.anInt1608, local722.aByteArray81, 0);
						local722.anInt6207 = 0;
						Static270.anInt4509 = local722.method5007();
						Static242.anInt4050 = local722.method5007();
						Static412.aBoolean491 = local722.method5007() == 1;
						Static119.aBoolean403 = local722.method5007() == 1;
						Static168.aBoolean152 = local722.method5007() == 1;
						Static339.aBoolean389 = local722.method5007() == 1;
						Static12.anInt187 = local722.method5028();
						Static219.aBoolean281 = local722.method5007() == 1;
						Static225.aBoolean284 = local722.method5007() == 1;
						if (Static50.anInt812 == 3) {
							@Pc(1004) boolean local1004 = local722.method5007() == 1;
							if (local1004) {
								@Pc(1010) long local1010 = local722.method5024();
								@Pc(1014) String local1014 = Static272.method3613(local1010);
								@Pc(1018) int local1018 = local722.method5007();
								@Pc(1021) byte[] local1021 = new byte[local1018];
								local722.method5077(local1021, local1018);
								@Pc(1031) String local1031 = Static181.method2527(local1021);
								@Pc(1033) Class70 local1033 = null;
								try {
									@Pc(1039) Class45 local1039 = Static24.aClass196_1.method3908("3", false);
									while (local1039.anInt1129 == 0) {
										Static435.method5777(1L);
									}
									if (local1039.anInt1129 == 1) {
										local1033 = (Class70) local1039.anObject5;
										@Pc(1069) int local1069 = local1014.length() + local1031.length() + 4 + 3 + 2;
										if (local1069 > 50) {
											throw new RuntimeException(">50");
										}
										@Pc(1084) Class4_Sub9 local1084 = new Class4_Sub9(local1069 + 1);
										local1084.method4999(local1069);
										local1084.method4999(0);
										local1084.method5043(local1014);
										local1084.method5043(local1031);
										local1084.method5027();
										local1033.method1441(local1084.aByteArray81, local1084.anInt6207, 0);
									}
								} catch (@Pc(1116) Exception local1116) {
								}
								try {
									if (local1033 != null) {
										local1033.method1443();
									}
								} catch (@Pc(1123) Exception local1123) {
								}
							}
						}
						Static51.aClass151_1.method2916(Static225.aBoolean284);
						Static416.aClass64_2.method1370(Static225.aBoolean284);
						Static120.aClass115_2.method2200(Static225.aBoolean284);
					} else if (Static338.aClass152_4.method2921() >= Static81.anInt1608) {
						Static338.aClass152_4.method2923(Static81.anInt1608, local722.aByteArray81, 0);
						local722.anInt6207 = 0;
						Static270.anInt4509 = local722.method5007();
						Static242.anInt4050 = local722.method5007();
						Static412.aBoolean491 = local722.method5007() == 1;
						Static119.aBoolean403 = local722.method5007() == 1;
						Static168.aBoolean152 = local722.method5007() == 1;
						Static385.anInt6298 = local722.method5028();
						Static219.aBoolean281 = Static385.anInt6298 > 0;
						Static381.anInt914 = local722.method5028();
						Static408.anInt6899 = local722.method5028();
						Static400.anInt6500 = local722.method5028();
						Static184.anInt3358 = local722.method4997();
						Static404.aClass45_8 = Static24.aClass196_1.method3905(Static184.anInt3358);
						Static342.anInt5684 = local722.method5007();
						Static224.anInt3837 = local722.method5028();
						Static455.anInt7623 = local722.method5028();
						Static151.aBoolean198 = local722.method5007() == 1;
						Static401.aClass8_Sub3_Sub1_Sub1_2.aString60 = Static401.aClass8_Sub3_Sub1_Sub1_2.aString59 = local722.method5015();
						Static93.aClass220_1 = new Class220();
						Static93.aClass220_1.anInt5746 = local722.method5028();
						if (Static93.aClass220_1.anInt5746 == 65535) {
							Static93.aClass220_1.anInt5746 = -1;
						}
						Static93.aClass220_1.aString62 = local722.method5015();
						if (Static193.aClass178_9 != Static324.aClass178_18) {
							Static93.aClass220_1.anInt5753 = Static93.aClass220_1.anInt5746 + 40000;
							Static93.aClass220_1.anInt5751 = Static93.aClass220_1.anInt5746 + 50000;
						}
						if (Static193.aClass178_9 != Static236.aClass178_15) {
							Static338.aClass220_5 = Static93.aClass220_1;
						}
					} else {
						return;
					}
					if (Static412.aBoolean491 && !Static168.aBoolean152 || Static219.aBoolean281) {
						try {
							Static467.method6000("zap", Static24.aClass196_1.anApplet1);
						} catch (@Pc(1160) Throwable local1160) {
							if (Static225.aBoolean285) {
								try {
									Static24.aClass196_1.anApplet1.getAppletContext().showDocument(new URL(Static24.aClass196_1.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1176) Exception local1176) {
								}
							}
						}
					} else {
						try {
							Static467.method6000("unzap", Static24.aClass196_1.anApplet1);
						} catch (@Pc(1150) Throwable local1150) {
						}
					}
					if (Static193.aClass178_9 == Static324.aClass178_18) {
						try {
							Static467.method6000("loggedin", Static24.aClass196_1.anApplet1);
						} catch (@Pc(1190) Throwable local1190) {
						}
					}
					if (Static50.anInt812 != 2 && Static50.anInt812 != 3) {
						Static166.anInt3041 = 0;
						Static179.method2497(2);
						Static160.method3983();
						Static119.method4569(6);
						Static149.aClass56_102 = null;
						return;
					}
					Static166.anInt3041 = 11;
				}
				if (Static166.anInt3041 == 11) {
					if (Static338.aClass152_4.method2921() < 3) {
						return;
					}
					Static338.aClass152_4.method2923(3, Static56.aClass4_Sub9_Sub2_1.aByteArray81, 0);
					Static166.anInt3041 = 12;
				}
				if (Static166.anInt3041 == 12) {
					local722 = Static56.aClass4_Sub9_Sub2_1;
					local722.anInt6207 = 0;
					if (local722.method5069()) {
						if (Static338.aClass152_4.method2921() < 1) {
							return;
						}
						Static338.aClass152_4.method2923(1, local722.aByteArray81, 3);
					}
					Static149.aClass56_102 = Static192.method2790()[local722.method5066()];
					Static313.anInt5082 = local722.method5028();
					Static166.anInt3041 = 10;
				}
				if (Static166.anInt3041 == 10) {
					if (Static338.aClass152_4.method2921() >= Static313.anInt5082) {
						Static338.aClass152_4.method2923(Static313.anInt5082, Static56.aClass4_Sub9_Sub2_1.aByteArray81, 0);
						Static56.aClass4_Sub9_Sub2_1.anInt6207 = 0;
						Static166.anInt3041 = 0;
						local517 = Static313.anInt5082;
						Static179.method2497(2);
						Static221.method3010();
						Static10.method130(Static56.aClass4_Sub9_Sub2_1);
						Static34.anInt2146 = -1;
						Static347.method4606();
						if (Static56.aClass4_Sub9_Sub2_1.anInt6207 != local517) {
							throw new RuntimeException("lswp pos:" + Static56.aClass4_Sub9_Sub2_1.anInt6207 + " psize:" + local517);
						}
						Static149.aClass56_102 = null;
					}
				} else if (Static166.anInt3041 == 14) {
					if (Static313.anInt5082 == -2) {
						if (Static338.aClass152_4.method2921() < 2) {
							return;
						}
						Static338.aClass152_4.method2923(2, Static56.aClass4_Sub9_Sub2_1.aByteArray81, 0);
						Static56.aClass4_Sub9_Sub2_1.anInt6207 = 0;
						Static313.anInt5082 = Static56.aClass4_Sub9_Sub2_1.method5028();
					}
					if (Static338.aClass152_4.method2921() >= Static313.anInt5082) {
						Static338.aClass152_4.method2923(Static313.anInt5082, Static56.aClass4_Sub9_Sub2_1.aByteArray81, 0);
						Static56.aClass4_Sub9_Sub2_1.anInt6207 = 0;
						Static166.anInt3041 = 0;
						local517 = Static313.anInt5082;
						Static179.method2497(15);
						Static303.method3952();
						Static10.method130(Static56.aClass4_Sub9_Sub2_1);
						if (Static56.aClass4_Sub9_Sub2_1.anInt6207 != local517) {
							throw new RuntimeException("lswpr pos:" + Static56.aClass4_Sub9_Sub2_1.anInt6207 + " psize:" + local517);
						}
						Static149.aClass56_102 = null;
					}
				}
			} else if (Static338.aClass152_4.method2921() >= 1) {
				Static81.anInt1608 = Static338.aClass152_4.method2925();
				Static166.anInt3041 = 9;
			}
		} catch (@Pc(1438) IOException local1438) {
			if (Static338.aClass152_4 != null) {
				Static338.aClass152_4.method2924();
				Static338.aClass152_4 = null;
			}
			if (Static364.anInt6029 < 1) {
				Static166.anInt3041 = 1;
				Static364.anInt6029++;
				Static263.anInt4362 = 0;
				if (Static50.anInt812 == 2 || Static50.anInt812 == 3) {
					Static338.aClass220_5.aBoolean406 = !Static338.aClass220_5.aBoolean406;
				} else {
					Static240.aClass220_3.aBoolean406 = !Static240.aClass220_3.aBoolean406;
				}
			} else {
				Static166.anInt3041 = 0;
				Static179.method2497(-4);
				Static172.method2394();
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(B)V")
	public static void method2400() {
		if (Static212.anIntArray274 != null) {
			return;
		}
		Static212.anIntArray274 = new int[65536];
		@Pc(28) double local28 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(30) int local30 = 0;
		for (@Pc(32) int local32 = 0; local32 < 512; local32++) {
			@Pc(46) float local46 = ((float) (local32 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(55) float local55 = (float) (local32 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(57) int local57 = 0; local57 < 128; local57++) {
				@Pc(64) float local64 = (float) local57 / 128.0F;
				@Pc(66) float local66 = 0.0F;
				@Pc(68) float local68 = 0.0F;
				@Pc(70) float local70 = 0.0F;
				@Pc(74) float local74 = local46 / 60.0F;
				@Pc(77) int local77 = (int) local74;
				@Pc(81) int local81 = local77 % 6;
				@Pc(87) float local87 = (float) -local77 + local74;
				@Pc(94) float local94 = local64 * (1.0F - local55);
				@Pc(103) float local103 = (1.0F - local87 * local55) * local64;
				@Pc(113) float local113 = local64 * (1.0F - (1.0F - local87) * local55);
				if (local81 == 0) {
					local66 = local64;
					local68 = local113;
					local70 = local94;
				} else if (local81 == 1) {
					local68 = local64;
					local70 = local94;
					local66 = local103;
				} else if (local81 == 2) {
					local68 = local64;
					local70 = local113;
					local66 = local94;
				} else if (local81 == 3) {
					local70 = local64;
					local68 = local103;
					local66 = local94;
				} else if (local81 == 4) {
					local68 = local94;
					local70 = local64;
					local66 = local113;
				} else if (local81 == 5) {
					local66 = local64;
					local68 = local94;
					local70 = local103;
				}
				local66 = (float) Math.pow((double) local66, local28);
				local68 = (float) Math.pow((double) local68, local28);
				local70 = (float) Math.pow((double) local70, local28);
				@Pc(206) int local206 = (int) (local66 * 256.0F);
				@Pc(211) int local211 = (int) (local68 * 256.0F);
				@Pc(216) int local216 = (int) (local70 * 256.0F);
				@Pc(228) int local228 = local216 + (local206 << 16) + (local211 << 8) - 16777216;
				Static212.anIntArray274[local30++] = local228;
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZI)[B")
	public static synchronized byte[] method2401(@OriginalArg(1) int arg0) {
		@Pc(19) byte[] local19;
		if (arg0 == 100 && Static68.anInt1386 > 0) {
			local19 = Static449.aByteArrayArray20[--Static68.anInt1386];
			Static449.aByteArrayArray20[Static68.anInt1386] = null;
			return local19;
		} else if (arg0 == 5000 && Static349.anInt5767 > 0) {
			local19 = Static30.aByteArrayArray1[--Static349.anInt5767];
			Static30.aByteArrayArray1[Static349.anInt5767] = null;
			return local19;
		} else if (arg0 == 30000 && Static58.anInt1056 > 0) {
			local19 = Static137.aByteArrayArray6[--Static58.anInt1056];
			Static137.aByteArrayArray6[Static58.anInt1056] = null;
			return local19;
		} else {
			return new byte[arg0];
		}
	}
}
