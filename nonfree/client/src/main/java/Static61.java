import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static61 {

	@OriginalMember(owner = "client!cs", name = "s", descriptor = "Lclient!dn;")
	public static Class56 aClass56_17;

	@OriginalMember(owner = "client!cs", name = "r", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_55 = new Class184(45, 12);

	@OriginalMember(owner = "client!cs", name = "t", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_51 = new Class175("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

	@OriginalMember(owner = "client!cs", name = "u", descriptor = "I")
	public static int anInt1445 = 0;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIB)Z")
	public static boolean method1204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0 | Static348.method5826(arg1, arg0) || Static64.method1273(arg0, arg1);
	}
}
