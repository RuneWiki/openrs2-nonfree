import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "[I")
	public static int[] anIntArray513;

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_147 = new Class25(82, -1);

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public static void method4867() {
		Static117.method1917(Static434.aClass165_Sub1_1.aBoolean306);
		Static370.aClass2_Sub8_Sub2_5 = new Class2_Sub8_Sub2();
		Static370.aClass2_Sub8_Sub2_5.method3293();
		Static350.aClass62_2 = Static324.method4602(0, 22050, Static138.aClass194_2, Static291.aCanvas6);
		Static350.aClass62_2.method2423(Static370.aClass2_Sub8_Sub2_5);
		Static400.method5614(Static199.aClass171_46, Static370.aClass2_Sub8_Sub2_5, Static284.aClass171_67, Static258.aClass171_59);
		Static147.aClass62_1 = Static324.method4602(1, 2048, Static138.aClass194_2, Static291.aCanvas6);
		Static414.aClass2_Sub8_Sub1_2 = new Class2_Sub8_Sub1();
		Static147.aClass62_1.method2423(Static414.aClass2_Sub8_Sub1_2);
		Static378.aClass148_5 = new Class148(22050, Static150.anInt7358);
		Static278.anInt5024 = Static431.aClass171_95.method3668("scape main");
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!sj;IIBIIIIII)Z")
	public static boolean method4871(@OriginalArg(0) int arg0, @OriginalArg(1) Class225 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg9;
		@Pc(7) int local7 = arg3;
		@Pc(21) int local21 = arg9 - 64;
		Static320.anIntArrayArray138[64][64] = 99;
		@Pc(31) int local31 = arg3 - 64;
		Static397.anIntArrayArray168[64][64] = 0;
		@Pc(39) byte local39 = 0;
		@Pc(41) int local41 = 0;
		Static311.anIntArray475[0] = arg9;
		@Pc(48) int local48 = local39 + 1;
		Static228.anIntArray515[0] = arg3;
		@Pc(53) int[][] local53 = arg1.anIntArrayArray159;
		while (local41 != local48) {
			local5 = Static311.anIntArray475[local41];
			local7 = Static228.anIntArray515[local41];
			@Pc(67) int local67 = local5 - local21;
			@Pc(72) int local72 = local7 - arg1.anInt6523;
			@Pc(76) int local76 = local7 - local31;
			local41 = local41 + 1 & 0xFFF;
			@Pc(87) int local87 = local5 - arg1.anInt6535;
			if (arg4 == -4) {
				if (local5 == arg6 && local7 == arg7) {
					Static379.anInt3836 = local7;
					Static199.anInt3421 = local5;
					return true;
				}
			} else if (arg4 == -3) {
				if (Static233.method3186(local5, 1, arg2, arg7, arg6, 1, local7, arg8)) {
					Static379.anInt3836 = local7;
					Static199.anInt3421 = local5;
					return true;
				}
			} else if (arg4 == -2) {
				if (arg1.method5189(local7, arg2, arg6, 1, arg7, arg8, local5, 1, arg5)) {
					Static379.anInt3836 = local7;
					Static199.anInt3421 = local5;
					return true;
				}
			} else if (arg4 == -1) {
				if (arg1.method5190(arg2, local5, local7, arg6, arg8, arg7, arg5, 1)) {
					Static379.anInt3836 = local7;
					Static199.anInt3421 = local5;
					return true;
				}
			} else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
				if (arg1.method5199(1, local7, arg7, arg6, arg0, local5, arg4)) {
					Static199.anInt3421 = local5;
					Static379.anInt3836 = local7;
					return true;
				}
			} else if (arg1.method5196(local5, arg7, 1, arg6, arg0, arg4, local7)) {
				Static199.anInt3421 = local5;
				Static379.anInt3836 = local7;
				return true;
			}
			@Pc(238) int local238 = Static397.anIntArrayArray168[local67][local76] + 1;
			if (local67 > 0 && Static320.anIntArrayArray138[local67 - 1][local76] == 0 && (local53[local87 - 1][local72] & 0x42240000) == 0) {
				Static311.anIntArray475[local48] = local5 - 1;
				Static228.anIntArray515[local48] = local7;
				Static320.anIntArrayArray138[local67 - 1][local76] = 2;
				local48 = local48 + 1 & 0xFFF;
				Static397.anIntArrayArray168[local67 - 1][local76] = local238;
			}
			if (local67 < 127 && Static320.anIntArrayArray138[local67 + 1][local76] == 0 && (local53[local87 + 1][local72] & 0x60240000) == 0) {
				Static311.anIntArray475[local48] = local5 + 1;
				Static228.anIntArray515[local48] = local7;
				Static320.anIntArrayArray138[local67 + 1][local76] = 8;
				local48 = local48 + 1 & 0xFFF;
				Static397.anIntArrayArray168[local67 + 1][local76] = local238;
			}
			if (local76 > 0 && Static320.anIntArrayArray138[local67][local76 - 1] == 0 && (local53[local87][local72 - 1] & 0x40A40000) == 0) {
				Static311.anIntArray475[local48] = local5;
				Static228.anIntArray515[local48] = local7 - 1;
				Static320.anIntArrayArray138[local67][local76 - 1] = 1;
				local48 = local48 + 1 & 0xFFF;
				Static397.anIntArrayArray168[local67][local76 - 1] = local238;
			}
			if (local76 < 127 && Static320.anIntArrayArray138[local67][local76 + 1] == 0 && (local53[local87][local72 + 1] & 0x48240000) == 0) {
				Static311.anIntArray475[local48] = local5;
				Static228.anIntArray515[local48] = local7 + 1;
				local48 = local48 + 1 & 0xFFF;
				Static320.anIntArrayArray138[local67][local76 + 1] = 4;
				Static397.anIntArrayArray168[local67][local76 + 1] = local238;
			}
			if (local67 > 0 && local76 > 0 && Static320.anIntArrayArray138[local67 - 1][local76 - 1] == 0 && (local53[local87 - 1][local72 - 1] & 0x43A40000) == 0 && (local53[local87 - 1][local72] & 0x42240000) == 0 && (local53[local87][local72 - 1] & 0x40A40000) == 0) {
				Static311.anIntArray475[local48] = local5 - 1;
				Static228.anIntArray515[local48] = local7 - 1;
				Static320.anIntArrayArray138[local67 - 1][local76 - 1] = 3;
				local48 = local48 + 1 & 0xFFF;
				Static397.anIntArrayArray168[local67 - 1][local76 - 1] = local238;
			}
			if (local67 < 127 && local76 > 0 && Static320.anIntArrayArray138[local67 + 1][local76 - 1] == 0 && (local53[local87 + 1][local72 - 1] & 0x60E40000) == 0 && (local53[local87 + 1][local72] & 0x60240000) == 0 && (local53[local87][local72 - 1] & 0x40A40000) == 0) {
				Static311.anIntArray475[local48] = local5 + 1;
				Static228.anIntArray515[local48] = local7 - 1;
				Static320.anIntArrayArray138[local67 + 1][local76 - 1] = 9;
				local48 = local48 + 1 & 0xFFF;
				Static397.anIntArrayArray168[local67 + 1][local76 - 1] = local238;
			}
			if (local67 > 0 && local76 < 127 && Static320.anIntArrayArray138[local67 - 1][local76 + 1] == 0 && (local53[local87 - 1][local72 + 1] & 0x4E240000) == 0 && (local53[local87 - 1][local72] & 0x42240000) == 0 && (local53[local87][local72 + 1] & 0x48240000) == 0) {
				Static311.anIntArray475[local48] = local5 - 1;
				Static228.anIntArray515[local48] = local7 + 1;
				Static320.anIntArrayArray138[local67 - 1][local76 + 1] = 6;
				local48 = local48 + 1 & 0xFFF;
				Static397.anIntArrayArray168[local67 - 1][local76 + 1] = local238;
			}
			if (local67 < 127 && local76 < 127 && Static320.anIntArrayArray138[local67 + 1][local76 + 1] == 0 && (local53[local87 + 1][local72 + 1] & 0x78240000) == 0 && (local53[local87 + 1][local72] & 0x60240000) == 0 && (local53[local87][local72 + 1] & 0x48240000) == 0) {
				Static311.anIntArray475[local48] = local5 + 1;
				Static228.anIntArray515[local48] = local7 + 1;
				Static320.anIntArrayArray138[local67 + 1][local76 + 1] = 12;
				local48 = local48 + 1 & 0xFFF;
				Static397.anIntArrayArray168[local67 + 1][local76 + 1] = local238;
			}
		}
		Static379.anInt3836 = local7;
		Static199.anInt3421 = local5;
		return false;
	}
}
