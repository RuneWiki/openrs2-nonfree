import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!hg", name = "m", descriptor = "J")
	public static long aLong75 = 0L;

	@OriginalMember(owner = "client!hg", name = "o", descriptor = "[I")
	public static int[] anIntArray169 = new int[32];

	@OriginalMember(owner = "client!hg", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString78 = "Take";

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILclient!lg;)Lclient!lg;")
	public static Class97 method1689(@OriginalArg(1) Class97 arg0) {
		if (arg0.anInt3165 != -1) {
			return Static148.method2340(arg0.anInt3165);
		}
		@Pc(28) int local28 = arg0.anInt3162 >>> 16;
		@Pc(33) Class164 local33 = new Class164(Static167.aClass163_25);
		for (@Pc(38) Class4_Sub30 local38 = (Class4_Sub30) local33.method4196(); local38 != null; local38 = (Class4_Sub30) local33.method4197()) {
			if (local38.anInt5208 == local28) {
				return Static148.method2340((int) local38.aLong211);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(IIII)I")
	public static int method1690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 / arg0;
		@Pc(13) int local13 = arg0 - 1 & arg1;
		@Pc(17) int local17 = arg2 / arg0;
		@Pc(23) int local23 = arg0 - 1 & arg2;
		@Pc(32) int local32 = Static21.method432(local17, local7);
		@Pc(39) int local39 = Static21.method432(local17 + 1, local7);
		@Pc(48) int local48 = Static21.method432(local17, local7 + 1);
		@Pc(57) int local57 = Static21.method432(local17 + 1, local7 + 1);
		@Pc(64) int local64 = Static118.method1994(arg0, local39, local32, local23);
		@Pc(71) int local71 = Static118.method1994(arg0, local57, local48, local23);
		return Static118.method1994(arg0, local71, local64, local13);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method1692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class131 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class131(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static261.aClass4_Sub21ArrayArrayArray4[local14][arg1][arg2] == null) {
					Static261.aClass4_Sub21ArrayArrayArray4[local14][arg1][arg2] = new Class4_Sub21(local14, arg1, arg2);
				}
			}
			Static261.aClass4_Sub21ArrayArrayArray4[arg0][arg1][arg2].aClass131_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class131(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static261.aClass4_Sub21ArrayArrayArray4[local14][arg1][arg2] == null) {
					Static261.aClass4_Sub21ArrayArrayArray4[local14][arg1][arg2] = new Class4_Sub21(local14, arg1, arg2);
				}
			}
			Static261.aClass4_Sub21ArrayArrayArray4[arg0][arg1][arg2].aClass131_1 = local12;
		} else {
			@Pc(134) Class187 local134 = new Class187(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static261.aClass4_Sub21ArrayArrayArray4[local14][arg1][arg2] == null) {
					Static261.aClass4_Sub21ArrayArrayArray4[local14][arg1][arg2] = new Class4_Sub21(local14, arg1, arg2);
				}
			}
			Static261.aClass4_Sub21ArrayArrayArray4[arg0][arg1][arg2].aClass187_1 = local134;
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V")
	public static void method1693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class4_Sub21 local7 = Static261.aClass4_Sub21ArrayArrayArray4[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(30) Class4_Sub21 local30 = Static261.aClass4_Sub21ArrayArrayArray4[local9][arg0][arg1] = Static261.aClass4_Sub21ArrayArrayArray4[local9 + 1][arg0][arg1];
			if (local30 != null) {
				local30.anInt2696--;
				for (@Pc(40) int local40 = 0; local40 < local30.anInt2694; local40++) {
					@Pc(49) Class99 local49 = local30.aClass99Array19[local40];
					if ((local49.aLong117 >> 29 & 0x3L) == 2L && local49.anInt3225 == arg0 && local49.anInt3222 == arg1) {
						local49.anInt3231--;
					}
				}
			}
		}
		if (Static261.aClass4_Sub21ArrayArrayArray4[0][arg0][arg1] == null) {
			Static261.aClass4_Sub21ArrayArrayArray4[0][arg0][arg1] = new Class4_Sub21(0, arg0, arg1);
		}
		Static261.aClass4_Sub21ArrayArrayArray4[0][arg0][arg1].aClass4_Sub21_1 = local7;
		Static261.aClass4_Sub21ArrayArrayArray4[3][arg0][arg1] = null;
	}
}
