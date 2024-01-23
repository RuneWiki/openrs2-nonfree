import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "Lclient!cg;")
	public static Class22 aClass22_48;

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
	public static int anInt2772;

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
	public static int anInt2773 = -2;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!wk;IIIIIIZ)V")
	public static void method2237(@OriginalArg(0) Class187 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(3) int local3 = arg0.anIntArray483.length;
		@Pc(5) int local5;
		@Pc(15) int local15;
		@Pc(22) int local22;
		@Pc(29) int local29;
		@Pc(39) int local39;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray483[local5] - Static54.anInt1239;
			local22 = arg0.anIntArray473[local5] - Static222.anInt4471;
			local29 = arg0.anIntArray482[local5] - Static179.anInt3613;
			local39 = local29 * arg3 + local15 * arg4 >> 16;
			@Pc(49) int local49 = local29 * arg4 - local15 * arg3 >> 16;
			@Pc(61) int local61 = local22 * arg2 - local49 * arg1 >> 16;
			@Pc(71) int local71 = local22 * arg1 + local49 * arg2 >> 16;
			if (local71 < 50) {
				return;
			}
			if (arg0.anIntArray475 != null) {
				Static306.anIntArray485[local5] = local39;
				Static306.anIntArray487[local5] = local61;
				Static306.anIntArray484[local5] = local71;
			}
			Static306.anIntArray480[local5] = Static283.anInt5539 + (local39 << 9) / local71;
			Static306.anIntArray477[local5] = Static283.anInt5542 + (local61 << 9) / local71;
		}
		Static283.anInt5541 = 0;
		local3 = arg0.anIntArray474.length;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray474[local5];
			local22 = arg0.anIntArray486[local5];
			local29 = arg0.anIntArray481[local5];
			local39 = Static306.anIntArray480[local15];
			@Pc(148) int local148 = Static306.anIntArray480[local22];
			@Pc(152) int local152 = Static306.anIntArray480[local29];
			@Pc(156) int local156 = Static306.anIntArray477[local15];
			@Pc(160) int local160 = Static306.anIntArray477[local22];
			@Pc(164) int local164 = Static306.anIntArray477[local29];
			if ((local39 - local148) * (local164 - local160) - (local156 - local160) * (local152 - local148) > 0) {
				if (Static201.aBoolean247 && Static33.method643(Static176.anInt5578 + Static283.anInt5539, Static191.anInt3883 + Static283.anInt5542, local156, local160, local164, local39, local148, local152)) {
					Static113.anInt2263 = arg5;
					Static108.anInt2153 = arg6;
				}
				if (!Static251.aBoolean330 && !arg7) {
					Static283.aBoolean376 = false;
					if (local39 < 0 || local148 < 0 || local152 < 0 || local39 > Static283.anInt5540 || local148 > Static283.anInt5540 || local152 > Static283.anInt5540) {
						Static283.aBoolean376 = true;
					}
					if (arg0.anIntArray475 == null || arg0.anIntArray475[local5] == -1) {
						if (arg0.anIntArray476[local5] != 12345678) {
							Static283.method4427(local156, local160, local164, local39, local148, local152, arg0.anIntArray476[local5], arg0.anIntArray479[local5], arg0.anIntArray478[local5]);
						}
					} else if (!Static208.aBoolean248) {
						@Pc(373) int local373 = Static283.anInterface1_1.method2431(arg0.anIntArray475[local5]);
						Static283.method4427(local156, local160, local164, local39, local148, local152, Static199.method2418(local373, arg0.anIntArray476[local5]), Static199.method2418(local373, arg0.anIntArray479[local5]), Static199.method2418(local373, arg0.anIntArray478[local5]));
					} else if (arg0.aBoolean409) {
						Static283.method4411(local156, local160, local164, local39, local148, local152, arg0.anIntArray476[local5], arg0.anIntArray479[local5], arg0.anIntArray478[local5], Static306.anIntArray485[0], Static306.anIntArray485[1], Static306.anIntArray485[3], Static306.anIntArray487[0], Static306.anIntArray487[1], Static306.anIntArray487[3], Static306.anIntArray484[0], Static306.anIntArray484[1], Static306.anIntArray484[3], arg0.anIntArray475[local5]);
					} else {
						Static283.method4411(local156, local160, local164, local39, local148, local152, arg0.anIntArray476[local5], arg0.anIntArray479[local5], arg0.anIntArray478[local5], Static306.anIntArray485[local15], Static306.anIntArray485[local22], Static306.anIntArray485[local29], Static306.anIntArray487[local15], Static306.anIntArray487[local22], Static306.anIntArray487[local29], Static306.anIntArray484[local15], Static306.anIntArray484[local22], Static306.anIntArray484[local29], arg0.anIntArray475[local5]);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZII)V")
	public static void method2239(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static287.anIntArray454[arg0] = arg1;
		@Pc(10) Class4_Sub4 local10 = (Class4_Sub4) Static278.aClass163_35.method4188((long) arg0);
		if (local10 == null) {
			local10 = new Class4_Sub4(4611686018427387905L);
			Static278.aClass163_35.method4181((long) arg0, local10);
		} else if (local10.aLong16 != 4611686018427387905L) {
			local10.aLong16 = Static61.method1150() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)V")
	public static void method2240(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static48.method951(arg0)) {
			return;
		}
		@Pc(24) Class97[] local24 = Static217.aClass97ArrayArray1[arg0];
		for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
			@Pc(34) Class97 local34 = local24[local26];
			if (local34.anObjectArray5 != null) {
				@Pc(43) Class4_Sub23 local43 = new Class4_Sub23();
				local43.aClass97_15 = local34;
				local43.anObjectArray32 = local34.anObjectArray5;
				Static33.method644(2000000, local43);
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(SLjava/lang/String;Ljava/lang/String;IIJII)V")
	public static void method2241(@OriginalArg(0) short arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) long arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static137.aBoolean176 || Static286.anInt5602 >= 500) {
			return;
		}
		Static52.aStringArray6[Static286.anInt5602] = arg2;
		Static156.aStringArray21[Static286.anInt5602] = arg1;
		Static102.anIntArray167[Static286.anInt5602] = arg3 == -1 ? Static60.anInt1341 : arg3;
		Static256.aShortArray81[Static286.anInt5602] = arg0;
		Static30.aLongArray2[Static286.anInt5602] = arg4;
		Static282.anIntArray439[Static286.anInt5602] = arg6;
		Static49.anIntArray117[Static286.anInt5602] = arg5;
		Static286.anInt5602++;
	}
}
