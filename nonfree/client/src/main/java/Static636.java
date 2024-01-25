import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static636 {

	@OriginalMember(owner = "client!wp", name = "v", descriptor = "I")
	public static int anInt10189;

	@OriginalMember(owner = "client!wp", name = "n", descriptor = "I")
	public static int anInt10184 = -1;

	@OriginalMember(owner = "client!wp", name = "r", descriptor = "[I")
	public static final int[] anIntArray732 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!wp", name = "w", descriptor = "Lclient!qca;")
	public static final Class271 aClass271_14 = new Class271(6, 0, 4, 2);

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(CI)Z")
	public static boolean method8514(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
