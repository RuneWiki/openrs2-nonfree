import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!ev", name = "Y", descriptor = "Lclient!sba;")
	public static Class300 aClass300_2;

	@OriginalMember(owner = "client!ev", name = "vb", descriptor = "Z")
	public static boolean aBoolean240 = false;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Ljava/lang/String;IB)Z")
	public static boolean method2774(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static147.aClass161_4.aBoolean344) {
			Static238.aClass300_10 = new Class300();
			Static238.aClass300_10.anInt7993 = arg1;
			Static238.aClass300_10.aString89 = arg0;
			if (Static327.aClass315_8 != Static106.aClass315_4) {
				Static238.aClass300_10.anInt7995 = Static238.aClass300_10.anInt7993 + 40000;
				Static238.aClass300_10.anInt7994 = Static238.aClass300_10.anInt7993 + 50000;
			}
			if (Static278.aClass7_Sub1Array4.length > arg1 && Static278.aClass7_Sub1Array4[arg1] != null) {
				Static37.anInt737 = Static278.aClass7_Sub1Array4[arg1].anInt84;
			}
			return true;
		}
		@Pc(49) String local49 = "";
		if (Static327.aClass315_8 != Static106.aClass315_4) {
			local49 = ":" + (arg1 + 7000);
		}
		@Pc(69) String local69 = "";
		if (Static71.aString16 != null) {
			local69 = "/p=" + Static71.aString16;
		}
		@Pc(117) String local117 = "http://" + arg0 + local49 + "/l=" + Static56.anInt953 + "/a=" + Static431.anInt7395 + local69 + "/j" + (Static529.aBoolean627 ? "1" : "0") + ",o" + (Static468.aBoolean196 ? "1" : "0") + ",a2";
		try {
			Static81.aClient7.getAppletContext().showDocument(new URL(local117), "_self");
			return true;
		} catch (@Pc(127) Exception local127) {
			return false;
		}
	}
}
