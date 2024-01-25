import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
	public static int anInt7964 = -2;

	@OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
	public static int anInt7969 = 0;

	@OriginalMember(owner = "client!tc", name = "B", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_134 = new Class40("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

	@OriginalMember(owner = "client!tc", name = "F", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_197 = new Class150(31, 6);

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)Lclient!br;")
	public static Class37 method6477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static152.aClass37ArrayArrayArray1[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static152.aClass37ArrayArrayArray1[0][arg1][arg2] != null && Static152.aClass37ArrayArrayArray1[0][arg1][arg2].aClass37_1 != null;
			if (local28 && arg0 >= Static460.anInt7893 - 1) {
				return null;
			}
			Static125.method2376(arg0, arg1, arg2);
		}
		return Static152.aClass37ArrayArrayArray1[arg0][arg1][arg2];
	}
}
