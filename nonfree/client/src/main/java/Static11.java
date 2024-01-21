import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static11 {

	@OriginalMember(owner = "client!be", name = "m", descriptor = "Lclient!t;")
	public static Class56 aClass56_1;

	@OriginalMember(owner = "client!be", name = "q", descriptor = "Lclient!vb;")
	public static Class2_Sub2_Sub2_Sub4 aClass2_Sub2_Sub2_Sub4_1;

	@OriginalMember(owner = "client!be", name = "b", descriptor = "Lclient!o;")
	public static Class40 aClass40_68 = Static13.method257("Loading game screen )2 ");

	@OriginalMember(owner = "client!be", name = "f", descriptor = "Lclient!o;")
	public static Class40 aClass40_69 = Static13.method257("b12_full");

	@OriginalMember(owner = "client!be", name = "o", descriptor = "Lclient!o;")
	public static Class40 aClass40_70 = Static13.method257("Jul");

	@OriginalMember(owner = "client!be", name = "p", descriptor = "I")
	public static int anInt274 = 0;

	@OriginalMember(owner = "client!be", name = "r", descriptor = "Lclient!o;")
	public static Class40 aClass40_71 = Static13.method257("To create a new account you need to");

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZ)V")
	public static void method230(@OriginalArg(0) int arg0) {
		Static92.anInt2172 += arg0;
		while (Static12.anInt291 <= Static92.anInt2172) {
			Static92.anInt2172 -= Static12.anInt291;
			Static5.anInt173 -= Static5.anInt173 >> 2;
		}
		Static5.anInt173 -= arg0 * 1000;
		if (Static5.anInt173 < 0) {
			Static5.anInt173 = 0;
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V")
	public static void method234() {
		aClass56_1 = null;
		aClass40_69 = null;
		aClass40_70 = null;
		aClass40_68 = null;
		aClass2_Sub2_Sub2_Sub4_1 = null;
		aClass40_71 = null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V")
	public static void method235() {
		if (Static106.aClass12_1 == null) {
			return;
		}
		Static63.method1055();
		if (Static18.anInt432 > 0) {
			Static106.aClass12_1.method1251();
			Static18.anInt432 = 0;
		}
		Static106.aClass12_1.method1249();
		Static106.aClass12_1 = null;
	}
}
