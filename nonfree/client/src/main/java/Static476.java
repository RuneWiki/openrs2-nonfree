import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static476 {

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_239 = new Class202("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "(I)Ljava/lang/String;")
	public static String method7102() {
		return Static452.aBoolean600 || Static431.aClass2_Sub44_3 == null ? "" : Static431.aClass2_Sub44_3.aString179;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(ILclient!wca;)V")
	public static void method7103(@OriginalArg(1) Class310 arg0) {
		@Pc(12) Class310 local12 = Static448.method6843(arg0);
		@Pc(16) int local16;
		@Pc(18) int local18;
		if (local12 == null) {
			local16 = Static461.anInt8348;
			local18 = Static223.anInt3996;
		} else {
			local18 = local12.anInt9198;
			local16 = local12.anInt9163;
		}
		Static453.method6919(arg0, false, local18, local16);
		Static367.method5868(local16, local18, arg0);
	}
}
