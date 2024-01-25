import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!gs", name = "j", descriptor = "Lclient!cq;")
	public static final Class43 aClass43_9 = new Class43("", 16);

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!ya;IIIIB)V")
	public static void method1979(@OriginalArg(0) Class135 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg0.OA(arg1, arg2, arg1 + arg4, arg3 + arg2);
		arg0.method5394(arg4, arg1, arg3, arg2, -16777216);
		if (Static69.anInt3214 < 100) {
			return;
		}
		@Pc(35) float local35 = (float) Static292.anInt6146 / (float) Static292.anInt6145;
		@Pc(37) int local37 = arg4;
		@Pc(39) int local39 = arg3;
		if (local35 < 1.0F) {
			local39 = (int) (local35 * (float) arg4);
		} else {
			local37 = (int) ((float) arg3 / local35);
		}
		@Pc(65) int local65 = arg2 + (arg3 - local39) / 2;
		@Pc(73) int local73 = arg1 + (arg4 - local37) / 2;
		if (Static297.aClass95_13 == null || Static297.aClass95_13.la() != arg4 || arg3 != Static297.aClass95_13.ma()) {
			Static292.method4934(Static292.anInt6142, Static292.anInt6148 + Static292.anInt6146, Static292.anInt6142 - -Static292.anInt6145, Static292.anInt6148, local73, local65, local37 + local73, local39 + local65);
			Static292.method4950(arg0);
			Static297.aClass95_13 = arg0.method5349(local73, local65, local37, local39, false);
		}
		Static297.aClass95_13.method5821(local73, local65);
		@Pc(130) int local130 = Static14.anInt195 * local37 / Static292.anInt6145;
		@Pc(136) int local136 = Static394.anInt2524 * local39 / Static292.anInt6146;
		@Pc(145) int local145 = local73 + Static47.anInt737 * local37 / Static292.anInt6145;
		@Pc(164) int local164 = local39 + local65 - local136 - local39 * Static337.anInt5499 / Static292.anInt6146;
		@Pc(166) int local166 = -1996554240;
		if (Static231.aClass6_7 == Static15.aClass6_1) {
			local166 = -1996488705;
		}
		arg0.O(local145, local164, local130, local136, local166, 1);
		arg0.method5354(local145, local164, local130, local136, local166, 0);
		if (Static90.anInt1730 <= 0) {
			return;
		}
		@Pc(201) int local201;
		if (Static373.anInt6112 <= 50) {
			local201 = Static373.anInt6112 * 5;
		} else {
			local201 = 500 - Static373.anInt6112 * 5;
		}
		for (@Pc(215) Class4_Sub12 local215 = (Class4_Sub12) Static292.aClass244_35.method5263(); local215 != null; local215 = (Class4_Sub12) Static292.aClass244_35.method5271()) {
			@Pc(223) Class100 local223 = Static292.aClass235_4.method4957(local215.anInt1566);
			if (Static173.method2397(local223)) {
				@Pc(251) int local251;
				@Pc(263) int local263;
				if (local215.anInt1566 == Static325.anInt5269) {
					local251 = local73 + local37 * local215.anInt1572 / Static292.anInt6145;
					local263 = local39 * (Static292.anInt6146 - local215.anInt1567) / Static292.anInt6146 + local65;
					arg0.method5394(4, local251 - 2, 4, local263 - 2, local201 << 24 | 0xFFFF00);
				} else if (Static276.anInt4603 != -1 && local223.anInt2488 == Static276.anInt4603) {
					local251 = local37 * local215.anInt1572 / Static292.anInt6145 + local73;
					local263 = local65 + (Static292.anInt6146 - local215.anInt1567) * local39 / Static292.anInt6146;
					arg0.method5394(4, local251 - 2, 4, local263 - 2, local201 << 24 | 0xFFFF00);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIIII)V")
	public static void method1980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static275.anInt4594 < arg0 || arg4 < Static254.anInt4211) {
			return;
		}
		@Pc(23) boolean local23;
		if (arg3 < Static62.anInt1114) {
			arg3 = Static62.anInt1114;
			local23 = false;
		} else if (Static207.anInt3632 >= arg3) {
			local23 = true;
		} else {
			local23 = false;
			arg3 = Static207.anInt3632;
		}
		@Pc(44) boolean local44;
		if (arg2 < Static62.anInt1114) {
			local44 = false;
			arg2 = Static62.anInt1114;
		} else if (Static207.anInt3632 >= arg2) {
			local44 = true;
		} else {
			arg2 = Static207.anInt3632;
			local44 = false;
		}
		if (Static254.anInt4211 <= arg0) {
			Static249.method6044(Static267.anIntArrayArray50[arg0++], arg1, arg2, arg3);
		} else {
			arg0 = Static254.anInt4211;
		}
		if (Static275.anInt4594 >= arg4) {
			Static249.method6044(Static267.anIntArrayArray50[arg4--], arg1, arg2, arg3);
		} else {
			arg4 = Static275.anInt4594;
		}
		@Pc(101) int local101;
		if (local23 && local44) {
			for (local101 = arg0; local101 <= arg4; local101++) {
				@Pc(107) int[] local107 = Static267.anIntArrayArray50[local101];
				local107[arg3] = local107[arg2] = arg1;
			}
		} else if (local23) {
			for (local101 = arg0; local101 <= arg4; local101++) {
				Static267.anIntArrayArray50[local101][arg3] = arg1;
			}
		} else if (local44) {
			for (local101 = arg0; local101 <= arg4; local101++) {
				Static267.anIntArrayArray50[local101][arg2] = arg1;
			}
		}
	}
}
