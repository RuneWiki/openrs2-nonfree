import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "Lclient!o;")
	public static Class137 aClass137_14;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray30 = new String[100];

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "Lclient!fr;")
	public static final Class91 aClass91_61 = new Class91(260);

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_63 = new Class177(28, 2);

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIILclient!ir;IIII)Z")
	public static boolean method3596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class120 arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg4;
		@Pc(7) int local7 = arg3;
		@Pc(16) int local16 = arg4 - 64;
		Static75.anIntArrayArray19[64][64] = 99;
		@Pc(26) int local26 = arg3 - 64;
		Static343.anIntArrayArray50[64][64] = 0;
		@Pc(34) byte local34 = 0;
		Static367.anIntArray618[0] = arg4;
		@Pc(45) int local45 = 0;
		@Pc(48) int local48 = local34 + 1;
		Static386.anIntArray669[0] = arg3;
		@Pc(53) int[][] local53 = arg6.anIntArrayArray35;
		while (local48 != local45) {
			local7 = Static386.anIntArray669[local45];
			local5 = Static367.anIntArray618[local45];
			@Pc(67) int local67 = local5 - local16;
			@Pc(72) int local72 = local7 - local26;
			local45 = local45 + 1 & 0xFFF;
			@Pc(83) int local83 = local5 - arg6.anInt3918;
			@Pc(89) int local89 = local7 - arg6.anInt3915;
			if (arg0 == -4) {
				if (local5 == arg2 && arg5 == local7) {
					Static56.anInt1510 = local7;
					Static94.anInt2261 = local5;
					return true;
				}
			} else if (arg0 == -3) {
				if (Static149.method2370(2, arg5, local5, local7, arg1, arg2, arg8, 2)) {
					Static94.anInt2261 = local5;
					Static56.anInt1510 = local7;
					return true;
				}
			} else if (arg0 == -2) {
				if (arg6.method3053(2, arg8, arg5, local5, local7, 2, arg2, arg1, arg7)) {
					Static56.anInt1510 = local7;
					Static94.anInt2261 = local5;
					return true;
				}
			} else if (arg0 == -1) {
				if (arg6.method3039(local7, arg8, arg5, local5, 2, arg7, arg2, arg1)) {
					Static56.anInt1510 = local7;
					Static94.anInt2261 = local5;
					return true;
				}
			} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
				if (arg6.method3041(arg2, arg9, arg0, arg5, local5, local7, 2)) {
					Static56.anInt1510 = local7;
					Static94.anInt2261 = local5;
					return true;
				}
			} else if (arg6.method3036(local7, arg5, arg9, 2, local5, arg2, arg0)) {
				Static56.anInt1510 = local7;
				Static94.anInt2261 = local5;
				return true;
			}
			@Pc(236) int local236 = Static343.anIntArrayArray50[local67][local72] + 1;
			if (local67 > 0 && Static75.anIntArrayArray19[local67 - 1][local72] == 0 && (local53[local83 - 1][local89] & 0x43A40000) == 0 && (local53[local83 - 1][local89 + 1] & 0x4E240000) == 0) {
				Static367.anIntArray618[local48] = local5 - 1;
				Static386.anIntArray669[local48] = local7;
				local48 = local48 + 1 & 0xFFF;
				Static75.anIntArrayArray19[local67 - 1][local72] = 2;
				Static343.anIntArrayArray50[local67 - 1][local72] = local236;
			}
			if (local67 < 126 && Static75.anIntArrayArray19[local67 + 1][local72] == 0 && (local53[local83 + 2][local89] & 0x60E40000) == 0 && (local53[local83 + 2][local89 + 1] & 0x78240000) == 0) {
				Static367.anIntArray618[local48] = local5 + 1;
				Static386.anIntArray669[local48] = local7;
				Static75.anIntArrayArray19[local67 + 1][local72] = 8;
				local48 = local48 + 1 & 0xFFF;
				Static343.anIntArrayArray50[local67 + 1][local72] = local236;
			}
			if (local72 > 0 && Static75.anIntArrayArray19[local67][local72 - 1] == 0 && (local53[local83][local89 - 1] & 0x43A40000) == 0 && (local53[local83 + 1][local89 - 1] & 0x60E40000) == 0) {
				Static367.anIntArray618[local48] = local5;
				Static386.anIntArray669[local48] = local7 - 1;
				local48 = local48 + 1 & 0xFFF;
				Static75.anIntArrayArray19[local67][local72 - 1] = 1;
				Static343.anIntArrayArray50[local67][local72 - 1] = local236;
			}
			if (local72 < 126 && Static75.anIntArrayArray19[local67][local72 + 1] == 0 && (local53[local83][local89 + 2] & 0x4E240000) == 0 && (local53[local83 + 1][local89 + 2] & 0x78240000) == 0) {
				Static367.anIntArray618[local48] = local5;
				Static386.anIntArray669[local48] = local7 + 1;
				local48 = local48 + 1 & 0xFFF;
				Static75.anIntArrayArray19[local67][local72 + 1] = 4;
				Static343.anIntArrayArray50[local67][local72 + 1] = local236;
			}
			if (local67 > 0 && local72 > 0 && Static75.anIntArrayArray19[local67 - 1][local72 - 1] == 0 && (local53[local83 - 1][local89] & 0x4FA40000) == 0 && (local53[local83 - 1][local89 - 1] & 0x43A40000) == 0 && (local53[local83][local89 - 1] & 0x63E40000) == 0) {
				Static367.anIntArray618[local48] = local5 - 1;
				Static386.anIntArray669[local48] = local7 - 1;
				Static75.anIntArrayArray19[local67 - 1][local72 - 1] = 3;
				local48 = local48 + 1 & 0xFFF;
				Static343.anIntArrayArray50[local67 - 1][local72 - 1] = local236;
			}
			if (local67 < 126 && local72 > 0 && Static75.anIntArrayArray19[local67 + 1][local72 - 1] == 0 && (local53[local83 + 1][local89 - 1] & 0x63E40000) == 0 && (local53[local83 + 2][local89 - 1] & 0x60E40000) == 0 && (local53[local83 + 2][local89] & 0x78E40000) == 0) {
				Static367.anIntArray618[local48] = local5 + 1;
				Static386.anIntArray669[local48] = local7 - 1;
				local48 = local48 + 1 & 0xFFF;
				Static75.anIntArrayArray19[local67 + 1][local72 - 1] = 9;
				Static343.anIntArrayArray50[local67 + 1][local72 - 1] = local236;
			}
			if (local67 > 0 && local72 < 126 && Static75.anIntArrayArray19[local67 - 1][local72 + 1] == 0 && (local53[local83 - 1][local89 + 1] & 0x4FA40000) == 0 && (local53[local83 - 1][local89 + 2] & 0x4E240000) == 0 && (local53[local83][local89 + 2] & 0x7E240000) == 0) {
				Static367.anIntArray618[local48] = local5 - 1;
				Static386.anIntArray669[local48] = local7 + 1;
				local48 = local48 + 1 & 0xFFF;
				Static75.anIntArrayArray19[local67 - 1][local72 + 1] = 6;
				Static343.anIntArrayArray50[local67 - 1][local72 + 1] = local236;
			}
			if (local67 < 126 && local72 < 126 && Static75.anIntArrayArray19[local67 + 1][local72 + 1] == 0 && (local53[local83 + 1][local89 + 2] & 0x7E240000) == 0 && (local53[local83 + 2][local89 + 2] & 0x78240000) == 0 && (local53[local83 + 2][local89 + 1] & 0x78E40000) == 0) {
				Static367.anIntArray618[local48] = local5 + 1;
				Static386.anIntArray669[local48] = local7 + 1;
				Static75.anIntArrayArray19[local67 + 1][local72 + 1] = 12;
				local48 = local48 + 1 & 0xFFF;
				Static343.anIntArrayArray50[local67 + 1][local72 + 1] = local236;
			}
		}
		Static94.anInt2261 = local5;
		Static56.anInt1510 = local7;
		return false;
	}
}
