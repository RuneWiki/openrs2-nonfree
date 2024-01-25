import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "Lclient!mg;")
	public static Class160 aClass160_35;

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "Lclient!ld;")
	public static Class151 aClass151_1;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!sk;[II[I[I)V")
	public static void method3003(@OriginalArg(0) Class3_Sub2_Sub1_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg3.length; local3++) {
			@Pc(9) int local9 = arg3[local3];
			@Pc(13) int local13 = arg1[local3];
			@Pc(17) int local17 = arg2[local3];
			for (@Pc(19) int local19 = 0; local13 != 0 && arg0.aClass190Array3.length > local19; local19++) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg0.aClass190Array3[local19] = null;
					} else {
						@Pc(41) Class250 local41 = Static338.aClass12_2.method255(local9);
						@Pc(44) int local44 = local41.anInt7015;
						@Pc(49) Class190 local49 = arg0.aClass190Array3[local19];
						if (local49 != null) {
							if (local49.anInt5355 == local9) {
								if (local44 == 0) {
									local49 = arg0.aClass190Array3[local19] = null;
								} else if (local44 == 1) {
									local49.anInt5357 = 1;
									local49.anInt5354 = 0;
									local49.anInt5351 = 0;
									local49.anInt5352 = 0;
									local49.anInt5350 = local17;
									Static131.method2230(arg0.anInt6119, arg0.anInt6121, arg0.aByte89, arg0 == Static375.aClass3_Sub2_Sub1_Sub2_7, local41, 0);
								} else if (local44 == 2) {
									local49.anInt5354 = 0;
								}
							} else if (local41.anInt7019 >= Static338.aClass12_2.method255(local49.anInt5355).anInt7019) {
								local49 = arg0.aClass190Array3[local19] = null;
							}
						}
						if (local49 == null) {
							local49 = arg0.aClass190Array3[local19] = new Class190();
							local49.anInt5350 = local17;
							local49.anInt5351 = 0;
							local49.anInt5355 = local9;
							local49.anInt5352 = 0;
							local49.anInt5354 = 0;
							local49.anInt5357 = 1;
							Static131.method2230(arg0.anInt6119, arg0.anInt6121, arg0.aByte89, Static375.aClass3_Sub2_Sub1_Sub2_7 == arg0, local41, 0);
						}
					}
				}
				local13 >>>= 0x1;
			}
		}
	}
}
