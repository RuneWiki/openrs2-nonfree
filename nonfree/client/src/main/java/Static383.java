import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!ss", name = "L", descriptor = "I")
	private static int anInt6460;

	@OriginalMember(owner = "client!ss", name = "U", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray40;

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(B)V")
	public static void method5317() {
		if (Static423.anInt7131 == 0 || Static423.anInt7131 == 6) {
			return;
		}
		try {
			if (++Static363.anInt6177 > 2000) {
				if (Static328.aClass116_1 != null) {
					Static328.aClass116_1.method2920();
					Static328.aClass116_1 = null;
				}
				if (Static320.anInt1178 >= 1) {
					Static423.anInt7131 = 0;
					Static92.method1569(-5);
					return;
				}
				Static363.anInt6177 = 0;
				Static320.anInt1178++;
				Static423.anInt7131 = 1;
				if (Static395.anInt6596 == 2 || Static395.anInt6596 == 3) {
					Static367.aClass241_6.aBoolean448 = !Static367.aClass241_6.aBoolean448;
				} else {
					Static293.aClass241_4.aBoolean448 = !Static293.aClass241_4.aBoolean448;
				}
			}
			if (Static423.anInt7131 == 1) {
				if (Static395.anInt6596 == 2 || Static395.anInt6596 == 3) {
					Static66.aClass181_2 = Static32.aClass51_1.method1375(Static367.aClass241_6.method5486(), Static367.aClass241_6.aString61);
				} else {
					Static66.aClass181_2 = Static32.aClass51_1.method1375(Static293.aClass241_4.method5486(), Static293.aClass241_4.aString61);
				}
				Static423.anInt7131 = 2;
			}
			if (Static423.anInt7131 == 2) {
				if (Static66.aClass181_2.anInt5298 == 2) {
					throw new IOException();
				}
				if (Static66.aClass181_2.anInt5298 != 1) {
					return;
				}
				Static328.aClass116_1 = Static169.method6289((Socket) Static66.aClass181_2.anObject7);
				Static66.aClass181_2 = null;
				@Pc(142) long local142 = Static79.aLong55 = Static428.method5838(Static378.aString60);
				Static243.aClass3_Sub25_Sub1_7.anInt4974 = 0;
				@Pc(152) int local152 = (int) (local142 >> 16 & 0x1FL);
				Static243.aClass3_Sub25_Sub1_7.method4081(Static445.aClass235_25.anInt6547);
				Static243.aClass3_Sub25_Sub1_7.method4081(local152);
				Static328.aClass116_1.method2918(2, Static243.aClass3_Sub25_Sub1_7.aByteArray88);
				Static423.anInt7131 = 3;
			}
			@Pc(196) int local196;
			if (Static423.anInt7131 == 3) {
				if (!Static328.aClass116_1.method2924(1)) {
					return;
				}
				Static328.aClass116_1.method2919(Static176.aClass3_Sub25_Sub1_1.aByteArray88, 1, 0);
				local196 = Static176.aClass3_Sub25_Sub1_1.aByteArray88[0] & 0xFF;
				if (local196 != 0) {
					Static423.anInt7131 = 0;
					Static92.method1569(local196);
					Static328.aClass116_1.method2920();
					Static328.aClass116_1 = null;
					Static459.method4919();
					return;
				}
				Static423.anInt7131 = 4;
			}
			if (Static423.anInt7131 == 4) {
				if (!Static328.aClass116_1.method2924(8)) {
					return;
				}
				Static328.aClass116_1.method2919(Static176.aClass3_Sub25_Sub1_1.aByteArray88, 8, 0);
				Static176.aClass3_Sub25_Sub1_1.anInt4974 = 0;
				Static309.aLong174 = Static176.aClass3_Sub25_Sub1_1.method4087();
				@Pc(247) Class3_Sub25 local247 = new Class3_Sub25(70);
				@Pc(250) int[] local250 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static309.aLong174 >> 32), (int) Static309.aLong174 };
				local247.method4081(10);
				local247.method4082(local250[0]);
				local247.method4082(local250[1]);
				local247.method4082(local250[2]);
				local247.method4082(local250[3]);
				local247.method4063(Static428.method5838(Static378.aString60));
				local247.method4080(Static217.aString10);
				local247.method4111(Static319.aBigInteger1, Static386.aBigInteger2);
				@Pc(325) Class3_Sub25_Sub1 local325 = Static243.aClass3_Sub25_Sub1_7;
				local325.anInt4974 = 0;
				@Pc(348) int local348;
				if (Static395.anInt6596 == 2 || Static395.anInt6596 == 3) {
					if (Static345.anInt5823 == 12) {
						local325.method4081(Static445.aClass235_29.anInt6547);
					} else {
						local325.method4081(Static445.aClass235_27.anInt6547);
					}
					local325.method4123(0);
					local348 = local325.anInt4974;
					local325.method4082(603);
					local325.method4081(Static154.anInt2803);
					local325.method4081(Static282.method3967());
					local325.method4123(Static310.anInt5307);
					local325.method4123(Static166.anInt3014);
					local325.method4081(Static39.aClass79_Sub1_1.anInt2145);
					Static294.method4200(local325);
					local325.method4080(Static153.aString38);
					local325.method4082(Static59.anInt1131);
					@Pc(465) Class3_Sub25 local465 = Static39.aClass79_Sub1_1.method1947();
					local325.method4081(local465.anInt4974);
					local325.method4098(local465.aByteArray88, local465.anInt4974);
					Static171.aBoolean244 = true;
					local325.method4123(Static61.anInt1155);
					local325.method4123(Static179.anInt3324);
					Static371.method5203();
					local325.method4098(local247.aByteArray88, local247.anInt4974);
					local325.method4061(local325.anInt4974 - local348);
				} else {
					local325.method4081(Static445.aClass235_30.anInt6547);
					local325.method4123(0);
					local348 = local325.anInt4974;
					local325.method4082(603);
					local325.method4081(Static154.aClass113_3.anInt3360);
					local325.method4081(Static300.anInt5192);
					Static294.method4200(local325);
					local325.method4080(Static153.aString38);
					local325.method4082(Static59.anInt1131);
					Static371.method5203();
					local325.method4098(local247.aByteArray88, local247.anInt4974);
					local325.method4061(local325.anInt4974 - local348);
				}
				Static328.aClass116_1.method2918(local325.anInt4974, local325.aByteArray88);
				local325.method2775(local250);
				for (local348 = 0; local348 < 4; local348++) {
					local250[local348] += 50;
				}
				Static176.aClass3_Sub25_Sub1_1.method2775(local250);
				Static423.anInt7131 = 5;
			}
			if (Static423.anInt7131 == 5) {
				if (!Static328.aClass116_1.method2924(1)) {
					return;
				}
				Static328.aClass116_1.method2919(Static176.aClass3_Sub25_Sub1_1.aByteArray88, 1, 0);
				local196 = Static176.aClass3_Sub25_Sub1_1.aByteArray88[0] & 0xFF;
				if (local196 == 21) {
					Static423.anInt7131 = 8;
				} else if (local196 == 29) {
					Static423.anInt7131 = 14;
				} else if (local196 == 1) {
					Static423.anInt7131 = 6;
					Static92.method1569(local196);
					return;
				} else if (local196 == 2) {
					Static423.anInt7131 = 9;
				} else if (local196 == 15) {
					Static102.anInt1839 = -2;
					Static423.anInt7131 = 15;
				} else if (local196 == 23 && Static320.anInt1178 < 1) {
					Static423.anInt7131 = 1;
					Static320.anInt1178++;
					Static363.anInt6177 = 0;
					Static328.aClass116_1.method2920();
					Static328.aClass116_1 = null;
					return;
				} else {
					Static423.anInt7131 = 0;
					Static92.method1569(local196);
					Static328.aClass116_1.method2920();
					Static328.aClass116_1 = null;
					Static459.method4919();
					return;
				}
			}
			if (Static423.anInt7131 == 7) {
				Static243.aClass3_Sub25_Sub1_7.anInt4974 = 0;
				Static243.aClass3_Sub25_Sub1_7.method2781(Static445.aClass235_28.anInt6547);
				Static328.aClass116_1.method2918(Static243.aClass3_Sub25_Sub1_7.anInt4974, Static243.aClass3_Sub25_Sub1_7.aByteArray88);
				Static423.anInt7131 = 5;
			} else if (Static423.anInt7131 == 8) {
				if (Static328.aClass116_1.method2924(1)) {
					Static328.aClass116_1.method2919(Static176.aClass3_Sub25_Sub1_1.aByteArray88, 1, 0);
					local196 = Static176.aClass3_Sub25_Sub1_1.aByteArray88[0] & 0xFF;
					Static423.anInt7131 = 0;
					Static333.anInt5545 = (local196 + 3) * 60;
					Static92.method1569(21);
					Static328.aClass116_1.method2920();
					Static328.aClass116_1 = null;
					Static459.method4919();
				}
			} else if (Static423.anInt7131 == 14) {
				if (Static328.aClass116_1.method2924(1)) {
					Static328.aClass116_1.method2919(Static176.aClass3_Sub25_Sub1_1.aByteArray88, 1, 0);
					Static423.anInt7131 = 0;
					Static14.anInt241 = Static176.aClass3_Sub25_Sub1_1.aByteArray88[0] & 0xFF;
					Static92.method1569(29);
					Static328.aClass116_1.method2920();
					Static328.aClass116_1 = null;
					Static459.method4919();
				}
			} else if (Static423.anInt7131 != 9) {
				@Pc(789) Class3_Sub25_Sub1 local789;
				if (Static423.anInt7131 == 10) {
					local789 = Static176.aClass3_Sub25_Sub1_1;
					if (Static395.anInt6596 == 3) {
						Static37.aBoolean34 = true;
					} else {
						Static37.aBoolean34 = false;
					}
					if (Static395.anInt6596 == 2 || Static395.anInt6596 == 3) {
						if (!Static328.aClass116_1.method2924(Static62.anInt1165)) {
							return;
						}
						Static328.aClass116_1.method2919(local789.aByteArray88, Static62.anInt1165, 0);
						local789.anInt4974 = 0;
						Static300.anInt5196 = local789.method4096();
						Static252.anInt4255 = local789.method4096();
						Static61.aBoolean81 = local789.method4096() == 1;
						Static177.aBoolean251 = local789.method4096() == 1;
						Static380.aBoolean439 = local789.method4096() == 1;
						Static401.aBoolean449 = local789.method4096() == 1;
						Static317.anInt5364 = local789.method4083();
						Static279.aBoolean332 = local789.method4096() == 1;
						Static110.anInt1958 = local789.method4103();
						Static182.aBoolean253 = local789.method4096() == 1;
						if (Static395.anInt6596 == 3) {
							@Pc(913) boolean local913 = local789.method4096() == 1;
							if (local913) {
								@Pc(919) long local919 = local789.method4087();
								@Pc(923) String local923 = Static56.method1103(local919);
								@Pc(927) int local927 = local789.method4096();
								@Pc(930) byte[] local930 = new byte[local927];
								local789.method2778(local927, local930);
								@Pc(940) String local940 = Static147.method2293(local930);
								@Pc(942) Class220 local942 = null;
								try {
									@Pc(948) Class181 local948 = Static32.aClass51_1.method1359(false, "3");
									while (local948.anInt5298 == 0) {
										Static83.method1499(1L);
									}
									if (local948.anInt5298 == 1) {
										local942 = (Class220) local948.anObject7;
										@Pc(974) int local974 = local923.length() + local940.length() + 6 + 3;
										if (local974 > 50) {
											throw new RuntimeException(">50");
										}
										@Pc(991) Class3_Sub25 local991 = new Class3_Sub25(local974 + 1);
										local991.method4081(local974);
										local991.method4081(0);
										local991.method4107(local923);
										local991.method4107(local940);
										local991.method4064();
										local942.method5187(local991.anInt4974, 0, local991.aByteArray88);
									}
								} catch (@Pc(1023) Exception local1023) {
								}
								try {
									if (local942 != null) {
										local942.method5190();
									}
								} catch (@Pc(1030) Exception local1030) {
								}
							}
						}
						Static9.aClass149_1.method3574(Static182.aBoolean253);
						Static158.aClass272_1.method6275(Static182.aBoolean253);
						Static118.aClass19_1.method397(Static182.aBoolean253);
					} else if (Static328.aClass116_1.method2924(Static62.anInt1165)) {
						Static328.aClass116_1.method2919(local789.aByteArray88, Static62.anInt1165, 0);
						local789.anInt4974 = 0;
						Static300.anInt5196 = local789.method4096();
						Static252.anInt4255 = local789.method4096();
						Static61.aBoolean81 = local789.method4096() == 1;
						Static177.aBoolean251 = local789.method4096() == 1;
						Static380.aBoolean439 = local789.method4096() == 1;
						Static174.anInt3262 = local789.method4083();
						Static279.aBoolean332 = Static174.anInt3262 > 0;
						Static125.anInt2285 = local789.method4083();
						Static421.anInt7116 = local789.method4083();
						Static338.anInt5687 = local789.method4083();
						anInt6460 = local789.method4108();
						Static232.aClass181_5 = Static32.aClass51_1.method1382(anInt6460);
						Static442.anInt7411 = local789.method4096();
						Static81.anInt1470 = local789.method4083();
						Static400.anInt6615 = local789.method4083();
						Static130.aBoolean183 = local789.method4096() == 1;
						Static203.aClass1_Sub2_Sub6_Sub2_1.aString69 = Static203.aClass1_Sub2_Sub6_Sub2_1.aString70 = local789.method4119();
						Static113.aClass241_5 = new Class241();
						Static113.aClass241_5.anInt6624 = local789.method4083();
						if (Static113.aClass241_5.anInt6624 == 65535) {
							Static113.aClass241_5.anInt6624 = -1;
						}
						Static113.aClass241_5.aString61 = local789.method4119();
						if (Static80.aClass35_1 != Static230.aClass35_2) {
							Static113.aClass241_5.anInt6630 = Static113.aClass241_5.anInt6624 + 50000;
							Static113.aClass241_5.anInt6626 = Static113.aClass241_5.anInt6624 + 40000;
						}
						if (Static238.aClass35_3 != Static230.aClass35_2 && (Static367.aClass241_6.method5488(Static86.aClass241_1) || Static367.aClass241_6.method5488(Static167.aClass241_3))) {
							Static367.aClass241_6 = Static113.aClass241_5;
						}
					} else {
						return;
					}
					if (Static61.aBoolean81 && !Static380.aBoolean439 || Static279.aBoolean332) {
						try {
							Static473.method5059(Static32.aClass51_1.anApplet1, "zap");
						} catch (@Pc(1254) Throwable local1254) {
							if (Static461.aBoolean516) {
								try {
									Static32.aClass51_1.anApplet1.getAppletContext().showDocument(new URL(Static32.aClass51_1.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1270) Exception local1270) {
								}
							}
						}
					} else {
						try {
							Static473.method5059(Static32.aClass51_1.anApplet1, "unzap");
						} catch (@Pc(1242) Throwable local1242) {
						}
					}
					if (Static230.aClass35_2 == Static80.aClass35_1) {
						try {
							Static473.method5059(Static32.aClass51_1.anApplet1, "loggedin");
						} catch (@Pc(1282) Throwable local1282) {
						}
					}
					if (Static395.anInt6596 != 2 && Static395.anInt6596 != 3) {
						Static423.anInt7131 = 0;
						Static92.method1569(2);
						Static195.method3030();
						Static393.method5432(6);
						Static167.aClass136_81 = null;
						return;
					}
					Static423.anInt7131 = 12;
				}
				if (Static423.anInt7131 == 12) {
					if (!Static328.aClass116_1.method2924(3)) {
						return;
					}
					Static328.aClass116_1.method2919(Static176.aClass3_Sub25_Sub1_1.aByteArray88, 3, 0);
					Static423.anInt7131 = 13;
				}
				if (Static423.anInt7131 == 13) {
					local789 = Static176.aClass3_Sub25_Sub1_1;
					local789.anInt4974 = 0;
					if (local789.method2776()) {
						if (!Static328.aClass116_1.method2924(1)) {
							return;
						}
						Static328.aClass116_1.method2919(local789.aByteArray88, 1, 3);
					}
					Static167.aClass136_81 = Static64.method1221()[local789.method2774()];
					Static102.anInt1839 = local789.method4083();
					Static423.anInt7131 = 11;
				}
				if (Static423.anInt7131 == 11) {
					if (Static328.aClass116_1.method2924(Static102.anInt1839)) {
						Static328.aClass116_1.method2919(Static176.aClass3_Sub25_Sub1_1.aByteArray88, Static102.anInt1839, 0);
						Static176.aClass3_Sub25_Sub1_1.anInt4974 = 0;
						Static423.anInt7131 = 0;
						local196 = Static102.anInt1839;
						Static92.method1569(2);
						Static282.method3996();
						Static220.method3685(Static176.aClass3_Sub25_Sub1_1);
						Static37.anInt629 = -1;
						Static429.method5845();
						if (Static176.aClass3_Sub25_Sub1_1.anInt4974 != local196) {
							throw new RuntimeException("lswp pos:" + Static176.aClass3_Sub25_Sub1_1.anInt4974 + " psize:" + local196);
						}
						Static167.aClass136_81 = null;
					}
				} else if (Static423.anInt7131 == 15) {
					if (Static102.anInt1839 == -2) {
						if (!Static328.aClass116_1.method2924(2)) {
							return;
						}
						Static328.aClass116_1.method2919(Static176.aClass3_Sub25_Sub1_1.aByteArray88, 2, 0);
						Static176.aClass3_Sub25_Sub1_1.anInt4974 = 0;
						Static102.anInt1839 = Static176.aClass3_Sub25_Sub1_1.method4083();
					}
					if (Static328.aClass116_1.method2924(Static102.anInt1839)) {
						Static328.aClass116_1.method2919(Static176.aClass3_Sub25_Sub1_1.aByteArray88, Static102.anInt1839, 0);
						Static176.aClass3_Sub25_Sub1_1.anInt4974 = 0;
						Static423.anInt7131 = 0;
						local196 = Static102.anInt1839;
						Static92.method1569(15);
						Static52.method984();
						Static220.method3685(Static176.aClass3_Sub25_Sub1_1);
						if (local196 != Static176.aClass3_Sub25_Sub1_1.anInt4974) {
							throw new RuntimeException("lswpr pos:" + Static176.aClass3_Sub25_Sub1_1.anInt4974 + " psize:" + local196);
						}
						Static167.aClass136_81 = null;
					}
				}
			} else if (Static328.aClass116_1.method2924(1)) {
				Static328.aClass116_1.method2919(Static176.aClass3_Sub25_Sub1_1.aByteArray88, 1, 0);
				Static423.anInt7131 = 10;
				Static62.anInt1165 = Static176.aClass3_Sub25_Sub1_1.aByteArray88[0] & 0xFF;
			}
		} catch (@Pc(1527) IOException local1527) {
			if (Static328.aClass116_1 != null) {
				Static328.aClass116_1.method2920();
				Static328.aClass116_1 = null;
			}
			if (Static320.anInt1178 >= 1) {
				Static423.anInt7131 = 0;
				Static92.method1569(-4);
				Static459.method4919();
			} else {
				Static423.anInt7131 = 1;
				Static320.anInt1178++;
				Static363.anInt6177 = 0;
				if (Static395.anInt6596 == 2 || Static395.anInt6596 == 3) {
					Static367.aClass241_6.aBoolean448 = !Static367.aClass241_6.aBoolean448;
				} else {
					Static293.aClass241_4.aBoolean448 = !Static293.aClass241_4.aBoolean448;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "h", descriptor = "(I)Z")
	public static boolean method5318() {
		@Pc(7) Class3 local7 = Static325.aClass193_54.aClass3_198.aClass3_267;
		if (local7 == null || local7 == Static325.aClass193_54.aClass3_198) {
			return false;
		}
		@Pc(23) Class3_Sub38 local23 = (Class3_Sub38) local7;
		if (local23.anInt5875 >= 2000) {
			local23.anInt5875 -= 2000;
		}
		return local23.anInt5875 == 1006;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V")
	public static void method5320(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		Static395.anInt6596 = 2;
		Static154.anInt2803 = arg1;
		Static27.method494(arg2, arg0);
	}

	@OriginalMember(owner = "client!ss", name = "i", descriptor = "(I)Z")
	public static boolean method5321() {
		return Static276.anInt4608 > 0;
	}
}
