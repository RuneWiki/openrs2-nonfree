import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static642 {

	@OriginalMember(owner = "client!vja", name = "l", descriptor = "I")
	public static int anInt10555;

	@OriginalMember(owner = "client!vja", name = "m", descriptor = "I")
	public static int anInt10556;

	@OriginalMember(owner = "client!vja", name = "p", descriptor = "[I")
	public static final int[] anIntArray559 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!vja", name = "v", descriptor = "I")
	public static int anInt10564 = 0;

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(B)[Lclient!daa;")
	public static Class70[] method8645() {
		return new Class70[] { Static80.aClass70_1, Static238.aClass70_4, Static543.aClass70_5 };
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
	public static void method8648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16, @OriginalArg(18) boolean arg17) {
		Static296.aBoolean335 = true;
		Static331.aBoolean356 = Static50.aClass95_1.method8026() > 0;
		Static75.aBoolean105 = true;
		Static88.anInt1826 = arg1 >> Static571.anInt9216;
		Static353.anInt6041 = arg3 >> Static571.anInt9216;
		Static632.anInt10468 = arg1;
		Static332.anInt5506 = arg3;
		Static209.anInt3644 = arg2;
		Static72.anInt1420 = Static88.anInt1826 - Static362.anInt6205;
		if (Static72.anInt1420 < 0) {
			Static79.anInt1495 = -Static72.anInt1420;
			Static72.anInt1420 = 0;
		} else {
			Static79.anInt1495 = 0;
		}
		Static608.anInt10133 = Static353.anInt6041 - Static362.anInt6205;
		if (Static608.anInt10133 < 0) {
			Static675.anInt10913 = -Static608.anInt10133;
			Static608.anInt10133 = 0;
		} else {
			Static675.anInt10913 = 0;
		}
		Static196.anInt3541 = Static88.anInt1826 + Static362.anInt6205;
		if (Static196.anInt3541 > Static133.anInt2551) {
			Static196.anInt3541 = Static133.anInt2551;
		}
		Static120.anInt2148 = Static353.anInt6041 + Static362.anInt6205;
		if (Static120.anInt2148 > Static155.anInt2874) {
			Static120.anInt2148 = Static155.anInt2874;
		}
		@Pc(72) boolean[][] local72 = Static375.aBooleanArrayArray6;
		@Pc(74) boolean[][] local74 = Static591.aBooleanArrayArray9;
		@Pc(78) int local78;
		@Pc(81) int local81;
		@Pc(83) int local83;
		if (Static75.aBoolean105) {
			for (local78 = 0; local78 < Static362.anInt6205 + Static362.anInt6205 + 2; local78++) {
				local81 = 0;
				local83 = 0;
				for (@Pc(85) int local85 = 0; local85 < Static362.anInt6205 + Static362.anInt6205 + 2; local85++) {
					if (local85 > 1) {
						Static40.anIntArray46[local85 - 2] = local81;
					}
					local81 = local83;
					@Pc(103) int local103 = Static88.anInt1826 + local78 - Static362.anInt6205;
					@Pc(109) int local109 = Static353.anInt6041 + local85 - Static362.anInt6205;
					@Pc(123) int local123;
					if (local103 >= 0 && local109 >= 0 && local103 < Static133.anInt2551 && local109 < Static155.anInt2874) {
						local123 = local103 << Static571.anInt9216;
						@Pc(127) int local127 = local109 << Static571.anInt9216;
						@Pc(144) int local144 = Static556.aClass35Array2[Static556.aClass35Array2.length - 1].method7461(local109, local103) - (0x3E8 << Static571.anInt9216 - 7);
						@Pc(166) int local166 = Static368.aClass35Array1 == null ? Static556.aClass35Array2[0].method7461(local109, local103) + Static599.anInt7773 : Static368.aClass35Array1[0].method7461(local109, local103) + Static599.anInt7773;
						local83 = arg15 >= 0 ? Static50.aClass95_1.r(local123, local144, local127, local123, local166, local127, arg15) : Static50.aClass95_1.JA(local123, local144, local127, local123, local166, local127);
						Static591.aBooleanArrayArray9[local78][local85] = local83 == 0;
					} else {
						local83 = -1;
						Static591.aBooleanArrayArray9[local78][local85] = false;
					}
					if (local78 > 0 && local85 > 0) {
						local123 = Static40.anIntArray46[local85 - 1] & Static40.anIntArray46[local85] & local81 & local83;
						Static375.aBooleanArrayArray6[local78 - 1][local85 - 1] = local123 == 0;
					}
				}
				Static40.anIntArray46[Static362.anInt6205 + Static362.anInt6205] = local81;
				Static40.anIntArray46[Static362.anInt6205 + Static362.anInt6205 + 1] = local83;
			}
			if (arg15 >= 0) {
				Static296.aBoolean335 = false;
			} else {
				Static489.anIntArray420 = arg5;
				Static485.anIntArray418 = arg6;
				Static477.anIntArray412 = arg7;
				Static557.anIntArray477 = arg8;
				Static537.anIntArray458 = arg9;
				Static140.method2322(arg10, Static50.aClass95_1);
			}
		} else {
			if (Static585.aBooleanArrayArray8 == null) {
				Static585.aBooleanArrayArray8 = new boolean[Static133.anInt2551 + Static133.anInt2551 + 1][Static155.anInt2874 + Static133.anInt2551 + 1];
			}
			for (local78 = 0; local78 < Static585.aBooleanArrayArray8.length; local78++) {
				for (local81 = 0; local81 < Static585.aBooleanArrayArray8[0].length; local81++) {
					Static585.aBooleanArrayArray8[local78][local81] = true;
				}
			}
			Static591.aBooleanArrayArray9 = Static585.aBooleanArrayArray8;
			Static375.aBooleanArrayArray6 = Static585.aBooleanArrayArray8;
			Static72.anInt1420 = 0;
			Static608.anInt10133 = 0;
			Static196.anInt3541 = Static133.anInt2551;
			Static120.anInt2148 = Static155.anInt2874;
			Static296.aBoolean335 = false;
		}
		Static537.method6885(Static50.aClass95_1);
		if (!Static305.aClass255_2.aBoolean471) {
			@Pc(349) Class317 local349 = Static305.aClass255_2.aClass317_7;
			for (@Pc(354) Class34_Sub8 local354 = (Class34_Sub8) local349.method6891(); local354 != null; local354 = (Class34_Sub8) local349.method6894()) {
				local354.method8764();
				Static363.method8905(local354);
			}
		}
		if (Static331.aBoolean356) {
			for (local78 = 0; local78 < Static619.anInt10271; local78++) {
				Static192.aClass165Array1[local78].method3852(arg0, arg14);
			}
		}
		if (Static626.aBoolean718) {
			Static510.anIntArray171 = Static50.aClass95_1.Y();
			Static50.aClass95_1.K(Static55.anIntArray58);
			local78 = (Static55.anIntArray58[2] - Static55.anIntArray58[0]) / Static356.anInt6077;
			for (local81 = 0; local81 < Static356.anInt6077 - 1; local81++) {
				Static366.anIntArray331[local81] = local78 * (local81 + 1) + Static141.anIntArray146[local81];
			}
			for (local83 = 0; local83 < Static433.aClass298Array6.length; local83++) {
				Static433.aClass298Array6[local83].method6528();
			}
		}
		if (Static195.aClass368ArrayArrayArray1 != null) {
			if (Static626.aBoolean718) {
				Static345.method5023(0);
			}
			Static224.method3292(true);
			Static50.aClass95_1.ra(-1, 1583160, 40, 127);
			Static471.method6275(true, arg4, arg10, arg11, arg15, arg16, arg17);
			if (Static626.aBoolean718) {
				Static53.method1025();
			}
			Static50.aClass95_1.pa();
			Static224.method3292(false);
		}
		Static471.method6275(false, arg4, arg10, arg11, arg15, arg16, arg17);
		if (Static626.aBoolean718) {
			for (local78 = 0; local78 < Static247.anInt4367; local78++) {
				Static579.aBooleanArrayArrayArray3[local78] = Static30.aBooleanArrayArrayArray2[local78];
			}
			Static345.method5023(0);
			for (local81 = 0; local81 < Static433.aClass298Array6.length; local81++) {
				Static433.aClass298Array6[local81].method6528();
			}
		}
		if (Static626.aBoolean718) {
			Static53.method1025();
			for (local78 = 0; local78 < Static247.anInt4367; local78++) {
				Static30.aBooleanArrayArrayArray2[local78] = Static579.aBooleanArrayArrayArray3[local78];
			}
			if (Static270.anInt4661 == 2) {
				@Pc(543) int local543;
				if (Static613.aLongArray20[0] < Static613.aLongArray20[1]) {
					if (Static366.anIntArray331[0] + Static141.anIntArray146[0] > Static55.anIntArray58[0]) {
						local543 = Static141.anIntArray146[0]++;
					}
				} else if (Static613.aLongArray20[0] > Static613.aLongArray20[1] && Static366.anIntArray331[0] + Static141.anIntArray146[0] < Static55.anIntArray58[2]) {
					local543 = Static141.anIntArray146[0]--;
				}
			}
		}
		if (!Static75.aBoolean105) {
			Static375.aBooleanArrayArray6 = local72;
			Static591.aBooleanArrayArray9 = local74;
		}
		Static439.method5993();
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(I[SI)[S")
	public static short[] method8649(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static681.method4035(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
