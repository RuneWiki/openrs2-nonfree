import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static278 {

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "[[S")
	public static short[][] aShortArrayArray13;

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString448 = "flash3:";

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!th;IILclient!th;I)Lclient!df;")
	public static Class1_Sub3_Sub5 method4755(@OriginalArg(0) Class168 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class168 arg2) {
		return Static131.method2257(0, arg2, arg1) ? Static161.method2564(arg0.method4058(0, arg1)) : null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
	public static void method4756() {
		if (Static253.anInt5118 == 5) {
			Static253.anInt5118 = 6;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
	public static void method4757() {
		if (Static109.anInt2414 < 0) {
			Static109.anInt2414 = 0;
			Static202.anInt4408 = -1;
			Static207.anInt4464 = -1;
		}
		if (Static268.anInt2657 < Static109.anInt2414) {
			Static109.anInt2414 = Static268.anInt2657;
			Static202.anInt4408 = -1;
			Static207.anInt4464 = -1;
		}
		if (Static299.anInt5944 < 0) {
			Static207.anInt4464 = -1;
			Static202.anInt4408 = -1;
			Static299.anInt5944 = 0;
		}
		if (Static299.anInt5944 > Static268.anInt2659) {
			Static299.anInt5944 = Static268.anInt2659;
			Static202.anInt4408 = -1;
			Static207.anInt4464 = -1;
		}
	}
}
