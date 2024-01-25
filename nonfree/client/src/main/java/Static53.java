import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!bla", name = "b", descriptor = "Lclient!tl;")
	public static Class359 aClass359_1;

	@OriginalMember(owner = "client!bla", name = "e", descriptor = "Lclient!qn;")
	public static final Class313 aClass313_6 = new Class313(16);

	@OriginalMember(owner = "client!bla", name = "a", descriptor = "(BI)V")
	public static void method1299(@OriginalArg(1) int arg0) {
		Static39.anInt1222 = arg0;
		@Pc(7) Class307 local7 = Static386.aClass307_61;
		synchronized (Static386.aClass307_61) {
			Static386.aClass307_61.method7006();
		}
		local7 = Static91.aClass307_21;
		synchronized (Static91.aClass307_21) {
			Static91.aClass307_21.method7006();
		}
	}
}
