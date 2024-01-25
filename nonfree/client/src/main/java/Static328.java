import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "Z")
	public static boolean aBoolean412 = false;

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "[B")
	public static final byte[] aByteArray104 = new byte[2048];

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
	public static void method4849() {
		Static380.anInt6478 = 0;
		@Pc(13) int local13 = (Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6390 >> 7) + Static28.anInt606;
		@Pc(21) int local21 = (Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6386 >> 7) + Static319.anInt5425;
		if (local13 >= 3053 && local13 <= 3156 && local21 >= 3056 && local21 <= 3136) {
			Static380.anInt6478 = 1;
		}
		if (local13 >= 3072 && local13 <= 3118 && local21 >= 9492 && local21 <= 9535) {
			Static380.anInt6478 = 1;
		}
		if (Static380.anInt6478 == 1 && local13 >= 3139 && local13 <= 3199 && local21 >= 3008 && local21 <= 3062) {
			Static380.anInt6478 = 0;
		}
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
	public static void method4850() {
		Static233.anInt4156 = 0;
		Static60.anInt1159 = -1;
		Static63.anInt1264 = -1;
		Static358.anInt2084 = -1;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	public static void method4852(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		Static216.method3597(Static220.aClass11_66);
		Static372.aClass2_Sub16_Sub2_4.method5358(Static204.method3471(arg0) + 1);
		Static372.aClass2_Sub16_Sub2_4.method5362(arg0);
		Static372.aClass2_Sub16_Sub2_4.method5358(arg1);
	}
}
