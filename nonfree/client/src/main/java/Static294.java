import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
	public static int anInt5055;

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "Lclient!dp;")
	public static Class51 aClass51_16;

	@OriginalMember(owner = "client!qs", name = "v", descriptor = "[Lclient!dp;")
	public static Class51[] aClass51Array17;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "Lclient!o;")
	public static final Class169 aClass169_276 = new Class169(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!qs", name = "i", descriptor = "Lclient!o;")
	public static final Class169 aClass169_277 = new Class169("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

	@OriginalMember(owner = "client!qs", name = "n", descriptor = "I")
	public static int anInt5063 = 64;

	@OriginalMember(owner = "client!qs", name = "p", descriptor = "Lclient!o;")
	public static final Class169 aClass169_278 = new Class169("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method4444(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static248.anInt4157; local16++) {
			if (arg0.equalsIgnoreCase(Static175.aStringArray45[local16])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static321.aClass25_Sub1_Sub1_Sub1_2.aString6);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IC)C")
	public static char method4445(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "()V")
	public static void method4447() {
		Static227.method4199(Static337.anInt5599);
	}
}
