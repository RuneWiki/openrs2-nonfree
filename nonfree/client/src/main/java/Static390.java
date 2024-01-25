import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!oaa", name = "f", descriptor = "Lclient!d;")
	public static Interface7 anInterface7_13;

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "[J")
	public static final long[] aLongArray17 = new long[10];

	@OriginalMember(owner = "client!oaa", name = "d", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_99 = new Class130(61, -1);

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)Z")
	public static boolean method6326() {
		try {
			if (Static324.anInt8117 == 2) {
				if (Static131.aClass3_Sub39_2 == null) {
					Static131.aClass3_Sub39_2 = Static652.method6337(Static402.aClass196_83, Static563.anInt9401, Static495.anInt8540);
					if (Static131.aClass3_Sub39_2 == null) {
						return false;
					}
				}
				if (Static523.aClass52_1 == null) {
					Static523.aClass52_1 = new Class52(Static163.aClass196_35, Static518.aClass196_108);
				}
				@Pc(29) Class3_Sub7_Sub2 local29 = Static594.aClass3_Sub7_Sub2_3;
				if (Static236.aClass3_Sub7_Sub2_1 != null) {
					local29 = Static236.aClass3_Sub7_Sub2_1;
				}
				if (local29.method2446(Static269.aClass196_49, Static131.aClass3_Sub39_2, Static523.aClass52_1)) {
					Static594.aClass3_Sub7_Sub2_3 = local29;
					Static594.aClass3_Sub7_Sub2_3.method2463();
					@Pc(58) int local58;
					if (Static618.anInt9981 <= 0) {
						Static324.anInt8117 = 0;
						Static594.aClass3_Sub7_Sub2_3.method2441(Static141.anInt2838);
						for (local58 = 0; local58 < Static514.anIntArray550.length; local58++) {
							Static594.aClass3_Sub7_Sub2_3.method2474(Static514.anIntArray550[local58], local58);
							Static514.anIntArray550[local58] = 255;
						}
					} else {
						Static324.anInt8117 = 3;
						Static594.aClass3_Sub7_Sub2_3.method2441(Static618.anInt9981 <= Static141.anInt2838 ? Static618.anInt9981 : Static141.anInt2838);
						for (local58 = 0; local58 < Static514.anIntArray550.length; local58++) {
							Static594.aClass3_Sub7_Sub2_3.method2474(Static514.anIntArray550[local58], local58);
							Static514.anIntArray550[local58] = 255;
						}
					}
					if (Static236.aClass3_Sub7_Sub2_1 == null) {
						if (Static188.aLong99 <= 0L) {
							Static594.aClass3_Sub7_Sub2_3.method2460(Static131.aClass3_Sub39_2, Static185.aBoolean342);
						} else {
							Static594.aClass3_Sub7_Sub2_3.method2459(Static188.aLong99, Static185.aBoolean342, Static131.aClass3_Sub39_2);
						}
					}
					if (Static145.aClass188_2 != null) {
						Static145.aClass188_2.method7768(Static594.aClass3_Sub7_Sub2_3);
					}
					Static131.aClass3_Sub39_2 = null;
					Static402.aClass196_83 = null;
					Static523.aClass52_1 = null;
					Static188.aLong99 = 0L;
					Static236.aClass3_Sub7_Sub2_1 = null;
					return true;
				}
			}
		} catch (@Pc(156) Exception local156) {
			local156.printStackTrace();
			Static594.aClass3_Sub7_Sub2_3.method2461();
			Static324.anInt8117 = 0;
			Static523.aClass52_1 = null;
			Static131.aClass3_Sub39_2 = null;
			Static402.aClass196_83 = null;
			Static236.aClass3_Sub7_Sub2_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILclient!sc;)V")
	public static void method6328(@OriginalArg(1) Class303 arg0) {
		Static151.aClass303_1 = arg0;
	}
}
