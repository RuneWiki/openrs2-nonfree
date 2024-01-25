import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!gp", name = "P", descriptor = "I")
	public static int anInt2875;

	@OriginalMember(owner = "client!gp", name = "L", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_46 = new Class267("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

	@OriginalMember(owner = "client!gp", name = "M", descriptor = "I")
	public static int anInt2872 = 0;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IBLclient!ts;)Ljava/lang/String;")
	public static String method2403(@OriginalArg(0) int arg0, @OriginalArg(2) Class239 arg1) {
		if (!Static50.method1150(arg1).method1218(arg0) && arg1.anObjectArray32 == null) {
			return null;
		} else if (arg1.aStringArray45 == null || arg0 >= arg1.aStringArray45.length || arg1.aStringArray45[arg0] == null || arg1.aStringArray45[arg0].trim().length() == 0) {
			return Static27.aBoolean39 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray45[arg0];
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method2405(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static398.anInt2169; local11++) {
			if (arg0.equalsIgnoreCase(Static314.aStringArray32[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static302.aClass3_Sub2_Sub1_Sub2_2.aString54);
	}
}
