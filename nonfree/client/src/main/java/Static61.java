import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!ka", name = "J", descriptor = "Lclient!kc;")
	public static Class22 aClass22_13;

	@OriginalMember(owner = "client!ka", name = "B", descriptor = "Lclient!wd;")
	private static Class80 aClass80_645 = Static2.method59("red:");

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "Lclient!wd;")
	public static Class80 aClass80_637 = aClass80_645;

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "Lclient!wd;")
	public static Class80 aClass80_638 = Static2.method59("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!ka", name = "z", descriptor = "Lclient!wd;")
	private static Class80 aClass80_644 = Static2.method59("Enter name of friend to delete from list");

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "Lclient!wd;")
	public static Class80 aClass80_639 = aClass80_644;

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "Lclient!wd;")
	public static Class80 aClass80_640 = Static2.method59(" )2> @cya@");

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "Lclient!wd;")
	public static Class80 aClass80_641 = Static2.method59(")1j");

	@OriginalMember(owner = "client!ka", name = "t", descriptor = "I")
	public static int anInt1790 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!ka", name = "u", descriptor = "Lclient!wd;")
	public static Class80 aClass80_642 = aClass80_645;

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "Lclient!wd;")
	public static Class80 aClass80_643 = Static2.method59("va");

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "Lclient!i;")
	public static Class32 aClass32_35 = new Class32(64);

	@OriginalMember(owner = "client!ka", name = "E", descriptor = "I")
	public static int anInt1794 = 0;

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "Lclient!wd;")
	private static Class80 aClass80_653 = Static2.method59("From");

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "Lclient!wd;")
	public static Class80 aClass80_646 = aClass80_653;

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "Lclient!wd;")
	private static Class80 aClass80_647 = Static2.method59("This world is full)3");

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "Lclient!wd;")
	public static Class80 aClass80_648 = Static2.method59("rot:");

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "Lclient!wd;")
	private static Class80 aClass80_649 = Static2.method59("Your account has been disabled)3");

	@OriginalMember(owner = "client!ka", name = "K", descriptor = "Lclient!wd;")
	public static Class80 aClass80_650 = aClass80_649;

	@OriginalMember(owner = "client!ka", name = "L", descriptor = "Lclient!wd;")
	public static Class80 aClass80_651 = aClass80_647;

	@OriginalMember(owner = "client!ka", name = "M", descriptor = "Lclient!wd;")
	public static Class80 aClass80_652 = Static2.method59("titlebox");

	@OriginalMember(owner = "client!ka", name = "N", descriptor = "Z")
	public static boolean aBoolean124 = false;

	@OriginalMember(owner = "client!ka", name = "Q", descriptor = "I")
	public static int anInt1795 = 0;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)I")
	public static int method1053(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
	public static void method1054() {
		aClass80_650 = null;
		aClass80_641 = null;
		aClass80_645 = null;
		aClass80_647 = null;
		aClass80_648 = null;
		aClass80_644 = null;
		aClass80_640 = null;
		aClass80_639 = null;
		aClass80_653 = null;
		aClass32_35 = null;
		aClass80_638 = null;
		aClass80_642 = null;
		aClass80_651 = null;
		aClass80_637 = null;
		aClass80_652 = null;
		aClass80_649 = null;
		aClass22_13 = null;
		aClass80_643 = null;
		aClass80_646 = null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ff;Lclient!ff;ZBI)Lclient!te;")
	public static Class2_Sub1_Sub16 method1055(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(4) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(17) int[] local17 = arg1.method381(arg2);
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(31) byte[] local31 = arg1.method390(arg2, local17[local19]);
			if (local31 == null) {
				local7 = false;
			} else {
				@Pc(51) int local51 = (local31[0] & 0xFF) << 8 | local31[1] & 0xFF;
				@Pc(67) byte[] local67 = arg0.method390(local51, 0);
				if (local67 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class2_Sub1_Sub16(arg1, arg0, arg2, false);
		} catch (@Pc(89) Exception local89) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)Lclient!va;")
	public static Class2_Sub1_Sub17 method1057(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class2_Sub1_Sub17 local3 = Static123.method1976(arg1);
		if (arg0 == -1) {
			return local3;
		} else if (local3 == null || local3.aClass2_Sub1_Sub17Array2 == null || arg0 >= local3.aClass2_Sub1_Sub17Array2.length) {
			return null;
		} else {
			return local3.aClass2_Sub1_Sub17Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)V")
	public static void method1059(@OriginalArg(0) int arg0) {
		@Pc(8) int[] local8 = Static85.aClass2_Sub1_Sub9_Sub1_7.anIntArray185;
		@Pc(11) int local11 = local8.length;
		for (@Pc(17) int local17 = 0; local17 < local11; local17++) {
			local8[local17] = 0;
		}
		@Pc(41) int local41;
		@Pc(43) int local43;
		for (@Pc(29) int local29 = 1; local29 < 103; local29++) {
			local41 = (103 - local29) * 4 * 512 + 24628;
			for (local43 = 1; local43 < 103; local43++) {
				if ((Static108.aByteArrayArrayArray7[arg0][local43][local29] & 0x18) == 0) {
					Static93.aClass64_1.method1630(local8, local41, arg0, local43, local29);
				}
				if (arg0 < 3 && (Static108.aByteArrayArrayArray7[arg0 + 1][local43][local29] & 0x8) != 0) {
					Static93.aClass64_1.method1630(local8, local41, arg0 + 1, local43, local29);
				}
				local41 += 4;
			}
		}
		Static85.aClass2_Sub1_Sub9_Sub1_7.method815();
		local41 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (238 - -((int) (Math.random() * 20.0D)) + -10 << 8) + 238 - 10;
		local43 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(154) int local154;
		for (@Pc(150) int local150 = 1; local150 < 103; local150++) {
			for (local154 = 1; local154 < 103; local154++) {
				if ((Static108.aByteArrayArrayArray7[arg0][local154][local150] & 0x18) == 0) {
					Static4.method96(arg0, local43, local154, local150, local41);
				}
				if (arg0 < 3 && (Static108.aByteArrayArrayArray7[arg0 + 1][local154][local150] & 0x8) != 0) {
					Static4.method96(arg0 + 1, local43, local154, local150, local41);
				}
			}
		}
		Static2.anInt120 = 0;
		for (local154 = 0; local154 < 104; local154++) {
			for (@Pc(221) int local221 = 0; local221 < 104; local221++) {
				@Pc(229) int local229 = Static93.aClass64_1.method1620(Static16.anInt444, local154, local221);
				if (local229 != 0) {
					local229 = local229 >> 14 & 0x7FFF;
					@Pc(242) int local242 = Static18.method404(local229).anInt1633;
					if (local242 >= 0) {
						@Pc(249) int local249 = local221;
						@Pc(251) int local251 = local154;
						if (local242 != 22 && local242 != 29 && local242 != 34 && local242 != 36 && local242 != 46 && local242 != 47 && local242 != 48) {
							@Pc(281) int[][] local281 = Static17.aClass49Array1[Static16.anInt444].anIntArrayArray24;
							for (@Pc(283) int local283 = 0; local283 < 10; local283++) {
								@Pc(290) int local290 = (int) (Math.random() * 4.0D);
								if (local290 == 0 && local251 > 0 && local251 > local154 - 3 && (local281[local251 - 1][local249] & 0x1280108) == 0) {
									local251--;
								}
								if (local290 == 1 && local251 < 103 && local251 < local154 + 3 && (local281[local251 + 1][local249] & 0x1280180) == 0) {
									local251++;
								}
								if (local290 == 2 && local249 > 0 && local249 > local221 - 3 && (local281[local251][local249 - 1] & 0x1280102) == 0) {
									local249--;
								}
								if (local290 == 3 && local249 < 103 && local249 < local221 + 3 && (local281[local251][local249 + 1] & 0x1280120) == 0) {
									local249++;
								}
							}
						}
						Static77.aClass2_Sub1_Sub9_Sub1Array9[Static2.anInt120] = Static53.aClass2_Sub1_Sub9_Sub1Array7[local242];
						Static16.anIntArray67[Static2.anInt120] = local251;
						Static14.anIntArray64[Static2.anInt120] = local249;
						Static2.anInt120++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)V")
	public static void method1062() {
		Static120.aClass2_Sub17_Sub1_3.method1799(197);
		if (Static97.anInt2559 != -1) {
			Static59.method1042(Static97.anInt2559);
			Static97.anInt2559 = -1;
			Static57.aBoolean119 = true;
			Static124.anInt3134 = -1;
			Static70.aBoolean131 = true;
		}
		if (Static57.anInt1737 != -1) {
			Static59.method1042(Static57.anInt1737);
			Static124.anInt3134 = -1;
			Static37.aBoolean77 = true;
			Static57.anInt1737 = -1;
		}
		if (Static91.anInt2232 != -1) {
			Static59.method1042(Static91.anInt2232);
			Static91.anInt2232 = -1;
			Static10.method167(30);
		}
		if (Static121.anInt3090 != -1) {
			Static59.method1042(Static121.anInt3090);
			Static121.anInt3090 = -1;
		}
		if (Static90.anInt2214 != -1) {
			Static59.method1042(Static90.anInt2214);
			Static90.anInt2214 = -1;
			Static124.anInt3134 = -1;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI)V")
	public static void method1064(@OriginalArg(0) boolean arg0) {
		for (@Pc(11) int local11 = 0; local11 < Static110.anInt2908; local11++) {
			@Pc(22) int local22 = (Static85.anIntArray277[local11] << 14) + 536870912;
			@Pc(28) Class2_Sub1_Sub1_Sub4_Sub1 local28 = Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1[Static85.anIntArray277[local11]];
			if (local28 != null && local28.method1431() && arg0 == local28.aClass2_Sub1_Sub13_1.aBoolean190 && local28.aClass2_Sub1_Sub13_1.method1580()) {
				@Pc(49) int local49 = local28.anInt2370 >> 7;
				@Pc(54) int local54 = local28.anInt2324 >> 7;
				if (local49 >= 0 && local49 < 104 && local54 >= 0 && local54 < 104) {
					if (local28.anInt2364 == 1 && (local28.anInt2370 & 0x7F) == 64 && (local28.anInt2324 & 0x7F) == 64) {
						if (Static48.anInt1498 == Static98.anIntArrayArray27[local49][local54]) {
							continue;
						}
						Static98.anIntArrayArray27[local49][local54] = Static48.anInt1498;
					}
					if (!local28.aClass2_Sub1_Sub13_1.aBoolean189) {
						local22 += Integer.MIN_VALUE;
					}
					Static93.aClass64_1.method1633(Static16.anInt444, local28.anInt2370, local28.anInt2324, Static24.method513(local28.anInt2364 * 64 + local28.anInt2370 - 64, Static16.anInt444, local28.anInt2324 + local28.anInt2364 * 64 - 64), local28.anInt2364 * 64 + 60 - 64, local28, local28.anInt2347, local22, local28.aBoolean169);
				}
			}
		}
	}
}
