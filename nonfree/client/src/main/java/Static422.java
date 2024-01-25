import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static422 {

	@OriginalMember(owner = "client!vj", name = "P", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_394 = new Class123(89, 8);

	@OriginalMember(owner = "client!vj", name = "S", descriptor = "I")
	public static int anInt7557 = 0;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IC)Z")
	public static boolean method6196(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(II)Z")
	public static boolean method6197(@OriginalArg(0) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}
}
