import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!gp;ZLclient!n;Ljava/awt/Canvas;I)Lclient!qa;")
	public static Class62 method1358(@OriginalArg(0) Class117 arg0, @OriginalArg(2) Interface8 arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) int arg3) {
		try {
			if (!Static463.method6456()) {
				throw new RuntimeException("");
			} else if (Static66.method1216("jagdx")) {
				@Pc(32) Class local32 = Class.forName("Class62_Sub1_Sub1");
				@Pc(58) Method local58 = local32.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface8"), Class.forName("Class117"), Class.forName("java.lang.Integer"));
				return (Class62) local58.invoke(null, arg2, arg1, arg0, Integer.valueOf(arg3));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(88) Throwable local88) {
			throw new RuntimeException("");
		}
	}
}
