import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "F")
	public static float aFloat103;

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
	public static int anInt6411;

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
	public static int anInt6410 = -1;

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "[Lclient!bb;")
	public static final Class17[] aClass17Array2 = new Class17[14];

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "Z")
	public static boolean aBoolean474 = false;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
	public static void method5678() {
		for (@Pc(10) Class5_Sub29 local10 = (Class5_Sub29) Static208.aClass211_18.method5608(); local10 != null; local10 = (Class5_Sub29) Static208.aClass211_18.method5603()) {
			if (local10.anInt3811 > 0) {
				local10.anInt3811--;
			}
			if (local10.anInt3811 != 0) {
				if (local10.anInt3809 > 0) {
					local10.anInt3809--;
				}
				if (local10.anInt3809 == 0 && local10.anInt3819 >= 1 && local10.anInt3810 >= 1 && local10.anInt3819 <= Static266.anInt5101 - 2 && local10.anInt3810 <= Static339.anInt6352 - 2 && (local10.anInt3818 < 0 || Static144.method2699(local10.anInt3818, local10.anInt3824))) {
					Static262.method4496(local10.anInt3813, -1, local10.anInt3815, local10.anInt3819, local10.anInt3817, local10.anInt3810, local10.anInt3824, local10.anInt3818);
					local10.anInt3809 = -1;
					if (local10.anInt3818 == local10.anInt3820 && local10.anInt3820 == -1) {
						local10.method5803();
					} else if (local10.anInt3818 == local10.anInt3820 && local10.anInt3812 == local10.anInt3817 && local10.anInt3824 == local10.anInt3821) {
						local10.method5803();
					}
				}
			} else if (local10.anInt3820 < 0 || Static144.method2699(local10.anInt3820, local10.anInt3821)) {
				Static262.method4496(local10.anInt3813, -1, local10.anInt3815, local10.anInt3819, local10.anInt3812, local10.anInt3810, local10.anInt3821, local10.anInt3820);
				local10.method5803();
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)Lclient!gk;")
	public static Class5_Sub18 method5680() {
		if (Static186.aClass211_36 == null || Static102.aClass191_1 == null) {
			return null;
		}
		Static102.aClass191_1.method5234(Static186.aClass211_36);
		@Pc(18) Class5_Sub18 local18 = (Class5_Sub18) Static102.aClass191_1.method5238();
		if (local18 == null) {
			return null;
		} else {
			@Pc(35) Class121 local35 = Static299.method5085(local18.anInt2293);
			return local35 != null && local35.aBoolean256 && local35.method3309() ? local18 : Static354.method5828();
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "()V")
	public static void method5681() {
		Static280.method4739(Static248.anInt4820);
	}
}
