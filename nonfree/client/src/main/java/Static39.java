import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "I")
	public static int anInt780;

	@OriginalMember(owner = "client!bfa", name = "e", descriptor = "Lclient!wu;")
	public static Class380 aClass380_14;

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(III)I")
	public static int method623(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) byte local10;
		if (arg1 > 20000) {
			local10 = 4;
			Static558.method7640();
		} else if (arg1 > 10000) {
			Static206.method2918();
			local10 = 3;
		} else if (arg1 <= 5000) {
			local10 = 1;
			Static55.method858();
		} else {
			Static418.method5593();
			local10 = 2;
		}
		if (arg0 != Static234.aClass2_Sub5_48.aClass6_Sub21_2.method7280()) {
			Static234.aClass2_Sub5_48.method176(arg0, Static234.aClass2_Sub5_48.aClass6_Sub21_1);
			Static317.method4257(false, arg0);
		}
		Static329.method4407();
		return local10;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lclient!ha;Lclient!d;I)V")
	public static void method625(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Interface6 arg1) {
		if (Static193.aClass2_Sub2_Sub9_3 == null) {
			return;
		}
		if (Static619.anInt9953 < 10) {
			if (!Static193.aClass380_27.method8641(Static193.aClass2_Sub2_Sub9_3.aString27)) {
				Static619.anInt9953 = Static416.aClass380_99.method8606(Static193.aClass2_Sub2_Sub9_3.aString27) / 10;
				return;
			}
			Static426.method5677();
			Static619.anInt9953 = 10;
		}
		if (Static619.anInt9953 == 10) {
			Static193.anInt1551 = Static193.aClass2_Sub2_Sub9_3.anInt2899 >> 6 << 6;
			Static193.anInt1548 = Static193.aClass2_Sub2_Sub9_3.anInt2897 >> 6 << 6;
			Static193.anInt1550 = (Static193.aClass2_Sub2_Sub9_3.anInt2903 >> 6 << 6) + 64 - Static193.anInt1551;
			Static193.anInt1544 = (Static193.aClass2_Sub2_Sub9_3.anInt2892 >> 6 << 6) + 64 - Static193.anInt1548;
			@Pc(78) int[] local78 = new int[3];
			@Pc(80) int local80 = -1;
			@Pc(82) int local82 = -1;
			if (Static193.aClass2_Sub2_Sub9_3.method2428(local78, Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127, (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10090 >> 9) + Static132.anInt2246, Static123.anInt2176 + (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10089 >> 9))) {
				local80 = local78[1] - Static193.anInt1548;
				local82 = local78[2] - Static193.anInt1551;
			}
			if (!Static350.aBoolean400 && local80 >= 0 && local80 < Static193.anInt1544 && local82 >= 0 && local82 < Static193.anInt1550) {
				local82 += (int) (Math.random() * 10.0D) - 5;
				local80 += (int) (Math.random() * 10.0D) - 5;
				Static40.anInt794 = local80;
				Static347.anInt5452 = local82;
			} else if (Static514.anInt8566 == -1 || Static528.anInt8671 == -1) {
				Static193.aClass2_Sub2_Sub9_3.method2426(local78, Static193.aClass2_Sub2_Sub9_3.anInt2895 & 0x3FFF, Static193.aClass2_Sub2_Sub9_3.anInt2895 >> 14 & 0x3FFF);
				Static347.anInt5452 = local78[2] - Static193.anInt1551;
				Static40.anInt794 = local78[1] - Static193.anInt1548;
			} else {
				Static193.aClass2_Sub2_Sub9_3.method2426(local78, Static528.anInt8671, Static514.anInt8566);
				Static528.anInt8671 = -1;
				Static514.anInt8566 = -1;
				Static350.aBoolean400 = false;
				if (local78 != null) {
					Static40.anInt794 = local78[1] - Static193.anInt1548;
					Static347.anInt5452 = local78[2] - Static193.anInt1551;
				}
			}
			if (Static193.aClass2_Sub2_Sub9_3.anInt2900 == 37) {
				Static193.aFloat15 = 3.0F;
				Static193.aFloat16 = 3.0F;
			} else if (Static193.aClass2_Sub2_Sub9_3.anInt2900 == 50) {
				Static193.aFloat15 = 4.0F;
				Static193.aFloat16 = 4.0F;
			} else if (Static193.aClass2_Sub2_Sub9_3.anInt2900 == 75) {
				Static193.aFloat15 = 6.0F;
				Static193.aFloat16 = 6.0F;
			} else if (Static193.aClass2_Sub2_Sub9_3.anInt2900 == 100) {
				Static193.aFloat15 = 8.0F;
				Static193.aFloat16 = 8.0F;
			} else if (Static193.aClass2_Sub2_Sub9_3.anInt2900 == 200) {
				Static193.aFloat15 = 16.0F;
				Static193.aFloat16 = 16.0F;
			} else {
				Static193.aFloat15 = 8.0F;
				Static193.aFloat16 = 8.0F;
			}
			Static193.anInt1541 = (int) Static193.aFloat15 >> 1;
			Static193.aByteArrayArrayArray3 = Static562.method7704(Static193.anInt1541);
			Static61.method909();
			Static193.method1303();
			Static372.aClass109_37 = new Class109();
			Static193.anInt1540 += (int) (Math.random() * 5.0D) - 2;
			if (Static193.anInt1540 < -8) {
				Static193.anInt1540 = -8;
			}
			Static193.anInt1542 += (int) (Math.random() * 5.0D) - 2;
			if (Static193.anInt1540 > 8) {
				Static193.anInt1540 = 8;
			}
			if (Static193.anInt1542 < -16) {
				Static193.anInt1542 = -16;
			}
			if (Static193.anInt1542 > 16) {
				Static193.anInt1542 = 16;
			}
			Static193.method1285(arg1, Static193.anInt1540 >> 2 << 10, Static193.anInt1542 >> 1);
			Static193.aClass197_2.method4165(1024, 256);
			Static193.aClass207_2.method4283(256, 256);
			Static193.aClass141_2.method2970(4096);
			Static89.aClass330_3.method7450(256);
			Static619.anInt9953 = 20;
		} else if (Static619.anInt9953 == 20) {
			Static206.method2919(true);
			Static193.method1291(arg0, Static193.anInt1540, Static193.anInt1542);
			Static619.anInt9953 = 60;
			Static206.method2919(true);
			Static266.method3743();
		} else if (Static619.anInt9953 == 60) {
			if (Static193.aClass380_27.method8608(Static193.aClass2_Sub2_Sub9_3.aString27 + "_staticelements")) {
				if (!Static193.aClass380_27.method8641(Static193.aClass2_Sub2_Sub9_3.aString27 + "_staticelements")) {
					return;
				}
				Static193.aClass84_2 = Static15.method226(Static193.aClass2_Sub2_Sub9_3.aString27 + "_staticelements", Static193.aClass380_27, Static570.aBoolean690);
			} else {
				Static193.aClass84_2 = new Class84(0);
			}
			Static193.method1287();
			Static619.anInt9953 = 70;
			Static206.method2919(true);
			Static266.method3743();
		} else if (Static619.anInt9953 == 70) {
			Static349.aClass55_5 = new Class55(arg0, 11, true, Static504.aCanvas11);
			Static619.anInt9953 = 73;
			Static206.method2919(true);
			Static266.method3743();
		} else if (Static619.anInt9953 == 73) {
			Static468.aClass55_7 = new Class55(arg0, 12, true, Static504.aCanvas11);
			Static619.anInt9953 = 76;
			Static206.method2919(true);
			Static266.method3743();
		} else if (Static619.anInt9953 == 76) {
			Static493.aClass55_8 = new Class55(arg0, 14, true, Static504.aCanvas11);
			Static619.anInt9953 = 79;
			Static206.method2919(true);
			Static266.method3743();
		} else if (Static619.anInt9953 == 79) {
			Static442.aClass55_6 = new Class55(arg0, 17, true, Static504.aCanvas11);
			Static619.anInt9953 = 82;
			Static206.method2919(true);
			Static266.method3743();
		} else if (Static619.anInt9953 == 82) {
			Static301.aClass55_4 = new Class55(arg0, 19, true, Static504.aCanvas11);
			Static619.anInt9953 = 85;
			Static206.method2919(true);
			Static266.method3743();
		} else if (Static619.anInt9953 == 85) {
			Static293.aClass55_3 = new Class55(arg0, 22, true, Static504.aCanvas11);
			Static619.anInt9953 = 88;
			Static206.method2919(true);
			Static266.method3743();
		} else if (Static619.anInt9953 == 88) {
			Static253.aClass55_2 = new Class55(arg0, 26, true, Static504.aCanvas11);
			Static619.anInt9953 = 91;
			Static206.method2919(true);
			Static266.method3743();
		} else {
			Static245.aClass55_1 = new Class55(arg0, 30, true, Static504.aCanvas11);
			Static619.anInt9953 = 100;
			Static206.method2919(true);
			Static266.method3743();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method626(@OriginalArg(1) String arg0) {
		Static377.aString78 = arg0;
		if (Static617.anApplet2 == null) {
			return;
		}
		try {
			@Pc(12) String local12 = Static617.anApplet2.getParameter("cookieprefix");
			@Pc(16) String local16 = Static617.anApplet2.getParameter("cookiehost");
			@Pc(38) String local38 = local12 + "settings=" + arg0 + "; version=1; path=/; domain=" + local16;
			if (arg0.length() == 0) {
				local38 = local38 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local38 = local38 + "; Expires=" + Static107.method1607(Static476.method6413() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static651.method4295("document.cookie=\"" + local38 + "\"", Static617.anApplet2);
		} catch (@Pc(89) Throwable local89) {
		}
	}
}
