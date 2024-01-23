import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString56 = "Your ignore list is full. Max of 100 users.";

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "Lclient!hh;")
	public static Class69 aClass69_8 = new Class69();

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString57 = " from your friend list first.";

	@OriginalMember(owner = "client!hh", name = "q", descriptor = "Lclient!db;")
	public static Class31 aClass31_16 = new Class31(50);

	@OriginalMember(owner = "client!hh", name = "r", descriptor = "[I")
	public static int[] anIntArray258 = new int[1000];

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!og;B)Z")
	public static boolean method1633(@OriginalArg(0) Class127 arg0) {
		if (arg0.anInt3566 == 205) {
			Static103.anInt1940 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BIII)I")
	public static int method1634(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return 1023 - arg0;
		} else if (local7 == 2) {
			return 1023 - arg1;
		} else {
			return arg0;
		}
	}
}
