import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "Lclient!oc;")
	public static Class56 aClass56_39;

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "Lclient!ma;")
	public static Class1_Sub2_Sub2_Sub3 aClass1_Sub2_Sub2_Sub3_1;

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
	public static int anInt1133;

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "[Lclient!b;")
	public static Class1_Sub2_Sub2_Sub1[] aClass1_Sub2_Sub2_Sub1Array4;

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
	public static int anInt1134;

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "Lclient!fc;")
	private static Class25 aClass25_478 = Static78.method1313("glow3:");

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "Lclient!fc;")
	public static Class25 aClass25_468 = aClass25_478;

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "Lclient!fc;")
	private static Class25 aClass25_473 = Static78.method1313("Service unavailable)3");

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "Lclient!fc;")
	public static Class25 aClass25_469 = aClass25_473;

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "Lclient!fc;")
	private static Class25 aClass25_474 = Static78.method1313("Loading friend list");

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "Lclient!fc;")
	public static Class25 aClass25_470 = aClass25_474;

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "Lclient!p;")
	public static Class63 aClass63_6 = new Class63(100);

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "Lclient!fc;")
	private static Class25 aClass25_471 = Static78.method1313("Use");

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "Lclient!fc;")
	public static Class25 aClass25_472 = Static78.method1313("headicons_pk");

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "[I")
	public static int[] anIntArray217 = new int[50];

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "Lclient!fc;")
	public static Class25 aClass25_475 = aClass25_471;

	@OriginalMember(owner = "client!ha", name = "B", descriptor = "Lclient!fc;")
	private static Class25 aClass25_479 = Static78.method1313("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "Lclient!fc;")
	public static Class25 aClass25_476 = aClass25_479;

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "Lclient!fc;")
	public static Class25 aClass25_477 = Static78.method1313("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
	public static int anInt1139 = 0;

	@OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
	public static int anInt1142 = 0;

	@OriginalMember(owner = "client!ha", name = "G", descriptor = "Lclient!fc;")
	public static Class25 aClass25_480 = aClass25_478;

	@OriginalMember(owner = "client!ha", name = "H", descriptor = "Z")
	public static boolean aBoolean46 = false;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIBI)I")
	public static int method936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!oc;ILclient!oc;)V")
	public static void method937(@OriginalArg(0) Class56 arg0, @OriginalArg(2) Class56 arg1) {
		aClass56_39 = arg1;
		Static14.aClass56_15 = arg0;
		Static16.anInt444 = Static14.aClass56_15.method1279(3);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Z")
	public static boolean method938(@OriginalArg(0) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public static void method939() {
		aClass63_6 = null;
		aClass25_476 = null;
		aClass25_470 = null;
		aClass25_473 = null;
		aClass25_477 = null;
		aClass25_475 = null;
		aClass25_468 = null;
		aClass25_469 = null;
		aClass25_474 = null;
		aClass25_472 = null;
		aClass25_480 = null;
		aClass56_39 = null;
		aClass1_Sub2_Sub2_Sub1Array4 = null;
		aClass1_Sub2_Sub2_Sub3_1 = null;
		anIntArray217 = null;
		aClass25_471 = null;
		aClass25_479 = null;
		aClass25_478 = null;
	}
}
