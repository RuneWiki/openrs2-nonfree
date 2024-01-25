import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!lu", name = "g", descriptor = "[I")
	public static int[] anIntArray288;

	@OriginalMember(owner = "client!lu", name = "n", descriptor = "Lclient!ri;")
	public static Class284 aClass284_98;

	@OriginalMember(owner = "client!lu", name = "l", descriptor = "[[I")
	public static final int[][] anIntArrayArray59 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(CI)Z")
	public static boolean method4726(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "(I)Lclient!rda;")
	public static Class279 method4727() {
		return Static74.method1789();
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIZIIII)V")
	public static void method4729(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) Class167[] local7 = Static98.aClass167Array1;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(15) Class167 local15 = local7[local9];
			if (local15 != null && local15.anInt5096 == 2) {
				method4731(local15.anInt5102 * 2, arg0 >> 1, local15.anInt5104, local15.anInt5101, local15.anInt5099, arg2 >> 1);
				if (Static468.anIntArray481[0] > -1 && Static397.anInt6998 % 20 < 10) {
					Static308.aClass73Array8[local15.anInt5094].method7957(arg3 + Static468.anIntArray481[0] - 12, Static468.anIntArray481[1] + arg1 + -28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!iaa;Z)V")
	public static void method4730(@OriginalArg(0) Class25_Sub2_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort106; local2 <= arg0.aShort108; local2++) {
			for (@Pc(6) int local6 = arg0.aShort107; local6 <= arg0.aShort109; local6++) {
				@Pc(16) Class333 local16 = Static189.aClass333ArrayArrayArray1[arg0.aByte117][local2][local6];
				if (local16 != null) {
					@Pc(21) Class147 local21 = local16.aClass147_3;
					@Pc(23) Class147 local23 = null;
					while (local21 != null) {
						if (local21.aClass25_Sub2_Sub2_1 == arg0) {
							if (local23 == null) {
								local16.aClass147_3 = local21.aClass147_2;
							} else {
								local23.aClass147_2 = local21.aClass147_2;
							}
							local21.method3733();
							break;
						}
						local23 = local21;
						local21 = local21.aClass147_2;
					}
				}
			}
		}
		if (!arg1) {
			Static478.method6527(arg0);
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method4731(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		Static288.method4332(arg1, arg4, arg3, arg2, arg5, 0, arg0);
	}
}
