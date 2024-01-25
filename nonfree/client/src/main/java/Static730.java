import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static730 {

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILclient!d;ILclient!lb;Ljava/awt/Canvas;)Lclient!ha;")
	public static Class67 method6928(@OriginalArg(0) int arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(3) Class221 arg2, @OriginalArg(4) Canvas arg3) {
		try {
			if (!Static642.method8689()) {
				throw new RuntimeException("");
			} else if (Static376.method5425("jagdx")) {
				@Pc(25) Class local25 = Class.forName("de");
				@Pc(74) Method local74 = local25.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface2"), Class.forName("lb"), Class.forName("java.lang.Integer"));
				return (Class67) local74.invoke((Object) null, arg3, arg1, arg2, Integer.valueOf(arg0));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(104) Throwable local104) {
			throw new RuntimeException("");
		}
	}
}
