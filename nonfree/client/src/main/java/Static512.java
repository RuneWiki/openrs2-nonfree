import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_198 = new Class359(127, 8);

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "Lclient!jf;")
	public static final Class178 aClass178_3 = new Class178();

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_78 = new Class305(45, 4);

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V")
	public static void method7294() {
		@Pc(10) Class5_Sub6 local10;
		for (local10 = (Class5_Sub6) Static173.aClass114_20.method2805(); local10 != null; local10 = (Class5_Sub6) Static173.aClass114_20.method2814()) {
			Static614.method8353(false, local10);
		}
		for (local10 = (Class5_Sub6) Static256.aClass114_27.method2805(); local10 != null; local10 = (Class5_Sub6) Static256.aClass114_27.method2814()) {
			Static614.method8353(true, local10);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method7297(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		Static337.method5159(arg0, -1, -1, arg1);
	}
}
