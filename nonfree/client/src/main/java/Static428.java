import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static428 {

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "Lclient!mp;")
	public static final Class151 aClass151_1 = new Class151();

	@OriginalMember(owner = "client!vn", name = "q", descriptor = "I")
	public static int anInt7059 = 0;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)Z")
	public static boolean method5470(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!nf;I)Z")
	public static boolean method5473(@OriginalArg(0) Class157 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean449) {
			return false;
		} else if (!arg0.method3778(Static148.anInterface12_2)) {
			return false;
		} else if (Static138.aClass102_12.method2700((long) arg0.anInt4914) == null) {
			return Static11.aClass102_1.method2700((long) arg0.anInt4919) == null;
		} else {
			return false;
		}
	}
}
