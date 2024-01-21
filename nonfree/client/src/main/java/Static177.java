import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "J")
	public static long aLong143;

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
	public static int anInt4477 = 500;

	@OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
	public static int anInt4484 = -1;

	@OriginalMember(owner = "client!vg", name = "o", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1546 = Static49.method1293("<col=ff3000>");

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
	public static void method3434() {
		aClass70_1546 = null;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)I")
	public static int method3437(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 - 1;
		@Pc(15) int local15 = local9 | local9 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}
}
