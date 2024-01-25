import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
	public static int anInt1249;

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
	public static int anInt1250;

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
	public static int anInt1248 = 0;

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "[[S")
	public static final short[][] aShortArrayArray1 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;")
	public static Object method1201(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static383.aBoolean493) {
			try {
				@Pc(23) Class216 local23 = (Class216) Class.forName("Class216_Sub1").getDeclaredConstructor().newInstance();
				local23.method5325(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static383.aBoolean493 = true;
			}
		}
		return arg0;
	}
}
