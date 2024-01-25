import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!sn", name = "y", descriptor = "[[I")
	public static final int[][] anIntArrayArray73 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!sn", name = "H", descriptor = "F")
	public static float aFloat184 = 0.0F;

	@OriginalMember(owner = "client!sn", name = "O", descriptor = "I")
	public static int anInt8685 = 0;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIBFIIII[FFI)V")
	public static void method7247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9) {
		@Pc(9) int local9 = arg3 - arg6;
		@Pc(13) int local13 = arg5 - arg0;
		@Pc(17) int local17 = arg4 - arg1;
		@Pc(38) float local38 = arg7[2] * (float) local9 + (float) local13 * arg7[1] + (float) local17 * arg7[0];
		@Pc(59) float local59 = arg7[4] * (float) local13 + arg7[3] * (float) local17 + arg7[5] * (float) local9;
		@Pc(80) float local80 = arg7[7] * (float) local13 + arg7[6] * (float) local17 + arg7[8] * (float) local9;
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg8 != 1.0F) {
			local91 *= arg8;
		}
		@Pc(105) float local105 = arg2 + local59 + 0.5F;
		@Pc(130) float local130;
		if (arg9 == 1) {
			local130 = local91;
			local91 = -local105;
			local105 = local130;
		} else if (arg9 == 2) {
			local91 = -local91;
			local105 = -local105;
		} else if (arg9 == 3) {
			local130 = local91;
			local91 = local105;
			local105 = -local130;
		}
		Static22.aFloat36 = local105;
		Static262.aFloat118 = local91;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
	public static void method7249() {
		Static119.anInt2416 = 0;
		@Pc(13) int local13 = (Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7347 >> 9) + Static191.anInt4147;
		@Pc(20) int local20 = Static247.anInt5049 + (Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7351 >> 9);
		if (local13 >= 3053 && local13 <= 3156 && local20 >= 3056 && local20 <= 3136) {
			Static119.anInt2416 = 1;
		}
		if (local13 >= 3072 && local13 <= 3118 && local20 >= 9492 && local20 <= 9535) {
			Static119.anInt2416 = 1;
		}
		if (Static119.anInt2416 == 1 && local13 >= 3139 && local13 <= 3199 && local20 >= 3008 && local20 <= 3062) {
			Static119.anInt2416 = 0;
		}
	}

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "(I)Z")
	public static boolean method7251() {
		if (Static325.anInt6149 < 1) {
			return false;
		} else {
			return Static186.aClass123_6 != Static230.aClass123_8 || Static456.anInt8437 >= 2;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!vp;IIIII)V")
	public static void method7253(@OriginalArg(0) Class288 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt8651 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass6_Sub29Array6[local4] != null) {
				arg0.anInt8651++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt8651; local22++) {
			@Pc(31) long local31 = Static447.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class342 local41;
			while (local31 != 0L) {
				local41 = Static470.aClass342Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass6_Sub29_2 == arg0.aClass6_Sub29Array6[local22]) {
					continue label51;
				}
			}
			local31 = Static447.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static470.aClass342Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass6_Sub29_2 == arg0.aClass6_Sub29Array6[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt8651 - 1; local93++) {
				arg0.aClass6_Sub29Array6[local93] = arg0.aClass6_Sub29Array6[local93 + 1];
			}
			arg0.anInt8651--;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIZ)I")
	public static int method7254(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class6_Sub15 local8 = Static519.method7596(arg0, arg2);
		if (local8 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local8.anIntArray173.length) {
			return local8.anIntArray173[arg1];
		} else {
			return -1;
		}
	}
}
