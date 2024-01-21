import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class80 {

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "[I")
	public static final int[] anIntArray246 = new int[4096];

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1580;

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1581;

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "[I")
	public static final int[] anIntArray247;

	static {
		@Pc(7) int local7;
		for (local7 = 0; local7 < 4096; local7++) {
			anIntArray246[local7] = Static53.method841(local7);
		}
		aClass70_1580 = Static193.method3027("welle:");
		aClass70_1581 = Static193.method3027("0(U");
		anIntArray247 = new int[32];
		local7 = 2;
		for (@Pc(35) int local35 = 0; local35 < 32; local35++) {
			anIntArray247[local35] = local7 - 1;
			local7 += local7;
		}
	}
}
