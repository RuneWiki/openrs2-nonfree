import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static118 {

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "[Lclient!fm;")
	public static final Class80[] aClass80Array1 = new Class80[8];

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_71 = new Class186(77, 6);

	@OriginalMember(owner = "client!fn", name = "i", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_72 = new Class186(29, -1);

	@OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
	public static int anInt2476 = -1;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(CB)Z")
	public static boolean method1846(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
