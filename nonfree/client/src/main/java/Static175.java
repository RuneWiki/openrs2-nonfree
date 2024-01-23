import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1187 = Static186.method3527("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
	public static volatile int anInt3594 = 0;

	@OriginalMember(owner = "client!qh", name = "Fb", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1193 = Static186.method3527("glow1:");

	@OriginalMember(owner = "client!qh", name = "X", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1191 = aClass50_1193;

	@OriginalMember(owner = "client!qh", name = "fb", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1192 = Static186.method3527("Walk here");

	@OriginalMember(owner = "client!qh", name = "cc", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1195 = Static186.method3527("Stufe)2");

	@OriginalMember(owner = "client!qh", name = "uc", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1196 = aClass50_1192;

	@OriginalMember(owner = "client!qh", name = "Mc", descriptor = "[I")
	public static int[] anIntArray396 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!qh", name = "md", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1198 = aClass50_1193;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BIIIII)V")
	public static void method2892(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static131.anInt2713 <= arg0 && arg4 <= Static135.anInt2790 && Static49.anInt1030 <= arg1 && arg3 <= Static177.anInt3701) {
			Static143.method2356(arg3, arg1, arg0, arg4, arg2);
		} else {
			Static23.method336(arg1, arg2, arg3, arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
	public static void method2895() {
		Static166.aClass84_29.method2576();
		Static49.aClass84_19.method2576();
		Static64.aClass84_20.method2576();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)V")
	public static void method2897() {
		Static166.aClass84_29.method2577(5);
		Static49.aClass84_19.method2577(5);
		Static64.aClass84_20.method2577(5);
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)Lclient!mj;")
	public static Class1_Sub1_Sub13 method2899() {
		@Pc(13) Class1_Sub1_Sub13 local13 = (Class1_Sub1_Sub13) Static47.aClass121_2.method3380();
		if (local13 != null) {
			local13.method3525();
			local13.method3531();
			return local13;
		}
		do {
			local13 = (Class1_Sub1_Sub13) Static192.aClass121_4.method3380();
			if (local13 == null) {
				return null;
			}
			if (local13.method2264() > Static179.method2941()) {
				return null;
			}
			local13.method3525();
			local13.method3531();
		} while ((Long.MIN_VALUE & local13.aLong174) == 0L);
		return local13;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIII)Lclient!hd;")
	public static Class1_Sub13 method2900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class1_Sub13 local7 = new Class1_Sub13();
		local7.anInt1588 = arg1;
		local7.anInt1587 = arg2;
		Static157.aClass90_19.method2817(local7, (long) arg0);
		Static114.method1848(arg1);
		@Pc(31) Class93 local31 = Static164.method2725(arg0);
		if (local31 != null) {
			Static66.method999(local31);
		}
		if (Static199.aClass93_112 != null) {
			Static66.method999(Static199.aClass93_112);
			Static199.aClass93_112 = null;
		}
		Static193.anInt3035 = 0;
		Static40.aBoolean44 = false;
		Static73.method2567(Static143.anInt2913, Static233.anInt4463, Static126.anInt2534, Static15.anInt284);
		if (local31 != null) {
			Static71.method1029(local31, false);
		}
		Static185.method3083(arg1);
		if (Static10.anInt204 != -1) {
			Static113.method1839(1, Static10.anInt204);
		}
		return local7;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II[Lclient!qh;ZII)V")
	public static void method2902(@OriginalArg(1) int arg0, @OriginalArg(2) Class93[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(8) int local8 = 0; local8 < arg1.length; local8++) {
			@Pc(14) Class93 local14 = arg1[local8];
			if (local14 != null && arg3 == local14.anInt3660) {
				Static2.method44(arg4, arg2, local14, arg0);
				Static188.method3104(local14, arg4, arg0);
				if (local14.anInt3587 - local14.anInt3620 < local14.anInt3608) {
					local14.anInt3608 = local14.anInt3587 - local14.anInt3620;
				}
				if (local14.anInt3608 < 0) {
					local14.anInt3608 = 0;
				}
				if (local14.anInt3628 - local14.anInt3600 < local14.anInt3653) {
					local14.anInt3653 = local14.anInt3628 - local14.anInt3600;
				}
				if (local14.anInt3653 < 0) {
					local14.anInt3653 = 0;
				}
				if (local14.anInt3656 == 0) {
					Static71.method1029(local14, arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)I")
	public static int method2903(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIII)V")
	public static void method2904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg1 + arg4;
		@Pc(14) int local14 = arg5 - arg1;
		@Pc(18) int local18 = arg1 + arg2;
		for (@Pc(20) int local20 = arg4; local20 < local9; local20++) {
			Static107.method1641(arg2, arg3, Static139.anIntArrayArray21[local20], arg0);
		}
		for (@Pc(40) int local40 = arg5; local40 > local14; local40--) {
			Static107.method1641(arg2, arg3, Static139.anIntArrayArray21[local40], arg0);
		}
		@Pc(59) int local59 = arg0 - arg1;
		for (@Pc(61) int local61 = local9; local61 <= local14; local61++) {
			@Pc(67) int[] local67 = Static139.anIntArrayArray21[local61];
			Static107.method1641(arg2, arg3, local67, local18);
			Static107.method1641(local59, arg3, local67, arg0);
		}
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)I")
	public static int method2905() {
		if ((double) Static64.aFloat1 == 3.0D) {
			return 37;
		} else if ((double) Static64.aFloat1 == 4.0D) {
			return 50;
		} else if ((double) Static64.aFloat1 == 6.0D) {
			return 75;
		} else {
			return 100;
		}
	}
}
