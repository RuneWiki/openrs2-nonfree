import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "Lclient!jk;")
	public static Class99 aClass99_1;

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "Lclient!dj;")
	public static Class40 aClass40_5 = new Class40(64);

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "Lclient!qk;")
	public static Class147 aClass147_1 = new Class147();

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "Lclient!wf;")
	public static Class189 aClass189_2 = null;

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
	public static int anInt626 = 0;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IILclient!fh;)Lclient!uj;")
	public static Class4_Sub3_Sub14 method583(@OriginalArg(1) int arg0, @OriginalArg(2) Class58 arg1) {
		return Static265.method4168(arg1, arg0) ? Static67.method1063() : null;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIILclient!vc;IJIIII)Z")
	public static boolean method584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class53 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static152.method2431(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)V")
	public static void method586() {
		Static287.aClass26_55.method517(5);
		Static210.aClass26_41.method517(5);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
	public static void method587() {
		@Pc(2) Class126 local2 = Static60.aClass126_1;
		synchronized (Static60.aClass126_1) {
			Static216.anInt4215++;
			Static86.anInt1991 = Static67.anInt1306;
			Static286.anInt5358 = Static261.anInt4978;
			Static312.anInt6042 = Static240.anInt4557;
			Static252.anInt4803 = Static302.anInt5683;
			Static79.anInt1797 = Static313.anInt6053;
			Static278.anInt5313 = Static123.anInt2426;
			Static25.aLong20 = Static300.aLong198;
			Static302.anInt5683 = 0;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method588(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static275.aClass164_1);
		arg0.removeFocusListener(Static275.aClass164_1);
		Static241.anInt4596 = -1;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V")
	public static void method589() {
		if (Static275.aClass164_1 != null) {
			@Pc(15) Class164 local15 = Static275.aClass164_1;
			synchronized (Static275.aClass164_1) {
				Static275.aClass164_1 = null;
			}
		}
	}
}
