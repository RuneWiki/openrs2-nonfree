import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!le", name = "W", descriptor = "I")
	public static int anInt1935;

	@OriginalMember(owner = "client!le", name = "Y", descriptor = "Lclient!kc;")
	public static Class11 aClass11_10;

	@OriginalMember(owner = "client!le", name = "eb", descriptor = "I")
	public static int anInt1941;

	@OriginalMember(owner = "client!le", name = "lb", descriptor = "I")
	public static int anInt1945;

	@OriginalMember(owner = "client!le", name = "mb", descriptor = "Lclient!kc;")
	public static Class11 aClass11_11;

	@OriginalMember(owner = "client!le", name = "sb", descriptor = "I")
	public static int anInt1946;

	@OriginalMember(owner = "client!le", name = "nb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_688 = Static56.method1206("");

	@OriginalMember(owner = "client!le", name = "U", descriptor = "Lclient!lc;")
	public static Class31 aClass31_682 = aClass31_688;

	@OriginalMember(owner = "client!le", name = "hb", descriptor = "Lclient!lc;")
	private static Class31 aClass31_686 = Static56.method1206("Drop");

	@OriginalMember(owner = "client!le", name = "V", descriptor = "Lclient!lc;")
	public static Class31 aClass31_683 = aClass31_686;

	@OriginalMember(owner = "client!le", name = "X", descriptor = "Lclient!lc;")
	public static Class31 aClass31_684 = Static56.method1206("Importing maps )2 ");

	@OriginalMember(owner = "client!le", name = "bb", descriptor = "I")
	public static int anInt1938 = -1;

	@OriginalMember(owner = "client!le", name = "cb", descriptor = "I")
	public static int anInt1939 = -1;

	@OriginalMember(owner = "client!le", name = "fb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_685 = Static56.method1206("logo");

	@OriginalMember(owner = "client!le", name = "ib", descriptor = "Lclient!lc;")
	public static Class31 aClass31_687 = aClass31_688;

	@OriginalMember(owner = "client!le", name = "ob", descriptor = "Lclient!lc;")
	public static Class31 aClass31_689 = aClass31_688;

	@OriginalMember(owner = "client!le", name = "pb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_690 = aClass31_688;

	@OriginalMember(owner = "client!le", name = "qb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_691 = Static56.method1206("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!le", name = "rb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2 = new int[4][13][13];

	@OriginalMember(owner = "client!le", name = "tb", descriptor = "Z")
	public static boolean aBoolean100 = false;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(Z)V")
	public static void method1245() {
		aClass31_686 = null;
		aClass31_687 = null;
		aClass31_684 = null;
		aClass31_688 = null;
		anIntArrayArrayArray2 = null;
		aClass11_10 = null;
		aClass31_682 = null;
		aClass11_11 = null;
		aClass31_689 = null;
		aClass31_690 = null;
		aClass31_691 = null;
		aClass31_683 = null;
		aClass31_685 = null;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
	public static void method1247() {
		@Pc(7) Object local7 = Static23.anObject1;
		synchronized (Static23.anObject1) {
			while (Static42.anInt1582 != 0) {
				Static42.anInt1582 = -1;
				try {
					Static23.anObject1.wait();
				} catch (@Pc(23) InterruptedException local23) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!oc;)V")
	public static void method1249(@OriginalArg(1) Class42 arg0) {
		Static51.aClass42_1 = arg0;
	}
}
