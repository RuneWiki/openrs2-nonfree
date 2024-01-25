import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static276 {

	@OriginalMember(owner = "client!nu", name = "S", descriptor = "[[Lclient!tn;")
	public static Class229[][] aClass229ArrayArray1;

	@OriginalMember(owner = "client!nu", name = "L", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_237 = new Class12(55, -2);

	@OriginalMember(owner = "client!nu", name = "N", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_238 = new Class12(101, -1);

	@OriginalMember(owner = "client!nu", name = "P", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_96 = new Class254(38, 3);

	@OriginalMember(owner = "client!nu", name = "R", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_97 = new Class254(18, 7);

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(CB)Z")
	public static boolean method3832(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(IBI)Z")
	public static boolean method3833(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}
}
