import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!md", name = "r", descriptor = "I")
	public static int anInt5468;

	@OriginalMember(owner = "client!md", name = "s", descriptor = "Lclient!tf;")
	public static Class322 aClass322_99;

	@OriginalMember(owner = "client!md", name = "t", descriptor = "Lclient!rda;")
	public static Class3_Sub4_Sub3 aClass3_Sub4_Sub3_2;

	@OriginalMember(owner = "client!md", name = "p", descriptor = "I")
	public static int anInt5466 = 0;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILjava/lang/String;I)Z")
	public static boolean method4687(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (Static237.aClass258_3.aBoolean524) {
			Static221.aClass51_1 = new Class51();
			Static221.aClass51_1.aString8 = arg1;
			Static221.aClass51_1.anInt1589 = arg0;
			if (Static478.aClass272_10 != Static516.aClass272_11) {
				Static221.aClass51_1.anInt1585 = Static221.aClass51_1.anInt1589 + 50000;
				Static221.aClass51_1.anInt1587 = Static221.aClass51_1.anInt1589 + 40000;
			}
			if (arg0 < Static563.aClass119_Sub1Array2.length && Static563.aClass119_Sub1Array2[arg0] != null) {
				Static503.anInt8181 = Static563.aClass119_Sub1Array2[arg0].anInt3539;
			}
			return true;
		}
		@Pc(48) String local48 = "";
		if (Static478.aClass272_10 != Static516.aClass272_11) {
			local48 = ":" + (arg0 + 7000);
		}
		@Pc(63) String local63 = "";
		if (Static568.aString87 != null) {
			local63 = "/p=" + Static568.aString87;
		}
		@Pc(111) String local111 = "http://" + arg1 + local48 + "/l=" + Static256.anInt4535 + "/a=" + Static535.anInt8570 + local63 + "/j" + (Static63.aBoolean115 ? "1" : "0") + ",o" + (Static436.aBoolean546 ? "1" : "0") + ",a2";
		try {
			Static308.aClient1.getAppletContext().showDocument(new URL(local111), "_self");
			return true;
		} catch (@Pc(126) Exception local126) {
			return false;
		}
	}
}
