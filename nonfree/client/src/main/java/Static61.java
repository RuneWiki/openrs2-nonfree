import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!c", name = "m", descriptor = "[Lclient!oda;")
	public static Class20_Sub2_Sub2[] aClass20_Sub2_Sub2Array1;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "Lclient!vd;")
	public static Class353 aClass353_10;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!vd;IZII)V")
	public static void method1084(@OriginalArg(0) int arg0, @OriginalArg(1) Class353 arg1, @OriginalArg(4) int arg2) {
		Static207.method3583(0L, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([BIIIIZII[B)V")
	public static void method1085(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg2 >> 2);
		@Pc(15) int local15 = -(arg2 & 0x3);
		for (@Pc(18) int local18 = -arg5; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg3++;
				arg0[local26] = (byte) (arg0[local26] - arg7[arg4++]);
				@Pc(39) int local39 = arg3++;
				arg0[local39] = (byte) (arg0[local39] - arg7[arg4++]);
				@Pc(52) int local52 = arg3++;
				arg0[local52] = (byte) (arg0[local52] - arg7[arg4++]);
				@Pc(65) int local65 = arg3++;
				arg0[local65] = (byte) (arg0[local65] - arg7[arg4++]);
			}
			for (@Pc(81) int local81 = local15; local81 < 0; local81++) {
				local26 = arg3++;
				arg0[local26] = (byte) (arg0[local26] - arg7[arg4++]);
			}
			arg3 += arg1;
			arg4 += arg6;
		}
	}
}
