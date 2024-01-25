import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!r", name = "v", descriptor = "I")
	public static int anInt8796;

	@OriginalMember(owner = "client!r", name = "x", descriptor = "F")
	public static float aFloat186;

	@OriginalMember(owner = "client!r", name = "y", descriptor = "Lclient!mea;")
	public static Class202 aClass202_4;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(CI)Z")
	public static boolean method7260(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static308.method5079(arg0)) {
			return true;
		} else {
			@Pc(23) char[] local23 = Static118.aCharArray5;
			for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
				@Pc(31) char local31 = local23[local25];
				if (local31 == arg0) {
					return true;
				}
			}
			@Pc(43) char[] local43 = Static508.aCharArray8;
			for (@Pc(45) int local45 = 0; local45 < local43.length; local45++) {
				@Pc(51) char local51 = local43[local45];
				if (local51 == arg0) {
					return true;
				}
			}
			return false;
		}
	}
}
