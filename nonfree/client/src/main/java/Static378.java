import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!pn", name = "y", descriptor = "[I")
	public static int[] anIntArray656;

	@OriginalMember(owner = "client!pn", name = "A", descriptor = "F")
	public static float aFloat142;

	@OriginalMember(owner = "client!pn", name = "D", descriptor = "I")
	public static int anInt6739 = 0;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IZZIIII)V")
	public static void method6048(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 >= arg5) {
			return;
		}
		@Pc(19) int local19 = (arg5 + arg0) / 2;
		@Pc(21) int local21 = arg0;
		@Pc(25) Class38_Sub1 local25 = Static529.aClass38_Sub1Array140[local19];
		Static529.aClass38_Sub1Array140[local19] = Static529.aClass38_Sub1Array140[arg5];
		Static529.aClass38_Sub1Array140[arg5] = local25;
		for (@Pc(37) int local37 = arg0; local37 < arg5; local37++) {
			if (Static388.method6206(Static529.aClass38_Sub1Array140[local37], arg1, arg4, arg2, arg3, local25) <= 0) {
				@Pc(57) Class38_Sub1 local57 = Static529.aClass38_Sub1Array140[local37];
				Static529.aClass38_Sub1Array140[local37] = Static529.aClass38_Sub1Array140[local21];
				Static529.aClass38_Sub1Array140[local21++] = local57;
			}
		}
		Static529.aClass38_Sub1Array140[arg5] = Static529.aClass38_Sub1Array140[local21];
		Static529.aClass38_Sub1Array140[local21] = local25;
		method6048(arg0, arg1, arg2, arg3, arg4, local21 - 1);
		method6048(local21 + 1, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IB)V")
	public static void method6049() {
		@Pc(6) Class277 local6 = Static346.aClass277_50;
		synchronized (Static346.aClass277_50) {
			Static346.aClass277_50.method7018(5);
		}
		local6 = Static301.aClass277_42;
		synchronized (Static301.aClass277_42) {
			Static301.aClass277_42.method7018(5);
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IC)Z")
	public static boolean method6050(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
