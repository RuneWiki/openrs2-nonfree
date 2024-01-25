import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
	public static int anInt6541;

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "Z")
	public static boolean aBoolean530 = false;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!tn;BI)I")
	public static int method5117(@OriginalArg(0) Class229 arg0, @OriginalArg(2) int arg1) {
		if (!Static51.method751(arg0).method961(arg1) && arg0.anObjectArray14 == null) {
			return -1;
		} else if (arg0.anIntArray510 == null || arg0.anIntArray510.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray510[arg1];
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)B")
	public static byte method5118(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
	public static void method5120() {
		Static266.anInt7428 = 0;
		@Pc(12) int local12 = Static190.anInt3507 + (Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7060 >> 7);
		@Pc(19) int local19 = Static331.anInt6034 + (Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7066 >> 7);
		if (local12 >= 3053 && local12 <= 3156 && local19 >= 3056 && local19 <= 3136) {
			Static266.anInt7428 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local19 >= 9492 && local19 <= 9535) {
			Static266.anInt7428 = 1;
		}
		if (Static266.anInt7428 == 1 && local12 >= 3139 && local12 <= 3199 && local19 >= 3008 && local19 <= 3062) {
			Static266.anInt7428 = 0;
		}
	}
}
