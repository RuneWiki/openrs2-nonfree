import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!aja", name = "i", descriptor = "I")
	public static int anInt266;

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(B)V")
	public static void method238() {
		Static575.method8331();
		@Pc(12) int local12 = Static97.aClass5_Sub25_8.aClass6_Sub24_1.method7735();
		if (local12 == 2) {
			Static228.method3849(Static408.anInt7118, Static345.anInt5827, Static213.aClass133_5);
		} else if (local12 == 3) {
			Static101.method1627(Static213.aClass133_5, Static220.anInt4133, Static408.anInt7118, Static134.anInt2377, Static345.anInt5827);
		}
		if (Static97.aClass5_Sub25_8.aClass6_Sub24_1.method7737()) {
			Static240.method4003(Static83.aCanvas14);
		}
		if (Static213.aClass133_5 != null) {
			Static364.method5405();
		}
		Static57.aBoolean65 = Static97.aClass5_Sub25_8.aClass6_Sub24_1.method7735() != 0;
		Static428.aBoolean526 = Static97.aClass5_Sub25_8.aClass6_Sub24_1.method7737();
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(I)V")
	public static void method239() {
		if (Static97.aClass5_Sub25_8.aClass6_Sub6_2.method1639() == 0 && Static636.anInt10567 != Static173.anInt3110) {
			Static303.method4735(false, 11, Static233.anInt4295, Static613.anInt10268);
		} else {
			Static171.method2662(Static213.aClass133_5);
			if (Static636.anInt10567 != Static512.anInt8852) {
				Static38.method7895();
			}
		}
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(III)Z")
	public static boolean method242(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}
}
