import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static357 {

	@OriginalMember(owner = "client!oba", name = "C", descriptor = "[I")
	public static int[] anIntArray471 = new int[2];

	@OriginalMember(owner = "client!oba", name = "D", descriptor = "Z")
	public static boolean aBoolean444 = false;

	@OriginalMember(owner = "client!oba", name = "E", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_100 = new Class47(27, 7);

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(CB)I")
	public static int method5415(@OriginalArg(0) char arg0) {
		return arg0 >= '\u0000' && Class6_Sub11.anIntArray107.length > arg0 ? Class6_Sub11.anIntArray107[arg0] : -1;
	}

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(II)Z")
	public static boolean method5419(@OriginalArg(0) int arg0) {
		if (arg0 == 23 || arg0 == 15 || arg0 == 20 || arg0 == 11 || arg0 == 1004) {
			return true;
		} else {
			return arg0 == 50 || arg0 == 1011;
		}
	}
}
