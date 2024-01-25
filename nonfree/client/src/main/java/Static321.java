import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_134 = new Class85("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_58 = new Class109(50);

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "Z")
	public static boolean aBoolean519 = false;

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
	public static int anInt6213 = 13156520;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIII)V")
	public static void method5574(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static125.aClass5_Sub12_Sub2_3.anInt5731 = 0;
		Static125.aClass5_Sub12_Sub2_3.method5089(20);
		Static125.aClass5_Sub12_Sub2_3.method5089(arg1);
		Static125.aClass5_Sub12_Sub2_3.method5089(arg3);
		Static125.aClass5_Sub12_Sub2_3.method5084(arg2);
		Static125.aClass5_Sub12_Sub2_3.method5084(arg0);
		Static8.anInt187 = -3;
		Static350.anInt6718 = 1;
		Static18.anInt359 = 0;
		Static41.anInt725 = 0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!rb;)V")
	public static void method5575(@OriginalArg(1) Class5_Sub16 arg0) {
		arg0.aBoolean550 = false;
		if (arg0.aClass5_Sub10_5 != null) {
			arg0.aClass5_Sub10_5.anInt1038 = 0;
		}
		for (@Pc(21) Class5_Sub16 local21 = arg0.method5790(); local21 != null; local21 = arg0.method5791()) {
			method5575(local21);
		}
	}
}
