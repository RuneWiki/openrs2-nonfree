import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static197 {

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_55 = new Class15("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
	public static int anInt3567 = 0;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIII)V")
	public static void method2847(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == arg4) {
			Static350.method4631(arg2, arg3, arg0, arg1);
		} else if (Static62.anInt1114 <= arg1 - arg3 && Static207.anInt3632 >= arg1 + arg3 && arg2 - arg4 >= Static254.anInt4211 && Static275.anInt4594 >= arg2 + arg4) {
			Static224.method3035(arg1, arg3, arg0, arg2, arg4);
		} else {
			Static62.method868(arg2, arg4, arg0, arg3, arg1);
		}
	}
}
