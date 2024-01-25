import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static682 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!d;Ljava/awt/Canvas;ILclient!gga;Z)Lclient!ha;")
	public static Class101 method6337(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class124 arg3) {
		try {
			if (!Static230.method4173()) {
				throw new RuntimeException("");
			} else if (Static91.method1580("jagdx")) {
				@Pc(33) Class local33 = Class.forName("Class101_Sub1_Sub2");
				@Pc(59) Method local59 = local33.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface3"), Class.forName("Class124"), Class.forName("java.lang.Integer"));
				return (Class101) local59.invoke((Object) null, arg1, arg0, arg3, Integer.valueOf(arg2));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(89) Throwable local89) {
			throw new RuntimeException("");
		}
	}
}
