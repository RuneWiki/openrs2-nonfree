import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!uq", name = "o", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_92 = new Class57("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!uq", name = "t", descriptor = "I")
	public static int anInt5995 = 0;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZI)V")
	public static void method5338(@OriginalArg(0) boolean arg0) {
		while (true) {
			if (Static26.aClass3_Sub5_Sub1_2.method858(Static203.anInt3616) >= 15) {
				@Pc(20) int local20 = Static26.aClass3_Sub5_Sub1_2.method859(15);
				if (local20 != 32767) {
					@Pc(27) boolean local27 = false;
					if (Static166.aClass28_Sub1_Sub1_Sub1Array41[local20] == null) {
						Static166.aClass28_Sub1_Sub1_Sub1Array41[local20] = new Class28_Sub1_Sub1_Sub1();
						local27 = true;
						Static166.aClass28_Sub1_Sub1_Sub1Array41[local20].anInt4373 = local20;
					}
					@Pc(48) Class28_Sub1_Sub1_Sub1 local48 = Static166.aClass28_Sub1_Sub1_Sub1Array41[local20];
					Static369.anIntArray664[Static23.anInt305++] = local20;
					local48.anInt4365 = Static76.anInt1617;
					if (local48.aClass61_1 != null && local48.aClass61_1.method1218()) {
						Static45.method705(local48);
					}
					local48.method2967(Static90.aClass83_2.method1716(Static26.aClass3_Sub5_Sub1_2.method859(14)));
					@Pc(93) int local93 = (Static26.aClass3_Sub5_Sub1_2.method859(3) + 4 & 0xB000007) << 11;
					@Pc(98) int local98 = Static26.aClass3_Sub5_Sub1_2.method859(1);
					@Pc(103) int local103 = Static26.aClass3_Sub5_Sub1_2.method859(1);
					if (local103 == 1) {
						Static298.anIntArray570[Static365.anInt6136++] = local20;
					}
					@Pc(121) int local121;
					if (arg0) {
						local121 = Static26.aClass3_Sub5_Sub1_2.method859(8);
						if (local121 > 127) {
							local121 -= 256;
						}
					} else {
						local121 = Static26.aClass3_Sub5_Sub1_2.method859(5);
						if (local121 > 15) {
							local121 -= 32;
						}
					}
					@Pc(147) int local147;
					if (arg0) {
						local147 = Static26.aClass3_Sub5_Sub1_2.method859(8);
						if (local147 > 127) {
							local147 -= 256;
						}
					} else {
						local147 = Static26.aClass3_Sub5_Sub1_2.method859(5);
						if (local147 > 15) {
							local147 -= 32;
						}
					}
					@Pc(167) int local167 = Static26.aClass3_Sub5_Sub1_2.method859(2);
					local48.method4011(local48.aClass61_1.anInt1467);
					local48.anInt4345 = local48.aClass61_1.anInt1433 << 3;
					if (local48.anInt4345 == 0) {
						local48.method4005(0);
					} else if (local27) {
						local48.method4005(local93);
					}
					local48.method2965(local98 == 1, local147 + Static226.aClass28_Sub1_Sub1_Sub2_2.anIntArray491[0], Static226.aClass28_Sub1_Sub1_Sub2_2.anIntArray490[0] - -local121, local167, local48.method4009());
					if (local48.aClass61_1.method1218()) {
						Static329.method5022(local48.anIntArray490[0], 0, null, local48.aByte73, local48, local48.anIntArray491[0], null);
					}
					continue;
				}
			}
			Static26.aClass3_Sub5_Sub1_2.method860();
			return;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method5341(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) long local11 = (long) 0;
		for (@Pc(13) int local13 = 0; local13 < local8; local13++) {
			local11 = (local11 << 5) + (long) arg0.charAt(local13) - local11;
		}
		return local11;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V")
	public static void method5343() {
		@Pc(8) int local8 = Static282.aByteArrayArray18.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static282.aByteArrayArray18[local10] != null) {
				@Pc(24) int local24 = -1;
				for (@Pc(26) int local26 = 0; local26 < Static338.anInt5723; local26++) {
					if (Static98.anIntArray198[local26] == Static136.anIntArray273[local10]) {
						local24 = local26;
						break;
					}
				}
				if (local24 == -1) {
					Static98.anIntArray198[Static338.anInt5723] = Static136.anIntArray273[local10];
					local24 = Static338.anInt5723++;
				}
				@Pc(74) Class3_Sub5 local74 = new Class3_Sub5(Static282.aByteArrayArray18[local10]);
				@Pc(76) int local76 = 0;
				while (local74.anInt3121 < Static282.aByteArrayArray18[local10].length && local76 < 511 && Static23.anInt305 < 1023) {
					@Pc(93) int local93 = local76++ << 6 | local24;
					@Pc(97) int local97 = local74.method2767();
					@Pc(101) int local101 = local97 >> 14;
					@Pc(107) int local107 = local97 >> 7 & 0x3F;
					@Pc(111) int local111 = local97 & 0x3F;
					@Pc(123) int local123 = local107 + (Static136.anIntArray273[local10] >> 8) * 64 - Static21.anInt265;
					@Pc(137) int local137 = (Static136.anIntArray273[local10] & 0xFF) * 64 + local111 - Static103.anInt2044;
					@Pc(146) Class61 local146 = Static90.aClass83_2.method1716(local74.method2767());
					if (Static166.aClass28_Sub1_Sub1_Sub1Array41[local93] == null && (local146.aByte18 & 0x1) > 0 && Static24.anInt332 == local101 && local123 >= 0 && Static12.anInt161 > local146.anInt1467 + local123 && local137 >= 0 && Static44.anInt787 > local146.anInt1467 + local137) {
						Static166.aClass28_Sub1_Sub1_Sub1Array41[local93] = new Class28_Sub1_Sub1_Sub1();
						Static166.aClass28_Sub1_Sub1_Sub1Array41[local93].anInt4373 = local93;
						@Pc(207) Class28_Sub1_Sub1_Sub1 local207 = Static166.aClass28_Sub1_Sub1_Sub1Array41[local93];
						Static369.anIntArray664[Static23.anInt305++] = local93;
						local207.anInt4365 = Static76.anInt1617;
						local207.method2967(local146);
						local207.method4011(local207.aClass61_1.anInt1467);
						local207.anInt4345 = local207.aClass61_1.anInt1433 << 3;
						if (local207.anInt4345 == 0) {
							local207.method4005(0);
						} else {
							local207.method4005(local207.aClass61_1.aByte21 + 4 << 11 & 0x3B73);
						}
						local207.method2965(true, local123, local137, local101, local207.method4009());
					}
				}
			}
		}
	}
}
