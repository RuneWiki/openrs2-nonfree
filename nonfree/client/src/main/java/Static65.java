import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!eh", name = "M", descriptor = "[B")
	public static byte[] aByteArray9 = new byte[520];

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)I")
	public static int method1193(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (local12 + arg0) / arg1 - local12;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IZ)V")
	public static void method1194(@OriginalArg(1) boolean arg0) {
		Static94.aClass44_9 = null;
		Static250.aByteArrayArrayArray17 = null;
		Static250.aByteArrayArrayArray13 = null;
		if (arg0 && Static250.aClass2_Sub8_Sub16_3 != null) {
			Static270.anInt4256 = Static250.aClass2_Sub8_Sub16_3.anInt4413;
		} else {
			Static270.anInt4256 = -1;
		}
		Static91.anInt2195 = 0;
		Static250.anIntArray314 = null;
		Static250.aByteArrayArrayArray14 = null;
		Static250.anIntArrayArrayArray10 = null;
		Static250.aByteArrayArrayArray15 = null;
		Static250.anIntArrayArrayArray11 = null;
		Static78.aClass56_3 = null;
		Static250.aClass2_Sub8_Sub16_3 = null;
		Static250.aByteArrayArrayArray16 = null;
		Static250.aClass37_10.method1141();
		Static256.aClass87_6 = null;
		Static31.aClass87_2 = null;
		Static281.aClass87_8 = null;
		Static54.anInt1326 = -1;
		Static180.aClass87_5 = null;
		Static18.anInt388 = -1;
		Static89.aClass87_4 = null;
		Static279.aClass87_7 = null;
		Static250.aClass57_3 = null;
		Static73.aClass87_3 = null;
		Static89.aClass2_Sub8_Sub1_7 = null;
		Static13.aClass87_1 = null;
		Static182.aClass2_Sub8_Sub1_Sub1_6 = null;
		Static179.method3209();
		Static64.aClass101_2 = null;
		Static311.aClass101_27 = null;
		Static32.aClass128_1 = null;
		Static160.method4109(128, 64);
		Static99.method1708(64, 64);
		Static10.method163(64);
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)V")
	public static void method1195() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static103.aBooleanArray8[local7] = false;
		}
		Static280.anInt5531 = -1;
		Static16.anInt342 = 1;
		Static84.anInt1965 = 0;
		Static160.anInt5160 = -1;
		Static225.anInt5366 = 0;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1197(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg0;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg0 - arg2;
		@Pc(21) int local21 = arg5 - arg2;
		@Pc(29) int local29 = arg5 * arg5;
		@Pc(33) int local33 = arg0 * arg0;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local16 * local16;
		@Pc(45) int local45 = local33 << 1;
		@Pc(49) int local49 = local29 << 1;
		@Pc(53) int local53 = local41 << 1;
		@Pc(57) int local57 = local37 << 1;
		@Pc(61) int local61 = arg0 << 1;
		@Pc(70) int local70 = local45 + local29 * (1 - local61);
		@Pc(79) int local79 = local33 - (local61 - 1) * local49;
		@Pc(83) int local83 = local29 << 2;
		@Pc(87) int local87 = local16 << 1;
		@Pc(96) int local96 = local53 + (1 - local87) * local37;
		@Pc(105) int local105 = local41 - (local87 - 1) * local57;
		@Pc(109) int local109 = local33 << 2;
		@Pc(113) int local113 = local37 << 2;
		@Pc(117) int local117 = local45 * 3;
		@Pc(121) int local121 = local41 << 2;
		@Pc(127) int local127 = (local61 - 3) * local49;
		@Pc(131) int local131 = local53 * 3;
		@Pc(137) int local137 = (local87 - 3) * local57;
		@Pc(139) int local139 = local109;
		@Pc(145) int local145 = (arg0 - 1) * local83;
		@Pc(147) int local147 = local121;
		@Pc(171) int local171;
		@Pc(179) int local179;
		@Pc(188) int local188;
		@Pc(197) int local197;
		if (Static148.anInt3245 <= arg6 && Static166.anInt3675 >= arg6) {
			@Pc(162) int[] local162 = Static275.anIntArrayArray37[arg6];
			local171 = Static30.method572(Static53.anInt1319, arg3 - arg5, Static81.anInt1915);
			local179 = Static30.method572(Static53.anInt1319, arg5 + arg3, Static81.anInt1915);
			local188 = Static30.method572(Static53.anInt1319, arg3 - local21, Static81.anInt1915);
			local197 = Static30.method572(Static53.anInt1319, arg3 + local21, Static81.anInt1915);
			Static25.method486(local162, local171, local188, arg4);
			Static25.method486(local162, local188, local197, arg1);
			Static25.method486(local162, local197, local179, arg4);
		}
		@Pc(221) int local221 = (local16 - 1) * local113;
		while (local7 > 0) {
			if (local70 < 0) {
				while (local70 < 0) {
					local9++;
					local79 += local139;
					local139 += local109;
					local70 += local117;
					local117 += local109;
				}
			}
			if (local79 < 0) {
				local70 += local117;
				local9++;
				local79 += local139;
				local117 += local109;
				local139 += local109;
			}
			@Pc(282) boolean local282 = local16 >= local7;
			local79 += -local127;
			local70 += -local145;
			local127 -= local83;
			if (local282) {
				if (local96 < 0) {
					while (local96 < 0) {
						local11++;
						local96 += local131;
						local105 += local147;
						local131 += local121;
						local147 += local121;
					}
				}
				if (local105 < 0) {
					local96 += local131;
					local105 += local147;
					local11++;
					local147 += local121;
					local131 += local121;
				}
				local96 += -local221;
				local221 -= local113;
				local105 += -local137;
				local137 -= local113;
			}
			local145 -= local83;
			local7--;
			local171 = arg6 - local7;
			local179 = local7 + arg6;
			if (Static148.anInt3245 <= local179 && Static166.anInt3675 >= local171) {
				local188 = Static30.method572(Static53.anInt1319, arg3 + local9, Static81.anInt1915);
				local197 = Static30.method572(Static53.anInt1319, arg3 - local9, Static81.anInt1915);
				if (local282) {
					@Pc(440) int local440 = Static30.method572(Static53.anInt1319, local11 + arg3, Static81.anInt1915);
					@Pc(449) int local449 = Static30.method572(Static53.anInt1319, arg3 - local11, Static81.anInt1915);
					@Pc(461) int[] local461;
					if (Static148.anInt3245 <= local171) {
						local461 = Static275.anIntArrayArray37[local171];
						Static25.method486(local461, local197, local449, arg4);
						Static25.method486(local461, local449, local440, arg1);
						Static25.method486(local461, local440, local188, arg4);
					}
					if (local179 <= Static166.anInt3675) {
						local461 = Static275.anIntArrayArray37[local179];
						Static25.method486(local461, local197, local449, arg4);
						Static25.method486(local461, local449, local440, arg1);
						Static25.method486(local461, local440, local188, arg4);
					}
				} else {
					if (local171 >= Static148.anInt3245) {
						Static25.method486(Static275.anIntArrayArray37[local171], local197, local188, arg4);
					}
					if (Static166.anInt3675 >= local179) {
						Static25.method486(Static275.anIntArrayArray37[local179], local197, local188, arg4);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)V")
	public static void method1199() {
		Static214.anInt4373 = 0;
		Static222.anInt4523 = 0;
		Static35.method823();
		Static180.method3217();
		Static170.method3088();
		@Pc(17) int local17;
		for (local17 = 0; local17 < Static214.anInt4373; local17++) {
			@Pc(28) int local28 = Static190.anIntArray399[local17];
			if (Static268.anInt5236 != Static35.aClass15_Sub2_Sub1Array2[local28].anInt5378) {
				if (Static35.aClass15_Sub2_Sub1Array2[local28].aClass188_1.method4608()) {
					Static38.method717(Static35.aClass15_Sub2_Sub1Array2[local28]);
				}
				Static35.aClass15_Sub2_Sub1Array2[local28].method633(null);
				Static35.aClass15_Sub2_Sub1Array2[local28] = null;
			}
		}
		if (Static91.aClass2_Sub16_Sub1_1.anInt2789 != Static218.anInt4451) {
			throw new RuntimeException("gnp1 pos:" + Static91.aClass2_Sub16_Sub1_1.anInt2789 + " psize:" + Static218.anInt4451);
		}
		for (local17 = 0; local17 < Static57.anInt1448; local17++) {
			if (Static35.aClass15_Sub2_Sub1Array2[Static89.anIntArray194[local17]] == null) {
				throw new RuntimeException("gnp2 pos:" + local17 + " size:" + Static57.anInt1448);
			}
		}
	}
}
