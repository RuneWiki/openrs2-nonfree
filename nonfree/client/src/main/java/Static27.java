import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static27 {

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "Z")
	public static boolean aBoolean39 = false;

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_13 = new Class267("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "S")
	public static short aShort4 = 320;

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_14 = new Class267("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

	@OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
	public static int anInt813 = 0;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIII)V")
	public static void method690(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 - arg1 >= Static165.anInt3313 && Static152.anInt3132 >= arg1 + arg2 && arg3 - arg1 >= Static172.anInt3442 && arg1 + arg3 <= Static324.anInt5590) {
			Static66.method1372(arg2, arg0, arg1, arg3);
		} else {
			Static102.method1833(arg0, arg1, arg3, arg2);
		}
	}
}
