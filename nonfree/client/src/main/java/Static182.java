import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static182 {

	@OriginalMember(owner = "client!o", name = "c", descriptor = "I")
	public static int anInt3885;

	@OriginalMember(owner = "client!o", name = "e", descriptor = "Lclient!jd;")
	public static Class84 aClass84_76;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "[I")
	public static int[] anIntArray308 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!o", name = "d", descriptor = "I")
	public static int anInt3886 = 0;

	@OriginalMember(owner = "client!o", name = "f", descriptor = "[I")
	public static int[] anIntArray309 = new int[4096];

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)Z")
	public static boolean method3136(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && Static96.aBooleanArray10.length > arg0 ? Static96.aBooleanArray10[arg0] : false;
	}
}
