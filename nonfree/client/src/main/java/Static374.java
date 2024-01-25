import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!sp", name = "s", descriptor = "I")
	public static int anInt5604;

	@OriginalMember(owner = "client!sp", name = "o", descriptor = "[I")
	public static final int[] anIntArray528 = new int[32];

	@OriginalMember(owner = "client!sp", name = "p", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_147 = new Class158("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!sp", name = "r", descriptor = "Lclient!ui;")
	public static final Class248 aClass248_6 = new Class248("WTRC", 1);

	@OriginalMember(owner = "client!sp", name = "t", descriptor = "[I")
	public static final int[] anIntArray529 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(BII)V")
	public static void method4326(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class108 local9 = Static134.aClass108ArrayArray1[arg0][arg1];
		if (local9 != null) {
			Static354.anInt6589 = local9.anInt3375;
			Static337.anInt6175 = local9.anInt3377;
			Static456.anInt1595 = local9.anInt3379;
		}
		Static71.method1364();
	}
}
