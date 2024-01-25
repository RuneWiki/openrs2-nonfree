import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "[I")
	public static final int[] anIntArray179 = new int[4096];

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIZ)V")
	public static void method2374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6_Sub2_Sub9 local8 = Static144.method2332(17, arg0);
		local8.method3723();
		local8.anInt4294 = arg1;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
	public static void method2375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16, @OriginalArg(18) boolean arg17) {
		Static231.aBoolean325 = true;
		Static92.aBoolean125 = Static565.aClass100_15.method8780() > 0;
		Static168.aBoolean253 = true;
		Static162.anInt3371 = arg1 >> Static643.anInt10682;
		Static313.anInt5975 = arg3 >> Static643.anInt10682;
		Static436.anInt7905 = arg1;
		Static67.anInt1397 = arg3;
		Static109.anInt8015 = arg2;
		Static43.anInt861 = Static162.anInt3371 - Static197.anInt10372;
		if (Static43.anInt861 < 0) {
			Static68.anInt1420 = -Static43.anInt861;
			Static43.anInt861 = 0;
		} else {
			Static68.anInt1420 = 0;
		}
		Static555.anInt9436 = Static313.anInt5975 - Static197.anInt10372;
		if (Static555.anInt9436 < 0) {
			Static410.anInt7532 = -Static555.anInt9436;
			Static555.anInt9436 = 0;
		} else {
			Static410.anInt7532 = 0;
		}
		Static297.anInt7294 = Static162.anInt3371 + Static197.anInt10372;
		if (Static297.anInt7294 > Static544.anInt9353) {
			Static297.anInt7294 = Static544.anInt9353;
		}
		Static554.anInt1819 = Static313.anInt5975 + Static197.anInt10372;
		if (Static554.anInt1819 > Static608.anInt10072) {
			Static554.anInt1819 = Static608.anInt10072;
		}
		@Pc(72) boolean[][] local72 = Static460.aBooleanArrayArray6;
		@Pc(74) boolean[][] local74 = Static195.aBooleanArrayArray4;
		@Pc(78) int local78;
		@Pc(81) int local81;
		@Pc(83) int local83;
		if (Static168.aBoolean253) {
			for (local78 = 0; local78 < Static197.anInt10372 + Static197.anInt10372 + 2; local78++) {
				local81 = 0;
				local83 = 0;
				for (@Pc(85) int local85 = 0; local85 < Static197.anInt10372 + Static197.anInt10372 + 2; local85++) {
					if (local85 > 1) {
						Static580.anIntArray588[local85 - 2] = local81;
					}
					local81 = local83;
					@Pc(103) int local103 = Static162.anInt3371 + local78 - Static197.anInt10372;
					@Pc(109) int local109 = Static313.anInt5975 + local85 - Static197.anInt10372;
					@Pc(123) int local123;
					if (local103 >= 0 && local109 >= 0 && local103 < Static544.anInt9353 && local109 < Static608.anInt10072) {
						local123 = local103 << Static643.anInt10682;
						@Pc(127) int local127 = local109 << Static643.anInt10682;
						@Pc(144) int local144 = Static228.aClass199Array2[Static228.aClass199Array2.length - 1].method8532(local103, local109) - (0x3E8 << Static643.anInt10682 - 7);
						@Pc(166) int local166 = Static510.aClass199Array3 == null ? Static228.aClass199Array2[0].method8532(local103, local109) + Static246.anInt4917 : Static510.aClass199Array3[0].method8532(local103, local109) + Static246.anInt4917;
						local83 = arg15 >= 0 ? Static565.aClass100_15.r(local123, local144, local127, local123, local166, local127, arg15) : Static565.aClass100_15.JA(local123, local144, local127, local123, local166, local127);
						Static195.aBooleanArrayArray4[local78][local85] = local83 == 0;
					} else {
						local83 = -1;
						Static195.aBooleanArrayArray4[local78][local85] = false;
					}
					if (local78 > 0 && local85 > 0) {
						local123 = Static580.anIntArray588[local85 - 1] & Static580.anIntArray588[local85] & local81 & local83;
						Static460.aBooleanArrayArray6[local78 - 1][local85 - 1] = local123 == 0;
					}
				}
				Static580.anIntArray588[Static197.anInt10372 + Static197.anInt10372] = local81;
				Static580.anIntArray588[Static197.anInt10372 + Static197.anInt10372 + 1] = local83;
			}
			if (arg15 >= 0) {
				Static231.aBoolean325 = false;
			} else {
				Static326.anIntArray369 = arg5;
				Static295.anIntArray353 = arg6;
				Static373.anIntArray420 = arg7;
				Static7.anIntArray2 = arg8;
				Static380.anIntArray124 = arg9;
				Static502.method7485(arg10, Static565.aClass100_15);
			}
		} else {
			if (Static161.aBooleanArrayArray3 == null) {
				Static161.aBooleanArrayArray3 = new boolean[Static544.anInt9353 + Static544.anInt9353 + 1][Static608.anInt10072 + Static544.anInt9353 + 1];
			}
			for (local78 = 0; local78 < Static161.aBooleanArrayArray3.length; local78++) {
				for (local81 = 0; local81 < Static161.aBooleanArrayArray3[0].length; local81++) {
					Static161.aBooleanArrayArray3[local78][local81] = true;
				}
			}
			Static195.aBooleanArrayArray4 = Static161.aBooleanArrayArray3;
			Static460.aBooleanArrayArray6 = Static161.aBooleanArrayArray3;
			Static43.anInt861 = 0;
			Static555.anInt9436 = 0;
			Static297.anInt7294 = Static544.anInt9353;
			Static554.anInt1819 = Static608.anInt10072;
			Static231.aBoolean325 = false;
		}
		Static407.method5573(Static565.aClass100_15);
		if (!Static94.aClass65_1.aBoolean156) {
			@Pc(349) Class81 local349 = Static94.aClass65_1.aClass81_2;
			for (@Pc(354) Class20_Sub3 local354 = (Class20_Sub3) local349.method2118(); local354 != null; local354 = (Class20_Sub3) local349.method2128()) {
				local354.method9004();
				Static53.method902(local354);
			}
		}
		if (Static92.aBoolean125) {
			for (local78 = 0; local78 < Static523.anInt9117; local78++) {
				Static105.aClass68Array1[local78].method1827(arg0, arg14);
			}
		}
		if (Static101.aBoolean145) {
			Static59.anIntArray91 = Static565.aClass100_15.Y();
			Static565.aClass100_15.K(Static473.anIntArray522);
			local78 = (Static473.anIntArray522[2] - Static473.anIntArray522[0]) / Static167.anInt3476;
			for (local81 = 0; local81 < Static167.anInt3476 - 1; local81++) {
				Static83.anIntArray115[local81] = local78 * (local81 + 1) + Static332.anIntArray561[local81];
			}
			for (local83 = 0; local83 < Static574.aClass334Array1.length; local83++) {
				Static574.aClass334Array1[local83].method8106();
			}
		}
		if (Static179.aClass97ArrayArrayArray1 != null) {
			if (Static101.aBoolean145) {
				Static181.method3309(0);
			}
			Static134.method2182(true);
			Static565.aClass100_15.ra(-1, 1583160, 40, 127);
			Static414.method6512(true, arg4, arg10, arg11, arg15, arg16, arg17);
			if (Static101.aBoolean145) {
				Static350.method5632();
			}
			Static565.aClass100_15.pa();
			Static134.method2182(false);
		}
		Static414.method6512(false, arg4, arg10, arg11, arg15, arg16, arg17);
		if (Static101.aBoolean145) {
			for (local78 = 0; local78 < Static535.anInt9275; local78++) {
				Static120.aBooleanArrayArrayArray1[local78] = Static431.aBooleanArrayArrayArray2[local78];
			}
			Static181.method3309(0);
			for (local81 = 0; local81 < Static574.aClass334Array1.length; local81++) {
				Static574.aClass334Array1[local81].method8106();
			}
		}
		if (Static101.aBoolean145) {
			Static350.method5632();
			for (local78 = 0; local78 < Static535.anInt9275; local78++) {
				Static431.aBooleanArrayArrayArray2[local78] = Static120.aBooleanArrayArrayArray1[local78];
			}
			if (Static253.anInt5086 == 2) {
				@Pc(543) int local543;
				if (Static282.aLongArray5[0] < Static282.aLongArray5[1]) {
					if (Static83.anIntArray115[0] + Static332.anIntArray561[0] > Static473.anIntArray522[0]) {
						local543 = Static332.anIntArray561[0]++;
					}
				} else if (Static282.aLongArray5[0] > Static282.aLongArray5[1] && Static83.anIntArray115[0] + Static332.anIntArray561[0] < Static473.anIntArray522[2]) {
					local543 = Static332.anIntArray561[0]--;
				}
			}
		}
		if (!Static168.aBoolean253) {
			Static460.aBooleanArrayArray6 = local72;
			Static195.aBooleanArrayArray4 = local74;
		}
		Static7.method143();
	}
}
