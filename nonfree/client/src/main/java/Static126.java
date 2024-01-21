import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "Lclient!f;")
	public static Class21 aClass21_3;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "Lclient!lf;")
	public static Class48 aClass48_46 = new Class48(64);

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1123 = Static56.method816(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "Lclient!wf;")
	public static Class8_Sub24 aClass8_Sub24_8 = null;

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1124 = Static56.method816("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "Z")
	public static boolean aBoolean92 = false;

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1126 = Static56.method816("Select");

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1125 = aClass34_1126;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	public static void method1481(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static125.aClass36_1);
		arg0.removeMouseMotionListener(Static125.aClass36_1);
		arg0.removeFocusListener(Static125.aClass36_1);
		Static118.anInt2651 = 0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
	public static void method1482() {
		aClass21_3 = null;
		aClass8_Sub24_8 = null;
		aClass34_1125 = null;
		aClass48_46 = null;
		aClass34_1124 = null;
		aClass34_1126 = null;
		aClass34_1123 = null;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)I")
	public static int method1483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(40) int local40 = Static38.method584(arg1 - 1, arg0 + -1) + Static38.method584(arg1 - 1, arg0 + 1) + Static38.method584(arg1 + 1, arg0 + -1) + Static38.method584(arg1 + 1, arg0 + 1);
		@Pc(71) int local71 = Static38.method584(arg1, arg0 - 1) + Static38.method584(arg1, arg0 + 1) + Static38.method584(arg1 + -1, arg0) + Static38.method584(arg1 + 1, arg0);
		@Pc(82) int local82 = Static38.method584(arg1, arg0);
		return local82 / 4 + local71 / 8 + local40 / 16;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BII)I")
	public static int method1486(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = 0;
		while (arg0 > 0) {
			local3 = arg1 & 0x1 | local3 << 1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local3;
	}
}
