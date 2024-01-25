import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
	public static final int anInt5944 = 328;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
	public static void method4636() {
		Static445.anInt7377 = 0;
		@Pc(17) int local17 = (Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6613 >> 7) + Static101.anInt6646;
		@Pc(24) int local24 = Static278.anInt4392 + (Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6616 >> 7);
		if (local17 >= 3053 && local17 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static445.anInt7377 = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static445.anInt7377 = 1;
		}
		if (Static445.anInt7377 == 1 && local17 >= 3139 && local17 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static445.anInt7377 = 0;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)I")
	public static int method4637(@OriginalArg(1) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
