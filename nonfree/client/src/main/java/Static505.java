import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
	public static int anInt8621;

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
	public static int anInt8623 = 0;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!av;Z)I")
	public static int method7233(@OriginalArg(0) int arg0, @OriginalArg(1) Class20 arg1) {
		if (!Static87.method1164(arg1).method4620(arg0) && arg1.anObjectArray30 == null) {
			return -1;
		} else if (arg1.anIntArray27 == null || arg0 >= arg1.anIntArray27.length) {
			return -1;
		} else {
			return arg1.anIntArray27[arg0];
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZ)V")
	public static void method7234(@OriginalArg(1) boolean arg0) {
		if (Static720.aClass264_1 == null) {
			Static93.method1257();
		}
		if (arg0) {
			Static720.aClass264_1.method6403();
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILjava/lang/String;B)V")
	public static void method7236(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(7) int local7 = Static558.anInt9284;
		@Pc(9) int[] local9 = Static408.anIntArray393;
		@Pc(11) boolean local11 = false;
		for (@Pc(21) int local21 = 0; local21 < local7; local21++) {
			@Pc(29) Class19_Sub1_Sub3_Sub2_Sub2 local29 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local9[local21]];
			if (local29 != null && local29 != Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2 && local29.aString109 != null && local29.aString109.equalsIgnoreCase(arg1)) {
				@Pc(50) Class286 local50 = null;
				if (arg0 == 1) {
					local50 = Static85.aClass286_19;
				} else if (arg0 == 4) {
					local50 = Static8.aClass286_1;
				} else if (arg0 == 5) {
					local50 = Static486.aClass286_81;
				} else if (arg0 == 6) {
					local50 = Static313.aClass286_53;
				} else if (arg0 == 7) {
					local50 = Static648.aClass286_120;
				} else if (arg0 == 9) {
					local50 = Static537.aClass286_93;
				}
				if (local50 != null) {
					@Pc(109) Class3_Sub48 local109 = Static89.method1200(local50, Static532.aClass400_3.aClass399_2);
					local109.aClass3_Sub28_Sub2_1.method5329(0);
					local109.aClass3_Sub28_Sub2_1.method5270(local9[local21]);
					Static532.aClass400_3.method9223(local109);
				}
				local11 = true;
				break;
			}
		}
		if (!local11) {
			Static332.method4975(Static476.aClass279_21.method6992(Static141.anInt2658) + arg1);
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)I")
	public static int method7237(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static639.aClass313Array2 == null) {
			return 0;
		}
		@Pc(12) int local12 = arg2 >> 9;
		@Pc(16) int local16 = arg1 >> 9;
		if (local12 < 0 || local16 < 0 || Static362.anInt8653 - 1 < local12 || local16 > Static206.anInt11291 - 1) {
			return 0;
		}
		@Pc(47) int local47 = arg0;
		if (arg0 < 3 && (Static6.aByteArrayArrayArray1[1][local12][local16] & 0x2) != 0) {
			local47 = arg0 + 1;
		}
		return Static639.aClass313Array2[local47].method9096(arg2, arg1);
	}
}
