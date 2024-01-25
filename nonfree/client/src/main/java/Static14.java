import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!an", name = "y", descriptor = "Lclient!iq;")
	public static Class104 aClass104_9;

	@OriginalMember(owner = "client!an", name = "z", descriptor = "Lclient!iq;")
	public static Class104 aClass104_10;

	@OriginalMember(owner = "client!an", name = "K", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_24 = new Class221(62, 7);

	@OriginalMember(owner = "client!an", name = "R", descriptor = "I")
	public static int anInt259 = 0;

	@OriginalMember(owner = "client!an", name = "g", descriptor = "(I)V")
	public static void method242() {
		@Pc(10) byte local10 = 0;
		if (Static309.aBoolean544) {
			local10 = 55;
		}
		Static323.method5333(local10);
		Static101.method2006(local10);
		Static310.aClass184_2.method5044(local10);
		Static248.method4398(local10);
		Static317.method5265(local10);
		Static307.method5140(local10);
		Static97.method1896(local10);
		Static236.method1164(local10);
		Static99.method1985(local10);
		if (Static176.anInt3971 == 10) {
			Static224.method5495(28);
		} else if (Static176.anInt3971 == 30) {
			Static224.method5495(25);
			return;
		}
	}
}
