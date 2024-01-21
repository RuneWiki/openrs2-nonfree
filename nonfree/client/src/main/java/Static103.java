import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
	public static int anInt3046;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "Lclient!ea;")
	public static Class18 aClass18_770 = Static8.method128("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "Lclient!ea;")
	public static Class18 aClass18_771 = Static8.method128("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!nc", name = "z", descriptor = "Lclient!ea;")
	public static Class18 aClass18_772 = Static8.method128("Benutzen");

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(Z)V")
	public static void method2145() {
		aClass18_771 = null;
		aClass18_772 = null;
		aClass18_770 = null;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(JI)V")
	public static void method2146(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(7) InterruptedException local7) {
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIII)V")
	public static void method2147(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static63.method2001(arg3, arg2, arg3 + arg1, arg2 - -arg0);
		Static79.method1767();
		Static152.anInt4188++;
		Static171.method3127(true);
		Static166.method3064(true);
		Static171.method3127(false);
		Static166.method3064(false);
		Static144.method2733();
		Static148.method2802();
		@Pc(49) int local49;
		@Pc(47) int local47;
		if (!Static122.aBoolean152) {
			local47 = Static167.anInt4529 + Static98.anInt3021 & 0x7FF;
			local49 = Static155.anInt4270;
			if (local49 < Static62.anInt1924 / 256) {
				local49 = Static62.anInt1924 / 256;
			}
			if (Static151.aBooleanArray14[4] && local49 < Static166.anIntArray411[4] + 128) {
				local49 = Static166.anIntArray411[4] + 128;
			}
			Static121.method2375(local49 * 3 + 600, anInt3046, Static129.anInt3681, Static34.method728(Static9.anInt295, Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3558, Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3579) - 50, local49, local47);
		}
		if (Static122.aBoolean152) {
			local49 = Static118.method2346();
		} else {
			local49 = Static88.method1920();
		}
		local47 = Static45.anInt1552;
		@Pc(115) int local115 = Static125.anInt3614;
		@Pc(117) int local117 = Static38.anInt1189;
		@Pc(119) int local119 = Static106.anInt3132;
		@Pc(121) int local121 = Static178.anInt4735;
		@Pc(164) int local164;
		for (@Pc(123) int local123 = 0; local123 < 5; local123++) {
			if (Static151.aBooleanArray14[local123]) {
				local164 = (int) (Math.random() * (double) (Static31.anIntArray69[local123] * 2 + 1) - (double) Static31.anIntArray69[local123] + Math.sin((double) Static123.anIntArray310[local123] * ((double) Static136.anIntArray355[local123] / 100.0D)) * (double) Static166.anIntArray411[local123]);
				if (local123 == 0) {
					Static45.anInt1552 += local164;
				}
				if (local123 == 4) {
					Static125.anInt3614 += local164;
					if (Static125.anInt3614 < 128) {
						Static125.anInt3614 = 128;
					}
					if (Static125.anInt3614 > 383) {
						Static125.anInt3614 = 383;
					}
				}
				if (local123 == 1) {
					Static178.anInt4735 += local164;
				}
				if (local123 == 3) {
					Static106.anInt3132 = Static106.anInt3132 + local164 & 0x7FF;
				}
				if (local123 == 2) {
					Static38.anInt1189 += local164;
				}
			}
		}
		@Pc(222) int local222 = Static9.anInt293;
		local164 = Static154.anInt4252;
		if (local164 >= arg3 && arg3 + arg1 > local164 && arg2 <= local222 && local222 < arg2 + arg0) {
			Static44.anInt1535 = 0;
			Static44.aBoolean57 = true;
			Static44.anInt1536 = Static9.anInt293 - arg2;
			Static44.anInt1538 = Static154.anInt4252 - arg3;
		} else {
			Static44.anInt1535 = 0;
			Static44.aBoolean57 = false;
		}
		Static147.method2775();
		Static63.method1990(arg3, arg2, arg1, arg0, 0);
		Static147.method2775();
		Static87.aClass68_1.method2626(Static45.anInt1552, Static178.anInt4735, Static38.anInt1189, Static125.anInt3614, Static106.anInt3132, local49);
		Static147.method2775();
		Static87.aClass68_1.method2642();
		Static43.method927(arg2, arg3, arg0, arg1);
		Static95.method2076(arg2, arg3);
		((Class82) Static79.anInterface3_1).method3060(Static180.anInt4776);
		Static41.method818(arg0, arg2, arg3, arg1);
		Static38.anInt1189 = local117;
		Static178.anInt4735 = local121;
		Static106.anInt3132 = local119;
		Static45.anInt1552 = local47;
		Static125.anInt3614 = local115;
		if (Static22.aBoolean20 && Static97.method2117() == 0) {
			Static22.aBoolean20 = false;
		}
		if (Static22.aBoolean20) {
			Static63.method1990(arg3, arg2, arg1, arg0, 0);
			Static161.method2992(Static173.aClass18_1214, false);
		}
		if (!Static22.aBoolean20 && !Static149.aBoolean185 && arg3 <= local164 && arg1 + arg3 > local164 && arg2 <= local222 && arg2 + arg0 > local222) {
			Static89.method1927(arg3, arg2, local164, local222);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!dd;Ljava/awt/Component;ILclient!dd;)V")
	public static void method2148(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) Class16 arg2) {
		if (Static161.aBoolean197) {
			return;
		}
		Static63.method1991();
		@Pc(15) byte[] local15 = arg2.method2249(Static118.aClass18_853, Static163.aClass18_1152);
		Static95.aClass1_Sub1_Sub8_Sub3_3 = new Class1_Sub1_Sub8_Sub3(local15, arg1);
		Static26.aClass1_Sub1_Sub8_Sub3_1 = Static95.aClass1_Sub1_Sub8_Sub3_3.method1654();
		Static118.aClass1_Sub1_Sub8_Sub1_5 = Static66.method1305(Static163.aClass18_1152, Static111.aClass18_819, arg0);
		Static95.aClass1_Sub1_Sub8_Sub1_3 = Static66.method1305(Static163.aClass18_1152, Static10.aClass18_111, arg0);
		Static101.aClass1_Sub1_Sub8_Sub1_4 = Static66.method1305(Static163.aClass18_1152, Static108.aClass18_813, arg0);
		Static163.aClass1_Sub1_Sub8_Sub1Array10 = Static101.method2130(arg0, Static163.aClass18_1152, Static73.aClass18_461);
		Static154.aClass1_Sub1_Sub8_Sub1Array9 = Static101.method2130(arg0, Static163.aClass18_1152, Static118.aClass18_854);
		Static145.anIntArray374 = new int[256];
		for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
			Static145.anIntArray374[local67] = local67 * 262144;
		}
		for (@Pc(83) int local83 = 0; local83 < 64; local83++) {
			Static145.anIntArray374[local83 + 64] = local83 * 1024 + 16711680;
		}
		for (@Pc(102) int local102 = 0; local102 < 64; local102++) {
			Static145.anIntArray374[local102 + 128] = local102 * 4 + 16776960;
		}
		for (@Pc(122) int local122 = 0; local122 < 64; local122++) {
			Static145.anIntArray374[local122 + 192] = 16777215;
		}
		Static46.anIntArray432 = new int[256];
		for (@Pc(141) int local141 = 0; local141 < 64; local141++) {
			Static46.anIntArray432[local141] = local141 * 1024;
		}
		for (@Pc(157) int local157 = 0; local157 < 64; local157++) {
			Static46.anIntArray432[local157 + 64] = local157 * 4 + 65280;
		}
		for (@Pc(175) int local175 = 0; local175 < 64; local175++) {
			Static46.anIntArray432[local175 + 128] = local175 * 262144 + 65535;
		}
		for (@Pc(194) int local194 = 0; local194 < 64; local194++) {
			Static46.anIntArray432[local194 + 192] = 16777215;
		}
		Static163.anIntArray405 = new int[256];
		for (@Pc(211) int local211 = 0; local211 < 64; local211++) {
			Static163.anIntArray405[local211] = local211 * 4;
		}
		for (@Pc(225) int local225 = 0; local225 < 64; local225++) {
			Static163.anIntArray405[local225 + 64] = local225 * 262144 + 255;
		}
		for (@Pc(245) int local245 = 0; local245 < 64; local245++) {
			Static163.anIntArray405[local245 + 128] = local245 * 1024 + 16711935;
		}
		for (@Pc(265) int local265 = 0; local265 < 64; local265++) {
			Static163.anIntArray405[local265 + 192] = 16777215;
		}
		Static61.anIntArray157 = new int[32768];
		Static54.anIntArray137 = new int[256];
		Static86.anIntArray232 = new int[32768];
		Static102.method2135(null);
		Static163.aClass18_1154 = Static163.aClass18_1152;
		Static124.aBoolean154 = false;
		if (Static94.anInt2923 == 0) {
			Static113.aBoolean194 = true;
		} else {
			Static113.aBoolean194 = false;
		}
		Static107.anIntArray277 = new int[32768];
		Static39.anInt1204 = 0;
		Static163.aClass18_1153 = Static163.aClass18_1152;
		Static74.anIntArray198 = new int[32768];
		if (Static113.aBoolean194) {
			Static69.method1447();
		} else {
			Static93.method2039(Static115.aClass16_Sub1_36, Static163.aClass18_1152, Static1.aClass18_48);
		}
		Static12.method3146(false);
		Static161.aBoolean197 = true;
		Static95.aClass1_Sub1_Sub8_Sub3_3.method1658(0, 0);
		Static26.aClass1_Sub1_Sub8_Sub3_1.method1658(382, 0);
		Static118.aClass1_Sub1_Sub8_Sub1_5.method919(382 - Static118.aClass1_Sub1_Sub8_Sub1_5.anInt1435 / 2, 18);
		Static119.aClass1_Sub1_Sub8_Sub3_4 = new Class1_Sub1_Sub8_Sub3(128, 254);
		Static135.aClass1_Sub1_Sub8_Sub3_6 = new Class1_Sub1_Sub8_Sub3(128, 254);
	}
}
