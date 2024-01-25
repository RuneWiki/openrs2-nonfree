import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!nt", name = "M", descriptor = "I")
	public static int anInt6318;

	@OriginalMember(owner = "client!nt", name = "N", descriptor = "Lclient!sq;")
	public static final Class314 aClass314_15 = new Class314(1);

	@OriginalMember(owner = "client!nt", name = "Q", descriptor = "Lclient!cea;")
	public static final Class47 aClass47_1 = new Class47();

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "(Z)V")
	public static void method5362(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static309.aClass299ArrayArrayArray3 = Static250.aClass299ArrayArrayArray2;
			Static68.aClass34Array1 = Static426.aClass34Array5;
		} else {
			Static309.aClass299ArrayArrayArray3 = Static17.aClass299ArrayArrayArray1;
			Static68.aClass34Array1 = Static108.aClass34Array6;
		}
		Static459.anInt7698 = Static309.aClass299ArrayArrayArray3.length;
	}

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "(III)Z")
	public static boolean method5363(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static382.method5659(arg1, arg0) | (arg0 & 0x2000) != 0 | Static376.method5510(arg1, arg0)) & Static574.method7711(arg1, arg0);
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "()V")
	public static void method5364() {
		Static580.method7785(Static459.anInt7698);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Ljava/lang/Object;BLclient!pi;)V")
	public static void method5365(@OriginalArg(0) Object arg0, @OriginalArg(2) Class258 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 50 && arg1.anEventQueue1.peekEvent() != null; local16++) {
			Static589.method7892(1L);
		}
		try {
			if (arg0 != null) {
				arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			}
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "(I)Lclient!qq;")
	public static Class3_Sub42 method5366() {
		@Pc(11) Class3_Sub42 local11 = Static168.method3021();
		local11.anInt7409 = 0;
		local11.aClass303_79 = null;
		local11.aClass3_Sub11_Sub1_1 = new Class3_Sub11_Sub1(5000);
		return local11;
	}
}
