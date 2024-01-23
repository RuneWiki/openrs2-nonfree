import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
	public static int anInt151;

	@OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
	public static int anInt152;

	@OriginalMember(owner = "client!ah", name = "o", descriptor = "[I")
	public static int[] anIntArray18;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString9 = "Loading textures - ";

	@OriginalMember(owner = "client!ah", name = "l", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray3 = new String[500];

	@OriginalMember(owner = "client!ah", name = "n", descriptor = "Z")
	public static boolean aBoolean5 = false;

	@OriginalMember(owner = "client!ah", name = "t", descriptor = "[[S")
	public static short[][] aShortArrayArray1 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
	public static void method110() {
		Static144.aClass79_19.method2487();
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)V")
	public static void method112(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub2_Sub18 local10 = Static13.method232(arg1, 12);
		local10.method3810();
		local10.anInt5009 = arg0;
	}
}
