import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!gk", name = "E", descriptor = "Lclient!vj;")
	public static Class31 aClass31_2;

	@OriginalMember(owner = "client!gk", name = "w", descriptor = "Lclient!vk;")
	public static final Class207 aClass207_13 = new Class207(16);

	@OriginalMember(owner = "client!gk", name = "A", descriptor = "I")
	public static int anInt1950 = 0;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 < 1 || arg6 < 1 || arg5 > Static43.anInt1151 - 2 || Static260.anInt5348 - 2 < arg6) {
			return;
		}
		if (!Static25.method408() && !Static217.method739(arg0, arg6, arg5, Static98.anInt1912)) {
			return;
		}
		if (Static347.aClass83ArrayArrayArray3 == null) {
			return;
		}
		@Pc(43) int local43 = arg0;
		if (arg0 < 3 && Static141.method2321(arg5, arg6)) {
			local43 = arg0 + 1;
		}
		Static123.method4487(arg5, arg0, Static313.aClass17Array1[arg0], arg6, Static217.aClass105_5, arg3, local43);
		if (arg4 >= 0) {
			@Pc(72) boolean local72 = Static341.aBoolean543;
			Static341.aBoolean543 = true;
			Static34.method595(arg4, arg7, false, arg6, false, arg5, local43, arg2, arg1, Static313.aClass17Array1[arg0], arg0, Static217.aClass105_5);
			Static341.aBoolean543 = local72;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIIIZIII)Z")
	public static boolean method1601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(24) int local24 = Static162.method2854(Static41.anIntArray62, arg9, arg3, arg7, arg6, Static127.aClass10_Sub1_Sub2_Sub2_1.method3402(), arg5, arg8, Static313.aClass17Array1[Static127.anInt2487], Static96.anIntArray154, arg0, arg2, arg1, arg4);
		if (local24 < 1) {
			return false;
		}
		Static307.anInt6146 = Static96.anIntArray154[local24 - 1];
		Static14.anInt229 = Static41.anIntArray62[local24 - 1];
		Static324.aBoolean528 = false;
		Static39.method793();
		return true;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIZI)V")
	public static void method1602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = Static4.anInt39 * arg0 >> 8;
		if (local14 != 0 && arg2 != -1) {
			Static193.method3426(arg2, local14, Static312.aClass134_138);
			Static92.aBoolean123 = true;
		}
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V")
	public static void method1604() {
		if (Static302.anInt6039 == 0 || Static302.anInt6039 == 5) {
			return;
		}
		try {
			if (++Static195.anInt6720 > 2000) {
				if (Static81.aClass202_3 != null) {
					Static81.aClass202_3.method5477();
					Static81.aClass202_3 = null;
				}
				if (Static125.anInt2448 >= 1) {
					Static302.anInt6039 = 0;
					Static6.anInt4143 = -5;
					return;
				}
				if (Static214.anInt4553 == Static29.anInt544) {
					Static29.anInt544 = Static149.anInt3069;
				} else {
					Static29.anInt544 = Static214.anInt4553;
				}
				Static302.anInt6039 = 1;
				Static125.anInt2448++;
				Static195.anInt6720 = 0;
			}
			if (Static302.anInt6039 == 1) {
				Static319.aClass193_5 = Static197.aClass215_5.method5673(Static29.anInt544, Static351.aString149);
				Static302.anInt6039 = 2;
			}
			if (Static302.anInt6039 == 2) {
				if (Static319.aClass193_5.anInt5986 == 2) {
					throw new IOException();
				}
				if (Static319.aClass193_5.anInt5986 != 1) {
					return;
				}
				Static81.aClass202_3 = new Class202((Socket) Static319.aClass193_5.anObject7, Static197.aClass215_5);
				Static319.aClass193_5 = null;
				@Pc(110) long local110 = Static307.aLong201 = Static195.method5823(Static226.aString218);
				@Pc(117) int local117 = (int) (local110 >> 16 & 0x1FL);
				Static305.aClass1_Sub21_Sub2_3.anInt6611 = 0;
				Static305.aClass1_Sub21_Sub2_3.method5718(14);
				Static305.aClass1_Sub21_Sub2_3.method5718(local117);
				Static81.aClass202_3.method5480(2, Static305.aClass1_Sub21_Sub2_3.aByteArray82);
				if (Static205.aClass125_1 != null) {
					Static205.aClass125_1.method5316();
				}
				if (Static310.aClass125_2 != null) {
					Static310.aClass125_2.method5316();
				}
				@Pc(149) int local149 = Static81.aClass202_3.method5478();
				if (Static205.aClass125_1 != null) {
					Static205.aClass125_1.method5316();
				}
				if (Static310.aClass125_2 != null) {
					Static310.aClass125_2.method5316();
				}
				if (local149 != 0) {
					Static302.anInt6039 = 0;
					Static6.anInt4143 = local149;
					Static81.aClass202_3.method5477();
					Static81.aClass202_3 = null;
					return;
				}
				Static302.anInt6039 = 3;
			}
			if (Static302.anInt6039 == 3) {
				if (Static81.aClass202_3.method5473() < 8) {
					return;
				}
				Static81.aClass202_3.method5476(0, Static142.aClass1_Sub21_Sub2_1.aByteArray82, 8);
				Static142.aClass1_Sub21_Sub2_1.anInt6611 = 0;
				Static291.aLong182 = Static142.aClass1_Sub21_Sub2_1.method5704();
				@Pc(199) int[] local199 = new int[] { 0, (int) (Math.random() * 9.9999999E7D), 0, (int) Static291.aLong182 };
				Static305.aClass1_Sub21_Sub2_3.anInt6611 = 0;
				local199[0] = (int) (Math.random() * 9.9999999E7D);
				local199[2] = (int) (Static291.aLong182 >> 32);
				Static305.aClass1_Sub21_Sub2_3.method5718(10);
				Static305.aClass1_Sub21_Sub2_3.method5702(local199[0]);
				Static305.aClass1_Sub21_Sub2_3.method5702(local199[1]);
				Static305.aClass1_Sub21_Sub2_3.method5702(local199[2]);
				Static305.aClass1_Sub21_Sub2_3.method5702(local199[3]);
				Static305.aClass1_Sub21_Sub2_3.method5744(Static195.method5823(Static226.aString218));
				Static305.aClass1_Sub21_Sub2_3.method5752(Static153.aString114);
				Static305.aClass1_Sub21_Sub2_3.method5703(Static82.aBigInteger1, Static296.aBigInteger2);
				Static274.aClass1_Sub21_Sub2_2.anInt6611 = 0;
				if (Static261.anInt5376 == 40) {
					Static274.aClass1_Sub21_Sub2_2.method5718(18);
				} else {
					Static274.aClass1_Sub21_Sub2_2.method5718(16);
				}
				Static274.aClass1_Sub21_Sub2_2.method5698(Static305.aClass1_Sub21_Sub2_3.anInt6611 + Static165.method2895(Static59.aString51) + 161);
				Static274.aClass1_Sub21_Sub2_2.method5702(561);
				Static274.aClass1_Sub21_Sub2_2.method5718(Static336.anInt6503);
				Static274.aClass1_Sub21_Sub2_2.method5718(Static151.method2632());
				Static274.aClass1_Sub21_Sub2_2.method5698(Static26.anInt476);
				Static274.aClass1_Sub21_Sub2_2.method5698(Static321.anInt6388);
				Static274.aClass1_Sub21_Sub2_2.method5718(Static231.anInt4828);
				Static238.method4341(Static274.aClass1_Sub21_Sub2_2);
				Static274.aClass1_Sub21_Sub2_2.method5752(Static59.aString51);
				Static274.aClass1_Sub21_Sub2_2.method5702(Static76.anInt1569);
				Static274.aClass1_Sub21_Sub2_2.method5702(Static245.method827());
				Static275.aBoolean465 = true;
				Static274.aClass1_Sub21_Sub2_2.method5698(Static248.anInt27);
				Static274.aClass1_Sub21_Sub2_2.method5702(Static315.aClass134_139.method3028());
				Static274.aClass1_Sub21_Sub2_2.method5702(Static10.aClass134_7.method3028());
				Static274.aClass1_Sub21_Sub2_2.method5702(Static137.aClass134_128.method3028());
				Static274.aClass1_Sub21_Sub2_2.method5702(Static317.aClass134_140.method3028());
				Static274.aClass1_Sub21_Sub2_2.method5702(Static330.aClass134_144.method3028());
				Static274.aClass1_Sub21_Sub2_2.method5702(Static29.aClass134_12.method3028());
				Static274.aClass1_Sub21_Sub2_2.method5702(Static88.aClass134_38.method3028());
				Static274.aClass1_Sub21_Sub2_2.method5702(Static200.aClass134_97.method3028());
				Static274.aClass1_Sub21_Sub2_2.method5702(Static125.aClass134_55.method3028());
				Static274.aClass1_Sub21_Sub2_2.method5702(Static129.aClass134_60.method3028());
				Static274.aClass1_Sub21_Sub2_2.method5702(Static344.aClass134_146.method3028());
				Static274.aClass1_Sub21_Sub2_2.method5702(Static312.aClass134_138.method3028());
				Static274.aClass1_Sub21_Sub2_2.method5702(Static189.aClass134_135.method3028());
				Static274.aClass1_Sub21_Sub2_2.method5702(Static77.aClass134_33.method3028());
				Static274.aClass1_Sub21_Sub2_2.method5702(Static192.aClass134_92.method3028());
				Static274.aClass1_Sub21_Sub2_2.method5702(Static210.aClass134_102.method3028());
				Static274.aClass1_Sub21_Sub2_2.method5702(Static94.aClass134_41.method3028());
				Static274.aClass1_Sub21_Sub2_2.method5702(Static184.aClass134_87.method3028());
				Static274.aClass1_Sub21_Sub2_2.method5702(Class10_Sub1_Sub4.lb.method3028());
				Static274.aClass1_Sub21_Sub2_2.method5702(Static37.aClass134_18.method3028());
				Static274.aClass1_Sub21_Sub2_2.method5702(Static233.aClass134_111.method3028());
				Static274.aClass1_Sub21_Sub2_2.method5702(Static55.aClass134_29.method3028());
				Static274.aClass1_Sub21_Sub2_2.method5702(Static132.aClass134_153.method3028());
				Static274.aClass1_Sub21_Sub2_2.method5702(Static282.aClass134_79.method3028());
				Static274.aClass1_Sub21_Sub2_2.method5702(Static264.aClass134_123.method3028());
				Static274.aClass1_Sub21_Sub2_2.method5702(Static350.aClass134_101.method3028());
				Static274.aClass1_Sub21_Sub2_2.method5702(Static218.aClass134_104.method3028());
				Static274.aClass1_Sub21_Sub2_2.method5702(Static152.aClass134_71.method3028());
				Static274.aClass1_Sub21_Sub2_2.method5702(Static89.aClass134_39.method3028());
				Static274.aClass1_Sub21_Sub2_2.method5729(Static305.aClass1_Sub21_Sub2_3.anInt6611, Static305.aClass1_Sub21_Sub2_3.aByteArray82);
				Static81.aClass202_3.method5480(Static274.aClass1_Sub21_Sub2_2.anInt6611, Static274.aClass1_Sub21_Sub2_2.aByteArray82);
				Static305.aClass1_Sub21_Sub2_3.method5764(local199);
				for (@Pc(543) int local543 = 0; local543 < 4; local543++) {
					local199[local543] += 50;
				}
				Static142.aClass1_Sub21_Sub2_1.method5764(local199);
				Static302.anInt6039 = 4;
			}
			if (Static302.anInt6039 == 4) {
				if (Static81.aClass202_3.method5473() < 1) {
					return;
				}
				@Pc(579) int local579 = Static81.aClass202_3.method5478();
				if (local579 == 21) {
					Static302.anInt6039 = 7;
				} else if (local579 == 29) {
					Static302.anInt6039 = 10;
				} else if (local579 == 1) {
					Static6.anInt4143 = local579;
					Static302.anInt6039 = 5;
					return;
				} else if (local579 == 2) {
					Static302.anInt6039 = 8;
				} else if (local579 == 15) {
					Static6.anInt4143 = local579;
					Static302.anInt6039 = 0;
					return;
				} else if (local579 == 23 && Static125.anInt2448 < 1) {
					Static195.anInt6720 = 0;
					Static125.anInt2448++;
					Static302.anInt6039 = 1;
					Static81.aClass202_3.method5477();
					Static81.aClass202_3 = null;
					return;
				} else {
					Static6.anInt4143 = local579;
					Static302.anInt6039 = 0;
					Static81.aClass202_3.method5477();
					Static81.aClass202_3 = null;
					return;
				}
			}
			if (Static302.anInt6039 == 6) {
				Static305.aClass1_Sub21_Sub2_3.anInt6611 = 0;
				Static305.aClass1_Sub21_Sub2_3.method5757(17);
				Static81.aClass202_3.method5480(Static305.aClass1_Sub21_Sub2_3.anInt6611, Static305.aClass1_Sub21_Sub2_3.aByteArray82);
				Static302.anInt6039 = 4;
			} else if (Static302.anInt6039 == 7) {
				if (Static81.aClass202_3.method5473() >= 1) {
					Static311.anInt6189 = (Static81.aClass202_3.method5478() + 3) * 60;
					Static302.anInt6039 = 0;
					Static6.anInt4143 = 21;
					Static81.aClass202_3.method5477();
					Static81.aClass202_3 = null;
				}
			} else if (Static302.anInt6039 != 10) {
				if (Static302.anInt6039 == 8) {
					if (Static81.aClass202_3.method5473() < 14) {
						return;
					}
					Static81.aClass202_3.method5476(0, Static142.aClass1_Sub21_Sub2_1.aByteArray82, 14);
					Static142.aClass1_Sub21_Sub2_1.anInt6611 = 0;
					Static305.anInt6104 = Static142.aClass1_Sub21_Sub2_1.method5720();
					Static37.anInt1000 = Static142.aClass1_Sub21_Sub2_1.method5720();
					Static49.aBoolean438 = Static142.aClass1_Sub21_Sub2_1.method5720() == 1;
					Static152.aBoolean243 = Static142.aClass1_Sub21_Sub2_1.method5720() == 1;
					Static39.aBoolean56 = Static142.aClass1_Sub21_Sub2_1.method5720() == 1;
					Static339.aBoolean541 = Static142.aClass1_Sub21_Sub2_1.method5720() == 1;
					Static93.aBoolean126 = Static142.aClass1_Sub21_Sub2_1.method5720() == 1;
					Static301.anInt6030 = Static142.aClass1_Sub21_Sub2_1.method5715();
					Static318.aBoolean523 = Static142.aClass1_Sub21_Sub2_1.method5720() == 1;
					Static228.aBoolean379 = Static142.aClass1_Sub21_Sub2_1.method5720() == 1;
					Static54.method1087(Static228.aBoolean379);
					Static286.method5006(Static228.aBoolean379);
					Static170.method3027(Static228.aBoolean379);
					if (Static49.aBoolean438 && !Static39.aBoolean56 || Static318.aBoolean523) {
						try {
							Static367.method3947(Static197.aClass215_5.anApplet1, "zap");
						} catch (@Pc(860) Throwable local860) {
						}
					} else {
						try {
							Static367.method3947(Static197.aClass215_5.anApplet1, "unzap");
						} catch (@Pc(870) Throwable local870) {
						}
					}
					if (Static217.anInt951 == 0) {
						try {
							Static367.method3947(Static197.aClass215_5.anApplet1, "loggedin");
						} catch (@Pc(881) Throwable local881) {
						}
					}
					Static74.anInt1559 = Static142.aClass1_Sub21_Sub2_1.method5758();
					Static237.anInt4904 = Static142.aClass1_Sub21_Sub2_1.method5715();
					Static302.anInt6039 = 9;
				}
				if (Static302.anInt6039 == 9 && Static81.aClass202_3.method5473() >= Static237.anInt4904) {
					Static142.aClass1_Sub21_Sub2_1.anInt6611 = 0;
					Static81.aClass202_3.method5476(0, Static142.aClass1_Sub21_Sub2_1.aByteArray82, Static237.anInt4904);
					Static302.anInt6039 = 0;
					Static6.anInt4143 = 2;
					Static81.method1314();
					Static177.anInt3736 = -1;
					Static96.method1528(false);
					Static74.anInt1559 = -1;
				}
			} else if (Static81.aClass202_3.method5473() >= 1) {
				Static93.anInt1768 = Static81.aClass202_3.method5478();
				Static302.anInt6039 = 0;
				Static6.anInt4143 = 29;
				Static81.aClass202_3.method5477();
				Static81.aClass202_3 = null;
			}
		} catch (@Pc(930) IOException local930) {
			if (Static81.aClass202_3 != null) {
				Static81.aClass202_3.method5477();
				Static81.aClass202_3 = null;
			}
			if (Static125.anInt2448 >= 1) {
				Static302.anInt6039 = 0;
				Static6.anInt4143 = -4;
			} else {
				if (Static29.anInt544 == Static214.anInt4553) {
					Static29.anInt544 = Static149.anInt3069;
				} else {
					Static29.anInt544 = Static214.anInt4553;
				}
				Static302.anInt6039 = 1;
				Static195.anInt6720 = 0;
				Static125.anInt2448++;
			}
		}
	}
}
