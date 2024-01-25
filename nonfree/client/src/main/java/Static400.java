import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "Lclient!dq;")
	public static Class56 aClass56_1;

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "[I")
	public static int[] anIntArray550;

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "[I")
	public static int[] anIntArray551;

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
	public static int anInt6546;

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "Lclient!kb;")
	public static final Class133 aClass133_4 = new Class133(0);

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_142 = new Class211(87, 10);

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(DI)V")
	public static void method5072(@OriginalArg(0) double arg0) {
		if (arg0 == Static385.aDouble9) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 256; local16++) {
			@Pc(28) int local28 = (int) (Math.pow((double) local16 / 255.0D, arg0) * 255.0D);
			Static102.anIntArray150[local16] = local28 > 255 ? 255 : local28;
		}
		Static385.aDouble9 = arg0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
	public static void method5074() {
		for (@Pc(10) Class2_Sub8 local10 = (Class2_Sub8) Static225.aClass156_28.method3155(); local10 != null; local10 = (Class2_Sub8) Static225.aClass156_28.method3150()) {
			if (local10.anInt834 > 0) {
				local10.anInt834--;
			}
			if (local10.anInt834 != 0) {
				if (local10.anInt832 > 0) {
					local10.anInt832--;
				}
				if (local10.anInt832 == 0 && local10.anInt827 >= 1 && local10.anInt826 >= 1 && Static166.anInt2852 - 2 >= local10.anInt827 && Static426.anInt6923 - 2 >= local10.anInt826 && (local10.anInt833 < 0 || Static208.method2798(local10.anInt836, local10.anInt833))) {
					Static410.method5194(local10.anInt831, local10.anInt826, local10.anInt837, local10.anInt827, local10.anInt836, local10.anInt833, local10.anInt824, -1);
					local10.anInt832 = -1;
					if (local10.anInt833 == local10.anInt829 && local10.anInt829 == -1) {
						local10.method5703();
					} else if (local10.anInt833 == local10.anInt829 && local10.anInt824 == local10.anInt825 && local10.anInt836 == local10.anInt828) {
						local10.method5703();
					}
				}
			} else if (local10.anInt829 < 0 || Static208.method2798(local10.anInt828, local10.anInt829)) {
				Static410.method5194(local10.anInt831, local10.anInt826, local10.anInt837, local10.anInt827, local10.anInt828, local10.anInt829, local10.anInt825, -1);
				local10.method5703();
			}
		}
	}
}
