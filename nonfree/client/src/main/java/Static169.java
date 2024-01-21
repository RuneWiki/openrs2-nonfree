import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
	public static int anInt3668;

	@OriginalMember(owner = "client!vc", name = "A", descriptor = "Lclient!fa;")
	public static Class23 aClass23_12;

	@OriginalMember(owner = "client!vc", name = "B", descriptor = "Lclient!kh;")
	public static Class29 aClass29_70;

	@OriginalMember(owner = "client!vc", name = "p", descriptor = "Lclient!va;")
	public static Class2_Sub11 aClass2_Sub11_5 = new Class2_Sub11(new byte[5000]);

	@OriginalMember(owner = "client!vc", name = "C", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1570 = Static51.method932("Close");

	@OriginalMember(owner = "client!vc", name = "s", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1567 = aClass10_1570;

	@OriginalMember(owner = "client!vc", name = "w", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1568 = Static51.method932("Registrierter Benutzer");

	@OriginalMember(owner = "client!vc", name = "z", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1569 = Static51.method932("http:)4)4www)3runescape)3com");

	@OriginalMember(owner = "client!vc", name = "D", descriptor = "Lclient!fa;")
	public static Class23 aClass23_13 = null;

	@OriginalMember(owner = "client!vc", name = "G", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1573 = Static51.method932("The server is being updated)3");

	@OriginalMember(owner = "client!vc", name = "E", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1571 = aClass10_1573;

	@OriginalMember(owner = "client!vc", name = "F", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1572 = Static51.method932(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!vc", name = "I", descriptor = "[I")
	public static int[] anIntArray397 = new int[4000];

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!cg;Lclient!kh;ZLclient!kh;B)V")
	public static void method2594(@OriginalArg(0) Class2_Sub1_Sub4_Sub1_Sub1 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class29 arg3) {
		Static55.aClass29_27 = arg1;
		Static56.aBoolean62 = arg2;
		Static72.aClass29_33 = arg3;
		Static58.anInt1469 = Static72.aClass29_33.method1039(10);
		Static7.aClass2_Sub1_Sub4_Sub1_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!fa;IB)I")
	public static int method2595(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anIntArrayArray14 == null || arg1 >= arg0.anIntArrayArray14.length) {
			return -2;
		}
		try {
			@Pc(24) int[] local24 = arg0.anIntArrayArray14[arg1];
			@Pc(26) byte local26 = 0;
			@Pc(28) int local28 = 0;
			@Pc(30) int local30 = 0;
			while (true) {
				@Pc(44) int local44 = local24[local28++];
				@Pc(46) byte local46 = 0;
				@Pc(48) int local48 = 0;
				if (local44 == 0) {
					return local30;
				}
				if (local44 == 1) {
					local48 = Static99.anIntArray241[local24[local28++]];
				}
				if (local44 == 15) {
					local46 = 1;
				}
				if (local44 == 16) {
					local46 = 2;
				}
				if (local44 == 17) {
					local46 = 3;
				}
				if (local44 == 2) {
					local48 = Static58.anIntArray165[local24[local28++]];
				}
				if (local44 == 3) {
					local48 = Static138.anIntArray327[local24[local28++]];
				}
				@Pc(113) int local113;
				@Pc(124) Class23 local124;
				@Pc(129) int local129;
				@Pc(141) int local141;
				if (local44 == 4) {
					local113 = local24[local28++] << 16;
					@Pc(120) int local120 = local113 + local24[local28++];
					local124 = Static102.method2541(local120);
					local129 = local24[local28++];
					if (local129 != -1 && (!Static78.method577(local129).aBoolean64 || Static165.aBoolean157)) {
						for (local141 = 0; local141 < local124.anIntArray131.length; local141++) {
							if (local124.anIntArray131[local141] == local129 + 1) {
								local48 += local124.anIntArray126[local141];
							}
						}
					}
				}
				if (local44 == 5) {
					local48 = Static51.anIntArray143[local24[local28++]];
				}
				if (local44 == 6) {
					local48 = Class2_Sub2_Sub19.anIntArray224[Static58.anIntArray165[local24[local28++]] - 1];
				}
				if (local44 == 7) {
					local48 = Static51.anIntArray143[local24[local28++]] * 100 / 46875;
				}
				if (local44 == 8) {
					local48 = Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt1348;
				}
				if (local44 == 9) {
					for (local113 = 0; local113 < 25; local113++) {
						if (Static11.aBooleanArray17[local113]) {
							local48 += Static58.anIntArray165[local113];
						}
					}
				}
				if (local44 == 10) {
					local113 = local24[local28++] << 16;
					local113 += local24[local28++];
					local124 = Static102.method2541(local113);
					local129 = local24[local28++];
					if (local129 != -1 && (!Static78.method577(local129).aBoolean64 || Static165.aBoolean157)) {
						for (local141 = 0; local141 < local124.anIntArray131.length; local141++) {
							if (local129 + 1 == local124.anIntArray131[local141]) {
								local48 = 999999999;
								break;
							}
						}
					}
				}
				if (local44 == 11) {
					local48 = Static68.anInt1630;
				}
				if (local44 == 12) {
					local48 = Static24.anInt559;
				}
				if (local44 == 13) {
					local113 = Static51.anIntArray143[local24[local28++]];
					@Pc(329) int local329 = local24[local28++];
					local48 = (0x1 << local329 & local113) == 0 ? 0 : 1;
				}
				if (local44 == 14) {
					local113 = local24[local28++];
					local48 = Static26.method592(local113);
				}
				if (local44 == 18) {
					local48 = Static137.anInt3049 + (Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3454 >> 7);
				}
				if (local44 == 19) {
					local48 = Static85.anInt1937 + (Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3499 >> 7);
				}
				if (local44 == 20) {
					local48 = local24[local28++];
				}
				if (local46 == 0) {
					if (local26 == 0) {
						local30 += local48;
					}
					if (local26 == 1) {
						local30 -= local48;
					}
					if (local26 == 2 && local48 != 0) {
						local30 /= local48;
					}
					if (local26 == 3) {
						local30 *= local48;
					}
					local26 = 0;
				} else {
					local26 = local46;
				}
			}
		} catch (@Pc(426) Exception local426) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)V")
	public static void method2596() {
		aClass10_1570 = null;
		aClass10_1572 = null;
		aClass10_1573 = null;
		aClass23_12 = null;
		aClass2_Sub11_5 = null;
		aClass10_1568 = null;
		aClass10_1571 = null;
		aClass23_13 = null;
		aClass10_1567 = null;
		aClass29_70 = null;
		aClass10_1569 = null;
		anIntArray397 = null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BLclient!cd;)Z")
	public static boolean method2597(@OriginalArg(1) Class10 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static76.anInt1789; local11++) {
			if (arg0.method343(Static5.aClass10Array2[local11])) {
				return true;
			}
		}
		return arg0.method343(Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.aClass10_598);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!kh;III)[Lclient!oe;")
	public static Class2_Sub1_Sub4_Sub3[] method2598(@OriginalArg(0) Class29 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static111.method1762(arg2, arg1, arg0) ? Static163.method2471() : null;
	}
}
