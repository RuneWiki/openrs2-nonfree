import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static100 {

	@OriginalMember(owner = "client!ev", name = "e", descriptor = "F")
	public static float aFloat21;

	@OriginalMember(owner = "client!ev", name = "B", descriptor = "Lclient!ub;")
	public static Class244 aClass244_9;

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_74 = new Class56(40, 8);

	@OriginalMember(owner = "client!ev", name = "d", descriptor = "I")
	public static int anInt1832 = 0;

	@OriginalMember(owner = "client!ev", name = "s", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_75 = new Class56(105, -1);

	@OriginalMember(owner = "client!ev", name = "v", descriptor = "I")
	public static int anInt1833 = 0;

	@OriginalMember(owner = "client!ev", name = "E", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_35 = new Class15("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(BI)Z")
	public static boolean method1513(@OriginalArg(1) int arg0) {
		if (arg0 == 3 || arg0 == 59 || arg0 == 46 || arg0 == 6 || arg0 == 1002) {
			return true;
		} else {
			return arg0 == 44 || arg0 == 1004;
		}
	}
}
