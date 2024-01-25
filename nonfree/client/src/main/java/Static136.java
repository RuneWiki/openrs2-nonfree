import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "F")
	public static float aFloat22;

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_91 = new Class107(28, -2);

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
	public static int anInt2710 = -1;

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)V")
	public static void method2329() {
		if (Static90.anInt1905 == 0 || Static90.anInt1905 == 5) {
			return;
		}
		try {
			if (++Static237.anInt5950 > 2000) {
				if (Static82.aClass229_1 != null) {
					Static82.aClass229_1.method5204();
					Static82.aClass229_1 = null;
				}
				if (Static198.anInt3589 >= 1) {
					Static90.anInt1905 = 0;
					Static172.method2765(-5);
					return;
				}
				Static90.anInt1905 = 1;
				Static237.anInt5950 = 0;
				if (Static164.anInt3043 == 2 || Static164.anInt3043 == 3) {
					Static451.aClass209_5.aBoolean406 = !Static451.aClass209_5.aBoolean406;
				} else {
					Static81.aClass209_1.aBoolean406 = !Static81.aClass209_1.aBoolean406;
				}
				Static198.anInt3589++;
			}
			if (Static90.anInt1905 == 1) {
				if (Static164.anInt3043 == 2 || Static164.anInt3043 == 3) {
					Static47.aClass9_3 = Static77.aClass180_1.method4086(Static451.aClass209_5.method4847(), Static451.aClass209_5.aString60);
				} else {
					Static47.aClass9_3 = Static77.aClass180_1.method4086(Static81.aClass209_1.method4847(), Static81.aClass209_1.aString60);
				}
				Static90.anInt1905 = 2;
			}
			@Pc(190) int local190;
			if (Static90.anInt1905 == 2) {
				if (Static47.aClass9_3.anInt368 == 2) {
					throw new IOException();
				}
				if (Static47.aClass9_3.anInt368 != 1) {
					return;
				}
				Static82.aClass229_1 = new Class229((Socket) Static47.aClass9_3.anObject2, Static77.aClass180_1);
				Static47.aClass9_3 = null;
				@Pc(158) long local158 = Static198.aLong117 = Static214.method4406(Static450.aString71);
				Static92.aClass1_Sub5_Sub1_1.anInt6475 = 0;
				@Pc(168) int local168 = (int) (local158 >> 16 & 0x1FL);
				Static92.aClass1_Sub5_Sub1_1.method5396(Static114.aClass208_1.anInt5814);
				Static92.aClass1_Sub5_Sub1_1.method5396(local168);
				Static82.aClass229_1.method5207(Static92.aClass1_Sub5_Sub1_1.aByteArray89, 2);
				Static40.method753();
				local190 = Static82.aClass229_1.method5206();
				Static40.method753();
				if (local190 != 0) {
					Static90.anInt1905 = 0;
					Static172.method2765(local190);
					Static82.aClass229_1.method5204();
					Static82.aClass229_1 = null;
					Static324.method4619();
					return;
				}
				Static90.anInt1905 = 3;
			}
			if (Static90.anInt1905 == 3) {
				if (Static82.aClass229_1.method5208() < 8) {
					return;
				}
				Static82.aClass229_1.method5203(0, 8, Static206.aClass1_Sub5_Sub1_2.aByteArray89);
				Static206.aClass1_Sub5_Sub1_2.anInt6475 = 0;
				Static40.aLong35 = Static206.aClass1_Sub5_Sub1_2.method5371();
				@Pc(241) Class1_Sub5 local241 = new Class1_Sub5(70);
				@Pc(244) int[] local244 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static40.aLong35 >> 32), (int) Static40.aLong35 };
				local241.method5396(10);
				local241.method5417(local244[0]);
				local241.method5417(local244[1]);
				local241.method5417(local244[2]);
				local241.method5417(local244[3]);
				local241.method5358(Static214.method4406(Static450.aString71));
				local241.method5385(Static338.aString57);
				local241.method5365(Static398.aBigInteger2, Static84.aBigInteger1);
				@Pc(315) Class1_Sub5_Sub1 local315 = Static92.aClass1_Sub5_Sub1_1;
				local315.anInt6475 = 0;
				if (Static164.anInt3043 == 2 || Static164.anInt3043 == 3) {
					if (Static342.anInt5771 == 12) {
						local315.method5396(Static114.aClass208_5.anInt5814);
					} else {
						local315.method5396(Static114.aClass208_3.anInt5814);
					}
					local315.method5393(0);
					local190 = local315.anInt6475;
					local315.method5417(594);
					local315.method5396(Static134.anInt2694);
					local315.method5396(Static432.method5740());
					local315.method5393(Static95.anInt1971);
					local315.method5393(Static34.anInt715);
					local315.method5396(Static38.aClass135_Sub1_1.anInt5108);
					Static341.method4808(local315);
					local315.method5385(Static164.aString23);
					local315.method5417(Static209.anInt3932);
					@Pc(455) Class1_Sub5 local455 = Static38.aClass135_Sub1_1.method4238();
					local315.method5396(local455.anInt6475);
					local315.method5367(local455.aByteArray89, local455.anInt6475);
					Static77.aBoolean102 = true;
					local315.method5393(Static16.anInt474);
					Static215.method3373();
					local315.method5367(local241.aByteArray89, local241.anInt6475);
					local315.method5412(local315.anInt6475 - local190);
				} else {
					local315.method5396(Static114.aClass208_6.anInt5814);
					local315.method5393(0);
					local190 = local315.anInt6475;
					local315.method5417(594);
					local315.method5396(Static337.aClass61_5.anInt1910);
					local315.method5396(Static341.anInt5770);
					Static341.method4808(local315);
					local315.method5385(Static164.aString23);
					local315.method5417(Static209.anInt3932);
					Static215.method3373();
					local315.method5367(local241.aByteArray89, local241.anInt6475);
					local315.method5412(local315.anInt6475 - local190);
				}
				Static82.aClass229_1.method5207(local315.aByteArray89, local315.anInt6475);
				local315.method315(local244);
				for (local190 = 0; local190 < 4; local190++) {
					local244[local190] += 50;
				}
				Static206.aClass1_Sub5_Sub1_2.method315(local244);
				Static90.anInt1905 = 4;
			}
			@Pc(542) int local542;
			if (Static90.anInt1905 == 4) {
				if (Static82.aClass229_1.method5208() < 1) {
					return;
				}
				local542 = Static82.aClass229_1.method5206();
				if (local542 == 21) {
					Static90.anInt1905 = 7;
				} else if (local542 == 29) {
					Static90.anInt1905 = 13;
				} else if (local542 == 1) {
					Static90.anInt1905 = 5;
					Static172.method2765(local542);
					return;
				} else if (local542 == 2) {
					Static90.anInt1905 = 8;
				} else if (local542 == 15) {
					Static167.anInt3076 = -2;
					Static90.anInt1905 = 14;
				} else if (local542 == 23 && Static198.anInt3589 < 1) {
					Static237.anInt5950 = 0;
					Static198.anInt3589++;
					Static90.anInt1905 = 1;
					Static82.aClass229_1.method5204();
					Static82.aClass229_1 = null;
					return;
				} else {
					Static90.anInt1905 = 0;
					Static172.method2765(local542);
					Static82.aClass229_1.method5204();
					Static82.aClass229_1 = null;
					Static324.method4619();
					return;
				}
			}
			if (Static90.anInt1905 == 6) {
				Static92.aClass1_Sub5_Sub1_1.anInt6475 = 0;
				Static92.aClass1_Sub5_Sub1_1.method317(Static114.aClass208_4.anInt5814);
				Static82.aClass229_1.method5207(Static92.aClass1_Sub5_Sub1_1.aByteArray89, Static92.aClass1_Sub5_Sub1_1.anInt6475);
				Static90.anInt1905 = 4;
			} else if (Static90.anInt1905 == 7) {
				if (Static82.aClass229_1.method5208() >= 1) {
					Static371.anInt7102 = Static82.aClass229_1.method5206() * 60 + 180;
					Static90.anInt1905 = 0;
					Static172.method2765(21);
					Static82.aClass229_1.method5204();
					Static82.aClass229_1 = null;
					Static324.method4619();
				}
			} else if (Static90.anInt1905 == 13) {
				if (Static82.aClass229_1.method5208() >= 1) {
					Static141.anInt2741 = Static82.aClass229_1.method5206();
					Static90.anInt1905 = 0;
					Static172.method2765(29);
					Static82.aClass229_1.method5204();
					Static82.aClass229_1 = null;
					Static324.method4619();
				}
			} else if (Static90.anInt1905 != 8) {
				@Pc(735) Class1_Sub5_Sub1 local735;
				if (Static90.anInt1905 == 9) {
					local735 = Static206.aClass1_Sub5_Sub1_2;
					if (Static164.anInt3043 == 3) {
						Static404.aBoolean444 = true;
					} else {
						Static404.aBoolean444 = false;
					}
					if (Static164.anInt3043 == 2 || Static164.anInt3043 == 3) {
						if (Static82.aClass229_1.method5208() < Static64.anInt1504) {
							return;
						}
						Static82.aClass229_1.method5203(0, Static64.anInt1504, local735.aByteArray89);
						local735.anInt6475 = 0;
						Static225.anInt4107 = local735.method5366();
						Static71.anInt3034 = local735.method5366();
						Static47.aBoolean48 = local735.method5366() == 1;
						Static217.aBoolean286 = local735.method5366() == 1;
						Static95.aBoolean119 = local735.method5366() == 1;
						Static139.aBoolean166 = local735.method5366() == 1;
						Static102.anInt2165 = local735.method5362();
						Static158.aBoolean180 = local735.method5366() == 1;
						Static232.aBoolean297 = local735.method5366() == 1;
						if (Static164.anInt3043 == 3) {
							@Pc(854) boolean local854 = local735.method5366() == 1;
							if (local854) {
								@Pc(860) long local860 = local735.method5371();
								@Pc(866) String local866 = Static65.method1318(local860);
								@Pc(870) int local870 = local735.method5366();
								@Pc(873) byte[] local873 = new byte[local870];
								local735.method310(local873, local870);
								@Pc(883) String local883 = Static446.method5862(local873);
								@Pc(885) Class222 local885 = null;
								try {
									@Pc(893) Class9 local893 = Static77.aClass180_1.method4083("3", false);
									while (local893.anInt368 == 0) {
										Static224.method3441(1L);
									}
									if (local893.anInt368 == 1) {
										local885 = (Class222) local893.anObject2;
										@Pc(926) int local926 = local866.length() + local883.length() + 4 + 3 + 2;
										if (local926 > 50) {
											throw new RuntimeException(">50");
										}
										@Pc(943) Class1_Sub5 local943 = new Class1_Sub5(local926 + 1);
										local943.method5396(local926);
										local943.method5396(0);
										local943.method5378(local866);
										local943.method5378(local883);
										local943.method5418();
										local885.method4986(local943.anInt6475, local943.aByteArray89, 0);
									}
								} catch (@Pc(975) Exception local975) {
								}
								try {
									if (local885 != null) {
										local885.method4988();
									}
								} catch (@Pc(984) Exception local984) {
								}
							}
						}
						Static349.aClass115_4.method2761(Static232.aBoolean297);
						Static165.aClass19_1.method554(Static232.aBoolean297);
						Static238.aClass116_2.method2821(Static232.aBoolean297);
					} else if (Static82.aClass229_1.method5208() >= Static64.anInt1504) {
						Static82.aClass229_1.method5203(0, Static64.anInt1504, local735.aByteArray89);
						local735.anInt6475 = 0;
						Static225.anInt4107 = local735.method5366();
						Static71.anInt3034 = local735.method5366();
						Static47.aBoolean48 = local735.method5366() == 1;
						Static217.aBoolean286 = local735.method5366() == 1;
						Static95.aBoolean119 = local735.method5366() == 1;
						Static91.anInt1907 = local735.method5362();
						Static158.aBoolean180 = Static91.anInt1907 > 0;
						Static223.anInt4063 = local735.method5362();
						Static206.anInt3914 = local735.method5362();
						Static314.anInt5422 = local735.method5362();
						Static133.anInt2664 = local735.method5407();
						Static58.aClass9_5 = Static77.aClass180_1.method4074(Static133.anInt2664);
						Static383.anInt6219 = local735.method5366();
						Static309.anInt5336 = local735.method5362();
						Static339.anInt5744 = local735.method5362();
						Static119.aBoolean38 = local735.method5366() == 1;
						Static452.aClass31_Sub2_Sub1_Sub1_2.aString10 = Static452.aClass31_Sub2_Sub1_Sub1_2.aString9 = local735.method5406();
						Static181.aClass209_2 = new Class209();
						Static181.aClass209_2.anInt5815 = local735.method5362();
						if (Static181.aClass209_2.anInt5815 == 65535) {
							Static181.aClass209_2.anInt5815 = -1;
						}
						Static181.aClass209_2.aString60 = local735.method5406();
						if (Static102.aClass137_5 != Static35.aClass137_11 && Static451.aClass209_5 == Static315.aClass209_3) {
							Static451.aClass209_5 = Static181.aClass209_2;
						}
						if (Static45.aClass137_10 != Static35.aClass137_11) {
							Static181.aClass209_2.anInt5817 = Static181.aClass209_2.anInt5815 + 40000;
							Static181.aClass209_2.anInt5818 = Static181.aClass209_2.anInt5815 + 50000;
						}
					} else {
						return;
					}
					if (Static47.aBoolean48 && !Static95.aBoolean119 || Static158.aBoolean180) {
						try {
							Static463.method2376("zap", Static77.aClass180_1.anApplet1);
						} catch (@Pc(1191) Throwable local1191) {
							if (Static222.aBoolean289) {
								try {
									Static77.aClass180_1.anApplet1.getAppletContext().showDocument(new URL(Static77.aClass180_1.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1207) Exception local1207) {
								}
							}
						}
					} else {
						try {
							Static463.method2376("unzap", Static77.aClass180_1.anApplet1);
						} catch (@Pc(1181) Throwable local1181) {
						}
					}
					if (Static35.aClass137_11 == Static45.aClass137_10) {
						try {
							Static463.method2376("loggedin", Static77.aClass180_1.anApplet1);
						} catch (@Pc(1221) Throwable local1221) {
						}
					}
					if (Static164.anInt3043 != 2 && Static164.anInt3043 != 3) {
						Static90.anInt1905 = 0;
						Static172.method2765(2);
						Static423.method5619();
						Static193.method2987(6);
						Static269.aClass107_139 = null;
						return;
					}
					Static90.anInt1905 = 11;
				}
				if (Static90.anInt1905 == 11) {
					if (Static82.aClass229_1.method5208() < 3) {
						return;
					}
					Static82.aClass229_1.method5203(0, 3, Static206.aClass1_Sub5_Sub1_2.aByteArray89);
					Static90.anInt1905 = 12;
				}
				if (Static90.anInt1905 == 12) {
					local735 = Static206.aClass1_Sub5_Sub1_2;
					local735.anInt6475 = 0;
					if (local735.method308()) {
						if (Static82.aClass229_1.method5208() < 1) {
							return;
						}
						Static82.aClass229_1.method5203(3, 1, local735.aByteArray89);
					}
					Static269.aClass107_139 = Static381.method5669()[local735.method314()];
					Static167.anInt3076 = local735.method5362();
					Static90.anInt1905 = 10;
				}
				if (Static90.anInt1905 == 10) {
					if (Static82.aClass229_1.method5208() >= Static167.anInt3076) {
						Static82.aClass229_1.method5203(0, Static167.anInt3076, Static206.aClass1_Sub5_Sub1_2.aByteArray89);
						Static206.aClass1_Sub5_Sub1_2.anInt6475 = 0;
						local542 = Static167.anInt3076;
						Static90.anInt1905 = 0;
						Static172.method2765(2);
						Static347.method4848();
						Static161.method2624(Static206.aClass1_Sub5_Sub1_2);
						Static307.anInt5295 = -1;
						Static276.method4034();
						if (Static206.aClass1_Sub5_Sub1_2.anInt6475 != local542) {
							throw new RuntimeException("lswp pos:" + Static206.aClass1_Sub5_Sub1_2.anInt6475 + " psize:" + local542);
						}
						Static269.aClass107_139 = null;
					}
				} else if (Static90.anInt1905 == 14) {
					if (Static167.anInt3076 == -2) {
						if (Static82.aClass229_1.method5208() < 2) {
							return;
						}
						Static82.aClass229_1.method5203(0, 2, Static206.aClass1_Sub5_Sub1_2.aByteArray89);
						Static206.aClass1_Sub5_Sub1_2.anInt6475 = 0;
						Static167.anInt3076 = Static206.aClass1_Sub5_Sub1_2.method5362();
					}
					if (Static82.aClass229_1.method5208() >= Static167.anInt3076) {
						Static82.aClass229_1.method5203(0, Static167.anInt3076, Static206.aClass1_Sub5_Sub1_2.aByteArray89);
						Static206.aClass1_Sub5_Sub1_2.anInt6475 = 0;
						Static90.anInt1905 = 0;
						local542 = Static167.anInt3076;
						Static172.method2765(15);
						Static111.method1989();
						Static161.method2624(Static206.aClass1_Sub5_Sub1_2);
						if (Static206.aClass1_Sub5_Sub1_2.anInt6475 != local542) {
							throw new RuntimeException("lswpr pos:" + Static206.aClass1_Sub5_Sub1_2.anInt6475 + " psize:" + local542);
						}
						Static269.aClass107_139 = null;
					}
				}
			} else if (Static82.aClass229_1.method5208() >= 1) {
				Static64.anInt1504 = Static82.aClass229_1.method5206();
				Static90.anInt1905 = 9;
			}
		} catch (@Pc(1447) IOException local1447) {
			if (Static82.aClass229_1 != null) {
				Static82.aClass229_1.method5204();
				Static82.aClass229_1 = null;
			}
			if (Static198.anInt3589 >= 1) {
				Static90.anInt1905 = 0;
				Static172.method2765(-4);
				Static324.method4619();
			} else {
				Static237.anInt5950 = 0;
				Static90.anInt1905 = 1;
				Static198.anInt3589++;
				if (Static164.anInt3043 == 2 || Static164.anInt3043 == 3) {
					Static451.aClass209_5.aBoolean406 = !Static451.aClass209_5.aBoolean406;
				} else {
					Static81.aClass209_1.aBoolean406 = !Static81.aClass209_1.aBoolean406;
				}
			}
		}
	}
}
