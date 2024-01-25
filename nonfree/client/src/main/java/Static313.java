import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_55 = new Class198(64);

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
	public static volatile int anInt6173 = -1;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray56 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	public static void method5225() {
		if (Static266.anInt5370 == 10) {
			Static353.method5714(28);
		}
		if (Static266.anInt5370 == 30) {
			Static353.method5714(25);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)V")
	public static void method5226() {
		Static12.aClass198_5.method5243(5);
		Static15.aClass198_6.method5243(5);
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
	public static void method5228() {
		for (@Pc(6) Class3_Sub26 local6 = (Class3_Sub26) Static116.aClass127_12.method3402(); local6 != null; local6 = (Class3_Sub26) Static116.aClass127_12.method3400()) {
			if (Static192.method3424(local6.anInt2734)) {
				Static83.method1299(local6);
			}
		}
		if (Static170.anInt6279 == 1) {
			Static168.aBoolean192 = false;
			Static171.method2843(Static257.anInt5150, Static260.anInt5197, Static86.anInt4285, Static277.anInt5536);
			return;
		}
		Static171.method2843(Static257.anInt5150, Static260.anInt5197, Static86.anInt4285, Static277.anInt5536);
		@Pc(46) int local46 = Static191.aClass209_6.method5510(Static334.aString244);
		for (@Pc(51) Class3_Sub26 local51 = (Class3_Sub26) Static116.aClass127_12.method3402(); local51 != null; local51 = (Class3_Sub26) Static116.aClass127_12.method3400()) {
			@Pc(57) int local57 = Static115.method2000(local51);
			if (local57 > local46) {
				local46 = local57;
			}
		}
		Static260.anInt5197 = local46 + 8;
		Static257.anInt5150 = Static170.anInt6279 * 16 + (Static74.aBoolean73 ? 26 : 22);
	}
}
