import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!mv", name = "n", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray20;

	@OriginalMember(owner = "client!mv", name = "i", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_148 = new Class55("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!mv", name = "p", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray21 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!mv", name = "u", descriptor = "I")
	public static final int anInt7389 = 1405;

	@OriginalMember(owner = "client!mv", name = "y", descriptor = "Z")
	public static boolean aBoolean495 = false;

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIIII)V")
	public static void method5692(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg2) {
			Static404.method5769(Static353.anIntArrayArray48[arg0], arg1, arg2, arg3);
		} else {
			Static404.method5769(Static353.anIntArrayArray48[arg0], arg2, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IB)V")
	public static void method5696(@OriginalArg(0) int arg0) {
		@Pc(16) Class7_Sub4_Sub14 local16 = Static54.method750(arg0, 16);
		local16.method4710();
	}
}
