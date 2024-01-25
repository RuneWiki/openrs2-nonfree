import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static546 {

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "Lclient!ik;")
	public static Class182 aClass182_105;

	@OriginalMember(owner = "client!raa", name = "c", descriptor = "[I")
	public static int[] anIntArray610;

	@OriginalMember(owner = "client!raa", name = "d", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_145 = new Class397(123, 3);

	@OriginalMember(owner = "client!raa", name = "e", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_146 = new Class397(38, -1);

	@OriginalMember(owner = "client!raa", name = "f", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_147 = new Class397(2, -1);

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(III)Z")
	public static boolean method7200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}
}
