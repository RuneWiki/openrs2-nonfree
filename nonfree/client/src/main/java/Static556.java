import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!tu", name = "f", descriptor = "F")
	public static float aFloat207;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_101 = new Class94(80, 7);

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_226 = new Class215(43, 4);

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)I")
	public static int method8285(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(33) int local33 = (local24 * arg0 >> 12) + 40960;
		return local33 * local18 >> 12;
	}
}
