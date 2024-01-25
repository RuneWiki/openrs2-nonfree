import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static696 {

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!lga;ZILclient!d;Ljava/awt/Canvas;)Lclient!ha;")
	public static Class75 method5669(@OriginalArg(0) Class223 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface11 arg2, @OriginalArg(4) Canvas arg3) {
		try {
			if (!Static469.method7081()) {
				throw new RuntimeException("");
			} else if (Static34.method446("jagdx")) {
				@Pc(25) Class local25 = Class.forName("os");
				@Pc(59) Method local59 = local25.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface11"), Class.forName("lga"), Class.forName("java.lang.Integer"));
				return (Class75) local59.invoke((Object) null, arg3, arg2, arg0, Integer.valueOf(arg1));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(89) Throwable local89) {
			throw new RuntimeException("");
		}
	}
}
