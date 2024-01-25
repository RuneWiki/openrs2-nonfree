import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!eq", name = "q", descriptor = "Lclient!rp;")
	public static Class278 aClass278_5;

	@OriginalMember(owner = "client!eq", name = "r", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_52 = new Class40(100, 8);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IILjava/lang/String;)Z")
	public static boolean method1852(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (Static152.aClass57_4.aBoolean74) {
			Static271.aClass147_2 = new Class147();
			Static271.aClass147_2.aString55 = arg1;
			Static271.aClass147_2.anInt3691 = arg0;
			if (Static376.aClass287_6 != Static192.aClass287_3) {
				Static271.aClass147_2.anInt3696 = Static271.aClass147_2.anInt3691 + 50000;
				Static271.aClass147_2.anInt3693 = Static271.aClass147_2.anInt3691 + 40000;
			}
			if (Static376.aClass8_Sub1Array2.length > arg0 && Static376.aClass8_Sub1Array2[arg0] != null) {
				Static161.anInt2834 = Static376.aClass8_Sub1Array2[arg0].anInt2009;
			}
			return true;
		}
		@Pc(48) String local48 = "";
		if (Static376.aClass287_6 != Static192.aClass287_3) {
			local48 = ":" + (arg0 + 7000);
		}
		@Pc(68) String local68 = "";
		if (Static492.aString102 != null) {
			local68 = "/p=" + Static492.aString102;
		}
		@Pc(116) String local116 = "http://" + arg1 + local48 + "/l=" + Static470.anInt7957 + "/a=" + Static323.anInt5822 + local68 + "/j" + (Static465.aBoolean538 ? "1" : "0") + ",o" + (Static263.aBoolean270 ? "1" : "0") + ",a2";
		try {
			Static153.aClient1.getAppletContext().showDocument(new URL(local116), "_self");
			return true;
		} catch (@Pc(126) Exception local126) {
			return false;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)[Lclient!aj;")
	public static Class14[] method1853() {
		return new Class14[] { Static184.aClass14_1, Static184.aClass14_2, Static184.aClass14_3, Static184.aClass14_4, Static184.aClass14_5, Static184.aClass14_6, Static184.aClass14_7, Static184.aClass14_8, Static184.aClass14_9, Static184.aClass14_10, Static184.aClass14_11, Static184.aClass14_12, Static184.aClass14_13, Static184.aClass14_14 };
	}
}
