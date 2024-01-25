import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
	public static int anInt4734;

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
	public static int anInt4735;

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "[I")
	public static final int[] anIntArray354 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_68 = new Class142("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IBLjava/lang/String;)Z")
	public static boolean method3740(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (Static289.anInt4838 != 3) {
			Static440.aClass112_6 = new Class112();
			Static440.aClass112_6.anInt2708 = arg0;
			Static440.aClass112_6.aString28 = arg1;
			if (Static254.aClass170_4 != Static268.aClass170_5) {
				Static440.aClass112_6.anInt2710 = Static440.aClass112_6.anInt2708 + 40000;
				Static440.aClass112_6.anInt2711 = Static440.aClass112_6.anInt2708 + 50000;
			}
			return true;
		}
		@Pc(42) String local42 = "";
		if (Static268.aClass170_5 != Static254.aClass170_4) {
			local42 = ":" + (arg0 + 7000);
		}
		@Pc(57) String local57 = "";
		if (Static448.aString68 != null) {
			local57 = "/p=" + Static448.aString68;
		}
		@Pc(105) String local105 = "http://" + arg1 + local42 + "/l=" + Static63.anInt981 + "/a=" + Static209.anInt3892 + local57 + "/j" + (Static379.aBoolean16 ? "1" : "0") + ",o" + (Static37.aBoolean81 ? "1" : "0") + ",a2";
		try {
			Static324.aClient1.getAppletContext().showDocument(new URL(local105), "_self");
			return true;
		} catch (@Pc(115) Exception local115) {
			return false;
		}
	}
}
