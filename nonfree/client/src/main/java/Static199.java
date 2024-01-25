import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
	public static int anInt3421;

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "Lclient!mn;")
	public static Class171 aClass171_46;

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
	public static int anInt3422 = -1;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V")
	public static void method2807() {
		for (@Pc(10) Class2_Sub42 local10 = (Class2_Sub42) Static465.aClass181_49.method3972(); local10 != null; local10 = (Class2_Sub42) Static465.aClass181_49.method3975()) {
			if (local10.anInt7067 > 0) {
				local10.anInt7067--;
			}
			if (local10.anInt7067 != 0) {
				if (local10.anInt7069 > 0) {
					local10.anInt7069--;
				}
				if (local10.anInt7069 == 0 && local10.anInt7064 >= 1 && local10.anInt7066 >= 1 && local10.anInt7064 <= Static234.anInt3949 - 2 && Static371.anInt6492 - 2 >= local10.anInt7066 && (local10.anInt7059 < 0 || Static245.method3413(local10.anInt7058, local10.anInt7059))) {
					Static11.method178(local10.anInt7059, local10.anInt7065, local10.anInt7064, local10.anInt7060, local10.anInt7058, -1, local10.anInt7066, local10.anInt7068);
					local10.anInt7069 = -1;
					if (local10.anInt7062 == local10.anInt7059 && local10.anInt7062 == -1) {
						local10.method6260();
					} else if (local10.anInt7062 == local10.anInt7059 && local10.anInt7063 == local10.anInt7068 && local10.anInt7057 == local10.anInt7058) {
						local10.method6260();
					}
				}
			} else if (local10.anInt7062 < 0 || Static245.method3413(local10.anInt7057, local10.anInt7062)) {
				Static11.method178(local10.anInt7062, local10.anInt7065, local10.anInt7064, local10.anInt7060, local10.anInt7057, -1, local10.anInt7066, local10.anInt7063);
				local10.method6260();
			}
		}
	}
}
