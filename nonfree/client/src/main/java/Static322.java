import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "Lclient!dea;")
	public static final Class68 aClass68_81 = new Class68(8);

	@OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
	public static int anInt9407 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZILclient!mc;Z)V")
	public static void method7800(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class198 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) int local8 = arg2.anInt5762;
		if (arg2.aByte71 == 0) {
			arg2.anInt5762 = arg2.anInt5755;
		} else if (arg2.aByte71 == 1) {
			arg2.anInt5762 = arg1 - arg2.anInt5755;
		} else if (arg2.aByte71 == 2) {
			arg2.anInt5762 = arg1 * arg2.anInt5755 >> 14;
		}
		@Pc(49) int local49 = arg2.anInt5715;
		if (arg2.aByte73 == 0) {
			arg2.anInt5715 = arg2.anInt5736;
		} else if (arg2.aByte73 == 1) {
			arg2.anInt5715 = arg0 - arg2.anInt5736;
		} else if (arg2.aByte73 == 2) {
			arg2.anInt5715 = arg2.anInt5736 * arg0 >> 14;
		}
		if (arg2.aByte71 == 4) {
			arg2.anInt5762 = arg2.anInt5715 * arg2.anInt5770 / arg2.anInt5786;
		}
		if (arg2.aByte73 == 4) {
			arg2.anInt5715 = arg2.anInt5762 * arg2.anInt5786 / arg2.anInt5770;
		}
		if (Static470.aBoolean610 && (Static67.method1529(arg2).anInt6901 != 0 || arg2.anInt5776 == 0)) {
			if (arg2.anInt5715 < 5 && arg2.anInt5762 < 5) {
				arg2.anInt5762 = 5;
				arg2.anInt5715 = 5;
			} else {
				if (arg2.anInt5715 <= 0) {
					arg2.anInt5715 = 5;
				}
				if (arg2.anInt5762 <= 0) {
					arg2.anInt5762 = 5;
				}
			}
		}
		if (arg2.anInt5788 == Static517.anInt9282) {
			Static522.aClass198_16 = arg2;
		}
		if (arg3 && arg2.anObjectArray19 != null && (local8 != arg2.anInt5762 || local49 != arg2.anInt5715)) {
			@Pc(197) Class12_Sub6 local197 = new Class12_Sub6();
			local197.anObjectArray2 = arg2.anObjectArray19;
			local197.aClass198_2 = arg2;
			Static341.aClass73_54.method2012(local197);
		}
	}
}
