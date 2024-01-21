import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ia", name = "db", descriptor = "[Lclient!ah;")
	public static Class2_Sub5[] aClass2_Sub5Array1;

	@OriginalMember(owner = "client!ia", name = "eb", descriptor = "Lclient!k;")
	public static Class43 aClass43_2;

	@OriginalMember(owner = "client!ia", name = "tb", descriptor = "J")
	public static long aLong93;

	@OriginalMember(owner = "client!ia", name = "V", descriptor = "Lclient!ai;")
	private static Class6 aClass6_471 = Static38.method685("Existing User");

	@OriginalMember(owner = "client!ia", name = "X", descriptor = "Lclient!ai;")
	private static Class6 aClass6_472 = Static38.method685("Ok");

	@OriginalMember(owner = "client!ia", name = "Y", descriptor = "Lclient!ai;")
	private static Class6 aClass6_473 = Static38.method685("Loaded input handler");

	@OriginalMember(owner = "client!ia", name = "Z", descriptor = "I")
	public static int anInt1610 = 1;

	@OriginalMember(owner = "client!ia", name = "bb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_474 = aClass6_471;

	@OriginalMember(owner = "client!ia", name = "fb", descriptor = "I")
	public static int anInt1613 = 0;

	@OriginalMember(owner = "client!ia", name = "hb", descriptor = "I")
	public static int anInt1615 = -1;

	@OriginalMember(owner = "client!ia", name = "ib", descriptor = "Lclient!ai;")
	public static Class6 aClass6_475 = aClass6_472;

	@OriginalMember(owner = "client!ia", name = "kb", descriptor = "I")
	public static int anInt1617 = 0;

	@OriginalMember(owner = "client!ia", name = "ob", descriptor = "Lclient!ai;")
	public static Class6 aClass6_476 = aClass6_473;

	@OriginalMember(owner = "client!ia", name = "rb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_477 = Static38.method685("hel");

	@OriginalMember(owner = "client!ia", name = "ub", descriptor = "I")
	public static int anInt1624 = 1;

	@OriginalMember(owner = "client!ia", name = "vb", descriptor = "I")
	public static int anInt1625 = 2;

	@OriginalMember(owner = "client!ia", name = "xb", descriptor = "[I")
	public static int[] anIntArray104 = new int[500];

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(JB)V")
	public static void method1034(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(8) InterruptedException local8) {
		}
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V")
	public static void method1035() {
		aClass6_473 = null;
		aClass2_Sub5Array1 = null;
		aClass43_2 = null;
		aClass6_477 = null;
		anIntArray104 = null;
		aClass6_475 = null;
		aClass6_474 = null;
		aClass6_471 = null;
		aClass6_476 = null;
		aClass6_472 = null;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(III)I")
	public static int method1036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(36) int local36 = Static113.method1828(arg1 - 1, arg0 + -1) + Static113.method1828(arg1 - 1, arg0 + 1) + Static113.method1828(arg1 - -1, arg0 - 1) + Static113.method1828(arg1 + 1, arg0 + 1);
		@Pc(69) int local69 = Static113.method1828(arg1, arg0 - 1) + Static113.method1828(arg1, arg0 + 1) + Static113.method1828(arg1 + -1, arg0) + Static113.method1828(arg1 - -1, arg0);
		@Pc(74) int local74 = Static113.method1828(arg1, arg0);
		return local74 / 4 + local36 / 16 + local69 / 8;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(JB)V")
	public static void method1037(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < Static111.anInt2637; local12++) {
			if (Static102.aLongArray3[local12] == arg0) {
				Static111.anInt2637--;
				for (@Pc(30) int local30 = local12; local30 < Static111.anInt2637; local30++) {
					Static118.aClass6Array16[local30] = Static118.aClass6Array16[local30 + 1];
					Static41.anIntArray62[local30] = Static41.anIntArray62[local30 + 1];
					Static102.aLongArray3[local30] = Static102.aLongArray3[local30 + 1];
					Static67.anIntArray110[local30] = Static67.anIntArray110[local30 + 1];
				}
				Static86.anInt2209 = Static7.anInt124;
				Static66.aClass2_Sub13_Sub1_2.method1455(184);
				Static66.aClass2_Sub13_Sub1_2.method1418(arg0);
				break;
			}
		}
	}
}
