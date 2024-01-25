import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Ljava/awt/Component;ZI)Lclient!gia;")
	public static Class138 method1889(@OriginalArg(0) Component arg0) {
		try {
			@Pc(28) Constructor local28 = Class.forName("gp").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class138) local28.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(46) Throwable local46) {
			return new Class138_Sub2(arg0, true);
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method1890(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}
}
