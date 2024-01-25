import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static649 {

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILclient!d;ILjava/awt/Canvas;Lclient!wu;)Lclient!ha;")
	public static Class95 method2802(@OriginalArg(1) Interface6 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) Class380 arg3) {
		try {
			if (!Static254.method3522()) {
				throw new RuntimeException("");
			} else if (Static550.method7576("jagdx")) {
				@Pc(21) Class local21 = Class.forName("Class95_Sub3_Sub1");
				@Pc(47) Method local47 = local21.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface6"), Class.forName("Class380"), Class.forName("java.lang.Integer"));
				return (Class95) local47.invoke(null, arg2, arg0, arg3, Integer.valueOf(arg1));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(85) Throwable local85) {
			throw new RuntimeException("");
		}
	}
}
