import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!gq", name = "F", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_113 = new Class40("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!gq", name = "H", descriptor = "I")
	public static int anInt7198 = 0;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIIIII)V")
	public static void method5834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 - arg1 >= Static398.anInt7144 && arg4 + arg1 <= Static71.anInt4958 && arg3 - arg1 >= Static4.anInt6709 && Static492.anInt8451 >= arg1 + arg3) {
			Static183.method3489(arg2, arg5, arg1, arg4, arg3, arg0);
		} else {
			Static474.method2673(arg2, arg0, arg1, arg3, arg5, arg4);
		}
	}

	@OriginalMember(owner = "client!gq", name = "f", descriptor = "(I)Lclient!gb;")
	public static Class5_Sub18 method5835() {
		if (Static245.aClass99_60 == null || Static395.aClass59_1 == null) {
			return null;
		}
		Static395.aClass59_1.method1395(Static245.aClass99_60);
		@Pc(18) Class5_Sub18 local18 = (Class5_Sub18) Static395.aClass59_1.method1397();
		if (local18 == null) {
			return null;
		} else {
			@Pc(33) Class101 local33 = Static245.aClass246_4.method5847(local18.anInt3138);
			return local33 != null && local33.aBoolean187 && local33.method2603(Static245.anInterface7_2) ? local18 : Static298.method4946();
		}
	}
}
