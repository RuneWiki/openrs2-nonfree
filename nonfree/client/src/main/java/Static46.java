import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "Lclient!ic;")
	public static Class34 aClass34_577 = Static56.method816(" <col=00ff80>");

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "Lclient!ic;")
	public static Class34 aClass34_578 = Static56.method816("Einloggen");

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
	public static void method684() {
		aClass34_578 = null;
		aClass34_577 = null;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
	public static void method685(@OriginalArg(1) int arg0) {
		if (Static100.method1458(arg0)) {
			Static127.method1981(Static44.aClass8_Sub24ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
	public static void method686() {
		@Pc(7) Class23 local7 = Static16.aClass23_1;
		synchronized (Static16.aClass23_1) {
			Static40.anInt984 = Static112.anInt2504;
			@Pc(25) int local25;
			if (Static96.anInt549 >= 0) {
				while (Static97.anInt2257 != Static96.anInt549) {
					local25 = Static133.anIntArray408[Static97.anInt2257];
					Static97.anInt2257 = Static97.anInt2257 + 1 & 0x7F;
					if (local25 >= 0) {
						Static87.aBooleanArray17[local25] = true;
					} else {
						Static87.aBooleanArray17[~local25] = false;
					}
				}
			} else {
				for (local25 = 0; local25 < 112; local25++) {
					Static87.aBooleanArray17[local25] = false;
				}
				Static96.anInt549 = Static97.anInt2257;
			}
			Static112.anInt2504 = Static44.anInt1076;
		}
	}
}
