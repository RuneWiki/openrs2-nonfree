import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!lj", name = "j", descriptor = "Lclient!ha;")
	public static Class5 aClass5_9;

	@OriginalMember(owner = "client!lj", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString65 = null;

	@OriginalMember(owner = "client!lj", name = "m", descriptor = "[I")
	public static int[] anIntArray344 = new int[1];

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)Lclient!dn;")
	public static Class77 method5276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static330.aClass77ArrayArrayArray2[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static330.aClass77ArrayArrayArray2[0][arg1][arg2] != null && Static330.aClass77ArrayArrayArray2[0][arg1][arg2].aClass77_1 != null;
			if (local28 && arg0 >= Static442.anInt7929 - 1) {
				return null;
			}
			Static2.method23(arg0, arg1, arg2);
		}
		return Static330.aClass77ArrayArrayArray2[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(III)Z")
	public static boolean method5277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)Z")
	public static boolean method5278(@OriginalArg(1) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BC)Z")
	public static boolean method5279(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
