import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!q", name = "l", descriptor = "I")
	public static int anInt4316;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method3296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 < 128 || arg6 < 128 || arg4 > 13056 || arg6 > 13056) {
			Static292.anInt5663 = -1;
			Static246.anInt4896 = -1;
			return;
		}
		@Pc(32) int local32 = Static59.method927(arg4, arg6, Static34.anInt770) - arg5;
		@Pc(36) int local36 = local32 - Static170.anInt3411;
		@Pc(40) int local40 = arg4 - Static46.anInt1044;
		@Pc(44) int local44 = Class68.anIntArray139[Static56.anInt1246];
		@Pc(48) int local48 = Class68.anIntArray137[Static293.anInt5684];
		@Pc(52) int local52 = Class68.anIntArray137[Static56.anInt1246];
		@Pc(56) int local56 = arg6 - Static185.anInt3689;
		@Pc(60) int local60 = Class68.anIntArray139[Static293.anInt5684];
		@Pc(70) int local70 = local60 * local40 + local56 * local48 >> 16;
		@Pc(81) int local81 = local60 * local56 - local48 * local40 >> 16;
		@Pc(83) int local83 = local70;
		@Pc(94) int local94 = local36 * local44 - local52 * local81 >> 16;
		@Pc(105) int local105 = local52 * local36 + local81 * local44 >> 16;
		if (local105 < 50) {
			Static246.anInt4896 = -1;
			Static292.anInt5663 = -1;
		} else if (Static116.aBoolean188) {
			@Pc(149) int local149 = arg1 * 512 >> 8;
			Static292.anInt5663 = local83 * local149 / local105 + arg2;
			@Pc(163) int local163 = arg0 * 512 >> 8;
			Static246.anInt4896 = local163 * local94 / local105 + arg3;
		} else {
			Static292.anInt5663 = (local83 << 9) / local105 + arg2;
			Static246.anInt4896 = (local94 << 9) / local105 + arg3;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "([Ljava/lang/String;I[SII)V")
	public static void method3297(@OriginalArg(0) String[] arg0, @OriginalArg(2) short[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(15) int local15 = (arg2 + arg3) / 2;
		@Pc(17) int local17 = arg3;
		@Pc(21) String local21 = arg0[local15];
		arg0[local15] = arg0[arg2];
		arg0[arg2] = local21;
		@Pc(35) short local35 = arg1[local15];
		arg1[local15] = arg1[arg2];
		arg1[arg2] = local35;
		for (@Pc(47) int local47 = arg3; local47 < arg2; local47++) {
			if (local21 == null || arg0[local47] != null && (local47 & 0x1) > arg0[local47].compareTo(local21)) {
				@Pc(70) String local70 = arg0[local47];
				arg0[local47] = arg0[local17];
				arg0[local17] = local70;
				@Pc(84) short local84 = arg1[local47];
				arg1[local47] = arg1[local17];
				arg1[local17++] = local84;
			}
		}
		arg0[arg2] = arg0[local17];
		arg0[local17] = local21;
		arg1[arg2] = arg1[local17];
		arg1[local17] = local35;
		method3297(arg0, arg1, local17 - 1, arg3);
		method3297(arg0, arg1, arg2, local17 + 1);
	}
}
