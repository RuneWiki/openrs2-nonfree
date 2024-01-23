import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!nj", name = "n", descriptor = "Lclient!vh;")
	public static Class187 aClass187_100 = new Class187(2);

	@OriginalMember(owner = "client!nj", name = "y", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray28 = new String[1000];

	@OriginalMember(owner = "client!nj", name = "z", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray29 = new String[100];

	@OriginalMember(owner = "client!nj", name = "A", descriptor = "Lclient!vh;")
	public static Class187 aClass187_101 = new Class187(50);

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZLclient!fg;B)V")
	public static void method3102(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub2_Sub6 arg1) {
		@Pc(6) int local6;
		if (Static156.aBoolean211 || arg0) {
			local6 = Static120.anInt2505;
			@Pc(12) int local12 = local6 * 956 / 503;
			Static141.aClass1_Sub2_Sub1_31.method3847((Static292.anInt5236 - local12) / 2, 0, local12, local6);
			Static97.aClass23_1.method3909(Static292.anInt5236 / 2 - Static97.aClass23_1.anInt4473 / 2, 18);
		}
		arg1.method4022(Static118.anInt2486 == 1 ? Static135.aString155 : Static234.aString240, Static292.anInt5236 / 2, Static120.anInt2505 / 2 - 26, 16777215, -1);
		local6 = Static120.anInt2505 / 2 - 18;
		if (Static156.aBoolean211) {
			Static119.method2135(Static292.anInt5236 / 2 - 152, local6, 304, 34, 9179409);
			Static119.method2135(Static292.anInt5236 / 2 - 151, local6 + 1, 302, 32, 0);
			Static119.method2129(Static292.anInt5236 / 2 - 150, local6 + 2, Static133.anInt2675 * 3, 30, 9179409);
			Static119.method2129(Static292.anInt5236 / 2 + Static133.anInt2675 * 3 - 150, local6 + 2, 300 - Static133.anInt2675 * 3, 30, 0);
		} else {
			Static25.method402(Static292.anInt5236 / 2 - 152, local6, 304, 34, 9179409);
			Static25.method402(Static292.anInt5236 / 2 - 151, local6 + 1, 302, 32, 0);
			Static25.method385(Static292.anInt5236 / 2 - 150, local6 + 2, Static133.anInt2675 * 3, 30, 9179409);
			Static25.method385(Static292.anInt5236 / 2 + Static133.anInt2675 * 3 - 150, local6 + 2, 300 - Static133.anInt2675 * 3, 30, 0);
		}
		arg1.method4022(Static258.aString279, Static292.anInt5236 / 2, Static120.anInt2505 / 2 + 4, 16777215, -1);
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)V")
	public static void method3105() {
		if (Static246.aString262.toLowerCase().indexOf("microsoft") != -1) {
			Static192.anIntArray303[188] = 71;
			Static192.anIntArray303[223] = 28;
			Static192.anIntArray303[186] = 57;
			Static192.anIntArray303[222] = 59;
			Static192.anIntArray303[189] = 26;
			Static192.anIntArray303[220] = 74;
			Static192.anIntArray303[219] = 42;
			Static192.anIntArray303[190] = 72;
			Static192.anIntArray303[192] = 58;
			Static192.anIntArray303[191] = 73;
			Static192.anIntArray303[221] = 43;
			Static192.anIntArray303[187] = 27;
			return;
		}
		Static192.anIntArray303[45] = 26;
		Static192.anIntArray303[92] = 74;
		Static192.anIntArray303[59] = 57;
		Static192.anIntArray303[91] = 42;
		Static192.anIntArray303[61] = 27;
		Static192.anIntArray303[44] = 71;
		if (Static246.aMethod1 == null) {
			Static192.anIntArray303[192] = 58;
			Static192.anIntArray303[222] = 59;
		} else {
			Static192.anIntArray303[520] = 59;
			Static192.anIntArray303[222] = 58;
			Static192.anIntArray303[192] = 28;
		}
		Static192.anIntArray303[93] = 43;
		Static192.anIntArray303[47] = 73;
		Static192.anIntArray303[46] = 72;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "([[FII[[F[[FI[IILclient!h;[[ILclient!cj;)V")
	public static void method3107(@OriginalArg(0) float[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[][] arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class61 arg7, @OriginalArg(9) int[][] arg8, @OriginalArg(10) Class26 arg9) {
		@Pc(11) int[] local11 = new int[arg5.length / 2];
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			@Pc(24) int local24 = arg5[local13 + local13];
			@Pc(32) int local32 = arg5[local13 + local13 + 1];
			@Pc(45) int local45;
			if (arg6 == 1) {
				local45 = local24;
				local24 = local32;
				local32 = 128 - local45;
			} else if (arg6 == 2) {
				local32 = 128 - local32;
				local24 = 128 - local24;
			} else if (arg6 == 3) {
				local45 = local24;
				local24 = 128 - local32;
				local32 = local45;
			}
			@Pc(96) float local96;
			@Pc(104) float local104;
			@Pc(112) float local112;
			if (local24 == 0 && local32 == 0) {
				local96 = arg3[arg2][arg1];
				local112 = arg4[arg2][arg1];
				local104 = arg0[arg2][arg1];
			} else if (local24 == 128 && local32 == 0) {
				local96 = arg3[arg2 + 1][arg1];
				local104 = arg0[arg2 + 1][arg1];
				local112 = arg4[arg2 + 1][arg1];
			} else if (local24 == 128 && local32 == 128) {
				local112 = arg4[arg2 + 1][arg1 + 1];
				local104 = arg0[arg2 + 1][arg1 + 1];
				local96 = arg3[arg2 + 1][arg1 + 1];
			} else if (local24 == 0 && local32 == 128) {
				local112 = arg4[arg2][arg1 + 1];
				local104 = arg0[arg2][arg1 + 1];
				local96 = arg3[arg2][arg1 + 1];
			} else {
				local104 = arg0[arg2][arg1];
				local112 = arg4[arg2][arg1];
				local96 = arg3[arg2][arg1];
				@Pc(209) float local209 = (float) local24 / 128.0F;
				@Pc(224) float local224 = local96 + (arg3[arg2 + 1][arg1] - local96) * local209;
				@Pc(238) float local238 = local104 + local209 * (arg0[arg2 + 1][arg1] - local104);
				@Pc(243) float local243 = (float) local32 / 128.0F;
				@Pc(251) float local251 = arg3[arg2][arg1 + 1];
				@Pc(259) float local259 = arg0[arg2][arg1 + 1];
				@Pc(276) float local276 = local259 + local209 * (arg0[arg2 + 1][arg1 + 1] - local259);
				local104 = local238 + (local276 - local238) * local243;
				@Pc(302) float local302 = local251 + (arg3[arg2 + 1][arg1 + 1] - local251) * local209;
				@Pc(317) float local317 = local112 + local209 * (arg4[arg2 + 1][arg1] - local112);
				local96 = local224 + local243 * (local302 - local224);
				@Pc(333) float local333 = arg4[arg2][arg1 + 1];
				@Pc(350) float local350 = local333 + local209 * (arg4[arg2 + 1][arg1 + 1] - local333);
				local112 = local317 + (local350 - local317) * local243;
			}
			@Pc(384) int local384 = local24 + (arg2 << 7);
			@Pc(390) int local390 = (arg1 << 7) + local32;
			@Pc(398) int local398 = Static261.method4116(arg2, arg1, local24, arg8, local32);
			local11[local13] = arg9.method593(arg7, local384, local398, local390, local112, local96, local104);
		}
		arg9.method595(local11);
	}
}
