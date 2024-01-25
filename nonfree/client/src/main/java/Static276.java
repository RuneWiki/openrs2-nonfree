import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
	public static int anInt4708;

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
	public static int anInt4711;

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "[[I")
	public static int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "J")
	public static long aLong130 = 0L;

	@OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
	public static int anInt4714 = -1;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIILclient!uq;IZ)V")
	public static void method4049(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class362 arg2, @OriginalArg(5) int arg3) {
		if (arg1 <= 0) {
			Static58.method7696(arg2, arg0, arg3);
			return;
		}
		Static554.aClass362_126 = arg2;
		Static523.anInt8276 = arg3;
		Static18.aBoolean20 = false;
		Static653.aClass3_Sub12_Sub3_4 = null;
		Static531.anInt8329 = arg0;
		Static634.anInt6735 = 1;
		Static566.anInt9146 = 0;
		Static27.anInt684 = Static574.aClass3_Sub12_Sub3_3.method7576() / arg1;
		if (Static27.anInt684 < 1) {
			Static27.anInt684 = 1;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIII[BZ[B)V")
	public static void method4050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg1 >> 2);
		@Pc(15) int local15 = -(arg1 & 0x3);
		for (@Pc(18) int local18 = -arg3; local18 < 0; local18++) {
			@Pc(28) int local28;
			for (@Pc(24) int local24 = local10; local24 < 0; local24++) {
				local28 = arg0++;
				arg6[local28] = (byte) (arg6[local28] - arg7[arg2++]);
				@Pc(41) int local41 = arg0++;
				arg6[local41] = (byte) (arg6[local41] - arg7[arg2++]);
				@Pc(54) int local54 = arg0++;
				arg6[local54] = (byte) (arg6[local54] - arg7[arg2++]);
				@Pc(67) int local67 = arg0++;
				arg6[local67] = (byte) (arg6[local67] - arg7[arg2++]);
			}
			for (@Pc(83) int local83 = local15; local83 < 0; local83++) {
				local28 = arg0++;
				arg6[local28] = (byte) (arg6[local28] - arg7[arg2++]);
			}
			arg2 += arg4;
			arg0 += arg5;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIII)V")
	public static void method4052(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 << 3;
		@Pc(11) int local11 = arg0 << 3;
		Static318.aFloat81 = (float) local11;
		Static376.aFloat104 = (float) local7;
		if (Static451.anInt7263 == 2) {
			Static40.anInt856 = local11;
			Static325.anInt5414 = 0;
			Static655.anInt10676 = local7;
		}
		Static563.method7420();
		Static258.aBoolean305 = true;
	}
}
