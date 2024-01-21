import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ea", name = "Q", descriptor = "I")
	public static int anInt1000;

	@OriginalMember(owner = "client!ea", name = "Y", descriptor = "J")
	public static long aLong31;

	@OriginalMember(owner = "client!ea", name = "ab", descriptor = "Lclient!rh;")
	public static Class76 aClass76_1;

	@OriginalMember(owner = "client!ea", name = "P", descriptor = "[I")
	public static final int[] anIntArray89 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ea", name = "R", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_348 = Static177.method3050("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!ea", name = "V", descriptor = "I")
	public static int anInt1003 = 0;

	@OriginalMember(owner = "client!ea", name = "W", descriptor = "I")
	public static int anInt1004 = 1;

	@OriginalMember(owner = "client!ea", name = "eb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_349 = Static177.method3050(")1 ");

	@OriginalMember(owner = "client!ea", name = "hb", descriptor = "I")
	public static int anInt1011 = 99;

	@OriginalMember(owner = "client!ea", name = "lb", descriptor = "[Z")
	public static final boolean[] aBooleanArray5 = new boolean[100];

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IILjava/util/Random;)I")
	public static int method679(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static83.method1680(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(39) int local39 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(42) int local42;
			do {
				local42 = arg1.nextInt();
			} while (local39 <= local42);
			return method680(local42, arg0);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)I")
	private static int method680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 >> 31 & arg1 - 1;
		return local7 + ((arg0 >>> 31) + arg0) % arg1;
	}
}
