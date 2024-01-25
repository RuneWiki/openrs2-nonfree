import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!eba", name = "i", descriptor = "[J")
	public static long[] aLongArray3;

	@OriginalMember(owner = "client!eba", name = "d", descriptor = "Lclient!fha;")
	public static final Class101 aClass101_7 = new Class101(4, 4);

	@OriginalMember(owner = "client!eba", name = "h", descriptor = "Lclient!gm;")
	public static final Class122 aClass122_5 = new Class122("", 13);

	@OriginalMember(owner = "client!eba", name = "j", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_41 = new Class73(27, 6);

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
	public static void method2555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16, @OriginalArg(18) boolean arg17) {
		Static260.aBoolean441 = true;
		Static597.aBoolean790 = Static472.aClass5_14.method6185() > 0;
		Static525.aBoolean738 = true;
		Static427.anInt7834 = arg1 >> Static606.anInt10280;
		Static594.anInt10050 = arg3 >> Static606.anInt10280;
		Static244.anInt5341 = arg1;
		Static599.anInt10170 = arg3;
		Static231.anInt5129 = arg2;
		Static530.anInt9217 = Static427.anInt7834 - Static456.anInt8195;
		if (Static530.anInt9217 < 0) {
			Static129.anInt3168 = -Static530.anInt9217;
			Static530.anInt9217 = 0;
		} else {
			Static129.anInt3168 = 0;
		}
		Static318.anInt6330 = Static594.anInt10050 - Static456.anInt8195;
		if (Static318.anInt6330 < 0) {
			Static443.anInt8036 = -Static318.anInt6330;
			Static318.anInt6330 = 0;
		} else {
			Static443.anInt8036 = 0;
		}
		Static329.anInt6607 = Static427.anInt7834 + Static456.anInt8195;
		if (Static329.anInt6607 > Static623.anInt10485) {
			Static329.anInt6607 = Static623.anInt10485;
		}
		Static67.anInt2301 = Static594.anInt10050 + Static456.anInt8195;
		if (Static67.anInt2301 > Static142.anInt3372) {
			Static67.anInt2301 = Static142.anInt3372;
		}
		@Pc(72) boolean[][] local72 = Static137.aBooleanArrayArray1;
		@Pc(74) boolean[][] local74 = Static551.aBooleanArrayArray7;
		@Pc(78) int local78;
		@Pc(81) int local81;
		@Pc(83) int local83;
		if (Static525.aBoolean738) {
			for (local78 = 0; local78 < Static456.anInt8195 + Static456.anInt8195 + 2; local78++) {
				local81 = 0;
				local83 = 0;
				for (@Pc(85) int local85 = 0; local85 < Static456.anInt8195 + Static456.anInt8195 + 2; local85++) {
					if (local85 > 1) {
						Static592.anIntArray540[local85 - 2] = local81;
					}
					local81 = local83;
					@Pc(103) int local103 = Static427.anInt7834 + local78 - Static456.anInt8195;
					@Pc(109) int local109 = Static594.anInt10050 + local85 - Static456.anInt8195;
					@Pc(123) int local123;
					if (local103 >= 0 && local109 >= 0 && local103 < Static623.anInt10485 && local109 < Static142.anInt3372) {
						local123 = local103 << Static606.anInt10280;
						@Pc(127) int local127 = local109 << Static606.anInt10280;
						@Pc(144) int local144 = Static150.aClass245Array2[Static150.aClass245Array2.length - 1].method7583(local109, local103) - (0x3E8 << Static606.anInt10280 - 7);
						@Pc(166) int local166 = Static152.aClass245Array3 == null ? Static150.aClass245Array2[0].method7583(local109, local103) + Static190.anInt4138 : Static152.aClass245Array3[0].method7583(local109, local103) + Static190.anInt4138;
						local83 = arg15 >= 0 ? Static472.aClass5_14.r(local123, local144, local127, local123, local166, local127, arg15) : Static472.aClass5_14.JA(local123, local144, local127, local123, local166, local127);
						Static551.aBooleanArrayArray7[local78][local85] = local83 == 0;
					} else {
						local83 = -1;
						Static551.aBooleanArrayArray7[local78][local85] = false;
					}
					if (local78 > 0 && local85 > 0) {
						local123 = Static592.anIntArray540[local85 - 1] & Static592.anIntArray540[local85] & local81 & local83;
						Static137.aBooleanArrayArray1[local78 - 1][local85 - 1] = local123 == 0;
					}
				}
				Static592.anIntArray540[Static456.anInt8195 + Static456.anInt8195] = local81;
				Static592.anIntArray540[Static456.anInt8195 + Static456.anInt8195 + 1] = local83;
			}
			if (arg15 >= 0) {
				Static260.aBoolean441 = false;
			} else {
				Static254.anIntArray224 = arg5;
				Static503.anIntArray446 = arg6;
				Static184.anIntArray185 = arg7;
				Static143.anIntArray129 = arg8;
				Static618.anIntArray556 = arg9;
				Static579.method8040(Static472.aClass5_14, arg10);
			}
		} else {
			if (Static226.aBooleanArrayArray3 == null) {
				Static226.aBooleanArrayArray3 = new boolean[Static623.anInt10485 + Static623.anInt10485 + 1][Static142.anInt3372 + Static623.anInt10485 + 1];
			}
			for (local78 = 0; local78 < Static226.aBooleanArrayArray3.length; local78++) {
				for (local81 = 0; local81 < Static226.aBooleanArrayArray3[0].length; local81++) {
					Static226.aBooleanArrayArray3[local78][local81] = true;
				}
			}
			Static551.aBooleanArrayArray7 = Static226.aBooleanArrayArray3;
			Static137.aBooleanArrayArray1 = Static226.aBooleanArrayArray3;
			Static530.anInt9217 = 0;
			Static318.anInt6330 = 0;
			Static329.anInt6607 = Static623.anInt10485;
			Static67.anInt2301 = Static142.anInt3372;
			Static260.aBoolean441 = false;
		}
		Static111.method2505(Static472.aClass5_14);
		if (!Static418.aClass100_1.aBoolean282) {
			@Pc(349) Class234 local349 = Static418.aClass100_1.aClass234_4;
			for (@Pc(354) Class9_Sub2 local354 = (Class9_Sub2) local349.method6092(); local354 != null; local354 = (Class9_Sub2) local349.method6098()) {
				local354.method8408();
				Static72.method2064(local354);
			}
		}
		if (Static597.aBoolean790) {
			for (local78 = 0; local78 < Static402.anInt7480; local78++) {
				Static489.aClass3Array1[local78].method51(arg14, arg0);
			}
		}
		if (Static640.aBoolean844) {
			Static525.anIntArray475 = Static472.aClass5_14.Y();
			Static472.aClass5_14.K(Static210.anIntArray203);
			local78 = (Static210.anIntArray203[2] - Static210.anIntArray203[0]) / Static40.anInt1428;
			for (local81 = 0; local81 < Static40.anInt1428 - 1; local81++) {
				Static509.anIntArray482[local81] = local78 * (local81 + 1) + Static30.anIntArray31[local81];
			}
			for (local83 = 0; local83 < Static93.aClass188Array1.length; local83++) {
				Static93.aClass188Array1[local83].method5374();
			}
		}
		if (Static444.aClass186ArrayArrayArray3 != null) {
			if (Static640.aBoolean844) {
				Static130.method8103(0);
			}
			Static437.method6710(true);
			Static472.aClass5_14.ra(-1, 1583160, 40, 127);
			Static130.method8102(true, arg4, arg10, arg11, arg15, arg16, arg17);
			if (Static640.aBoolean844) {
				Static20.method609();
			}
			Static472.aClass5_14.pa();
			Static437.method6710(false);
		}
		Static130.method8102(false, arg4, arg10, arg11, arg15, arg16, arg17);
		if (Static640.aBoolean844) {
			for (local78 = 0; local78 < Static618.anInt10427; local78++) {
				Static223.aBooleanArrayArrayArray2[local78] = Static71.aBooleanArrayArrayArray1[local78];
			}
			Static130.method8103(0);
			for (local81 = 0; local81 < Static93.aClass188Array1.length; local81++) {
				Static93.aClass188Array1[local81].method5374();
			}
		}
		if (Static640.aBoolean844) {
			Static20.method609();
			for (local78 = 0; local78 < Static618.anInt10427; local78++) {
				Static71.aBooleanArrayArrayArray1[local78] = Static223.aBooleanArrayArrayArray2[local78];
			}
			if (Static514.anInt8985 == 2) {
				@Pc(543) int local543;
				if (Static637.aLongArray10[0] < Static637.aLongArray10[1]) {
					if (Static509.anIntArray482[0] + Static30.anIntArray31[0] > Static210.anIntArray203[0]) {
						local543 = Static30.anIntArray31[0]++;
					}
				} else if (Static637.aLongArray10[0] > Static637.aLongArray10[1] && Static509.anIntArray482[0] + Static30.anIntArray31[0] < Static210.anIntArray203[2]) {
					local543 = Static30.anIntArray31[0]--;
				}
			}
		}
		if (!Static525.aBoolean738) {
			Static137.aBooleanArrayArray1 = local72;
			Static551.aBooleanArrayArray7 = local74;
		}
		Static376.method5976();
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(ILclient!ni;Lclient!d;ILjava/awt/Canvas;)Lclient!ha;")
	public static Class5 method2556(@OriginalArg(0) int arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(4) Canvas arg3) {
		if (!Static551.method7735()) {
			throw new RuntimeException("");
		} else if (Static362.method5843("jaggl")) {
			@Pc(24) OpenGL local24 = new OpenGL();
			@Pc(34) long local34 = local24.init(arg3, 8, 8, 8, 24, 0, arg0);
			if (local34 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(53) Class5_Sub2_Sub2 local53 = new Class5_Sub2_Sub2(local24, arg3, local34, arg2, arg1, arg0);
			local53.method3968();
			return local53;
		} else {
			throw new RuntimeException("");
		}
	}
}
