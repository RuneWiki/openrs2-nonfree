import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILjava/awt/Canvas;Lclient!dda;Lclient!n;I)Lclient!qa;")
	public static Class39 method6343(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Class53 arg1, @OriginalArg(3) Interface12 arg2, @OriginalArg(4) int arg3) {
		try {
			if (!Static198.method3200()) {
				throw new RuntimeException("");
			} else if (Static467.method7030("jagdx")) {
				@Pc(21) Class local21 = Class.forName("Class39_Sub2_Sub1");
				@Pc(47) Method local47 = local21.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface12"), Class.forName("Class53"), Class.forName("java.lang.Integer"));
				return (Class39) local47.invoke(null, arg0, arg2, arg1, Integer.valueOf(arg3));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(90) Throwable local90) {
			throw new RuntimeException("");
		}
	}
}
