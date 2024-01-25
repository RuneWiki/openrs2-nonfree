import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!au", name = "e", descriptor = "Lclient!ml;")
	public static Class191 aClass191_1;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_16 = new Class239(21, 8);

	@OriginalMember(owner = "client!au", name = "d", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_17 = new Class239(8, 1);

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(B)I")
	public static int method600() {
		return 42;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(I)I")
	public static int method601() {
		@Pc(5) Class231 local5 = Static421.aClass231_60;
		synchronized (Static421.aClass231_60) {
			return Static421.aClass231_60.method6242();
		}
	}
}
