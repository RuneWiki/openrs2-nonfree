import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
	public static int anInt3901;

	@OriginalMember(owner = "client!ve", name = "Q", descriptor = "I")
	public static int anInt3912;

	@OriginalMember(owner = "client!ve", name = "v", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1325 = Static200.method3116("Schlie-8en");

	@OriginalMember(owner = "client!ve", name = "F", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1326 = Static200.method3116("Loaded interfaces");

	@OriginalMember(owner = "client!ve", name = "T", descriptor = "I")
	public static int anInt3915 = 1;

	@OriginalMember(owner = "client!ve", name = "ub", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1327 = aClass60_1326;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)V")
	public static void method2905() {
		for (@Pc(15) Class1_Sub21 local15 = (Class1_Sub21) Static129.aClass19_7.method609(); local15 != null; local15 = (Class1_Sub21) Static129.aClass19_7.method615()) {
			if (local15.anInt3151 > 0) {
				local15.anInt3151--;
			}
			if (local15.anInt3151 != 0) {
				if (local15.anInt3162 > 0) {
					local15.anInt3162--;
				}
				if (local15.anInt3162 == 0 && local15.anInt3155 >= 1 && local15.anInt3148 >= 1 && local15.anInt3155 <= 102 && local15.anInt3148 <= 102 && (local15.anInt3164 < 0 || Static170.method2783(local15.anInt3164, local15.anInt3159))) {
					Static167.method2734(local15.anInt3160, local15.anInt3166, local15.anInt3159, local15.anInt3155, local15.anInt3164, local15.anInt3156, local15.anInt3148);
					local15.anInt3162 = -1;
					if (local15.anInt3157 == local15.anInt3164 && local15.anInt3157 == -1) {
						local15.method3530();
					} else if (local15.anInt3157 == local15.anInt3164 && local15.anInt3166 == local15.anInt3153 && local15.anInt3159 == local15.anInt3147) {
						local15.method3530();
					}
				}
			} else if (local15.anInt3157 < 0 || Static170.method2783(local15.anInt3157, local15.anInt3147)) {
				Static167.method2734(local15.anInt3160, local15.anInt3153, local15.anInt3147, local15.anInt3155, local15.anInt3157, local15.anInt3156, local15.anInt3148);
				local15.method3530();
			}
		}
	}
}
