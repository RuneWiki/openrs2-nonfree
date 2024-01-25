import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!tca", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "[[S")
	public static final short[][] aShortArrayArray10 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_119 = new Class45("Loaded JACLIB", "JACLIB geladen", "JACLIB chargé", "JACLIB carregado");

	@OriginalMember(owner = "client!tca", name = "i", descriptor = "I")
	public static int anInt8000 = 0;

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!fp;IIB)J")
	public static long method7061(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(12) long local12 = 2147483648L;
		@Pc(14) long local14 = Long.MIN_VALUE;
		@Pc(21) Class51 local21 = Static398.aClass18_4.method609(arg0.method8046());
		@Pc(42) long local42 = (long) (arg1 | arg2 << 7 | arg0.method8047() << 14 | arg0.method8044() << 20 | 0x40000000);
		if (local21.anInt1632 == 0) {
			local42 |= local14;
		}
		if (local21.anInt1652 == 1) {
			local42 |= local5;
		}
		if (local21.aBoolean131) {
			local42 |= local12;
		}
		return local42 | (long) arg0.method8046() << 32;
	}
}
