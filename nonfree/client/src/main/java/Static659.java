import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static659 {

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(BILjava/awt/Canvas;Lclient!d;Lclient!wu;)Lclient!ha;")
	public static Class126 method8526(@OriginalArg(1) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) Interface8 arg2, @OriginalArg(4) Class384 arg3) {
		try {
			if (!Static301.method4382()) {
				throw new RuntimeException("");
			} else if (Static190.method673("jagdx")) {
				@Pc(34) Class local34 = Class.forName("Class126_Sub2_Sub2");
				@Pc(60) Method local60 = local34.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface8"), Class.forName("Class384"), Class.forName("java.lang.Integer"));
				return (Class126) local60.invoke((Object) null, arg1, arg2, arg3, Integer.valueOf(arg0));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(90) Throwable local90) {
			throw new RuntimeException("");
		}
	}
}
