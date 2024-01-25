import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!uu", name = "q", descriptor = "Lclient!km;")
	public static final Class166 aClass166_4 = new Class166();

	@OriginalMember(owner = "client!uu", name = "r", descriptor = "Z")
	public static boolean aBoolean654 = false;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IBI)I")
	public static int method7219(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local12 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return local12 * arg1;
		} else {
			return local12;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIZIIIIBI)Z")
	public static boolean method7220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(13) int local13 = Static111.aClass6_Sub1_Sub2_Sub1_3.anIntArray733[0];
		@Pc(18) int local18 = Static111.aClass6_Sub1_Sub2_Sub1_3.anIntArray734[0];
		if (local13 < 0 || Static118.anInt2527 <= local13 || local18 < 0 || Static549.anInt9482 <= local18) {
			return false;
		} else if (arg0 >= 0 && Static118.anInt2527 > arg0 && arg7 >= 0 && Static549.anInt9482 > arg7) {
			@Pc(85) int local85 = Static165.method3200(arg6, local18, arg1, Static111.aClass6_Sub1_Sub2_Sub1_3.method7083(), Static333.anIntArray549, Static95.aClass306Array1[Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100], Static80.anIntArray199, arg2, arg5, arg3, arg4, local13, arg7, arg0);
			if (local85 < 1) {
				return false;
			}
			Static407.anInt7473 = Static80.anIntArray199[local85 - 1];
			Static303.anInt5982 = Static333.anIntArray549[local85 - 1];
			Static392.aBoolean493 = false;
			Static514.method7353();
			return true;
		} else {
			return false;
		}
	}
}
