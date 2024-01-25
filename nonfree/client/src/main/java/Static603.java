import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static603 {

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!tf;Ljava/awt/Canvas;ILclient!fa;I)Lclient!r;")
	public static Class45 method5040(@OriginalArg(0) Class322 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface3 arg3) {
		try {
			if (!Static214.method3437()) {
				throw new RuntimeException("");
			} else if (Static10.method149("jagdx")) {
				@Pc(34) Class local34 = Class.forName("Class45_Sub2_Sub1");
				@Pc(60) Method local60 = local34.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface3"), Class.forName("Class322"), Class.forName("java.lang.Integer"));
				return (Class45) local60.invoke(null, arg1, arg3, arg0, Integer.valueOf(arg2));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(90) Throwable local90) {
			throw new RuntimeException("");
		}
	}
}
