import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static186 {

	@OriginalMember(owner = "client!gga", name = "U", descriptor = "Lclient!tu;")
	public static Class356 aClass356_4;

	@OriginalMember(owner = "client!gga", name = "M", descriptor = "Lclient!wv;")
	public static final Class395 aClass395_1 = new Class395();

	@OriginalMember(owner = "client!gga", name = "S", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_63 = new Class216(6, 2);

	@OriginalMember(owner = "client!gga", name = "V", descriptor = "Z")
	public static boolean aBoolean244 = false;

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(IIB)Z")
	public static boolean method2950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static149.method2602(arg1, arg0) | (arg0 & 0x800) != 0 || Static638.method8538(arg0, arg1);
	}
}
