import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!qo", name = "G", descriptor = "Lclient!tq;")
	public static Class285 aClass285_11;

	@OriginalMember(owner = "client!qo", name = "M", descriptor = "Lclient!dw;")
	public static Class66 aClass66_3;

	@OriginalMember(owner = "client!qo", name = "J", descriptor = "I")
	public static int anInt7421 = 0;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BZ)V")
	public static void method6116() {
		Static278.method4791(Static110.aClass158_27);
		for (@Pc(25) Class3_Sub29 local25 = (Class3_Sub29) Static156.aClass267_14.method6643(); local25 != null; local25 = (Class3_Sub29) Static156.aClass267_14.method6650()) {
			if (!local25.method7821()) {
				local25 = (Class3_Sub29) Static156.aClass267_14.method6643();
				if (local25 == null) {
					break;
				}
			}
			if (local25.anInt5521 == 0) {
				Static361.method5656(true, true, local25);
			}
		}
		if (Static140.aClass245_4 != null) {
			Static31.method809(Static140.aClass245_4);
			Static140.aClass245_4 = null;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(II)V")
	public static void method6118(@OriginalArg(1) int arg0) {
		Static289.anInt5876 = arg0;
		Static383.aClass125_39.method3521();
	}
}
