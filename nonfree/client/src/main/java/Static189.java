import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "Lclient!ra;")
	public static Class170 aClass170_71;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)V")
	public static void method3464(@OriginalArg(1) int arg0) {
		Static15.anInt503 = arg0;
		@Pc(7) Class66 local7 = Static35.aClass66_8;
		synchronized (Static35.aClass66_8) {
			Static35.aClass66_8.method1933();
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)Z")
	public static boolean method3465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static200.anIntArrayArrayArray16[arg0][arg1][arg2];
		if (local7 == -Static22.anInt574) {
			return false;
		} else if (local7 == Static22.anInt574) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static49.method1101(local22 + 1, Static130.aClass3Array2[arg0].method5638(arg1, arg2), local26 + 1) && Static49.method1101(local22 + 128 - 1, Static130.aClass3Array2[arg0].method5638(arg1 + 1, arg2), local26 + 1) && Static49.method1101(local22 + 128 - 1, Static130.aClass3Array2[arg0].method5638(arg1 + 1, arg2 + 1), local26 + 128 - 1) && Static49.method1101(local22 + 1, Static130.aClass3Array2[arg0].method5638(arg1, arg2 + 1), local26 + 128 - 1)) {
				Static200.anIntArrayArrayArray16[arg0][arg1][arg2] = Static22.anInt574;
				return true;
			} else {
				Static200.anIntArrayArrayArray16[arg0][arg1][arg2] = -Static22.anInt574;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIB)V")
	public static void method3466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static61.anInt1424 = arg1;
		Static8.anInt261 = arg2;
		Static282.anInt5473 = arg3;
		Static93.anInt2158 = arg0;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)J")
	public static long method3467() {
		return Static263.aClass126_1.method5252();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BI)V")
	public static void method3468(@OriginalArg(1) int arg0) {
		@Pc(13) Class5_Sub9_Sub16 local13 = Static239.method4052(9, arg0);
		local13.method4138();
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(BI)V")
	public static void method3469() {
		Static355.aClass66_110.method1944(5);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIII)V")
	public static void method3471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static67.method1489(arg4);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg4 - arg1;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg4;
		@Pc(24) int local24 = -arg4;
		@Pc(26) int local26 = local15;
		@Pc(29) int local29 = -local15;
		@Pc(31) int local31 = -1;
		@Pc(53) int local53;
		@Pc(61) int local61;
		@Pc(70) int local70;
		@Pc(78) int local78;
		if (arg2 >= Static314.anInt6018 && Static334.anInt6315 >= arg2) {
			@Pc(45) int[] local45 = Static332.anIntArrayArray56[arg2];
			local53 = Static133.method5819(Static80.anInt4809, arg5 - arg4, Static184.anInt6250);
			local61 = Static133.method5819(Static80.anInt4809, arg4 + arg5, Static184.anInt6250);
			local70 = Static133.method5819(Static80.anInt4809, arg5 - local15, Static184.anInt6250);
			local78 = Static133.method5819(Static80.anInt4809, local15 + arg5, Static184.anInt6250);
			Static247.method3552(arg0, local53, local45, local70);
			Static247.method3552(arg3, local70, local45, local78);
			Static247.method3552(arg0, local78, local45, local61);
		}
		@Pc(98) int local98 = -1;
		while (local10 < local21) {
			local98 += 2;
			local31 += 2;
			local29 += local98;
			local24 += local31;
			if (local29 >= 0 && local26 >= 1) {
				local26--;
				Static152.anIntArray214[local26] = local10;
				local29 -= local26 << 1;
			}
			local10++;
			@Pc(244) int local244;
			@Pc(253) int local253;
			@Pc(264) int[] local264;
			@Pc(145) int local145;
			if (local24 >= 0) {
				local21--;
				local24 -= local21 << 1;
				local145 = arg2 - local21;
				local53 = arg2 + local21;
				if (local53 >= Static314.anInt6018 && local145 <= Static334.anInt6315) {
					if (local21 >= local15) {
						local61 = Static133.method5819(Static80.anInt4809, local10 + arg5, Static184.anInt6250);
						local70 = Static133.method5819(Static80.anInt4809, arg5 - local10, Static184.anInt6250);
						if (local53 <= Static334.anInt6315) {
							Static247.method3552(arg0, local70, Static332.anIntArrayArray56[local53], local61);
						}
						if (Static314.anInt6018 <= local145) {
							Static247.method3552(arg0, local70, Static332.anIntArrayArray56[local145], local61);
						}
					} else {
						local61 = Static152.anIntArray214[local21];
						local70 = Static133.method5819(Static80.anInt4809, local10 + arg5, Static184.anInt6250);
						local78 = Static133.method5819(Static80.anInt4809, arg5 - local10, Static184.anInt6250);
						local244 = Static133.method5819(Static80.anInt4809, arg5 + local61, Static184.anInt6250);
						local253 = Static133.method5819(Static80.anInt4809, arg5 - local61, Static184.anInt6250);
						if (Static334.anInt6315 >= local53) {
							local264 = Static332.anIntArrayArray56[local53];
							Static247.method3552(arg0, local78, local264, local253);
							Static247.method3552(arg3, local253, local264, local244);
							Static247.method3552(arg0, local244, local264, local70);
						}
						if (Static314.anInt6018 <= local145) {
							local264 = Static332.anIntArrayArray56[local145];
							Static247.method3552(arg0, local78, local264, local253);
							Static247.method3552(arg3, local253, local264, local244);
							Static247.method3552(arg0, local244, local264, local70);
						}
					}
				}
			}
			local145 = arg2 - local10;
			local53 = local10 + arg2;
			if (local53 >= Static314.anInt6018 && Static334.anInt6315 >= local145) {
				local61 = local21 + arg5;
				local70 = arg5 - local21;
				if (local61 >= Static184.anInt6250 && local70 <= Static80.anInt4809) {
					local61 = Static133.method5819(Static80.anInt4809, local61, Static184.anInt6250);
					local70 = Static133.method5819(Static80.anInt4809, local70, Static184.anInt6250);
					if (local15 <= local10) {
						if (Static334.anInt6315 >= local53) {
							Static247.method3552(arg0, local70, Static332.anIntArrayArray56[local53], local61);
						}
						if (local145 >= Static314.anInt6018) {
							Static247.method3552(arg0, local70, Static332.anIntArrayArray56[local145], local61);
						}
					} else {
						local78 = local10 > local26 ? Static152.anIntArray214[local10] : local26;
						local244 = Static133.method5819(Static80.anInt4809, local78 + arg5, Static184.anInt6250);
						local253 = Static133.method5819(Static80.anInt4809, arg5 - local78, Static184.anInt6250);
						if (Static334.anInt6315 >= local53) {
							local264 = Static332.anIntArrayArray56[local53];
							Static247.method3552(arg0, local70, local264, local253);
							Static247.method3552(arg3, local253, local264, local244);
							Static247.method3552(arg0, local244, local264, local61);
						}
						if (Static314.anInt6018 <= local145) {
							local264 = Static332.anIntArrayArray56[local145];
							Static247.method3552(arg0, local70, local264, local253);
							Static247.method3552(arg3, local253, local264, local244);
							Static247.method3552(arg0, local244, local264, local61);
						}
					}
				}
			}
		}
	}
}
