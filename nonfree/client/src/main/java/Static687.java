import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static687 {

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILjava/awt/Canvas;Lclient!la;BLclient!d;)Lclient!ha;")
	public static Class57 method5218(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Class208 arg2, @OriginalArg(4) Interface1 arg3) {
		try {
			if (!Static661.method9148()) {
				throw new RuntimeException("");
			} else if (Static513.method7491("jagdx")) {
				@Pc(41) Class local41 = Class.forName("sd");
				@Pc(75) Method local75 = local41.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface1"), Class.forName("la"), Class.forName("java.lang.Integer"));
				return (Class57) local75.invoke((Object) null, arg1, arg3, arg2, Integer.valueOf(arg0));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(105) Throwable local105) {
			throw new RuntimeException("");
		}
	}
}
