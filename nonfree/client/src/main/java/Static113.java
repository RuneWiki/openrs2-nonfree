import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
	public static int anInt2442;

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
	public static int anInt2444;

	@OriginalMember(owner = "client!tc", name = "r", descriptor = "J")
	public static long aLong86;

	@OriginalMember(owner = "client!tc", name = "u", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!tc", name = "w", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "Lclient!u;")
	private static Class74 aClass74_1547 = Static72.method1077("yellow:");

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "Lclient!u;")
	public static Class74 aClass74_1546 = aClass74_1547;

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "Lclient!da;")
	public static Class13 aClass13_58 = new Class13();

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "Lclient!u;")
	public static Class74 aClass74_1548 = Static72.method1077("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "Lclient!u;")
	public static Class74 aClass74_1549 = aClass74_1547;

	@OriginalMember(owner = "client!tc", name = "t", descriptor = "Lclient!u;")
	private static Class74 aClass74_1551 = Static72.method1077("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!tc", name = "s", descriptor = "Lclient!u;")
	public static Class74 aClass74_1550 = aClass74_1551;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!vd;II)V")
	public static void method1687(@OriginalArg(1) Class2_Sub2_Sub2_Sub1_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0.anInt2670 && arg1 != -1) {
			@Pc(26) int local26 = Static12.method270(arg1).anInt1528;
			if (local26 == 1) {
				arg0.anInt2677 = 0;
				arg0.anInt2719 = 0;
				arg0.anInt2690 = 0;
				arg0.anInt2675 = arg2;
			}
			if (local26 == 2) {
				arg0.anInt2719 = 0;
				return;
			}
		} else if (arg1 == -1 || arg0.anInt2670 == -1 || Static12.method270(arg1).anInt1527 >= Static12.method270(arg0.anInt2670).anInt1527) {
			arg0.anInt2684 = arg0.anInt2691;
			arg0.anInt2719 = 0;
			arg0.anInt2690 = 0;
			arg0.anInt2677 = 0;
			arg0.anInt2670 = arg1;
			arg0.anInt2675 = arg2;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	public static void method1688() {
		aClass74_1546 = null;
		aClass74_1551 = null;
		anIntArrayArrayArray5 = null;
		aClass13_58 = null;
		aClass74_1547 = null;
		aByteArrayArrayArray7 = null;
		aClass74_1549 = null;
		aClass74_1548 = null;
		aClass74_1550 = null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V")
	public static void method1689() {
		Static57.anInt1378++;
		Static18.method408(true);
		Static89.method1327(true);
		Static18.method408(false);
		Static89.method1327(false);
		Static7.method1858();
		Static32.method586();
		@Pc(29) int local29;
		@Pc(61) int local61;
		if (!Static90.aBoolean76) {
			local29 = Static86.anInt1843;
			if (local29 < Static97.anInt2891 / 256) {
				local29 = Static97.anInt2891 / 256;
			}
			if (Static125.aBooleanArray15[4] && Static98.anIntArray309[4] + 128 > local29) {
				local29 = Static98.anIntArray309[4] + 128;
			}
			local61 = Static18.anInt562 + Static40.anInt957 & 0x7FF;
			Static39.method663(Static17.anInt536, local61, Static15.method348(Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2673, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2672, Static117.anInt2529) - 50, local29, Static86.anInt1842, local29 * 3 + 600);
		}
		if (Static90.aBoolean76) {
			local29 = Static7.method1860();
		} else {
			local29 = Static127.method1929();
		}
		@Pc(93) int local93 = Static12.anInt362;
		local61 = anInt2444;
		@Pc(97) int local97 = Static40.anInt958;
		@Pc(99) int local99 = Static53.anInt1290;
		@Pc(101) int local101 = Static100.anInt2211;
		for (@Pc(103) int local103 = 0; local103 < 5; local103++) {
			if (Static125.aBooleanArray15[local103]) {
				@Pc(144) int local144 = (int) (Math.random() * (double) (Static67.anIntArray183[local103] * 2 + 1) - (double) Static67.anIntArray183[local103] + Math.sin((double) Static86.anIntArray259[local103] / 100.0D * (double) Static106.anIntArray328[local103]) * (double) Static98.anIntArray309[local103]);
				if (local103 == 4) {
					Static53.anInt1290 += local144;
					if (Static53.anInt1290 < 128) {
						Static53.anInt1290 = 128;
					}
					if (Static53.anInt1290 > 383) {
						Static53.anInt1290 = 383;
					}
				}
				if (local103 == 2) {
					Static40.anInt958 += local144;
				}
				if (local103 == 3) {
					Static100.anInt2211 = Static100.anInt2211 + local144 & 0x7FF;
				}
				if (local103 == 1) {
					Static12.anInt362 += local144;
				}
				if (local103 == 0) {
					anInt2444 += local144;
				}
			}
		}
		Static71.method1071();
		Static76.anInt1634 = Static46.anInt1062 - 4;
		Static76.anInt1635 = 0;
		Static76.anInt1631 = Static62.anInt1414 - 4;
		Static76.aBoolean64 = true;
		Static31.method574();
		Static58.method698();
		Static31.method574();
		Static84.aClass69_1.method1611(anInt2444, Static12.anInt362, Static40.anInt958, Static53.anInt1290, Static100.anInt2211, local29);
		Static31.method574();
		Static84.aClass69_1.method1621();
		Static43.method687();
		Static77.method1206();
		((Class46) Static44.anInterface2_1).method1063(Static15.anInt429);
		Static14.method336();
		if (Static105.aBoolean97 && Static91.method1339() == 0) {
			Static105.aBoolean97 = false;
		}
		if (Static105.aBoolean97) {
			Static71.method1071();
			Static58.method698();
			Static9.method226(Static92.aClass74_1314, null, false);
		}
		Static31.method574();
		Static68.method1034();
		anInt2444 = local61;
		Static100.anInt2211 = local101;
		Static40.anInt958 = local97;
		Static53.anInt1290 = local99;
		Static12.anInt362 = local93;
	}
}
