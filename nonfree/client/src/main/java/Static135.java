import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "Lclient!mv;")
	public static Class248 aClass248_1;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
	public static final int anInt2509 = 1407;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
	public static int anInt2515 = 0;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	public static int anInt2517 = 0;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II[F)[F")
	public static float[] method2224(@OriginalArg(0) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(6) float[] local6 = new float[arg0];
		Static735.method9187(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II[IIILclient!tq;IIZI[IIIII)I")
	public static int method2225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class360 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(9) int local9 = 0; local9 < 128; local9++) {
				Static407.anIntArrayArray40[local3][local9] = 0;
				Static717.anIntArrayArray62[local3][local9] = 99999999;
			}
		}
		@Pc(66) boolean local66;
		if (arg1 == 1) {
			local66 = Static555.method7790(arg4, arg3, arg0, arg10, arg6, arg13, arg8, arg12, arg11, arg5);
		} else if (arg1 == 2) {
			local66 = Static577.method7989(arg8, arg11, arg12, arg5, arg4, arg0, arg10, arg3, arg13, arg6);
		} else {
			local66 = Static147.method2424(arg3, arg13, arg6, arg10, arg12, arg0, arg4, arg1, arg5, arg11, arg8);
		}
		@Pc(101) int local101 = arg13 - 64;
		@Pc(105) int local105 = arg5 - 64;
		@Pc(107) int local107 = Static633.anInt3424;
		@Pc(109) int local109 = Static282.anInt5124;
		@Pc(120) int local120;
		@Pc(122) int local122;
		@Pc(136) int local136;
		if (!local66) {
			if (!arg7) {
				return -1;
			}
			local120 = Integer.MAX_VALUE;
			local122 = Integer.MAX_VALUE;
			for (@Pc(128) int local128 = arg3 - 10; local128 <= arg3 + 10; local128++) {
				for (local136 = arg11 - 10; local136 <= arg11 + 10; local136++) {
					@Pc(143) int local143 = local128 - local101;
					@Pc(148) int local148 = local136 - local105;
					if (local143 >= 0 && local148 >= 0 && local143 < 128 && local148 < 128 && Static717.anIntArrayArray62[local143][local148] < 100) {
						@Pc(180) int local180 = 0;
						if (local128 < arg3) {
							local180 = arg3 - local128;
						} else if (arg3 + arg6 - 1 < local128) {
							local180 = local128 + 1 - arg3 - arg6;
						}
						@Pc(215) int local215 = 0;
						if (arg11 > local136) {
							local215 = arg11 - local136;
						} else if (local136 > arg11 + arg0 - 1) {
							local215 = local136 + 1 - arg11 - arg0;
						}
						@Pc(260) int local260 = local215 * local215 + local180 * local180;
						if (local260 < local120 || local260 == local120 && Static717.anIntArrayArray62[local143][local148] < local122) {
							local122 = Static717.anIntArrayArray62[local143][local148];
							local120 = local260;
							local107 = local128;
							local109 = local136;
						}
					}
				}
			}
			if (local120 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (arg13 == local107 && arg5 == local109) {
			return 0;
		}
		@Pc(334) byte local334 = 0;
		Static198.anIntArray177[0] = local107;
		local120 = local334 + 1;
		Static469.anIntArray88[0] = local109;
		@Pc(364) int local364;
		local122 = local364 = Static407.anIntArrayArray40[local107 - local101][local109 - local105];
		while (local107 != arg13 || arg5 != local109) {
			if (local364 != local122) {
				local364 = local122;
				Static198.anIntArray177[local120] = local107;
				Static469.anIntArray88[local120++] = local109;
			}
			if ((local122 & 0x1) != 0) {
				local109++;
			} else if ((local122 & 0x4) != 0) {
				local109--;
			}
			if ((local122 & 0x2) != 0) {
				local107++;
			} else if ((local122 & 0x8) != 0) {
				local107--;
			}
			local122 = Static407.anIntArrayArray40[local107 - local101][local109 - local105];
		}
		local136 = 0;
		while (local120-- > 0) {
			arg2[local136] = Static198.anIntArray177[local120];
			arg9[local136++] = Static469.anIntArray88[local120];
			if (local136 >= arg2.length) {
				break;
			}
		}
		return local136;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBI)Z")
	public static boolean method2226(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && Static6.aByteArrayArrayArray1[1].length > arg0 && Static6.aByteArrayArrayArray1[1][arg0].length > arg1) {
			return (Static6.aByteArrayArrayArray1[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
	public static void method2227() {
		if (Static720.aClass264_1 != null) {
			Static720.aClass264_1.method6409();
		}
		if (Static578.aThread5 == null) {
			return;
		}
		while (true) {
			try {
				Static578.aThread5.join();
				return;
			} catch (@Pc(25) InterruptedException local25) {
			}
		}
	}
}
