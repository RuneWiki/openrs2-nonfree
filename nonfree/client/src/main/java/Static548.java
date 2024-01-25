import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
	public static int anInt9156;

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "[I")
	public static final int[] anIntArray579 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
	public static int anInt9157 = -2;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)Z")
	public static boolean method7475(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!ac;)Lclient!hfa;")
	public static Class132 method7476(@OriginalArg(1) Class1_Sub3 arg0) {
		@Pc(12) int local12 = arg0.method7945();
		@Pc(19) Class259 local19 = Static179.method2831()[arg0.method7974()];
		@Pc(26) Class216 local26 = Static570.method7672()[arg0.method7974()];
		@Pc(30) int local30 = arg0.method7975();
		@Pc(34) int local34 = arg0.method7975();
		return new Class132(local12, local19, local26, local30, local34);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method7477(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 == arg5 && arg1 == arg8 && arg4 == arg2 && arg6 == arg3) {
			Static229.method3417(arg6, arg5, arg8, arg7, arg2);
			return;
		}
		@Pc(26) int local26 = arg5;
		@Pc(28) int local28 = arg8;
		@Pc(32) int local32 = arg5 * 3;
		@Pc(36) int local36 = arg8 * 3;
		@Pc(40) int local40 = arg0 * 3;
		@Pc(44) int local44 = arg1 * 3;
		@Pc(48) int local48 = arg4 * 3;
		@Pc(52) int local52 = arg3 * 3;
		@Pc(62) int local62 = local40 + arg2 - arg5 - local48;
		@Pc(70) int local70 = local44 + arg6 - local52 - arg8;
		@Pc(81) int local81 = local48 + local32 - local40 - local40;
		@Pc(91) int local91 = local52 + local36 - local44 - local44;
		@Pc(96) int local96 = local40 - local32;
		@Pc(101) int local101 = local44 - local36;
		for (@Pc(103) int local103 = 128; local103 <= 4096; local103 += 128) {
			@Pc(111) int local111 = local103 * local103 >> 12;
			@Pc(117) int local117 = local103 * local111 >> 12;
			@Pc(121) int local121 = local117 * local62;
			@Pc(125) int local125 = local70 * local117;
			@Pc(129) int local129 = local81 * local111;
			@Pc(133) int local133 = local111 * local91;
			@Pc(137) int local137 = local96 * local103;
			@Pc(141) int local141 = local101 * local103;
			@Pc(152) int local152 = arg5 + (local121 + local129 + local137 >> 12);
			@Pc(162) int local162 = arg8 + (local141 + local133 + local125 >> 12);
			Static229.method3417(local162, local26, local28, arg7, local152);
			local26 = local152;
			local28 = local162;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)V")
	public static void method7479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub8_Sub9 local8 = Static465.method6470(arg0, 14);
		local8.method4833();
		local8.anInt5968 = arg1;
	}
}
