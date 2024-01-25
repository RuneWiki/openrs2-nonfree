import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static601 {

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!fa;Ljava/awt/Canvas;IILclient!sea;)Lclient!r;")
	public static Class78 method4808(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class308 arg3) {
		try {
			if (!Static128.method2263()) {
				throw new RuntimeException("");
			} else if (Static362.method5319("jagdx")) {
				@Pc(25) Class local25 = Class.forName("Class78_Sub1_Sub1");
				@Pc(51) Method local51 = local25.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface9"), Class.forName("Class308"), Class.forName("java.lang.Integer"));
				return (Class78) local51.invoke(null, arg1, arg0, arg3, Integer.valueOf(arg2));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(81) Throwable local81) {
			throw new RuntimeException("");
		}
	}
}
