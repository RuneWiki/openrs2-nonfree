import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "Lclient!hh;")
	private static Class50 aClass50_715 = Static186.method3527("Checking for updates )2 ");

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "Lclient!hh;")
	public static Class50 aClass50_714 = aClass50_715;

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "Lclient!oj;")
	public static Class84 aClass84_22 = new Class84(50);

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
	public static void method1756() {
		while (true) {
			@Pc(10) Class75 local10 = Static18.aClass75_2;
			@Pc(17) Class1_Sub26 local17;
			synchronized (Static18.aClass75_2) {
				local17 = (Class1_Sub26) Static8.aClass75_1.method2241();
			}
			if (local17 == null) {
				return;
			}
			local17.aClass86_Sub1_39.method3342(false, local17.aByteArray56, (int) local17.aLong173, local17.aClass123_6);
		}
	}
}
