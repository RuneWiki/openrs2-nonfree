import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!j", name = "W", descriptor = "Lclient!pa;")
	public static Class1_Sub2_Sub1 aClass1_Sub2_Sub1_27;

	@OriginalMember(owner = "client!j", name = "Y", descriptor = "I")
	public static int anInt2557;

	@OriginalMember(owner = "client!j", name = "T", descriptor = "Lclient!gj;")
	public static Class59 aClass59_21 = new Class59();

	@OriginalMember(owner = "client!j", name = "V", descriptor = "I")
	public static int anInt2556 = 0;

	@OriginalMember(owner = "client!j", name = "X", descriptor = "Z")
	public static boolean aBoolean164 = false;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIZI)Lclient!pd;")
	public static Class136 method2191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(27) long local27 = ((long) arg3 & 0xFFFFL) << 16 | (long) arg2 << 48 & 0xFFFF000000000000L | ((long) arg1 & 0xFFFFL) << 32 | (long) arg0 & 0xFFFFL;
		@Pc(37) Class136 local37 = (Class136) Static227.aClass187_116.method4527(local27);
		if (local37 != null) {
			return local37;
		}
		@Pc(44) Class146[] local44 = null;
		@Pc(48) Class48 local48 = Static92.method4691(arg0);
		if (local48.anIntArray130 != null) {
			local44 = new Class146[local48.anIntArray130.length];
			for (@Pc(59) int local59 = 0; local59 < local44.length; local59++) {
				@Pc(70) Class4 local70 = Static220.method3442(local48.anIntArray130[local59]);
				local44[local59] = new Class146(local70.anInt32, local70.anInt29, local70.anInt31, local70.anInt26, local70.anInt23, local70.anInt27, local70.anInt22, local70.aBoolean2);
			}
		}
		local37 = new Class136(local48.anInt1568, local44, local48.anInt1569, arg2, arg1, arg3);
		Static227.aClass187_116.method4524(local27, local37);
		return local37;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BI)V")
	public static void method2193(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static83.aBooleanArray5[arg0]) {
			return;
		}
		Static263.aClass121_117.method3122(arg0);
		if (Static274.aClass66ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(27) boolean local27 = true;
		for (@Pc(29) int local29 = 0; local29 < Static274.aClass66ArrayArray1[arg0].length; local29++) {
			if (Static274.aClass66ArrayArray1[arg0][local29] != null) {
				if (Static274.aClass66ArrayArray1[arg0][local29].anInt2176 == 2) {
					local27 = false;
				} else {
					Static274.aClass66ArrayArray1[arg0][local29] = null;
				}
			}
		}
		if (local27) {
			Static274.aClass66ArrayArray1[arg0] = null;
		}
		Static83.aBooleanArray5[arg0] = false;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IZ)V")
	public static void method2194(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub2_Sub11 local13 = Static5.method35(arg0, 1);
		local13.method2873();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method2195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class159 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class159(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static105.aClass1_Sub33ArrayArrayArray2[local14][arg1][arg2] == null) {
					Static105.aClass1_Sub33ArrayArrayArray2[local14][arg1][arg2] = new Class1_Sub33(local14, arg1, arg2);
				}
			}
			Static105.aClass1_Sub33ArrayArrayArray2[arg0][arg1][arg2].aClass159_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class159(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static105.aClass1_Sub33ArrayArrayArray2[local14][arg1][arg2] == null) {
					Static105.aClass1_Sub33ArrayArrayArray2[local14][arg1][arg2] = new Class1_Sub33(local14, arg1, arg2);
				}
			}
			Static105.aClass1_Sub33ArrayArrayArray2[arg0][arg1][arg2].aClass159_1 = local12;
		} else {
			@Pc(134) Class133 local134 = new Class133(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static105.aClass1_Sub33ArrayArrayArray2[local14][arg1][arg2] == null) {
					Static105.aClass1_Sub33ArrayArrayArray2[local14][arg1][arg2] = new Class1_Sub33(local14, arg1, arg2);
				}
			}
			Static105.aClass1_Sub33ArrayArrayArray2[arg0][arg1][arg2].aClass133_1 = local134;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!nk;BII)Lclient!fe;")
	public static Class23_Sub1 method2196(@OriginalArg(0) Class121 arg0, @OriginalArg(3) int arg1) {
		return Static313.method2575(arg1, 0, arg0) ? Static239.method3684() : null;
	}
}
