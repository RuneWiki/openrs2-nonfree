import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!qe", name = "t", descriptor = "Lclient!g;")
	public static Class83 aClass83_99;

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "Lclient!ud;")
	public static final Class225 aClass225_3 = new Class225("RC", 1);

	@OriginalMember(owner = "client!qe", name = "q", descriptor = "Lclient!co;")
	public static final Class41 aClass41_61 = new Class41(32);

	@OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
	public static int anInt5258 = 0;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
	public static Object method4696(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static70.aBoolean118) {
			try {
				@Pc(23) Class28 local23 = (Class28) Class.forName("Class28_Sub1").getDeclaredConstructor().newInstance();
				local23.method2332(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static70.aBoolean118 = true;
			}
		}
		return arg0;
	}
}
