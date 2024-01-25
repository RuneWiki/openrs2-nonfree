import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!j", name = "e", descriptor = "I")
	public static int anInt4454 = 0;

	@OriginalMember(owner = "client!j", name = "g", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_91 = new Class298(19, 4);

	@OriginalMember(owner = "client!j", name = "l", descriptor = "I")
	public static final int anInt4458 = 0;

	@OriginalMember(owner = "client!j", name = "m", descriptor = "I")
	public static int anInt4459 = 1;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([ILclient!an;[IB[I)V")
	public static void method3971(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class9_Sub1_Sub1_Sub2_Sub1 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg3.length; local7++) {
			@Pc(13) int local13 = arg3[local7];
			@Pc(17) int local17 = arg2[local7];
			@Pc(21) int local21 = arg0[local7];
			@Pc(23) int local23 = 0;
			while (local17 != 0 && arg1.aClass52Array3.length > local23) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg1.aClass52Array3[local23] = null;
					} else {
						@Pc(47) Class17 local47 = Static330.aClass279_2.method6216(local13);
						@Pc(50) int local50 = local47.anInt555;
						@Pc(55) Class52 local55 = arg1.aClass52Array3[local23];
						if (local55 != null) {
							if (local13 == local55.anInt1940) {
								if (local50 == 0) {
									local55 = arg1.aClass52Array3[local23] = null;
								} else if (local50 == 1) {
									local55.anInt1945 = 0;
									local55.anInt1944 = 0;
									local55.anInt1942 = 1;
									local55.anInt1941 = 0;
									local55.anInt1943 = local21;
									Static351.method5300(0, local47, arg1.anInt8980, arg1.anInt8975, arg1.aByte126, false);
								} else if (local50 == 2) {
									local55.anInt1941 = 0;
								}
							} else if (local47.anInt559 >= Static330.aClass279_2.method6216(local55.anInt1940).anInt559) {
								local55 = arg1.aClass52Array3[local23] = null;
							}
						}
						if (local55 == null) {
							local55 = arg1.aClass52Array3[local23] = new Class52();
							local55.anInt1944 = 0;
							local55.anInt1945 = 0;
							local55.anInt1943 = local21;
							local55.anInt1942 = 1;
							local55.anInt1940 = local13;
							local55.anInt1941 = 0;
							Static351.method5300(0, local47, arg1.anInt8980, arg1.anInt8975, arg1.aByte126, false);
						}
					}
				}
				local23++;
				local17 >>>= 0x1;
			}
		}
	}
}
