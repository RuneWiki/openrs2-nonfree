import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I[FI)[F")
	public static float[] method6549(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1) {
		@Pc(11) float[] local11 = new float[arg0];
		Static649.method4861(arg1, 0, local11, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILclient!aa;ILclient!dm;IIIJ)V")
	public static void method6553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class78 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) long arg7) {
		@Pc(15) int local15 = arg1 * arg1 + arg3 * arg3;
		if ((long) local15 > arg7) {
			return;
		}
		@Pc(35) int local35 = Math.min(arg4.anInt1964 / 2, arg4.anInt1991 / 2);
		if (local35 * local35 >= local15) {
			Static190.method8303(arg5, arg0, arg4, Static621.aClass20Array16[arg6], arg1, arg3, arg2);
			return;
		}
		local35 -= 10;
		@Pc(53) int local53;
		if (Static2.anInt31 == 4) {
			local53 = (int) Static378.aFloat160 & 0x3FFF;
		} else {
			local53 = (int) Static378.aFloat160 + Static415.anInt7576 & 0x3FFF;
		}
		@Pc(66) int local66 = Class353.anIntArray681[local53];
		@Pc(70) int local70 = Class353.anIntArray682[local53];
		if (Static2.anInt31 != 4) {
			local70 = local70 * 256 / (Static30.anInt6668 + 256);
			local66 = local66 * 256 / (Static30.anInt6668 + 256);
		}
		@Pc(101) int local101 = arg1 * local70 + local66 * arg3 >> 14;
		@Pc(112) int local112 = arg3 * local70 - local66 * arg1 >> 14;
		@Pc(118) double local118 = Math.atan2((double) local101, (double) local112);
		@Pc(125) int local125 = (int) ((double) local35 * Math.sin(local118));
		@Pc(132) int local132 = (int) (Math.cos(local118) * (double) local35);
		Static177.aClass20Array4[arg6].method4578((float) arg5 + (float) arg4.anInt1964 / 2.0F + (float) local125, (float) arg4.anInt1991 / 2.0F + (float) arg0 - (float) local132, 4096, (int) (-local118 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(II[BZIII)Z")
	public static boolean method6554(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(17) int local17 = arg4 % 8;
		@Pc(23) int local23;
		if (local17 == 0) {
			local23 = 0;
		} else {
			local23 = 8 - local17;
		}
		@Pc(36) int local36 = -((arg3 + 8 - 1) / 8);
		@Pc(45) int local45 = -((arg4 + 8 - 1) / 8);
		for (@Pc(47) int local47 = local36; local47 < 0; local47++) {
			for (@Pc(51) int local51 = local45; local51 < 0; local51++) {
				if (arg1[arg0] == 0) {
					return true;
				}
				arg0 += 8;
			}
			arg0 -= local23;
			if (arg1[arg0 - 1] == 0) {
				return true;
			}
			arg0 += arg2;
		}
		return false;
	}
}
