import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static651 {

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILclient!d;Lclient!in;Ljava/awt/Canvas;)Lclient!ha;")
	public static Class20 method5824(@OriginalArg(0) int arg0, @OriginalArg(2) Interface4 arg1, @OriginalArg(3) Class157 arg2, @OriginalArg(4) Canvas arg3) {
		try {
			if (!Static194.method3948()) {
				throw new RuntimeException("");
			} else if (Static472.method7443("jagdx")) {
				@Pc(26) Class local26 = Class.forName("Class20_Sub2_Sub1");
				@Pc(52) Method local52 = local26.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface4"), Class.forName("Class157"), Class.forName("java.lang.Integer"));
				return (Class20) local52.invoke(null, arg3, arg1, arg2, Integer.valueOf(arg0));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(82) Throwable local82) {
			throw new RuntimeException("");
		}
	}
}
