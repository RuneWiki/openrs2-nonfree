import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static650 {

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!la;Ljava/awt/Canvas;IILclient!d;)Lclient!ha;")
	public static Class133 method3594(@OriginalArg(0) Class207 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface3 arg3) {
		try {
			if (!Static198.method3509()) {
				throw new RuntimeException("");
			} else if (Static82.method1382("jagdx")) {
				@Pc(29) Class local29 = Class.forName("Class133_Sub1_Sub1");
				@Pc(55) Method local55 = local29.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface3"), Class.forName("Class207"), Class.forName("java.lang.Integer"));
				return (Class133) local55.invoke(null, arg1, arg3, arg0, Integer.valueOf(arg2));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(85) Throwable local85) {
			throw new RuntimeException("");
		}
	}
}
