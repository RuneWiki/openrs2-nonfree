import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!tca", name = "p", descriptor = "Lclient!ef;")
	public static final Class77 aClass77_5 = new Class77();

	@OriginalMember(owner = "client!tca", name = "v", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_81 = new Class208(48, 0);

	@OriginalMember(owner = "client!tca", name = "x", descriptor = "I")
	public static final int anInt9298 = 2;

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IIII)I")
	public static int method7912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) int local13 = 255 - arg0;
		@Pc(31) int local31 = (arg0 * (arg2 & 0xFF00) & 0xFF0000 | (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00) >>> 8;
		return local31 + ((local13 * (arg1 & 0xFF00FF) & 0xFF00FF00 | local13 * (arg1 & 0xFF00) & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Ljava/awt/Component;ZB)Lclient!st;")
	public static Class71 method7913(@OriginalArg(0) Component arg0) {
		try {
			@Pc(32) Constructor local32 = Class.forName("Class71_Sub2").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class71) local32.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(50) Throwable local50) {
			return new Class71_Sub1(arg0, true);
		}
	}
}
