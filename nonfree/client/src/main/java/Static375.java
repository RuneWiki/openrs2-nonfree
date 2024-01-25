import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!sr", name = "C", descriptor = "Lclient!so;")
	public static Class74 aClass74_1;

	@OriginalMember(owner = "client!sr", name = "G", descriptor = "I")
	public static int anInt6234 = 0;

	@OriginalMember(owner = "client!sr", name = "H", descriptor = "[I")
	public static final int[] anIntArray545 = new int[250];

	@OriginalMember(owner = "client!sr", name = "I", descriptor = "I")
	public static int anInt6235 = 0;

	@OriginalMember(owner = "client!sr", name = "K", descriptor = "I")
	public static int anInt6236 = -1;

	@OriginalMember(owner = "client!sr", name = "L", descriptor = "[I")
	public static int[] anIntArray546 = new int[2];

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(III)V")
	public static void method5204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class189 local7 = Static30.aClass189ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null && local7.aClass3_Sub5_1 != null) {
			local7.aClass3_Sub5_1 = null;
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg1 + arg2;
		@Pc(19) int local19 = arg0 - arg2;
		for (@Pc(21) int local21 = arg1; local21 < local9; local21++) {
			Static73.method1404(Static347.anIntArrayArray54[local21], arg4, arg6, arg5);
		}
		@Pc(40) int local40 = arg5 + arg2;
		for (@Pc(42) int local42 = arg0; local42 > local19; local42--) {
			Static73.method1404(Static347.anIntArrayArray54[local42], arg4, arg6, arg5);
		}
		@Pc(65) int local65 = arg4 - arg2;
		for (@Pc(67) int local67 = local9; local67 <= local19; local67++) {
			@Pc(73) int[] local73 = Static347.anIntArrayArray54[local67];
			Static73.method1404(local73, local40, arg6, arg5);
			Static73.method1404(local73, local65, arg3, local40);
			Static73.method1404(local73, arg4, arg6, local65);
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg6 == arg2 && arg0 == arg7 && arg1 == arg4 && arg8 == arg3) {
			Static369.method5137(arg5, arg1, arg7, arg3, arg2);
			return;
		}
		@Pc(23) int local23 = arg2;
		@Pc(25) int local25 = arg7;
		@Pc(29) int local29 = arg2 * 3;
		@Pc(33) int local33 = arg7 * 3;
		@Pc(37) int local37 = arg6 * 3;
		@Pc(41) int local41 = arg0 * 3;
		@Pc(45) int local45 = arg4 * 3;
		@Pc(49) int local49 = arg8 * 3;
		@Pc(58) int local58 = arg1 + local37 - local45 - arg2;
		@Pc(69) int local69 = arg3 + local41 - arg7 - local49;
		@Pc(80) int local80 = local45 + local29 - local37 - local37;
		@Pc(90) int local90 = local33 + local49 - local41 - local41;
		@Pc(94) int local94 = local37 - local29;
		@Pc(99) int local99 = local41 - local33;
		for (@Pc(101) int local101 = 128; local101 <= 4096; local101 += 128) {
			@Pc(109) int local109 = local101 * local101 >> 12;
			@Pc(115) int local115 = local101 * local109 >> 12;
			@Pc(119) int local119 = local115 * local58;
			@Pc(123) int local123 = local69 * local115;
			@Pc(127) int local127 = local109 * local80;
			@Pc(131) int local131 = local109 * local90;
			@Pc(135) int local135 = local94 * local101;
			@Pc(139) int local139 = local99 * local101;
			@Pc(149) int local149 = arg2 + (local135 + local119 + local127 >> 12);
			@Pc(160) int local160 = arg7 + (local139 + local131 + local123 >> 12);
			Static369.method5137(arg5, local149, local25, local160, local23);
			local23 = local149;
			local25 = local160;
		}
	}
}
