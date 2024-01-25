import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!am", name = "e", descriptor = "I")
	public static int anInt218;

	@OriginalMember(owner = "client!am", name = "c", descriptor = "Lclient!rg;")
	public static Class172 aClass172_1 = null;

	@OriginalMember(owner = "client!am", name = "f", descriptor = "Lclient!cm;")
	public static final Class41 aClass41_1 = new Class41(16);

	@OriginalMember(owner = "client!am", name = "g", descriptor = "[B")
	public static final byte[] aByteArray3 = new byte[520];

	@OriginalMember(owner = "client!am", name = "h", descriptor = "[I")
	public static final int[] anIntArray25 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!am", name = "k", descriptor = "Lclient!ns;")
	public static final Class143 aClass143_1 = new Class143(10, -1);

	@OriginalMember(owner = "client!am", name = "l", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_13 = new Class157(30, 3);

	@OriginalMember(owner = "client!am", name = "m", descriptor = "[[S")
	public static final short[][] aShortArrayArray1 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BI)Lclient!bf;")
	public static Class21 method189(@OriginalArg(1) int arg0) {
		@Pc(10) Class21 local10 = (Class21) Static258.aClass107_37.method3021((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static111.aClass104_72.method2756(35, arg0);
		local10 = new Class21();
		if (local20 != null) {
			local10.method328(new Class2_Sub12(local20));
		}
		local10.method327();
		Static258.aClass107_37.method3018((long) arg0, local10);
		return local10;
	}
}
