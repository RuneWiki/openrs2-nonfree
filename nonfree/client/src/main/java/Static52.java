import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!bn", name = "Q", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_12 = new Class305(41, 7);

	@OriginalMember(owner = "client!bn", name = "S", descriptor = "[I")
	public static final int[] anIntArray41 = new int[5];

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(CB)Z")
	public static boolean method695(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static243.method3798(arg0)) {
			return true;
		} else {
			@Pc(22) char[] local22 = Static394.aCharArray7;
			for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
				@Pc(29) char local29 = local22[local24];
				if (local29 == arg0) {
					return true;
				}
			}
			@Pc(49) char[] local49 = Static582.aCharArray19;
			for (@Pc(51) int local51 = 0; local51 < local49.length; local51++) {
				@Pc(56) char local56 = local49[local51];
				if (arg0 == local56) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(JB)V")
	public static void method697(@OriginalArg(0) long arg0) {
		@Pc(5) int local5 = Static251.anInt4573;
		@Pc(12) int local12;
		@Pc(20) int local20;
		if (local5 != Static40.anInt662) {
			local12 = local5 - Static40.anInt662;
			local20 = (int) (arg0 * (long) local12 / 320L);
			if (local12 > 0) {
				if (local20 == 0) {
					local20 = 1;
				} else if (local12 < local20) {
					local20 = local12;
				}
			} else if (local20 == 0) {
				local20 = -1;
			} else if (local12 > local20) {
				local20 = local12;
			}
			Static40.anInt662 += local20;
		}
		@Pc(66) int local66 = Static599.anInt9833;
		if (local66 != Static541.anInt8929) {
			local12 = local66 - Static541.anInt8929;
			local20 = (int) (arg0 * (long) local12 / 320L);
			if (local12 <= 0) {
				if (local20 == 0) {
					local20 = -1;
				} else if (local20 < local12) {
					local20 = local12;
				}
			} else if (local20 == 0) {
				local20 = 1;
			} else if (local12 < local20) {
				local20 = local12;
			}
			Static541.anInt8929 += local20;
		}
		Static157.aFloat83 += (float) arg0 * Static235.aFloat91 / 40.0F * 8.0F;
		Static298.aFloat116 += Static601.aFloat206 * (float) arg0 / 40.0F * 8.0F;
		Static167.method2915();
	}
}
