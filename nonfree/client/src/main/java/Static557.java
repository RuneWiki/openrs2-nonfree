import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZLclient!e;Ljava/awt/Canvas;ILclient!kea;)Lclient!oa;")
	public static Class5 method5531(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class161 arg3) {
		try {
			if (!Static382.method5919()) {
				throw new RuntimeException("");
			} else if (Static140.method2462("jagdx")) {
				@Pc(25) Class local25 = Class.forName("Class5_Sub3_Sub2");
				@Pc(51) Method local51 = local25.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface4"), Class.forName("Class161"), Class.forName("java.lang.Integer"));
				return (Class5) local51.invoke(null, arg1, arg0, arg3, Integer.valueOf(arg2));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(81) Throwable local81) {
			throw new RuntimeException("");
		}
	}
}
