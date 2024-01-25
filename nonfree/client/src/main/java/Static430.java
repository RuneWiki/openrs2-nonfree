import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
	public static int anInt7565;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_125 = new Class40("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
	public static int anInt7560 = 1;

	@OriginalMember(owner = "client!rn", name = "l", descriptor = "I")
	public static int anInt7566 = 2;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)V")
	public static void method6131(@OriginalArg(0) int arg0) {
		if (!Static348.method5412(arg0)) {
			return;
		}
		@Pc(14) Class220[] local14 = Static139.aClass220ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class220 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt6604 = 1;
				local22.anInt6619 = 0;
				local22.anInt6649 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)I")
	public static int method6133() {
		return 42;
	}
}
