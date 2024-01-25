import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IILclient!ep;IIIIILclient!ms;)V")
	public static void method206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class66 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class137 arg7) {
		@Pc(23) int local23 = arg6 * arg6 + arg4 * arg4;
		if (local23 > arg3) {
			return;
		}
		@Pc(41) int local41 = Math.min(arg7.anInt4060 / 2, arg7.anInt4110 / 2);
		if (local41 * local41 >= local23) {
			Static189.method496(arg5, arg2, arg7, arg4, arg6, Static137.aClass97Array9[arg0], arg1);
			return;
		}
		local41 -= 10;
		@Pc(74) int local74;
		if (Static81.anInt1498 == 4) {
			local74 = (int) Static246.aFloat51 & 0x3FFF;
		} else {
			local74 = (int) Static246.aFloat51 + Static303.anInt4931 & 0x3FFF;
		}
		@Pc(85) int local85 = Class140.anIntArray330[local74];
		@Pc(89) int local89 = Class140.anIntArray329[local74];
		if (Static81.anInt1498 != 4) {
			local89 = local89 * 256 / (Static231.anInt5050 + 256);
			local85 = local85 * 256 / (Static231.anInt5050 + 256);
		}
		@Pc(120) int local120 = local85 * arg6 + local89 * arg4 >> 15;
		@Pc(131) int local131 = arg6 * local89 - arg4 * local85 >> 15;
		@Pc(137) double local137 = Math.atan2((double) local120, (double) local131);
		@Pc(144) int local144 = (int) (Math.sin(local137) * (double) local41);
		@Pc(151) int local151 = (int) ((double) local41 * Math.cos(local137));
		Static272.aClass97Array22[arg0].method5553((float) local144 + (float) arg7.anInt4060 / 2.0F + (float) arg5, (float) -local151 + (float) arg7.anInt4110 / 2.0F + (float) arg1, 4096, (int) (-local137 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(BLclient!nq;)V")
	public static void method208(@OriginalArg(1) Class144 arg0) {
		Static208.aClass144_108 = arg0;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIIIIII)V")
	public static void method209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg3 + arg2;
		@Pc(13) int local13 = arg5 - arg2;
		for (@Pc(15) int local15 = arg3; local15 < local9; local15++) {
			Static224.method5303(Static73.anIntArrayArray6[local15], arg4, arg6, arg0);
		}
		@Pc(34) int local34 = arg4 - arg2;
		@Pc(38) int local38 = arg0 + arg2;
		for (@Pc(53) int local53 = arg5; local53 > local13; local53--) {
			Static224.method5303(Static73.anIntArrayArray6[local53], arg4, arg6, arg0);
		}
		for (@Pc(73) int local73 = local9; local73 <= local13; local73++) {
			@Pc(79) int[] local79 = Static73.anIntArrayArray6[local73];
			Static224.method5303(local79, local38, arg6, arg0);
			Static224.method5303(local79, local34, arg1, local38);
			Static224.method5303(local79, arg4, arg6, local34);
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIII)Z")
	public static boolean method210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static1.aByteArrayArrayArray1[0][arg3][arg1] & 0x2) != 0) {
			return true;
		} else if ((Static1.aByteArrayArrayArray1[arg2][arg3][arg1] & 0x10) == 0) {
			return Static134.method2078(arg2, arg1, arg3) == arg0;
		} else {
			return false;
		}
	}
}
