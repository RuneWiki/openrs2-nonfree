import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!cr", name = "o", descriptor = "I")
	public static int anInt1184;

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "[I")
	public static final int[] anIntArray70 = new int[5];

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IZII)V")
	public static void method924(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) Class1_Sub2_Sub15 local21 = Static17.method307(9, arg1);
		local21.method4783();
		local21.anInt5467 = arg2;
		local21.anInt5461 = arg0;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILclient!ps;BIILclient!ud;IILclient!ii;)V")
	public static void method925(@OriginalArg(0) int arg0, @OriginalArg(1) Class163 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class15 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class105 arg7) {
		@Pc(9) Class74 local9 = Static298.method5215(arg5);
		if (local9 == null || !local9.aBoolean122 || !local9.method1448()) {
			return;
		}
		@Pc(43) int local43;
		if (local9.anIntArray149 != null) {
			@Pc(41) int[] local41 = new int[local9.anIntArray149.length];
			@Pc(55) int local55;
			for (local43 = 0; local43 < local41.length / 2; local43++) {
				if (Static246.anInt5156 == 4) {
					local55 = (int) Static143.aFloat21 & 0x3FFF;
				} else {
					local55 = Static86.anInt1648 + (int) Static143.aFloat21 & 0x3FFF;
				}
				@Pc(66) int local66 = Class1_Sub5_Sub15.anIntArray335[local55];
				@Pc(70) int local70 = Class1_Sub5_Sub15.anIntArray333[local55];
				if (Static246.anInt5156 != 4) {
					local66 = local66 * 256 / (Static260.anInt5347 + 256);
					local70 = local70 * 256 / (Static260.anInt5347 + 256);
				}
				local41[local43 * 2] = arg1.anInt4991 / 2 + arg2 + ((arg0 + local9.anIntArray149[local43 * 2 + 1] * 4) * local66 + (local9.anIntArray149[local43 * 2] * 4 + arg6) * local70 >> 15);
				local41[local43 * 2 + 1] = arg3 + arg1.anInt4935 / 2 - (local70 * (local9.anIntArray149[local43 * 2 + 1] * 4 + arg0) - (local9.anIntArray149[local43 * 2] * 4 + arg6) * local66 >> 15);
			}
			Static104.method1641(arg7, local41, local9.anInt1747, arg1.anIntArray457, arg1.anIntArray456);
			for (local55 = 0; local55 < local41.length / 2 - 1; local55++) {
				arg7.method4278(local41[local55 * 2], local41[local55 * 2 + 1], local41[(local55 + 1) * 2], local41[local55 * 2 + 2 + 1], local9.anInt1738, arg4, arg2, arg3);
			}
			arg7.method4278(local41[local41.length - 2], local41[local41.length - 1], local41[0], local41[1], local9.anInt1738, arg4, arg2, arg3);
		}
		@Pc(275) Class8 local275 = null;
		if (local9.anInt1725 != -1) {
			local275 = local9.method1458(false, arg7);
			if (local275 != null) {
				Static319.method2792(arg1, arg2, arg3, arg6, local275, arg4, arg0);
			}
		}
		if (local9.aString71 == null) {
			return;
		}
		local43 = 0;
		if (local275 != null) {
			local43 = local275.method4382();
		}
		@Pc(311) Class29 local311 = Static294.aClass29_4;
		@Pc(313) Class34 local313 = Static273.aClass34_8;
		if (local9.anInt1748 == 1) {
			local311 = Static233.aClass29_2;
			local313 = Static20.aClass34_1;
		}
		if (local9.anInt1748 == 2) {
			local313 = Static81.aClass34_4;
			local311 = Static286.aClass29_3;
		}
		Static306.method5298(arg6, arg2, local311, local313, local9.anInt1723, arg0, arg3, local43, local9.aString71, arg1, arg4);
		return;
	}
}
