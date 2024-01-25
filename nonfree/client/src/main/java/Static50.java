import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
	public static int anInt846;

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "Lclient!dk;")
	public static final Class68 aClass68_1 = new Class68();

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(III)Lclient!fca;")
	public static Class97 method681(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class97 local7 = Static133.method4068(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass97Array1 == null || arg1 >= local7.aClass97Array1.length) {
			return null;
		} else {
			return local7.aClass97Array1[arg1];
		}
	}
}
