import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
	public static int anInt4785 = 0;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!da;ILclient!nu;III)V")
	public static void method3862(@OriginalArg(0) Class63 arg0, @OriginalArg(2) Class242 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			arg1.method4916(arg0.K(), arg0.l(), arg0.za(), arg0.J(), arg3, arg0.OA(), arg0.KA(), arg0.H(), arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!vg;IJLclient!ua;IIIII)V")
	public static void method3863(@OriginalArg(0) Class341 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Class204 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(25) int local25 = arg4 * arg4 + arg5 * arg5;
		if (arg2 < (long) local25) {
			return;
		}
		@Pc(45) int local45 = Math.min(arg0.anInt9300 / 2, arg0.anInt9248 / 2);
		if (local45 * local45 >= local25) {
			Static387.method5334(arg3, arg5, arg0, arg1, arg7, arg4, Static568.aClass22Array20[arg6]);
			return;
		}
		local45 -= 10;
		@Pc(65) int local65;
		if (Static340.anInt5707 == 4) {
			local65 = (int) Static167.aFloat59 & 0x3FFF;
		} else {
			local65 = (int) Static167.aFloat59 + Static548.anInt8574 & 0x3FFF;
		}
		@Pc(76) int local76 = Class1_Sub6_Sub2.anIntArray675[local65];
		@Pc(80) int local80 = Class1_Sub6_Sub2.anIntArray676[local65];
		if (Static340.anInt5707 != 4) {
			local76 = local76 * 256 / (Static348.anInt5786 + 256);
			local80 = local80 * 256 / (Static348.anInt5786 + 256);
		}
		@Pc(109) int local109 = arg5 * local80 + local76 * arg4 >> 14;
		@Pc(120) int local120 = arg4 * local80 - arg5 * local76 >> 14;
		@Pc(126) double local126 = Math.atan2((double) local109, (double) local120);
		@Pc(133) int local133 = (int) ((double) local45 * Math.sin(local126));
		@Pc(140) int local140 = (int) ((double) local45 * Math.cos(local126));
		Static126.aClass22Array8[arg6].method7658((float) local133 + (float) arg0.anInt9300 / 2.0F + (float) arg7, (float) -local140 + (float) arg0.anInt9248 / 2.0F + (float) arg1, 4096, (int) (-local126 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static504.method4690(arg1)) {
			return;
		}
		if (Static294.aClass341ArrayArray1[arg1] == null) {
			Static63.method1135(Static578.aClass341ArrayArray2[arg1], -1, arg3, arg2, arg7, arg4, arg0, arg5, arg8, arg6);
		} else {
			Static63.method1135(Static294.aClass341ArrayArray1[arg1], -1, arg3, arg2, arg7, arg4, arg0, arg5, arg8, arg6);
		}
	}
}
