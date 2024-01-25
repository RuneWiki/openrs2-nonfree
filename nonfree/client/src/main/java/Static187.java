import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!gj", name = "w", descriptor = "Lclient!oea;")
	public static Class239 aClass239_8;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
	public static void method3896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16, @OriginalArg(18) boolean arg17) {
		Static219.aBoolean366 = true;
		Static286.aBoolean451 = Static194.aClass20_5.method7307() > 0;
		Static430.aBoolean179 = true;
		Static120.anInt3199 = arg1 >> Static151.anInt3896;
		Static360.anInt7144 = arg3 >> Static151.anInt3896;
		Static393.anInt7549 = arg1;
		Static574.anInt10281 = arg3;
		Static521.anInt9499 = arg2;
		Static235.anInt5129 = Static120.anInt3199 - Static177.anInt4273;
		if (Static235.anInt5129 < 0) {
			Static256.anInt5483 = -Static235.anInt5129;
			Static235.anInt5129 = 0;
		} else {
			Static256.anInt5483 = 0;
		}
		Static36.anInt791 = Static360.anInt7144 - Static177.anInt4273;
		if (Static36.anInt791 < 0) {
			Static529.anInt9630 = -Static36.anInt791;
			Static36.anInt791 = 0;
		} else {
			Static529.anInt9630 = 0;
		}
		Static224.anInt4980 = Static120.anInt3199 + Static177.anInt4273;
		if (Static224.anInt4980 > Static477.anInt8929) {
			Static224.anInt4980 = Static477.anInt8929;
		}
		Static487.anInt9607 = Static360.anInt7144 + Static177.anInt4273;
		if (Static487.anInt9607 > Static562.anInt10128) {
			Static487.anInt9607 = Static562.anInt10128;
		}
		@Pc(72) boolean[][] local72 = Static342.aBooleanArrayArray6;
		@Pc(74) boolean[][] local74 = Static186.aBooleanArrayArray5;
		@Pc(78) int local78;
		@Pc(81) int local81;
		@Pc(83) int local83;
		if (Static430.aBoolean179) {
			for (local78 = 0; local78 < Static177.anInt4273 + Static177.anInt4273 + 2; local78++) {
				local81 = 0;
				local83 = 0;
				for (@Pc(85) int local85 = 0; local85 < Static177.anInt4273 + Static177.anInt4273 + 2; local85++) {
					if (local85 > 1) {
						Static432.anIntArray534[local85 - 2] = local81;
					}
					local81 = local83;
					@Pc(103) int local103 = Static120.anInt3199 + local78 - Static177.anInt4273;
					@Pc(109) int local109 = Static360.anInt7144 + local85 - Static177.anInt4273;
					@Pc(123) int local123;
					if (local103 >= 0 && local109 >= 0 && local103 < Static477.anInt8929 && local109 < Static562.anInt10128) {
						local123 = local103 << Static151.anInt3896;
						@Pc(127) int local127 = local109 << Static151.anInt3896;
						@Pc(144) int local144 = Static40.aClass65Array2[Static40.aClass65Array2.length - 1].method7995(local109, local103) - (0x3E8 << Static151.anInt3896 - 7);
						@Pc(166) int local166 = Static103.aClass65Array3 == null ? Static40.aClass65Array2[0].method7995(local109, local103) + Static582.anInt10356 : Static103.aClass65Array3[0].method7995(local109, local103) + Static582.anInt10356;
						local83 = arg15 >= 0 ? Static194.aClass20_5.r(local123, local144, local127, local123, local166, local127, arg15) : Static194.aClass20_5.JA(local123, local144, local127, local123, local166, local127);
						Static186.aBooleanArrayArray5[local78][local85] = local83 == 0;
					} else {
						local83 = -1;
						Static186.aBooleanArrayArray5[local78][local85] = false;
					}
					if (local78 > 0 && local85 > 0) {
						local123 = Static432.anIntArray534[local85 - 1] & Static432.anIntArray534[local85] & local81 & local83;
						Static342.aBooleanArrayArray6[local78 - 1][local85 - 1] = local123 == 0;
					}
				}
				Static432.anIntArray534[Static177.anInt4273 + Static177.anInt4273] = local81;
				Static432.anIntArray534[Static177.anInt4273 + Static177.anInt4273 + 1] = local83;
			}
			if (arg15 >= 0) {
				Static219.aBoolean366 = false;
			} else {
				Static287.anIntArray359 = arg5;
				Static548.anIntArray642 = arg6;
				Static528.anIntArray630 = arg7;
				Static307.anIntArray373 = arg8;
				Static76.anIntArray107 = arg9;
				Static96.method2561(arg10, Static194.aClass20_5);
			}
		} else {
			if (Static577.aBooleanArrayArray3 == null) {
				Static577.aBooleanArrayArray3 = new boolean[Static477.anInt8929 + Static477.anInt8929 + 1][Static562.anInt10128 + Static477.anInt8929 + 1];
			}
			for (local78 = 0; local78 < Static577.aBooleanArrayArray3.length; local78++) {
				for (local81 = 0; local81 < Static577.aBooleanArrayArray3[0].length; local81++) {
					Static577.aBooleanArrayArray3[local78][local81] = true;
				}
			}
			Static186.aBooleanArrayArray5 = Static577.aBooleanArrayArray3;
			Static342.aBooleanArrayArray6 = Static577.aBooleanArrayArray3;
			Static235.anInt5129 = 0;
			Static36.anInt791 = 0;
			Static224.anInt4980 = Static477.anInt8929;
			Static487.anInt9607 = Static562.anInt10128;
			Static219.aBoolean366 = false;
		}
		Static533.method8021(Static194.aClass20_5);
		if (!Static292.aClass182_1.aBoolean475) {
			@Pc(349) Class325 local349 = Static292.aClass182_1.aClass325_4;
			for (@Pc(354) Class3_Sub4 local354 = (Class3_Sub4) local349.method8016(); local354 != null; local354 = (Class3_Sub4) local349.method8022()) {
				local354.method8909();
				Static211.method4175(local354);
			}
		}
		if (Static286.aBoolean451) {
			for (local78 = 0; local78 < Static102.anInt2851; local78++) {
				Static436.aClass300Array1[local78].method7674(arg14, arg0);
			}
		}
		if (Static218.aBoolean365) {
			Static255.anIntArray292 = Static194.aClass20_5.Y();
			Static194.aClass20_5.K(Static304.anIntArray369);
			local78 = (Static304.anIntArray369[2] - Static304.anIntArray369[0]) / Static6.anInt117;
			for (local81 = 0; local81 < Static6.anInt117 - 1; local81++) {
				Static208.anIntArray239[local81] = local78 * (local81 + 1) + Static121.anIntArray631[local81];
			}
			for (local83 = 0; local83 < Static68.aClass366Array1.length; local83++) {
				Static68.aClass366Array1[local83].method8993();
			}
		}
		if (Static283.aClass100ArrayArrayArray2 != null) {
			if (Static218.aBoolean365) {
				Static31.method769(0);
			}
			Static533.method8023(true);
			Static194.aClass20_5.ra(-1, 1583160, 40, 127);
			Static183.method3860(true, arg4, arg10, arg11, arg15, arg16, arg17);
			if (Static218.aBoolean365) {
				Static638.method9207();
			}
			Static194.aClass20_5.pa();
			Static533.method8023(false);
		}
		Static183.method3860(false, arg4, arg10, arg11, arg15, arg16, arg17);
		if (Static218.aBoolean365) {
			for (local78 = 0; local78 < Static462.anInt8470; local78++) {
				Static327.aBooleanArrayArrayArray1[local78] = Static359.aBooleanArrayArrayArray2[local78];
			}
			Static31.method769(0);
			for (local81 = 0; local81 < Static68.aClass366Array1.length; local81++) {
				Static68.aClass366Array1[local81].method8993();
			}
		}
		if (Static218.aBoolean365) {
			Static638.method9207();
			for (local78 = 0; local78 < Static462.anInt8470; local78++) {
				Static359.aBooleanArrayArrayArray2[local78] = Static327.aBooleanArrayArrayArray1[local78];
			}
			if (Static149.anInt3867 == 2) {
				@Pc(543) int local543;
				if (Static44.aLongArray1[0] < Static44.aLongArray1[1]) {
					if (Static208.anIntArray239[0] + Static121.anIntArray631[0] > Static304.anIntArray369[0]) {
						local543 = Static121.anIntArray631[0]++;
					}
				} else if (Static44.aLongArray1[0] > Static44.aLongArray1[1] && Static208.anIntArray239[0] + Static121.anIntArray631[0] < Static304.anIntArray369[2]) {
					local543 = Static121.anIntArray631[0]--;
				}
			}
		}
		if (!Static430.aBoolean179) {
			Static342.aBooleanArrayArray6 = local72;
			Static186.aBooleanArrayArray5 = local74;
		}
		Static536.method8056();
	}
}
