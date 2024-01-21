import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static70 {

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "Lclient!kc;")
	public static Class11 aClass11_13;

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "Lclient!cb;")
	public static Class2_Sub1_Sub3_Sub1 aClass2_Sub1_Sub3_Sub1_13;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "Lclient!lc;")
	public static Class31 aClass31_773 = Static56.method1206("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
	public static int anInt2224 = 0;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "Z")
	public static boolean aBoolean113 = false;

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
	public static int anInt2225 = -1;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "Lclient!lc;")
	public static Class31 aClass31_774 = Static56.method1206("Contact Details Last Set:*6n@gre@");

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "Lclient!lc;")
	public static Class31 aClass31_775 = Static56.method1206("@whi@ )4 ");

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "Lclient!lc;")
	public static Class31 aClass31_776 = Static56.method1206(": ");

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)Ljava/awt/Component;")
	public static Component method1381() {
		if (Static38.aCanvas_Sub1_1 == null) {
			return Static51.aClass51_2 == null ? null : Static51.aClass51_2.anApplet2;
		} else {
			return Static38.aCanvas_Sub1_1;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method1382(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static56.aClass34_1);
		arg0.addMouseMotionListener(Static56.aClass34_1);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
	public static void method1383() {
		aClass31_774 = null;
		aClass31_776 = null;
		aClass31_775 = null;
		aClass11_13 = null;
		aClass2_Sub1_Sub3_Sub1_13 = null;
		aClass31_773 = null;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
	public static void method1385() {
		Static107.aBoolean156 = true;
		Static10.aBoolean28 = true;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)I")
	public static int method1386(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = (arg1 & 0x7F) * arg0 / 128;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}
}
