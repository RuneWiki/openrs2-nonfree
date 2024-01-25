import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!ew", name = "r", descriptor = "[[B")
	public static byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!ew", name = "N", descriptor = "[[I")
	public static int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!ew", name = "q", descriptor = "I")
	public static int anInt1854 = 0;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "([ILclient!oq;[II[I)V")
	public static void method1488(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class20_Sub3_Sub3_Sub1 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg3.length; local7++) {
			@Pc(13) int local13 = arg3[local7];
			@Pc(17) int local17 = arg0[local7];
			@Pc(21) int local21 = arg2[local7];
			@Pc(23) int local23 = 0;
			while (local17 != 0 && local23 < arg1.aClass99Array3.length) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg1.aClass99Array3[local23] = null;
					} else {
						@Pc(38) Class171 local38 = Static152.aClass213_1.method4410(local13);
						@Pc(41) int local41 = local38.anInt4256;
						@Pc(46) Class99 local46 = arg1.aClass99Array3[local23];
						if (local46 != null) {
							if (local13 == local46.anInt2438) {
								if (local41 == 0) {
									local46 = arg1.aClass99Array3[local23] = null;
								} else if (local41 == 1) {
									local46.anInt2447 = 0;
									local46.anInt2441 = 1;
									local46.anInt2444 = local21;
									local46.anInt2446 = 0;
									local46.anInt2443 = 0;
									Static7.method4909(arg1.anInt6616, arg1.anInt6613, arg1.aByte89, arg1 == Static239.aClass20_Sub3_Sub3_Sub1_1, local38, 0);
								} else if (local41 == 2) {
									local46.anInt2443 = 0;
								}
							} else if (local38.anInt4262 >= Static152.aClass213_1.method4410(local46.anInt2438).anInt4262) {
								local46 = arg1.aClass99Array3[local23] = null;
							}
						}
						if (local46 == null) {
							local46 = arg1.aClass99Array3[local23] = new Class99();
							local46.anInt2441 = 1;
							local46.anInt2447 = 0;
							local46.anInt2444 = local21;
							local46.anInt2446 = 0;
							local46.anInt2438 = local13;
							local46.anInt2443 = 0;
							Static7.method4909(arg1.anInt6616, arg1.anInt6613, arg1.aByte89, Static239.aClass20_Sub3_Sub3_Sub1_1 == arg1, local38, 0);
						}
					}
				}
				local23++;
				local17 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(III)I")
	public static int method1490(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 >> 31 & arg0 - 1;
		return local16 + (arg1 + (arg1 >>> 31)) % arg0;
	}
}
