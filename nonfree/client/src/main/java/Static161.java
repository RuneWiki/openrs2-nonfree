import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!lk", name = "x", descriptor = "Lclient!rn;")
	public static Class155 aClass155_65;

	@OriginalMember(owner = "client!lk", name = "A", descriptor = "Lclient!ie;")
	public static Class78 aClass78_6;

	@OriginalMember(owner = "client!lk", name = "C", descriptor = "Lclient!uc;")
	public static Class177 aClass177_1;

	@OriginalMember(owner = "client!lk", name = "G", descriptor = "[Lclient!ho;")
	public static Class3_Sub4_Sub12[] aClass3_Sub4_Sub12Array4;

	@OriginalMember(owner = "client!lk", name = "O", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread1;

	@OriginalMember(owner = "client!lk", name = "n", descriptor = "[I")
	public static int[] anIntArray347 = new int[2500];

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method2652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class110 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class110(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static146.aClass3_Sub25ArrayArrayArray7[local14][arg1][arg2] == null) {
					Static146.aClass3_Sub25ArrayArrayArray7[local14][arg1][arg2] = new Class3_Sub25(local14, arg1, arg2);
				}
			}
			Static146.aClass3_Sub25ArrayArrayArray7[arg0][arg1][arg2].aClass110_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class110(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static146.aClass3_Sub25ArrayArrayArray7[local14][arg1][arg2] == null) {
					Static146.aClass3_Sub25ArrayArrayArray7[local14][arg1][arg2] = new Class3_Sub25(local14, arg1, arg2);
				}
			}
			Static146.aClass3_Sub25ArrayArrayArray7[arg0][arg1][arg2].aClass110_1 = local12;
		} else {
			@Pc(134) Class111 local134 = new Class111(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static146.aClass3_Sub25ArrayArrayArray7[local14][arg1][arg2] == null) {
					Static146.aClass3_Sub25ArrayArrayArray7[local14][arg1][arg2] = new Class3_Sub25(local14, arg1, arg2);
				}
			}
			Static146.aClass3_Sub25ArrayArrayArray7[arg0][arg1][arg2].aClass111_1 = local134;
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(BLclient!pm;)V")
	public static void method2653(@OriginalArg(1) Class3_Sub24 arg0) {
		Static239.method4066(arg0, 200000);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZII)V")
	public static void method2655(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1008) {
			Static5.method105(arg2, arg0, 10);
		} else if (arg1 == 1004) {
			Static5.method105(arg2, arg0, 11);
		} else if (arg1 == 1002) {
			Static5.method105(arg2, arg0, 12);
		} else if (arg1 == 1003) {
			Static5.method105(arg2, arg0, 13);
		} else if (arg1 == 1005) {
			Static5.method105(arg2, arg0, 14);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZ)V")
	public static void method2656(@OriginalArg(0) int arg0) {
		@Pc(11) Class3_Sub4_Sub7 local11 = Static34.method528(arg0, 10);
		local11.method970();
	}
}
