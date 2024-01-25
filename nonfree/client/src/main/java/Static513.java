import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static513 {

	@OriginalMember(owner = "client!rd", name = "H", descriptor = "Lclient!eb;")
	public static Class91 aClass91_12;

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_87 = new Class240(87, 2);

	@OriginalMember(owner = "client!rd", name = "bb", descriptor = "Lclient!qj;")
	public static final Class295 aClass295_52 = new Class295(4);

	@OriginalMember(owner = "client!rd", name = "cb", descriptor = "Lclient!tca;")
	public static Class333 aClass333_33 = new Class333(8);

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZI)Z")
	public static boolean method6708(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static67.method1221(arg0, arg1) | (arg1 & 0x70000) != 0 || Static669.method8386(arg0, arg1);
	}
}
