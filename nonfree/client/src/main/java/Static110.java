import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!hk", name = "S", descriptor = "[I")
	public static int[] anIntArray185;

	@OriginalMember(owner = "client!hk", name = "ib", descriptor = "Lclient!fh;")
	public static Class58 aClass58_49;

	@OriginalMember(owner = "client!hk", name = "kb", descriptor = "Lclient!eo;")
	public static Class52 aClass52_5;

	@OriginalMember(owner = "client!hk", name = "ab", descriptor = "Lclient!wa;")
	public static Class4_Sub10_Sub1 aClass4_Sub10_Sub1_1 = new Class4_Sub10_Sub1(5000);

	@OriginalMember(owner = "client!hk", name = "eb", descriptor = "I")
	public static int anInt2232 = -1;

	@OriginalMember(owner = "client!hk", name = "hb", descriptor = "[Lclient!p;")
	public static Class53_Sub1_Sub2[] aClass53_Sub1_Sub2Array1 = new Class53_Sub1_Sub2[32768];

	@OriginalMember(owner = "client!hk", name = "jb", descriptor = "I")
	public static int anInt2235 = 0;

	@OriginalMember(owner = "client!hk", name = "lb", descriptor = "S")
	public static short aShort13 = 256;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZI)V")
	public static void method1774(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class4_Sub3_Sub9 local14 = Static43.method2329(6, arg1);
		local14.method1520();
		local14.anInt1993 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZ)V")
	public static void method1777(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			Static226.method425();
		} else if (arg0 == 2) {
			Static99.method1651();
		} else if (arg0 == 3) {
			Static281.method4349();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "(I)Lclient!gb;")
	public static Class63_Sub1 method1778() {
		return Static133.aClass63_Sub1Array2.length <= Static233.anInt3224 ? null : Static133.aClass63_Sub1Array2[Static233.anInt3224++];
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!em;[I[[FIILclient!pi;[[FI[[FI[[I)V")
	public static void method1779(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class137 arg5, @OriginalArg(6) float[][] arg6, @OriginalArg(8) float[][] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[][] arg9) {
		@Pc(11) int[] local11 = new int[arg1.length / 2];
		for (@Pc(20) int local20 = 0; local20 < local11.length; local20++) {
			@Pc(34) int local34 = arg1[local20 + local20];
			@Pc(42) int local42 = arg1[local20 + local20 + 1];
			@Pc(47) int local47;
			if (arg8 == 1) {
				local47 = local34;
				local34 = local42;
				local42 = 128 - local47;
			} else if (arg8 == 2) {
				local34 = 128 - local34;
				local42 = 128 - local42;
			} else if (arg8 == 3) {
				local47 = local34;
				local34 = 128 - local42;
				local42 = local47;
			}
			@Pc(125) float local125;
			@Pc(117) float local117;
			@Pc(109) float local109;
			if (local34 == 0 && local42 == 0) {
				local109 = arg6[arg4][arg3];
				local125 = arg7[arg4][arg3];
				local117 = arg2[arg4][arg3];
			} else if (local34 == 128 && local42 == 0) {
				local109 = arg6[arg4 + 1][arg3];
				local117 = arg2[arg4 + 1][arg3];
				local125 = arg7[arg4 + 1][arg3];
			} else if (local34 == 128 && local42 == 128) {
				local109 = arg6[arg4 + 1][arg3 + 1];
				local117 = arg2[arg4 + 1][arg3 + 1];
				local125 = arg7[arg4 + 1][arg3 + 1];
			} else if (local34 == 0 && local42 == 128) {
				local125 = arg7[arg4][arg3 + 1];
				local109 = arg6[arg4][arg3 + 1];
				local117 = arg2[arg4][arg3 + 1];
			} else {
				local125 = arg7[arg4][arg3];
				@Pc(156) float local156 = (float) local34 / 128.0F;
				local117 = arg2[arg4][arg3];
				@Pc(177) float local177 = local117 + (arg2[arg4 + 1][arg3] - local117) * local156;
				@Pc(192) float local192 = local125 + local156 * (arg7[arg4 + 1][arg3] - local125);
				local109 = arg6[arg4][arg3];
				@Pc(206) float local206 = arg2[arg4][arg3 + 1];
				@Pc(220) float local220 = local109 + (arg6[arg4 + 1][arg3] - local109) * local156;
				@Pc(225) float local225 = (float) local42 / 128.0F;
				@Pc(233) float local233 = arg7[arg4][arg3 + 1];
				@Pc(241) float local241 = arg6[arg4][arg3 + 1];
				@Pc(258) float local258 = local241 + (arg6[arg4 + 1][arg3 + 1] - local241) * local156;
				local109 = local220 + (local258 - local220) * local225;
				@Pc(283) float local283 = local233 + (arg7[arg4 + 1][arg3 + 1] - local233) * local156;
				@Pc(300) float local300 = local206 + local156 * (arg2[arg4 + 1][arg3 + 1] - local206);
				local117 = local177 + local225 * (local300 - local177);
				local125 = local192 + (local283 - local192) * local225;
			}
			@Pc(401) int local401 = local34 + (arg4 << 7);
			@Pc(407) int local407 = (arg3 << 7) + local42;
			@Pc(415) int local415 = Static13.method206(local34, arg4, local42, arg9, arg3);
			local11[local20] = arg5.method3448(arg0, local401, local415, local407, local109, local125, local117);
		}
		arg5.method3444(local11);
	}
}
