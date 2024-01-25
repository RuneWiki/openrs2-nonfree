import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!io", name = "N", descriptor = "[Lclient!rr;")
	public static Class15_Sub1[] aClass15_Sub1Array3;

	@OriginalMember(owner = "client!io", name = "J", descriptor = "Lclient!pfa;")
	public static final Class253 aClass253_16 = new Class253(16);

	@OriginalMember(owner = "client!io", name = "f", descriptor = "(I)Lclient!fea;")
	public static Class10 method4322() {
		try {
			return (Class10) Class.forName("Class10_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(9) Throwable local9) {
			return new Class10_Sub1();
		}
	}
}
