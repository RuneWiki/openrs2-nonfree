import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "Lclient!gs;")
	public static Class93 aClass93_6;

	@OriginalMember(owner = "client!rh", name = "w", descriptor = "Lclient!bo;")
	public static Class27 aClass27_1;

	@OriginalMember(owner = "client!rh", name = "B", descriptor = "I")
	public static int anInt5848;

	@OriginalMember(owner = "client!rh", name = "E", descriptor = "Lclient!bh;")
	public static Class23 aClass23_1;

	@OriginalMember(owner = "client!rh", name = "t", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_118 = new Class211(59, 5);

	@OriginalMember(owner = "client!rh", name = "y", descriptor = "Lclient!ka;")
	public static final Class132 aClass132_53 = new Class132(4);

	@OriginalMember(owner = "client!rh", name = "D", descriptor = "Lclient!uo;")
	public static final Class247 aClass247_1 = new Class247();

	@OriginalMember(owner = "client!rh", name = "F", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray14 = new int[2][][];

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZC)Z")
	public static boolean method4584(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static328.method4416(arg0)) {
			return true;
		} else {
			@Pc(25) char[] local25 = Static409.aCharArray9;
			for (@Pc(27) int local27 = 0; local27 < local25.length; local27++) {
				@Pc(33) char local33 = local25[local27];
				if (local33 == arg0) {
					return true;
				}
			}
			@Pc(45) char[] local45 = Static371.aCharArray8;
			for (@Pc(47) int local47 = 0; local47 < local45.length; local47++) {
				@Pc(53) char local53 = local45[local47];
				if (arg0 == local53) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)Z")
	public static boolean method4586(@OriginalArg(0) int arg0) {
		return arg0 == 9 || arg0 == 10 || arg0 == 11;
	}
}
