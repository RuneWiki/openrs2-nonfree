import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_147 = new Class221("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
	public static int anInt4272 = 0;

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "[I")
	public static final int[] anIntArray521 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
	public static void method3811() {
		for (@Pc(3) int local3 = 0; local3 < Static199.anInt3672; local3++) {
			@Pc(9) int local9 = Static346.anIntArray730[local3];
			@Pc(13) Class12_Sub1_Sub2_Sub1 local13 = Static107.aClass12_Sub1_Sub2_Sub1Array1[local9];
			if (local13 != null) {
				Static190.method3040(local13.aClass240_1.anInt6483, local13);
			}
		}
	}
}
