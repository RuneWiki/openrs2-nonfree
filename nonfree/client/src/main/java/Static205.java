import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!rh", name = "q", descriptor = "[I")
	public static int[] anIntArray347 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!rh", name = "v", descriptor = "[I")
	public static int[] anIntArray348 = new int[256];

	@OriginalMember(owner = "client!rh", name = "y", descriptor = "Lclient!se;")
	public static Class122 aClass122_15 = null;

	@OriginalMember(owner = "client!rh", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString310 = "Loaded wordpack";

	@OriginalMember(owner = "client!rh", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString311 = "Loading world list data";

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(IIIIII)V")
	public static void method3434(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == arg4) {
			Static175.method3004(arg1, arg2, arg0, arg4);
		} else if (Static167.anInt3907 <= arg2 - arg4 && Static150.anInt3860 >= arg4 + arg2 && arg1 - arg3 >= Static202.anInt4469 && Static94.anInt4237 >= arg1 + arg3) {
			Static168.method2914(arg1, arg3, arg0, arg2, arg4);
		} else {
			Static109.method2229(arg3, arg0, arg4, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIILclient!de;I)V")
	public static void method3436(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class31 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Class1_Sub28 local15 = (Class1_Sub28) Static25.aClass3_3.method30(); local15 != null; local15 = (Class1_Sub28) Static25.aClass3_3.method33()) {
			if (arg0 == local15.anInt4869 && arg1 * 128 == local15.anInt4863 && local15.anInt4856 == arg3 * 128 && arg2.anInt1319 == local15.aClass31_1.anInt1319) {
				if (local15.aClass1_Sub4_Sub3_2 != null) {
					Static24.aClass1_Sub4_Sub4_1.method3081(local15.aClass1_Sub4_Sub3_2);
					local15.aClass1_Sub4_Sub3_2 = null;
				}
				if (local15.aClass1_Sub4_Sub3_3 != null) {
					Static24.aClass1_Sub4_Sub4_1.method3081(local15.aClass1_Sub4_Sub3_3);
					local15.aClass1_Sub4_Sub3_3 = null;
				}
				local15.method4186();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(B)V")
	public static void method3437() {
		for (@Pc(11) int local11 = 0; local11 < Static253.anInt3818; local11++) {
			@Pc(17) int local17 = Static126.anIntArray244[local11];
			@Pc(21) Class9_Sub1_Sub2 local21 = Static36.aClass9_Sub1_Sub2Array2[local17];
			@Pc(25) int local25 = Static58.aClass1_Sub13_Sub1_1.method1772();
			if ((local25 & 0x2) != 0) {
				local25 += Static58.aClass1_Sub13_Sub1_1.method1772() << 8;
			}
			if ((local25 & 0x200) != 0) {
				local21.anInt433 = Static58.aClass1_Sub13_Sub1_1.method1784();
				local21.anInt459 = Static58.aClass1_Sub13_Sub1_1.method1764();
			}
			@Pc(65) int local65;
			if ((local25 & 0x100) != 0) {
				local65 = Static58.aClass1_Sub13_Sub1_1.method1772();
				@Pc(68) int[] local68 = new int[local65];
				@Pc(71) int[] local71 = new int[local65];
				@Pc(74) int[] local74 = new int[local65];
				for (@Pc(76) int local76 = 0; local76 < local65; local76++) {
					@Pc(82) int local82 = Static58.aClass1_Sub13_Sub1_1.method1764();
					if (local82 == 65535) {
						local82 = -1;
					}
					local68[local76] = local82;
					local71[local76] = Static58.aClass1_Sub13_Sub1_1.method1779();
					local74[local76] = Static58.aClass1_Sub13_Sub1_1.method1784();
				}
				Static266.method4222(local21, local71, local74, local68);
			}
			@Pc(127) int local127;
			if ((local25 & 0x1) != 0) {
				local65 = Static58.aClass1_Sub13_Sub1_1.method1811();
				local127 = Static58.aClass1_Sub13_Sub1_1.method1772();
				local21.method205(local127, Static156.anInt3722, local65);
				local21.anInt480 = Static156.anInt3722 + 300;
				local21.anInt438 = Static58.aClass1_Sub13_Sub1_1.method1811();
			}
			if ((local25 & 0x40) != 0) {
				local21.anInt423 = Static58.aClass1_Sub13_Sub1_1.method1764();
				if (local21.anInt423 == 65535) {
					local21.anInt423 = -1;
				}
			}
			if ((local25 & 0x80) != 0) {
				if (local21.aClass45_1.method1459()) {
					Static9.method183(local21);
				}
				local21.method223(Static155.method2756(Static58.aClass1_Sub13_Sub1_1.method1761()));
				local21.method212(local21.aClass45_1.anInt2021);
				local21.anInt432 = local21.aClass45_1.anInt2027;
				local21.anInt404 = local21.aClass45_1.anInt2004;
				if (local21.aClass45_1.method1459()) {
					Static117.method2319(local21, 0, local21.anIntArray43[0], Static137.anInt3321, local21.anIntArray41[0], null, null);
				}
			}
			if ((local25 & 0x8) != 0) {
				local21.aString13 = Static58.aClass1_Sub13_Sub1_1.method1774();
				local21.anInt402 = 100;
			}
			if ((local25 & 0x10) != 0) {
				local65 = Static58.aClass1_Sub13_Sub1_1.method1761();
				if (local65 == 65535) {
					local65 = -1;
				}
				local127 = Static58.aClass1_Sub13_Sub1_1.method1802();
				@Pc(251) boolean local251 = true;
				if (local65 != -1 && local21.anInt448 != -1 && Static131.method697(Static172.method2975(local65).anInt634).anInt2189 < Static131.method697(Static172.method2975(local21.anInt448).anInt634).anInt2189) {
					local251 = false;
				}
				if (local251) {
					local21.anInt444 = Static156.anInt3722 + (local127 & 0xFFFF);
					local21.anInt472 = 0;
					local21.anInt449 = local127 >> 16;
					local21.anInt448 = local65;
					if (Static156.anInt3722 < local21.anInt444) {
						local21.anInt472 = -1;
					}
					local21.anInt461 = 1;
					local21.anInt460 = 0;
					if (local21.anInt448 != -1 && local21.anInt444 == Static156.anInt3722) {
						@Pc(336) int local336 = Static172.method2975(local21.anInt448).anInt634;
						if (local336 != -1) {
							@Pc(344) Class49 local344 = Static131.method697(local336);
							if (local344 != null && local344.anIntArray168 != null) {
								Static232.method3865(local21.anInt479, local21.anInt427, false, 0, local344);
							}
						}
					}
				}
			}
			if ((local25 & 0x4) != 0) {
				local65 = Static58.aClass1_Sub13_Sub1_1.method1764();
				if (local65 == 65535) {
					local65 = -1;
				}
				local127 = Static58.aClass1_Sub13_Sub1_1.method1814();
				Static167.method2901(local21, local65, local127);
			}
			if ((local25 & 0x20) != 0) {
				local65 = Static58.aClass1_Sub13_Sub1_1.method1811();
				local127 = Static58.aClass1_Sub13_Sub1_1.method1779();
				local21.method205(local127, Static156.anInt3722, local65);
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IBLjava/util/Random;)I")
	public static int method3438(@OriginalArg(0) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static19.method358(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(41) int local41 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(44) int local44;
			do {
				local44 = arg1.nextInt();
			} while (local41 <= local44);
			return Static216.method3548(local44, arg0);
		}
	}

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "(I)V")
	public static void method3439() {
		Static63.aClass79_9.method2487();
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZI)V")
	public static void method3440(@OriginalArg(0) boolean arg0) {
		for (@Pc(10) Class1_Sub28 local10 = (Class1_Sub28) Static25.aClass3_3.method30(); local10 != null; local10 = (Class1_Sub28) Static25.aClass3_3.method33()) {
			if (local10.aClass1_Sub4_Sub3_2 != null) {
				Static24.aClass1_Sub4_Sub4_1.method3081(local10.aClass1_Sub4_Sub3_2);
				local10.aClass1_Sub4_Sub3_2 = null;
			}
			if (local10.aClass1_Sub4_Sub3_3 != null) {
				Static24.aClass1_Sub4_Sub4_1.method3081(local10.aClass1_Sub4_Sub3_3);
				local10.aClass1_Sub4_Sub3_3 = null;
			}
			local10.method4186();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(58) Class1_Sub28 local58 = (Class1_Sub28) Static87.aClass3_10.method30(); local58 != null; local58 = (Class1_Sub28) Static87.aClass3_10.method33()) {
			if (local58.aClass1_Sub4_Sub3_2 != null) {
				Static24.aClass1_Sub4_Sub4_1.method3081(local58.aClass1_Sub4_Sub3_2);
				local58.aClass1_Sub4_Sub3_2 = null;
			}
			local58.method4186();
		}
		for (@Pc(85) Class1_Sub28 local85 = (Class1_Sub28) Static32.aClass140_1.method4012(); local85 != null; local85 = (Class1_Sub28) Static32.aClass140_1.method4013()) {
			if (local85.aClass1_Sub4_Sub3_2 != null) {
				Static24.aClass1_Sub4_Sub4_1.method3081(local85.aClass1_Sub4_Sub3_2);
				local85.aClass1_Sub4_Sub3_2 = null;
			}
			local85.method4186();
		}
	}
}
