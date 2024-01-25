import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static144 {

	@OriginalMember(owner = "client!fq", name = "r", descriptor = "Lclient!su;")
	public static Class274 aClass274_1;

	@OriginalMember(owner = "client!fq", name = "s", descriptor = "I")
	public static int anInt2920;

	@OriginalMember(owner = "client!fq", name = "n", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_42 = new Class67("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!fq", name = "p", descriptor = "Lclient!km;")
	public static final Class166 aClass166_2 = new Class166();

	@OriginalMember(owner = "client!fq", name = "q", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_43 = new Class67("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!fq", name = "t", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_44 = new Class67("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "(I)V")
	public static void method2482() {
		Static149.aClass125_26.method3521();
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIIZII)V")
	public static void method2483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((arg2 ? Static7.aClass3_Sub15_Sub1_1.anInt8360 : Static7.aClass3_Sub15_Sub1_1.anInt8362) != 0 && arg4 != 0 && Static128.anInt2675 < 50 && arg1 != -1) {
			Static360.aClass70Array1[Static128.anInt2675++] = new Class70((byte) (arg2 ? 3 : 2), arg1, arg4, arg3, arg0, 0);
		}
	}
}
