import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!oca", name = "P", descriptor = "[[B")
	public static byte[][] aByteArrayArray36;

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg3 == arg7 && arg0 == arg5 && arg4 == arg1 && arg8 == arg6) {
			Static422.method6054(arg3, arg6, arg1, arg2, arg0);
			return;
		}
		@Pc(28) int local28 = arg3;
		@Pc(30) int local30 = arg0;
		@Pc(34) int local34 = arg3 * 3;
		@Pc(38) int local38 = arg0 * 3;
		@Pc(42) int local42 = arg7 * 3;
		@Pc(46) int local46 = arg5 * 3;
		@Pc(50) int local50 = arg4 * 3;
		@Pc(54) int local54 = arg8 * 3;
		@Pc(63) int local63 = local42 + arg1 - local50 - arg3;
		@Pc(73) int local73 = arg6 + local46 - local54 - arg0;
		@Pc(82) int local82 = local34 + local50 - local42 - local42;
		@Pc(92) int local92 = local38 + local54 - local46 - local46;
		@Pc(97) int local97 = local42 - local34;
		@Pc(102) int local102 = local46 - local38;
		for (@Pc(104) int local104 = 128; local104 <= 4096; local104 += 128) {
			@Pc(112) int local112 = local104 * local104 >> 12;
			@Pc(118) int local118 = local112 * local104 >> 12;
			@Pc(122) int local122 = local63 * local118;
			@Pc(126) int local126 = local73 * local118;
			@Pc(130) int local130 = local82 * local112;
			@Pc(134) int local134 = local112 * local92;
			@Pc(138) int local138 = local104 * local97;
			@Pc(142) int local142 = local104 * local102;
			@Pc(152) int local152 = (local138 + local122 + local130 >> 12) + arg3;
			@Pc(162) int local162 = (local142 + local134 + local126 >> 12) + arg0;
			Static422.method6054(local28, local162, local152, arg2, local30);
			local30 = local162;
			local28 = local152;
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(II)Z")
	public static boolean method5412(@OriginalArg(0) int arg0) {
		if (Static463.aBooleanArray33[arg0]) {
			return true;
		} else if (Static182.aClass117_100.method2979(arg0)) {
			@Pc(28) int local28 = Static182.aClass117_100.method2951(arg0);
			if (local28 == 0) {
				Static463.aBooleanArray33[arg0] = true;
				return true;
			}
			if (Static139.aClass220ArrayArray1[arg0] == null) {
				Static139.aClass220ArrayArray1[arg0] = new Class220[local28];
			}
			for (@Pc(47) int local47 = 0; local47 < local28; local47++) {
				if (Static139.aClass220ArrayArray1[arg0][local47] == null) {
					@Pc(61) byte[] local61 = Static182.aClass117_100.method2962(local47, arg0);
					if (local61 != null) {
						@Pc(73) Class220 local73 = Static139.aClass220ArrayArray1[arg0][local47] = new Class220();
						local73.anInt6661 = local47 + (arg0 << 16);
						if (local61[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local73.method5479(new Class5_Sub3(local61));
					}
				}
			}
			Static463.aBooleanArray33[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
