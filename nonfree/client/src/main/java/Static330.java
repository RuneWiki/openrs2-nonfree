import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!nq", name = "u", descriptor = "I")
	public static int anInt6193;

	@OriginalMember(owner = "client!nq", name = "k", descriptor = "Lclient!ui;")
	public static final Class295 aClass295_36 = new Class295();

	@OriginalMember(owner = "client!nq", name = "t", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_310 = new Class305(42, 8);

	@OriginalMember(owner = "client!nq", name = "v", descriptor = "I")
	public static int anInt6194 = 0;

	@OriginalMember(owner = "client!nq", name = "w", descriptor = "[I")
	public static final int[] anIntArray611 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)V")
	public static void method5622() {
		if (Static121.anInt2498 == 0 || Static121.anInt2498 == 6) {
			return;
		}
		try {
			if (++Static249.anInt4801 > 2000) {
				if (Static200.aClass134_2 != null) {
					Static200.aClass134_2.method8116();
					Static200.aClass134_2 = null;
				}
				if (Static20.anInt418 >= 1) {
					Static121.anInt2498 = 0;
					Static47.method5114(-5);
					return;
				}
				if (Static434.anInt7518 == 2 || Static434.anInt7518 == 3) {
					Class216.lb.aBoolean468 = !Class216.lb.aBoolean468;
				} else {
					Static119.aClass210_2.aBoolean468 = !Static119.aClass210_2.aBoolean468;
				}
				Static121.anInt2498 = 1;
				Static249.anInt4801 = 0;
				Static20.anInt418++;
			}
			if (Static121.anInt2498 == 1) {
				if (Static434.anInt7518 == 2 || Static434.anInt7518 == 3) {
					Static393.aClass311_5 = Static473.aClass229_14.method6083(Class216.lb.method5716(), Class216.lb.aString150);
				} else {
					Static393.aClass311_5 = Static473.aClass229_14.method6083(Static119.aClass210_2.method5716(), Static119.aClass210_2.aString150);
				}
				Static121.anInt2498 = 2;
			}
			if (Static121.anInt2498 == 2) {
				if (Static393.aClass311_5.anInt9169 == 2) {
					throw new IOException();
				}
				if (Static393.aClass311_5.anInt9169 != 1) {
					return;
				}
				Static200.aClass134_2 = Static327.method5593((Socket) Static393.aClass311_5.anObject17);
				Static393.aClass311_5 = null;
				@Pc(138) long local138 = Static410.aLong209 = Static140.method2622(Static309.aString140);
				Static259.aClass1_Sub17_Sub2_1.anInt4872 = 0;
				@Pc(148) int local148 = (int) (local138 >> 16 & 0x1FL);
				Static259.aClass1_Sub17_Sub2_1.method4451(Static10.aClass39_1.anInt1272);
				Static259.aClass1_Sub17_Sub2_1.method4451(local148);
				Static200.aClass134_2.method8117(Static259.aClass1_Sub17_Sub2_1.aByteArray58, 2);
				Static121.anInt2498 = 3;
			}
			@Pc(190) int local190;
			if (Static121.anInt2498 == 3) {
				if (!Static200.aClass134_2.method8118(1)) {
					return;
				}
				Static200.aClass134_2.method8123(Static352.aClass1_Sub17_Sub2_2.aByteArray58, 1, 0);
				local190 = Static352.aClass1_Sub17_Sub2_2.aByteArray58[0] & 0xFF;
				if (local190 != 0) {
					Static121.anInt2498 = 0;
					Static47.method5114(local190);
					Static200.aClass134_2.method8116();
					Static200.aClass134_2 = null;
					Static6.method373();
					return;
				}
				Static121.anInt2498 = 4;
			}
			if (Static121.anInt2498 == 4) {
				if (!Static200.aClass134_2.method8118(8)) {
					return;
				}
				Static200.aClass134_2.method8123(Static352.aClass1_Sub17_Sub2_2.aByteArray58, 8, 0);
				Static352.aClass1_Sub17_Sub2_2.anInt4872 = 0;
				Static66.aLong41 = Static352.aClass1_Sub17_Sub2_2.method4465();
				@Pc(238) Class1_Sub17 local238 = new Class1_Sub17(518);
				@Pc(241) int[] local241 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static66.aLong41 >> 32), (int) Static66.aLong41 };
				local238.method4451(10);
				local238.method4489(local241[0]);
				local238.method4489(local241[1]);
				local238.method4489(local241[2]);
				local238.method4489(local241[3]);
				local238.method4452(Static140.method2622(Static309.aString140));
				local238.method4464(Static150.aString62);
				local238.method4452(Static409.aLong203);
				local238.method4452(Static70.aLong43);
				local238.method4457(Static250.aBigInteger4, Static176.aBigInteger2);
				@Pc(320) Class1_Sub17_Sub2 local320 = Static259.aClass1_Sub17_Sub2_1;
				local320.anInt4872 = 0;
				@Pc(341) int local341;
				if (Static434.anInt7518 == 2 || Static434.anInt7518 == 3) {
					if (Static186.anInt3863 == 12) {
						local320.method4451(Static10.aClass39_5.anInt1272);
					} else {
						local320.method4451(Static10.aClass39_3.anInt1272);
					}
					local320.method4473(0);
					local341 = local320.anInt4872;
					local320.method4489(605);
					local320.method4451(Static361.anInt6516);
					local320.method4451(Static226.method4065());
					local320.method4473(Static70.anInt1753);
					local320.method4473(Static508.anInt8910);
					local320.method4451(Static286.aClass1_Sub15_Sub1_1.anInt7032);
					Static181.method3534(local320);
					local320.method4464(Static18.aString9);
					local320.method4489(Static27.anInt767);
					@Pc(450) Class1_Sub17 local450 = new Class1_Sub17(Static61.method1525());
					Static286.aClass1_Sub15_Sub1_1.method6359(local450);
					local320.method4451(local450.anInt4872);
					local320.method4454(local450.anInt4872, local450.aByteArray58);
					Static473.aBoolean625 = true;
					@Pc(475) Class1_Sub17 local475 = new Class1_Sub17(Static481.method6249());
					(new Class1_Sub11(true, Static473.aClass229_14)).method2153(local475);
					local320.method4454(local475.aByteArray58.length, local475.aByteArray58);
					local320.method4473(Static418.anInt6721);
					Static407.method6491();
					local320.method4454(local238.anInt4872, local238.aByteArray58);
					local320.method4504(local320.anInt4872 - local341);
				} else {
					local320.method4451(Static10.aClass39_6.anInt1272);
					local320.method4473(0);
					local341 = local320.anInt4872;
					local320.method4489(605);
					local320.method4451(Static332.aClass250_4.anInt7314);
					local320.method4451(Static544.anInt7853);
					Static181.method3534(local320);
					local320.method4464(Static18.aString9);
					local320.method4489(Static27.anInt767);
					Static407.method6491();
					local320.method4454(local238.anInt4872, local238.aByteArray58);
					local320.method4504(local320.anInt4872 - local341);
				}
				Static200.aClass134_2.method8117(local320.aByteArray58, local320.anInt4872);
				local320.method4511(local241);
				for (local341 = 0; local341 < 4; local341++) {
					local241[local341] += 50;
				}
				Static352.aClass1_Sub17_Sub2_2.method4511(local241);
				Static121.anInt2498 = 5;
			}
			if (Static121.anInt2498 == 5) {
				if (!Static200.aClass134_2.method8118(1)) {
					return;
				}
				Static200.aClass134_2.method8123(Static352.aClass1_Sub17_Sub2_2.aByteArray58, 1, 0);
				local190 = Static352.aClass1_Sub17_Sub2_2.aByteArray58[0] & 0xFF;
				if (local190 == 21) {
					Static121.anInt2498 = 8;
				} else if (local190 == 29) {
					Static121.anInt2498 = 14;
				} else if (local190 == 1) {
					Static121.anInt2498 = 6;
					Static47.method5114(local190);
					return;
				} else if (local190 == 2) {
					Static121.anInt2498 = 9;
				} else if (local190 == 15) {
					Static494.anInt8660 = -2;
					Static121.anInt2498 = 15;
				} else if (local190 == 23 && Static20.anInt418 < 1) {
					Static249.anInt4801 = 0;
					Static20.anInt418++;
					Static121.anInt2498 = 1;
					Static200.aClass134_2.method8116();
					Static200.aClass134_2 = null;
					return;
				} else {
					Static121.anInt2498 = 0;
					Static47.method5114(local190);
					Static200.aClass134_2.method8116();
					Static200.aClass134_2 = null;
					Static6.method373();
					return;
				}
			}
			if (Static121.anInt2498 == 7) {
				Static259.aClass1_Sub17_Sub2_1.anInt4872 = 0;
				Static259.aClass1_Sub17_Sub2_1.method4508(Static10.aClass39_13.anInt1272);
				Static200.aClass134_2.method8117(Static259.aClass1_Sub17_Sub2_1.aByteArray58, Static259.aClass1_Sub17_Sub2_1.anInt4872);
				Static121.anInt2498 = 5;
			} else if (Static121.anInt2498 == 8) {
				if (Static200.aClass134_2.method8118(1)) {
					Static200.aClass134_2.method8123(Static352.aClass1_Sub17_Sub2_2.aByteArray58, 1, 0);
					local190 = Static352.aClass1_Sub17_Sub2_2.aByteArray58[0] & 0xFF;
					Static121.anInt2498 = 0;
					Static481.anInt6920 = (local190 + 3) * 60;
					Static47.method5114(21);
					Static200.aClass134_2.method8116();
					Static200.aClass134_2 = null;
					Static6.method373();
				}
			} else if (Static121.anInt2498 == 14) {
				if (Static200.aClass134_2.method8118(1)) {
					Static200.aClass134_2.method8123(Static352.aClass1_Sub17_Sub2_2.aByteArray58, 1, 0);
					Static433.anInt7516 = Static352.aClass1_Sub17_Sub2_2.aByteArray58[0] & 0xFF;
					Static121.anInt2498 = 0;
					Static47.method5114(29);
					Static200.aClass134_2.method8116();
					Static200.aClass134_2 = null;
					Static6.method373();
				}
			} else if (Static121.anInt2498 != 9) {
				@Pc(789) Class1_Sub17_Sub2 local789;
				if (Static121.anInt2498 == 10) {
					local789 = Static352.aClass1_Sub17_Sub2_2;
					if (Static434.anInt7518 == 3) {
						Static360.aBoolean481 = true;
					} else {
						Static360.aBoolean481 = false;
					}
					if (Static434.anInt7518 == 2 || Static434.anInt7518 == 3) {
						if (!Static200.aClass134_2.method8118(Static366.anInt6606)) {
							return;
						}
						Static200.aClass134_2.method8123(local789.aByteArray58, Static366.anInt6606, 0);
						local789.anInt4872 = 0;
						Static378.anInt6739 = local789.method4487();
						Static516.anInt9148 = local789.method4487();
						Static498.aBoolean656 = local789.method4487() == 1;
						Static353.aBoolean479 = local789.method4487() == 1;
						Static99.aBoolean179 = local789.method4487() == 1;
						Static394.aBoolean512 = local789.method4487() == 1;
						Static16.anInt9513 = local789.method4494();
						Static132.aBoolean231 = local789.method4487() == 1;
						Static172.anInt3437 = local789.method4498();
						Static343.aBoolean696 = local789.method4487() == 1;
						if (Static434.anInt7518 == 3) {
							@Pc(1085) boolean local1085 = local789.method4487() == 1;
							if (local1085) {
								@Pc(1091) long local1091 = local789.method4465();
								@Pc(1095) String local1095 = Static229.method4132(local1091);
								@Pc(1099) int local1099 = local789.method4487();
								@Pc(1102) byte[] local1102 = new byte[local1099];
								local789.method4516(local1099, local1102);
								@Pc(1112) String local1112 = Static245.method4341(local1102);
								@Pc(1114) Class208 local1114 = null;
								try {
									@Pc(1120) Class311 local1120 = Static473.aClass229_14.method6071("3", false);
									while (local1120.anInt9169 == 0) {
										Static265.method3147(1L);
									}
									if (local1120.anInt9169 == 1) {
										local1114 = (Class208) local1120.anObject17;
										@Pc(1154) int local1154 = local1095.length() + local1112.length() + 3 + 2 + 2 + 4;
										if (local1154 > 50) {
											throw new RuntimeException(">50");
										}
										@Pc(1170) Class1_Sub17 local1170 = new Class1_Sub17(local1154 + 1);
										local1170.method4451(local1154);
										local1170.method4451(1);
										local1170.method4478(local1095);
										local1170.method4478(local1112);
										local1170.method4473(Static27.anInt767);
										local1170.method4497();
										local1114.method5701(0, local1170.aByteArray58, local1170.anInt4872);
									}
								} catch (@Pc(1204) Exception local1204) {
								}
								try {
									if (local1114 != null) {
										local1114.method5704();
									}
								} catch (@Pc(1211) Exception local1211) {
								}
								try {
									Static558.method7782("demoaccountcreated", Static473.aClass229_14.anApplet1);
								} catch (@Pc(1219) Throwable local1219) {
								}
							}
						}
						Static398.aClass18_4.method602(Static343.aBoolean696);
						Static181.aClass316_1.method8108(Static343.aBoolean696);
						Static358.aClass95_1.method2361(Static343.aBoolean696);
					} else if (Static200.aClass134_2.method8118(Static366.anInt6606)) {
						Static200.aClass134_2.method8123(local789.aByteArray58, Static366.anInt6606, 0);
						local789.anInt4872 = 0;
						Static378.anInt6739 = local789.method4487();
						Static516.anInt9148 = local789.method4487();
						Static498.aBoolean656 = local789.method4487() == 1;
						Static353.aBoolean479 = local789.method4487() == 1;
						Static99.aBoolean179 = local789.method4487() == 1;
						Static538.anInt9478 = local789.method4494();
						Static132.aBoolean231 = Static538.anInt9478 > 0;
						Static472.anInt8397 = local789.method4494();
						Static210.anInt4145 = local789.method4494();
						Static531.anInt9392 = local789.method4494();
						Static11.anInt282 = local789.method4481();
						Static399.aClass311_7 = Static473.aClass229_14.method6075(Static11.anInt282);
						Static421.anInt7327 = local789.method4487();
						Static79.anInt1856 = local789.method4494();
						Static226.anInt4369 = local789.method4494();
						Static250.aBoolean368 = local789.method4487() == 1;
						Static107.aClass20_Sub1_Sub1_Sub1_1.aString13 = Static107.aClass20_Sub1_Sub1_Sub1_1.aString12 = local789.method4456();
						Static496.aClass210_3 = new Class210();
						Static496.aClass210_3.anInt6291 = local789.method4494();
						if (Static496.aClass210_3.anInt6291 == 65535) {
							Static496.aClass210_3.anInt6291 = -1;
						}
						Static496.aClass210_3.aString150 = local789.method4456();
						if (Static334.aClass139_4 != Static190.aClass139_1) {
							Static496.aClass210_3.anInt6288 = Static496.aClass210_3.anInt6291 + 50000;
							Static496.aClass210_3.anInt6287 = Static496.aClass210_3.anInt6291 + 40000;
						}
						if (Static190.aClass139_1 != Static283.aClass139_2 && (Class216.lb.method5714(Static499.aClass210_4) || Class216.lb.method5714(Static101.aClass210_1))) {
							Static75.method1732();
						}
					} else {
						return;
					}
					if (Static498.aBoolean656 && !Static99.aBoolean179 || Static132.aBoolean231) {
						try {
							Static558.method7782("zap", Static473.aClass229_14.anApplet1);
						} catch (@Pc(1256) Throwable local1256) {
							if (Static259.aBoolean375) {
								try {
									Static473.aClass229_14.anApplet1.getAppletContext().showDocument(new URL(Static473.aClass229_14.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1272) Exception local1272) {
								}
							}
						}
					} else {
						try {
							Static558.method7782("unzap", Static473.aClass229_14.anApplet1);
						} catch (@Pc(1246) Throwable local1246) {
						}
					}
					if (Static334.aClass139_4 == Static190.aClass139_1) {
						try {
							Static558.method7782("loggedin", Static473.aClass229_14.anApplet1);
						} catch (@Pc(1284) Throwable local1284) {
						}
					}
					if (Static434.anInt7518 != 2 && Static434.anInt7518 != 3) {
						Static121.anInt2498 = 0;
						Static47.method5114(2);
						Static201.method3786();
						Static506.method7745(6);
						Static43.aClass305_340 = null;
						return;
					}
					Static121.anInt2498 = 12;
				}
				if (Static121.anInt2498 == 12) {
					if (!Static200.aClass134_2.method8118(3)) {
						return;
					}
					Static200.aClass134_2.method8123(Static352.aClass1_Sub17_Sub2_2.aByteArray58, 3, 0);
					Static121.anInt2498 = 13;
				}
				if (Static121.anInt2498 == 13) {
					local789 = Static352.aClass1_Sub17_Sub2_2;
					local789.anInt4872 = 0;
					if (local789.method4513()) {
						if (!Static200.aClass134_2.method8118(1)) {
							return;
						}
						Static200.aClass134_2.method8123(local789.aByteArray58, 1, 3);
					}
					Static43.aClass305_340 = Static36.method1110()[local789.method4509()];
					Static494.anInt8660 = local789.method4494();
					Static121.anInt2498 = 11;
				}
				if (Static121.anInt2498 == 11) {
					if (Static200.aClass134_2.method8118(Static494.anInt8660)) {
						Static200.aClass134_2.method8123(Static352.aClass1_Sub17_Sub2_2.aByteArray58, Static494.anInt8660, 0);
						Static352.aClass1_Sub17_Sub2_2.anInt4872 = 0;
						local190 = Static494.anInt8660;
						Static121.anInt2498 = 0;
						Static47.method5114(2);
						Static401.method6521();
						Static209.method3850(Static352.aClass1_Sub17_Sub2_2);
						Static388.anInt6883 = -1;
						Static227.method4089();
						if (local190 != Static352.aClass1_Sub17_Sub2_2.anInt4872) {
							throw new RuntimeException("lswp pos:" + Static352.aClass1_Sub17_Sub2_2.anInt4872 + " psize:" + local190);
						}
						Static43.aClass305_340 = null;
					}
				} else if (Static121.anInt2498 == 15) {
					if (Static494.anInt8660 == -2) {
						if (!Static200.aClass134_2.method8118(2)) {
							return;
						}
						Static200.aClass134_2.method8123(Static352.aClass1_Sub17_Sub2_2.aByteArray58, 2, 0);
						Static352.aClass1_Sub17_Sub2_2.anInt4872 = 0;
						Static494.anInt8660 = Static352.aClass1_Sub17_Sub2_2.method4494();
					}
					if (Static200.aClass134_2.method8118(Static494.anInt8660)) {
						Static200.aClass134_2.method8123(Static352.aClass1_Sub17_Sub2_2.aByteArray58, Static494.anInt8660, 0);
						Static352.aClass1_Sub17_Sub2_2.anInt4872 = 0;
						Static121.anInt2498 = 0;
						local190 = Static494.anInt8660;
						Static47.method5114(15);
						Static289.method5093();
						Static209.method3850(Static352.aClass1_Sub17_Sub2_2);
						if (Static352.aClass1_Sub17_Sub2_2.anInt4872 != local190) {
							throw new RuntimeException("lswpr pos:" + Static352.aClass1_Sub17_Sub2_2.anInt4872 + " psize:" + local190);
						}
						Static43.aClass305_340 = null;
					}
				}
			} else if (Static200.aClass134_2.method8118(1)) {
				Static200.aClass134_2.method8123(Static352.aClass1_Sub17_Sub2_2.aByteArray58, 1, 0);
				Static366.anInt6606 = Static352.aClass1_Sub17_Sub2_2.aByteArray58[0] & 0xFF;
				Static121.anInt2498 = 10;
			}
		} catch (@Pc(1524) IOException local1524) {
			if (Static200.aClass134_2 != null) {
				Static200.aClass134_2.method8116();
				Static200.aClass134_2 = null;
			}
			if (Static20.anInt418 >= 1) {
				Static121.anInt2498 = 0;
				Static47.method5114(-4);
				Static6.method373();
			} else {
				Static121.anInt2498 = 1;
				Static249.anInt4801 = 0;
				Static20.anInt418++;
				if (Static434.anInt7518 == 2 || Static434.anInt7518 == 3) {
					Class216.lb.aBoolean468 = !Class216.lb.aBoolean468;
				} else {
					Static119.aClass210_2.aBoolean468 = !Static119.aClass210_2.aBoolean468;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)V")
	public static void method5623() {
		for (@Pc(14) Class1_Sub2_Sub14 local14 = (Class1_Sub2_Sub14) aClass295_36.method7543(); local14 != null; local14 = (Class1_Sub2_Sub14) aClass295_36.method7540()) {
			@Pc(19) Class20_Sub1_Sub6 local19 = local14.aClass20_Sub1_Sub6_1;
			if (local19.aBoolean558) {
				local14.method8239();
				local19.method6609();
			} else if (Static445.anInt7791 >= local19.anInt7378) {
				local19.method6611(Static242.anInt4651);
				if (local19.aBoolean558) {
					local14.method8239();
				} else {
					Static391.method6237(local19, true);
				}
			}
		}
	}
}
