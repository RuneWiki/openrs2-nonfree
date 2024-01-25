import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static617 {

	@OriginalMember(owner = "client!waa", name = "c", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!waa", name = "g", descriptor = "I")
	public static int anInt9939;

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "I")
	public static int anInt9937 = 0;

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Z)V")
	public static void method8288() {
		if (Static122.anInterface8Array1 == null) {
			return;
		}
		@Pc(5) Interface8[] local5 = Static122.anInterface8Array1;
		for (@Pc(7) int local7 = 0; local7 < local5.length; local7++) {
			@Pc(13) Interface8 local13 = local5[local7];
			local13.method8060();
		}
	}
}
