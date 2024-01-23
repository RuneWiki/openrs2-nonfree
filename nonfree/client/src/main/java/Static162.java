import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!mf", name = "n", descriptor = "[I")
	public static int[] anIntArray308;

	@OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
	public static int anInt3470;

	@OriginalMember(owner = "client!mf", name = "s", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString198 = "shake:";

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString199 = "yellow:";

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
	public static int anInt3469 = -1;

	@OriginalMember(owner = "client!mf", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString200 = "K";

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(III[Lclient!la;Z[B)V")
	public static void method2796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class92[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(6) Class1_Sub11 local6 = new Class1_Sub11(arg4);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local6.method2656();
			if (local16 == 0) {
				return;
			}
			@Pc(22) int local22 = 0;
			local12 += local16;
			while (true) {
				@Pc(30) int local30 = local6.method2664();
				if (local30 == 0) {
					break;
				}
				local22 += local30 - 1;
				@Pc(42) int local42 = local22 & 0x3F;
				@Pc(46) int local46 = local22 >> 12;
				@Pc(50) int local50 = local6.method2690();
				@Pc(56) int local56 = local22 >> 6 & 0x3F;
				@Pc(60) int local60 = local50 >> 2;
				@Pc(64) int local64 = local56 + arg0;
				@Pc(68) int local68 = local50 & 0x3;
				@Pc(72) int local72 = arg1 + local42;
				if (local64 > 0 && local72 > 0 && local64 < 103 && local72 < 103) {
					@Pc(91) Class92 local91 = null;
					if (!arg3) {
						@Pc(95) int local95 = local46;
						if ((Static260.aByteArrayArrayArray25[1][local64][local72] & 0x2) == 2) {
							local95 = local46 - 1;
						}
						if (local95 >= 0) {
							local91 = arg2[local95];
						}
					}
					Static2.method135(local68, local46, local91, local60, !arg3, local46, arg3, local12, local72, local64);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!vh;IIIIIIZ)V")
	public static void method2798(@OriginalArg(0) Class172 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(3) int local3 = arg0.anIntArray532.length;
		@Pc(5) int local5;
		@Pc(15) int local15;
		@Pc(22) int local22;
		@Pc(29) int local29;
		@Pc(39) int local39;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray532[local5] - Static215.anInt4270;
			local22 = arg0.anIntArray529[local5] - Static197.anInt4046;
			local29 = arg0.anIntArray528[local5] - Static273.anInt5322;
			local39 = local29 * arg3 + local15 * arg4 >> 16;
			@Pc(49) int local49 = local29 * arg4 - local15 * arg3 >> 16;
			@Pc(61) int local61 = local22 * arg2 - local49 * arg1 >> 16;
			@Pc(71) int local71 = local22 * arg1 + local49 * arg2 >> 16;
			if (local71 < 50) {
				return;
			}
			if (arg0.anIntArray523 != null) {
				Static280.anIntArray533[local5] = local39;
				Static280.anIntArray530[local5] = local61;
				Static280.anIntArray525[local5] = local71;
			}
			Static280.anIntArray531[local5] = Static110.anInt2551 + (local39 << 9) / local71;
			Static280.anIntArray522[local5] = Static110.anInt2554 + (local61 << 9) / local71;
		}
		Static110.anInt2555 = 0;
		local3 = arg0.anIntArray520.length;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray520[local5];
			local22 = arg0.anIntArray526[local5];
			local29 = arg0.anIntArray534[local5];
			local39 = Static280.anIntArray531[local15];
			@Pc(148) int local148 = Static280.anIntArray531[local22];
			@Pc(152) int local152 = Static280.anIntArray531[local29];
			@Pc(156) int local156 = Static280.anIntArray522[local15];
			@Pc(160) int local160 = Static280.anIntArray522[local22];
			@Pc(164) int local164 = Static280.anIntArray522[local29];
			if ((local39 - local148) * (local164 - local160) - (local156 - local160) * (local152 - local148) > 0) {
				if (Static88.aBoolean140 && Static253.method3877(Static266.anInt3887 + Static110.anInt2551, Static53.anInt5283 + Static110.anInt2554, local156, local160, local164, local39, local148, local152)) {
					Static258.anInt5067 = arg5;
					Static296.anInt5586 = arg6;
				}
				if (!Static277.aBoolean412 && !arg7) {
					Static110.aBoolean181 = false;
					if (local39 < 0 || local148 < 0 || local152 < 0 || local39 > Static110.anInt2553 || local148 > Static110.anInt2553 || local152 > Static110.anInt2553) {
						Static110.aBoolean181 = true;
					}
					if (arg0.anIntArray523 == null || arg0.anIntArray523[local5] == -1) {
						if (arg0.anIntArray524[local5] != 12345678) {
							Static110.method2029(local156, local160, local164, local39, local148, local152, arg0.anIntArray524[local5], arg0.anIntArray521[local5], arg0.anIntArray527[local5]);
						}
					} else if (!Static23.aBoolean37) {
						@Pc(373) int local373 = Static110.anInterface2_1.method2266(arg0.anIntArray523[local5]);
						Static110.method2029(local156, local160, local164, local39, local148, local152, Static166.method2880(local373, arg0.anIntArray524[local5]), Static166.method2880(local373, arg0.anIntArray521[local5]), Static166.method2880(local373, arg0.anIntArray527[local5]));
					} else if (arg0.aBoolean422) {
						Static110.method2024(local156, local160, local164, local39, local148, local152, arg0.anIntArray524[local5], arg0.anIntArray521[local5], arg0.anIntArray527[local5], Static280.anIntArray533[0], Static280.anIntArray533[1], Static280.anIntArray533[3], Static280.anIntArray530[0], Static280.anIntArray530[1], Static280.anIntArray530[3], Static280.anIntArray525[0], Static280.anIntArray525[1], Static280.anIntArray525[3], arg0.anIntArray523[local5]);
					} else {
						Static110.method2024(local156, local160, local164, local39, local148, local152, arg0.anIntArray524[local5], arg0.anIntArray521[local5], arg0.anIntArray527[local5], Static280.anIntArray533[local15], Static280.anIntArray533[local22], Static280.anIntArray533[local29], Static280.anIntArray530[local15], Static280.anIntArray530[local22], Static280.anIntArray530[local29], Static280.anIntArray525[local15], Static280.anIntArray525[local22], Static280.anIntArray525[local29], arg0.anIntArray523[local5]);
					}
				}
			}
		}
	}
}
