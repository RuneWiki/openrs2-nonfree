import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!nk", name = "T", descriptor = "I")
	public static int anInt4285;

	@OriginalMember(owner = "client!nk", name = "P", descriptor = "F")
	public static float aFloat83 = 0.0F;

	@OriginalMember(owner = "client!nk", name = "S", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray55 = new String[100];

	@OriginalMember(owner = "client!nk", name = "U", descriptor = "[[I")
	public static final int[][] anIntArrayArray71 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "([J[II)V")
	public static void method3855(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1) {
		Static218.method3937(arg0.length - 1, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIII)I")
	public static int method3856(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg3 & 0x1) == 1) {
			@Pc(10) int local10 = arg5;
			arg5 = arg4;
			arg4 = local10;
		}
		@Pc(18) int local18 = arg0 & 0x3;
		if (local18 == 0) {
			return arg2;
		} else if (local18 == 1) {
			return arg1;
		} else if (local18 == 2) {
			return 7 + 1 - arg2 - arg5;
		} else {
			return 7 + 1 - arg1 - arg4;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method3857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static346.anIntArrayArrayArray13[arg0][local16][local20] == -Static238.anInt4659) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(142) int local142 = (arg3 << 7) + 2;
			@Pc(151) int local151 = Static158.aClass114Array2[arg0].method3610(arg1, arg3) + arg5;
			if (!Static2.method106(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << 7) - 1;
			if (!Static2.method106(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << 7) - 1;
			if (!Static2.method106(local20, local151, local177)) {
				return false;
			} else if (Static2.method106(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static124.method2601(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static2.method106(local16 + 1, Static158.aClass114Array2[arg0].method3610(arg1, arg3) + arg5, local20 + 1) && Static2.method106(local16 + 128 - 1, Static158.aClass114Array2[arg0].method3610(arg1 + 1, arg3) + arg5, local20 + 1) && Static2.method106(local16 + 128 - 1, Static158.aClass114Array2[arg0].method3610(arg1 + 1, arg3 + 1) + arg5, local20 + 128 - 1) && Static2.method106(local16 + 1, Static158.aClass114Array2[arg0].method3610(arg1, arg3 + 1) + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "(I)V")
	public static void method3858() {
		for (@Pc(6) Class14_Sub27 local6 = (Class14_Sub27) Static198.aClass25_20.method697(); local6 != null; local6 = (Class14_Sub27) Static198.aClass25_20.method694()) {
			@Pc(16) int local16 = local6.anInt5186;
			if (Static126.method2624(local16)) {
				@Pc(22) boolean local22 = true;
				@Pc(26) Class146[] local26 = Static182.aClass146ArrayArray1[local16];
				for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
					if (local26[local28] != null) {
						local22 = local26[local28].aBoolean260;
						break;
					}
				}
				if (!local22) {
					@Pc(56) int local56 = (int) local6.aLong217;
					@Pc(60) Class146 local60 = Static273.method4632(local56);
					if (local60 != null) {
						Static166.method3295(local60);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(III)B")
	public static byte method3859(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
