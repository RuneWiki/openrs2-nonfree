import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!jp", name = "w", descriptor = "I")
	public static int anInt3883;

	@OriginalMember(owner = "client!jp", name = "x", descriptor = "I")
	public static int anInt3884;

	@OriginalMember(owner = "client!jp", name = "v", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_84 = new Class119(73, 12);

	@OriginalMember(owner = "client!jp", name = "z", descriptor = "Lclient!mr;")
	public static final Class157 aClass157_1 = new Class157();

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZII)V")
	public static void method3106(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			Static121.aClass172_3 = Static318.method5506(Static374.aClass20_Sub1_1.anInt2350 * 2, arg1, Static180.anInterface5_4, Static66.aClass143_2, Static392.aCanvas6);
		} else {
			if (arg0) {
				Static121.aClass172_3 = Static318.method5506(0, 0, Static180.anInterface5_4, Static66.aClass143_2, Static392.aCanvas6);
				Static121.aClass172_3.M(0);
				@Pc(36) Class70 local36 = Static388.method5044(Static56.aClass32_26, Static387.anInt6464);
				@Pc(45) Class59 local45 = Static121.aClass172_3.method5545(local36, Static464.method5837(Static405.aClass32_82, Static387.anInt6464));
				Static53.method1120(true, Static21.aClass189_14.method4262(Static53.anInt1454), local45);
				Static121.aClass172_3.method5515();
				Static134.method2068();
				Static121.aClass172_3.method5538();
			}
			try {
				Static121.aClass172_3 = Static318.method5506(Static374.aClass20_Sub1_1.anInt2350 * 2, arg1, Static180.anInterface5_4, Static66.aClass143_2, Static392.aCanvas6);
				if (Static121.aClass172_3.method5496()) {
					@Pc(80) Class3_Sub29 local80 = Static121.aClass172_3.method5487();
					Static121.aClass172_3.method5526(local80);
				}
			} catch (@Pc(85) Throwable local85) {
				arg1 = 0;
				Static121.aClass172_3 = Static318.method5506(0, 0, Static180.anInterface5_4, Static66.aClass143_2, Static392.aCanvas6);
			}
		}
		Static105.anInt2382 = arg1;
		Static421.method5377();
		if (!Static121.aClass172_3.method5491()) {
			Static181.anInt3616 = 1;
		}
		Static121.aClass172_3.method5497(Static181.anInt3616);
		Static121.aClass172_3.method5521(0);
		Static121.aClass172_3.na(8);
		Static303.aClass107_4 = Static121.aClass172_3.method5524();
		Static407.aClass107_5 = Static121.aClass172_3.method5524();
		Static242.method3663();
		Static121.aClass172_3.method5541(!Static374.aClass20_Sub1_1.aBoolean195);
		if (Static121.aClass172_3.method5486()) {
			Static354.method4717(Static374.aClass20_Sub1_1.aBoolean197);
		}
		Static146.method2390(Static121.aClass172_3, Static44.anInt7276 >> 3, Static40.anInt1089 >> 3);
		Static214.method3288();
		Static196.aBoolean336 = false;
	}
}
