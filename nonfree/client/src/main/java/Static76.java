import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
	public static int anInt1540;

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "[I")
	public static final int[] anIntArray111 = new int[1000];

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!lf;I)I")
	public static int method1319(@OriginalArg(0) Class187 arg0) {
		if (Static622.aClass187_4 == arg0) {
			return 5890;
		} else if (arg0 == Static200.aClass187_1) {
			return 34167;
		} else if (arg0 == Static506.aClass187_3) {
			return 34168;
		} else if (Static456.aClass187_2 == arg0) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)V")
	public static void method1320() {
		Static456.aClass6_Sub40_Sub2_2.method8618();
		@Pc(15) int local15 = Static456.aClass6_Sub40_Sub2_2.method8619(8);
		@Pc(29) int local29;
		if (Static252.anInt5066 > local15) {
			for (local29 = local15; local29 < Static252.anInt5066; local29++) {
				Static283.anIntArray371[Static120.anInt2349++] = Static483.anIntArray525[local29];
			}
		}
		if (Static252.anInt5066 < local15) {
			throw new RuntimeException("gnpov1");
		}
		Static252.anInt5066 = 0;
		for (local29 = 0; local29 < local15; local29++) {
			@Pc(67) int local67 = Static483.anIntArray525[local29];
			@Pc(75) Class20_Sub2_Sub2_Sub1_Sub2 local75 = ((Class6_Sub46) Static347.aClass128_23.method3560((long) local67)).aClass20_Sub2_Sub2_Sub1_Sub2_1;
			@Pc(80) int local80 = Static456.aClass6_Sub40_Sub2_2.method8619(1);
			if (local80 == 0) {
				Static483.anIntArray525[Static252.anInt5066++] = local67;
				local75.anInt5569 = Static430.anInt7816;
			} else {
				@Pc(100) int local100 = Static456.aClass6_Sub40_Sub2_2.method8619(2);
				if (local100 == 0) {
					Static483.anIntArray525[Static252.anInt5066++] = local67;
					local75.anInt5569 = Static430.anInt7816;
					Static73.anIntArray110[Static501.anInt8668++] = local67;
				} else {
					@Pc(147) int local147;
					@Pc(159) int local159;
					if (local100 == 1) {
						Static483.anIntArray525[Static252.anInt5066++] = local67;
						local75.anInt5569 = Static430.anInt7816;
						local147 = Static456.aClass6_Sub40_Sub2_2.method8619(3);
						local75.method4927(1, local147);
						local159 = Static456.aClass6_Sub40_Sub2_2.method8619(1);
						if (local159 == 1) {
							Static73.anIntArray110[Static501.anInt8668++] = local67;
						}
					} else if (local100 == 2) {
						Static483.anIntArray525[Static252.anInt5066++] = local67;
						local75.anInt5569 = Static430.anInt7816;
						if (Static456.aClass6_Sub40_Sub2_2.method8619(1) == 1) {
							local147 = Static456.aClass6_Sub40_Sub2_2.method8619(3);
							local75.method4927(2, local147);
							local159 = Static456.aClass6_Sub40_Sub2_2.method8619(3);
							local75.method4927(2, local159);
						} else {
							local147 = Static456.aClass6_Sub40_Sub2_2.method8619(3);
							local75.method4927(0, local147);
						}
						local147 = Static456.aClass6_Sub40_Sub2_2.method8619(1);
						if (local147 == 1) {
							Static73.anIntArray110[Static501.anInt8668++] = local67;
						}
					} else if (local100 == 3) {
						Static283.anIntArray371[Static120.anInt2349++] = local67;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIIIIIIII)V")
	public static void method1322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (!Static578.method5705(arg5)) {
			return;
		}
		if (Static590.aClass302ArrayArray3[arg5] == null) {
			Static78.method1368(Static605.aClass302ArrayArray4[arg5], -1, arg7, arg3, arg2, arg1, arg8, arg4, arg9, arg6, arg0, arg10);
		} else {
			Static78.method1368(Static590.aClass302ArrayArray3[arg5], -1, arg7, arg3, arg2, arg1, arg8, arg4, arg9, arg6, arg0, arg10);
		}
	}
}
