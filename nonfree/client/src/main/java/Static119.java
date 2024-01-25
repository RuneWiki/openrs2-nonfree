import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "[Lclient!pga;")
	public static Class32[] aClass32Array8;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_40 = new Class268(92, 3);

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "Lclient!de;")
	public static final Class61 aClass61_5 = new Class61();

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)V")
	public static void method1975(@OriginalArg(0) int arg0) {
		Static420.anInt7709 = arg0;
		@Pc(7) Class166 local7 = Static553.aClass166_54;
		synchronized (Static553.aClass166_54) {
			Static553.aClass166_54.method4811();
		}
		local7 = Static3.aClass166_1;
		synchronized (Static3.aClass166_1) {
			Static3.aClass166_1.method4811();
		}
	}
}
