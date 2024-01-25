import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static645 {

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(Ljava/awt/Canvas;BLclient!eq;Lclient!d;I)Lclient!ha;")
	public static Class87 method2917(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Class97 arg1, @OriginalArg(3) Interface6 arg2, @OriginalArg(4) int arg3) {
		try {
			if (!Static134.method2603()) {
				throw new RuntimeException("");
			} else if (Static472.method6791("jagdx")) {
				@Pc(26) Class local26 = Class.forName("Class87_Sub1_Sub2");
				@Pc(52) Method local52 = local26.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface6"), Class.forName("Class97"), Class.forName("java.lang.Integer"));
				return (Class87) local52.invoke(null, arg0, arg2, arg1, Integer.valueOf(arg3));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(82) Throwable local82) {
			throw new RuntimeException("");
		}
	}
}
