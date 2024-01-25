import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static248 {

	@OriginalMember(owner = "client!in", name = "o", descriptor = "I")
	public static int anInt4331;

	@OriginalMember(owner = "client!in", name = "s", descriptor = "J")
	public static long aLong132 = 0L;

	@OriginalMember(owner = "client!in", name = "b", descriptor = "Lclient!qr;")
	public static final Class306 aClass306_18 = new Class306(64);

	@OriginalMember(owner = "client!in", name = "f", descriptor = "[I")
	public static final int[] anIntArray223 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(JJ)J")
	public static long method3974(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}
}
