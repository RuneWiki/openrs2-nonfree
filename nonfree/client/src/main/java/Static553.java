import java.awt.Font;
import java.io.File;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!tp", name = "q", descriptor = "Ljava/awt/Font;")
	public static Font aFont2;

	@OriginalMember(owner = "client!tp", name = "s", descriptor = "I")
	public static int anInt9450;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILjava/io/File;)[B")
	public static byte[] method7811(@OriginalArg(1) File arg0) {
		return Static62.method1333((int) arg0.length(), arg0);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IILjava/lang/String;)Z")
	public static boolean method7813(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (Static379.aClass228_6.aBoolean614) {
			Static621.aClass278_5 = new Class278();
			Static621.aClass278_5.aString94 = arg1;
			Static621.aClass278_5.anInt8394 = arg0;
			if (Static624.aClass107_7 != Static85.aClass107_2) {
				Static621.aClass278_5.anInt8395 = Static621.aClass278_5.anInt8394 + 50000;
				Static621.aClass278_5.anInt8398 = Static621.aClass278_5.anInt8394 + 40000;
			}
			if (Static199.aClass153_Sub1Array1.length > arg0 && Static199.aClass153_Sub1Array1[arg0] != null) {
				Static356.anInt6937 = Static199.aClass153_Sub1Array1[arg0].anInt5570;
			}
			return true;
		}
		@Pc(54) String local54 = "";
		if (Static624.aClass107_7 != Static85.aClass107_2) {
			local54 = ":" + (arg0 + 7000);
		}
		@Pc(69) String local69 = "";
		if (Static455.aString92 != null) {
			local69 = "/p=" + Static455.aString92;
		}
		@Pc(117) String local117 = "http://" + arg1 + local54 + "/l=" + Static380.anInt7247 + "/a=" + Static134.anInt3486 + local69 + "/j" + (Static193.aBoolean378 ? "1" : "0") + ",o" + (Static637.aBoolean860 ? "1" : "0") + ",a2";
		try {
			Static321.aClient2.getAppletContext().showDocument(new URL(local117), "_self");
			return true;
		} catch (@Pc(127) Exception local127) {
			return false;
		}
	}
}
