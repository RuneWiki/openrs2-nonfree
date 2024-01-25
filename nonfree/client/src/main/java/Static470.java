import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "I")
	public static int anInt7923;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIIZ)V")
	public static void method6546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static594.anInt9770 == 1) {
			Static365.aClass13Array23[Static95.anInt9215 / 100].method8019(Static397.anInt6943 - 8, Static446.anInt7601 - 8);
		}
		if (Static594.anInt9770 == 2) {
			Static365.aClass13Array23[Static95.anInt9215 / 100 + 4].method8019(Static397.anInt6943 - 8, Static446.anInt7601 + -8);
		}
		Static65.method1093();
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)V")
	public static void method6547() {
		if (Static466.aClass276_1 != null) {
			Static466.aClass276_1.method6060();
		}
		while (true) {
			try {
				Static592.aThread7.join();
				return;
			} catch (@Pc(12) InterruptedException local12) {
			}
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!st;III)V")
	public static void method6548(@OriginalArg(0) Class10_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int[] local6 = new int[4];
		Static602.method1584(local6, 0, local6.length, arg2);
		Static311.method4788(arg0, arg1, local6);
	}
}
