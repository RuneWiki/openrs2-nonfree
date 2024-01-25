import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static652 {

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IILjava/awt/Canvas;Lclient!d;Lclient!ni;)Lclient!ha;")
	public static Class5 method6047(@OriginalArg(1) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) Interface7 arg2, @OriginalArg(4) Class223 arg3) {
		try {
			if (!Static551.method7735()) {
				throw new RuntimeException("");
			} else if (Static362.method5843("jagdx")) {
				@Pc(28) Class local28 = Class.forName("Class5_Sub2_Sub1");
				@Pc(54) Method local54 = local28.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface7"), Class.forName("Class223"), Class.forName("java.lang.Integer"));
				return (Class5) local54.invoke((Object) null, arg1, arg2, arg3, Integer.valueOf(arg0));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(84) Throwable local84) {
			throw new RuntimeException("");
		}
	}
}
