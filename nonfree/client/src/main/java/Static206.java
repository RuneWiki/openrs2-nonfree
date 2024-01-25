import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!lo", name = "i", descriptor = "I")
	public static int anInt3639;

	@OriginalMember(owner = "client!lo", name = "n", descriptor = "[I")
	public static int[] anIntArray393;

	@OriginalMember(owner = "client!lo", name = "s", descriptor = "F")
	public static float aFloat36;

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "Z")
	public static boolean aBoolean264 = false;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IILclient!bj;ZIIIIILclient!bj;)V")
	public static void method3188(@OriginalArg(0) int arg0, @OriginalArg(2) Class28_Sub1_Sub1 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) Class28_Sub1_Sub1 arg6) {
		@Pc(7) int local7 = arg6.method4013();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class110 local21 = (Class110) Static171.aClass139_36.method3076((long) local7);
		if (local21 == null) {
			@Pc(28) Class127[] local28 = Static402.method2809(Static77.aClass20_19, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static347.aClass155_9.method4869(local28[0]);
			Static171.aClass139_36.method3070(local21, (long) local7);
		}
		Static302.method4687(arg0 >> 1, arg1.method4009() * 64, arg2 >> 1, 0, arg1.aByte73, arg1.anInt5766, arg1.anInt5774);
		@Pc(74) int local74 = Static267.anIntArray621[0] + arg3 - 18;
		@Pc(84) int local84 = arg4 + Static267.anIntArray621[1] - 54 - 16;
		@Pc(92) int local92 = local74 + arg5 / 4 * 18;
		@Pc(100) int local100 = local84 + arg5 % 4 * 18;
		local21.method5094(local92, local100);
		if (arg1 == arg6) {
			Static347.aClass155_9.method4885(18, -256, 18, local100 - 1, local92 + -1);
		}
		@Pc(122) Class12_Sub3 local122 = Static210.method3275();
		local122.anInt2133 = local100 + 16;
		local122.aClass28_Sub1_Sub1_1 = arg6;
		local122.anInt2136 = local92 + 16;
		local122.anInt2134 = local100;
		local122.anInt2132 = local92;
		Static26.aClass22_3.method286(local122);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IILclient!b;ZIBI)V")
	public static void method3189(@OriginalArg(0) int arg0, @OriginalArg(2) Class20 arg1, @OriginalArg(6) int arg2) {
		Static113.anInt2187 = arg0;
		Static48.aClass20_16 = arg1;
		Static317.anInt4554 = 0;
		Static249.aBoolean503 = false;
		Static83.anInt1721 = arg2;
		Static175.anInt3065 = 1;
		Static120.anInt2268 = 2;
	}
}
