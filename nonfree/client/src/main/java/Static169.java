import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!fka", name = "b", descriptor = "J")
	public static long aLong104;

	@OriginalMember(owner = "client!fka", name = "h", descriptor = "I")
	public static int anInt3338;

	@OriginalMember(owner = "client!fka", name = "p", descriptor = "I")
	public static int anInt3342;

	@OriginalMember(owner = "client!fka", name = "f", descriptor = "I")
	public static int anInt3337 = 0;

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
	public static void method3082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16, @OriginalArg(18) boolean arg17) {
		Static665.aBoolean805 = true;
		Static236.aBoolean325 = Static671.aClass13_21.method8448() > 0;
		Static163.aBoolean249 = true;
		Static220.anInt4183 = arg1 >> Static391.anInt10262;
		Static547.anInt8968 = arg3 >> Static391.anInt10262;
		Static562.anInt9120 = arg1;
		Static493.anInt8117 = arg3;
		Static442.anInt7034 = arg2;
		Static431.anInt6884 = Static220.anInt4183 - Static7.anInt94;
		if (Static431.anInt6884 < 0) {
			Static250.anInt4513 = -Static431.anInt6884;
			Static431.anInt6884 = 0;
		} else {
			Static250.anInt4513 = 0;
		}
		Static445.anInt7311 = Static547.anInt8968 - Static7.anInt94;
		if (Static445.anInt7311 < 0) {
			Static473.anInt7804 = -Static445.anInt7311;
			Static445.anInt7311 = 0;
		} else {
			Static473.anInt7804 = 0;
		}
		Static518.anInt8353 = Static220.anInt4183 + Static7.anInt94;
		if (Static518.anInt8353 > Static146.anInt2951) {
			Static518.anInt8353 = Static146.anInt2951;
		}
		Static581.anInt8281 = Static547.anInt8968 + Static7.anInt94;
		if (Static581.anInt8281 > Static602.anInt9668) {
			Static581.anInt8281 = Static602.anInt9668;
		}
		@Pc(72) boolean[][] local72 = Static430.aBooleanArrayArray7;
		@Pc(74) boolean[][] local74 = Static600.aBooleanArrayArray8;
		@Pc(78) int local78;
		@Pc(81) int local81;
		@Pc(83) int local83;
		if (Static163.aBoolean249) {
			for (local78 = 0; local78 < Static7.anInt94 + Static7.anInt94 + 2; local78++) {
				local81 = 0;
				local83 = 0;
				for (@Pc(85) int local85 = 0; local85 < Static7.anInt94 + Static7.anInt94 + 2; local85++) {
					if (local85 > 1) {
						Static174.anIntArray300[local85 - 2] = local81;
					}
					local81 = local83;
					@Pc(103) int local103 = Static220.anInt4183 + local78 - Static7.anInt94;
					@Pc(109) int local109 = Static547.anInt8968 + local85 - Static7.anInt94;
					@Pc(123) int local123;
					if (local103 >= 0 && local109 >= 0 && local103 < Static146.anInt2951 && local109 < Static602.anInt9668) {
						local123 = local103 << Static391.anInt10262;
						@Pc(127) int local127 = local109 << Static391.anInt10262;
						@Pc(144) int local144 = Static582.aClass21Array3[Static582.aClass21Array3.length - 1].method7973(local103, local109) - (0x3E8 << Static391.anInt10262 - 7);
						@Pc(166) int local166 = Static108.aClass21Array1 == null ? Static582.aClass21Array3[0].method7973(local103, local109) + Static207.anInt4003 : Static108.aClass21Array1[0].method7973(local103, local109) + Static207.anInt4003;
						local83 = arg15 >= 0 ? Static671.aClass13_21.r(local123, local144, local127, local123, local166, local127, arg15) : Static671.aClass13_21.JA(local123, local144, local127, local123, local166, local127);
						Static600.aBooleanArrayArray8[local78][local85] = local83 == 0;
					} else {
						local83 = -1;
						Static600.aBooleanArrayArray8[local78][local85] = false;
					}
					if (local78 > 0 && local85 > 0) {
						local123 = Static174.anIntArray300[local85 - 1] & Static174.anIntArray300[local85] & local81 & local83;
						Static430.aBooleanArrayArray7[local78 - 1][local85 - 1] = local123 == 0;
					}
				}
				Static174.anIntArray300[Static7.anInt94 + Static7.anInt94] = local81;
				Static174.anIntArray300[Static7.anInt94 + Static7.anInt94 + 1] = local83;
			}
			if (arg15 >= 0) {
				Static665.aBoolean805 = false;
			} else {
				Static154.anIntArray266 = arg5;
				Static522.anIntArray730 = arg6;
				Static530.anIntArray745 = arg7;
				Static557.anIntArray770 = arg8;
				Static457.anIntArray644 = arg9;
				Static188.method3473(Static671.aClass13_21, arg10);
			}
		} else {
			if (Static286.aBooleanArrayArray4 == null) {
				Static286.aBooleanArrayArray4 = new boolean[Static146.anInt2951 + Static146.anInt2951 + 1][Static602.anInt9668 + Static146.anInt2951 + 1];
			}
			for (local78 = 0; local78 < Static286.aBooleanArrayArray4.length; local78++) {
				for (local81 = 0; local81 < Static286.aBooleanArrayArray4[0].length; local81++) {
					Static286.aBooleanArrayArray4[local78][local81] = true;
				}
			}
			Static600.aBooleanArrayArray8 = Static286.aBooleanArrayArray4;
			Static430.aBooleanArrayArray7 = Static286.aBooleanArrayArray4;
			Static431.anInt6884 = 0;
			Static445.anInt7311 = 0;
			Static518.anInt8353 = Static146.anInt2951;
			Static581.anInt8281 = Static602.anInt9668;
			Static665.aBoolean805 = false;
		}
		Static202.method3099(Static671.aClass13_21);
		if (!Static645.aClass321_3.aBoolean703) {
			@Pc(349) Class371 local349 = Static645.aClass321_3.aClass371_7;
			for (@Pc(354) Class28_Sub3 local354 = (Class28_Sub3) local349.method8911(); local354 != null; local354 = (Class28_Sub3) local349.method8917()) {
				local354.method9276();
				Static519.method7297(local354);
			}
		}
		if (Static236.aBoolean325) {
			for (local78 = 0; local78 < Static486.anInt8045; local78++) {
				Static541.aClass265Array1[local78].method6567(arg0, arg14);
			}
		}
		if (Static140.aBoolean220) {
			Static390.anIntArray946 = Static671.aClass13_21.Y();
			Static671.aClass13_21.K(Static584.anIntArray810);
			local78 = (Static584.anIntArray810[2] - Static584.anIntArray810[0]) / Static406.anInt6453;
			for (local81 = 0; local81 < Static406.anInt6453 - 1; local81++) {
				Static219.anIntArray374[local81] = local78 * (local81 + 1) + Static589.anIntArray820[local81];
			}
			for (local83 = 0; local83 < Static569.aClass383Array1.length; local83++) {
				Static569.aClass383Array1[local83].method9129();
			}
		}
		if (Static275.aClass164ArrayArrayArray2 != null) {
			if (Static140.aBoolean220) {
				Static348.method5200(0);
			}
			Static524.method7321(true);
			Static671.aClass13_21.ra(-1, 1583160, 40, 127);
			Static333.method8041(true, arg4, arg10, arg11, arg15, arg16, arg17);
			if (Static140.aBoolean220) {
				Static548.method7836();
			}
			Static671.aClass13_21.pa();
			Static524.method7321(false);
		}
		Static333.method8041(false, arg4, arg10, arg11, arg15, arg16, arg17);
		if (Static140.aBoolean220) {
			for (local78 = 0; local78 < Static183.anInt3720; local78++) {
				Static45.aBooleanArrayArrayArray1[local78] = Static614.aBooleanArrayArrayArray2[local78];
			}
			Static348.method5200(0);
			for (local81 = 0; local81 < Static569.aClass383Array1.length; local81++) {
				Static569.aClass383Array1[local81].method9129();
			}
		}
		if (Static140.aBoolean220) {
			Static548.method7836();
			for (local78 = 0; local78 < Static183.anInt3720; local78++) {
				Static614.aBooleanArrayArrayArray2[local78] = Static45.aBooleanArrayArrayArray1[local78];
			}
			if (Static593.anInt9541 == 2) {
				@Pc(543) int local543;
				if (Static619.aLongArray30[0] < Static619.aLongArray30[1]) {
					if (Static219.anIntArray374[0] + Static589.anIntArray820[0] > Static584.anIntArray810[0]) {
						local543 = Static589.anIntArray820[0]++;
					}
				} else if (Static619.aLongArray30[0] > Static619.aLongArray30[1] && Static219.anIntArray374[0] + Static589.anIntArray820[0] < Static584.anIntArray810[2]) {
					local543 = Static589.anIntArray820[0]--;
				}
			}
		}
		if (!Static163.aBoolean249) {
			Static430.aBooleanArrayArray7 = local72;
			Static600.aBooleanArrayArray8 = local74;
		}
		Static223.method3828();
	}

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(IZII)I")
	public static int method3085(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 4095 - arg0;
		} else {
			return 4095 - arg2;
		}
	}

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(III)Z")
	public static boolean method3086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
