import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!hq", name = "K", descriptor = "I")
	public static int anInt3386;

	@OriginalMember(owner = "client!hq", name = "G", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_41 = new Class306("Loading HW3D - ", "Lade HW3D - ", "Chargement HW3D - ", "Carregando HW3D - ");

	@OriginalMember(owner = "client!hq", name = "J", descriptor = "I")
	public static int anInt3385 = 0;

	@OriginalMember(owner = "client!hq", name = "L", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_42 = new Class306("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!hq", name = "i", descriptor = "(I)V")
	public static void method2952() {
		if (Static250.anInt4901 == 0 || Static250.anInt4901 == 6) {
			return;
		}
		try {
			if (++Static344.anInt6169 > 2000) {
				if (Static402.aClass56_2 != null) {
					Static402.aClass56_2.method1312();
					Static402.aClass56_2 = null;
				}
				if (Static387.anInt7025 >= 1) {
					Static250.anInt4901 = 0;
					Static375.method5758(-5);
					return;
				}
				Static387.anInt7025++;
				if (Static438.anInt7729 == 2 || Static438.anInt7729 == 3) {
					Static52.aClass4_1.aBoolean8 = !Static52.aClass4_1.aBoolean8;
				} else {
					Static86.aClass4_4.aBoolean8 = !Static86.aClass4_4.aBoolean8;
				}
				Static344.anInt6169 = 0;
				Static250.anInt4901 = 1;
			}
			if (Static250.anInt4901 == 1) {
				if (Static438.anInt7729 == 2 || Static438.anInt7729 == 3) {
					Static214.aClass157_2 = Static466.aClass102_4.method2395(Static52.aClass4_1.aString2, Static52.aClass4_1.method243());
				} else {
					Static214.aClass157_2 = Static466.aClass102_4.method2395(Static86.aClass4_4.aString2, Static86.aClass4_4.method243());
				}
				Static250.anInt4901 = 2;
			}
			if (Static250.anInt4901 == 2) {
				if (Static214.aClass157_2.anInt4742 == 2) {
					throw new IOException();
				}
				if (Static214.aClass157_2.anInt4742 != 1) {
					return;
				}
				Static402.aClass56_2 = Static81.method1383((Socket) Static214.aClass157_2.anObject12);
				Static214.aClass157_2 = null;
				@Pc(142) long local142 = Static360.aLong280 = Static259.method4365(Static328.aString55);
				@Pc(149) int local149 = (int) (local142 >> 16 & 0x1FL);
				Static455.aClass1_Sub6_Sub2_2.anInt4555 = 0;
				Static455.aClass1_Sub6_Sub2_2.method3937(Static295.aClass158_1.anInt4745);
				Static455.aClass1_Sub6_Sub2_2.method3937(local149);
				Static402.aClass56_2.method1315(2, Static455.aClass1_Sub6_Sub2_2.aByteArray66);
				Static250.anInt4901 = 3;
			}
			@Pc(196) int local196;
			if (Static250.anInt4901 == 3) {
				if (!Static402.aClass56_2.method1313(1)) {
					return;
				}
				Static402.aClass56_2.method1316(1, 0, Static97.aClass1_Sub6_Sub2_1.aByteArray66);
				local196 = Static97.aClass1_Sub6_Sub2_1.aByteArray66[0] & 0xFF;
				if (local196 != 0) {
					Static250.anInt4901 = 0;
					Static375.method5758(local196);
					Static402.aClass56_2.method1312();
					Static402.aClass56_2 = null;
					Static488.method6696();
					return;
				}
				Static250.anInt4901 = 4;
			}
			if (Static250.anInt4901 == 4) {
				if (!Static402.aClass56_2.method1313(8)) {
					return;
				}
				Static402.aClass56_2.method1316(8, 0, Static97.aClass1_Sub6_Sub2_1.aByteArray66);
				Static97.aClass1_Sub6_Sub2_1.anInt4555 = 0;
				Static540.aLong391 = Static97.aClass1_Sub6_Sub2_1.method3949();
				@Pc(245) Class1_Sub6 local245 = new Class1_Sub6(518);
				@Pc(248) int[] local248 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static540.aLong391 >> 32), (int) Static540.aLong391 };
				local245.method3937(10);
				local245.method3948(local248[0]);
				local245.method3948(local248[1]);
				local245.method3948(local248[2]);
				local245.method3948(local248[3]);
				local245.method3926(Static259.method4365(Static328.aString55));
				local245.method3917(Static308.aString52);
				local245.method3926(Static157.aLong181);
				local245.method3926(Static494.aLong346);
				local245.method3933(Static335.aBigInteger5, Static494.aBigInteger6);
				@Pc(327) Class1_Sub6_Sub2 local327 = Static455.aClass1_Sub6_Sub2_2;
				local327.anInt4555 = 0;
				@Pc(348) int local348;
				if (Static438.anInt7729 == 2 || Static438.anInt7729 == 3) {
					if (Static268.anInt5100 == 12) {
						local327.method3937(Static295.aClass158_5.anInt4745);
					} else {
						local327.method3937(Static295.aClass158_3.anInt4745);
					}
					local327.method3919(0);
					local348 = local327.anInt4555;
					local327.method3948(610);
					local327.method3937(Static418.anInt7355);
					local327.method3937(Static306.method4842());
					local327.method3919(Static83.anInt1567);
					local327.method3919(Static350.anInt6255);
					local327.method3937(Static544.aClass1_Sub22_Sub1_1.anInt5445);
					Static167.method3552(local327);
					local327.method3917(Static285.aString48);
					local327.method3948(Static543.anInt9158);
					@Pc(459) Class1_Sub6 local459 = new Class1_Sub6(Static23.method7118());
					Static544.aClass1_Sub22_Sub1_1.method4653(local459);
					local327.method3937(local459.anInt4555);
					local327.method3940(local459.aByteArray66, local459.anInt4555);
					Static375.aBoolean499 = true;
					@Pc(484) Class1_Sub6 local484 = new Class1_Sub6(Static38.method882());
					(new Class1_Sub7(true, Static466.aClass102_4)).method757(local484);
					local327.method3940(local484.aByteArray66, local484.aByteArray66.length);
					local327.method3919(Static475.anInt6155);
					Static463.method6528();
					local327.method3940(local245.aByteArray66, local245.anInt4555);
					local327.method3942(local327.anInt4555 - local348);
				} else {
					local327.method3937(Static295.aClass158_6.anInt4745);
					local327.method3919(0);
					local348 = local327.anInt4555;
					local327.method3948(610);
					local327.method3937(Static304.aClass101_1.anInt2782);
					local327.method3937(Static179.anInt3168);
					Static167.method3552(local327);
					local327.method3917(Static285.aString48);
					local327.method3948(Static543.anInt9158);
					Static463.method6528();
					local327.method3940(local245.aByteArray66, local245.anInt4555);
					local327.method3942(local327.anInt4555 - local348);
				}
				Static402.aClass56_2.method1315(local327.anInt4555, local327.aByteArray66);
				local327.method3978(local248);
				for (local348 = 0; local348 < 4; local348++) {
					local248[local348] += 50;
				}
				Static97.aClass1_Sub6_Sub2_1.method3978(local248);
				Static250.anInt4901 = 5;
			}
			if (Static250.anInt4901 == 5) {
				if (!Static402.aClass56_2.method1313(1)) {
					return;
				}
				Static402.aClass56_2.method1316(1, 0, Static97.aClass1_Sub6_Sub2_1.aByteArray66);
				local196 = Static97.aClass1_Sub6_Sub2_1.aByteArray66[0] & 0xFF;
				if (local196 == 21) {
					Static250.anInt4901 = 8;
				} else if (local196 == 29) {
					Static250.anInt4901 = 14;
				} else if (local196 == 1) {
					Static250.anInt4901 = 6;
					Static375.method5758(local196);
					return;
				} else if (local196 == 2) {
					Static250.anInt4901 = 9;
				} else if (local196 == 15) {
					Static250.anInt4901 = 15;
					Static405.anInt9105 = -2;
				} else if (local196 == 23 && Static387.anInt7025 < 1) {
					Static250.anInt4901 = 1;
					Static387.anInt7025++;
					Static344.anInt6169 = 0;
					Static402.aClass56_2.method1312();
					Static402.aClass56_2 = null;
					return;
				} else {
					Static250.anInt4901 = 0;
					Static375.method5758(local196);
					Static402.aClass56_2.method1312();
					Static402.aClass56_2 = null;
					Static488.method6696();
					return;
				}
			}
			if (Static250.anInt4901 == 7) {
				Static455.aClass1_Sub6_Sub2_2.anInt4555 = 0;
				Static455.aClass1_Sub6_Sub2_2.method3973(Static295.aClass158_13.anInt4745);
				Static402.aClass56_2.method1315(Static455.aClass1_Sub6_Sub2_2.anInt4555, Static455.aClass1_Sub6_Sub2_2.aByteArray66);
				Static250.anInt4901 = 5;
			} else if (Static250.anInt4901 == 8) {
				if (Static402.aClass56_2.method1313(1)) {
					Static402.aClass56_2.method1316(1, 0, Static97.aClass1_Sub6_Sub2_1.aByteArray66);
					local196 = Static97.aClass1_Sub6_Sub2_1.aByteArray66[0] & 0xFF;
					Static250.anInt4901 = 0;
					Static5.anInt107 = local196 * 60 + 180;
					Static375.method5758(21);
					Static402.aClass56_2.method1312();
					Static402.aClass56_2 = null;
					Static488.method6696();
				}
			} else if (Static250.anInt4901 == 14) {
				if (Static402.aClass56_2.method1313(1)) {
					Static402.aClass56_2.method1316(1, 0, Static97.aClass1_Sub6_Sub2_1.aByteArray66);
					Static427.anInt7473 = Static97.aClass1_Sub6_Sub2_1.aByteArray66[0] & 0xFF;
					Static250.anInt4901 = 0;
					Static375.method5758(29);
					Static402.aClass56_2.method1312();
					Static402.aClass56_2 = null;
					Static488.method6696();
				}
			} else if (Static250.anInt4901 != 9) {
				@Pc(808) Class1_Sub6_Sub2 local808;
				if (Static250.anInt4901 == 10) {
					if (Static438.anInt7729 == 3) {
						Static476.aBoolean565 = true;
					} else {
						Static476.aBoolean565 = false;
					}
					local808 = Static97.aClass1_Sub6_Sub2_1;
					if (Static438.anInt7729 == 2 || Static438.anInt7729 == 3) {
						if (!Static402.aClass56_2.method1313(Class1_Sub6.lb)) {
							return;
						}
						Static402.aClass56_2.method1316(Class1_Sub6.lb, 0, local808.aByteArray66);
						local808.anInt4555 = 0;
						Static313.anInt5785 = local808.method3922();
						Static154.anInt2806 = local808.method3922();
						Static264.aBoolean360 = local808.method3922() == 1;
						Static397.aBoolean514 = local808.method3922() == 1;
						Static407.aBoolean520 = local808.method3922() == 1;
						Static164.aBoolean185 = local808.method3922() == 1;
						Static198.anInt3873 = local808.method3967();
						Static39.aBoolean38 = local808.method3922() == 1;
						Static157.anInt4565 = local808.method3968();
						Static83.aBoolean102 = local808.method3922() == 1;
						if (Static438.anInt7729 == 3) {
							@Pc(1092) boolean local1092 = local808.method3922() == 1;
							if (local1092) {
								@Pc(1098) long local1098 = local808.method3949();
								@Pc(1102) String local1102 = Static545.method7543(local1098);
								@Pc(1106) int local1106 = local808.method3922();
								@Pc(1109) byte[] local1109 = new byte[local1106];
								local808.method3974(local1106, local1109);
								@Pc(1119) String local1119 = Static398.method6005(local1109);
								@Pc(1121) Class177 local1121 = null;
								try {
									@Pc(1127) Class157 local1127 = Static466.aClass102_4.method2388(false, "3");
									while (local1127.anInt4742 == 0) {
										Static209.method3565(1L);
									}
									if (local1127.anInt4742 == 1) {
										local1121 = (Class177) local1127.anObject12;
										@Pc(1159) int local1159 = local1102.length() + local1119.length() + 2 + 5 + 4;
										if (local1159 > 50) {
											throw new RuntimeException(">50");
										}
										@Pc(1174) Class1_Sub6 local1174 = new Class1_Sub6(local1159 + 1);
										local1174.method3937(local1159);
										local1174.method3937(1);
										local1174.method3930(local1102);
										local1174.method3930(local1119);
										local1174.method3919(Static543.anInt9158);
										local1174.method3962();
										local1121.method4408(local1174.anInt4555, local1174.aByteArray66, 0);
									}
								} catch (@Pc(1208) Exception local1208) {
								}
								try {
									if (local1121 != null) {
										local1121.method4411();
									}
								} catch (@Pc(1215) Exception local1215) {
								}
								try {
									Static557.method5219("demoaccountcreated", Static466.aClass102_4.anApplet1);
								} catch (@Pc(1223) Throwable local1223) {
								}
							}
						}
						Static308.aClass96_4.method2276(Static83.aBoolean102);
						Static342.aClass250_2.method5978(Static83.aBoolean102);
						Static538.aClass242_2.method5835(Static83.aBoolean102);
					} else if (Static402.aClass56_2.method1313(Class1_Sub6.lb)) {
						Static402.aClass56_2.method1316(Class1_Sub6.lb, 0, local808.aByteArray66);
						local808.anInt4555 = 0;
						Static313.anInt5785 = local808.method3922();
						Static154.anInt2806 = local808.method3922();
						Static264.aBoolean360 = local808.method3922() == 1;
						Static397.aBoolean514 = local808.method3922() == 1;
						Static407.aBoolean520 = local808.method3922() == 1;
						Static313.anInt5782 = local808.method3967();
						Static39.aBoolean38 = Static313.anInt5782 > 0;
						Static307.anInt5684 = local808.method3967();
						Static360.anInt6344 = local808.method3967();
						Static534.anInt9005 = local808.method3967();
						Static165.anInt2978 = local808.method3925();
						Static528.aClass157_9 = Static466.aClass102_4.method2382(Static165.anInt2978);
						Static192.anInt3399 = local808.method3922();
						Static173.anInt3085 = local808.method3967();
						Static193.anInt7223 = local808.method3967();
						Static20.aBoolean22 = local808.method3922() == 1;
						Static63.aClass49_Sub2_Sub2_Sub1_1.aString16 = Static63.aClass49_Sub2_Sub2_Sub1_1.aString17 = local808.method3932();
						Static71.aClass4_2 = new Class4();
						Static71.aClass4_2.anInt111 = local808.method3967();
						if (Static71.aClass4_2.anInt111 == 65535) {
							Static71.aClass4_2.anInt111 = -1;
						}
						Static71.aClass4_2.aString2 = local808.method3932();
						if (Static145.aClass21_4 != Static71.aClass21_1) {
							Static71.aClass4_2.anInt114 = Static71.aClass4_2.anInt111 + 50000;
							Static71.aClass4_2.anInt113 = Static71.aClass4_2.anInt111 + 40000;
						}
						if (Static247.aClass21_5 != Static145.aClass21_4 && (Static52.aClass4_1.method246(Static77.aClass4_3) || Static52.aClass4_1.method246(Static192.aClass4_5))) {
							Static86.method1468();
						}
					} else {
						return;
					}
					if (Static264.aBoolean360 && !Static407.aBoolean520 || Static39.aBoolean38) {
						try {
							Static557.method5219("zap", Static466.aClass102_4.anApplet1);
						} catch (@Pc(1250) Throwable local1250) {
							if (Static146.aBoolean177) {
								try {
									Static466.aClass102_4.anApplet1.getAppletContext().showDocument(new URL(Static466.aClass102_4.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1266) Exception local1266) {
								}
							}
						}
					} else {
						try {
							Static557.method5219("unzap", Static466.aClass102_4.anApplet1);
						} catch (@Pc(1276) Throwable local1276) {
						}
					}
					if (Static71.aClass21_1 == Static145.aClass21_4) {
						try {
							Static557.method5219("loggedin", Static466.aClass102_4.anApplet1);
						} catch (@Pc(1288) Throwable local1288) {
						}
					}
					if (Static438.anInt7729 != 2 && Static438.anInt7729 != 3) {
						Static250.anInt4901 = 0;
						Static375.method5758(2);
						Static153.method2416();
						Static85.method1463(6);
						Static193.aClass140_112 = null;
						return;
					}
					Static250.anInt4901 = 12;
				}
				if (Static250.anInt4901 == 12) {
					if (!Static402.aClass56_2.method1313(3)) {
						return;
					}
					Static402.aClass56_2.method1316(3, 0, Static97.aClass1_Sub6_Sub2_1.aByteArray66);
					Static250.anInt4901 = 13;
				}
				if (Static250.anInt4901 == 13) {
					local808 = Static97.aClass1_Sub6_Sub2_1;
					local808.anInt4555 = 0;
					if (local808.method3975()) {
						if (!Static402.aClass56_2.method1313(1)) {
							return;
						}
						Static402.aClass56_2.method1316(1, 3, local808.aByteArray66);
					}
					Static193.aClass140_112 = Static298.method4744()[local808.method3979()];
					Static405.anInt9105 = local808.method3967();
					Static250.anInt4901 = 11;
				}
				if (Static250.anInt4901 == 11) {
					if (Static402.aClass56_2.method1313(Static405.anInt9105)) {
						Static402.aClass56_2.method1316(Static405.anInt9105, 0, Static97.aClass1_Sub6_Sub2_1.aByteArray66);
						Static97.aClass1_Sub6_Sub2_1.anInt4555 = 0;
						Static250.anInt4901 = 0;
						local196 = Static405.anInt9105;
						Static375.method5758(2);
						Static409.method6082();
						Static370.method7392(Static97.aClass1_Sub6_Sub2_1);
						Static460.anInt7803 = -1;
						Static510.method6250();
						if (Static97.aClass1_Sub6_Sub2_1.anInt4555 != local196) {
							throw new RuntimeException("lswp pos:" + Static97.aClass1_Sub6_Sub2_1.anInt4555 + " psize:" + local196);
						}
						Static193.aClass140_112 = null;
					}
				} else if (Static250.anInt4901 == 15) {
					if (Static405.anInt9105 == -2) {
						if (!Static402.aClass56_2.method1313(2)) {
							return;
						}
						Static402.aClass56_2.method1316(2, 0, Static97.aClass1_Sub6_Sub2_1.aByteArray66);
						Static97.aClass1_Sub6_Sub2_1.anInt4555 = 0;
						Static405.anInt9105 = Static97.aClass1_Sub6_Sub2_1.method3967();
					}
					if (Static402.aClass56_2.method1313(Static405.anInt9105)) {
						Static402.aClass56_2.method1316(Static405.anInt9105, 0, Static97.aClass1_Sub6_Sub2_1.aByteArray66);
						Static97.aClass1_Sub6_Sub2_1.anInt4555 = 0;
						local196 = Static405.anInt9105;
						Static250.anInt4901 = 0;
						Static375.method5758(15);
						Static402.method6057();
						Static370.method7392(Static97.aClass1_Sub6_Sub2_1);
						if (Static97.aClass1_Sub6_Sub2_1.anInt4555 != local196) {
							throw new RuntimeException("lswpr pos:" + Static97.aClass1_Sub6_Sub2_1.anInt4555 + " psize:" + local196);
						}
						Static193.aClass140_112 = null;
					}
				}
			} else if (Static402.aClass56_2.method1313(1)) {
				Static402.aClass56_2.method1316(1, 0, Static97.aClass1_Sub6_Sub2_1.aByteArray66);
				Static250.anInt4901 = 10;
				Class1_Sub6.lb = Static97.aClass1_Sub6_Sub2_1.aByteArray66[0] & 0xFF;
			}
		} catch (@Pc(1519) IOException local1519) {
			if (Static402.aClass56_2 != null) {
				Static402.aClass56_2.method1312();
				Static402.aClass56_2 = null;
			}
			if (Static387.anInt7025 >= 1) {
				Static250.anInt4901 = 0;
				Static375.method5758(-4);
				Static488.method6696();
			} else {
				Static387.anInt7025++;
				Static344.anInt6169 = 0;
				Static250.anInt4901 = 1;
				if (Static438.anInt7729 == 2 || Static438.anInt7729 == 3) {
					Static52.aClass4_1.aBoolean8 = !Static52.aClass4_1.aBoolean8;
				} else {
					Static86.aClass4_4.aBoolean8 = !Static86.aClass4_4.aBoolean8;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(BII)V")
	public static void method2953(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17;
		if (arg0 != Static452.anInt7734) {
			Static228.anIntArray442 = new int[arg0];
			for (local17 = 0; local17 < arg0; local17++) {
				Static228.anIntArray442[local17] = (local17 << 12) / arg0;
			}
			Static452.anInt7734 = arg0;
			Static204.anInt4014 = arg0 * 32;
			Static80.anInt1453 = arg0 - 1;
		}
		if (arg1 == Static272.anInt5156) {
			return;
		}
		if (arg1 == Static452.anInt7734) {
			Static7.anIntArray20 = Static228.anIntArray442;
		} else {
			Static7.anIntArray20 = new int[arg1];
			for (local17 = 0; local17 < arg1; local17++) {
				Static7.anIntArray20[local17] = (local17 << 12) / arg1;
			}
		}
		Static272.anInt5156 = arg1;
		Static323.anInt5914 = arg1 - 1;
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(IBI)I")
	public static int method2955(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static430.anIntArray655[arg1 & 0x3] : Static39.anIntArray116[arg1 & 0x3];
	}
}
