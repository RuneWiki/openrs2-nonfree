import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!fha", name = "u", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray8;

	@OriginalMember(owner = "client!fha", name = "f", descriptor = "I")
	public static int anInt9730 = -1;

	@OriginalMember(owner = "client!fha", name = "g", descriptor = "[I")
	public static final int[] anIntArray670 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

	@OriginalMember(owner = "client!fha", name = "h", descriptor = "Lclient!tja;")
	public static final Class352 aClass352_71 = new Class352(8);

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(BLjava/awt/Component;Z)Lclient!sw;")
	public static Class161 method8341(@OriginalArg(1) Component arg0) {
		try {
			@Pc(24) Constructor local24 = Class.forName("Class161_Sub2").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class161) local24.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(50) Throwable local50) {
			return new Class161_Sub1(arg0, true);
		}
	}
}
