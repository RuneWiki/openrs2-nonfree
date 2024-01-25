import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!ti", name = "A", descriptor = "[Lclient!dr;")
	public static final Class2_Sub2_Sub7[] aClass2_Sub2_Sub7Array2 = new Class2_Sub2_Sub7[14];

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIIIBIILclient!cl;)Z")
	public static boolean method5299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class37 arg9) {
		@Pc(15) int local15 = arg0;
		@Pc(17) int local17 = arg7;
		@Pc(26) int local26 = arg0 - 64;
		@Pc(31) int local31 = arg7 - 64;
		Static225.anIntArrayArray35[64][64] = 99;
		Static266.anIntArrayArray38[64][64] = 0;
		@Pc(45) byte local45 = 0;
		Static378.anIntArray443[0] = arg0;
		@Pc(51) int local51 = 0;
		@Pc(54) int local54 = local45 + 1;
		Static351.anIntArray416[0] = arg7;
		@Pc(59) int[][] local59 = arg9.anIntArrayArray6;
		while (local51 != local54) {
			local17 = Static351.anIntArray416[local51];
			local15 = Static378.anIntArray443[local51];
			@Pc(74) int local74 = local17 - local31;
			@Pc(79) int local79 = local15 - local26;
			local51 = local51 + 1 & 0xFFF;
			@Pc(91) int local91 = local15 - arg9.anInt1438;
			@Pc(96) int local96 = local17 - arg9.anInt1447;
			if (arg4 == -4) {
				if (local15 == arg8 && arg3 == local17) {
					Static433.anInt7533 = local17;
					Static369.anInt6567 = local15;
					return true;
				}
			} else if (arg4 == -3) {
				if (Static48.method944(2, arg5, arg1, arg8, arg3, 2, local15, local17)) {
					Static433.anInt7533 = local17;
					Static369.anInt6567 = local15;
					return true;
				}
			} else if (arg4 == -2) {
				if (arg9.method1056(2, arg8, arg1, arg5, arg2, local15, local17, arg3, 2)) {
					Static369.anInt6567 = local15;
					Static433.anInt7533 = local17;
					return true;
				}
			} else if (arg4 == -1) {
				if (arg9.method1057(local15, arg1, arg2, local17, 2, arg8, arg5, arg3)) {
					Static369.anInt6567 = local15;
					Static433.anInt7533 = local17;
					return true;
				}
			} else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
				if (arg9.method1059(arg8, local15, arg3, arg4, local17, 2, arg6)) {
					Static433.anInt7533 = local17;
					Static369.anInt6567 = local15;
					return true;
				}
			} else if (arg9.method1055(local15, arg3, local17, arg4, 2, arg8, arg6)) {
				Static369.anInt6567 = local15;
				Static433.anInt7533 = local17;
				return true;
			}
			@Pc(251) int local251 = Static266.anIntArrayArray38[local79][local74] + 1;
			if (local79 > 0 && Static225.anIntArrayArray35[local79 - 1][local74] == 0 && (local59[local91 - 1][local96] & 0x43A40000) == 0 && (local59[local91 - 1][local96 + 1] & 0x4E240000) == 0) {
				Static378.anIntArray443[local54] = local15 - 1;
				Static351.anIntArray416[local54] = local17;
				local54 = local54 + 1 & 0xFFF;
				Static225.anIntArrayArray35[local79 - 1][local74] = 2;
				Static266.anIntArrayArray38[local79 - 1][local74] = local251;
			}
			if (local79 < 126 && Static225.anIntArrayArray35[local79 + 1][local74] == 0 && (local59[local91 + 2][local96] & 0x60E40000) == 0 && (local59[local91 + 2][local96 + 1] & 0x78240000) == 0) {
				Static378.anIntArray443[local54] = local15 + 1;
				Static351.anIntArray416[local54] = local17;
				Static225.anIntArrayArray35[local79 + 1][local74] = 8;
				local54 = local54 + 1 & 0xFFF;
				Static266.anIntArrayArray38[local79 + 1][local74] = local251;
			}
			if (local74 > 0 && Static225.anIntArrayArray35[local79][local74 - 1] == 0 && (local59[local91][local96 - 1] & 0x43A40000) == 0 && (local59[local91 + 1][local96 - 1] & 0x60E40000) == 0) {
				Static378.anIntArray443[local54] = local15;
				Static351.anIntArray416[local54] = local17 - 1;
				local54 = local54 + 1 & 0xFFF;
				Static225.anIntArrayArray35[local79][local74 - 1] = 1;
				Static266.anIntArrayArray38[local79][local74 - 1] = local251;
			}
			if (local74 < 126 && Static225.anIntArrayArray35[local79][local74 + 1] == 0 && (local59[local91][local96 + 2] & 0x4E240000) == 0 && (local59[local91 + 1][local96 + 2] & 0x78240000) == 0) {
				Static378.anIntArray443[local54] = local15;
				Static351.anIntArray416[local54] = local17 + 1;
				local54 = local54 + 1 & 0xFFF;
				Static225.anIntArrayArray35[local79][local74 + 1] = 4;
				Static266.anIntArrayArray38[local79][local74 + 1] = local251;
			}
			if (local79 > 0 && local74 > 0 && Static225.anIntArrayArray35[local79 - 1][local74 - 1] == 0 && (local59[local91 - 1][local96] & 0x4FA40000) == 0 && (local59[local91 - 1][local96 - 1] & 0x43A40000) == 0 && (local59[local91][local96 - 1] & 0x63E40000) == 0) {
				Static378.anIntArray443[local54] = local15 - 1;
				Static351.anIntArray416[local54] = local17 - 1;
				Static225.anIntArrayArray35[local79 - 1][local74 - 1] = 3;
				local54 = local54 + 1 & 0xFFF;
				Static266.anIntArrayArray38[local79 - 1][local74 - 1] = local251;
			}
			if (local79 < 126 && local74 > 0 && Static225.anIntArrayArray35[local79 + 1][local74 - 1] == 0 && (local59[local91 + 1][local96 - 1] & 0x63E40000) == 0 && (local59[local91 + 2][local96 - 1] & 0x60E40000) == 0 && (local59[local91 + 2][local96] & 0x78E40000) == 0) {
				Static378.anIntArray443[local54] = local15 + 1;
				Static351.anIntArray416[local54] = local17 - 1;
				local54 = local54 + 1 & 0xFFF;
				Static225.anIntArrayArray35[local79 + 1][local74 - 1] = 9;
				Static266.anIntArrayArray38[local79 + 1][local74 - 1] = local251;
			}
			if (local79 > 0 && local74 < 126 && Static225.anIntArrayArray35[local79 - 1][local74 + 1] == 0 && (local59[local91 - 1][local96 + 1] & 0x4FA40000) == 0 && (local59[local91 - 1][local96 + 2] & 0x4E240000) == 0 && (local59[local91][local96 + 2] & 0x7E240000) == 0) {
				Static378.anIntArray443[local54] = local15 - 1;
				Static351.anIntArray416[local54] = local17 + 1;
				Static225.anIntArrayArray35[local79 - 1][local74 + 1] = 6;
				local54 = local54 + 1 & 0xFFF;
				Static266.anIntArrayArray38[local79 - 1][local74 + 1] = local251;
			}
			if (local79 < 126 && local74 < 126 && Static225.anIntArrayArray35[local79 + 1][local74 + 1] == 0 && (local59[local91 + 1][local96 + 2] & 0x7E240000) == 0 && (local59[local91 + 2][local96 + 2] & 0x78240000) == 0 && (local59[local91 + 2][local96 + 1] & 0x78E40000) == 0) {
				Static378.anIntArray443[local54] = local15 + 1;
				Static351.anIntArray416[local54] = local17 + 1;
				local54 = local54 + 1 & 0xFFF;
				Static225.anIntArrayArray35[local79 + 1][local74 + 1] = 12;
				Static266.anIntArrayArray38[local79 + 1][local74 + 1] = local251;
			}
		}
		Static433.anInt7533 = local17;
		Static369.anInt6567 = local15;
		return false;
	}
}
