import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!gf", name = "gd", descriptor = "Lclient!hl;")
	public static Class98 aClass98_1;

	@OriginalMember(owner = "client!gf", name = "Sc", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_37 = new Class11(36, -1);

	@OriginalMember(owner = "client!gf", name = "Xc", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_49 = new Class205(39, -2);

	@OriginalMember(owner = "client!gf", name = "Yc", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_35 = new Class32("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!gf", name = "Zc", descriptor = "[[I")
	public static final int[][] anIntArrayArray19 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!gf", name = "ad", descriptor = "I")
	public static int anInt2302 = 0;

	@OriginalMember(owner = "client!gf", name = "bd", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_38 = new Class11(60, 2);

	@OriginalMember(owner = "client!gf", name = "cd", descriptor = "I")
	public static int anInt2303 = -2;

	@OriginalMember(owner = "client!gf", name = "dd", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_39 = new Class11(37, 7);

	@OriginalMember(owner = "client!gf", name = "ed", descriptor = "Lclient!hq;")
	public static final Class101 aClass101_7 = new Class101("", 16);

	@OriginalMember(owner = "client!gf", name = "fd", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray1 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(IIIIIII)V")
	public static void method2249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class10_Sub2 local6 = (Class10_Sub2) Static163.aClass154_4.method3479(); local6 != null; local6 = (Class10_Sub2) Static163.aClass154_4.method3483()) {
			if (local6.anInt791 <= Static253.anInt4469) {
				local6.method4605();
			} else {
				Static295.method4431(arg3 >> 1, arg0 >> 1, (local6.anInt787 << 7) + 64, local6.anInt784, local6.anInt780 * 2, (local6.anInt785 << 7) + 64);
				Static340.aClass9_4.method5054(local6.aString11, local6.anInt789 | 0xFF000000, 0, Static355.anIntArray1252[1] + arg2, arg1 - -Static355.anIntArray1252[0]);
			}
		}
	}
}
