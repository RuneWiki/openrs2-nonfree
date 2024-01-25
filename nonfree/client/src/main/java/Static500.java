import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static500 {

	@OriginalMember(owner = "client!ria", name = "fc", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_141 = new Class145(19, 3);

	@OriginalMember(owner = "client!ria", name = "fd", descriptor = "I")
	public static int anInt8002 = 0;

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(ILclient!up;)Z")
	public static boolean method6946(@OriginalArg(1) Class353 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean710) {
			return false;
		} else if (!arg0.method8340(Static371.anInterface5_2)) {
			return false;
		} else if (Static524.aClass323_33.method7484((long) arg0.anInt9811) == null) {
			return Static145.aClass323_12.method7484((long) arg0.anInt9797) == null;
		} else {
			return false;
		}
	}
}
