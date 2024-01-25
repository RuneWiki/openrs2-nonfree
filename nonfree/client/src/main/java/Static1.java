import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "S", descriptor = "I")
	public static int anInt47;

	@OriginalMember(owner = "client!a", name = "M", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_4 = new Class151("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!a", name = "T", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray1 = new int[2][][];

	@OriginalMember(owner = "client!a", name = "U", descriptor = "I")
	public static int anInt48 = 0;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(III)Z")
	public static boolean method36(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static443.method4778(arg0, arg1) || Static399.method5010(arg0, arg1);
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(IIIIII)V")
	public static void method38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static336.aClass106_Sub1_1.anInt5696 != 0 && arg3 != 0 && Static353.anInt5858 < 50 && arg1 != -1) {
			Static104.aClass98Array2[Static353.anInt5858++] = new Class98((byte) 1, arg1, arg3, arg4, arg2, arg0);
		}
	}
}
