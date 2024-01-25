import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "Lclient!os;")
	public static Class186 aClass186_24;

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "Lclient!rt;")
	public static Class217 aClass217_15;

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "Lclient!l;")
	public static Class143 aClass143_32;

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_150 = new Class7("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_151 = new Class7(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
	public static int anInt6982 = 0;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method5736(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(14) int local14 = 0; local14 < Static28.anInt641; local14++) {
			if (arg0.equalsIgnoreCase(Static52.aStringArray33[local14])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static184.aStringArray23[local14])) {
				return true;
			}
		}
		return false;
	}
}
