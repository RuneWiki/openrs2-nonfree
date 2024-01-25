import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static597 {

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILclient!pl;Ljava/awt/Canvas;Lclient!fa;I)Lclient!r;")
	public static Class100 method325(@OriginalArg(1) Class259 arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) Interface5 arg2, @OriginalArg(4) int arg3) {
		try {
			if (!Static418.method6042()) {
				throw new RuntimeException("");
			} else if (Static533.method7648("jagdx")) {
				@Pc(20) Class local20 = Class.forName("Class100_Sub1_Sub1");
				@Pc(52) Method local52 = local20.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface5"), Class.forName("Class259"), Class.forName("java.lang.Integer"));
				return (Class100) local52.invoke(null, arg1, arg2, arg0, Integer.valueOf(arg3));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(82) Throwable local82) {
			throw new RuntimeException("");
		}
	}
}
