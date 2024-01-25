import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!sd", name = "L", descriptor = "I")
	public static int anInt5991;

	@OriginalMember(owner = "client!sd", name = "C", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_228 = new Class137(21, 4);

	@OriginalMember(owner = "client!sd", name = "I", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_188 = new Class151("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!sd", name = "K", descriptor = "I")
	public static int anInt5990 = 0;

	@OriginalMember(owner = "client!sd", name = "N", descriptor = "I")
	public static int anInt5993 = 1;

	@OriginalMember(owner = "client!sd", name = "Q", descriptor = "Z")
	public static boolean aBoolean498 = false;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4660(@OriginalArg(0) String arg0) {
		Static174.method2341(0, "", 0, "", arg0);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IC)Z")
	public static boolean method4662(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static63.method972(arg0)) {
			return true;
		} else {
			@Pc(23) char[] local23 = Static307.aCharArray4;
			for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
				@Pc(31) char local31 = local23[local25];
				if (arg0 == local31) {
					return true;
				}
			}
			@Pc(51) char[] local51 = Static335.aCharArray5;
			for (@Pc(53) int local53 = 0; local53 < local51.length; local53++) {
				@Pc(59) char local59 = local51[local53];
				if (arg0 == local59) {
					return true;
				}
			}
			return false;
		}
	}
}
