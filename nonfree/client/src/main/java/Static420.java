import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!rp", name = "R", descriptor = "[I")
	public static int[] anIntArray577;

	@OriginalMember(owner = "client!rp", name = "V", descriptor = "Lclient!kda;")
	public static Class160 aClass160_87;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lclient!sj;")
	public static Class191 method6256(@OriginalArg(0) Component arg0) {
		try {
			@Pc(29) Constructor local29 = Class.forName("Class191_Sub1").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class191) local29.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(47) Throwable local47) {
			return new Class191_Sub2(arg0, true);
		}
	}
}
