import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static598 {

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lclient!ri;ILjava/awt/Canvas;ILclient!fa;)Lclient!r;")
	public static Class31 method1234(@OriginalArg(0) Class284 arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface4 arg3) {
		try {
			if (!Static512.method6920()) {
				throw new RuntimeException("");
			} else if (Static298.method4529("jagdx")) {
				@Pc(26) Class local26 = Class.forName("Class31_Sub1_Sub2");
				@Pc(52) Method local52 = local26.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface4"), Class.forName("Class284"), Class.forName("java.lang.Integer"));
				return (Class31) local52.invoke(null, arg1, arg3, arg0, Integer.valueOf(arg2));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(82) Throwable local82) {
			throw new RuntimeException("");
		}
	}
}
