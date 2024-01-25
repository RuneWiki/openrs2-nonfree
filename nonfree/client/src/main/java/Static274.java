import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static274 {

	@OriginalMember(owner = "client!qr", name = "u", descriptor = "Lclient!kd;")
	public static Class117 aClass117_4;

	@OriginalMember(owner = "client!qr", name = "C", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_42 = new Class107(8);

	@OriginalMember(owner = "client!qr", name = "K", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_132 = new Class140("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!qr", name = "L", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_133 = new Class140("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)V")
	public static void method4753(@OriginalArg(0) int arg0) {
		Static328.anInt6685 = 100;
		Static286.anInt5744 = arg0;
		Static308.anInt6109 = -1;
		Static314.anInt6200 = 3;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V")
	public static void method4755() {
		if (Static176.anInt3971 == 10 || Static176.anInt3971 == 28) {
			Static342.method5579(Static166.anInt3804 >> 10, Static51.anInt879 >> 10);
		} else if (Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6893 >= 0 && Static66.anInt1177 * 128 > Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6893 && Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6888 >= 0 && Static12.anInt213 * 128 > Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6888) {
			Static342.method5579(Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray535[0] >> 3, Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray534[0] >> 3);
		} else {
			Static342.method5579(Static66.anInt1177 >> 4, Static12.anInt213 >> 4);
		}
		Static151.method3017();
		Static242.method4782();
		Static295.method4926();
		Static25.method329();
	}
}
