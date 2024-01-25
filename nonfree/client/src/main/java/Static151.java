import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!fm", name = "z", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!fm", name = "C", descriptor = "[Lclient!wca;")
	public static Class41_Sub9[] aClass41_Sub9Array1;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(III)Z")
	public static boolean method2862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(18) Class280 local18 = Static478.aClass212_3.method4793(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local18.method6165(arg0);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)Lclient!wl;")
	public static Class3_Sub51 method2865() {
		if (Static44.aClass112_72 == null || Static390.aClass202_1 == null) {
			return null;
		}
		Static390.aClass202_1.method4668(Static44.aClass112_72);
		@Pc(24) Class3_Sub51 local24 = (Class3_Sub51) Static390.aClass202_1.method4672();
		if (local24 == null) {
			return null;
		} else {
			@Pc(36) Class174 local36 = Static44.aClass102_4.method2925(local24.anInt9426);
			return local36 != null && local36.aBoolean352 && local36.method4116(Static44.anInterface9_2) ? local24 : Static88.method1707();
		}
	}
}
