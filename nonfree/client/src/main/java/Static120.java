import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static120 {

	@OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
	public static int anInt2585;

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_53 = new Class119(46, 6);

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
	public static int anInt2584 = 0;

	@OriginalMember(owner = "client!fr", name = "g", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_82 = new Class189("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
	public static int anInt2586 = -1;

	@OriginalMember(owner = "client!fr", name = "i", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_54 = new Class119(105, 3);

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IZZBI)V")
	public static void method1954(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		Static403.method5199(arg0, arg1, arg3, 0, arg2, Static57.aClass117_Sub1Array3.length - 1);
		Static37.aClass3_Sub1_2 = null;
		Static35.anInt997 = 0;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(III)Z")
	public static boolean method1956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static104.method1811(arg1, arg0)) {
			return (arg0 & 0xB000) != 0 | Static13.method309(arg1, arg0) | Static14.method323(arg1, arg0) ? true : (Static164.method2715(arg0, arg1) | Static223.method5947(arg1, arg0)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}
}
