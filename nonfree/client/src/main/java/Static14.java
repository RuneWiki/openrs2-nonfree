import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!bc", name = "L", descriptor = "I")
	public static int anInt379 = 0;

	@OriginalMember(owner = "client!bc", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString32 = "Loading interfaces - ";

	@OriginalMember(owner = "client!bc", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString33 = "purple:";

	@OriginalMember(owner = "client!bc", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString34 = "wave:";

	@OriginalMember(owner = "client!bc", name = "V", descriptor = "Lclient!jl;")
	public static Class89 aClass89_3 = new Class89(64);

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!ia;IIIIIIZ)V")
	public static void method355(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(3) int local3 = arg0.anIntArray252.length;
		@Pc(5) int local5;
		@Pc(15) int local15;
		@Pc(22) int local22;
		@Pc(29) int local29;
		@Pc(39) int local39;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray252[local5] - Static215.anInt4665;
			local22 = arg0.anIntArray255[local5] - Static296.anInt5905;
			local29 = arg0.anIntArray253[local5] - Static2.anInt53;
			local39 = local29 * arg3 + local15 * arg4 >> 16;
			@Pc(49) int local49 = local29 * arg4 - local15 * arg3 >> 16;
			@Pc(61) int local61 = local22 * arg2 - local49 * arg1 >> 16;
			@Pc(71) int local71 = local22 * arg1 + local49 * arg2 >> 16;
			if (local71 < 50) {
				return;
			}
			if (arg0.anIntArray254 != null) {
				Static110.anIntArray250[local5] = local39;
				Static110.anIntArray251[local5] = local61;
				Static110.anIntArray245[local5] = local71;
			}
			Static110.anIntArray249[local5] = Static237.anInt4974 + (local39 << 9) / local71;
			Static110.anIntArray247[local5] = Static237.anInt4975 + (local61 << 9) / local71;
		}
		Static237.anInt4973 = 0;
		local3 = arg0.anIntArray242.length;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray242[local5];
			local22 = arg0.anIntArray243[local5];
			local29 = arg0.anIntArray248[local5];
			local39 = Static110.anIntArray249[local15];
			@Pc(148) int local148 = Static110.anIntArray249[local22];
			@Pc(152) int local152 = Static110.anIntArray249[local29];
			@Pc(156) int local156 = Static110.anIntArray247[local15];
			@Pc(160) int local160 = Static110.anIntArray247[local22];
			@Pc(164) int local164 = Static110.anIntArray247[local29];
			if ((local39 - local148) * (local164 - local160) - (local156 - local160) * (local152 - local148) > 0) {
				if (Static161.aBoolean231 && Static251.method4183(Static206.anInt4450 + Static237.anInt4974, Static87.anInt2040 + Static237.anInt4975, local156, local160, local164, local39, local148, local152)) {
					Static118.anInt2549 = arg5;
					Static170.anInt3813 = arg6;
				}
				if (!Static294.aBoolean367 && !arg7) {
					Static237.aBoolean307 = false;
					if (local39 < 0 || local148 < 0 || local152 < 0 || local39 > Static237.anInt4976 || local148 > Static237.anInt4976 || local152 > Static237.anInt4976) {
						Static237.aBoolean307 = true;
					}
					if (arg0.anIntArray254 == null || arg0.anIntArray254[local5] == -1) {
						if (arg0.anIntArray246[local5] != 12345678) {
							Static237.method3751(local156, local160, local164, local39, local148, local152, arg0.anIntArray246[local5], arg0.anIntArray244[local5], arg0.anIntArray256[local5]);
						}
					} else if (!Static282.aBoolean355) {
						@Pc(373) int local373 = Static237.anInterface1_1.method4597(arg0.anIntArray254[local5]);
						Static237.method3751(local156, local160, local164, local39, local148, local152, Static160.method2561(local373, arg0.anIntArray246[local5]), Static160.method2561(local373, arg0.anIntArray244[local5]), Static160.method2561(local373, arg0.anIntArray256[local5]));
					} else if (arg0.aBoolean153) {
						Static237.method3739(local156, local160, local164, local39, local148, local152, arg0.anIntArray246[local5], arg0.anIntArray244[local5], arg0.anIntArray256[local5], Static110.anIntArray250[0], Static110.anIntArray250[1], Static110.anIntArray250[3], Static110.anIntArray251[0], Static110.anIntArray251[1], Static110.anIntArray251[3], Static110.anIntArray245[0], Static110.anIntArray245[1], Static110.anIntArray245[3], arg0.anIntArray254[local5]);
					} else {
						Static237.method3739(local156, local160, local164, local39, local148, local152, arg0.anIntArray246[local5], arg0.anIntArray244[local5], arg0.anIntArray256[local5], Static110.anIntArray250[local15], Static110.anIntArray250[local22], Static110.anIntArray250[local29], Static110.anIntArray251[local15], Static110.anIntArray251[local22], Static110.anIntArray251[local29], Static110.anIntArray245[local15], Static110.anIntArray245[local22], Static110.anIntArray245[local29], arg0.anIntArray254[local5]);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(CB)C")
	public static char method358(@OriginalArg(0) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIZI)I")
	public static int method361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if ((arg3 & 0x1) == 1) {
			@Pc(23) int local23 = arg2;
			arg2 = arg5;
			arg5 = local23;
		}
		@Pc(31) int local31 = arg4 & 0x3;
		if (local31 == 0) {
			return arg1;
		} else if (local31 == 1) {
			return arg0;
		} else if (local31 == 2) {
			return 1 + 7 - arg2 - arg1;
		} else {
			return 8 - arg0 - arg5;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IFIBZIII)[I")
	public static int[] method362(@OriginalArg(1) float arg0) {
		@Pc(12) int[] local12 = new int[2048];
		@Pc(16) Class1_Sub1_Sub33 local16 = new Class1_Sub1_Sub33();
		local16.anInt5199 = (int) (arg0 * 4096.0F);
		local16.anInt5193 = 35;
		local16.aBoolean322 = true;
		local16.anInt5198 = 8;
		local16.anInt5194 = 4;
		local16.anInt5196 = 8;
		local16.method4720();
		Static269.method4050(2048, 1);
		local16.method3941(local12, 0);
		return local12;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(B)Lclient!nc;")
	public static Class1_Sub3_Sub15 method364() {
		return Static268.aClass1_Sub3_Sub15_2;
	}
}
