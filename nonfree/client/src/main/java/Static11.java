import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "Lclient!ed;")
	public static Class23 aClass23_138 = Static169.method2903("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "Lclient!ed;")
	private static Class23 aClass23_141 = Static169.method2903("purple:");

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "Lclient!ed;")
	public static Class23 aClass23_139 = aClass23_141;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "Lclient!ed;")
	public static Class23 aClass23_140 = aClass23_141;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
	public static int anInt391 = 127;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "[[S")
	public static short[][] aShortArrayArray1 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	public static void method214() {
		aClass23_139 = null;
		aClass23_140 = null;
		aClass23_141 = null;
		aClass23_138 = null;
		aShortArrayArray1 = null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIII)V")
	public static void method216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Class1_Sub4 local15 = (Class1_Sub4) Static1.aClass56_1.method1853(); local15 != null; local15 = (Class1_Sub4) Static1.aClass56_1.method1855()) {
			if (local15.anInt449 != -1 || local15.anIntArray62 != null) {
				@Pc(27) int local27 = 0;
				if (arg2 > local15.anInt447) {
					local27 = arg2 - local15.anInt447;
				} else if (local15.anInt459 > arg2) {
					local27 = local15.anInt459 - arg2;
				}
				if (local15.anInt446 < arg1) {
					local27 += arg1 - local15.anInt446;
				} else if (arg1 < local15.anInt445) {
					local27 += local15.anInt445 - arg1;
				}
				if (local27 - 64 > local15.anInt456 || Static105.anInt2708 == 0 || arg0 != local15.anInt451) {
					if (local15.aClass1_Sub11_Sub4_1 != null) {
						Static163.aClass1_Sub11_Sub3_2.method2818(local15.aClass1_Sub11_Sub4_1);
						local15.aClass1_Sub11_Sub4_1 = null;
					}
					if (local15.aClass1_Sub11_Sub4_2 != null) {
						Static163.aClass1_Sub11_Sub3_2.method2818(local15.aClass1_Sub11_Sub4_2);
						local15.aClass1_Sub11_Sub4_2 = null;
					}
				} else {
					local27 -= 64;
					if (local27 < 0) {
						local27 = 0;
					}
					@Pc(143) int local143 = Static105.anInt2708 * (local15.anInt456 - local27) / local15.anInt456;
					if (local15.aClass1_Sub11_Sub4_1 != null) {
						local15.aClass1_Sub11_Sub4_1.method2968(local143);
					} else if (local15.anInt449 >= 0) {
						@Pc(161) Class6 local161 = Static183.method175(Static161.aClass30_Sub1_16, local15.anInt449, 0);
						if (local161 != null) {
							@Pc(168) Class1_Sub9_Sub1 local168 = local161.method173().method1016(Static94.aClass9_1);
							@Pc(173) Class1_Sub11_Sub4 local173 = Static189.method2953(local168, local143);
							local173.method2961(-1);
							Static163.aClass1_Sub11_Sub3_2.method2820(local173);
							local15.aClass1_Sub11_Sub4_1 = local173;
						}
					}
					if (local15.aClass1_Sub11_Sub4_2 != null) {
						local15.aClass1_Sub11_Sub4_2.method2968(local143);
						if (!local15.aClass1_Sub11_Sub4_2.method3142()) {
							local15.aClass1_Sub11_Sub4_2 = null;
						}
					} else if (local15.anIntArray62 != null && (local15.anInt457 -= arg3) <= 0) {
						@Pc(204) int local204 = (int) ((double) local15.anIntArray62.length * Math.random());
						@Pc(212) Class6 local212 = Static183.method175(Static161.aClass30_Sub1_16, local15.anIntArray62[local204], 0);
						if (local212 != null) {
							@Pc(219) Class1_Sub9_Sub1 local219 = local212.method173().method1016(Static94.aClass9_1);
							@Pc(224) Class1_Sub11_Sub4 local224 = Static189.method2953(local219, local143);
							local224.method2961(0);
							Static163.aClass1_Sub11_Sub3_2.method2820(local224);
							local15.anInt457 = local15.anInt458 + (int) (Math.random() * (double) (local15.anInt452 - local15.anInt458));
							local15.aClass1_Sub11_Sub4_2 = local224;
						}
					}
				}
			}
		}
	}
}
