import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!in", name = "d", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(II)Lclient!uj;")
	public static Class335 method3731() {
		return new Class335(1, false);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
	public static void method3732() {
		if (Static33.method929(Static557.anInt9206) || Static379.method5623(Static557.anInt9206)) {
			Static373.method5570(5000, Static371.anInt6572 >> 12, Static322.anInt5904 >> 12);
		} else {
			@Pc(16) int local16 = Static328.aClass4_Sub1_Sub1_Sub2_2.anIntArray521[0] >> 3;
			@Pc(23) int local23 = Static328.aClass4_Sub1_Sub1_Sub2_2.anIntArray522[0] >> 3;
			if (local16 >= 0 && local16 < Static473.anInt8075 >> 3 && local23 >= 0 && Static165.anInt6749 >> 3 > local23) {
				Static373.method5570(5000, local16, local23);
			} else {
				Static373.method5570(0, Static473.anInt8075 >> 4, Static165.anInt6749 >> 4);
			}
		}
		Static97.method1748();
		Static464.method6506();
		Static402.method5870();
		Static85.method1644();
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(III)V")
	public static void method3733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class276 local7 = Static270.aClass276ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass4_Sub5_2 != null) {
			local7.aClass4_Sub5_2 = null;
		}
		if (local7.aClass4_Sub5_3 != null) {
			local7.aClass4_Sub5_3 = null;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V")
	public static void method3734() {
		Static282.aClass6_Sub21_Sub2_1.method6082();
		@Pc(13) int local13 = Static282.aClass6_Sub21_Sub2_1.method6078(8);
		@Pc(18) int local18;
		if (local13 < Static464.anInt7995) {
			for (local18 = local13; local18 < Static464.anInt7995; local18++) {
				Static203.anIntArray262[Static246.anInt4914++] = Static291.anIntArray405[local18];
			}
		}
		if (local13 > Static464.anInt7995) {
			throw new RuntimeException("gnpov1");
		}
		Static464.anInt7995 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(57) int local57 = Static291.anIntArray405[local18];
			@Pc(65) Class4_Sub1_Sub1_Sub1 local65 = ((Class6_Sub34) Static593.aClass128_43.method3263((long) local57)).aClass4_Sub1_Sub1_Sub1_2;
			@Pc(70) int local70 = Static282.aClass6_Sub21_Sub2_1.method6078(1);
			if (local70 == 0) {
				Static291.anIntArray405[Static464.anInt7995++] = local57;
				local65.anInt7080 = Static312.anInt5688;
			} else {
				@Pc(90) int local90 = Static282.aClass6_Sub21_Sub2_1.method6078(2);
				if (local90 == 0) {
					Static291.anIntArray405[Static464.anInt7995++] = local57;
					local65.anInt7080 = Static312.anInt5688;
					Static150.anIntArray197[Static241.anInt4871++] = local57;
				} else {
					@Pc(134) int local134;
					@Pc(144) int local144;
					if (local90 == 1) {
						Static291.anIntArray405[Static464.anInt7995++] = local57;
						local65.anInt7080 = Static312.anInt5688;
						local134 = Static282.aClass6_Sub21_Sub2_1.method6078(3);
						local65.method156(local134, 1);
						local144 = Static282.aClass6_Sub21_Sub2_1.method6078(1);
						if (local144 == 1) {
							Static150.anIntArray197[Static241.anInt4871++] = local57;
						}
					} else if (local90 == 2) {
						Static291.anIntArray405[Static464.anInt7995++] = local57;
						local65.anInt7080 = Static312.anInt5688;
						if (Static282.aClass6_Sub21_Sub2_1.method6078(1) == 1) {
							local134 = Static282.aClass6_Sub21_Sub2_1.method6078(3);
							local65.method156(local134, 2);
							local144 = Static282.aClass6_Sub21_Sub2_1.method6078(3);
							local65.method156(local144, 2);
						} else {
							local134 = Static282.aClass6_Sub21_Sub2_1.method6078(3);
							local65.method156(local134, 0);
						}
						local134 = Static282.aClass6_Sub21_Sub2_1.method6078(1);
						if (local134 == 1) {
							Static150.anIntArray197[Static241.anInt4871++] = local57;
						}
					} else if (local90 == 3) {
						Static203.anIntArray262[Static246.anInt4914++] = local57;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IILclient!pg;ILclient!oa;I)V")
	public static void method3736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class252 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class14 arg4) {
		@Pc(9) Class179 local9 = Static418.aClass3_4.method60(arg2.anInt6886);
		if (local9.anInt5139 == -1) {
			return;
		}
		if (arg2.aBoolean471) {
			@Pc(23) int local23 = arg0 + arg2.anInt6913;
			arg0 = local23 & 0x3;
		} else {
			arg0 = 0;
		}
		@Pc(39) Class58 local39 = local9.method4414(arg2.aBoolean477, arg4, arg0);
		if (local39 == null) {
			return;
		}
		@Pc(45) int local45 = arg2.anInt6935;
		@Pc(48) int local48 = arg2.anInt6898;
		if ((arg0 & 0x1) == 1) {
			local45 = arg2.anInt6898;
			local48 = arg2.anInt6935;
		}
		@Pc(64) int local64 = local39.AA();
		@Pc(71) int local71 = local39.a();
		if (local9.aBoolean363) {
			local71 = local48 * 4;
			local64 = local45 * 4;
		}
		if (local9.anInt5133 == 0) {
			local39.method7657(arg1, arg3 + 4 - local48 * 4, local64, local71);
		} else {
			local39.KA(arg1, arg3 - (local48 - 1) * 4, local64, local71, 0, local9.anInt5133 | 0xFF000000, 1);
		}
	}
}
