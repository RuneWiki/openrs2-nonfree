import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
	public static int anInt2158;

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
	public static int anInt2152 = 0;

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
	public static int anInt2153 = -2;

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString73 = "Checking for updates - ";

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
	public static int anInt2159 = 500;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "([[FLclient!jb;III[[IIIBIZI[[FBI[[F)V")
	public static void method1949(@OriginalArg(0) float[][] arg0, @OriginalArg(1) Class1_Sub15 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float[][] arg11, @OriginalArg(13) byte arg12, @OriginalArg(14) int arg13, @OriginalArg(15) float[][] arg14) {
		@Pc(11) int local11 = (arg2 << 8) + 255;
		@Pc(17) int local17 = (arg6 << 8) + 255;
		@Pc(23) int local23 = (arg8 << 8) + 255;
		@Pc(27) int[] local27 = Static47.anIntArrayArray8[arg12];
		@Pc(29) int[] local29 = null;
		@Pc(35) int local35 = (arg10 << 8) + 255;
		@Pc(41) int[] local41 = new int[local27.length >> 1];
		@Pc(43) int local43;
		for (local43 = 0; local43 < local41.length; local43++) {
			local41[local43] = Static289.method4357(arg7, arg0, false, arg1, arg14, local35, arg3, arg11, local17, arg5, 0.0F, arg13, local11, local23, local27[local43 + local43], local27[local43 + local43 + 1], null);
		}
		if (arg9) {
			@Pc(180) int local180;
			if (arg12 == 1) {
				local29 = new int[6];
				local43 = Static289.method4357(arg7, arg0, true, arg1, arg14, local35, arg3, arg11, local17, arg5, 0.0F, arg13, local11, local23, 64, 128, null);
				local180 = Static289.method4357(arg7, arg0, true, arg1, arg14, local35, arg3, arg11, local17, arg5, 0.0F, arg13, local11, local23, 128, 64, null);
				local29[2] = local41[2];
				local29[5] = local41[2];
				local29[1] = local43;
				local29[3] = local43;
				local29[0] = local180;
				local29[4] = local41[0];
			} else if (arg12 == 2) {
				local29 = new int[6];
				local43 = Static289.method4357(arg7, arg0, true, arg1, arg14, local35, arg3, arg11, local17, arg5, 0.0F, arg13, local11, local23, 128, 128, null);
				local180 = Static289.method4357(arg7, arg0, true, arg1, arg14, local35, arg3, arg11, local17, arg5, 0.0F, arg13, local11, local23, 64, 0, null);
				local29[2] = local43;
				local29[0] = local41[0];
				local29[1] = local180;
				local29[4] = local41[1];
				local29[5] = local41[0];
				local29[3] = local43;
			} else if (arg12 == 3) {
				local29 = new int[6];
				local43 = Static289.method4357(arg7, arg0, true, arg1, arg14, local35, arg3, arg11, local17, arg5, 0.0F, arg13, local11, local23, 0, 128, null);
				local180 = Static289.method4357(arg7, arg0, true, arg1, arg14, local35, arg3, arg11, local17, arg5, 0.0F, arg13, local11, local23, 64, 0, null);
				local29[3] = local43;
				local29[0] = local41[2];
				local29[1] = local41[1];
				local29[4] = local180;
				local29[2] = local43;
				local29[5] = local41[2];
			} else if (arg12 == 4) {
				local29 = new int[3];
				local43 = Static289.method4357(arg7, arg0, true, arg1, arg14, local35, arg3, arg11, local17, arg5, 0.0F, arg13, local11, local23, 0, 128, null);
				local29[1] = local43;
				local29[0] = local41[3];
				local29[2] = local41[0];
			} else if (arg12 == 5) {
				local29 = new int[3];
				local43 = Static289.method4357(arg7, arg0, true, arg1, arg14, local35, arg3, arg11, local17, arg5, 0.0F, arg13, local11, local23, 128, 128, null);
				local29[0] = local41[2];
				local29[2] = local41[3];
				local29[1] = local43;
			} else if (arg12 == 6) {
				local29 = new int[6];
				local43 = Static289.method4357(arg7, arg0, true, arg1, arg14, local35, arg3, arg11, local17, arg5, 0.0F, arg13, local11, local23, 128, 0, null);
				local180 = Static289.method4357(arg7, arg0, true, arg1, arg14, local35, arg3, arg11, local17, arg5, 0.0F, arg13, local11, local23, 128, 128, null);
				local29[0] = local41[3];
				local29[4] = local41[0];
				local29[1] = local43;
				local29[3] = local180;
				local29[5] = local41[3];
				local29[2] = local180;
			} else if (arg12 == 7) {
				local29 = new int[6];
				local43 = Static289.method4357(arg7, arg0, true, arg1, arg14, local35, arg3, arg11, local17, arg5, 0.0F, arg13, local11, local23, 0, 128, null);
				local180 = Static289.method4357(arg7, arg0, true, arg1, arg14, local35, arg3, arg11, local17, arg5, 0.0F, arg13, local11, local23, 128, 0, null);
				local29[2] = local43;
				local29[3] = local43;
				local29[0] = local41[1];
				local29[1] = local180;
				local29[5] = local41[1];
				local29[4] = local41[2];
			} else if (arg12 == 8) {
				local29 = new int[3];
				local43 = Static289.method4357(arg7, arg0, true, arg1, arg14, local35, arg3, arg11, local17, arg5, 0.0F, arg13, local11, local23, 0, 0, null);
				local29[2] = local41[4];
				local29[0] = local41[3];
				local29[1] = local43;
			} else if (arg12 == 9) {
				local29 = new int[15];
				local43 = Static289.method4357(arg7, arg0, true, arg1, arg14, local35, arg3, arg11, local17, arg5, 0.0F, arg13, local11, local23, 128, 64, null);
				local180 = Static289.method4357(arg7, arg0, true, arg1, arg14, local35, arg3, arg11, local17, arg5, 0.0F, arg13, local11, local23, 96, 32, null);
				@Pc(716) int local716 = Static289.method4357(arg7, arg0, true, arg1, arg14, local35, arg3, arg11, local17, arg5, 0.0F, arg13, local11, local23, 64, 0, null);
				local29[3] = local180;
				local29[9] = local180;
				local29[0] = local180;
				local29[7] = local41[3];
				local29[6] = local180;
				local29[2] = local41[4];
				local29[14] = local716;
				local29[12] = local180;
				local29[5] = local41[3];
				local29[10] = local41[2];
				local29[4] = local41[4];
				local29[8] = local41[2];
				local29[1] = local43;
				local29[11] = local41[1];
				local29[13] = local41[1];
			} else if (arg12 == 10) {
				local29 = new int[9];
				local43 = Static289.method4357(arg7, arg0, true, arg1, arg14, local35, arg3, arg11, local17, arg5, 0.0F, arg13, local11, local23, 0, 128, null);
				local29[0] = local41[2];
				local29[4] = local43;
				local29[2] = local41[3];
				local29[8] = local41[0];
				local29[3] = local41[3];
				local29[1] = local43;
				local29[5] = local41[4];
				local29[7] = local43;
				local29[6] = local41[4];
			} else if (arg12 == 11) {
				local43 = Static289.method4357(arg7, arg0, true, arg1, arg14, local35, arg3, arg11, local17, arg5, 0.0F, arg13, local11, local23, 0, 64, null);
				local29 = new int[12];
				local180 = Static289.method4357(arg7, arg0, true, arg1, arg14, local35, arg3, arg11, local17, arg5, 0.0F, arg13, local11, local23, 128, 64, null);
				local29[5] = local43;
				local29[8] = local43;
				local29[0] = local41[3];
				local29[11] = local180;
				local29[3] = local41[3];
				local29[1] = local43;
				local29[7] = local180;
				local29[10] = local41[1];
				local29[2] = local41[0];
				local29[4] = local41[2];
				local29[6] = local41[2];
				local29[9] = local41[2];
			}
		}
		arg1.method2222(arg4, arg3, arg13, local41, local29, false);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)Z")
	public static boolean method1950(@OriginalArg(0) int arg0) {
		Static82.anInt1827 = arg0 + 1 & 0xFFFF;
		Static121.aBoolean215 = true;
		return true;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!kl;Z)V")
	public static void method1951(@OriginalArg(0) Class11_Sub4_Sub1 arg0) {
		@Pc(12) Class1_Sub28 local12 = (Class1_Sub28) Static4.aClass86_3.method2136(Static282.method4276(arg0.aString99));
		if (local12 == null) {
			Static219.method3547(arg0.anIntArray406[0], arg0.anIntArray407[0], null, Static132.anInt2608, 0, arg0, null);
		} else {
			local12.method3798();
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)V")
	public static void method1953() {
		for (@Pc(1) int local1 = 0; local1 < Static311.anInt5590; local1++) {
			for (@Pc(6) int local6 = 0; local6 < Static220.anInt4129; local6++) {
				for (@Pc(11) int local11 = 0; local11 < Static298.anInt5372; local11++) {
					@Pc(22) Class1_Sub16 local22 = Static254.aClass1_Sub16ArrayArrayArray3[local1][local6][local11];
					if (local22 != null) {
						@Pc(27) Class39 local27 = local22.aClass39_1;
						if (local27 != null && local27.aClass11_4.method4301()) {
							Static212.method3489(local27.aClass11_4, local1, local6, local11, 1, 1);
							if (local27.aClass11_3 != null && local27.aClass11_3.method4301()) {
								Static212.method3489(local27.aClass11_3, local1, local6, local11, 1, 1);
								local27.aClass11_4.method4296(local27.aClass11_3, 0, 0, 0, false);
								local27.aClass11_3 = local27.aClass11_3.method4298();
							}
							local27.aClass11_4 = local27.aClass11_4.method4298();
						}
						for (@Pc(83) int local83 = 0; local83 < local22.anInt2573; local83++) {
							@Pc(92) Class45 local92 = local22.aClass45Array2[local83];
							if (local92 != null && local92.aClass11_5.method4301()) {
								Static212.method3489(local92.aClass11_5, local1, local6, local11, local92.anInt1362 + 1 - local92.anInt1360, local92.anInt1355 - local92.anInt1359 + 1);
								local92.aClass11_5 = local92.aClass11_5.method4298();
							}
						}
						@Pc(131) Class124 local131 = local22.aClass124_1;
						if (local131 != null && local131.aClass11_10.method4301()) {
							Static131.method2285(local131.aClass11_10, local1, local6, local11);
							local131.aClass11_10 = local131.aClass11_10.method4298();
						}
					}
				}
			}
		}
	}
}
