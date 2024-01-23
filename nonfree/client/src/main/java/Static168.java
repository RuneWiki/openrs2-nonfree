import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray81;

	@OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
	public static int anInt5510;

	@OriginalMember(owner = "client!nb", name = "A", descriptor = "Lclient!lg;")
	public static Class102 aClass102_11;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)Lclient!qa;")
	public static Class8_Sub1_Sub13 method4141(@OriginalArg(1) int arg0) {
		@Pc(18) Class8_Sub1_Sub13 local18 = (Class8_Sub1_Sub13) Static85.aClass125_22.method2957((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static249.aClass132_85.method3194(11, arg0);
		local18 = new Class8_Sub1_Sub13();
		if (local28 != null) {
			local18.method3306(new Class8_Sub2(local28));
		}
		Static85.aClass125_22.method2956((long) arg0, local18);
		return local18;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIII)V")
	public static void method4145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static244.anInt4872 < arg2 || arg1 < Static228.anInt4643) {
			return;
		}
		@Pc(23) boolean local23;
		if (Static253.anInt4996 > arg0) {
			arg0 = Static253.anInt4996;
			local23 = false;
		} else if (Static52.anInt1146 < arg0) {
			arg0 = Static52.anInt1146;
			local23 = false;
		} else {
			local23 = true;
		}
		@Pc(49) boolean local49;
		if (Static253.anInt4996 > arg4) {
			local49 = false;
			arg4 = Static253.anInt4996;
		} else if (Static52.anInt1146 >= arg4) {
			local49 = true;
		} else {
			local49 = false;
			arg4 = Static52.anInt1146;
		}
		if (arg2 < Static228.anInt4643) {
			arg2 = Static228.anInt4643;
		} else {
			Static19.method343(arg0, arg3, Static181.anIntArrayArray19[arg2++], arg4);
		}
		if (Static244.anInt4872 >= arg1) {
			Static19.method343(arg0, arg3, Static181.anIntArrayArray19[arg1--], arg4);
		} else {
			arg1 = Static244.anInt4872;
		}
		@Pc(110) int local110;
		if (local23 && local49) {
			for (local110 = arg2; local110 <= arg1; local110++) {
				@Pc(117) int[] local117 = Static181.anIntArrayArray19[local110];
				local117[arg0] = local117[arg4] = arg3;
			}
		} else if (local23) {
			for (local110 = arg2; local110 <= arg1; local110++) {
				Static181.anIntArrayArray19[local110][arg0] = arg3;
			}
		} else if (local49) {
			for (local110 = arg2; local110 <= arg1; local110++) {
				Static181.anIntArrayArray19[local110][arg4] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!aj;B)Ljava/lang/String;")
	public static String method4147(@OriginalArg(0) Class8_Sub2 arg0) {
		return Static299.method4322(arg0);
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(BI)I")
	public static int method4151(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(SB)Z")
	public static boolean method4156(@OriginalArg(0) short arg0) {
		if (arg0 == 35 || arg0 == 15 || arg0 == 2 || arg0 == 37 || arg0 == 36 || arg0 == 1 || arg0 == 29 || arg0 == 14) {
			return true;
		} else if (arg0 == 42 || arg0 == 19 || arg0 == 1006 || arg0 == 1004) {
			return true;
		} else if (arg0 == 51 || arg0 == 28 || arg0 == 13 || arg0 == 43 || arg0 == 33) {
			return true;
		} else {
			return arg0 == 24 || arg0 == 9 || arg0 == 26 || arg0 == 32 || arg0 == 8 || arg0 == 25;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI[BI)Z")
	public static boolean method4157(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class8_Sub2 local10 = new Class8_Sub2(arg1);
		@Pc(12) int local12 = -1;
		@Pc(14) boolean local14 = true;
		label72: while (true) {
			@Pc(18) int local18 = local10.method2320();
			if (local18 == 0) {
				return local14;
			}
			local12 += local18;
			@Pc(27) int local27 = 0;
			@Pc(29) boolean local29 = false;
			while (true) {
				@Pc(68) int local68;
				@Pc(93) Class70 local93;
				do {
					@Pc(62) int local62;
					@Pc(72) int local72;
					do {
						do {
							do {
								do {
									@Pc(35) int local35;
									while (local29) {
										local35 = local10.method2382();
										if (local35 == 0) {
											continue label72;
										}
										local10.method2334();
									}
									local35 = local10.method2382();
									if (local35 == 0) {
										continue label72;
									}
									local27 += local35 - 1;
									@Pc(54) int local54 = local27 >> 6 & 0x3F;
									@Pc(58) int local58 = local27 & 0x3F;
									local62 = arg2 + local54;
									local68 = local10.method2334() >> 2;
									local72 = arg0 + local58;
								} while (local62 <= 0);
							} while (local72 <= 0);
						} while (local62 >= 103);
					} while (local72 >= 103);
					local93 = Static235.method3578(local12);
				} while (local68 == 22 && !Static113.aBoolean182 && local93.anInt2045 == 0 && local93.anInt2064 != 1 && !local93.aBoolean150);
				if (!local93.method1586()) {
					Static4.anInt46++;
					local14 = false;
				}
				local29 = true;
			}
		}
	}
}
