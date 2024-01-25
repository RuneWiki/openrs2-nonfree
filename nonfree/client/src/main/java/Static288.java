import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static288 {

	@OriginalMember(owner = "client!oh", name = "J", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_142 = new Class158("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!oh", name = "L", descriptor = "I")
	public static int anInt5501 = 2;

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(III)Z")
	public static boolean method4245(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}
}
