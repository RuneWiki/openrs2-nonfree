import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "[I")
	public static final int[] anIntArray284 = new int[8];

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method2459(@OriginalArg(0) String arg0) {
		@Pc(17) int local17 = arg0.length();
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local17; local21++) {
			local19 = (local19 << 5) + Static492.method6861(arg0.charAt(local21)) - local19;
		}
		return local19;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!w;III[Z)V")
	public static void method2461(@OriginalArg(0) Class6_Sub5_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static205.aClass46Array1 == Static480.aClass46Array2) {
			return;
		}
		@Pc(9) int local9 = Static496.aClass46Array4[arg1].sa(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class46 local22 = Static496.aClass46Array4[local11];
				if (local22 != null) {
					local22.FA(arg0, arg2, local9 - local22.sa(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(III)B")
	public static byte method2462(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
