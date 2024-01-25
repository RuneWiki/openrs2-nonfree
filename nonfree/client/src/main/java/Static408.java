import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!om", name = "F", descriptor = "D")
	public static double aDouble10;

	@OriginalMember(owner = "client!om", name = "L", descriptor = "J")
	public static long aLong202 = 0L;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!f;I)I")
	public static int method6421(@OriginalArg(0) Class6_Sub5_Sub11 arg0) {
		@Pc(12) String local12 = Static45.method8618(arg0);
		return Static2.aClass213_9.method5833(Static388.aClass4Array10, local12);
	}

	@OriginalMember(owner = "client!om", name = "e", descriptor = "(B)V")
	public static void method6422() {
		if (Static496.aClass104_4.aBoolean290 && Static504.aClass358_4.anInt10266 != -1) {
			Static139.method2769(Static504.aClass358_4.anInt10266, Static504.aClass358_4.aString107);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILclient!f;ZI)V")
	public static void method6423(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub5_Sub11 arg1, @OriginalArg(3) int arg2) {
		if (!Static199.aBoolean358) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(22) int local22;
		for (@Pc(16) Class6_Sub5_Sub9 local16 = (Class6_Sub5_Sub9) arg1.aClass231_2.method6055(); local16 != null; local16 = (Class6_Sub5_Sub9) arg1.aClass231_2.method6050()) {
			local22 = Static397.method6259(local16);
			if (local22 > local10) {
				local10 = local22;
			}
		}
		local10 += 8;
		local22 = arg1.anInt3423 * 16 + 21;
		Static626.anInt10528 = (Static319.aBoolean495 ? 26 : 22) + arg1.anInt3423 * 16;
		@Pc(58) int local58 = Static498.anInt8705 + Static76.anInt2536;
		if (local58 + local10 > Static294.anInt6026) {
			local58 = Static76.anInt2536 - local10;
		}
		if (local58 < 0) {
			local58 = 0;
		}
		@Pc(84) int local84 = Static319.aBoolean495 ? 33 : 31;
		@Pc(91) int local91 = arg0 + 13 - local84;
		if (Static277.anInt5899 < local22 + local91) {
			local91 = Static277.anInt5899 - local22;
		}
		Static497.anInt8646 = local58;
		if (local91 < 0) {
			local91 = 0;
		}
		Static303.anInt6146 = local91;
		Static535.aClass6_Sub5_Sub11_1 = arg1;
		Static9.anInt525 = local10;
	}
}
