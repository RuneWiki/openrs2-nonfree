import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
	public static int anInt1167;

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "J")
	public static long aLong38 = 0L;

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "[I")
	public static final int[] anIntArray100 = new int[4096];

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "S")
	public static short aShort16 = 256;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IC)Z")
	public static boolean method850(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)V")
	public static void method851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class194 local7 = Static77.aClass194ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null && local7.aClass17_Sub5_1 != null) {
			local7.aClass17_Sub5_1 = null;
		}
	}
}
