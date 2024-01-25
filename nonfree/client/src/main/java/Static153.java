import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static153 {

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
	public static int anInt3358;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_46 = new Class45(21, 17);

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "[I")
	public static final int[] anIntArray285 = new int[2048];

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BC)Z")
	public static boolean method3044(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
