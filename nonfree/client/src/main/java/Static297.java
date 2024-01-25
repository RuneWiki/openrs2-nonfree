import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!ol", name = "o", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_70 = new Class208(43, 0);

	@OriginalMember(owner = "client!ol", name = "r", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_71 = new Class208(10, 7);

	@OriginalMember(owner = "client!ol", name = "s", descriptor = "Z")
	public static boolean aBoolean371 = false;

	@OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
	public static int anInt5330 = 0;

	@OriginalMember(owner = "client!ol", name = "v", descriptor = "Z")
	public static boolean aBoolean372 = false;

	@OriginalMember(owner = "client!ol", name = "x", descriptor = "[I")
	public static final int[] anIntArray454 = new int[100];

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V")
	public static void method4245() {
		if (Static129.anInt2192 == 0 || Static129.anInt2192 == 6) {
			return;
		}
		try {
			if (++Static457.anInt7605 > 2000) {
				if (Static339.aClass66_2 != null) {
					Static339.aClass66_2.method1388();
					Static339.aClass66_2 = null;
				}
				if (Static220.anInt3723 >= 1) {
					Static129.anInt2192 = 0;
					Static108.method1796(-5);
					return;
				}
				Static129.anInt2192 = 1;
				Static457.anInt7605 = 0;
				if (Static25.anInt7276 == 2 || Static25.anInt7276 == 3) {
					Static163.aClass263_3.aBoolean500 = !Static163.aClass263_3.aBoolean500;
				} else {
					Static15.aClass263_1.aBoolean500 = !Static15.aClass263_1.aBoolean500;
				}
				Static220.anInt3723++;
			}
			if (Static129.anInt2192 == 1) {
				if (Static25.anInt7276 == 2 || Static25.anInt7276 == 3) {
					Static448.aClass136_8 = Static138.aClass194_2.method4418(Static163.aClass263_3.aString71, Static163.aClass263_3.method5935());
				} else {
					Static448.aClass136_8 = Static138.aClass194_2.method4418(Static15.aClass263_1.aString71, Static15.aClass263_1.method5935());
				}
				Static129.anInt2192 = 2;
			}
			if (Static129.anInt2192 == 2) {
				if (Static448.aClass136_8.anInt3418 == 2) {
					throw new IOException();
				}
				if (Static448.aClass136_8.anInt3418 != 1) {
					return;
				}
				Static339.aClass66_2 = Static253.method3540((Socket) Static448.aClass136_8.anObject10);
				Static448.aClass136_8 = null;
				@Pc(142) long local142 = Static333.aLong307 = Static71.method1107(Static448.aString72);
				@Pc(149) int local149 = (int) (local142 >> 16 & 0x1FL);
				Static389.aClass2_Sub17_Sub1_2.anInt7523 = 0;
				Static389.aClass2_Sub17_Sub1_2.method6172(Static173.aClass78_1.anInt1850);
				Static389.aClass2_Sub17_Sub1_2.method6172(local149);
				Static339.aClass66_2.method1392(2, Static389.aClass2_Sub17_Sub1_2.aByteArray94);
				Static129.anInt2192 = 3;
			}
			@Pc(194) int local194;
			if (Static129.anInt2192 == 3) {
				if (!Static339.aClass66_2.method1390(1)) {
					return;
				}
				Static339.aClass66_2.method1394(0, Static202.aClass2_Sub17_Sub1_1.aByteArray94, 1);
				local194 = Static202.aClass2_Sub17_Sub1_1.aByteArray94[0] & 0xFF;
				if (local194 != 0) {
					Static129.anInt2192 = 0;
					Static108.method1796(local194);
					Static339.aClass66_2.method1388();
					Static339.aClass66_2 = null;
					Static234.method3190();
					return;
				}
				Static129.anInt2192 = 4;
			}
			if (Static129.anInt2192 == 4) {
				if (!Static339.aClass66_2.method1390(8)) {
					return;
				}
				Static339.aClass66_2.method1394(0, Static202.aClass2_Sub17_Sub1_1.aByteArray94, 8);
				Static202.aClass2_Sub17_Sub1_1.anInt7523 = 0;
				Static201.aLong163 = Static202.aClass2_Sub17_Sub1_1.method6128();
				@Pc(243) Class2_Sub17 local243 = new Class2_Sub17(70);
				@Pc(246) int[] local246 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static201.aLong163 >> 32), (int) Static201.aLong163 };
				local243.method6172(10);
				local243.method6170(local246[0]);
				local243.method6170(local246[1]);
				local243.method6170(local246[2]);
				local243.method6170(local246[3]);
				local243.method6132(Static71.method1107(Static448.aString72));
				local243.method6151(Static205.aString31);
				local243.method6142(Static130.aBigInteger3, Static135.aBigInteger2);
				@Pc(317) Class2_Sub17_Sub1 local317 = Static389.aClass2_Sub17_Sub1_2;
				local317.anInt7523 = 0;
				@Pc(350) int local350;
				if (Static25.anInt7276 == 2 || Static25.anInt7276 == 3) {
					if (Static433.anInt7309 == 12) {
						local317.method6172(Static173.aClass78_5.anInt1850);
					} else {
						local317.method6172(Static173.aClass78_3.anInt1850);
					}
					local317.method6130(0);
					local350 = local317.anInt7523;
					local317.method6170(600);
					local317.method6172(Static199.anInt3422);
					local317.method6172(Static235.method3217());
					local317.method6130(Static49.anInt789);
					local317.method6130(Static344.anInt6105);
					local317.method6172(Static434.aClass165_Sub1_1.anInt4201);
					Static353.method4959(local317);
					local317.method6151(Static222.aString34);
					local317.method6170(Static451.anInt7181);
					@Pc(391) Class2_Sub17 local391 = Static434.aClass165_Sub1_1.method3393();
					local317.method6172(local391.anInt7523);
					local317.method6167(local391.aByteArray94, local391.anInt7523);
					Static214.aBoolean244 = true;
					local317.method6130(Static170.anInt3068);
					local317.method6130(Static51.anInt840);
					Static136.method2141();
					local317.method6167(local243.aByteArray94, local243.anInt7523);
					local317.method6154(local317.anInt7523 - local350);
				} else {
					local317.method6172(Static173.aClass78_6.anInt1850);
					local317.method6130(0);
					local350 = local317.anInt7523;
					local317.method6170(600);
					local317.method6172(Static10.aClass200_1.anInt5771);
					local317.method6172(Static80.anInt6195);
					Static353.method4959(local317);
					local317.method6151(Static222.aString34);
					local317.method6170(Static451.anInt7181);
					Static136.method2141();
					local317.method6167(local243.aByteArray94, local243.anInt7523);
					local317.method6154(local317.anInt7523 - local350);
				}
				Static339.aClass66_2.method1392(local317.anInt7523, local317.aByteArray94);
				local317.method5584(local246);
				for (local350 = 0; local350 < 4; local350++) {
					local246[local350] += 50;
				}
				Static202.aClass2_Sub17_Sub1_1.method5584(local246);
				Static129.anInt2192 = 5;
			}
			if (Static129.anInt2192 == 5) {
				if (!Static339.aClass66_2.method1390(1)) {
					return;
				}
				Static339.aClass66_2.method1394(0, Static202.aClass2_Sub17_Sub1_1.aByteArray94, 1);
				local194 = Static202.aClass2_Sub17_Sub1_1.aByteArray94[0] & 0xFF;
				if (local194 == 21) {
					Static129.anInt2192 = 8;
				} else if (local194 == 29) {
					Static129.anInt2192 = 14;
				} else if (local194 == 1) {
					Static129.anInt2192 = 6;
					Static108.method1796(local194);
					return;
				} else if (local194 == 2) {
					Static129.anInt2192 = 9;
				} else if (local194 == 15) {
					Static129.anInt2192 = 15;
					Static302.anInt5465 = -2;
				} else if (local194 == 23 && Static220.anInt3723 < 1) {
					Static220.anInt3723++;
					Static457.anInt7605 = 0;
					Static129.anInt2192 = 1;
					Static339.aClass66_2.method1388();
					Static339.aClass66_2 = null;
					return;
				} else {
					Static129.anInt2192 = 0;
					Static108.method1796(local194);
					Static339.aClass66_2.method1388();
					Static339.aClass66_2 = null;
					Static234.method3190();
					return;
				}
			}
			if (Static129.anInt2192 == 7) {
				Static389.aClass2_Sub17_Sub1_2.anInt7523 = 0;
				Static389.aClass2_Sub17_Sub1_2.method5576(Static173.aClass78_4.anInt1850);
				Static339.aClass66_2.method1392(Static389.aClass2_Sub17_Sub1_2.anInt7523, Static389.aClass2_Sub17_Sub1_2.aByteArray94);
				Static129.anInt2192 = 5;
			} else if (Static129.anInt2192 == 8) {
				if (Static339.aClass66_2.method1390(1)) {
					Static339.aClass66_2.method1394(0, Static202.aClass2_Sub17_Sub1_1.aByteArray94, 1);
					local194 = Static202.aClass2_Sub17_Sub1_1.aByteArray94[0] & 0xFF;
					Static129.anInt2192 = 0;
					Static461.anInt7749 = local194 * 60 + 180;
					Static108.method1796(21);
					Static339.aClass66_2.method1388();
					Static339.aClass66_2 = null;
					Static234.method3190();
				}
			} else if (Static129.anInt2192 == 14) {
				if (Static339.aClass66_2.method1390(1)) {
					Static339.aClass66_2.method1394(0, Static202.aClass2_Sub17_Sub1_1.aByteArray94, 1);
					Static353.anInt6219 = Static202.aClass2_Sub17_Sub1_1.aByteArray94[0] & 0xFF;
					Static129.anInt2192 = 0;
					Static108.method1796(29);
					Static339.aClass66_2.method1388();
					Static339.aClass66_2 = null;
					Static234.method3190();
				}
			} else if (Static129.anInt2192 != 9) {
				@Pc(757) Class2_Sub17_Sub1 local757;
				if (Static129.anInt2192 == 10) {
					local757 = Static202.aClass2_Sub17_Sub1_1;
					if (Static25.anInt7276 == 3) {
						Static358.aBoolean503 = true;
					} else {
						Static358.aBoolean503 = false;
					}
					if (Static25.anInt7276 == 2 || Static25.anInt7276 == 3) {
						if (!Static339.aClass66_2.method1390(Static298.anInt5370)) {
							return;
						}
						Static339.aClass66_2.method1394(0, local757.aByteArray94, Static298.anInt5370);
						local757.anInt7523 = 0;
						Static81.anInt1300 = local757.method6138();
						Static211.anInt3616 = local757.method6138();
						Static3.aBoolean3 = local757.method6138() == 1;
						Static203.aBoolean230 = local757.method6138() == 1;
						Static166.aBoolean184 = local757.method6138() == 1;
						Static46.aBoolean36 = local757.method6138() == 1;
						Static94.anInt5592 = local757.method6148();
						Static354.aBoolean431 = local757.method6138() == 1;
						Static292.anInt5208 = local757.method6109();
						Static183.aBoolean205 = local757.method6138() == 1;
						if (Static25.anInt7276 == 3) {
							@Pc(877) boolean local877 = local757.method6138() == 1;
							if (local877) {
								@Pc(883) long local883 = local757.method6128();
								@Pc(887) String local887 = Static289.method4097(local883);
								@Pc(891) int local891 = local757.method6138();
								@Pc(894) byte[] local894 = new byte[local891];
								local757.method5582(local891, local894);
								@Pc(904) String local904 = Static416.method4066(local894);
								@Pc(906) Class213 local906 = null;
								try {
									@Pc(912) Class136 local912 = Static138.aClass194_2.method4405(false, "3");
									while (local912.anInt3418 == 0) {
										Static167.method6157(1L);
									}
									if (local912.anInt3418 == 1) {
										local906 = (Class213) local912.anObject10;
										@Pc(942) int local942 = local887.length() + local904.length() + 2 + 3 + 4;
										if (local942 > 50) {
											throw new RuntimeException(">50");
										}
										@Pc(959) Class2_Sub17 local959 = new Class2_Sub17(local942 + 1);
										local959.method6172(local942);
										local959.method6172(0);
										local959.method6147(local887);
										local959.method6147(local904);
										local959.method6144();
										local906.method4947(local959.anInt7523, local959.aByteArray94, 0);
									}
								} catch (@Pc(989) Exception local989) {
								}
								try {
									if (local906 != null) {
										local906.method4946();
									}
								} catch (@Pc(996) Exception local996) {
								}
							}
						}
						Static249.aClass39_2.method753(Static183.aBoolean205);
						Static413.aClass271_2.method6196(Static183.aBoolean205);
						Static227.aClass54_2.method1131(Static183.aBoolean205);
					} else if (Static339.aClass66_2.method1390(Static298.anInt5370)) {
						Static339.aClass66_2.method1394(0, local757.aByteArray94, Static298.anInt5370);
						local757.anInt7523 = 0;
						Static81.anInt1300 = local757.method6138();
						Static211.anInt3616 = local757.method6138();
						Static3.aBoolean3 = local757.method6138() == 1;
						Static203.aBoolean230 = local757.method6138() == 1;
						Static166.aBoolean184 = local757.method6138() == 1;
						Static362.anInt6420 = local757.method6148();
						Static354.aBoolean431 = Static362.anInt6420 > 0;
						Static188.anInt6691 = local757.method6148();
						Static204.anInt3499 = local757.method6148();
						Static41.anInt661 = local757.method6148();
						Static366.anInt6445 = local757.method6129();
						Static81.aClass136_1 = Static138.aClass194_2.method4401(Static366.anInt6445);
						Static163.anInt2920 = local757.method6138();
						Static184.anInt3243 = local757.method6148();
						Static130.anInt2195 = local757.method6148();
						Static65.aBoolean64 = local757.method6138() == 1;
						Static127.aClass11_Sub5_Sub2_Sub1_2.aString20 = Static127.aClass11_Sub5_Sub2_Sub1_2.aString19 = local757.method6156();
						Static44.aClass263_2 = new Class263();
						Static44.aClass263_2.anInt7387 = local757.method6148();
						if (Static44.aClass263_2.anInt7387 == 65535) {
							Static44.aClass263_2.anInt7387 = -1;
						}
						Static44.aClass263_2.aString71 = local757.method6156();
						if (Static112.aClass129_4 != Static429.aClass129_8) {
							Static44.aClass263_2.anInt7390 = Static44.aClass263_2.anInt7387 + 50000;
							Static44.aClass263_2.anInt7388 = Static44.aClass263_2.anInt7387 + 40000;
						}
						if (Static222.aClass129_6 != Static429.aClass129_8 && (Static163.aClass263_3.method5932(Static457.aClass263_5) || Static163.aClass263_3.method5932(Static287.aClass263_4))) {
							Static163.aClass263_3 = Static44.aClass263_2;
						}
					} else {
						return;
					}
					if (Static3.aBoolean3 && !Static166.aBoolean184 || Static354.aBoolean431) {
						try {
							Static471.method4356(Static138.aClass194_2.anApplet1, "zap");
						} catch (@Pc(1192) Throwable local1192) {
							if (Static388.aBoolean455) {
								try {
									Static138.aClass194_2.anApplet1.getAppletContext().showDocument(new URL(Static138.aClass194_2.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1208) Exception local1208) {
								}
							}
						}
					} else {
						try {
							Static471.method4356(Static138.aClass194_2.anApplet1, "unzap");
						} catch (@Pc(1218) Throwable local1218) {
						}
					}
					if (Static112.aClass129_4 == Static429.aClass129_8) {
						try {
							Static471.method4356(Static138.aClass194_2.anApplet1, "loggedin");
						} catch (@Pc(1230) Throwable local1230) {
						}
					}
					if (Static25.anInt7276 != 2 && Static25.anInt7276 != 3) {
						Static129.anInt2192 = 0;
						Static108.method1796(2);
						Static182.method2626();
						Static274.method3920(6);
						Static117.aClass25_55 = null;
						return;
					}
					Static129.anInt2192 = 12;
				}
				if (Static129.anInt2192 == 12) {
					if (!Static339.aClass66_2.method1390(3)) {
						return;
					}
					Static339.aClass66_2.method1394(0, Static202.aClass2_Sub17_Sub1_1.aByteArray94, 3);
					Static129.anInt2192 = 13;
				}
				if (Static129.anInt2192 == 13) {
					local757 = Static202.aClass2_Sub17_Sub1_1;
					local757.anInt7523 = 0;
					if (local757.method5586()) {
						if (!Static339.aClass66_2.method1390(1)) {
							return;
						}
						Static339.aClass66_2.method1394(3, local757.aByteArray94, 1);
					}
					Static117.aClass25_55 = Static451.method5756()[local757.method5578()];
					Static302.anInt5465 = local757.method6148();
					Static129.anInt2192 = 11;
				}
				if (Static129.anInt2192 == 11) {
					if (Static339.aClass66_2.method1390(Static302.anInt5465)) {
						Static339.aClass66_2.method1394(0, Static202.aClass2_Sub17_Sub1_1.aByteArray94, Static302.anInt5465);
						Static202.aClass2_Sub17_Sub1_1.anInt7523 = 0;
						Static129.anInt2192 = 0;
						local194 = Static302.anInt5465;
						Static108.method1796(2);
						Static347.method4906();
						Static47.method732(Static202.aClass2_Sub17_Sub1_1);
						Static269.anInt2101 = -1;
						Static152.method2296();
						if (local194 != Static202.aClass2_Sub17_Sub1_1.anInt7523) {
							throw new RuntimeException("lswp pos:" + Static202.aClass2_Sub17_Sub1_1.anInt7523 + " psize:" + local194);
						}
						Static117.aClass25_55 = null;
					}
				} else if (Static129.anInt2192 == 15) {
					if (Static302.anInt5465 == -2) {
						if (!Static339.aClass66_2.method1390(2)) {
							return;
						}
						Static339.aClass66_2.method1394(0, Static202.aClass2_Sub17_Sub1_1.aByteArray94, 2);
						Static202.aClass2_Sub17_Sub1_1.anInt7523 = 0;
						Static302.anInt5465 = Static202.aClass2_Sub17_Sub1_1.method6148();
					}
					if (Static339.aClass66_2.method1390(Static302.anInt5465)) {
						Static339.aClass66_2.method1394(0, Static202.aClass2_Sub17_Sub1_1.aByteArray94, Static302.anInt5465);
						Static202.aClass2_Sub17_Sub1_1.anInt7523 = 0;
						Static129.anInt2192 = 0;
						local194 = Static302.anInt5465;
						Static108.method1796(15);
						Static158.method2343();
						Static47.method732(Static202.aClass2_Sub17_Sub1_1);
						if (local194 != Static202.aClass2_Sub17_Sub1_1.anInt7523) {
							throw new RuntimeException("lswpr pos:" + Static202.aClass2_Sub17_Sub1_1.anInt7523 + " psize:" + local194);
						}
						Static117.aClass25_55 = null;
					}
				}
			} else if (Static339.aClass66_2.method1390(1)) {
				Static339.aClass66_2.method1394(0, Static202.aClass2_Sub17_Sub1_1.aByteArray94, 1);
				Static298.anInt5370 = Static202.aClass2_Sub17_Sub1_1.aByteArray94[0] & 0xFF;
				Static129.anInt2192 = 10;
			}
		} catch (@Pc(1471) IOException local1471) {
			if (Static339.aClass66_2 != null) {
				Static339.aClass66_2.method1388();
				Static339.aClass66_2 = null;
			}
			if (Static220.anInt3723 >= 1) {
				Static129.anInt2192 = 0;
				Static108.method1796(-4);
				Static234.method3190();
			} else {
				Static129.anInt2192 = 1;
				Static220.anInt3723++;
				if (Static25.anInt7276 == 2 || Static25.anInt7276 == 3) {
					Static163.aClass263_3.aBoolean500 = !Static163.aClass263_3.aBoolean500;
				} else {
					Static15.aClass263_1.aBoolean500 = !Static15.aClass263_1.aBoolean500;
				}
				Static457.anInt7605 = 0;
			}
		}
	}
}
