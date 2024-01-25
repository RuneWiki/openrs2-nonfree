import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!fk", name = "h", descriptor = "Lclient!cb;")
	public static Class40 aClass40_65;

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "[Lclient!nb;")
	public static final Interface16[] anInterface16Array1 = new Interface16[128];

	@OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
	public static int anInt2546 = 0;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
	public static void method2147() {
		Static246.aClass121_7.ha(((float) Static480.aClass6_Sub37_Sub1_1.anInt6064 * 0.1F + 0.7F) * Static212.aFloat49);
		Static246.aClass121_7.YA(Static24.anInt5482, Static271.aFloat84, Static577.aFloat134, (float) (Static377.anInt6494 << 2), (float) (Static74.anInt1218 << 2), (float) (Static13.anInt235 << 2));
		Static246.aClass121_7.method7108(Static183.aClass17_1);
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
	public static void method2148() {
		Static133.anInt4720 = 0;
		@Pc(13) int local13 = (Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9222 >> 9) + Static218.anInt3718;
		@Pc(20) int local20 = (Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9218 >> 9) + Static167.anInt3048;
		if (local13 >= 3053 && local13 <= 3156 && local20 >= 3056 && local20 <= 3136) {
			Static133.anInt4720 = 1;
		}
		if (local13 >= 3072 && local13 <= 3118 && local20 >= 9492 && local20 <= 9535) {
			Static133.anInt4720 = 1;
		}
		if (Static133.anInt4720 == 1 && local13 >= 3139 && local13 <= 3199 && local20 >= 3008 && local20 <= 3062) {
			Static133.anInt4720 = 0;
		}
	}

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V")
	public static void method2152() {
		@Pc(9) int local9 = (int) ((double) Static301.anInt4912 * 34.46D);
		local9 <<= 0x2;
		if (Static176.aClass121_5.method7131()) {
			local9 += 512;
		}
		Static176.aClass121_5.sa(200, local9);
	}
}
