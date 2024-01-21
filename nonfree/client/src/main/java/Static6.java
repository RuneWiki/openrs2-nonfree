import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
	public static int anInt121;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "Lclient!fc;")
	private static Class25 aClass25_53 = Static78.method1313("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "Lclient!fc;")
	public static Class25 aClass25_54 = aClass25_53;

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "Lclient!fc;")
	public static Class25 aClass25_55 = Static78.method1313(":");

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
	public static int anInt115 = -1;

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "Z")
	public static boolean aBoolean3 = false;

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "Lclient!fc;")
	public static Class25 aClass25_56 = Static78.method1313("Untersuchen");

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
	public static volatile int anInt118 = -1;

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "Lclient!fc;")
	public static Class25 aClass25_57 = Static78.method1313("backbase2");

	@OriginalMember(owner = "client!ae", name = "n", descriptor = "Lclient!fc;")
	private static Class25 aClass25_58 = Static78.method1313("Enter name of player to add to list");

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
	public static int anInt120 = 0;

	@OriginalMember(owner = "client!ae", name = "p", descriptor = "Lclient!fc;")
	public static Class25 aClass25_59 = aClass25_58;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V")
	public static void method100(@OriginalArg(0) int arg0) {
		if (Static88.anInt1984 == 0) {
			Static89.aClass1_Sub3_Sub1_2.method340(arg0);
		} else {
			Static126.anInt2930 = arg0;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
	public static void method101() {
		aClass25_54 = null;
		aClass25_55 = null;
		aClass25_59 = null;
		aClass25_53 = null;
		aClass25_56 = null;
		aClass25_57 = null;
		aClass25_58 = null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "([BI)V")
	public static void method102(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class1_Sub5 local10 = new Class1_Sub5(arg0);
		local10.anInt792 = arg0.length - 2;
		Static60.anInt1363 = local10.method651();
		Static88.anIntArray349 = new int[Static60.anInt1363];
		Static13.aByteArrayArray1 = new byte[Static60.anInt1363][];
		Static111.anIntArray434 = new int[Static60.anInt1363];
		Static62.anIntArray267 = new int[Static60.anInt1363];
		Static100.anIntArray402 = new int[Static60.anInt1363];
		local10.anInt792 = arg0.length - Static60.anInt1363 * 8 - 7;
		Static39.anInt1092 = local10.method651();
		Static1.anInt20 = local10.method651();
		@Pc(62) int local62 = (local10.method672() & 0xFF) + 1;
		for (@Pc(64) int local64 = 0; local64 < Static60.anInt1363; local64++) {
			Static111.anIntArray434[local64] = local10.method651();
		}
		for (@Pc(78) int local78 = 0; local78 < Static60.anInt1363; local78++) {
			Static62.anIntArray267[local78] = local10.method651();
		}
		for (@Pc(96) int local96 = 0; local96 < Static60.anInt1363; local96++) {
			Static88.anIntArray349[local96] = local10.method651();
		}
		for (@Pc(119) int local119 = 0; local119 < Static60.anInt1363; local119++) {
			Static100.anIntArray402[local119] = local10.method651();
		}
		local10.anInt792 = arg0.length + 3 - Static60.anInt1363 * 8 - local62 * 3 - 7;
		Static1.anIntArray10 = new int[local62];
		for (@Pc(154) int local154 = 1; local154 < local62; local154++) {
			Static1.anIntArray10[local154] = local10.method660();
			if (Static1.anIntArray10[local154] == 0) {
				Static1.anIntArray10[local154] = 1;
			}
		}
		local10.anInt792 = 0;
		for (@Pc(186) int local186 = 0; local186 < Static60.anInt1363; local186++) {
			@Pc(192) int local192 = Static88.anIntArray349[local186];
			@Pc(196) int local196 = Static100.anIntArray402[local186];
			@Pc(200) int local200 = local192 * local196;
			@Pc(203) byte[] local203 = new byte[local200];
			Static13.aByteArrayArray1[local186] = local203;
			@Pc(211) int local211 = local10.method672();
			@Pc(220) int local220;
			if (local211 == 0) {
				for (local220 = 0; local220 < local200; local220++) {
					local203[local220] = local10.method643();
				}
			} else if (local211 == 1) {
				for (local220 = 0; local220 < local192; local220++) {
					for (@Pc(224) int local224 = 0; local224 < local196; local224++) {
						local203[local220 + local224 * local192] = local10.method643();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V")
	public static void method103() {
		if (Static63.aBoolean55 && Static82.anInt1812 != Static21.anInt596) {
			Static25.method588(Static21.anInt596, Static59.anInt1354, Static25.anInt725, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0]);
		} else if (Static118.anInt2718 != Static21.anInt596) {
			Static118.anInt2718 = Static21.anInt596;
			Static126.method2038(Static21.anInt596);
		}
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)V")
	public static void method104() {
		Static101.aClass7_15.method1096();
		Static67.aClass1_Sub2_Sub2_Sub4_8.method1953(0, 0);
		Static36.method841();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)Z")
	public static boolean method105(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		@Pc(27) Class1_Sub2_Sub6 local27 = Static78.method1315(arg0);
		return local27.method716(arg1);
	}
}
