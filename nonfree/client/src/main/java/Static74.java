import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!le", name = "D", descriptor = "Lclient!ff;")
	public static Class26 aClass26_15;

	@OriginalMember(owner = "client!le", name = "w", descriptor = "Lclient!r;")
	private static Class61 aClass61_545 = Static129.method2060("No reply from loginserver)3");

	@OriginalMember(owner = "client!le", name = "v", descriptor = "Lclient!r;")
	public static Class61 aClass61_544 = aClass61_545;

	@OriginalMember(owner = "client!le", name = "y", descriptor = "Lclient!r;")
	public static Class61 aClass61_546 = Static129.method2060("::gc");

	@OriginalMember(owner = "client!le", name = "A", descriptor = "Lclient!r;")
	public static Class61 aClass61_547 = Static129.method2060("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!le", name = "E", descriptor = "[I")
	public static int[] anIntArray257 = new int[32];

	@OriginalMember(owner = "client!le", name = "F", descriptor = "Lclient!r;")
	public static Class61 aClass61_548 = Static129.method2060(":");

	@OriginalMember(owner = "client!le", name = "H", descriptor = "[[I")
	private static int[][] anIntArrayArray20 = new int[104][104];

	@OriginalMember(owner = "client!le", name = "J", descriptor = "[[B")
	public static byte[][] aByteArrayArray9 = new byte[250][];

	@OriginalMember(owner = "client!le", name = "M", descriptor = "I")
	public static int anInt1769 = -1;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
	public static void method1192() {
		aClass26_15 = null;
		aClass61_548 = null;
		aClass61_546 = null;
		aClass61_545 = null;
		aClass61_547 = null;
		anIntArrayArray20 = null;
		aByteArrayArray9 = null;
		aClass61_544 = null;
		anIntArray257 = null;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIBIIIIZIIII)Z")
	public static boolean method1193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				Static26.anIntArrayArray8[local3][local7] = 0;
				anIntArrayArray20[local3][local7] = 99999999;
			}
		}
		Static26.anIntArrayArray8[arg1][arg4] = 99;
		local7 = arg1;
		anIntArrayArray20[arg1][arg4] = 0;
		@Pc(47) byte local47 = 0;
		@Pc(49) int local49 = 0;
		@Pc(51) boolean local51 = false;
		Static62.anIntArray229[0] = arg1;
		@Pc(57) int local57 = arg4;
		@Pc(64) int local64 = local47 + 1;
		Static58.anIntArray210[0] = arg4;
		@Pc(71) int[][] local71 = Static103.aClass66Array1[Static93.anInt2428].anIntArrayArray22;
		@Pc(74) int local74 = Static62.anIntArray229.length;
		@Pc(189) int local189;
		while (local64 != local49) {
			local57 = Static58.anIntArray210[local49];
			local7 = Static62.anIntArray229[local49];
			local49 = (local49 + 1) % local74;
			if (arg2 == local7 && arg3 == local57) {
				local51 = true;
				break;
			}
			if (arg10 != 0) {
				if ((arg10 < 5 || arg10 == 10) && Static103.aClass66Array1[Static93.anInt2428].method1799(local7, arg2, arg10 - 1, arg3, arg8, local57)) {
					local51 = true;
					break;
				}
				if (arg10 < 10 && Static103.aClass66Array1[Static93.anInt2428].method1810(local57, arg8, arg2, arg3, local7, arg10 - 1)) {
					local51 = true;
					break;
				}
			}
			if (arg7 != 0 && arg9 != 0 && Static103.aClass66Array1[Static93.anInt2428].method1801(local7, arg7, local57, arg0, arg9, arg3, arg2)) {
				local51 = true;
				break;
			}
			local189 = anIntArrayArray20[local7][local57] + 1;
			if (local7 > 0 && Static26.anIntArrayArray8[local7 - 1][local57] == 0 && (local71[local7 - 1][local57] & 0x12C0108) == 0) {
				Static62.anIntArray229[local64] = local7 - 1;
				Static58.anIntArray210[local64] = local57;
				local64 = (local64 + 1) % local74;
				Static26.anIntArrayArray8[local7 - 1][local57] = 2;
				anIntArrayArray20[local7 - 1][local57] = local189;
			}
			if (local7 < 103 && Static26.anIntArrayArray8[local7 + 1][local57] == 0 && (local71[local7 + 1][local57] & 0x12C0180) == 0) {
				Static62.anIntArray229[local64] = local7 + 1;
				Static58.anIntArray210[local64] = local57;
				Static26.anIntArrayArray8[local7 + 1][local57] = 8;
				local64 = (local64 + 1) % local74;
				anIntArrayArray20[local7 + 1][local57] = local189;
			}
			if (local57 > 0 && Static26.anIntArrayArray8[local7][local57 - 1] == 0 && (local71[local7][local57 - 1] & 0x12C0102) == 0) {
				Static62.anIntArray229[local64] = local7;
				Static58.anIntArray210[local64] = local57 - 1;
				Static26.anIntArrayArray8[local7][local57 - 1] = 1;
				anIntArrayArray20[local7][local57 - 1] = local189;
				local64 = (local64 + 1) % local74;
			}
			if (local57 < 103 && Static26.anIntArrayArray8[local7][local57 + 1] == 0 && (local71[local7][local57 + 1] & 0x12C0120) == 0) {
				Static62.anIntArray229[local64] = local7;
				Static58.anIntArray210[local64] = local57 + 1;
				Static26.anIntArrayArray8[local7][local57 + 1] = 4;
				local64 = (local64 + 1) % local74;
				anIntArrayArray20[local7][local57 + 1] = local189;
			}
			if (local7 > 0 && local57 > 0 && Static26.anIntArrayArray8[local7 - 1][local57 - 1] == 0 && (local71[local7 - 1][local57 - 1] & 0x12C010E) == 0 && (local71[local7 - 1][local57] & 0x12C0108) == 0 && (local71[local7][local57 - 1] & 0x12C0102) == 0) {
				Static62.anIntArray229[local64] = local7 - 1;
				Static58.anIntArray210[local64] = local57 - 1;
				Static26.anIntArrayArray8[local7 - 1][local57 - 1] = 3;
				local64 = (local64 + 1) % local74;
				anIntArrayArray20[local7 - 1][local57 - 1] = local189;
			}
			if (local7 < 103 && local57 > 0 && Static26.anIntArrayArray8[local7 + 1][local57 - 1] == 0 && (local71[local7 + 1][local57 - 1] & 0x12C0183) == 0 && (local71[local7 + 1][local57] & 0x12C0180) == 0 && (local71[local7][local57 - 1] & 0x12C0102) == 0) {
				Static62.anIntArray229[local64] = local7 + 1;
				Static58.anIntArray210[local64] = local57 - 1;
				Static26.anIntArrayArray8[local7 + 1][local57 - 1] = 9;
				local64 = (local64 + 1) % local74;
				anIntArrayArray20[local7 + 1][local57 - 1] = local189;
			}
			if (local7 > 0 && local57 < 103 && Static26.anIntArrayArray8[local7 - 1][local57 + 1] == 0 && (local71[local7 - 1][local57 + 1] & 0x12C0138) == 0 && (local71[local7 - 1][local57] & 0x12C0108) == 0 && (local71[local7][local57 + 1] & 0x12C0120) == 0) {
				Static62.anIntArray229[local64] = local7 - 1;
				Static58.anIntArray210[local64] = local57 + 1;
				local64 = (local64 + 1) % local74;
				Static26.anIntArrayArray8[local7 - 1][local57 + 1] = 6;
				anIntArrayArray20[local7 - 1][local57 + 1] = local189;
			}
			if (local7 < 103 && local57 < 103 && Static26.anIntArrayArray8[local7 + 1][local57 + 1] == 0 && (local71[local7 + 1][local57 + 1] & 0x12C01E0) == 0 && (local71[local7 + 1][local57] & 0x12C0180) == 0 && (local71[local7][local57 + 1] & 0x12C0120) == 0) {
				Static62.anIntArray229[local64] = local7 + 1;
				Static58.anIntArray210[local64] = local57 + 1;
				Static26.anIntArrayArray8[local7 + 1][local57 + 1] = 12;
				anIntArrayArray20[local7 + 1][local57 + 1] = local189;
				local64 = (local64 + 1) % local74;
			}
		}
		Static90.anInt2402 = 0;
		@Pc(811) int local811;
		@Pc(816) int local816;
		@Pc(823) int local823;
		if (!local51) {
			if (!arg6) {
				return false;
			}
			local189 = 1000;
			local811 = 100;
			for (local816 = arg2 - 10; local816 <= arg2 + 10; local816++) {
				for (local823 = arg3 - 10; local823 <= arg3 + 10; local823++) {
					if (local816 >= 0 && local823 >= 0 && local816 < 104 && local823 < 104 && anIntArrayArray20[local816][local823] < 100) {
						@Pc(846) int local846 = 0;
						@Pc(848) int local848 = 0;
						if (local816 < arg2) {
							local848 = arg2 - local816;
						} else if (local816 > arg7 + arg2 - 1) {
							local848 = local816 + 1 - arg2 - arg7;
						}
						if (local823 < arg3) {
							local846 = arg3 - local823;
						} else if (local823 > arg3 + arg9 - 1) {
							local846 = local823 + 1 - arg9 - arg3;
						}
						@Pc(917) int local917 = local848 * local848 + local846 * local846;
						if (local917 < local189 || local917 == local189 && local811 > anIntArrayArray20[local816][local823]) {
							local57 = local823;
							local811 = anIntArrayArray20[local816][local823];
							local189 = local917;
							local7 = local816;
						}
					}
				}
			}
			if (local189 == 1000) {
				return false;
			}
			if (arg1 == local7 && local57 == arg4) {
				return false;
			}
			Static90.anInt2402 = 1;
		}
		@Pc(988) byte local988 = 0;
		Static62.anIntArray229[0] = local7;
		local49 = local988 + 1;
		Static58.anIntArray210[0] = local57;
		local189 = local811 = Static26.anIntArrayArray8[local7][local57];
		while (arg1 != local7 || local57 != arg4) {
			if (local811 != local189) {
				local811 = local189;
				Static62.anIntArray229[local49] = local7;
				Static58.anIntArray210[local49++] = local57;
			}
			if ((local189 & 0x1) != 0) {
				local57++;
			} else if ((local189 & 0x4) != 0) {
				local57--;
			}
			if ((local189 & 0x2) != 0) {
				local7++;
			} else if ((local189 & 0x8) != 0) {
				local7--;
			}
			local189 = Static26.anIntArrayArray8[local7][local57];
		}
		if (local49 > 0) {
			local74 = local49;
			if (local49 > 25) {
				local74 = 25;
			}
			local49--;
			local816 = Static58.anIntArray210[local49];
			@Pc(1090) int local1090 = Static62.anIntArray229[local49];
			if (arg5 == 0) {
				Static1.aClass5_Sub14_Sub1_1.method1489(3);
				Static1.aClass5_Sub14_Sub1_1.method1440(local74 + local74 + 3);
			}
			if (arg5 == 1) {
				Static1.aClass5_Sub14_Sub1_1.method1489(154);
				Static1.aClass5_Sub14_Sub1_1.method1440(local74 + local74 + 3 + 14);
			}
			if (arg5 == 2) {
				Static1.aClass5_Sub14_Sub1_1.method1489(89);
				Static1.aClass5_Sub14_Sub1_1.method1440(local74 + local74 + 3);
			}
			Static104.anInt2719 = Static58.anIntArray210[0];
			Static96.anInt2502 = Static62.anIntArray229[0];
			for (local823 = 1; local823 < local74; local823++) {
				local49--;
				Static1.aClass5_Sub14_Sub1_1.method1476(Static62.anIntArray229[local49] - local1090);
				Static1.aClass5_Sub14_Sub1_1.method1440(Static58.anIntArray210[local49] - local816);
			}
			Static1.aClass5_Sub14_Sub1_1.method1468(Static19.anInt623 + local1090);
			Static1.aClass5_Sub14_Sub1_1.method1448(local816 + Static25.anInt730);
			Static1.aClass5_Sub14_Sub1_1.method1440(Static110.aBooleanArray14[82] ? 1 : 0);
			return true;
		} else if (arg5 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIZI)V")
	public static void method1194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static105.anInt3346 == 1) {
			Static119.aClass5_Sub2_Sub1_Sub4Array10[Static8.anInt188 / 100].method2021(Static63.anInt1553 - 8, Static32.anInt963 + -8);
		}
		if (Static105.anInt3346 == 2) {
			Static119.aClass5_Sub2_Sub1_Sub4Array10[Static8.anInt188 / 100 + 4].method2021(Static63.anInt1553 - 8, Static32.anInt963 + -8);
		}
		Static88.method2192();
		if (!Static102.aBoolean98) {
			return;
		}
		@Pc(54) int local54 = arg0 + 512 - 5;
		@Pc(58) int local58 = arg3 + 20;
		Static9.aClass5_Sub2_Sub1_Sub1_Sub1_1.method568(Static123.method1929(new Class61[] { Static72.aClass61_606, Static39.method730(Static1.anInt14) }), local54, local58, 16776960, -1);
		@Pc(79) int local79 = local58 + 15;
		@Pc(81) Runtime local81 = Runtime.getRuntime();
		@Pc(90) int local90 = (int) ((local81.totalMemory() - local81.freeMemory()) / 1024L);
		@Pc(92) int local92 = 16776960;
		if (local90 > 32768 && Static61.aBoolean57) {
			local92 = 16711680;
		}
		if (local90 > 65536 && !Static61.aBoolean57) {
			local92 = 16711680;
		}
		Static9.aClass5_Sub2_Sub1_Sub1_Sub1_1.method568(Static123.method1929(new Class61[] { Static2.aClass61_9, Static39.method730(local90), Static24.aClass61_220 }), local54, local79, local92, -1);
		local58 = local79 + 15;
	}
}
