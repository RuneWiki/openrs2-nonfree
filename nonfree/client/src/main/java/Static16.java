import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!aq", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray6 = new boolean[100];

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BIIIIIII)V")
	public static void method238(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 < 0 || arg2 < 0 || arg3 >= Static81.anInt1950 - 1 || arg2 >= Static171.anInt3288 - 1) {
			return;
		}
		if (Static176.aClass113ArrayArrayArray3 == null) {
			return;
		}
		@Pc(34) Interface9 local34;
		if (arg6 == 0) {
			local34 = (Interface9) Static334.method4742(arg4, arg3, arg2);
			@Pc(40) Interface9 local40 = (Interface9) Static2.method51(arg4, arg3, arg2);
			if (local34 != null && arg1 != 2) {
				if (local34 instanceof Class4_Sub4_Sub3) {
					((Class4_Sub4_Sub3) local34).aClass117_4.method2615(arg0);
				} else {
					Static77.method5567(arg2, arg4, arg1, local34.method5901(), arg6, arg5, arg0, arg3);
				}
			}
			if (local40 != null) {
				if (local40 instanceof Class4_Sub4_Sub3) {
					((Class4_Sub4_Sub3) local40).aClass117_4.method2615(arg0);
				} else {
					Static77.method5567(arg2, arg4, arg1, local40.method5901(), arg6, arg5, arg0, arg3);
				}
			}
		} else if (arg6 == 1) {
			local34 = (Interface9) Static242.method3661(arg4, arg3, arg2);
			if (local34 != null) {
				if (local34 instanceof Class4_Sub1_Sub3) {
					((Class4_Sub1_Sub3) local34).aClass117_3.method2615(arg0);
				} else {
					@Pc(117) int local117 = local34.method5901();
					if (arg1 == 4 || arg1 == 5) {
						Static77.method5567(arg2, arg4, 4, local117, arg6, arg5, arg0, arg3);
					} else if (arg1 == 6) {
						Static77.method5567(arg2, arg4, 4, local117, arg6, arg5 + 4, arg0, arg3);
					} else if (arg1 == 7) {
						Static77.method5567(arg2, arg4, 4, local117, arg6, (arg5 + 2 & 0x3) + 4, arg0, arg3);
					} else if (arg1 == 8) {
						Static77.method5567(arg2, arg4, 4, local117, arg6, arg5 + 4, arg0, arg3);
						Static77.method5567(arg2, arg4, 4, local117, arg6, (arg5 + 2 & 0x3) + 4, arg0, arg3);
					}
				}
			}
		} else if (arg6 == 2) {
			local34 = (Interface9) Static80.method1405(arg4, arg3, arg2, np.class);
			if (local34 != null) {
				if (arg1 == 11) {
					arg1 = 10;
				}
				if (local34 instanceof Class4_Sub2_Sub3) {
					((Class4_Sub2_Sub3) local34).aClass117_2.method2615(arg0);
				} else {
					Static77.method5567(arg2, arg4, arg1, local34.method5901(), arg6, arg5, arg0, arg3);
				}
			}
		} else if (arg6 == 3) {
			local34 = (Interface9) Static325.method4667(arg4, arg3, arg2);
			if (local34 != null) {
				if (local34 instanceof Class4_Sub3_Sub1) {
					((Class4_Sub3_Sub1) local34).aClass117_1.method2615(arg0);
				} else {
					Static77.method5567(arg2, arg4, arg1, local34.method5901(), arg6, arg5, arg0, arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IJLclient!qa;)V")
	public static void method240(@OriginalArg(1) long arg0, @OriginalArg(2) Class26 arg1) {
		Static300.anInt5375 = 0;
		Static419.anInt7352 = Static346.anInt6105;
		Static346.anInt6105 = 0;
		@Pc(14) long local14 = Static208.method3182();
		for (@Pc(19) Class38_Sub6 local19 = (Class38_Sub6) Static384.aClass184_7.method4212(); local19 != null; local19 = (Class38_Sub6) Static384.aClass184_7.method4215()) {
			if (local19.method3552(arg1, arg0)) {
				Static300.anInt5375++;
			}
		}
		if (Static128.aBoolean214 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static384.aClass184_7.method4209() + ", running: " + Static300.anInt5375 + ". Particles: " + Static346.anInt6105 + ". Time taken: " + (Static208.method3182() - local14) + "ms");
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(III)V")
	public static void method241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class113 local7 = Static176.aClass113ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 != null && local7.aClass4_Sub3_1 != null) {
			local7.aClass4_Sub3_1 = null;
		}
	}
}
