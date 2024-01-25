import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!ib", name = "L", descriptor = "I")
	public static int anInt2823;

	@OriginalMember(owner = "client!ib", name = "M", descriptor = "Lclient!pe;")
	public static Class89 aClass89_3;

	@OriginalMember(owner = "client!ib", name = "H", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_25 = new Class103(20);

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IBI)V")
	public static void method2627(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class14 local9 = Static321.aClass14ArrayArray1[arg1][arg0];
		if (local9 != null) {
			Static192.anInt3829 = local9.anInt290;
			Static91.anInt5971 = local9.anInt294;
			Static5.anInt79 = local9.anInt286;
		}
		Static189.method3447();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([I[ILclient!qo;[II)V")
	public static void method2628(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class22_Sub2_Sub1_Sub2 arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) int local13 = arg0[local7];
			@Pc(17) int local17 = arg1[local7];
			@Pc(21) int local21 = arg3[local7];
			@Pc(23) int local23 = 0;
			while (local17 != 0 && local23 < arg2.aClass190Array3.length) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg2.aClass190Array3[local23] = null;
					} else {
						@Pc(40) Class170 local40 = Static261.method4379(local13);
						@Pc(43) int local43 = local40.anInt4968;
						@Pc(48) Class190 local48 = arg2.aClass190Array3[local23];
						if (local48 != null) {
							if (local13 == local48.anInt5765) {
								if (local43 == 0) {
									local48 = arg2.aClass190Array3[local23] = null;
								} else if (local43 == 1) {
									local48.anInt5760 = 0;
									local48.anInt5761 = 1;
									local48.anInt5759 = 0;
									local48.anInt5763 = 0;
									local48.anInt5764 = local21;
									Static219.method3870(local40, arg2.anInt5967, false, 0, arg2.anInt5973);
								} else if (local43 == 2) {
									local48.anInt5763 = 0;
								}
							} else if (local40.anInt4963 >= Static261.method4379(local48.anInt5765).anInt4963) {
								local48 = arg2.aClass190Array3[local23] = null;
							}
						}
						if (local48 == null) {
							local48 = arg2.aClass190Array3[local23] = new Class190();
							local48.anInt5765 = local13;
							local48.anInt5759 = 0;
							local48.anInt5764 = local21;
							local48.anInt5760 = 0;
							local48.anInt5761 = 1;
							local48.anInt5763 = 0;
							Static219.method3870(local40, arg2.anInt5967, false, 0, arg2.anInt5973);
						}
					}
				}
				local23++;
				local17 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(DZ)V")
	public static void method2630(@OriginalArg(0) double arg0) {
		if (Static315.aDouble9 == arg0) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static317.anIntArray768[local7] = local19 <= 255 ? local19 : 255;
		}
		Static315.aDouble9 = arg0;
	}
}
