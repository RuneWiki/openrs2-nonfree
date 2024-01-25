import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "Lclient!ic;")
	public static Interface3 anInterface3_7;

	@OriginalMember(owner = "client!tq", name = "i", descriptor = "Z")
	public static boolean aBoolean451;

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "I")
	public static int anInt6028 = 0;

	@OriginalMember(owner = "client!tq", name = "h", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_202 = new Class18(50, 8);

	@OriginalMember(owner = "client!tq", name = "v", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_211 = new Class106("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!tq", name = "w", descriptor = "[I")
	public static final int[] anIntArray470 = new int[32];

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZIII)I")
	public static int method5425(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class1_Sub26 local13 = Static65.method5281(arg2, arg0);
		if (local13 == null) {
			return -1;
		} else if (arg1 >= 0 && local13.anIntArray255.length > arg1) {
			return local13.anIntArray255[arg1];
		} else {
			return -1;
		}
	}
}
