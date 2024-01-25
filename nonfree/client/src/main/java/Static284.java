import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "F")
	public static float aFloat223;

	@OriginalMember(owner = "client!lr", name = "k", descriptor = "I")
	public static int anInt9393;

	@OriginalMember(owner = "client!lr", name = "m", descriptor = "I")
	public static int anInt9395;

	@OriginalMember(owner = "client!lr", name = "o", descriptor = "I")
	public static int anInt9397 = 0;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IB)V")
	public static void method7810(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub13_Sub15 local8 = Static370.method5893(arg0, 8);
		local8.method6974();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "([FIIIIIBIFI)V")
	public static void method7815(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg3 - arg5;
		@Pc(13) int local13 = arg2 - arg6;
		@Pc(17) int local17 = arg4 - arg8;
		@Pc(38) float local38 = (float) local17 * arg0[0] + (float) local9 * arg0[1] + (float) local13 * arg0[2];
		@Pc(59) float local59 = (float) local13 * arg0[5] + (float) local17 * arg0[3] + arg0[4] * (float) local9;
		@Pc(80) float local80 = (float) local9 * arg0[7] + (float) local17 * arg0[6] + arg0[8] * (float) local13;
		@Pc(103) float local103 = (float) Math.sqrt((double) (local38 * local38 + local59 * local59 + local80 * local80));
		@Pc(114) float local114 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(127) float local127 = (float) Math.asin((double) (local59 / local103)) / 3.1415927F + arg7 + 0.5F;
		@Pc(148) float local148;
		if (arg1 == 1) {
			local148 = local114;
			local114 = -local127;
			local127 = local148;
		} else if (arg1 == 2) {
			local127 = -local127;
			local114 = -local114;
		} else if (arg1 == 3) {
			local148 = local114;
			local114 = local127;
			local127 = -local148;
		}
		Static53.aFloat19 = local127;
		Static141.aFloat221 = local114;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/awt/Component;B)Lclient!nl;")
	public static Class189 method7818(@OriginalArg(0) Component arg0) {
		return new Class189_Sub1(arg0);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIIII)I")
	public static int method7821(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg0 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(23) int local23 = arg5;
			arg5 = arg1;
			arg1 = local23;
		}
		if (local10 == 0) {
			return arg2;
		} else if (local10 == 1) {
			return arg3;
		} else if (local10 == 2) {
			return 8 - arg5 - arg2;
		} else {
			return 7 + 1 - arg3 - arg1;
		}
	}
}
