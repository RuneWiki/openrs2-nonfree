import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!pda", name = "s", descriptor = "I")
	public static int anInt7816;

	@OriginalMember(owner = "client!pda", name = "t", descriptor = "Lclient!ke;")
	public static Class196 aClass196_243;

	@OriginalMember(owner = "client!pda", name = "n", descriptor = "Lclient!rh;")
	public static final Class307 aClass307_13 = new Class307(15, 0, 1, 0);

	@OriginalMember(owner = "client!pda", name = "u", descriptor = "Z")
	public static boolean aBoolean570 = false;

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(BII)I")
	public static int method6632(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(22) int local22 = local9 ^ local9 << 13;
		@Pc(36) int local36 = local22 * (local22 * local22 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local36 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(III)V")
	public static void method6635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class313 local7 = Static129.aClass313ArrayArrayArray7[arg0][arg1][arg2];
		if (local7 != null) {
			Static65.method949(local7.aClass41_Sub1_Sub4_1);
			if (local7.aClass41_Sub1_Sub4_1 != null) {
				local7.aClass41_Sub1_Sub4_1 = null;
			}
		}
	}
}
