import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static605 {

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Lclient!e;ILjava/awt/Canvas;Lclient!bi;I)Lclient!oa;")
	public static Class66 method3989(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) Class31 arg3) {
		try {
			if (!Static103.method399()) {
				throw new RuntimeException("");
			} else if (Static157.method5013("jagdx")) {
				@Pc(28) Class local28 = Class.forName("Class66_Sub1_Sub2");
				@Pc(54) Method local54 = local28.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface3"), Class.forName("Class31"), Class.forName("java.lang.Integer"));
				return (Class66) local54.invoke(null, arg2, arg0, arg3, Integer.valueOf(arg1));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(84) Throwable local84) {
			throw new RuntimeException("");
		}
	}
}
