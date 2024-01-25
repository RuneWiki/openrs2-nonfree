import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static648 {

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILjava/awt/Canvas;Lclient!oh;ILclient!d;)Lclient!ha;")
	public static Class16 method3527(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Class237 arg2, @OriginalArg(4) Interface2 arg3) {
		try {
			if (!Static619.method8391()) {
				throw new RuntimeException("");
			} else if (Static267.method4634("jagdx")) {
				@Pc(26) Class local26 = Class.forName("Class16_Sub1_Sub2");
				@Pc(52) Method local52 = local26.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface2"), Class.forName("Class237"), Class.forName("java.lang.Integer"));
				return (Class16) local52.invoke(null, arg1, arg3, arg2, Integer.valueOf(arg0));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(82) Throwable local82) {
			throw new RuntimeException("");
		}
	}
}
