import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!tg", name = "K", descriptor = "I")
	public static int anInt6667;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method5182(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(18) int local18 = arg3; local18 <= arg2; local18++) {
			for (@Pc(22) int local22 = arg4; local22 <= arg1; local22++) {
				if (Static28.anIntArrayArray9[local18][local22] == arg0 && Static239.anIntArrayArray38[local18][local22] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)Lclient!ps;")
	public static Class4_Sub32 method5183() {
		if (Static137.aClass258_37 == null || Static279.aClass18_1 == null) {
			return null;
		}
		for (@Pc(21) Class4_Sub32 local21 = (Class4_Sub32) Static279.aClass18_1.method526(); local21 != null; local21 = (Class4_Sub32) Static279.aClass18_1.method526()) {
			@Pc(29) Class25 local29 = Static137.aClass198_4.method4491(local21.anInt5601);
			if (local29 != null && local29.aBoolean45 && local29.method666(Static137.anInterface4_2)) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(B[[I)V")
	public static void method5184(@OriginalArg(1) int[][] arg0) {
		Static162.anIntArrayArray58 = arg0;
	}

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)V")
	public static void method5185() {
		for (@Pc(12) Class4_Sub1_Sub14 local12 = (Class4_Sub1_Sub14) Static332.aClass258_41.method5538(); local12 != null; local12 = (Class4_Sub1_Sub14) Static332.aClass258_41.method5528()) {
			@Pc(17) Class6_Sub2_Sub6 local17 = local12.aClass6_Sub2_Sub6_1;
			if (Static221.anInt4855 != local17.aByte86 || local17.anInt4298 < Static175.anInt3261) {
				local12.method5854();
				local17.method3262();
			} else if (Static175.anInt3261 >= local17.anInt4315) {
				if (local17.lb > 0) {
					@Pc(59) Class6_Sub2_Sub1_Sub2 local59 = Static176.aClass6_Sub2_Sub1_Sub2Array1[local17.lb - 1];
					if (local59 != null && local59.anInt6062 >= 0 && local59.anInt6062 < Static126.anInt2569 * 128 && local59.anInt6061 >= 0 && local59.anInt6061 < Static190.anInt3697 * 128) {
						local17.method3265(Static222.method3109(local59.anInt6062, local17.aByte86, local59.anInt6061) - local17.anInt4309, Static175.anInt3261, local59.anInt6062, local59.anInt6061);
					}
				}
				if (local17.lb < 0) {
					@Pc(120) int local120 = -local17.lb - 1;
					@Pc(125) Class6_Sub2_Sub1_Sub1 local125;
					if (Static373.anInt6574 == local120) {
						local125 = Static375.aClass6_Sub2_Sub1_Sub1_3;
					} else {
						local125 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local120];
					}
					if (local125 != null && local125.anInt6062 >= 0 && Static126.anInt2569 * 128 > local125.anInt6062 && local125.anInt6061 >= 0 && Static190.anInt3697 * 128 > local125.anInt6061) {
						local17.method3265(Static222.method3109(local125.anInt6062, local17.aByte86, local125.anInt6061) - local17.anInt4309, Static175.anInt3261, local125.anInt6062, local125.anInt6061);
					}
				}
				local17.method3264(Static4.anInt161);
				Static235.method3268(local17, true);
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIZ)I")
	public static int method5186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(15) int local15 = local9 << 13 ^ local9;
		@Pc(29) int local29 = Integer.MAX_VALUE & (local15 * 15731 * local15 + 789221) * local15 + 1376312589;
		return local29 >> 19 & 0xFF;
	}
}
