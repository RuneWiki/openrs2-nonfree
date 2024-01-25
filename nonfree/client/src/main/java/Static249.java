import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!mk", name = "n", descriptor = "[Lclient!wl;")
	public static Class266[] aClass266Array1 = new Class266[50];

	@OriginalMember(owner = "client!mk", name = "t", descriptor = "[B")
	public static final byte[] aByteArray54 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!sv;Z[[B)V")
	public static void method3537(@OriginalArg(0) Class195_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.anInt6368; local3++) {
			Static111.method1777();
			for (@Pc(9) int local9 = 0; local9 < Static296.anInt5187 >> 3; local9++) {
				for (@Pc(13) int local13 = 0; local13 < Static206.anInt3607 >> 3; local13++) {
					@Pc(23) int local23 = Static166.anIntArrayArrayArray2[local3][local9][local13];
					if (local23 != -1) {
						@Pc(33) int local33 = local23 >> 24 & 0x3;
						if (!arg0.aBoolean703 || local33 == 0) {
							@Pc(44) int local44 = local23 >> 1 & 0x3;
							@Pc(50) int local50 = local23 >> 14 & 0x3FF;
							@Pc(56) int local56 = local23 >> 3 & 0x7FF;
							@Pc(67) int local67 = (local50 / 8 << 8) + (local56 / 8);
							for (@Pc(69) int local69 = 0; local69 < Static248.anIntArray298.length; local69++) {
								if (local67 == Static248.anIntArray298[local69] && arg1[local69] != null) {
									arg0.method5011((local50 & 0x7) * 8, (local56 & 0x7) * 8, Static447.aClass14Array3, local13 * 8, local3, Static185.aClass34_7, local9 * 8, local33, local44, arg1[local69]);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIII)V")
	public static void method3540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 > arg0) {
			Static2.method38(arg1, arg2, Static67.anIntArrayArray13[arg3], arg0);
		} else {
			Static2.method38(arg0, arg2, Static67.anIntArrayArray13[arg3], arg1);
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILclient!za;IBII)V")
	public static void method3547(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg1.ba(arg2, arg3, arg2 + arg4, arg3 + arg0);
		arg1.method5729(arg4, arg2, arg0, -16777216, arg3);
		if (Static442.anInt7365 < 100) {
			return;
		}
		@Pc(35) float local35 = (float) Static167.anInt2094 / (float) Static167.anInt2093;
		@Pc(37) int local37 = arg4;
		@Pc(39) int local39 = arg0;
		if (local35 < 1.0F) {
			local39 = (int) (local35 * (float) arg4);
		} else {
			local37 = (int) ((float) arg0 / local35);
		}
		@Pc(66) int local66 = arg3 + (arg0 - local39) / 2;
		@Pc(75) int local75 = arg2 + (arg4 - local37) / 2;
		if (Static189.aClass6_33 == null || Static189.aClass6_33.YA() != arg4 || Static189.aClass6_33.ZA() != arg0) {
			Static167.method1775(Static167.anInt2089, Static167.anInt2094 + Static167.anInt2099, Static167.anInt2089 + Static167.anInt2093, Static167.anInt2099, local75, local66, local75 + local37, local39 + local66);
			Static167.method1763(arg1);
			Static189.aClass6_33 = arg1.method5777(local75, local66, local37, local39, false);
		}
		Static189.aClass6_33.method5894(local75, local66);
		@Pc(133) int local133 = local37 * Static411.anInt6756 / Static167.anInt2093;
		@Pc(139) int local139 = Static360.anInt6147 * local39 / Static167.anInt2094;
		@Pc(147) int local147 = Static204.anInt3568 * local37 / Static167.anInt2093 + local75;
		@Pc(160) int local160 = local66 + local39 - local139 - local39 * Static217.anInt3902 / Static167.anInt2094;
		@Pc(162) int local162 = -1996554240;
		if (Static183.aClass48_3 == Static82.aClass48_7) {
			local162 = -1996488705;
		}
		arg1.P(local147, local160, local133, local139, local162, 1);
		arg1.method5769(local147, local160, local133, local139, local162, 0);
		if (Static154.anInt2613 <= 0) {
			return;
		}
		@Pc(199) int local199;
		if (Static287.anInt5028 > 50) {
			local199 = 500 - Static287.anInt5028 * 5;
		} else {
			local199 = Static287.anInt5028 * 5;
		}
		for (@Pc(210) Class1_Sub36 local210 = (Class1_Sub36) Static167.aClass227_15.method4967(); local210 != null; local210 = (Class1_Sub36) Static167.aClass227_15.method4973()) {
			@Pc(218) Class205 local218 = Static167.aClass178_2.method3963(local210.anInt5632);
			if (Static264.method3746(local218)) {
				@Pc(239) int local239;
				@Pc(251) int local251;
				if (Static125.anInt2319 == local210.anInt5632) {
					local239 = local37 * local210.anInt5636 / Static167.anInt2093 + local75;
					local251 = (Static167.anInt2094 - local210.anInt5634) * local39 / Static167.anInt2094 + local66;
					arg1.method5729(4, local239 - 2, 4, local199 << 24 | 0xFFFF00, local251 - 2);
				} else if (Static427.anInt7220 != -1 && local218.anInt5747 == Static427.anInt7220) {
					local239 = local37 * local210.anInt5636 / Static167.anInt2093 + local75;
					local251 = local39 * (Static167.anInt2094 - local210.anInt5634) / Static167.anInt2094 + local66;
					arg1.method5729(4, local239 - 2, 4, local199 << 24 | 0xFFFF00, local251 - 2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BC)Z")
	public static boolean method3549(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
