import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "Z")
	public static boolean aBoolean247 = false;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIILclient!cf;)V")
	public static void method3372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub2 arg4) {
		@Pc(4) Class189 local4 = Static396.method5419(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt6619 = (arg1 << Static301.anInt2759) + Static25.anInt7191;
		arg4.anInt6620 = arg3;
		arg4.anInt6618 = (arg2 << Static301.anInt2759) + Static25.anInt7191;
		for (@Pc(28) Class242 local28 = local4.aClass242_2; local28 != null; local28 = local28.aClass242_4) {
			if (local28.aClass3_Sub3_2.aBoolean450) {
				@Pc(38) int local38 = local28.aClass3_Sub3_2.method5503();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt6620 += local8;
			arg4.aBoolean448 = true;
		}
		local4.aClass3_Sub2_1 = arg4;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZI)V")
	public static void method3376(@OriginalArg(0) boolean arg0) {
		Static65.method1235(Static313.anInt5099, Static235.anInt4053, Static381.anInt6279, arg0);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZIIIIII)V")
	public static void method3378(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) Class107[] local7 = Static190.aClass107Array1;
		for (@Pc(14) int local14 = 0; local14 < local7.length; local14++) {
			@Pc(20) Class107 local20 = local7[local14];
			if (local20 != null && local20.anInt2681 == 2) {
				Static195.method3066(local20.anInt2684, local20.anInt2688, local20.anInt2685, arg0 >> 1, arg3 >> 1, local20.anInt2686 * 2);
				if (Static363.anIntArray538[0] > -1 && Static125.anInt2225 % 20 < 10) {
					Static252.aClass12Array13[local20.anInt2690].method5665(arg2 + Static363.anIntArray538[0] - 12, Static363.anIntArray538[1] + -28 + arg1);
				}
			}
		}
	}
}
