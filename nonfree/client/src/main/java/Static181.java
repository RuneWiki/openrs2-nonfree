import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
	public static int anInt3370 = 0;

	@OriginalMember(owner = "client!lo", name = "L", descriptor = "[I")
	public static final int[] anIntArray397 = new int[128];

	@OriginalMember(owner = "client!lo", name = "M", descriptor = "I")
	public static int anInt3403 = -1;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(III)B")
	public static byte method3452(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZZ)Z")
	public static boolean method3454(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)V")
	public static void method3457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class187 local7 = Static39.aClass187ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class187 local28 = Static39.aClass187ArrayArrayArray1[local9][arg0][arg1] = Static39.aClass187ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte78--;
				for (@Pc(40) Class214 local40 = local28.aClass214_19; local40 != null; local40 = local40.aClass214_21) {
					@Pc(44) Class44_Sub4 local44 = local40.aClass44_Sub4_1;
					if (local44.aShort90 == arg0 && local44.aShort89 == arg1) {
						local44.aByte90--;
					}
				}
			}
		}
		if (Static39.aClass187ArrayArrayArray1[0][arg0][arg1] == null) {
			Static39.aClass187ArrayArrayArray1[0][arg0][arg1] = new Class187(0, arg0, arg1);
			Static39.aClass187ArrayArrayArray1[0][arg0][arg1].aByte83 = 1;
		}
		Static39.aClass187ArrayArrayArray1[0][arg0][arg1].aClass187_1 = local7;
		Static39.aClass187ArrayArrayArray1[3][arg0][arg1] = null;
	}
}
