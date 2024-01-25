import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!ei", name = "F", descriptor = "Lclient!oh;")
	public static Class237 aClass237_33;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ei", name = "G", descriptor = "Ljava/lang/Class;")
	private static Class aClass1;

	@OriginalMember(owner = "client!ei", name = "y", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_33 = new Class71(57, -2);

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILjava/awt/Component;Z)Lclient!eda;")
	public static Class35 method2813(@OriginalArg(1) Component arg0) {
		try {
			@Pc(24) Constructor local24 = Class.forName("Class35_Sub2").getDeclaredConstructor(aClass1 == null ? (aClass1 = Class8_Sub5.a("java.awt.Component")) : aClass1, Boolean.TYPE);
			return (Class35) local24.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(50) Throwable local50) {
			return new Class35_Sub1(arg0, true);
		}
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)V")
	public static void method2816() {
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub13_2, 1);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub13_1, 1);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub3_1, 1);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub3_2, 1);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub1_1, 1);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub20_1, 1);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub16_1, 0);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub27_1, 0);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub4_1, 0);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub14_1, 0);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub17_1, 0);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub21_1, 0);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub2_1, 0);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub12_1, 0);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub26_2, 0);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub26_1, 0);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub9_1, 0);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub7_1, 0);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub29_1, 0);
		Static470.method7025();
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub11_1, 2);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub15_1, 2);
		Static180.method3451();
		Static364.method5679();
		Static226.aBoolean386 = true;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "()V")
	public static void method2818() {
		Static40.aClass194_2 = Static40.aClass194_1;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method2820(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static530.anInt9157; local11++) {
			if (arg0.equalsIgnoreCase(Static54.aStringArray6[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aString35);
	}
}
