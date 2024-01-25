import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!kp", name = "m", descriptor = "I")
	public static int anInt5041;

	@OriginalMember(owner = "client!kp", name = "p", descriptor = "I")
	public static int anInt5044;

	@OriginalMember(owner = "client!kp", name = "r", descriptor = "I")
	public static int anInt5046;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "Lclient!hw;")
	public static final Class148 aClass148_4 = new Class148();

	@OriginalMember(owner = "client!kp", name = "o", descriptor = "I")
	public static int anInt5043 = 0;

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)V")
	public static void method4017() {
		if (Static165.anInt3165 == -1) {
			return;
		}
		@Pc(11) int local11 = Static216.aClass238_1.method5661();
		@Pc(15) int local15 = Static216.aClass238_1.method5653();
		@Pc(20) Class1_Sub12 local20 = (Class1_Sub12) Static121.aClass111_9.method2547();
		if (local20 != null) {
			local11 = local20.method6682();
			local15 = local20.method6689();
		}
		Static535.method5756(0, Static165.anInt3165, 0, 0, 0, Static349.anInt6422, local15, local11, Static594.anInt9806);
		if (Static345.aClass160_44 != null) {
			Static196.method3084(local11, local15);
		}
	}
}
