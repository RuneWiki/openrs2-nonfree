import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
	public static int anInt5396;

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
	public static int anInt5400;

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
	public static volatile int anInt5397 = -1;

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString181 = "Checking for updates - ";

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray11 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

	@OriginalMember(owner = "client!oj", name = "j", descriptor = "[[S")
	public static short[][] aShortArrayArray14 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!oj", name = "m", descriptor = "Z")
	public static boolean aBoolean414 = false;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
	public static void method4141() {
		Static265.aBoolean407 = true;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method4142(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static265.method4066("\n", "%0a", arg0));
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)Lclient!q;")
	public static Class1_Sub2_Sub12_Sub1 method4145(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub12_Sub1 local10 = (Class1_Sub2_Sub12_Sub1) Static250.aClass31_37.method852((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static39.aClass7_39.method253(0, arg0);
		local10 = new Class1_Sub2_Sub12_Sub1(local21);
		local10.method4392(Static211.aClass48Array2, null);
		Static250.aClass31_37.method851(local10, (long) arg0);
		return local10;
	}
}
