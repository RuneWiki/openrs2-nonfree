import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "Lclient!gw;")
	public static Class93 aClass93_5;

	@OriginalMember(owner = "client!hr", name = "x", descriptor = "Lclient!uu;")
	public static Class250 aClass250_47;

	@OriginalMember(owner = "client!hr", name = "r", descriptor = "Lclient!of;")
	public static final Class174 aClass174_92 = new Class174("Started 3D Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

	@OriginalMember(owner = "client!hr", name = "v", descriptor = "Z")
	public static boolean aBoolean224 = false;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)V")
	public static void method2517() {
		@Pc(5) Class268 local5 = Static13.aClass268_2;
		synchronized (Static13.aClass268_2) {
			Static13.aClass268_2.method6173(5);
		}
		local5 = Static438.aClass268_24;
		synchronized (Static438.aClass268_24) {
			Static438.aClass268_24.method6173(5);
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method2518(@OriginalArg(1) String arg0) {
		return Static170.method2614(arg0, 10);
	}
}
