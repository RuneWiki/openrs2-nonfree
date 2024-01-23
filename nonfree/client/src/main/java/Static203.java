import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!of", name = "L", descriptor = "[B")
	public static byte[] aByteArray47;

	@OriginalMember(owner = "client!of", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString216 = "wishes to trade with you.";

	@OriginalMember(owner = "client!of", name = "K", descriptor = "[S")
	public static short[] aShortArray76 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!of", name = "N", descriptor = "I")
	public static int anInt3903 = 0;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!nk;B)V")
	public static void method3256(@OriginalArg(0) Class121 arg0) {
		Static76.anInt1571 = arg0.method3108("titlebg");
		Static26.anInt443 = arg0.method3108("logo");
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!oo;IIIIIIZ)V")
	public static void method3257(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(3) int local3 = arg0.anIntArray331.length;
		@Pc(5) int local5;
		@Pc(15) int local15;
		@Pc(22) int local22;
		@Pc(29) int local29;
		@Pc(39) int local39;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray331[local5] - Static160.anInt3163;
			local22 = arg0.anIntArray329[local5] - Static193.anInt3671;
			local29 = arg0.anIntArray326[local5] - Static100.anInt2013;
			local39 = local29 * arg3 + local15 * arg4 >> 16;
			@Pc(49) int local49 = local29 * arg4 - local15 * arg3 >> 16;
			@Pc(61) int local61 = local22 * arg2 - local49 * arg1 >> 16;
			@Pc(71) int local71 = local22 * arg1 + local49 * arg2 >> 16;
			if (local71 < 50) {
				return;
			}
			if (arg0.anIntArray320 != null) {
				Static211.anIntArray327[local5] = local39;
				Static211.anIntArray333[local5] = local61;
				Static211.anIntArray325[local5] = local71;
			}
			Static211.anIntArray322[local5] = Static215.anInt4020 + (local39 << 9) / local71;
			Static211.anIntArray319[local5] = Static215.anInt4021 + (local61 << 9) / local71;
		}
		Static215.anInt4023 = 0;
		local3 = arg0.anIntArray328.length;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray328[local5];
			local22 = arg0.anIntArray324[local5];
			local29 = arg0.anIntArray330[local5];
			local39 = Static211.anIntArray322[local15];
			@Pc(148) int local148 = Static211.anIntArray322[local22];
			@Pc(152) int local152 = Static211.anIntArray322[local29];
			@Pc(156) int local156 = Static211.anIntArray319[local15];
			@Pc(160) int local160 = Static211.anIntArray319[local22];
			@Pc(164) int local164 = Static211.anIntArray319[local29];
			if ((local39 - local148) * (local164 - local160) - (local156 - local160) * (local152 - local148) > 0) {
				if (Static218.aBoolean71 && Static315.method4457(Static229.anInt4204 + Static215.anInt4020, Static75.anInt1563 + Static215.anInt4021, local156, local160, local164, local39, local148, local152)) {
					Static66.anInt4309 = arg5;
					Static183.anInt3499 = arg6;
				}
				if (!Static156.aBoolean211 && !arg7) {
					Static215.aBoolean276 = false;
					if (local39 < 0 || local148 < 0 || local152 < 0 || local39 > Static215.anInt4024 || local148 > Static215.anInt4024 || local152 > Static215.anInt4024) {
						Static215.aBoolean276 = true;
					}
					if (arg0.anIntArray320 == null || arg0.anIntArray320[local5] == -1) {
						if (arg0.anIntArray323[local5] != 12345678) {
							Static215.method3366(local156, local160, local164, local39, local148, local152, arg0.anIntArray323[local5], arg0.anIntArray332[local5], arg0.anIntArray321[local5]);
						}
					} else if (!Static102.aBoolean113) {
						@Pc(373) int local373 = Static215.anInterface5_1.method777(arg0.anIntArray320[local5]);
						Static215.method3366(local156, local160, local164, local39, local148, local152, Static244.method3820(local373, arg0.anIntArray323[local5]), Static244.method3820(local373, arg0.anIntArray332[local5]), Static244.method3820(local373, arg0.anIntArray321[local5]));
					} else if (arg0.aBoolean272) {
						Static215.method3376(local156, local160, local164, local39, local148, local152, arg0.anIntArray323[local5], arg0.anIntArray332[local5], arg0.anIntArray321[local5], Static211.anIntArray327[0], Static211.anIntArray327[1], Static211.anIntArray327[3], Static211.anIntArray333[0], Static211.anIntArray333[1], Static211.anIntArray333[3], Static211.anIntArray325[0], Static211.anIntArray325[1], Static211.anIntArray325[3], arg0.anIntArray320[local5]);
					} else {
						Static215.method3376(local156, local160, local164, local39, local148, local152, arg0.anIntArray323[local5], arg0.anIntArray332[local5], arg0.anIntArray321[local5], Static211.anIntArray327[local15], Static211.anIntArray327[local22], Static211.anIntArray327[local29], Static211.anIntArray333[local15], Static211.anIntArray333[local22], Static211.anIntArray333[local29], Static211.anIntArray325[local15], Static211.anIntArray325[local22], Static211.anIntArray325[local29], arg0.anIntArray320[local5]);
					}
				}
			}
		}
	}
}
