import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_82 = new Class21("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)I")
	public static int method4425(@OriginalArg(1) int arg0) {
		@Pc(20) int local20 = arg0 >>> 1;
		@Pc(26) int local26 = local20 | local20 >>> 1;
		@Pc(32) int local32 = local26 | local26 >>> 2;
		@Pc(38) int local38 = local32 | local32 >>> 4;
		@Pc(44) int local44 = local38 | local38 >>> 8;
		@Pc(50) int local50 = local44 | local44 >>> 16;
		return ~local50 & arg0;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZLclient!vv;IZILclient!vv;I)I")
	public static int method4426(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class82_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class82_Sub1 arg4, @OriginalArg(6) int arg5) {
		@Pc(22) int local22 = Static190.method3419(arg1, arg4, arg3, arg2);
		if (local22 != 0) {
			return arg2 ? -local22 : local22;
		} else if (arg5 == -1) {
			return 0;
		} else {
			@Pc(43) int local43 = Static190.method3419(arg1, arg4, arg5, arg0);
			return arg0 ? -local43 : local43;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IBII[B[BIII)V")
	public static void method4428(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg1 >> 2);
		@Pc(15) int local15 = -(arg1 & 0x3);
		for (@Pc(18) int local18 = -arg2; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg6++;
				arg3[local26] += arg4[arg7++];
				@Pc(38) int local38 = arg6++;
				arg3[local38] += arg4[arg7++];
				@Pc(50) int local50 = arg6++;
				arg3[local50] += arg4[arg7++];
				@Pc(62) int local62 = arg6++;
				arg3[local62] += arg4[arg7++];
			}
			for (@Pc(80) int local80 = local15; local80 < 0; local80++) {
				local26 = arg6++;
				arg3[local26] += arg4[arg7++];
			}
			arg6 += arg5;
			arg7 += arg0;
		}
	}
}
