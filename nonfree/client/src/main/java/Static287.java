import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!wb", name = "jb", descriptor = "[I")
	public static int[] anIntArray512;

	@OriginalMember(owner = "client!wb", name = "nb", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray35;

	@OriginalMember(owner = "client!wb", name = "ib", descriptor = "I")
	public static int anInt5948 = 0;

	@OriginalMember(owner = "client!wb", name = "ob", descriptor = "I")
	public static int anInt5952 = 0;

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "(I)V")
	public static void method4763() {
		Static195.anInt4050 = 0;
		Static115.anInt2459 = -1;
		Static47.aBoolean83 = false;
		Static10.anInt280 = 0;
		Static44.anInt1071 = 0;
		Static91.anInt2032 = 1;
		Static231.anInt4770 = -3;
	}

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "(I)V")
	public static void method4764() {
		Static56.aClass79_8.method1999();
		Static8.aClass144_1.method3668();
		Static99.aClass144_5.method3668();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[[FFILclient!fn;[[FIZIII[[IIII[[FI[[I)I")
	public static int method4765(@OriginalArg(0) int arg0, @OriginalArg(1) float[][] arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub12 arg4, @OriginalArg(5) float[][] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[][] arg11, @OriginalArg(12) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) float[][] arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int[][] arg16) {
		@Pc(12) int local12;
		if (arg12 == 1) {
			local12 = arg3;
			arg3 = arg13;
			arg13 = 128 - local12;
		} else if (arg12 == 2) {
			arg13 = 128 - arg13;
			arg3 = 128 - arg3;
		} else if (arg12 == 3) {
			local12 = arg3;
			arg3 = 128 - arg13;
			arg13 = local12;
		}
		@Pc(108) float local108;
		@Pc(90) float local90;
		@Pc(92) int local92;
		@Pc(100) float local100;
		if (arg3 == 0 && arg13 == 0) {
			local90 = arg5[arg10][arg6];
			local100 = arg1[arg10][arg6];
			local108 = arg14[arg10][arg6];
			local92 = arg0;
		} else if (arg3 == 128 && arg13 == 0) {
			local108 = arg14[arg10 + 1][arg6];
			local92 = arg8;
			local90 = arg5[arg10 + 1][arg6];
			local100 = arg1[arg10 + 1][arg6];
		} else if (arg3 == 128 && arg13 == 128) {
			local100 = arg1[arg10 + 1][arg6 + 1];
			local108 = arg14[arg10 + 1][arg6 + 1];
			local92 = arg9;
			local90 = arg5[arg10 + 1][arg6 + 1];
		} else if (arg3 == 0 && arg13 == 128) {
			local90 = arg5[arg10][arg6 + 1];
			local92 = arg15;
			local100 = arg1[arg10][arg6 + 1];
			local108 = arg14[arg10][arg6 + 1];
		} else {
			@Pc(115) float local115 = (float) arg3 / 128.0F;
			local100 = arg1[arg10][arg6];
			@Pc(136) float local136 = local100 + (arg1[arg10 + 1][arg6] - local100) * local115;
			local90 = arg5[arg10][arg6];
			local108 = arg14[arg10][arg6];
			@Pc(162) float local162 = local108 + local115 * (arg14[arg10 + 1][arg6] - local108);
			@Pc(176) float local176 = local90 + local115 * (arg5[arg10 + 1][arg6] - local90);
			@Pc(184) float local184 = arg14[arg10][arg6 + 1];
			@Pc(201) float local201 = local184 + local115 * (arg14[arg10 + 1][arg6 + 1] - local184);
			@Pc(209) float local209 = arg5[arg10][arg6 + 1];
			@Pc(217) float local217 = arg1[arg10][arg6 + 1];
			@Pc(234) float local234 = local217 + (arg1[arg10 + 1][arg6 + 1] - local217) * local115;
			@Pc(239) float local239 = (float) arg13 / 128.0F;
			@Pc(255) float local255 = local209 + (arg5[arg10 + 1][arg6 + 1] - local209) * local115;
			local100 = local136 + (local234 - local136) * local239;
			local108 = local162 + local239 * (local201 - local162);
			@Pc(279) int local279 = Static125.method4631(arg8, arg0, arg3);
			@Pc(285) int local285 = Static125.method4631(arg9, arg15, arg3);
			local90 = local176 + (local255 - local176) * local239;
			local92 = Static125.method4631(local285, local279, arg13);
		}
		@Pc(391) int local391 = (arg10 << 7) + arg3;
		@Pc(397) int local397 = arg13 + (arg6 << 7);
		@Pc(412) int local412 = Static17.method362(arg16, arg3, arg10, arg13, arg6);
		return arg4.method1402(local391, local412, local397, local100, local108, local90, arg7 ? local92 & 0xFFFFFF00 : local92, arg11 == null ? 0.0F : (float) (local412 - Static17.method362(arg11, arg3, arg10, arg13, arg6)) / arg2);
	}
}
