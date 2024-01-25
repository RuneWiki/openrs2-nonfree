import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!ol", name = "g", descriptor = "Lclient!da;")
	public static Class56 aClass56_14;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "Lclient!ps;")
	public static final Class291 aClass291_11 = new Class291();

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
	public static int anInt7550 = 0;

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "Z")
	public static boolean aBoolean593 = false;

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "[I")
	public static final int[] anIntArray513 = new int[32];

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "Z")
	public static boolean aBoolean594 = false;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method6560(@OriginalArg(1) String arg0) {
		Static264.aString40 = arg0;
		if (Static649.anApplet2 == null) {
			return;
		}
		try {
			@Pc(12) String local12 = Static649.anApplet2.getParameter("cookieprefix");
			@Pc(16) String local16 = Static649.anApplet2.getParameter("cookiehost");
			@Pc(31) String local31 = local12 + "settings=" + arg0 + "; version=1; path=/; domain=" + local16;
			if (arg0.length() == 0) {
				local31 = local31 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local31 = local31 + "; Expires=" + Static484.method6626(Static429.method5935() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static684.method6377(Static649.anApplet2, "document.cookie=\"" + local31 + "\"");
		} catch (@Pc(87) Throwable local87) {
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!ha;ILclient!d;)V")
	public static void method6561(@OriginalArg(0) Class33 arg0, @OriginalArg(2) Interface9 arg1) {
		if (Static154.aClass4_Sub5_Sub3_2 == null) {
			return;
		}
		if (Static532.anInt8252 < 10) {
			if (!Static154.aClass34_3.method1246(Static154.aClass4_Sub5_Sub3_2.aString9)) {
				Static532.anInt8252 = Static329.aClass34_71.method1237(Static154.aClass4_Sub5_Sub3_2.aString9) / 10;
				return;
			}
			Static591.method7781();
			Static532.anInt8252 = 10;
		}
		if (Static532.anInt8252 == 10) {
			Static154.anInt437 = Static154.aClass4_Sub5_Sub3_2.anInt872 >> 6 << 6;
			Static154.anInt439 = Static154.aClass4_Sub5_Sub3_2.anInt875 >> 6 << 6;
			Static154.anInt433 = (Static154.aClass4_Sub5_Sub3_2.anInt869 >> 6 << 6) + 64 - Static154.anInt437;
			Static154.anInt440 = (Static154.aClass4_Sub5_Sub3_2.anInt879 >> 6 << 6) + 64 - Static154.anInt439;
			@Pc(73) int[] local73 = new int[3];
			@Pc(75) int local75 = -1;
			@Pc(77) int local77 = -1;
			if (Static154.aClass4_Sub5_Sub3_2.method803(Static445.anInt6949 + (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9925 >> 9), (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9917 >> 9) + Static321.anInt5000, Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141, local73)) {
				local77 = local73[2] - Static154.anInt439;
				local75 = local73[1] - Static154.anInt437;
			}
			if (!Static430.aBoolean524 && local75 >= 0 && Static154.anInt433 > local75 && local77 >= 0 && local77 < Static154.anInt440) {
				local75 += (int) (Math.random() * 10.0D) - 5;
				local77 += (int) (Math.random() * 10.0D) - 5;
				Static379.anInt5638 = local77;
				Static253.anInt4127 = local75;
			} else if (Static50.anInt1094 == -1 || Static559.anInt8609 == -1) {
				Static154.aClass4_Sub5_Sub3_2.method807(Static154.aClass4_Sub5_Sub3_2.anInt867 >> 14 & 0x3FFF, Static154.aClass4_Sub5_Sub3_2.anInt867 & 0x3FFF, local73);
				Static379.anInt5638 = local73[2] - Static154.anInt439;
				Static253.anInt4127 = local73[1] - Static154.anInt437;
			} else {
				Static154.aClass4_Sub5_Sub3_2.method807(Static50.anInt1094, Static559.anInt8609, local73);
				if (local73 != null) {
					Static379.anInt5638 = local73[2] - Static154.anInt439;
					Static253.anInt4127 = local73[1] - Static154.anInt437;
				}
				Static559.anInt8609 = -1;
				Static50.anInt1094 = -1;
				Static430.aBoolean524 = false;
			}
			if (Static154.aClass4_Sub5_Sub3_2.anInt870 == 37) {
				Static154.aFloat9 = 3.0F;
				Static154.aFloat8 = 3.0F;
			} else if (Static154.aClass4_Sub5_Sub3_2.anInt870 == 50) {
				Static154.aFloat9 = 4.0F;
				Static154.aFloat8 = 4.0F;
			} else if (Static154.aClass4_Sub5_Sub3_2.anInt870 == 75) {
				Static154.aFloat9 = 6.0F;
				Static154.aFloat8 = 6.0F;
			} else if (Static154.aClass4_Sub5_Sub3_2.anInt870 == 100) {
				Static154.aFloat9 = 8.0F;
				Static154.aFloat8 = 8.0F;
			} else if (Static154.aClass4_Sub5_Sub3_2.anInt870 == 200) {
				Static154.aFloat9 = 16.0F;
				Static154.aFloat8 = 16.0F;
			} else {
				Static154.aFloat9 = 8.0F;
				Static154.aFloat8 = 8.0F;
			}
			Static154.anInt427 = (int) Static154.aFloat9 >> 1;
			Static154.aByteArrayArrayArray2 = Static14.method245(Static154.anInt427);
			Static258.method3733();
			Static154.method458();
			Static600.aClass163_64 = new Class163();
			Static154.anInt426 += (int) (Math.random() * 5.0D) - 2;
			if (Static154.anInt426 < -8) {
				Static154.anInt426 = -8;
			}
			if (Static154.anInt426 > 8) {
				Static154.anInt426 = 8;
			}
			Static154.anInt428 += (int) (Math.random() * 5.0D) - 2;
			if (Static154.anInt428 < -16) {
				Static154.anInt428 = -16;
			}
			if (Static154.anInt428 > 16) {
				Static154.anInt428 = 16;
			}
			Static154.method463(arg1, Static154.anInt426 >> 2 << 10, Static154.anInt428 >> 1);
			Static154.aClass59_2.method1797(1024, 256);
			Static154.aClass132_2.method2916(256, 256);
			Static154.aClass74_13.method2070(4096);
			Static110.aClass184_1.method4123(256);
			Static532.anInt8252 = 20;
		} else if (Static532.anInt8252 == 20) {
			Static395.method2780(true);
			Static154.method447(arg0, Static154.anInt426, Static154.anInt428);
			Static532.anInt8252 = 60;
			Static395.method2780(true);
			Static107.method2077();
		} else if (Static532.anInt8252 == 60) {
			if (Static154.aClass34_3.method1242(Static154.aClass4_Sub5_Sub3_2.aString9 + "_staticelements")) {
				if (!Static154.aClass34_3.method1246(Static154.aClass4_Sub5_Sub3_2.aString9 + "_staticelements")) {
					return;
				}
				Static154.aClass225_2 = Static285.method4106(Static154.aClass4_Sub5_Sub3_2.aString9 + "_staticelements", Static154.aClass34_3, Static307.aBoolean718);
			} else {
				Static154.aClass225_2 = new Class225(0);
			}
			Static154.method448();
			Static532.anInt8252 = 70;
			Static395.method2780(true);
			Static107.method2077();
		} else if (Static532.anInt8252 == 70) {
			Static384.aClass157_7 = new Class157(arg0, 11, true, Static17.aCanvas1);
			Static532.anInt8252 = 73;
			Static395.method2780(true);
			Static107.method2077();
		} else if (Static532.anInt8252 == 73) {
			Static510.aClass157_8 = new Class157(arg0, 12, true, Static17.aCanvas1);
			Static532.anInt8252 = 76;
			Static395.method2780(true);
			Static107.method2077();
		} else if (Static532.anInt8252 == 76) {
			Static37.aClass157_1 = new Class157(arg0, 14, true, Static17.aCanvas1);
			Static532.anInt8252 = 79;
			Static395.method2780(true);
			Static107.method2077();
		} else if (Static532.anInt8252 == 79) {
			Static299.aClass157_4 = new Class157(arg0, 17, true, Static17.aCanvas1);
			Static532.anInt8252 = 82;
			Static395.method2780(true);
			Static107.method2077();
		} else if (Static532.anInt8252 == 82) {
			Static355.aClass157_6 = new Class157(arg0, 19, true, Static17.aCanvas1);
			Static532.anInt8252 = 85;
			Static395.method2780(true);
			Static107.method2077();
		} else if (Static532.anInt8252 == 85) {
			Static312.aClass157_5 = new Class157(arg0, 22, true, Static17.aCanvas1);
			Static532.anInt8252 = 88;
			Static395.method2780(true);
			Static107.method2077();
		} else if (Static532.anInt8252 == 88) {
			Static66.aClass157_2 = new Class157(arg0, 26, true, Static17.aCanvas1);
			Static532.anInt8252 = 91;
			Static395.method2780(true);
			Static107.method2077();
		} else {
			Static150.aClass157_3 = new Class157(arg0, 30, true, Static17.aCanvas1);
			Static532.anInt8252 = 100;
			Static395.method2780(true);
			Static107.method2077();
			System.gc();
		}
	}
}
