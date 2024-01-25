import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
	public static int anInt9105 = 0;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIILclient!qh;)V")
	public static void method7484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class49_Sub4 arg4) {
		@Pc(4) Class255 local4 = Static188.method2930(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt5769 = (arg1 << Static451.anInt7905) + Static122.anInt2483;
		arg4.anInt5768 = arg3;
		arg4.anInt5772 = (arg2 << Static451.anInt7905) + Static122.anInt2483;
		for (@Pc(28) Class63 local28 = local4.aClass63_3; local28 != null; local28 = local28.aClass63_1) {
			if (local28.aClass49_Sub2_1.aBoolean515) {
				@Pc(38) int local38 = local28.aClass49_Sub2_1.method5994();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt5768 += local8;
			arg4.aBoolean423 = true;
		} else if (local4.aClass49_Sub5_2 != null) {
			arg4.anInt5768 -= local4.aClass49_Sub5_2.aShort126;
		}
		local4.aClass49_Sub4_1 = arg4;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(FIF[FIIIIIII)V")
	public static void method7492(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg7 - arg6;
		@Pc(9) int local9 = arg8 - arg4;
		@Pc(17) int local17 = arg9 - arg3;
		@Pc(38) float local38 = (float) local9 * arg2[0] + arg2[1] * (float) local17 + arg2[2] * (float) local5;
		@Pc(59) float local59 = arg2[4] * (float) local17 + arg2[3] * (float) local9 + (float) local5 * arg2[5];
		@Pc(80) float local80 = (float) local17 * arg2[7] + arg2[6] * (float) local9 + arg2[8] * (float) local5;
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg0 != 1.0F) {
			local91 *= arg0;
		}
		@Pc(110) float local110 = arg1 + local59 + 0.5F;
		@Pc(115) float local115;
		if (arg5 == 1) {
			local115 = local91;
			local91 = -local110;
			local110 = local115;
		} else if (arg5 == 2) {
			local110 = -local110;
			local91 = -local91;
		} else if (arg5 == 3) {
			local115 = local91;
			local91 = local110;
			local110 = -local115;
		}
		Static119.aFloat25 = local110;
		Static213.aFloat91 = local91;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!n;IILjava/awt/Canvas;)Lclient!qa;")
	public static Class122 method7493(@OriginalArg(0) Interface8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2) {
		return new Class122_Sub3(arg2, arg0, arg1);
	}
}
