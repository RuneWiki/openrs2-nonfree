import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static133 {

	@OriginalMember(owner = "client!fe", name = "H", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_79 = new Class88("Self", "Mich", "Moi", "Eu");

	@OriginalMember(owner = "client!fe", name = "I", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_28 = new Class77(63, 3);

	@OriginalMember(owner = "client!fe", name = "K", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_29 = new Class77(29, 3);

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)V")
	public static void method2767() {
		Static425.anInt7891 = 0;
		Static105.anInt2399 = 0;
		Static338.anInt2905 = 0;
		Static400.anInt7498 = 0;
	}

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "(III)Z")
	public static boolean method2769(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)I")
	public static int method2770(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
