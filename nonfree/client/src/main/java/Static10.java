import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static10 {

	@OriginalMember(owner = "client!be", name = "m", descriptor = "Lclient!t;")
	public static Class56 aClass56_1;

	@OriginalMember(owner = "client!be", name = "q", descriptor = "Lclient!vb;")
	public static Class2_Sub2_Sub2_Sub4 aClass2_Sub2_Sub2_Sub4_1;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZ)V", line = 10)
	public static void method230(@OriginalArg(0) int arg0) {
		Static84.anInt2172 += arg0;
		while (Static11.anInt291 <= Static84.anInt2172) {
			Static84.anInt2172 -= Static11.anInt291;
			Static5.anInt173 -= Static5.anInt173 >> 2;
		}
		Static5.anInt173 -= arg0 * 1000;
		if (Static5.anInt173 < 0) {
			Static5.anInt173 = 0;
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V", line = 275)
	public static void method234() {
		aClass56_1 = null;
		Class10.aClass40_69 = null;
		Class10.aClass40_70 = null;
		Class10.aClass40_68 = null;
		aClass2_Sub2_Sub2_Sub4_1 = null;
		Class10.aClass40_71 = null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V", line = 293)
	public static void method235() {
		if (Static98.aClass12_1 == null) {
			return;
		}
		Static58.method1055();
		if (Class15.anInt432 > 0) {
			Static98.aClass12_1.method1251();
			Class15.anInt432 = 0;
		}
		Static98.aClass12_1.method1249();
		Static98.aClass12_1 = null;
	}
}
