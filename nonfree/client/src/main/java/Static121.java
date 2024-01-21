import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
	public static int anInt2970;

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
	public static int anInt2979;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1105 = Static146.method2172("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1106 = aClass77_1105;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
	public static void method2128() {
		aClass77_1105 = null;
		aClass77_1106 = null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Lclient!bf;")
	public static Class2_Sub2_Sub5 method2129(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub2_Sub5 local12 = (Class2_Sub2_Sub5) Static61.aClass82_23.method2699((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static61.aClass43_18.method2205(arg0, 6);
		local12 = new Class2_Sub2_Sub5();
		local12.anInt516 = arg0;
		if (local22 != null) {
			local12.method349(new Class2_Sub18(local22));
		}
		local12.method353();
		if (local12.aBoolean24) {
			local12.anInt514 = 0;
			local12.aBoolean28 = false;
		}
		Static61.aClass82_23.method2701((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!ma;Ljava/lang/Object;I)V")
	public static void method2130(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg0.anEventQueue1.peekEvent() != null; local11++) {
			Static27.method564(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!he;)V")
	public static void method2131(@OriginalArg(1) Class34 arg0) {
		Static62.aClass34_1 = arg0;
	}
}
