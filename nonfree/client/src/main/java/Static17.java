import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!as", name = "a", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_28 = new Class137(75, 2);

	@OriginalMember(owner = "client!as", name = "z", descriptor = "Z")
	public static boolean aBoolean28 = false;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
	public static void method269() {
		Static86.anInt1540 = 0;
		Static418.anInt6790 = -3;
		Static354.anInt5868 = 1;
		Static13.aBoolean25 = false;
		Static449.anInt7401 = 0;
		Static4.anInt66 = -1;
		Static26.anInt547 = 0;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ILclient!mv;)I")
	public static int method271(@OriginalArg(1) Class1_Sub11_Sub1 arg0) {
		@Pc(10) int local10 = arg0.method3347(2);
		@Pc(17) int local17;
		if (local10 == 0) {
			local17 = 0;
		} else if (local10 == 1) {
			local17 = arg0.method3347(5);
		} else if (local10 == 2) {
			local17 = arg0.method3347(8);
		} else {
			local17 = arg0.method3347(11);
		}
		return local17;
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(I)V")
	public static void method272() {
		if (Static354.anInt5868 == 0 || Static354.anInt5868 == 5) {
			return;
		}
		try {
			if (++Static449.anInt7401 > 2000) {
				if (Static48.aClass3_2 != null) {
					Static48.aClass3_2.method63();
					Static48.aClass3_2 = null;
				}
				if (Static86.anInt1540 >= 1) {
					Static418.anInt6790 = -5;
					Static354.anInt5868 = 0;
					return;
				}
				Static449.anInt7401 = 0;
				if (Static182.anInt2943 == Static131.anInt2260) {
					Static131.anInt2260 = Static91.anInt1613;
				} else {
					Static131.anInt2260 = Static182.anInt2943;
				}
				Static354.anInt5868 = 1;
				Static86.anInt1540++;
			}
			if (Static354.anInt5868 == 1) {
				Static289.aClass215_8 = Static41.aClass124_2.method2532(Static270.aString42, Static131.anInt2260);
				Static354.anInt5868 = 2;
			}
			@Pc(116) int local116;
			if (Static354.anInt5868 == 2) {
				if (Static289.aClass215_8.anInt5791 == 2) {
					throw new IOException();
				}
				if (Static289.aClass215_8.anInt5791 != 1) {
					return;
				}
				Static48.aClass3_2 = new Class3((Socket) Static289.aClass215_8.anObject10, Static41.aClass124_2);
				Static289.aClass215_8 = null;
				@Pc(109) long local109 = Static204.aLong101 = Static86.method1266(Static108.aString15);
				local116 = (int) (local109 >> 16 & 0x1FL);
				Static75.aClass1_Sub11_Sub1_1.anInt5766 = 0;
				Static75.aClass1_Sub11_Sub1_1.method4445(Static335.aClass62_1.anInt1569);
				Static75.aClass1_Sub11_Sub1_1.method4445(local116);
				Static48.aClass3_2.method62(2, Static75.aClass1_Sub11_Sub1_1.aByteArray64);
				Static218.method4377();
				@Pc(141) int local141 = Static48.aClass3_2.method57();
				Static218.method4377();
				if (local141 != 0) {
					Static418.anInt6790 = local141;
					Static354.anInt5868 = 0;
					Static48.aClass3_2.method63();
					Static48.aClass3_2 = null;
					return;
				}
				Static354.anInt5868 = 3;
			}
			if (Static354.anInt5868 == 3) {
				if (Static48.aClass3_2.method61() < 8) {
					return;
				}
				Static48.aClass3_2.method59(Static154.aClass1_Sub11_Sub1_3.aByteArray64, 0, 8);
				Static154.aClass1_Sub11_Sub1_3.anInt5766 = 0;
				Static361.aLong187 = Static154.aClass1_Sub11_Sub1_3.method4460();
				@Pc(196) Class1_Sub11 local196 = new Class1_Sub11(70);
				@Pc(199) int[] local199 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static361.aLong187 >> 32), (int) Static361.aLong187 };
				local196.method4445(10);
				local196.method4450(local199[0]);
				local196.method4450(local199[1]);
				local196.method4450(local199[2]);
				local196.method4450(local199[3]);
				local196.method4446(Static86.method1266(Static108.aString15));
				local196.method4453(Static90.aString12);
				local196.method4455(Static230.aBigInteger3, Static272.aBigInteger2);
				Static75.aClass1_Sub11_Sub1_1.anInt5766 = 0;
				if (Static98.anInt1721 == 40) {
					Static75.aClass1_Sub11_Sub1_1.method4445(Static335.aClass62_5.anInt1569);
				} else {
					Static75.aClass1_Sub11_Sub1_1.method4445(Static335.aClass62_3.anInt1569);
				}
				Static75.aClass1_Sub11_Sub1_1.method4448(0);
				local116 = Static75.aClass1_Sub11_Sub1_1.anInt5766;
				Static75.aClass1_Sub11_Sub1_1.method4450(589);
				Static75.aClass1_Sub11_Sub1_1.method4445(Static405.anInt6545);
				Static75.aClass1_Sub11_Sub1_1.method4445(Static330.method4209());
				Static75.aClass1_Sub11_Sub1_1.method4448(Static126.anInt2202);
				Static75.aClass1_Sub11_Sub1_1.method4448(Static92.anInt1618);
				Static75.aClass1_Sub11_Sub1_1.method4445(Static336.aClass106_Sub1_1.anInt5675);
				Static377.method4839(Static75.aClass1_Sub11_Sub1_1);
				Static75.aClass1_Sub11_Sub1_1.method4453(Static116.aString52);
				Static75.aClass1_Sub11_Sub1_1.method4450(Static28.anInt564);
				@Pc(340) Class1_Sub11 local340 = Static336.aClass106_Sub1_1.method4431();
				Static75.aClass1_Sub11_Sub1_1.method4445(local340.anInt5766);
				Static75.aClass1_Sub11_Sub1_1.method4480(local340.aByteArray64, local340.anInt5766);
				Static253.aBoolean325 = true;
				Static75.aClass1_Sub11_Sub1_1.method4448(Static41.anInt752);
				Static75.aClass1_Sub11_Sub1_1.method4450(Static356.aClass113_110.method2266());
				Static75.aClass1_Sub11_Sub1_1.method4450(Static230.aClass113_116.method2266());
				Static75.aClass1_Sub11_Sub1_1.method4450(Static383.aClass113_117.method2266());
				Static75.aClass1_Sub11_Sub1_1.method4450(Static291.aClass113_92.method2266());
				Static75.aClass1_Sub11_Sub1_1.method4450(Static12.aClass113_7.method2266());
				Static75.aClass1_Sub11_Sub1_1.method4450(Static310.aClass113_97.method2266());
				Static75.aClass1_Sub11_Sub1_1.method4450(Static116.aClass113_101.method2266());
				Static75.aClass1_Sub11_Sub1_1.method4450(Static258.aClass113_80.method2266());
				Static75.aClass1_Sub11_Sub1_1.method4450(Static169.aClass113_55.method2266());
				Static75.aClass1_Sub11_Sub1_1.method4450(Static391.aClass113_119.method2266());
				Static75.aClass1_Sub11_Sub1_1.method4450(Static313.aClass113_98.method2266());
				Static75.aClass1_Sub11_Sub1_1.method4450(Static408.aClass113_127.method2266());
				Static75.aClass1_Sub11_Sub1_1.method4450(Static143.aClass113_48.method2266());
				Static75.aClass1_Sub11_Sub1_1.method4450(Static166.aClass113_59.method2266());
				Static75.aClass1_Sub11_Sub1_1.method4450(Static224.aClass113_73.method2266());
				Static75.aClass1_Sub11_Sub1_1.method4450(Static169.aClass113_54.method2266());
				Static75.aClass1_Sub11_Sub1_1.method4450(Static315.aClass113_99.method2266());
				Static75.aClass1_Sub11_Sub1_1.method4450(Static383.aClass113_118.method2266());
				Static75.aClass1_Sub11_Sub1_1.method4450(Static28.aClass113_11.method2266());
				Static75.aClass1_Sub11_Sub1_1.method4450(Static9.aClass113_5.method2266());
				Static75.aClass1_Sub11_Sub1_1.method4450(Static66.aClass113_23.method2266());
				Static75.aClass1_Sub11_Sub1_1.method4450(Static52.aClass113_20.method2266());
				Static75.aClass1_Sub11_Sub1_1.method4450(Static265.aClass113_82.method2266());
				Static75.aClass1_Sub11_Sub1_1.method4450(Static274.aClass113_84.method2266());
				Static75.aClass1_Sub11_Sub1_1.method4450(Static61.aClass113_22.method2266());
				Static75.aClass1_Sub11_Sub1_1.method4450(Static322.aClass113_135.method2266());
				Static75.aClass1_Sub11_Sub1_1.method4450(Static334.aClass113_103.method2266());
				Static75.aClass1_Sub11_Sub1_1.method4450(Class20_Sub3_Sub2.lb.method2266());
				Static75.aClass1_Sub11_Sub1_1.method4450(Static221.aClass113_71.method2266());
				Static75.aClass1_Sub11_Sub1_1.method4450(Static74.aClass113_26.method2266());
				Static75.aClass1_Sub11_Sub1_1.method4480(local196.aByteArray64, local196.anInt5766);
				Static75.aClass1_Sub11_Sub1_1.method4466(Static75.aClass1_Sub11_Sub1_1.anInt5766 - local116);
				Static48.aClass3_2.method62(Static75.aClass1_Sub11_Sub1_1.anInt5766, Static75.aClass1_Sub11_Sub1_1.aByteArray64);
				Static75.aClass1_Sub11_Sub1_1.method3349(local199);
				for (@Pc(573) int local573 = 0; local573 < 4; local573++) {
					local199[local573] += 50;
				}
				Static154.aClass1_Sub11_Sub1_3.method3349(local199);
				Static354.anInt5868 = 4;
			}
			@Pc(611) int local611;
			if (Static354.anInt5868 == 4) {
				if (Static48.aClass3_2.method61() < 1) {
					return;
				}
				local611 = Static48.aClass3_2.method57();
				if (local611 == 21) {
					Static354.anInt5868 = 7;
				} else if (local611 == 29) {
					Static354.anInt5868 = 11;
				} else if (local611 == 1) {
					Static418.anInt6790 = local611;
					Static354.anInt5868 = 5;
					return;
				} else if (local611 == 2) {
					Static354.anInt5868 = 8;
				} else if (local611 == 15) {
					Static329.anInt5393 = -2;
					Static354.anInt5868 = 12;
				} else if (local611 == 23 && Static86.anInt1540 < 1) {
					Static354.anInt5868 = 1;
					Static86.anInt1540++;
					Static449.anInt7401 = 0;
					Static48.aClass3_2.method63();
					Static48.aClass3_2 = null;
					return;
				} else {
					Static354.anInt5868 = 0;
					Static418.anInt6790 = local611;
					Static48.aClass3_2.method63();
					Static48.aClass3_2 = null;
					return;
				}
			}
			if (Static354.anInt5868 == 6) {
				Static75.aClass1_Sub11_Sub1_1.anInt5766 = 0;
				Static75.aClass1_Sub11_Sub1_1.method3343(Static335.aClass62_4.anInt1569);
				Static48.aClass3_2.method62(Static75.aClass1_Sub11_Sub1_1.anInt5766, Static75.aClass1_Sub11_Sub1_1.aByteArray64);
				Static354.anInt5868 = 4;
			} else if (Static354.anInt5868 == 7) {
				if (Static48.aClass3_2.method61() >= 1) {
					Static26.anInt547 = Static48.aClass3_2.method57() * 60 + 180;
					Static418.anInt6790 = 21;
					Static354.anInt5868 = 0;
					Static48.aClass3_2.method63();
					Static48.aClass3_2 = null;
				}
			} else if (Static354.anInt5868 != 11) {
				if (Static354.anInt5868 == 8) {
					if (Static48.aClass3_2.method61() < 13) {
						return;
					}
					Static48.aClass3_2.method59(Static154.aClass1_Sub11_Sub1_3.aByteArray64, 0, 13);
					Static154.aClass1_Sub11_Sub1_3.anInt5766 = 0;
					Static411.anInt6701 = Static154.aClass1_Sub11_Sub1_3.method4463();
					Static1.anInt48 = Static154.aClass1_Sub11_Sub1_3.method4463();
					Static146.aBoolean509 = Static154.aClass1_Sub11_Sub1_3.method4463() == 1;
					Static136.aBoolean171 = Static154.aClass1_Sub11_Sub1_3.method4463() == 1;
					Static251.aBoolean323 = Static154.aClass1_Sub11_Sub1_3.method4463() == 1;
					Static158.aBoolean210 = Static154.aClass1_Sub11_Sub1_3.method4463() == 1;
					Static348.anInt5668 = Static154.aClass1_Sub11_Sub1_3.method4485();
					Static164.aBoolean215 = Static154.aClass1_Sub11_Sub1_3.method4463() == 1;
					Static305.aBoolean410 = Static154.aClass1_Sub11_Sub1_3.method4463() == 1;
					Static259.aClass95_3.method1819(Static305.aBoolean410);
					Static227.aClass65_2.method1336(Static305.aBoolean410);
					Static304.aClass27_1.method586(Static305.aBoolean410);
					if (Static146.aBoolean509 && !Static251.aBoolean323 || Static164.aBoolean215) {
						try {
							Static460.method3422("zap", Static41.aClass124_2.anApplet1);
						} catch (@Pc(902) Throwable local902) {
							if (Static76.aBoolean113) {
								try {
									Static41.aClass124_2.anApplet1.getAppletContext().showDocument(new URL(Static41.aClass124_2.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(918) Exception local918) {
								}
							}
						}
					} else {
						try {
							Static460.method3422("unzap", Static41.aClass124_2.anApplet1);
						} catch (@Pc(892) Throwable local892) {
						}
					}
					if (Static209.aClass166_6 == Static136.aClass166_3) {
						try {
							Static460.method3422("loggedin", Static41.aClass124_2.anApplet1);
						} catch (@Pc(930) Throwable local930) {
						}
					}
					Static354.anInt5868 = 10;
				}
				if (Static354.anInt5868 == 10) {
					if (Static154.aClass1_Sub11_Sub1_3.method3351()) {
						if (Static48.aClass3_2.method61() < 1) {
							return;
						}
						Static48.aClass3_2.method59(Static154.aClass1_Sub11_Sub1_3.aByteArray64, Static154.aClass1_Sub11_Sub1_3.anInt5766 + 2, 1);
					}
					Static175.aClass214_107 = Static52.method811()[Static154.aClass1_Sub11_Sub1_3.method3350()];
					Static329.anInt5393 = Static154.aClass1_Sub11_Sub1_3.method4485();
					Static354.anInt5868 = 9;
				}
				if (Static354.anInt5868 == 9) {
					if (Static48.aClass3_2.method61() >= Static329.anInt5393) {
						Static48.aClass3_2.method59(Static154.aClass1_Sub11_Sub1_3.aByteArray64, 0, Static329.anInt5393);
						Static154.aClass1_Sub11_Sub1_3.anInt5766 = 0;
						local611 = Static329.anInt5393;
						Static418.anInt6790 = 2;
						Static354.anInt5868 = 0;
						Static48.method716();
						Static369.method3952(Static154.aClass1_Sub11_Sub1_3);
						Static92.anInt1619 = -1;
						Static400.method4917();
						if (Static154.aClass1_Sub11_Sub1_3.anInt5766 != local611) {
							throw new RuntimeException("lswp pos:" + Static154.aClass1_Sub11_Sub1_3.anInt5766 + " psize:" + local611);
						}
						Static175.aClass214_107 = null;
					}
				} else if (Static354.anInt5868 == 12) {
					if (Static329.anInt5393 == -2) {
						if (Static48.aClass3_2.method61() < 2) {
							return;
						}
						Static48.aClass3_2.method59(Static154.aClass1_Sub11_Sub1_3.aByteArray64, 0, 2);
						Static154.aClass1_Sub11_Sub1_3.anInt5766 = 0;
						Static329.anInt5393 = Static154.aClass1_Sub11_Sub1_3.method4485();
					}
					if (Static48.aClass3_2.method61() >= Static329.anInt5393) {
						Static48.aClass3_2.method59(Static154.aClass1_Sub11_Sub1_3.aByteArray64, 0, Static329.anInt5393);
						Static154.aClass1_Sub11_Sub1_3.anInt5766 = 0;
						local611 = Static329.anInt5393;
						Static418.anInt6790 = 15;
						Static354.anInt5868 = 0;
						Static63.method976();
						Static369.method3952(Static154.aClass1_Sub11_Sub1_3);
						if (Static154.aClass1_Sub11_Sub1_3.anInt5766 != local611) {
							throw new RuntimeException("lswpr pos:" + Static154.aClass1_Sub11_Sub1_3.anInt5766 + " psize:" + local611);
						}
						Static175.aClass214_107 = null;
					}
				}
			} else if (Static48.aClass3_2.method61() >= 1) {
				Static4.anInt66 = Static48.aClass3_2.method57();
				Static418.anInt6790 = 29;
				Static354.anInt5868 = 0;
				Static48.aClass3_2.method63();
				Static48.aClass3_2 = null;
			}
		} catch (@Pc(1126) IOException local1126) {
			if (Static48.aClass3_2 != null) {
				Static48.aClass3_2.method63();
				Static48.aClass3_2 = null;
			}
			if (Static86.anInt1540 < 1) {
				Static354.anInt5868 = 1;
				Static86.anInt1540++;
				if (Static131.anInt2260 == Static182.anInt2943) {
					Static131.anInt2260 = Static91.anInt1613;
				} else {
					Static131.anInt2260 = Static182.anInt2943;
				}
				Static449.anInt7401 = 0;
			} else {
				Static418.anInt6790 = -4;
				Static354.anInt5868 = 0;
			}
		}
	}
}
