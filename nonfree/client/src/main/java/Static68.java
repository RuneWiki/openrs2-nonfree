import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static68 {

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
	public static int anInt1709;

	@OriginalMember(owner = "client!nb", name = "D", descriptor = "Lclient!ed;")
	public static Class2_Sub1_Sub6 aClass2_Sub1_Sub6_3;

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "Lclient!ga;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "Lclient!kc;")
	public static Class36 aClass36_828 = Static14.method2017("runes");

	@OriginalMember(owner = "client!nb", name = "v", descriptor = "[I")
	public static int[] anIntArray218 = new int[5];

	@OriginalMember(owner = "client!nb", name = "A", descriptor = "Lclient!kc;")
	public static Class36 aClass36_829 = Static14.method2017("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!nb", name = "C", descriptor = "Lclient!kc;")
	public static Class36 aClass36_830 = Static14.method2017("(WSpielkonto wiederherstellen(W Option auf der Hauptseite)3");

	@OriginalMember(owner = "client!nb", name = "G", descriptor = "Lclient!kc;")
	public static Class36 aClass36_831 = Static14.method2017("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public static void method1171(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static77.aClass9_1);
		arg0.removeFocusListener(Static77.aClass9_1);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
	public static void method1172() {
		aClass36_830 = null;
		aClass2_Sub1_Sub6_3 = null;
		aClass36_828 = null;
		aClass36_831 = null;
		aClass36_829 = null;
		anIntArray218 = null;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(JB)V")
	public static void method1173(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static61.method1116(arg0 - 1L);
			Static61.method1116(1L);
		} else {
			Static61.method1116(arg0);
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)Z")
	public static boolean method1174(@OriginalArg(1) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}
}
