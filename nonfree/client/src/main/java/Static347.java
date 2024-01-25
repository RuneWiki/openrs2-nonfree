import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
	public static int anInt5935;

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "F")
	public static float aFloat105;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIILclient!ln;I)Z")
	public static boolean method5034(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class214 arg4, @OriginalArg(6) int arg5) {
		if (!Static355.aBoolean420 || !Static296.aBoolean335) {
			return false;
		} else if (Static304.anInt5127 < 100) {
			return false;
		} else if (arg1 != arg5 || arg3 != arg0) {
			for (@Pc(56) int local56 = arg5; local56 <= arg1; local56++) {
				for (@Pc(60) int local60 = arg3; local60 <= arg0; local60++) {
					if (-Static276.anInt4711 == Static638.anIntArrayArrayArray18[arg2][local56][local60]) {
						return false;
					}
				}
			}
			if (Static395.method5503(arg4)) {
				Static512.anInt8073++;
				return true;
			} else {
				return false;
			}
		} else if (!Static674.method8987(arg2, arg5, arg3)) {
			return false;
		} else if (Static395.method5503(arg4)) {
			Static512.anInt8073++;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIII)V")
	public static void method5035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class368 local7 = Static254.aClass368ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class34_Sub1_Sub3 local13 = local7.aClass34_Sub1_Sub3_1;
		@Pc(16) Class34_Sub1_Sub3 local16 = local7.aClass34_Sub1_Sub3_2;
		if (local13 != null) {
			local13.aShort72 = (short) (local13.aShort72 * arg3 / (0x10 << Static571.anInt9216 - 7));
			local13.aShort73 = (short) (local13.aShort73 * arg3 / (0x10 << Static571.anInt9216 - 7));
		}
		if (local16 != null) {
			local16.aShort72 = (short) (local16.aShort72 * arg3 / (0x10 << Static571.anInt9216 - 7));
			local16.aShort73 = (short) (local16.aShort73 * arg3 / (0x10 << Static571.anInt9216 - 7));
		}
	}
}
