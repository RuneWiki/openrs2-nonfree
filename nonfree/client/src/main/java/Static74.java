import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!fc", name = "R", descriptor = "Lclient!vh;")
	public static Class177 aClass177_1;

	@OriginalMember(owner = "client!fc", name = "Z", descriptor = "[I")
	public static int[] anIntArray143;

	@OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
	public static int anInt1511 = 0;

	@OriginalMember(owner = "client!fc", name = "Q", descriptor = "Z")
	public static boolean aBoolean87 = false;

	@OriginalMember(owner = "client!fc", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString60 = "Continue";

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!cg;II)[Lclient!wb;")
	public static Class4_Sub2_Sub4[] method1256(@OriginalArg(0) int arg0, @OriginalArg(1) Class22 arg1) {
		return Static225.method3549(0, arg1, arg0) ? Static286.method4472() : null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BC)Z")
	public static boolean method1257(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)Z")
	public static boolean method1258(@OriginalArg(1) int arg0) {
		Static5.aBoolean8 = true;
		Static188.anInt5752 = arg0 + 1 & 0xFFFF;
		return true;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIZZ)V")
	public static void method1259(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(3) int local3;
		@Pc(16) Class13_Sub5_Sub2 local16;
		@Pc(81) int local81;
		@Pc(175) int local175;
		@Pc(187) int local187;
		@Pc(209) int local209;
		@Pc(214) int local214;
		@Pc(101) int local101;
		for (local3 = 0; local3 < Static99.anInt1950; local3++) {
			local16 = Static260.aClass13_Sub5_Sub2Array114[Static123.anIntArray214[local3]];
			if (local16 != null && local16.method4213() && local16.aClass185_1.method4649()) {
				@Pc(33) int local33 = local16.method4219();
				if (arg2) {
					if (!local16.aClass185_1.aBoolean397) {
						continue;
					}
				} else if (arg1 != local16.aClass185_1.aBoolean402 || arg0 != 0 && local33 != arg0) {
					continue;
				}
				@Pc(76) int local76;
				if (local33 == 1) {
					if ((local16.anInt5334 & 0x7F) == 64 && (local16.anInt5294 & 0x7F) == 64) {
						local76 = local16.anInt5334 >> 7;
						local81 = local16.anInt5294 >> 7;
						if (local76 >= 0 && local76 < 104 && local81 >= 0 && local81 < 104) {
							local101 = Static274.anIntArrayArray37[local76][local81]++;
						}
					}
				} else if (((local33 & 0x1) != 0 || (local16.anInt5334 & 0x7F) == 0 && (local16.anInt5294 & 0x7F) == 0) && ((local33 & 0x1) != 1 || (local16.anInt5334 & 0x7F) == 64 && (local16.anInt5294 & 0x7F) == 64)) {
					local76 = local16.anInt5334 - local33 * 64 >> 7;
					local81 = local16.anInt5294 - local33 * 64 >> 7;
					local175 = local16.method4219() + local76;
					if (local175 > 104) {
						local175 = 104;
					}
					local187 = local81 + local16.method4219();
					if (local81 < 0) {
						local81 = 0;
					}
					if (local76 < 0) {
						local76 = 0;
					}
					if (local187 > 104) {
						local187 = 104;
					}
					for (local209 = local76; local209 < local175; local209++) {
						for (local214 = local81; local214 < local187; local214++) {
							local101 = Static274.anIntArrayArray37[local209][local214]++;
						}
					}
				}
			}
		}
		label211: for (local3 = 0; local3 < Static99.anInt1950; local3++) {
			local16 = Static260.aClass13_Sub5_Sub2Array114[Static123.anIntArray214[local3]];
			@Pc(269) long local269 = (long) Static123.anIntArray214[local3] << 32 | 0x20000000L;
			if (local16 != null && local16.method4213() && local16.aClass185_1.method4649()) {
				local81 = local16.method4219();
				if (arg2) {
					if (!local16.aClass185_1.aBoolean397) {
						continue;
					}
				} else if (local16.aClass185_1.aBoolean402 != arg1 || arg0 != 0 && arg0 != local81) {
					continue;
				}
				local16.aBoolean352 = true;
				if (local81 == 1) {
					if ((local16.anInt5334 & 0x7F) == 64 && (local16.anInt5294 & 0x7F) == 64) {
						local187 = local16.anInt5294 >> 7;
						local175 = local16.anInt5334 >> 7;
						if (local175 < 0 || local175 >= 104 || local187 < 0 || local187 >= 104) {
							continue;
						}
						if (Static274.anIntArrayArray37[local175][local187] > 1) {
							local101 = Static274.anIntArrayArray37[local175][local187]--;
							continue;
						}
					}
				} else if ((local81 & 0x1) == 0 && (local16.anInt5334 & 0x7F) == 0 && (local16.anInt5294 & 0x7F) == 0 || (local81 & 0x1) == 1 && (local16.anInt5334 & 0x7F) == 64 && (local16.anInt5294 & 0x7F) == 64) {
					local175 = local16.anInt5334 - local81 * 64 >> 7;
					local187 = local16.anInt5294 - local81 * 64 >> 7;
					local209 = local175 + local81;
					if (local175 < 0) {
						local175 = 0;
					}
					if (local209 > 104) {
						local209 = 104;
					}
					local214 = local187 + local81;
					if (local214 > 104) {
						local214 = 104;
					}
					if (local187 < 0) {
						local187 = 0;
					}
					@Pc(424) boolean local424 = true;
					@Pc(426) int local426;
					@Pc(435) int local435;
					for (local426 = local175; local426 < local209; local426++) {
						for (local435 = local187; local435 < local214; local435++) {
							if (Static274.anIntArrayArray37[local426][local435] <= 1) {
								local424 = false;
								break;
							}
						}
					}
					if (local424) {
						local426 = local175;
						while (true) {
							if (local209 <= local426) {
								continue label211;
							}
							for (local435 = local187; local435 < local214; local435++) {
								local101 = Static274.anIntArrayArray37[local426][local435]--;
							}
							local426++;
						}
					}
				}
				if (!local16.aClass185_1.aBoolean400) {
					local269 |= Long.MIN_VALUE;
				}
				local16.aBoolean352 = false;
				local16.anInt5315 = Static58.method2504(local16.anInt5294, local16.anInt5334, Static222.anInt4467);
				Static234.method3640(Static222.anInt4467, local16.anInt5334, local16.anInt5294, local16.anInt5315, local81 * 64 + 60 - 64, local16, local16.anInt5261, local269, local16.aBoolean353);
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)Lclient!n;")
	public static Class4_Sub2_Sub4_Sub2 method1262() {
		@Pc(21) int local21 = Static246.anIntArray386[0] * Static107.anIntArray188[0];
		@Pc(25) byte[] local25 = Static99.aByteArrayArray8[0];
		@Pc(73) Class4_Sub2_Sub4_Sub2 local73;
		if (Static248.aBooleanArray33[0]) {
			@Pc(79) byte[] local79 = Static95.aByteArrayArray7[0];
			@Pc(82) int[] local82 = new int[local21];
			for (@Pc(84) int local84 = 0; local84 < local21; local84++) {
				local82[local84] = (local79[local84] & 0xFF) << 24 | Static138.anIntArray228[local25[local84] & 0xFF];
			}
			local73 = new Class4_Sub2_Sub4_Sub2_Sub1(Static31.anInt651, Static161.anInt3300, Static149.anIntArray238[0], Static278.anIntArray422[0], Static107.anIntArray188[0], Static246.anIntArray386[0], local82);
		} else {
			@Pc(32) int[] local32 = new int[local21];
			for (@Pc(34) int local34 = 0; local34 < local21; local34++) {
				local32[local34] = Static138.anIntArray228[local25[local34] & 0xFF];
			}
			local73 = new Class4_Sub2_Sub4_Sub2(Static31.anInt651, Static161.anInt3300, Static149.anIntArray238[0], Static278.anIntArray422[0], Static107.anIntArray188[0], Static246.anIntArray386[0], local32);
		}
		Static184.method2969();
		return local73;
	}
}
