import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!l", name = "o", descriptor = "Lclient!jd;")
	public static Class37 aClass37_22;

	@OriginalMember(owner = "client!l", name = "v", descriptor = "Lclient!jd;")
	public static Class37 aClass37_23;

	@OriginalMember(owner = "client!l", name = "U", descriptor = "[I")
	public static int[] anIntArray226;

	@OriginalMember(owner = "client!l", name = "Z", descriptor = "[Z")
	public static boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!l", name = "e", descriptor = "I")
	public static int anInt1440 = 0;

	@OriginalMember(owner = "client!l", name = "bb", descriptor = "Lclient!rd;")
	private static Class64 aClass64_911 = Static69.method1153("slide:");

	@OriginalMember(owner = "client!l", name = "i", descriptor = "Lclient!rd;")
	public static Class64 aClass64_897 = aClass64_911;

	@OriginalMember(owner = "client!l", name = "ab", descriptor = "Lclient!rd;")
	private static Class64 aClass64_910 = Static69.method1153("Checking for updates )2 ");

	@OriginalMember(owner = "client!l", name = "l", descriptor = "Lclient!rd;")
	public static Class64 aClass64_898 = aClass64_910;

	@OriginalMember(owner = "client!l", name = "m", descriptor = "Lclient!rd;")
	public static Class64 aClass64_899 = Static69.method1153("Mitteilung");

	@OriginalMember(owner = "client!l", name = "t", descriptor = "Lclient!rd;")
	private static Class64 aClass64_900 = Static69.method1153("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!l", name = "y", descriptor = "Lclient!rd;")
	public static Class64 aClass64_901 = Static69.method1153("blinken2:");

	@OriginalMember(owner = "client!l", name = "K", descriptor = "Lclient!rd;")
	private static Class64 aClass64_906 = Static69.method1153("Please try again)3");

	@OriginalMember(owner = "client!l", name = "B", descriptor = "Lclient!rd;")
	public static Class64 aClass64_902 = aClass64_906;

	@OriginalMember(owner = "client!l", name = "G", descriptor = "Lclient!rd;")
	private static Class64 aClass64_903 = Static69.method1153("Welcome to RuneScape");

	@OriginalMember(owner = "client!l", name = "H", descriptor = "Lclient!rd;")
	public static Class64 aClass64_904 = aClass64_900;

	@OriginalMember(owner = "client!l", name = "Q", descriptor = "Lclient!rd;")
	private static Class64 aClass64_907 = Static69.method1153(" more options");

	@OriginalMember(owner = "client!l", name = "I", descriptor = "Lclient!rd;")
	public static Class64 aClass64_905 = aClass64_907;

	@OriginalMember(owner = "client!l", name = "J", descriptor = "I")
	public static int anInt1454 = 0;

	@OriginalMember(owner = "client!l", name = "O", descriptor = "I")
	public static int anInt1456 = 0;

	@OriginalMember(owner = "client!l", name = "R", descriptor = "Lclient!rd;")
	public static Class64 aClass64_908 = aClass64_903;

	@OriginalMember(owner = "client!l", name = "X", descriptor = "Lclient!rd;")
	public static Class64 aClass64_909 = Static69.method1153(")3");

	@OriginalMember(owner = "client!l", name = "gb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_912 = Static69.method1153(" (X");

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!f;)V")
	public static void method1087(@OriginalArg(1) Class1_Sub1_Sub2_Sub1 arg0) {
		if (arg0.anInt2383 == 0) {
			return;
		}
		@Pc(38) int local38;
		@Pc(45) int local45;
		if (arg0.anInt2372 != -1 && arg0.anInt2372 < 32768) {
			@Pc(29) Class1_Sub1_Sub2_Sub1_Sub1 local29 = Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1[arg0.anInt2372];
			if (local29 != null) {
				local38 = arg0.anInt2375 - local29.anInt2375;
				local45 = arg0.anInt2412 - local29.anInt2412;
				if (local38 != 0 || local45 != 0) {
					arg0.anInt2386 = (int) (Math.atan2((double) local38, (double) local45) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(72) int local72;
		if (arg0.anInt2372 >= 32768) {
			local72 = arg0.anInt2372 - 32768;
			if (Static64.anInt1485 == local72) {
				local72 = 2047;
			}
			@Pc(85) Class1_Sub1_Sub2_Sub1_Sub2 local85 = Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local72];
			if (local85 != null) {
				local45 = arg0.anInt2375 - local85.anInt2375;
				@Pc(101) int local101 = arg0.anInt2412 - local85.anInt2412;
				if (local45 != 0 || local101 != 0) {
					arg0.anInt2386 = (int) (Math.atan2((double) local45, (double) local101) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2364 != 0 || arg0.anInt2373 != 0) && (arg0.anInt2410 == 0 || arg0.anInt2371 > 0)) {
			local38 = arg0.anInt2412 - (arg0.anInt2373 - Static53.anInt1236 - Static53.anInt1236) * 64;
			local72 = arg0.anInt2375 - (arg0.anInt2364 - Static60.anInt1350 - Static60.anInt1350) * 64;
			if (local72 != 0 || local38 != 0) {
				arg0.anInt2386 = (int) (Math.atan2((double) local72, (double) local38) * 325.949D) & 0x7FF;
			}
			arg0.anInt2364 = 0;
			arg0.anInt2373 = 0;
		}
		local72 = arg0.anInt2386 - arg0.anInt2363 & 0x7FF;
		if (local72 == 0) {
			arg0.anInt2393 = 0;
			return;
		}
		arg0.anInt2393++;
		@Pc(228) boolean local228;
		if (local72 > 1024) {
			arg0.anInt2363 -= arg0.anInt2383;
			local228 = true;
			if (arg0.anInt2383 > local72 || 2048 - arg0.anInt2383 < local72) {
				local228 = false;
				arg0.anInt2363 = arg0.anInt2386;
			}
			if (arg0.anInt2396 == arg0.anInt2361 && (arg0.anInt2393 > 25 || local228)) {
				if (arg0.anInt2413 == -1) {
					arg0.anInt2396 = arg0.anInt2360;
				} else {
					arg0.anInt2396 = arg0.anInt2413;
				}
			}
		} else {
			arg0.anInt2363 += arg0.anInt2383;
			local228 = true;
			if (arg0.anInt2383 > local72 || local72 > 2048 - arg0.anInt2383) {
				arg0.anInt2363 = arg0.anInt2386;
				local228 = false;
			}
			if (arg0.anInt2361 == arg0.anInt2396 && (arg0.anInt2393 > 25 || local228)) {
				if (arg0.anInt2401 == -1) {
					arg0.anInt2396 = arg0.anInt2360;
				} else {
					arg0.anInt2396 = arg0.anInt2401;
				}
			}
		}
		arg0.anInt2363 &= 0x7FF;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BLclient!nd;)Z")
	public static boolean method1088(@OriginalArg(1) Class1_Sub1_Sub11 arg0) {
		@Pc(6) int local6 = arg0.anInt1709;
		if (Static61.anInt1422 == 2) {
			if (local6 == 201) {
				Static60.aClass64_865 = Static16.aClass64_326;
				Static118.anInt2834 = 0;
				Static60.aClass64_869 = Static60.aClass64_862;
				Static42.anInt930 = 1;
				Static3.aBoolean9 = true;
				Static116.aBoolean166 = true;
			}
			if (local6 == 202) {
				Static118.anInt2834 = 0;
				Static3.aBoolean9 = true;
				Static116.aBoolean166 = true;
				Static42.anInt930 = 2;
				Static60.aClass64_869 = Static60.aClass64_862;
				Static60.aClass64_865 = Static110.aClass64_1666;
			}
		}
		if (local6 == 205) {
			Static23.anInt702 = 250;
			return true;
		}
		if (local6 == 501) {
			Static3.aBoolean9 = true;
			Static60.aClass64_865 = Static15.aClass64_318;
			Static42.anInt930 = 4;
			Static116.aBoolean166 = true;
			Static118.anInt2834 = 0;
			Static60.aClass64_869 = Static60.aClass64_862;
		}
		if (local6 == 502) {
			Static60.aClass64_865 = Static104.aClass64_1540;
			Static3.aBoolean9 = true;
			Static60.aClass64_869 = Static60.aClass64_862;
			Static42.anInt930 = 5;
			Static118.anInt2834 = 0;
			Static116.aBoolean166 = true;
		}
		@Pc(92) int local92;
		@Pc(96) int local96;
		if (local6 >= 300 && local6 <= 313) {
			local92 = (local6 - 300) / 2;
			local96 = local6 & 0x1;
			Static94.aClass54_1.method1254(local96 == 1, local92);
		}
		if (local6 >= 314 && local6 <= 323) {
			local92 = (local6 - 314) / 2;
			local96 = local6 & 0x1;
			Static94.aClass54_1.method1250(local96 == 1, local92);
		}
		if (local6 == 324) {
			Static94.aClass54_1.method1255(false);
		}
		if (local6 == 325) {
			Static94.aClass54_1.method1255(true);
		}
		if (local6 == 326) {
			Static49.aClass1_Sub6_Sub1_1.method1877(5);
			Static94.aClass54_1.method1247(Static49.aClass1_Sub6_Sub1_1);
			return true;
		}
		if (local6 == 620) {
			Static15.aBoolean34 = !Static15.aBoolean34;
		}
		if (local6 >= 601 && local6 <= 613) {
			Static105.method1719();
			if (Static60.aClass64_867.method1469() > 0) {
				Static49.aClass1_Sub6_Sub1_1.method1877(235);
				Static49.aClass1_Sub6_Sub1_1.method1830(Static60.aClass64_867.method1492());
				Static49.aClass1_Sub6_Sub1_1.method1853(local6 - 601);
				Static49.aClass1_Sub6_Sub1_1.method1853(Static15.aBoolean34 ? 1 : 0);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BLjava/awt/Component;ZILclient!g;)V")
	public static void method1089(@OriginalArg(1) Component arg0, @OriginalArg(4) Class28 arg1) {
		Static86.aBoolean123 = false;
		Static43.anInt980 = 22050;
		Static46.aLong37 = Static80.method1369();
		try {
			@Pc(22) Class21_Sub1 local22 = (Class21_Sub1) Class.forName("Class21_Sub1_Sub2").getDeclaredConstructor().newInstance();
			local22.method2033(arg0);
			local22.method2034(arg1, 2048);
			Static9.aClass21_1 = local22;
		} catch (@Pc(35) Throwable local35) {
			try {
				@Pc(40) Class21_Sub1_Sub1 local40 = new Class21_Sub1_Sub1(arg1);
				local40.method2033(arg0);
				local40.method2034(arg1, 16384);
				Static9.aClass21_1 = local40;
			} catch (@Pc(53) Throwable local53) {
				if (Static35.aString1.toLowerCase().indexOf("microsoft") >= 0) {
					try {
						Static9.aClass21_1 = new Class21_Sub2();
						Static43.anInt980 = 8000;
						Static86.aBoolean123 = false;
						return;
					} catch (@Pc(71) Throwable local71) {
					}
				}
				Static9.aClass21_1 = new Class21();
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static1.method35(arg6)) {
			Static104.method1699(Static65.aClass1_Sub1_Sub11ArrayArray1[arg6], 0, arg0, arg2, arg4, arg5, arg1, 0, arg3, -1, arg7);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ZI)Lclient!j;")
	public static Class1_Sub1_Sub8 method1091(@OriginalArg(1) int arg0) {
		@Pc(15) Class1_Sub1_Sub8 local15 = (Class1_Sub1_Sub8) Static50.aClass19_46.method410((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static102.aClass41_59.method1062(13, arg0);
		local15 = new Class1_Sub1_Sub8();
		local15.anInt1192 = arg0;
		if (local25 != null) {
			local15.method908(new Class1_Sub6(local25));
		}
		Static50.aClass19_46.method409(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
	public static void method1092() {
		aClass37_23 = null;
		aClass64_910 = null;
		aClass64_906 = null;
		aClass37_22 = null;
		aClass64_911 = null;
		aClass64_905 = null;
		aClass64_909 = null;
		aClass64_898 = null;
		aClass64_897 = null;
		aClass64_908 = null;
		aClass64_904 = null;
		aBooleanArray8 = null;
		aClass64_900 = null;
		anIntArray226 = null;
		aClass64_912 = null;
		aClass64_902 = null;
		aClass64_899 = null;
		aClass64_901 = null;
		aClass64_907 = null;
		aClass64_903 = null;
	}
}
