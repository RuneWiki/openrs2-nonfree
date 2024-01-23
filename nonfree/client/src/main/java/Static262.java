import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!ua", name = "A", descriptor = "Lclient!client;")
	public static client aClient41;

	@OriginalMember(owner = "client!ua", name = "L", descriptor = "Lclient!jd;")
	public static Class84 aClass84_135;

	@OriginalMember(owner = "client!ua", name = "M", descriptor = "[I")
	public static int[] anIntArray528;

	@OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
	public static int anInt6194 = 0;

	@OriginalMember(owner = "client!ua", name = "C", descriptor = "I")
	public static int anInt6201 = -1;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZLclient!mn;)Z")
	public static boolean method4939(@OriginalArg(1) Class115 arg0) {
		if (arg0.anIntArray279 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray279.length; local17++) {
			@Pc(27) int local27 = Static237.method3914(local17, arg0);
			@Pc(32) int local32 = arg0.anIntArray276[local17];
			if (arg0.anIntArray279[local17] == 2) {
				if (local32 <= local27) {
					return false;
				}
			} else if (arg0.anIntArray279[local17] == 3) {
				if (local27 <= local32) {
					return false;
				}
			} else if (arg0.anIntArray279[local17] == 4) {
				if (local27 == local32) {
					return false;
				}
			} else if (local27 != local32) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "([[IIIZZ[ZZ[[I[IZII[[FI[[FILclient!fn;I[[FZIB)V")
	public static void method4943(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean[] arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int[][] arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float[][] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) float[][] arg13, @OriginalArg(15) int arg14, @OriginalArg(16) Class2_Sub12 arg15, @OriginalArg(17) int arg16, @OriginalArg(18) float[][] arg17, @OriginalArg(19) boolean arg18, @OriginalArg(20) int arg19, @OriginalArg(21) byte arg20) {
		@Pc(15) int local15 = (arg18 ? 255 : 0) + (arg16 << 8);
		@Pc(25) int local25 = (arg3 ? 255 : 0) + (arg12 << 8);
		@Pc(35) int local35 = (arg19 << 8) + (arg8 ? 255 : 0);
		@Pc(45) int local45 = (arg5 ? 255 : 0) + (arg9 << 8);
		@Pc(51) int[] local51 = new int[arg7.length / 2];
		for (@Pc(53) int local53 = 0; local53 < local51.length; local53++) {
			@Pc(63) int local63 = arg7[local53 + local53];
			@Pc(76) int[][] local76 = arg0 == null || arg4 == null || !arg4[local53] ? arg6 : arg0;
			@Pc(85) int local85 = arg7[local53 + local53 + 1];
			local51[local53] = Static287.method4765(local15, arg13, (float) arg10, local63, arg15, arg11, arg2, false, local25, local45, arg1, arg0, arg20, local85, arg17, local35, local76);
		}
		arg15.method1400(arg14, arg1, arg2, local51, null, false);
	}
}
