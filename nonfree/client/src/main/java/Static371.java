import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!of", name = "b", descriptor = "I")
	public static int anInt6685;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(III)Z")
	public static boolean method5424(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIZII)V")
	public static void method5425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = arg4 - arg2;
		@Pc(20) int local20 = arg3 - arg0;
		if (local15 == 0) {
			if (local20 != 0) {
				Static249.method3639(arg2, arg0, arg1, arg3);
			}
		} else if (local20 == 0) {
			Static349.method5200(arg0, arg2, arg4, arg1);
		} else {
			@Pc(49) int local49 = (local20 << 12) / local15;
			@Pc(58) int local58 = arg0 - (local49 * arg2 >> 12);
			@Pc(70) int local70;
			@Pc(72) int local72;
			if (arg4 < Static330.anInt6025) {
				local70 = Static330.anInt6025;
				local72 = (local49 * Static330.anInt6025 >> 12) + local58;
			} else if (Static194.anInt3788 >= arg4) {
				local70 = arg4;
				local72 = arg3;
			} else {
				local72 = (Static194.anInt3788 * local49 >> 12) + local58;
				local70 = Static194.anInt3788;
			}
			@Pc(108) int local108;
			@Pc(116) int local116;
			if (Static330.anInt6025 > arg2) {
				local108 = Static330.anInt6025;
				local116 = local58 + (Static330.anInt6025 * local49 >> 12);
			} else if (Static194.anInt3788 < arg2) {
				local108 = Static194.anInt3788;
				local116 = local58 + (local49 * Static194.anInt3788 >> 12);
			} else {
				local108 = arg2;
				local116 = arg0;
			}
			if (local116 < Static120.anInt2491) {
				local116 = Static120.anInt2491;
				local108 = (Static120.anInt2491 - local58 << 12) / local49;
			} else if (local116 > Static71.anInt1350) {
				local116 = Static71.anInt1350;
				local108 = (Static71.anInt1350 - local58 << 12) / local49;
			}
			if (local72 < Static120.anInt2491) {
				local72 = Static120.anInt2491;
				local70 = (Static120.anInt2491 - local58 << 12) / local49;
			} else if (Static71.anInt1350 < local72) {
				local72 = Static71.anInt1350;
				local70 = (Static71.anInt1350 - local58 << 12) / local49;
			}
			Static229.method3417(local72, local108, local116, arg1, local70);
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method5426(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 + arg4 > arg0 && arg2 < arg0 + arg1) {
			return arg6 < arg7 + arg5 && arg3 + arg6 > arg7;
		} else {
			return false;
		}
	}
}
