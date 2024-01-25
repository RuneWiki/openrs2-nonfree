import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_83 = new Class56(7, 3);

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "Z")
	public static boolean aBoolean300 = false;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BIII)V")
	public static void method3542(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(7) int local7 = arg0 << 3;
		@Pc(15) int local15 = arg1 << 3;
		Static43.aFloat20 = local15;
		Static126.aFloat84 = local7;
		if (Static379.anInt6482 == 2) {
			Static208.anInt3801 = 0;
			Static494.anInt8029 = local7;
			Static333.anInt5565 = local15;
		}
		Static336.method4787();
		Static115.aBoolean505 = true;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZI)Z")
	public static boolean method3543(@OriginalArg(0) boolean arg0) {
		@Pc(11) boolean local11 = Static505.aClass45_11.method7363();
		if (arg0 == local11) {
			return true;
		}
		if (!arg0) {
			Static505.aClass45_11.method7420();
		} else if (!Static505.aClass45_11.method7365()) {
			arg0 = false;
		}
		if (arg0 == local11) {
			return false;
		} else {
			Static405.aClass3_Sub3_Sub1_1.aBoolean580 = arg0;
			Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
			return true;
		}
	}
}
