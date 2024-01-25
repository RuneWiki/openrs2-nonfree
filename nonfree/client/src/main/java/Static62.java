import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!dd", name = "U", descriptor = "Lclient!iw;")
	public static Class116 aClass116_1;

	@OriginalMember(owner = "client!dd", name = "F", descriptor = "Z")
	public static boolean aBoolean112 = false;

	@OriginalMember(owner = "client!dd", name = "I", descriptor = "[I")
	public static final int[] anIntArray114 = new int[2048];

	@OriginalMember(owner = "client!dd", name = "R", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_17 = new Class21("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)Lclient!au;")
	public static Class4_Sub4 method1454() {
		if (Static425.aClass91_24 == null || Static176.aClass222_1 == null) {
			return null;
		}
		for (@Pc(21) Class4_Sub4 local21 = (Class4_Sub4) Static176.aClass222_1.method5128(); local21 != null; local21 = (Class4_Sub4) Static176.aClass222_1.method5128()) {
			@Pc(29) Class217 local29 = Static425.aClass116_3.method3300(local21.anInt366);
			if (local29 != null && local29.aBoolean461 && local29.method5087(Static425.anInterface2_2)) {
				return local21;
			}
		}
		return null;
	}
}
