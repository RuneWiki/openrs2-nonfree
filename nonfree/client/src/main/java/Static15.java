import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!b", name = "c", descriptor = "Lclient!nk;")
	public static Class121 aClass121_12;

	@OriginalMember(owner = "client!b", name = "g", descriptor = "Lclient!pa;")
	public static Class1_Sub2_Sub1 aClass1_Sub2_Sub1_1;

	@OriginalMember(owner = "client!b", name = "l", descriptor = "I")
	public static int anInt235;

	@OriginalMember(owner = "client!b", name = "m", descriptor = "[[Lclient!wb;")
	public static Class1_Sub31[][] aClass1_Sub31ArrayArray1;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!gj;III)V")
	public static void method194(@OriginalArg(0) Class59 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static71.aClass59_17.method1703();
		if (Static285.aBoolean350) {
			return;
		}
		for (@Pc(22) Class1_Sub2_Sub12 local22 = (Class1_Sub2_Sub12) arg0.method1704(); local22 != null; local22 = (Class1_Sub2_Sub12) arg0.method1701()) {
			@Pc(29) Class175 local29 = Static210.method3349(local22.anInt3591);
			if (Static245.method3878(local29)) {
				Static140.method4447(arg1, local22, arg2, local29);
				if (local22.aBoolean244) {
					Static57.method1000(local29, local22);
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
	public static void method195() {
		if (Static197.anInt3809 == 0 || Static197.anInt3809 == 5) {
			return;
		}
		try {
			if (++Static46.anInt943 > 2000) {
				if (Static5.aClass97_1 != null) {
					Static5.aClass97_1.method2547();
					Static5.aClass97_1 = null;
				}
				if (Static219.anInt4059 >= 1) {
					Static201.anInt3864 = -5;
					Static197.anInt3809 = 0;
					return;
				}
				Static46.anInt943 = 0;
				if (Static141.anInt2839 == Static94.anInt3445) {
					Static94.anInt3445 = Static270.anInt4895;
				} else {
					Static94.anInt3445 = Static141.anInt2839;
				}
				Static219.anInt4059++;
				Static197.anInt3809 = 1;
			}
			if (Static197.anInt3809 == 1) {
				Static111.aClass185_3 = Static26.aClass154_1.method3892(Static77.aString93, Static94.anInt3445);
				Static197.anInt3809 = 2;
			}
			if (Static197.anInt3809 == 2) {
				if (Static111.aClass185_3.anInt5276 == 2) {
					throw new IOException();
				}
				if (Static111.aClass185_3.anInt5276 != 1) {
					return;
				}
				Static5.aClass97_1 = new Class97((Socket) Static111.aClass185_3.anObject6, Static26.aClass154_1);
				Static111.aClass185_3 = null;
				@Pc(106) long local106 = Static8.aLong11 = Static124.method4681(Static50.aString60);
				@Pc(113) int local113 = (int) (local106 >> 16 & 0x1FL);
				Static127.aClass1_Sub14_Sub1_3.anInt1480 = 0;
				Static127.aClass1_Sub14_Sub1_3.method1390(14);
				Static127.aClass1_Sub14_Sub1_3.method1390(local113);
				Static5.aClass97_1.method2552(2, Static127.aClass1_Sub14_Sub1_3.aByteArray17);
				if (Static300.aClass28_2 != null) {
					Static300.aClass28_2.method4777();
				}
				if (Static248.aClass28_1 != null) {
					Static248.aClass28_1.method4777();
				}
				@Pc(148) int local148 = Static5.aClass97_1.method2548();
				if (Static300.aClass28_2 != null) {
					Static300.aClass28_2.method4777();
				}
				if (Static248.aClass28_1 != null) {
					Static248.aClass28_1.method4777();
				}
				if (local148 != 0) {
					Static197.anInt3809 = 0;
					Static201.anInt3864 = local148;
					Static5.aClass97_1.method2547();
					Static5.aClass97_1 = null;
					return;
				}
				Static197.anInt3809 = 3;
			}
			if (Static197.anInt3809 == 3) {
				if (Static5.aClass97_1.method2551() < 8) {
					return;
				}
				Static5.aClass97_1.method2556(0, 8, Static13.aClass1_Sub14_Sub1_1.aByteArray17);
				Static13.aClass1_Sub14_Sub1_1.anInt1480 = 0;
				@Pc(205) int[] local205 = new int[4];
				Static141.aLong99 = Static13.aClass1_Sub14_Sub1_1.method1348();
				Static127.aClass1_Sub14_Sub1_3.anInt1480 = 0;
				local205[2] = (int) (Static141.aLong99 >> 32);
				local205[0] = (int) (Math.random() * 9.9999999E7D);
				local205[3] = (int) Static141.aLong99;
				local205[1] = (int) (Math.random() * 9.9999999E7D);
				Static127.aClass1_Sub14_Sub1_3.method1390(10);
				Static127.aClass1_Sub14_Sub1_3.method1387(local205[0]);
				Static127.aClass1_Sub14_Sub1_3.method1387(local205[1]);
				Static127.aClass1_Sub14_Sub1_3.method1387(local205[2]);
				Static127.aClass1_Sub14_Sub1_3.method1387(local205[3]);
				Static127.aClass1_Sub14_Sub1_3.method1374(Static124.method4681(Static50.aString60));
				Static127.aClass1_Sub14_Sub1_3.method1385(Static85.aString102);
				Static127.aClass1_Sub14_Sub1_3.method1399(Static207.aBigInteger2, Static85.aBigInteger1);
				Static63.aClass1_Sub14_Sub1_4.anInt1480 = 0;
				if (Static37.anInt773 == 40) {
					Static63.aClass1_Sub14_Sub1_4.method1390(18);
				} else {
					Static63.aClass1_Sub14_Sub1_4.method1390(16);
				}
				Static63.aClass1_Sub14_Sub1_4.method1338(Static127.aClass1_Sub14_Sub1_3.anInt1480 + Static84.method1587(Static37.aString43) + 163);
				Static63.aClass1_Sub14_Sub1_4.method1387(549);
				Static63.aClass1_Sub14_Sub1_4.method1390(Static228.anInt4197);
				Static63.aClass1_Sub14_Sub1_4.method1390(Static113.aBoolean138 ? 1 : 0);
				Static63.aClass1_Sub14_Sub1_4.method1390(1);
				Static63.aClass1_Sub14_Sub1_4.method1390(Static228.method3541());
				Static63.aClass1_Sub14_Sub1_4.method1338(Static292.anInt5236);
				Static63.aClass1_Sub14_Sub1_4.method1338(Static120.anInt2505);
				Static63.aClass1_Sub14_Sub1_4.method1390(Static111.anInt2296);
				Static4.method27(Static63.aClass1_Sub14_Sub1_4);
				Static63.aClass1_Sub14_Sub1_4.method1385(Static37.aString43);
				Static63.aClass1_Sub14_Sub1_4.method1387(Static71.anInt1519);
				Static63.aClass1_Sub14_Sub1_4.method1387(Static269.method2118());
				Static75.aBoolean88 = true;
				Static63.aClass1_Sub14_Sub1_4.method1338(Static57.anInt1083);
				Static63.aClass1_Sub14_Sub1_4.method1387(Static152.aClass121_23.method3124());
				Static63.aClass1_Sub14_Sub1_4.method1387(Static210.aClass121_91.method3124());
				Static63.aClass1_Sub14_Sub1_4.method1387(Static123.aClass121_57.method3124());
				Static63.aClass1_Sub14_Sub1_4.method1387(Static239.aClass121_103.method3124());
				Static63.aClass1_Sub14_Sub1_4.method1387(aClass121_12.method3124());
				Static63.aClass1_Sub14_Sub1_4.method1387(Static313.aClass121_73.method3124());
				Static63.aClass1_Sub14_Sub1_4.method1387(Static308.aClass121_135.method3124());
				Static63.aClass1_Sub14_Sub1_4.method1387(Static3.aClass121_1.method3124());
				Static63.aClass1_Sub14_Sub1_4.method1387(Static258.aClass121_114.method3124());
				Static63.aClass1_Sub14_Sub1_4.method1387(Static261.aClass121_116.method3124());
				Static63.aClass1_Sub14_Sub1_4.method1387(Static208.aClass121_89.method3124());
				Static63.aClass1_Sub14_Sub1_4.method1387(Static32.aClass121_68.method3124());
				Static63.aClass1_Sub14_Sub1_4.method1387(Static162.aClass121_77.method3124());
				Static63.aClass1_Sub14_Sub1_4.method1387(Static103.aClass121_52.method3124());
				Static63.aClass1_Sub14_Sub1_4.method1387(Static76.aClass121_42.method3124());
				Static63.aClass1_Sub14_Sub1_4.method1387(Static43.aClass121_31.method3124());
				Static63.aClass1_Sub14_Sub1_4.method1387(Static151.aClass121_71.method3124());
				Static63.aClass1_Sub14_Sub1_4.method1387(Static173.aClass121_82.method3124());
				Static63.aClass1_Sub14_Sub1_4.method1387(Static136.aClass121_66.method3124());
				Static63.aClass1_Sub14_Sub1_4.method1387(Static12.aClass121_10.method3124());
				Static63.aClass1_Sub14_Sub1_4.method1387(Static8.aClass121_5.method3124());
				Static63.aClass1_Sub14_Sub1_4.method1387(Static282.aClass121_125.method3124());
				Static63.aClass1_Sub14_Sub1_4.method1387(Static285.aClass121_127.method3124());
				Static63.aClass1_Sub14_Sub1_4.method1387(Static242.aClass121_104.method3124());
				Static63.aClass1_Sub14_Sub1_4.method1387(Static145.aClass121_70.method3124());
				Static63.aClass1_Sub14_Sub1_4.method1387(Static269.aClass121_56.method3124());
				Static63.aClass1_Sub14_Sub1_4.method1387(Static24.aClass121_13.method3124());
				Static63.aClass1_Sub14_Sub1_4.method1387(Static133.aClass121_65.method3124());
				Static63.aClass1_Sub14_Sub1_4.method1387(Static210.aClass121_92.method3124());
				Static63.aClass1_Sub14_Sub1_4.method1335(Static127.aClass1_Sub14_Sub1_3.anInt1480, Static127.aClass1_Sub14_Sub1_3.aByteArray17);
				Static5.aClass97_1.method2552(Static63.aClass1_Sub14_Sub1_4.anInt1480, Static63.aClass1_Sub14_Sub1_4.aByteArray17);
				Static127.aClass1_Sub14_Sub1_3.method1404(local205);
				for (@Pc(587) int local587 = 0; local587 < 4; local587++) {
					local205[local587] += 50;
				}
				Static13.aClass1_Sub14_Sub1_1.method1404(local205);
				Static197.anInt3809 = 4;
			}
			if (Static197.anInt3809 == 4) {
				if (Static5.aClass97_1.method2551() < 1) {
					return;
				}
				@Pc(622) int local622 = Static5.aClass97_1.method2548();
				if (local622 == 21) {
					Static197.anInt3809 = 7;
				} else if (local622 == 29) {
					Static197.anInt3809 = 10;
				} else if (local622 == 1) {
					Static197.anInt3809 = 5;
					Static201.anInt3864 = local622;
					return;
				} else if (local622 == 2) {
					Static197.anInt3809 = 8;
				} else if (local622 == 15) {
					Static201.anInt3864 = local622;
					Static197.anInt3809 = 0;
					return;
				} else if (local622 == 23 && Static219.anInt4059 < 1) {
					Static46.anInt943 = 0;
					Static197.anInt3809 = 1;
					Static219.anInt4059++;
					Static5.aClass97_1.method2547();
					Static5.aClass97_1 = null;
					return;
				} else {
					Static201.anInt3864 = local622;
					Static197.anInt3809 = 0;
					Static5.aClass97_1.method2547();
					Static5.aClass97_1 = null;
					return;
				}
			}
			if (Static197.anInt3809 == 6) {
				Static127.aClass1_Sub14_Sub1_3.anInt1480 = 0;
				Static127.aClass1_Sub14_Sub1_3.method1408(17);
				Static5.aClass97_1.method2552(Static127.aClass1_Sub14_Sub1_3.anInt1480, Static127.aClass1_Sub14_Sub1_3.aByteArray17);
				Static197.anInt3809 = 4;
				return;
			}
			if (Static197.anInt3809 == 7) {
				if (Static5.aClass97_1.method2551() < 1) {
					return;
				}
				Static308.anInt5497 = Static5.aClass97_1.method2548() * 60 + 180;
				Static197.anInt3809 = 0;
				Static201.anInt3864 = 21;
				Static5.aClass97_1.method2547();
				Static5.aClass97_1 = null;
				return;
			}
			if (Static197.anInt3809 == 10) {
				if (Static5.aClass97_1.method2551() < 1) {
					return;
				}
				Static287.anInt5142 = Static5.aClass97_1.method2548();
				Static201.anInt3864 = 29;
				Static197.anInt3809 = 0;
				Static5.aClass97_1.method2547();
				Static5.aClass97_1 = null;
				return;
			}
			if (Static197.anInt3809 == 8) {
				if (Static5.aClass97_1.method2551() < 14) {
					return;
				}
				Static5.aClass97_1.method2556(0, 14, Static13.aClass1_Sub14_Sub1_1.aByteArray17);
				Static13.aClass1_Sub14_Sub1_1.anInt1480 = 0;
				Static137.anInt2751 = Static13.aClass1_Sub14_Sub1_1.method1378();
				Static181.anInt3484 = Static13.aClass1_Sub14_Sub1_1.method1378();
				Static232.aBoolean293 = Static13.aClass1_Sub14_Sub1_1.method1378() == 1;
				Static180.aBoolean233 = Static13.aClass1_Sub14_Sub1_1.method1378() == 1;
				Static202.aBoolean262 = Static13.aClass1_Sub14_Sub1_1.method1378() == 1;
				Static272.aBoolean387 = Static13.aClass1_Sub14_Sub1_1.method1378() == 1;
				Static227.aBoolean287 = Static13.aClass1_Sub14_Sub1_1.method1378() == 1;
				Static35.anInt3966 = Static13.aClass1_Sub14_Sub1_1.method1386();
				Static72.aBoolean364 = Static13.aClass1_Sub14_Sub1_1.method1378() == 1;
				Static254.aBoolean315 = Static13.aClass1_Sub14_Sub1_1.method1378() == 1;
				Static290.method4439(Static254.aBoolean315);
				Static80.method1565(Static254.aBoolean315);
				Static140.method4450(Static254.aBoolean315);
				if (!Static113.aBoolean138) {
					if (Static232.aBoolean293 && !Static202.aBoolean262 || Static72.aBoolean364) {
						try {
							Static321.method2506("zap", Static26.aClass154_1.anApplet1);
						} catch (@Pc(913) Throwable local913) {
						}
					} else {
						try {
							Static321.method2506("unzap", Static26.aClass154_1.anApplet1);
						} catch (@Pc(923) Throwable local923) {
						}
					}
				}
				try {
					Static321.method2506("loggedin", Static26.aClass154_1.anApplet1);
				} catch (@Pc(931) Throwable local931) {
				}
				Static266.anInt4855 = Static13.aClass1_Sub14_Sub1_1.method1410();
				Static88.anInt1723 = Static13.aClass1_Sub14_Sub1_1.method1386();
				Static197.anInt3809 = 9;
			}
			if (Static197.anInt3809 == 9) {
				if (Static5.aClass97_1.method2551() >= Static88.anInt1723) {
					Static13.aClass1_Sub14_Sub1_1.anInt1480 = 0;
					Static5.aClass97_1.method2556(0, Static88.anInt1723, Static13.aClass1_Sub14_Sub1_1.aByteArray17);
					Static201.anInt3864 = 2;
					Static197.anInt3809 = 0;
					Static24.method380();
					Static129.anInt2589 = -1;
					Static5.method32(false);
					Static266.anInt4855 = -1;
					return;
				}
				return;
			}
		} catch (@Pc(979) IOException local979) {
			if (Static5.aClass97_1 != null) {
				Static5.aClass97_1.method2547();
				Static5.aClass97_1 = null;
			}
			if (Static219.anInt4059 < 1) {
				Static197.anInt3809 = 1;
				if (Static94.anInt3445 == Static141.anInt2839) {
					Static94.anInt3445 = Static270.anInt4895;
				} else {
					Static94.anInt3445 = Static141.anInt2839;
				}
				Static46.anInt943 = 0;
				Static219.anInt4059++;
			} else {
				Static201.anInt3864 = -4;
				Static197.anInt3809 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
	public static void method196() {
		if (Static285.aBoolean351) {
			return;
		}
		if (Static73.aBoolean87) {
			Static278.aFloat154 = (int) Static278.aFloat154 + 47 & 0xFFFFFFF0;
		} else {
			Static168.aFloat100 += (12.0F - Static168.aFloat100) / 2.0F;
		}
		Static114.aBoolean142 = true;
		Static285.aBoolean351 = true;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(B)V")
	public static void method198() {
		Static36.method641(false);
		System.gc();
		Static65.method1215(25);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!ne;IIIIII)V")
	public static void method199(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = 0L;
		if (arg5 == 0) {
			local7 = Static30.method495(arg3, arg1, arg2);
		} else if (arg5 == 1) {
			local7 = Static74.method1466(arg3, arg1, arg2);
		} else if (arg5 == 2) {
			local7 = Static86.method1602(arg3, arg1, arg2);
		} else if (arg5 == 3) {
			local7 = Static38.method3321(arg3, arg1, arg2);
		}
		@Pc(60) int local60 = Integer.MAX_VALUE & (int) (local7 >>> 32);
		@Pc(67) int local67 = (int) local7 >> 14 & 0x1F;
		@Pc(73) Class71 local73 = Static255.method4052(local60);
		if (local73.method2030()) {
			Static45.method889(arg3, local73, arg1, arg2);
		}
		@Pc(93) int local93 = (int) local7 >> 20 & 0x3;
		if (local7 == 0L) {
			return;
		}
		@Pc(100) Class15 local100 = null;
		@Pc(102) Class15 local102 = null;
		if (arg5 == 0) {
			@Pc(112) Class160 local112 = Static20.method354(arg3, arg1, arg2);
			if (local112 != null) {
				local100 = local112.aClass15_7;
				local102 = local112.aClass15_8;
			}
			if (local73.anInt2393 != 0) {
				arg0.method3042(local73.aBoolean152, !local73.aBoolean140, local93, arg2, local67, arg1);
			}
		} else if (arg5 == 1) {
			@Pc(154) Class52 local154 = Static11.method149(arg3, arg1, arg2);
			if (local154 != null) {
				local100 = local154.aClass15_2;
				local102 = local154.aClass15_3;
			}
		} else if (arg5 == 2) {
			@Pc(174) Class161 local174 = Static253.method3987(arg3, arg1, arg2);
			if (local174 != null) {
				local100 = local174.aClass15_9;
			}
			if (local73.anInt2393 != 0 && local73.anInt2377 + arg1 < 104 && local73.anInt2377 + arg2 < 104 && arg1 + local73.anInt2385 < 104 && local73.anInt2385 + arg2 < 104) {
				arg0.method3037(arg1, local73.aBoolean152, local93, local73.anInt2385, arg2, !local73.aBoolean140, local73.anInt2377);
			}
		} else if (arg5 == 3) {
			@Pc(249) Class36 local249 = Static242.method3802(arg3, arg1, arg2);
			if (local249 != null) {
				local100 = local249.aClass15_1;
			}
			if (local73.anInt2393 == 1) {
				arg0.method3045(arg1, arg2);
			}
		}
		if (local73.anIntArray209 != null) {
			local73 = local73.method2039();
		}
		if (!Static156.aBoolean211 || local73 == null || !local73.aBoolean149) {
			return;
		}
		if (local67 == 2) {
			if (local100 instanceof Class15_Sub3) {
				((Class15_Sub3) local100).method454();
			} else {
				Static217.method3414(local73, arg1, 0, 0, arg2, arg4, local93 + 4, local67);
			}
			if (local102 instanceof Class15_Sub3) {
				((Class15_Sub3) local102).method454();
			} else {
				Static217.method3414(local73, arg1, 0, 0, arg2, arg4, local93 + 1 & 0x3, local67);
			}
		} else if (local67 == 5) {
			if (local100 instanceof Class15_Sub3) {
				((Class15_Sub3) local100).method454();
			} else {
				Static217.method3414(local73, arg1, Static47.anIntArray58[local93] * 8, Static21.anIntArray20[local93] * 8, arg2, arg4, local93, 4);
			}
		} else if (local67 == 6) {
			if (local100 instanceof Class15_Sub3) {
				((Class15_Sub3) local100).method454();
			} else {
				Static217.method3414(local73, arg1, Static82.anIntArray142[local93] * 8, Static82.anIntArray143[local93] * 8, arg2, arg4, local93 + 4, 4);
			}
		} else if (local67 == 7) {
			if (local100 instanceof Class15_Sub3) {
				((Class15_Sub3) local100).method454();
			} else {
				Static217.method3414(local73, arg1, 0, 0, arg2, arg4, (local93 + 2 & 0x3) + 4, 4);
			}
		} else if (local67 == 8) {
			if (local100 instanceof Class15_Sub3) {
				((Class15_Sub3) local100).method454();
			} else {
				Static217.method3414(local73, arg1, Static82.anIntArray142[local93] * 8, Static82.anIntArray143[local93] * 8, arg2, arg4, local93 + 4, 4);
			}
			if (local102 instanceof Class15_Sub3) {
				((Class15_Sub3) local102).method454();
			} else {
				Static217.method3414(local73, arg1, Static82.anIntArray142[local93] * 8, Static82.anIntArray143[local93] * 8, arg2, arg4, (local93 + 2 & 0x3) + 4, 4);
			}
		} else if (local67 == 11) {
			if (local100 instanceof Class15_Sub3) {
				((Class15_Sub3) local100).method454();
			} else {
				Static217.method3414(local73, arg1, 0, 0, arg2, arg4, local93 + 4, 10);
			}
		} else if (local100 instanceof Class15_Sub3) {
			((Class15_Sub3) local100).method454();
		} else {
			Static217.method3414(local73, arg1, 0, 0, arg2, arg4, local93, local67);
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(I)I")
	public static int method200() {
		return 2;
	}
}
