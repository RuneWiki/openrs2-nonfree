import org.openrs2.deob.annotation.OriginalMember;

public final class Static8 {

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
	public static int anInt118 = 0;

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_3 = new Class45(105, 3);

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "[S")
	public static short[] aShortArray5 = new short[256];

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_3 = new Class88("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
	public static int anInt119 = -1;

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "[I")
	public static final int[] anIntArray15 = new int[200];

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	public static void method259() {
		if (Static366.aBoolean639) {
			return;
		}
		if (Static208.aClass12_Sub10_Sub1_1.aBoolean184) {
			Static49.aFloat10 = (int) Static49.aFloat10 + 47 & 0xFFFFFFF0;
		} else {
			Static360.aFloat146 += (12.0F - Static360.aFloat146) / 2.0F;
		}
		Static366.aBoolean639 = true;
		Static497.aBoolean640 = true;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)Z")
	public static boolean method260() {
		return Static171.aClass285_4 != Static79.aClass285_2 || Static59.anInt1442 >= 2;
	}
}
