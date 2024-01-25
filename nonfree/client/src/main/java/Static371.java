import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "Lclient!rc;")
	public static Class211 aClass211_1;

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "Lclient!mn;")
	public static Class171 aClass171_86;

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
	public static int anInt6494;

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
	public static int anInt6492 = 104;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(CI)Z")
	public static boolean method5166(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static194.method2778(arg0)) {
			return true;
		} else {
			@Pc(16) char[] local16 = Static375.aCharArray6;
			for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
				@Pc(23) char local23 = local16[local18];
				if (arg0 == local23) {
					return true;
				}
			}
			@Pc(35) char[] local35 = Static71.aCharArray1;
			for (@Pc(37) int local37 = 0; local37 < local35.length; local37++) {
				@Pc(42) char local42 = local35[local37];
				if (arg0 == local42) {
					return true;
				}
			}
			return false;
		}
	}
}
