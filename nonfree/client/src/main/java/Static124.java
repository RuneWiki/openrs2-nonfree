import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
	public static int anInt2344;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI)Z")
	public static boolean method1938(@OriginalArg(0) boolean arg0) {
		@Pc(11) boolean local11 = Static447.aClass121_11.method4613();
		if (local11 == arg0) {
			return true;
		}
		if (!arg0) {
			Static447.aClass121_11.method4619();
		} else if (!Static447.aClass121_11.method4630()) {
			arg0 = false;
		}
		if (local11 == arg0) {
			return false;
		} else {
			Static327.aClass230_Sub1_1.aBoolean612 = arg0;
			Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
			return true;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "([Lclient!tn;BI)V")
	public static void method1942(@OriginalArg(0) Class229[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class229 local13 = arg0[local7];
			if (local13 != null && local13.anInt6882 == arg1 && !Static51.method740(local13)) {
				if (local13.anInt6863 == 0) {
					method1942(arg0, local13.anInt6923);
					if (local13.aClass229Array2 != null) {
						method1942(local13.aClass229Array2, local13.anInt6923);
					}
					@Pc(54) Class1_Sub38 local54 = (Class1_Sub38) Static81.aClass51_5.method930((long) local13.anInt6923);
					if (local54 != null) {
						Static3.method38(local54.anInt6527);
					}
				}
				if (local13.anInt6863 == 6 && local13.anInt6901 != -1) {
					@Pc(74) Class58 local74 = Static322.aClass45_5.method690(local13.anInt6901);
					if (local74 != null) {
						local13.anInt6916 += Static384.anInt6843;
						while (local13.anInt6916 > local74.anIntArray66[local13.anInt6879]) {
							local13.anInt6916 -= local74.anIntArray66[local13.anInt6879];
							local13.anInt6879++;
							if (local13.anInt6879 >= local74.anIntArray65.length) {
								local13.anInt6879 -= local74.anInt1434;
								if (local13.anInt6879 < 0 || local13.anInt6879 >= local74.anIntArray65.length) {
									local13.anInt6879 = 0;
								}
							}
							local13.anInt6898 = local13.anInt6879 + 1;
							if (local74.anIntArray65.length <= local13.anInt6898) {
								local13.anInt6898 -= local74.anInt1434;
								if (local13.anInt6898 < 0 || local13.anInt6898 >= local74.anIntArray65.length) {
									local13.anInt6898 = -1;
								}
							}
							Static373.method5289(local13);
						}
					}
				}
			}
		}
	}
}
