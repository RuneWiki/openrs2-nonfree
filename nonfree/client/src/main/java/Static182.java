import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!jd", name = "K", descriptor = "Lclient!du;")
	public static Class55 aClass55_1;

	@OriginalMember(owner = "client!jd", name = "M", descriptor = "Lclient!fa;")
	public static final Class68 aClass68_19 = new Class68(4);

	@OriginalMember(owner = "client!jd", name = "S", descriptor = "I")
	public static final int anInt3494 = 4;

	@OriginalMember(owner = "client!jd", name = "T", descriptor = "I")
	public static int anInt3495 = 0;

	@OriginalMember(owner = "client!jd", name = "U", descriptor = "I")
	public static final int anInt3496 = -1;

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "(B)Lclient!wa;")
	public static Class174 method2891() {
		try {
			return (Class174) Class.forName("Class174_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
