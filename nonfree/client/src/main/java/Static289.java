import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!w", name = "e", descriptor = "I")
	public static int anInt6096;

	@OriginalMember(owner = "client!w", name = "b", descriptor = "Lclient!hk;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!w", name = "d", descriptor = "I")
	public static int anInt6095 = 0;

	@OriginalMember(owner = "client!w", name = "f", descriptor = "I")
	public static int anInt6097 = 0;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ek;I)V")
	public static void method4725(@OriginalArg(0) Class25_Sub1_Sub2 arg0) {
		for (@Pc(10) Class1_Sub5 local10 = (Class1_Sub5) Static234.aClass131_16.method3791(); local10 != null; local10 = (Class1_Sub5) Static234.aClass131_16.method3792()) {
			if (arg0 == local10.aClass25_Sub1_Sub2_1) {
				if (local10.aClass1_Sub3_Sub4_2 != null) {
					Static245.aClass1_Sub3_Sub1_2.method520(local10.aClass1_Sub3_Sub4_2);
					local10.aClass1_Sub3_Sub4_2 = null;
				}
				local10.method4742();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIII)V")
	public static void method4726(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = arg3;
		@Pc(7) int local7 = -1;
		@Pc(23) int local23 = -arg3;
		Static89.method1538(Static57.anIntArrayArray9[arg1], arg0 + arg3, -arg3 + arg0, arg2);
		while (local5 > local3) {
			local7 += 2;
			local23 += local7;
			local3++;
			if (local23 >= 0) {
				local5--;
				@Pc(62) int[] local62 = Static57.anIntArrayArray9[local5 + arg1];
				local23 -= local5 << 1;
				@Pc(75) int[] local75 = Static57.anIntArrayArray9[arg1 - local5];
				@Pc(79) int local79 = local3 + arg0;
				@Pc(84) int local84 = arg0 - local3;
				Static89.method1538(local62, local79, local84, arg2);
				Static89.method1538(local75, local79, local84, arg2);
			}
			@Pc(101) int local101 = arg0 - local5;
			@Pc(106) int local106 = arg0 + local5;
			@Pc(112) int[] local112 = Static57.anIntArrayArray9[local3 + arg1];
			@Pc(118) int[] local118 = Static57.anIntArrayArray9[arg1 - local3];
			Static89.method1538(local112, local106, local101, arg2);
			Static89.method1538(local118, local106, local101, arg2);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!bj;IIIIIIZ)V")
	public static void method4727(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(3) int local3 = arg0.anIntArray39.length;
		@Pc(5) int local5;
		@Pc(15) int local15;
		@Pc(22) int local22;
		@Pc(29) int local29;
		@Pc(39) int local39;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray39[local5] - Static292.anInt6173;
			local22 = arg0.anIntArray47[local5] - Static114.anInt2499;
			local29 = arg0.anIntArray43[local5] - Static197.anInt4472;
			local39 = local29 * arg3 + local15 * arg4 >> 16;
			@Pc(49) int local49 = local29 * arg4 - local15 * arg3 >> 16;
			@Pc(61) int local61 = local22 * arg2 - local49 * arg1 >> 16;
			@Pc(71) int local71 = local22 * arg1 + local49 * arg2 >> 16;
			if (local71 < 50) {
				return;
			}
			if (arg0.anIntArray44 != null) {
				Static21.anIntArray35[local5] = local39;
				Static21.anIntArray40[local5] = local61;
				Static21.anIntArray45[local5] = local71;
			}
			Static21.anIntArray36[local5] = Static151.anInt3525 + (local39 << 9) / local71;
			Static21.anIntArray33[local5] = Static151.anInt3522 + (local61 << 9) / local71;
		}
		Static151.anInt3526 = 0;
		local3 = arg0.anIntArray37.length;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray37[local5];
			local22 = arg0.anIntArray34[local5];
			local29 = arg0.anIntArray46[local5];
			local39 = Static21.anIntArray36[local15];
			@Pc(148) int local148 = Static21.anIntArray36[local22];
			@Pc(152) int local152 = Static21.anIntArray36[local29];
			@Pc(156) int local156 = Static21.anIntArray33[local15];
			@Pc(160) int local160 = Static21.anIntArray33[local22];
			@Pc(164) int local164 = Static21.anIntArray33[local29];
			if ((local39 - local148) * (local164 - local160) - (local156 - local160) * (local152 - local148) > 0) {
				if (Static292.aBoolean328 && Static52.method1060(Static78.anInt1888 + Static151.anInt3525, Static130.anInt2888 + Static151.anInt3522, local156, local160, local164, local39, local148, local152)) {
					Static62.anInt1579 = arg5;
					Static32.anInt822 = arg6;
				}
				if (!Static296.aBoolean335 && !arg7) {
					Static151.aBoolean181 = false;
					if (local39 < 0 || local148 < 0 || local152 < 0 || local39 > Static151.anInt3523 || local148 > Static151.anInt3523 || local152 > Static151.anInt3523) {
						Static151.aBoolean181 = true;
					}
					if (arg0.anIntArray44 == null || arg0.anIntArray44[local5] == -1) {
						if (arg0.anIntArray41[local5] != 12345678) {
							Static151.method2847(local156, local160, local164, local39, local148, local152, arg0.anIntArray41[local5], arg0.anIntArray42[local5], arg0.anIntArray38[local5]);
						}
					} else if (!Static50.aBoolean80) {
						@Pc(373) int local373 = Static151.anInterface2_1.method4416(arg0.anIntArray44[local5]);
						Static151.method2847(local156, local160, local164, local39, local148, local152, Static142.method2527(local373, arg0.anIntArray41[local5]), Static142.method2527(local373, arg0.anIntArray42[local5]), Static142.method2527(local373, arg0.anIntArray38[local5]));
					} else if (arg0.aBoolean26) {
						Static151.method2840(local156, local160, local164, local39, local148, local152, arg0.anIntArray41[local5], arg0.anIntArray42[local5], arg0.anIntArray38[local5], Static21.anIntArray35[0], Static21.anIntArray35[1], Static21.anIntArray35[3], Static21.anIntArray40[0], Static21.anIntArray40[1], Static21.anIntArray40[3], Static21.anIntArray45[0], Static21.anIntArray45[1], Static21.anIntArray45[3], arg0.anIntArray44[local5]);
					} else {
						Static151.method2840(local156, local160, local164, local39, local148, local152, arg0.anIntArray41[local5], arg0.anIntArray42[local5], arg0.anIntArray38[local5], Static21.anIntArray35[local15], Static21.anIntArray35[local22], Static21.anIntArray35[local29], Static21.anIntArray40[local15], Static21.anIntArray40[local22], Static21.anIntArray40[local29], Static21.anIntArray45[local15], Static21.anIntArray45[local22], Static21.anIntArray45[local29], arg0.anIntArray44[local5]);
					}
				}
			}
		}
	}
}
