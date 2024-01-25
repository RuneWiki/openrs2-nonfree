import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static734 {

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!ik;Lclient!d;ILjava/awt/Canvas;I)Lclient!ha;")
	public static Class22 method7381(@OriginalArg(0) Class182 arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Canvas arg3) {
		try {
			if (!Static39.method1147()) {
				throw new RuntimeException("");
			} else if (Static67.method1514("jagdx")) {
				@Pc(31) Class local31 = Class.forName("tha");
				@Pc(65) Method local65 = local31.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface4"), Class.forName("ik"), Class.forName("java.lang.Integer"));
				return (Class22) local65.invoke((Object) null, arg3, arg1, arg0, Integer.valueOf(arg2));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(95) Throwable local95) {
			throw new RuntimeException("");
		}
	}
}
