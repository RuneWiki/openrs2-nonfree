import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "[I")
	public static final int[] anIntArray128 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
	public static final int anInt1400 = 4;

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_34 = new Class88("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_21 = new Class45(20, 4);

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "Z")
	public static boolean aBoolean99 = false;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZZ)V")
	public static void method1407(@OriginalArg(0) boolean arg0) {
		Static64.method7548(Static169.anInt3893, Static127.anInt2936, Static406.anInt7660, arg0);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!bea;)I")
	public static int method1408(@OriginalArg(1) Class30_Sub1_Sub1_Sub1 arg0) {
		@Pc(13) int local13 = arg0.anInt759;
		@Pc(17) Class166 local17 = arg0.method3602();
		if (arg0.aBoolean335) {
			local13 = arg0.anInt753;
		} else if (arg0.anInt4155 == local17.anInt4962 || local17.anInt4973 == arg0.anInt4155 || arg0.anInt4155 == local17.anInt4992 || local17.anInt4982 == arg0.anInt4155) {
			local13 = arg0.anInt727;
		} else if (local17.anInt4987 == arg0.anInt4155 || local17.anInt4971 == arg0.anInt4155 || arg0.anInt4155 == local17.anInt4983 || arg0.anInt4155 == local17.anInt4978) {
			local13 = arg0.anInt742;
		}
		return local13;
	}
}
