import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static317 {

	@OriginalMember(owner = "client!mq", name = "U", descriptor = "I")
	public static int anInt5746;

	@OriginalMember(owner = "client!mq", name = "x", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_73 = new Class160(17, 4);

	@OriginalMember(owner = "client!mq", name = "S", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_74 = new Class160(10, 16);

	@OriginalMember(owner = "client!mq", name = "W", descriptor = "[[S")
	public static final short[][] aShortArrayArray12 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILclient!pq;ILclient!pq;)V")
	public static void method4924(@OriginalArg(1) Class251 arg0, @OriginalArg(3) Class251 arg1) {
		Static348.aClass251_144 = arg1;
		Static42.aClass251_152 = arg0;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIZ)V")
	public static void method4926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static533.aClass314_4 == Static57.aClass314_1) {
			if (!Static229.method3372(0, 1, -2, arg1, 0, 1, arg0, false)) {
				Static229.method3372(0, 1, -3, arg1, 0, 1, arg0, false);
			}
		} else if (!Static229.method3372(0, 1, -3, arg1, 0, 1, arg0, false)) {
			Static229.method3372(0, 1, -2, arg1, 0, 1, arg0, false);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V")
	public static void method4927() {
		Static79.aClass332_39.method7510();
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(BLclient!lb;)Z")
	public static boolean method4929(@OriginalArg(1) Class179 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean284) {
			return false;
		} else if (!arg0.method3962(Static349.anInterface5_2)) {
			return false;
		} else if (Static120.aClass212_5.method5106((long) arg0.anInt4576) == null) {
			return Static91.aClass212_24.method5106((long) arg0.anInt4584) == null;
		} else {
			return false;
		}
	}
}
