import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
	public static void method4122() {
		for (@Pc(11) int local11 = 0; local11 < Static544.aClass240ArrayArray1.length; local11++) {
			for (@Pc(15) int local15 = 0; local15 < Static544.aClass240ArrayArray1[local11].length; local15++) {
				Static544.aClass240ArrayArray1[local11][local15] = Static283.aClass240_9;
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!qa;J)V")
	public static void method4123(@OriginalArg(1) Class42 arg0, @OriginalArg(2) long arg1) {
		Static322.anInt9407 = Static129.anInt9539;
		Static543.anInt6966 = 0;
		Static129.anInt9539 = 0;
		@Pc(14) long local14 = Static76.method1679();
		for (@Pc(19) Class7_Sub3 local19 = (Class7_Sub3) Static5.aClass149_1.method3989(); local19 != null; local19 = (Class7_Sub3) Static5.aClass149_1.method3986()) {
			if (local19.method4192(arg0, arg1)) {
				Static543.anInt6966++;
			}
		}
		if (Static98.aBoolean194 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static5.aClass149_1.method3982() + ", running: " + Static543.anInt6966 + ". Particles: " + Static129.anInt9539 + ". Time taken: " + (Static76.method1679() - local14) + "ms");
		}
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(II)I")
	public static int method4125(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIIIZI)V")
	public static void method4126(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5) {
		Static361.method5626(arg3, arg0, 0, arg4, arg5, arg1, arg2);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)Z")
	public static boolean method4128(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}
}
