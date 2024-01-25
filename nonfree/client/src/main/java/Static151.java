import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!fo", name = "i", descriptor = "Lclient!om;")
	public static Class246 aClass246_77;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
	public static int anInt3123 = 0;

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "Z")
	public static boolean aBoolean254 = false;

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "[C")
	public static final char[] aCharArray5 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
	public static int anInt3128 = 0;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "([Lclient!f;I)V")
	public static void method2790(@OriginalArg(0) Class46[] arg0) {
		Static109.anInt2526 = arg0.length;
		Static187.aClass46Array6 = new Class46[Static109.anInt2526 + 10];
		Static370.anIntArray501 = new int[Static109.anInt2526 + 10];
		Static604.method5912(arg0, 0, Static187.aClass46Array6, 0, Static109.anInt2526);
		for (@Pc(31) int local31 = 0; local31 < Static109.anInt2526; local31++) {
			Static370.anIntArray501[local31] = Static187.aClass46Array6[local31].ca();
		}
		for (@Pc(50) int local50 = Static109.anInt2526; local50 < Static187.aClass46Array6.length; local50++) {
			Static370.anIntArray501[local50] = 12;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "()V")
	public static void method2791() {
		Static402.method5859(Static499.anInt7950);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lclient!pca;")
	public static Class156 method2793(@OriginalArg(0) Component arg0) {
		try {
			@Pc(29) Constructor local29 = Class.forName("Class156_Sub1").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class156) local29.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(47) Throwable local47) {
			return new Class156_Sub2(arg0, true);
		}
	}
}
