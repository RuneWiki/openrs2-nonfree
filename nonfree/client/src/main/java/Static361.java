import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "Lclient!fe;")
	public static Class106 aClass106_1;

	@OriginalMember(owner = "client!mt", name = "M", descriptor = "Lclient!ha;")
	public static Class95 aClass95_9;

	@OriginalMember(owner = "client!mt", name = "I", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_3 = new Class45(0);

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V")
	public static void method4864() {
		for (@Pc(15) Class2_Sub52 local15 = (Class2_Sub52) Static212.aClass109_28.method2325(); local15 != null; local15 = (Class2_Sub52) Static212.aClass109_28.method2318()) {
			if (local15.anInt9842 > 0) {
				local15.anInt9842--;
			}
			if (local15.anInt9842 != 0) {
				if (local15.anInt9839 > 0) {
					local15.anInt9839--;
				}
				if (local15.anInt9839 == 0 && local15.anInt9843 >= 1 && local15.anInt9838 >= 1 && Static228.anInt3704 - 2 >= local15.anInt9843 && Static162.anInt2911 - 2 >= local15.anInt9838 && (local15.anInt9834 < 0 || Static233.method3202(local15.anInt9846, local15.anInt9834))) {
					Static125.method1792(local15.anInt9832, local15.anInt9836, local15.anInt9837, local15.anInt9834, local15.anInt9843, -1, local15.anInt9838, local15.anInt9846);
					local15.anInt9839 = -1;
					if (local15.anInt9841 == local15.anInt9834 && local15.anInt9841 == -1) {
						local15.method8653();
					} else if (local15.anInt9841 == local15.anInt9834 && local15.anInt9835 == local15.anInt9832 && local15.anInt9846 == local15.anInt9844) {
						local15.method8653();
					}
				}
			} else if (local15.anInt9841 < 0 || Static233.method3202(local15.anInt9844, local15.anInt9841)) {
				Static125.method1792(local15.anInt9835, local15.anInt9836, local15.anInt9837, local15.anInt9841, local15.anInt9843, -1, local15.anInt9838, local15.anInt9844);
				local15.method8653();
			}
		}
	}
}
