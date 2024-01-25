import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static169 {

	@OriginalMember(owner = "client!fi", name = "v", descriptor = "Lclient!wm;")
	public static Class390 aClass390_37;

	@OriginalMember(owner = "client!fi", name = "w", descriptor = "Lclient!pu;")
	public static Class50 aClass50_10;

	@OriginalMember(owner = "client!fi", name = "r", descriptor = "Lclient!cja;")
	public static final Class64 aClass64_1 = new Class64();

	@OriginalMember(owner = "client!fi", name = "t", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

	@OriginalMember(owner = "client!fi", name = "u", descriptor = "Z")
	public static boolean aBoolean275 = false;

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
	public static void method2948() {
		Static655.aClass50_38 = null;
		Static113.aClass50_5 = null;
		Static631.aClass50_36 = null;
		Static100.aClass50_4 = null;
		Static56.aClass50_3 = null;
		Static363.aClass50_34 = null;
		Static364.aClass50Array8 = null;
		aClass50_10 = null;
		Static417.aClass50_28 = null;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIB)Z")
	public static boolean method2949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x21) != 0;
	}
}
