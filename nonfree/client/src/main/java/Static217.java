import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!id", name = "a", descriptor = "F")
	public static float aFloat93;

	@OriginalMember(owner = "client!id", name = "e", descriptor = "Lclient!pj;")
	public static Class248 aClass248_32;

	@OriginalMember(owner = "client!id", name = "j", descriptor = "I")
	public static int anInt4047;

	@OriginalMember(owner = "client!id", name = "m", descriptor = "Lclient!xa;")
	public static Class71 aClass71_23;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)I")
	public static int method3474() {
		return Static289.anInt5313++;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIII[B[BI)V")
	public static void method3475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg3 >> 2);
		@Pc(15) int local15 = -(arg3 & 0x3);
		for (@Pc(18) int local18 = -arg4; local18 < 0; local18++) {
			@Pc(28) int local28;
			for (@Pc(24) int local24 = local10; local24 < 0; local24++) {
				local28 = arg0++;
				arg5[local28] += arg6[arg1++];
				@Pc(40) int local40 = arg0++;
				arg5[local40] += arg6[arg1++];
				@Pc(52) int local52 = arg0++;
				arg5[local52] += arg6[arg1++];
				@Pc(64) int local64 = arg0++;
				arg5[local64] += arg6[arg1++];
			}
			for (@Pc(79) int local79 = local15; local79 < 0; local79++) {
				local28 = arg0++;
				arg5[local28] += arg6[arg1++];
			}
			arg0 += arg2;
			arg1 += arg7;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIZI)I")
	public static int method3477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(12) Class6_Sub46 local12 = Static378.method5549(arg2, arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local12.anIntArray583.length) {
			return local12.anIntArray583[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
	public static void method3478() {
		Static384.anInt7048 = 0;
		Static408.aClass298_154.method6808();
		Static266.aBoolean351 = false;
	}
}
