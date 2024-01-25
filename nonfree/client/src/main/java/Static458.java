import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
	public static int anInt7977;

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "Lclient!hda;")
	public static Class143 aClass143_7;

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
	public static int anInt7979;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "[I")
	public static final int[] anIntArray544 = new int[500];

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZC)Z")
	public static boolean method6675(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static371.method5587(arg0)) {
			return true;
		} else {
			@Pc(16) char[] local16 = Static165.aCharArray4;
			for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
				@Pc(23) char local23 = local16[local18];
				if (local23 == arg0) {
					return true;
				}
			}
			@Pc(39) char[] local39 = Static372.aCharArray9;
			for (@Pc(46) int local46 = 0; local46 < local39.length; local46++) {
				@Pc(51) char local51 = local39[local46];
				if (arg0 == local51) {
					return true;
				}
			}
			return false;
		}
	}
}
