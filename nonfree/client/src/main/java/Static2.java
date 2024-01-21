import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "Lclient!oa;")
	public static Class1_Sub1_Sub5_Sub3 aClass1_Sub1_Sub5_Sub3_1;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1 = new int[4][13][13];

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
	public static int anInt70 = -1;

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "Lclient!rd;")
	private static Class64 aClass64_79 = Static69.method1153("green:");

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "Lclient!rd;")
	public static Class64 aClass64_80 = Static69.method1153("@yel@");

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "Lclient!rd;")
	public static Class64 aClass64_81 = Static69.method1153("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "Lclient!rd;")
	public static Class64 aClass64_82 = aClass64_79;

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "Lclient!rd;")
	private static Class64 aClass64_87 = Static69.method1153("Invalid username or password)3");

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "Lclient!rd;")
	public static Class64 aClass64_83 = aClass64_87;

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "Lclient!rd;")
	private static Class64 aClass64_86 = Static69.method1153("Your account has been disabled)3");

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "Lclient!rd;")
	public static Class64 aClass64_84 = aClass64_86;

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "Lclient!rd;")
	public static Class64 aClass64_85 = Static69.method1153(":duelreq:");

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public static void method62() {
		aClass64_83 = null;
		aClass64_85 = null;
		aClass1_Sub1_Sub5_Sub3_1 = null;
		anIntArrayArrayArray1 = null;
		aClass64_79 = null;
		aClass64_82 = null;
		aClass64_86 = null;
		aClass64_80 = null;
		aClass64_84 = null;
		aClass64_81 = null;
		aClass64_87 = null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!rd;IBILclient!rd;I)V")
	public static void method63(@OriginalArg(0) int arg0, @OriginalArg(1) Class64 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class64 arg4, @OriginalArg(6) int arg5) {
		if (Static48.anInt2603 >= 500) {
			return;
		}
		if (arg1.method1469() > 0) {
			Static101.aClass64Array16[Static48.anInt2603] = Static82.method1383(new Class64[] { arg4, Static52.aClass64_1821, arg1 });
		} else {
			Static101.aClass64Array16[Static48.anInt2603] = arg4;
		}
		Static95.anIntArray315[Static48.anInt2603] = arg3;
		Static84.anIntArray287[Static48.anInt2603] = arg5;
		Static60.anIntArray207[Static48.anInt2603] = arg0;
		Static96.anIntArray434[Static48.anInt2603] = arg2;
		Static48.anInt2603++;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!pb;I)V")
	public static void method64(@OriginalArg(0) Class41 arg0) {
		Static45.aClass41_28 = arg0;
		Static100.anInt2222 = Static45.aClass41_28.method1068(16);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V")
	public static void method65() {
		Static46.aClass37_15.method1459();
		Static73.aClass1_Sub1_Sub5_Sub3_13.method1290(0, 0);
		Static34.anIntArray121 = Static112.method1980(Static34.anIntArray121);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
	public static void method66() {
		Static9.aClass2_1.method678();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static26.aLongArray3[local10] = 0L;
		}
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			Static19.aLongArray2[local22] = 0L;
		}
		Static66.anInt1525 = 0;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
	public static void method67() {
		if (Static12.anInt1941 != 0 || Static11.aClass1_Sub1_Sub11_1 != null) {
			return;
		}
		@Pc(19) int local19 = Static17.anInt576;
		if (Static103.aBoolean143 && Static118.anInt2842 >= 516 && Static96.anInt2745 >= 160 && Static118.anInt2842 <= 765 && Static96.anInt2745 <= 205) {
			local19 = 0;
		}
		@Pc(48) int local48;
		@Pc(50) int local50;
		@Pc(126) int local126;
		if (!Static94.aBoolean132) {
			if (local19 == 1 && Static48.anInt2603 > 0) {
				local48 = Static95.anIntArray315[Static48.anInt2603 - 1];
				if (local48 == 37 || local48 == 10 || local48 == 1 || local48 == 48 || local48 == 36 || local48 == 28 || local48 == 50 || local48 == 6 || local48 == 31 || local48 == 57 || local48 == 23 || local48 == 1006) {
					local50 = Static60.anIntArray207[Static48.anInt2603 - 1];
					local126 = Static96.anIntArray434[Static48.anInt2603 - 1];
					@Pc(300) Class1_Sub1_Sub11 local300 = Static12.method1397(local126);
					if (Static85.method2010(Static31.method548(local300)) || Static1.method38(Static31.method548(local300))) {
						Static12.anInt1941 = 2;
						Static71.anInt1618 = 0;
						Static87.aBoolean124 = false;
						if (Static95.anInt2177 == local126 >> 16) {
							Static12.anInt1941 = 1;
						}
						if (local126 >> 16 == Static101.anInt2272) {
							Static12.anInt1941 = 3;
						}
						Static62.anInt1456 = local126;
						Static41.anInt2677 = Static96.anInt2745;
						Static12.anInt1939 = Static118.anInt2842;
						Static1.anInt46 = local50;
						return;
					}
				}
			}
			if (local19 == 1 && (Static3.anInt116 == 1 || Static3.method127(Static48.anInt2603 - 1)) && Static48.anInt2603 > 2) {
				local19 = 2;
			}
			if (local19 == 1 && Static48.anInt2603 > 0) {
				Static19.method390(Static48.anInt2603 - 1);
			}
			if (local19 != 2 || Static48.anInt2603 <= 0) {
				return;
			}
			Static89.method1450();
			return;
		}
		if (local19 != 1) {
			local48 = Static81.anInt1404;
			local50 = Static63.anInt1474;
			if (Static12.anInt1938 == 0) {
				local50 -= 4;
				local48 -= 4;
			}
			if (Static12.anInt1938 == 1) {
				local50 -= 205;
				local48 -= 553;
			}
			if (Static12.anInt1938 == 2) {
				local50 -= 357;
				local48 -= 17;
			}
			if (local48 < Static109.anInt2635 - 10 || Static109.anInt2635 + Static110.anInt2655 + 10 < local48 || local50 < Static71.anInt1611 - 10 || local50 > Static71.anInt1611 + Static119.anInt2852 + 10) {
				if (Static12.anInt1938 == 2) {
					Static116.aBoolean166 = true;
				}
				Static94.aBoolean132 = false;
				if (Static12.anInt1938 == 1) {
					Static19.aBoolean41 = true;
				}
			}
		}
		if (local19 != 1) {
			return;
		}
		local50 = Static71.anInt1611;
		local48 = Static109.anInt2635;
		local126 = Static110.anInt2655;
		@Pc(128) int local128 = Static118.anInt2842;
		@Pc(130) int local130 = Static96.anInt2745;
		if (Static12.anInt1938 == 0) {
			local128 -= 4;
			local130 -= 4;
		}
		if (Static12.anInt1938 == 1) {
			local128 -= 553;
			local130 -= 205;
		}
		@Pc(144) int local144 = -1;
		if (Static12.anInt1938 == 2) {
			local128 -= 17;
			local130 -= 357;
		}
		for (@Pc(151) int local151 = 0; local151 < Static48.anInt2603; local151++) {
			@Pc(165) int local165 = local50 + (Static48.anInt2603 - 1 - local151) * 15 + 31;
			if (local128 > local48 && local128 < local48 + local126 && local130 > local165 - 13 && local165 + 3 > local130) {
				local144 = local151;
			}
		}
		if (local144 != -1) {
			Static19.method390(local144);
		}
		if (Static12.anInt1938 == 1) {
			Static19.aBoolean41 = true;
		}
		Static94.aBoolean132 = false;
		if (Static12.anInt1938 == 2) {
			Static116.aBoolean166 = true;
			return;
		}
	}
}
