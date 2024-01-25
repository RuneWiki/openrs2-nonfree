import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!gj", name = "p", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray70;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLclient!cm;[I[I[I)V")
	public static void method9011(@OriginalArg(1) Class34_Sub1_Sub1_Sub2_Sub1 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg3.length; local7++) {
			@Pc(13) int local13 = arg3[local7];
			@Pc(17) int local17 = arg2[local7];
			@Pc(21) int local21 = arg1[local7];
			@Pc(23) int local23 = 0;
			while (local17 != 0 && arg0.aClass158Array3.length > local23) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg0.aClass158Array3[local23] = null;
					} else {
						@Pc(41) Class239 local41 = Static13.aClass213_1.method5008(local13);
						@Pc(44) int local44 = local41.anInt6416;
						@Pc(49) Class158 local49 = arg0.aClass158Array3[local23];
						if (local49 != null) {
							if (local13 == local49.anInt4334) {
								if (local44 == 0) {
									local49 = arg0.aClass158Array3[local23] = null;
								} else if (local44 == 1) {
									local49.anInt4331 = 1;
									local49.anInt4335 = 0;
									local49.anInt4336 = local21;
									local49.anInt4332 = 0;
									local49.anInt4333 = 0;
									if (!arg0.aBoolean674) {
										Static305.method4420(arg0, local41, 0);
									}
								} else if (local44 == 2) {
									local49.anInt4333 = 0;
								}
							} else if (local41.anInt6404 >= Static13.aClass213_1.method5008(local49.anInt4334).anInt6404) {
								local49 = arg0.aClass158Array3[local23] = null;
							}
						}
						if (local49 == null) {
							local49 = arg0.aClass158Array3[local23] = new Class158();
							local49.anInt4335 = 0;
							local49.anInt4332 = 0;
							local49.anInt4334 = local13;
							local49.anInt4336 = local21;
							local49.anInt4331 = 1;
							local49.anInt4333 = 0;
							if (!arg0.aBoolean674) {
								Static305.method4420(arg0, local41, 0);
							}
						}
					}
				}
				local23++;
				local17 >>>= 0x1;
			}
		}
	}
}
