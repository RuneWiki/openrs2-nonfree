import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "[S")
	public static short[] aShortArray37;

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "Z")
	public static boolean aBoolean183 = false;

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
	public static int anInt3909 = 0;

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1317 = Static170.method3101("Freie Welt");

	@OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
	public static int anInt3912 = 1;

	@OriginalMember(owner = "client!ue", name = "m", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1318 = Static170.method3101("Nehmen");

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1319 = Static170.method3101("Connection timed out)3");

	@OriginalMember(owner = "client!ue", name = "o", descriptor = "Z")
	public static boolean aBoolean184 = false;

	@OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
	public static int anInt3914 = 0;

	@OriginalMember(owner = "client!ue", name = "r", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1320 = aClass28_1319;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZLclient!ah;Lclient!ah;)V")
	public static void method2980(@OriginalArg(1) Class7 arg0, @OriginalArg(2) Class7 arg1) {
		Static174.aClass7_66 = arg1;
		Static134.aClass7_55 = arg0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
	public static void method2981() {
		if (Static167.anIntArray680 != null && Static61.anIntArray316 != null) {
			return;
		}
		Static167.anIntArray680 = new int[256];
		Static61.anIntArray316 = new int[256];
		for (@Pc(21) int local21 = 0; local21 < 256; local21++) {
			@Pc(30) double local30 = (double) local21 / 255.0D * 6.283185307179586D;
			Static167.anIntArray680[local21] = (int) (Math.sin(local30) * 4096.0D);
			Static61.anIntArray316[local21] = (int) (Math.cos(local30) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	public static void method2982() {
		aShortArray37 = null;
		aClass28_1320 = null;
		aClass28_1318 = null;
		aClass28_1319 = null;
		aClass28_1317 = null;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V")
	public static void method2983() {
		Static18.aBoolean34 = true;
		Static133.anInt3379 = 0;
		Static12.aClass24_1.anInt1053 = 0;
		Static101.aLong90 = 0L;
		Static52.aBoolean85 = true;
		Static68.method1630();
		Static82.anInt2400 = 0;
		Static69.aBoolean112 = false;
		Static51.aClass3_Sub8_Sub1_2.anInt1948 = 0;
		Static65.anInt2024 = -1;
		Static18.aClass3_Sub8_Sub1_1.anInt1948 = 0;
		Static139.anInt3669 = -1;
		Static135.anInt3444 = 0;
		Static82.anInt2391 = 0;
		Static35.anInt1047 = 0;
		Static159.anInt3903 = -1;
		Static15.anInt1152 = -1;
		Static93.anInt2607 = 0;
		Static45.method1074(0);
		for (@Pc(2280) int local2280 = 0; local2280 < 100; local2280++) {
			Static175.aClass28Array23[local2280] = null;
		}
		Static30.anInt956 = (int) (Math.random() * 110.0D) - 55;
		Static69.anInt2115 = 0;
		Static112.anInt2872 = 0;
		Static86.anInt2526 = -1;
		Static139.anInt3673 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static170.anInt4092 = (int) (Math.random() * 120.0D) - 60;
		Static21.anInt574 = 0;
		Static67.aBoolean109 = false;
		Static51.anInt1446 = (int) (Math.random() * 30.0D) - 20;
		Static171.anInt4108 = (int) (Math.random() * 80.0D) - 40;
		Static78.anInt2319 = 0;
		Static38.anInt1096 = (int) (Math.random() * 100.0D) - 50;
		Static16.anInt490 = 0;
		Static41.anInt1106 = 0;
		Static95.anInt2636 = 0;
		Static30.anInt957 = 0;
		for (@Pc(2361) int local2361 = 0; local2361 < 2048; local2361++) {
			Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[local2361] = null;
			Static137.aClass3_Sub8Array1[local2361] = null;
		}
		for (@Pc(2379) int local2379 = 0; local2379 < 32768; local2379++) {
			Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[local2379] = null;
		}
		Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1 = Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[2047] = new Class3_Sub2_Sub1_Sub2_Sub1();
		Static166.aClass23_16.method863();
		Static33.aClass23_6.method863();
		@Pc(2411) int local2411;
		@Pc(2415) int local2415;
		for (@Pc(2407) int local2407 = 0; local2407 < 4; local2407++) {
			for (local2411 = 0; local2411 < 104; local2411++) {
				for (local2415 = 0; local2415 < 104; local2415++) {
					Static26.aClass23ArrayArrayArray1[local2407][local2411][local2415] = null;
				}
			}
		}
		Static24.aClass23_3 = new Class23();
		Static66.anInt2068 = 0;
		Static177.anInt4222 = 0;
		for (local2411 = 0; local2411 < Static178.anInt4249; local2411++) {
			@Pc(2455) Class3_Sub2_Sub12 local2455 = Static120.method2408(local2411);
			if (local2455 != null && local2455.anInt2530 == 0) {
				Static65.anIntArray337[local2411] = 0;
				Static72.anIntArray354[local2411] = 0;
			}
		}
		for (local2415 = 0; local2415 < Static105.anIntArray480.length; local2415++) {
			Static105.anIntArray480[local2415] = -1;
		}
		if (Static177.anInt4207 != -1) {
			Static69.method1637(Static177.anInt4207);
		}
		for (@Pc(2501) Class3_Sub7 local2501 = (Class3_Sub7) Static119.aClass87_11.method3203(); local2501 != null; local2501 = (Class3_Sub7) Static119.aClass87_11.method3199()) {
			method2984(true, local2501);
		}
		Static177.anInt4207 = -1;
		Static119.aClass87_11 = new Class87(8);
		Static82.anInt2400 = 0;
		Static69.aBoolean112 = false;
		Static175.aClass33_15 = null;
		Static180.aClass76_2.method2962(new int[5], false, -1, null);
		for (@Pc(2537) int local2537 = 0; local2537 < 8; local2537++) {
			Static140.aClass28Array21[local2537] = null;
			Static98.aBooleanArray14[local2537] = false;
		}
		Static155.method2949();
		Static157.aBoolean182 = true;
		for (@Pc(2561) int local2561 = 0; local2561 < 100; local2561++) {
			Static137.aBooleanArray15[local2561] = true;
		}
		Static35.anInt1045 = 0;
		Static106.aClass28_889 = null;
		Static34.aClass3_Sub12Array1 = null;
		for (@Pc(2579) int local2579 = 0; local2579 < 6; local2579++) {
			Static129.aClass20Array1[local2579] = new Class20();
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZZLclient!gh;)V")
	public static void method2984(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		@Pc(6) int local6 = arg1.anInt1548;
		@Pc(10) int local10 = (int) arg1.aLong144;
		arg1.method3167();
		if (arg0) {
			Static69.method1637(local6);
		}
		Static70.method1648(local6);
		@Pc(30) Class33 local30 = Static19.method576(local10);
		if (local30 != null) {
			Static16.method534(local30);
		}
		Static82.anInt2400 = 0;
		Static69.aBoolean112 = false;
		Static23.method618(Static65.anInt2018, Static132.anInt3333, Static68.anInt2102, Static91.anInt4119);
		if (Static177.anInt4207 != -1) {
			Static65.method1570(Static177.anInt4207, 1);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)I")
	public static int method2985(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (arg0 * local24 >> 12) + 40960;
		return local32 * local13 >> 12;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(IB)Lclient!eh;")
	public static Class28 method2986(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static4.method96(new Class28[] { Static51.aClass28_446, Static146.method2793(arg0), Static179.aClass28_1494 });
		} else if (arg0 < 10000000) {
			return Static4.method96(new Class28[] { Static101.aClass28_846, Static146.method2793(arg0 / 1000), Static32.aClass28_328, Static179.aClass28_1494 });
		} else {
			return Static4.method96(new Class28[] { Static140.aClass28_1188, Static146.method2793(arg0 / 1000000), Static75.aClass28_685, Static179.aClass28_1494 });
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)Z")
	public static boolean method2987(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}
}
