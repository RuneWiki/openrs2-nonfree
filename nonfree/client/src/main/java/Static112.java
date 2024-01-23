import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ho", name = "O", descriptor = "I")
	public static int anInt2332;

	@OriginalMember(owner = "client!ho", name = "N", descriptor = "I")
	public static int anInt2331 = 0;

	@OriginalMember(owner = "client!ho", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString134 = "slide:";

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "(I)V")
	public static void method2014(@OriginalArg(0) int arg0) {
		Static237.anInt4319 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static153.anInt3006; local3++) {
			for (@Pc(8) int local8 = 0; local8 < Static285.anInt5122; local8++) {
				if (Static105.aClass1_Sub33ArrayArrayArray2[arg0][local3][local8] == null) {
					Static105.aClass1_Sub33ArrayArrayArray2[arg0][local3][local8] = new Class1_Sub33(arg0, local3, local8);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method2016(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = arg1 - arg0;
		if (local3 < -9) {
			return "<col=ff0000>";
		} else if (local3 < -6) {
			return "<col=ff3000>";
		} else if (local3 < -3) {
			return "<col=ff7000>";
		} else if (local3 < 0) {
			return "<col=ffb000>";
		} else if (local3 > 9) {
			return "<col=00ff00>";
		} else if (local3 > 6) {
			return "<col=40ff00>";
		} else if (local3 > 3) {
			return "<col=80ff00>";
		} else if (local3 <= 0) {
			return "<col=ffff00>";
		} else {
			return "<col=c0ff00>";
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "([[ILclient!wb;B[[F[[FIIIZ[[FIIIBII)V")
	public static void method2017(@OriginalArg(0) int[][] arg0, @OriginalArg(1) Class1_Sub31 arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) float[][] arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) float[][] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) byte arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		@Pc(11) int local11 = (arg11 << 8) + 255;
		@Pc(17) int local17 = (arg14 << 8) + 255;
		@Pc(23) int local23 = (arg13 << 8) + 255;
		@Pc(29) int local29 = (arg7 << 8) + 255;
		@Pc(33) int[] local33 = Static169.anIntArrayArray25[arg12];
		@Pc(35) int[] local35 = null;
		@Pc(41) int[] local41 = new int[local33.length >> 1];
		@Pc(43) int local43;
		for (local43 = 0; local43 < local41.length; local43++) {
			local41[local43] = Static240.method3687(arg4, arg2, local11, arg9, local33[local43 + local43], arg0, local17, local23, arg3, 0.0F, arg5, arg1, false, local33[local43 + local43 + 1], null, local29, arg6);
		}
		if (arg8) {
			@Pc(194) int local194;
			if (arg12 == 1) {
				local35 = new int[6];
				local43 = Static240.method3687(arg4, arg2, local11, arg9, 64, arg0, local17, local23, arg3, 0.0F, arg5, arg1, true, 128, null, local29, arg6);
				local194 = Static240.method3687(arg4, arg2, local11, arg9, 128, arg0, local17, local23, arg3, 0.0F, arg5, arg1, true, 64, null, local29, arg6);
				local35[2] = local41[2];
				local35[5] = local41[2];
				local35[0] = local194;
				local35[3] = local43;
				local35[1] = local43;
				local35[4] = local41[0];
			} else if (arg12 == 2) {
				local35 = new int[6];
				local43 = Static240.method3687(arg4, arg2, local11, arg9, 128, arg0, local17, local23, arg3, 0.0F, arg5, arg1, true, 128, null, local29, arg6);
				local194 = Static240.method3687(arg4, arg2, local11, arg9, 64, arg0, local17, local23, arg3, 0.0F, arg5, arg1, true, 0, null, local29, arg6);
				local35[2] = local43;
				local35[1] = local194;
				local35[4] = local41[1];
				local35[0] = local41[0];
				local35[3] = local43;
				local35[5] = local41[0];
			} else if (arg12 == 3) {
				local35 = new int[6];
				local43 = Static240.method3687(arg4, arg2, local11, arg9, 0, arg0, local17, local23, arg3, 0.0F, arg5, arg1, true, 128, null, local29, arg6);
				local194 = Static240.method3687(arg4, arg2, local11, arg9, 64, arg0, local17, local23, arg3, 0.0F, arg5, arg1, true, 0, null, local29, arg6);
				local35[1] = local41[1];
				local35[4] = local194;
				local35[3] = local43;
				local35[0] = local41[2];
				local35[2] = local43;
				local35[5] = local41[2];
			} else if (arg12 == 4) {
				local43 = Static240.method3687(arg4, arg2, local11, arg9, 0, arg0, local17, local23, arg3, 0.0F, arg5, arg1, true, 128, null, local29, arg6);
				local35 = new int[] { local41[3], local43, local41[0] };
			} else if (arg12 == 5) {
				local35 = new int[3];
				local43 = Static240.method3687(arg4, arg2, local11, arg9, 128, arg0, local17, local23, arg3, 0.0F, arg5, arg1, true, 128, null, local29, arg6);
				local35[0] = local41[2];
				local35[1] = local43;
				local35[2] = local41[3];
			} else if (arg12 == 6) {
				local35 = new int[6];
				local43 = Static240.method3687(arg4, arg2, local11, arg9, 128, arg0, local17, local23, arg3, 0.0F, arg5, arg1, true, 0, null, local29, arg6);
				local194 = Static240.method3687(arg4, arg2, local11, arg9, 128, arg0, local17, local23, arg3, 0.0F, arg5, arg1, true, 128, null, local29, arg6);
				local35[2] = local194;
				local35[1] = local43;
				local35[0] = local41[3];
				local35[3] = local194;
				local35[4] = local41[0];
				local35[5] = local41[3];
			} else if (arg12 == 7) {
				local35 = new int[6];
				local43 = Static240.method3687(arg4, arg2, local11, arg9, 0, arg0, local17, local23, arg3, 0.0F, arg5, arg1, true, 128, null, local29, arg6);
				local194 = Static240.method3687(arg4, arg2, local11, arg9, 128, arg0, local17, local23, arg3, 0.0F, arg5, arg1, true, 0, null, local29, arg6);
				local35[3] = local43;
				local35[0] = local41[1];
				local35[2] = local43;
				local35[1] = local194;
				local35[5] = local41[1];
				local35[4] = local41[2];
			} else if (arg12 == 8) {
				local35 = new int[3];
				local43 = Static240.method3687(arg4, arg2, local11, arg9, 0, arg0, local17, local23, arg3, 0.0F, arg5, arg1, true, 0, null, local29, arg6);
				local35[1] = local43;
				local35[0] = local41[3];
				local35[2] = local41[4];
			} else if (arg12 == 9) {
				local35 = new int[15];
				local43 = Static240.method3687(arg4, arg2, local11, arg9, 128, arg0, local17, local23, arg3, 0.0F, arg5, arg1, true, 64, null, local29, arg6);
				local194 = Static240.method3687(arg4, arg2, local11, arg9, 96, arg0, local17, local23, arg3, 0.0F, arg5, arg1, true, 32, null, local29, arg6);
				@Pc(718) int local718 = Static240.method3687(arg4, arg2, local11, arg9, 64, arg0, local17, local23, arg3, 0.0F, arg5, arg1, true, 0, null, local29, arg6);
				local35[2] = local41[4];
				local35[4] = local41[4];
				local35[3] = local194;
				local35[12] = local194;
				local35[10] = local41[2];
				local35[9] = local194;
				local35[5] = local41[3];
				local35[14] = local718;
				local35[0] = local194;
				local35[7] = local41[3];
				local35[1] = local43;
				local35[13] = local41[1];
				local35[8] = local41[2];
				local35[11] = local41[1];
				local35[6] = local194;
			} else if (arg12 == 10) {
				local43 = Static240.method3687(arg4, arg2, local11, arg9, 0, arg0, local17, local23, arg3, 0.0F, arg5, arg1, true, 128, null, local29, arg6);
				local35 = new int[] { local41[2], local43, local41[3], local41[3], local43, local41[4], local41[4], local43, local41[0] };
			} else if (arg12 == 11) {
				local35 = new int[12];
				local43 = Static240.method3687(arg4, arg2, local11, arg9, 0, arg0, local17, local23, arg3, 0.0F, arg5, arg1, true, 64, null, local29, arg6);
				local194 = Static240.method3687(arg4, arg2, local11, arg9, 128, arg0, local17, local23, arg3, 0.0F, arg5, arg1, true, 64, null, local29, arg6);
				local35[11] = local194;
				local35[1] = local43;
				local35[7] = local194;
				local35[5] = local43;
				local35[8] = local43;
				local35[10] = local41[1];
				local35[0] = local41[3];
				local35[3] = local41[3];
				local35[2] = local41[0];
				local35[9] = local41[2];
				local35[6] = local41[2];
				local35[4] = local41[2];
			}
		}
		arg1.method4607(arg10, arg5, arg6, local41, local35, false);
	}
}
