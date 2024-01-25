import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "Lclient!rk;")
	public static final Class249 aClass249_33 = new Class249();

	@OriginalMember(owner = "client!nc", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString128 = "";

	@OriginalMember(owner = "client!nc", name = "x", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_120 = new Class239(71, 6);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	public static void method4860() {
		@Pc(1) Class231 local1 = Static421.aClass231_60;
		synchronized (Static421.aClass231_60) {
			Static421.aClass231_60.method6227();
		}
		local1 = Static8.aClass231_2;
		synchronized (Static8.aClass231_2) {
			Static8.aClass231_2.method6227();
		}
	}
}
