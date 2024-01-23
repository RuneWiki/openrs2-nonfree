import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!ed", name = "u", descriptor = "[[I")
	public static int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
	public static int anInt1509;

	@OriginalMember(owner = "client!ed", name = "z", descriptor = "[[I")
	public static int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "Lclient!im;")
	public static Class1_Sub16 aClass1_Sub16_4 = new Class1_Sub16(new byte[5000]);

	@OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
	public static int anInt1510 = 0;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIBZZ)V")
	public static void method1135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		if (arg4) {
			Static296.method4809();
		}
		if (Static158.aFrame2 != null && (arg1 != 3 || Static180.anInt4075 != arg0 || arg3 != Static275.anInt5914)) {
			Static13.method289(Static158.aFrame2, Static43.aClass66_1);
			Static158.aFrame2 = null;
		}
		if (arg1 == 3 && Static158.aFrame2 == null) {
			Static158.aFrame2 = Static270.method4536(Static43.aClass66_1, arg0, 0, arg3);
			if (Static158.aFrame2 != null) {
				Static275.anInt5914 = arg3;
				Static180.anInt4075 = arg0;
				Static251.method4273(Static43.aClass66_1);
			}
		}
		if (arg1 == 3 && Static158.aFrame2 == null) {
			method1135(-1, Static272.anInt5852, arg2, -1, true, true);
			return;
		}
		@Pc(75) Container local75;
		if (Static158.aFrame2 != null) {
			local75 = Static158.aFrame2;
		} else if (Static48.aFrame1 == null) {
			local75 = Static43.aClass66_1.anApplet1;
		} else {
			local75 = Static48.aFrame1;
		}
		Static105.anInt6113 = local75.getSize().width;
		Static80.anInt1912 = local75.getSize().height;
		@Pc(98) Insets local98;
		if (local75 == Static48.aFrame1) {
			local98 = Static48.aFrame1.getInsets();
			Static105.anInt6113 -= local98.right + local98.left;
			Static80.anInt1912 -= local98.bottom + local98.top;
		}
		if (arg1 < 2) {
			Static144.anInt3368 = 503;
			Static186.anInt4165 = 0;
			Static54.anInt1439 = (Static105.anInt6113 - 765) / 2;
			Static193.anInt4370 = 765;
		} else {
			Static144.anInt3368 = Static80.anInt1912;
			Static54.anInt1439 = 0;
			Static186.anInt4165 = 0;
			Static193.anInt4370 = Static105.anInt6113;
		}
		if (arg5) {
			Static46.method4787(Static9.aCanvas1);
			Static34.method724(Static9.aCanvas1);
			if (Static70.aClass37_1 != null) {
				Static70.aClass37_1.method4785(Static9.aCanvas1);
			}
			Static26.aClient1.method838();
			Static268.method4508(Static9.aCanvas1);
			Static68.method1298(Static9.aCanvas1);
			if (Static70.aClass37_1 != null) {
				Static70.aClass37_1.method4784(Static9.aCanvas1);
			}
		} else {
			if (Static296.aBoolean335) {
				Static296.method4828(Static193.anInt4370, Static144.anInt3368);
			}
			Static9.aCanvas1.setSize(Static193.anInt4370, Static144.anInt3368);
			if (Static48.aFrame1 == local75) {
				local98 = Static48.aFrame1.getInsets();
				Static9.aCanvas1.setLocation(local98.left + Static54.anInt1439, Static186.anInt4165 + local98.top);
			} else {
				Static9.aCanvas1.setLocation(Static54.anInt1439, Static186.anInt4165);
			}
		}
		if (arg1 == 0 && arg2 > 0) {
			Static296.method4834(Static9.aCanvas1);
		}
		if (arg4 && arg1 > 0) {
			Static9.aCanvas1.setIgnoreRepaint(true);
			if (!Static291.aBoolean325) {
				Static55.method1119();
				Static1.aClass5_1 = null;
				Static1.aClass5_1 = Static177.method3221(Static9.aCanvas1, Static193.anInt4370, Static144.anInt3368);
				Static203.method3602();
				if (Static279.anInt5968 == 5) {
					Static210.method3710(true, Static156.aClass1_Sub2_Sub16_3);
				} else {
					Static242.method4171(false, Static19.aString12);
				}
				try {
					@Pc(259) Graphics local259 = Static9.aCanvas1.getGraphics();
					Static1.aClass5_1.method1713(local259);
				} catch (@Pc(267) Exception local267) {
				}
				Static275.method4583();
				if (arg2 == 0) {
					Static1.aClass5_1 = Static177.method3221(Static9.aCanvas1, 765, 503);
				} else {
					Static1.aClass5_1 = null;
				}
				@Pc(288) Class43 local288 = Static43.aClass66_1.method1607(Static26.aClient1.getClass());
				while (local288.anInt1456 == 0) {
					Static230.method4022(100L);
				}
				if (local288.anInt1456 == 1) {
					Static291.aBoolean325 = true;
				}
			}
			if (Static291.aBoolean325) {
				Static296.method4803(Static9.aCanvas1, Static171.anInt3870 * 2);
			}
		}
		if (!Static296.aBoolean335 && arg1 > 0) {
			method1135(-1, 0, arg2, -1, true, true);
			return;
		}
		if (arg1 > 0 && arg2 == 0) {
			Static125.aThread2.setPriority(5);
			Static1.aClass5_1 = null;
			Static195.method3500();
			((Class2_Sub1) Static151.anInterface2_1).method4430(200);
			if (Static10.aBoolean12) {
				Static151.method2846(0.7F);
			}
			if (Static112.aClass59ArrayArray1 == null) {
				Static112.aClass59ArrayArray1 = new Class59[13][13];
			}
			Static67.method1283();
			Static124.method2115();
			Static244.method4192();
		} else if (arg1 == 0 && arg2 > 0) {
			Static125.aThread2.setPriority(1);
			Static1.aClass5_1 = Static177.method3221(Static9.aCanvas1, 765, 503);
			Static195.method3502();
			Static155.method2877();
			((Class2_Sub1) Static151.anInterface2_1).method4430(20);
			if (Static10.aBoolean12) {
				if (Static20.anInt5576 == 1) {
					Static151.method2846(0.9F);
				}
				if (Static20.anInt5576 == 2) {
					Static151.method2846(0.8F);
				}
				if (Static20.anInt5576 == 3) {
					Static151.method2846(0.7F);
				}
				if (Static20.anInt5576 == 4) {
					Static151.method2846(0.6F);
				}
			}
			Static137.method2360();
			Static244.method4192();
		}
		Static272.aBoolean310 = !Static40.method1450();
		if (arg4) {
			Static194.method3446();
		}
		if (arg1 >= 2) {
			Static148.aBoolean175 = true;
		} else {
			Static148.aBoolean175 = false;
		}
		if (Static194.anInt4389 != -1) {
			Static87.method1517(true);
		}
		if (Static22.aClass41_1 != null && (Static279.anInt5968 == 30 || Static279.anInt5968 == 25)) {
			Static156.method2883();
		}
		for (@Pc(473) int local473 = 0; local473 < 100; local473++) {
			Static165.aBooleanArray16[local473] = true;
		}
		Static52.aBoolean83 = true;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBILclient!kb;)Lclient!n;")
	public static Class1_Sub2_Sub14_Sub1 method1137(@OriginalArg(2) int arg0, @OriginalArg(3) Class83 arg1) {
		return Static19.method387(arg0, 0, arg1) ? Static183.method3315() : null;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIBII)V")
	public static void method1138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class1_Sub2_Sub6 local12 = Static104.method831(arg3, 8);
		local12.method1192();
		local12.anInt1565 = arg1;
		local12.anInt1558 = arg2;
		local12.anInt1557 = arg0;
	}
}
