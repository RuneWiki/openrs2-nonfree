import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!al", name = "t", descriptor = "I")
	public static int anInt190 = 0;

	@OriginalMember(owner = "client!al", name = "f", descriptor = "(I)Z")
	public static boolean method159() {
		return Static2.anInt9 == 0 ? Static47.aClass6_Sub5_Sub3_7.method3656() : true;
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(Z)V")
	public static void method160() {
		if (!Static274.aBoolean336) {
			return;
		}
		@Pc(11) Class239 local11 = Static316.method5795(Static321.anInt5236, Static391.anInt2016);
		if (local11 != null && local11.anObjectArray16 != null) {
			@Pc(20) Class6_Sub29 local20 = new Class6_Sub29();
			local20.aClass239_10 = local11;
			local20.anObjectArray4 = local11.anObjectArray16;
			Static308.method4424(local20);
		}
		Static54.anInt1132 = -1;
		Static274.aBoolean336 = false;
		Static365.anInt3369 = -1;
		if (local11 != null) {
			Static354.method4992(local11);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(B)Z")
	public static boolean method162() {
		if (Static89.aBoolean121) {
			try {
				if ((Boolean) Static453.method333(Static165.aClass103_3.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(23) Throwable local23) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!qh;B)V")
	public static void method163(@OriginalArg(0) Class3_Sub3_Sub6_Sub1 arg0) {
		@Pc(17) Class6_Sub14 local17 = (Class6_Sub14) Static417.aClass137_35.method3175((long) arg0.anInt6731);
		if (local17 == null) {
			Static57.method1074(arg0, arg0.anIntArray582[0], null, 0, arg0.aByte93, arg0.anIntArray583[0], null);
		} else {
			local17.method2180();
		}
	}
}
