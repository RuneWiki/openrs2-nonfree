import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static576 {

	@OriginalMember(owner = "client!sea", name = "m", descriptor = "Lclient!hb;")
	public static final Class146 aClass146_9 = new Class146();

	@OriginalMember(owner = "client!sea", name = "n", descriptor = "I")
	public static int anInt9090 = -1;

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(ZLclient!et;)Lclient!mw;")
	public static Class120_Sub3 method8011(@OriginalArg(1) Class2_Sub20 arg0) {
		return new Class120_Sub3(arg0.method8598(), arg0.method8598(), arg0.method8598(), arg0.method8598(), arg0.method8583(), arg0.method8583(), arg0.method8581(-17416));
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(I[FI[I[FIII[IIIII)V")
	public static void method8012(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(18) int local18 = arg5 + arg7 * arg9;
		@Pc(24) int local24 = arg2 + arg10 * arg0;
		@Pc(29) int local29 = arg7 - arg6;
		@Pc(33) int local33 = arg0 - arg6;
		@Pc(37) int local37;
		@Pc(43) int local43;
		if (arg8 == null) {
			for (local37 = 0; local37 < arg11; local37++) {
				local43 = local18 + arg6;
				while (local43 > local18) {
					arg4[local24++] = arg1[local18++];
				}
				local24 += local33;
				local18 += local29;
			}
		} else if (arg1 == null) {
			for (local37 = 0; local37 < arg11; local37++) {
				local43 = local18 + arg6;
				while (local43 > local18) {
					arg3[local24++] = arg8[local18++];
				}
				local24 += local33;
				local18 += local29;
			}
		} else {
			for (local37 = 0; local37 < arg11; local37++) {
				local43 = arg6 + local18;
				while (local18 < local43) {
					arg3[local24] = arg8[local18];
					arg4[local24++] = arg1[local18++];
				}
				local24 += local33;
				local18 += local29;
			}
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(ILclient!oh;II)V")
	public static void method8013(@OriginalArg(0) int arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aByte103 == 0) {
			arg1.anInt7346 = arg1.anInt7364;
		} else if (arg1.aByte103 == 1) {
			arg1.anInt7346 = arg1.anInt7364 + (arg2 - arg1.anInt7385) / 2;
		} else if (arg1.aByte103 == 2) {
			arg1.anInt7346 = arg2 - arg1.anInt7364 - arg1.anInt7385;
		} else if (arg1.aByte103 == 3) {
			arg1.anInt7346 = arg2 * arg1.anInt7364 >> 14;
		} else if (arg1.aByte103 == 4) {
			arg1.anInt7346 = (arg2 - arg1.anInt7385) / 2 + (arg2 * arg1.anInt7364 >> 14);
		} else {
			arg1.anInt7346 = arg2 - arg1.anInt7385 - (arg1.anInt7364 * arg2 >> 14);
		}
		if (arg1.aByte105 == 0) {
			arg1.anInt7373 = arg1.anInt7357;
		} else if (arg1.aByte105 == 1) {
			arg1.anInt7373 = (arg0 - arg1.anInt7402) / 2 + arg1.anInt7357;
		} else if (arg1.aByte105 == 2) {
			arg1.anInt7373 = arg0 - arg1.anInt7402 - arg1.anInt7357;
		} else if (arg1.aByte105 == 3) {
			arg1.anInt7373 = arg0 * arg1.anInt7357 >> 14;
		} else if (arg1.aByte105 == 4) {
			arg1.anInt7373 = (arg0 - arg1.anInt7402) / 2 + (arg1.anInt7357 * arg0 >> 14);
		} else {
			arg1.anInt7373 = arg0 - arg1.anInt7402 - (arg0 * arg1.anInt7357 >> 14);
		}
		if (!Static311.aBoolean411 || Static91.method1412(arg1).anInt3441 == 0 && arg1.anInt7371 != 0) {
			return;
		}
		if (arg1.anInt7373 < 0) {
			arg1.anInt7373 = 0;
		} else if (arg1.anInt7402 + arg1.anInt7373 > arg0) {
			arg1.anInt7373 = arg0 - arg1.anInt7402;
		}
		if (arg1.anInt7346 < 0) {
			arg1.anInt7346 = 0;
		} else if (arg2 < arg1.anInt7385 + arg1.anInt7346) {
			arg1.anInt7346 = arg2 - arg1.anInt7385;
			return;
		}
	}

	@OriginalMember(owner = "client!sea", name = "e", descriptor = "(I)V")
	public static void method8014() {
		Static718.anInt10954 = -1;
		Static711.anInt10853 = -1;
		Static618.method8402(0);
		@Pc(22) int local22;
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static426.anInt6942 >> 3; local18++) {
				for (local22 = 0; local22 < Static280.anInt6752 >> 3; local22++) {
					Static675.anIntArrayArrayArray26[local14][local18][local22] = -1;
				}
			}
		}
		@Pc(93) int local93;
		@Pc(98) int local98;
		@Pc(101) int local101;
		@Pc(104) int local104;
		@Pc(107) int local107;
		@Pc(110) int local110;
		@Pc(113) int local113;
		@Pc(116) int local116;
		for (@Pc(73) Class2_Sub32 local73 = (Class2_Sub32) Static131.aClass60_42.method1226(7); local73 != null; local73 = (Class2_Sub32) Static131.aClass60_42.method1228()) {
			local22 = local73.anInt3869;
			@Pc(88) boolean local88 = (local22 & 0x1) == 1;
			local93 = local73.anInt3865 >> 3;
			local98 = local73.anInt3868 >> 3;
			local101 = local73.anInt3870;
			local104 = local73.anInt3874;
			local107 = local73.anInt3875;
			local110 = local73.anInt3866;
			local113 = local73.anInt3867;
			local116 = local73.anInt3876;
			@Pc(118) int local118 = 0;
			@Pc(120) int local120 = 0;
			@Pc(122) byte local122 = 1;
			@Pc(124) byte local124 = 1;
			if (local22 == 1) {
				local122 = -1;
				local120 = local113 - 1;
			} else if (local22 == 2) {
				local120 = local113 - 1;
				local124 = -1;
				local118 = local116 - 1;
				local122 = -1;
			} else if (local22 == 3) {
				local122 = 1;
				local124 = -1;
				local118 = local116 - 1;
			}
			@Pc(173) int local173 = local98;
			while (local98 + local116 > local173) {
				@Pc(177) int local177 = local120;
				@Pc(179) int local179 = local93;
				while (local93 + local113 > local179) {
					if (local88) {
						Static675.anIntArrayArrayArray26[local110][local101 + local118][local177 + local104] = (local22 << 1) + (local173 << 3) + (local179 << 14) + (local107 << 24);
					} else {
						Static675.anIntArrayArrayArray26[local110][local101 + local177][local104 + local118] = (local22 << 1) + (local173 << 3) + (local107 << 24) + (local179 << 14);
					}
					local179++;
					local177 += local122;
				}
				local173++;
				local118 += local124;
			}
		}
		local22 = Static515.anIntArrayArray53.length;
		Static148.anIntArray187 = new int[local22];
		Static608.anIntArray687 = null;
		Static398.anIntArray452 = new int[local22];
		Static336.aByteArrayArray10 = new byte[local22][];
		Static523.anIntArray462 = new int[local22];
		Static495.aByteArrayArray17 = null;
		Static453.aByteArrayArray13 = new byte[local22][];
		Static671.aByteArrayArray26 = new byte[local22][];
		Static453.anIntArray534 = new int[local22];
		Static9.anIntArray32 = new int[local22];
		Static100.aByteArrayArray1 = new byte[local22][];
		local22 = 0;
		for (@Pc(333) Class2_Sub32 local333 = (Class2_Sub32) Static131.aClass60_42.method1226(7); local333 != null; local333 = (Class2_Sub32) Static131.aClass60_42.method1228()) {
			local93 = local333.anInt3865 >>> -353968189;
			local98 = local333.anInt3868 >>> 3;
			local101 = local93 + local333.anInt3867;
			if ((local101 & 0x7) == 0) {
				local101--;
			}
			local101 >>>= 0x3;
			local104 = local333.anInt3876 + local98;
			if ((local104 & 0x7) == 0) {
				local104--;
			}
			local104 >>>= 0x3;
			for (local107 = local93 >>> 3; local107 <= local101; local107++) {
				label82: for (local110 = local98 >>> 3; local110 <= local104; local110++) {
					local113 = local110 | local107 << 8;
					for (local116 = 0; local116 < local22; local116++) {
						if (local113 == Static148.anIntArray187[local116]) {
							continue label82;
						}
					}
					Static148.anIntArray187[local22] = local113;
					Static398.anIntArray452[local22] = Static311.aClass254_96.method6077("m" + local107 + "_" + local110);
					Static9.anIntArray32[local22] = Static311.aClass254_96.method6077("l" + local107 + "_" + local110);
					Static523.anIntArray462[local22] = Static311.aClass254_96.method6077("um" + local107 + "_" + local110);
					Static453.anIntArray534[local22] = Static311.aClass254_96.method6077("ul" + local107 + "_" + local110);
					local22++;
				}
			}
		}
		Static152.anIntArrayArray15 = Static515.anIntArrayArray53;
		Static515.anIntArrayArray53 = null;
		Static63.method951(Static426.anInt6942 >> 4, 12, false, Static280.anInt6752 >> 4);
	}
}
