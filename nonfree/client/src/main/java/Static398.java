import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
	public static int anInt7403;

	@OriginalMember(owner = "client!ng", name = "t", descriptor = "[I")
	public static int[] anIntArray352;

	@OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
	public static int anInt7406;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
	public static void method6583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16, @OriginalArg(18) boolean arg17) {
		Static175.aBoolean283 = true;
		Static583.aBoolean738 = Static64.aClass101_1.method8109() > 0;
		Static153.aBoolean254 = true;
		Static440.anInt8000 = arg1 >> Static170.anInt3602;
		Static139.anInt2631 = arg3 >> Static170.anInt3602;
		Static604.anInt10572 = arg1;
		Static483.anInt8675 = arg3;
		Static567.anInt9850 = arg2;
		Static588.anInt10264 = Static440.anInt8000 - Static602.anInt10539;
		if (Static588.anInt10264 < 0) {
			Static438.anInt7971 = -Static588.anInt10264;
			Static588.anInt10264 = 0;
		} else {
			Static438.anInt7971 = 0;
		}
		Static166.anInt3589 = Static139.anInt2631 - Static602.anInt10539;
		if (Static166.anInt3589 < 0) {
			Static108.anInt1986 = -Static166.anInt3589;
			Static166.anInt3589 = 0;
		} else {
			Static108.anInt1986 = 0;
		}
		Static283.anInt5218 = Static440.anInt8000 + Static602.anInt10539;
		if (Static283.anInt5218 > Static585.anInt10170) {
			Static283.anInt5218 = Static585.anInt10170;
		}
		Static84.anInt1472 = Static139.anInt2631 + Static602.anInt10539;
		if (Static84.anInt1472 > Static202.anInt4238) {
			Static84.anInt1472 = Static202.anInt4238;
		}
		@Pc(72) boolean[][] local72 = Static423.aBooleanArrayArray8;
		@Pc(74) boolean[][] local74 = Static85.aBooleanArrayArray3;
		@Pc(78) int local78;
		@Pc(81) int local81;
		@Pc(83) int local83;
		if (Static153.aBoolean254) {
			for (local78 = 0; local78 < Static602.anInt10539 + Static602.anInt10539 + 2; local78++) {
				local81 = 0;
				local83 = 0;
				for (@Pc(85) int local85 = 0; local85 < Static602.anInt10539 + Static602.anInt10539 + 2; local85++) {
					if (local85 > 1) {
						Static101.anIntArray94[local85 - 2] = local81;
					}
					local81 = local83;
					@Pc(103) int local103 = Static440.anInt8000 + local78 - Static602.anInt10539;
					@Pc(109) int local109 = Static139.anInt2631 + local85 - Static602.anInt10539;
					@Pc(123) int local123;
					if (local103 >= 0 && local109 >= 0 && local103 < Static585.anInt10170 && local109 < Static202.anInt4238) {
						local123 = local103 << Static170.anInt3602;
						@Pc(127) int local127 = local109 << Static170.anInt3602;
						@Pc(144) int local144 = Static549.aClass18Array30[Static549.aClass18Array30.length - 1].method8537(local109, local103) - (0x3E8 << Static170.anInt3602 - 7);
						@Pc(166) int local166 = Static93.aClass18Array33 == null ? Static549.aClass18Array30[0].method8537(local109, local103) + Static536.anInt4502 : Static93.aClass18Array33[0].method8537(local109, local103) + Static536.anInt4502;
						local83 = arg15 >= 0 ? Static64.aClass101_1.r(local123, local144, local127, local123, local166, local127, arg15) : Static64.aClass101_1.JA(local123, local144, local127, local123, local166, local127);
						Static85.aBooleanArrayArray3[local78][local85] = local83 == 0;
					} else {
						local83 = -1;
						Static85.aBooleanArrayArray3[local78][local85] = false;
					}
					if (local78 > 0 && local85 > 0) {
						local123 = Static101.anIntArray94[local85 - 1] & Static101.anIntArray94[local85] & local81 & local83;
						Static423.aBooleanArrayArray8[local78 - 1][local85 - 1] = local123 == 0;
					}
				}
				Static101.anIntArray94[Static602.anInt10539 + Static602.anInt10539] = local81;
				Static101.anIntArray94[Static602.anInt10539 + Static602.anInt10539 + 1] = local83;
			}
			if (arg15 >= 0) {
				Static175.aBoolean283 = false;
			} else {
				Static542.anIntArray487 = arg5;
				Static558.anIntArray491 = arg6;
				Static464.anIntArray419 = arg7;
				Static577.anIntArray510 = arg8;
				Static34.anIntArray43 = arg9;
				Static315.method5150(arg10, Static64.aClass101_1);
			}
		} else {
			if (Static375.aBooleanArrayArray7 == null) {
				Static375.aBooleanArrayArray7 = new boolean[Static585.anInt10170 + Static585.anInt10170 + 1][Static202.anInt4238 + Static585.anInt10170 + 1];
			}
			for (local78 = 0; local78 < Static375.aBooleanArrayArray7.length; local78++) {
				for (local81 = 0; local81 < Static375.aBooleanArrayArray7[0].length; local81++) {
					Static375.aBooleanArrayArray7[local78][local81] = true;
				}
			}
			Static85.aBooleanArrayArray3 = Static375.aBooleanArrayArray7;
			Static423.aBooleanArrayArray8 = Static375.aBooleanArrayArray7;
			Static588.anInt10264 = 0;
			Static166.anInt3589 = 0;
			Static283.anInt5218 = Static585.anInt10170;
			Static84.anInt1472 = Static202.anInt4238;
			Static175.aBoolean283 = false;
		}
		Static470.method4884(Static64.aClass101_1);
		if (!Static212.aClass217_1.aBoolean504) {
			@Pc(349) Class60 local349 = Static212.aClass217_1.aClass60_7;
			for (@Pc(354) Class15_Sub9 local354 = (Class15_Sub9) local349.method1547(); local354 != null; local354 = (Class15_Sub9) local349.method1546()) {
				local354.method9741();
				Static137.method2402(local354);
			}
		}
		if (Static583.aBoolean738) {
			for (local78 = 0; local78 < Static262.anInt5002; local78++) {
				Static320.aClass84Array8[local78].method2246(arg0, arg14);
			}
		}
		if (Static27.aBoolean27) {
			Static114.anIntArray105 = Static64.aClass101_1.Y();
			Static64.aClass101_1.K(Static264.anIntArray254);
			local78 = (Static264.anIntArray254[2] - Static264.anIntArray254[0]) / Static294.anInt5364;
			for (local81 = 0; local81 < Static294.anInt5364 - 1; local81++) {
				Static668.anIntArray596[local81] = local78 * (local81 + 1) + Static654.anIntArray589[local81];
			}
			for (local83 = 0; local83 < Static549.aClass314Array1.length; local83++) {
				Static549.aClass314Array1[local83].method7995();
			}
		}
		if (Static46.aClass291ArrayArrayArray1 != null) {
			if (Static27.aBoolean27) {
				Static229.method4170(0);
			}
			Static312.method5104(true);
			Static64.aClass101_1.ra(-1, 1583160, 40, 127);
			Static387.method6533(true, arg4, arg10, arg11, arg15, arg16, arg17);
			if (Static27.aBoolean27) {
				Static260.method4509();
			}
			Static64.aClass101_1.pa();
			Static312.method5104(false);
		}
		Static387.method6533(false, arg4, arg10, arg11, arg15, arg16, arg17);
		if (Static27.aBoolean27) {
			for (local78 = 0; local78 < Static60.anInt1169; local78++) {
				Static135.aBooleanArrayArrayArray1[local78] = Static151.aBooleanArrayArrayArray2[local78];
			}
			Static229.method4170(0);
			for (local81 = 0; local81 < Static549.aClass314Array1.length; local81++) {
				Static549.aClass314Array1[local81].method7995();
			}
		}
		if (Static27.aBoolean27) {
			Static260.method4509();
			for (local78 = 0; local78 < Static60.anInt1169; local78++) {
				Static151.aBooleanArrayArrayArray2[local78] = Static135.aBooleanArrayArrayArray1[local78];
			}
			if (Static299.anInt5460 == 2) {
				@Pc(543) int local543;
				if (Static214.aLongArray11[0] < Static214.aLongArray11[1]) {
					if (Static668.anIntArray596[0] + Static654.anIntArray589[0] > Static264.anIntArray254[0]) {
						local543 = Static654.anIntArray589[0]++;
					}
				} else if (Static214.aLongArray11[0] > Static214.aLongArray11[1] && Static668.anIntArray596[0] + Static654.anIntArray589[0] < Static264.anIntArray254[2]) {
					local543 = Static654.anIntArray589[0]--;
				}
			}
		}
		if (!Static153.aBoolean254) {
			Static423.aBooleanArrayArray8 = local72;
			Static85.aBooleanArrayArray3 = local74;
		}
		Static288.method4804();
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BII)V")
	public static void method6584(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub1_Sub5 local13 = Static653.method9595(12, (long) arg1);
		local13.method2486();
		local13.anInt2680 = arg0;
	}
}
