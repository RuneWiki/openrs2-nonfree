import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
	public static int anInt1604;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "Lclient!ec;")
	public static Class46 aClass46_10 = new Class46(64);

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "Lclient!mn;")
	public static Class115 aClass115_8 = null;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(JZZ)V")
	public static void method1368(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == 0L) {
			return;
		}
		if (Static11.anInt296 >= 100) {
			Static173.method2979("", Static44.aString53, 0);
			return;
		}
		@Pc(27) String local27 = Static77.method1383(arg0);
		@Pc(29) int local29;
		for (local29 = 0; local29 < Static11.anInt296; local29++) {
			if (arg0 == Static281.aLongArray23[local29]) {
				Static173.method2979("", local27 + Static165.aString169, 0);
				return;
			}
		}
		for (local29 = 0; local29 < Static151.anInt3192; local29++) {
			if (arg0 == Static67.aLongArray25[local29]) {
				Static173.method2979("", Static279.aString277 + local27 + Static192.aString199, 0);
				return;
			}
		}
		if (local27.equals(Static111.aClass36_Sub3_Sub2_1.aString249)) {
			Static173.method2979("", Static76.aString83, 0);
			return;
		}
		Static281.aLongArray23[Static11.anInt296] = arg0;
		Static105.aStringArray8[Static11.anInt296] = Static219.method3699(arg0);
		Static76.aBooleanArray6[Static11.anInt296++] = arg1;
		Static184.anInt3910 = Static13.anInt334;
		Static95.aClass2_Sub26_Sub1_1.method4287(253);
		Static95.aClass2_Sub26_Sub1_1.method4225(arg0);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!ke;IIIIIIZ)V")
	public static void method1369(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(3) int local3 = arg0.anIntArray192.length;
		@Pc(5) int local5;
		@Pc(15) int local15;
		@Pc(22) int local22;
		@Pc(29) int local29;
		@Pc(39) int local39;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray192[local5] - Static77.anInt1648;
			local22 = arg0.anIntArray189[local5] - Static189.anInt3965;
			local29 = arg0.anIntArray193[local5] - Static173.anInt3690;
			local39 = local29 * arg3 + local15 * arg4 >> 16;
			@Pc(49) int local49 = local29 * arg4 - local15 * arg3 >> 16;
			@Pc(61) int local61 = local22 * arg2 - local49 * arg1 >> 16;
			@Pc(71) int local71 = local22 * arg1 + local49 * arg2 >> 16;
			if (local71 < 50) {
				return;
			}
			if (arg0.anIntArray198 != null) {
				Static130.anIntArray197[local5] = local39;
				Static130.anIntArray188[local5] = local61;
				Static130.anIntArray195[local5] = local71;
			}
			Static130.anIntArray186[local5] = Static93.anInt2049 + (local39 << 9) / local71;
			Static130.anIntArray187[local5] = Static93.anInt2048 + (local61 << 9) / local71;
		}
		Static93.anInt2047 = 0;
		local3 = arg0.anIntArray190.length;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray190[local5];
			local22 = arg0.anIntArray194[local5];
			local29 = arg0.anIntArray196[local5];
			local39 = Static130.anIntArray186[local15];
			@Pc(148) int local148 = Static130.anIntArray186[local22];
			@Pc(152) int local152 = Static130.anIntArray186[local29];
			@Pc(156) int local156 = Static130.anIntArray187[local15];
			@Pc(160) int local160 = Static130.anIntArray187[local22];
			@Pc(164) int local164 = Static130.anIntArray187[local29];
			if ((local39 - local148) * (local164 - local160) - (local156 - local160) * (local152 - local148) > 0) {
				if (Static116.aBoolean191 && Static243.method3058(Static144.anInt3120 + Static93.anInt2049, Static279.anInt5823 + Static93.anInt2048, local156, local160, local164, local39, local148, local152)) {
					Static217.anInt4542 = arg5;
					Static201.anInt4207 = arg6;
				}
				if (!Static60.aBoolean106 && !arg7) {
					Static93.aBoolean159 = false;
					if (local39 < 0 || local148 < 0 || local152 < 0 || local39 > Static93.anInt2046 || local148 > Static93.anInt2046 || local152 > Static93.anInt2046) {
						Static93.aBoolean159 = true;
					}
					if (arg0.anIntArray198 == null || arg0.anIntArray198[local5] == -1) {
						if (arg0.anIntArray185[local5] != 12345678) {
							Static93.method1727(local156, local160, local164, local39, local148, local152, arg0.anIntArray185[local5], arg0.anIntArray191[local5], arg0.anIntArray199[local5]);
						}
					} else if (!Static96.aBoolean166) {
						@Pc(373) int local373 = Static93.anInterface5_1.method3521(arg0.anIntArray198[local5]);
						Static93.method1727(local156, local160, local164, local39, local148, local152, Static273.method4567(local373, arg0.anIntArray185[local5]), Static273.method4567(local373, arg0.anIntArray191[local5]), Static273.method4567(local373, arg0.anIntArray199[local5]));
					} else if (arg0.aBoolean215) {
						Static93.method1736(local156, local160, local164, local39, local148, local152, arg0.anIntArray185[local5], arg0.anIntArray191[local5], arg0.anIntArray199[local5], Static130.anIntArray197[0], Static130.anIntArray197[1], Static130.anIntArray197[3], Static130.anIntArray188[0], Static130.anIntArray188[1], Static130.anIntArray188[3], Static130.anIntArray195[0], Static130.anIntArray195[1], Static130.anIntArray195[3], arg0.anIntArray198[local5]);
					} else {
						Static93.method1736(local156, local160, local164, local39, local148, local152, arg0.anIntArray185[local5], arg0.anIntArray191[local5], arg0.anIntArray199[local5], Static130.anIntArray197[local15], Static130.anIntArray197[local22], Static130.anIntArray197[local29], Static130.anIntArray188[local15], Static130.anIntArray188[local22], Static130.anIntArray188[local29], Static130.anIntArray195[local15], Static130.anIntArray195[local22], Static130.anIntArray195[local29], arg0.anIntArray198[local5]);
					}
				}
			}
		}
	}
}
