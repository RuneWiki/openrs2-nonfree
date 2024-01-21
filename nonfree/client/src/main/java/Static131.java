import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "[[Lclient!rh;")
	public static Class77[][] aClass77ArrayArray1;

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "[Lclient!oe;")
	public static Class1_Sub2_Sub2_Sub3[] aClass1_Sub2_Sub2_Sub3Array9;

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "Z")
	public static boolean aBoolean115;

	@OriginalMember(owner = "client!ph", name = "k", descriptor = "Lclient!nd;")
	public static Class59 aClass59_21 = new Class59(64);

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "Lclient!tg;")
	private static Class81 aClass81_1027 = Static120.method2057("Loading textures )2 ");

	@OriginalMember(owner = "client!ph", name = "o", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1028 = aClass81_1027;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
	public static void method2243() {
		aClass1_Sub2_Sub2_Sub3Array9 = null;
		aClass81_1028 = null;
		aClass81_1027 = null;
		aClass59_21 = null;
		aClass77ArrayArray1 = null;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!vb;Lclient!tg;Lclient!tg;I)[Lclient!oe;")
	public static Class1_Sub2_Sub2_Sub3[] method2246(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) Class81 arg2) {
		@Pc(8) int local8 = arg0.method2955(arg1);
		@Pc(19) int local19 = arg0.method2967(arg2, local8);
		return Static30.method643(local8, local19, arg0);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILclient!tg;Lclient!tg;I)V")
	public static void method2247(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) Class81 arg2) {
		Static34.method738(null, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method2248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class54 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class54(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static167.aClass1_Sub17ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static167.aClass1_Sub17ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub17(local14, arg1, arg2);
				}
			}
			Static167.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass54_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class54(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static167.aClass1_Sub17ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static167.aClass1_Sub17ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub17(local14, arg1, arg2);
				}
			}
			Static167.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass54_1 = local12;
		} else {
			@Pc(134) Class12 local134 = new Class12(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static167.aClass1_Sub17ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static167.aClass1_Sub17ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub17(local14, arg1, arg2);
				}
			}
			Static167.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass12_1 = local134;
		}
	}
}
