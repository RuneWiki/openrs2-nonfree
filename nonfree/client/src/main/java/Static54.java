import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
	public static int anInt1294;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
	public static int anInt1288 = -1;

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
	public static int anInt1292 = 0;

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "[I")
	public static final int[] anIntArray81 = new int[25];

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!m;Lclient!qa;I)V")
	public static void method1101(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Class75 arg1) {
		if (Static210.aClass3_Sub3_Sub5_3 == null) {
			return;
		}
		if (Static281.anInt5171 < 10) {
			if (!Static210.aClass56_96.method1374(Static210.aClass3_Sub3_Sub5_3.aString10)) {
				Static281.anInt5171 = Static384.aClass56_77.method1393(Static210.aClass3_Sub3_Sub5_3.aString10) / 10;
				return;
			}
			Static9.method238();
			Static281.anInt5171 = 10;
		}
		if (Static281.anInt5171 == 10) {
			Static210.anInt7505 = Static210.aClass3_Sub3_Sub5_3.anInt1186 >> 6 << 6;
			Static210.anInt7496 = Static210.aClass3_Sub3_Sub5_3.anInt1181 >> 6 << 6;
			Static210.anInt7495 = (Static210.aClass3_Sub3_Sub5_3.anInt1178 >> 6 << 6) + 64 - Static210.anInt7505;
			Static210.anInt7501 = (Static210.aClass3_Sub3_Sub5_3.anInt1183 >> 6 << 6) + 64 - Static210.anInt7496;
			@Pc(75) int[] local75 = new int[3];
			@Pc(77) int local77 = -1;
			@Pc(79) int local79 = -1;
			if (Static210.aClass3_Sub3_Sub5_3.method1025((Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6053 >> 7) + Static108.anInt3458, Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77, local75, (Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6055 >> 7) + Static339.anInt6223)) {
				local79 = local75[2] - Static210.anInt7496;
				local77 = local75[1] - Static210.anInt7505;
			}
			if (!Static85.aBoolean525 && local77 >= 0 && local77 < Static210.anInt7495 && local79 >= 0 && local79 < Static210.anInt7501) {
				local79 += (int) (Math.random() * 10.0D) - 5;
				local77 += (int) (Math.random() * 10.0D) - 5;
				Static372.anInt1537 = local79;
				Static189.anInt3807 = local77;
			} else if (Static454.anInt7691 == -1 || Static321.anInt5863 == -1) {
				Static210.aClass3_Sub3_Sub5_3.method1027(Static210.aClass3_Sub3_Sub5_3.anInt1185 >> 14 & 0x3FFF, local75, Static210.aClass3_Sub3_Sub5_3.anInt1185 & 0x3FFF);
				Static189.anInt3807 = local75[1] - Static210.anInt7505;
				Static372.anInt1537 = local75[2] - Static210.anInt7496;
			} else {
				Static210.aClass3_Sub3_Sub5_3.method1027(Static454.anInt7691, local75, Static321.anInt5863);
				Static85.aBoolean525 = false;
				Static321.anInt5863 = -1;
				Static454.anInt7691 = -1;
				if (local75 != null) {
					Static372.anInt1537 = local75[2] - Static210.anInt7496;
					Static189.anInt3807 = local75[1] - Static210.anInt7505;
				}
			}
			if (Static210.aClass3_Sub3_Sub5_3.anInt1184 == 37) {
				Static210.aFloat97 = 3.0F;
				Static210.aFloat98 = 3.0F;
			} else if (Static210.aClass3_Sub3_Sub5_3.anInt1184 == 50) {
				Static210.aFloat97 = 4.0F;
				Static210.aFloat98 = 4.0F;
			} else if (Static210.aClass3_Sub3_Sub5_3.anInt1184 == 75) {
				Static210.aFloat97 = 6.0F;
				Static210.aFloat98 = 6.0F;
			} else if (Static210.aClass3_Sub3_Sub5_3.anInt1184 == 100) {
				Static210.aFloat97 = 8.0F;
				Static210.aFloat98 = 8.0F;
			} else if (Static210.aClass3_Sub3_Sub5_3.anInt1184 == 200) {
				Static210.aFloat97 = 16.0F;
				Static210.aFloat98 = 16.0F;
			} else {
				Static210.aFloat97 = 8.0F;
				Static210.aFloat98 = 8.0F;
			}
			Static210.anInt7493 = (int) Static210.aFloat97 >> 1;
			Static210.aByteArrayArrayArray17 = Static275.method4094(Static210.anInt7493);
			Static220.method3501();
			Static210.method5888();
			Static316.aClass229_35 = new Class229();
			Static210.anInt7492 += (int) (Math.random() * 5.0D) - 2;
			if (Static210.anInt7492 < -8) {
				Static210.anInt7492 = -8;
			}
			Static210.anInt7491 += (int) (Math.random() * 5.0D) - 2;
			if (Static210.anInt7492 > 8) {
				Static210.anInt7492 = 8;
			}
			if (Static210.anInt7491 < -16) {
				Static210.anInt7491 = -16;
			}
			if (Static210.anInt7491 > 16) {
				Static210.anInt7491 = 16;
			}
			Static210.method5882(arg0, Static210.anInt7492 >> 2 << 10, Static210.anInt7491 >> 1);
			Static210.aClass61_4.method1422(256, 1024);
			Static210.aClass123_4.method3177(256, 256);
			Static210.aClass25_4.method856(4096);
			Static35.aClass227_2.method5295(256);
			Static281.anInt5171 = 20;
		} else if (Static281.anInt5171 == 20) {
			Static108.method2814(true);
			Static210.method5869(arg1, Static210.anInt7492, Static210.anInt7491);
			Static281.anInt5171 = 60;
			Static108.method2814(true);
			Static227.method4681();
		} else if (Static281.anInt5171 == 60) {
			if (Static210.aClass56_96.method1364(Static210.aClass3_Sub3_Sub5_3.aString10 + "_staticelements")) {
				if (!Static210.aClass56_96.method1374(Static210.aClass3_Sub3_Sub5_3.aString10 + "_staticelements")) {
					return;
				}
				Static210.aClass226_3 = Static122.method2161(Static210.aClass3_Sub3_Sub5_3.aString10 + "_staticelements", Static139.aBoolean249, Static210.aClass56_96);
			} else {
				Static210.aClass226_3 = new Class226(0);
			}
			Static210.method5887();
			Static281.anInt5171 = 70;
			Static108.method2814(true);
			Static227.method4681();
		} else if (Static281.anInt5171 == 70) {
			Static140.aClass244_6 = new Class244(arg1, 11, true, Static351.aCanvas6);
			Static281.anInt5171 = 73;
			Static108.method2814(true);
			Static227.method4681();
		} else if (Static281.anInt5171 == 73) {
			Static20.aClass244_3 = new Class244(arg1, 12, true, Static351.aCanvas6);
			Static281.anInt5171 = 76;
			Static108.method2814(true);
			Static227.method4681();
		} else if (Static281.anInt5171 == 76) {
			Static265.aClass244_12 = new Class244(arg1, 14, true, Static351.aCanvas6);
			Static281.anInt5171 = 79;
			Static108.method2814(true);
			Static227.method4681();
		} else if (Static281.anInt5171 == 79) {
			Static353.aClass244_15 = new Class244(arg1, 17, true, Static351.aCanvas6);
			Static281.anInt5171 = 82;
			Static108.method2814(true);
			Static227.method4681();
		} else if (Static281.anInt5171 == 82) {
			Static255.aClass244_9 = new Class244(arg1, 19, true, Static351.aCanvas6);
			Static281.anInt5171 = 85;
			Static108.method2814(true);
			Static227.method4681();
		} else if (Static281.anInt5171 == 85) {
			Static451.aClass244_16 = new Class244(arg1, 22, true, Static351.aCanvas6);
			Static281.anInt5171 = 88;
			Static108.method2814(true);
			Static227.method4681();
		} else if (Static281.anInt5171 == 88) {
			Static286.aClass244_14 = new Class244(arg1, 26, true, Static351.aCanvas6);
			Static281.anInt5171 = 91;
			Static108.method2814(true);
			Static227.method4681();
		} else {
			Static192.aClass244_7 = new Class244(arg1, 30, true, Static351.aCanvas6);
			Static281.anInt5171 = 100;
			Static108.method2814(true);
			Static227.method4681();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IB)Z")
	public static boolean method1102(@OriginalArg(0) int arg0) {
		if (arg0 == 15 || arg0 == 51 || arg0 == 9 || arg0 == 17 || arg0 == 47) {
			return true;
		} else {
			return arg0 == 16 || arg0 == 1012;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IJ)V")
	public static void method1103(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(8) InterruptedException local8) {
		}
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(IB)V")
	public static void method1104(@OriginalArg(0) int arg0) {
		Static411.anInt7104 = -1;
		Static27.anInt771 = 100;
		Static166.anInt3528 = arg0;
		Static284.anInt5213 = 3;
	}
}
