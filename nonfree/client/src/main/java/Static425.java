import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "F")
	public static float aFloat317;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(B[B)Z")
	public static boolean method6096(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class5_Sub3 local13 = new Class5_Sub3(arg0);
		@Pc(17) int local17 = local13.method4220();
		if (local17 != 2) {
			return false;
		}
		@Pc(33) boolean local33 = local13.method4220() == 1;
		if (local33) {
			Static428.method6123(local13);
		}
		Static30.method696(local13);
		return true;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method6097(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 == arg1 && arg5 == arg2 && arg7 == arg4 && arg6 == arg3) {
			Static527.method7222(arg0, arg6, arg5, arg8, arg4);
			return;
		}
		@Pc(36) int local36 = arg0;
		@Pc(38) int local38 = arg5;
		@Pc(42) int local42 = arg0 * 3;
		@Pc(46) int local46 = arg5 * 3;
		@Pc(50) int local50 = arg1 * 3;
		@Pc(54) int local54 = arg2 * 3;
		@Pc(58) int local58 = arg7 * 3;
		@Pc(62) int local62 = arg3 * 3;
		@Pc(73) int local73 = arg4 + local50 - arg0 - local58;
		@Pc(82) int local82 = local54 + arg6 - local62 - arg5;
		@Pc(92) int local92 = local42 + local58 - local50 - local50;
		@Pc(101) int local101 = local46 + local62 - local54 - local54;
		@Pc(106) int local106 = local50 - local42;
		@Pc(111) int local111 = local54 - local46;
		for (@Pc(113) int local113 = 128; local113 <= 4096; local113 += 128) {
			@Pc(121) int local121 = local113 * local113 >> 12;
			@Pc(127) int local127 = local121 * local113 >> 12;
			@Pc(131) int local131 = local73 * local127;
			@Pc(135) int local135 = local127 * local82;
			@Pc(139) int local139 = local121 * local92;
			@Pc(143) int local143 = local121 * local101;
			@Pc(147) int local147 = local113 * local106;
			@Pc(151) int local151 = local113 * local111;
			@Pc(161) int local161 = (local139 + local131 + local147 >> 12) + arg0;
			@Pc(172) int local172 = arg5 + (local151 + local135 + local143 >> 12);
			Static527.method7222(local36, local172, local38, arg8, local161);
			local38 = local172;
			local36 = local161;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)I")
	public static int method6098(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)Z")
	public static boolean method6099(@OriginalArg(0) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BLjava/awt/Canvas;Lclient!n;)Lclient!qa;")
	public static Class62 method6100(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Interface8 arg1) {
		return new a(arg0, arg1);
	}
}
