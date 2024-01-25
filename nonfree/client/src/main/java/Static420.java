import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZB)V")
	public static void method6263(@OriginalArg(0) boolean arg0) {
		Static347.method9041(Static348.anInt5935, arg0, Static449.anInt7506, Static561.anInt9357);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
	public static void method6264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16, @OriginalArg(18) boolean arg17) {
		Static322.aBoolean345 = true;
		Static47.aBoolean49 = Static576.aClass132_15.method7511() > 0;
		Static256.aBoolean274 = true;
		Static608.anInt9872 = arg1 >> Static185.anInt3178;
		Static370.anInt6309 = arg3 >> Static185.anInt3178;
		Static136.anInt2381 = arg1;
		Static375.anInt6326 = arg3;
		Static283.anInt4842 = arg2;
		Static254.anInt4362 = Static608.anInt9872 - Static514.anInt8546;
		if (Static254.anInt4362 < 0) {
			Static639.anInt10355 = -Static254.anInt4362;
			Static254.anInt4362 = 0;
		} else {
			Static639.anInt10355 = 0;
		}
		Static620.anInt10119 = Static370.anInt6309 - Static514.anInt8546;
		if (Static620.anInt10119 < 0) {
			Static75.anInt1433 = -Static620.anInt10119;
			Static620.anInt10119 = 0;
		} else {
			Static75.anInt1433 = 0;
		}
		Static135.anInt2371 = Static608.anInt9872 + Static514.anInt8546;
		if (Static135.anInt2371 > Static209.anInt3602) {
			Static135.anInt2371 = Static209.anInt3602;
		}
		Static357.anInt6125 = Static370.anInt6309 + Static514.anInt8546;
		if (Static357.anInt6125 > Static245.anInt4308) {
			Static357.anInt6125 = Static245.anInt4308;
		}
		@Pc(72) boolean[][] local72 = Static443.aBooleanArrayArray8;
		@Pc(74) boolean[][] local74 = Static349.aBooleanArrayArray7;
		@Pc(78) int local78;
		@Pc(81) int local81;
		@Pc(83) int local83;
		if (Static256.aBoolean274) {
			for (local78 = 0; local78 < Static514.anInt8546 + Static514.anInt8546 + 2; local78++) {
				local81 = 0;
				local83 = 0;
				for (@Pc(85) int local85 = 0; local85 < Static514.anInt8546 + Static514.anInt8546 + 2; local85++) {
					if (local85 > 1) {
						Static328.anIntArray603[local85 - 2] = local81;
					}
					local81 = local83;
					@Pc(103) int local103 = Static608.anInt9872 + local78 - Static514.anInt8546;
					@Pc(109) int local109 = Static370.anInt6309 + local85 - Static514.anInt8546;
					@Pc(123) int local123;
					if (local103 >= 0 && local109 >= 0 && local103 < Static209.anInt3602 && local109 < Static245.anInt4308) {
						local123 = local103 << Static185.anInt3178;
						@Pc(127) int local127 = local109 << Static185.anInt3178;
						@Pc(144) int local144 = Static64.aClass12Array1[Static64.aClass12Array1.length - 1].method7846(local103, local109) - (0x3E8 << Static185.anInt3178 - 7);
						@Pc(166) int local166 = Static68.aClass12Array2 == null ? Static64.aClass12Array1[0].method7846(local103, local109) + Static655.anInt10510 : Static68.aClass12Array2[0].method7846(local103, local109) + Static655.anInt10510;
						local83 = arg15 >= 0 ? Static576.aClass132_15.r(local123, local144, local127, local123, local166, local127, arg15) : Static576.aClass132_15.JA(local123, local144, local127, local123, local166, local127);
						Static349.aBooleanArrayArray7[local78][local85] = local83 == 0;
					} else {
						local83 = -1;
						Static349.aBooleanArrayArray7[local78][local85] = false;
					}
					if (local78 > 0 && local85 > 0) {
						local123 = Static328.anIntArray603[local85 - 1] & Static328.anIntArray603[local85] & local81 & local83;
						Static443.aBooleanArrayArray8[local78 - 1][local85 - 1] = local123 == 0;
					}
				}
				Static328.anIntArray603[Static514.anInt8546 + Static514.anInt8546] = local81;
				Static328.anIntArray603[Static514.anInt8546 + Static514.anInt8546 + 1] = local83;
			}
			if (arg15 >= 0) {
				Static322.aBoolean345 = false;
			} else {
				Static313.anIntArray314 = arg5;
				Static48.anIntArray60 = arg6;
				Static598.anIntArray651 = arg7;
				Static298.anIntArray287 = arg8;
				Static548.anIntArray622 = arg9;
				Static172.method2458(Static576.aClass132_15, arg10);
			}
		} else {
			if (Static659.aBooleanArrayArray9 == null) {
				Static659.aBooleanArrayArray9 = new boolean[Static209.anInt3602 + Static209.anInt3602 + 1][Static245.anInt4308 + Static209.anInt3602 + 1];
			}
			for (local78 = 0; local78 < Static659.aBooleanArrayArray9.length; local78++) {
				for (local81 = 0; local81 < Static659.aBooleanArrayArray9[0].length; local81++) {
					Static659.aBooleanArrayArray9[local78][local81] = true;
				}
			}
			Static349.aBooleanArrayArray7 = Static659.aBooleanArrayArray9;
			Static443.aBooleanArrayArray8 = Static659.aBooleanArrayArray9;
			Static254.anInt4362 = 0;
			Static620.anInt10119 = 0;
			Static135.anInt2371 = Static209.anInt3602;
			Static357.anInt6125 = Static245.anInt4308;
			Static322.aBoolean345 = false;
		}
		Static508.method8440(Static576.aClass132_15);
		if (!Static663.aClass115_12.aBoolean175) {
			@Pc(349) Class43 local349 = Static663.aClass115_12.aClass43_5;
			for (@Pc(354) Class2_Sub9 local354 = (Class2_Sub9) local349.method1087(); local354 != null; local354 = (Class2_Sub9) local349.method1088()) {
				local354.method8436();
				Static379.method5357(local354);
			}
		}
		if (Static47.aBoolean49) {
			for (local78 = 0; local78 < Static390.anInt6562; local78++) {
				Static193.aClass394Array1[local78].method9112(arg0, arg14);
			}
		}
		if (Static251.aBoolean272) {
			Static676.anIntArray717 = Static576.aClass132_15.Y();
			Static576.aClass132_15.K(Static640.anIntArray693);
			local78 = (Static640.anIntArray693[2] - Static640.anIntArray693[0]) / Static564.anInt9384;
			for (local81 = 0; local81 < Static564.anInt9384 - 1; local81++) {
				Static258.anIntArray259[local81] = local78 * (local81 + 1) + Static506.anIntArray556[local81];
			}
			for (local83 = 0; local83 < Static47.aClass329Array1.length; local83++) {
				Static47.aClass329Array1[local83].method7843();
			}
		}
		if (Static661.aClass351ArrayArrayArray3 != null) {
			if (Static251.aBoolean272) {
				Static59.method1103(0);
			}
			Static546.method7770(true);
			Static576.aClass132_15.ra(-1, 1583160, 40, 127);
			Static139.method2082(true, arg4, arg10, arg11, arg15, arg16, arg17);
			if (Static251.aBoolean272) {
				Static314.method4503();
			}
			Static576.aClass132_15.pa();
			Static546.method7770(false);
		}
		Static139.method2082(false, arg4, arg10, arg11, arg15, arg16, arg17);
		if (Static251.aBoolean272) {
			for (local78 = 0; local78 < Static633.anInt10310; local78++) {
				Static71.aBooleanArrayArrayArray1[local78] = Static597.aBooleanArrayArrayArray2[local78];
			}
			Static59.method1103(0);
			for (local81 = 0; local81 < Static47.aClass329Array1.length; local81++) {
				Static47.aClass329Array1[local81].method7843();
			}
		}
		if (Static251.aBoolean272) {
			Static314.method4503();
			for (local78 = 0; local78 < Static633.anInt10310; local78++) {
				Static597.aBooleanArrayArrayArray2[local78] = Static71.aBooleanArrayArrayArray1[local78];
			}
			if (Static140.anInt2434 == 2) {
				@Pc(543) int local543;
				if (Static214.aLongArray13[0] < Static214.aLongArray13[1]) {
					if (Static258.anIntArray259[0] + Static506.anIntArray556[0] > Static640.anIntArray693[0]) {
						local543 = Static506.anIntArray556[0]++;
					}
				} else if (Static214.aLongArray13[0] > Static214.aLongArray13[1] && Static258.anIntArray259[0] + Static506.anIntArray556[0] < Static640.anIntArray693[2]) {
					local543 = Static506.anIntArray556[0]--;
				}
			}
		}
		if (!Static256.aBoolean274) {
			Static443.aBooleanArrayArray8 = local72;
			Static349.aBooleanArrayArray7 = local74;
		}
		Static391.method5570();
	}
}
