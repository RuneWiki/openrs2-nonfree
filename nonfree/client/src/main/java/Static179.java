import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "D")
	public static double aDouble7;

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "[I")
	public static final int[] anIntArray152 = new int[1];

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I[Lclient!uaa;I)V")
	public static void method2887(@OriginalArg(1) Class345[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(18) Class345 local18 = arg0[local7];
			if (local18 != null && local18.anInt9657 == arg1 && !Static84.method1816(local18)) {
				if (local18.anInt9591 == 0) {
					method2887(arg0, local18.anInt9664);
					if (local18.aClass345Array1 != null) {
						method2887(local18.aClass345Array1, local18.anInt9664);
					}
					@Pc(55) Class5_Sub39 local55 = (Class5_Sub39) Static452.aClass300_33.method7188((long) local18.anInt9664);
					if (local55 != null) {
						Static368.method5563(local55.anInt6238);
					}
				}
				if (local18.anInt9591 == 6 && local18.anInt9601 != -1) {
					@Pc(77) Class175 local77 = Static591.aClass66_2.method1768(local18.anInt9601);
					if (local77 != null) {
						local18.anInt9658 += Static290.anInt5659;
						@Pc(88) int local88 = local18.anInt9646;
						while (local18.anInt9658 > local77.anIntArray291[local18.anInt9646]) {
							local18.anInt9658 -= local77.anIntArray291[local18.anInt9646];
							local18.anInt9646++;
							if (local77.anIntArray288.length <= local18.anInt9646) {
								local18.anInt9646 -= local77.anInt5029;
								if (local18.anInt9646 < 0 || local18.anInt9646 >= local77.anIntArray288.length) {
									local18.anInt9646 = 0;
								}
							}
							local18.anInt9604 = local18.anInt9646 + 1;
							if (local18.anInt9604 >= local77.anIntArray288.length) {
								local18.anInt9604 -= local77.anInt5029;
								if (local18.anInt9604 < 0 || local77.anIntArray288.length <= local18.anInt9604) {
									local18.anInt9604 = -1;
								}
							}
							Static211.method3351(local18);
						}
						if (local18.anInt9646 != local88) {
							Static530.method7444(local18.anInt9646, local77);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method2889(@OriginalArg(0) Class65 arg0) {
		if (Static290.anInt5662 != Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145 && (Static635.aClass226ArrayArrayArray3 != null && Static226.method8110(arg0, Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145))) {
			Static290.anInt5662 = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145;
		}
	}
}
