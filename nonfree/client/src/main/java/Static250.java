import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!jg", name = "V", descriptor = "[[S")
	public static short[][] aShortArrayArray12;

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(II)V")
	public static void method3582(@OriginalArg(1) int arg0) {
		Static377.anInt6297 = 2;
		Static124.anInt9459 = arg0;
		if (Static353.aString80 == null) {
			Static29.method389(35);
		} else {
			@Pc(29) Class2_Sub7 local29 = new Class2_Sub7(Static383.method5319(Static401.method5487(Static353.aString80)));
			@Pc(33) long local33 = local29.method4514();
			Static217.aLong94 = local29.method4514();
			Static24.method350(true, "", Static100.method1511(local33));
		}
	}

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "(B)V")
	public static void method3583() {
		if (Static135.anInt8199 == 0 || Static135.anInt8199 == 6) {
			return;
		}
		try {
			if (++Static364.anInt6128 > 2000) {
				if (Static529.aClass124_2 != null) {
					Static529.aClass124_2.method2256();
					Static529.aClass124_2 = null;
				}
				if (Static376.anInt6288 >= 2) {
					Static135.anInt8199 = 0;
					Static29.method389(-5);
					return;
				}
				if (Static377.anInt6297 == 2 || Static377.anInt6297 == 3) {
					Static489.aClass292_5.method5908();
				} else {
					Static323.aClass292_3.method5908();
				}
				Static135.anInt8199 = 1;
				Static376.anInt6288++;
				Static364.anInt6128 = 0;
			}
			if (Static135.anInt8199 == 1) {
				if (Static377.anInt6297 == 2 || Static377.anInt6297 == 3) {
					Static56.aClass5_2 = Static489.aClass292_5.method5912(Static169.aClass99_2);
				} else {
					Static56.aClass5_2 = Static323.aClass292_3.method5912(Static169.aClass99_2);
				}
				Static135.anInt8199 = 2;
			}
			if (Static135.anInt8199 == 2) {
				if (Static56.aClass5_2.anInt151 == 2) {
					throw new IOException();
				}
				if (Static56.aClass5_2.anInt151 != 1) {
					return;
				}
				Static529.aClass124_2 = Static421.method5638((Socket) Static56.aClass5_2.anObject1);
				Static56.aClass5_2 = null;
				@Pc(126) long local126 = Static593.aLong271 = Static367.method5177(Static64.aString14);
				@Pc(133) int local133 = (int) (local126 >> 16 & 0x1FL);
				Static484.method6237();
				@Pc(138) Class2_Sub34 local138 = Static593.method7730();
				local138.aClass2_Sub7_Sub2_2.method4459(Static28.aClass283_1.anInt6971);
				local138.aClass2_Sub7_Sub2_2.method4459(local133);
				Static100.method1508(local138);
				Static509.method6612();
				Static135.anInt8199 = 3;
			}
			@Pc(182) int local182;
			if (Static135.anInt8199 == 3) {
				if (!Static529.aClass124_2.method2253(1)) {
					return;
				}
				Static529.aClass124_2.method2250(0, Static361.aClass2_Sub7_Sub2_1.aByteArray52, 1);
				local182 = Static361.aClass2_Sub7_Sub2_1.aByteArray52[0] & 0xFF;
				if (local182 != 0) {
					Static135.anInt8199 = 0;
					Static29.method389(local182);
					Static529.aClass124_2.method2256();
					Static529.aClass124_2 = null;
					Static593.method7729();
					return;
				}
				Static135.anInt8199 = 4;
			}
			if (Static135.anInt8199 == 4) {
				if (!Static529.aClass124_2.method2253(8)) {
					return;
				}
				Static529.aClass124_2.method2250(0, Static361.aClass2_Sub7_Sub2_1.aByteArray52, 8);
				Static361.aClass2_Sub7_Sub2_1.anInt5186 = 0;
				Static290.aLong121 = Static361.aClass2_Sub7_Sub2_1.method4514();
				@Pc(228) Class2_Sub7 local228 = new Class2_Sub7(518);
				@Pc(231) int[] local231 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static290.aLong121 >> 32), (int) Static290.aLong121 };
				local228.method4459(10);
				local228.method4495(local231[0]);
				local228.method4495(local231[1]);
				local228.method4495(local231[2]);
				local228.method4495(local231[3]);
				local228.method4493(Static367.method5177(Static64.aString14));
				local228.method4481(Static6.aString4);
				local228.method4493(Static217.aLong94);
				local228.method4493(Static191.aLong86);
				local228.method4480(Static462.aBigInteger6, Static390.aBigInteger5);
				Static484.method6237();
				@Pc(319) Class2_Sub34 local319 = Static593.method7730();
				@Pc(322) Class2_Sub7_Sub2 local322 = local319.aClass2_Sub7_Sub2_2;
				@Pc(344) int local344;
				if (Static377.anInt6297 == 2 || Static377.anInt6297 == 3) {
					if (Static540.anInt8912 == 13) {
						local322.method4459(Static28.aClass283_5.anInt6971);
					} else {
						local322.method4459(Static28.aClass283_3.anInt6971);
					}
					local322.method4511(0);
					local344 = local322.anInt5186;
					local322.method4495(627);
					local322.method4459(Static124.anInt9459);
					local322.method4459(Static480.method6206());
					local322.method4511(Static172.anInt2621);
					local322.method4511(Static187.anInt8962);
					local322.method4459(Static257.aClass2_Sub35_Sub1_1.anInt7498);
					Static568.method7409(local322);
					local322.method4481(Static523.aString125);
					local322.method4495(Static516.anInt8248);
					@Pc(460) Class2_Sub7 local460 = new Class2_Sub7(Static202.method2528());
					Static257.aClass2_Sub35_Sub1_1.method6038(local460);
					local322.method4459(local460.anInt5186);
					local322.method4498(local460.aByteArray52, local460.anInt5186);
					Static237.aBoolean297 = true;
					@Pc(490) Class2_Sub7 local490 = new Class2_Sub7(Static236.aClass2_Sub49_1.method7239());
					Static236.aClass2_Sub49_1.method7236(local490);
					local322.method4498(local490.aByteArray52, local490.aByteArray52.length);
					local322.method4511(Static240.anInt9588);
					local322.method4493(Static309.aLong139);
					local322.method4459(Static409.aString96 == null ? 0 : 1);
					if (Static409.aString96 != null) {
						local322.method4481(Static409.aString96);
					}
					Static73.method1197(local322);
					local322.method4498(local228.aByteArray52, local228.anInt5186);
					local322.method4502(local322.anInt5186 - local344);
				} else {
					local322.method4459(Static28.aClass283_6.anInt6971);
					local322.method4511(0);
					local344 = local322.anInt5186;
					local322.method4495(627);
					local322.method4459(Static18.aClass308_7.anInt7714);
					local322.method4459(Static261.anInt4297);
					Static568.method7409(local322);
					local322.method4481(Static523.aString125);
					local322.method4495(Static516.anInt8248);
					Static73.method1197(local322);
					local322.method4498(local228.aByteArray52, local228.anInt5186);
					local322.method4502(local322.anInt5186 - local344);
				}
				Static100.method1508(local319);
				Static509.method6612();
				Static551.aClass64_2 = new Class64(local231);
				for (local344 = 0; local344 < 4; local344++) {
					local231[local344] += 50;
				}
				Static361.aClass2_Sub7_Sub2_1.method4529(local231);
				Static135.anInt8199 = 5;
			}
			if (Static135.anInt8199 == 5) {
				if (!Static529.aClass124_2.method2253(1)) {
					return;
				}
				Static529.aClass124_2.method2250(0, Static361.aClass2_Sub7_Sub2_1.aByteArray52, 1);
				local182 = Static361.aClass2_Sub7_Sub2_1.aByteArray52[0] & 0xFF;
				if (local182 == 21) {
					Static135.anInt8199 = 8;
				} else if (local182 == 29) {
					Static135.anInt8199 = 14;
				} else if (local182 == 1) {
					Static135.anInt8199 = 6;
					Static29.method389(local182);
					return;
				} else if (local182 == 2) {
					Static135.anInt8199 = 9;
				} else if (local182 == 15) {
					Static135.anInt8199 = 15;
					Static528.anInt8479 = -2;
				} else if (local182 == 23 && Static376.anInt6288 < 2) {
					Static135.anInt8199 = 1;
					Static364.anInt6128 = 0;
					Static376.anInt6288++;
					Static529.aClass124_2.method2256();
					Static529.aClass124_2 = null;
					return;
				} else {
					Static135.anInt8199 = 0;
					Static29.method389(local182);
					Static529.aClass124_2.method2256();
					Static529.aClass124_2 = null;
					Static593.method7729();
					return;
				}
			}
			if (Static135.anInt8199 == 7) {
				Static484.method6237();
				@Pc(697) Class2_Sub34 local697 = Static593.method7730();
				@Pc(700) Class2_Sub7_Sub2 local700 = local697.aClass2_Sub7_Sub2_2;
				local700.method4534(Static551.aClass64_2);
				local700.method4528(Static28.aClass283_13.anInt6971);
				Static100.method1508(local697);
				Static509.method6612();
				Static135.anInt8199 = 5;
			} else if (Static135.anInt8199 == 8) {
				if (Static529.aClass124_2.method2253(1)) {
					Static529.aClass124_2.method2250(0, Static361.aClass2_Sub7_Sub2_1.aByteArray52, 1);
					local182 = Static361.aClass2_Sub7_Sub2_1.aByteArray52[0] & 0xFF;
					Static111.anInt1961 = (local182 + 3) * 60;
					Static135.anInt8199 = 0;
					Static29.method389(21);
					Static529.aClass124_2.method2256();
					Static529.aClass124_2 = null;
					Static593.method7729();
				}
			} else if (Static135.anInt8199 == 14) {
				if (Static529.aClass124_2.method2253(1)) {
					Static529.aClass124_2.method2250(0, Static361.aClass2_Sub7_Sub2_1.aByteArray52, 1);
					Static135.anInt8199 = 0;
					Static487.anInt7731 = Static361.aClass2_Sub7_Sub2_1.aByteArray52[0] & 0xFF;
					Static29.method389(29);
					Static529.aClass124_2.method2256();
					Static529.aClass124_2 = null;
					Static593.method7729();
				}
			} else if (Static135.anInt8199 != 9) {
				@Pc(844) Class2_Sub7_Sub2 local844;
				if (Static135.anInt8199 == 10) {
					if (Static377.anInt6297 == 3) {
						Static574.aBoolean775 = true;
					} else {
						Static574.aBoolean775 = false;
					}
					local844 = Static361.aClass2_Sub7_Sub2_1;
					if (Static377.anInt6297 == 2 || Static377.anInt6297 == 3) {
						if (!Static529.aClass124_2.method2253(Static64.anInt1147)) {
							return;
						}
						Static529.aClass124_2.method2250(0, local844.aByteArray52, Static64.anInt1147);
						local844.anInt5186 = 0;
						Static11.anInt294 = local844.method4464();
						Static165.anInt2540 = local844.method4464();
						Static183.aBoolean193 = local844.method4464() == 1;
						Static438.aBoolean578 = local844.method4464() == 1;
						Static225.aBoolean242 = local844.method4464() == 1;
						Static395.aBoolean806 = local844.method4464() == 1;
						Static18.anInt4109 = local844.method4518();
						Static327.aBoolean433 = local844.method4464() == 1;
						Static282.anInt4827 = local844.method4470();
						Static524.aBoolean704 = local844.method4464() == 1;
						if (Static377.anInt6297 == 3) {
							@Pc(1157) boolean local1157 = local844.method4464() == 1;
							if (local1157) {
								@Pc(1165) long local1165 = local844.method4514();
								@Pc(1171) String local1171 = Static100.method1511(local1165);
								@Pc(1177) int local1177 = local844.method4464();
								@Pc(1180) byte[] local1180 = new byte[local1177];
								local844.method4533(local1177, local1180);
								@Pc(1192) String local1192 = Static534.method7022(local1180);
								@Pc(1194) Class317 local1194 = null;
								try {
									@Pc(1202) Class5 local1202 = Static169.aClass99_2.method1789(false, "3");
									while (local1202.anInt151 == 0) {
										Static263.method3671(1L);
									}
									if (local1202.anInt151 == 1) {
										local1194 = (Class317) local1202.anObject1;
										@Pc(1239) int local1239 = local1171.length() + local1192.length() + 12 + 2 + 3 + 2 + 1;
										if (Static409.aString96 != null) {
											local1239 += Static409.aString96.length() + 2;
										}
										if (local1239 > 120) {
											throw new RuntimeException(">120");
										}
										@Pc(1266) Class2_Sub7 local1266 = new Class2_Sub7(local1239 + 1);
										local1266.method4459(local1239);
										local1266.method4459(3);
										local1266.method4506(local1171);
										local1266.method4506(local1192);
										local1266.method4511(Static516.anInt8248);
										local1266.method4493(Static309.aLong139);
										local1266.method4459(Static409.aString96 == null ? 0 : 1);
										if (Static409.aString96 != null) {
											local1266.method4506(Static409.aString96);
										}
										local1266.method4519();
										local1194.method6335(0, local1266.anInt5186, local1266.aByteArray52);
									}
								} catch (@Pc(1320) Exception local1320) {
								}
								try {
									if (local1194 != null) {
										local1194.method6333();
									}
								} catch (@Pc(1327) Exception local1327) {
								}
								try {
									Static597.method3394("demoaccountcreated", Static195.anApplet4);
								} catch (@Pc(1334) Throwable local1334) {
								}
							}
						}
						Static362.aClass290_2.method5805(Static524.aBoolean704);
						Static466.aClass130_2.method2321(Static524.aBoolean704);
						Static76.aClass361_1.method7587(Static524.aBoolean704);
					} else if (Static529.aClass124_2.method2253(Static64.anInt1147)) {
						Static529.aClass124_2.method2250(0, local844.aByteArray52, Static64.anInt1147);
						local844.anInt5186 = 0;
						Static11.anInt294 = local844.method4464();
						Static165.anInt2540 = local844.method4464();
						Static183.aBoolean193 = local844.method4464() == 1;
						Static438.aBoolean578 = local844.method4464() == 1;
						Static225.aBoolean242 = local844.method4464() == 1;
						Static180.anInt2676 = local844.method4478();
						Static327.aBoolean433 = Static180.anInt2676 > 0;
						Static441.anInt7087 = local844.method4518();
						Static423.anInt9311 = local844.method4518();
						Static509.anInt8136 = local844.method4518();
						Static111.anInt1963 = local844.method4509();
						Static129.aClass5_3 = Static169.aClass99_2.method1783(Static111.anInt1963);
						Static222.anInt3253 = local844.method4464();
						Static400.anInt6599 = local844.method4518();
						Static434.anInt6966 = local844.method4518();
						Static218.aBoolean230 = local844.method4464() == 1;
						Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aString75 = Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aString76 = local844.method4487();
						Static577.anInt9360 = local844.method4464();
						Static17.anInt4852 = local844.method4509();
						Static112.aClass292_1 = new Class292();
						Static112.aClass292_1.anInt7261 = local844.method4518();
						if (Static112.aClass292_1.anInt7261 == 65535) {
							Static112.aClass292_1.anInt7261 = -1;
						}
						Static112.aClass292_1.aString111 = local844.method4487();
						if (Static340.aClass232_14 != Static416.aClass232_7) {
							Static112.aClass292_1.anInt7264 = Static112.aClass292_1.anInt7261 + 50000;
							Static112.aClass292_1.anInt7263 = Static112.aClass292_1.anInt7261 + 40000;
						}
						if (Static560.aClass232_19 != Static416.aClass232_7 && (Static489.aClass292_5.method5909(Static236.aClass292_2) || Static489.aClass292_5.method5909(Static361.aClass292_4))) {
							Static348.method5031();
						}
					} else {
						return;
					}
					if (Static183.aBoolean193 && !Static225.aBoolean242 || Static327.aBoolean433) {
						try {
							Static597.method3394("zap", Static195.anApplet4);
						} catch (@Pc(1369) Throwable local1369) {
							if (Static31.aBoolean30) {
								try {
									Static195.anApplet4.getAppletContext().showDocument(new URL(Static195.anApplet4.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1383) Exception local1383) {
								}
							}
						}
					} else {
						try {
							Static597.method3394("unzap", Static195.anApplet4);
						} catch (@Pc(1360) Throwable local1360) {
						}
					}
					if (Static340.aClass232_14 == Static416.aClass232_7) {
						try {
							Static597.method3394("loggedin", Static195.anApplet4);
						} catch (@Pc(1396) Throwable local1396) {
						}
					}
					if (Static377.anInt6297 != 2 && Static377.anInt6297 != 3) {
						Static135.anInt8199 = 0;
						Static29.method389(2);
						Static426.method5672();
						Static115.method1686(7);
						Static149.aClass349_37 = null;
						return;
					}
					Static135.anInt8199 = 12;
				}
				if (Static135.anInt8199 == 12) {
					if (!Static529.aClass124_2.method2253(3)) {
						return;
					}
					Static529.aClass124_2.method2250(0, Static361.aClass2_Sub7_Sub2_1.aByteArray52, 3);
					Static135.anInt8199 = 13;
				}
				if (Static135.anInt8199 == 13) {
					local844 = Static361.aClass2_Sub7_Sub2_1;
					local844.anInt5186 = 0;
					if (local844.method4526()) {
						if (!Static529.aClass124_2.method2253(1)) {
							return;
						}
						Static529.aClass124_2.method2250(3, local844.aByteArray52, 1);
					}
					Static149.aClass349_37 = Static204.method2538()[local844.method4527()];
					Static528.anInt8479 = local844.method4518();
					Static135.anInt8199 = 11;
				}
				if (Static135.anInt8199 == 11) {
					if (Static529.aClass124_2.method2253(Static528.anInt8479)) {
						Static529.aClass124_2.method2250(0, Static361.aClass2_Sub7_Sub2_1.aByteArray52, Static528.anInt8479);
						Static361.aClass2_Sub7_Sub2_1.anInt5186 = 0;
						local182 = Static528.anInt8479;
						Static135.anInt8199 = 0;
						Static29.method389(2);
						Static269.method3733();
						Static551.method7227(Static361.aClass2_Sub7_Sub2_1);
						Static434.anInt6974 = -1;
						if (Static30.aClass349_12 == Static149.aClass349_37) {
							Static245.method3484();
						} else {
							Static523.method6731();
						}
						if (Static361.aClass2_Sub7_Sub2_1.anInt5186 != local182) {
							throw new RuntimeException("lswp pos:" + Static361.aClass2_Sub7_Sub2_1.anInt5186 + " psize:" + local182);
						}
						Static149.aClass349_37 = null;
					}
				} else if (Static135.anInt8199 == 15) {
					if (Static528.anInt8479 == -2) {
						if (!Static529.aClass124_2.method2253(2)) {
							return;
						}
						Static529.aClass124_2.method2250(0, Static361.aClass2_Sub7_Sub2_1.aByteArray52, 2);
						Static361.aClass2_Sub7_Sub2_1.anInt5186 = 0;
						Static528.anInt8479 = Static361.aClass2_Sub7_Sub2_1.method4518();
					}
					if (Static529.aClass124_2.method2253(Static528.anInt8479)) {
						Static529.aClass124_2.method2250(0, Static361.aClass2_Sub7_Sub2_1.aByteArray52, Static528.anInt8479);
						Static361.aClass2_Sub7_Sub2_1.anInt5186 = 0;
						Static135.anInt8199 = 0;
						local182 = Static528.anInt8479;
						Static29.method389(15);
						Static238.method3426();
						Static551.method7227(Static361.aClass2_Sub7_Sub2_1);
						if (Static361.aClass2_Sub7_Sub2_1.anInt5186 != local182) {
							throw new RuntimeException("lswpr pos:" + Static361.aClass2_Sub7_Sub2_1.anInt5186 + " psize:" + local182);
						}
						Static149.aClass349_37 = null;
					}
				}
			} else if (Static529.aClass124_2.method2253(1)) {
				Static529.aClass124_2.method2250(0, Static361.aClass2_Sub7_Sub2_1.aByteArray52, 1);
				Static64.anInt1147 = Static361.aClass2_Sub7_Sub2_1.aByteArray52[0] & 0xFF;
				Static135.anInt8199 = 10;
			}
		} catch (@Pc(1628) IOException local1628) {
			if (Static529.aClass124_2 != null) {
				Static529.aClass124_2.method2256();
				Static529.aClass124_2 = null;
			}
			if (Static376.anInt6288 >= 2) {
				Static135.anInt8199 = 0;
				Static29.method389(-4);
				Static593.method7729();
			} else {
				if (Static377.anInt6297 == 2 || Static377.anInt6297 == 3) {
					Static489.aClass292_5.method5908();
				} else {
					Static323.aClass292_3.method5908();
				}
				Static135.anInt8199 = 1;
				Static364.anInt6128 = 0;
				Static376.anInt6288++;
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "([BB)[B")
	public static byte[] method3584(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub7 local8 = new Class2_Sub7(arg0);
		@Pc(18) int local18 = local8.method4464();
		@Pc(22) int local22 = local8.method4509();
		if (local22 < 0 || Static308.anInt5091 != 0 && Static308.anInt5091 < local22) {
			throw new RuntimeException();
		} else if (local18 == 0) {
			@Pc(47) byte[] local47 = new byte[local22];
			local8.method4504(local22, local47);
			return local47;
		} else {
			@Pc(59) int local59 = local8.method4509();
			if (local59 < 0 || Static308.anInt5091 != 0 && Static308.anInt5091 < local59) {
				throw new RuntimeException();
			}
			@Pc(76) byte[] local76 = new byte[local59];
			if (local18 == 1) {
				Static137.method1881(local76, local59, arg0, local22);
			} else {
				@Pc(81) Class359 local81 = Static556.aClass359_1;
				synchronized (Static556.aClass359_1) {
					Static556.aClass359_1.method7529(local8, local76);
				}
			}
			return local76;
		}
	}
}
