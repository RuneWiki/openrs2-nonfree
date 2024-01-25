import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!dk", name = "w", descriptor = "I")
	public static int anInt1504;

	@OriginalMember(owner = "client!dk", name = "i", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_31 = new Class83(" more options", " weitere Optionen", " autres options", " mais opções");

	@OriginalMember(owner = "client!dk", name = "l", descriptor = "[S")
	public static final short[] aShortArray43 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
	public static int anInt1503 = 64;

	@OriginalMember(owner = "client!dk", name = "x", descriptor = "Lclient!ho;")
	public static final Class98 aClass98_4 = new Class98(2, 4, 4, 0);

	@OriginalMember(owner = "client!dk", name = "y", descriptor = "[[S")
	public static final short[][] aShortArrayArray3 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!dk", name = "z", descriptor = "[I")
	public static final int[] anIntArray113 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(JLclient!ya;I)V")
	public static void method1340(@OriginalArg(0) long arg0, @OriginalArg(1) Class19 arg1) {
		Static272.anInt5116 = Static435.anInt7099;
		Static275.anInt5137 = 0;
		Static435.anInt7099 = 0;
		@Pc(18) long local18 = Static282.method3962();
		for (@Pc(23) Class3_Sub2 local23 = (Class3_Sub2) Static384.aClass84_8.method2312(); local23 != null; local23 = (Class3_Sub2) Static384.aClass84_8.method2309()) {
			if (local23.method172(arg1, arg0)) {
				Static275.anInt5137++;
			}
		}
		if (Static30.aBoolean53 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static384.aClass84_8.method2307() + ", running: " + Static275.anInt5137 + ". Particles: " + Static435.anInt7099 + ". Time taken: " + (Static282.method3962() - local18) + "ms");
		}
	}
}
