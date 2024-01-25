import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static727 {

	@OriginalMember(owner = "client!za", name = "m", descriptor = "[S")
	public static short[] aShortArray149;

	@OriginalMember(owner = "client!za", name = "n", descriptor = "Lclient!nca;")
	public static Class254 aClass254_174;

	@OriginalMember(owner = "client!za", name = "q", descriptor = "[I")
	public static final int[] anIntArray767 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(I)I")
	public static int method9878() {
		return Static527.anInt8374;
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(BC)Z")
	public static boolean method9880(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static543.method7587(arg0)) {
			return true;
		} else {
			@Pc(22) char[] local22 = Static362.aCharArray6;
			for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
				@Pc(32) char local32 = local22[local24];
				if (local32 == arg0) {
					return true;
				}
			}
			if (-23 != -23) {
				return false;
			}
			@Pc(59) char[] local59 = Static206.aCharArray5;
			for (@Pc(61) int local61 = 0; local61 < local59.length; local61++) {
				@Pc(69) char local69 = local59[local61];
				if (arg0 == local69) {
					return true;
				}
			}
			return false;
		}
	}
}
