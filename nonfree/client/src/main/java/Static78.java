import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!db", name = "g", descriptor = "Ljava/lang/Object;")
	public static Object anObject8;

	@OriginalMember(owner = "client!db", name = "i", descriptor = "Lclient!wl;")
	public static Class344 aClass344_1;

	@OriginalMember(owner = "client!db", name = "k", descriptor = "I")
	public static int anInt1306;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString20 = null;

	@OriginalMember(owner = "client!db", name = "e", descriptor = "Lclient!pn;")
	public static final Class249 aClass249_1 = new Class249();

	@OriginalMember(owner = "client!db", name = "h", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_26 = new Class160(12, -1);

	@OriginalMember(owner = "client!db", name = "j", descriptor = "[I")
	public static int[] anIntArray95 = new int[1];

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;")
	public static Object method1178(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static61.aBoolean50) {
			try {
				@Pc(18) Class286 local18 = (Class286) Class.forName("Class286_Sub1").getDeclaredConstructor().newInstance();
				local18.method6531(arg0);
				return local18;
			} catch (@Pc(25) Throwable local25) {
				Static61.aBoolean50 = true;
			}
		}
		return arg0;
	}
}
