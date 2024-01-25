import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
	public static int anInt4365;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
	public static void method3727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16, @OriginalArg(18) boolean arg17) {
		Static110.aBoolean234 = true;
		Static181.aBoolean367 = Static185.aClass33_8.method6226() > 0;
		Static242.aBoolean481 = true;
		Static607.anInt10024 = arg1 >> Static276.anInt5846;
		Static23.anInt369 = arg3 >> Static276.anInt5846;
		Static452.anInt8205 = arg1;
		Static576.anInt9705 = arg3;
		Static614.anInt10173 = arg2;
		Static474.anInt8502 = Static607.anInt10024 - Static157.anInt3831;
		if (Static474.anInt8502 < 0) {
			Static619.anInt10222 = -Static474.anInt8502;
			Static474.anInt8502 = 0;
		} else {
			Static619.anInt10222 = 0;
		}
		Static36.anInt695 = Static23.anInt369 - Static157.anInt3831;
		if (Static36.anInt695 < 0) {
			Static140.anInt3546 = -Static36.anInt695;
			Static36.anInt695 = 0;
		} else {
			Static140.anInt3546 = 0;
		}
		Static46.anInt1028 = Static607.anInt10024 + Static157.anInt3831;
		if (Static46.anInt1028 > Static642.anInt10523) {
			Static46.anInt1028 = Static642.anInt10523;
		}
		Static310.anInt6166 = Static23.anInt369 + Static157.anInt3831;
		if (Static310.anInt6166 > Static158.anInt3845) {
			Static310.anInt6166 = Static158.anInt3845;
		}
		@Pc(72) boolean[][] local72 = Static622.aBooleanArrayArray11;
		@Pc(74) boolean[][] local74 = Static49.aBooleanArrayArray1;
		@Pc(78) int local78;
		@Pc(81) int local81;
		@Pc(83) int local83;
		if (Static242.aBoolean481) {
			for (local78 = 0; local78 < Static157.anInt3831 + Static157.anInt3831 + 2; local78++) {
				local81 = 0;
				local83 = 0;
				for (@Pc(85) int local85 = 0; local85 < Static157.anInt3831 + Static157.anInt3831 + 2; local85++) {
					if (local85 > 1) {
						Static163.anIntArray210[local85 - 2] = local81;
					}
					local81 = local83;
					@Pc(103) int local103 = Static607.anInt10024 + local78 - Static157.anInt3831;
					@Pc(109) int local109 = Static23.anInt369 + local85 - Static157.anInt3831;
					@Pc(123) int local123;
					if (local103 >= 0 && local109 >= 0 && local103 < Static642.anInt10523 && local109 < Static158.anInt3845) {
						local123 = local103 << Static276.anInt5846;
						@Pc(127) int local127 = local109 << Static276.anInt5846;
						@Pc(144) int local144 = Static445.aClass274Array1[Static445.aClass274Array1.length - 1].method8041(local103, local109) - (0x3E8 << Static276.anInt5846 - 7);
						@Pc(166) int local166 = Static524.aClass274Array3 == null ? Static445.aClass274Array1[0].method8041(local103, local109) + Static325.anInt6512 : Static524.aClass274Array3[0].method8041(local103, local109) + Static325.anInt6512;
						local83 = arg15 >= 0 ? Static185.aClass33_8.r(local123, local144, local127, local123, local166, local127, arg15) : Static185.aClass33_8.JA(local123, local144, local127, local123, local166, local127);
						Static49.aBooleanArrayArray1[local78][local85] = local83 == 0;
					} else {
						local83 = -1;
						Static49.aBooleanArrayArray1[local78][local85] = false;
					}
					if (local78 > 0 && local85 > 0) {
						local123 = Static163.anIntArray210[local85 - 1] & Static163.anIntArray210[local85] & local81 & local83;
						Static622.aBooleanArrayArray11[local78 - 1][local85 - 1] = local123 == 0;
					}
				}
				Static163.anIntArray210[Static157.anInt3831 + Static157.anInt3831] = local81;
				Static163.anIntArray210[Static157.anInt3831 + Static157.anInt3831 + 1] = local83;
			}
			if (arg15 >= 0) {
				Static110.aBoolean234 = false;
			} else {
				Static155.anIntArray206 = arg5;
				Static303.anIntArray359 = arg6;
				Static453.anIntArray518 = arg7;
				Static167.anIntArray214 = arg8;
				Static485.anIntArray542 = arg9;
				Static171.method3552(Static185.aClass33_8, arg10);
			}
		} else {
			if (Static273.aBooleanArrayArray7 == null) {
				Static273.aBooleanArrayArray7 = new boolean[Static642.anInt10523 + Static642.anInt10523 + 1][Static158.anInt3845 + Static642.anInt10523 + 1];
			}
			for (local78 = 0; local78 < Static273.aBooleanArrayArray7.length; local78++) {
				for (local81 = 0; local81 < Static273.aBooleanArrayArray7[0].length; local81++) {
					Static273.aBooleanArrayArray7[local78][local81] = true;
				}
			}
			Static49.aBooleanArrayArray1 = Static273.aBooleanArrayArray7;
			Static622.aBooleanArrayArray11 = Static273.aBooleanArrayArray7;
			Static474.anInt8502 = 0;
			Static36.anInt695 = 0;
			Static46.anInt1028 = Static642.anInt10523;
			Static310.anInt6166 = Static158.anInt3845;
			Static110.aBoolean234 = false;
		}
		Static370.method5907(Static185.aClass33_8);
		if (!Static625.aClass70_2.aBoolean214) {
			@Pc(349) Class375 local349 = Static625.aClass70_2.aClass375_3;
			for (@Pc(354) Class2_Sub6 local354 = (Class2_Sub6) local349.method8638(); local354 != null; local354 = (Class2_Sub6) local349.method8635()) {
				local354.method8558();
				Static295.method5066(local354);
			}
		}
		if (Static181.aBoolean367) {
			for (local78 = 0; local78 < Static252.anInt5591; local78++) {
				Static523.aClass93Array1[local78].method3171(arg0, arg14);
			}
		}
		if (Static441.aBoolean681) {
			Static275.anIntArray340 = Static185.aClass33_8.Y();
			Static185.aClass33_8.K(Static116.anIntArray146);
			local78 = (Static116.anIntArray146[2] - Static116.anIntArray146[0]) / Static303.anInt6083;
			for (local81 = 0; local81 < Static303.anInt6083 - 1; local81++) {
				Static585.anIntArray616[local81] = local78 * (local81 + 1) + Static324.anIntArray381[local81];
			}
			for (local83 = 0; local83 < Static443.aClass249Array1.length; local83++) {
				Static443.aClass249Array1[local83].method6422();
			}
		}
		if (Static185.aClass106ArrayArrayArray2 != null) {
			if (Static441.aBoolean681) {
				Static632.method8552(0);
			}
			Static526.method6820(true);
			Static185.aClass33_8.ra(-1, 1583160, 40, 127);
			Static393.method2876(true, arg4, arg10, arg11, arg15, arg16, arg17);
			if (Static441.aBoolean681) {
				Static437.method6644();
			}
			Static185.aClass33_8.pa();
			Static526.method6820(false);
		}
		Static393.method2876(false, arg4, arg10, arg11, arg15, arg16, arg17);
		if (Static441.aBoolean681) {
			for (local78 = 0; local78 < Static626.anInt10336; local78++) {
				Static227.aBooleanArrayArrayArray1[local78] = Static437.aBooleanArrayArrayArray2[local78];
			}
			Static632.method8552(0);
			for (local81 = 0; local81 < Static443.aClass249Array1.length; local81++) {
				Static443.aClass249Array1[local81].method6422();
			}
		}
		if (Static441.aBoolean681) {
			Static437.method6644();
			for (local78 = 0; local78 < Static626.anInt10336; local78++) {
				Static437.aBooleanArrayArrayArray2[local78] = Static227.aBooleanArrayArrayArray1[local78];
			}
			if (Static199.anInt4633 == 2) {
				@Pc(543) int local543;
				if (Static223.aLongArray5[0] < Static223.aLongArray5[1]) {
					if (Static585.anIntArray616[0] + Static324.anIntArray381[0] > Static116.anIntArray146[0]) {
						local543 = Static324.anIntArray381[0]++;
					}
				} else if (Static223.aLongArray5[0] > Static223.aLongArray5[1] && Static585.anIntArray616[0] + Static324.anIntArray381[0] < Static116.anIntArray146[2]) {
					local543 = Static324.anIntArray381[0]--;
				}
			}
		}
		if (!Static242.aBoolean481) {
			Static622.aBooleanArrayArray11 = local72;
			Static49.aBooleanArrayArray1 = local74;
		}
		Static358.method5829();
	}
}
