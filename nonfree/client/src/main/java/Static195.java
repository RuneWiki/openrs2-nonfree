import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!gt", name = "V", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!gt", name = "W", descriptor = "Ljava/lang/Object;")
	public static Object anObject7;

	@OriginalMember(owner = "client!gt", name = "L", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_49 = new Class179(82, 2);

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/awt/Component;ZI)Lclient!tfa;")
	public static Class335 method2800(@OriginalArg(0) Component arg0) {
		try {
			@Pc(29) Constructor local29 = Class.forName("Class335_Sub2").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class335) local29.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(47) Throwable local47) {
			return new Class335_Sub1(arg0, true);
		}
	}
}
