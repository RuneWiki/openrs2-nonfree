import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!ss", name = "L", descriptor = "Lclient!pj;")
	public static Class248 aClass248_94;

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "(III)I")
	public static int method6798(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg0 * 57 + arg1;
		@Pc(23) int local23 = local17 ^ local17 << 13;
		@Pc(37) int local37 = (local23 * 15731 * local23 + 789221) * local23 + 1376312589 & Integer.MAX_VALUE;
		return local37 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(BII)Z")
	public static boolean method6799(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
