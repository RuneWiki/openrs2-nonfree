import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static270 {

	@OriginalMember(owner = "client!lc", name = "Ab", descriptor = "[[I")
	public static int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!lc", name = "ob", descriptor = "Lclient!id;")
	public static final Class1_Sub23 aClass1_Sub23_1 = new Class1_Sub23(0, 0);

	@OriginalMember(owner = "client!lc", name = "Eb", descriptor = "I")
	public static int anInt5256 = 0;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(II)Z")
	public static boolean method4524(@OriginalArg(1) int arg0) {
		if (arg0 == 45 || arg0 == 46 || arg0 == 47 || arg0 == 11 || arg0 == 3) {
			return true;
		} else {
			return arg0 == 30 || arg0 == 1006;
		}
	}
}
