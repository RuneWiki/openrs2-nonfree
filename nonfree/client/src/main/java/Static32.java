import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static32 {

	@OriginalMember(owner = "client!bca", name = "k", descriptor = "I")
	public static int anInt689 = 0;

	@OriginalMember(owner = "client!bca", name = "m", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_14 = new Class208(33, 8);

	@OriginalMember(owner = "client!bca", name = "n", descriptor = "Lclient!em;")
	public static final Class83 aClass83_14 = new Class83(111, 7);

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "(ZI)I")
	public static int method601(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
