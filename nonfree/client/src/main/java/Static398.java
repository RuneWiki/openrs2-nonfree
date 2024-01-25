import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!pn", name = "r", descriptor = "I")
	public static int anInt7528;

	@OriginalMember(owner = "client!pn", name = "s", descriptor = "[[[Lclient!ne;")
	public static Class224[][][] aClass224ArrayArrayArray3;

	@OriginalMember(owner = "client!pn", name = "g", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_85 = new Class181(48, 4);

	@OriginalMember(owner = "client!pn", name = "q", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_138 = new Class254(23, 17);

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Ljava/awt/Component;ZI)Lclient!mca;")
	public static Class4 method6270(@OriginalArg(0) Component arg0) {
		try {
			@Pc(29) Constructor local29 = Class.forName("Class4_Sub1").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class4) local29.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(47) Throwable local47) {
			return new Class4_Sub2(arg0, true);
		}
	}
}
