import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "Lclient!bd;")
	public static final Class27 aClass27_5 = new Class27();

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!ag;[I[II[I)V")
	public static void method7160(@OriginalArg(0) Class11_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg3.length; local7++) {
			@Pc(13) int local13 = arg3[local7];
			@Pc(17) int local17 = arg1[local7];
			@Pc(21) int local21 = arg2[local7];
			for (@Pc(23) int local23 = 0; local17 != 0 && arg0.aClass324Array3.length > local23; local23++) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg0.aClass324Array3[local23] = null;
					} else {
						@Pc(44) Class16 local44 = Static114.aClass156_2.method4101(local13);
						@Pc(47) int local47 = local44.anInt581;
						@Pc(52) Class324 local52 = arg0.aClass324Array3[local23];
						if (local52 != null) {
							if (local13 == local52.anInt9238) {
								if (local47 == 0) {
									local52 = arg0.aClass324Array3[local23] = null;
								} else if (local47 == 1) {
									local52.anInt9242 = 0;
									local52.anInt9237 = 0;
									local52.anInt9241 = local21;
									local52.anInt9240 = 0;
									local52.anInt9239 = 1;
									Static360.method5794(arg0.anInt7347, local44, arg0.anInt7351, arg0.aByte77, 0, false);
								} else if (local47 == 2) {
									local52.anInt9240 = 0;
								}
							} else if (local44.anInt582 >= Static114.aClass156_2.method4101(local52.anInt9238).anInt582) {
								local52 = arg0.aClass324Array3[local23] = null;
							}
						}
						if (local52 == null) {
							local52 = arg0.aClass324Array3[local23] = new Class324();
							local52.anInt9238 = local13;
							local52.anInt9237 = 0;
							local52.anInt9239 = 1;
							local52.anInt9240 = 0;
							local52.anInt9241 = local21;
							local52.anInt9242 = 0;
							Static360.method5794(arg0.anInt7347, local44, arg0.anInt7351, arg0.aByte77, 0, false);
						}
					}
				}
				local17 >>>= 0x1;
			}
		}
	}
}
