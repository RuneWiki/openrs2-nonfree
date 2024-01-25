import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static610 {

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!e;Ljava/awt/Canvas;Lclient!pe;II)Lclient!oa;")
	public static Class15 method8098(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(4) int arg3) {
		try {
			if (!Static279.method4843()) {
				throw new RuntimeException("");
			} else if (Static68.method1703("jagdx")) {
				@Pc(26) Class local26 = Class.forName("Class15_Sub2_Sub2");
				@Pc(52) Method local52 = local26.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface4"), Class.forName("Class254"), Class.forName("java.lang.Integer"));
				return (Class15) local52.invoke(null, arg1, arg0, arg2, Integer.valueOf(arg3));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(82) Throwable local82) {
			throw new RuntimeException("");
		}
	}
}
