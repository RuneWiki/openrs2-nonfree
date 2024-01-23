import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
	public static int anInt2744 = 0;

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "[I")
	public static int[] anIntArray239 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "[I")
	public static int[] anIntArray240 = new int[5];

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZ)Lclient!lk;")
	public static Class1_Sub5_Sub13 method2470(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub5_Sub13 local10 = (Class1_Sub5_Sub13) Static16.aClass112_1.method2951((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static21.aClass119_6.method3235(0, arg0);
		if (local22 == null || local22.length <= 1) {
			return null;
		} else {
			local10 = Static166.method2826(local22);
			Static16.aClass112_1.method2950((long) arg0, local10);
			return local10;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!kl;I[I[I[I)V")
	public static void method2474(@OriginalArg(0) Class11_Sub4_Sub1 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(19) int local19 = arg3[local7];
			@Pc(23) int local23 = arg1[local7];
			@Pc(27) int local27 = arg2[local7];
			for (@Pc(29) int local29 = 0; local19 != 0 && arg0.aClass14Array3.length > local29; local29++) {
				if ((local19 & 0x1) != 0) {
					if (local27 == -1) {
						arg0.aClass14Array3[local29] = null;
					} else {
						@Pc(60) Class152 local60 = Static107.method2016(local27);
						@Pc(65) Class14 local65 = arg0.aClass14Array3[local29];
						@Pc(68) int local68 = local60.anInt4603;
						if (local65 != null) {
							if (local27 == local65.anInt496) {
								if (local68 == 0) {
									local65 = arg0.aClass14Array3[local29] = null;
								} else if (local68 == 1) {
									local65.anInt501 = 0;
									local65.anInt498 = 1;
									local65.anInt489 = local23;
									local65.anInt494 = 0;
									local65.anInt497 = 0;
									Static291.method4385(local60, arg0 == Static138.aClass11_Sub4_Sub1_3, arg0.anInt3856, arg0.anInt3865, 0);
								} else if (local68 == 2) {
									local65.anInt501 = 0;
								}
							} else if (local60.anInt4608 >= Static107.method2016(local65.anInt496).anInt4608) {
								local65 = arg0.aClass14Array3[local29] = null;
							}
						}
						if (local65 == null) {
							local65 = arg0.aClass14Array3[local29] = new Class14();
							local65.anInt494 = 0;
							local65.anInt501 = 0;
							local65.anInt498 = 1;
							local65.anInt497 = 0;
							local65.anInt496 = local27;
							local65.anInt489 = local23;
							Static291.method4385(local60, arg0 == Static138.aClass11_Sub4_Sub1_3, arg0.anInt3856, arg0.anInt3865, 0);
						}
					}
				}
				local19 >>>= 0x1;
			}
		}
	}
}
