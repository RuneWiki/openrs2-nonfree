import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "Lclient!aj;")
	public static Class15 aClass15_20;

	@OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
	public static int anInt1334 = 0;

	@OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
	public static int anInt1337 = 0;

	@OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
	public static int anInt1338 = 0;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZLjava/awt/Component;I)Lclient!ji;")
	public static Class16 method1373(@OriginalArg(1) Component arg0) {
		try {
			@Pc(29) Constructor local29 = Class.forName("Class16_Sub2").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class16) local29.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(47) Throwable local47) {
			return new Class16_Sub1(arg0, true);
		}
	}
}
