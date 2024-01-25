import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "[I")
	public static int[] anIntArray485;

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "I")
	public static int anInt6060;

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_106 = new Class237(62, 8);

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_151 = new Class131(73, 3);

	@OriginalMember(owner = "client!ru", name = "e", descriptor = "[[S")
	public static final short[][] aShortArrayArray8 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!ru", name = "g", descriptor = "I")
	public static int anInt6061 = -1;

	@OriginalMember(owner = "client!ru", name = "h", descriptor = "I")
	public static int anInt6062 = 0;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method4897(@OriginalArg(1) int arg0) {
		@Pc(26) byte[] local26;
		if (arg0 == 100 && Static431.anInt7435 > 0) {
			local26 = Static266.aByteArrayArray92[--Static431.anInt7435];
			Static266.aByteArrayArray92[Static431.anInt7435] = null;
			return local26;
		} else if (arg0 == 5000 && Static127.anInt3471 > 0) {
			local26 = Static85.aByteArrayArray32[--Static127.anInt3471];
			Static85.aByteArrayArray32[Static127.anInt3471] = null;
			return local26;
		} else if (arg0 == 30000 && Static294.anInt5927 > 0) {
			local26 = Static184.aByteArrayArray61[--Static294.anInt5927];
			Static184.aByteArrayArray61[Static294.anInt5927] = null;
			return local26;
		} else {
			return new byte[arg0];
		}
	}
}
