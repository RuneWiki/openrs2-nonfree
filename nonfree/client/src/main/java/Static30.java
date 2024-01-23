import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
	public static int anInt648;

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "Lclient!bn;")
	public static Class2_Sub8_Sub1 aClass2_Sub8_Sub1_4;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString28 = "Loading interfaces - ";

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIII)V")
	public static void method570(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class2_Sub8_Sub10 local14 = Static92.method1633(9, arg1);
		local14.method2052();
		local14.anInt2698 = arg0;
		local14.anInt2702 = arg2;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IBII)I")
	public static int method572(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg0 <= arg1 ? (arg1 > arg2 ? arg2 : arg1) : arg0;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIZZI)V")
	public static void method574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		Static80.anInt1910++;
		if (Static22.aClass15_Sub2_Sub2_1 != null && Static22.aClass15_Sub2_Sub2_1.anInt5358 - (Static22.aClass15_Sub2_Sub2_1.method4286() - 1) * 64 >> 7 == Static302.anInt5847 && Static22.aClass15_Sub2_Sub2_1.anInt5371 + 64 - Static22.aClass15_Sub2_Sub2_1.method4286() * 64 >> 7 == Static269.anInt5272) {
			Static302.anInt5847 = 0;
			Static34.aBoolean52 = false;
		}
		Static195.method4725();
		if (!arg3) {
			Static261.method4100();
		}
		Static105.method779();
		if (Static116.aBoolean184) {
			Static131.method2422(arg4, arg0, arg1, arg2, true);
			arg4 = Static198.anInt4179;
			arg0 = Static229.anInt4617;
			arg1 = Static159.anInt3554;
			arg2 = Static15.anInt310;
		}
		Static97.anInt2316 = arg1;
		Static97.anInt2314 = arg2;
		@Pc(107) int local107;
		@Pc(104) int local104;
		if (Static16.anInt342 == 1) {
			local107 = (int) Static148.aFloat33;
			if (Static269.anInt5284 / 256 > local107) {
				local107 = Static269.anInt5284 / 256;
			}
			if (Static103.aBooleanArray8[4] && local107 < Static197.anIntArray409[4] + 128) {
				local107 = Static197.anIntArray409[4] + 128;
			}
			local104 = (int) Static239.aFloat51 + Static2.anInt62 & 0x7FF;
			Static9.method2433(local107 * 3 + 600, Static254.anInt4978, Static101.anInt2397, local107, arg0, Static234.method3798(Static22.aClass15_Sub2_Sub2_1.anInt5371, Static22.aClass15_Sub2_Sub2_1.anInt5358, Static32.anInt876) - 50, local104);
		} else if (Static16.anInt342 == 4) {
			local104 = (int) Static239.aFloat51 & 0x7FF;
			local107 = (int) Static148.aFloat33;
			if (local107 < Static269.anInt5284 / 256) {
				local107 = Static269.anInt5284 / 256;
			}
			if (Static103.aBooleanArray8[4] && local107 < Static197.anIntArray409[4] + 128) {
				local107 = Static197.anIntArray409[4] + 128;
			}
			Static9.method2433(local107 * 3 + 600, Static254.anInt4978, Static101.anInt2397, local107, arg0, Static234.method3798(Static279.anInt5490, Static75.anInt1869, Static32.anInt876) - 50, local104);
		} else if (Static16.anInt342 == 5) {
			Static271.method4304(arg0);
		}
		@Pc(219) int local219 = Static151.anInt3328;
		@Pc(221) int local221 = Static295.anInt5738;
		local107 = Static80.anInt1911;
		local104 = Static162.anInt3612;
		@Pc(227) int local227 = Static192.anInt4017;
		@Pc(229) int local229;
		@Pc(273) int local273;
		for (local229 = 0; local229 < 5; local229++) {
			if (Static103.aBooleanArray8[local229]) {
				local273 = (int) (Math.random() * (double) (Static64.anIntArray133[local229] * 2 + 1) - (double) Static64.anIntArray133[local229] + Math.sin((double) Static280.anIntArray527[local229] / 100.0D * (double) Static66.anIntArray135[local229]) * (double) Static197.anIntArray409[local229]);
				if (local229 == 1) {
					Static162.anInt3612 += local273;
				}
				if (local229 == 0) {
					Static80.anInt1911 += local273;
				}
				if (local229 == 3) {
					Static151.anInt3328 = Static151.anInt3328 + local273 & 0x7FF;
				}
				if (local229 == 2) {
					Static192.anInt4017 += local273;
				}
				if (local229 == 4) {
					Static295.anInt5738 += local273;
					if (Static295.anInt5738 < 128) {
						Static295.anInt5738 = 128;
					}
					if (Static295.anInt5738 > 383) {
						Static295.anInt5738 = 383;
					}
				}
			}
		}
		Static211.method3513();
		@Pc(431) int local431;
		if (Static116.aBoolean184) {
			Static111.method1895(arg2, arg1, arg2 + arg4, arg1 + arg0);
			@Pc(394) float local394 = (float) Static295.anInt5738 * 0.17578125F;
			@Pc(401) float local401 = (float) Static151.anInt3328 * 0.17578125F;
			if (Static16.anInt342 == 3) {
				local394 = Static58.aFloat4 * 360.0F / 6.2831855F;
				local401 = Static89.aFloat9 * 360.0F / 6.2831855F;
			}
			if (Static64.anInt1561 == 10) {
				local431 = Static25.method490(Static192.anInt4017 >> 10, Static178.anInt5291, Static80.anInt1911 >> 10, Static247.anInt1733);
			} else {
				local431 = Static25.method490(Static22.aClass15_Sub2_Sub2_1.anIntArray518[0] >> 3, Static178.anInt5291, Static22.aClass15_Sub2_Sub2_1.anIntArray516[0] >> 3, Static247.anInt1733);
			}
			if (Static100.anInt2372 >= 0) {
				Static116.method1979();
				@Pc(461) Class181 local461 = Static2.method71(Static278.anInt5486, Static118.anInt2627, Static100.anInt2372, Static200.anInt4186);
				local461.method4482(Static130.anInt2985, arg2, arg1, arg4, arg0, Static295.anInt5738, Static151.anInt3328, local431);
			} else {
				Static116.method1961(local431);
			}
			Static116.method1968(arg2, arg1, arg4, arg0, arg4 / 2 + arg2, arg0 / 2 + arg1, local394, local401, Static166.anInt3674, Static166.anInt3674);
			Static35.method826(false);
			Static116.method1953();
			Static116.method1963(true);
			Static116.method1954(true);
		} else {
			Static77.method1444(arg2, arg1, arg4 + arg2, arg1 - -arg0);
			Static1.method17();
			if (Static100.anInt2372 >= 0) {
				@Pc(360) Class181 local360 = Static2.method71(Static278.anInt5486, Static118.anInt2627, Static100.anInt2372, Static200.anInt4186);
				local360.method4481(Static130.anInt2985, arg2, arg1, arg4, arg0, Static295.anInt5738, Static151.anInt3328);
			} else {
				Static77.method1447(arg2, arg1, arg4, arg0, 0);
			}
		}
		if (Static196.aBoolean281 || Static169.anInt3744 < arg2 || Static169.anInt3744 >= arg2 + arg4 || Static75.anInt1867 < arg1 || arg1 + arg0 <= Static75.anInt1867) {
			Static179.aBoolean264 = false;
			Static121.anInt2669 = 0;
			Static200.aBoolean283 = true;
		} else {
			Static179.aBoolean264 = true;
			Static121.anInt2669 = 0;
			Static200.aBoolean283 = true;
			local273 = Static185.anInt5539;
			local431 = Static185.anInt5543;
			local229 = Static246.anInt4876;
			Static242.anInt4826 = (Static169.anInt3744 - arg2) * (-local229 + local273) / arg4 + local229;
			@Pc(560) int local560 = Static263.anInt5196;
			Static259.anInt5138 = local431 + (local560 - local431) * (-arg1 + Static75.anInt1867) / arg0;
		}
		Static220.method3662();
		@Pc(587) byte local587 = Static293.method4501() == 2 ? (byte) Static80.anInt1910 : 1;
		if (Static116.aBoolean184) {
			Static212.method3541(Static268.anInt5236, !Static154.aBoolean236);
			Static140.method2488(Static80.anInt1911, Static192.anInt4017, Static295.anInt5738, Static162.anInt3612, Static151.anInt3328);
			Static116.anInt2602 = Static268.anInt5236;
			Static64.method1185(Static80.anInt1911, Static162.anInt3612, Static192.anInt4017, Static295.anInt5738, Static151.anInt3328, Static242.aByteArrayArrayArray19, Static9.anIntArray301, Static173.anIntArray374, Static108.anIntArray215, Static154.anIntArray350, Static232.anIntArray459, Static32.anInt876 + 1, local587, Static22.aClass15_Sub2_Sub2_1.anInt5358 >> 7, Static22.aClass15_Sub2_Sub2_1.anInt5371 >> 7);
			Static257.aBoolean334 = true;
			Static212.method3547();
			Static140.method2488(0, 0, 0, 0, 0);
			Static220.method3662();
			Static164.method2991(Static166.anInt3674, arg4, Static166.anInt3674, arg0, arg1, arg2);
			Static115.method4708(Static166.anInt3674, arg1, arg2, Static166.anInt3674, arg0, arg4);
			Static299.method4521();
		} else {
			Static64.method1185(Static80.anInt1911, Static162.anInt3612, Static192.anInt4017, Static295.anInt5738, Static151.anInt3328, Static242.aByteArrayArrayArray19, Static9.anIntArray301, Static173.anIntArray374, Static108.anIntArray215, Static154.anIntArray350, Static232.anIntArray459, Static32.anInt876 + 1, local587, Static22.aClass15_Sub2_Sub2_1.anInt5358 >> 7, Static22.aClass15_Sub2_Sub2_1.anInt5371 >> 7);
			Static220.method3662();
			Static299.method4521();
			Static164.method2991(256, arg4, 256, arg0, arg1, arg2);
			Static115.method4708(256, arg1, arg2, 256, arg0, arg4);
		}
		((Class104_Sub1) Static1.anInterface3_1).method4152(Static247.anInt1733);
		Static39.method736(arg4, arg2, arg1, arg0);
		Static80.anInt1911 = local107;
		Static151.anInt3328 = local219;
		Static192.anInt4017 = local227;
		Static295.anInt5738 = local221;
		Static162.anInt3612 = local104;
		if (Static115.aBoolean397 && Static217.aClass21_3.method559() == 0) {
			Static115.aBoolean397 = false;
		}
		if (Static115.aBoolean397) {
			if (Static116.aBoolean184) {
				Static111.method1888(arg2, arg1, arg4, arg0, 0);
			} else {
				Static77.method1447(arg2, arg1, arg4, arg0, 0);
			}
			Static63.method1183(Static269.aString179, false);
		}
		if (!arg3 && !Static115.aBoolean397 && !Static196.aBoolean281 && arg2 <= Static169.anInt3744 && Static169.anInt3744 < arg2 + arg4 && Static75.anInt1867 >= arg1 && Static75.anInt1867 < arg0 + arg1) {
			Static290.method4493(Static75.anInt1867, arg1, arg0, Static169.anInt3744, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)V")
	public static void method576(@OriginalArg(1) int arg0) {
		if (Static43.anInt1121 == arg0) {
			@Pc(16) Interface5 local16 = Static18.anInterface5Array1[arg0];
			local16.method4039(Static88.anInt2123);
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
	public static void method577() {
		@Pc(3) int local3 = Static237.anInt4772;
		@Pc(9) int local9 = Static14.anInt276;
		@Pc(22) int local22 = Static32.anInt875 - Static60.anInt1510 - local3;
		@Pc(30) int local30 = Static237.anInt4775 - Static120.anInt2649 - local9;
		if (local3 <= 0 && local22 <= 0 && local9 <= 0 && local30 <= 0) {
			return;
		}
		try {
			@Pc(49) Container local49;
			if (Static127.aFrame2 != null) {
				local49 = Static127.aFrame2;
			} else if (Static72.aFrame1 == null) {
				local49 = Static164.aClass102_2.anApplet1;
			} else {
				local49 = Static72.aFrame1;
			}
			@Pc(63) int local63 = 0;
			@Pc(65) int local65 = 0;
			if (local49 == Static72.aFrame1) {
				@Pc(71) Insets local71 = Static72.aFrame1.getInsets();
				local65 = local71.top;
				local63 = local71.left;
			}
			@Pc(80) Graphics local80 = local49.getGraphics();
			local80.setColor(Color.black);
			if (local3 > 0) {
				local80.fillRect(local63, local65, local3, Static237.anInt4775);
			}
			if (local9 > 0) {
				local80.fillRect(local63, local65, Static32.anInt875, local9);
			}
			if (local22 > 0) {
				local80.fillRect(Static32.anInt875 + local63 - local22, local65, local22, Static237.anInt4775);
			}
			if (local30 > 0) {
				local80.fillRect(local63, Static237.anInt4775 + local65 - local30, Static32.anInt875, local30);
			}
		} catch (@Pc(138) Exception local138) {
		}
	}
}
