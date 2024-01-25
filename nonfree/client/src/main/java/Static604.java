import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static604 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!fa;Ljava/awt/Canvas;ILclient!vo;)Lclient!r;")
	public static Class7 method6316(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class348 arg3) {
		try {
			if (!Static258.method4078()) {
				throw new RuntimeException("");
			} else if (Static188.method3095("jagdx")) {
				@Pc(20) Class local20 = Class.forName("Class7_Sub1_Sub2");
				@Pc(52) Method local52 = local20.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface7"), Class.forName("Class348"), Class.forName("java.lang.Integer"));
				return (Class7) local52.invoke(null, arg1, arg0, arg3, Integer.valueOf(arg2));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(82) Throwable local82) {
			throw new RuntimeException("");
		}
	}
}
