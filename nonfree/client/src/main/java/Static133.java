import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!jm", name = "M", descriptor = "I")
	public static int anInt2661;

	@OriginalMember(owner = "client!jm", name = "Q", descriptor = "I")
	public static int anInt2663;

	@OriginalMember(owner = "client!jm", name = "R", descriptor = "[Lclient!wb;")
	public static Class4_Sub2_Sub4[] aClass4_Sub2_Sub4Array8;

	@OriginalMember(owner = "client!jm", name = "T", descriptor = "[Lclient!fg;")
	public static Interface2[] anInterface2Array1;

	@OriginalMember(owner = "client!jm", name = "N", descriptor = "Lclient!ul;")
	public static Class172 aClass172_22 = new Class172(64);

	@OriginalMember(owner = "client!jm", name = "O", descriptor = "[I")
	public static int[] anIntArray225 = new int[200];

	@OriginalMember(owner = "client!jm", name = "S", descriptor = "[I")
	public static int[] anIntArray226 = new int[32];

	@OriginalMember(owner = "client!jm", name = "V", descriptor = "Ljava/lang/String;")
	public static String aString90 = "shake:";

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZLclient!pi;IIBZIIIIII)V")
	public static void method2173(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class4_Sub24 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(28) int local28;
		if (arg10 < 0 || arg10 >= 104 || arg9 < 0 || arg9 >= 104) {
			while (true) {
				local28 = arg1.method3110();
				if (local28 == 0) {
					break;
				}
				if (local28 == 1) {
					arg1.method3110();
					break;
				}
				if (local28 <= 49) {
					arg1.method3110();
				}
			}
			return;
		}
		if (!arg4 && !arg0) {
			Static27.aByteArrayArrayArray2[arg8][arg10][arg9] = 0;
		}
		while (true) {
			local28 = arg1.method3110();
			if (local28 == 0) {
				if (arg4) {
					Static154.anIntArrayArrayArray5[0][arg7 + arg10][arg9 + arg2] = Static230.anIntArrayArrayArray12[0][arg7 + arg10][arg2 + arg9];
				} else if (arg8 == 0) {
					Static154.anIntArrayArrayArray5[0][arg10 + arg7][arg2 + arg9] = -Static27.method585(arg5 + 556238, arg3 + 932731) * 8;
				} else {
					Static154.anIntArrayArrayArray5[arg8][arg10 + arg7][arg2 + arg9] = Static154.anIntArrayArrayArray5[arg8 - 1][arg7 + arg10][arg2 + arg9] - 240;
				}
				break;
			}
			if (local28 == 1) {
				@Pc(163) int local163 = arg1.method3110();
				if (arg4) {
					Static154.anIntArrayArrayArray5[0][arg7 + arg10][arg9 + arg2] = local163 * 8 + Static230.anIntArrayArrayArray12[0][arg7 + arg10][arg9 + arg2];
				} else {
					if (local163 == 1) {
						local163 = 0;
					}
					if (arg8 == 0) {
						Static154.anIntArrayArrayArray5[0][arg7 + arg10][arg2 + arg9] = -local163 * 8;
					} else {
						Static154.anIntArrayArrayArray5[arg8][arg7 + arg10][arg2 + arg9] = Static154.anIntArrayArrayArray5[arg8 - 1][arg10 + arg7][arg2 + arg9] - local163 * 8;
					}
				}
				break;
			}
			if (local28 > 49) {
				if (local28 > 81) {
					if (!arg0) {
						Static121.aByteArrayArrayArray8[arg8][arg10][arg9] = (byte) (local28 - 81);
					}
				} else if (!arg4 && !arg0) {
					Static27.aByteArrayArrayArray2[arg8][arg10][arg9] = (byte) (local28 - 49);
				}
			} else if (arg0) {
				arg1.method3110();
			} else {
				Static241.aByteArrayArrayArray13[arg8][arg10][arg9] = arg1.method3069();
				Static32.aByteArrayArrayArray3[arg8][arg10][arg9] = (byte) ((local28 - 2) / 4);
				Static66.aByteArrayArrayArray15[arg8][arg10][arg9] = (byte) (arg6 + local28 - 2 & 0x3);
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "([[ILclient!qb;[[FI[[FIZLclient!ik;I[[F[I)V")
	public static void method2174(@OriginalArg(0) int[][] arg0, @OriginalArg(1) Class137 arg1, @OriginalArg(2) float[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class76 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float[][] arg8, @OriginalArg(10) int[] arg9) {
		@Pc(11) int[] local11 = new int[arg9.length / 2];
		for (@Pc(19) int local19 = 0; local19 < local11.length; local19++) {
			@Pc(33) int local33 = arg9[local19 + local19];
			@Pc(41) int local41 = arg9[local19 + local19 + 1];
			@Pc(48) int local48;
			if (arg3 == 1) {
				local48 = local33;
				local33 = local41;
				local41 = 128 - local48;
			} else if (arg3 == 2) {
				local33 = 128 - local33;
				local41 = 128 - local41;
			} else if (arg3 == 3) {
				local48 = local33;
				local33 = 128 - local41;
				local41 = local48;
			}
			@Pc(108) float local108;
			@Pc(96) float local96;
			@Pc(102) float local102;
			if (local33 == 0 && local41 == 0) {
				local96 = arg8[arg7][arg5];
				local102 = arg2[arg7][arg5];
				local108 = arg4[arg7][arg5];
			} else if (local33 == 128 && local41 == 0) {
				local108 = arg4[arg7 + 1][arg5];
				local96 = arg8[arg7 + 1][arg5];
				local102 = arg2[arg7 + 1][arg5];
			} else if (local33 == 128 && local41 == 128) {
				local96 = arg8[arg7 + 1][arg5 + 1];
				local102 = arg2[arg7 + 1][arg5 + 1];
				local108 = arg4[arg7 + 1][arg5 + 1];
			} else if (local33 == 0 && local41 == 128) {
				local108 = arg4[arg7][arg5 + 1];
				local102 = arg2[arg7][arg5 + 1];
				local96 = arg8[arg7][arg5 + 1];
			} else {
				local102 = arg2[arg7][arg5];
				local108 = arg4[arg7][arg5];
				local96 = arg8[arg7][arg5];
				@Pc(191) float local191 = (float) local41 / 128.0F;
				@Pc(196) float local196 = (float) local33 / 128.0F;
				@Pc(211) float local211 = local102 + (arg2[arg7 + 1][arg5] - local102) * local196;
				@Pc(226) float local226 = local108 + local196 * (arg4[arg7 + 1][arg5] - local108);
				@Pc(234) float local234 = arg2[arg7][arg5 + 1];
				@Pc(249) float local249 = local96 + local196 * (arg8[arg7 + 1][arg5] - local96);
				@Pc(257) float local257 = arg4[arg7][arg5 + 1];
				@Pc(273) float local273 = local257 + (arg4[arg7 + 1][arg5 + 1] - local257) * local196;
				local108 = local226 + local191 * (local273 - local226);
				@Pc(290) float local290 = arg8[arg7][arg5 + 1];
				@Pc(306) float local306 = local234 + (arg2[arg7 + 1][arg5 + 1] - local234) * local196;
				@Pc(323) float local323 = local290 + (arg8[arg7 + 1][arg5 + 1] - local290) * local196;
				local102 = local211 + (local306 - local211) * local191;
				local96 = local249 + local191 * (local323 - local249);
			}
			@Pc(399) int local399 = (arg7 << 7) + local33;
			@Pc(405) int local405 = (arg5 << 7) + local41;
			@Pc(413) int local413 = Static178.method2929(local41, arg5, local33, arg0, arg7);
			local11[local19] = arg6.method1964(arg1, local399, local413, local405, local102, local108, local96);
		}
		arg6.method1963(local11);
	}
}
