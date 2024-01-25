import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!lp", name = "N", descriptor = "Lclient!dv;")
	public static Class63 aClass63_5;

	@OriginalMember(owner = "client!lp", name = "I", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_73 = new Class242(73, -1);

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(II)Z")
	public static boolean method3484(@OriginalArg(0) int arg0) {
		return arg0 == 9 || arg0 == 10 || arg0 == 11;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(BZLjava/awt/Component;)Lclient!s;")
	public static Class224 method3486(@OriginalArg(2) Component arg0) {
		try {
			@Pc(29) Constructor local29 = Class.forName("Class224_Sub1").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class224) local29.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(47) Throwable local47) {
			return new Class224_Sub2(arg0, true);
		}
	}
}
