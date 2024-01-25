import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!jd", name = "L", descriptor = "Lclient!hs;")
	public static Class112 aClass112_1;

	@OriginalMember(owner = "client!jd", name = "H", descriptor = "Lclient!s;")
	public static final Class217 aClass217_84 = new Class217(70, 6);

	@OriginalMember(owner = "client!jd", name = "I", descriptor = "I")
	public static int anInt3826 = -1;

	@OriginalMember(owner = "client!jd", name = "J", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_64 = new Class27(22, 2);

	@OriginalMember(owner = "client!jd", name = "K", descriptor = "Lclient!lf;")
	public static final Class153 aClass153_3 = new Class153(2);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "([ILclient!sf;[I[II)V")
	public static void method3037(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class24_Sub3_Sub2_Sub2 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(13) int local13 = arg2[local7];
			@Pc(17) int local17 = arg0[local7];
			@Pc(21) int local21 = arg3[local7];
			for (@Pc(23) int local23 = 0; local17 != 0 && arg1.aClass91Array3.length > local23; local23++) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg1.aClass91Array3[local23] = null;
					} else {
						@Pc(47) Class137 local47 = Static281.aClass98_3.method2405(local13);
						@Pc(50) int local50 = local47.anInt4039;
						@Pc(55) Class91 local55 = arg1.aClass91Array3[local23];
						if (local55 != null) {
							if (local13 == local55.anInt2758) {
								if (local50 == 0) {
									local55 = arg1.aClass91Array3[local23] = null;
								} else if (local50 == 1) {
									local55.anInt2763 = 0;
									local55.anInt2762 = 0;
									local55.anInt2759 = local21;
									local55.anInt2761 = 0;
									local55.anInt2755 = 1;
									Static302.method4200(local47, arg1.anInt7092, arg1.anInt7094, arg1.aByte98, 0, arg1 == Static263.aClass24_Sub3_Sub2_Sub2_4);
								} else if (local50 == 2) {
									local55.anInt2763 = 0;
								}
							} else if (local47.anInt4040 >= Static281.aClass98_3.method2405(local55.anInt2758).anInt4040) {
								local55 = arg1.aClass91Array3[local23] = null;
							}
						}
						if (local55 == null) {
							local55 = arg1.aClass91Array3[local23] = new Class91();
							local55.anInt2762 = 0;
							local55.anInt2761 = 0;
							local55.anInt2759 = local21;
							local55.anInt2758 = local13;
							local55.anInt2755 = 1;
							local55.anInt2763 = 0;
							Static302.method4200(local47, arg1.anInt7092, arg1.anInt7094, arg1.aByte98, 0, arg1 == Static263.aClass24_Sub3_Sub2_Sub2_4);
						}
					}
				}
				local17 >>>= 0x1;
			}
		}
	}
}
