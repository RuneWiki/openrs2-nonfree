import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
	public static int anInt2477;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
	public static int anInt2472 = -1;

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_30 = new Class183(42, 12);

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)Lclient!fg;")
	public static Class2_Sub10 method2015() {
		if (Static20.aClass238_21 == null || Static113.aClass42_3 == null) {
			return null;
		}
		Static113.aClass42_3.method842(Static20.aClass238_21);
		@Pc(23) Class2_Sub10 local23 = (Class2_Sub10) Static113.aClass42_3.method841();
		if (local23 == null) {
			return null;
		} else {
			@Pc(33) Class212 local33 = Static20.aClass195_3.method4816(local23.anInt2183);
			return local33 != null && local33.aBoolean438 && local33.method5244(Static20.anInterface4_2) ? local23 : Static6.method62();
		}
	}
}
