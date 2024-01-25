import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
	public static int anInt3801 = 0;

	@OriginalMember(owner = "client!kd", name = "K", descriptor = "I")
	public static int anInt3804 = 0;

	@OriginalMember(owner = "client!kd", name = "L", descriptor = "I")
	public static int anInt3805 = 0;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([I[ILclient!dw;[II)V")
	public static void method3096(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class3_Sub2_Sub1_Sub1 arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg3.length; local7++) {
			@Pc(13) int local13 = arg3[local7];
			@Pc(17) int local17 = arg1[local7];
			@Pc(21) int local21 = arg0[local7];
			@Pc(23) int local23 = 0;
			while (local17 != 0 && arg2.aClass190Array3.length > local23) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg2.aClass190Array3[local23] = null;
					} else {
						@Pc(40) Class250 local40 = Static338.aClass12_2.method255(local13);
						@Pc(43) int local43 = local40.anInt7015;
						@Pc(48) Class190 local48 = arg2.aClass190Array3[local23];
						if (local48 != null) {
							if (local13 == local48.anInt5355) {
								if (local43 == 0) {
									local48 = arg2.aClass190Array3[local23] = null;
								} else if (local43 == 1) {
									local48.anInt5350 = local21;
									local48.anInt5352 = 0;
									local48.anInt5357 = 1;
									local48.anInt5351 = 0;
									local48.anInt5354 = 0;
									Static131.method2230(arg2.anInt6119, arg2.anInt6121, arg2.aByte89, false, local40, 0);
								} else if (local43 == 2) {
									local48.anInt5354 = 0;
								}
							} else if (local40.anInt7019 >= Static338.aClass12_2.method255(local48.anInt5355).anInt7019) {
								local48 = arg2.aClass190Array3[local23] = null;
							}
						}
						if (local48 == null) {
							local48 = arg2.aClass190Array3[local23] = new Class190();
							local48.anInt5355 = local13;
							local48.anInt5351 = 0;
							local48.anInt5357 = 1;
							local48.anInt5350 = local21;
							local48.anInt5354 = 0;
							local48.anInt5352 = 0;
							Static131.method2230(arg2.anInt6119, arg2.anInt6121, arg2.aByte89, false, local40, 0);
						}
					}
				}
				local23++;
				local17 >>>= 0x1;
			}
		}
	}
}
