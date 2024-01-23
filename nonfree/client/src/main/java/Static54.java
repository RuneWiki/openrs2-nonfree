import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!dj", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
	public static int anInt1042;

	@OriginalMember(owner = "client!dj", name = "p", descriptor = "Lclient!fh;")
	public static Class58 aClass58_29;

	@OriginalMember(owner = "client!dj", name = "i", descriptor = "[Z")
	public static boolean[] aBooleanArray4 = new boolean[112];

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method883(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static60.aClass126_1);
		arg0.addMouseMotionListener(Static60.aClass126_1);
		arg0.addFocusListener(Static60.aClass126_1);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
	public static void method884() {
		Static113.aClass26_22.method511();
		Static13.aClass26_2.method511();
		Static195.aClass26_39.method511();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!fh;I)Lclient!qh;")
	public static Class4_Sub23 method887(@OriginalArg(0) int arg0, @OriginalArg(1) Class58 arg1) {
		@Pc(17) byte[] local17 = arg1.method1343(arg0);
		return local17 == null ? null : new Class4_Sub23(local17);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method891(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static60.aClass126_1);
		arg0.removeMouseMotionListener(Static60.aClass126_1);
		arg0.removeFocusListener(Static60.aClass126_1);
		Static67.anInt1306 = 0;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method892(@OriginalArg(1) int arg0) {
		if (arg0 >= 100000) {
			return arg0 < 10000000 ? "<col=ffffff>" + arg0 / 1000 + Static208.aString239 + "</col>" : "<col=00ff80>" + arg0 / 1000000 + Static39.aString49 + "</col>";
		} else {
			return "<col=ffff00>" + arg0 + "</col>";
		}
	}
}
