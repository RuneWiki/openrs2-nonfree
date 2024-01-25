import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static690 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/awt/Canvas;Lclient!d;Lclient!gda;II)Lclient!ha;")
	public static Class100 method6364(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(2) Class126 arg2, @OriginalArg(4) int arg3) {
		try {
			if (!Static264.method4287()) {
				throw new RuntimeException("");
			} else if (Static472.method6674("jagdx")) {
				@Pc(41) Class local41 = Class.forName("er");
				@Pc(75) Method local75 = local41.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface7"), Class.forName("gda"), Class.forName("java.lang.Integer"));
				return (Class100) local75.invoke((Object) null, arg0, arg1, arg2, Integer.valueOf(arg3));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(105) Throwable local105) {
			throw new RuntimeException("");
		}
	}
}
