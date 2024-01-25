import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static280 {

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "[I")
	public static int[] anIntArray238;

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "[Lclient!et;")
	public static Class71[] aClass71Array1;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "Lclient!eu;")
	public static final Class72 aClass72_1 = Static433.method5429();

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_144 = new Class151("wave:", "welle:", "ondulation:", "onda:");

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_145 = new Class151("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_146 = new Class151("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!qa;Lclient!ic;Lclient!ic;I)V")
	public static void method3525(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class113 arg1, @OriginalArg(2) Class113 arg2) {
		Static308.aClass122_6 = Static41.method653(arg2, Static421.anInt6819);
		Static439.aClass16_4 = arg0.method3575(Static308.aClass122_6, Static458.method1923(arg1, Static421.anInt6819));
		Static453.aClass122_10 = Static41.method653(arg2, Static132.anInt2275);
		Static275.aClass16_2 = arg0.method3575(Static453.aClass122_10, Static458.method1923(arg1, Static132.anInt2275));
		Static6.aClass122_1 = Static41.method653(arg2, Static130.anInt2247);
		Static227.aClass16_1 = arg0.method3575(Static6.aClass122_1, Static458.method1923(arg1, Static130.anInt2247));
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)Z")
	public static boolean method3526(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
