import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!as", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString28;

	@OriginalMember(owner = "client!as", name = "J", descriptor = "Ljava/lang/String;")
	public static final String aString27 = "scroll:";

	@OriginalMember(owner = "client!as", name = "ab", descriptor = "Ljava/lang/String;")
	public static String aString29 = "glow2:";

	@OriginalMember(owner = "client!as", name = "bb", descriptor = "I")
	public static int anInt468 = -60;

	@OriginalMember(owner = "client!as", name = "i", descriptor = "(I)I")
	public static int method489() {
		return Static26.anInt627;
	}

	@OriginalMember(owner = "client!as", name = "j", descriptor = "(I)V")
	public static void method491() {
		@Pc(1) Class66 local1 = Static43.aClass66_14;
		synchronized (Static43.aClass66_14) {
			Static43.aClass66_14.method1933();
		}
	}
}
