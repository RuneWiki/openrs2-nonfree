import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!cfa", name = "c", descriptor = "I")
	public static int anInt1720;

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ILclient!ika;)V")
	public static void method1621(@OriginalArg(1) Class3_Sub2 arg0) {
		@Pc(9) int local9 = arg0.method2054();
		Static588.aClass374Array1 = new Class374[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static588.aClass374Array1[local14] = new Class374();
			Static588.aClass374Array1[local14].anInt10058 = arg0.method2054();
			Static588.aClass374Array1[local14].aString121 = arg0.method2027();
		}
		Static711.anInt11000 = arg0.method2054();
		Static42.anInt1246 = arg0.method2054();
		Static274.anInt4207 = arg0.method2054();
		Static612.aClass238_Sub1Array2 = new Class238_Sub1[Static42.anInt1246 + 1 - Static711.anInt11000];
		for (@Pc(68) int local68 = 0; local68 < Static274.anInt4207; local68++) {
			@Pc(78) int local78 = arg0.method2054();
			@Pc(86) Class238_Sub1 local86 = Static612.aClass238_Sub1Array2[local78] = new Class238_Sub1();
			local86.anInt6071 = arg0.method2048(255);
			local86.anInt6068 = arg0.method2036();
			local86.anInt6079 = local78 + Static711.anInt11000;
			local86.aString80 = arg0.method2027();
			local86.aString79 = arg0.method2027();
		}
		Static97.anInt2129 = arg0.method2036();
		Static303.aBoolean319 = true;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIILclient!rf;Lclient!ka;IIBLclient!ha;IIII)Lclient!ka;")
	public static Class170 method1622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class45 arg3, @OriginalArg(4) Class170 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class22 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg4 == null) {
			return null;
		}
		@Pc(12) int local12 = 2055;
		if (arg3 != null) {
			local12 = arg3.method6588() | 0x807;
			local12 &= 0xFFFFFDFF;
		}
		@Pc(53) long local53 = ((long) arg1 << 32) + (long) ((arg11 << 24) + arg0 + (arg8 << 16)) + ((long) arg2 << 48);
		@Pc(55) Class307 local55 = Static41.aClass307_11;
		@Pc(63) Class170 local63;
		synchronized (Static41.aClass307_11) {
			local63 = (Class170) Static41.aClass307_11.method7002(local53);
		}
		if (local63 == null || arg7.method9324(local63.ua(), local12) != 0) {
			if (local63 != null) {
				local12 = arg7.method9375(local12, local63.ua());
			}
			@Pc(97) byte local97;
			if (arg0 == 1) {
				local97 = 9;
			} else if (arg0 == 2) {
				local97 = 12;
			} else if (arg0 == 3) {
				local97 = 15;
			} else if (arg0 == 4) {
				local97 = 18;
			} else {
				local97 = 21;
			}
			@Pc(139) int[] local139 = new int[] { 64, 96, 128 };
			@Pc(158) Class145 local158 = new Class145(local97 * 3 + 1, -local97 + local97 * 3 * 2, 0);
			@Pc(165) int local165 = local158.method3289(0, 0, 0);
			@Pc(169) int[][] local169 = new int[3][local97];
			@Pc(177) int local177;
			@Pc(181) int local181;
			@Pc(183) int local183;
			@Pc(207) int local207;
			for (@Pc(171) int local171 = 0; local171 < 3; local171++) {
				local177 = local139[local171];
				local181 = local139[local171];
				for (local183 = 0; local183 < local97; local183++) {
					@Pc(191) int local191 = (local183 << 14) / local97;
					@Pc(199) int local199 = Class3_Sub7_Sub17_Sub1.anIntArray549[local191] * local177 >> 14;
					local207 = local181 * Class3_Sub7_Sub17_Sub1.anIntArray548[local191] >> 14;
					local169[local171][local183] = local158.method3289(0, local207, local199);
				}
			}
			for (local177 = 0; local177 < 3; local177++) {
				local181 = (local177 * 256 + 128) / 3;
				local183 = 256 - local181;
				@Pc(261) byte local261 = (byte) (arg8 * local183 + local181 * arg11 >> 8);
				@Pc(306) short local306 = (short) (((arg1 & 0x380) * local183 + (arg2 & 0x380) * local181 & 0x38000) + (local181 * (arg2 & 0xFC00) + local183 * (arg1 & 0xFC00) & 0xFC0000) + ((arg1 & 0x7F) * local183 + (arg2 & 0x7F) * local181 & 0x7F00) >> 8);
				for (local207 = 0; local207 < local97; local207++) {
					if (local177 == 0) {
						local158.method3288((byte) -1, local165, local306, (short) -1, local169[0][local207], local169[0][(local207 + 1) % local97], local261, (byte) 1);
					} else {
						local158.method3288((byte) -1, local169[local177 - 1][local207], local306, (short) -1, local169[local177][(local207 + 1) % local97], local169[local177 - 1][(local207 + 1) % local97], local261, (byte) 1);
						local158.method3288((byte) -1, local169[local177 - 1][local207], local306, (short) -1, local169[local177][local207], local169[local177][(local207 + 1) % local97], local261, (byte) 1);
					}
				}
			}
			local63 = arg7.method9382(local158, local12, Static287.anInt4418, 64, 768);
			@Pc(436) Class307 local436 = Static41.aClass307_11;
			synchronized (Static41.aClass307_11) {
				Static41.aClass307_11.method7000(local63, local53);
			}
		}
		@Pc(452) int local452 = arg4.V();
		@Pc(455) int local455 = arg4.RA();
		@Pc(458) int local458 = arg4.HA();
		@Pc(461) int local461 = arg4.G();
		if (arg3 == null) {
			local63 = local63.method8369((byte) 3, local12, true);
			local63.O(local455 - local452 >> 1, 128, local461 - local458 >> 1);
			local63.H(local452 + local455 >> 1, 0, local458 + local461 >> 1);
		} else {
			local63 = local63.method8369((byte) 3, local12, true);
			local63.O(local455 - local452 >> 1, 128, local461 - local458 >> 1);
			local63.H(local452 + local455 >> 1, 0, local458 + local461 >> 1);
			arg3.method6592(local63);
		}
		if (arg9 != 0) {
			local63.FA(arg9);
		}
		if (arg10 != 0) {
			local63.VA(arg10);
		}
		if (arg5 != 0) {
			local63.H(0, arg5, 0);
		}
		return local63;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIZBI)V")
	public static void method1623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8620() == 0) {
			Static588.method7597(false);
		} else {
			Static548.anInt8964 = Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8620();
			Static36.method1127(true, 0);
		}
		Static512.anInt10673 = arg0;
		Static598.anInt9085 = arg1;
		Static284.aBoolean288 = arg2;
		Static327.method1023(arg3);
	}
}
