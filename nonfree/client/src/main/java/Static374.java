import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "Z")
	public static boolean aBoolean489 = false;

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
	public static int anInt6550 = 0;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
	public static void method5600() {
		Static228.aClass155ArrayArray1 = new Class155[Static265.aClass71_63.method1553()][];
		Static136.aBooleanArray55 = new boolean[Static265.aClass71_63.method1553()];
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
	public static void method5601() {
		if (Static251.anInt4517 == 0 || Static251.anInt4517 == 5) {
			return;
		}
		try {
			if (++Static332.anInt5818 > 2000) {
				if (Static169.aClass124_3 != null) {
					Static169.aClass124_3.method2714();
					Static169.aClass124_3 = null;
				}
				if (Static68.anInt1298 >= 1) {
					Static251.anInt4517 = 0;
					Static217.anInt4042 = -5;
					return;
				}
				Static68.anInt1298++;
				if (Static33.anInt704 == Static225.anInt4195) {
					Static225.anInt4195 = Static230.anInt4259;
				} else {
					Static225.anInt4195 = Static33.anInt704;
				}
				Static251.anInt4517 = 1;
				Static332.anInt5818 = 0;
			}
			if (Static251.anInt4517 == 1) {
				Static383.aClass1_10 = Static92.aClass53_2.method1179(Static329.aString57, Static225.anInt4195);
				Static251.anInt4517 = 2;
			}
			if (Static251.anInt4517 == 2) {
				if (Static383.aClass1_10.anInt2 == 2) {
					throw new IOException();
				}
				if (Static383.aClass1_10.anInt2 != 1) {
					return;
				}
				Static169.aClass124_3 = new Class124((Socket) Static383.aClass1_10.anObject1, Static92.aClass53_2);
				Static383.aClass1_10 = null;
				@Pc(99) long local99 = Static97.aLong66 = Static389.method5718(Static53.aString7);
				@Pc(106) int local106 = (int) (local99 >> 16 & 0x1FL);
				Static39.aClass2_Sub13_Sub2_4.anInt4788 = 0;
				Static39.aClass2_Sub13_Sub2_4.method4207(Static74.aClass101_11.anInt2534);
				Static39.aClass2_Sub13_Sub2_4.method4207(local106);
				Static169.aClass124_3.method2717(2, Static39.aClass2_Sub13_Sub2_4.aByteArray77);
				if (Static124.aClass45_3 != null) {
					Static124.aClass45_3.method3371();
				}
				if (Static267.aClass45_2 != null) {
					Static267.aClass45_2.method3371();
				}
				@Pc(139) int local139 = Static169.aClass124_3.method2712();
				if (Static124.aClass45_3 != null) {
					Static124.aClass45_3.method3371();
				}
				if (Static267.aClass45_2 != null) {
					Static267.aClass45_2.method3371();
				}
				if (local139 != 0) {
					Static217.anInt4042 = local139;
					Static251.anInt4517 = 0;
					Static169.aClass124_3.method2714();
					Static169.aClass124_3 = null;
					return;
				}
				Static251.anInt4517 = 3;
			}
			if (Static251.anInt4517 == 3) {
				if (Static169.aClass124_3.method2716() < 8) {
					return;
				}
				Static169.aClass124_3.method2720(Static85.aClass2_Sub13_Sub2_11.aByteArray77, 8, 0);
				Static85.aClass2_Sub13_Sub2_11.anInt4788 = 0;
				Static67.aLong47 = Static85.aClass2_Sub13_Sub2_11.method4231();
				@Pc(194) int[] local194 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static67.aLong47 >> 32), (int) Static67.aLong47 };
				Static39.aClass2_Sub13_Sub2_4.anInt4788 = 0;
				Static39.aClass2_Sub13_Sub2_4.method4207(10);
				Static39.aClass2_Sub13_Sub2_4.method4218(local194[0]);
				Static39.aClass2_Sub13_Sub2_4.method4218(local194[1]);
				Static39.aClass2_Sub13_Sub2_4.method4218(local194[2]);
				Static39.aClass2_Sub13_Sub2_4.method4218(local194[3]);
				Static39.aClass2_Sub13_Sub2_4.method4208(Static389.method5718(Static53.aString7));
				Static39.aClass2_Sub13_Sub2_4.method4230(Static235.aString41);
				Static39.aClass2_Sub13_Sub2_4.method4233(Static41.aBigInteger1, Static318.aBigInteger5);
				Static174.aClass2_Sub13_Sub2_27.anInt4788 = 0;
				if (Static344.anInt6327 == 40) {
					Static174.aClass2_Sub13_Sub2_27.method4207(Static74.aClass101_15.anInt2534);
				} else {
					Static174.aClass2_Sub13_Sub2_27.method4207(Static74.aClass101_13.anInt2534);
				}
				Static174.aClass2_Sub13_Sub2_27.method4199(Static39.aClass2_Sub13_Sub2_4.anInt4788 + Static346.method5273(Static209.aString33) + 161);
				Static174.aClass2_Sub13_Sub2_27.method4218(572);
				Static174.aClass2_Sub13_Sub2_27.method4207(Static25.anInt604);
				Static174.aClass2_Sub13_Sub2_27.method4207(Static238.method3868());
				Static174.aClass2_Sub13_Sub2_27.method4199(Static335.anInt5875);
				Static174.aClass2_Sub13_Sub2_27.method4199(Static263.anInt4662);
				Static174.aClass2_Sub13_Sub2_27.method4207(Static34.anInt734);
				Static25.method675(Static174.aClass2_Sub13_Sub2_27);
				Static174.aClass2_Sub13_Sub2_27.method4230(Static209.aString33);
				Static174.aClass2_Sub13_Sub2_27.method4218(Static277.anInt2677);
				Static174.aClass2_Sub13_Sub2_27.method4218(Static14.method435());
				Static218.aBoolean305 = true;
				Static174.aClass2_Sub13_Sub2_27.method4199(Static45.anInt2591);
				Static174.aClass2_Sub13_Sub2_27.method4218(Static64.aClass71_17.method1566());
				Static174.aClass2_Sub13_Sub2_27.method4218(Static323.aClass71_74.method1566());
				Static174.aClass2_Sub13_Sub2_27.method4218(Static262.aClass71_41.method1566());
				Static174.aClass2_Sub13_Sub2_27.method4218(Static237.aClass71_58.method1566());
				Static174.aClass2_Sub13_Sub2_27.method4218(Static14.aClass71_1.method1566());
				Static174.aClass2_Sub13_Sub2_27.method4218(Static200.aClass71_48.method1566());
				Static174.aClass2_Sub13_Sub2_27.method4218(Static161.aClass71_37.method1566());
				Static174.aClass2_Sub13_Sub2_27.method4218(Static278.aClass71_20.method1566());
				Static174.aClass2_Sub13_Sub2_27.method4218(Static119.aClass71_25.method1566());
				Static174.aClass2_Sub13_Sub2_27.method4218(Static122.aClass71_27.method1566());
				Static174.aClass2_Sub13_Sub2_27.method4218(Static121.aClass71_26.method1566());
				Static174.aClass2_Sub13_Sub2_27.method4218(Static209.aClass71_50.method1566());
				Static174.aClass2_Sub13_Sub2_27.method4218(Static15.aClass71_2.method1566());
				Static174.aClass2_Sub13_Sub2_27.method4218(Static382.aClass71_89.method1566());
				Static174.aClass2_Sub13_Sub2_27.method4218(Static226.aClass71_55.method1566());
				Static174.aClass2_Sub13_Sub2_27.method4218(Static140.aClass71_80.method1566());
				Static174.aClass2_Sub13_Sub2_27.method4218(Static330.aClass71_79.method1566());
				Static174.aClass2_Sub13_Sub2_27.method4218(Static38.aClass71_11.method1566());
				Static174.aClass2_Sub13_Sub2_27.method4218(Static187.aClass71_45.method1566());
				Static174.aClass2_Sub13_Sub2_27.method4218(Static193.aClass71_90.method1566());
				Static174.aClass2_Sub13_Sub2_27.method4218(Static136.aClass71_28.method1566());
				Static174.aClass2_Sub13_Sub2_27.method4218(Static143.aClass71_32.method1566());
				Static174.aClass2_Sub13_Sub2_27.method4218(Static149.aClass71_34.method1566());
				Static174.aClass2_Sub13_Sub2_27.method4218(Static71.aClass71_18.method1566());
				Static174.aClass2_Sub13_Sub2_27.method4218(Static251.aClass71_60.method1566());
				Static174.aClass2_Sub13_Sub2_27.method4218(Static342.aClass71_83.method1566());
				Static174.aClass2_Sub13_Sub2_27.method4218(Static323.aClass71_75.method1566());
				Static174.aClass2_Sub13_Sub2_27.method4218(Static22.aClass71_9.method1566());
				Static174.aClass2_Sub13_Sub2_27.method4218(Static280.aClass71_67.method1566());
				Static174.aClass2_Sub13_Sub2_27.method4191(Static39.aClass2_Sub13_Sub2_4.anInt4788, Static39.aClass2_Sub13_Sub2_4.aByteArray77);
				Static169.aClass124_3.method2717(Static174.aClass2_Sub13_Sub2_27.anInt4788, Static174.aClass2_Sub13_Sub2_27.aByteArray77);
				Static39.aClass2_Sub13_Sub2_4.method4261(local194);
				for (@Pc(539) int local539 = 0; local539 < 4; local539++) {
					local194[local539] += 50;
				}
				Static85.aClass2_Sub13_Sub2_11.method4261(local194);
				Static251.anInt4517 = 4;
			}
			@Pc(573) int local573;
			if (Static251.anInt4517 == 4) {
				if (Static169.aClass124_3.method2716() < 1) {
					return;
				}
				local573 = Static169.aClass124_3.method2712();
				if (local573 == 21) {
					Static251.anInt4517 = 7;
				} else if (local573 == 29) {
					Static251.anInt4517 = 11;
				} else if (local573 == 1) {
					Static251.anInt4517 = 5;
					Static217.anInt4042 = local573;
					return;
				} else if (local573 == 2) {
					Static251.anInt4517 = 8;
				} else if (local573 == 15) {
					Static251.anInt4517 = 12;
					Static327.anInt5773 = -2;
				} else if (local573 == 23 && Static68.anInt1298 < 1) {
					Static68.anInt1298++;
					Static332.anInt5818 = 0;
					Static251.anInt4517 = 1;
					Static169.aClass124_3.method2714();
					Static169.aClass124_3 = null;
					return;
				} else {
					Static217.anInt4042 = local573;
					Static251.anInt4517 = 0;
					Static169.aClass124_3.method2714();
					Static169.aClass124_3 = null;
					return;
				}
			}
			if (Static251.anInt4517 == 6) {
				Static39.aClass2_Sub13_Sub2_4.anInt4788 = 0;
				Static39.aClass2_Sub13_Sub2_4.method4253(Static74.aClass101_14.anInt2534);
				Static169.aClass124_3.method2717(Static39.aClass2_Sub13_Sub2_4.anInt4788, Static39.aClass2_Sub13_Sub2_4.aByteArray77);
				Static251.anInt4517 = 4;
			} else if (Static251.anInt4517 == 7) {
				if (Static169.aClass124_3.method2716() >= 1) {
					Static281.anInt4956 = (Static169.aClass124_3.method2712() + 3) * 60;
					Static217.anInt4042 = 21;
					Static251.anInt4517 = 0;
					Static169.aClass124_3.method2714();
					Static169.aClass124_3 = null;
				}
			} else if (Static251.anInt4517 != 11) {
				if (Static251.anInt4517 == 8) {
					if (Static169.aClass124_3.method2716() < 13) {
						return;
					}
					Static169.aClass124_3.method2720(Static85.aClass2_Sub13_Sub2_11.aByteArray77, 13, 0);
					Static85.aClass2_Sub13_Sub2_11.anInt4788 = 0;
					Static287.anInt5112 = Static85.aClass2_Sub13_Sub2_11.method4240();
					Static338.anInt5998 = Static85.aClass2_Sub13_Sub2_11.method4240();
					Static244.aBoolean92 = Static85.aClass2_Sub13_Sub2_11.method4240() == 1;
					Static208.aBoolean285 = Static85.aClass2_Sub13_Sub2_11.method4240() == 1;
					Static63.aBoolean106 = Static85.aClass2_Sub13_Sub2_11.method4240() == 1;
					Static346.aBoolean460 = Static85.aClass2_Sub13_Sub2_11.method4240() == 1;
					Static194.anInt3441 = Static85.aClass2_Sub13_Sub2_11.method4245();
					Static118.aBoolean180 = Static85.aClass2_Sub13_Sub2_11.method4240() == 1;
					Static6.aBoolean4 = Static85.aClass2_Sub13_Sub2_11.method4240() == 1;
					Static11.aClass123_5.method2700(Static6.aBoolean4);
					Static106.aClass250_1.method5727(Static6.aBoolean4);
					Static274.aClass151_4.method3702(Static6.aBoolean4);
					if (Static244.aBoolean92 && !Static63.aBoolean106 || Static118.aBoolean180) {
						try {
							Static400.method4007(Static92.aClass53_2.anApplet1, "zap");
						} catch (@Pc(842) Throwable local842) {
							if (Static275.aBoolean349) {
								try {
									Static92.aClass53_2.anApplet1.getAppletContext().showDocument(new URL(Static92.aClass53_2.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(858) Exception local858) {
								}
							}
						}
					} else {
						try {
							Static400.method4007(Static92.aClass53_2.anApplet1, "unzap");
						} catch (@Pc(868) Throwable local868) {
						}
					}
					if (Static337.aClass143_27 == Static91.aClass143_12) {
						try {
							Static400.method4007(Static92.aClass53_2.anApplet1, "loggedin");
						} catch (@Pc(880) Throwable local880) {
						}
					}
					Static251.anInt4517 = 10;
				}
				if (Static251.anInt4517 == 10) {
					if (Static85.aClass2_Sub13_Sub2_11.method4264()) {
						if (Static169.aClass124_3.method2716() < 1) {
							return;
						}
						Static169.aClass124_3.method2720(Static85.aClass2_Sub13_Sub2_11.aByteArray77, 1, Static85.aClass2_Sub13_Sub2_11.anInt4788 + 2);
					}
					Static265.aClass77_123 = Static146.method2504()[Static85.aClass2_Sub13_Sub2_11.method4260()];
					Static327.anInt5773 = Static85.aClass2_Sub13_Sub2_11.method4245();
					Static251.anInt4517 = 9;
				}
				if (Static251.anInt4517 == 9) {
					if (Static169.aClass124_3.method2716() >= Static327.anInt5773) {
						Static169.aClass124_3.method2720(Static85.aClass2_Sub13_Sub2_11.aByteArray77, Static327.anInt5773, 0);
						Static85.aClass2_Sub13_Sub2_11.anInt4788 = 0;
						Static217.anInt4042 = 2;
						Static251.anInt4517 = 0;
						local573 = Static327.anInt5773;
						Static209.method3551();
						Static28.method687(Static85.aClass2_Sub13_Sub2_11);
						Static226.anInt4218 = -1;
						Static236.method3857(false);
						if (Static85.aClass2_Sub13_Sub2_11.anInt4788 != local573) {
							throw new RuntimeException("lswp pos:" + Static85.aClass2_Sub13_Sub2_11.anInt4788 + " psize:" + local573);
						}
						Static265.aClass77_123 = null;
					}
				} else if (Static251.anInt4517 == 12) {
					if (Static327.anInt5773 == -2) {
						if (Static169.aClass124_3.method2716() < 2) {
							return;
						}
						Static169.aClass124_3.method2720(Static85.aClass2_Sub13_Sub2_11.aByteArray77, 2, 0);
						Static85.aClass2_Sub13_Sub2_11.anInt4788 = 0;
						Static327.anInt5773 = Static85.aClass2_Sub13_Sub2_11.method4245();
					}
					if (Static169.aClass124_3.method2716() >= Static327.anInt5773) {
						Static169.aClass124_3.method2720(Static85.aClass2_Sub13_Sub2_11.aByteArray77, Static327.anInt5773, 0);
						Static85.aClass2_Sub13_Sub2_11.anInt4788 = 0;
						local573 = Static327.anInt5773;
						Static251.anInt4517 = 0;
						Static217.anInt4042 = 15;
						Static261.method4079();
						Static28.method687(Static85.aClass2_Sub13_Sub2_11);
						if (Static85.aClass2_Sub13_Sub2_11.anInt4788 != local573) {
							throw new RuntimeException("lswpr pos:" + Static85.aClass2_Sub13_Sub2_11.anInt4788 + " psize:" + local573);
						}
						Static265.aClass77_123 = null;
					}
				}
			} else if (Static169.aClass124_3.method2716() >= 1) {
				Static5.anInt6727 = Static169.aClass124_3.method2712();
				Static217.anInt4042 = 29;
				Static251.anInt4517 = 0;
				Static169.aClass124_3.method2714();
				Static169.aClass124_3 = null;
			}
		} catch (@Pc(1081) IOException local1081) {
			if (Static169.aClass124_3 != null) {
				Static169.aClass124_3.method2714();
				Static169.aClass124_3 = null;
			}
			if (Static68.anInt1298 >= 1) {
				Static217.anInt4042 = -4;
				Static251.anInt4517 = 0;
			} else {
				Static68.anInt1298++;
				Static251.anInt4517 = 1;
				if (Static33.anInt704 == Static225.anInt4195) {
					Static225.anInt4195 = Static230.anInt4259;
				} else {
					Static225.anInt4195 = Static33.anInt704;
				}
				Static332.anInt5818 = 0;
			}
		}
	}
}
