import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!le", name = "l", descriptor = "Lclient!bg;")
	public static Class34_Sub1 aClass34_Sub1_1;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IZII)I")
	public static int method5111(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I[Lclient!wq;I)V")
	public static void method5113(@OriginalArg(1) Class394[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(17) Class394 local17 = arg0[local11];
			if (local17 != null && local17.anInt10530 == arg1 && !Static81.method1279(local17)) {
				if (local17.anInt10479 == 0) {
					method5113(arg0, local17.anInt10490);
					if (local17.aClass394Array2 != null) {
						method5113(local17.aClass394Array2, local17.anInt10490);
					}
					@Pc(51) Class5_Sub4 local51 = (Class5_Sub4) Static131.aClass335_15.method7766((long) local17.anInt10490);
					if (local51 != null) {
						Static57.method856(local51.anInt257);
					}
				}
				if (local17.anInt10479 == 6 && local17.anInt10499 != -1) {
					@Pc(71) Class65 local71 = Static459.aClass128_2.method2686(local17.anInt10499);
					if (local71 != null) {
						local17.anInt10534 += Static648.anInt10220;
						@Pc(82) int local82 = local17.anInt10447;
						while (local17.anInt10534 > local71.anIntArray71[local17.anInt10447]) {
							local17.anInt10534 -= local71.anIntArray71[local17.anInt10447];
							local17.anInt10447++;
							if (local71.anIntArray75.length <= local17.anInt10447) {
								local17.anInt10447 -= local71.anInt1432;
								if (local17.anInt10447 < 0 || local17.anInt10447 >= local71.anIntArray75.length) {
									local17.anInt10447 = 0;
								}
							}
							local17.anInt10535 = local17.anInt10447 + 1;
							if (local17.anInt10535 >= local71.anIntArray75.length) {
								local17.anInt10535 -= local71.anInt1432;
								if (local17.anInt10535 < 0 || local71.anIntArray75.length <= local17.anInt10535) {
									local17.anInt10535 = -1;
								}
							}
							Static609.method8190(local17);
						}
						if (local82 != local17.anInt10447) {
							Static375.method5527(local71, local17.anInt10447);
						}
					}
				}
			}
		}
	}
}
