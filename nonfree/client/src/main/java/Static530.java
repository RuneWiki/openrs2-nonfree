import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!uea", name = "h", descriptor = "I")
	public static int anInt8762;

	@OriginalMember(owner = "client!uea", name = "n", descriptor = "I")
	public static int anInt8768;

	@OriginalMember(owner = "client!uea", name = "o", descriptor = "Lclient!ga;")
	public static Class111 aClass111_114;

	@OriginalMember(owner = "client!uea", name = "l", descriptor = "I")
	public static final int anInt8766 = 1401;

	@OriginalMember(owner = "client!uea", name = "p", descriptor = "[Lclient!hca;")
	public static final Class131[] aClass131Array2 = new Class131[14];

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IZ)V")
	public static void method7224(@OriginalArg(1) boolean arg0) {
		Static99.method1834();
		if (!Static304.method4711(Static177.anInt2101)) {
			return;
		}
		Static314.anInt5650++;
		if (Static314.anInt5650 < 50 && !arg0) {
			return;
		}
		Static314.anInt5650 = 0;
		if (!Static533.aBoolean650 && Static400.aClass75_3 != null) {
			@Pc(42) Class1_Sub48 local42 = Static320.method4867(Static442.aClass170_2, Static143.aClass319_57);
			Static34.method813(local42);
			try {
				Static364.method5312();
			} catch (@Pc(49) IOException local49) {
				Static533.aBoolean650 = true;
			}
		}
		Static99.method1834();
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7225(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 < 0 || arg0 < 0 || arg5 >= Static500.anInt6888 - 1 || Static573.anInt9325 - 1 <= arg0) {
			return;
		}
		if (Static118.aClass293ArrayArrayArray14 == null) {
			return;
		}
		@Pc(43) Interface7 local43;
		if (arg4 != 0) {
			if (arg4 == 1) {
				local43 = (Interface7) Static89.method1752(arg6, arg5, arg0);
				if (local43 != null) {
					if (local43 instanceof Class20_Sub2_Sub1_Sub2) {
						((Class20_Sub2_Sub1_Sub2) local43).aClass304_1.method6918(arg2);
						return;
					}
					@Pc(59) int local59 = local43.method7276();
					if (arg1 != 4 && arg1 != 5) {
						if (arg1 != 6) {
							if (arg1 == 7) {
								Static557.method7516(arg4, arg2, arg0, local59, arg5, arg6, 4, (arg3 + 2 & 0x3) + 4);
							} else if (arg1 == 8) {
								Static557.method7516(arg4, arg2, arg0, local59, arg5, arg6, 4, arg3 + 4);
								Static557.method7516(arg4, arg2, arg0, local59, arg5, arg6, 4, (arg3 + 2 & 0x3) + 4);
								return;
							}
							return;
						}
						Static557.method7516(arg4, arg2, arg0, local59, arg5, arg6, 4, arg3 + 4);
						return;
					}
					Static557.method7516(arg4, arg2, arg0, local59, arg5, arg6, 4, arg3);
					return;
				}
				return;
			}
			if (arg4 != 2) {
				if (arg4 == 3) {
					local43 = (Interface7) Static17.method507(arg6, arg5, arg0);
					if (local43 != null) {
						if (local43 instanceof Class20_Sub2_Sub3_Sub2) {
							((Class20_Sub2_Sub3_Sub2) local43).aClass304_3.method6918(arg2);
							return;
						}
						Static557.method7516(arg4, arg2, arg0, local43.method7276(), arg5, arg6, arg1, arg3);
						return;
					}
				}
				return;
			}
			local43 = (Interface7) Static18.method537(arg6, arg5, arg0, ge.class);
			if (local43 != null) {
				if (arg1 == 11) {
					arg1 = 10;
				}
				if (local43 instanceof Class20_Sub2_Sub4_Sub3) {
					((Class20_Sub2_Sub4_Sub3) local43).aClass304_2.method6918(arg2);
					return;
				}
				Static557.method7516(arg4, arg2, arg0, local43.method7276(), arg5, arg6, arg1, arg3);
				return;
			}
			return;
		}
		local43 = (Interface7) Static387.method5565(arg6, arg5, arg0);
		@Pc(247) Interface7 local247 = (Interface7) Static263.method4146(arg6, arg5, arg0);
		if (local43 != null && arg1 != 2) {
			if (local43 instanceof Class20_Sub2_Sub2_Sub2) {
				((Class20_Sub2_Sub2_Sub2) local43).lb.method6918(arg2);
			} else {
				Static557.method7516(arg4, arg2, arg0, local43.method7276(), arg5, arg6, arg1, arg3);
			}
		}
		if (local247 == null) {
			return;
		}
		if (!(local247 instanceof Class20_Sub2_Sub2_Sub2)) {
			Static557.method7516(arg4, arg2, arg0, local247.method7276(), arg5, arg6, arg1, arg3);
			return;
		}
		((Class20_Sub2_Sub2_Sub2) local247).lb.method6918(arg2);
		return;
	}

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "(I)V")
	public static void method7226() {
		Static122.method2098();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static28.aClass94Array2[local8].method2209();
		}
		Static233.method3823();
		Static181.method2770();
		System.gc();
	}

	@OriginalMember(owner = "client!uea", name = "c", descriptor = "(I)V")
	public static void method7227() {
		if (Static509.anInterface22Array1 == null) {
			return;
		}
		@Pc(5) Interface22[] local5 = Static509.anInterface22Array1;
		for (@Pc(7) int local7 = 0; local7 < local5.length; local7++) {
			@Pc(13) Interface22 local13 = local5[local7];
			local13.method1804();
		}
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(BLclient!wv;)V")
	public static void method7228(@OriginalArg(1) Class365 arg0) {
		if (Static65.anInt1569 != arg0.anInt9607) {
			return;
		}
		if (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aString49 == null) {
			arg0.anInt9572 = 0;
			arg0.anInt9620 = 0;
			return;
		}
		arg0.anInt9660 = 150;
		arg0.anInt9612 = (int) (Math.sin((double) Static81.anInt1910 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt9576 = 5;
		arg0.anInt9620 = Static594.anInt9653;
		arg0.anInt9572 = Static318.method4845(Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aString49);
		arg0.anInt9611 = Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt6454;
		arg0.anInt9643 = 0;
		arg0.anInt9574 = Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt6459;
		arg0.anInt9583 = Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt6405;
		@Pc(76) Class131 local76 = arg0.anInt9611 == -1 ? null : Static594.aClass311_2.method7009(arg0.anInt9611);
		if (local76 != null) {
			Static416.method5833(arg0.anInt9583, local76);
		}
	}
}
