import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!tu", name = "i", descriptor = "I")
	public static int anInt5057;

	@OriginalMember(owner = "client!tu", name = "k", descriptor = "I")
	public static int anInt5059;

	@OriginalMember(owner = "client!tu", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString35 = "";

	@OriginalMember(owner = "client!tu", name = "u", descriptor = "I")
	public static int anInt5066 = -1;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(BII)V")
	public static void method4236(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static358.anInt6379 = arg1 - Static7.anInt1139;
		Static96.anInt5951 = arg0 - Static7.anInt1150;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!ps;BLclient!eq;)V")
	public static void method4237(@OriginalArg(0) Interface8 arg0, @OriginalArg(2) Class66 arg1) {
		if (Static7.aClass6_Sub2_Sub15_2 == null) {
			return;
		}
		if (Static263.anInt4747 < 10) {
			if (!Static7.aClass100_8.method2496(Static7.aClass6_Sub2_Sub15_2.aString64)) {
				Static263.anInt4747 = Static173.aClass100_34.method2508(Static7.aClass6_Sub2_Sub15_2.aString64) / 10;
				return;
			}
			Static87.method1591();
			Static263.anInt4747 = 10;
		}
		if (Static263.anInt4747 == 10) {
			Static7.anInt1150 = Static7.aClass6_Sub2_Sub15_2.anInt7192 >> 6 << 6;
			Static7.anInt1139 = Static7.aClass6_Sub2_Sub15_2.anInt7195 >> 6 << 6;
			Static7.anInt1141 = (Static7.aClass6_Sub2_Sub15_2.anInt7197 >> 6 << 6) - (Static7.anInt1139 - 64);
			Static7.anInt1147 = (Static7.aClass6_Sub2_Sub15_2.anInt7186 >> 6 << 6) + 64 - Static7.anInt1150;
			@Pc(75) int[] local75 = new int[3];
			@Pc(77) int local77 = -1;
			@Pc(79) int local79 = -1;
			if (Static7.aClass6_Sub2_Sub15_2.method5931(Static2.anInt6396 + (Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7202 >> 7), local75, Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103, Static348.anInt6273 + (Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7207 >> 7))) {
				local77 = local75[1] - Static7.anInt1139;
				local79 = local75[2] - Static7.anInt1150;
			}
			if (!Static228.aBoolean278 && local77 >= 0 && local77 < Static7.anInt1141 && local79 >= 0 && local79 < Static7.anInt1147) {
				local79 += (int) (Math.random() * 10.0D) - 5;
				local77 += (int) (Math.random() * 10.0D) - 5;
				Static226.anInt5617 = local77;
				Static242.anInt4490 = local79;
			} else if (Static241.anInt7798 == -1 || Static94.anInt2154 == -1) {
				Static7.aClass6_Sub2_Sub15_2.method5928(local75, Static7.aClass6_Sub2_Sub15_2.anInt7193 & 0x3FFF, Static7.aClass6_Sub2_Sub15_2.anInt7193 >> 14 & 0x3FFF);
				Static242.anInt4490 = local75[2] - Static7.anInt1150;
				Static226.anInt5617 = local75[1] - Static7.anInt1139;
			} else {
				Static7.aClass6_Sub2_Sub15_2.method5928(local75, Static94.anInt2154, Static241.anInt7798);
				if (local75 != null) {
					Static226.anInt5617 = local75[1] - Static7.anInt1139;
					Static242.anInt4490 = local75[2] - Static7.anInt1150;
				}
				Static94.anInt2154 = -1;
				Static241.anInt7798 = -1;
				Static228.aBoolean278 = false;
			}
			if (Static7.aClass6_Sub2_Sub15_2.anInt7188 == 37) {
				Static7.aFloat8 = 3.0F;
				Static7.aFloat7 = 3.0F;
			} else if (Static7.aClass6_Sub2_Sub15_2.anInt7188 == 50) {
				Static7.aFloat8 = 4.0F;
				Static7.aFloat7 = 4.0F;
			} else if (Static7.aClass6_Sub2_Sub15_2.anInt7188 == 75) {
				Static7.aFloat8 = 6.0F;
				Static7.aFloat7 = 6.0F;
			} else if (Static7.aClass6_Sub2_Sub15_2.anInt7188 == 100) {
				Static7.aFloat8 = 8.0F;
				Static7.aFloat7 = 8.0F;
			} else if (Static7.aClass6_Sub2_Sub15_2.anInt7188 == 200) {
				Static7.aFloat8 = 16.0F;
				Static7.aFloat7 = 16.0F;
			} else {
				Static7.aFloat8 = 8.0F;
				Static7.aFloat7 = 8.0F;
			}
			Static7.anInt1137 = (int) Static7.aFloat8 >> 1;
			Static7.aByteArrayArrayArray2 = Static112.method1964(Static7.anInt1137);
			Static306.method4501();
			Static7.method925();
			Static173.aClass244_15 = new Class244();
			Static7.anInt1138 += (int) (Math.random() * 5.0D) - 2;
			if (Static7.anInt1138 < -8) {
				Static7.anInt1138 = -8;
			}
			if (Static7.anInt1138 > 8) {
				Static7.anInt1138 = 8;
			}
			Static7.anInt1136 += (int) (Math.random() * 5.0D) - 2;
			if (Static7.anInt1136 < -16) {
				Static7.anInt1136 = -16;
			}
			if (Static7.anInt1136 > 16) {
				Static7.anInt1136 = 16;
			}
			Static7.method937(arg0, Static7.anInt1138 >> 2 << 10, Static7.anInt1136 >> 1);
			Static7.aClass169_6.method3951(1024, 256);
			Static7.aClass108_2.method2646(256, 256);
			Static7.aClass104_2.method2614(4096);
			Static69.aClass103_1.method2609(256);
			Static263.anInt4747 = 20;
		} else if (Static263.anInt4747 == 20) {
			Static131.method2328(true);
			Static7.method932(arg1, Static7.anInt1138, Static7.anInt1136);
			Static263.anInt4747 = 60;
			Static131.method2328(true);
			Static76.method6388();
		} else if (Static263.anInt4747 == 60) {
			if (Static7.aClass100_8.method2503(Static7.aClass6_Sub2_Sub15_2.aString64 + "_staticelements")) {
				if (!Static7.aClass100_8.method2496(Static7.aClass6_Sub2_Sub15_2.aString64 + "_staticelements")) {
					return;
				}
				Static7.aClass202_2 = Static116.method2021(Static7.aClass6_Sub2_Sub15_2.aString64 + "_staticelements", Static7.aClass100_8, Static48.aBoolean101);
			} else {
				Static7.aClass202_2 = new Class202(0);
			}
			Static7.method924();
			Static263.anInt4747 = 70;
			Static131.method2328(true);
			Static76.method6388();
		} else if (Static263.anInt4747 == 70) {
			Static76.aClass116_34 = new Class116(arg1, 11, true, Static280.aCanvas3);
			Static263.anInt4747 = 73;
			Static131.method2328(true);
			Static76.method6388();
		} else if (Static263.anInt4747 == 73) {
			Static305.aClass116_24 = new Class116(arg1, 12, true, Static280.aCanvas3);
			Static263.anInt4747 = 76;
			Static131.method2328(true);
			Static76.method6388();
		} else if (Static263.anInt4747 == 76) {
			Static44.aClass116_7 = new Class116(arg1, 14, true, Static280.aCanvas3);
			Static263.anInt4747 = 79;
			Static131.method2328(true);
			Static76.method6388();
		} else if (Static263.anInt4747 == 79) {
			Static244.aClass116_33 = new Class116(arg1, 17, true, Static280.aCanvas3);
			Static263.anInt4747 = 82;
			Static131.method2328(true);
			Static76.method6388();
		} else if (Static263.anInt4747 == 82) {
			Static435.aClass116_32 = new Class116(arg1, 19, true, Static280.aCanvas3);
			Static263.anInt4747 = 85;
			Static131.method2328(true);
			Static76.method6388();
		} else if (Static263.anInt4747 == 85) {
			Static20.aClass116_5 = new Class116(arg1, 22, true, Static280.aCanvas3);
			Static263.anInt4747 = 88;
			Static131.method2328(true);
			Static76.method6388();
		} else if (Static263.anInt4747 == 88) {
			Static42.aClass116_6 = new Class116(arg1, 26, true, Static280.aCanvas3);
			Static263.anInt4747 = 91;
			Static131.method2328(true);
			Static76.method6388();
		} else {
			Static431.aClass116_31 = new Class116(arg1, 30, true, Static280.aCanvas3);
			Static263.anInt4747 = 100;
			Static131.method2328(true);
			Static76.method6388();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z)V")
	public static void method4239() {
		if (Static291.aClass28_Sub1_1.method832(Static294.anInt5208) || Static232.anInt4221 == Static388.anInt6870) {
			Static292.method4379(Static126.aClass66_5);
			if (Static388.anInt6870 != Static447.anInt7425) {
				Static346.method5190();
			}
		} else {
			Static86.method821(false, false, Static372.anInt6696, Static96.anInt5953);
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(III)V")
	public static void method4241(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub2_Sub7 local8 = Static212.method3218(arg1, 14);
		local8.method3088();
		local8.anInt3749 = arg0;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(B[B)[B")
	public static byte[] method4244(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class6_Sub1 local8 = new Class6_Sub1(arg0);
		@Pc(12) int local12 = local8.method6433();
		@Pc(18) int local18 = local8.method6442();
		if (local18 < 0 || Static233.anInt4266 != 0 && Static233.anInt4266 < local18) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(83) byte[] local83 = new byte[local18];
			local8.method6434(local83, local18);
			return local83;
		} else {
			@Pc(44) int local44 = local8.method6442();
			if (local44 < 0 || Static233.anInt4266 != 0 && local44 > Static233.anInt4266) {
				throw new RuntimeException();
			}
			@Pc(61) byte[] local61 = new byte[local44];
			if (local12 == 1) {
				Static351.method5240(local61, local44, arg0, local18);
			} else {
				Static308.aClass35_1.method975(local8, local61);
			}
			return local61;
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZI)I")
	public static int method4245(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(II)I")
	public static int method4249(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local12 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local12 == 19 || local12 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(B[II[II)V")
	public static void method4251(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(22) int local22 = (arg3 + arg1) / 2;
		@Pc(24) int local24 = arg3;
		@Pc(28) int local28 = arg0[local22];
		arg0[local22] = arg0[arg1];
		arg0[arg1] = local28;
		@Pc(42) int local42 = arg2[local22];
		arg2[local22] = arg2[arg1];
		arg2[arg1] = local42;
		@Pc(61) int local61 = ~local28 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(63) int local63 = arg3; local63 < arg1; local63++) {
			if (arg0[local63] < local28 + (local61 & local63)) {
				@Pc(83) int local83 = arg0[local63];
				arg0[local63] = arg0[local24];
				arg0[local24] = local83;
				@Pc(97) int local97 = arg2[local63];
				arg2[local63] = arg2[local24];
				arg2[local24++] = local97;
			}
		}
		arg0[arg1] = arg0[local24];
		arg0[local24] = local28;
		arg2[arg1] = arg2[local24];
		arg2[local24] = local42;
		method4251(arg0, local24 - 1, arg2, arg3);
		method4251(arg0, arg1, arg2, local24 + 1);
	}
}
