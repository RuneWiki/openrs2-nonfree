import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!qaa", name = "d", descriptor = "Lclient!xa;")
	public static Class13 aClass13_30;

	@OriginalMember(owner = "client!qaa", name = "g", descriptor = "Lclient!db;")
	public static final Class64 aClass64_345 = new Class64(30, -1);

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IIIFIIFF[BFILclient!fq;F)V")
	public static void method6067(@OriginalArg(0) int arg0, @OriginalArg(3) float arg1, @OriginalArg(6) float arg2, @OriginalArg(7) float arg3, @OriginalArg(8) byte[] arg4, @OriginalArg(9) float arg5, @OriginalArg(11) Class109 arg6, @OriginalArg(12) float arg7) {
		for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
			Static277.method4414(arg3, arg1, arg4, arg0, local7, arg7, arg5, arg2, arg6);
			arg0 += 16384;
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IIIIIII[B[B)V")
	public static void method6069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(13) int local13 = -(arg4 >> 2);
		@Pc(18) int local18 = -(arg4 & 0x3);
		for (@Pc(21) int local21 = -arg5; local21 < 0; local21++) {
			@Pc(29) int local29;
			for (@Pc(25) int local25 = local13; local25 < 0; local25++) {
				local29 = arg0++;
				arg7[local29] += arg6[arg2++];
				@Pc(41) int local41 = arg0++;
				arg7[local41] += arg6[arg2++];
				@Pc(53) int local53 = arg0++;
				arg7[local53] += arg6[arg2++];
				@Pc(65) int local65 = arg0++;
				arg7[local65] += arg6[arg2++];
			}
			for (@Pc(83) int local83 = local18; local83 < 0; local83++) {
				local29 = arg0++;
				arg7[local29] += arg6[arg2++];
			}
			arg0 += arg1;
			arg2 += arg3;
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ZLclient!oa;)V")
	public static void method6070(@OriginalArg(1) Class66 arg0) {
		Static334.aClass91_5 = Static226.method3960(true, Static147.anInt3290, arg0);
		Static272.aClass196_7 = Static462.method6484(Static147.anInt3290, arg0);
		Static375.aClass91_7 = Static226.method3960(true, Static318.anInt5720, arg0);
		Static162.aClass196_4 = Static462.method6484(Static318.anInt5720, arg0);
		Static65.aClass91_4 = Static226.method3960(true, Static498.anInt8630, arg0);
		Static195.aClass196_5 = Static462.method6484(Static498.anInt8630, arg0);
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method6071(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg3; local12 <= arg0; local12++) {
			for (@Pc(16) int local16 = arg1; local16 <= arg2; local16++) {
				if (arg4 == Static246.anIntArrayArray54[local12][local16] && Static459.anIntArrayArray67[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
