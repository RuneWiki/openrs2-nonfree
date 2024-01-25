import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
	public static int anInt6518 = 0;

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
	public static int anInt6522 = 0;

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
	public static int anInt6523 = 0;

	@OriginalMember(owner = "client!sr", name = "i", descriptor = "J")
	public static long aLong191 = -1L;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(BII)V")
	public static void method5078(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static128.aClass95_1 == Static441.aClass95_5) {
			if (!Static14.method4213(-2, 0, 0, false, 1, 1, arg0, arg1)) {
				Static14.method4213(-3, 0, 0, false, 1, 1, arg0, arg1);
			}
		} else if (!Static14.method4213(-3, 0, 0, false, 1, 1, arg0, arg1)) {
			Static14.method4213(-2, 0, 0, false, 1, 1, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)V")
	public static void method5079() {
		Static339.anInt5973 = 0;
		@Pc(17) int local17 = Static381.anInt6688 + (Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6062 >> 7);
		@Pc(25) int local25 = (Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6061 >> 7) + Static285.anInt5187;
		if (local17 >= 3053 && local17 <= 3156 && local25 >= 3056 && local25 <= 3136) {
			Static339.anInt5973 = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local25 >= 9492 && local25 <= 9535) {
			Static339.anInt5973 = 1;
		}
		if (Static339.anInt5973 == 1 && local17 >= 3139 && local17 <= 3199 && local25 >= 3008 && local25 <= 3062) {
			Static339.anInt5973 = 0;
		}
	}
}
