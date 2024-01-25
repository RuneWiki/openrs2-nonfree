import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_11 = new Class154(19, 1);

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)V")
	public static void method1107(@OriginalArg(1) int arg0) {
		Static104.anInt1836 = arg0;
		@Pc(7) Class21 local7 = Static133.aClass21_19;
		synchronized (Static133.aClass21_19) {
			Static133.aClass21_19.method313();
		}
	}
}
