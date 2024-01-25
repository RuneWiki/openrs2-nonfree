import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static410 {

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
	public static int anInt6845;

	@OriginalMember(owner = "client!uh", name = "u", descriptor = "[Lclient!ya;")
	public static Class125[] aClass125Array3;

	@OriginalMember(owner = "client!uh", name = "y", descriptor = "[I")
	public static int[] anIntArray466;

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_113 = new Class198("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!uh", name = "z", descriptor = "[[I")
	public static final int[][] anIntArrayArray61 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)Z")
	public static boolean method5407(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZII)V")
	public static void method5408(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		Static452.aByteArrayArrayArray16 = new byte[4][arg0][arg1];
	}
}
