import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!pf", name = "T", descriptor = "Lclient!oc;")
	public static Class212 aClass212_4;

	@OriginalMember(owner = "client!pf", name = "F", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_112 = new Class67("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

	@OriginalMember(owner = "client!pf", name = "W", descriptor = "Ljava/lang/String;")
	public static String aString49 = "";

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BI)Lclient!db;")
	public static Class57 method5828(@OriginalArg(1) int arg0) {
		@Pc(8) Class57[] local8 = Static65.method1312();
		for (@Pc(18) int local18 = 0; local18 < local8.length; local18++) {
			if (local8[local18].anInt1627 == arg0) {
				return local8[local18];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(CZ)Z")
	public static boolean method5831(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
