import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!f", name = "k", descriptor = "Lclient!fo;")
	public static Class82 aClass82_24;

	@OriginalMember(owner = "client!f", name = "f", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_51 = new Class119("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

	@OriginalMember(owner = "client!f", name = "h", descriptor = "Z")
	public static boolean aBoolean226 = false;

	@OriginalMember(owner = "client!f", name = "i", descriptor = "Lclient!sr;")
	public static final Class227 aClass227_9 = new Class227();

	@OriginalMember(owner = "client!f", name = "l", descriptor = "I")
	public static int anInt1920 = 0;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIBIII)Z")
	public static boolean method1588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(15) int local15 = arg2; local15 <= arg3; local15++) {
			for (@Pc(19) int local19 = arg4; local19 <= arg1; local19++) {
				if (arg0 == Static200.anIntArrayArray32[local15][local19] && Static97.anIntArrayArray25[local15][local19] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
