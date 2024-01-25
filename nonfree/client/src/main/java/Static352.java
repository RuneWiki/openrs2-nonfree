import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!rq", name = "L", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_83 = new Class84(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!rq", name = "M", descriptor = "I")
	public static int anInt6022 = 104;

	@OriginalMember(owner = "client!rq", name = "g", descriptor = "(I)V")
	public static void method4873() {
		Static372.anInt7405 = 0;
		@Pc(13) int local13 = (Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7068 >> 7) + Static437.anInt7555;
		@Pc(20) int local20 = Static134.anInt5502 + (Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7065 >> 7);
		if (local13 >= 3053 && local13 <= 3156 && local20 >= 3056 && local20 <= 3136) {
			Static372.anInt7405 = 1;
		}
		if (local13 >= 3072 && local13 <= 3118 && local20 >= 9492 && local20 <= 9535) {
			Static372.anInt7405 = 1;
		}
		if (Static372.anInt7405 == 1 && local13 >= 3139 && local13 <= 3199 && local20 >= 3008 && local20 <= 3062) {
			Static372.anInt7405 = 0;
		}
	}

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "(II)I")
	public static int method4874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static242.aByteArrayArray83 == null ? 0 : (Static242.aByteArrayArray83[arg0][arg1] & 0xFF) << 3;
	}
}
