import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "Lclient!gu;")
	public static Class100 aClass100_7;

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "[I")
	public static int[] anIntArray332;

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "Lclient!f;")
	public static Class80 aClass80_10;

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_54 = new Class84("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_71 = new Class237(87, -1);

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
	public static final int anInt4114 = 1405;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IBLclient!ss;)Ljava/lang/String;")
	public static String method3407(@OriginalArg(0) int arg0, @OriginalArg(2) Class219 arg1) {
		if (!Static53.method916(arg1).method5788(arg0) && arg1.anObjectArray21 == null) {
			return null;
		} else if (arg1.aStringArray49 == null || arg1.aStringArray49.length <= arg0 || arg1.aStringArray49[arg0] == null || arg1.aStringArray49[arg0].trim().length() == 0) {
			return Static239.aBoolean287 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray49[arg0];
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)I")
	public static int method3408() {
		return 16;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ID)V")
	public static void method3409(@OriginalArg(1) double arg0) {
		if (Static77.aDouble1 == arg0) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(27) int local27 = (int) (Math.pow((double) local15 / 255.0D, arg0) * 255.0D);
			Static310.anIntArray437[local15] = local27 > 255 ? 255 : local27;
		}
		Static77.aDouble1 = arg0;
	}
}
