import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!qk", name = "r", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray36 = new String[100];

	@OriginalMember(owner = "client!qk", name = "w", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray37 = new String[100];

	@OriginalMember(owner = "client!qk", name = "x", descriptor = "[I")
	public static final int[] anIntArray392 = new int[13];

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!za;Lclient!um;ZLclient!um;)V")
	public static void method4371(@OriginalArg(0) Class200 arg0, @OriginalArg(1) Class243 arg1, @OriginalArg(3) Class243 arg2) {
		Static113.aClass14_5 = Static215.method2844(Static425.anInt7119, arg2);
		Static138.aClass23_2 = arg0.method5837(Static113.aClass14_5, Static470.method4679(arg1, Static425.anInt7119));
		Static51.aClass14_4 = Static215.method2844(Static147.anInt2653, arg2);
		Static428.aClass23_4 = arg0.method5837(Static51.aClass14_4, Static470.method4679(arg1, Static147.anInt2653));
		Static21.aClass14_1 = Static215.method2844(Static54.anInt951, arg2);
		Static56.aClass23_1 = arg0.method5837(Static21.aClass14_1, Static470.method4679(arg1, Static54.anInt951));
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIII)V")
	public static void method4372(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static391.method5106(Static356.anInt5817, arg4, Static3.anInt46);
		@Pc(17) int local17 = Static391.method5106(Static356.anInt5817, arg1, Static3.anInt46);
		@Pc(23) int local23 = Static391.method5106(Static3.anInt45, arg2, Static112.anInt1900);
		@Pc(29) int local29 = Static391.method5106(Static3.anInt45, arg0, Static112.anInt1900);
		for (@Pc(31) int local31 = local11; local31 <= local17; local31++) {
			Static291.method3606(local29, Static133.anIntArrayArray15[local31], arg3, local23);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V")
	public static void method4373() {
		if (Static376.anInt6324 == 2) {
			Static407.method5394(3);
		} else if (Static376.anInt6324 == 6) {
			Static407.method5394(7);
			return;
		} else if (Static376.anInt6324 == 9) {
			Static407.method5394(10);
			return;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!gt;B)I")
	public static int method4374(@OriginalArg(1) Class93 arg0) {
		return -1;
	}
}
