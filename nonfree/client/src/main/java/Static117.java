import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!et", name = "A", descriptor = "[I")
	public static final int[] anIntArray182 = new int[32];

	@OriginalMember(owner = "client!et", name = "kd", descriptor = "[I")
	public static final int[] anIntArray191 = new int[5];

	@OriginalMember(owner = "client!et", name = "ld", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_44 = new Class45("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!av;I[I[I[I)V")
	public static void method2273(@OriginalArg(0) Class20_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) int local13 = arg1[local7];
			@Pc(17) int local17 = arg3[local7];
			@Pc(21) int local21 = arg2[local7];
			@Pc(23) int local23 = 0;
			while (local17 != 0 && local23 < arg0.aClass286Array3.length) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg0.aClass286Array3[local23] = null;
					} else {
						@Pc(37) Class176 local37 = Static35.aClass152_1.method4045(local13);
						@Pc(40) int local40 = local37.anInt5271;
						@Pc(45) Class286 local45 = arg0.aClass286Array3[local23];
						if (local45 != null) {
							if (local13 == local45.anInt8551) {
								if (local40 == 0) {
									local45 = arg0.aClass286Array3[local23] = null;
								} else if (local40 == 1) {
									local45.anInt8553 = 0;
									local45.anInt8556 = 1;
									local45.anInt8555 = 0;
									local45.anInt8552 = local21;
									local45.anInt8554 = 0;
									Static425.method6639(arg0.aByte108, local37, arg0.anInt8949, 0, arg0 == Static107.aClass20_Sub1_Sub1_Sub1_1, arg0.anInt8954);
								} else if (local40 == 2) {
									local45.anInt8553 = 0;
								}
							} else if (local37.anInt5277 >= Static35.aClass152_1.method4045(local45.anInt8551).anInt5277) {
								local45 = arg0.aClass286Array3[local23] = null;
							}
						}
						if (local45 == null) {
							local45 = arg0.aClass286Array3[local23] = new Class286();
							local45.anInt8551 = local13;
							local45.anInt8552 = local21;
							local45.anInt8553 = 0;
							local45.anInt8554 = 0;
							local45.anInt8555 = 0;
							local45.anInt8556 = 1;
							Static425.method6639(arg0.aByte108, local37, arg0.anInt8949, 0, arg0 == Static107.aClass20_Sub1_Sub1_Sub1_1, arg0.anInt8954);
						}
					}
				}
				local23++;
				local17 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I[IILclient!mh;[IB)Lclient!bh;")
	public static Class28_Sub1 method2280(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub3 arg3, @OriginalArg(4) int[] arg4) {
		@Pc(18) byte[] local18 = new byte[arg0 * arg2];
		for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
			@Pc(30) int local30 = arg1[local20] + local20 * arg0;
			for (@Pc(32) int local32 = 0; local32 < arg4[local20]; local32++) {
				local18[local30++] = -1;
			}
		}
		return new Class28_Sub1(arg3, arg0, arg2, local18);
	}
}
