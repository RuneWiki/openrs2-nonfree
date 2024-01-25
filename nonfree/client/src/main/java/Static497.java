import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static497 {

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "Lclient!fk;")
	public static Class109 aClass109_1;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)Lclient!bda;")
	public static Class21_Sub1_Sub2 method7181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class182 local7 = Static571.aClass182ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass21_Sub1_Sub2_1;
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V")
	public static void method7183() {
		Static368.method5060(Static292.aClass155_7);
		Static454.anInt8653++;
		if (Static525.aBoolean654 && Static325.aBoolean436) {
			@Pc(32) int local32 = Static294.aClass83_1.method6895();
			@Pc(36) int local36 = Static294.aClass83_1.method6896();
			local32 -= Static221.anInt1106;
			local36 -= Static487.anInt9232;
			if (Static505.anInt9451 > local32) {
				local32 = Static505.anInt9451;
			}
			if (Static95.aClass155_1.anInt4806 + Static505.anInt9451 < Static292.aClass155_7.anInt4806 + local32) {
				local32 = Static505.anInt9451 + Static95.aClass155_1.anInt4806 - Static292.aClass155_7.anInt4806;
			}
			if (Static344.anInt6632 > local36) {
				local36 = Static344.anInt6632;
			}
			if (local36 + Static292.aClass155_7.anInt4831 > Static95.aClass155_1.anInt4831 + Static344.anInt6632) {
				local36 = Static344.anInt6632 + Static95.aClass155_1.anInt4831 - Static292.aClass155_7.anInt4831;
			}
			@Pc(105) int local105 = Static95.aClass155_1.anInt4758 + local32 - Static505.anInt9451;
			@Pc(113) int local113 = Static95.aClass155_1.anInt4762 + local36 - Static344.anInt6632;
			@Pc(130) Class4_Sub37 local130;
			if (Static294.aClass83_1.method6900()) {
				if (Static292.aClass155_7.anInt4751 < Static454.anInt8653) {
					@Pc(205) int local205 = local32 - Static146.anInt3124;
					@Pc(210) int local210 = local36 - Static173.anInt3645;
					if (local205 > Static292.aClass155_7.anInt4748 || -Static292.aClass155_7.anInt4748 > local205 || Static292.aClass155_7.anInt4748 < local210 || -Static292.aClass155_7.anInt4748 > local210) {
						Static383.aBoolean553 = true;
					}
				}
				if (Static292.aClass155_7.anObjectArray7 != null && Static383.aBoolean553) {
					local130 = new Class4_Sub37();
					local130.anInt7557 = local105;
					local130.anInt7562 = local113;
					local130.aClass155_10 = Static292.aClass155_7;
					local130.anObjectArray31 = Static292.aClass155_7.anObjectArray7;
					Static471.method6884(local130);
				}
			} else {
				if (Static383.aBoolean553) {
					Static263.method4151();
					if (Static292.aClass155_7.anObjectArray20 != null) {
						local130 = new Class4_Sub37();
						local130.anObjectArray31 = Static292.aClass155_7.anObjectArray20;
						local130.aClass155_10 = Static292.aClass155_7;
						local130.aClass155_9 = Static204.aClass155_13;
						local130.anInt7557 = local105;
						local130.anInt7562 = local113;
						Static471.method6884(local130);
					}
					if (Static204.aClass155_13 != null && Static70.method1548(Static292.aClass155_7) != null) {
						Static167.method5160(Static204.aClass155_13, Static292.aClass155_7);
					}
				} else if ((Static265.anInt5333 == 1 || Static115.method2105()) && Static384.anInt7556 > 2) {
					Static247.method3955(Static173.anInt3645 + Static487.anInt9232, Static146.anInt3124 + Static221.anInt1106);
				} else if (Static118.method2163()) {
					Static247.method3955(Static487.anInt9232 + Static173.anInt3645, Static146.anInt3124 + Static221.anInt1106);
				}
				Static292.aClass155_7 = null;
			}
		} else if (Static454.anInt8653 > 1) {
			Static292.aClass155_7 = null;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIZI)Ljava/lang/String;")
	public static String method7184(@OriginalArg(3) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(34) int local34 = 2;
		for (@Pc(38) int local38 = arg0 / 10; local38 != 0; local38 /= 10) {
			local34++;
		}
		@Pc(53) char[] local53 = new char[local34];
		local53[0] = '+';
		for (@Pc(61) int local61 = local34 - 1; local61 > 0; local61--) {
			@Pc(65) int local65 = arg0;
			arg0 /= 10;
			@Pc(75) int local75 = local65 - arg0 * 10;
			if (local75 < 10) {
				local53[local61] = (char) (local75 + 48);
			} else {
				local53[local61] = (char) (local75 + 87);
			}
		}
		return new String(local53);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIIIIILclient!nea;)Z")
	public static boolean method7185(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class232 arg9) {
		@Pc(7) int local7 = arg8;
		@Pc(9) int local9 = arg6;
		@Pc(26) int local26 = arg8 - 64;
		Static237.anIntArrayArray26[64][64] = 99;
		@Pc(37) int local37 = arg6 - 64;
		Static481.anIntArrayArray53[64][64] = 0;
		@Pc(45) byte local45 = 0;
		@Pc(47) int local47 = 0;
		Static140.anIntArray146[0] = arg8;
		@Pc(54) int local54 = local45 + 1;
		Static398.anIntArray416[0] = arg6;
		@Pc(59) int[][] local59 = arg9.anIntArrayArray31;
		while (local47 != local54) {
			local7 = Static140.anIntArray146[local47];
			local9 = Static398.anIntArray416[local47];
			@Pc(75) int local75 = local9 - arg9.anInt6654;
			local47 = local47 + 1 & 0xFFF;
			@Pc(86) int local86 = local7 - local26;
			@Pc(92) int local92 = local7 - arg9.anInt6640;
			@Pc(97) int local97 = local9 - local37;
			if (arg0 == -4) {
				if (local7 == arg5 && local9 == arg3) {
					Static263.anInt5323 = local7;
					Static208.anInt4412 = local9;
					return true;
				}
			} else if (arg0 == -3) {
				if (Static407.method6148(1, local7, arg5, 1, local9, arg4, arg1, arg3)) {
					Static263.anInt5323 = local7;
					Static208.anInt4412 = local9;
					return true;
				}
			} else if (arg0 == -2) {
				if (arg9.method5279(arg3, local7, arg7, local9, arg1, 1, 1, arg5, arg4)) {
					Static208.anInt4412 = local9;
					Static263.anInt5323 = local7;
					return true;
				}
			} else if (arg0 == -1) {
				if (arg9.method5277(local9, local7, arg1, arg4, arg5, arg7, arg3, 1)) {
					Static263.anInt5323 = local7;
					Static208.anInt4412 = local9;
					return true;
				}
			} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
				if (arg9.method5267(local9, 1, arg0, arg2, arg5, local7, arg3)) {
					Static263.anInt5323 = local7;
					Static208.anInt4412 = local9;
					return true;
				}
			} else if (arg9.method5265(arg3, 1, arg0, arg5, local9, arg2, local7)) {
				Static208.anInt4412 = local9;
				Static263.anInt5323 = local7;
				return true;
			}
			@Pc(247) int local247 = Static481.anIntArrayArray53[local86][local97] + 1;
			if (local86 > 0 && Static237.anIntArrayArray26[local86 - 1][local97] == 0 && (local59[local92 - 1][local75] & 0x42240000) == 0) {
				Static140.anIntArray146[local54] = local7 - 1;
				Static398.anIntArray416[local54] = local9;
				local54 = local54 + 1 & 0xFFF;
				Static237.anIntArrayArray26[local86 - 1][local97] = 2;
				Static481.anIntArrayArray53[local86 - 1][local97] = local247;
			}
			if (local86 < 127 && Static237.anIntArrayArray26[local86 + 1][local97] == 0 && (local59[local92 + 1][local75] & 0x60240000) == 0) {
				Static140.anIntArray146[local54] = local7 + 1;
				Static398.anIntArray416[local54] = local9;
				Static237.anIntArrayArray26[local86 + 1][local97] = 8;
				local54 = local54 + 1 & 0xFFF;
				Static481.anIntArrayArray53[local86 + 1][local97] = local247;
			}
			if (local97 > 0 && Static237.anIntArrayArray26[local86][local97 - 1] == 0 && (local59[local92][local75 - 1] & 0x40A40000) == 0) {
				Static140.anIntArray146[local54] = local7;
				Static398.anIntArray416[local54] = local9 - 1;
				Static237.anIntArrayArray26[local86][local97 - 1] = 1;
				local54 = local54 + 1 & 0xFFF;
				Static481.anIntArrayArray53[local86][local97 - 1] = local247;
			}
			if (local97 < 127 && Static237.anIntArrayArray26[local86][local97 + 1] == 0 && (local59[local92][local75 + 1] & 0x48240000) == 0) {
				Static140.anIntArray146[local54] = local7;
				Static398.anIntArray416[local54] = local9 + 1;
				local54 = local54 + 1 & 0xFFF;
				Static237.anIntArrayArray26[local86][local97 + 1] = 4;
				Static481.anIntArrayArray53[local86][local97 + 1] = local247;
			}
			if (local86 > 0 && local97 > 0 && Static237.anIntArrayArray26[local86 - 1][local97 - 1] == 0 && (local59[local92 - 1][local75 - 1] & 0x43A40000) == 0 && (local59[local92 - 1][local75] & 0x42240000) == 0 && (local59[local92][local75 - 1] & 0x40A40000) == 0) {
				Static140.anIntArray146[local54] = local7 - 1;
				Static398.anIntArray416[local54] = local9 - 1;
				local54 = local54 + 1 & 0xFFF;
				Static237.anIntArrayArray26[local86 - 1][local97 - 1] = 3;
				Static481.anIntArrayArray53[local86 - 1][local97 - 1] = local247;
			}
			if (local86 < 127 && local97 > 0 && Static237.anIntArrayArray26[local86 + 1][local97 - 1] == 0 && (local59[local92 + 1][local75 - 1] & 0x60E40000) == 0 && (local59[local92 + 1][local75] & 0x60240000) == 0 && (local59[local92][local75 - 1] & 0x40A40000) == 0) {
				Static140.anIntArray146[local54] = local7 + 1;
				Static398.anIntArray416[local54] = local9 - 1;
				local54 = local54 + 1 & 0xFFF;
				Static237.anIntArrayArray26[local86 + 1][local97 - 1] = 9;
				Static481.anIntArrayArray53[local86 + 1][local97 - 1] = local247;
			}
			if (local86 > 0 && local97 < 127 && Static237.anIntArrayArray26[local86 - 1][local97 + 1] == 0 && (local59[local92 - 1][local75 + 1] & 0x4E240000) == 0 && (local59[local92 - 1][local75] & 0x42240000) == 0 && (local59[local92][local75 + 1] & 0x48240000) == 0) {
				Static140.anIntArray146[local54] = local7 - 1;
				Static398.anIntArray416[local54] = local9 + 1;
				local54 = local54 + 1 & 0xFFF;
				Static237.anIntArrayArray26[local86 - 1][local97 + 1] = 6;
				Static481.anIntArrayArray53[local86 - 1][local97 + 1] = local247;
			}
			if (local86 < 127 && local97 < 127 && Static237.anIntArrayArray26[local86 + 1][local97 + 1] == 0 && (local59[local92 + 1][local75 + 1] & 0x78240000) == 0 && (local59[local92 + 1][local75] & 0x60240000) == 0 && (local59[local92][local75 + 1] & 0x48240000) == 0) {
				Static140.anIntArray146[local54] = local7 + 1;
				Static398.anIntArray416[local54] = local9 + 1;
				Static237.anIntArrayArray26[local86 + 1][local97 + 1] = 12;
				local54 = local54 + 1 & 0xFFF;
				Static481.anIntArrayArray53[local86 + 1][local97 + 1] = local247;
			}
		}
		Static208.anInt4412 = local9;
		Static263.anInt5323 = local7;
		return false;
	}
}
