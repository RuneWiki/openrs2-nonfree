import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!to", name = "f", descriptor = "[I")
	public static final int[] anIntArray681 = new int[2048];

	@OriginalMember(owner = "client!to", name = "i", descriptor = "Lclient!j;")
	public static final Class113 aClass113_16 = new Class113(1, 7);

	@OriginalMember(owner = "client!to", name = "l", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_151 = new Class211(92, 6);

	@OriginalMember(owner = "client!to", name = "p", descriptor = "I")
	public static int anInt5668 = 0;

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(II)Z")
	public static boolean method4878(@OriginalArg(1) int arg0) {
		if (Static277.aBooleanArray25[arg0]) {
			return true;
		} else if (Static383.aClass230_87.method4964(arg0)) {
			@Pc(28) int local28 = Static383.aClass230_87.method4956(arg0);
			if (local28 == 0) {
				Static277.aBooleanArray25[arg0] = true;
				return true;
			}
			if (Static137.aClass117ArrayArray1[arg0] == null) {
				Static137.aClass117ArrayArray1[arg0] = new Class117[local28];
			}
			for (@Pc(47) int local47 = 0; local47 < local28; local47++) {
				if (Static137.aClass117ArrayArray1[arg0][local47] == null) {
					@Pc(61) byte[] local61 = Static383.aClass230_87.method4985(local47, arg0);
					if (local61 != null) {
						@Pc(73) Class117 local73 = Static137.aClass117ArrayArray1[arg0][local47] = new Class117();
						local73.anInt3093 = (arg0 << 16) + local47;
						if (local61[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local73.method2514(new Class1_Sub33(local61));
					}
				}
			}
			Static277.aBooleanArray25[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
