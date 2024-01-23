import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!td", name = "g", descriptor = "Lclient!me;")
	public static Class111 aClass111_8;

	@OriginalMember(owner = "client!td", name = "n", descriptor = "I")
	public static int anInt5235;

	@OriginalMember(owner = "client!td", name = "d", descriptor = "I")
	public static int anInt5228 = 0;

	@OriginalMember(owner = "client!td", name = "h", descriptor = "I")
	public static int anInt5229 = -1;

	@OriginalMember(owner = "client!td", name = "o", descriptor = "I")
	public static int anInt5236 = 0;

	@OriginalMember(owner = "client!td", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString178 = "Loaded sprites";

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I[[I)V")
	public static void method4229(@OriginalArg(1) int[][] arg0) {
		Static275.anIntArrayArray37 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method4230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class143 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class143(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static52.aClass2_Sub13ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static52.aClass2_Sub13ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub13(local14, arg1, arg2);
				}
			}
			Static52.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2].aClass143_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class143(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static52.aClass2_Sub13ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static52.aClass2_Sub13ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub13(local14, arg1, arg2);
				}
			}
			Static52.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2].aClass143_1 = local12;
		} else {
			@Pc(134) Class182 local134 = new Class182(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static52.aClass2_Sub13ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static52.aClass2_Sub13ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub13(local14, arg1, arg2);
				}
			}
			Static52.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2].aClass182_1 = local134;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BZ)V")
	public static void method4232(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static303.anInt5868 != -1) {
				Static91.method1627(Static303.anInt5868);
			}
			for (@Pc(16) Class2_Sub4 local16 = (Class2_Sub4) Static132.aClass101_8.method2868(); local16 != null; local16 = (Class2_Sub4) Static132.aClass101_8.method2859()) {
				Static225.method4281(local16, true);
			}
			Static303.anInt5868 = -1;
			Static132.aClass101_8 = new Class101(8);
			Static295.method4526();
			Static303.anInt5868 = Static11.anInt243;
			Static130.method2397(false);
			Static40.method741();
			Static302.method4602(Static303.anInt5868);
		}
		Static203.anInt4260 = -1;
		Static127.method2293(Static41.anInt1010);
		Static22.aClass15_Sub2_Sub2_1 = new Class15_Sub2_Sub2();
		Static22.aClass15_Sub2_Sub2_1.anInt5358 = 3000;
		Static22.aClass15_Sub2_Sub2_1.anInt5371 = 3000;
		if (!Static116.aBoolean184 && Static162.anInt3614 == 0) {
			Static260.method4092(Static121.aClass42_32);
			Static305.method4624(10);
			return;
		}
		if (Static16.anInt342 == 2) {
			Static80.anInt1911 = Static206.anInt4289 << 7;
			Static192.anInt4017 = Static136.anInt3064 << 7;
		} else {
			Static31.method634();
		}
		if (Static116.aBoolean184) {
			Static43.method820();
		}
		Static39.method734();
		Static305.method4624(28);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)Z")
	public static boolean method4233(@OriginalArg(0) int arg0) {
		if (Static275.aBooleanArray20[arg0]) {
			return true;
		} else if (Static152.aClass42_42.method1251(arg0)) {
			@Pc(31) int local31 = Static152.aClass42_42.method1269(arg0);
			if (local31 == 0) {
				Static275.aBooleanArray20[arg0] = true;
				return true;
			}
			if (Static262.aClass56ArrayArray1[arg0] == null) {
				Static262.aClass56ArrayArray1[arg0] = new Class56[local31];
			}
			for (@Pc(55) int local55 = 0; local55 < local31; local55++) {
				if (Static262.aClass56ArrayArray1[arg0][local55] == null) {
					@Pc(71) byte[] local71 = Static152.aClass42_42.method1256(arg0, local55);
					if (local71 != null) {
						@Pc(85) Class56 local85 = Static262.aClass56ArrayArray1[arg0][local55] = new Class56();
						local85.anInt2096 = (arg0 << 16) + local55;
						if (local71[0] == -1) {
							local85.method1567(new Class2_Sub16(local71));
						} else {
							local85.method1559(new Class2_Sub16(local71));
						}
					}
				}
			}
			Static275.aBooleanArray20[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
