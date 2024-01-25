import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!nfa", name = "d", descriptor = "I")
	public static int anInt6045;

	@OriginalMember(owner = "client!nfa", name = "g", descriptor = "I")
	public static int anInt6048;

	@OriginalMember(owner = "client!nfa", name = "h", descriptor = "Lclient!ps;")
	public static Class273 aClass273_9;

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ZLclient!u;Z)V")
	public static void method5072(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class12_Sub2_Sub1_Sub4_Sub2 arg1) {
		if (Static484.anInt7715 >= 400) {
			return;
		}
		@Pc(12) Class295 local12 = arg1.aClass295_1;
		if (local12.anIntArray493 != null) {
			local12 = local12.method5942(Static426.aClass160_1);
			if (local12 == null) {
				return;
			}
		}
		if (!local12.aBoolean609) {
			return;
		}
		@Pc(30) String local30 = local12.aString112;
		if (local12.anInt7326 != 0) {
			@Pc(49) String local49 = Static18.aClass308_7 == Static283.aClass308_10 ? Static229.aClass159_32.method2776(Static261.anInt4297) : Static229.aClass159_30.method2776(Static261.anInt4297);
			local30 = local30 + Static149.method2056(Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt5822, local12.anInt7326) + " (" + local49 + local12.anInt7326 + ")";
		}
		if (Static355.aBoolean473 && !arg0) {
			@Pc(91) Class57 local91 = Static401.anInt6603 == -1 ? null : Static537.aClass191_2.method3971(Static401.anInt6603);
			if ((Static277.anInt4787 & 0x2) != 0 && (local91 == null || local12.method5944(Static401.anInt6603, local91.anInt1160) != local91.anInt1160)) {
				Static438.method5750(Static434.aString105, 0, 50, (long) arg1.anInt8406, 0, Static196.aString39 + " -> <col=ffff00>" + local30, false, -1, Static251.anInt4193, true);
			}
		}
		if (!arg0) {
			@Pc(141) String[] local141 = local12.aStringArray35;
			if (Static412.aBoolean536) {
				local141 = Static296.method4267(local141);
			}
			@Pc(151) int local151;
			if (local141 != null) {
				for (local151 = 4; local151 >= 0; local151--) {
					if (local141[local151] != null && (local12.aByte107 == 0 || !local141[local151].equalsIgnoreCase(Static229.aClass159_25.method2776(Static261.anInt4297)))) {
						@Pc(171) byte local171 = 0;
						@Pc(173) int local173 = Static183.anInt2722;
						if (local151 == 0) {
							local171 = 47;
						}
						if (local151 == 1) {
							local171 = 13;
						}
						if (local151 == 2) {
							local171 = 58;
						}
						if (local151 == 3) {
							local171 = 16;
						}
						if (local151 == local12.anInt7344) {
							local173 = local12.anInt7360;
						}
						if (local151 == 4) {
							local171 = 48;
						}
						if (local12.anInt7358 == local151) {
							local173 = local12.anInt7347;
						}
						Static438.method5750(local141[local151], 0, local171, (long) arg1.anInt8406, 0, "<col=ffff00>" + local30, false, -1, local141[local151].equalsIgnoreCase(Static229.aClass159_25.method2776(Static261.anInt4297)) ? local12.anInt7339 : local173, true);
					}
				}
			}
			if (local12.aByte107 == 1 && local141 != null) {
				for (local151 = 4; local151 >= 0; local151--) {
					if (local141[local151] != null && local141[local151].equalsIgnoreCase(Static229.aClass159_25.method2776(Static261.anInt4297))) {
						@Pc(290) short local290 = 0;
						if (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt5822 < local12.anInt7326) {
							local290 = 2000;
						}
						@Pc(303) short local303 = 0;
						if (local151 == 0) {
							local303 = 47;
						}
						if (local151 == 1) {
							local303 = 13;
						}
						if (local151 == 2) {
							local303 = 58;
						}
						if (local151 == 3) {
							local303 = 16;
						}
						if (local151 == 4) {
							local303 = 48;
						}
						if (local303 != 0) {
							local303 += local290;
						}
						Static438.method5750(local141[local151], 0, local303, (long) arg1.anInt8406, 0, "<col=ffff00>" + local30, false, -1, local12.anInt7339, true);
					}
				}
			}
		}
		Static438.method5750(Static229.aClass159_24.method2776(Static261.anInt4297), 0, 1006, (long) arg1.anInt8406, 0, "<col=ffff00>" + local30, arg0, -1, Static379.anInt6320, true);
	}
}
