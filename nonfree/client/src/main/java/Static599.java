import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static599 {

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!jn;ILclient!fa;BLjava/awt/Canvas;)Lclient!r;")
	public static Class44 method6326(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface11 arg2, @OriginalArg(4) Canvas arg3) {
		try {
			if (!Static52.method684()) {
				throw new RuntimeException("");
			} else if (Static138.method2728("jagdx")) {
				@Pc(28) Class local28 = Class.forName("Class44_Sub2_Sub2");
				@Pc(54) Method local54 = local28.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface11"), Class.forName("Class176"), Class.forName("java.lang.Integer"));
				return (Class44) local54.invoke(null, arg3, arg2, arg0, Integer.valueOf(arg1));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(84) Throwable local84) {
			throw new RuntimeException("");
		}
	}
}
