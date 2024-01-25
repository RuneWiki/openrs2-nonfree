import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!dv", name = "t", descriptor = "Lclient!ga;")
	public static Interface7 anInterface7_3;

	@OriginalMember(owner = "client!dv", name = "gb", descriptor = "I")
	public static int anInt1616;

	@OriginalMember(owner = "client!dv", name = "xb", descriptor = "Lclient!l;")
	public static Class57 aClass57_9;

	@OriginalMember(owner = "client!dv", name = "T", descriptor = "[I")
	public static final int[] anIntArray127 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!dv", name = "ob", descriptor = "I")
	public static int anInt1620 = -1;

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "(I)V")
	public static void method1433() {
		for (@Pc(16) Class4_Sub9 local16 = (Class4_Sub9) Static115.aClass183_15.method4140(); local16 != null; local16 = (Class4_Sub9) Static115.aClass183_15.method4144()) {
			if (local16.anInt796 > 0) {
				local16.anInt796--;
			}
			if (local16.anInt796 != 0) {
				if (local16.anInt799 > 0) {
					local16.anInt799--;
				}
				if (local16.anInt799 == 0 && local16.anInt793 >= 1 && local16.anInt790 >= 1 && Static326.anInt5666 - 2 >= local16.anInt793 && local16.anInt790 <= Static283.anInt5187 - 2 && (local16.anInt794 < 0 || Static126.method2260(local16.anInt794, local16.anInt801))) {
					Static27.method524(local16.anInt800, local16.anInt793, local16.anInt801, -1, local16.anInt804, local16.anInt794, local16.anInt790, local16.anInt792);
					local16.anInt799 = -1;
					if (local16.anInt797 == local16.anInt794 && local16.anInt797 == -1) {
						local16.method5684();
					} else if (local16.anInt797 == local16.anInt794 && local16.anInt804 == local16.anInt803 && local16.anInt801 == local16.anInt802) {
						local16.method5684();
					}
				}
			} else if (local16.anInt797 < 0 || Static126.method2260(local16.anInt797, local16.anInt802)) {
				Static27.method524(local16.anInt800, local16.anInt793, local16.anInt802, -1, local16.anInt803, local16.anInt797, local16.anInt790, local16.anInt792);
				local16.method5684();
			}
		}
	}
}
