import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!gr", name = "v", descriptor = "I")
	public static int anInt3177;

	@OriginalMember(owner = "client!gr", name = "t", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_96 = new Class175("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "(I)V")
	public static void method2535() {
		if (!Static167.method5102()) {
			return;
		}
		if (Static230.aStringArray101 == null) {
			Static101.method1744();
		}
		Static226.aBoolean334 = true;
		Static78.anInt1703 = 0;
		try {
			Static258.aClipboard4 = Static107.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(20) Exception local20) {
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!bt;I)Lclient!pf;")
	public static Class82_Sub2 method2536(@OriginalArg(0) Class3_Sub2 arg0) {
		return new Class82_Sub2(arg0.method6039(), arg0.method6039(), arg0.method6039(), arg0.method6039(), arg0.method6020(), arg0.method6053());
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(Lclient!bt;I)Lclient!sh;")
	public static Class82_Sub4 method2537(@OriginalArg(0) Class3_Sub2 arg0) {
		return new Class82_Sub4(arg0.method6039(), arg0.method6039(), arg0.method6039(), arg0.method6039(), arg0.method6020(), arg0.method6020(), arg0.method6053());
	}
}
