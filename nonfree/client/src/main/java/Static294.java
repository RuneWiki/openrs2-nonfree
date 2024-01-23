import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!wi", name = "t", descriptor = "F")
	public static float aFloat57;

	@OriginalMember(owner = "client!wi", name = "K", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!wi", name = "N", descriptor = "Lclient!jd;")
	public static Class84 aClass84_132;

	@OriginalMember(owner = "client!wi", name = "A", descriptor = "I")
	public static int anInt6108 = 0;

	@OriginalMember(owner = "client!wi", name = "I", descriptor = "[Lclient!wm;")
	public static Class2_Sub26[] aClass2_Sub26Array1 = new Class2_Sub26[2048];

	@OriginalMember(owner = "client!wi", name = "T", descriptor = "[I")
	public static int[] anIntArray521 = new int[5];

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIZLclient!jd;)[Lclient!hk;")
	public static Class71_Sub1[] method4871(@OriginalArg(0) int arg0, @OriginalArg(3) Class84 arg1) {
		return Static288.method4789(0, arg0, arg1) ? Static214.method3629() : null;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!mn;IZ)Ljava/lang/String;")
	public static String method4873(@OriginalArg(0) Class115 arg0, @OriginalArg(1) int arg1) {
		if (!Static35.method708(arg0).method1315(arg1) && arg0.anObjectArray18 == null) {
			return null;
		} else if (arg0.aStringArray17 == null || arg0.aStringArray17.length <= arg1 || arg0.aStringArray17[arg1] == null || arg0.aStringArray17[arg1].trim().length() == 0) {
			return Static202.aBoolean348 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray17[arg1];
		}
	}

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "(B)I")
	public static int method4875() {
		return 15;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!fn;[[FII[[FIBBIZ[[FI[[IIII)V")
	public static void method4876(@OriginalArg(0) Class2_Sub12 arg0, @OriginalArg(1) float[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) float[][] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int[][] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		@Pc(7) int local7 = (arg5 << 8) + 255;
		@Pc(13) int local13 = (arg14 << 8) + 255;
		@Pc(21) int[] local21 = Static96.anIntArrayArray21[arg6];
		@Pc(27) int local27 = (arg2 << 8) + 255;
		@Pc(43) int[] local43 = new int[local21.length >> 1];
		@Pc(45) int[] local45 = null;
		@Pc(51) int local51 = (arg11 << 8) + 255;
		@Pc(53) int local53;
		for (local53 = 0; local53 < local43.length; local53++) {
			local43[local53] = Static287.method4765(local7, arg10, 0.0F, local21[local53 + local53], arg0, arg1, arg13, false, local27, local13, arg8, null, arg7, local21[local53 + local53 + 1], arg4, local51, arg12);
		}
		if (arg9) {
			@Pc(206) int local206;
			if (arg6 == 1) {
				local53 = Static287.method4765(local7, arg10, 0.0F, 64, arg0, arg1, arg13, true, local27, local13, arg8, null, arg7, 128, arg4, local51, arg12);
				local206 = Static287.method4765(local7, arg10, 0.0F, 128, arg0, arg1, arg13, true, local27, local13, arg8, null, arg7, 64, arg4, local51, arg12);
				local45 = new int[] { local206, local53, local43[2], local53, local43[0], local43[2] };
			} else if (arg6 == 2) {
				local53 = Static287.method4765(local7, arg10, 0.0F, 128, arg0, arg1, arg13, true, local27, local13, arg8, null, arg7, 128, arg4, local51, arg12);
				local206 = Static287.method4765(local7, arg10, 0.0F, 64, arg0, arg1, arg13, true, local27, local13, arg8, null, arg7, 0, arg4, local51, arg12);
				local45 = new int[] { local43[0], local206, local53, local53, local43[1], local43[0] };
			} else if (arg6 == 3) {
				local45 = new int[6];
				local53 = Static287.method4765(local7, arg10, 0.0F, 0, arg0, arg1, arg13, true, local27, local13, arg8, null, arg7, 128, arg4, local51, arg12);
				local206 = Static287.method4765(local7, arg10, 0.0F, 64, arg0, arg1, arg13, true, local27, local13, arg8, null, arg7, 0, arg4, local51, arg12);
				local45[3] = local53;
				local45[0] = local43[2];
				local45[4] = local206;
				local45[1] = local43[1];
				local45[2] = local53;
				local45[5] = local43[2];
			} else if (arg6 == 4) {
				local45 = new int[3];
				local53 = Static287.method4765(local7, arg10, 0.0F, 0, arg0, arg1, arg13, true, local27, local13, arg8, null, arg7, 128, arg4, local51, arg12);
				local45[1] = local53;
				local45[0] = local43[3];
				local45[2] = local43[0];
			} else if (arg6 == 5) {
				local45 = new int[3];
				local53 = Static287.method4765(local7, arg10, 0.0F, 128, arg0, arg1, arg13, true, local27, local13, arg8, null, arg7, 128, arg4, local51, arg12);
				local45[1] = local53;
				local45[0] = local43[2];
				local45[2] = local43[3];
			} else if (arg6 == 6) {
				local45 = new int[6];
				local53 = Static287.method4765(local7, arg10, 0.0F, 128, arg0, arg1, arg13, true, local27, local13, arg8, null, arg7, 0, arg4, local51, arg12);
				local206 = Static287.method4765(local7, arg10, 0.0F, 128, arg0, arg1, arg13, true, local27, local13, arg8, null, arg7, 128, arg4, local51, arg12);
				local45[1] = local53;
				local45[0] = local43[3];
				local45[3] = local206;
				local45[5] = local43[3];
				local45[4] = local43[0];
				local45[2] = local206;
			} else if (arg6 == 7) {
				local53 = Static287.method4765(local7, arg10, 0.0F, 0, arg0, arg1, arg13, true, local27, local13, arg8, null, arg7, 128, arg4, local51, arg12);
				local45 = new int[6];
				local206 = Static287.method4765(local7, arg10, 0.0F, 128, arg0, arg1, arg13, true, local27, local13, arg8, null, arg7, 0, arg4, local51, arg12);
				local45[0] = local43[1];
				local45[3] = local53;
				local45[2] = local53;
				local45[4] = local43[2];
				local45[1] = local206;
				local45[5] = local43[1];
			} else if (arg6 == 8) {
				local45 = new int[3];
				local53 = Static287.method4765(local7, arg10, 0.0F, 0, arg0, arg1, arg13, true, local27, local13, arg8, null, arg7, 0, arg4, local51, arg12);
				local45[2] = local43[4];
				local45[0] = local43[3];
				local45[1] = local53;
			} else if (arg6 == 9) {
				local45 = new int[15];
				local53 = Static287.method4765(local7, arg10, 0.0F, 128, arg0, arg1, arg13, true, local27, local13, arg8, null, arg7, 64, arg4, local51, arg12);
				local206 = Static287.method4765(local7, arg10, 0.0F, 96, arg0, arg1, arg13, true, local27, local13, arg8, null, arg7, 32, arg4, local51, arg12);
				@Pc(735) int local735 = Static287.method4765(local7, arg10, 0.0F, 64, arg0, arg1, arg13, true, local27, local13, arg8, null, arg7, 0, arg4, local51, arg12);
				local45[14] = local735;
				local45[9] = local206;
				local45[3] = local206;
				local45[1] = local53;
				local45[2] = local43[4];
				local45[8] = local43[2];
				local45[4] = local43[4];
				local45[10] = local43[2];
				local45[0] = local206;
				local45[13] = local43[1];
				local45[7] = local43[3];
				local45[6] = local206;
				local45[12] = local206;
				local45[5] = local43[3];
				local45[11] = local43[1];
			} else if (arg6 == 10) {
				local45 = new int[9];
				local53 = Static287.method4765(local7, arg10, 0.0F, 0, arg0, arg1, arg13, true, local27, local13, arg8, null, arg7, 128, arg4, local51, arg12);
				local45[0] = local43[2];
				local45[7] = local53;
				local45[4] = local53;
				local45[5] = local43[4];
				local45[2] = local43[3];
				local45[1] = local53;
				local45[8] = local43[0];
				local45[3] = local43[3];
				local45[6] = local43[4];
			} else if (arg6 == 11) {
				local45 = new int[12];
				local53 = Static287.method4765(local7, arg10, 0.0F, 0, arg0, arg1, arg13, true, local27, local13, arg8, null, arg7, 64, arg4, local51, arg12);
				local206 = Static287.method4765(local7, arg10, 0.0F, 128, arg0, arg1, arg13, true, local27, local13, arg8, null, arg7, 64, arg4, local51, arg12);
				local45[8] = local53;
				local45[7] = local206;
				local45[1] = local53;
				local45[0] = local43[3];
				local45[11] = local206;
				local45[3] = local43[3];
				local45[2] = local43[0];
				local45[4] = local43[2];
				local45[6] = local43[2];
				local45[9] = local43[2];
				local45[10] = local43[1];
				local45[5] = local53;
			}
		}
		arg0.method1400(arg3, arg8, arg13, local43, local45, false);
	}
}
