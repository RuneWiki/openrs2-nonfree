import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static71 {

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_21 = new Class71(103, 17);

	@OriginalMember(owner = "client!cj", name = "p", descriptor = "Lclient!dh;")
	public static Class71 aClass71_22 = null;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIB)Z")
	public static boolean method1822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
