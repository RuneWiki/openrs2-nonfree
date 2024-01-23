import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "Lclient!hh;")
	private static Class50 aClass50_891 = Static186.method3527("World");

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "Lclient!hh;")
	public static Class50 aClass50_889 = aClass50_891;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "Lclient!hh;")
	public static Class50 aClass50_890 = Static186.method3527("Fertigkeit)2");

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "[I")
	public static int[] anIntArray285 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)Lclient!rh;")
	public static Class78_Sub1 method2039() {
		@Pc(25) Class78_Sub1 local25 = new Class78_Sub1(Static204.anInt4108, Static146.anInt3070, Static169.anIntArray370[0], Static228.anIntArray507[0], Static8.anIntArray20[0], Static101.anIntArray191[0], Static191.aByteArrayArray11[0], Static78.anIntArray127);
		Static216.method3375();
		return local25;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIIIIIIZ)Z")
	public static boolean method2040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				Static22.anIntArrayArray4[local3][local7] = 0;
				Static228.anIntArrayArray37[local3][local7] = 99999999;
			}
		}
		Static22.anIntArrayArray4[arg9][arg5] = 99;
		@Pc(45) int local45 = arg5;
		Static228.anIntArrayArray37[arg9][arg5] = 0;
		@Pc(53) byte local53 = 0;
		local7 = arg9;
		Static86.anIntArray141[0] = arg9;
		@Pc(70) int local70 = local53 + 1;
		Static194.anIntArray446[0] = arg5;
		@Pc(74) boolean local74 = false;
		@Pc(76) int local76 = 0;
		@Pc(81) int[][] local81 = Static22.aClass16Array1[Static212.anInt4195].anIntArrayArray6;
		@Pc(198) int local198;
		while (local70 != local76) {
			local45 = Static194.anIntArray446[local76];
			local7 = Static86.anIntArray141[local76];
			local76 = local76 + 1 & 0xFFF;
			if (arg0 == local7 && local45 == arg3) {
				local74 = true;
				break;
			}
			if (arg1 != 0) {
				if ((arg1 < 5 || arg1 == 10) && Static22.aClass16Array1[Static212.anInt4195].method435(local7, arg0, arg3, 1, arg1 - 1, arg4, local45)) {
					local74 = true;
					break;
				}
				if (arg1 < 10 && Static22.aClass16Array1[Static212.anInt4195].method433(arg3, arg1 - 1, local7, arg0, arg4, 1, local45)) {
					local74 = true;
					break;
				}
			}
			if (arg8 != 0 && arg7 != 0 && Static22.aClass16Array1[Static212.anInt4195].method424(arg8, local7, local45, arg7, 1, arg3, arg6, arg0)) {
				local74 = true;
				break;
			}
			local198 = Static228.anIntArrayArray37[local7][local45] + 1;
			if (local7 > 0 && Static22.anIntArrayArray4[local7 - 1][local45] == 0 && (local81[local7 - 1][local45] & 0x12C0108) == 0) {
				Static86.anIntArray141[local70] = local7 - 1;
				Static194.anIntArray446[local70] = local45;
				local70 = local70 + 1 & 0xFFF;
				Static22.anIntArrayArray4[local7 - 1][local45] = 2;
				Static228.anIntArrayArray37[local7 - 1][local45] = local198;
			}
			if (local7 < 103 && Static22.anIntArrayArray4[local7 + 1][local45] == 0 && (local81[local7 + 1][local45] & 0x12C0180) == 0) {
				Static86.anIntArray141[local70] = local7 + 1;
				Static194.anIntArray446[local70] = local45;
				local70 = local70 + 1 & 0xFFF;
				Static22.anIntArrayArray4[local7 + 1][local45] = 8;
				Static228.anIntArrayArray37[local7 + 1][local45] = local198;
			}
			if (local45 > 0 && Static22.anIntArrayArray4[local7][local45 - 1] == 0 && (local81[local7][local45 - 1] & 0x12C0102) == 0) {
				Static86.anIntArray141[local70] = local7;
				Static194.anIntArray446[local70] = local45 - 1;
				Static22.anIntArrayArray4[local7][local45 - 1] = 1;
				Static228.anIntArrayArray37[local7][local45 - 1] = local198;
				local70 = local70 + 1 & 0xFFF;
			}
			if (local45 < 103 && Static22.anIntArrayArray4[local7][local45 + 1] == 0 && (local81[local7][local45 + 1] & 0x12C0120) == 0) {
				Static86.anIntArray141[local70] = local7;
				Static194.anIntArray446[local70] = local45 + 1;
				local70 = local70 + 1 & 0xFFF;
				Static22.anIntArrayArray4[local7][local45 + 1] = 4;
				Static228.anIntArrayArray37[local7][local45 + 1] = local198;
			}
			if (local7 > 0 && local45 > 0 && Static22.anIntArrayArray4[local7 - 1][local45 - 1] == 0 && (local81[local7 - 1][local45 - 1] & 0x12C010E) == 0 && (local81[local7 - 1][local45] & 0x12C0108) == 0 && (local81[local7][local45 - 1] & 0x12C0102) == 0) {
				Static86.anIntArray141[local70] = local7 - 1;
				Static194.anIntArray446[local70] = local45 - 1;
				Static22.anIntArrayArray4[local7 - 1][local45 - 1] = 3;
				Static228.anIntArrayArray37[local7 - 1][local45 - 1] = local198;
				local70 = local70 + 1 & 0xFFF;
			}
			if (local7 < 103 && local45 > 0 && Static22.anIntArrayArray4[local7 + 1][local45 - 1] == 0 && (local81[local7 + 1][local45 - 1] & 0x12C0183) == 0 && (local81[local7 + 1][local45] & 0x12C0180) == 0 && (local81[local7][local45 - 1] & 0x12C0102) == 0) {
				Static86.anIntArray141[local70] = local7 + 1;
				Static194.anIntArray446[local70] = local45 - 1;
				local70 = local70 + 1 & 0xFFF;
				Static22.anIntArrayArray4[local7 + 1][local45 - 1] = 9;
				Static228.anIntArrayArray37[local7 + 1][local45 - 1] = local198;
			}
			if (local7 > 0 && local45 < 103 && Static22.anIntArrayArray4[local7 - 1][local45 + 1] == 0 && (local81[local7 - 1][local45 + 1] & 0x12C0138) == 0 && (local81[local7 - 1][local45] & 0x12C0108) == 0 && (local81[local7][local45 + 1] & 0x12C0120) == 0) {
				Static86.anIntArray141[local70] = local7 - 1;
				Static194.anIntArray446[local70] = local45 + 1;
				Static22.anIntArrayArray4[local7 - 1][local45 + 1] = 6;
				local70 = local70 + 1 & 0xFFF;
				Static228.anIntArrayArray37[local7 - 1][local45 + 1] = local198;
			}
			if (local7 < 103 && local45 < 103 && Static22.anIntArrayArray4[local7 + 1][local45 + 1] == 0 && (local81[local7 + 1][local45 + 1] & 0x12C01E0) == 0 && (local81[local7 + 1][local45] & 0x12C0180) == 0 && (local81[local7][local45 + 1] & 0x12C0120) == 0) {
				Static86.anIntArray141[local70] = local7 + 1;
				Static194.anIntArray446[local70] = local45 + 1;
				local70 = local70 + 1 & 0xFFF;
				Static22.anIntArrayArray4[local7 + 1][local45 + 1] = 12;
				Static228.anIntArrayArray37[local7 + 1][local45 + 1] = local198;
			}
		}
		Static181.anInt3752 = 0;
		@Pc(816) int local816;
		if (!local74) {
			if (!arg10) {
				return false;
			}
			local198 = 1000;
			local816 = 100;
			for (@Pc(823) int local823 = arg0 - 10; local823 <= arg0 + 10; local823++) {
				for (@Pc(830) int local830 = arg3 - 10; local830 <= arg3 + 10; local830++) {
					if (local823 >= 0 && local830 >= 0 && local823 < 104 && local830 < 104 && Static228.anIntArrayArray37[local823][local830] < 100) {
						@Pc(855) int local855 = 0;
						if (local830 < arg3) {
							local855 = arg3 - local830;
						} else if (local830 > arg7 + arg3 - 1) {
							local855 = local830 + 1 - arg7 - arg3;
						}
						@Pc(890) int local890 = 0;
						if (local823 < arg0) {
							local890 = arg0 - local823;
						} else if (arg0 + arg8 - 1 < local823) {
							local890 = local823 + 1 - arg8 - arg0;
						}
						@Pc(929) int local929 = local855 * local855 + local890 * local890;
						if (local929 < local198 || local929 == local198 && Static228.anIntArrayArray37[local823][local830] < local816) {
							local198 = local929;
							local7 = local823;
							local816 = Static228.anIntArrayArray37[local823][local830];
							local45 = local830;
						}
					}
				}
			}
			if (local198 == 1000) {
				return false;
			}
			if (local7 == arg9 && local45 == arg5) {
				return false;
			}
			Static181.anInt3752 = 1;
		}
		@Pc(1003) byte local1003 = 0;
		Static86.anIntArray141[0] = local7;
		local76 = local1003 + 1;
		Static194.anIntArray446[0] = local45;
		local198 = local816 = Static22.anIntArrayArray4[local7][local45];
		while (arg9 != local7 || local45 != arg5) {
			if (local198 != local816) {
				local816 = local198;
				Static86.anIntArray141[local76] = local7;
				Static194.anIntArray446[local76++] = local45;
			}
			if ((local198 & 0x1) != 0) {
				local45++;
			} else if ((local198 & 0x4) != 0) {
				local45--;
			}
			if ((local198 & 0x2) != 0) {
				local7++;
			} else if ((local198 & 0x8) != 0) {
				local7--;
			}
			local198 = Static22.anIntArrayArray4[local7][local45];
		}
		if (local76 > 0) {
			Static36.method580(local76, arg2);
			return true;
		} else if (arg2 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!ta;III)V")
	public static void method2042(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class1_Sub11 local12;
		if (arg2 < Static12.anInt236) {
			local12 = Static56.aClass1_Sub11ArrayArrayArray3[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass128_1 != null && local12.aClass128_1.aClass20_10.method3487()) {
				arg0.method3490(local12.aClass128_1.aClass20_10, 128, 0, 0, true);
			}
		}
		if (arg3 < Static12.anInt236) {
			local12 = Static56.aClass1_Sub11ArrayArrayArray3[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass128_1 != null && local12.aClass128_1.aClass20_10.method3487()) {
				arg0.method3490(local12.aClass128_1.aClass20_10, 0, 0, 128, true);
			}
		}
		if (arg2 < Static12.anInt236 && arg3 < Static232.anInt4450) {
			local12 = Static56.aClass1_Sub11ArrayArrayArray3[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass128_1 != null && local12.aClass128_1.aClass20_10.method3487()) {
				arg0.method3490(local12.aClass128_1.aClass20_10, 128, 0, 128, true);
			}
		}
		if (arg2 < Static12.anInt236 && arg3 > 0) {
			local12 = Static56.aClass1_Sub11ArrayArrayArray3[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass128_1 != null && local12.aClass128_1.aClass20_10.method3487()) {
				arg0.method3490(local12.aClass128_1.aClass20_10, 128, 0, -128, true);
			}
		}
	}
}
