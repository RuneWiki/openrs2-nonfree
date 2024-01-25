import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static249 {

	@OriginalMember(owner = "client!jo", name = "r", descriptor = "Lclient!vo;")
	public static Class348 aClass348_41;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_22 = new Class344(64, 15);

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)Z")
	public static boolean method2740(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(II)V")
	public static void method2744(@OriginalArg(1) int arg0) {
		if (Static225.anIntArray226 == null || arg0 > Static225.anIntArray226.length) {
			Static225.anIntArray226 = new int[arg0];
		}
	}
}
