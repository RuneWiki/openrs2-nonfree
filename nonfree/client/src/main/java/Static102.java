import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_56 = new Class158("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "I")
	public static int anInt2384 = 0;

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "Lclient!vv;")
	public static Class263 aClass263_56 = null;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZIII)I")
	public static int method1725(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String method1726() {
		@Pc(5) String local5 = "www";
		if (Static314.aClass248_7 == Static374.aClass248_6) {
			local5 = "www-wtrc";
		} else if (Static63.aClass248_2 == Static314.aClass248_7) {
			local5 = "www-wtqa";
		} else if (Static436.aClass248_9 == Static314.aClass248_7) {
			local5 = "www-wtwip";
		}
		@Pc(24) String local24 = "";
		if (Static325.aString57 != null) {
			local24 = "/p=" + Static325.aString57;
		}
		return "http://" + local5 + "." + Static268.aClass272_4.aString67 + ".com/l=" + Static365.anInt6682 + "/a=" + Static2.anInt47 + local24 + "/";
	}
}
