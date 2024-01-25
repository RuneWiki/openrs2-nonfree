import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static537 {

	@OriginalMember(owner = "client!wl", name = "q", descriptor = "Lclient!im;")
	public static final Class140 aClass140_149 = new Class140(31, 8);

	@OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
	public static int anInt9065 = -1;

	@OriginalMember(owner = "client!wl", name = "t", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_384 = new Class296(32, 6);

	@OriginalMember(owner = "client!wl", name = "u", descriptor = "Lclient!im;")
	public static final Class140 aClass140_150 = new Class140(106, 2);

	@OriginalMember(owner = "client!wl", name = "v", descriptor = "[I")
	public static final int[] anIntArray837 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZZII)I")
	public static int method7442(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class1_Sub18 local10 = Static7.method282(arg0, arg2);
		if (local10 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(21) int local21 = 0;
			for (@Pc(28) int local28 = 0; local28 < local10.anIntArray255.length; local28++) {
				if (local10.anIntArray254[local28] == arg1) {
					local21 += local10.anIntArray255[local28];
				}
			}
			return local21;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IB)Lclient!bn;")
	public static Class31 method7444(@OriginalArg(0) int arg0) {
		@Pc(16) Class31[] local16 = Static212.method3597();
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			if (local16[local18].anInt905 == arg0) {
				return local16[local18];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)V")
	public static void method7446() {
		for (@Pc(14) Class1_Sub36 local14 = (Class1_Sub36) Static191.aClass37_41.method977(); local14 != null; local14 = (Class1_Sub36) Static191.aClass37_41.method971()) {
			if (local14.anInt6238 > 0) {
				local14.anInt6238--;
			}
			if (local14.anInt6238 != 0) {
				if (local14.anInt6236 > 0) {
					local14.anInt6236--;
				}
				if (local14.anInt6236 == 0 && local14.anInt6239 >= 1 && local14.anInt6235 >= 1 && local14.anInt6239 <= Static459.anInt7799 - 2 && local14.anInt6235 <= Static482.anInt7990 - 2 && (local14.anInt6234 < 0 || Static243.method4182(local14.anInt6242, local14.anInt6234))) {
					Static443.method6359(-1, local14.anInt6247, local14.anInt6242, local14.anInt6234, local14.anInt6246, local14.anInt6239, local14.anInt6243, local14.anInt6235);
					local14.anInt6236 = -1;
					if (local14.anInt6240 == local14.anInt6234 && local14.anInt6240 == -1) {
						local14.method7525();
					} else if (local14.anInt6234 == local14.anInt6240 && local14.anInt6247 == local14.anInt6244 && local14.anInt6237 == local14.anInt6242) {
						local14.method7525();
					}
				}
			} else if (local14.anInt6240 < 0 || Static243.method4182(local14.anInt6237, local14.anInt6240)) {
				Static443.method6359(-1, local14.anInt6244, local14.anInt6237, local14.anInt6240, local14.anInt6246, local14.anInt6239, local14.anInt6243, local14.anInt6235);
				local14.method7525();
			}
		}
	}

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "(I)V")
	public static void method7447() {
		Static466.anImage3 = null;
		Static468.aFont1 = null;
	}
}
