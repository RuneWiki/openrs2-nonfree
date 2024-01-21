import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static119 {

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
	public static int anInt2712;

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_808 = Static181.method2795("Click to switch");

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "Lclient!qe;")
	public static Class83 aClass83_806 = aClass83_808;

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_807 = Static181.method2795(":assistreq:");

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(JI)V")
	public static void method2069(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static173.method2668(arg0 - 1L);
			Static173.method2668(1L);
		} else {
			Static173.method2668(arg0);
		}
	}
}
