import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static460 {

	@OriginalMember(owner = "client!ya", name = "j", descriptor = "I")
	public static int anInt5780;

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "Lclient!bu;")
	public static final Class38 aClass38_29 = new Class38(16);

	@OriginalMember(owner = "client!ya", name = "d", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_138 = new Class263(99, -1);

	@OriginalMember(owner = "client!ya", name = "h", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_149 = new Class158("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!ya", name = "i", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_139 = new Class263(12, -2);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;")
	public static Class method4436(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
