import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!vs", name = "T", descriptor = "I")
	public static int anInt6899;

	@OriginalMember(owner = "client!vs", name = "Y", descriptor = "I")
	public static int anInt6902;

	@OriginalMember(owner = "client!vs", name = "V", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_240 = new Class62("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!vs", name = "W", descriptor = "Ljava/lang/String;")
	public static String aString62 = "";

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method5958(@OriginalArg(1) String arg0) {
		if (Static389.aStringArray45 == null) {
			Static354.method5613();
		}
		@Pc(14) String[] local14 = Static71.method1265(arg0, '\n');
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			for (@Pc(20) int local20 = Static195.anInt4058; local20 > 0; local20--) {
				Static389.aStringArray45[local20] = Static389.aStringArray45[local20 - 1];
			}
			Static389.aStringArray45[0] = local14[local16];
			if (Static389.aStringArray45.length - 1 > Static195.anInt4058) {
				Static195.anInt4058++;
				if (Static372.anInt6826 > 0) {
					Static372.anInt6826++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IC)Z")
	public static boolean method5960(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILclient!vt;)Lclient!cq;")
	public static Class43_Sub1 method5961(@OriginalArg(1) Class2_Sub24 arg0) {
		return new Class43_Sub1(arg0.method5743(), arg0.method5743(), arg0.method5743(), arg0.method5743(), arg0.method5736(), arg0.method5736(), arg0.method5732());
	}
}
