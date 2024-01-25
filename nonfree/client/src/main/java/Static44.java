import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "Lclient!wt;")
	public static Class271 aClass271_3;

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "I")
	public static int anInt898 = 0;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(CZ)Z")
	public static boolean method812(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static78.method1522(arg0)) {
			return true;
		} else {
			@Pc(16) char[] local16 = Static74.aCharArray4;
			for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
				@Pc(28) char local28 = local16[local18];
				if (local28 == arg0) {
					return true;
				}
			}
			@Pc(48) char[] local48 = Static369.aCharArray10;
			for (@Pc(50) int local50 = 0; local50 < local48.length; local50++) {
				@Pc(55) char local55 = local48[local50];
				if (local55 == arg0) {
					return true;
				}
			}
			return false;
		}
	}
}
