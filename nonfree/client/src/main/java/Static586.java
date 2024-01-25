import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static586 {

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/awt/Canvas;IILclient!e;Lclient!jo;)Lclient!oa;")
	public static Class9 method2014(@OriginalArg(0) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface2 arg2, @OriginalArg(4) Class168 arg3) {
		try {
			if (!Static453.method6919()) {
				throw new RuntimeException("");
			} else if (Static234.method4121("jagdx")) {
				@Pc(26) Class local26 = Class.forName("Class9_Sub3_Sub1");
				@Pc(52) Method local52 = local26.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface2"), Class.forName("Class168"), Class.forName("java.lang.Integer"));
				return (Class9) local52.invoke(null, arg0, arg2, arg3, Integer.valueOf(arg1));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(82) Throwable local82) {
			throw new RuntimeException("");
		}
	}
}
