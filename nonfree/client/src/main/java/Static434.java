import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "Lclient!oi;")
	public static Class185 aClass185_115;

	@OriginalMember(owner = "client!vm", name = "j", descriptor = "[I")
	public static int[] anIntArray495;

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_112 = new Class142("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
	public static int anInt6897 = 0;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIBI)V")
	public static void method5490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) int local6;
		if (arg3 <= arg2) {
			for (local6 = arg3; local6 < arg2; local6++) {
				Static194.anIntArrayArray28[local6][arg1] = arg0;
			}
		} else {
			for (local6 = arg2; local6 < arg3; local6++) {
				Static194.anIntArrayArray28[local6][arg1] = arg0;
			}
		}
	}
}
