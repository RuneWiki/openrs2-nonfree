import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static329 {

	@OriginalMember(owner = "client!qp", name = "D", descriptor = "[Lclient!f;")
	public static Class80[] aClass80Array14;

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray45 = new String[100];

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_74 = new Class84("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!qp", name = "C", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray46 = new String[200];

	@OriginalMember(owner = "client!qp", name = "E", descriptor = "[I")
	public static final int[] anIntArray455 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!qp", name = "F", descriptor = "Lclient!uf;")
	public static Class237 aClass237_97 = null;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIII)V")
	public static void method4613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static389.aClass128_Sub1_1.anInt3565 != 0 && arg2 != 0 && Static442.anInt5016 < 50 && arg3 != -1) {
			Static254.aClass12Array1[Static442.anInt5016++] = new Class12((byte) 2, arg3, arg2, arg0, arg1, 0);
		}
	}
}
