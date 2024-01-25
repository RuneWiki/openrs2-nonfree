import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
	public static int anInt1379;

	@OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
	public static int anInt1377 = 0;

	@OriginalMember(owner = "client!dm", name = "p", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_35 = new Class55("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
	public static int anInt1386 = 0;

	@OriginalMember(owner = "client!dm", name = "s", descriptor = "[[I")
	public static final int[][] anIntArrayArray6 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIIII)V")
	public static void method1194(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(10) Class28_Sub7 local10 = (Class28_Sub7) Static335.aClass169_7.method3598(); local10 != null; local10 = (Class28_Sub7) Static335.aClass169_7.method3597()) {
			if (Static274.anInt4617 >= local10.anInt5879) {
				local10.method5642();
			} else {
				Static407.method5112((local10.anInt5882 << 7) + 64, arg0 >> 1, local10.anInt5881, arg3 >> 1, local10.anInt5878 * 2, (local10.anInt5877 << 7) + 64);
				Static305.aClass63_15.method4585(0, local10.anInt5876 | 0xFF000000, local10.aString58, Static25.anIntArray37[0] + arg2, Static25.anIntArray37[1] + arg1);
			}
		}
	}
}
