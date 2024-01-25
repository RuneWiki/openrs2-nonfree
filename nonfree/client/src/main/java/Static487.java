import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(IB)Z")
	public static boolean method6425(@OriginalArg(0) int arg0) {
		return arg0 == 10 || arg0 == 11 || arg0 == 12;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!ub;I)V")
	public static void method6426(@OriginalArg(0) Class34_Sub1_Sub1_Sub2_Sub2 arg0) {
		for (@Pc(17) Class3_Sub30 local17 = (Class3_Sub30) Static533.aClass302_48.method6603(); local17 != null; local17 = (Class3_Sub30) Static533.aClass302_48.method6605()) {
			if (arg0 == local17.aClass34_Sub1_Sub1_Sub2_Sub2_1) {
				if (local17.aClass3_Sub12_Sub4_4 != null) {
					Static156.aClass3_Sub12_Sub1_1.method1766(local17.aClass3_Sub12_Sub4_4);
					local17.aClass3_Sub12_Sub4_4 = null;
				}
				local17.method9034();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "([BIIIIII[BI)V")
	public static void method6427(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg7 >> 2);
		@Pc(15) int local15 = -(arg7 & 0x3);
		for (@Pc(18) int local18 = -arg1; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg4++;
				arg6[local26] = (byte) (arg6[local26] - arg0[arg5++]);
				@Pc(39) int local39 = arg4++;
				arg6[local39] = (byte) (arg6[local39] - arg0[arg5++]);
				@Pc(52) int local52 = arg4++;
				arg6[local52] = (byte) (arg6[local52] - arg0[arg5++]);
				@Pc(65) int local65 = arg4++;
				arg6[local65] = (byte) (arg6[local65] - arg0[arg5++]);
			}
			for (@Pc(81) int local81 = local15; local81 < 0; local81++) {
				local26 = arg4++;
				arg6[local26] = (byte) (arg6[local26] - arg0[arg5++]);
			}
			arg4 += arg3;
			arg5 += arg2;
		}
	}
}
