import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!je", name = "c", descriptor = "I")
	public static int anInt2939;

	@OriginalMember(owner = "client!je", name = "n", descriptor = "I")
	public static int anInt2947;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "I")
	public static int anInt2937 = 2;

	@OriginalMember(owner = "client!je", name = "l", descriptor = "[[S")
	public static short[][] aShortArrayArray3 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!je", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray20 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!je", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString188 = "slide:";

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public static void method2249() {
		Static57.aClass79_7.method2489();
		Static247.aClass79_37.method2489();
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)V")
	public static void method2251(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub23 local10 = (Class1_Sub23) Static249.aClass140_17.method4014((long) arg0);
		if (local10 != null) {
			local10.method4186();
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIII)V")
	public static void method2252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static10.anInt384 = arg1;
		Static232.anInt5102 = arg0;
		Static260.anInt2793 = arg2;
		Static38.anInt1012 = arg3;
		Static261.anInt5482 = arg4;
		if (Static38.anInt1012 >= 100) {
			@Pc(32) int local32 = Static232.anInt5102 * 128 + 64;
			@Pc(38) int local38 = Static261.anInt5482 * 128 + 64;
			@Pc(47) int local47 = Static200.method3326(Static137.anInt3321, local32, local38) - Static260.anInt2793;
			@Pc(52) int local52 = local38 - Static174.anInt4003;
			@Pc(56) int local56 = local47 - Static109.anInt2904;
			@Pc(60) int local60 = local32 - Static110.anInt2935;
			@Pc(71) int local71 = (int) Math.sqrt((double) (local60 * local60 + local52 * local52));
			Static200.anInt4412 = (int) (Math.atan2((double) local56, (double) local71) * 325.949D) & 0x7FF;
			Static127.anInt3198 = (int) (-325.949D * Math.atan2((double) local52, (double) local60)) & 0x7FF;
			if (Static200.anInt4412 < 128) {
				Static200.anInt4412 = 128;
			}
			if (Static200.anInt4412 > 383) {
				Static200.anInt4412 = 383;
			}
		}
		Static61.anInt1682 = 2;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIBI)V")
	public static void method2253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static147.method2681(Static29.anIntArrayArray10[arg2], arg1, arg3 - arg0, arg0 + arg3);
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = -arg0;
		@Pc(35) int local35 = arg0;
		@Pc(37) int local37 = -1;
		while (local35 > local30) {
			local37 += 2;
			local30++;
			local33 += local37;
			if (local33 >= 0) {
				local35--;
				local33 -= local35 << 1;
				@Pc(63) int[] local63 = Static29.anIntArrayArray10[local35 + arg2];
				@Pc(68) int local68 = arg3 + local30;
				@Pc(75) int[] local75 = Static29.anIntArrayArray10[arg2 - local35];
				@Pc(80) int local80 = arg3 - local30;
				Static147.method2681(local63, arg1, local80, local68);
				Static147.method2681(local75, arg1, local80, local68);
			}
			@Pc(96) int local96 = local35 + arg3;
			@Pc(100) int local100 = arg3 - local35;
			@Pc(107) int[] local107 = Static29.anIntArrayArray10[arg2 + local30];
			@Pc(113) int[] local113 = Static29.anIntArrayArray10[arg2 - local30];
			Static147.method2681(local107, arg1, local100, local96);
			Static147.method2681(local113, arg1, local100, local96);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(JB)V")
	public static void method2254(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static265.anInt5544 >= 100 && !Static115.aBoolean165 || Static265.anInt5544 >= 200) {
			Static50.method1013("", Static238.aString369, 0);
			return;
		}
		@Pc(30) String local30 = Static169.method2944(arg0);
		for (@Pc(32) int local32 = 0; local32 < Static265.anInt5544; local32++) {
			if (Static139.aLongArray38[local32] == arg0) {
				Static50.method1013("", local30 + Static157.aString240, 0);
				return;
			}
		}
		for (@Pc(63) int local63 = 0; local63 < Static167.anInt3911; local63++) {
			if (arg0 == Static150.aLongArray23[local63]) {
				Static50.method1013("", Static171.aString265 + local30 + Static87.aString154, 0);
				return;
			}
		}
		if (local30.equals(Static83.aClass9_Sub1_Sub1_1.aString12)) {
			Static50.method1013("", Static49.aString79, 0);
			return;
		}
		Static48.aStringArray7[Static265.anInt5544] = local30;
		Static139.aLongArray38[Static265.anInt5544] = arg0;
		Static206.anIntArray349[Static265.anInt5544] = 0;
		Static63.aStringArray10[Static265.anInt5544] = "";
		Static208.anIntArray353[Static265.anInt5544] = 0;
		Static168.aBooleanArray15[Static265.anInt5544] = false;
		Static52.anInt1461 = Static243.anInt5249;
		Static265.anInt5544++;
		Static171.aClass1_Sub13_Sub1_3.method1825(37);
		Static171.aClass1_Sub13_Sub1_3.method1770(arg0);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III)Lclient!gg;")
	public static Class47 method2255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub16 local7 = Static142.aClass1_Sub16ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt2929; local13++) {
			@Pc(19) Class47 local19 = local7.aClass47Array1[local13];
			if ((local19.aLong73 >> 29 & 0x3L) == 2L && local19.anInt2146 == arg1 && local19.anInt2148 == arg2) {
				return local19;
			}
		}
		return null;
	}
}
