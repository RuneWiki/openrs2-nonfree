import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static615 {

	@OriginalMember(owner = "client!un", name = "g", descriptor = "Lclient!uq;")
	public static Class362 aClass362_147;

	@OriginalMember(owner = "client!un", name = "f", descriptor = "I")
	public static final int anInt10214 = 1339;

	@OriginalMember(owner = "client!un", name = "k", descriptor = "Z")
	public static boolean aBoolean715 = false;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!ub;[I[II[I)V")
	public static void method8332(@OriginalArg(0) Class34_Sub1_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(13) int local13 = arg2[local7];
			@Pc(17) int local17 = arg1[local7];
			@Pc(21) int local21 = arg3[local7];
			for (@Pc(23) int local23 = 0; local17 != 0 && local23 < arg0.aClass158Array3.length; local23++) {
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
									local49.anInt4333 = 0;
									local49.anInt4335 = 0;
									local49.anInt4332 = 0;
									local49.anInt4331 = 1;
									local49.anInt4336 = local21;
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
							local49.anInt4336 = local21;
							local49.anInt4334 = local13;
							local49.anInt4333 = 0;
							local49.anInt4335 = 0;
							local49.anInt4331 = 1;
							local49.anInt4332 = 0;
							if (!arg0.aBoolean674) {
								Static305.method4420(arg0, local41, 0);
							}
						}
					}
				}
				local17 >>>= 0x1;
			}
		}
	}
}
