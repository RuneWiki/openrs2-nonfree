import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static343 {

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "J")
	public static long aLong170;

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "I")
	public static int anInt5618 = 0;

	@OriginalMember(owner = "client!qq", name = "f", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_101 = new Class198("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BI)Z")
	public static boolean method4461(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IB)Lclient!dk;")
	public static Class50_Sub1 method4462(@OriginalArg(0) int arg0) {
		return Static125.aBoolean156 && arg0 >= Static436.anInt5879 && arg0 <= Static136.anInt7479 ? Static398.aClass50_Sub1Array2[arg0 - Static436.anInt5879] : null;
	}
}
