import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static37 {

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "Lclient!qs;")
	public static Class211 aClass211_13;

	@OriginalMember(owner = "client!bq", name = "j", descriptor = "Lclient!fr;")
	public static final Class91 aClass91_8 = new Class91(64);

	@OriginalMember(owner = "client!bq", name = "k", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_16 = new Class177(65, -1);

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIB)Z")
	public static boolean method736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static288.method4245(arg1, arg0) | (arg0 & 0x60000) != 0 || Static427.method5765(arg1, arg0) || Static134.method2185(arg0, arg1);
	}
}
