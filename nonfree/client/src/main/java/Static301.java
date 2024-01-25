import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!pa", name = "x", descriptor = "I")
	public static int anInt2759;

	@OriginalMember(owner = "client!pa", name = "D", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_44 = new Class25(12, 8);

	@OriginalMember(owner = "client!pa", name = "F", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_43 = new Class231("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!pa", name = "G", descriptor = "Z")
	public static boolean aBoolean200 = false;

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)V")
	public static void method2517() {
		Static150.aClass137_14.method3178();
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!lt;Lclient!ls;Lclient!lt;Lclient!lt;)Z")
	public static boolean method2519(@OriginalArg(1) Class158 arg0, @OriginalArg(2) Class6_Sub5_Sub3 arg1, @OriginalArg(3) Class158 arg2, @OriginalArg(4) Class158 arg3) {
		Static386.aClass158_83 = arg0;
		Static407.aClass158_86 = arg3;
		Static47.aClass6_Sub5_Sub3_7 = arg1;
		Static211.aClass158_45 = arg2;
		return true;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZZ)V")
	public static void method2520(@OriginalArg(1) boolean arg0) {
		Static305.anInt5001++;
		Static275.method4187();
		if (arg0) {
			Static341.anInt5727++;
			Static263.method4041();
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZI)V")
	public static void method2521(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			Static44.aClass28_14 = Static333.method3577(Static8.aClass173_Sub1_1.anInt4417 * 2, arg1, Static265.anInterface11_7, Static165.aClass103_3, Static314.aCanvas8);
		} else {
			if (arg0) {
				Static44.aClass28_14 = Static333.method3577(0, 0, Static265.anInterface11_7, Static165.aClass103_3, Static314.aCanvas8);
				Static44.aClass28_14.method3553(0);
				@Pc(23) Class201 local23 = Static150.method2471(Static241.aClass158_55, Static429.anInt7139);
				@Pc(32) Class92 local32 = Static44.aClass28_14.method3476(local23, Static455.method1708(Static76.aClass158_17, Static429.anInt7139));
				Static94.method1630(true, local32, Static306.aClass231_61.method5138(Static382.anInt6289));
				Static44.aClass28_14.method3503();
				Static240.method3729();
				Static44.aClass28_14.method3562();
			}
			try {
				Static44.aClass28_14 = Static333.method3577(Static8.aClass173_Sub1_1.anInt4417 * 2, arg1, Static265.anInterface11_7, Static165.aClass103_3, Static314.aCanvas8);
				if (Static44.aClass28_14.method3541()) {
					@Pc(65) Class6_Sub27 local65 = Static44.aClass28_14.method3516();
					Static44.aClass28_14.method3549(local65);
				}
			} catch (@Pc(70) Throwable local70) {
				Static44.aClass28_14 = Static333.method3577(0, 0, Static265.anInterface11_7, Static165.aClass103_3, Static314.aCanvas8);
				arg1 = 0;
			}
		}
		Static155.anInt2774 = arg1;
		Static171.method1544();
		if (!Static44.aClass28_14.method3493()) {
			Static373.anInt1818 = 1;
		}
		Static44.aClass28_14.method3567(Static373.anInt1818);
		Static44.aClass28_14.method3490(0);
		Static44.aClass28_14.method3495(8);
		Static318.aClass132_3 = Static44.aClass28_14.method3513();
		Static208.aClass132_1 = Static44.aClass28_14.method3513();
		Static268.method4098();
		Static44.aClass28_14.method3480(!Static8.aClass173_Sub1_1.aBoolean312);
		if (Static44.aClass28_14.method3537()) {
			Static416.method4229(Static8.aClass173_Sub1_1.aBoolean308);
		}
		Static328.method4699(Static84.anInt1632 >> 3, Static261.anInt4480 >> 3, Static44.aClass28_14);
		Static121.method1986();
		Static59.aBoolean106 = false;
	}
}
