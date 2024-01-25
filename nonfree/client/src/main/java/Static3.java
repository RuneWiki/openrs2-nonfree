import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
	public static int anInt29;

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "B")
	public static byte aByte1;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "Z")
	public static boolean aBoolean2 = false;

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_1 = new Class181(47, 2);

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "Lclient!jp;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method38(@OriginalArg(0) String arg0) {
		return Static54.aHashtable2.containsKey(arg0);
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
	public static void method39() {
		Static271.aClass81_41.method1602();
		Static151.aClass81_24.method1602();
	}
}
