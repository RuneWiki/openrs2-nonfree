import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static594 {

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "F")
	public static float aFloat205;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
	public static int anInt9770 = 0;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILjava/awt/Component;Z)Lclient!ek;")
	public static Class50 method7993(@OriginalArg(1) Component arg0) {
		try {
			@Pc(24) Constructor local24 = Class.forName("Class50_Sub1").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class50) local24.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(42) Throwable local42) {
			return new Class50_Sub2(arg0, true);
		}
	}
}
