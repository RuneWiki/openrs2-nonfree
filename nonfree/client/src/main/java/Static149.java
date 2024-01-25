import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!ew", name = "G", descriptor = "I")
	public static final int anInt2986 = 1407;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IB)V")
	public static void method2769(@OriginalArg(0) int arg0) {
		@Pc(9) Class3_Sub11_Sub4 local9 = Static583.method8201(9, (long) arg0);
		local9.method2194();
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(III)I")
	public static int method2770(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(15) int local15 = local9 << 13 ^ local9;
		@Pc(29) int local29 = Integer.MAX_VALUE & local15 * (local15 * local15 * 15731 + 789221) + 1376312589;
		return local29 >> 19 & 0xFF;
	}
}
