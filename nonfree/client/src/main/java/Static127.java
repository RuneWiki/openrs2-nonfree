import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1000 = Static120.method2057("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!pc", name = "s", descriptor = "[[S")
	public static short[][] aShortArrayArray6 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	public static void method2166() {
		aClass81_1000 = null;
		aShortArrayArray6 = null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[Lclient!gf;[BIIII)V")
	public static void method2167(@OriginalArg(0) int arg0, @OriginalArg(1) Class28[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 64; local11++) {
				for (local15 = 0; local15 < 64; local15++) {
					if (arg3 + local11 > 0 && local11 + arg3 < 103 && arg4 + local15 > 0 && arg4 + local15 < 103) {
						arg1[local7].anIntArrayArray8[local11 + arg3][local15 + arg4] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(90) Class1_Sub8 local90 = new Class1_Sub8(arg2);
		for (local15 = 0; local15 < 4; local15++) {
			for (@Pc(100) int local100 = 0; local100 < 64; local100++) {
				for (@Pc(104) int local104 = 0; local104 < 64; local104++) {
					Static75.method1329(0, arg5, arg0, local100 + arg3, local104 - -arg4, local90, local15);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[Lclient!tg;)Lclient!tg;")
	public static Class81 method2169(@OriginalArg(1) Class81[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static181.method3108(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V")
	public static void method2173() {
		if (Static43.aClass14_1 != null) {
			@Pc(14) Class14 local14 = Static43.aClass14_1;
			synchronized (Static43.aClass14_1) {
				Static43.aClass14_1 = null;
			}
		}
	}
}
