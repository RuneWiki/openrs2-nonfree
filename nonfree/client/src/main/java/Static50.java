import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!fg", name = "T", descriptor = "Lclient!cd;")
	public static Class10 aClass10_558 = Static51.method932("scrollbar");

	@OriginalMember(owner = "client!fg", name = "W", descriptor = "Lclient!cd;")
	public static Class10 aClass10_559 = Static51.method932("<col=ffff00>");

	@OriginalMember(owner = "client!fg", name = "Y", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3 = new byte[4][104][104];

	@OriginalMember(owner = "client!fg", name = "cb", descriptor = "[I")
	public static int[] anIntArray140 = new int[] { 48, 46, 22, 41, 18, 10, 50, 6 };

	@OriginalMember(owner = "client!fg", name = "db", descriptor = "[I")
	public static int[] anIntArray141 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!va;I)V")
	public static void method926(@OriginalArg(0) Class2_Sub11 arg0) {
		if (Static19.aClass26_1 != null) {
			try {
				Static19.aClass26_1.method891(0L);
				Static19.aClass26_1.method895(arg0.anInt2077, arg0.aByteArray24, 24);
			} catch (@Pc(19) Exception local19) {
			}
		}
		arg0.anInt2077 += 24;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(JI)V")
	public static void method927(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static29.method616(arg0 - 1L);
			Static29.method616(1L);
		} else {
			Static29.method616(arg0);
		}
	}

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "(I)V")
	public static void method928() {
		anIntArray140 = null;
		aByteArrayArrayArray3 = null;
		aClass10_558 = null;
		aClass10_559 = null;
		anIntArray141 = null;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIII)V")
	public static void method929(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static172.method2023(arg1, arg0, arg1 + arg3, arg2 + arg0);
		Static125.method2032();
		Static115.anInt2612++;
		Static109.method1752(true);
		Static24.method376(true);
		Static109.method1752(false);
		Static24.method376(false);
		Static16.method262();
		Static24.method379();
		@Pc(43) int local43;
		@Pc(50) int local50;
		if (!Static161.aBoolean153) {
			local43 = Static12.anInt365;
			local50 = Static45.anInt1123 + Static66.anInt1599 & 0x7FF;
			if (Static54.anInt1352 / 256 > local43) {
				local43 = Static54.anInt1352 / 256;
			}
			if (Static178.aBooleanArray19[4] && Static60.anIntArray173[4] + 128 > local43) {
				local43 = Static60.anIntArray173[4] + 128;
			}
			Static119.method1922(Static178.method2702(Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3499, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3454, Static56.anInt1432) - 50, local43, local50, local43 * 3 + 600, Static63.anInt1562, Static67.anInt2918);
		}
		if (Static161.aBoolean153) {
			local43 = Static10.method170();
		} else {
			local43 = Static16.method263();
		}
		local50 = Static107.anInt2447;
		@Pc(115) int local115 = Static110.anInt2509;
		@Pc(117) int local117 = Static104.anInt2384;
		@Pc(119) int local119 = Static95.anInt2250;
		@Pc(121) int local121 = Static161.anInt3427;
		@Pc(164) int local164;
		for (@Pc(123) int local123 = 0; local123 < 5; local123++) {
			if (Static178.aBooleanArray19[local123]) {
				local164 = (int) (Math.random() * (double) (Static72.anIntArray188[local123] * 2 + 1) - (double) Static72.anIntArray188[local123] + Math.sin((double) Static117.anIntArray282[local123] * ((double) Static41.anIntArray76[local123] / 100.0D)) * (double) Static60.anIntArray173[local123]);
				if (local123 == 4) {
					Static95.anInt2250 += local164;
					if (Static95.anInt2250 < 128) {
						Static95.anInt2250 = 128;
					}
					if (Static95.anInt2250 > 383) {
						Static95.anInt2250 = 383;
					}
				}
				if (local123 == 2) {
					Static104.anInt2384 += local164;
				}
				if (local123 == 1) {
					Static110.anInt2509 += local164;
				}
				if (local123 == 3) {
					Static161.anInt3427 = Static161.anInt3427 + local164 & 0x7FF;
				}
				if (local123 == 0) {
					Static107.anInt2447 += local164;
				}
			}
		}
		local164 = Static72.anInt1723;
		@Pc(231) int local231 = Static61.anInt3635;
		if (local164 >= arg1 && local164 < arg3 + arg1 && arg0 <= local231 && local231 < arg2 + arg0) {
			Static42.anInt1012 = Static61.anInt3635 - arg0;
			Static42.anInt1011 = Static72.anInt1723 - arg1;
			Static42.aBoolean35 = true;
			Static42.anInt1013 = 0;
		} else {
			Static42.aBoolean35 = false;
			Static42.anInt1013 = 0;
		}
		Static155.method2390();
		Static172.method2026(arg1, arg0, arg3, arg2, 0);
		Static155.method2390();
		Static180.aClass60_1.method1789(Static107.anInt2447, Static110.anInt2509, Static104.anInt2384, Static95.anInt2250, Static161.anInt3427, local43);
		Static155.method2390();
		Static180.aClass60_1.method1805();
		Static167.method1481(arg1, arg0, arg3, arg2);
		Static157.method2406(arg1, arg0);
		((Class7) Static125.anInterface2_1).method266(Static123.anInt2778);
		Static1.method2(arg3, arg0, arg1, arg2);
		Static107.anInt2447 = local50;
		Static95.anInt2250 = local119;
		Static161.anInt3427 = local121;
		Static104.anInt2384 = local117;
		Static110.anInt2509 = local115;
		if (Static79.aBoolean79 && Static54.method981() == 0) {
			Static79.aBoolean79 = false;
		}
		if (Static79.aBoolean79) {
			Static172.method2026(arg1, arg0, arg3, arg2, 0);
			Static170.method2617(false, Static20.aClass10_244);
		}
		if (!Static79.aBoolean79 && !Static119.aBoolean119 && arg1 <= local164 && arg3 + arg1 > local164 && arg0 <= local231 && local231 < arg0 + arg2) {
			Static114.method1831(local231, local164, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(B)I")
	public static int method930() {
		return Static47.anInt1149++;
	}
}
