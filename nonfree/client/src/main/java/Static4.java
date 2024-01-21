import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "vb", descriptor = "Lclient!ea;")
	public static Class20_Sub1 aClass20_Sub1_1;

	@OriginalMember(owner = "client!ad", name = "E", descriptor = "Lclient!ja;")
	public static Class39 aClass39_40 = Static28.method504("0(U");

	@OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
	public static int anInt65 = 0;

	@OriginalMember(owner = "client!ad", name = "Q", descriptor = "Lclient!ja;")
	private static Class39 aClass39_41 = Static28.method504("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!ad", name = "qb", descriptor = "I")
	public static int anInt88 = 0;

	@OriginalMember(owner = "client!ad", name = "Gb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_42 = aClass39_41;

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(B)V")
	public static void method69() {
		Static105.anInt2033 = 0;
		Static101.aBoolean122 = false;
		Static117.anInt2947 = 0;
		Static47.anInt1184 = -1;
		Static103.anInt2562 = -1;
		Static23.anInt653 = 0;
		Static14.anInt371 = 0;
		Static55.anInt1508 = -1;
		Static114.aClass4_Sub16_Sub1_3.anInt2019 = 0;
		Static122.anInt3028 = -1;
		Static97.anInt2446 = 0;
		Static125.anInt3127 = 0;
		Static35.aClass4_Sub16_Sub1_1.anInt2019 = 0;
		for (@Pc(35) int local35 = 0; local35 < Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1.length; local35++) {
			if (Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[local35] != null) {
				Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[local35].anInt2674 = -1;
			}
		}
		for (@Pc(62) int local62 = 0; local62 < Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1.length; local62++) {
			if (Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[local62] != null) {
				Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[local62].anInt2674 = -1;
			}
		}
		Static121.method2076();
		Static54.method966(30);
		for (@Pc(85) int local85 = 0; local85 < 100; local85++) {
			Static13.aBooleanArray3[local85] = true;
		}
	}

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "(B)V")
	public static void method70() {
		aClass39_41 = null;
		aClass39_40 = null;
		aClass20_Sub1_1 = null;
		aClass39_42 = null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!pd;IILclient!ja;Lclient!ja;Z)V")
	public static void method79(@OriginalArg(1) Class20 arg0, @OriginalArg(4) Class39 arg1, @OriginalArg(5) Class39 arg2) {
		@Pc(12) int local12 = arg0.method484(arg2);
		@Pc(18) int local18 = arg0.method475(arg1, local12);
		Static15.method245(local18, 255, local12, arg0);
	}

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)V")
	public static void method85() {
		Static28.anInt759 = 0;
		@Pc(12) int local12 = Static24.anInt503 + (Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2641 >> 7);
		@Pc(19) int local19 = Static36.anInt909 + (Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2643 >> 7);
		if (local19 >= 3053 && local19 <= 3156 && local12 >= 3056 && local12 <= 3136) {
			Static28.anInt759 = 1;
		}
		if (local19 >= 3072 && local19 <= 3118 && local12 >= 9492 && local12 <= 9535) {
			Static28.anInt759 = 1;
		}
		if (Static28.anInt759 == 1 && local19 >= 3139 && local19 <= 3199 && local12 >= 3008 && local12 <= 3062) {
			Static28.anInt759 = 0;
		}
	}
}
