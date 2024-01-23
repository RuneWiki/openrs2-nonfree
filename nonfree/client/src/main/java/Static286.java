import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "Lclient!cn;")
	public static Class32 aClass32_3;

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "Lclient!ph;")
	public static Class138 aClass138_79;

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
	public static int anInt5441;

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "[I")
	public static int[] anIntArray497;

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString180 = "Members object";

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString181 = "Drop";

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "[[S")
	public static short[][] aShortArrayArray38 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
	public static int anInt5443 = 0;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method4252(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class1_Sub1_Sub2 local8 = Static46.method824(3, arg0);
		local8.method294();
		local8.aString12 = arg1;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)V")
	public static void method4254(@OriginalArg(0) int arg0) {
		@Pc(2) Class2 local2 = Static268.aClass2_5;
		synchronized (Static268.aClass2_5) {
			Static209.anInt4120 = arg0;
		}
	}
}
