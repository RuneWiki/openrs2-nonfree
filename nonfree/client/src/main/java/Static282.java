import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!nn", name = "v", descriptor = "[I")
	public static final int[] anIntArray422 = new int[32];

	@OriginalMember(owner = "client!nn", name = "x", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_65 = new Class208(0, 3);

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Ljava/awt/Component;ZB)Lclient!iv;")
	public static Class126 method3989(@OriginalArg(0) Component arg0) {
		try {
			@Pc(32) Constructor local32 = Class.forName("Class126_Sub2").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class126) local32.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(50) Throwable local50) {
			return new Class126_Sub1(arg0, true);
		}
	}
}
