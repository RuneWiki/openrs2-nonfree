import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static62 {

	@OriginalMember(owner = "client!he", name = "e", descriptor = "[I")
	public static int[] anIntArray258;

	@OriginalMember(owner = "client!he", name = "g", descriptor = "Lclient!he;")
	public static Class34 aClass34_1;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "I")
	public static int anInt1660 = -1;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "I")
	public static int anInt1661 = 0;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "I")
	public static int anInt1662 = 0;

	@OriginalMember(owner = "client!he", name = "h", descriptor = "I")
	public static int anInt1664 = 0;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Lclient!sg;")
	public static Class77 method1151(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static146.method2168(new Class77[] { Static50.aClass77_539, Static2.method61(arg0), Static57.aClass77_1549 });
		} else if (arg0 < 10000000) {
			return Static146.method2168(new Class77[] { Static138.aClass77_1197, Static2.method61(arg0 / 1000), Static20.aClass77_280, Static57.aClass77_1549 });
		} else {
			return Static146.method2168(new Class77[] { Static3.aClass77_22, Static2.method61(arg0 / 1000000), Static176.aClass77_1528, Static57.aClass77_1549 });
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
	public static void method1153() {
		aClass34_1 = null;
		anIntArray258 = null;
	}
}
