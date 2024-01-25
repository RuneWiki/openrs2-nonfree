import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!hs", name = "f", descriptor = "Lclient!wca;")
	public static Class354 aClass354_1;

	@OriginalMember(owner = "client!hs", name = "s", descriptor = "Lclient!pk;")
	public static Class258 aClass258_3;

	@OriginalMember(owner = "client!hs", name = "n", descriptor = "J")
	public static long aLong106 = -1L;

	@OriginalMember(owner = "client!hs", name = "r", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_105 = new Class363(92, -1);

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IBZ)V")
	public static void method3325(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(17) Class2_Sub23 local17 = Static124.method1801(arg1, arg0);
		if (local17 != null) {
			for (@Pc(22) int local22 = 0; local22 < local17.anIntArray234.length; local22++) {
				local17.anIntArray234[local22] = -1;
				local17.anIntArray233[local22] = 0;
			}
		}
	}
}
