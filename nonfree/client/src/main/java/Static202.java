import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static202 {

	@OriginalMember(owner = "client!jt", name = "Nb", descriptor = "F")
	public static float aFloat53;

	@OriginalMember(owner = "client!jt", name = "h", descriptor = "I")
	public static final int anInt4003 = 1339;

	@OriginalMember(owner = "client!jt", name = "Z", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_138 = new Class184(48, -1);

	@OriginalMember(owner = "client!jt", name = "db", descriptor = "I")
	public static int anInt4031 = 0;

	@OriginalMember(owner = "client!jt", name = "Mb", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_130 = new Class175("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)V")
	public static void method3295() {
		Static398.aClass3_Sub38_1 = new Class3_Sub38(Static141.aClass175_96.method4201(Static216.anInt4257), "", Static332.anInt6029, 1009, -1, 0L, 0, 0, true, false);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(BII)Z")
	public static boolean method3303(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static325.aByteArrayArrayArray15[1][arg1][arg0] & 0x2) != 0;
	}
}
