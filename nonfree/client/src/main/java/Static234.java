import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
	public static int anInt5027;

	@OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
	public static int anInt5031;

	@OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
	public static int anInt5034;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_119 = new Class140("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
	public static int anInt5029 = 0;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZB)V")
	public static void method4283(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static198.aByteArrayArrayArray8 = new byte[arg0][Static66.anInt1177][Static12.anInt213];
		Static178.anIntArray529 = new int[Static12.anInt213];
		Static209.anIntArray531 = new int[Static12.anInt213];
		if (!arg1) {
			Static126.aByteArrayArrayArray4 = null;
		}
		Static190.anIntArray481 = new int[Static12.anInt213];
		Static306.anInt4214 = 99;
		Static182.aByteArrayArrayArray3 = new byte[arg0][Static66.anInt1177][Static12.anInt213];
		Static311.anIntArray475 = new int[5];
		Static335.aByteArrayArrayArray13 = new byte[arg0][Static66.anInt1177][Static12.anInt213];
		Static2.anIntArray5 = new int[Static12.anInt213];
		Static363.anIntArray536 = new int[Static12.anInt213];
		Static327.anIntArrayArrayArray12 = new int[arg0][Static66.anInt1177 + 1][Static12.anInt213 + 1];
		Static18.aByteArrayArrayArray1 = new byte[arg0][Static66.anInt1177][Static12.anInt213];
		Static314.aByteArrayArrayArray11 = new byte[arg0][Static66.anInt1177 + 1][Static12.anInt213 + 1];
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BLjava/lang/Object;Lclient!sc;)V")
	public static void method4285(@OriginalArg(1) Object arg0, @OriginalArg(2) Class179 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static248.method4401(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}
}
