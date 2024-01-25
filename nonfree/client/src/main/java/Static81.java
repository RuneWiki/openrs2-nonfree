import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!du", name = "t", descriptor = "I")
	public static int anInt1504;

	@OriginalMember(owner = "client!du", name = "u", descriptor = "I")
	public static int anInt1505;

	@OriginalMember(owner = "client!du", name = "o", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_51 = new Class151("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!du", name = "q", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_73 = new Class137(53, 4);

	@OriginalMember(owner = "client!du", name = "v", descriptor = "I")
	public static int anInt1506 = 0;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIII)I")
	public static int method1239(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg2 & 0x3;
		if (local12 == 0) {
			return arg1;
		} else if (local12 == 1) {
			return arg0;
		} else if (local12 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg0;
		}
	}
}
