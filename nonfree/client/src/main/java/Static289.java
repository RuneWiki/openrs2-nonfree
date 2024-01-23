import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!un", name = "H", descriptor = "Lclient!ah;")
	public static Class6 aClass6_8;

	@OriginalMember(owner = "client!un", name = "J", descriptor = "I")
	public static int anInt5257;

	@OriginalMember(owner = "client!un", name = "o", descriptor = "[I")
	public static int[] anIntArray574 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!un", name = "r", descriptor = "I")
	public static int anInt5245 = 100;

	@OriginalMember(owner = "client!un", name = "s", descriptor = "[I")
	public static int[] anIntArray575 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

	@OriginalMember(owner = "client!un", name = "w", descriptor = "Lclient!mi;")
	public static Class112 aClass112_12 = new Class112(64);

	@OriginalMember(owner = "client!un", name = "y", descriptor = "I")
	public static int anInt5250 = 0;

	@OriginalMember(owner = "client!un", name = "z", descriptor = "I")
	public static int anInt5251 = -1;

	@OriginalMember(owner = "client!un", name = "M", descriptor = "I")
	public static int anInt5260 = -1;

	@OriginalMember(owner = "client!un", name = "N", descriptor = "[I")
	public static int[] anIntArray576 = new int[14];

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I[[FZLclient!jb;[[FIII[[FI[[IFIIIII[[I)I")
	public static int method4357(@OriginalArg(0) int arg0, @OriginalArg(1) float[][] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class1_Sub15 arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) float[][] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[][] arg9, @OriginalArg(11) float arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int[][] arg16) {
		@Pc(12) int local12;
		if (arg0 == 1) {
			local12 = arg14;
			arg14 = arg15;
			arg15 = 128 - local12;
		} else if (arg0 == 2) {
			arg14 = 128 - arg14;
			arg15 = 128 - arg15;
		} else if (arg0 == 3) {
			local12 = arg14;
			arg14 = 128 - arg15;
			arg15 = local12;
		}
		@Pc(83) float local83;
		@Pc(91) float local91;
		@Pc(75) int local75;
		@Pc(99) float local99;
		if (arg14 == 0 && arg15 == 0) {
			local75 = arg8;
			local83 = arg1[arg6][arg11];
			local99 = arg4[arg6][arg11];
			local91 = arg7[arg6][arg11];
		} else if (arg14 == 128 && arg15 == 0) {
			local75 = arg12;
			local83 = arg1[arg6 + 1][arg11];
			local91 = arg7[arg6 + 1][arg11];
			local99 = arg4[arg6 + 1][arg11];
		} else if (arg14 == 128 && arg15 == 128) {
			local91 = arg7[arg6 + 1][arg11 + 1];
			local75 = arg13;
			local99 = arg4[arg6 + 1][arg11 + 1];
			local83 = arg1[arg6 + 1][arg11 + 1];
		} else if (arg14 == 0 && arg15 == 128) {
			local91 = arg7[arg6][arg11 + 1];
			local99 = arg4[arg6][arg11 + 1];
			local75 = arg5;
			local83 = arg1[arg6][arg11 + 1];
		} else {
			local83 = arg1[arg6][arg11];
			local99 = arg4[arg6][arg11];
			local91 = arg7[arg6][arg11];
			@Pc(140) float local140 = arg4[arg6][arg11 + 1];
			@Pc(145) float local145 = (float) arg14 / 128.0F;
			@Pc(160) float local160 = local91 + (arg7[arg6 + 1][arg11] - local91) * local145;
			@Pc(168) float local168 = arg1[arg6][arg11 + 1];
			@Pc(184) float local184 = local140 + local145 * (arg4[arg6 + 1][arg11 + 1] - local140);
			@Pc(192) float local192 = arg7[arg6][arg11 + 1];
			@Pc(207) float local207 = local83 + (arg1[arg6 + 1][arg11] - local83) * local145;
			@Pc(222) float local222 = local99 + local145 * (arg4[arg6 + 1][arg11] - local99);
			@Pc(238) float local238 = local168 + local145 * (arg1[arg6 + 1][arg11 + 1] - local168);
			@Pc(254) float local254 = local192 + (arg7[arg6 + 1][arg11 + 1] - local192) * local145;
			@Pc(259) float local259 = (float) arg15 / 128.0F;
			local91 = local160 + (local254 - local160) * local259;
			@Pc(273) int local273 = Static315.method4677(arg8, arg14, arg12);
			local99 = local222 + (local184 - local222) * local259;
			local83 = local207 + local259 * (local238 - local207);
			@Pc(295) int local295 = Static315.method4677(arg5, arg14, arg13);
			local75 = Static315.method4677(local273, arg15, local295);
		}
		@Pc(391) int local391 = arg14 + (arg6 << 7);
		@Pc(397) int local397 = arg15 + (arg11 << 7);
		@Pc(405) int local405 = Static241.method3834(arg11, arg15, arg9, arg14, arg6);
		return arg3.method2227(local391, local405, local397, local99, local83, local91, arg2 ? local75 & 0xFFFFFF00 : local75, arg16 == null ? 0.0F : (float) (local405 - Static241.method3834(arg11, arg15, arg16, arg14, arg6)) / arg10);
	}
}
