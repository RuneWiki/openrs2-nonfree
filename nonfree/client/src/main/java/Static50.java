import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "Lclient!sf;")
	public static Interface2 anInterface2_2;

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
	public static int anInt1433;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "J")
	public static long aLong48;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
	public static int anInt1434;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "[I")
	public static int[] anIntArray253 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "Lclient!eh;")
	public static Class28 aClass28_434 = Static170.method3101("scrollen:");

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "Lclient!eh;")
	public static Class28 aClass28_435 = Static170.method3101(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "[Z")
	public static boolean[] aBooleanArray10 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "[[S")
	public static short[][] aShortArrayArray4 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "Lclient!eh;")
	public static Class28 aClass28_436 = Static170.method3101("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "Lclient!eh;")
	public static Class28 aClass28_437 = Static170.method3101("<img=0>");

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "Lclient!eh;")
	public static Class28 aClass28_438 = Static170.method3101("::qa_op_test");

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "Lclient!eh;")
	public static Class28 aClass28_439 = Static170.method3101("null");

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	public static void method1189() {
		aClass28_437 = null;
		aShortArrayArray4 = null;
		aClass28_434 = null;
		aBooleanArray10 = null;
		aClass28_435 = null;
		anInterface2_2 = null;
		anIntArray253 = null;
		aClass28_436 = null;
		aClass28_439 = null;
		aClass28_438 = null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
	public static void method1190() {
		@Pc(5) Object local5 = Static34.anObject1;
		synchronized (Static34.anObject1) {
			if (Static42.anInt1179 != 0) {
				Static42.anInt1179 = 1;
				try {
					Static34.anObject1.wait();
				} catch (@Pc(18) InterruptedException local18) {
				}
			}
		}
	}
}
