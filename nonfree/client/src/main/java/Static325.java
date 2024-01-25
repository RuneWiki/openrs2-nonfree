import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
	public static int anInt5266;

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_95 = new Class15("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_72 = new Class146(60, 3);

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "Lclient!ud;")
	public static final Class245 aClass245_14 = new Class245(13, 0, 1, 0);

	@OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
	public static int anInt5268 = -1;

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
	public static int anInt5269 = -1;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)Lclient!pp;")
	public static Class201 method4289(@OriginalArg(1) int arg0) {
		@Pc(13) Class201[] local13 = Static122.method1730();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class201 local21 = local13[local15];
			if (arg0 == local21.anInt5077) {
				return local21;
			}
		}
		return null;
	}
}
