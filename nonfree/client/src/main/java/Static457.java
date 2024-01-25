import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "[I")
	public static final int[] anIntArray472 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "([BLjava/lang/String;II)I")
	public static int method6284(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = arg1.length();
		@Pc(15) int local15 = arg2;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			@Pc(23) char local23 = arg1.charAt(local17);
			if (local23 <= '\u007f') {
				arg0[local15++] = (byte) local23;
			} else if (local23 > '\u07ff') {
				arg0[local15++] = (byte) (local23 >> 12 | 0xE0);
				arg0[local15++] = (byte) (local23 >> 6 & 0x3F | 0x80);
				arg0[local15++] = (byte) (local23 & 0x3F | 0x80);
			} else {
				arg0[local15++] = (byte) (local23 >> 6 | 0xC0);
				arg0[local15++] = (byte) (local23 & 0x3F | 0x80);
			}
		}
		return local15 - arg2;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIII[B[BIII)V")
	public static void method6286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) int local10 = -(arg2 >> 2);
		@Pc(15) int local15 = -(arg2 & 0x3);
		for (@Pc(18) int local18 = -arg6; local18 < 0; local18++) {
			@Pc(34) int local34;
			for (@Pc(30) int local30 = local10; local30 < 0; local30++) {
				local34 = arg1++;
				arg5[local34] = (byte) (arg5[local34] - arg4[arg0++]);
				@Pc(47) int local47 = arg1++;
				arg5[local47] = (byte) (arg5[local47] - arg4[arg0++]);
				@Pc(60) int local60 = arg1++;
				arg5[local60] = (byte) (arg5[local60] - arg4[arg0++]);
				@Pc(73) int local73 = arg1++;
				arg5[local73] = (byte) (arg5[local73] - arg4[arg0++]);
			}
			for (@Pc(89) int local89 = local15; local89 < 0; local89++) {
				local34 = arg1++;
				arg5[local34] = (byte) (arg5[local34] - arg4[arg0++]);
			}
			arg0 += arg7;
			arg1 += arg3;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "([[BZLclient!rfa;)V")
	public static void method6287(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class268_Sub1 arg1) {
		for (@Pc(16) int local16 = 0; local16 < arg1.anInt7987; local16++) {
			Static245.method3870();
			for (@Pc(22) int local22 = 0; local22 < Static345.anInt6228 >> 3; local22++) {
				for (@Pc(26) int local26 = 0; local26 < Static535.anInt9341 >> 3; local26++) {
					@Pc(36) int local36 = Static110.anIntArrayArrayArray1[local16][local22][local26];
					if (local36 != -1) {
						@Pc(45) int local45 = local36 >> 24 & 0x3;
						if (!arg1.aBoolean552 || local45 == 0) {
							@Pc(59) int local59 = local36 >> 1 & 0x3;
							@Pc(65) int local65 = local36 >> 14 & 0x3FF;
							@Pc(71) int local71 = local36 >> 3 & 0x7FF;
							@Pc(82) int local82 = (local65 / 8 << 8) + (local71 / 8);
							for (@Pc(84) int local84 = 0; local84 < Static178.anIntArray159.length; local84++) {
								if (Static178.anIntArray159[local84] == local82 && arg0[local84] != null) {
									arg1.method6307(local45, (local71 & 0x7) * 8, (local65 & 0x7) * 8, Static319.aClass31_11, local22 * 8, local59, Static187.aClass220Array1, local26 * 8, local16, arg0[local84]);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
