import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!wl", name = "n", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_235 = new Class106("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!wl", name = "p", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_179 = new Class21(260);

	@OriginalMember(owner = "client!wl", name = "q", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_236 = new Class106("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!wl", name = "r", descriptor = "[I")
	public static final int[] anIntArray513 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!wl", name = "s", descriptor = "Lclient!g;")
	public static final Class67 aClass67_1 = new Class67();

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIII)V")
	public static void method5987(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class1_Sub4_Sub17 local13 = Static132.method2717(arg3, 4);
		local13.method3480();
		local13.anInt3725 = arg2;
		local13.anInt3727 = arg0;
		local13.anInt3724 = arg1;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)I")
	public static int method5989() {
		if ((double) Static269.aFloat25 == 3.0D) {
			return 37;
		} else if ((double) Static269.aFloat25 == 4.0D) {
			return 50;
		} else if ((double) Static269.aFloat25 == 6.0D) {
			return 75;
		} else if ((double) Static269.aFloat25 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}
}
