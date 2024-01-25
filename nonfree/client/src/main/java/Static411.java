import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!ut", name = "B", descriptor = "[I")
	public static int[] anIntArray506;

	@OriginalMember(owner = "client!ut", name = "K", descriptor = "[I")
	public static int[] anIntArray508;

	@OriginalMember(owner = "client!ut", name = "N", descriptor = "[Lclient!fi;")
	public static Class76[] aClass76Array1;

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIIB)V")
	public static void method6063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg3 * arg3;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg3 << 1;
		@Pc(39) int local39 = local13 * (1 - local29) + local21;
		@Pc(48) int local48 = local17 - local25 * (local29 - 1);
		@Pc(52) int local52 = local13 << 2;
		@Pc(56) int local56 = local17 << 2;
		@Pc(64) int local64 = local21 * 3;
		@Pc(76) int local76 = ((arg3 << 1) - 3) * local25;
		@Pc(82) int local82 = local56;
		@Pc(99) int local99;
		@Pc(108) int local108;
		if (arg2 >= Static172.anInt3442 && Static324.anInt5590 >= arg2) {
			local99 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg0 + arg4);
			local108 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg0 - arg4);
			Static298.method4405(Static62.anIntArrayArray7[arg2], arg1, local99, local108);
		}
		@Pc(122) int local122 = local52 * (arg3 - 1);
		while (local9 > 0) {
			if (local39 < 0) {
				while (local39 < 0) {
					local39 += local64;
					local48 += local82;
					local7++;
					local82 += local56;
					local64 += local56;
				}
			}
			if (local48 < 0) {
				local48 += local82;
				local39 += local64;
				local7++;
				local64 += local56;
				local82 += local56;
			}
			local39 += -local122;
			local48 += -local76;
			local9--;
			local76 -= local52;
			local122 -= local52;
			local99 = arg2 - local9;
			local108 = local9 + arg2;
			if (local108 >= Static172.anInt3442 && local99 <= Static324.anInt5590) {
				@Pc(217) int local217 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, local7 + arg0);
				@Pc(228) int local228 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg0 - local7);
				if (Static172.anInt3442 <= local99) {
					Static298.method4405(Static62.anIntArrayArray7[local99], arg1, local217, local228);
				}
				if (Static324.anInt5590 >= local108) {
					Static298.method4405(Static62.anIntArrayArray7[local108], arg1, local217, local228);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!jo;Z)Z")
	public static boolean method6066(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static55.aClass86Array1 == Static288.aClass86Array3;
		@Pc(8) int local8 = 0;
		@Pc(10) byte local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method5944();
		if (arg0.aShort101 < 0 || arg0.aShort102 < 0 || arg0.aShort100 >= Static229.anInt4189 || arg0.aShort99 >= Static61.anInt1698) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort101; local34 <= arg0.aShort100; local34++) {
			for (local38 = arg0.aShort102; local38 <= arg0.aShort99; local38++) {
				@Pc(45) Class101 local45 = Static217.method3259(arg0.aByte103, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort101) {
						local49++;
					}
					if (local34 < arg0.aShort100) {
						local49 += 4;
					}
					if (local38 > arg0.aShort102) {
						local49 += 8;
					}
					if (local38 < arg0.aShort99) {
						local49 += 2;
					}
					@Pc(74) Class145 local74 = Static21.method607(arg0, local49);
					@Pc(77) Class145 local77 = local45.aClass145_1;
					if (local77 == null) {
						local45.aClass145_1 = local74;
					} else {
						while (local77.aClass145_2 != null) {
							local77 = local77.aClass145_2;
						}
						local77.aClass145_2 = local74;
					}
					local45.aByte41 = (byte) (local45.aByte41 | local49);
					if (local6 && (Static137.anIntArrayArray15[local34][local38] & 0xFF000000) != 0) {
						local8 = Static137.anIntArrayArray15[local34][local38];
						local10 = Static310.aByteArrayArray21[local34][local38];
						local12 = Static316.aByteArrayArray22[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort101; local38 <= arg0.aShort100; local38++) {
				for (@Pc(150) int local150 = arg0.aShort102; local150 <= arg0.aShort99; local150++) {
					if ((Static137.anIntArrayArray15[local38][local150] & 0xFF000000) == 0) {
						Static137.anIntArrayArray15[local38][local150] = local8;
						Static310.aByteArrayArray21[local38][local150] = local10;
						Static316.aByteArrayArray22[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static81.aClass3_Sub2Array1[Static96.anInt5952++] = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(III)Z")
	public static boolean method6068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static175.anIntArrayArrayArray8[arg0][arg1][arg2];
		if (local7 == -Static354.anInt6329) {
			return false;
		} else if (local7 == Static354.anInt6329) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static62.anInt1705;
			@Pc(26) int local26 = arg2 << Static62.anInt1705;
			if (Static75.method1489(local22 + 1, Static55.aClass86Array1[arg0].method6594(arg1, arg2), local26 + 1) && Static75.method1489(local22 + Static168.anInt3377 - 1, Static55.aClass86Array1[arg0].method6594(arg1 + 1, arg2), local26 + 1) && Static75.method1489(local22 + Static168.anInt3377 - 1, Static55.aClass86Array1[arg0].method6594(arg1 + 1, arg2 + 1), local26 + Static168.anInt3377 - 1) && Static75.method1489(local22 + 1, Static55.aClass86Array1[arg0].method6594(arg1, arg2 + 1), local26 + Static168.anInt3377 - 1) && Static75.method1489(local22 + Static437.anInt7761, Static55.aClass86Array1[arg0].method6594(arg1, arg2), local26 + 1) && Static75.method1489(local22 + Static168.anInt3377 - 1, Static55.aClass86Array1[arg0].method6594(arg1 + 1, arg2), local26 + Static437.anInt7761) && Static75.method1489(local22 + Static437.anInt7761, Static55.aClass86Array1[arg0].method6594(arg1, arg2 + 1), local26 + Static168.anInt3377 - 1) && Static75.method1489(local22 + Static168.anInt3377 - 1, Static55.aClass86Array1[arg0].method6594(arg1, arg2), local26 + Static437.anInt7761) && Static75.method1489(local22 + Static437.anInt7761, Static55.aClass86Array1[arg0].method6594(arg1, arg2), local26 + Static437.anInt7761)) {
				Static175.anIntArrayArrayArray8[arg0][arg1][arg2] = Static354.anInt6329;
				return true;
			} else {
				Static175.anIntArrayArrayArray8[arg0][arg1][arg2] = -Static354.anInt6329;
				return false;
			}
		}
	}
}
