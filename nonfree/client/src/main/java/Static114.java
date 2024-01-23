import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!li", name = "E", descriptor = "Lclient!ab;")
	public static Class3 aClass3_1;

	@OriginalMember(owner = "client!li", name = "G", descriptor = "Lclient!lj;")
	public static Class60 aClass60_2;

	@OriginalMember(owner = "client!li", name = "M", descriptor = "Lclient!nb;")
	public static Class15 aClass15_22;

	@OriginalMember(owner = "client!li", name = "P", descriptor = "I")
	public static int anInt2772;

	@OriginalMember(owner = "client!li", name = "R", descriptor = "Lclient!q;")
	public static Class80 aClass80_10;

	@OriginalMember(owner = "client!li", name = "H", descriptor = "Lclient!i;")
	public static Class41 aClass41_791 = Static184.method2923("Sprites geladen)3");

	@OriginalMember(owner = "client!li", name = "J", descriptor = "Lclient!i;")
	public static Class41 aClass41_792 = Static184.method2923("Spieler");

	@OriginalMember(owner = "client!li", name = "S", descriptor = "Lclient!i;")
	private static Class41 aClass41_794 = Static184.method2923("Select a world");

	@OriginalMember(owner = "client!li", name = "Q", descriptor = "Lclient!i;")
	public static Class41 aClass41_793 = aClass41_794;

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(II)I")
	public static int method1946(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIII)V")
	public static void method1948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static182.anInt4210; local3++) {
			if (Static118.anIntArray306[local3] + Static71.anIntArray175[local3] > arg0 && Static71.anIntArray175[local3] < arg2 + arg0 && Static117.anIntArray303[local3] + Static70.anIntArray173[local3] > arg3 && arg1 + arg3 > Static117.anIntArray303[local3]) {
				Static187.aBooleanArray22[local3] = true;
			}
		}
	}
}
