import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
	public static int anInt2978;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_53 = new Class57("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BILclient!oa;IB)V")
	public static void method2632(@OriginalArg(1) int arg0, @OriginalArg(2) Class28_Sub1_Sub1_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg1.anIntArray491[0];
		@Pc(15) int local15 = arg1.anIntArray490[0];
		if (local10 < 0 || Static12.anInt161 <= local10 || local15 < 0 || local15 >= Static44.anInt787 || (arg2 < 0 || Static12.anInt161 <= arg2 || arg0 < 0 || arg0 >= Static44.anInt787)) {
			return;
		}
		@Pc(89) int local89 = Static34.method529(true, arg2, 0, Static151.anIntArray298, local10, 0, arg0, Static271.anIntArray696, 0, 0, arg1.method4009(), -4, Static160.aClass67Array3[arg1.aByte73], local15);
		if (local89 >= 1 && local89 <= 3) {
			for (@Pc(101) int local101 = 0; local101 < local89 - 1; local101++) {
				arg1.method4027(Static271.anIntArray696[local101], (byte) 2, Static151.anIntArray298[local101]);
			}
		}
	}
}
