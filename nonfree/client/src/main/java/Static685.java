import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static685 {

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(Lclient!aj;Ljava/awt/Canvas;IILclient!d;)Lclient!ha;")
	public static Class13 method6688(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface4 arg3) {
		try {
			if (!Static238.method4026()) {
				throw new RuntimeException("");
			} else if (Static379.method5472("jagdx")) {
				@Pc(33) Class local33 = Class.forName("Class13_Sub1_Sub2");
				@Pc(59) Method local59 = local33.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface4"), Class.forName("Class15"), Class.forName("java.lang.Integer"));
				return (Class13) local59.invoke((Object) null, arg1, arg3, arg0, Integer.valueOf(arg2));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(89) Throwable local89) {
			throw new RuntimeException("");
		}
	}
}
