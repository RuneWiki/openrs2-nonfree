import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "[I")
	public static int[] anIntArray193;

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_25 = new Class269(51, 11);

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_27 = new Class274(95, 10);

	@OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
	public static int anInt2141 = 0;

	@OriginalMember(owner = "client!ea", name = "t", descriptor = "Lclient!uf;")
	public static final Class334 aClass334_2 = new Class334();

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)Z")
	public static boolean method1805() {
		if (Static511.aBoolean580) {
			try {
				if ((Boolean) Static648.method3663("showingVideoAd", Static234.anApplet2)) {
					return false;
				}
				return true;
			} catch (@Pc(17) Throwable local17) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "([Lclient!kr;B)V")
	public static void method1806(@OriginalArg(0) Class20[] arg0) {
		Static327.anInt5901 = arg0.length;
		Static185.aClass20Array5 = new Class20[Static327.anInt5901 + 10];
		Static67.anIntArray140 = new int[Static327.anInt5901 + 10];
		Static649.method4860(arg0, 0, Static185.aClass20Array5, 0, Static327.anInt5901);
		for (@Pc(24) int local24 = 0; local24 < Static327.anInt5901; local24++) {
			Static67.anIntArray140[local24] = Static185.aClass20Array5[local24].method4576();
		}
		for (@Pc(42) int local42 = Static327.anInt5901; local42 < Static185.aClass20Array5.length; local42++) {
			Static67.anIntArray140[local42] = 12;
		}
	}
}
