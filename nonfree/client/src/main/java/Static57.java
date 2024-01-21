import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!j", name = "y", descriptor = "[I")
	public static int[] anIntArray171;

	@OriginalMember(owner = "client!j", name = "L", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!j", name = "u", descriptor = "Lclient!id;")
	public static Class34 aClass34_754 = Static9.method266("gelb:");

	@OriginalMember(owner = "client!j", name = "z", descriptor = "Lclient!id;")
	private static Class34 aClass34_756 = Static9.method266("Your friend list is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!j", name = "x", descriptor = "Lclient!id;")
	public static Class34 aClass34_755 = aClass34_756;

	@OriginalMember(owner = "client!j", name = "C", descriptor = "Lclient!qd;")
	public static Class63 aClass63_10 = new Class63(64);

	@OriginalMember(owner = "client!j", name = "H", descriptor = "Lclient!id;")
	public static Class34 aClass34_757 = Static9.method266("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!j", name = "K", descriptor = "Lclient!id;")
	private static Class34 aClass34_760 = Static9.method266("glow2:");

	@OriginalMember(owner = "client!j", name = "I", descriptor = "Lclient!id;")
	public static Class34 aClass34_758 = aClass34_760;

	@OriginalMember(owner = "client!j", name = "J", descriptor = "Lclient!id;")
	public static Class34 aClass34_759 = Static9.method266("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!j", name = "M", descriptor = "Lclient!id;")
	public static Class34 aClass34_761 = aClass34_760;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ZII)V")
	public static void method1021(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub1_Sub3 local12 = Static105.method1721(arg1);
		@Pc(15) int local15 = local12.anInt360;
		@Pc(18) int local18 = local12.anInt367;
		@Pc(21) int local21 = local12.anInt357;
		@Pc(28) int local28 = Class43.anIntArray212[local21 - local18];
		if (arg0 < 0 || arg0 > local28) {
			arg0 = 0;
		}
		local28 <<= local18;
		Static39.anIntArray116[local15] = arg0 << local18 & local28 | ~local28 & Static39.anIntArray116[local15];
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V")
	public static void method1022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static67.aClass1_Sub1_Sub2_Sub2Array7[0].method542(arg3, arg1);
		Static67.aClass1_Sub1_Sub2_Sub2Array7[1].method542(arg3, arg0 + arg1 - 16);
		Static111.method1747(arg3, arg1 + 16, 16, arg0 - 32, Static133.anInt3173);
		@Pc(37) int local37 = arg0 * (arg0 - 32) / arg2;
		if (local37 < 8) {
			local37 = 8;
		}
		@Pc(57) int local57 = arg4 * (arg0 - local37 - 32) / (arg2 - arg0);
		Static111.method1747(arg3, local57 + arg1 + 16, 16, local37, Static102.anInt2584);
		Static111.method1754(arg3, arg1 + local57 + 16, local37, Static89.anInt1973);
		Static111.method1754(arg3 + 1, arg1 + 16 + local57, local37, Static89.anInt1973);
		Static111.method1757(arg3, local57 + arg1 + 16, 16, Static89.anInt1973);
		Static111.method1757(arg3, arg1 + local57 + 17, 16, Static89.anInt1973);
		Static111.method1754(arg3 + 15, local57 + arg1 + 16, local37, Static76.anInt2061);
		Static111.method1754(arg3 + 14, arg1 + 17 - -local57, local37 - 1, Static76.anInt2061);
		Static111.method1757(arg3, local37 + local57 + arg1 + 15, 16, Static76.anInt2061);
		Static111.method1757(arg3 + 1, local37 + local57 + 14 + arg1, 15, Static76.anInt2061);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
	public static void method1023() {
		try {
			if (Static93.anInt2429 == 1) {
				@Pc(10) int local10 = Static22.aClass1_Sub4_Sub1_1.method324();
				if (local10 > 0 && Static22.aClass1_Sub4_Sub1_1.method327()) {
					local10 -= Static76.anInt2063;
					if (local10 < 0) {
						local10 = 0;
					}
					Static22.aClass1_Sub4_Sub1_1.method337(local10);
					return;
				}
				Static22.aClass1_Sub4_Sub1_1.method334();
				Static22.aClass1_Sub4_Sub1_1.method335();
				Static45.aClass1_Sub13_10 = null;
				if (Static98.aClass35_25 == null) {
					Static93.anInt2429 = 0;
				} else {
					Static93.anInt2429 = 2;
				}
				Static15.aClass42_1 = null;
			}
		} catch (@Pc(53) Exception local53) {
			local53.printStackTrace();
			Static22.aClass1_Sub4_Sub1_1.method334();
			Static45.aClass1_Sub13_10 = null;
			Static15.aClass42_1 = null;
			Static98.aClass35_25 = null;
			Static93.anInt2429 = 0;
		}
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V")
	public static void method1024() {
		Static77.anIntArray243 = new int[151];
		Static105.anIntArray324 = new int[33];
		Static56.anIntArray305 = new int[33];
		anIntArray171 = new int[151];
		@Pc(21) int local21;
		@Pc(23) int local23;
		for (@Pc(15) int local15 = 0; local15 < 33; local15++) {
			@Pc(19) int local19 = 999;
			local21 = 0;
			for (local23 = 0; local23 < 34; local23++) {
				if (Static45.aClass1_Sub1_Sub2_Sub2_14.aByteArray12[local15 * Static45.aClass1_Sub1_Sub2_Sub2_14.anInt883 + local23] == 0) {
					if (local19 == 999) {
						local19 = local23;
					}
				} else if (local19 != 999) {
					local21 = local23;
					break;
				}
			}
			Static105.anIntArray324[local15] = local19;
			Static56.anIntArray305[local15] = local21 - local19;
		}
		for (local21 = 5; local21 < 156; local21++) {
			local23 = 999;
			@Pc(95) int local95 = 0;
			for (@Pc(97) int local97 = 25; local97 < 172; local97++) {
				if (Static45.aClass1_Sub1_Sub2_Sub2_14.aByteArray12[Static45.aClass1_Sub1_Sub2_Sub2_14.anInt883 * local21 + local97] == 0 && (local97 > 34 || local21 > 34)) {
					if (local23 == 999) {
						local23 = local97;
					}
				} else if (local23 != 999) {
					local95 = local97;
					break;
				}
			}
			anIntArray171[local21 - 5] = local23 - 25;
			Static77.anIntArray243[local21 - 5] = local95 - local23;
		}
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(B)V")
	public static void method1025() {
		aClass34_759 = null;
		aByteArrayArray6 = null;
		aClass34_761 = null;
		aClass34_757 = null;
		aClass34_756 = null;
		aClass34_760 = null;
		aClass34_754 = null;
		anIntArray171 = null;
		aClass63_10 = null;
		aClass34_758 = null;
		aClass34_755 = null;
	}
}
