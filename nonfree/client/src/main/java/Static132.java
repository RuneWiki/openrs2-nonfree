import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "[I")
	public static int[] anIntArray173;

	@OriginalMember(owner = "client!gi", name = "n", descriptor = "Lclient!jk;")
	public static Class129 aClass129_1;

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "Lclient!wi;")
	public static final Class263 aClass263_18 = new Class263(7, 0, 1, 1);

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
	public static int anInt2612 = 0;

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_59 = new Class36(46, 7);

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IC)Z")
	public static boolean method1938(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static167.method2480(arg0)) {
			return true;
		} else {
			@Pc(23) char[] local23 = Static164.aCharArray4;
			for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
				@Pc(31) char local31 = local23[local25];
				if (local31 == arg0) {
					return true;
				}
			}
			@Pc(51) char[] local51 = Static186.aCharArray5;
			for (@Pc(53) int local53 = 0; local53 < local51.length; local53++) {
				@Pc(59) char local59 = local51[local53];
				if (local59 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLclient!eq;)V")
	public static void method1939(@OriginalArg(1) Class68 arg0) {
		Static203.aClass68_1 = arg0;
	}
}
