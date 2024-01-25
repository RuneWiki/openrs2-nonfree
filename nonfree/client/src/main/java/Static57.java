import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!cs", name = "f", descriptor = "Lclient!fn;")
	public static Class79 aClass79_1;

	@OriginalMember(owner = "client!cs", name = "p", descriptor = "[S")
	public static short[] aShortArray10;

	@OriginalMember(owner = "client!cs", name = "r", descriptor = "Lclient!qr;")
	public static Class196 aClass196_1;

	@OriginalMember(owner = "client!cs", name = "s", descriptor = "Lclient!kt;")
	public static Class133_Sub1 aClass133_Sub1_2;

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_36 = new Class62("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!cs", name = "i", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_25 = new Class208(25, 3);

	@OriginalMember(owner = "client!cs", name = "o", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_37 = new Class62("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!cs", name = "q", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_38 = new Class62("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!cs", name = "t", descriptor = "I")
	public static int anInt1229 = 0;

	@OriginalMember(owner = "client!cs", name = "u", descriptor = "[I")
	public static final int[] anIntArray90 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)V")
	public static void method884() {
		@Pc(19) boolean local19 = Static268.aClass3_13 != null || Static334.anInt6171 > 0;
		if (local19) {
			Static303.anInt7065 = 1;
		}
		if (Static228.aBoolean332 && Static68.aClass98_1.method4517(81) && Static233.anInt4642 > 2) {
			if (local19) {
				Static53.aClass2_Sub43_1 = (Class2_Sub43) Static262.aClass238_29.aClass2_225.aClass2_243.aClass2_243;
			} else {
				Static133.method2328(Static248.aClass2_Sub17_1.method2189(), (Class2_Sub43) Static262.aClass238_29.aClass2_225.aClass2_243.aClass2_243, Static248.aClass2_Sub17_1.method2186());
			}
		} else if (local19) {
			Static53.aClass2_Sub43_1 = (Class2_Sub43) Static262.aClass238_29.aClass2_225.aClass2_243;
		} else {
			Static133.method2328(Static248.aClass2_Sub17_1.method2189(), (Class2_Sub43) Static262.aClass238_29.aClass2_225.aClass2_243, Static248.aClass2_Sub17_1.method2186());
		}
	}
}
