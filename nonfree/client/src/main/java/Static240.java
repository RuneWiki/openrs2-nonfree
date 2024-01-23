import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "Lclient!qb;")
	public static Class142 aClass142_22;

	@OriginalMember(owner = "client!rb", name = "n", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray34 = new String[] { "en", "de", "fr", "pt" };

	@OriginalMember(owner = "client!rb", name = "y", descriptor = "[Lclient!tf;")
	public static Class169[] aClass169Array1 = new Class169[50];

	@OriginalMember(owner = "client!rb", name = "z", descriptor = "[Lclient!ne;")
	public static Class118[] aClass118Array1 = new Class118[4];

	@OriginalMember(owner = "client!rb", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString248 = "Checking for updates - ";

	@OriginalMember(owner = "client!rb", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString249 = "Loaded interfaces";

	@OriginalMember(owner = "client!rb", name = "O", descriptor = "I")
	public static int anInt4354 = 0;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZ)V")
	public static void method3686(@OriginalArg(0) int arg0) {
		Static72.anIntArray471 = new int[arg0];
		Static236.anIntArray367 = new int[arg0];
		Static179.anIntArray292 = new int[arg0];
		Static272.anIntArray506 = new int[arg0];
		Static7.anIntArray6 = new int[arg0];
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "([[FII[[FI[[IBII[[FFILclient!wb;ZI[[III)I")
	public static int method3687(@OriginalArg(0) float[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float[][] arg8, @OriginalArg(10) float arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class1_Sub31 arg11, @OriginalArg(13) boolean arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int[][] arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16) {
		@Pc(31) int local31;
		if (arg1 == 1) {
			local31 = arg4;
			arg4 = arg13;
			arg13 = 128 - local31;
		} else if (arg1 == 2) {
			arg4 = 128 - arg4;
			arg13 = 128 - arg13;
		} else if (arg1 == 3) {
			local31 = arg4;
			arg4 = 128 - arg13;
			arg13 = local31;
		}
		@Pc(88) float local88;
		@Pc(98) float local98;
		@Pc(110) int local110;
		@Pc(108) float local108;
		if (arg4 == 0 && arg13 == 0) {
			local108 = arg3[arg10][arg16];
			local98 = arg8[arg10][arg16];
			local88 = arg0[arg10][arg16];
			local110 = arg2;
		} else if (arg4 == 128 && arg13 == 0) {
			local88 = arg0[arg10 + 1][arg16];
			local110 = arg6;
			local98 = arg8[arg10 + 1][arg16];
			local108 = arg3[arg10 + 1][arg16];
		} else if (arg4 == 128 && arg13 == 128) {
			local88 = arg0[arg10 + 1][arg16 + 1];
			local98 = arg8[arg10 + 1][arg16 + 1];
			local108 = arg3[arg10 + 1][arg16 + 1];
			local110 = arg7;
		} else if (arg4 == 0 && arg13 == 128) {
			local108 = arg3[arg10][arg16 + 1];
			local98 = arg8[arg10][arg16 + 1];
			local88 = arg0[arg10][arg16 + 1];
			local110 = arg15;
		} else {
			local108 = arg3[arg10][arg16];
			local88 = arg0[arg10][arg16];
			local98 = arg8[arg10][arg16];
			@Pc(143) float local143 = (float) arg4 / 128.0F;
			@Pc(157) float local157 = local108 + local143 * (arg3[arg10 + 1][arg16] - local108);
			@Pc(172) float local172 = local98 + local143 * (arg8[arg10 + 1][arg16] - local98);
			@Pc(177) float local177 = (float) arg13 / 128.0F;
			@Pc(185) float local185 = arg3[arg10][arg16 + 1];
			@Pc(201) float local201 = local185 + local143 * (arg3[arg10 + 1][arg16 + 1] - local185);
			local108 = local157 + local177 * (local201 - local157);
			@Pc(225) float local225 = local88 + (arg0[arg10 + 1][arg16] - local88) * local143;
			@Pc(233) float local233 = arg0[arg10][arg16 + 1];
			@Pc(241) float local241 = arg8[arg10][arg16 + 1];
			@Pc(258) float local258 = local241 + local143 * (arg8[arg10 + 1][arg16 + 1] - local241);
			@Pc(275) float local275 = local233 + local143 * (arg0[arg10 + 1][arg16 + 1] - local233);
			local88 = local225 + local177 * (local275 - local225);
			@Pc(290) int local290 = Static256.method4055(arg4, arg2, arg6);
			local98 = local172 + (local258 - local172) * local177;
			@Pc(305) int local305 = Static256.method4055(arg4, arg15, arg7);
			local110 = Static256.method4055(arg13, local290, local305);
		}
		@Pc(395) int local395 = arg4 + (arg10 << 7);
		@Pc(401) int local401 = arg13 + (arg16 << 7);
		@Pc(409) int local409 = Static261.method4116(arg10, arg16, arg4, arg5, arg13);
		return arg11.method4601(local395, local409, local401, local108, local88, local98, arg12 ? local110 & 0xFFFFFF00 : local110, arg14 == null ? 0.0F : (float) (local409 - Static261.method4116(arg10, arg16, arg4, arg14, arg13)) / arg9);
	}
}
