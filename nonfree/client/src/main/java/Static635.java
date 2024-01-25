import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static635 {

	@OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
	public static int anInt10119;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "Lclient!ga;")
	public static final Class124 aClass124_103 = new Class124();

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "[I")
	public static final int[] anIntArray580 = new int[3];

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IC)Z")
	public static boolean method8429(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
