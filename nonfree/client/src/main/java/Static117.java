import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
	public static int anInt2015;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_31 = new Class98(37, -2);

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "Lclient!laa;")
	public static final Class179 aClass179_2 = new Class179(15, 0, 1, 0);

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public static void method1837() {
		@Pc(13) int local13 = (int) ((double) Static18.anInt5706 * 34.46D);
		local13 <<= 0x2;
		if (Static554.aClass90_12.method7499()) {
			local13 += 512;
		}
		Static554.aClass90_12.sa(200, local13);
	}
}
