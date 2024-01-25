import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!se", name = "z", descriptor = "Lclient!ud;")
	public static Class362 aClass362_1;

	@OriginalMember(owner = "client!se", name = "c", descriptor = "I")
	public static int anInt9465;

	@OriginalMember(owner = "client!se", name = "y", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray37 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIILclient!tq;IIIII)Z")
	public static boolean method7989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class360 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg8;
		@Pc(9) int local9 = arg3;
		@Pc(18) int local18 = arg8 - 64;
		@Pc(22) int local22 = arg3 - 64;
		Static407.anIntArrayArray40[64][64] = 99;
		Static717.anIntArrayArray62[64][64] = 0;
		@Pc(36) byte local36 = 0;
		Static198.anIntArray177[0] = arg8;
		@Pc(42) int local42 = 0;
		@Pc(45) int local45 = local36 + 1;
		Static469.anIntArray88[0] = arg3;
		@Pc(50) int[][] local50 = arg4.anIntArrayArray56;
		while (local42 != local45) {
			local9 = Static469.anIntArray88[local42];
			local7 = Static198.anIntArray177[local42];
			@Pc(64) int local64 = local9 - local22;
			local42 = local42 + 1 & 0xFFF;
			@Pc(74) int local74 = local7 - local18;
			@Pc(80) int local80 = local7 - arg4.anInt10108;
			@Pc(85) int local85 = local9 - arg4.anInt10114;
			if (arg0 == -4) {
				if (local7 == arg7 && arg1 == local9) {
					Static633.anInt3424 = local7;
					Static282.anInt5124 = local9;
					return true;
				}
			} else if (arg0 == -3) {
				if (Static85.method1104(arg7, 2, local7, arg5, 2, arg1, arg9, local9)) {
					Static633.anInt3424 = local7;
					Static282.anInt5124 = local9;
					return true;
				}
			} else if (arg0 == -2) {
				if (arg4.method8488(arg9, local7, local9, 2, arg6, arg7, arg1, arg5, 2)) {
					Static633.anInt3424 = local7;
					Static282.anInt5124 = local9;
					return true;
				}
			} else if (arg0 == -1) {
				if (arg4.method8494(arg9, 2, arg6, local7, arg1, arg5, arg7, local9)) {
					Static282.anInt5124 = local9;
					Static633.anInt3424 = local7;
					return true;
				}
			} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
				if (arg4.method8485(arg7, 2, local9, local7, arg2, arg0, arg1)) {
					Static633.anInt3424 = local7;
					Static282.anInt5124 = local9;
					return true;
				}
			} else if (arg4.method8493(arg2, arg0, local7, arg1, 2, arg7, local9)) {
				Static633.anInt3424 = local7;
				Static282.anInt5124 = local9;
				return true;
			}
			@Pc(272) int local272 = Static717.anIntArrayArray62[local74][local64] + 1;
			if (local74 > 0 && Static407.anIntArrayArray40[local74 - 1][local64] == 0 && (local50[local80 - 1][local85] & 0x43A40000) == 0 && (local50[local80 - 1][local85 + 1] & 0x4E240000) == 0) {
				Static198.anIntArray177[local45] = local7 - 1;
				Static469.anIntArray88[local45] = local9;
				local45 = local45 + 1 & 0xFFF;
				Static407.anIntArrayArray40[local74 - 1][local64] = 2;
				Static717.anIntArrayArray62[local74 - 1][local64] = local272;
			}
			if (local74 < 126 && Static407.anIntArrayArray40[local74 + 1][local64] == 0 && (local50[local80 + 2][local85] & 0x60E40000) == 0 && (local50[local80 + 2][local85 + 1] & 0x78240000) == 0) {
				Static198.anIntArray177[local45] = local7 + 1;
				Static469.anIntArray88[local45] = local9;
				local45 = local45 + 1 & 0xFFF;
				Static407.anIntArrayArray40[local74 + 1][local64] = 8;
				Static717.anIntArrayArray62[local74 + 1][local64] = local272;
			}
			if (local64 > 0 && Static407.anIntArrayArray40[local74][local64 - 1] == 0 && (local50[local80][local85 - 1] & 0x43A40000) == 0 && (local50[local80 + 1][local85 - 1] & 0x60E40000) == 0) {
				Static198.anIntArray177[local45] = local7;
				Static469.anIntArray88[local45] = local9 - 1;
				Static407.anIntArrayArray40[local74][local64 - 1] = 1;
				local45 = local45 + 1 & 0xFFF;
				Static717.anIntArrayArray62[local74][local64 - 1] = local272;
			}
			if (local64 < 126 && Static407.anIntArrayArray40[local74][local64 + 1] == 0 && (local50[local80][local85 + 2] & 0x4E240000) == 0 && (local50[local80 + 1][local85 + 2] & 0x78240000) == 0) {
				Static198.anIntArray177[local45] = local7;
				Static469.anIntArray88[local45] = local9 + 1;
				Static407.anIntArrayArray40[local74][local64 + 1] = 4;
				local45 = local45 + 1 & 0xFFF;
				Static717.anIntArrayArray62[local74][local64 + 1] = local272;
			}
			if (local74 > 0 && local64 > 0 && Static407.anIntArrayArray40[local74 - 1][local64 - 1] == 0 && (local50[local80 - 1][local85] & 0x4FA40000) == 0 && (local50[local80 - 1][local85 - 1] & 0x43A40000) == 0 && (local50[local80][local85 - 1] & 0x63E40000) == 0) {
				Static198.anIntArray177[local45] = local7 - 1;
				Static469.anIntArray88[local45] = local9 - 1;
				Static407.anIntArrayArray40[local74 - 1][local64 - 1] = 3;
				local45 = local45 + 1 & 0xFFF;
				Static717.anIntArrayArray62[local74 - 1][local64 - 1] = local272;
			}
			if (local74 < 126 && local64 > 0 && Static407.anIntArrayArray40[local74 + 1][local64 - 1] == 0 && (local50[local80 + 1][local85 - 1] & 0x63E40000) == 0 && (local50[local80 + 2][local85 - 1] & 0x60E40000) == 0 && (local50[local80 + 2][local85] & 0x78E40000) == 0) {
				Static198.anIntArray177[local45] = local7 + 1;
				Static469.anIntArray88[local45] = local9 - 1;
				Static407.anIntArrayArray40[local74 + 1][local64 - 1] = 9;
				local45 = local45 + 1 & 0xFFF;
				Static717.anIntArrayArray62[local74 + 1][local64 - 1] = local272;
			}
			if (local74 > 0 && local64 < 126 && Static407.anIntArrayArray40[local74 - 1][local64 + 1] == 0 && (local50[local80 - 1][local85 + 1] & 0x4FA40000) == 0 && (local50[local80 - 1][local85 + 2] & 0x4E240000) == 0 && (local50[local80][local85 + 2] & 0x7E240000) == 0) {
				Static198.anIntArray177[local45] = local7 - 1;
				Static469.anIntArray88[local45] = local9 + 1;
				local45 = local45 + 1 & 0xFFF;
				Static407.anIntArrayArray40[local74 - 1][local64 + 1] = 6;
				Static717.anIntArrayArray62[local74 - 1][local64 + 1] = local272;
			}
			if (local74 < 126 && local64 < 126 && Static407.anIntArrayArray40[local74 + 1][local64 + 1] == 0 && (local50[local80 + 1][local85 + 2] & 0x7E240000) == 0 && (local50[local80 + 2][local85 + 2] & 0x78240000) == 0 && (local50[local80 + 2][local85 + 1] & 0x78E40000) == 0) {
				Static198.anIntArray177[local45] = local7 + 1;
				Static469.anIntArray88[local45] = local9 + 1;
				Static407.anIntArrayArray40[local74 + 1][local64 + 1] = 12;
				local45 = local45 + 1 & 0xFFF;
				Static717.anIntArrayArray62[local74 + 1][local64 + 1] = local272;
			}
		}
		Static633.anInt3424 = local7;
		Static282.anInt5124 = local9;
		return false;
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(IIIIIII)V")
	public static void method7992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(23) int local23 = Static27.method393(arg5, Static280.anInt5114, Static356.anInt6028);
		@Pc(29) int local29 = Static27.method393(arg3, Static280.anInt5114, Static356.anInt6028);
		@Pc(35) int local35 = Static27.method393(arg0, Static85.anInt1313, Static316.anInt6313);
		@Pc(41) int local41 = Static27.method393(arg2, Static85.anInt1313, Static316.anInt6313);
		@Pc(49) int local49 = Static27.method393(arg4 + arg5, Static280.anInt5114, Static356.anInt6028);
		@Pc(57) int local57 = Static27.method393(arg3 - arg4, Static280.anInt5114, Static356.anInt6028);
		for (@Pc(59) int local59 = local23; local59 < local49; local59++) {
			Static482.method7040(arg1, local35, Static384.anIntArrayArray38[local59], local41);
		}
		for (@Pc(77) int local77 = local29; local77 > local57; local77--) {
			Static482.method7040(arg1, local35, Static384.anIntArrayArray38[local77], local41);
		}
		@Pc(107) int local107 = Static27.method393(arg4 + arg0, Static85.anInt1313, Static316.anInt6313);
		@Pc(116) int local116 = Static27.method393(arg2 - arg4, Static85.anInt1313, Static316.anInt6313);
		for (@Pc(118) int local118 = local49; local118 <= local57; local118++) {
			@Pc(126) int[] local126 = Static384.anIntArrayArray38[local118];
			Static482.method7040(arg1, local35, local126, local107);
			Static482.method7040(arg1, local116, local126, local41);
		}
	}
}
