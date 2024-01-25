import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
	public static int anInt7308;

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "Lclient!wi;")
	public static final Class268 aClass268_58 = new Class268(8);

	@OriginalMember(owner = "client!vl", name = "f", descriptor = "Lclient!of;")
	public static final Class174 aClass174_205 = new Class174("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
	public static void method5910() {
		Static307.method4633(Static50.aClass163_30);
		Static243.aClass3_Sub25_Sub1_7.method4123(Static179.anInt3324);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIBI)Z")
	public static boolean method5911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg1; local12 <= arg0; local12++) {
			for (@Pc(16) int local16 = arg3; local16 <= arg2; local16++) {
				if (Static392.anIntArrayArray56[local12][local16] == arg4 && Static200.anIntArrayArray26[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V")
	public static void method5912() {
		Static95.aBoolean108 = true;
	}
}
