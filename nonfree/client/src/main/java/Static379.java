import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!tf", name = "P", descriptor = "I")
	public static int anInt6642;

	@OriginalMember(owner = "client!tf", name = "N", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_95 = new Class242("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!tf", name = "S", descriptor = "I")
	public static int anInt6645 = 0;

	@OriginalMember(owner = "client!tf", name = "T", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_226 = new Class186(24, -1);

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)V")
	public static void method5160() {
		if (Static341.anInt6053 == 0 || Static341.anInt6053 == 5) {
			return;
		}
		try {
			if (++Static365.anInt6488 > 2000) {
				if (Static223.aClass5_3 != null) {
					Static223.aClass5_3.method119();
					Static223.aClass5_3 = null;
				}
				if (Static63.anInt1619 >= 1) {
					Static341.anInt6053 = 0;
					Static452.anInt7565 = -5;
					return;
				}
				if (Static81.anInt1880 == Static274.anInt4849) {
					Static274.anInt4849 = Static271.anInt1484;
				} else {
					Static274.anInt4849 = Static81.anInt1880;
				}
				Static63.anInt1619++;
				Static365.anInt6488 = 0;
				Static341.anInt6053 = 1;
			}
			if (Static341.anInt6053 == 1) {
				Static105.aClass108_5 = Static89.aClass114_3.method2364(Static274.anInt4849, Static436.aString70);
				Static341.anInt6053 = 2;
			}
			@Pc(116) int local116;
			if (Static341.anInt6053 == 2) {
				if (Static105.aClass108_5.anInt2803 == 2) {
					throw new IOException();
				}
				if (Static105.aClass108_5.anInt2803 != 1) {
					return;
				}
				Static223.aClass5_3 = new Class5((Socket) Static105.aClass108_5.anObject4, Static89.aClass114_3);
				Static105.aClass108_5 = null;
				@Pc(109) long local109 = Static268.aLong145 = Static13.method317(Static248.aString48);
				local116 = (int) (local109 >> 16 & 0x1FL);
				Static116.aClass4_Sub30_Sub1_1.anInt6244 = 0;
				Static116.aClass4_Sub30_Sub1_1.method4871(Static58.aClass223_11.anInt6527);
				Static116.aClass4_Sub30_Sub1_1.method4871(local116);
				Static223.aClass5_3.method124(Static116.aClass4_Sub30_Sub1_1.aByteArray79, 2);
				Static194.method2825();
				@Pc(141) int local141 = Static223.aClass5_3.method125();
				Static194.method2825();
				if (local141 != 0) {
					Static452.anInt7565 = local141;
					Static341.anInt6053 = 0;
					Static223.aClass5_3.method119();
					Static223.aClass5_3 = null;
					return;
				}
				Static341.anInt6053 = 3;
			}
			if (Static341.anInt6053 == 3) {
				if (Static223.aClass5_3.method120() < 8) {
					return;
				}
				Static223.aClass5_3.method122(Static349.aClass4_Sub30_Sub1_2.aByteArray79, 8, 0);
				Static349.aClass4_Sub30_Sub1_2.anInt6244 = 0;
				Static7.aLong8 = Static349.aClass4_Sub30_Sub1_2.method4853();
				@Pc(188) Class4_Sub30 local188 = new Class4_Sub30(70);
				@Pc(191) int[] local191 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static7.aLong8 >> 32), (int) Static7.aLong8 };
				local188.method4871(10);
				local188.method4861(local191[0]);
				local188.method4861(local191[1]);
				local188.method4861(local191[2]);
				local188.method4861(local191[3]);
				local188.method4860(Static13.method317(Static248.aString48));
				local188.method4849(Static108.aString21);
				local188.method4850(Static183.aBigInteger1, Static362.aBigInteger2);
				Static116.aClass4_Sub30_Sub1_1.anInt6244 = 0;
				if (Static73.anInt1749 == 40) {
					Static116.aClass4_Sub30_Sub1_1.method4871(Static58.aClass223_15.anInt6527);
				} else {
					Static116.aClass4_Sub30_Sub1_1.method4871(Static58.aClass223_13.anInt6527);
				}
				Static116.aClass4_Sub30_Sub1_1.method4846(0);
				local116 = Static116.aClass4_Sub30_Sub1_1.anInt6244;
				Static116.aClass4_Sub30_Sub1_1.method4861(587);
				Static116.aClass4_Sub30_Sub1_1.method4871(Static404.anInt6896);
				Static116.aClass4_Sub30_Sub1_1.method4871(Static144.method2104());
				Static116.aClass4_Sub30_Sub1_1.method4846(Static87.anInt1948);
				Static116.aClass4_Sub30_Sub1_1.method4846(Static349.anInt6303);
				Static116.aClass4_Sub30_Sub1_1.method4871(Static126.aClass67_Sub1_1.anInt5848);
				Static327.method4456(Static116.aClass4_Sub30_Sub1_1);
				Static116.aClass4_Sub30_Sub1_1.method4849(Static156.aString26);
				Static116.aClass4_Sub30_Sub1_1.method4861(Static121.anInt2512);
				@Pc(328) Class4_Sub30 local328 = Static126.aClass67_Sub1_1.method4529();
				Static116.aClass4_Sub30_Sub1_1.method4871(local328.anInt6244);
				Static116.aClass4_Sub30_Sub1_1.method4843(local328.aByteArray79, local328.anInt6244);
				Static120.aBoolean189 = true;
				Static116.aClass4_Sub30_Sub1_1.method4846(Static368.anInt6522);
				Static116.aClass4_Sub30_Sub1_1.method4861(Static375.aClass166_207.method3668());
				Static116.aClass4_Sub30_Sub1_1.method4861(Static359.aClass166_251.method3668());
				Static116.aClass4_Sub30_Sub1_1.method4861(Static430.aClass166_284.method3668());
				Static116.aClass4_Sub30_Sub1_1.method4861(Static349.aClass166_240.method3668());
				Static116.aClass4_Sub30_Sub1_1.method4861(Static354.aClass166_247.method3668());
				Static116.aClass4_Sub30_Sub1_1.method4861(Static193.aClass166_291.method3668());
				Static116.aClass4_Sub30_Sub1_1.method4861(Static273.aClass166_193.method3668());
				Static116.aClass4_Sub30_Sub1_1.method4861(Static207.aClass166_151.method3668());
				Static116.aClass4_Sub30_Sub1_1.method4861(Static149.aClass166_105.method3668());
				Static116.aClass4_Sub30_Sub1_1.method4861(Static28.aClass166_28.method3668());
				Static116.aClass4_Sub30_Sub1_1.method4861(Static320.aClass166_226.method3668());
				Static116.aClass4_Sub30_Sub1_1.method4861(Static300.aClass166_212.method3668());
				Static116.aClass4_Sub30_Sub1_1.method4861(Static4.aClass166_6.method3668());
				Static116.aClass4_Sub30_Sub1_1.method4861(Static439.aClass166_293.method3668());
				Static116.aClass4_Sub30_Sub1_1.method4861(Static240.aClass166_165.method3668());
				Static116.aClass4_Sub30_Sub1_1.method4861(Static77.aClass166_60.method3668());
				Static116.aClass4_Sub30_Sub1_1.method4861(Static376.aClass166_259.method3668());
				Static116.aClass4_Sub30_Sub1_1.method4861(Static224.aClass166_162.method3668());
				Static116.aClass4_Sub30_Sub1_1.method4861(Static195.aClass166_106.method3668());
				Static116.aClass4_Sub30_Sub1_1.method4861(Static102.aClass166_75.method3668());
				Static116.aClass4_Sub30_Sub1_1.method4861(Static416.aClass166_278.method3668());
				Static116.aClass4_Sub30_Sub1_1.method4861(Static78.aClass166_61.method3668());
				Static116.aClass4_Sub30_Sub1_1.method4861(Static81.aClass166_66.method3668());
				Static116.aClass4_Sub30_Sub1_1.method4861(Static260.aClass166_302.method3668());
				Static116.aClass4_Sub30_Sub1_1.method4861(Static289.aClass166_205.method3668());
				Static116.aClass4_Sub30_Sub1_1.method4861(Static160.aClass166_118.method3668());
				Static116.aClass4_Sub30_Sub1_1.method4861(Static278.aClass166_290.method3668());
				Static116.aClass4_Sub30_Sub1_1.method4861(Static192.aClass166_304.method3668());
				Static116.aClass4_Sub30_Sub1_1.method4861(Static12.aClass166_20.method3668());
				Static116.aClass4_Sub30_Sub1_1.method4861(Static408.aClass166_271.method3668());
				Static116.aClass4_Sub30_Sub1_1.method4843(local188.aByteArray79, local188.anInt6244);
				Static116.aClass4_Sub30_Sub1_1.method4884(Static116.aClass4_Sub30_Sub1_1.anInt6244 - local116);
				Static223.aClass5_3.method124(Static116.aClass4_Sub30_Sub1_1.aByteArray79, Static116.aClass4_Sub30_Sub1_1.anInt6244);
				Static116.aClass4_Sub30_Sub1_1.method3918(local191);
				for (@Pc(557) int local557 = 0; local557 < 4; local557++) {
					local191[local557] += 50;
				}
				Static349.aClass4_Sub30_Sub1_2.method3918(local191);
				Static341.anInt6053 = 4;
			}
			@Pc(589) int local589;
			if (Static341.anInt6053 == 4) {
				if (Static223.aClass5_3.method120() < 1) {
					return;
				}
				local589 = Static223.aClass5_3.method125();
				if (local589 == 21) {
					Static341.anInt6053 = 7;
				} else if (local589 == 29) {
					Static341.anInt6053 = 11;
				} else if (local589 == 1) {
					Static452.anInt7565 = local589;
					Static341.anInt6053 = 5;
					return;
				} else if (local589 == 2) {
					Static341.anInt6053 = 8;
				} else if (local589 == 15) {
					Static341.anInt6053 = 12;
					Static106.anInt2242 = -2;
				} else if (local589 == 23 && Static63.anInt1619 < 1) {
					Static365.anInt6488 = 0;
					Static341.anInt6053 = 1;
					Static63.anInt1619++;
					Static223.aClass5_3.method119();
					Static223.aClass5_3 = null;
					return;
				} else {
					Static341.anInt6053 = 0;
					Static452.anInt7565 = local589;
					Static223.aClass5_3.method119();
					Static223.aClass5_3 = null;
					return;
				}
			}
			if (Static341.anInt6053 == 6) {
				Static116.aClass4_Sub30_Sub1_1.anInt6244 = 0;
				Static116.aClass4_Sub30_Sub1_1.method3922(Static58.aClass223_14.anInt6527);
				Static223.aClass5_3.method124(Static116.aClass4_Sub30_Sub1_1.aByteArray79, Static116.aClass4_Sub30_Sub1_1.anInt6244);
				Static341.anInt6053 = 4;
			} else if (Static341.anInt6053 == 7) {
				if (Static223.aClass5_3.method120() >= 1) {
					Static216.anInt4045 = (Static223.aClass5_3.method125() + 3) * 60;
					Static452.anInt7565 = 21;
					Static341.anInt6053 = 0;
					Static223.aClass5_3.method119();
					Static223.aClass5_3 = null;
				}
			} else if (Static341.anInt6053 != 11) {
				if (Static341.anInt6053 == 8) {
					if (Static223.aClass5_3.method120() < 13) {
						return;
					}
					Static223.aClass5_3.method122(Static349.aClass4_Sub30_Sub1_2.aByteArray79, 13, 0);
					Static349.aClass4_Sub30_Sub1_2.anInt6244 = 0;
					Static189.anInt3643 = Static349.aClass4_Sub30_Sub1_2.method4864();
					Static31.anInt731 = Static349.aClass4_Sub30_Sub1_2.method4864();
					Static386.aBoolean448 = Static349.aClass4_Sub30_Sub1_2.method4864() == 1;
					Static146.aBoolean200 = Static349.aClass4_Sub30_Sub1_2.method4864() == 1;
					Static200.aBoolean292 = Static349.aClass4_Sub30_Sub1_2.method4864() == 1;
					Static444.aBoolean494 = Static349.aClass4_Sub30_Sub1_2.method4864() == 1;
					Static373.anInt6574 = Static349.aClass4_Sub30_Sub1_2.method4877();
					Static404.aBoolean463 = Static349.aClass4_Sub30_Sub1_2.method4864() == 1;
					Static165.aBoolean225 = Static349.aClass4_Sub30_Sub1_2.method4864() == 1;
					Static2.aClass74_13.method1687(Static165.aBoolean225);
					Static390.aClass204_2.method4624(Static165.aBoolean225);
					Static388.aClass211_1.method4925(Static165.aBoolean225);
					if (Static386.aBoolean448 && !Static200.aBoolean292 || Static404.aBoolean463) {
						try {
							Static459.method3567(Static89.aClass114_3.anApplet1, "zap");
						} catch (@Pc(871) Throwable local871) {
							if (Static266.aBoolean342) {
								try {
									Static89.aClass114_3.anApplet1.getAppletContext().showDocument(new URL(Static89.aClass114_3.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(887) Exception local887) {
								}
							}
						}
					} else {
						try {
							Static459.method3567(Static89.aClass114_3.anApplet1, "unzap");
						} catch (@Pc(897) Throwable local897) {
						}
					}
					if (Static427.aClass239_7 == Static130.aClass239_4) {
						try {
							Static459.method3567(Static89.aClass114_3.anApplet1, "loggedin");
						} catch (@Pc(909) Throwable local909) {
						}
					}
					Static341.anInt6053 = 10;
				}
				if (Static341.anInt6053 == 10) {
					if (Static349.aClass4_Sub30_Sub1_2.method3916()) {
						if (Static223.aClass5_3.method120() < 1) {
							return;
						}
						Static223.aClass5_3.method122(Static349.aClass4_Sub30_Sub1_2.aByteArray79, 1, Static349.aClass4_Sub30_Sub1_2.anInt6244 + 2);
					}
					Static375.aClass186_176 = Static6.method209()[Static349.aClass4_Sub30_Sub1_2.method3919()];
					Static106.anInt2242 = Static349.aClass4_Sub30_Sub1_2.method4877();
					Static341.anInt6053 = 9;
				}
				if (Static341.anInt6053 == 9) {
					if (Static223.aClass5_3.method120() >= Static106.anInt2242) {
						Static223.aClass5_3.method122(Static349.aClass4_Sub30_Sub1_2.aByteArray79, Static106.anInt2242, 0);
						Static349.aClass4_Sub30_Sub1_2.anInt6244 = 0;
						Static452.anInt7565 = 2;
						local589 = Static106.anInt2242;
						Static341.anInt6053 = 0;
						Static392.method3405();
						Static233.method3213(Static349.aClass4_Sub30_Sub1_2);
						Static50.anInt1367 = -1;
						Static261.method3572();
						if (local589 != Static349.aClass4_Sub30_Sub1_2.anInt6244) {
							throw new RuntimeException("lswp pos:" + Static349.aClass4_Sub30_Sub1_2.anInt6244 + " psize:" + local589);
						}
						Static375.aClass186_176 = null;
					}
				} else if (Static341.anInt6053 == 12) {
					if (Static106.anInt2242 == -2) {
						if (Static223.aClass5_3.method120() < 2) {
							return;
						}
						Static223.aClass5_3.method122(Static349.aClass4_Sub30_Sub1_2.aByteArray79, 2, 0);
						Static349.aClass4_Sub30_Sub1_2.anInt6244 = 0;
						Static106.anInt2242 = Static349.aClass4_Sub30_Sub1_2.method4877();
					}
					if (Static223.aClass5_3.method120() >= Static106.anInt2242) {
						Static223.aClass5_3.method122(Static349.aClass4_Sub30_Sub1_2.aByteArray79, Static106.anInt2242, 0);
						Static349.aClass4_Sub30_Sub1_2.anInt6244 = 0;
						Static341.anInt6053 = 0;
						local589 = Static106.anInt2242;
						Static452.anInt7565 = 15;
						Static295.method4098();
						Static233.method3213(Static349.aClass4_Sub30_Sub1_2);
						if (Static349.aClass4_Sub30_Sub1_2.anInt6244 != local589) {
							throw new RuntimeException("lswpr pos:" + Static349.aClass4_Sub30_Sub1_2.anInt6244 + " psize:" + local589);
						}
						Static375.aClass186_176 = null;
					}
				}
			} else if (Static223.aClass5_3.method120() >= 1) {
				Static52.anInt1387 = Static223.aClass5_3.method125();
				Static341.anInt6053 = 0;
				Static452.anInt7565 = 29;
				Static223.aClass5_3.method119();
				Static223.aClass5_3 = null;
			}
		} catch (@Pc(1102) IOException local1102) {
			if (Static223.aClass5_3 != null) {
				Static223.aClass5_3.method119();
				Static223.aClass5_3 = null;
			}
			if (Static63.anInt1619 < 1) {
				Static63.anInt1619++;
				Static365.anInt6488 = 0;
				Static341.anInt6053 = 1;
				if (Static81.anInt1880 == Static274.anInt4849) {
					Static274.anInt4849 = Static271.anInt1484;
				} else {
					Static274.anInt4849 = Static81.anInt1880;
				}
			} else {
				Static341.anInt6053 = 0;
				Static452.anInt7565 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!of;I)I")
	public static int method5163(@OriginalArg(0) Class4_Sub30_Sub1 arg0) {
		@Pc(10) int local10 = arg0.method3924(2);
		@Pc(19) int local19;
		if (local10 == 0) {
			local19 = 0;
		} else if (local10 == 1) {
			local19 = arg0.method3924(5);
		} else if (local10 == 2) {
			local19 = arg0.method3924(8);
		} else {
			local19 = arg0.method3924(11);
		}
		return local19;
	}
}
