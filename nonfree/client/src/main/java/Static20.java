import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!bj", name = "y", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!bj", name = "q", descriptor = "Lclient!ia;")
	private static Class51 aClass51_178 = Static64.method1101("Started 3d library");

	@OriginalMember(owner = "client!bj", name = "t", descriptor = "Lclient!ia;")
	public static Class51 aClass51_179 = aClass51_178;

	@OriginalMember(owner = "client!bj", name = "w", descriptor = "Lclient!me;")
	public static Class71 aClass71_6 = null;

	@OriginalMember(owner = "client!bj", name = "B", descriptor = "Lclient!ia;")
	public static Class51 aClass51_180 = Static64.method1101("sl_back");

	@OriginalMember(owner = "client!bj", name = "C", descriptor = "I")
	public static int anInt552 = 128;

	@OriginalMember(owner = "client!bj", name = "G", descriptor = "[J")
	public static long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!bj", name = "I", descriptor = "[I")
	public static int[] anIntArray39 = new int[5];

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIILclient!ij;Lclient!ij;IIJ)V")
	public static void method442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class62 local8 = new Class62();
		local8.aLong84 = arg8;
		local8.anInt2407 = arg1 * 128 + 64;
		local8.anInt2400 = arg2 * 128 + 64;
		local8.anInt2404 = arg3;
		local8.aClass5_2 = arg4;
		local8.aClass5_1 = arg5;
		local8.anInt2403 = arg6;
		local8.anInt2396 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static22.aClass1_Sub7ArrayArrayArray1[local42][arg1][arg2] == null) {
				Static22.aClass1_Sub7ArrayArrayArray1[local42][arg1][arg2] = new Class1_Sub7(local42, arg1, arg2);
			}
		}
		Static22.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass62_1 = local8;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!ij;III)V")
	public static void method443(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class1_Sub7 local12;
		if (arg2 < Static58.anInt1373) {
			local12 = Static22.aClass1_Sub7ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass119_1 != null && local12.aClass119_1.aClass5_9.method3681()) {
				arg0.method3678(local12.aClass119_1.aClass5_9, 128, 0, 0, true);
			}
		}
		if (arg3 < Static58.anInt1373) {
			local12 = Static22.aClass1_Sub7ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass119_1 != null && local12.aClass119_1.aClass5_9.method3681()) {
				arg0.method3678(local12.aClass119_1.aClass5_9, 0, 0, 128, true);
			}
		}
		if (arg2 < Static58.anInt1373 && arg3 < Static172.anInt3854) {
			local12 = Static22.aClass1_Sub7ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass119_1 != null && local12.aClass119_1.aClass5_9.method3681()) {
				arg0.method3678(local12.aClass119_1.aClass5_9, 128, 0, 128, true);
			}
		}
		if (arg2 < Static58.anInt1373 && arg3 > 0) {
			local12 = Static22.aClass1_Sub7ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass119_1 != null && local12.aClass119_1.aClass5_9.method3681()) {
				arg0.method3678(local12.aClass119_1.aClass5_9, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class126 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class126(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static22.aClass1_Sub7ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static22.aClass1_Sub7ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub7(local14, arg1, arg2);
				}
			}
			Static22.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass126_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class126(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static22.aClass1_Sub7ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static22.aClass1_Sub7ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub7(local14, arg1, arg2);
				}
			}
			Static22.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass126_1 = local12;
		} else {
			@Pc(134) Class95 local134 = new Class95(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static22.aClass1_Sub7ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static22.aClass1_Sub7ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub7(local14, arg1, arg2);
				}
			}
			Static22.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass95_1 = local134;
		}
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(III)Lclient!ke;")
	public static Class62 method446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub7 local7 = Static22.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass62_1;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIII)Z")
	public static boolean method447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static77.method1327(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static181.method3050(local10 + 1, anIntArrayArrayArray2[arg0][arg1][arg2] + arg3, local14 + 1) && Static181.method3050(local10 + 128 - 1, anIntArrayArrayArray2[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static181.method3050(local10 + 128 - 1, anIntArrayArrayArray2[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static181.method3050(local10 + 1, anIntArrayArrayArray2[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)[Lclient!fe;")
	public static Class41_Sub1[] method448() {
		@Pc(4) Class41_Sub1[] local4 = new Class41_Sub1[Static43.anInt1027];
		for (@Pc(6) int local6 = 0; local6 < Static43.anInt1027; local6++) {
			local4[local6] = new Class41_Sub1(Static30.anInt2197, Static141.anInt3050, Static65.anIntArray98[local6], Static152.anIntArray225[local6], Static51.anIntArray72[local6], Static89.anIntArray85[local6], Static73.aByteArrayArray4[local6], Static52.anIntArray74);
		}
		Static134.method2401();
		return local4;
	}
}
