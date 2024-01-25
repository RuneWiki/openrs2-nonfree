import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "I")
	public static int anInt8492;

	@OriginalMember(owner = "client!rda", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray67;

	@OriginalMember(owner = "client!rda", name = "j", descriptor = "Lclient!cb;")
	public static Class50 aClass50_149;

	@OriginalMember(owner = "client!rda", name = "k", descriptor = "I")
	public static int anInt8495;

	@OriginalMember(owner = "client!rda", name = "h", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_258 = new Class196(114, 17);

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IZLjava/awt/Component;)Lclient!sfa;")
	public static Class111 method7219(@OriginalArg(2) Component arg0) {
		try {
			@Pc(29) Constructor local29 = Class.forName("Class111_Sub2").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class111) local29.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(47) Throwable local47) {
			return new Class111_Sub1(arg0, true);
		}
	}
}
