import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
	public static int anInt5905;

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "Lclient!en;")
	public static Class47 aClass47_7;

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
	public static int anInt5906;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
	public static int anInt5899 = -1;

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "Lclient!ta;")
	public static Class162 aClass162_9 = new Class162(64);

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray46 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "[I")
	public static int[] anIntArray530 = new int[2500];

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BII[[FZBI[[II[[FIIILclient!ua;B[[F)V")
	public static void method4533(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float[][] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class1_Sub28 arg12, @OriginalArg(14) byte arg13, @OriginalArg(15) float[][] arg14) {
		@Pc(18) int local18 = (arg9 << 8) + 255;
		@Pc(24) int local24 = (arg2 << 8) + 255;
		@Pc(30) int local30 = (arg5 << 8) + 255;
		@Pc(36) int local36 = (arg10 << 8) + 255;
		@Pc(38) int[] local38 = null;
		@Pc(42) int[] local42 = Static162.anIntArrayArray41[arg13];
		@Pc(48) int[] local48 = new int[local42.length >> 1];
		@Pc(50) int local50;
		for (local50 = 0; local50 < local48.length; local50++) {
			local48[local50] = Static292.method4469(arg3, arg12, local18, arg14, local30, arg8, local42[local50 + local50], arg11, local36, arg0, 0.0F, false, null, local42[local50 + local50 + 1], local24, arg1, arg6);
		}
		if (arg4) {
			@Pc(196) int local196;
			if (arg13 == 1) {
				local38 = new int[6];
				local50 = Static292.method4469(arg3, arg12, local18, arg14, local30, arg8, 64, arg11, local36, arg0, 0.0F, true, null, 128, local24, arg1, arg6);
				local196 = Static292.method4469(arg3, arg12, local18, arg14, local30, arg8, 128, arg11, local36, arg0, 0.0F, true, null, 64, local24, arg1, arg6);
				local38[2] = local48[2];
				local38[5] = local48[2];
				local38[3] = local50;
				local38[0] = local196;
				local38[1] = local50;
				local38[4] = local48[0];
			} else if (arg13 == 2) {
				local38 = new int[6];
				local50 = Static292.method4469(arg3, arg12, local18, arg14, local30, arg8, 128, arg11, local36, arg0, 0.0F, true, null, 128, local24, arg1, arg6);
				local196 = Static292.method4469(arg3, arg12, local18, arg14, local30, arg8, 64, arg11, local36, arg0, 0.0F, true, null, 0, local24, arg1, arg6);
				local38[3] = local50;
				local38[0] = local48[0];
				local38[1] = local196;
				local38[5] = local48[0];
				local38[4] = local48[1];
				local38[2] = local50;
			} else if (arg13 == 3) {
				local38 = new int[6];
				local50 = Static292.method4469(arg3, arg12, local18, arg14, local30, arg8, 0, arg11, local36, arg0, 0.0F, true, null, 128, local24, arg1, arg6);
				local196 = Static292.method4469(arg3, arg12, local18, arg14, local30, arg8, 64, arg11, local36, arg0, 0.0F, true, null, 0, local24, arg1, arg6);
				local38[4] = local196;
				local38[0] = local48[2];
				local38[1] = local48[1];
				local38[2] = local50;
				local38[3] = local50;
				local38[5] = local48[2];
			} else if (arg13 == 4) {
				local38 = new int[3];
				local50 = Static292.method4469(arg3, arg12, local18, arg14, local30, arg8, 0, arg11, local36, arg0, 0.0F, true, null, 128, local24, arg1, arg6);
				local38[0] = local48[3];
				local38[2] = local48[0];
				local38[1] = local50;
			} else if (arg13 == 5) {
				local38 = new int[3];
				local50 = Static292.method4469(arg3, arg12, local18, arg14, local30, arg8, 128, arg11, local36, arg0, 0.0F, true, null, 128, local24, arg1, arg6);
				local38[0] = local48[2];
				local38[1] = local50;
				local38[2] = local48[3];
			} else if (arg13 == 6) {
				local50 = Static292.method4469(arg3, arg12, local18, arg14, local30, arg8, 128, arg11, local36, arg0, 0.0F, true, null, 0, local24, arg1, arg6);
				local196 = Static292.method4469(arg3, arg12, local18, arg14, local30, arg8, 128, arg11, local36, arg0, 0.0F, true, null, 128, local24, arg1, arg6);
				local38 = new int[] { local48[3], local50, local196, local196, local48[0], local48[3] };
			} else if (arg13 == 7) {
				local38 = new int[6];
				local50 = Static292.method4469(arg3, arg12, local18, arg14, local30, arg8, 0, arg11, local36, arg0, 0.0F, true, null, 128, local24, arg1, arg6);
				local196 = Static292.method4469(arg3, arg12, local18, arg14, local30, arg8, 128, arg11, local36, arg0, 0.0F, true, null, 0, local24, arg1, arg6);
				local38[3] = local50;
				local38[0] = local48[1];
				local38[1] = local196;
				local38[5] = local48[1];
				local38[2] = local50;
				local38[4] = local48[2];
			} else if (arg13 == 8) {
				local38 = new int[3];
				local50 = Static292.method4469(arg3, arg12, local18, arg14, local30, arg8, 0, arg11, local36, arg0, 0.0F, true, null, 0, local24, arg1, arg6);
				local38[2] = local48[4];
				local38[0] = local48[3];
				local38[1] = local50;
			} else if (arg13 == 9) {
				local38 = new int[15];
				local50 = Static292.method4469(arg3, arg12, local18, arg14, local30, arg8, 128, arg11, local36, arg0, 0.0F, true, null, 64, local24, arg1, arg6);
				local196 = Static292.method4469(arg3, arg12, local18, arg14, local30, arg8, 96, arg11, local36, arg0, 0.0F, true, null, 32, local24, arg1, arg6);
				@Pc(720) int local720 = Static292.method4469(arg3, arg12, local18, arg14, local30, arg8, 64, arg11, local36, arg0, 0.0F, true, null, 0, local24, arg1, arg6);
				local38[0] = local196;
				local38[1] = local50;
				local38[6] = local196;
				local38[11] = local48[1];
				local38[2] = local48[4];
				local38[12] = local196;
				local38[14] = local720;
				local38[9] = local196;
				local38[4] = local48[4];
				local38[13] = local48[1];
				local38[10] = local48[2];
				local38[8] = local48[2];
				local38[3] = local196;
				local38[7] = local48[3];
				local38[5] = local48[3];
			} else if (arg13 == 10) {
				local38 = new int[9];
				local50 = Static292.method4469(arg3, arg12, local18, arg14, local30, arg8, 0, arg11, local36, arg0, 0.0F, true, null, 128, local24, arg1, arg6);
				local38[0] = local48[2];
				local38[8] = local48[0];
				local38[1] = local50;
				local38[7] = local50;
				local38[2] = local48[3];
				local38[3] = local48[3];
				local38[4] = local50;
				local38[5] = local48[4];
				local38[6] = local48[4];
			} else if (arg13 == 11) {
				local38 = new int[12];
				local50 = Static292.method4469(arg3, arg12, local18, arg14, local30, arg8, 0, arg11, local36, arg0, 0.0F, true, null, 64, local24, arg1, arg6);
				local196 = Static292.method4469(arg3, arg12, local18, arg14, local30, arg8, 128, arg11, local36, arg0, 0.0F, true, null, 64, local24, arg1, arg6);
				local38[7] = local196;
				local38[11] = local196;
				local38[0] = local48[3];
				local38[5] = local50;
				local38[2] = local48[0];
				local38[9] = local48[2];
				local38[4] = local48[2];
				local38[3] = local48[3];
				local38[1] = local50;
				local38[10] = local48[1];
				local38[6] = local48[2];
				local38[8] = local50;
			}
		}
		arg12.method4174(arg7, arg1, arg11, local48, local38, false);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI)[B")
	public static byte[] method4534(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub3_Sub18 local12 = (Class1_Sub3_Sub18) Static24.aClass162_1.method4003((long) arg0);
		if (local12 == null) {
			@Pc(24) byte[] local24 = new byte[512];
			@Pc(30) Random local30 = new Random((long) arg0);
			@Pc(32) int local32;
			for (local32 = 0; local32 < 255; local32++) {
				local24[local32] = (byte) local32;
			}
			for (local32 = 0; local32 < 255; local32++) {
				@Pc(56) int local56 = 255 - local32;
				@Pc(61) int local61 = Static207.method3275(local56, local30);
				@Pc(65) byte local65 = local24[local61];
				local24[local61] = local24[local56];
				local24[local56] = local24[511 - local32] = local65;
			}
			local12 = new Class1_Sub3_Sub18(local24);
			Static24.aClass162_1.method4005(local12, (long) arg0);
		}
		return local12.aByteArray62;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg5 + arg6;
		@Pc(14) int local14 = arg1 - arg6;
		@Pc(18) int local18 = arg4 - arg6;
		@Pc(22) int local22 = arg6 + arg3;
		@Pc(24) int local24;
		for (local24 = arg3; local24 < local22; local24++) {
			Static98.method3942(arg4, Static121.anIntArrayArray33[local24], arg2, arg5);
		}
		for (local24 = arg1; local24 > local14; local24--) {
			Static98.method3942(arg4, Static121.anIntArrayArray33[local24], arg2, arg5);
		}
		for (local24 = local22; local24 <= local14; local24++) {
			@Pc(73) int[] local73 = Static121.anIntArrayArray33[local24];
			Static98.method3942(local9, local73, arg2, arg5);
			Static98.method3942(local18, local73, arg0, local9);
			Static98.method3942(arg4, local73, arg2, local18);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)I")
	public static int method4536() {
		return Static18.anInt505;
	}
}
