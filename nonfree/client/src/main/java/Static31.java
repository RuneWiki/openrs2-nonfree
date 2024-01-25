import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bca", name = "F", descriptor = "Lclient!wg;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!bca", name = "K", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_6 = new Class61(11, 16);

	@OriginalMember(owner = "client!bca", name = "M", descriptor = "I")
	public static int anInt591 = 0;

	@OriginalMember(owner = "client!bca", name = "O", descriptor = "Lclient!db;")
	public static final Class64 aClass64_43 = new Class64(37, 6);

	@OriginalMember(owner = "client!bca", name = "f", descriptor = "(I)V")
	public static void method556() {
		Static325.aBoolean431 = false;
		Static268.method4360(Static473.anInt7981, Static100.anInt9640, Static35.anInt711, Static333.anInt5926);
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(IZ)V")
	public static void method559(@OriginalArg(1) boolean arg0) {
		Static464.method6712();
		if (!Static259.method4294(Static598.anInt9831)) {
			return;
		}
		Static248.anInt4940++;
		if (Static248.anInt4940 < 50 && !arg0) {
			return;
		}
		Static248.anInt4940 = 0;
		if (!Static2.aBoolean2 && Static235.aClass45_1 != null) {
			@Pc(37) Class4_Sub41 local37 = Static128.method2707(Static174.aClass61_42, Class16_Sub3.lb);
			Static551.method7603(local37);
			try {
				Static315.method4803();
			} catch (@Pc(44) IOException local44) {
				Static2.aBoolean2 = true;
			}
		}
		Static464.method6712();
	}
}
