import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
	public static int anInt1447 = 0;

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_25 = new Class96("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!dq", name = "e", descriptor = "[J")
	public static final long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)Lclient!sv;")
	public static Class222 method1142(@OriginalArg(1) int arg0) {
		@Pc(8) Class222[] local8 = Static228.method3283();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (arg0 == local8[local10].anInt6751) {
				return local8[local10];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method1143() {
		@Pc(7) String local7 = "www";
		if (Static153.aClass174_7 == Static251.aClass174_6) {
			local7 = "www-wtrc";
		} else if (Static61.aClass174_1 == Static153.aClass174_7) {
			local7 = "www-wtqa";
		} else if (Static153.aClass174_7 == Static300.aClass174_8) {
			local7 = "www-wtwip";
		}
		@Pc(28) String local28 = "";
		if (Static87.aString67 != null) {
			local28 = "/p=" + Static87.aString67;
		}
		return "http://" + local7 + "." + Static325.aClass169_2.aString61 + ".com/l=" + Static389.anInt7061 + "/a=" + Static311.anInt6534 + local28 + "/";
	}
}
